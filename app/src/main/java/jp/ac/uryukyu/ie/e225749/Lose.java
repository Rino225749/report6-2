package jp.ac.uryukyu.ie.e225749;

public class Lose implements Action{
    @Override
    public String name() {
        return "諦める"; //このアクションの名称（ユーザーに提示される）
    }
 
    @Override
    /**
     * 実際に実行されるアクションの処理
     * @param executer アクションを実行するキャラクター
     * @param target アクションの実行対象（攻撃対象)が入っている
     */

    //プレイヤーのコマンド『諦める』の挙動
    public void execute(Character executer, Character target) {
        target.recover(executer.getAttack());
        System.out.println(executer.getName() + "は魚を逃した。");
        System.out.println("ゲームオーバー");
        System.exit(0);
     }
}