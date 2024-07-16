import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Convertidor {
    public static void main(String[] args) {

        Object[] options = { "Conversor de moneda", "Conversor de unidades", "Salir" };
        int choice = JOptionPane.showOptionDialog(null, "Selecciona una opcion", "Convertir",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 2) {
            JOptionPane.showMessageDialog(null, "Hasta pronto!");
            System.exit(0);
        }
        if (choice == 0) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = { "Pesos a Euros", "Pesos a Dólares", "Pesos a Libras Esterlinas", "Pesos a Yen",
                        "Pesos a Won" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Selecciona una opción:",
                        "Convertidor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog("Ingrese la cantidad en pesos: ");
                double soles;
                try {
                    soles = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido.");
                    return;
                }

                if (cambio.equals("Pesos a Dólares")) {
                    double dollars = soles / 3.58;
                    JOptionPane.showMessageDialog(null,
                            soles + "pesos son " + FormatearDecimal.format(dollars) + " dólares.");
                } else if (cambio.equals("Pesos a Euros")) {
                    double euros = soles / 4.21;
                    JOptionPane.showMessageDialog(null, soles + " pesos son " + euros + " euros.");
                } else if (cambio.equals("Pesos a Libras Esterlinas")) {
                    double pounds = soles / 4.92;
                    JOptionPane.showMessageDialog(null,
                            soles + " Pesos son " + pounds + " libras esterlinas.");
                } else if (cambio.equals("Pesos a Yen")) {
                    double yen = soles / 0.03;
                    JOptionPane.showMessageDialog(null, soles + "pesos son " + yen + " yenes japoneses.");
                } else if (cambio.equals("Pesos a Won")) {
                    double won = soles / 0.0027;
                    JOptionPane.showMessageDialog(null, soles + " pesos son " + won + " wones surcoreanos.");
                }

                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea realizar alguna otra accion?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }

        }
        if (choice == 1) {

            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opciones = { "centimetros a metros", "metros a centimetros" };
                int opcion = JOptionPane.showOptionDialog(null, "Elige una opción de conversión:",
                        "Convertidor de unidades", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor / 100);
                    JOptionPane.showMessageDialog(null,
                            valor + " centimetros son " + resultado + " metros");
                } else if (opcion == 1) {
                    resultado = (valor * 100);
                    JOptionPane.showMessageDialog(null,
                            valor + " metros son " + resultado + " centimetros");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }

    }
}
