public class Ejercicio2_Sofia {
    static int pot(int b, int e) { 
        if (e == 0) 
            return 1; 
        return b * pot(b, e - 1);
     }
}
 //