package pe.unjfsc.fsi.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.entity.CEPeaje;

public class CLPeaje {
    private static final Logger LOG = LoggerFactory.getLogger("CLConvertir");
    
    public CEPeaje calculoDatos(CEPeaje poEntrada){
        LOG.info("[FSI] Objeto entrante: ", poEntrada);
        CEPeaje poSalida = new CEPeaje();
        
        String conce = poEntrada.getConcesion();
        String ruc = poEntrada.getRUC();
        String dire = poEntrada.getDireccion();
        String ubi = poEntrada.getUbicacion();
        String hora = poEntrada.getHoraPeaje();
        String compro = poEntrada.getTipoComprobante();
        String nrocompro = poEntrada.getNroComprobante();
        double impo = poEntrada.getImporte();
        double ig = (impo/1.18);  
        ig = poEntrada.getIGV();
        double tota = (impo + ig);
        tota = poEntrada.getTotalIGV();  
        
        poEntrada = poSalida;
        
        poSalida.setConcesion(conce);
        poSalida.setDireccion(dire);
        poSalida.setUbicacion(ubi);
        poSalida.setHoraPeaje(hora);
        poSalida.setTipoComprobante(compro);
        poSalida.setNroComprobante(nrocompro);
        poSalida.setImporte(impo);
        poSalida.setIGV(ig);
        poSalida.setTotalIGV(tota);
        
        LOG.info("[FSI] Objeto de salida: ", poSalida);
        return poSalida;
    }
}
