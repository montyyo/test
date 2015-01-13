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
   
   public void sumValues()
   {
      
       
       
   }
}
