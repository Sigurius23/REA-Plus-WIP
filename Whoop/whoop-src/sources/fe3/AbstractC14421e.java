package fe3;

import android.os.Build;
import androidx.room.AbstractC1772c1;
import ge3.AbstractC15747c;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import je3.C21628a;
import je3.C21629b;
import je3.InterfaceC21631d;
import p031b9.AbstractC2875y;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34826l0;

/* JADX INFO: renamed from: fe3.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14421e {

    /* JADX INFO: renamed from: a */
    public static volatile AbstractC14421e f52594a;

    /* JADX INFO: renamed from: b */
    public static final Logger f52595b;

    static {
        try {
            for (Map.Entry entry : AbstractC15747c.f59410b.entrySet()) {
                AbstractC15747c.m44418b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e5) {
            System.err.println("Possibly running android unit test without robolectric");
            e5.printStackTrace();
        } catch (UnsatisfiedLinkError e13) {
            System.err.println("Possibly running android unit test without robolectric");
            e13.printStackTrace();
        }
        AbstractC14421e c14417a = C14417a.f52586e ? new C14417a() : null;
        if (c14417a == null) {
            boolean z4 = C14419c.f52591e;
            c14417a = AbstractC34870c0.m109968C();
        }
        if (c14417a == null) {
            throw new IllegalStateException(AbstractC2875y.m8295h(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f52594a = c14417a;
        f52595b = Logger.getLogger(C34826l0.class.getName());
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1772c1 mo41115c(X509TrustManager trustManager) {
        AbstractC22676k.m65750j(trustManager, "trustManager");
        return new C21628a(mo41116d(trustManager));
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC21631d mo41116d(X509TrustManager trustManager) {
        AbstractC22676k.m65750j(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new C21629b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo41117e(SSLSocket sSLSocket, String str, List list);

    /* JADX INFO: renamed from: f */
    public void mo41125f(Socket socket, InetSocketAddress address, int i13) throws IOException {
        AbstractC22676k.m65750j(address, "address");
        socket.connect(address, i13);
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo41118g(SSLSocket sSLSocket);

    /* JADX INFO: renamed from: h */
    public Object mo41119h() {
        if (f52595b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo41120i(String str);

    /* JADX INFO: renamed from: j */
    public abstract void mo41121j(String str, int i13, Throwable th3);

    /* JADX INFO: renamed from: k */
    public void mo41122k(Object obj, String message) {
        AbstractC22676k.m65750j(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo41121j(message, 5, (Throwable) obj);
    }

    /* JADX INFO: renamed from: l */
    public SSLContext mo41123l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC22676k.m65749i(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
