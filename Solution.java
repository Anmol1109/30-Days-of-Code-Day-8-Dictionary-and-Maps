//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            Integer phoneNumber = phoneBook.get(s);
            System.out.println((phoneNumber != null) ? s + "=" + phoneNumber : "Not found");
            // Write code here
        }
        in.close();
    }
}
