import java.util.Scanner;

public class GradeArray {
    public static void main(String[] args) {
        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int WuLi = 3;
        int HuaXue = 4;
        int ShengWu = 5;

        String[] name = new String[6];
        name[YuWen] = "语文";
        name[ShuXue] = "数学";
        name[WaiYu] = "外语";
        name[WuLi] = "物理";
        name[HuaXue] = "化学";
        name[ShengWu] = "生物";

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入共有多少年的成绩：");

        int yearCount = scanner.nextInt();
        double[][] scores = new double[yearCount][name.length];

        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < name.length; j++) {
                scores[i][j] = Math.random() * 20 + 80;
            }
        }

        System.out.println("请问要查哪一年的成绩？");

        int yearSearch = scanner.nextInt() - 1;

        System.out.println("请问要查哪一科的成绩？");

        int nameSearch = scanner.nextInt() - 1;

        System.out.println("你要查询的是第" + (yearSearch + 1) + "年的" + name[nameSearch] + "成绩是：" + scores[yearSearch][nameSearch]);
    }
}
