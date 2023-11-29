package produit;

public class Poisson extends Produit {
	private String datePeche;
	
	public Poisson(String unite,String datePeche) {
		super("poisson",unite);
		this.datePeche=datePeche;
	}
	
	public String decrireProduit() {
		StringBuilder description = new StringBuilder(getNom()+" p�ch�s "+ datePeche);
		return description.toString();
	}
}
