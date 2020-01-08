import java.util.Scanner;

public class Menu {
    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        double fistArgument = scanner.nextDouble();
        System.out.println("Введите число B");
        double secondArgument = scanner.nextDouble();
        System.out.println("Введите одно из математических действий" +
                "\n  (+)" +
                "\n  (-)" +
                "\n  (*)" +
                "\n  (/)" +
                "\n  (%)" +
                "\n  (==)" +
                "\n  (>)" +
                "\n  (<)");
        String sign = scanner.next();
        new NewThread(sign, fistArgument, secondArgument).start();
    }

    public void secondMenu(NewThread newThread) {

        switch (newThread.getSign()) {
            case "+": {
                MathFunctions.plus(newThread);
                break;
            }
            case "-": {
                MathFunctions.minus(newThread);
                break;
            }
            case "*": {
                MathFunctions.multiply(newThread);
                break;
            }
            case "/": {
                MathFunctions.division(newThread);
                break;
            }
            case "%": {
                MathFunctions.divisionWithRemainder(newThread);
                break;
            }
            case "==": {
                MathFunctions.equality(newThread);
                break;
            }
            case ">": {
                MathFunctions.more(newThread);
                break;
            }
            case "<": {
                MathFunctions.less(newThread);
            }
            default: {
                System.out.println("Нет такой функции");
            }
        }
    }
}
