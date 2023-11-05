public class Task {

    public static void main(String[] args) {
        Fridge1 f1 = new Fridge1(10);
        System.out.println(f1.getCelsiusTemperature());
        System.out.println(f1.getFahrenheitTemperature());
        System.out.println(f1.getKelvinTemperature());

        Fridge2 f2 = new Fridge2(10);
        System.out.println(f2.getCelsiusTemperature());
        System.out.println(f2.getFahrenheitTemperature());
        System.out.println(f2.getKelvinTemperature());

        Fridge3 f3 = new Fridge3(10);
        System.out.println(f3.getCelsiusTemperature());
        System.out.println(f3.getFahrenheitTemperature());
        System.out.println(f3.getKelvinTemperature());
    }
}