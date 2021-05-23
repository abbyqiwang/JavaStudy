public class RandomNumber {
    public static void main(String[] args) {
//        double randNum = 0;
//        while (randNum < 0.5) {
//            randNum = Math.random();
//            System.out.println(randNum);
//        }
//        System.out.println("生成的大于0.5的随机数是" + randNum);

        int rangeStart = 30;
        int rangeEnd = 90;
        int mod = rangeEnd - rangeStart;
        for (int i = 0; i < 50; i++) {
            int bigRandom = (int) (Math.random() * rangeEnd * 100);
            int numberToGuest = (bigRandom % mod) + rangeStart;
            System.out.println("mod=" + mod + ",bigRandom=" + bigRandom + ",numberToGuest=" + numberToGuest);
        }
    }
}
