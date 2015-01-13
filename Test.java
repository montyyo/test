public class Test
{
     
   /**
    * método llamado multiplesOfFive que imprima todos los múltiplos de 5 entre 10 y 95
    * (ambos extremos no incluidos).
    */
   public void multiplesOfFive()
   {
      int inicial = 10;//limite inferior y contador
      int limite=94;//limite superior
     
      while ( inicial < limite ) // condicion
      {
         inicial=inicial +1; //cuerpo y suma al contador
         if(inicial % 5 == 0){ // condicion para imprimir el multiplo
             System.out.println(inicial); // impresion en pantalla de multiplo
            
         }
      }
   }
   
   /**
    * . Implementa un método llamado sumValues que saque por pantalla la suma
    * de los números comprendidos entre el 0 y el 10 (ambos incluidos) haciendo uso de un bucle while.
    */
   public void sumValues()
   {
      int lim_sup = 0;//limite inferior
      int lim_inf= 10;//limite superior
      int sum=0;//acumulador
      while(lim_sup <= lim_inf) //condicion
      {
          
          sum = lim_sup + sum; //suma de acumulador 
          lim_sup= lim_sup+1; //suma a limite hasta llegar a limite superior
          
      }
      System.out.println( "la suma de los digitos entre 0 y 10 es : " + sum);
       
   }
   
   /**
    * Implementa un método llamado sumValuesInterval que reciba dos
    * parámetros enteros a y b y muestre la suma de los valores comprendidos entre dichos parámetros
    * (ambos incluidos).
    */
   
   public void sumValuesInterval(int num1 , int num2)
   {
       int lim_sup = num1;//limite inferior
      int lim_inf= num2;//limite superior
      int sum=0;//acumulador
      while(lim_sup <= lim_inf) //condicion
      {
          
          sum = lim_sup + sum; //suma de acumulador 
          lim_sup= lim_sup+1; //suma a limite hasta llegar a limite superior
          
      }
      System.out.println( "la suma de los digitos entre "  + num1 + " y " + num2 + " es "  + sum);
       
    
   }
   
   
   /**
    * Implementa un método llamado isPrime(int n) que devuelva verdadero si
    * el parámetro n es primo o falso en caso contrario. Debes usar un bucle while 
    * que divida el número entre todos los valores comprendidos entre 2 y (n -1).
    * Si alguna de estas divisiones da de resto 0, entonces el número no es primo.
    */
   
   public boolean isPrime(int n)
   {
      int lim_inf = 2; //limite inferior
      int  lim_sup = n-1; // limite superior
      boolean prueba = true; // boleano de resultado
       
       while(lim_inf < n -1  ) // mientras no llegemos al numero - 1 comprobamos si es primo
       {
           if (n % lim_inf == 0) // si la div no es 0 es primo
           {
               prueba = false; // si entramos en el if quiere decir que se puede div y no es primo
               
           }
           lim_inf = lim_inf +1 ; // sig numero del rango entre 2 y n-1
       }
       
       return prueba; // resultado boleano
   }
}
