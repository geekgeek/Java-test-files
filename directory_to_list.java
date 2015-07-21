// Directory of files to list
File f = new File("C:\\Users");
        ArrayList names = new ArrayList(Arrays.asList(f.list()));
        System.out.print(names);
