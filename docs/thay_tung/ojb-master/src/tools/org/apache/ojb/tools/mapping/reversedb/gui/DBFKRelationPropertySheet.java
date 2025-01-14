package org.apache.ojb.tools.mapping.reversedb.gui;

import java.awt.event.KeyEvent;

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
 * @version $Id: DBFKRelationPropertySheet.java,v 1.1 2007-08-24 22:17:32 ewestfal Exp $
 */
public class DBFKRelationPropertySheet extends javax.swing.JPanel implements PropertySheetView
{
    org.apache.ojb.tools.mapping.reversedb.DBFKRelation aRelation;
  /** Creates new form DBCatalogPropertySheet */
  public DBFKRelationPropertySheet ()
  {
    initComponents ();
  }
  
  private void readValuesFromReference()
  {
    if (aRelation.getPKTable() != null)
      this.tfPKTableName.setText(aRelation.getPKTable().getTableName());
    if (aRelation.getFKTable() != null)
      this.tfFKTableName.setText(aRelation.getFKTable().getTableName());
    if (aRelation.isPkTableParent())
    {
      this.tfReferenceType.setText("Collection");
      this.tfJavaFieldType.setEditable(true);
      this.tfJavaFieldType.setText(aRelation.getFieldType());
      if (aRelation.getFKTable() != null)
        this.cbDisabledByParent.setSelected(!aRelation.getPKTable().isTreeEnabled());
    }
    else 
    {
      this.tfReferenceType.setText ("Reference");
      this.tfJavaFieldType.setEditable(false);
      if (aRelation.getPKTable() != null)
      {
        this.tfJavaFieldType.setText(aRelation.getPKTable().getClassName());
        this.cbDisabledByParent.setSelected(!aRelation.getFKTable().isTreeEnabled());
      }
    }
    this.cbEnabled.setSelected(aRelation.isEnabled());

    this.cbAutoDelete.setSelected(aRelation.getAutoDelete ());
    this.cbAutoRetrieve.setSelected(aRelation.getAutoRetrieve());
    this.cbAutoUpdate.setSelected(aRelation.getAutoUpdate());
    
    this.tfJavaFieldName.setText(aRelation.getFieldName());
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    private void initComponents()//GEN-BEGIN:initComponents
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblEnabled = new javax.swing.JLabel();
        cbEnabled = new javax.swing.JCheckBox();
        lblDisabledByParent = new javax.swing.JLabel();
        cbDisabledByParent = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPKTableName = new javax.swing.JLabel();
        tfPKTableName = new javax.swing.JTextField();
        lblFKTableName = new javax.swing.JLabel();
        tfFKTableName = new javax.swing.JTextField();
        lblReferenceType = new javax.swing.JLabel();
        tfReferenceType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAutoRetrieve = new javax.swing.JLabel();
        cbAutoRetrieve = new javax.swing.JCheckBox();
        lblAutoUpdate = new javax.swing.JLabel();
        cbAutoUpdate = new javax.swing.JCheckBox();
        lblAutoDelete = new javax.swing.JLabel();
        cbAutoDelete = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblJavaFieldName = new javax.swing.JLabel();
        tfJavaFieldName = new javax.swing.JTextField();
        lblJavaFieldType = new javax.swing.JLabel();
        tfJavaFieldType = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                formComponentShown(evt);
            }
            public void componentHidden(java.awt.event.ComponentEvent evt)
            {
                formComponentHidden(evt);
            }
        });

        addHierarchyListener(new java.awt.event.HierarchyListener()
        {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt)
            {
                formHierarchyChanged(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(15, 2));

        lblEnabled.setDisplayedMnemonic('e');
        lblEnabled.setText("enabled:");
        jPanel1.add(lblEnabled);

        cbEnabled.setMnemonic('e');
        cbEnabled.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbEnabledActionPerformed(evt);
            }
        });

        jPanel1.add(cbEnabled);

        lblDisabledByParent.setText("disabled by parent:");
        jPanel1.add(lblDisabledByParent);

        cbDisabledByParent.setEnabled(false);
        jPanel1.add(cbDisabledByParent);

        jPanel1.add(jLabel4);

        jPanel1.add(jLabel3);

        lblPKTableName.setLabelFor(tfPKTableName);
        lblPKTableName.setText("Primary Key Table:");
        jPanel1.add(lblPKTableName);

        tfPKTableName.setEditable(false);
        tfPKTableName.setText("jTextField1");
        tfPKTableName.setBorder(null);
        tfPKTableName.setDisabledTextColor((java.awt.Color) javax.swing.UIManager.getDefaults().get("TextField.foreground"));
        tfPKTableName.setEnabled(false);
        jPanel1.add(tfPKTableName);

        lblFKTableName.setLabelFor(tfFKTableName);
        lblFKTableName.setText("Foreign Key Table:");
        jPanel1.add(lblFKTableName);

        tfFKTableName.setEditable(false);
        tfFKTableName.setText("jTextField1");
        tfFKTableName.setBorder(null);
        tfFKTableName.setDisabledTextColor((java.awt.Color) javax.swing.UIManager.getDefaults().get("TextField.foreground"));
        tfFKTableName.setEnabled(false);
        jPanel1.add(tfFKTableName);

        lblReferenceType.setLabelFor(tfReferenceType);
        lblReferenceType.setText("Type:");
        jPanel1.add(lblReferenceType);

        tfReferenceType.setEditable(false);
        tfReferenceType.setText("jTextField1");
        tfReferenceType.setBorder(null);
        tfReferenceType.setDisabledTextColor((java.awt.Color) javax.swing.UIManager.getDefaults().get("TextField.foreground"));
        tfReferenceType.setEnabled(false);
        jPanel1.add(tfReferenceType);

        jPanel1.add(jLabel5);

        jPanel1.add(jLabel6);

        lblAutoRetrieve.setDisplayedMnemonic('r');
        lblAutoRetrieve.setText("Auto retrieve:");
        jPanel1.add(lblAutoRetrieve);

        cbAutoRetrieve.setMnemonic('r');
        cbAutoRetrieve.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbAutoRetrieveActionPerformed(evt);
            }
        });

        jPanel1.add(cbAutoRetrieve);

        lblAutoUpdate.setDisplayedMnemonic('u');
        lblAutoUpdate.setText("Auto update:");
        jPanel1.add(lblAutoUpdate);

        cbAutoUpdate.setMnemonic('u');
        cbAutoUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbAutoUpdateActionPerformed(evt);
            }
        });

        jPanel1.add(cbAutoUpdate);

        lblAutoDelete.setDisplayedMnemonic('d');
        lblAutoDelete.setText("Auto delete:");
        jPanel1.add(lblAutoDelete);

        cbAutoDelete.setMnemonic('d');
        cbAutoDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbAutoDeleteActionPerformed(evt);
            }
        });

        jPanel1.add(cbAutoDelete);

        jPanel1.add(jLabel10);

        jPanel1.add(jLabel11);

        lblJavaFieldName.setDisplayedMnemonic('n');
        lblJavaFieldName.setLabelFor(tfJavaFieldName);
        lblJavaFieldName.setText("Java Field Name:");
        jPanel1.add(lblJavaFieldName);

        tfJavaFieldName.setText("jTextField1");
        tfJavaFieldName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tfJavaFieldNameActionPerformed(evt);
            }
        });

        tfJavaFieldName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                tfJavaFieldNameFocusLost(evt);
            }
        });

        tfJavaFieldName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfJavaFieldNameKeyTyped(evt);
            }
        });

        jPanel1.add(tfJavaFieldName);

        lblJavaFieldType.setDisplayedMnemonic('t');
        lblJavaFieldType.setLabelFor(tfJavaFieldType);
        lblJavaFieldType.setText("Java Field Type:");
        jPanel1.add(lblJavaFieldType);

        tfJavaFieldType.setText("jTextField2");
        tfJavaFieldType.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tfJavaFieldTypeActionPerformed(evt);
            }
        });

        tfJavaFieldType.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                tfJavaFieldTypeFocusLost(evt);
            }
        });

        tfJavaFieldType.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfJavaFieldTypeKeyTyped(evt);
            }
        });

        jPanel1.add(tfJavaFieldType);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jPanel1, gridBagConstraints);

    }//GEN-END:initComponents

    private void tfJavaFieldTypeKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfJavaFieldTypeKeyTyped
    {//GEN-HEADEREND:event_tfJavaFieldTypeKeyTyped
        // Revert on ESC
        if (evt.getKeyChar() == KeyEvent.VK_ESCAPE)
        {
            this.tfJavaFieldType.setText(aRelation.getFieldType());
        }
    }//GEN-LAST:event_tfJavaFieldTypeKeyTyped

    private void tfJavaFieldTypeFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_tfJavaFieldTypeFocusLost
    {//GEN-HEADEREND:event_tfJavaFieldTypeFocusLost
        // Commit on lost focus
        this.aRelation.setFieldType(tfJavaFieldType.getText());
    }//GEN-LAST:event_tfJavaFieldTypeFocusLost

    private void tfJavaFieldTypeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tfJavaFieldTypeActionPerformed
    {//GEN-HEADEREND:event_tfJavaFieldTypeActionPerformed
        // Commit on ENTER
        this.aRelation.setFieldType(tfJavaFieldType.getText());
    }//GEN-LAST:event_tfJavaFieldTypeActionPerformed

    private void tfJavaFieldNameKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfJavaFieldNameKeyTyped
    {//GEN-HEADEREND:event_tfJavaFieldNameKeyTyped
        // Revert to original value if ESC is typed
        if (evt.getKeyChar() == KeyEvent.VK_ESCAPE)
        {
            this.tfJavaFieldName.setText(aRelation.getFieldName());
        }
    }//GEN-LAST:event_tfJavaFieldNameKeyTyped

    private void tfJavaFieldNameFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_tfJavaFieldNameFocusLost
    {//GEN-HEADEREND:event_tfJavaFieldNameFocusLost
        // Commit value if focus is lost
        aRelation.setFieldName(tfJavaFieldName.getText());
    }//GEN-LAST:event_tfJavaFieldNameFocusLost

    private void tfJavaFieldNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tfJavaFieldNameActionPerformed
    {//GEN-HEADEREND:event_tfJavaFieldNameActionPerformed
        // Commit value if ENTER is typed
        aRelation.setFieldName(tfJavaFieldName.getText());
    }//GEN-LAST:event_tfJavaFieldNameActionPerformed

  private void cbAutoDeleteActionPerformed (java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbAutoDeleteActionPerformed
  {//GEN-HEADEREND:event_cbAutoDeleteActionPerformed
    // Add your handling code here:
    this.aRelation.setAutoDelete(this.cbAutoDelete.isSelected());
  }//GEN-LAST:event_cbAutoDeleteActionPerformed

  private void cbAutoUpdateActionPerformed (java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbAutoUpdateActionPerformed
  {//GEN-HEADEREND:event_cbAutoUpdateActionPerformed
    // Add your handling code here:
    this.aRelation.setAutoUpdate(this.cbAutoUpdate.isSelected());
  }//GEN-LAST:event_cbAutoUpdateActionPerformed

  private void cbAutoRetrieveActionPerformed (java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbAutoRetrieveActionPerformed
  {//GEN-HEADEREND:event_cbAutoRetrieveActionPerformed
    // Add your handling code here:
    aRelation.setAutoRetrieve(cbAutoRetrieve.isSelected());
  }//GEN-LAST:event_cbAutoRetrieveActionPerformed

  private void cbEnabledActionPerformed (java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbEnabledActionPerformed
  {//GEN-HEADEREND:event_cbEnabledActionPerformed
    // Add your handling code here:
    aRelation.setEnabled(this.cbEnabled.isSelected());
  }//GEN-LAST:event_cbEnabledActionPerformed

  private void formHierarchyChanged (java.awt.event.HierarchyEvent evt)//GEN-FIRST:event_formHierarchyChanged
  {//GEN-HEADEREND:event_formHierarchyChanged
    // Add your handling code here:
    readValuesFromReference();
  }//GEN-LAST:event_formHierarchyChanged

  private void formComponentHidden (java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentHidden
  {//GEN-HEADEREND:event_formComponentHidden
    // Add your handling code here:
  }//GEN-LAST:event_formComponentHidden

  private void formComponentShown (java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
  {//GEN-HEADEREND:event_formComponentShown
    // Add your handling code here:
  }//GEN-LAST:event_formComponentShown

  public void setModel (PropertySheetModel pm)
  {
    if (pm instanceof org.apache.ojb.tools.mapping.reversedb.DBFKRelation)
    {
      this.aRelation = (org.apache.ojb.tools.mapping.reversedb.DBFKRelation)pm;
      this.readValuesFromReference();
    }
    else
      throw new IllegalArgumentException();    
  }  
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAutoUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox cbAutoRetrieve;
    private javax.swing.JLabel lblEnabled;
    private javax.swing.JCheckBox cbEnabled;
    private javax.swing.JTextField tfJavaFieldName;
    private javax.swing.JLabel lblAutoRetrieve;
    private javax.swing.JCheckBox cbAutoUpdate;
    private javax.swing.JCheckBox cbDisabledByParent;
    private javax.swing.JLabel lblJavaFieldType;
    private javax.swing.JTextField tfReferenceType;
    private javax.swing.JLabel lblPKTableName;
    private javax.swing.JLabel lblFKTableName;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JTextField tfJavaFieldType;
    private javax.swing.JTextField tfPKTableName;
    private javax.swing.JLabel lblDisabledByParent;
    private javax.swing.JLabel lblReferenceType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox cbAutoDelete;
    private javax.swing.JLabel lblAutoDelete;
    private javax.swing.JLabel lblJavaFieldName;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfFKTableName;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
  
}

/***************************** Changelog *****************************
// $Log: not supported by cvs2svn $
// Revision 1.1.2.1  2005/12/21 22:32:02  tomdz
// Updated license
//
// Revision 1.1  2004/05/05 16:38:49  arminw
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
// Revision 1.9  2004/04/05 12:16:23  tomdz
// Fixed/updated license in files leftover from automatic license transition
//
// Revision 1.8  2004/04/04 23:53:42  brianm
// Fixed initial copyright dates to match cvs repository
//
// Revision 1.7  2004/03/11 18:16:22  brianm
// ASL 2.0
//
// Revision 1.6  2003/12/12 16:37:16  brj
// removed unnecessary casts, semicolons etc.
//
// Revision 1.5  2003/06/21 10:21:55  florianbruckner
// update netbeans 3.4 -> 3.5; XML and code genration changed a bit
//
// Revision 1.4  2003/02/21 12:47:53  florianbruckner
// corrected event handling of JInputField objects, value of field was
// not written back to the model object.
//
// Revision 1.3  2002/06/18 12:26:41  florianbruckner
// changes in Netbeans Form definitions after move to jakarta.
//
// Revision 1.2  2002/06/17 19:34:34  jvanzyl
// Correcting all the package references.
// PR:
// Obtained from:
// Submitted by:
// Reviewed by:
//
// Revision 1.1.1.1  2002/06/17 18:16:52  jvanzyl
// Initial OJB import
//
// Revision 1.2  2002/05/16 11:47:09  florianbruckner
// fix CR/LF issue, change license to ASL
//
// Revision 1.1  2002/04/18 11:44:16  mpoeschl
//
// move files to new location
//
// Revision 1.3  2002/04/07 09:05:17  thma
// *** empty log message ***
//
// Revision 1.2  2002/03/11 17:36:26  florianbruckner
// fix line break issue for these files that were previously checked in with -kb
//
// Revision 1.1  2002/03/04 17:19:32  thma
// initial checking for Florians Reverse engineering tool
//
// Revision 1.1.1.1  2002/02/20 13:35:25  Administrator
// initial import
//
/***************************** Changelog *****************************/
 
