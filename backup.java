import java.util.ArrayList;
public class backup {

public myClass {
    public static void main(String args[]) {
    String s = "This the sentence to lengthen";
    int width = 40;
    // This is where you should insert your code
   
    boolean flag = s.length() < width;

    String[] arr = s.split(" ");
    ArrayList<String> newArray = new ArrayList<String>();
    for (String element : arr) {
        newArray.add(element);
    }
    System.out.println("initial arr: " + newArray);
    int innerCounter = 1;
     
    do {
        int i = 1, j = newArray.size() ;
        System.out.println("\n next OUTER LOOP");

            do {
            if (s.length() + 1 <= width) {
                System.out.println("i: " + i);
                newArray.add(i, "X");
                System.out.println("adding lhs: " + newArray);
                s = s.join("", newArray);
            }

            if (s.length() + 1 <= width) {
                System.out.println("j: " + j);
                newArray.add(newArray.size()-i, "Y");
                System.out.println("adding rhs: " + newArray);
                s = s.join("", newArray);
            }

            else flag=false;
 
            System.out.println("new arr size: " + newArray.size());
            i = i + 2*innerCounter;
            System.out.println("new i: " + i);
            j = newArray.size() - i;
            System.out.println("new j: " + j);
            
     
            System.out.println("length of str: " + s.length());
            } while(i<=j && s.length() < width);
            innerCounter++;
            
   
     
    } while (flag);
       
    System.out.println(s);
    }
}
}
