package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class ex01_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入使用時間:");
        float p=0.5f;
        float n=scn.nextFloat();
        if(n<=600){
        	float a=n*p;
        	System.out.println(a+"元");
        }else{
        	if(n<=1200){
        		float b=n*p*0.9f;
        		System.out.println(b+"元");
        	}else{
        		if(n>1200){
        			float c=n*p*0.79f;
        			System.out.println(c+"元");
        		}
        	}
        }
	}

}
