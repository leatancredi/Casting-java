package domain;

public enum TipoEscritura {
    CLASICO("Escritura clasico"),
    MODERNO("Escritura digital");
    
    private final String descripcion;
    
    
    //constructor
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}
