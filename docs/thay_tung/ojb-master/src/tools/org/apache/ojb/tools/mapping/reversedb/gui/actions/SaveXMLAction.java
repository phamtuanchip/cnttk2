package org.apache.ojb.tools.mapping.reversedb.gui.actions;

/* Copyright 2002-2005 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
/**
 *
 * @author <a href="mailto:bfl@florianbruckner.com">Florian Bruckner</a> 
 * @version $Id: SaveXMLAction.java,v 1.1 2007-08-24 22:17:30 ewestfal Exp $
 */
public class SaveXMLAction extends javax.swing.AbstractAction
{
  org.apache.ojb.tools.mapping.reversedb.gui.JFrmMainFrame mainFrame;
  
  /** Creates a new instance of SaveXMLAction */
  public SaveXMLAction (org.apache.ojb.tools.mapping.reversedb.gui.JFrmMainFrame pmainFrame)
  {
    super();
    mainFrame = pmainFrame;
    this.putValue(NAME, "Save XML");
  }
  
  public void actionPerformed (java.awt.event.ActionEvent actionEvent)
  {
    // 1. Open a Filechooser dialog to get the path for the XML file to 
    // generate
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    int rc = fileChooser.showSaveDialog(mainFrame);
    if (rc == javax.swing.JFileChooser.APPROVE_OPTION)
    {
      java.io.File f = fileChooser.getSelectedFile();
      try
      {
        if (!f.exists()) f.createNewFile();
        if (f.canWrite())
        {
          java.io.PrintWriter pw = 
            new java.io.PrintWriter(new java.io.FileOutputStream(f));
          mainFrame.getDBMeta().writeXML(pw);
          pw.close();          
        }
      }        
      catch (java.io.FileNotFoundException fnfe)
      {
        fnfe.printStackTrace();
      }
      catch (java.io.IOException ioex)
      {
        ioex.printStackTrace();
      }
    }
  }
  
}

/***************************** Changelog *****************************
// $Log: not supported by cvs2svn $
// Revision 1.1.2.1  2005/12/21 22:32:06  tomdz
// Updated license
//
// Revision 1.1  2004/05/05 16:38:25  arminw
// fix fault
// wrong package structure used:
// org.apache.ojb.tools.reversdb
// org.apache.ojb.tools.reversdb2
//
// instead of
// org.apache.ojb.tools.mapping.reversdb
// org.apache.ojb.tools.mapping.reversdb2
//
// Revision 1.1  2004/05/04 13:44:59  arminw
// move reverseDB stuff
//
// Revision 1.7  2004/04/05 12:16:24  tomdz
// Fixed/updated license in files leftover from automatic license transition
//
// Revision 1.6  2004/04/04 23:53:42  brianm
// Fixed initial copyright dates to match cvs repository
//
// Revision 1.5  2004/03/11 18:16:23  brianm
// ASL 2.0
//
// Revision 1.4  2003/06/21 10:40:06  florianbruckner
// improve error reporting; use writeXML(PrintWriter) instead of getXML()
//
// Revision 1.3  2002/11/08 13:47:38  brj
// corrected some compiler warnings
//
// Revision 1.2  2002/06/17 19:34:34  jvanzyl
// Correcting all the package references.
// PR:
// Obtained from:
// Submitted by:
// Reviewed by:
//
// Revision 1.1.1.1  2002/06/17 18:16:54  jvanzyl
// Initial OJB import
//
// Revision 1.2  2002/05/16 11:47:09  florianbruckner
// fix CR/LF issue, change license to ASL
//
// Revision 1.1  2002/04/18 11:44:16  mpoeschl
//
// move files to new location
//
// Revision 1.1  2002/03/04 17:19:33  thma
// initial checking for Florians Reverse engineering tool
//
// Revision 1.1.1.1  2002/02/20 13:35:25  Administrator
// initial import
//
/***************************** Changelog *****************************/
