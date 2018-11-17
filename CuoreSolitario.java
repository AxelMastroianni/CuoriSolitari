import it.unibs.fp.mylib.InputDati;

public class CuoreSolitario {
	
	public static enum Segno {ARIETE, TORO, GEMELLI, CANCRO, LEONE, VERGINE, BILANCIA, SCORPIONE, SAGITTARIO, CAPRICORNO, ACQUARIO, PESCI};
	
	private char sesso=' ';
	private int eta=0;
	private String pseudonimo="";
	private Segno mioSegno;
	private Segno segnoCheCerco;
	public static final int SOGLIA=8;
	public static final char[] sessi=new char[]{'m','f','M','F'};
	public CuoreSolitario(char sesso, int eta, String pseudonimo, Segno mioSegno, Segno segnoCheCerco)
	{
		this.sesso=sesso;
		this.eta=eta;
		this.pseudonimo=pseudonimo;
		this.mioSegno=mioSegno;
		this.segnoCheCerco=segnoCheCerco;
	}
	public Segno getMioSegno() {
		return mioSegno;
	}
	public void setMioSegno(Segno mioSegno) {
		this.mioSegno = mioSegno;
	}
	public Segno getSegnoCheCerco() {
		return segnoCheCerco;
	}
	public void setSegnoCheCerco(Segno segnoCheCerco) {
		this.segnoCheCerco = segnoCheCerco;
	}
	public char getSesso() {
		return sesso;
	}
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getPseudonimo() {
		return pseudonimo;
	}
	public void setPseudonimo(String pseudonimo) {
		this.pseudonimo = pseudonimo;
	}
	
	public boolean controllaSesso()
	{
			for(int i=0;i<sessi.length;i++)
			{
				if(sesso==sessi[i])
					return true;
			}
		return false;
	}
	

	//affinità
	public boolean affinita(CuoreSolitario cuore)
	{
		if(Math.abs(eta-cuore.eta)<SOGLIA)
			if(this.sesso!=cuore.getSesso())
				if(this.segnoCheCerco.equals(cuore.mioSegno))
					return true;
		return false;
	}

}
