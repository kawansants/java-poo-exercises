package entities;

public class Champion {


    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor){

        this.name = name;
        this.attack = attack;
        this.life = life;
        this.armor = armor;

    }

    public void takeDamage(Champion other){
        int damage = other.attack - this.armor;

        if (damage < 1){
            damage = 1;
        }

        this.life -= damage;

        if (this.life < 0){
            this.life = 0;
        }

    }

    public String status(){
        if (this.life > 0){
            return this.name + " possui: " + this.life + " de vida!";

        } else {
            return this.name + " morreu!";

        }
    }

    public int getLife(){
        return this.life;
    }


}
