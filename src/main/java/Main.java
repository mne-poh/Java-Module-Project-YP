import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            String name;
            System.out.println("Введите название машины №" + i + ": ");
            while (true) {
                name = scanner.nextLine();
                if (!name.trim().isEmpty()) break;
                else System.out.println("Название машины не может быть пустым!\nВведите название машины №" + i + ": ");
            }

            System.out.println("Введите скорость машины №" + i + ": ");
            while (true) {
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Введите число скорости машины №" + i + " большее 0 и не более 250: ");
                    continue;
                }
                try {
                    int speed = Integer.parseInt(input);
                    if (speed > 0 && speed <= 250) {
                        cars.add(new Car(name, speed));
                        break;
                    } else {
                        System.out.println("Введите число скорости машины №" + i + " большее 0 и не более 250: ");

                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Введите число скорости машины №" + i + " большее 0 и не более 250: ");
                }
            }

        }

        Race race = new Race();
        System.out.println("Самая быстрая машина: " + race.findWinner(cars.get(0), cars.get(1), cars.get(2)).name);
        
    }
}