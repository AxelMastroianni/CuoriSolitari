import it.unibs.fp.mylib.*;
import java.util.*;
public class ProvaCuoreSolitario {
	public static CuoreSolitario inserisciUtente()
	{
		char sesso= InputDati.leggiChar("Inserisci il sesso: ");
		int eta=InputDati.leggiIntero("Inserisci la tua età: ", 18,99);
		String pseudonimo=InputDati.leggiStringaNonVuota("Inserisci lo pseudonimo: ");
		String mioSegno=InputDati.leggiStringaNonVuota("Inserisci il tuo segno zodiacale: ");
		CuoreSolitario.Segno segno = CuoreSolitario.Segno.valueOf(mioSegno);
		String segnoCheCerco=InputDati.leggiStringaNonVuota("Inserisci il segno zodiacale che cerchi: ");
		CuoreSolitario.Segno segno2=CuoreSolitario.Segno.valueOf(segnoCheCerco);
		return new CuoreSolitario(sesso,eta,pseudonimo, segno, segno2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CuoreSolitario> cuori=new ArrayList<CuoreSolitario>();//lista di utenti
		Scanner tastiera=new Scanner(System.in);
		String fine="";
		int i=0;
		while(!fine.equals("no")) //inserisci gli utenti del sito
		{
			cuori.add(inserisciUtente());
			System.out.println("Continui a inserire? ");
			fine=tastiera.next();
			i++;
		}
		for(i=0;i<cuori.size();i++) //valuta le affinità degli utenti(anche di un utente con sé stesso)
		{
			for(int j=0;j<cuori.size();j++)
			{
				if(cuori.get(i).affinita(cuori.get(j)) && cuori.get(j).affinita(cuori.get(i)))
					System.out.println("Trovata affinià "+cuori.get(i).getPseudonimo()+" con "+cuori.get(j).getPseudonimo());
				else
					System.out.println("Niente affinità");
			}
		}
	}

}
