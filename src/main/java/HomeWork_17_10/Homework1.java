package HomeWork_17_10;

public class Homework1 {public static void main(String[] args) {
    // Возвращает длину строки (количество символов)
        String name_0 = "Александр";
        int result_0  = name_0.length();
        System.out.println(result_0);

    // Проверяет, пустая ли строка / false
        String name_1 = "Александр";
        boolean result_1  = name_1.isEmpty();
        System.out.println(result_1);

    // Проверяет, пустая ли строка и содержаться ли пробелы
        String name_3 = "      ";
        boolean result_3  = name_3.isBlank();
        System.out.println(result_3);

    // Возврат подстроки cо второго символа и закончить на шестом символе
        String name_4 = "Александр";
        String result_4  = name_0.substring(1,7);
        System.out.println(result_4);

    // Показать по счету первый найденный символ
        String name_5 = "Александр спит";
        int result_5  = name_5.indexOf("н");
        System.out.println(result_5);

    //  Показать по счету первый последний символ
        String name_6 = "Александр";
        int result_6  = name_6.lastIndexOf("а");
        System.out.println(result_6);

    //  Сделать предложение нижним регистром
        String name_7 = "АлеКСандР";
        String result_7  = name_7.toLowerCase();
        System.out.println(result_7);

   //  Сделать предложение верхним регистром
       String name_8 = "александр";
        String result_8  = name_8.toUpperCase();
        System.out.println(result_8);

    //  Поиск строки и если она существует переименовать ее
        String name_9 = "Александр";
        String result_9  = name_9.replace("Александр", "Саша");
        System.out.println(result_9);

    //  Поиск в начале строки и если есть совпадение то true
        String name_10 = "Александр";
        Boolean result_10  = name_10.startsWith("Алек");
        System.out.println(result_10);

    //  Поиск в конце строки и если нет совпадений то false
        String name_11 = "Александр";
        Boolean result_11  = name_11.endsWith("Андр");
        System.out.println(result_11);

    //  Отоброзить строку несколько раз
        String name_12 = "Александр ";
        String result_12  = name_12.repeat(10);
        System.out.println(result_12);

    //  Поиск символа в строке, если есть то true
        String name_13 = "Александр";
        Boolean result_13  = name_13.contains("Ан");
        System.out.println(result_13);

    //  Добавление символов после строки
        String name_14 = "Александр";
        String result_14  = name_14.concat(" Таранов");
        System.out.println(result_14);

    //  Удаление пробелов
        String name_15 = "    Александр    ";
        String result_15  = name_15.trim();
        System.out.println(result_15);

    //  Сравнивает строку на полное соответсвие
        String name_16 = "Александр";
        Boolean result_16  = name_16.equals("Александр");
        System.out.println(result_16);
}
}