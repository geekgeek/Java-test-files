//<Create normal array>
String categorys[] = {"Java","Python","MySql","SqLite3"};
//</>

//<create arraylist array>
ArrayList categorysList = new ArrayList();
//</>
        //<Add list elements in arraylist>
        categorysList.add("Java");
        categorysList.add("Python");
        categorysList.add("MySql");
        categorysList.add("SqLite3");
        categorysList.add("SqLite2");
        //</>
        
        //<convert arraylist to array>
        Object[] arr = categorysList.toArray(new String[categorysList.size()]);
        //</>
        
        //<display array>
        this.jList1.setListData(arr);
        this.jList1.getModel();
        //</>
        
        
       
