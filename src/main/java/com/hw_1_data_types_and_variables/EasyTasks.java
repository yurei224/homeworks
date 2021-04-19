package com.hw_1_data_types_and_variables;

public class EasyTasks {

    public static void main(String[] args) {
        task5(3);
        task6(1,2,3);
        task7(3.14,14);
        task8(12,5);
        task9(12,3);
        task10(12,3);
        task11(-10,6);
        task12(12,3);
        task13(12,3,3.14);
        task14(3);
        task15(2);


    }
    public static void task5(int a) {
        int v = a*a*a ;
        int s = 6*a*a ;
        System.out.println(v);
        System.out.println(s);
    }

    public static void task6(int a, int b, int c) {
        int v = a*b*c ;
        int s = 2 * (a*b+b*c+a*c);
        System.out.println(v);
        System.out.println(s);
    }

    public static void task7(double pi, int r) {
        double l = 2*pi*r ;
        double s = pi*r*r;
        System.out.println(l);
        System.out.println(s);
    }

    public static void task8(int a, int b) {
        double s = (a + b) / 2D;
        System.out.println(s);
    }

    public static void task9(int a, int b) {
        double s = Math.sqrt(a * b) ;
        System.out.println(s);
    }

    public static void task10(int a, int b){
        int c = a+b ;
        int e = a-b ;
        double f = a*b ;
        double g = a/b ;
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    public static void task11(int a, int  b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int c = a + b;
        int d = a - b;
        double e = a * b;
        double f = 1.0 * a / b ;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    public static void task12(int a, int b) {
    double c = Math.sqrt(a * a + b * b);
    double p = a + b + c;
        System.out.println(c);
        System.out.println(p);
    }

    public static void task13(int a, int b, double pi){
        double s1 = pi*(a*a);
        double s2 = pi*(b*b);
        double s3 = s1-s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static void task14(int l) {
        double pi = 3.14;
        double r = l/(2*pi);
        double s = pi * (r*r);
        System.out.println(r);
        System.out.println(s);
    }

    public static void task15(int s) {
        double pi = 3.14;
        double d = Math.sqrt(4 * s / pi);
        double l = pi*d;
        System.out.println(d);
        System.out.println(l);
    }
    // TODO

     /*
     5. Дана длина куба a, найти объем куба V = a^3 и площадь его поверхности S = 6*a².

     6. Даны длины ребер a, b, c прямоугольного параллелепипеда.
             Найти его объем V и площадь поверхности S.Справка: V = a∙b∙c, S = 2∙(a∙b + b∙c + a∙c)

     7. Найти длину окружности L и площадь круга S заданного радиуса R:
             L=2∗π∗R, S=π∗R2. В качестве значения π использовать 3.14.

     8. Даны два числа a и b. Найти их среднее арифметическое: (a+b)/2.

     9. Даны два неотрицательных числа a и b.
             Найти их среднее геометрическое, то есть квадратный корень из их произведения: √(a·b)

     10. Даны два ненулевых числа. Найти сумму, разность, произведение и частное их квадратов.

     11. Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.

     12. Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:
             √(a²+b²), P=a+b+c.

     13. Даны два круга с общим центром и радиусами R1 и R2 (R1>R2).
             Найти площади этих кругов S1 и S2, а также площадь S3 кольца,
                  внешний радиус которого равен R1, а внутренний радиус равен R2:
                        S1=π·(R1)², S2=π·(R2)², S3=S1−S2

     14. Дана длина L окружности. Найти ее радиус R и площадь S круга, ограниченного этой окружностью,
             учитывая, что L=2∗π∗R, S=π∗R². В качестве значения π использовать 3.14.

     15. Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг,
             учитывая, что L=π∗D, S=π∗D²/4. В качестве значения π использовать 3.14.
     */
}
