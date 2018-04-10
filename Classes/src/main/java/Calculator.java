public class Calculator {

    private int number1;
    private int number2;
    private int result;

    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int add() {
        result = number1 + number2;
        return result;
    }

    public int subtract() {
        result = number1 - number2;
        return result;
    }

    public int multiply() {
        result = number1 * number2;
        return result;
    }

    public int divide() {
        result = number1 / number2;
        return result;
    }
}
