package iut.bad;

public class Humain {

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

}
