package Ex15;

public class child extends LunchMenu {

    public child(int rice, int bulgogi,int banan, int milk, int almond){
        super(rice,bulgogi,banan,milk,almond);
    }

    @Override
    public int calculating() {
        return rice + bulgogi + banana;
    }
}
