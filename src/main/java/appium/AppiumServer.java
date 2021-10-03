package appium;

import Utilitle.PropertiesUtil;
import enums.filePath;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.ServerSocket;

public class AppiumServer {
    public static final Logger LOG = Logger.getLogger(AppiumServer.class);
    public  static AppiumDriverLocalService appium;


    public static void start() {
        appium = AppiumDriverLocalService.buildDefaultService();
        appium.start();
        LOG.info("Appium server has been started !");
    }

    public static void stop() {
        appium.stop();
        LOG.info("Appium server has been stopped  !");
    }
    public static boolean checkIfServerIsRunning(int post){
        boolean isServerRunning =false;
        ServerSocket serverSocket;
        try{
            serverSocket= new ServerSocket(post);
            serverSocket.close();
        }catch (IOException e){
            isServerRunning=true;
        }
        return isServerRunning;
    }
    public  static void  startEmulator() throws IOException {
        Runtime.getRuntime().exec(filePath.EMULATOR_FILE.getData());
    }
}
