import java.util.ArrayList;

public class JavaApplication5_formatting {
    public static void main(String[] args) {

        //<Var>
        int answer = 42;
        String textAnswer = "word1";
        //</>
        
        String text = String.format("The %s answer is %d",textAnswer,answer);
        
        System.out.print(text);
        
    }    
}
