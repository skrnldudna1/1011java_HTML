package t1011.test;
import java.util.Scanner;

public class test01 {
        //임이의 비트를 조작

        static class SetBit {
            static void printBits(int x) {
                for (int i =31; i >=0; i--)
                    System.out.print(((x>>> i&1)==1)? '1' : '0');
            }
            static int set(int x, int pos){
                return x| (1 << pos);
            }
            static int reset(int x, int pos) {
                return x & ~ (1 <<pos);
            }
            static int inverse(int x, int pos) {
                return x ^ (1 <<pos);
            }

            public static void main(String[] args) {
                Scanner stdIn = new Scanner(System.in);

                System.out.println("정수x의 pos번째 비트를 변경합니다.");
                System.out.print("x:"); int x = stdIn.nextInt();
                System.out.print("pos: "); int pos = stdIn.nextInt();

                System.out.print("x                     ="); printBits(x);
                System.out.print("\nset(x, pos)         ="); printBits(set(x, pos));
                System.out.print("\nrset(x, pos)        ="); printBits(reset(x, pos));
                System.out.print("\ninverse(x, pos)     =");
                printBits(inverse(x, pos)); System.out.println();
        }
    }
}
