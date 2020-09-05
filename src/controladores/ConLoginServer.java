package controladores;

import modelos.ModServer;
import vistas.VisLoginSrv;

public class ConLoginServer {
    public ModServer modelo;
    public VisLoginSrv vista;

    public ConLoginServer(VisLoginSrv visLoginSrv, ModServer modServer) {
        this.vista = visLoginSrv;
        this.modelo = modServer;
        ejecutar();
    }

    private void ejecutar() {
        vista.lanzarVista();
        agregarListeners();
    }

    private void agregarListeners() {
        if(vista.finished){

        }
    }
}
