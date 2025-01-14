package com.cloud.admin.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.codec.Hex;

public class TokenUtils {
	

		public static final String MAGIC_KEY = "opensesame";
		private static final String INVALID_TOKEN = "noone:0000000000000:d5ed270331aac3806014af32ed0b6d95";


		public static String createToken(UserDetails userDetails)
		{
			/* Expires in 30 mins */
			long expires = System.currentTimeMillis() + 1000L * 60 * 30;

			StringBuilder tokenBuilder = new StringBuilder();
			tokenBuilder.append(userDetails.getUsername());
			tokenBuilder.append(":");
			tokenBuilder.append(expires);
			tokenBuilder.append(":");
			tokenBuilder.append(TokenUtils.computeSignature(userDetails, expires));

			return tokenBuilder.toString();
		}
		
		public static String createInvalidToken()
		{
			return INVALID_TOKEN;
		}

		public static String computeSignature(UserDetails userDetails, long expires)
		{
			StringBuilder signatureBuilder = new StringBuilder();
			signatureBuilder.append(userDetails.getUsername());
			signatureBuilder.append(":");
			signatureBuilder.append(expires);
			signatureBuilder.append(":");
			signatureBuilder.append(userDetails.getPassword());
			signatureBuilder.append(":");
			signatureBuilder.append(TokenUtils.MAGIC_KEY);

			MessageDigest digest;
			try {
				digest = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				throw new IllegalStateException("No MD5 algorithm available!");
			}

			return new String(Hex.encode(digest.digest(signatureBuilder.toString().getBytes())));
		}


		public static String getUserNameFromToken(String authToken)
		{
			if (null == authToken) {
				return null;
			}

			String[] parts = authToken.split(":");
			return parts[0];
		}

		
		public static boolean isValidToken(String authToken){
			String[] parts = authToken.split(":");
			long expires = Long.parseLong(parts[1]);
			if (expires < System.currentTimeMillis()) {
				return false;
			}
			return true;
			
		}
		
		
		public static boolean validateToken(String authToken, UserDetails userDetails)
		{
			String[] parts = authToken.split(":");
			long expires = Long.parseLong(parts[1]);
			String signature = parts[2];

			if (expires < System.currentTimeMillis()) {
				return false;
			}

			return signature.equals(TokenUtils.computeSignature(userDetails, expires));
		}

}
