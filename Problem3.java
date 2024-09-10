public class Problem3 {
    public static void main(String[] args) {
        int quadDigit = 1234;
        int firstDigit = (quadDigit / 1000) % 10;
        int midDigit = (quadDigit / 100) % 10;
        int midMidDigit = (quadDigit / 10) % 10;
        int lastDigit = quadDigit % 10;
        System.out.println(lastDigit);
        System.out.println(midMidDigit);
        System.out.println(midDigit);
        System.out.println(firstDigit);
    }
}