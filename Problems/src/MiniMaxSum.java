import java.util.List;

/*
 * Given five positive integers, find the minimum and maximum values that can be calculated 
 * by summing exactly four of the five integers. 
 * Then print the respective minimum and maximum values as a single line of 
 * two space-separated long integers.
 */

class MiniMaxSum {
	public static void miniMaxSum(List<Integer> arr) {
		long smallest = 0, largest = 0;
		sort(arr);
		for(int i = 0; i < arr.size() - 1; i++){
			smallest += arr.get(i);
			largest += arr.get(i+1);
		}
		System.out.println(smallest + " "+ largest);
	}

	public static void sort(List<Integer> a){
		for(int j = 1; j < a.size(); j++){
			int key = a.get(j);
			int i = j - 1;
			while((i > -1) && ((a.get(i) > key))){
				a.set(i+1, a.get(i));
				i--;
			}
			a.set(i+1, key);
		}
	}
}
