public class MonApplication10 {


	public static void main (String arg[]) {
		System.out.println("démo wrapper");
		
		String maChaine = "10,34";
		
		float monFlottant = Float.parseFloat(maChaine) ; // Exemple type d'utilisation d'un Wrapper
	
		System.out.println("Valeur de mon flottant : " + monFlottant);
	}
}