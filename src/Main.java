import arreycreator.FirstArray;
import arreycreator.SecondArray;
import mathfunktions.addition.AdditionArray;
import mathfunktions.subtraction.SubtractionArray;
import print.ArrayPrinter;

public class Main {
    public static void main(String[] args) {
        int[][] arrayFirst = new FirstArray().returnFirstArray();
        int[][] arraySecond = new SecondArray().returnSecondArray();
        int[][] additionArray = new AdditionArray().getArrayAddition();
        int[][] subtractionArray = new SubtractionArray().getArraySubtraction();

        ArrayPrinter myPrintArray = new ArrayPrinter();

        System.out.println("This is first array");
        myPrintArray.setArrayForPrinting(arrayFirst);

        System.out.println("This is second array");
        myPrintArray.setArrayForPrinting(arraySecond);

        System.out.println("This is addition array");
        myPrintArray.setArrayForPrinting(additionArray);

        System.out.println("This is subtraction array");
        myPrintArray.setArrayForPrinting(subtractionArray);

    }
}