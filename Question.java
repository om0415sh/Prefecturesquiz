package prefecturesquiz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Question {
	static Map<String,String> map = PrefecturesMap.prefectures_map();
	public static void question() {
	a: for (int i = 0; i < 1; i++) {
			try {
				System.out.println("====================");
				System.out.println("数字を入力してね");
				System.out.println("1:問題");
				System.out.println("2:終了");
				Scanner sc = new Scanner(System.in);
				int action = sc.nextInt();
				if (action==1) {
					List<String> list = new ArrayList<String>(map.keySet());
					int index = new Random().nextInt(list.size());
					String result = list.get(index);
					
					System.out.println(result+"の県庁所在地は？＞＞＞");
					Scanner scanner = new Scanner(System.in);
					String answer = scanner.next();
					
					if (answer.equals(map.get(result))) {
						System.out.println("正解です");
					}else {
						System.out.println("残念、不正解です。正解は"+map.get(result));
					}
					i--;
				}else if(action==2) {
					System.out.print("終了します");
					break;
				}else {
					System.out.println("1か2を選択してください");
					i--;
					continue a;
				}
			}catch(InputMismatchException e) {
				i--;
			}
		}
	}
}
