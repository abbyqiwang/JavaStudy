import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String str = in.nextLine();
        System.out.println(str + ",你好！");
        System.out.println("请问你几岁？");
        int age = in.nextInt();
        System.out.println("好的，" + str + age + "岁了。");
    }
}
