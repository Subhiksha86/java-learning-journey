class Computer 
{
    public void playmusic ()
    {
        System.out.println("Music playinggggg.............");
    }

    public String getapen(int cost)
    {
        if (cost >=20)
            return ("Pen........");
         
        return ("Nothinggg");
    }
}

public class Demo
{
    public static void main(String[] args)
    {

        Computer obj = new Computer ();
        obj.playmusic();
        String result = obj.getapen(545);

        System.out.println(result);

    }

    
}
