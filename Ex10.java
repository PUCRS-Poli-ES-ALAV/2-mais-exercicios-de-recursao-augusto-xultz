public class Ex10 {
    public int numberDigit(int n){
        String string = "" + n;
        return string.length();
    }

    public int numberDigitRecursive(int n){
        String string = "" + n;
        if(string.length()<1){
            return 0;
        }
        int digit = Integer.parseInt(string.substring(1));
        return 1 + numberDigit(digit);
    }

    public int numberDigitRecursiveGPT(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 10 && n > -10) {
            return 1;
        }
        return 1 + numberDigitRecursive(n / 10);
    }
    
}
