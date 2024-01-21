
public class Main{
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

public static void main(String[] args){
//รับค่า
  int[] x = {};
  int[] y = {};
  int[] result = sumArrays(x, y);
  for (int i = 0; i < result.length; i++) //วนลูป
  {
    System.out.println(result[i]);
  }//ปริ้นค่าผลลัพธ์
}
 } 
