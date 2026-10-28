package ud3;

import androidx.room.AbstractC1772c1;
import fe3.AbstractC14421e;
import he3.C17223a;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import le3.C23886g;
import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;
import yd3.C39473d;
import zd3.C40571o;
import zd3.C40576t;

/* JADX INFO: renamed from: ud3.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34826l0 implements InterfaceC34819i {

    /* JADX INFO: renamed from: G */
    public static final List f146641G = AbstractC37174h.m119144k(new EnumC34828m0[]{EnumC34828m0.HTTP_2, EnumC34828m0.HTTP_1_1});

    /* JADX INFO: renamed from: H */
    public static final List f146642H = AbstractC37174h.m119144k(new C34837r[]{C34837r.f146724e, C34837r.f146725f});

    /* JADX INFO: renamed from: A */
    public final int f146643A;

    /* JADX INFO: renamed from: B */
    public final int f146644B;

    /* JADX INFO: renamed from: C */
    public final long f146645C;

    /* JADX INFO: renamed from: D */
    public final C40576t f146646D;

    /* JADX INFO: renamed from: E */
    public final C39473d f146647E;

    /* JADX INFO: renamed from: F */
    public final C34835q f146648F;

    /* JADX INFO: renamed from: a */
    public final C34843u f146649a;

    /* JADX INFO: renamed from: b */
    public final List f146650b;

    /* JADX INFO: renamed from: c */
    public final List f146651c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC34853z f146652d;

    /* JADX INFO: renamed from: e */
    public final boolean f146653e;

    /* JADX INFO: renamed from: f */
    public final boolean f146654f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC34803c f146655g;

    /* JADX INFO: renamed from: h */
    public final boolean f146656h;

    /* JADX INFO: renamed from: i */
    public final boolean f146657i;

    /* JADX INFO: renamed from: j */
    public final C34841t f146658j;

    /* JADX INFO: renamed from: k */
    public final C34815g f146659k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC34845v f146660l;

    /* JADX INFO: renamed from: m */
    public final ProxySelector f146661m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC34803c f146662n;

    /* JADX INFO: renamed from: o */
    public final SocketFactory f146663o;

    /* JADX INFO: renamed from: p */
    public final SSLSocketFactory f146664p;

    /* JADX INFO: renamed from: q */
    public final X509TrustManager f146665q;

    /* JADX INFO: renamed from: r */
    public final List f146666r;

    /* JADX INFO: renamed from: s */
    public final List f146667s;

    /* JADX INFO: renamed from: t */
    public final HostnameVerifier f146668t;

    /* JADX INFO: renamed from: u */
    public final C34825l f146669u;

    /* JADX INFO: renamed from: v */
    public final AbstractC1772c1 f146670v;

    /* JADX INFO: renamed from: w */
    public final int f146671w;

    /* JADX INFO: renamed from: x */
    public final int f146672x;

    /* JADX INFO: renamed from: y */
    public final int f146673y;

    /* JADX INFO: renamed from: z */
    public final int f146674z;

    public C34826l0(C34824k0 c34824k0) throws NoSuchAlgorithmException, KeyStoreException {
        this.f146649a = c34824k0.f146612a;
        this.f146650b = AbstractC37174h.m119143j(c34824k0.f146614c);
        this.f146651c = AbstractC37174h.m119143j(c34824k0.f146615d);
        this.f146652d = c34824k0.f146616e;
        this.f146653e = c34824k0.f146617f;
        this.f146654f = c34824k0.f146618g;
        this.f146655g = c34824k0.f146619h;
        this.f146656h = c34824k0.f146620i;
        this.f146657i = c34824k0.f146621j;
        this.f146658j = c34824k0.f146622k;
        this.f146659k = c34824k0.f146623l;
        this.f146660l = c34824k0.f146624m;
        ProxySelector proxySelector = c34824k0.f146625n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = C17223a.f66186a;
        }
        this.f146661m = proxySelector;
        this.f146662n = c34824k0.f146626o;
        this.f146663o = c34824k0.f146627p;
        List list = c34824k0.f146630s;
        this.f146666r = list;
        this.f146667s = c34824k0.f146631t;
        this.f146668t = c34824k0.f146632u;
        this.f146671w = c34824k0.f146635x;
        this.f146672x = c34824k0.f146636y;
        this.f146673y = c34824k0.f146637z;
        this.f146674z = c34824k0.f146606A;
        this.f146643A = c34824k0.f146607B;
        this.f146644B = c34824k0.f146608C;
        this.f146645C = c34824k0.f146609D;
        C40576t c40576t = c34824k0.f146610E;
        this.f146646D = c40576t == null ? new C40576t() : c40576t;
        C39473d c39473d = c34824k0.f146611F;
        this.f146647E = c39473d == null ? C39473d.f169842l : c39473d;
        C34835q c34835q = c34824k0.f146613b;
        if (c34835q == null) {
            c34835q = new C34835q();
            c34824k0.f146613b = c34835q;
        }
        this.f146648F = c34835q;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f146664p = null;
                    this.f146670v = null;
                    this.f146665q = null;
                    this.f146669u = C34825l.f146638c;
                    break;
                }
                if (((C34837r) it.next()).f146726a) {
                    SSLSocketFactory sSLSocketFactory = c34824k0.f146628q;
                    if (sSLSocketFactory != null) {
                        this.f146664p = sSLSocketFactory;
                        AbstractC1772c1 abstractC1772c1 = c34824k0.f146634w;
                        AbstractC22676k.m65747g(abstractC1772c1);
                        this.f146670v = abstractC1772c1;
                        X509TrustManager x509TrustManager = c34824k0.f146629r;
                        AbstractC22676k.m65747g(x509TrustManager);
                        this.f146665q = x509TrustManager;
                        C34825l c34825l = c34824k0.f146633v;
                        c34825l.getClass();
                        this.f146669u = AbstractC22676k.m65745e(c34825l.f146640b, abstractC1772c1) ? c34825l : new C34825l(c34825l.f146639a, abstractC1772c1);
                        break;
                    }
                    AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
                    AbstractC14421e.f52594a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    AbstractC22676k.m65747g(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                            this.f146665q = x509TrustManager2;
                            AbstractC14421e abstractC14421e2 = AbstractC14421e.f52594a;
                            abstractC14421e2.getClass();
                            try {
                                SSLContext sSLContextMo41123l = abstractC14421e2.mo41123l();
                                sSLContextMo41123l.init(null, new TrustManager[]{x509TrustManager2}, null);
                                SSLSocketFactory socketFactory = sSLContextMo41123l.getSocketFactory();
                                AbstractC22676k.m65749i(socketFactory, "getSocketFactory(...)");
                                this.f146664p = socketFactory;
                                AbstractC1772c1 abstractC1772c1Mo41115c = AbstractC14421e.f52594a.mo41115c(x509TrustManager2);
                                this.f146670v = abstractC1772c1Mo41115c;
                                C34825l c34825l2 = c34824k0.f146633v;
                                c34825l2.getClass();
                                this.f146669u = AbstractC22676k.m65745e(c34825l2.f146640b, abstractC1772c1Mo41115c) ? c34825l2 : new C34825l(c34825l2.f146639a, abstractC1772c1Mo41115c);
                                break;
                            } catch (GeneralSecurityException e5) {
                                throw new AssertionError("No System TLS: " + e5, e5);
                            }
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    AbstractC22676k.m65749i(string, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
                }
            }
        } else {
            this.f146664p = null;
            this.f146670v = null;
            this.f146665q = null;
            this.f146669u = C34825l.f146638c;
            break;
        }
        X509TrustManager x509TrustManager3 = this.f146665q;
        AbstractC1772c1 abstractC1772c2 = this.f146670v;
        SSLSocketFactory sSLSocketFactory2 = this.f146664p;
        List list3 = this.f146651c;
        List list4 = this.f146650b;
        AbstractC22676k.m65748h(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(AbstractC11895b.m31998q("Null interceptor: ", list4).toString());
        }
        AbstractC22676k.m65748h(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(AbstractC11895b.m31998q("Null network interceptor: ", list3).toString());
        }
        List list5 = this.f146666r;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                if (((C34837r) it3.next()).f146726a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (abstractC1772c2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager3 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (abstractC1772c2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC22676k.m65745e(this.f146669u, C34825l.f146638c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C34824k0 m109897a() {
        C34824k0 c34824k0 = new C34824k0();
        c34824k0.f146612a = this.f146649a;
        c34824k0.f146613b = this.f146648F;
        AbstractC25265s.m74141p0(c34824k0.f146614c, this.f146650b);
        AbstractC25265s.m74141p0(c34824k0.f146615d, this.f146651c);
        c34824k0.f146616e = this.f146652d;
        c34824k0.f146617f = this.f146653e;
        c34824k0.f146618g = this.f146654f;
        c34824k0.f146619h = this.f146655g;
        c34824k0.f146620i = this.f146656h;
        c34824k0.f146621j = this.f146657i;
        c34824k0.f146622k = this.f146658j;
        c34824k0.f146623l = this.f146659k;
        c34824k0.f146624m = this.f146660l;
        c34824k0.f146625n = this.f146661m;
        c34824k0.f146626o = this.f146662n;
        c34824k0.f146627p = this.f146663o;
        c34824k0.f146628q = this.f146664p;
        c34824k0.f146629r = this.f146665q;
        c34824k0.f146630s = this.f146666r;
        c34824k0.f146631t = this.f146667s;
        c34824k0.f146632u = this.f146668t;
        c34824k0.f146633v = this.f146669u;
        c34824k0.f146634w = this.f146670v;
        c34824k0.f146635x = this.f146671w;
        c34824k0.f146636y = this.f146672x;
        c34824k0.f146637z = this.f146673y;
        c34824k0.f146606A = this.f146674z;
        c34824k0.f146607B = this.f146643A;
        c34824k0.f146608C = this.f146644B;
        c34824k0.f146609D = this.f146645C;
        c34824k0.f146610E = this.f146646D;
        c34824k0.f146611F = this.f146647E;
        return c34824k0;
    }

    /* JADX INFO: renamed from: b */
    public final C40571o m109898b(C34832o0 request) {
        AbstractC22676k.m65750j(request, "request");
        return new C40571o(this, request, false);
    }

    /* JADX INFO: renamed from: c */
    public final C23886g m109899c(C34832o0 request, AbstractC34814f1 listener) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(listener, "listener");
        C23886g c23886g = new C23886g(this.f146647E, request, listener, new Random(), this.f146643A, this.f146645C, this.f146644B);
        c23886g.m70162c(this);
        return c23886g;
    }

    public C34826l0() {
        this(new C34824k0());
    }
}
