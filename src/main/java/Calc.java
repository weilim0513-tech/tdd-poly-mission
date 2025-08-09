public class Calc {
    static int run(String polynomial) {

        // 기존의 코드에 오류가 있었음
        // answer = num1 + Integer.parseInt(s); 후 answer 값을 그 다음 연산을 위해 num1 로 넘겨주는 과정이 누락되어 있었음
        // t8에서 Fail을 통해 해당 오류를 파악하고 수정

        String[] polyArr = polynomial.split(" ");
        boolean flag = false;
        String operator = "+";
        int answer = 0;
        int num1 = 0;

        for(String s : polyArr) {
            try {
                if(flag == true) {

                    switch(operator) {
                        case "+" :
                            answer = num1 + Integer.parseInt(s);
                            num1 = answer;
                            flag = false;
                            continue;
                        case "-" :
                            answer = num1 - Integer.parseInt(s);
                            num1 = answer;
                            flag = false;
                            continue;
                        case "*" :
                            answer = num1 * Integer.parseInt(s);
                            num1 = answer;
                            flag = false;
                            continue;
                    }
                }
                num1 += Integer.parseInt(s);
            } catch(NumberFormatException e){
                flag = true;
                operator = s;
            }
        }

        return answer;
    }
}
