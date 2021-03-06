/**
 * CLass for creating, reading and writing to txt files
 */
package javaapplication2;
import java.io.*;
import java.io.File;
import java.io.IOException;

public class TextFile {
    private final String Errormessage = "Error, file already exists.";
    private final String successMessage ="File is created";
    public String fileLocation;
    private final String writeStringToFileSuccess ="Write to file success";
    /**
     * 
     * @param fileLocation = where the file should be created
     */
    public void createNewTXTFile(String fileLocation){
     try{
         File file = new File(fileLocation);
         if(file.createNewFile())
         System.out.println(successMessage);
         else
         System.out.println
         (Errormessage);
     }
     catch(IOException ioe) {
        ioe.printStackTrace();
     }
    }
    
    /**
     * 
     * @param fileLocation path to text-file 
     */
    public void ReadTxtFile(String fileLocation){
     try {
         BufferedReader in = new BufferedReader
         (new FileReader(fileLocation));
         String str;
         while ((str = in.readLine()) != null) {
            System.out.println(str);
         }
         System.out.println(str);
         }
         catch (IOException e) {
         }
    }
    
    /**
     * Write text to txt and delete all previous text in txt file
     * @param fileLocation = location of the file
     * @param writeText = text written to the file
     */
    public void writeToTextFile(String fileLocation, String writeText){
      try {
         BufferedWriter out = new 
         BufferedWriter(new FileWriter(fileLocation));
         out.write(writeText);
         out.close();
         System.out.println
         (writeStringToFileSuccess);
      }
      catch (IOException e) {
      }
    }
    
}


