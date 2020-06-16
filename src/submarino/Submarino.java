package submarino;

public class Submarino {
    private boolean hundido;
    
    public Submarino(){
        hundido = false;
    }
    
    public void hundir(){
        hundido = true;
    }
    
    public boolean estaHundido(){
        return hundido;
    }
}
