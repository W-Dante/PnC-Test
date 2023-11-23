package course.mainMethod;

import java.awt.Desktop;
import java.net.URI;

public class OpenPnCLink {
    public static void main(String[] args) {
        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop is not supported");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
        try {
            URI uri = new URI("https://www.hubject.com/products/plug-and-charge");
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
