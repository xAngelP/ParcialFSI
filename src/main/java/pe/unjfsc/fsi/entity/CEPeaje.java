package pe.unjfsc.fsi.entity;

public class CEPeaje {
    private String concesion;
    private String RUC;
    private String direccion;
    private String ubicacion;
    private String horaPeaje;
    private String tipoComprobante;
    private String nroComprobante;
    private double importe;
    private double IGV; //18% (IGV = IMPORTE/1.18)
    private double totalIGV; //(IMPORTE + IGV )

    public CEPeaje(String concesion, String RUC, String direccion, String ubicacion, String horaPeaje, String tipoComprobante, String nroComprobante, double importe, double IGV, double totalIGV) {
        this.concesion = concesion;
        this.RUC = RUC;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.horaPeaje = horaPeaje;
        this.tipoComprobante = tipoComprobante;
        this.nroComprobante = nroComprobante;
        this.importe = importe;
        this.IGV = IGV;
        this.totalIGV = totalIGV;
    }

    public CEPeaje() {
    }

    public String getConcesion() {
        return concesion;
    }

    public void setConcesion(String concesion) {
        this.concesion = concesion;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHoraPeaje() {
        return horaPeaje;
    }

    public void setHoraPeaje(String horaPeaje) {
        this.horaPeaje = horaPeaje;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public double getTotalIGV() {
        return totalIGV;
    }

    public void setTotalIGV(double totalIGV) {
        this.totalIGV = totalIGV;
    }

    @Override
    public String toString() {
        return "CEPeaje{" + "concesion=" + concesion + ", RUC=" + RUC + ", direccion=" + direccion + ", ubicacion=" + ubicacion + ", horaPeaje=" + horaPeaje + ", tipoComprobante=" + tipoComprobante + ", nroComprobante=" + nroComprobante + ", importe=" + importe + ", IGV=" + IGV + ", totalIGV=" + totalIGV + '}';
    }

  
    
}
