
public class Race {
    public static Car findWinner(Car car_1, Car car_2, Car car_3) {
        Car winner = car_1;
        if (car_2.speed > winner.speed) winner = car_2;
        if (car_3.speed > winner.speed) winner = car_3;
        return winner;
    }
}
