package vistas;

import javax.swing.*;

public class VisLoginSrv {

    public JFrame frame;
    public boolean finished = false;

    public void lanzarVista(){
        try{
            crearGUI();
            frame.setVisible(true);
            frame.setResizable(false);
            finished = true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void crearGUI() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
