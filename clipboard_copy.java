//Copy to clipboard
import java.awt.datatransfer.*;
import java.awt.Toolkit;

String myString = "This text will be copied into clipboard when running this code!";
StringSelection stringSelection = new StringSelection (myString);
Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
clpbrd.setContents (stringSelection, null);
