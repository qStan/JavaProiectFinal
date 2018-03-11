/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author lili
 */
public class AppConfig implements Serializable {

    private static String appConfigSaveFile = "date\\appConfig.bin";

    private boolean isRegistered = false;
    private String lastSavedFilePath = "date\\save.txt";

    public AppConfig() {
    }

    public boolean getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(boolean b) {
        if (this.isRegistered != b) {
            this.isRegistered = b;
            SaveToFile();
        }
    }

    public String getLastSavedFilePath() {
        return lastSavedFilePath;
    }

    public void setLastSavedFilePath(String s) {
        if (this.lastSavedFilePath != null || !this.lastSavedFilePath.equals(s)) {
            this.lastSavedFilePath = s;
            SaveToFile();
        }
    }

    public static AppConfig LoadFromFile() {
        AppConfig appConfig = new AppConfig();

        try {
            File file = new File(appConfigSaveFile);
            FileInputStream fr = new FileInputStream(file.getAbsoluteFile());
            BufferedInputStream br = new BufferedInputStream(fr);
            ObjectInputStream or = new ObjectInputStream(br);

            appConfig = (AppConfig) or.readObject();
            
            or.close();
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return appConfig;
    }

    private void SaveToFile() {
        File file = new File(appConfigSaveFile);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fw = new FileOutputStream(file.getAbsoluteFile());
            BufferedOutputStream bw = new BufferedOutputStream(fw);
            ObjectOutput ow = new ObjectOutputStream(bw);

            ow.writeObject(this);

            ow.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
