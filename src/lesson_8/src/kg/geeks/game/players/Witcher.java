package kg.geeks.game.players;

public class Witcher extends Hero{


    public Witcher(int health, int damage, SuperAbility REHEAL, String name) {
        super(health, damage, REHEAL, name);
    }

    @Override
    public void applySuperPower(Boss boss,Hero[] heroes){
        for (Hero hero : heroes) {
            if (hero.getHealth() <= 0 && this != hero) {
                hero.setHealth(hero.getHealth() + this.getHealth());
                this.setHealth(0);
            }
            System.out.println("the witcher gave his life to the hero");

        }
    }





}


