package javaappl;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by александр on 15.01.2017.
 */
public class OnlyExt implements FilenameFilter {
    String ext;
    public OnlyExt(String ext){
        this.ext = "." + ext;
    }
    public boolean accept(File dir, String name){
        return name.endsWith(ext);
    }
}