/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_juanflores;

import java.util.ArrayList;


public class Numero {
    private int base;
    private int num;
    
    
    public Numero(int base, int numero){
        this.base=base;
        //this.numero=decToBase(num);
    }
    public Numero(){
        
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
    
    char yo=' ';

        if(num==10){
            yo='a';
        }else if(num==11){
            yo='b';
        }else if(num==12){
            yo='c';
        }else if(num==13){
            yo='d';
        }else if(num==14){
            yo='e';
        }else if(num==15){
            yo='f';
        }else if(num==16){
            yo='g';
        }else if(num==17){
            yo='h';
        }else if(num==18){
            yo='i';
        }else if(num==19){
            yo='j';
        }else if(num==20){
            yo='k';
        }else if(num==21){
            yo='l';
        }else if(num==22){
            yo='m';
        }else if(num==23){
            yo='n';
        }else if(num==24){
            yo='o';
        }else if(num==25){
            yo='p';
        }else if(num==26){
            yo='q';
        }else if(num==27){
            yo='r';
        }else if(num==28){
            yo='s';
        }else if(num==29){
            yo='t';
        }else if(num==30){
            yo='u';
        }else if(num==31){
            yo='v';
        }else if(num==32){
            yo='w';
        }else if(num==33){
            yo='x';
        }else if(num==34){
            yo='y';
        }else if(num==35){
            yo='z';
        }
              
        
       return yo;
    }
    //charToNum
    public int charToNum(char yo){
        
        int num=0;
        
        if(yo=='a'){
            num=10;
        }else if(yo=='b'){
            num=11;
        }else if(yo=='c'){
            num=12;
        }else if(yo=='d'){
            num=13;
        }else if(yo=='e'){
            num=14;
        }else if(yo=='f'){
            num=15;
        }else if(yo=='g'){
            num=16;
        }else if(yo=='h'){
            num=17;
        }else if(yo=='i'){
            num=18;
        }else if(yo=='j'){
            num=19;
        }else if(yo=='k'){
            num=20;
        }else if(yo=='l'){
            num=21;
        }else if(yo=='m'){
            num=22;
        }else if(yo=='n'){
            num=23;
        }else if(yo=='o'){
            num=24;
        }else if(yo=='p'){
            num=25;
        }else if(yo=='q'){
            num=26;
        }else if(yo=='r'){
            num=27;
        }else if(yo=='s'){
            num=28;
        } else if(yo=='t'){
            num=29;
        }else if(yo=='u'){
            num=30;
        } else if(yo=='v'){
            num=31;
        }else if(yo=='w'){
            num=32;
        } else if(yo=='x'){
            num=33;
        } else if(yo=='y'){
            num=34;
        }else if(yo=='z'){
            num=35;
        }                                  
        
        return num;
    }
    //decToBase
    /*
    esta función recibe como parámetro un entero, el cual represental el valor
    decimal del número con el que se está trabajando y se encarga de convertirlo a la base
    correspondiente. Este método es el que se utiliza en el constructor para poder inicializar el
    valor de la cadena que representa el número.
    */
    public String decToBase(int num, int base){
        String conv = "";
        
        int acum=num;
        
        while(base>acum){
            
            acum-=base/num;
            
            conv+=acum;
            
            if(acum>9){
                conv+=numToChar(acum);
                
            }
        }
      return conv;
    }

    
    //baseToDec
    
    
    
    
    
    
    
    
    
    
    
//     public static void Imprimir(){
//       
//        System.out.println("Libros disponibles: ");
//        System.out.println("");
//        
//        for (int i = 0; i < Nu.size(); i++) {
//            System.out.println("Libro "+(i+1));
//            System.out.println("Título: "+libro.get(i).getTitulo());
//            System.out.println("Autor: "+libro.get(i).getAutor());
//            System.out.println("Genero: "+libro.get(i).getGenero());
//            
//           System.out.println("Edad Minima: "+libro.get(i).getEdad());
//            
//           System.out.println("");
//        }
//
//    }
}
