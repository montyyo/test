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
}
