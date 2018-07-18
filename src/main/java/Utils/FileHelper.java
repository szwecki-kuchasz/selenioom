package Utils;

import java.io.File;

public class FileHelper {

    public String getPathToResourceFile(String filePath){
        return getResourceFile(filePath).getAbsolutePath();
    }

    public File getResourceFile(String filePath) {
        return new File(getClass().getClassLoader().getResource(filePath).getFile());
    }

    public String getMainPath(){
        return System.getProperty("user.dir");
    }
}
