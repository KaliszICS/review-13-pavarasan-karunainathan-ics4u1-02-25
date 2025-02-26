import java.util.*;

public class PracticeProblem{
	static void swap(ArrayList<String> arrL, int index1, int index2){
		String temp = arrL.get(index1);
		arrL.set(index1, arrL.get(index2));
		arrL.set(index2, temp);
	}

	static ArrayList<Double> createArrayList(double[] arr){
		ArrayList<Double> a = new ArrayList<Double>();
		for(int i = 0; i < arr.length; ++i){
			a.add((Double)arr[i]);
		}
		return a;
	}

	static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages){
		HashMap<String, Integer> nameToAge = new HashMap<String, Integer>();
		for(int i = 0; i < names.length; ++i){
			nameToAge.put(names[i], ages[i]);
		}
		return nameToAge;
	}
	
	static void increaseAge(HashMap<String, Integer> nameToAge, String name){
		nameToAge.put(name, nameToAge.get(name)+1);
	}

	public static void main(String args[]){}
}
