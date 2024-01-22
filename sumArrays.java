import java.util.Scanner;

public class Main {

  public static int[] sumArrays(int[] x, int[] y) {
    // ผลลัพธ์ของฟังก์ชัน
    int[] result = new int[Math.max(x.length, y.length)];

    // วนซ้ำผ่านอาร์เรย์ทั้งสองตัว
    for (int i = 0; i < result.length; i++) {
      // ตรวจสอบว่าอาร์เรย์ทั้งสองตัวมีความยาวเท่ากันหรือไม่
      if (i < x.length && i < y.length) {
        // รวมค่าทั้งสองค่า
        result[i] = x[i] + y[i];
      } else if (i < x.length) {
        // อาร์เรย์ x มีความยาวมากกว่า
        result[i] = x[i];
      } else {
        // อาร์เรย์ y มีความยาวมากกว่า
        result[i] = y[i];
      }
    }

    // คืนค่าผลลัพธ์
    return result;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // รับค่า
    System.out.print("Enter elements x: ");
    int n = scan.nextInt();
    int[] x = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print ( "x [" +"number"+ (i+1) + "] = ");
      x[i] = scan.nextInt();
    }
    System.out.print("Enter the elements y: ");
    n = scan.nextInt();
    int[] y = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("y[" + "number" +(i+1)+ "] = ");
      y[i] = scan.nextInt();
    }

    // เรียกใช้ฟังก์ชัน sumArrays()
    int[] result = sumArrays(x, y);

    // พิมพ์ผลลัพธ์
    for (int i = 0; i < result.length; i++) {
      System.out.println("number "+(i+1)+" = "+result[i]);
    }
  }
}
