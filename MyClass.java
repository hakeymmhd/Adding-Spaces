// i have replaced the spaces with X's for better representation
import java.util.ArrayList;

public class MyClass {
    public static void main(String args[]) {
    String s = "This the sentence to lengthen";
    int width = 40;
    // This is where you should insert your code
   
    // boolean flag = s.length() < width;
    int innerCounter = 1;

    String[] arr = s.split(" ");
    ArrayList<String> newArray = new ArrayList<String>();

    for (String element : arr) {    // converts from array to arraylist
        newArray.add(element);
    }

    do {
        int i = 1, j = newArray.size() ;
            do {
                if (s.length() + 1 <= width) {
                    newArray.add(i, "X");
                    s = s.join("", newArray);   // this is to check length of string before next space addition
                }
                if (s.length() + 1 <= width) {
                    newArray.add(newArray.size()-i, "X");
                    s = s.join("", newArray);
                }
                else break;
                // else flag=false;

                i = i + 2*innerCounter;
                j = newArray.size() - i;
            } while(i<=j && s.length() < width);
            innerCounter++;
             
    } while (s.length() < width);
       
    System.out.println(s);
    }
}