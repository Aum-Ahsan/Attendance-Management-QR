/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms;

import java.io.File;

/**
 *
 * @author PCCS
 */
class BDUtility {


    static void setImage(UserRegistration aThis, String imagesabc1jpg, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public static String getPath(String fileName) {
    // Get current working directory
    String currentDir = System.getProperty("user.dir");

    // Make sure "images/" directory exists
    File imagesDir = new File(currentDir, "images");
    if (!imagesDir.exists()) {
        imagesDir.mkdirs(); // Create if missing
    }

    // Return full path to image
    return imagesDir.getAbsolutePath() + File.separator + fileName;
}
    
}
