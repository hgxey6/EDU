package lambda.simpletask;

/*
Предоставьте интерфейс Measurable с методом double getMeasure(), измеряющим объект
определенным образом. Создайте класс Employee , реализующий интерфейс Measurable.
Предоставьте метод double average(Measurable[] objects), вычисляющий среднюю меру.
Воспользуйтесь им для расчета средней зарплаты в массиве работников
*/

public class Main {
    public static void main(String[] args) {
        //Зарлпаты
        Measurable[] arr = new Employee[4];
        arr[0] = new Employee(40000);
        arr[1] = new Employee(66000);
        arr[2] = new Employee(44000);
        arr[3] = new Employee(70000);
        //Лямбда
        MeasureAverage ma = (array) -> {
            double sum = 0;
            for (Measurable m : array) {
                sum += m.getMeasure();
            }
            return sum / array.length;
        };
        //Вывод ср. зарплаты
        System.out.println(ma.average(arr));
    }

    @FunctionalInterface
    public interface MeasureAverage {
        double average(Measurable[] objects);
    }
}
