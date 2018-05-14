public class Tank extends Champion{
    public double armor;
    public double resistance;    

    public Tank(String Name, int HP, int Rate, int Armor, int Res){
        armor = Armor;
        resistance = Res;
        name = Name;
        growthRate = Rate;
        health = HP;
    }

    private double calcArmorGrowth(){
        double tmp = armor + ((double)armor / (100 / growthRate));
        
        return tmp;
    }

    private double calcRESGrowth(){
        double tmp = resistance + (resistance / ((double)100 / growthRate));

        return tmp;
    }

    public void levelUp(int addLVL){
        if((addLVL + Level)> 18)
        {
            return;
        }
        else{
            Level += addLVL;
            for(int i = 0; i < addLVL ; i++){
                armor = calcArmorGrowth();
                resistance = calcRESGrowth();
                health = calcHPGrowth();
            }
        }
    }
}