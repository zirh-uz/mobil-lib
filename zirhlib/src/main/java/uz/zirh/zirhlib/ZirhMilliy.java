package uz.zirh.zirhlib;

public class ZirhMilliy {


    static {
        try {
            System.loadLibrary("mobil");
        } catch (UnsatisfiedLinkError e) {
            android.util.Log.e("Boshlash", e.getMessage());
        }
    }


    public native String malumotolish(String path);

    public native String malumotalmashish(
            String url,
            String method,
            String body,
            String headers,
            String filePath,
            byte[] fileBytes,
            String fileName,
            String fileField
    );

}