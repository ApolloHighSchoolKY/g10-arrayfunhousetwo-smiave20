// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouseTwo
{
	//goingUp() will return true if all numbers
	//in numArray are in increasing order
	//[1,2,6,9,23] returns true
	//[9, 11, 13, 8]  returns false
	public static boolean goingUp(int[] numArray)
	{
		//Iterate from the first element to the last element.

		for(int i = 0; i < numArray.length - 1; i++)

		//Compare the current element, (numArray[i]), with the next element, (numArray[i+1]).
		//If the current element is greater than or equal to the next, the order is not increasing, so return false.

			if (numArray[i] >= numArray[i+1])
				return false;

		return true;
	}

	//goingDown() will return true if all numbers
	//in numArray are in decreasing order
	//[31,12,6,2,1] returns true
	//[31, 20, 10, 15, 9] returns false
	public static boolean goingDown(int[] numArray)
	{
		//Iterate from the first element to the last element.

		for(int i = 0; i < numArray.length - 1; i++)

		//Compare the current element, (numArray[i]), with the next element, (numArray[i+1]).
		//If the current element is less than or equal to the next, the order is not decreasing, so return false.

			if (numArray[i] <= numArray[i+1])
				return false;
		return true;
	}

	//getValuesBiggerThanX will return an array that contains
	//count number of values that are larger than parameter x
	//[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
	//Give three vals that are greater then eight.
	public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x)
	{
		int[] newNums;
		newNums = new int[count];

		int placed = 0;

		for(int y: numArray)
			if(count > x)
				newNums[placed] = y;
			placed++;

		return null;
		//???????
	}
}