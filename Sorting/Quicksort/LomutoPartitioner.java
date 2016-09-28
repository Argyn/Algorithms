public class LomutoPartitioner
{
  public static int partition(int[] arrayOfInts, int low, int high)
  {
    int pivot = arrayOfInts[high];

    int i = low;

    for(int j=low; j < high - 1; j++)
    {
      if(arrayOfInts[j] <= pivot)
      {
        int leftSide = arrayOfInts[i];
        arrayOfInts[i] = arrayOfInts[j];
        arrayOfInts[j] = leftSide;
        i++;
      }
    }

    int leftSide = arrayOfInts[i];
    arrayOfInts[i] = arrayOfInts[high];
    arrayOfInts[high] = leftSide;

    return i;
  }
}
