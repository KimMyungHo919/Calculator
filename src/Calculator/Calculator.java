package Calculator;

import java.util.ArrayList;
import java.util.List;

// 계산 로직이 들어가는 클래스
public class Calculator {
    // 아래에서 받을 변수들 만들어놓기
    private int firstNumber;
    private int secondNumber;
    private char operator;
    private List<Integer> resultAL = new ArrayList<>(); // 리스트?

    // 생성자 , 정수 두개와 기호 하나 받기.
    public Calculator(int firstNumber, int secondNumber, char operator) {
        // 초기화
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }
    // 그 기호에 맞는거에 따라서 계산하는 메서드 구현.
    public int calculate() {
        switch (operator) {
            case '+' :
                resultAL.add(firstNumber + secondNumber);
                return firstNumber + secondNumber;
            case '-' :
                resultAL.add(firstNumber - secondNumber);
                return firstNumber - secondNumber;
            case '*' :
                resultAL.add(firstNumber * secondNumber);
                return firstNumber * secondNumber;
            case '/' :
                resultAL.add(firstNumber / secondNumber);
                return firstNumber / secondNumber;
            default :
                System.out.println("예상치 못한 에러");
                return 0;
        }
    }
    // get
    public int getFirstNumber() {
        return this.firstNumber;
    }
    public int getSecondNumber() {
        return this.secondNumber;
    }
    // set
    public void setFirstNumber(int number) {
        this.firstNumber = number;
    }
    public void setSecondNumber(int number) {
        this.secondNumber = number;
    }
    // 배열 결과값 삭제?
    public void deleteResultArray(int index) {
        resultAL.remove(index);
    }
}
