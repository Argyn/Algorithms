public class HoareQuickSort
{
  public static void sort(int[] arrayOfInts)
  {
    HoareQuickSort.sort(arrayOfInts, 0, arrayOfInts.length-1);
  }

  public static void sort(int[] arrayOfInts, int low, int high)
  {
    if(low < high)
    {
      int pivotPos = HoarePartitioner.partition(arrayOfInts, low, high);
      HoareQuickSort.sort(arrayOfInts, low, pivotPos);
      HoareQuickSort.sort(arrayOfInts, pivotPos+1, high);
    }
  }

}
