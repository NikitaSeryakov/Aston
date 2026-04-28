public class Try {
    public static void main(String[] args) {
        String[][] arr = {{"x","1","1","1"},{"2","2","2","2"},{"3","3","3","3"},{"4","4","4","4"}};
        try {
            System.out.println("Сумма: " + process(arr));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static int process(String[][] a) throws MyArraySizeException, MyArrayDataException {
        if (a.length != 4) throw new MyArraySizeException("Должно быть 4x4");
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (a[i].length != 4) throw new MyArraySizeException("Должно быть 4x4");
            for (int j = 0; j < 4; j++) {
                try { sum += Integer.parseInt(a[i][j]); }
                catch (NumberFormatException e) { throw new MyArrayDataException(i, j); }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception { MyArraySizeException(String e) { super(e); } }
class MyArrayDataException extends Exception { MyArrayDataException(int i, int j) { super("Ошибка в ["+i+"]["+j+"]"); }
}
