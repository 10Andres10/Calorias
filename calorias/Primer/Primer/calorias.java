package Primer

import javax.swing.JOptionPane;

Corte.calorias;

public class calorias {
    public static void main(String[] args) {
        
        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Eliga una opcion: \n1) Calorias de la semana \n2)Calcular el IMB (Indice de masa corporal)", "Menu Calorias", JOptionPane.DEFAULT_OPTION));

        if(opcion == 1)
        {
            JOptionPane.showMessageDialog(null, "Por favor, introduzca las calorias diarias");

            int[] calorias;
            String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

            calorias = new int[7];

            for (int i = 0; i < calorias.length; i++)
            {
            calorias[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de calorias consumidas el dia " + diaSemana[i] + ": ", "0"));
            }
            JOptionPane.showMessageDialog(null, "El numero de calorias para el dia " + diaSemana[0] + " es: " + calorias[0] + "\nEl numero de calorias para el dia " + diaSemana[1] + " es: " + calorias[1] + "\nEl numero de calorias para el dia " + diaSemana[2] + " es: " + calorias[2] + "\nEl numero de calorias para el dia " + diaSemana[3] + " es: " + calorias[3] + "\nEl numero de calorias para el dia " + diaSemana[4] + " es: " + calorias[4] + "\nEl numero de calorias para el dia " + diaSemana[5] + " es: " + calorias[5] + "\nEl numero de calorias para el dia " + diaSemana[6] + " es: " + calorias[6], "Calorias semanales", JOptionPane.INFORMATION_MESSAGE);

            int promedio;
            promedio = (calorias[0] + calorias[1] + calorias[2] + calorias[3] + calorias[4] + calorias[5] + calorias[6])/7;
            JOptionPane.showMessageDialog(null, "El promedio de calorias en esta semana fueron de: " + promedio, "Promedio Calorias", JOptionPane.INFORMATION_MESSAGE);
        }

        if(opcion == 2)
        {
            double peso;
            double altura;
            int edad;
            double imb;

            peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, ingrese su peso actual (kg)"));
            altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, ingrese su altura actual (cm)"));
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, ingrese su edad actual"));
            imb = Math.round((peso/(altura * altura)) * 10000);
                
            JOptionPane.showMessageDialog(null, "El indice de masa corporal a la edad de " + edad + " es igual a " + imb, "IMB", JOptionPane.CLOSED_OPTION);

    }
}
