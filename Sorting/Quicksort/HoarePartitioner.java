public class HoarePartitioner
{

  public static int partition(int[] arrayOfInts, int low, int high)
  {
    int pivot = arrayOfInts[low + (high - low) / 2];

    int i = low - 1;
    int j = high + 1;

    while(true)
    {
      do
      {
        i++;
      }
      while(arrayOfInts[i] < pivot);

      do
      {
        j--;
      }
      while(arrayOfInts[j] > pivot);

      if(i >= j)
      {
        return j;
      }

      int leftSide = arrayOfInts[i];
      arrayOfInts[i] = arrayOfInts[j];
      arrayOfInts[j] = leftSide;
    }
  }
}
