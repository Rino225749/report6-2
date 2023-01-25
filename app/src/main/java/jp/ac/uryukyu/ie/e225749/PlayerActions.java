package jp.ac.uryukyu.ie.e225749;

class PlayerActions implements Action {
    private String name;
    private int str; //攻撃力
    private int bite; //消費MP
 
    PlayerActions(String name, int str, int bite) {
        this.name = name;
        this.str = str;
        this.bite = bite;
    }
 
    @Override
    public String name() {
        return name;
    }
 
    @Override
    //プレイヤーの竿を引く系のコマンドの挙動
    public void execute(Character executer, Character target) {
        System.out.println(executer.getName() + "は魚を" + name);
        target.pull(str); 
        executer.comsumeSt(bite);
        System.out.println(str + "メートル近づいた!!");
        System.out.println(bite + "食いつきが緩んだ");
    }
 }
