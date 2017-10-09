import java.util.*;

public class Mat {
    private int hamburgebread;


    public static void main(String[] args) {
        new Mat();
    }

    public Mat (){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hur många bröd ska säljas?");
        int myint = keyboard.nextInt();
        setBread((int)myint);

        System.out.println("Antal bröd: " + hamburgebread);
        System.out.println("Antal kött: " + meat(hamburgebread) + "st, " + meatBoxes(meat(hamburgebread)) + " lådor");
        System.out.println("Antal salladshuvuden: " + salad(hamburgebread) + "st");
        System.out.println("Tomater: " + tomatoe(hamburgebread) + "kg");
        System.out.println("Lök: " + onion(hamburgebread) + "kg");
        System.out.println("Ost: " + cheese(meat(hamburgebread)) +" paket");
        System.out.println("Förslag på Xtra Allt: " + xtraAllt());

        System.out.println("Glöm inte hamburgefickor, grillkrydda, gummihandskar, servetter och städskit");
        System.out.println("Glöm inte kol & briketter");

    }


    public void setBread(int hamburgebread) {
        this.hamburgebread = hamburgebread;
    }

    public int meat(int x) {
        return (int)(x*1.5);
    }

    public int meatBoxes (int x) {
        int boxes = 0;
        int temp = 0;

        if(x < 24) {
            return 1;
        } else if ((x%24) != 0) {
            temp = x / 24;
            boxes = temp + 1;
            return boxes;
        } else {
            return x/24;
        }

    }

    public int salad(int x) {
        double temp = (x*0.06);
        if((temp-(int)temp) < 0.5)
            return (int)temp;
        else
            return (int)temp + 1;
    }

    public float tomatoe(int x) {
        return (float)(x*0.03);
    }

    public float onion(int x) {
        return (float)(x*0.014);
    }

    public int cheese(int x) {
        int cheeses = 0;
        int temp = 0;

        if(x < 88) {
            return 1;
        } else if ((x%88) != 0) {
            temp = x / 88;
            cheeses = temp + 1;
            return cheeses;
        } else {
            return x / 88;
        }
    }

    public String xtraAllt() {
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((25 - 0) + 1) + 1;
        String allt="";

        switch(randomNum) {
            case 1 :
                allt=("Cheddarsås 4SHOO");
                break;
            case 2 :
                allt=("Pepperjack Cheese bruurr");
            case 3 :
                allt=("Biltemakörv");
                break;
            case 4 :
                allt=("vitlökssås");
            case 5 :
                allt=("Japalenoos ");
                break;
            case 6 :
                allt=("lingonsylt");
                break;
            case 7 :
                allt=("Marängsviss ");
            case 8 :
                allt=("coolare bacon än pubrundebacon");
                break;
            case 9 :
                allt=("Rödlök och mango");
            case 10 :
                allt=("Picklad rödlök");
                break;
            case 11 :
                allt=("bbq-sås");
                break;
            case 12 :
                allt=("Chevréost" );
                break;
            case 13 :
                allt=("sagge");
                break;
            case 14 :
                allt=("Paprika och räkost");
            case 15 :
                allt=("Nachochips");
                break;
            case 16 :
                allt=("Tallkotte");
            case 17 :
                allt=("Friscobröd");
                break;
            case 18 :
                allt=("Coleslaw");
            case 19 :
                allt=("Prostituerad Holger");
                break;
            case 20 :
                allt=("avslagen pripps");
                break;
            case 21 :
                allt=("DKVs skinn (på egen risk..)");
                break;
            case 22 :
                allt=("Ärtsoppa" );
                break;
            case 23 :
                allt=("Potatisbullar");
            case 24 :
                allt=("Vegansk burgare i stället för kött... mohahahaha");
                break;
            default :
                allt=("Invalid grapefrukt eller bara störd.....");
        }

        return allt;
    }

    public String kinderegg() {
        return "Reekan löser";
    }

    public int soda(int x) {
        return (int)(x*0.75);
    }

}
