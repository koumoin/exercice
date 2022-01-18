import java.util.Scanner;

public class MonApplication5{

	public static void main (String arg[]) {
	System.out.println ("demo boucle while");
	
	String prenom;
	char reponse = 'O';
	Scanner sc = new Scanner(System.in);
	//Tant que la reponse donnée est égale a oui
	while (reponse == 'O')
	{
	//On affiche une instruction
	System.out.println ("Donnez un prenom");
	//On recupere le prenom saisi
	prenom = sc.nextLine();
	//On affiche notre phrase avec le prenom
	System.out.println ("Bonjour " +prenom+ ", comment vas-tu ?");
	//On demande si la personne veut faire un autre essai
	System.out.println ("Voulez-vous reessayer ? (O/N)");
	//On recupere la reponse de l'utilisateur
	reponse = sc.nextLine().charAt(0);
	}
		System.out.println ("Au revoir");
}
}