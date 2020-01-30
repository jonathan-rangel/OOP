import java.io.*; 

public class Main
{
	public static void main(String []args) throws IOException
	{
		File file=new File("lista.csv");
		
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String line; 
		while ((line = br.readLine()) != null) 
			System.out.println(line); 
	}
	
	public static void main1(String []args)
	{
		dueno Ivan=new dueno(37,Genero.MASCULINO,"Ivan");
		dueno Alan=new dueno(24,Genero.MASCULINO,"Alan");
		dueno Paty=new dueno(28,Genero.FEMENINO,"Paty");
		dueno Mirna=new dueno(38,Genero.FEMENINO);
			
		Milaneso Max=new Milaneso(1,Raza.BULL_DOG);
		Milaneso Firulais=new Milaneso(0,Raza.CHIHUAHUA);

		Ivan.setdueno(Max);
		Mirna.setdueno(Firulais);
		
		System.out.println(Ivan.getNombre());
		System.out.println(Max.getNombre());
		
	}
}