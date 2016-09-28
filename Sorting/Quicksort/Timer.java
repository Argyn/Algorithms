public class Timer
{

  private long startTime;

  public Timer()
  {
    startTime = System.nanoTime();
  }

  public void reset()
  {
    startTime = System.nanoTime();
  }

  public long elapsedTime()
  {
    return System.nanoTime() - startTime;
  }

  public double elaspedMilliseconds()
  {
    return elapsedTime() / 10e6;
  }

}
