package hw;
/*
 *試撰寫一個程式，可由鍵盤讀入一個 4 位數的整數，代表西洋的年份，
 *然後判別這個年份是否為閏年（每四年一閏，每百年不閏，每四百年一閏，
 *例如西元 1900 雖為 4 的倍數，但可被 100 整除，所以不是閏年，
 *同理， 2000 年是閏年，因可被 400 整數，而 2004 當然也是閏年，因可以被 4 整除）。
 * Date: 2016/09/26
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class hw03_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入4位數年分");
		int y=scn.nextInt();
		if(y%4==0&&y%400==0){
			System.out.println("是閏年");
		}else{
			if(y%100==0){
				System.out.println("不是閏年");
			}
		}
	}

}
