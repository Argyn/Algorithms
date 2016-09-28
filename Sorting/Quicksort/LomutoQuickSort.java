public class LomutoQuickSort
{
  public static void sort(int[] arrayOfInts)
  {
    LomutoQuickSort.sort(arrayOfInts, 0, arrayOfInts.length-1);
  }

  public static void sort(int[] arrayOfInts, int low, int high)
  {
    if(low < high)
    {
      int pivotPos = LomutoPartitioner.partition(arrayOfInts, low, high);
      LomutoQuickSort.sort(arrayOfInts, low, pivotPos-1);
      LomutoQuickSort.sort(arrayOfInts, pivotPos+1, high);
    }
  }

}
