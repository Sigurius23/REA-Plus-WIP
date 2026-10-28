package zd3;

import ae3.InterfaceC0798f;
import be3.C3185g;
import c41.C4068m;
import fe3.AbstractC14421e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import je3.C21630c;
import m83.AbstractC25265s;
import ne3.AbstractC26602a;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.C26622k;
import ne3.C26624l;
import ne3.C26637r0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p474s.C31983m2;
import p505ts.AbstractC34132o;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import p83.C28975a;
import ud3.AbstractC34798a0;
import ud3.C34797a;
import ud3.C34802b1;
import ud3.C34804c0;
import ud3.C34810e0;
import ud3.C34825l;
import ud3.C34831o;
import ud3.C34832o0;
import ud3.C34837r;
import ud3.C34841t;
import ud3.C34848w0;
import ud3.C34850x0;
import ud3.EnumC34828m0;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import yb3.AbstractC39415s;
import yd3.C39473d;

/* JADX INFO: renamed from: zd3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C40559c implements InterfaceC40578v, InterfaceC0798f {

    /* JADX INFO: renamed from: a */
    public final C39473d f174647a;

    /* JADX INFO: renamed from: b */
    public final C40573q f174648b;

    /* JADX INFO: renamed from: c */
    public final int f174649c;

    /* JADX INFO: renamed from: d */
    public final int f174650d;

    /* JADX INFO: renamed from: e */
    public final int f174651e;

    /* JADX INFO: renamed from: f */
    public final int f174652f;

    /* JADX INFO: renamed from: g */
    public final int f174653g;

    /* JADX INFO: renamed from: h */
    public final boolean f174654h;

    /* JADX INFO: renamed from: i */
    public final C40571o f174655i;

    /* JADX INFO: renamed from: j */
    public final C40574r f174656j;

    /* JADX INFO: renamed from: k */
    public final C34802b1 f174657k;

    /* JADX INFO: renamed from: l */
    public final List f174658l;

    /* JADX INFO: renamed from: m */
    public final int f174659m;

    /* JADX INFO: renamed from: n */
    public final C34832o0 f174660n;

    /* JADX INFO: renamed from: o */
    public final int f174661o;

    /* JADX INFO: renamed from: p */
    public final boolean f174662p;

    /* JADX INFO: renamed from: q */
    public volatile boolean f174663q;

    /* JADX INFO: renamed from: r */
    public Socket f174664r;

    /* JADX INFO: renamed from: s */
    public Socket f174665s;

    /* JADX INFO: renamed from: t */
    public C34804c0 f174666t;

    /* JADX INFO: renamed from: u */
    public EnumC34828m0 f174667u;

    /* JADX INFO: renamed from: v */
    public C31983m2 f174668v;

    /* JADX INFO: renamed from: w */
    public C40572p f174669w;

    public C40559c(C39473d taskRunner, C40573q connectionPool, int i13, int i14, int i15, int i16, int i17, boolean z4, C40571o c40571o, C40574r c40574r, C34802b1 route, List list, int i18, C34832o0 c34832o0, int i19, boolean z13) {
        AbstractC22676k.m65750j(taskRunner, "taskRunner");
        AbstractC22676k.m65750j(connectionPool, "connectionPool");
        AbstractC22676k.m65750j(route, "route");
        this.f174647a = taskRunner;
        this.f174648b = connectionPool;
        this.f174649c = i13;
        this.f174650d = i14;
        this.f174651e = i15;
        this.f174652f = i16;
        this.f174653g = i17;
        this.f174654h = z4;
        this.f174655i = c40571o;
        this.f174656j = c40574r;
        this.f174657k = route;
        this.f174658l = list;
        this.f174659m = i18;
        this.f174660n = c34832o0;
        this.f174661o = i19;
        this.f174662p = z13;
    }

    /* JADX INFO: renamed from: l */
    public static C40559c m131521l(C40559c c40559c, int i13, C34832o0 c34832o0, int i14, boolean z4, int i15) {
        return new C40559c(c40559c.f174647a, c40559c.f174648b, c40559c.f174649c, c40559c.f174650d, c40559c.f174651e, c40559c.f174652f, c40559c.f174653g, c40559c.f174654h, c40559c.f174655i, c40559c.f174656j, c40559c.f174657k, c40559c.f174658l, (i15 & 1) != 0 ? c40559c.f174659m : i13, (i15 & 2) != 0 ? c40559c.f174660n : c34832o0, (i15 & 4) != 0 ? c40559c.f174661o : i14, (i15 & 8) != 0 ? c40559c.f174662p : z4);
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: a */
    public final C40572p mo131522a() {
        C40576t c40576t = this.f174655i.f174721w.f146646D;
        C34802b1 route = this.f174657k;
        synchronized (c40576t) {
            AbstractC22676k.m65750j(route, "route");
            ((LinkedHashSet) c40576t.f174764a).remove(route);
        }
        C40572p c40572p = this.f174669w;
        AbstractC22676k.m65747g(c40572p);
        AbstractC22676k.m65750j(this.f174657k, "route");
        C40575s c40575sM131563d = this.f174656j.m131563d(this, this.f174658l);
        if (c40575sM131563d != null) {
            return c40575sM131563d.f174763a;
        }
        synchronized (c40572p) {
            C40573q c40573q = this.f174648b;
            c40573q.getClass();
            TimeZone timeZone = AbstractC37174h.f158962a;
            c40573q.f174745d.add(c40572p);
            c40573q.f174743b.m126120d(c40573q.f174744c, 0L);
            this.f174655i.m131546b(c40572p);
        }
        C40571o c40571o = this.f174655i;
        c40571o.f174705E.connectionAcquired(c40571o, c40572p);
        return c40572p;
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: b */
    public final boolean mo131523b() {
        return this.f174667u != null;
    }

    @Override // ae3.InterfaceC0798f
    /* JADX INFO: renamed from: c */
    public final void mo1920c() {
    }

    @Override // zd3.InterfaceC40578v, ae3.InterfaceC0798f
    public final void cancel() {
        this.f174663q = true;
        Socket socket = this.f174664r;
        if (socket != null) {
            AbstractC37174h.m119136c(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0187  */
    /* JADX WARN: Code duplicated, block: B:106:0x018b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055 A[Catch: all -> 0x0033, IOException -> 0x0037, TRY_ENTER, TryCatch #3 {IOException -> 0x0037, blocks: (B:9:0x0026, B:11:0x002e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3), top: B:126:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0033, IOException -> 0x0037, TryCatch #3 {IOException -> 0x0037, blocks: (B:9:0x0026, B:11:0x002e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3), top: B:126:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[Catch: all -> 0x0033, IOException -> 0x0037, TryCatch #3 {IOException -> 0x0037, blocks: (B:9:0x0026, B:11:0x002e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3), top: B:126:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[Catch: all -> 0x0033, IOException -> 0x0037, TryCatch #3 {IOException -> 0x0037, blocks: (B:9:0x0026, B:11:0x002e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3), top: B:126:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0075 A[Catch: all -> 0x0033, IOException -> 0x0037, TRY_LEAVE, TryCatch #3 {IOException -> 0x0037, blocks: (B:9:0x0026, B:11:0x002e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3), top: B:126:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4 A[Catch: all -> 0x0033, IOException -> 0x0037, TRY_ENTER, TryCatch #3 {IOException -> 0x0037, blocks: (B:9:0x0026, B:11:0x002e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3), top: B:126:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[Catch: all -> 0x0033, IOException -> 0x0037, TryCatch #3 {IOException -> 0x0037, blocks: (B:9:0x0026, B:11:0x002e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3), top: B:126:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4 A[Catch: all -> 0x0033, IOException -> 0x0141, TRY_ENTER, TryCatch #5 {all -> 0x0033, blocks: (B:7:0x0022, B:9:0x0026, B:11:0x002e, B:24:0x004e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:36:0x009b, B:52:0x00d7, B:53:0x00e9, B:55:0x00f2, B:57:0x00f6, B:59:0x0108, B:72:0x0134, B:73:0x0137, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3, B:46:0x00c4, B:50:0x00d3, B:49:0x00d1), top: B:129:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1 A[Catch: all -> 0x0033, IOException -> 0x0141, TryCatch #5 {all -> 0x0033, blocks: (B:7:0x0022, B:9:0x0026, B:11:0x002e, B:24:0x004e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:36:0x009b, B:52:0x00d7, B:53:0x00e9, B:55:0x00f2, B:57:0x00f6, B:59:0x0108, B:72:0x0134, B:73:0x0137, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3, B:46:0x00c4, B:50:0x00d3, B:49:0x00d1), top: B:129:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6 A[Catch: all -> 0x0033, IOException -> 0x0130, TRY_LEAVE, TryCatch #5 {all -> 0x0033, blocks: (B:7:0x0022, B:9:0x0026, B:11:0x002e, B:24:0x004e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:36:0x009b, B:52:0x00d7, B:53:0x00e9, B:55:0x00f2, B:57:0x00f6, B:59:0x0108, B:72:0x0134, B:73:0x0137, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3, B:46:0x00c4, B:50:0x00d3, B:49:0x00d1), top: B:129:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [zd3.v] */
    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: d */
    public final C40577u mo131524d() throws Throwable {
        C40573q c40573q;
        C31983m2 c31983m2;
        IOException iOException;
        boolean z4;
        boolean z13;
        C40559c c40559c;
        ?? r10;
        Socket socket;
        List list;
        EnumC34828m0 enumC34828m0;
        C40559c c40559cM131530m;
        C31983m2 c31983m3;
        C39473d c39473d;
        C40573q c40573q2;
        C34802b1 c34802b1;
        Socket socket2;
        C34804c0 c34804c0;
        EnumC34828m0 enumC34828m1;
        C31983m2 c31983m4;
        C31983m2 c31983m5;
        C40573q c40573q3 = this.f174648b;
        C40571o c40571o = this.f174655i;
        AbstractC34798a0 abstractC34798a0 = c40571o.f174705E;
        CopyOnWriteArrayList copyOnWriteArrayList = c40571o.f174720T;
        Socket socket3 = this.f174664r;
        if (socket3 == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (mo131523b()) {
            throw new IllegalStateException("already connected");
        }
        C34802b1 c34802b2 = this.f174657k;
        C34797a c34797a = c34802b2.f146527a;
        Proxy proxy = c34802b2.f146528b;
        C34797a c34797a2 = c34802b2.f146527a;
        List list2 = c34797a.f146521j;
        copyOnWriteArrayList.add(this);
        C40559c c40559c2 = null;
        c40559c2 = null;
        try {
            try {
                if (this.f174660n == null) {
                    if (c34797a2.f146514c != null) {
                        c31983m4 = this.f174668v;
                        if (c31983m4 != null) {
                            AbstractC22676k.m65757q("socket");
                            throw null;
                        }
                        if (((C26621j0) c31983m4.f132769x).f105872x.mo79222o()) {
                            c31983m5 = this.f174668v;
                            if (c31983m5 != null) {
                                AbstractC22676k.m65757q("socket");
                                throw null;
                            }
                            if (((C26617h0) c31983m5.f132770y).f105868x.mo79222o()) {
                                abstractC34798a0.secureConnectStart(c40571o);
                                SSLSocketFactory sSLSocketFactory = c34797a2.f146514c;
                                C34810e0 c34810e0 = c34797a2.f146519h;
                                Socket socketCreateSocket = sSLSocketFactory.createSocket(socket3, c34810e0.f146565d, c34810e0.f146566e, true);
                                AbstractC22676k.m65748h(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                                SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                                C40559c c40559cM131531n = m131531n(list2, sSLSocket);
                                C34837r c34837r = (C34837r) list2.get(c40559cM131531n.f174661o);
                                c40559cM131530m = c40559cM131531n.m131530m(list2, sSLSocket);
                                c34837r.m109911a(sSLSocket, c40559cM131531n.f174662p);
                                m131528j(sSLSocket, c34837r);
                                abstractC34798a0.secureConnectEnd(c40571o, this.f174666t);
                                c31983m3 = null;
                            }
                        }
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    this.f174665s = socket3;
                    list = c34797a2.f146520i;
                    enumC34828m0 = EnumC34828m0.H2_PRIOR_KNOWLEDGE;
                    if (list.contains(enumC34828m0)) {
                        enumC34828m0 = EnumC34828m0.HTTP_1_1;
                    }
                    this.f174667u = enumC34828m0;
                    c40559cM131530m = null;
                    c31983m3 = null;
                    c39473d = this.f174647a;
                    c40573q2 = this.f174648b;
                    c34802b1 = this.f174657k;
                    socket2 = this.f174665s;
                    AbstractC22676k.m65747g(socket2);
                    c34804c0 = this.f174666t;
                    enumC34828m1 = this.f174667u;
                    AbstractC22676k.m65747g(enumC34828m1);
                    c40573q = c40573q3;
                    c31983m2 = this.f174668v;
                    if (c31983m2 != null) {
                        AbstractC22676k.m65757q("socket");
                        throw null;
                    }
                    int i13 = this.f174653g;
                    c40573q.getClass();
                    c31983m2 = null;
                    C40572p c40572p = new C40572p(c39473d, c40573q2, c34802b1, socket3, socket2, c34804c0, enumC34828m1, c31983m2, i13);
                    this.f174669w = c40572p;
                    c40572p.m131558i();
                    abstractC34798a0.connectEnd(c40571o, c34802b2.f146529c, proxy, this.f174667u);
                    C40577u c40577u = new C40577u(this, null, null, 6);
                    copyOnWriteArrayList.remove(this);
                    return c40577u;
                    iOException = e;
                    c40559c2 = c40559cM131530m;
                    z13 = false;
                    c40559c = c40559c2;
                    c40571o.f174705E.connectFailed(c40571o, c34802b2.f146529c, proxy, null, iOException);
                    c40573q.getClass();
                    if (this.f174654h) {
                        r10 = c31983m2;
                    } else {
                        r10 = c31983m2;
                    }
                    C40577u c40577u2 = new C40577u(this, r10, iOException);
                    copyOnWriteArrayList.remove(this);
                    if (!z13) {
                        socket = this.f174665s;
                        if (socket != null) {
                            AbstractC37174h.m119136c(socket);
                        }
                        AbstractC37174h.m119136c(socket3);
                    }
                    return c40577u2;
                }
                try {
                    C40577u c40577uM131529k = m131529k();
                    if (c40577uM131529k.f174766b != null || c40577uM131529k.f174767c != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket4 = this.f174665s;
                        if (socket4 != null) {
                            AbstractC37174h.m119136c(socket4);
                        }
                        AbstractC37174h.m119136c(socket3);
                        return c40577uM131529k;
                    }
                    if (c34797a2.f146514c != null) {
                        c31983m4 = this.f174668v;
                        if (c31983m4 != null) {
                            AbstractC22676k.m65757q("socket");
                            throw null;
                        }
                        if (((C26621j0) c31983m4.f132769x).f105872x.mo79222o()) {
                            c31983m5 = this.f174668v;
                            if (c31983m5 != null) {
                                AbstractC22676k.m65757q("socket");
                                throw null;
                            }
                            if (((C26617h0) c31983m5.f132770y).f105868x.mo79222o()) {
                                abstractC34798a0.secureConnectStart(c40571o);
                                SSLSocketFactory sSLSocketFactory2 = c34797a2.f146514c;
                                C34810e0 c34810e1 = c34797a2.f146519h;
                                Socket socketCreateSocket2 = sSLSocketFactory2.createSocket(socket3, c34810e1.f146565d, c34810e1.f146566e, true);
                                AbstractC22676k.m65748h(socketCreateSocket2, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                                SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket2;
                                C40559c c40559cM131531n2 = m131531n(list2, sSLSocket2);
                                C34837r c34837r2 = (C34837r) list2.get(c40559cM131531n2.f174661o);
                                c40559cM131530m = c40559cM131531n2.m131530m(list2, sSLSocket2);
                                try {
                                    c34837r2.m109911a(sSLSocket2, c40559cM131531n2.f174662p);
                                    m131528j(sSLSocket2, c34837r2);
                                    abstractC34798a0.secureConnectEnd(c40571o, this.f174666t);
                                    c31983m3 = null;
                                } catch (IOException e5) {
                                    iOException = e5;
                                    c40573q = c40573q3;
                                    c31983m2 = null;
                                    z13 = false;
                                    c40559c = c40559cM131530m;
                                }
                            }
                        }
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    this.f174665s = socket3;
                    list = c34797a2.f146520i;
                    enumC34828m0 = EnumC34828m0.H2_PRIOR_KNOWLEDGE;
                    if (list.contains(enumC34828m0)) {
                        enumC34828m0 = EnumC34828m0.HTTP_1_1;
                    }
                    this.f174667u = enumC34828m0;
                    c40559cM131530m = null;
                    c31983m3 = null;
                    try {
                        c39473d = this.f174647a;
                        c40573q2 = this.f174648b;
                        c34802b1 = this.f174657k;
                        socket2 = this.f174665s;
                        AbstractC22676k.m65747g(socket2);
                        try {
                            c34804c0 = this.f174666t;
                            enumC34828m1 = this.f174667u;
                            AbstractC22676k.m65747g(enumC34828m1);
                            c40573q = c40573q3;
                            try {
                                c31983m2 = this.f174668v;
                                try {
                                    if (c31983m2 != null) {
                                        AbstractC22676k.m65757q("socket");
                                        throw null;
                                    }
                                    int i14 = this.f174653g;
                                    c40573q.getClass();
                                    c31983m2 = null;
                                    C40572p c40572p2 = new C40572p(c39473d, c40573q2, c34802b1, socket3, socket2, c34804c0, enumC34828m1, c31983m2, i14);
                                    this.f174669w = c40572p2;
                                    c40572p2.m131558i();
                                    abstractC34798a0.connectEnd(c40571o, c34802b2.f146529c, proxy, this.f174667u);
                                    try {
                                        C40577u c40577u3 = new C40577u(this, null, null, 6);
                                        copyOnWriteArrayList.remove(this);
                                        return c40577u3;
                                    } catch (IOException e13) {
                                        iOException = e13;
                                        c40559c = c40559cM131530m;
                                        z13 = true;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z4 = true;
                                    }
                                } catch (IOException e14) {
                                    e = e14;
                                    iOException = e;
                                    c40559c2 = c40559cM131530m;
                                    z13 = false;
                                    c40559c = c40559c2;
                                }
                            } catch (IOException e15) {
                                e = e15;
                                c31983m2 = null;
                            }
                        } catch (IOException e16) {
                            e = e16;
                            c40573q = c40573q3;
                        }
                    } catch (IOException e17) {
                        e = e17;
                        c40573q = c40573q3;
                        c31983m2 = c31983m3;
                    }
                    iOException = e;
                    c40559c2 = c40559cM131530m;
                } catch (IOException e18) {
                    iOException = e18;
                    c40573q = c40573q3;
                    c31983m2 = null;
                }
                z13 = false;
                c40559c = c40559c2;
                try {
                    c40571o.f174705E.connectFailed(c40571o, c34802b2.f146529c, proxy, null, iOException);
                    c40573q.getClass();
                    if (this.f174654h || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException))) {
                        r10 = c31983m2;
                    } else {
                        r10 = c40559c;
                    }
                    C40577u c40577u4 = new C40577u(this, r10, iOException);
                    copyOnWriteArrayList.remove(this);
                    if (!z13) {
                        socket = this.f174665s;
                        if (socket != null) {
                            AbstractC37174h.m119136c(socket);
                        }
                        AbstractC37174h.m119136c(socket3);
                    }
                    return c40577u4;
                } catch (Throwable th4) {
                    th = th4;
                    z4 = z13;
                }
            } catch (Throwable th5) {
                th = th5;
                z4 = false;
            }
        } catch (IOException e19) {
            c40573q = c40573q3;
            c31983m2 = null;
            iOException = e19;
        }
        copyOnWriteArrayList.remove(this);
        if (!z4) {
            Socket socket5 = this.f174665s;
            if (socket5 != null) {
                AbstractC37174h.m119136c(socket5);
            }
            AbstractC37174h.m119136c(socket3);
        }
        throw th;
    }

    @Override // ae3.InterfaceC0798f
    /* JADX INFO: renamed from: e */
    public final C34802b1 mo1921e() {
        return this.f174657k;
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: f */
    public final InterfaceC40578v mo131525f() {
        return new C40559c(this.f174647a, this.f174648b, this.f174649c, this.f174650d, this.f174651e, this.f174652f, this.f174653g, this.f174654h, this.f174655i, this.f174656j, this.f174657k, this.f174658l, this.f174659m, this.f174660n, this.f174661o, this.f174662p);
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: g */
    public final C40577u mo131526g() throws Throwable {
        Socket socket;
        Socket socket2;
        C40573q c40573q = this.f174648b;
        C34802b1 c34802b1 = this.f174657k;
        C40571o c40571o = this.f174655i;
        CopyOnWriteArrayList copyOnWriteArrayList = c40571o.f174720T;
        if (this.f174664r != null) {
            throw new IllegalStateException("TCP already connected");
        }
        copyOnWriteArrayList.add(this);
        boolean z4 = false;
        try {
            c40571o.f174705E.connectStart(c40571o, c34802b1.f146529c, c34802b1.f146528b);
            c40573q.getClass();
            m131527i();
            z4 = true;
            C40577u c40577u = new C40577u(this, null, null, 6);
            copyOnWriteArrayList.remove(this);
            return c40577u;
        } catch (IOException e5) {
            boolean z13 = z4;
            try {
                C34797a c34797a = c34802b1.f146527a;
                if (c34802b1.f146528b.type() != Proxy.Type.DIRECT) {
                    C34797a c34797a2 = c34802b1.f146527a;
                    c34797a2.f146518g.connectFailed(c34797a2.f146519h.m109882k(), c34802b1.f146528b.address(), e5);
                }
                c40571o.f174705E.connectFailed(c40571o, c34802b1.f146529c, c34802b1.f146528b, null, e5);
                c40573q.getClass();
                C40577u c40577u2 = new C40577u(this, null, e5, 2);
                copyOnWriteArrayList.remove(this);
                if (!z13 && (socket2 = this.f174664r) != null) {
                    AbstractC37174h.m119136c(socket2);
                }
                return c40577u2;
            } catch (Throwable th3) {
                th = th3;
                z4 = z13;
                copyOnWriteArrayList.remove(this);
                if (!z4 && (socket = this.f174664r) != null) {
                    AbstractC37174h.m119136c(socket);
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            copyOnWriteArrayList.remove(this);
            if (!z4) {
                AbstractC37174h.m119136c(socket);
            }
            throw th;
        }
    }

    @Override // ae3.InterfaceC0798f
    /* JADX INFO: renamed from: h */
    public final void mo1922h(C40571o c40571o, IOException iOException) {
    }

    /* JADX INFO: renamed from: i */
    public final void m131527i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f174657k.f146528b.type();
        int i13 = type == null ? -1 : AbstractC40558b.f174646a[type.ordinal()];
        if (i13 == 1 || i13 == 2) {
            socketCreateSocket = this.f174657k.f146527a.f146513b.createSocket();
            AbstractC22676k.m65747g(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.f174657k.f146528b);
        }
        this.f174664r = socketCreateSocket;
        if (this.f174663q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f174652f);
        try {
            AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
            AbstractC14421e.f52594a.mo41125f(socketCreateSocket, this.f174657k.f146529c, this.f174651e);
            try {
                this.f174668v = new C31983m2(new C41113q(socketCreateSocket));
            } catch (NullPointerException e5) {
                if (AbstractC22676k.m65745e(e5.getMessage(), "throw with null exception")) {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e13) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f174657k.f146529c);
            connectException.initCause(e13);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m131528j(SSLSocket sSLSocket, C34837r c34837r) {
        String strMo41118g;
        EnumC34828m0 enumC34828m0M109917e;
        C34797a c34797a = this.f174657k.f146527a;
        try {
            if (c34837r.f146727b) {
                AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
                AbstractC14421e.f52594a.mo41117e(sSLSocket, c34797a.f146519h.f146565d, c34797a.f146520i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            AbstractC22676k.m65747g(session);
            C34804c0 c34804c0M107892u = AbstractC34132o.m107892u(session);
            HostnameVerifier hostnameVerifier = c34797a.f146515d;
            AbstractC22676k.m65747g(hostnameVerifier);
            if (hostnameVerifier.verify(c34797a.f146519h.f146565d, session)) {
                C34825l c34825l = c34797a.f146516e;
                AbstractC22676k.m65747g(c34825l);
                this.f174666t = new C34804c0(c34804c0M107892u.f146531a, c34804c0M107892u.f146532b, c34804c0M107892u.f146533c, new C4068m(c34825l, c34804c0M107892u, c34797a, 4));
                String hostname = c34797a.f146519h.f146565d;
                AbstractC22676k.m65750j(hostname, "hostname");
                Iterator it = c34825l.f146639a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (c34837r.f146727b) {
                    AbstractC14421e abstractC14421e2 = AbstractC14421e.f52594a;
                    strMo41118g = AbstractC14421e.f52594a.mo41118g(sSLSocket);
                } else {
                    strMo41118g = null;
                }
                this.f174665s = sSLSocket;
                this.f174668v = new C31983m2(new C41113q(sSLSocket));
                if (strMo41118g != null) {
                    EnumC34828m0.f146683x.getClass();
                    enumC34828m0M109917e = C34841t.m109917e(strMo41118g);
                } else {
                    enumC34828m0M109917e = EnumC34828m0.HTTP_1_1;
                }
                this.f174667u = enumC34828m0M109917e;
                AbstractC14421e abstractC14421e3 = AbstractC14421e.f52594a;
                AbstractC14421e.f52594a.getClass();
                return;
            }
            List listM109862a = c34804c0M107892u.m109862a();
            if (listM109862a.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c34797a.f146519h.f146565d + " not verified (no certificates)");
            }
            Object obj = listM109862a.get(0);
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb4 = new StringBuilder("\n            |Hostname ");
            sb4.append(c34797a.f146519h.f146565d);
            sb4.append(" not verified:\n            |    certificate: ");
            C34825l c34825l2 = C34825l.f146638c;
            C26622k c26622k = C26624l.f105882z;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            AbstractC22676k.m65749i(encoded, "getEncoded(...)");
            sb4.append("sha256/".concat(AbstractC26602a.m79146b(C26622k.m79242c(-1234567890, encoded).mo79252c("SHA-256").f105883w)));
            sb4.append("\n            |    DN: ");
            sb4.append(x509Certificate.getSubjectDN().getName());
            sb4.append("\n            |    subjectAltNames: ");
            sb4.append(AbstractC25265s.m74129g1(C21630c.m60878a(x509Certificate, 7), C21630c.m60878a(x509Certificate, 2)));
            sb4.append("\n            ");
            throw new SSLPeerUnverifiedException(AbstractC39415s.m125910t(sb4.toString()));
        } catch (Throwable th3) {
            AbstractC14421e abstractC14421e4 = AbstractC14421e.f52594a;
            AbstractC14421e.f52594a.getClass();
            AbstractC37174h.m119136c(sSLSocket);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: k */
    public final C40577u m131529k() throws IOException {
        C34832o0 c34832o0Mo31437a;
        C34832o0 c34832o0 = this.f174660n;
        AbstractC22676k.m65747g(c34832o0);
        C34802b1 c34802b1 = this.f174657k;
        C34797a c34797a = c34802b1.f146527a;
        Proxy proxy = c34802b1.f146528b;
        String str = "CONNECT " + AbstractC37174h.m119142i(c34797a.f146519h, true) + " HTTP/1.1";
        while (true) {
            C31983m2 c31983m2 = this.f174668v;
            if (c31983m2 == null) {
                AbstractC22676k.m65757q("socket");
                throw null;
            }
            C3185g c3185g = new C3185g(null, this, c31983m2);
            C31983m2 c31983m3 = this.f174668v;
            if (c31983m3 == null) {
                AbstractC22676k.m65757q("socket");
                throw null;
            }
            C26637r0 c26637r0Timeout = ((C26621j0) c31983m3.f132769x).f105871w.timeout();
            long j7 = this.f174649c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c26637r0Timeout.mo79277g(j7, timeUnit);
            C31983m2 c31983m4 = this.f174668v;
            if (c31983m4 == null) {
                AbstractC22676k.m65757q("socket");
                throw null;
            }
            ((C26617h0) c31983m4.f132770y).f105867w.timeout().mo79277g(this.f174650d, timeUnit);
            c3185g.m9167m(c34832o0.f146714c, str);
            c3185g.mo1923a();
            C34848w0 c34848w0Mo1927e = c3185g.mo1927e(false);
            AbstractC22676k.m65747g(c34848w0Mo1927e);
            c34848w0Mo1927e.f146761a = c34832o0;
            C34850x0 c34850x0M109930a = c34848w0Mo1927e.m109930a();
            int i13 = c34850x0M109930a.f146792z;
            c3185g.m9166l(c34850x0M109930a);
            if (i13 == 200) {
                c34832o0Mo31437a = null;
                break;
            }
            if (i13 != 407) {
                throw new IOException(AbstractC2875y.m8295h(i13, "Unexpected response code for CONNECT: "));
            }
            c34832o0Mo31437a = c34802b1.f146527a.f146517f.mo31437a(c34802b1, c34850x0M109930a);
            if (c34832o0Mo31437a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            String strM109863a = c34850x0M109930a.f146777F.m109863a("Connection");
            if (strM109863a == null) {
                strM109863a = null;
            }
            if ("close".equalsIgnoreCase(strM109863a)) {
                break;
            }
            c34832o0 = c34832o0Mo31437a;
        }
        if (c34832o0Mo31437a == null) {
            return new C40577u(this, null, null, 6);
        }
        Socket socket = this.f174664r;
        if (socket != null) {
            AbstractC37174h.m119136c(socket);
        }
        int i14 = this.f174659m + 1;
        C40571o c40571o = this.f174655i;
        if (i14 < 21) {
            c40571o.f174705E.connectEnd(c40571o, c34802b1.f146529c, proxy, null);
            return new C40577u(this, m131521l(this, i14, c34832o0Mo31437a, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        c40571o.f174705E.connectFailed(c40571o, c34802b1.f146529c, proxy, null, protocolException);
        this.f174648b.getClass();
        return new C40577u(this, null, protocolException, 2);
    }

    /* JADX INFO: renamed from: m */
    public final C40559c m131530m(List connectionSpecs, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        AbstractC22676k.m65750j(connectionSpecs, "connectionSpecs");
        int i13 = this.f174661o;
        int size = connectionSpecs.size();
        for (int i14 = i13 + 1; i14 < size; i14++) {
            C34837r c34837r = (C34837r) connectionSpecs.get(i14);
            c34837r.getClass();
            if (c34837r.f146726a && (((strArr = c34837r.f146729d) == null || AbstractC37172f.m119123h(strArr, sSLSocket.getEnabledProtocols(), C28975a.f117211w)) && ((strArr2 = c34837r.f146728c) == null || AbstractC37172f.m119123h(strArr2, sSLSocket.getEnabledCipherSuites(), C34831o.f146693c)))) {
                return m131521l(this, 0, null, i14, i13 != -1, 3);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final C40559c m131531n(List connectionSpecs, SSLSocket sSLSocket) throws UnknownServiceException {
        AbstractC22676k.m65750j(connectionSpecs, "connectionSpecs");
        if (this.f174661o != -1) {
            return this;
        }
        C40559c c40559cM131530m = m131530m(connectionSpecs, sSLSocket);
        if (c40559cM131530m != null) {
            return c40559cM131530m;
        }
        StringBuilder sb4 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        AbstractC25012a.m73391x(", modes=", ", supported protocols=", sb4, connectionSpecs, this.f174662p);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        AbstractC22676k.m65747g(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        AbstractC22676k.m65749i(string, "toString(...)");
        sb4.append(string);
        throw new UnknownServiceException(sb4.toString());
    }
}
