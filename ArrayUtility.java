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
        return 0;
    }
}