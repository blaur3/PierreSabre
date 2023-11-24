package histoire;

public class Humain {
	private String nom;
	private String favBoisson;
	private int money;
	
	public Humain(String nom, int money, String boisson) {
		this.nom = nom;
		this.money = money;
		this.favBoisson = boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getMoney() {
		return money;
	}
	public void parler(String texte) {
		System.out.println(texte);
	}
	public String direBonjour() {
		return "Bonjour je m'apelle " + nom + " et j'aime boire du " + favBoisson;
	}
	
	public String boire(String drink) {
		return "Mmmm, un bon verre de " + drink + "! GLOUPS !";
	}
	
	public String acheter(String bien, int prix) {
		return nom + "achète " + bien + " à " + prix + "euros.";
	}
	
	public void gagnerArgent(int gain) {
		money += gain;
	}
	
	public void perdreArgent(int perte) {
		money -= perte;
	}
}
