
public class BmiService {
    public int calculate(double weight, double height) {

        double result = weight / (height * height);
//        if (result<18){
//            System.out.println("Недостаточная масса тела");
//        }
//        if (result>=20 && result<=24){
//            System.out.println("Нормальный вес, не ешьте больше");
//        }
//        if (result>=30){
//            System.out.println("Остановитесь, не надо больше есть");
//        }

        return (int) result;
    }
}













