package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        double cant, resultado;
        String unidad;
        System.out.println("INGRESE UNIDAD kg/lb");
        unidad = rd.nextLine();
        System.out.println("INGRESE CANTIDAD");
        cant = rd.nextFloat();
        conversion(unidad, cant);
        resultado = conversion(unidad,cant);

        System.out.println(resultado);

        }

    private static double conversion(String unid, double can) {
        double res=0;

        if(unid.equals("kg")){
            res=(double)(can*2.2);

        }
     else if(unid.equals("lb")){
            res=(double)(can/2.2);

        }
        return res;
    }

}


