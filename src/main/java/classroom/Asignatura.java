package classroom;

public class Asignatura{

    public String nombre=null;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;
 
    public Asignatura(String nombre, int codigoInterno, int codigoExterno) {
    	this.nombre=nombre;
    	this.codigoInterno=codigoInterno;
    	this.codigoExterno=codigoExterno;
        
    }

    public Asignatura(int codigoInterno,Tipo tipo) {
    	this.codigoInterno=codigoInterno;
    	this.tipo=tipo;
    }



    public Asignatura(String nombre, Tipo tipo) {
        this.nombre=nombre;
        this.tipo=tipo;
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void cambiarMasDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
