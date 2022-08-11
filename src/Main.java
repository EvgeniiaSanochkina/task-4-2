public class Main {
    public static void main(String[] args) {
        BmiService calc =  new BmiService();
        int m = 61;
        double h = 1.65;
        double index = calc.calculate(m, h);
        System.out.println(index);
    }
}
