     <%
      String item[] = {"Headingjsf","buttonjsf","inputjsf","inputAreajsf","radioCheckedjsf"};
      String code[] = {"<h2>Heading jsf</h2><br>","1","2","3","4"};
      
      int ans = 0;
      for (int i = 0; i < item.length; i++) 
      {
    	 out.print("{item:"+ "'" + item[i] + "'" + ", code:" + "'" + code[i] + "'}" + ",");
      }
     %>
