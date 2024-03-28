import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        System.out.print("請輸入apple,banana或是orange：");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "apple":
                System.out.print("這是蘋果");
                break;
            case "banana":
                System.out.print("這是香蕉");
                break;
            case "orange":
                System.out.print("這是橘子");
                break;
            default:
                System.out.print("錯了");
        }
 */
//================================================================
/*
        Note：
        for(初始化;條件;迭代)
        先初始化，再來比較符不符合條件，再來迭代，再進行條件比較，以此類推

//================================================================

        int i;
        for (i = 1; i <= 100; i++){
            System.out.println("hello world");
        }

//================================================================

        int j;
        for (j=1;j<=5;j++){
            System.out.println(j);
        }

//================================================================

        int k;
        for (k=1;k<=5;k++){
            System.out.println(2*k);
        }

//================================================================

        int m = 1;
        int l;
        for (l = 1; l <= 5; l++) {
            m = 2 * m;
            System.out.println(m);
        }

//================================================================

        int o = 0;
        int i;
        for (i = 1; i <= 10; i++) {
            o = 1 + o;
            System.out.println(o);
        }

//================================================================

        int i;
        int p = -1;
        int q = 1;
        for (i = 0; i <= 50; i++) {
            q = p + q;
            p = p + 2;
        }
        System.out.println(q);

//================================================================

        int i;
        int p = 0;
        int q = 0;
        for (i = 0; i <= 50; i++) {
            q = p + q;
            p = p + 2;
        }
        System.out.println(q);

//================================================================
        int i = 1;
        while (i <= 7) {
            System.out.println("i like english");
            i++;
        }

//================================================================

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

//================================================================

        int i = 1;
        while (i <= 13) {
            System.out.println(i);
            i = i + 2;
        }

//================================================================
*/
        int sum = 0;
        int i = 0;
        while (i != -1) {
            System.out.println("請輸入一個數字：");
            Scanner input = new Scanner(System.in);
            i = input.nextInt();
            sum =sum+i;
        }
        System.out.println("你輸入的數字和：");
        System.out.println(sum+1);

    }
}