package calorias;

import javax.swing.JOptionPane;

public class calorias {
    public static void main(String[] args) {
        
        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona una opción: \n1) Calorias semanales \n2)Indice de masa corporal ", "Menu Calorias", JOptionPane.DEFAULT_OPTION));

        if(opcion == 1)
        {
            JOptionPane.showMessageDialog(null, "Introduce tus calorías diarias");

            int[] calorias;
            String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

            calorias = new int[7];

            for (int i = 0; i < calorias.length; i++)
            {
            calorias[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorías consumidas el día" + diaSemana[i] + ": ", "0"));
            }
            JOptionPane.showMessageDialog(null, "El numero de calorias para el dia " + diaSemana[0] + " es: " + calorias[0] + "\nEl numero de calorias para el dia " + diaSemana[1] + " es: " + calorias[1] + "\nEl numero de calorias para el dia " + diaSemana[2] + " es: " + calorias[2] + "\nEl numero de calorias para el dia " + diaSemana[3] + " es: " + calorias[3] + "\nEl numero de calorias para el dia " + diaSemana[4] + " es: " + calorias[4] + "\nEl numero de calorias para el dia " + diaSemana[5] + " es: " + calorias[5] + "\nEl numero de calorias para el dia " + diaSemana[6] + " es: " + calorias[6], "Calorias semanales", JOptionPane.INFORMATION_MESSAGE);

            int promedio;
            promedio = (calorias[0] + calorias[1] + calorias[2] + calorias[3] + calorias[4] + calorias[5] + calorias[6])/7;
            JOptionPane.showMessageDialog(null, "El promedio de calorías semanal fue: " + promedio, "Promedio Calorias", JOptionPane.INFORMATION_MESSAGE);
        }

        if(opcion == 2)
        {
            double peso;
            double altura;
            int edad;
            double imb;

            peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu peso actual en kg "));
            altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu estatura en cm "));
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué edad tienes? "));
            imb = Math.round((peso/(altura * altura)) * 10000);
                
            JOptionPane.showMessageDialog(null, "El indice de masa corporal a la edad de " + edad + " es igual a " + imb, "IMB", JOptionPane.CLOSED_OPTION);

        }
    }
}
