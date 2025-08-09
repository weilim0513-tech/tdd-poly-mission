public class Calc {
    static int run(String polynomial) {

        // 기존의 코드로는 연산자를 캐치하지 못했음.
        // 연산자를 구분하는 기능을 구현해야 함
        // 생각한 방법: 넘버포맷익셉션으로 캐치한 예외 catch구문 안에 switch로 연산자를 구별하게 만들어보자.
        // 그러려면 try문도 바꿔야 함. 무조건 더하는 것이 아니라, 일단 어딘가에 저장하는 식으로.
        // 반복문을 돌리지 않고 분할된 3개의 String을 각각 처리하는 방법도 있으나, 모든 다항식은 연산자 하나에 수 2개로 구성되진 않는다.
        // 그러니 지금 생각났을 때 고치자.
        // A + B - C + D 는 (((A + B) - C) + D) 로 생각할 수 있음. 두 수의 연산 결과를 한 변수로 다시 저장.

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
                            flag = false;
                            continue;
                        case "-" :
                            answer = num1 - Integer.parseInt(s);
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
