public class Task {

    public static void main(String[] args) {
        Fridge1 f1 = new Fridge1(10);
        System.out.println(f1.getCelsiusTemperature());
        System.out.println(f1.getFahrenheitTemperature());

        Fridge2 f2 = new Fridge2(10);
        System.out.println(f2.getCelsiusTemperature());
        System.out.println(f2.getFahrenheitTemperature());
    }
}