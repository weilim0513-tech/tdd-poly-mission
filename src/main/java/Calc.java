public class Calc {
    static int run(String polynomial) {
        // 앞의 숫자와 뒤의 숫자의 합에 따라 결과 값이 달라져야 함
        // String에서 숫자 부분을 캐치하여 int형으로 컨버팅 해야겠음
        int sum = 0;

        for(char c : polynomial.toCharArray()) {
            if(Character.isDigit(c)) sum += Character.getNumericValue(c);
        }

        return sum;
    }
}
