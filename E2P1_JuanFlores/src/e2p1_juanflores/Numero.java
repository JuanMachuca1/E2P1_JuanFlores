/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_juanflores;

import java.util.ArrayList;


public class Numero {
    private int base;
    private int num;
    private String result;
    
    public Numero(int base, int numero){
        this.base=base;
        this.result=decToBase(numero);
        
        this.num=numero; 
    }
    public Numero(){
        
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
     //numToChar
    public char numToChar(int num){
    
    char numeroconver = 0;
    
    if(num>=0 && num<=9){
        
        numeroconver=(char)(num+48);
    }else if(num>=10 && num<=35){
        numeroconver=(char)((num)+87);
    }
    return numeroconver;
    }
    //charToNum
    public int charToNum(char numeroConv){
        
        int num=0;
        
        if(numeroConv>=48 && numeroConv<=67){
            num=(int)(numeroConv-48);
        }else if(numeroConv>=97 && numeroConv<=122){
            num=(int)(numeroConv-87);
        }
        return numeroConv;
    }
    //decToBase
    /*
    esta función recibe como parámetro un entero, el cual represental el valor
    decimal del número con el que se está trabajando y se encarga de convertirlo a la base
    correspondiente. Este método es el que se utiliza en el constructor para poder inicializar el
    valor de la cadena que representa el número.
    */
    public String decToBase(int numero){
        String residuosS="";
        
        int residuo_in=0;
        
        while(numero>=base){
            
            
            residuo_in=numero%base;
            numero=numero/base;
            
            
            
       
        //residuosS+=numToChar(residuo_in);
        residuosS = numToChar(residuo_in) + residuosS;
       
        }         
        //residuosS += numToChar(numero);
        residuosS = numToChar(numero) + residuosS;
      return residuosS;
    }

    //baseToDec
    
    public int baseToDec(String ca){
        int conver=1;
       
        for (int i = 0; i < ca.length(); i++) {
            
            conver+=charToNum((char)ca.length());
        }
        
        return conver;
    }
    
    /*
    La segunda opción del menú principal le permitirá al usuario realizar 3 operaciones con los
    números: suma, resta y multiplicación. Al entrar a esta opción se le preguntará al usuario cuál de
    las 3 operaciones desea realizar y después deberá elegir 2 números de la lista de números para
    llevar a cabo la operación. El resultado de la operación deberá mostrarse utilizando la mayor base
    entre los números.

    */
    
    
    
    public void Print(ArrayList <Numero> Lista){
        System.out.println("Lista de numeros ");
        
        for (int i = 0; i < Lista.size(); i++) {
            System.out.println(i+1+". "+Lista.get(i).getResult()+" base "+Lista.get(i).getBase()+" : "+Lista.get(i).getNum() );                  
                            
        }
    }
    
     public ArrayList<Numero> Eliminar(ArrayList <Numero> Lista, int ind){
       
        
        for (int i = 0; i < Lista.size(); i++) {
             
            if(Lista.get(i)==Lista.get(ind-1)){
                Lista.remove(i);
            }
                          
        }
        return Lista;
    }
    
    
        
    
    
    
   
}
