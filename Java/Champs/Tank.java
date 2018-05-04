public class Tank extends Champion{
    public int armor;
    public int resistance;    

    public Tank(String Name, int Rate, int Armor, int Res){
        armor = Armor;
        resistance = Res;
        name = Name;
        growthRate = Rate;
    }

    public int[] calcGrowth(){
        int[] stats = new int[2];
        stats[0] = armor + (armor / (100 / growthRate));
        stats[1] = resistance + (resistance / (100 / resistance));;
        
        return stats;
    }

}