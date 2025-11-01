package ejercicioPilas;

/**
 *Programa que me permite trabajar con los datos en formato LIFO
 * es una pila estatica para manipular datos
 * @author Cinthia
 */
public class MiStack {
    
    private final int MAXIMO;
    
    private final String[] STACK;
    
    private int tope;
    
    /**
     * Metodo que me permite ver el contenico de la pila
     * @return regresa un arreglo con los datos
     */
    
    public String[] viewStack(){
        
        int topeVirtual= tope +1 ;
        String[]values = new String[topeVirtual];
        int index = 0;
        for(int i=tope; i>=0; i--){
            values[index] = STACK[i];
            index++;
        }
       return values; 
    }
    
    /**
     * Metodo que permite mostrar los elementos que tiene la pila en el tope
     * @return regresa al valor, si no existe regresa vacio
     */
    public String peek(){
        String value="";
        if(tope>=0){
            value=STACK[tope];
        }
        return value;
    }
    
    
    /**
     * Metodo que permite sacar el valor que tenemos en ele tope de la pila
     * @return regresa el valor que tenemos en el final de la pila
     * si el valor no existe regresa vacia
     */
    
    public String pop(){
        
        String value = "";
        if(tope>=0){
         value=STACK[tope];
         tope--;
            
        }
        return value;
    }
    
    /**
     * Metodo que permite agregar elementos a la pila
     * @param value es el elemento que se agrega 
     * @return un verdadero si se logro insertar
     */
    public boolean push (String value){
        boolean isSuccess;
        if(tope<MAXIMO){
            
            tope++;
            STACK[tope]=value;
            isSuccess=true;  
        }else{
            isSuccess = false;
        }
        return isSuccess;
    }
    
    public MiStack(){
        
        this(10);
        
    }
    
    public MiStack (int max){
        
        MAXIMO=max;
        STACK=new String[MAXIMO];
        tope = -1;        
    }
    
}
