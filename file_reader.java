//http://stackoverflow.com/questions/4716503/best-way-to-read-a-text-file-in-java

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("/fileToRead.txt"));
            try {
                String x;
                while ( (x = br.readLine()) != null ) {
                    // printing out each line in the file
                    System.out.println(x);
                } 
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
