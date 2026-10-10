package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double feeding(){
        return (beer * 5) + (barbecue * 7) + (softDrink * 3);
    }

    public double ticket(){
        if (gender == 'M'){
            return 10;
        } else if (gender == 'F'){
            return 8;
        } else {
            return 0;
        }
    }

    public double cover(){
        if(feeding() > 30){
            return 0;
        } else {
            return 4;
        }
    }

    public double total(){
        return feeding() + cover() + ticket();
    }


}
