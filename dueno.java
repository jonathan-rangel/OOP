
/**
 * Write a description of class dueno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dueno
{
    private int edad;
    private Genero genero;
    private Milaneso perro;
    private String nombre;
    /**
     * Constructor for objects of class dueno
     */
    public dueno(int edad, Genero genero)
    {
       this.edad=edad;
       this.genero=genero;
        
    }
    
    public dueno(int edad, Genero genero, String nombre)
    {
       this.edad=edad;
       this.genero=genero;
       this.nombre=nombre;
        
    }
    
    public void CumpleAnos()
    {
        edad++;
    }
    
    public void setdueno(Milaneso perro)
    {
        this.perro=perro;
		perro.setNombre("Snoopy");
		perro.setdueno(nombre);
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setNombre(String nombre, String apellido)
    {
        this.nombre=nombre+" "+apellido;
    }
	
	public String getNombre()
	{
		return nombre;
	}
}
