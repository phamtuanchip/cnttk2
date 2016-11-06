package org.apache.ojb.tools.mapping.reversedb2.propertyEditors;

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

import org.apache.ojb.tools.mapping.reversedb2.dbmetatreemodel.DBMetaColumnNode;

/**
 * This is an implementation of a PropertyEditor for the DBMetaColumn class.
 *
 * @author <a href="mailto:bfl@florianbruckner.com">Florian Bruckner</a> 
 * @version $Id: JPnlPropertyEditorDBMetaColumn.java,v 1.1 2007-08-24 22:17:28 ewestfal Exp $
 */
public class JPnlPropertyEditorDBMetaColumn extends PropertyEditor
{
    
    /** Creates new form JPnlPropertyEditorDBMetaCatalog */
    public JPnlPropertyEditorDBMetaColumn ()
    {
        initComponents ();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents()//GEN-BEGIN:initComponents
    {
        java.awt.GridBagConstraints gridBagConstraints;

        lblColumnName = new javax.swing.JLabel();
        tfColumnName = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        lblColumnName.setText("Column Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        add(lblColumnName, gridBagConstraints);

        tfColumnName.setEditable(false);
        tfColumnName.setText("jTextField1");
        tfColumnName.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(tfColumnName, gridBagConstraints);

    }//GEN-END:initComponents

    public void setEditorTarget (PropertyEditorTarget target)
    {
        if (target instanceof DBMetaColumnNode)
        {
            super.setEditorTarget(target);
            this.tfColumnName.setText((String)target.getAttribute(DBMetaColumnNode.ATT_COLUMN_NAME));
        }
        else
        {
            throw new UnsupportedOperationException("This editor can only edit DBMetaColumnNode objects");
        }
    }    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblColumnName;
    private javax.swing.JTextField tfColumnName;
    // End of variables declaration//GEN-END:variables
    
    public class CatalogPropertyChangeListener implements java.beans.PropertyChangeListener
    {
        public void propertyChange (java.beans.PropertyChangeEvent propertyChangeEvent)
        {
            if (propertyChangeEvent.getPropertyName() == (DBMetaColumnNode.ATT_COLUMN_NAME))
            {
                tfColumnName.setText((String)propertyChangeEvent.getNewValue());
            }
        }        
    }
    
}
