import java.util.Scanner;

public class equals_ones {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        // int count=0;
        int maxx=a[0];
        for (int i = 0; i < n; i++) {
            // int zero=0,one=0;
            int sum=0;
            for (int j = i; j < n; j++) {
                // if(a[j]==0)
                //   zero++;
                // else
                //   one++;
                // if(zero==one)
                //   count++;
                sum+=a[j];
            }
               maxx=Math.max(maxx, sum);
        }
        System.out.println(maxx);
    }
}
