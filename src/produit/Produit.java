package produit;

public abstract class Produit {
	private String nom;
	protected String unite;
	
	public Produit(String nom,String unite) {
		this.nom=nom;
		this.unite=unite;
	}
	
	public String getNom() {
		return this.nom;
	}

	public abstract String decrireProduit();
}
