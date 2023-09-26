package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
    //size is not fixed.
    //array is faster than arraylist due to the resizing property of arraylist
    //the default capacity of arraylist is by default 10 , but varies according to the java version.
    //when the arraylis is full, it resizes by 1.5 or 2 depending on the documentation.
    //when an element is removed from arraylist, the capacity of the arraylist doesnot change, to make the capacity same as arraylist size, we can use trim to size option of arraylist.
    //Arraylist doesnot provide typesafety, to include typesafety we can use generics.

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        nums.add(0, 4);
        nums.remove(Integer.valueOf(4));


        ArrayList<String> names = new ArrayList<>(Arrays.asList("John","Jane","Doe"));

        System.out.println(nums);
        System.out.println(names);

        System.out.println(nums.get(2));
        System.out.println("-----------");
        for(int num : nums){
            System.out.println(num);
        }
        System.out.println("-----------");
        Iterator<Integer> itr = nums.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----------");
        System.out.println(nums.indexOf(2));

        
    }

    
}
