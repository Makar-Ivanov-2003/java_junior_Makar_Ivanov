package academy.tochkavhoda.introduction;

public class ZeroSteps1 {
    public int sum(int x, int y) { return x + y; }
    public int mul(int x, int y) { return x * y; }
    public int div(int x, int y) { return x / y; }
    public int mod(int x, int y) { return x % y; }
    public boolean isEqual(int x, int y) { return x == y; }
    public boolean isGreater(int x, int y) { return x > y; }

    public double calculateTriangleSquare(int side1, int side2) {
        return (side1 * side2) / 2.0;
    }

    public double calculateTrianglePerimeter(int side1, int side2) {
        // Убрали лишнюю переменную hypotenuse, если она "redundant"
        return side1 + side2 + java.lang.Math.sqrt((double)side1 * side1 + (double)side2 * side2);
    }

    public int reverseNumber(int number) {
        return (number % 10) * 100 + ((number / 10) % 10) * 10 + (number / 100);
    }

    public long calculate15Degree(int number) {
        long x = number;
        long x2 = x * x;
        long x3 = x2 * x;
        long x6 = x3 * x3;
        return x6 * x6 * x3; // Убрали лишнюю переменную x12
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public double sqrtAbs(int number) {
        return java.lang.Math.sqrt(java.lang.Math.abs(number));
    }

    public boolean isTriangleExist(int side1, int side2, int side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public int getDigitsProduction(int number) {
        int n = java.lang.Math.abs(number);
        return (n / 1000) * ((n / 100) % 10) * ((n / 10) % 10) * (n % 10);
    }

    public boolean isCircleInsideSquare(int radius, int side) {
        return 2L * radius < side;
    }

    public char getCharByCode(short code) { return (char) code; }
    public short getCodeByChar(char character) { return (short) character; }
    public char getCharByCodeAndOffset(char ch, short offset) { return (char) (ch + offset); }
    public boolean isGreaterOrEqual(char ch1, char ch2) { return ch1 >= ch2; }
    public char getAverageChar(char ch1, char ch2) { return (char) ((ch1 + ch2) / 2); }
}