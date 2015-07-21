        JFileChooser fileChooser= new JFileChooser();
        int ret = fileChooser.showOpenDialog(this);
        if(ret==JFileChooser.APPROVE_OPTION)
        {
            File f = fileChooser.getSelectedFile();
            try
            {
                FileReader r = new FileReader(f);
                this.jTextArea3.read(r,"");
            }
            catch(Exception ee){
                System.out.println("cant read file");
            }
        }
