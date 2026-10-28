package zd3;

import ae3.InterfaceC0798f;
import ce3.AbstractC4506g;
import ce3.AbstractC4513n;
import ce3.C4498b;
import ce3.C4503d0;
import ce3.C4516q;
import ce3.C4524y;
import ce3.C4525z;
import ce3.EnumC4496a;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import je3.C21630c;
import ne3.C26621j0;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p005a3.C0212i2;
import p474s.C31983m2;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34797a;
import ud3.C34802b1;
import ud3.C34804c0;
import ud3.C34810e0;
import ud3.C34825l;
import ud3.C34826l0;
import ud3.EnumC34828m0;
import ud3.InterfaceC34833p;
import wd3.AbstractC37174h;
import yd3.C39472c;
import yd3.C39473d;

/* JADX INFO: renamed from: zd3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C40572p extends AbstractC4513n implements InterfaceC34833p, InterfaceC0798f {

    /* JADX INFO: renamed from: b */
    public final C39473d f174725b;

    /* JADX INFO: renamed from: c */
    public final C34802b1 f174726c;

    /* JADX INFO: renamed from: d */
    public final Socket f174727d;

    /* JADX INFO: renamed from: e */
    public final Socket f174728e;

    /* JADX INFO: renamed from: f */
    public final C34804c0 f174729f;

    /* JADX INFO: renamed from: g */
    public final EnumC34828m0 f174730g;

    /* JADX INFO: renamed from: h */
    public final C31983m2 f174731h;

    /* JADX INFO: renamed from: i */
    public final int f174732i;

    /* JADX INFO: renamed from: j */
    public C4516q f174733j;

    /* JADX INFO: renamed from: k */
    public boolean f174734k;

    /* JADX INFO: renamed from: l */
    public boolean f174735l;

    /* JADX INFO: renamed from: m */
    public int f174736m;

    /* JADX INFO: renamed from: n */
    public int f174737n;

    /* JADX INFO: renamed from: o */
    public int f174738o;

    /* JADX INFO: renamed from: p */
    public int f174739p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f174740q;

    /* JADX INFO: renamed from: r */
    public long f174741r;

    public C40572p(C39473d taskRunner, C40573q connectionPool, C34802b1 route, Socket rawSocket, Socket javaNetSocket, C34804c0 c34804c0, EnumC34828m0 protocol, C31983m2 socket, int i13) {
        AbstractC22676k.m65750j(taskRunner, "taskRunner");
        AbstractC22676k.m65750j(connectionPool, "connectionPool");
        AbstractC22676k.m65750j(route, "route");
        AbstractC22676k.m65750j(rawSocket, "rawSocket");
        AbstractC22676k.m65750j(javaNetSocket, "javaNetSocket");
        AbstractC22676k.m65750j(protocol, "protocol");
        AbstractC22676k.m65750j(socket, "socket");
        this.f174725b = taskRunner;
        this.f174726c = route;
        this.f174727d = rawSocket;
        this.f174728e = javaNetSocket;
        this.f174729f = c34804c0;
        this.f174730g = protocol;
        this.f174731h = socket;
        this.f174732i = i13;
        this.f174739p = 1;
        this.f174740q = new ArrayList();
        this.f174741r = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static void m131555d(C34826l0 c34826l0, C34802b1 failedRoute, IOException failure) {
        AbstractC22676k.m65750j(failedRoute, "failedRoute");
        AbstractC22676k.m65750j(failure, "failure");
        if (failedRoute.f146528b.type() != Proxy.Type.DIRECT) {
            C34797a c34797a = failedRoute.f146527a;
            c34797a.f146518g.connectFailed(c34797a.f146519h.m109882k(), failedRoute.f146528b.address(), failure);
        }
        C40576t c40576t = c34826l0.f146646D;
        synchronized (c40576t) {
            ((LinkedHashSet) c40576t.f174764a).add(failedRoute);
        }
    }

    @Override // ce3.AbstractC4513n
    /* JADX INFO: renamed from: a */
    public final void mo14131a(C4516q c4516q, C4503d0 settings) {
        AbstractC22676k.m65750j(settings, "settings");
        synchronized (this) {
            this.f174739p = (settings.f18142a & 8) != 0 ? settings.f18143b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // ce3.AbstractC4513n
    /* JADX INFO: renamed from: b */
    public final void mo14130b(C4524y c4524y) {
        c4524y.m14151c(EnumC4496a.REFUSED_STREAM, null);
    }

    @Override // ae3.InterfaceC0798f
    /* JADX INFO: renamed from: c */
    public final void mo1920c() {
        synchronized (this) {
            this.f174734k = true;
        }
    }

    @Override // ae3.InterfaceC0798f
    public final void cancel() {
        AbstractC37174h.m119136c(this.f174727d);
    }

    @Override // ae3.InterfaceC0798f
    /* JADX INFO: renamed from: e */
    public final C34802b1 mo1921e() {
        return this.f174726c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m131556f(C34797a c34797a, List list) {
        C34810e0 c34810e0 = c34797a.f146519h;
        TimeZone timeZone = AbstractC37174h.f158962a;
        if (this.f174740q.size() < this.f174739p && !this.f174734k) {
            C34802b1 c34802b1 = this.f174726c;
            C34797a c34797a2 = c34802b1.f146527a;
            C34797a c34797a3 = c34802b1.f146527a;
            if (c34797a2.m109857a(c34797a)) {
                String str = c34810e0.f146565d;
                String hostname = c34810e0.f146565d;
                if (AbstractC22676k.m65745e(str, c34797a3.f146519h.f146565d)) {
                    return true;
                }
                if (this.f174733j != null && list != null) {
                    List<C34802b1> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (C34802b1 c34802b2 : list2) {
                            Proxy.Type type = c34802b2.f146528b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && c34802b1.f146528b.type() == type2 && AbstractC22676k.m65745e(c34802b1.f146529c, c34802b2.f146529c)) {
                                if (c34797a.f146515d != C21630c.f83064a) {
                                    break;
                                }
                                TimeZone timeZone2 = AbstractC37174h.f158962a;
                                C34810e0 c34810e1 = c34797a3.f146519h;
                                if (c34810e0.f146566e != c34810e1.f146566e) {
                                    break;
                                }
                                boolean zM65745e = AbstractC22676k.m65745e(hostname, c34810e1.f146565d);
                                C34804c0 c34804c0 = this.f174729f;
                                if (!zM65745e) {
                                    if (!this.f174735l && c34804c0 != null) {
                                        List listM109862a = c34804c0.m109862a();
                                        if (listM109862a.isEmpty()) {
                                            break;
                                        }
                                        Object obj = listM109862a.get(0);
                                        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        if (!C21630c.m60879b(hostname, (X509Certificate) obj)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    C34825l c34825l = c34797a.f146516e;
                                    AbstractC22676k.m65747g(c34825l);
                                    AbstractC22676k.m65747g(c34804c0);
                                    List peerCertificates = c34804c0.m109862a();
                                    AbstractC22676k.m65750j(hostname, "hostname");
                                    AbstractC22676k.m65750j(peerCertificates, "peerCertificates");
                                    Iterator it = c34825l.f146639a.iterator();
                                    if (!it.hasNext()) {
                                        return true;
                                    }
                                    it.next().getClass();
                                    throw new ClassCastException();
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m131557g(boolean z4) {
        long j7;
        TimeZone timeZone = AbstractC37174h.f158962a;
        long jNanoTime = System.nanoTime();
        if (this.f174727d.isClosed() || this.f174728e.isClosed() || this.f174728e.isInputShutdown() || this.f174728e.isOutputShutdown()) {
            return false;
        }
        C4516q c4516q = this.f174733j;
        if (c4516q != null) {
            synchronized (c4516q) {
                if (c4516q.f18185F) {
                    return false;
                }
                return c4516q.f18194O >= c4516q.f18193N || jNanoTime < c4516q.f18195P;
            }
        }
        synchronized (this) {
            j7 = jNanoTime - this.f174741r;
        }
        if (j7 < 10000000000L || !z4) {
            return true;
        }
        Socket socket = this.f174728e;
        C26621j0 source = (C26621j0) this.f174731h.f132769x;
        AbstractC22676k.m65750j(socket, "<this>");
        AbstractC22676k.m65750j(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.mo79222o();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // ae3.InterfaceC0798f
    /* JADX INFO: renamed from: h */
    public final void mo1922h(C40571o c40571o, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f174733j != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.f174734k = true;
                        if (this.f174737n == 0) {
                            if (iOException != null) {
                                m131555d(c40571o.f174721w, this.f174726c, iOException);
                            }
                            this.f174736m++;
                        }
                    }
                } else if (((StreamResetException) iOException).f112932w == EnumC4496a.REFUSED_STREAM) {
                    int i13 = this.f174738o + 1;
                    this.f174738o = i13;
                    if (i13 > 1) {
                        this.f174734k = true;
                        this.f174736m++;
                    }
                } else if (((StreamResetException) iOException).f112932w != EnumC4496a.CANCEL || !c40571o.f174718R) {
                    this.f174734k = true;
                    this.f174736m++;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m131558i() throws SocketException {
        this.f174741r = System.nanoTime();
        EnumC34828m0 enumC34828m0 = this.f174730g;
        if (enumC34828m0 == EnumC34828m0.HTTP_2 || enumC34828m0 == EnumC34828m0.H2_PRIOR_KNOWLEDGE) {
            this.f174728e.setSoTimeout(0);
            C4498b c4498b = C4498b.f18121a;
            C39473d taskRunner = this.f174725b;
            AbstractC22676k.m65750j(taskRunner, "taskRunner");
            C0212i2 c0212i2 = new C0212i2();
            c0212i2.f705b = taskRunner;
            c0212i2.f708e = AbstractC4513n.f18176a;
            c0212i2.f709f = C4498b.f18121a;
            C31983m2 socket = this.f174731h;
            String peerName = this.f174726c.f146527a.f146519h.f146565d;
            AbstractC22676k.m65750j(socket, "socket");
            AbstractC22676k.m65750j(peerName, "peerName");
            c0212i2.f706c = socket;
            String str = AbstractC37174h.f158963b + ' ' + peerName;
            AbstractC22676k.m65750j(str, "<set-?>");
            c0212i2.f707d = str;
            c0212i2.f708e = this;
            c0212i2.f704a = this.f174732i;
            c0212i2.f709f = c4498b;
            C4516q c4516q = new C4516q(c0212i2);
            this.f174733j = c4516q;
            C4503d0 c4503d0 = C4516q.f18183a0;
            this.f174739p = (c4503d0.f18142a & 8) != 0 ? c4503d0.f18143b[3] : Integer.MAX_VALUE;
            C4525z c4525z = c4516q.f18203X;
            synchronized (c4525z) {
                try {
                    if (c4525z.f18257z) {
                        throw new IOException("closed");
                    }
                    Logger logger = C4525z.f18252F;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC37174h.m119137d(">> CONNECTION " + AbstractC4506g.f18154a.mo79254e(), new Object[0]));
                    }
                    c4525z.f18254w.mo79191Q(AbstractC4506g.f18154a);
                    c4525z.f18254w.flush();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            C4525z c4525z2 = c4516q.f18203X;
            C4503d0 settings = c4516q.f18197R;
            c4525z2.getClass();
            AbstractC22676k.m65750j(settings, "settings");
            synchronized (c4525z2) {
                try {
                    if (c4525z2.f18257z) {
                        throw new IOException("closed");
                    }
                    c4525z2.m14162i(0, Integer.bitCount(settings.f18142a) * 6, 4, 0);
                    for (int i13 = 0; i13 < 10; i13++) {
                        boolean z4 = true;
                        if (((1 << i13) & settings.f18142a) == 0) {
                            z4 = false;
                        }
                        if (z4) {
                            c4525z2.f18254w.writeShort(i13);
                            c4525z2.f18254w.writeInt(settings.f18143b[i13]);
                        }
                    }
                    c4525z2.f18254w.flush();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            int iM14118a = c4516q.f18197R.m14118a();
            if (iM14118a != 65535) {
                c4516q.f18203X.m14159J(0, iM14118a - 65535);
            }
            C39472c.m126116c(c4516q.f18186G.m126126d(), c4516q.f18208y, 0L, c4516q.f18204Y, 6);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb4 = new StringBuilder("Connection{");
        C34802b1 c34802b1 = this.f174726c;
        sb4.append(c34802b1.f146527a.f146519h.f146565d);
        sb4.append(':');
        sb4.append(c34802b1.f146527a.f146519h.f146566e);
        sb4.append(", proxy=");
        sb4.append(c34802b1.f146528b);
        sb4.append(" hostAddress=");
        sb4.append(c34802b1.f146529c);
        sb4.append(" cipherSuite=");
        C34804c0 c34804c0 = this.f174729f;
        if (c34804c0 == null || (obj = c34804c0.f146532b) == null) {
            obj = "none";
        }
        sb4.append(obj);
        sb4.append(" protocol=");
        sb4.append(this.f174730g);
        sb4.append('}');
        return sb4.toString();
    }
}
