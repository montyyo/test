
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
   
     /**
    * metodo para hacer potencias 
    */
   public int potencias(int num , int potencia )
   {
       int resultado =num ;
       
       for ( int factor=1; factor < potencia;){
           resultado =  multEnteros(resultado,num);
           factor ++;
        
       }
       
       return resultado;
   }
   
   
    /**
       * Calculo de raices cuadradas
         * Los numeros negativos son erroneos
           * Las exigencias del ejercicio dicen que los resultados no exactos son erroneos
             * La calculadora esta limitada a 1000
               */
              public int raizCuadrada(int numero){
                  int resultado = -1;
                  if(numero > -1 || numero < 1001){
                      boolean found = false;
                      int contador = 0;
                      int auxiliar = 0;
                      while(!found && auxiliar < 1001){
                          auxiliar = multEnteros(contador, contador);
                          if(auxiliar == numero){
                              found = true;
                              resultado = contador;
                            }else{
                                contador++;
                            }
                        }
                        if(!found){
                            System.out.println("El numero introducido no tiene raiz cuadrada exacta");
                        }
                    }else{
                        System.out.println("El numero introducido es invalido");
                    }
                    return resultado;
                }
}
    

