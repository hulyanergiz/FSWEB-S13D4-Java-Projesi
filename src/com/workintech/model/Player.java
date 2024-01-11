package com.workintech.model;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    private int editHealthPercentage(int healthPercent){
        if(healthPercent>100){
            return 100;
        }else if(healthPercent<0){
            return 0;
        }
        return healthPercent;
    }
    public Player(String name, int healthPercentage,Weapon weapon){
        this.name=name;
        this.healthPercentage=editHealthPercentage(healthPercentage);
        this.weapon=weapon;
    }
    public int healthRemaining(){
        return healthPercentage;
    }
    public void loseHealth(int damage){
        if(editHealthPercentage(healthPercentage)-damage<=0){
            System.out.println(name+" player has been knocked out of game");
        }
        healthPercentage=editHealthPercentage(healthPercentage-damage);
    }
    public void restoreHealth(int healthPotion){
        if(healthPercentage+healthPotion>100){
            healthPercentage=100;
        }
        healthPercentage=editHealthPercentage(healthPercentage+healthPotion);

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
