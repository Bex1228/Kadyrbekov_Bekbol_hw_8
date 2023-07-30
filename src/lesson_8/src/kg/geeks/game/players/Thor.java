package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean stan = RPG_Game.random.nextBoolean();
       /// for (int i = 0; i < heroes.length; i++)
        //}
        for (Hero hero: heroes) {

             if (hero.getHealth()>0 &&stan==true){
                boss.setDamage(0);
                System.out.println("boss stan");
            }
            else  {
                boss.setDamage(50);
            }
        }
    }
}
