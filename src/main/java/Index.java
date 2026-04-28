public class Index {
    public static void main(String[] args) {
        try {
            int[] a = {1};
            int b = a[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границу");
        }
    }
}