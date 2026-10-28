package fe3;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import androidx.room.AbstractC1772c1;
import ge3.AbstractC15747c;
import ge3.C15746b;
import ge3.C15749e;
import ge3.C15752h;
import ge3.C15755k;
import ge3.C15757m;
import ge3.C15759o;
import ge3.InterfaceC15758n;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import je3.InterfaceC21631d;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34826l0;

/* JADX INFO: renamed from: fe3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14419c extends AbstractC14421e implements InterfaceC14420d {

    /* JADX INFO: renamed from: e */
    public static final boolean f52591e;

    /* JADX INFO: renamed from: c */
    public Context f52592c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f52593d;

    static {
        f52591e = Build.VERSION.SDK_INT < 29;
    }

    public C14419c() {
        C15759o c15759o;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c15759o = new C15759o(cls);
        } catch (Exception e5) {
            CopyOnWriteArraySet copyOnWriteArraySet = AbstractC15747c.f59409a;
            AbstractC15747c.m44417a(5, C34826l0.class.getName(), "unable to load android socket classes", e5);
            c15759o = null;
        }
        List listM74077r0 = AbstractC25260n.m74077r0(new InterfaceC15758n[]{c15759o, new C15757m(C15749e.f59412e), new C15757m(C15755k.f59419a), new C15757m(C15752h.f59417a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM74077r0) {
            if (((InterfaceC15758n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f52593d = arrayList;
    }

    @Override // fe3.InterfaceC14420d
    /* JADX INFO: renamed from: a */
    public final Context mo41113a() {
        return this.f52592c;
    }

    @Override // fe3.InterfaceC14420d
    /* JADX INFO: renamed from: b */
    public final void mo41114b(Context context) {
        this.f52592c = context;
    }

    @Override // fe3.AbstractC14421e
    /* JADX INFO: renamed from: c */
    public final AbstractC1772c1 mo41115c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AbstractC22676k.m65750j(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C15746b c15746b = x509TrustManagerExtensions != null ? new C15746b(trustManager, x509TrustManagerExtensions) : null;
        return c15746b != null ? c15746b : super.mo41115c(trustManager);
    }

    @Override // fe3.AbstractC14421e
    /* JADX INFO: renamed from: d */
    public final InterfaceC21631d mo41116d(X509TrustManager trustManager) {
        AbstractC22676k.m65750j(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C14418b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo41116d(trustManager);
        }
    }

    @Override // fe3.AbstractC14421e
    /* JADX INFO: renamed from: e */
    public final void mo41117e(SSLSocket sSLSocket, String str, List protocols) {
        Object next;
        AbstractC22676k.m65750j(protocols, "protocols");
        Iterator it = this.f52593d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC15758n) next).mo44414a(sSLSocket));
        InterfaceC15758n interfaceC15758n = (InterfaceC15758n) next;
        if (interfaceC15758n != null) {
            interfaceC15758n.mo44416c(sSLSocket, str, protocols);
        }
    }

    @Override // fe3.AbstractC14421e
    /* JADX INFO: renamed from: f */
    public final void mo41125f(Socket socket, InetSocketAddress address, int i13) throws IOException {
        AbstractC22676k.m65750j(address, "address");
        socket.connect(address, i13);
    }

    @Override // fe3.AbstractC14421e
    /* JADX INFO: renamed from: g */
    public final String mo41118g(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f52593d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC15758n) next).mo44414a(sSLSocket));
        InterfaceC15758n interfaceC15758n = (InterfaceC15758n) next;
        if (interfaceC15758n != null) {
            return interfaceC15758n.mo44415b(sSLSocket);
        }
        return null;
    }

    @Override // fe3.AbstractC14421e
    /* JADX INFO: renamed from: i */
    public final boolean mo41120i(String hostname) {
        AbstractC22676k.m65750j(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // fe3.AbstractC14421e
    /* JADX INFO: renamed from: j */
    public final void mo41121j(String message, int i13, Throwable th3) {
        AbstractC22676k.m65750j(message, "message");
        if (i13 == 5) {
            Log.w("OkHttp", message, th3);
        } else {
            Log.i("OkHttp", message, th3);
        }
    }

    @Override // fe3.AbstractC14421e
    /* JADX INFO: renamed from: l */
    public final SSLContext mo41123l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.mo41123l();
    }
}
