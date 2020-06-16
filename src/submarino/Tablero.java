package submarino;

public class Tablero {
    private Casilla tablero[][];
    private int fila, col;
    private int numIntentos;
    private int numHundidos;
    public final static byte NUM_MAX_INTENTOS = 15;
    
    public Tablero(){
        tablero = new Casilla[5][5];
        for(fila = 0; fila < 5; fila++)
            for(col = 0; col < 5; col++)
                tablero[fila][col] = new Casilla();
        
        numIntentos = 0;
        numHundidos = 0;
    }
    
    public void colocarSubmarinos(){
        
        for(int i = 0; i<5; i++){

            do{
                generarAleatorio();
            }
            while(!tablero[fila][col].estaVacia()); //mientras la casilla este ocupada genera utra nueva posicion aleatoria

            tablero[fila][col].colocarSubmarino();
        }        
       
    }   
    
    private void generarAleatorio(){
        fila = (int) (Math.random() * 5);
        col = (int)(Math.random() * 5);
    }
    
    public boolean adivinar(int fila, int columna){
        boolean adivino;
        if(tablero[fila][columna].estaVacia()){
            numIntentos++;
            adivino = false;
        }else{
            numIntentos++;
            numHundidos++;
            adivino = true;
            tablero[fila][columna].getSubmarino().hundir();
        }        
        return adivino;            
    }
    
    public boolean estaHundido(int fila, int columna){
        if(!tablero[fila][columna].estaVacia())
            return tablero[fila][columna].getSubmarino().estaHundido();
        else 
            return false;
    }
    
    public boolean estaVacia(int fila, int columna){
        return tablero[fila][columna].estaVacia();
    }
    
    public int getNumIntentos(){
        return numIntentos;
    }
    public int getNumHundidos(){
        return numHundidos;
    }
    
    public boolean veriPartidaGanada(){
        return (numIntentos <= NUM_MAX_INTENTOS && numHundidos == 5);              
    }
    
    public boolean veriPartidaPerdida(){
        return (numIntentos == NUM_MAX_INTENTOS && numHundidos < 5);            
    }
}
