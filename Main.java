package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        double cant, resultado;
        String unidad;
        System.out.println("INGRESE UNIDAD km/mi");
        unidad = rd.nextLine();
        System.out.println("INGRESE CANTIDAD");
        cant = rd.nextFloat();
        conversion(unidad, cant);
        resultado = conversion(unidad,cant);

        System.out.println(resultado);

    }

    private static double conversion(String unid, double can) {
        double res=0;

        if(unid.equals("km")){
            res=(double)(can*0.62137);

        }
        else if(unid.equals("mi")){
            res=(double)(can*1.60934);

        }
        return res;
    }


}

