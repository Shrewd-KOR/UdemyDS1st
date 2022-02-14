package com.gmm.ds.sec4.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayMain {
    public static void main(String[] args) {

        //ArrayLists use standard arrays under the hood

        List<String> names = new ArrayList<>();

        names.add("Kevin");
        names.add("Daniel");
        names.add("Adam");
        names.add("Ana");

        // O(N)
        // names.remove(0);
        // System.out.println(names.get(0));
        System.out.println(names.size());

        for(String name : names)
            System.out.println(name);


        // arrays are noy dynamic data structures - we have to define the size in advance
        int[] nums = new int[10];

        // random indexing: we can use the indexes of the array slots
        // O(1)
        for(int i=0; i<10; i++)
            nums[i] = i;

        // we now the index of the item we want to manipulate
        //nums[0] = 10;

        // if we do not know the index of the item(search)
        // LINEAR SEARCH O(N) - if we do not know the index of the item we are looking for
        // we want to find the index of item 6

        for(int i=0; i<10; i++)
            if(nums[i]==6)
                System.out.println("We have found the item at index : "+i);

    }
}

/*

 1) adding items: we can insert new items at the end of the data structure until the data structure is not full: O(1) running time.

    when the data structure becomes full?
    - have to copy the existing items, one by one to the new array
    - the resize operation take O(N) linear running time complexity

 2) adding numbers to arbitrary positions: O(N) linear running time algorithm because the items must be shifted

 3) removing last item: O(1)

 4) removing item from arbitrary position: First, we have to find the item in O(N) running time, remove the item in O(1), have to shift the other items in O(N)

 Array - Advantages
 - random access
 - easy data structure
 - fast data structure
 - when you want to manipulate the last items or with known indexes

 Array - Disadvantages
 - we have to know the number of items we want to store at compile-time. It is not a dynamic data structure
 - whenver the data structure is full, we have to resize it in O(N) linear running time
 - we can not store items with different types in an array

 */