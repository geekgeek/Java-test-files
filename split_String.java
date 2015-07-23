        //Split string
        
        String data = "Apple.Microsoft.IBM.Intel";
        String[] companies = data.split("\\.");
        
        for(String str : companies)
        {
            System.out.println(str);
        }
