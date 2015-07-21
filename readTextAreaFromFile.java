     //<Read file>
         try {
            String fileLocation = "C:\\Users\\guest1\\Desktop\\test1.txt";
         BufferedReader in = new BufferedReader
         (new FileReader(fileLocation));
         String str;
         while ((str = in.readLine()) != null) {
            System.out.println(str);
            this.jTextArea3.append("\n"+str);
         }
         System.out.println(str);
         
         }
         catch (IOException e) {
         }
        //</>
