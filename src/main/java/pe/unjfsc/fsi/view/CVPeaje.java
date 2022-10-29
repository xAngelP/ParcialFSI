package pe.unjfsc.fsi.view;

import pe.unjfsc.fsi.entity.CEPeaje;
import pe.unjfsc.fsi.logical.CLPeaje;

public class CVPeaje {
    static CLPeaje ocCLPeaje = new CLPeaje();
    static CEPeaje ocCEPeaje = new CEPeaje();
    
    public static void main(String[] args) {
        ocCEPeaje.setConcesion("1");
        ocCEPeaje.setRUC("1");
        ocCEPeaje.setDireccion("1");
        ocCEPeaje.setUbicacion("1");
        ocCEPeaje.setHoraPeaje("1");
        ocCEPeaje.setTipoComprobante("1");
        ocCEPeaje.setNroComprobante("1");
        ocCEPeaje.setImporte(10);
        ocCLPeaje.calculoDatos(ocCEPeaje);
    }
}
