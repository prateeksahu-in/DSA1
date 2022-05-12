import java.util.ArrayList;
import java.util.Collections;

class ArrayListCollection {
    public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add elemnt at en
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        
        //get from index
        int element = list.get(0);
        System.out.println(element);
        
        //add at specific index
        list.add(1,1);
        System.out.println(list);
        
        //update element
        list.set(0,5);
        System.out.println(list);
        
        //remove element
        list.remove(2);
        System.out.println(list);
        //size
        int size = list.size();
        System.out.println(size);
        
        //Traversal
        for(int i = 0; i<size; i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.print("\n");

        //sorting
        Collections.sort(list);
        System.out.print(list);

    }
}