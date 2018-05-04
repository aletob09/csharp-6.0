public class Tank extends Champion{
    public double armor;
    public double resistance;    

    public Tank(String Name, int Rate, int Armor, int Res){
        armor = Armor;
        resistance = Res;
        name = Name;
        growthRate = Rate;
    }

    public double calcArmorGrowth(){
        double tmp = armor + ((double)armor / (100 / growthRate));
        
        return tmp;
    }

    public double calcRESGrowth(){
        double tmp = resistance + (resistance / ((double)100 / growthRate));

        return tmp;
    }

}