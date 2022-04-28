public class JvmComprehension {
//    Система загрузчиков подгружает класс JvmComprehension (Application ClassLoader)
//    и классы из других необходимых библиотек (Platform ClassLoader и Bootstrap ClassLoader)
//    Информация о всех загруженных классах помещается в MetaSpace

    public static void main(String[] args) {
//            0 - В Stack Memory создается фрейм main()

        int i = 1;
//            1 - В Stack Memory в фрейме main() создается переменная примитивного типа int
//            c именем "i", которой присваивается значение 1


        Object o = new Object();
//            2 - в Heap создается новый пустой объект типа Object,
//            в Stack Memory в фрейме main() создается ссылка "o" на вновь созданный в Heap объект

        Integer ii = 2;
//            3 - в Heap создается новый объект типа Integer со значением 2,
//            в Stack Memory в фрейме main() создается ссылка "ii" на вновь созданный в Heap объект

        printAll(o, i, ii);
//            4 - В Stack Memory создается фрейм printAll(), в котором создается ссылка "o" на объект типа
//            Object в Heap, передается переменная i, создается ссылка "ii" на объект типа Integer в куче Heap


        System.out.println("finished");
//            7 - В Stack Memory в фрейм println() передается ссылка на объект типа String со значением "finished",
//            созданный в Heap

    }

//            Возможна работа сборщика мусора Garbage Collector по итогу выполнения метода main

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;
//        5 - В Heap создается объект типа Integer со значением 700,
//        в Stack Memory во фрейме printAll() создается ссылка "uselessVar" на созданный в Heap объект


        System.out.println(o.toString() + i + ii);
//        6 - В Stack Memory создается фрейм println(), в него передаются ссылки: "o" на объект типа Object в Heap,
//         "i" на int во фрейме main() в Stack Memory,"ii" на объект типа Integer в Heap.
//        В Stack Memory создается фрейм toString()
    }
//            Возможна работа сборщика мусора Garbage Collector по итогу выполнения метода printAll
}
//            Возможна работа сборщика мусора Garbage Collector по итогу выполнения программы
