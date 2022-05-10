package com.mycompany.web.servlets;

import java.time.LocalDate;


public class DiasReturn {
    private int dia,mes,anio;
    public DiasReturn(int dia,int mes,int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    public int contarDias(){
        
        int total=0;
        int diasMes[] = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

        //devolver datos del dia de hoy
        LocalDate hoy = LocalDate.now();
        String hoyStr =String.valueOf(hoy);
        String[] romper = hoyStr.split("-");
        int diaActual=Integer.valueOf(romper[2]),mesActual=Integer.valueOf(romper[1]),anioActual=Integer.valueOf(romper[0]);

        System.out.println(diaActual);
        System.out.println(mesActual);
        System.out.println(anioActual);


        //dias desde el siguiente anio seleccionado hasta 2021
        for(int i=anio+1;i<=2021;i++){
            if(i%4==0){total+=366;}
            else{total+=365;}
        }
        //mes restantes del anio de nacimiento
        for(int i=mes+1;i<=12;i++){total+=diasMes[i];}
        //dias restantes del mes de nacimiento
        for(int i=dia+1;i<=diasMes[mes];i++){total+=1;}
        //verifica si el anio fue viciesto y si naciste antes del 29 de febrero para agregar un dia
        if (anio%4==0 && mes<=02 && dia<29){total+=1;}
        
        
        
        //mes de este anio
        for(int i=1;i<=mesActual-1;i++){total+=diasMes[i];}
        //dias de este mes
        for(int i=1;i<=diaActual;i++){total+=1;}
        //verifica si este anio es viciesto y si ya paso el 29 de febrero para agregar un dia
        if (anioActual%4==0 && mesActual<=03){total+=1;}

        return total;
    }

}
