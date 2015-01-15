
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
   
   
   /**
    * metodo para hacer divisiones 
    */
   public int divEnteros(int divi , int divisor)
   {
       int resultado =divi;
       int factor = 1;
       for ( factor=1; resultado >= divisor;){
           resultado = resultado - divisor;
           factor ++;
        
       }
       
       return resultado + factor -1;
   }
   
   /**
    * metodo para hacer modulos 
    */
   public int mod(int divi , int divisor )
   {
       int resultado =divi ;
       for ( int factor=1; resultado >= divisor;){
           resultado = resultado - divisor;
           factor ++;
        
       }
       
       return resultado;
   }
}
    

