//https://www.youtube.com/watch?v=Da_DczRGFa8
package javaapplication1;

import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaApplication1 {

    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("http://jsoup.org/").get();
            Elements anchors = doc.select("a");
            for(Element anchor : anchors){
                System.out.println(anchor.attr("href"));
            
        }
        
        }catch(IOException ex){
                Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE,null,ex);
                }
                
    }  
  
}
