import java.util.ArrayList;
public class GitHubPractice1{
	public static void main(String[]args){

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i = 0; i < 10; i++){
			if(i%2 == 0)
				list1.add(i);
			else
				list2.add(i);
		}

		System.out.println(list1);
		System.out.println(list2);

		System.out.println();

		System.out.println(combine(list1, list2));

		System.out.println();

		System.out.println(toString(list1));


	}

	public static ArrayList<Integer> combine(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < list1.size(); i++){
			list.add(list1.get(i));
			list.add(list2.get(i));
		}
		return list;
	}

	public static String toString(ArrayList<Integer> list){
		String s = "";
		for(int i = 0; i < list.size(); i++){
			if(i == list.size()-1)
				s += list.get(i);
			else
				s += list.get(i) + ", ";
		}
		return s;
	}

}