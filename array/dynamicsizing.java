
import java.util.*;


public class Test {
	
	ArrayList<String> merge(String[] words ,String[] more){
		ArrayList<String> sentence = new ArrayList<String>();
		
		for (String w : words)
			sentence.add(w);
		
		for (String w : more)
			sentence.add(w);
		
		
		return sentence;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] test1 = new String[] {"test1","test2"};
		String[] test2 = new String[] {"test4","test5"};

		
		ArrayList<String> res = (new Test()).merge(test1, test2);
		
		System.out.println(res);
		
		System.out.println("test");
	}
	
	
	
}
