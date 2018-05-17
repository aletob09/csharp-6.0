public class ADC extends Champion{
    double damage;
    double speed;

    public ADC(String Name, int HP, int Rate, int DMG, double SPD){
        name = Name;
        growthRate = Rate;
        damage = DMG;
        speed = SPD;
    }

    private double calcDMGGrowth(){
        double tmp = damage + ((double)damage / (100 / growthRate));
        
        return tmp;
    }

    private double calcSPDGrowth(){
        double tmp = speed + (speed / ((double)100 / growthRate));

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
                damage = calcDMGGrowth();
                speed = calcSPDGrowth();
                health = calcHPGrowth();
            }
        }
    }

    public double calcDPS(){
        double DPS = damage * speed;

        return DPS;
    }
}




if (isInteger(parts[i])){
    if (num1 == 0){
        num1 = Integer.parseInt(parts[i]);
    }
    else{
        num2 = Integer.parseInt(parts[i]);
        num1 = num1 + num2;
    }
}
