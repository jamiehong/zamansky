import java.util.*;

public class quicksort{

    public int[] sort(int[]a){
	if (a.length < = 1){
	    return a;
	}else{
	    ArrayList<int> lower = new ArrayList<int>();
	    ArrayList<int> upper = new ArrayList<int>();
	    int count = 0;
	    //count counts the number of times the pivot number is in the list
	    for(int i = 0; i < a.length; i++){
		if (a[i] < a[a.length/2]){
		    lower.add(a[i]);
		}if (a[i] > a[a.length/2]){
		    upper.add(a[i]);
		}else{
		    counter ++;
		}
	    }
	    ArrayList<int> pivot = new ArrayList<int>();
	    for(int x = 0; x < count; x++){
		pivot.add(a[a.length/2]);
	    }
	    int[]alower = new int[lower.size];
	    alower = lower.toArray(alower);
	    int[]aupper = new int[upper.size];
	    aupper = upper.toArray(aupper);
	    int[]apivot = new int[pivot.size];
	    apivot = pivot.toArray(apivot);
	    return sort(alower) + apivot + sort(alower);
	}
    }
}