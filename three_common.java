import java.util.ArrayList;
import java.util.Scanner;

public class three_common {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        ArrayList<Integer> li1=new ArrayList<>();
        ArrayList<Integer> li2=new ArrayList<>();
        ArrayList<Integer> li3=new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            int a=in.nextInt();
            li1.add(a);
        }
        for (int i = 0; i < n2; i++) {
            int a=in.nextInt();
            li2.add(a);
        }
        for (int i = 0; i < n3; i++) {
            int a=in.nextInt();
            li3.add(a);
        }
        for (int i = 0; i < n1; i++) {
            int count=0;
            if(li2.contains(li1.get(i)))
              count++;
            if(li3.contains(li1.get(i)))
              count++;
            if(count==2)
              System.out.print(li1.get(i)+" ");
        }
    }    
}