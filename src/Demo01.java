import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        System.out.print("请输入：");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int result = 0;
        int num = 0;
        String str = "";
        for (int i = 0; i < 5; i++) {
            num = num * 10 + j;
            str += num + "+";
            result += num;
        }
        for (int k = 4; k > 0; k --){
            num = num / 10;
            str += num + "+";
            result += num;
        }
        System.out.println(str.subSequence(0,str.lastIndexOf("+")) + "=" +result);
    }
}