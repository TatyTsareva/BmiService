public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weight = 150;
        double height = 1.69;
        double index = service.calculate(weight, height);

        System.out.println("Индекс массы тела" + " " + (int) index);


    }
}
