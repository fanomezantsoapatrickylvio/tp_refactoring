package iut.bad;

public class Femme extends Humain{
	
	
	public Femme (String nom, String prenom, int age)
	{
		super();
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
public Femme() {};

public static void main(String[] args) {
	Homme Sylvio = new Homme("Hayler","Sylvio",10);
	Femme Nina = new Femme("Nina","Dobrev",12);
	Sylvio.ami(Nina, 130);
}

}
