public class Hero {
    private   int HeroesHealth = 300;
    private   String HeroesSuperAbility;
    private int HeroesDamage = 50;


    public void getHeroes(int health , String superAbility, int damage){
        System.out.println(this);
        this.HeroesHealth = health;
        this.HeroesSuperAbility  = superAbility;
        this. HeroesDamage = damage;
    }

    public void getHeroes2(int health , int damage ){
        this.HeroesHealth = health;
        this.HeroesDamage = damage;

    }


    public int getDamage() {
        return HeroesDamage;
    }

    public String getSuperAbility() {
        return HeroesSuperAbility;
    }

    public int getHealth() {
        return HeroesHealth;
    }

}
