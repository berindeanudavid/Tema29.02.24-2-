
public class ClientComplex {

	public static void main(String[] args) {
		Complex c=new Complex(3,7);
		System.out.println(c);//nu trebuie precizat toString() pentru ca obiectul are reprezentare toString() pregatita
		c.afisareComplex();
		Complex c2=new Complex(2,5.4);
		c.numarAfisari();//nu va merge decat la metoda "afisare complex"
		
	}

}
