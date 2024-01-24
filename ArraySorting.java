import java.util.Arrays;
import java.util.Random;

public class Main {
   private static int count = 0;
   private int[] a;

   
   public Main() {
       this(5);
   }

   
   public Main(int size) {
       a = new int[size];
       count++;
       insertValues();
   }

   
   public void sort() {
       Arrays.sort(a);
       reverseArray();
   }

   
   public void display() {
       System.out.println(Arrays.toString(a));
   }

   
   public void displayMin() {
       int min = a[0];
       for (int value : a) {
           if (value < min) {
               min = value;
           }
       }
       System.out.println("ค่าน้อยที่สุดคือ: " + min);
   }

   
   private void insertValues() {
       Random rand = new Random();
       for (int i = 0; i < a.length; i++) {
           a[i] = rand.nextInt(91) + 10; 
       }
 }
   private void reverseArray() {
       for (int i = 0; i < a.length / 2; i++) {
           int temp = a[i];
           a[i] = a[a.length - 1 - i];
           a[a.length - 1 - i] = temp;
       }
   }


   public static void main(String[] args) {
      
       Main main = new Main();
       main.sort();
       main.display();
       main.displayMin();
   }
}
