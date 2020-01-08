public class MathFunctions {
    public static void plus(NewThread newThread) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(newThread.getFist() +" "+ newThread.getSign()+" " + newThread.getSecond() + " === " + (newThread.getFist() + newThread.getSecond()));
    }

    public static void minus(NewThread newThread) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(newThread.getFist() +" "+ newThread.getSign()+" " + newThread.getSecond() +  " === " + (newThread.getFist() - newThread.getSecond()));
    }

    public static void multiply(NewThread newThread) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(newThread.getFist() +" "+ newThread.getSign()+" " + newThread.getSecond() +  " === " + (newThread.getFist() * newThread.getSecond()));
    }

    public static void division(NewThread newThread) {
        System.out.println(Thread.currentThread().getName());
        if (newThread.getSecond() == 0) {
            System.out.println("Невозможно деление на 0");
        } else
            System.out.println(newThread.getFist() +" "+ newThread.getSign()+" " + newThread.getSecond() +  " === " + (newThread.getFist() / newThread.getSecond()));
    }

    public static void divisionWithRemainder(NewThread newThread) {
        System.out.println(Thread.currentThread().getName());
        if (newThread.getSecond() == 0) {
            System.out.println("Невозможно деление на 0");
        } else
            System.out.println(newThread.getFist() +" "+ newThread.getSign()+" " + newThread.getSecond() +  " === " + (newThread.getFist() % newThread.getSecond()));
    }

    public static void equality(NewThread newThread) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(newThread.getFist() +" "+ newThread.getSign()+" " + newThread.getSecond() +  " === " + (newThread.getFist() == newThread.getSecond()));
    }

    public static void more(NewThread newThread) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(newThread.getFist() +" "+ newThread.getSign()+" " + newThread.getSecond() +  " === " + (newThread.getFist() > newThread.getSecond()));
    }

    public static void less(NewThread newThread) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(newThread.getFist() +" "+ newThread.getSign()+" " + newThread.getSecond() + " ===" + (newThread.getFist() < newThread.getSecond()));
    }
}
