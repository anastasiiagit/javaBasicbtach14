package MyJava;

Public class 
public static void main(String[] args) {
    // Условные конструкции if-else
    int a = 15, b = 20;
    char sym1 = 'A', sym2 = 'A';
    boolean isHasCar = true;
    
    if(isHasCar || a == b || sym1 != sym2) {
        System.out.println("Да, верно");
    } else if(a >= b) {
        System.out.println("Second test");
    } else if(a > b) {
        System.out.println("3 test");
    } else if(a <= b) {
        System.out.println("4 test");
    } else if(a == b) {
        System.out.println("5 test");
    } else {
        System.out.println("Нет, не верно");
    }
}
Ї
Ї