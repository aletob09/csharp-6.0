public class Champion {
    String name;
    int health;
    int growthRate;
    int Level = 1;

    protected void levelUp(int addLVL){
        return; 
    }

    protected int calcHPGrowth(){
        int tmp = health + (health / (100 / growthRate));

        return tmp;
    }
}