package com.hw_3_data_types_and_variables;

public class EasyTasks {

    public static void main(String[] args) {
        //begin32(56);
       //begin38(3, 4);
        //begin39(1, 6, 5 );
        //integer6(23);
        //integer7(23);
        //integer8(23);
        //integer9(123);
        //integer10(123);
        //integer11(123);
        //integer12(123);
        //integer13(123);
    }

    public static void begin32(double tf){
        double tc = (tf - 32) * 5 / 9;
        System.out.println(tc);
    }

    public static void begin38(double a, double b){
        double x = -b / a;
        System.out.println(x);
    }

    public static void begin39(int a, int b, int c){
        double d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);
    }

    public static void integer6(int a){
        int f = a / 10;
        int g = a - (f * 10);
        System.out.println(f);
        System.out.println(g);
    }

    public static void integer7(int a){
        int f = a / 10;
        int g = a - (f * 10);
        int b = f + g;
        int d = f * g;
        System.out.println(b);
        System.out.println(d);
    }

    public static void integer8(int a){
        int f = a / 10;
        int g = a - (f * 10);
        System.out.println(g * 10 + f);
    }

    public static void integer9(int a){
        int f = a / 100;
        System.out.println(f);
    }

    public static void integer10(int a){
        int f = a / 100; //сотни
        int g = a - f * 100;
        int h = g / 10; //десятки
        int j = g - (h * 10); //единицы
        System.out.println(j);
        System.out.println(h);
    }

    public static void integer11(int a){
        int f = a / 100;
        int g = a - f * 100;
        int h = g / 10;
        int j = g - (h * 10);
        int q = f + h + j;
        int l = f * h * j;
        System.out.println(q);
        System.out.println(l);
    }

    public static void integer12(int a){
        int f = a / 100;
        int g = a - f * 100;
        int h = g / 10;
        int j = g - (h * 10);
        System.out.println(j * 100 + h * 10 + f);
    }

    public static void integer13(int a){
        int f = a / 100;
        int g = a - f * 100;
        int h = g / 10;
        int j = g - (h * 10);
        System.out.println(h * 100 + j * 10 + f);
    }
    // TODO

    /*

    Begin32. Дано значение температуры T в градусах Цельсия.
                Определить значение этой же температуры в градусах Фаренгейта.
                Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
                TC=(TF−32)∗5/9.

    Begin38. Решить линейное уравнение A∗x+B=0, заданное своими коэффициентами A и B (коэффициент A не равен 0).

    //Begin39. Найти корни квадратного уравнения A∗x²+B∗x+C=0, заданного своими коэффициентами A, B, C
                (коэффициент A не равен 0), если известно, что дискриминант уравнения положителен.
                Вывести вначале меньший, а затем больший из найденных корней.
                Корни квадратного уравнения находятся по формуле x1=(−B+√D)/(2∗A),  x2=(−B−√D)/(2∗A),
                где D — дискриминант, равный B²−4∗A∗C.

    Integer6. Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его правую цифру (единицы).
                    Для нахождения десятков использовать операцию деления нацело, для нахождения единиц —
                    операцию взятия остатка от деления.

    Integer7. Дано двузначное число. Найти сумму и произведение его цифр.

    Integer8. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.

    Integer9. Дано трехзначное число. Используя одну операцию деления нацело, вывести первую цифру данного числа (сотни).

    Integer10. Дано трехзначное число. Вывести вначале его последнюю цифру (единицы), а затем — его среднюю цифру (десятки).

    Integer11. Дано трехзначное число. Найти сумму и произведение его цифр.

    Integer12. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево..

    Integer13. Дано трехзначное число. В нем зачеркнули первую слева цифру и приписали ее справа.
                    Вывести полученное число.
     */
}
