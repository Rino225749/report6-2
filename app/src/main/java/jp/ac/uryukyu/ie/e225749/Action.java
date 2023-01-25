package jp.ac.uryukyu.ie.e225749;

public interface Action {
    String name();
    void execute(Character executer, Character target);
}