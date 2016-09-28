import java.util.Random;

public class RunTest
{

  public static void main(String[] args)
  {
    int arraySize = 100000;

    System.out.println(String.format("Generating array of size: %d", arraySize));
    int[] arrayOfInts = generateArrayOfInts(arraySize);

    System.out.println("Generated array:");
    //printArray(arrayOfInts);

    System.out.println();
    System.out.println();
    System.out.println("==========================================");
    System.out.println("Starting QuickSort with Hoare's partition");
    int[] resultArray = copyArray(arrayOfInts);
    Timer timer = new Timer();
    HoareQuickSort.sort(resultArray);
    long endTime = System.nanoTime();
    System.out.println(String.format("Elapsed time: %2f", timer.elaspedMilliseconds()));
    System.out.println("Result:");

    System.out.println("Resorting");
    timer.reset();
    HoareQuickSort.sort(resultArray);
    System.out.println(String.format("Elapsed time: %2f", timer.elaspedMilliseconds()));
    //printArray(resultArray);



    // System.out.println();
    // System.out.println();
    // System.out.println("==========================================");
    // System.out.println("Starting QuickSort with Lomuto's partition");
    // System.out.println("Generated array:");
    // printArray(arrayOfInts);
    //
    // resultArray = copyArray(arrayOfInts);
    // LomutoQuickSort.sort(resultArray);
    //
    // System.out.println("Result:");
    // printArray(resultArray);
  }

  public static void printArray(int[] arrayOfInts)
  {
    for(int i : arrayOfInts)
    {
      System.out.print(String.format("%d,", i));
    }
    System.out.println();
  }

  public static int[] copyArray(int[] arrayOfInts)
  {
    int[] copiedArray = new int[arrayOfInts.length];

    for(int i=0; i<arrayOfInts.length; i++)
    {
      copiedArray[i] = arrayOfInts[i];
    }

    return copiedArray;
  }

  public static int[] generateArrayOfInts(int size)
  {
    if(size <= 0)
    {
      return new int[]{0};
    }

    Random rand = new Random();
    int[] arrayOfInts = new int[size];

    int max = 1000;
    int min = 0;

    for(int i=0; i<size; i++)
    {
      arrayOfInts[i] = rand.nextInt(max - min + 1) + min;
    }

    return arrayOfInts;
  }
}
