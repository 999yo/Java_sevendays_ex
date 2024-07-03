package exday2;

public class SampleEx202 {

	public static void main(String[] args) {
		Car c = new Car();
		//toString オブジェクトの文字表現を返す。
		//get 指定した番号の要素を取り出す
		System.out.println(c.toString());
		System.out.println(c.getClass());
		Object o = (Object)c; //キャスト
		System.out.println(o.toString());
		System.out.println(o.getClass());
	}

}
