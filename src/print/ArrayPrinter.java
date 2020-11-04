package print;

public class ArrayPrinter {
    public void setArrayForPrinting(int[][] arrayForPrinting) {
        for (int i = 0; i < arrayForPrinting.length; i++) {
            for (int j = 0; j < arrayForPrinting[i].length; j++) {
                System.out.print(arrayForPrinting[i][j] + ",");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
