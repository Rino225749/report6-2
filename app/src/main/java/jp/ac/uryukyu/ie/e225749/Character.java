package jp.ac.uryukyu.ie.e225749;
import java.util.ArrayList;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int stamina;
    protected int str;
    protected int guard;
    String getName(){return name;}
    int getHp(){return hp;}
    int getSt(){return stamina;}
    int getAttack(){return str;}
    int getGuard(){return guard;}
    ArrayList<Action> actions = new ArrayList<>();
 
    Character(String name, int hp, int stamina, int str, int guard) {
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.str = str;
        this.guard = guard;
    }
    //コマンドを追加する関数
    void addAction(Action action) {
        actions.add(action);
    }
    //ステータスをプロンプトに出力する
    void showStatus() {
        if(stamina<=0){
            stamina=0;//スタミナが０未満にならないように
        }
        System.out.printf("%s:距離 %d  食いつき度 %d\n", name, hp, stamina);
    }
    //プレイヤーが魚を引っ張る関数
    void pull(int damage) {
        hp -= damage;
     }
    //行動時のスタミナ消費の関数
    void comsumeSt(int comsumemp) {
       stamina -= comsumemp;
    }
    //プレイヤーが糸を緩めたときの関数
    void recover(int recoverd){
       stamina += recoverd;
       if(stamina >= 100){
        stamina = 100;
        }
    }
    //魚が逃げようとして泳ぐ
    void kyoriRecover(int kyorirecover){
       hp += kyorirecover;
    }
    //魚が逃げようとして暴れる
    void Rampage(int rampage){
        stamina -=rampage;
    }
    //魚が暴れたときに食いつき度が減るか判定
    void Guard(int isguard){
        guard = isguard;
    }
    //影響を与える可能性のあるオブジェクトの参照を引数として受け取る
    abstract void act(ArrayList<Character> targets); //サブクラスでターゲットを定義する
}
