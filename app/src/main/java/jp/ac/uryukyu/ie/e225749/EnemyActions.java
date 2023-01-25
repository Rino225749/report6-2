package jp.ac.uryukyu.ie.e225749;

class EnemyActions implements Action {
    private String name;
    private int str; //攻撃力
    private int stamina; //消費stamina
 
    EnemyActions(String name, int str, int stamina) {
        this.name = name;
        this.str = str;
        this.stamina = stamina;
    }
 
    @Override
    public String name() {
        return name;
    }
 
    @Override
    //距離を開く系統の魚のコマンドの挙動
    public void execute(Character executer, Character target) {
        System.out.println(executer.getName() + "は" + name);
        target.kyoriRecover(str); 
        executer.comsumeSt(stamina);
        System.out.println(str+"メートル離れた!!");
        target.Guard(0);
    }
 }