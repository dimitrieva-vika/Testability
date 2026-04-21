public class BonusMilesService {

    public int calculate(int price) {
        // За 20 рублей = 1 миля
        // Чтобы получить мили: цену делим на 20
        int miles = price / 20;

        // Возвращаем количество миль
        return miles;
    }
}