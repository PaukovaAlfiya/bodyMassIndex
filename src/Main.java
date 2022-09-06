public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double body = 61;
        double height = 1.56;
        double index = service.calculate(body, height);
        System.out.println(index);
    }
}
