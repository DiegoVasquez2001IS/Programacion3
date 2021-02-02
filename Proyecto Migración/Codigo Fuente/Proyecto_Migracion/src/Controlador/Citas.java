package Controlador;

/**
 *
 * @author Diego
 */
public class Citas extends Persona{

    /**
     * @return the registroCita
     */
    public boolean isRegistroCita() {
        return registroCita;
    }

    /**
     * @param registroCita the registroCita to set
     */
    public void setRegistroCita(boolean registroCita) {
        this.registroCita = registroCita;
    }

    /**
     * @return the fecha_cita
     */
    public String getFecha_cita() {
        return fecha_cita;
    }

    /**
     * @param fecha_cita the fecha_cita to set
     */
    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    /**
     * @return the hora_cita
     */
    public String getHora_cita() {
        return hora_cita;
    }

    /**
     * @param hora_cita the hora_cita to set
     */
    public void setHora_cita(String hora_cita) {
        this.hora_cita = hora_cita;
    }

    /**
     * @return the sede_migracion
     */
    public String getSede_migracion() {
        return sede_migracion;
    }

    /**
     * @param sede_migracion the sede_migracion to set
     */
    public void setSede_migracion(String sede_migracion) {
        this.sede_migracion = sede_migracion;
    }

    /**
     * @return the num_boleta
     */
    public int getNum_boleta() {
        return num_boleta;
    }

    /**
     * @param num_boleta the num_boleta to set
     */
    public void setNum_boleta(int num_boleta) {
        this.num_boleta = num_boleta;
    }

    /**
     * @return the Num_recibo
     */
    public int getNum_recibo() {
        return num_recibo;
    }

    /**
     * @param num_recibo
     */
    public void setNum_recibo(int num_recibo) {
        this.num_recibo = num_recibo;
    }
    
    private String fecha_cita="";
    private String hora_cita="";
    private String sede_migracion="";
    private int num_boleta=0;
    private int num_recibo=0;
    private boolean registroCita=false;
}
