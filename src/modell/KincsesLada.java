package modell;

public class KincsesLada {
    private String szin;
    private String felirat;
    private boolean kincs;
    public final static String ARANY = "arany";
    public final static String EZUST = "ezüst";
    public final static String BRONZ = "bronz";

    public KincsesLada(String szin, String felirat, boolean kincs) {
        this(szin, felirat);
        this.kincs = kincs;
    }

    public KincsesLada(String szin, String felirat) {
        this.szin = szin;
        this.felirat = felirat;
        this.kincs = false;
    }
    
    public String getSzin(){
        return szin;
    }
    public String getFelirat(){
        return felirat;
    }
    public boolean getKincs(){
        return kincs;
    }
}
