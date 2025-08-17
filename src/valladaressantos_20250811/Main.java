package valladaressantos_11082025;

/**
 *
 * @author UFG
 */
public class Main {

    // VARIABLES GLOBALES
    public static int horasEnUnDia = 24;
    public static int segundosEnUnaHora = 3600;
    public static int segundoEnUnMinuto = 60;

    public static void main(String[] args) {
        // VARIABLE LOCAL
        int segundosTotales = 91111;

        int dias = calcularDias(segundosTotales);
        int segundosRestantesDespuesDeExtraerDias = obtenerSegundosRestantesDespuesDeExtraerDias(segundosTotales);

        int horas = calcularHoras(segundosRestantesDespuesDeExtraerDias);
        int segundosRestantesDespuesDeExtraerHoras = obtenerSegundosRestantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);

        int minutos = calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        int segundosFinales = obtenerSegundosRestantesDespuesDeExtraerMinutos(segundosRestantesDespuesDeExtraerHoras);

        System.out.println("Usted ha solicitado calcular los días, horas, minutos y segundos a partir de un número mayor a 86400");
        System.out.println("Usted ha indicado el valor actual de segundos como: " + segundosTotales);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundosFinales);
    }

    // MODULO CALCULAR DÍAS
    public static int calcularDias(int segundosTotales) {
        return segundosTotales / (horasEnUnDia * segundosEnUnaHora);
    }

    // MODULO CALCULAR EXTRAS DÍAS
    public static int obtenerSegundosRestantesDespuesDeExtraerDias(int segundosTotales) {
        return segundosTotales % (horasEnUnDia * segundosEnUnaHora);
    }

    // MODULO CALCULAR HORAS
    public static int calcularHoras(int segundosRestantes) {
        return segundosRestantes / segundosEnUnaHora;
    }

    public static int obtenerSegundosRestantesDespuesDeExtraerHoras(int segundosRestantes) {
        return segundosRestantes % segundosEnUnaHora;
    }

    public static int calcularMinutos(int segundosRestantes) {
        return segundosRestantes / segundoEnUnMinuto;
    }

    public static int obtenerSegundosRestantesDespuesDeExtraerMinutos(int segundosRestantes) {
        return segundosRestantes % segundoEnUnMinuto;
    }
}