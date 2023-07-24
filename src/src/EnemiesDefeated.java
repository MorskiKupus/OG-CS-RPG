public class EnemiesDefeated {
   private int enemiesDefeated;


    public EnemiesDefeated(int enemiesDefeated) {
        this.enemiesDefeated = enemiesDefeated;
    }

    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    public void numberOfDefeatedEnemies(){
       enemiesDefeated++;
   }

   public void enemyFound(){
       System.out.println("You have found an enemy");

   }
}
