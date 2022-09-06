public class BmiService {
    public double calculate( double body, double height) {
        double bmi;
                bmi = body / (height * height);
        return bmi;
        }

}
