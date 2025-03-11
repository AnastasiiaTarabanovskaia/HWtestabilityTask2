public class BmiService {
    public int calculate (int kg, double meters) {
        int bmi = (int) (kg / (meters * meters));
        return (int) bmi;

    }
}