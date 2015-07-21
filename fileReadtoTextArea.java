  // TODO add your handling code here:
  // this.f = directory.
        String fileSelected = this.jList1.getSelectedValue().toString();
        this.jTextArea1.setText(""); //clear textfield
          //<Read file>
         try {
            String fileLocation =this.f+"\\"+fileSelected;
         BufferedReader in = new BufferedReader
         (new FileReader(fileLocation));
         String str;
         while ((str = in.readLine()) != null) {
            System.out.println(str);
            this.jTextArea1.append(str+"\n");
         }
         System.out.println(str);
         
         }
         catch (IOException e) {
         }
        //</>
