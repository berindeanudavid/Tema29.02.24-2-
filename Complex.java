
public class Complex{
	private static int nrAfisari=0;
	double re, img;
	public Complex(double re, double img) {
		this.re = re;
		this.img = img;
	}
	public double modulComplex()
	{
		return Math.sqrt(re*re+img*img);
	}
	public String toString()
	{
		return re+" + i * "+img;
	}
	public void afisareComplex()
	{
		System.out.println(this);
		nrAfisari++;
	}
	public Complex suma(Complex c)
	{
		return new Complex(re+c.getRe(),img+c.getImg());
	}
	public double getRe() {
		return re;
	}
	public double getImg() {
		return img;
	}
	public static void numarAfisari()
	{
		System.out.println(Complex.nrAfisari);
	}
}
