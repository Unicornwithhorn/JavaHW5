//        Пусть дан список сотрудников:
//        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
public class Homework5_2 {
    public static void main(String[] args) {
        String workers = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин," +
                " Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина," +
                " Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] workersArr = workers.split(", ");
        PopularScaleNames popularScaleNames = new PopularScaleNames();
        for (int i = 0; i < workersArr.length; i++) {
            popularScaleNames.addName(workersArr[i]);
        }
        System.out.println(popularScaleNames.treeMap);
        }

    }







