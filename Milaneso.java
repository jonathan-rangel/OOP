
/**
 * Write a description of class Milaneso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Milaneso
{
    private int edad;
    private Raza raza;
    private String nombre;
    private String nombredueno;
    /**
     * Constructor for objects of class Milaneso
     */
    public Milaneso(int edad, Raza raza)
    {
        this.edad=edad;
        this.raza=raza;
        
    }

    public void CumpleAnos()
    {
        edad++;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setdueno(String dueno)
    {
        nombredueno=dueno;
    }
}
