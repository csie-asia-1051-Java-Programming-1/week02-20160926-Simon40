package hw;
/*
 * 已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；
 * 試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)。
 * Date: 2016/09/26
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class hw02_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入1或2:");
		int m=scn.nextInt();
		System.out.println("請輸入身高:");
		int h=scn.nextInt();
		if(m==1){
			float w=(h-80)*0.7f;
			System.out.println("男生的標準體重:"+w);
		}else{
			float w=(h-70)*0.6f;
			System.out.println("女生的標準體重:"+w);
		}
	}

}
