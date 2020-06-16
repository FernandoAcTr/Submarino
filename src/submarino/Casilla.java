package submarino;

public class Casilla {
    private Submarino submarino;    
    
    public Casilla(){
        submarino = null;
    }
    
    public void colocarSubmarino(){
        submarino = new Submarino();
    }
    
    public boolean estaVacia(){
        return submarino == null;
    } 
    
    public Submarino getSubmarino(){
        return submarino;
    }
}
