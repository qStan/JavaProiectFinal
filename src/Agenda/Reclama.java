/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author lili
 */
public class Reclama implements Runnable {
   
    private List<File> pozeReclame;
    private int reclamaCurenta;
    File dir = new File("src\\\\reclame");
    File[] fisiere = dir.listFiles();

    public Reclama() {
        pozeReclame = Arrays.asList(fisiere);

    }

    @Override
    public void run() {

        for (File temp : pozeReclame) {
            (new Thread()).start();
            afisareReclama();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(InterfataGrafica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String afisareReclama() {
        File calePozaCurenta = pozeReclame.get(reclamaCurenta);
        ImageIcon poza = new ImageIcon(calePozaCurenta.getAbsolutePath());
        return poza.toString();

    }

}
