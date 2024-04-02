package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {

	protected String nom;
	protected String prenom;
	protected int age;
	public List<Humain> amis;
	
	
	public Humain()
	{
		this.amis= new ArrayList<>();
	}
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
	public void ami(Humain autre)
	{
		this.amis.add(autre);
		autre.amis.add(this);
		
		System.out.println(this.prenom+" et "+autre.prenom+" sont amis");
	}
}
