    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try {
        String textfield2 = this.jTextField2.getText();
        String textfield3 = this.jTextArea3.getText();
        
        //<Add array to textfield>
        String textf1[] = this.jTextField2.getText().split(" ");
        //</>
        
        //<Convert array to readable string with format>
        String fullString = String.format(textfield3, (Object[]) textf1);
        //</>
        
        //<display array in another textfield>
        this.jTextArea2.setText(fullString);
        //</>
        
        } catch (Exception e){
            String errorMessage = e.toString();
            this.jTextArea2.setText(errorMessage);
        }
        //</>
    } 
