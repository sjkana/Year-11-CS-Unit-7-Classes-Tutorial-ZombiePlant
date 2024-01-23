public class ZombiePlant {
    public static void main(String[] args) {

    }
    private int treatments;
    private int potency;

    public ZombiePlant(int pot, int treat)
    {
        potency = pot;
        treatments = treat;
    }

    public int getPotency()
    {
        return potency;
    }
    public int treatmentsNeeded()
    {
        return treatments;
    }
    public boolean isDangerous()
    {
        return treatments>0;
    }
    public void treat(int tr)
    {
        if(tr > 0)
        {
            if (tr <= potency && treatments > 0)
            {
                treatments--;
            }
            else if( tr > potency)
            {
                treatments ++;
            }
        }
    }


}


