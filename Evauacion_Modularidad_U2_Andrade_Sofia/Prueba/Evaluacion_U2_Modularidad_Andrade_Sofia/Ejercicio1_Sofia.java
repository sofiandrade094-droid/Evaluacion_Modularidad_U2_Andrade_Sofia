public class Ejercicio1_Sofia {
static int f(int x) {
     return x * x; 
    }
static int g(int x) {
     return f(x) + f(x + 1);
     }
public static void main(String[] a) {
int x = 2;
System.out.println(g(x) + " " + f(g(1)));
System.out.println(x);
}
    
}
//RESPUESTA: 13 25
//2