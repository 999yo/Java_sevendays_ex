package exday3;
 //抽象クラスは抽象メソッドを持つ。動作はサブクラスで行われる
//  抽象クラス（鳥）
public abstract class Bird {
    //  名前フィールド
    private String name;
    //  引数つきコンストラクタ
    Bird(String name){
        this.name = name;
    }
    //  名前の取得
    public String getName(){ return name; }
    //  鳴く（抽象メソッド）
    abstract void sing();
}