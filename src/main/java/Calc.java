public class Calc {
    static int run(String polynomial) {

        int sum = 0;

        // 숫자 부분의 자릿수가 늘어나면서, 기존에 작성한 char 배열로 변환해 숫자 부분을 캐치하는 코드는 사용할 수 없게 되었음
        // 숫자 부분의 단위가 바뀌어도, 온전히 캐치할 수 있는 방법을 모색해야 함
        // 생각한 방법: polynomial의 한 칸 공백을 기준으로 스플릿?

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
