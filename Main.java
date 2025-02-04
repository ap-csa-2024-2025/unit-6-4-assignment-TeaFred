import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int theLength = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i].length() == targetLength)
      {
        theLength++;
      }
    }
    return theLength;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = i+1; j < arr.length; j++)
      {
        if (arr[i] == arr[j])
        {
          return true;
        }
      }
    }
    return false;
  }

  public static int findMode(int[] arr)
  {
    int theMode = arr[0];
    int highestCounter = 0; 
    int currCounter = 0;
    for (int i = 0; i < arr.length; i++)
    {
      currCounter = 0;
      for (int j = i + 1; j < arr.length; j++)
      {
        if (arr[i] == arr[j])
        {
          currCounter++;
        }
      }
      if (currCounter > highestCounter)
      {
        theMode = arr[i];
        highestCounter = currCounter;
      }
    }
    return theMode;
  }
}
