package numberSystem;

public class BitWise {

    public static void main(String[] args) {

        byte a = 5;
        byte b = 4;

         b+=a;
        System.out.println(decimalToBinary(a));
        System.out.println(decimalToBinary(b));
        byte c = (byte) (a & b);
        byte d = (byte) (a | b);
        byte e = (byte) (a ^ b);
        byte not= (byte) ~c;
        System.out.println(decimalToBinary(c));
        System.out.println("AND:" + c);
        System.out.println("NOT:" + not);
        System.out.println("OR:" + d);
        System.out.println("XOR:" + e);
        System.out.println(strinfTOBinary("vinoth"));
    }

    static String strinfTOBinary(String input) {
        StringBuilder sb = new StringBuilder();

        char[] chars = input.toCharArray();
        for (char c : chars) {
            String binary = Integer.toBinaryString(c);
            String formatted = String.format("%8s", binary);
            String output = formatted.replaceAll(" ", "0");
            sb.append(output);
            sb.append(" ");
        }
        return sb.toString();

    }

    static int decimalToBinary(int N) {

        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (N != 0) {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;

            // Count used to store exponent value
            cnt++;
        }

        return B_Number;
    }
}
