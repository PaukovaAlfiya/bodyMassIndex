public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double body = 61; // вес
        double height = 1.56; // рост
        double index = service.calculate(body, height);
        System.out.println(index);
    }
}
