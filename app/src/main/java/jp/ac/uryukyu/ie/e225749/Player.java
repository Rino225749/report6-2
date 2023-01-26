package jp.ac.uryukyu.ie.e225749;
import java.util.ArrayList;

public class Player extends Character {
    Player(String name, int hp, int stamina, int str, int guard) {
        super(name, hp, stamina, str, guard);
    }

    @Override
    void act(ArrayList<Character> targets) {
        var command_selector = new Command();
        //ゲームクリアの条件と挙動
        if(hp<=0){
            hp = 0;
            System.out.println("魚を捕まえました！");
            System.out.println("ゲームクリア");
            System.exit(0);
        }
        //ゲームオーバーの条件『距離が離れすぎ』を満たしたときの挙動
        if(hp>=500 || stamina<=0){
            System.out.println(name + "は魚を逃した。");
            System.out.println("ゲームオーバー");
            System.exit(0);
        }
 
       //選択肢を用意する
        for(var action: actions) {
            command_selector.addCommand(action.name());
        }
       //ユーザの選択を待つ
       //食いつき度が0の時強制的に『諦める』を選択
       if(stamina>0){
        var command_number = command_selector.waitForUsersCommand("コマンド？");
        actions.get(command_number).execute(this, targets.get(0));
       }/*else{
        actions.get(2).execute(this, targets.get(0));
       }*/
       /*if(stamina >= 100){
        stamina = 100;
        }*/

    }
 
}