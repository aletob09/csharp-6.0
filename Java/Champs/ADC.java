public class ADC extends Champion{
    double damage;
    double speed;

    public ADC(String Name, int Rate, int DMG, int SPD){
        name = Name;
        growthRate = Rate;
        damage = DMG;
        speed = SPD;
    }

    public double calcDMGGrowth(){
        double tmp = damage + ((double)damage / (100 / growthRate));
        
        return tmp;
    }

    public double calcSPDGrowth(){
        double tmp = speed + (speed / ((double)100 / growthRate));

        return tmp;
    }
}