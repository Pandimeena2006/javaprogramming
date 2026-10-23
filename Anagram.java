import java.sql.SQLOutput;
import java.util.*;
public class anagram{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ënter first str1:");
        String str1=sc.next().toLowerCase();
        System.out.println("Enter the second str2:");
        String str2=sc.next().toLowerCase();
        //length check
        if(str1.length() != str2.length()){
            System.out.println("not anagram");
            //string convert to character
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            //sort
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            //compare
            if(Arrays.equals(arr1,arr2)) {
                System.out.println("Änagram");
            }
            else{
                System.out.println("not anagram");
            }

        }
    }
}
