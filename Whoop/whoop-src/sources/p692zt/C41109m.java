package p692zt;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import p073cq.C11052u;
import p479s4.AbstractC32121b;

/* JADX INFO: renamed from: zt.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C41109m implements Closeable {

    /* JADX INFO: renamed from: w */
    public final URL f177212w;

    /* JADX INFO: renamed from: x */
    public volatile Future f177213x;

    /* JADX INFO: renamed from: y */
    public C11052u f177214y;

    public C41109m(URL url) {
        this.f177212w = url;
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m133444b() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f177212w;
        if (zIsLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrM99994G = AbstractC32121b.m99994G(new C41100d(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrM99994G.length + " bytes from " + url);
            }
            if (bArrM99994G.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM99994G, 0, bArrM99994G.length);
            if (bitmapDecodeByteArray == null) {
                throw new IOException("Failed to decode image: " + url);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f177213x.cancel(true);
    }
}
