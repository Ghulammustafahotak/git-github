public class Main {
    public static void main(String[] args) {
        int a = 1;
        int summe = 0;
    
        while (a < 5) {
            summe = summe + a;  
                if (a > 3) {
                    summe = summe - 1;
                } else {
                a = a + 1;
                    } 
                  
        }
        System.out.println("Die Summe lautet: " + summe);    
    }
}