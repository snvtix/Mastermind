package pl.edu.pw.elka.prm2t.project.mastermind;

public class Main extends Variables {

    public void hej(){
        setDlugoscHasla(5);
    }

    public static void main(String[] args) {
        Main hej = new Main();
        hej.hej();
        Mastermind mastermind = new Mastermind();
        //Settings settings = new Settings();
    }
}
