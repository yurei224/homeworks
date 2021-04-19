package com.hw_2_data_types_and_variables;


public class EasyTasks {

    public static void main(String[] args) {
        //begin16(12.0,3.0);
        //begin17(12,3,4);
        //begin19(12,3,4,6);
        //begin20(1, 2, 3, 4);
        //begin21(1, 2, 4, 6);
        //begin22(2,1);
        //begin23(1, 2, 3);
        //begin24(1, 2, 3);
        begin25(2);
    }

    public static void begin16(double x1, double x2) {
        double s = Math.abs(x1 - x2);
        System.out.println(s);
    }

    public static void begin17(double a, double b, double c){
        double ac = Math.abs(c - a);
        double bc = Math.abs(c - b);
        double s = ac + bc;
        System.out.println(ac);
        System.out.println(bc);
        System.out.println(s);
    }

    public static void begin19(int x1, int x2, int y1,int y2) {
        int a = Math.abs(x1-x2);
        int b = Math.abs(y2-y1);
        int P = a + a + b + b;
        int S = a * b;
        System.out.println(P);
        System.out.println(S);
    }

    public static void begin20(double x1, double y1, double x2, double y2) {
        double l = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(l);
    }

    public static void begin21(double x1, double y1, double x2, double y2) {
        double a = y2 - y1 ;
        double b = x2 - x1 ;
        double c = Math.sqrt(a * a + b * b);
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p-a) * (p - b) * (p - c));
        System.out.println(p);
        System.out.println(s);
    }

    public static void begin22(int a,int b){
        int c = a;
         a = b;
         b = c;
        System.out.println(a);
        System.out.println(b);
    }

    public static void begin23(int a, int b, int c){
       int g = a;
       int f = b;
       b = g;
       a = c;
       c = f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void begin24(int a, int b, int c){
        int e = a;
        int r = b;
        int t = c;
        c = e;
        b = t;
        a = r;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void begin25(double x){
        double y = 3 * Math.pow(x, 6) - 6 * x * x - 7;
        System.out.println(y);
    }
    // TODO

    /*
    Begin16. Найти расстояние между двумя точками с заданными координатами x1 и x2 на числовой оси: |x2−x1|.

    Begin17. Даны три точки A, B, C на числовой оси. Найти длины отрезков AC и BC и их сумму.

    Begin18. Даны три точки A, B, C на числовой оси.
             Точка C расположена между точками A и B. Найти произведение длин отрезков AC и BC.

    Begin19. Даны координаты двух противоположных вершин прямоугольника: (x1,y1),  (x2,y2).
             Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.

    Begin20. Найти расстояние между двумя точками с заданными координатами (x1,y1) и (x2,y2) на плоскости.
             Расстояние вычисляется по формуле √(x2 — x1)² + (y2 — y1)²

    Begin21. Даны координаты трех вершин треугольника: (x1,y1), (x2,y2), (x3,y3).
             Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости
             (см. задание Begin20. Для нахождения площади треугольника со сторонами a, b, c использовать формулу Герона:
             S = sqrt(p * (p-a) * (p - b) * (p - c))
             где p = (a+b+c)/2 – полупериметр.

    Begin22. Поменять местами содержимое переменных A и B и вывести новые значения A и B.

    Begin23. Даны переменные A, B, C. Изменить их значения, переместив содержимое A в B,
             B — в C, C — в A, и вывести новые значения переменных A, B, C.

    Begin24. Даны переменные A, B, C. Изменить их значения, переместив содержимое A в C,
             C — в B, B — в A, и вывести новые значения переменных A, B, C.

    Begin25. Найти значение функции y=3∗x^6−6∗x^2−7 при данном значении x.

     */
}
