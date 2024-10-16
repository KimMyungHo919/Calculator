package Calculator;

import java.util.Scanner;

// 메인 클래스
public class Main {
    public static void main(String[] args) {
        // 유저에게 입력받을준비.
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // 유저에게 입력받기.
            System.out.println("첫번째 숫자를 입력해주세요 : ");
            int firstNumber = scanner.nextInt(); // 저장
            // 숫자가 음수면 안됨.
            if (firstNumber < 0) {
                System.out.println("0 이상의 숫자를 입력해주세요.");
                continue; // 처음 반복으로 다시 돌아가기.
            }
            System.out.println("두번째 숫자를 입력해주세요 : ");
            int secondNumber = scanner.nextInt(); // 저장
            // 숫자가 음수면 안됨.
            if (secondNumber < 0) {
                System.out.println("0 이상의 숫자를 입력해주세요.");
                continue; // 처음 반복으로 다시 돌아가기.
            }
            System.out.println("연산자 기호를 입력하세요 : (+,-,*,/)");
            char operator = scanner.next().charAt(0); // 문자하나 입력받기. next().charAt(0)
            // 다른 기호 들어왔을때 처리.
            if (operator!='+' && operator!='-' && operator!='*' && operator!='/') {
                System.out.println("잘못된 연산기호를 입력했습니다. 처음부터 다시 입력해주세요.");
                continue;
            } else if ( (firstNumber==0 || secondNumber==0) && (operator=='*' || operator=='/') ) {
                System.out.println("나눗셈,곱셈 연산에서 0의 입력값은 불가능합니다. 다시 입력해주세요.");
                continue; // 곱셈,나눗셈에서 0이 들어가면 에러가남. 해결위해서 코드넣었음.
            }
            // 입력받은 값으로 Calculator 생성자 호출 (숫자 2개 , 기호 하나).
            Calculator result = new Calculator(firstNumber, secondNumber, operator);
            // Calculator 메서드 호출해서 값 받기.
            int getResult = result.calculate();
            // 결과출력
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + getResult + " 입니다.");

            // ⭐️ 여기서 사용자가 아무입력도 하지 않았는데, 처음으로 돌아가고있음.⭐️
            // 위 모든 과정 무한반복. exit 입력받을시 프로그램 종료.return.
            System.out.println("계속 진행하시려면 아무키나 입력해주세요. 종료하려면 exit 를 입력하세요.");
            // ⭐️ 여기서 사용자가 아무입력도 하지 않았는데, 처음으로 돌아가고있음.⭐️
            scanner.nextLine(); // 이걸 호출해줘야 해결됨. ⭐️⭐️⭐️⭐️⭐️⭐️

            // 프로그램 종료.
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                System.out.println("시스템을 종료합니다.");
                return;
            }
        } // 큰 while문 끝.
    }
}
