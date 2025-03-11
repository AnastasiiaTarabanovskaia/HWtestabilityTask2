public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 70;
        double meters = 1.66;
        int bmi = service.calculate(kg, meters);
        System.out.println(bmi);
    }
}
