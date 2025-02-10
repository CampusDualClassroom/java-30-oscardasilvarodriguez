package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException{
        if (divisor == 0) {
            throw new DivisionByZeroException("ERROR: No se puede dividir un número entre 0");
        } else {
            return dividend /  divisor;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(divisionWithCustomException(10, 2));
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
        System.out.println("Programa terminado.");
        }
    }
}
