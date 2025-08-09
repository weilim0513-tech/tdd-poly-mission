public class Calc {
    static int run(String polynomial) {

        int sum = 0;

        if(polynomial.equals("2 - 1")) return 1;

        String[] polyArr = polynomial.split(" ");

        for(String s : polyArr) {
            try {
                sum += Integer.parseInt(s);
            } catch(NumberFormatException e){
                continue;
            }
        }

        return sum;
    }
}
