package jp.ac.uryukyu.ie.e225749;

public class EnemyRampage implements Action{
    private String name;
    private int str; //攻撃力
    private int stamina; //消費stamina
 
    EnemyRampage(String name, int str, int stamina) {
        this.name = name;
        this.str = str;
        this.stamina = stamina;
    }
 
    @Override
    public String name() {
        return name;
    }
 
    @Override
    //魚が暴れたときの挙動
    public void execute(Character executer, Character target) {
        if(target.getGuard()==0){
            System.out.println(executer.getName() + "は" + name);
            target.Rampage(str); 
            executer.comsumeSt(stamina);
            System.out.println(str+"食いつきが緩んだ！");
        }else{
            System.out.println(executer.getName() + "は" + name);
            System.out.println("しかし何も起こらなかった");
        }
        target.Guard(0);
    }
}
