
public class ArraySorting {

    private int[] a;
    private int size;
    private static int count;

    public ArraySorting() {
        this(5);
    }

    public ArraySorting(int size) {
        this.size = size;
        a = new int[size];
        count++;
    }

    public void sort() {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }

    public int displayMin() {
        int min = a[0];
        for (int i = 1; i < size; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public void insertValue() {
        for (int i = 0; i < size; i++) {
            a[i] = (int) (Math.random() * 91) + 10;
        }
    }

    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        as.insertValue();
        as.sort();
        as.display();
        System.out.println("ค่าที่น้อยที่สุดคือ " + as.displayMin());
    }
}
