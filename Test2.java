
/**
 * Write a description of class Test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test2
{
    
    
   /**
    * metodo para realizar multiplicaciones enteras
    */
   public int multEnteros(int multiplicado, int multiplicador)
   {
       int resultado= multiplicado; // guardamos el resultado 
      
       for( int factor= 1 ; factor < multiplicador; ){ //contador con factor, mientras sea menor que multiplicador se repite
       
            resultado= resultado +multiplicado; //incrementamos el valor de resultado
            factor++;//aumentamos en 1 el contador 
       }
        return resultado;//retornamos el resultado
   }
   
   
   
}
    

