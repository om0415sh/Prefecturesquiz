package prefecturesquiz;

import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Map<String,String> map = PrefecturesMap.prefectures_map();
		
		System.out.println("県庁所在地クイズ");
		
		
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		
		
		
		//System.out.println(map.get("北海道"));

		

	}

}
