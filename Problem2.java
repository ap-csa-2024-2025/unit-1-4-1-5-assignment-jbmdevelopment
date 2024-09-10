public class Problem2 {
    public static void main(String[] args) {
        int threeDigit = 456;
        int firstDigit = (threeDigit / 100) % 10;
        int midDigit = (threeDigit / 10) % 10;
        int lasttDigit = threeDigit % 10;
        System.out.println(firstDigit);
        System.out.println(midDigit);
        System.out.println(lasttDigit);
    }
}