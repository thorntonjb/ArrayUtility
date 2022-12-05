public class ArrayUtility 
{
    private int[] intArray;

    public ArrayUtility()
    {

    }

    public ArrayUtility(int[] _intArray)
    {
        intArray = _intArray;
    }

    public int[] getIntArray()
    {
        return intArray;
    }

    public void setIntArray(int[] _intArray)
    {
        intArray = _intArray;
    }

    public int minimumValue()
    {
        int smallestNumber = 0;
        if (intArray.length == 0) { return smallestNumber; }
        else 
        {
            smallestNumber = intArray[0];
            for (int index = 0; index < intArray.length; index++)
            {
                if (intArray[index] < smallestNumber) { smallestNumber = intArray[index]; }
            }
        }
        return smallestNumber;
    }

    public int maximumValue()
    {
        int largestNumber = 0;
        if (intArray.length == 0) { return largestNumber; }
        else 
        {
            largestNumber = intArray[0];
            for (int index = 0; index < intArray.length; index++)
            {
                if (intArray[index] > largestNumber) { largestNumber = intArray[index]; }
            }
        }
        return largestNumber;
    }

    public int countUniqueIntegers()
    {
        int numberOfUniques = 0;
        if (intArray.length == 0) { return 0; }
        else 
        {
            
            boolean checkCount = true;
            for (int i = 0; i < intArray.length; i++)
            {
                for (int j = i + 1; j < intArray.length; j++)
                {
                    if (intArray[j] == intArray[i])
                    {
                        checkCount = false;
                    } // end if 
                    
                } // end inner loop
                if (checkCount == true)
                {
                    numberOfUniques++;
                } // end if
                checkCount = true;
            } // end outer loop
        } // end if 
        return numberOfUniques;

    }
}