
class NewThread extends Thread {

    private double fist;
    private double second;

    public double getFist() {
        return fist;
    }

    public void setFist(double fist) {
        this.fist = fist;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    private String sign;

    NewThread(String sign, double fist, double second) {
        this.sign = sign;
        this.fist = fist;
        this.second = second;

    }

    public void run() {
        Menu menu = new Menu();
        menu.secondMenu(new NewThread(sign, fist, second));
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
    }


}