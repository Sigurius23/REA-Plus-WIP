package ae3;

import c33.C3936c;
import com.iterable.iterableapi.C5378v;
import com.whoop.service.network.model.UserSessionDto;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.AbstractC26604b;
import ne3.C26642v;
import okhttp3.internal.http2.ConnectionShutdownException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.time.DurationKt;
import pf.AbstractC29125c;
import pg3.C29203o;
import s93.AbstractC32309k;
import ud3.AbstractC34798a0;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34797a;
import ud3.C34802b1;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34815g;
import ud3.C34817h;
import ud3.C34818h0;
import ud3.C34825l;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34841t;
import ud3.C34848w0;
import ud3.C34850x0;
import ud3.EnumC34828m0;
import ud3.InterfaceC34808d1;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import v63.AbstractC35750h;
import va3.AbstractC35844b;
import va3.AbstractC35846d;
import wb3.AbstractC37056f;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import xd3.C38218a;
import yb3.AbstractC39421y;
import yd3.C39473d;
import zd3.C40563g;
import zd3.C40567k;
import zd3.C40571o;
import zd3.C40572p;
import zd3.C40573q;
import zd3.C40574r;
import zd3.C40580x;
import zd3.InterfaceC40564h;

/* JADX INFO: renamed from: ae3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C0793a implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2942w;

    /* JADX INFO: renamed from: x */
    public final Object f2943x;

    public /* synthetic */ C0793a(Object obj, int i13) {
        this.f2942w = i13;
        this.f2943x = obj;
    }

    /* JADX INFO: renamed from: c */
    public static int m1916c(C34850x0 c34850x0, int i13) {
        String strM109863a = c34850x0.f146777F.m109863a("Retry-After");
        if (strM109863a == null) {
            strM109863a = null;
        }
        if (strM109863a == null) {
            return i13;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strM109863a).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM109863a);
        AbstractC22676k.m65749i(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0129  */
    /* JADX INFO: renamed from: a */
    public C34832o0 m1917a(C34850x0 c34850x0, C40563g c40563g) throws ProtocolException {
        C34826l0 c34826l0;
        String strM109863a;
        C34832o0 c34832o0;
        C5378v c5378vM109879h;
        C34810e0 c34810e0M16526b;
        C34830n0 c34830n0M109907b;
        boolean z4;
        AbstractC34846v0 abstractC34846v0;
        C34850x0 c34850x1;
        C34802b1 c34802b1 = c40563g != null ? c40563g.m131536c().f174726c : null;
        int i13 = c34850x0.f146792z;
        C34832o0 c34832o1 = c34850x0.f146789w;
        String str = c34832o1.f146713b;
        if (i13 == 307 || i13 == 308) {
            c34826l0 = (C34826l0) this.f2943x;
            if (c34826l0.f146656h) {
                strM109863a = c34850x0.f146777F.m109863a("Location");
                if (strM109863a == null) {
                    strM109863a = null;
                }
                c34832o0 = c34850x0.f146789w;
                if (strM109863a != null) {
                    C34810e0 c34810e0 = c34832o0.f146712a;
                    c34810e0.getClass();
                    c5378vM109879h = c34810e0.m109879h(strM109863a);
                    if (c5378vM109879h != null) {
                        c34810e0M16526b = c5378vM109879h.m16526b();
                    } else {
                        c34810e0M16526b = null;
                    }
                    if (c34810e0M16526b != null && (AbstractC22676k.m65745e(c34810e0M16526b.f146562a, c34832o0.f146712a.f146562a) || c34826l0.f146657i)) {
                        c34830n0M109907b = c34832o0.m109907b();
                        if (AbstractC37056f.m118969X(str)) {
                            int i14 = c34850x0.f146792z;
                            z4 = !str.equals("PROPFIND") || i14 == 308 || i14 == 307;
                            if (!str.equals("PROPFIND") || i14 == 308 || i14 == 307) {
                                c34830n0M109907b.m109904e(str, z4 ? c34832o0.f146715d : null);
                            } else {
                                c34830n0M109907b.m109904e("GET", null);
                            }
                            if (!z4) {
                                c34830n0M109907b.f146689c.m65769j("Transfer-Encoding");
                                c34830n0M109907b.f146689c.m65769j("Content-Length");
                                c34830n0M109907b.f146689c.m65769j("Content-Type");
                            }
                        }
                        if (!AbstractC37174h.m119134a(c34832o0.f146712a, c34810e0M16526b)) {
                            c34830n0M109907b.f146689c.m65769j(TokenAuthInterceptor.AUTH_HEADER);
                        }
                        c34830n0M109907b.f146687a = c34810e0M16526b;
                        return new C34832o0(c34830n0M109907b);
                    }
                }
            }
        } else {
            if (i13 == 401) {
                return ((C34826l0) this.f2943x).f146655g.mo31437a(c34802b1, c34850x0);
            }
            if (i13 == 421) {
                AbstractC34846v0 abstractC34846v1 = c34832o1.f146715d;
                if ((abstractC34846v1 == null || !abstractC34846v1.isOneShot()) && c40563g != null && !AbstractC22676k.m65745e(c40563g.f174687c.mo131542b().f174755j.f146519h.f146565d, c40563g.f174688d.mo1932j().mo1921e().f146527a.f146519h.f146565d)) {
                    C40572p c40572pM131536c = c40563g.m131536c();
                    synchronized (c40572pM131536c) {
                        c40572pM131536c.f174735l = true;
                    }
                    return c34850x0.f146789w;
                }
            } else if (i13 == 503) {
                C34850x0 c34850x2 = c34850x0.f146782K;
                if ((c34850x2 == null || c34850x2.f146792z != 503) && m1916c(c34850x0, Integer.MAX_VALUE) == 0) {
                    return c34850x0.f146789w;
                }
            } else {
                if (i13 == 407) {
                    AbstractC22676k.m65747g(c34802b1);
                    if (c34802b1.f146528b.type() == Proxy.Type.HTTP) {
                        return ((C34826l0) this.f2943x).f146662n.mo31437a(c34802b1, c34850x0);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (i13 != 408) {
                    switch (i13) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            c34826l0 = (C34826l0) this.f2943x;
                            if (c34826l0.f146656h) {
                                strM109863a = c34850x0.f146777F.m109863a("Location");
                                if (strM109863a == null) {
                                    strM109863a = null;
                                }
                                c34832o0 = c34850x0.f146789w;
                                if (strM109863a != null) {
                                    C34810e0 c34810e1 = c34832o0.f146712a;
                                    c34810e1.getClass();
                                    c5378vM109879h = c34810e1.m109879h(strM109863a);
                                    if (c5378vM109879h != null) {
                                        c34810e0M16526b = c5378vM109879h.m16526b();
                                    } else {
                                        c34810e0M16526b = null;
                                    }
                                    if (c34810e0M16526b != null) {
                                        c34830n0M109907b = c34832o0.m109907b();
                                        if (AbstractC37056f.m118969X(str)) {
                                            int i15 = c34850x0.f146792z;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                c34830n0M109907b.m109904e(str, z4 ? c34832o0.f146715d : null);
                                            } else {
                                                c34830n0M109907b.m109904e(str, z4 ? c34832o0.f146715d : null);
                                            }
                                            if (!z4) {
                                                c34830n0M109907b.f146689c.m65769j("Transfer-Encoding");
                                                c34830n0M109907b.f146689c.m65769j("Content-Length");
                                                c34830n0M109907b.f146689c.m65769j("Content-Type");
                                            }
                                        }
                                        if (!AbstractC37174h.m119134a(c34832o0.f146712a, c34810e0M16526b)) {
                                            c34830n0M109907b.f146689c.m65769j(TokenAuthInterceptor.AUTH_HEADER);
                                        }
                                        c34830n0M109907b.f146687a = c34810e0M16526b;
                                        return new C34832o0(c34830n0M109907b);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (((C34826l0) this.f2943x).f146653e && (((abstractC34846v0 = c34832o1.f146715d) == null || !abstractC34846v0.isOneShot()) && (((c34850x1 = c34850x0.f146782K) == null || c34850x1.f146792z != 408) && m1916c(c34850x0, 0) <= 0))) {
                    return c34850x0.f146789w;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1918b(IOException iOException, C40571o c40571o, C34832o0 c34832o0) {
        AbstractC34846v0 abstractC34846v0;
        boolean z4 = iOException instanceof ConnectionShutdownException;
        if (!((C34826l0) this.f2943x).f146653e) {
            return false;
        }
        if ((!z4 && (((abstractC34846v0 = c34832o0.f146715d) != null && abstractC34846v0.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z4) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C40563g c40563g = c40571o.f174719S;
        if (c40563g == null || !c40563g.f174690f) {
            return false;
        }
        InterfaceC40564h interfaceC40564h = c40571o.f174709I;
        AbstractC22676k.m65747g(interfaceC40564h);
        C40574r c40574rMo131542b = interfaceC40564h.mo131542b();
        C40563g c40563g2 = c40571o.f174719S;
        return c40574rMo131542b.m131560a(c40563g2 != null ? c40563g2.m131536c() : null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x024b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0252  */
    /* JADX WARN: Code duplicated, block: B:114:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0259  */
    /* JADX WARN: Code duplicated, block: B:117:0x027d  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:137:0x0302  */
    /* JADX WARN: Code duplicated, block: B:138:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x031d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0321 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x0323  */
    /* JADX WARN: Code duplicated, block: B:144:0x032e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0334  */
    /* JADX WARN: Code duplicated, block: B:148:0x034a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0358  */
    /* JADX WARN: Code duplicated, block: B:152:0x0362  */
    /* JADX WARN: Code duplicated, block: B:154:0x036e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0377  */
    /* JADX WARN: Code duplicated, block: B:167:0x0397  */
    /* JADX WARN: Code duplicated, block: B:172:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:184:0x041d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0427  */
    /* JADX WARN: Code duplicated, block: B:188:0x0431  */
    /* JADX WARN: Code duplicated, block: B:189:0x0436  */
    /* JADX WARN: Code duplicated, block: B:192:0x044d  */
    /* JADX WARN: Code duplicated, block: B:383:0x04ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:94:0x0205  */
    /* JADX WARN: Code duplicated, block: B:97:0x020d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0215  */
    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) throws Throwable {
        boolean z4;
        boolean z13;
        AbstractC34799a1 abstractC34799a1;
        boolean z14;
        boolean z15;
        C34850x0 c34850x0M113278g;
        boolean z16;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C34825l c34825l;
        C34850x0 c34850x0M109884b;
        long j7;
        int i13;
        long time;
        Date dateM1919a;
        Date dateM1919a2;
        String str;
        String str2;
        String str3;
        Date date;
        Object obj;
        C29203o c29203o;
        long j13;
        long j14;
        long time2;
        int i14;
        int i15;
        long millis;
        long millis2;
        String str4;
        String str5;
        long j15;
        C34848w0 c34848w0M109933h;
        int i16;
        C34832o0 c34832o0;
        C34850x0 c34850x0;
        AbstractC34798a0 abstractC34798a0;
        C34850x0 c34850x0M1939b;
        C34850x0 c34850x0M113278g2;
        C34850x0 c34850x0M109930a;
        C34807d0 c34807d0;
        C34807d0 c34807d1;
        C22677k0 c22677k0;
        boolean z17;
        int size;
        int i17;
        String str6;
        int size2;
        int i18;
        String strM109864c;
        String strM109864c2;
        String strM109867g;
        C34807d0 c34807d2;
        String str7;
        int i19;
        String str8;
        String str9;
        switch (this.f2942w) {
            case 0:
                C34841t c34841t = (C34841t) this.f2943x;
                AbstractC22676k.m65750j(chain, "chain");
                C0801i c0801i = (C0801i) chain;
                C34832o0 c34832o1 = c0801i.f2955e;
                C34830n0 c34830n0M109907b = c34832o1.m109907b();
                C34807d0 c34807d3 = c34832o1.f146714c;
                C34810e0 url = c34832o1.f146712a;
                AbstractC34846v0 abstractC34846v0 = c34832o1.f146715d;
                if (abstractC34846v0 != null) {
                    C34818h0 c34818h0ContentType = abstractC34846v0.getContentType();
                    if (c34818h0ContentType != null) {
                        c34830n0M109907b.m109902c("Content-Type", c34818h0ContentType.f146591a);
                    }
                    long jContentLength = abstractC34846v0.contentLength();
                    if (jContentLength != -1) {
                        c34830n0M109907b.m109902c("Content-Length", String.valueOf(jContentLength));
                        c34830n0M109907b.f146689c.m65769j("Transfer-Encoding");
                    } else {
                        c34830n0M109907b.m109902c("Transfer-Encoding", "chunked");
                        c34830n0M109907b.f146689c.m65769j("Content-Length");
                    }
                }
                if (c34807d3.m109863a("Host") == null) {
                    z4 = false;
                    c34830n0M109907b.m109902c("Host", AbstractC37174h.m119142i(url, false));
                } else {
                    z4 = false;
                }
                if (c34807d3.m109863a("Connection") == null) {
                    c34830n0M109907b.m109902c("Connection", "Keep-Alive");
                }
                if (c34807d3.m109863a("Accept-Encoding") == null && c34807d3.m109863a("Range") == null) {
                    c34830n0M109907b.m109902c("Accept-Encoding", "gzip");
                    z13 = true;
                } else {
                    z13 = z4;
                }
                c34841t.getClass();
                AbstractC22676k.m65750j(url, "url");
                if (c34807d3.m109863a("User-Agent") == null) {
                    c34830n0M109907b.m109902c("User-Agent", "okhttp/5.3.2");
                }
                C34832o0 c34832o2 = new C34832o0(c34830n0M109907b);
                C34850x0 c34850x0M1939b2 = c0801i.m1939b(c34832o2);
                C34807d0 c34807d4 = c34850x0M1939b2.f146777F;
                AbstractC0800h.m1936d(c34841t, c34832o2.f146712a, c34807d4);
                C34848w0 c34848w0M109933h2 = c34850x0M1939b2.m109933h();
                c34848w0M109933h2.f146761a = c34832o2;
                if (z13) {
                    String strM109863a = c34807d4.m109863a("Content-Encoding");
                    if (strM109863a == null) {
                        strM109863a = null;
                    }
                    if ("gzip".equalsIgnoreCase(strM109863a) && AbstractC0800h.m1933a(c34850x0M1939b2) && (abstractC34799a1 = c34850x0M1939b2.f146778G) != null) {
                        C26642v c26642v = new C26642v(abstractC34799a1.mo1940d1());
                        C22677k0 c22677k0M109865d = c34807d4.m109865d();
                        c22677k0M109865d.m65769j("Content-Encoding");
                        c22677k0M109865d.m65769j("Content-Length");
                        c34848w0M109933h2.m109931c(c22677k0M109865d.m65766g());
                        String strM109863a2 = c34807d4.m109863a("Content-Type");
                        if (strM109863a2 == null) {
                            strM109863a2 = null;
                        }
                        c34848w0M109933h2.f146767g = new C0802j(strM109863a2, -1L, AbstractC26604b.m79158c(c26642v));
                    }
                }
                return c34848w0M109933h2.m109930a();
            case 1:
                AbstractC22676k.m65750j(chain, "chain");
                C0801i c0801i2 = (C0801i) chain;
                C34832o0 c34832o3 = c0801i2.f2955e;
                C40571o c40571o = c0801i2.f2951a;
                List suppressed = C25271y.f99162w;
                int i24 = 0;
                C34850x0 c34850x0M109930a2 = null;
                C34832o0 request = c34832o3;
                while (true) {
                    boolean z18 = true;
                    while (true) {
                        AbstractC22676k.m65750j(request, "request");
                        if (c40571o.f174712L != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (c40571o) {
                            try {
                                try {
                                    if (c40571o.f174714N) {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                    if (c40571o.f174713M || c40571o.f174716P || c40571o.f174715O) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    if (z18) {
                                        C34826l0 c34826l0 = c40571o.f174721w;
                                        C39473d c39473d = c34826l0.f146647E;
                                        C40573q c40573q = c40571o.f174724z;
                                        int i25 = c34826l0.f146673y;
                                        int i26 = c34826l0.f146674z;
                                        int i27 = c0801i2.f2956f;
                                        int i28 = c0801i2.f2957g;
                                        int i29 = c34826l0.f146643A;
                                        boolean z19 = c34826l0.f146653e;
                                        boolean z24 = c34826l0.f146654f;
                                        C34810e0 url2 = request.f146712a;
                                        C34832o0 c34832o4 = request;
                                        AbstractC22676k.m65750j(url2, "url");
                                        if (url2.m109877f()) {
                                            SSLSocketFactory sSLSocketFactory2 = c34826l0.f146664p;
                                            if (sSLSocketFactory2 == null) {
                                                throw new IllegalStateException("CLEARTEXT-only client");
                                            }
                                            HostnameVerifier hostnameVerifier2 = c34826l0.f146668t;
                                            c34825l = c34826l0.f146669u;
                                            sSLSocketFactory = sSLSocketFactory2;
                                            hostnameVerifier = hostnameVerifier2;
                                        } else {
                                            sSLSocketFactory = null;
                                            hostnameVerifier = null;
                                            c34825l = null;
                                        }
                                        C40574r c40574r = new C40574r(c39473d, c40573q, i25, i26, i27, i28, i29, z19, z24, new C34797a(url2.f146565d, url2.f146566e, c34826l0.f146660l, c34826l0.f146663o, sSLSocketFactory, hostnameVerifier, c34825l, c34826l0.f146662n, c34826l0.f146667s, c34826l0.f146666r, c34826l0.f146661m), c40571o.f174721w.f146646D, c40571o, c34832o4);
                                        request = c34832o4;
                                        C34826l0 c34826l1 = c40571o.f174721w;
                                        c40571o.f174709I = c34826l1.f146654f ? new C40567k(c40574r, c34826l1.f146647E) : new C40580x(c40574r);
                                    }
                                    try {
                                        if (c40571o.f174718R) {
                                            z14 = true;
                                            try {
                                                throw new IOException("Canceled");
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z15 = z14;
                                                c40571o.m131550f(z15);
                                                throw th;
                                            }
                                        }
                                        try {
                                            try {
                                            } catch (Throwable th4) {
                                                th = th4;
                                                z15 = true;
                                                c40571o.m131550f(z15);
                                                throw th;
                                            }
                                            break;
                                        } catch (IOException e5) {
                                            try {
                                                boolean zM1918b = m1918b(e5, c40571o, request);
                                                c40571o.f174705E.retryDecision(c40571o, e5, zM1918b);
                                                if (!zM1918b) {
                                                    byte[] bArr = AbstractC37172f.f158958a;
                                                    AbstractC22676k.m65750j(suppressed, "suppressed");
                                                    Iterator it = suppressed.iterator();
                                                    while (it.hasNext()) {
                                                        AbstractC29125c.m88530g(e5, (Exception) it.next());
                                                    }
                                                    throw e5;
                                                }
                                                suppressed = AbstractC25265s.m74128f1(e5, suppressed);
                                                c40571o.m131550f(true);
                                                i24 = i24;
                                                z18 = false;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                z14 = true;
                                                z15 = z14;
                                                c40571o.m131550f(z15);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                            throw th;
                        }
                    }
                    C34848w0 c34848w0M109933h3 = c0801i2.m1939b(request).m109933h();
                    c34848w0M109933h3.f146761a = request;
                    if (c34850x0M109930a2 != null) {
                        try {
                            c34850x0M113278g = AbstractC35750h.m113278g(c34850x0M109930a2);
                        } catch (Throwable th9) {
                            th = th9;
                            z15 = true;
                            c40571o.m131550f(z15);
                            throw th;
                        }
                    } else {
                        c34850x0M113278g = null;
                    }
                    c34848w0M109933h3.f146771k = c34850x0M113278g;
                    c34850x0M109930a2 = c34848w0M109933h3.m109930a();
                    C40563g c40563g = c40571o.f174712L;
                    try {
                        request = m1917a(c34850x0M109930a2, c40563g);
                        try {
                            if (request == null) {
                                if (c40563g != null && c40563g.f174689e) {
                                    if (c40571o.f174711K) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    c40571o.f174711K = true;
                                    c40571o.f174706F.m79171j();
                                }
                                c40571o.f174705E.followUpDecision(c40571o, c34850x0M109930a2, null);
                                z16 = false;
                            } else {
                                AbstractC34846v0 abstractC34846v1 = request.f146715d;
                                if (abstractC34846v1 == null || !abstractC34846v1.isOneShot()) {
                                    AbstractC37172f.m119117b(c34850x0M109930a2.f146778G);
                                    int i34 = i24 + 1;
                                    if (i34 > 20) {
                                        c40571o.f174705E.followUpDecision(c40571o, c34850x0M109930a2, null);
                                        throw new ProtocolException("Too many follow-up requests: " + i34);
                                    }
                                    c40571o.f174705E.followUpDecision(c40571o, c34850x0M109930a2, request);
                                    c40571o.m131550f(true);
                                    i24 = i34;
                                } else {
                                    c40571o.f174705E.followUpDecision(c40571o, c34850x0M109930a2, null);
                                    z16 = false;
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            z15 = false;
                            c40571o.m131550f(z15);
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        z15 = true;
                        c40571o.m131550f(z15);
                        throw th;
                    }
                    break;
                }
                c40571o.m131550f(z16);
                return c34850x0M109930a2;
            default:
                String str10 = "networkResponse";
                String str11 = "Content-Encoding";
                String str12 = "Content-Length";
                String str13 = "Content-Type";
                AbstractC22676k.m65750j(chain, "chain");
                C0801i c0801i3 = (C0801i) chain;
                C34832o0 request2 = c0801i3.f2955e;
                C40571o c40571o2 = c0801i3.f2951a;
                C34815g c34815g = (C34815g) this.f2943x;
                if (c34815g != null) {
                    AbstractC32309k.m100572a(request2);
                    c34850x0M109884b = c34815g.m109884b(request2);
                } else {
                    c34850x0M109884b = null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                AbstractC22676k.m65750j(request2, "request");
                C34807d0 c34807d5 = request2.f146714c;
                if (c34850x0M109884b != null) {
                    long j16 = c34850x0M109884b.f146783L;
                    long j17 = c34850x0M109884b.f146784M;
                    C34807d0 c34807d6 = c34850x0M109884b.f146777F;
                    int size3 = c34807d6.size();
                    time = j17;
                    int i35 = 0;
                    Date dateM1919a3 = null;
                    dateM1919a = null;
                    dateM1919a2 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    int iM119132q = -1;
                    while (i35 < size3) {
                        int i36 = size3;
                        String strM109864c3 = c34807d6.m109864c(i35);
                        Date date2 = dateM1919a3;
                        String strM109867g2 = c34807d6.m109867g(i35);
                        C34807d0 c34807d7 = c34807d6;
                        if (strM109864c3.equalsIgnoreCase("Date")) {
                            dateM1919a2 = AbstractC0797e.m1919a(strM109867g2);
                            str3 = strM109867g2;
                        } else {
                            if (strM109864c3.equalsIgnoreCase("Expires")) {
                                dateM1919a3 = AbstractC0797e.m1919a(strM109867g2);
                            } else if (strM109864c3.equalsIgnoreCase("Last-Modified")) {
                                dateM1919a = AbstractC0797e.m1919a(strM109867g2);
                                str2 = strM109867g2;
                            } else if (strM109864c3.equalsIgnoreCase("ETag")) {
                                str = strM109867g2;
                            } else if (strM109864c3.equalsIgnoreCase("Age")) {
                                iM119132q = AbstractC37172f.m119132q(-1, strM109867g2);
                            }
                            i35++;
                            size3 = i36;
                            c34807d6 = c34807d7;
                        }
                        dateM1919a3 = date2;
                        i35++;
                        size3 = i36;
                        c34807d6 = c34807d7;
                    }
                    date = dateM1919a3;
                    j7 = j16;
                    i13 = iM119132q;
                } else {
                    j7 = 0;
                    i13 = -1;
                    time = 0;
                    dateM1919a = null;
                    dateM1919a2 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    date = null;
                }
                long j18 = j7;
                if (c34850x0M109884b == null) {
                    obj = null;
                    c29203o = new C29203o(request2, obj);
                } else {
                    if (!request2.f146712a.m109877f() || c34850x0M109884b.f146776E != null) {
                        obj = null;
                        if (AbstractC35846d.m113783h(c34850x0M109884b, request2)) {
                            C34817h c34817hM109906a = request2.m109906a();
                            if (!c34817hM109906a.f146576a && c34807d5.m109863a("If-Modified-Since") == null && c34807d5.m109863a("If-None-Match") == null) {
                                C34817h c34817hM109932b = c34850x0M109884b.m109932b();
                                long jMax = dateM1919a2 != null ? Math.max(0L, time - dateM1919a2.getTime()) : 0L;
                                if (i13 != -1) {
                                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i13));
                                }
                                long jMax2 = jMax + Math.max(0L, time - j18) + Math.max(0L, jCurrentTimeMillis - time);
                                int i37 = c34850x0M109884b.m109932b().f146578c;
                                if (i37 != -1) {
                                    j13 = jMax2;
                                    time2 = TimeUnit.SECONDS.toMillis(i37);
                                } else {
                                    j13 = jMax2;
                                    if (date != null) {
                                        if (dateM1919a2 != null) {
                                            time = dateM1919a2.getTime();
                                        }
                                        time2 = date.getTime() - time;
                                        if (time2 <= 0) {
                                            time2 = 0;
                                        }
                                    } else {
                                        if (dateM1919a == null || c34850x0M109884b.f146789w.f146712a.m109880i() != null) {
                                            j14 = 0;
                                        } else {
                                            long time3 = (dateM1919a2 != null ? dateM1919a2.getTime() : j18) - dateM1919a.getTime();
                                            j14 = 0;
                                            if (time3 > 0) {
                                                time2 = time3 / ((long) 10);
                                            }
                                        }
                                        time2 = j14;
                                    }
                                    i14 = c34817hM109906a.f146578c;
                                    if (i14 != -1) {
                                        time2 = Math.min(time2, TimeUnit.SECONDS.toMillis(i14));
                                    }
                                    i15 = c34817hM109906a.f146584i;
                                    if (i15 != -1) {
                                        millis = TimeUnit.SECONDS.toMillis(i15);
                                    } else {
                                        millis = j14;
                                    }
                                    if (!c34817hM109932b.f146582g || (i16 = c34817hM109906a.f146583h) == -1) {
                                        millis2 = j14;
                                    } else {
                                        millis2 = TimeUnit.SECONDS.toMillis(i16);
                                    }
                                    if (c34817hM109932b.f146576a) {
                                        if (str != null) {
                                            str4 = str;
                                            str5 = "If-None-Match";
                                        } else {
                                            if (dateM1919a != null) {
                                                str4 = str2;
                                            } else if (dateM1919a2 != null) {
                                                str4 = str3;
                                            } else {
                                                obj = null;
                                                c29203o = new C29203o(request2, obj);
                                            }
                                            str5 = "If-Modified-Since";
                                        }
                                        C22677k0 c22677k0M109865d2 = c34807d5.m109865d();
                                        AbstractC22676k.m65747g(str4);
                                        c22677k0M109865d2.m65763d(str5, str4);
                                        C34830n0 c34830n0M109907b2 = request2.m109907b();
                                        c34830n0M109907b2.m109903d(c22677k0M109865d2.m65766g());
                                        c29203o = new C29203o(new C34832o0(c34830n0M109907b2), c34850x0M109884b);
                                        obj = null;
                                    } else {
                                        j15 = j13 + millis;
                                        if (j15 < time2 + millis2) {
                                            c34848w0M109933h = c34850x0M109884b.m109933h();
                                            if (j15 >= time2) {
                                                c34848w0M109933h.f146766f.m65761b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                            }
                                            if (j13 > DurationKt.MILLIS_IN_DAY && c34850x0M109884b.m109932b().f146578c == -1 && date == null) {
                                                c34848w0M109933h.f146766f.m65761b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                            obj = null;
                                            c29203o = new C29203o(obj, c34848w0M109933h.m109930a());
                                        } else {
                                            if (str != null) {
                                                str4 = str;
                                                str5 = "If-None-Match";
                                            } else {
                                                if (dateM1919a != null) {
                                                    str4 = str2;
                                                } else if (dateM1919a2 != null) {
                                                    str4 = str3;
                                                } else {
                                                    obj = null;
                                                    c29203o = new C29203o(request2, obj);
                                                }
                                                str5 = "If-Modified-Since";
                                            }
                                            C22677k0 c22677k0M109865d3 = c34807d5.m109865d();
                                            AbstractC22676k.m65747g(str4);
                                            c22677k0M109865d3.m65763d(str5, str4);
                                            C34830n0 c34830n0M109907b3 = request2.m109907b();
                                            c34830n0M109907b3.m109903d(c22677k0M109865d3.m65766g());
                                            c29203o = new C29203o(new C34832o0(c34830n0M109907b3), c34850x0M109884b);
                                            obj = null;
                                        }
                                    }
                                }
                                j14 = 0;
                                i14 = c34817hM109906a.f146578c;
                                if (i14 != -1) {
                                    time2 = Math.min(time2, TimeUnit.SECONDS.toMillis(i14));
                                }
                                i15 = c34817hM109906a.f146584i;
                                if (i15 != -1) {
                                    millis = TimeUnit.SECONDS.toMillis(i15);
                                } else {
                                    millis = j14;
                                }
                                if (c34817hM109932b.f146582g) {
                                    millis2 = j14;
                                } else {
                                    millis2 = j14;
                                }
                                if (c34817hM109932b.f146576a) {
                                    j15 = j13 + millis;
                                    if (j15 < time2 + millis2) {
                                        c34848w0M109933h = c34850x0M109884b.m109933h();
                                        if (j15 >= time2) {
                                            c34848w0M109933h.f146766f.m65761b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (j13 > DurationKt.MILLIS_IN_DAY) {
                                            c34848w0M109933h.f146766f.m65761b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                        obj = null;
                                        c29203o = new C29203o(obj, c34848w0M109933h.m109930a());
                                    } else {
                                        if (str != null) {
                                            str4 = str;
                                            str5 = "If-None-Match";
                                        } else {
                                            if (dateM1919a != null) {
                                                str4 = str2;
                                            } else if (dateM1919a2 != null) {
                                                str4 = str3;
                                            } else {
                                                obj = null;
                                                c29203o = new C29203o(request2, obj);
                                            }
                                            str5 = "If-Modified-Since";
                                        }
                                        C22677k0 c22677k0M109865d4 = c34807d5.m109865d();
                                        AbstractC22676k.m65747g(str4);
                                        c22677k0M109865d4.m65763d(str5, str4);
                                        C34830n0 c34830n0M109907b4 = request2.m109907b();
                                        c34830n0M109907b4.m109903d(c22677k0M109865d4.m65766g());
                                        c29203o = new C29203o(new C34832o0(c34830n0M109907b4), c34850x0M109884b);
                                        obj = null;
                                    }
                                } else {
                                    if (str != null) {
                                        str4 = str;
                                        str5 = "If-None-Match";
                                    } else {
                                        if (dateM1919a != null) {
                                            str4 = str2;
                                        } else if (dateM1919a2 != null) {
                                            str4 = str3;
                                        } else {
                                            obj = null;
                                            c29203o = new C29203o(request2, obj);
                                        }
                                        str5 = "If-Modified-Since";
                                    }
                                    C22677k0 c22677k0M109865d5 = c34807d5.m109865d();
                                    AbstractC22676k.m65747g(str4);
                                    c22677k0M109865d5.m65763d(str5, str4);
                                    C34830n0 c34830n0M109907b5 = request2.m109907b();
                                    c34830n0M109907b5.m109903d(c22677k0M109865d5.m65766g());
                                    c29203o = new C29203o(new C34832o0(c34830n0M109907b5), c34850x0M109884b);
                                    obj = null;
                                }
                            } else {
                                str10 = "networkResponse";
                                str11 = "Content-Encoding";
                                str13 = "Content-Type";
                                obj = null;
                                c29203o = new C29203o(request2, obj);
                            }
                        } else {
                            c29203o = new C29203o(request2, obj);
                        }
                        if (((C34832o0) c29203o.f118198w) != null && request2.m109906a().f146585j) {
                            c29203o = new C29203o(obj, obj);
                        }
                        c34832o0 = (C34832o0) c29203o.f118198w;
                        c34850x0 = (C34850x0) c29203o.f118199x;
                        if (c34815g != null) {
                            c34815g.m109888m(c29203o);
                        }
                        abstractC34798a0 = c40571o2.f174705E;
                        if (abstractC34798a0 == null) {
                            abstractC34798a0 = AbstractC34798a0.NONE;
                        }
                        if (c34850x0M109884b != null && c34850x0 == null) {
                            AbstractC37172f.m119117b(c34850x0M109884b.f146778G);
                        }
                        if (c34832o0 != null && c34850x0 == null) {
                            C34850x0 c34850x1 = new C34850x0(request2, EnumC34828m0.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new C34807d0((String[]) new ArrayList(20).toArray(new String[0])), AbstractC34799a1.f146522x, null, null, null, null, -1L, System.currentTimeMillis(), null, InterfaceC34808d1.f146549A);
                            abstractC34798a0.satisfactionFailure(c40571o2, c34850x1);
                            return c34850x1;
                        }
                        if (c34832o0 == null) {
                            AbstractC22676k.m65747g(c34850x0);
                            C34848w0 c34848w0M109933h4 = c34850x0.m109933h();
                            C34850x0 c34850x0M113278g3 = AbstractC35750h.m113278g(c34850x0);
                            C34848w0.m109929b(c34850x0M113278g3, "cacheResponse");
                            c34848w0M109933h4.f146770j = c34850x0M113278g3;
                            C34850x0 c34850x0M109930a3 = c34848w0M109933h4.m109930a();
                            abstractC34798a0.cacheHit(c40571o2, c34850x0M109930a3);
                            return c34850x0M109930a3;
                        }
                        if (c34850x0 != null) {
                            abstractC34798a0.cacheConditionalHit(c40571o2, c34850x0);
                        } else if (c34815g != null) {
                            abstractC34798a0.cacheMiss(c40571o2);
                        }
                        try {
                            c34850x0M1939b = ((C0801i) chain).m1939b(c34832o0);
                            if (c34850x0 == null) {
                                if (c34850x0M1939b.f146792z == 304) {
                                    C34848w0 c34848w0M109933h5 = c34850x0.m109933h();
                                    c34807d0 = c34850x0.f146777F;
                                    c34807d1 = c34850x0M1939b.f146777F;
                                    z17 = false;
                                    c22677k0 = new C22677k0(2, false);
                                    size = c34807d0.size();
                                    i17 = 0;
                                    while (i17 < size) {
                                        strM109864c2 = c34807d0.m109864c(i17);
                                        strM109867g = c34807d0.m109867g(i17);
                                        if ("Warning".equalsIgnoreCase(strM109864c2)) {
                                            c34807d2 = c34807d0;
                                            if (AbstractC39421y.m125930O(strM109867g, UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, z17)) {
                                                i19 = size;
                                                str7 = str12;
                                                str8 = str11;
                                                str9 = str13;
                                            }
                                            i17++;
                                            str12 = str7;
                                            str13 = str9;
                                            str11 = str8;
                                            c34807d0 = c34807d2;
                                            z17 = false;
                                            size = i19;
                                        } else {
                                            c34807d2 = c34807d0;
                                        }
                                        str7 = str12;
                                        if (str7.equalsIgnoreCase(strM109864c2)) {
                                            i19 = size;
                                            str8 = str11;
                                            str9 = str13;
                                        } else {
                                            str8 = str11;
                                            i19 = size;
                                            str9 = str13;
                                            if (!str8.equalsIgnoreCase(strM109864c2) || str9.equalsIgnoreCase(strM109864c2) || !AbstractC35844b.m113766g(strM109864c2) || c34807d1.m109863a(strM109864c2) == null) {
                                            }
                                            i17++;
                                            str12 = str7;
                                            str13 = str9;
                                            str11 = str8;
                                            c34807d0 = c34807d2;
                                            z17 = false;
                                            size = i19;
                                        }
                                        c22677k0.m65763d(strM109864c2, strM109867g);
                                        i17++;
                                        str12 = str7;
                                        str13 = str9;
                                        str11 = str8;
                                        c34807d0 = c34807d2;
                                        z17 = false;
                                        size = i19;
                                    }
                                    str6 = str12;
                                    String str14 = str11;
                                    String str15 = str13;
                                    size2 = c34807d1.size();
                                    for (i18 = 0; i18 < size2; i18++) {
                                        strM109864c = c34807d1.m109864c(i18);
                                        if (str6.equalsIgnoreCase(strM109864c) && !str14.equalsIgnoreCase(strM109864c) && !str15.equalsIgnoreCase(strM109864c) && AbstractC35844b.m113766g(strM109864c)) {
                                            c22677k0.m65763d(strM109864c, c34807d1.m109867g(i18));
                                        }
                                    }
                                    c34848w0M109933h5.m109931c(c22677k0.m65766g());
                                    c34848w0M109933h5.f146772l = c34850x0M1939b.f146783L;
                                    c34848w0M109933h5.f146773m = c34850x0M1939b.f146784M;
                                    C34850x0 c34850x0M113278g4 = AbstractC35750h.m113278g(c34850x0);
                                    C34848w0.m109929b(c34850x0M113278g4, "cacheResponse");
                                    c34848w0M109933h5.f146770j = c34850x0M113278g4;
                                    C34850x0 c34850x0M113278g5 = AbstractC35750h.m113278g(c34850x0M1939b);
                                    C34848w0.m109929b(c34850x0M113278g5, str10);
                                    c34848w0M109933h5.f146769i = c34850x0M113278g5;
                                    C34850x0 c34850x0M109930a4 = c34848w0M109933h5.m109930a();
                                    c34850x0M1939b.f146778G.close();
                                    AbstractC22676k.m65747g(c34815g);
                                    c34815g.m109887k();
                                    C34815g.m109883s(c34850x0, c34850x0M109930a4);
                                    abstractC34798a0.cacheHit(c40571o2, c34850x0M109930a4);
                                    return c34850x0M109930a4;
                                }
                                AbstractC37172f.m119117b(c34850x0.f146778G);
                            }
                            C34848w0 c34848w0M109933h6 = c34850x0M1939b.m109933h();
                            if (c34850x0 != null) {
                                c34850x0M113278g2 = AbstractC35750h.m113278g(c34850x0);
                            } else {
                                c34850x0M113278g2 = null;
                            }
                            C34848w0.m109929b(c34850x0M113278g2, "cacheResponse");
                            c34848w0M109933h6.f146770j = c34850x0M113278g2;
                            C34850x0 c34850x0M113278g6 = AbstractC35750h.m113278g(c34850x0M1939b);
                            C34848w0.m109929b(c34850x0M113278g6, str10);
                            c34848w0M109933h6.f146769i = c34850x0M113278g6;
                            c34850x0M109930a = c34848w0M109933h6.m109930a();
                            AbstractC34799a1 abstractC34799a2 = c34850x0M109930a.f146778G;
                            if (c34815g != null) {
                                if (!AbstractC0800h.m1933a(c34850x0M109930a) && AbstractC35846d.m113783h(c34850x0M109930a, c34832o0)) {
                                    C34848w0 c34848w0M109933h7 = c34850x0M109930a.m109933h();
                                    c34848w0M109933h7.f146761a = c34832o0;
                                    C3936c c3936cM109885h = c34815g.m109885h(c34848w0M109933h7.m109930a());
                                    if (c3936cM109885h != null) {
                                        C38218a c38218a = new C38218a(abstractC34799a2.mo1940d1(), c3936cM109885h, AbstractC26604b.m79157b(c3936cM109885h.m11986c()));
                                        String strM109863a3 = c34850x0M109930a.f146777F.m109863a(str13);
                                        if (strM109863a3 == null) {
                                            strM109863a3 = null;
                                        }
                                        long jMo1941i = abstractC34799a2.mo1941i();
                                        C34848w0 c34848w0M109933h8 = c34850x0M109930a.m109933h();
                                        c34848w0M109933h8.f146767g = new C0802j(strM109863a3, jMo1941i, AbstractC26604b.m79158c(c38218a));
                                        c34850x0M109930a = c34848w0M109933h8.m109930a();
                                    }
                                    C34850x0 c34850x2 = c34850x0M109930a;
                                    if (c34850x0 == null) {
                                        return c34850x2;
                                    }
                                    abstractC34798a0.cacheMiss(c40571o2);
                                    return c34850x2;
                                }
                                if (AbstractC37056f.m118956H(c34832o0.f146713b)) {
                                    try {
                                        c34815g.m109886i(c34832o0);
                                        break;
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            return c34850x0M109930a;
                        } catch (Throwable th12) {
                            if (c34850x0M109884b != null) {
                                AbstractC37172f.m119117b(c34850x0M109884b.f146778G);
                            }
                            throw th12;
                        }
                    }
                    obj = null;
                    c29203o = new C29203o(request2, obj);
                }
                str10 = "networkResponse";
                str11 = "Content-Encoding";
                str13 = "Content-Type";
                if (((C34832o0) c29203o.f118198w) != null) {
                    c29203o = new C29203o(obj, obj);
                }
                c34832o0 = (C34832o0) c29203o.f118198w;
                c34850x0 = (C34850x0) c29203o.f118199x;
                if (c34815g != null) {
                    c34815g.m109888m(c29203o);
                }
                abstractC34798a0 = c40571o2.f174705E;
                if (abstractC34798a0 == null) {
                    abstractC34798a0 = AbstractC34798a0.NONE;
                }
                if (c34850x0M109884b != null) {
                    AbstractC37172f.m119117b(c34850x0M109884b.f146778G);
                }
                if (c34832o0 != null) {
                }
                if (c34832o0 == null) {
                    AbstractC22676k.m65747g(c34850x0);
                    C34848w0 c34848w0M109933h9 = c34850x0.m109933h();
                    C34850x0 c34850x0M113278g7 = AbstractC35750h.m113278g(c34850x0);
                    C34848w0.m109929b(c34850x0M113278g7, "cacheResponse");
                    c34848w0M109933h9.f146770j = c34850x0M113278g7;
                    C34850x0 c34850x0M109930a5 = c34848w0M109933h9.m109930a();
                    abstractC34798a0.cacheHit(c40571o2, c34850x0M109930a5);
                    return c34850x0M109930a5;
                }
                if (c34850x0 != null) {
                    abstractC34798a0.cacheConditionalHit(c40571o2, c34850x0);
                } else if (c34815g != null) {
                    abstractC34798a0.cacheMiss(c40571o2);
                }
                c34850x0M1939b = ((C0801i) chain).m1939b(c34832o0);
                if (c34850x0 == null) {
                    if (c34850x0M1939b.f146792z == 304) {
                        C34848w0 c34848w0M109933h10 = c34850x0.m109933h();
                        c34807d0 = c34850x0.f146777F;
                        c34807d1 = c34850x0M1939b.f146777F;
                        z17 = false;
                        c22677k0 = new C22677k0(2, false);
                        size = c34807d0.size();
                        i17 = 0;
                        while (i17 < size) {
                            strM109864c2 = c34807d0.m109864c(i17);
                            strM109867g = c34807d0.m109867g(i17);
                            if ("Warning".equalsIgnoreCase(strM109864c2)) {
                                c34807d2 = c34807d0;
                                if (AbstractC39421y.m125930O(strM109867g, UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, z17)) {
                                    i19 = size;
                                    str7 = str12;
                                    str8 = str11;
                                    str9 = str13;
                                }
                                i17++;
                                str12 = str7;
                                str13 = str9;
                                str11 = str8;
                                c34807d0 = c34807d2;
                                z17 = false;
                                size = i19;
                            } else {
                                c34807d2 = c34807d0;
                            }
                            str7 = str12;
                            if (str7.equalsIgnoreCase(strM109864c2)) {
                                str8 = str11;
                                i19 = size;
                                str9 = str13;
                                if (!str8.equalsIgnoreCase(strM109864c2)) {
                                }
                                i17++;
                                str12 = str7;
                                str13 = str9;
                                str11 = str8;
                                c34807d0 = c34807d2;
                                z17 = false;
                                size = i19;
                            } else {
                                i19 = size;
                                str8 = str11;
                                str9 = str13;
                            }
                            c22677k0.m65763d(strM109864c2, strM109867g);
                            i17++;
                            str12 = str7;
                            str13 = str9;
                            str11 = str8;
                            c34807d0 = c34807d2;
                            z17 = false;
                            size = i19;
                        }
                        str6 = str12;
                        String str16 = str11;
                        String str17 = str13;
                        size2 = c34807d1.size();
                        while (i18 < size2) {
                            strM109864c = c34807d1.m109864c(i18);
                            if (str6.equalsIgnoreCase(strM109864c)) {
                            }
                        }
                        c34848w0M109933h10.m109931c(c22677k0.m65766g());
                        c34848w0M109933h10.f146772l = c34850x0M1939b.f146783L;
                        c34848w0M109933h10.f146773m = c34850x0M1939b.f146784M;
                        C34850x0 c34850x0M113278g8 = AbstractC35750h.m113278g(c34850x0);
                        C34848w0.m109929b(c34850x0M113278g8, "cacheResponse");
                        c34848w0M109933h10.f146770j = c34850x0M113278g8;
                        C34850x0 c34850x0M113278g9 = AbstractC35750h.m113278g(c34850x0M1939b);
                        C34848w0.m109929b(c34850x0M113278g9, str10);
                        c34848w0M109933h10.f146769i = c34850x0M113278g9;
                        C34850x0 c34850x0M109930a6 = c34848w0M109933h10.m109930a();
                        c34850x0M1939b.f146778G.close();
                        AbstractC22676k.m65747g(c34815g);
                        c34815g.m109887k();
                        C34815g.m109883s(c34850x0, c34850x0M109930a6);
                        abstractC34798a0.cacheHit(c40571o2, c34850x0M109930a6);
                        return c34850x0M109930a6;
                    }
                    AbstractC37172f.m119117b(c34850x0.f146778G);
                }
                C34848w0 c34848w0M109933h11 = c34850x0M1939b.m109933h();
                if (c34850x0 != null) {
                    c34850x0M113278g2 = AbstractC35750h.m113278g(c34850x0);
                } else {
                    c34850x0M113278g2 = null;
                }
                C34848w0.m109929b(c34850x0M113278g2, "cacheResponse");
                c34848w0M109933h11.f146770j = c34850x0M113278g2;
                C34850x0 c34850x0M113278g10 = AbstractC35750h.m113278g(c34850x0M1939b);
                C34848w0.m109929b(c34850x0M113278g10, str10);
                c34848w0M109933h11.f146769i = c34850x0M113278g10;
                c34850x0M109930a = c34848w0M109933h11.m109930a();
                AbstractC34799a1 abstractC34799a3 = c34850x0M109930a.f146778G;
                if (c34815g != null) {
                    if (!AbstractC0800h.m1933a(c34850x0M109930a)) {
                    }
                    if (AbstractC37056f.m118956H(c34832o0.f146713b)) {
                        c34815g.m109886i(c34832o0);
                    }
                    break;
                }
                return c34850x0M109930a;
        }
    }

    public C0793a(C34841t cookieJar) {
        this.f2942w = 0;
        AbstractC22676k.m65750j(cookieJar, "cookieJar");
        this.f2943x = cookieJar;
    }
}
