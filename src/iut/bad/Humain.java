package iut.bad;

public class Humain implements Consommation {

	protected String nom;
	protected String prenom;
	protected int age; 
	
	public void details()
	{
		System.out.println(toString());
	}
	
	@Override
	public String toString()
	{
		return "Nom : "+nom+" Prenom : "+prenom+" Age :"+age;
	}

	@Override
	public void manger()
	{
		System.out.println("Je mange");
    }
	@Override
	public void boire()
	{
		System.out.println("Je bois");
	}
}
