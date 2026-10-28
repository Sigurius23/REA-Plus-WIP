package be3;

import ae3.AbstractC0800h;
import ae3.C0803k;
import ae3.InterfaceC0798f;
import ae3.InterfaceC0799g;
import androidx.room.AbstractC1772c1;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.InterfaceC26620j;
import ne3.InterfaceC26629n0;
import ne3.InterfaceC26631o0;
import ne3.InterfaceC26633p0;
import p000.AbstractC11266d;
import p016an.C1053d;
import p088dc.AbstractC11895b;
import p474s.C31983m2;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34826l0;
import ud3.C34832o0;
import ud3.C34848w0;
import ud3.C34850x0;
import ud3.EnumC34828m0;
import wb3.AbstractC37056f;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: be3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3185g implements InterfaceC0799g {

    /* JADX INFO: renamed from: f */
    public static final C34807d0 f12487f;

    /* JADX INFO: renamed from: a */
    public final C34826l0 f12488a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0798f f12489b;

    /* JADX INFO: renamed from: c */
    public final C31983m2 f12490c;

    /* JADX INFO: renamed from: d */
    public int f12491d;

    /* JADX INFO: renamed from: e */
    public final C1053d f12492e;

    static {
        C34807d0 c34807d0 = C34807d0.f146547x;
        f12487f = AbstractC37056f.m118965R("OkHttp-Response-Body", "Truncated");
    }

    public C3185g(C34826l0 c34826l0, InterfaceC0798f interfaceC0798f, C31983m2 socket) {
        AbstractC22676k.m65750j(socket, "socket");
        this.f12488a = c34826l0;
        this.f12489b = interfaceC0798f;
        this.f12490c = socket;
        this.f12492e = new C1053d((C26621j0) socket.f132769x);
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: a */
    public final void mo1923a() {
        ((C26617h0) this.f12490c.f132770y).flush();
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: b */
    public final long mo1924b(C34850x0 c34850x0) {
        if (!AbstractC0800h.m1933a(c34850x0)) {
            return 0L;
        }
        String strM109863a = c34850x0.f146777F.m109863a("Transfer-Encoding");
        if (strM109863a == null) {
            strM109863a = null;
        }
        if ("chunked".equalsIgnoreCase(strM109863a)) {
            return -1L;
        }
        return AbstractC37174h.m119138e(c34850x0);
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: c */
    public final InterfaceC26633p0 mo1925c(C34850x0 c34850x0) {
        C34832o0 c34832o0 = c34850x0.f146789w;
        if (!AbstractC0800h.m1933a(c34850x0)) {
            return m9165k(c34832o0.f146712a, 0L);
        }
        String strM109863a = c34850x0.f146777F.m109863a("Transfer-Encoding");
        if (strM109863a == null) {
            strM109863a = null;
        }
        if ("chunked".equalsIgnoreCase(strM109863a)) {
            C34810e0 c34810e0 = c34832o0.f146712a;
            if (this.f12491d == 4) {
                this.f12491d = 5;
                return new C3181c(this, c34810e0);
            }
            throw new IllegalStateException(("state: " + this.f12491d).toString());
        }
        long jM119138e = AbstractC37174h.m119138e(c34850x0);
        if (jM119138e != -1) {
            return m9165k(c34832o0.f146712a, jM119138e);
        }
        C34810e0 url = c34832o0.f146712a;
        if (this.f12491d != 4) {
            throw new IllegalStateException(("state: " + this.f12491d).toString());
        }
        this.f12491d = 5;
        this.f12489b.mo1920c();
        AbstractC22676k.m65750j(url, "url");
        return new C3184f(this, url);
    }

    @Override // ae3.InterfaceC0799g
    public final void cancel() {
        this.f12489b.cancel();
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: d */
    public final boolean mo1926d() {
        return this.f12491d == 6;
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: e */
    public final C34848w0 mo1927e(boolean z4) {
        C1053d c1053d = this.f12492e;
        int i13 = this.f12491d;
        if (i13 != 0 && i13 != 1 && i13 != 2 && i13 != 3) {
            throw new IllegalStateException(("state: " + this.f12491d).toString());
        }
        try {
            String strMo79187M = ((InterfaceC26620j) c1053d.f4099y).mo79187M(c1053d.f4098x);
            c1053d.f4098x -= (long) strMo79187M.length();
            C0803k c0803kM5372I = AbstractC1772c1.m5372I(strMo79187M);
            int i14 = c0803kM5372I.f2964b;
            C34848w0 c34848w0 = new C34848w0();
            c34848w0.f146762b = (EnumC34828m0) c0803kM5372I.f2965c;
            c34848w0.f146763c = i14;
            c34848w0.f146764d = (String) c0803kM5372I.f2966d;
            C22677k0 c22677k0 = new C22677k0(2, false);
            while (true) {
                String strMo79187M2 = ((InterfaceC26620j) c1053d.f4099y).mo79187M(c1053d.f4098x);
                c1053d.f4098x -= (long) strMo79187M2.length();
                if (strMo79187M2.length() == 0) {
                    break;
                }
                c22677k0.m65762c(strMo79187M2);
            }
            c34848w0.m109931c(c22677k0.m65766g());
            if (z4 && i14 == 100) {
                return null;
            }
            if (i14 == 100) {
                this.f12491d = 3;
                return c34848w0;
            }
            if (102 > i14 || i14 >= 200) {
                this.f12491d = 4;
                return c34848w0;
            }
            this.f12491d = 3;
            return c34848w0;
        } catch (EOFException e5) {
            throw new IOException(AbstractC11266d.m30461o("unexpected end of stream on ", this.f12489b.mo1921e().f146527a.f146519h.m109881j()), e5);
        }
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: f */
    public final void mo1928f(C34832o0 request) {
        AbstractC22676k.m65750j(request, "request");
        Proxy.Type type = this.f12489b.mo1921e().f146528b.type();
        AbstractC22676k.m65749i(type, "type(...)");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(request.f146713b);
        sb4.append(' ');
        C34810e0 c34810e0 = request.f146712a;
        if (c34810e0.m109877f() || type != Proxy.Type.HTTP) {
            String strM109873b = c34810e0.m109873b();
            String strM109875d = c34810e0.m109875d();
            if (strM109875d != null) {
                strM109873b = AbstractC11895b.m31992k('?', strM109873b, strM109875d);
            }
            sb4.append(strM109873b);
        } else {
            sb4.append(c34810e0);
        }
        sb4.append(" HTTP/1.1");
        m9167m(request.f146714c, sb4.toString());
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: g */
    public final InterfaceC26629n0 mo1929g(C34832o0 request, long j7) throws ProtocolException {
        AbstractC22676k.m65750j(request, "request");
        AbstractC34846v0 abstractC34846v0 = request.f146715d;
        if (abstractC34846v0 != null && abstractC34846v0.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.f146714c.m109863a("Transfer-Encoding"))) {
            if (this.f12491d == 1) {
                this.f12491d = 2;
                return new C3180b(this);
            }
            throw new IllegalStateException(("state: " + this.f12491d).toString());
        }
        if (j7 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f12491d == 1) {
            this.f12491d = 2;
            return new C3183e(this);
        }
        throw new IllegalStateException(("state: " + this.f12491d).toString());
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: h */
    public final void mo1930h() {
        ((C26617h0) this.f12490c.f132770y).flush();
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: i */
    public final InterfaceC26631o0 mo1931i() {
        return this.f12490c;
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: j */
    public final InterfaceC0798f mo1932j() {
        return this.f12489b;
    }

    /* JADX INFO: renamed from: k */
    public final C3182d m9165k(C34810e0 c34810e0, long j7) {
        if (this.f12491d == 4) {
            this.f12491d = 5;
            return new C3182d(this, c34810e0, j7);
        }
        throw new IllegalStateException(("state: " + this.f12491d).toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m9166l(C34850x0 c34850x0) {
        long jM119138e = AbstractC37174h.m119138e(c34850x0);
        if (jM119138e == -1) {
            return;
        }
        C3182d c3182dM9165k = m9165k(c34850x0.f146789w.f146712a, jM119138e);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC37174h.m119140g(c3182dM9165k, Integer.MAX_VALUE);
        c3182dM9165k.close();
    }

    /* JADX INFO: renamed from: m */
    public final void m9167m(C34807d0 headers, String requestLine) {
        AbstractC22676k.m65750j(headers, "headers");
        AbstractC22676k.m65750j(requestLine, "requestLine");
        if (this.f12491d != 0) {
            throw new IllegalStateException(("state: " + this.f12491d).toString());
        }
        C31983m2 c31983m2 = this.f12490c;
        C26617h0 c26617h0 = (C26617h0) c31983m2.f132770y;
        C26617h0 c26617h1 = (C26617h0) c31983m2.f132770y;
        c26617h0.mo79193S(requestLine);
        c26617h0.mo79193S("\r\n");
        int size = headers.size();
        for (int i13 = 0; i13 < size; i13++) {
            c26617h1.mo79193S(headers.m109864c(i13));
            c26617h1.mo79193S(": ");
            c26617h1.mo79193S(headers.m109867g(i13));
            c26617h1.mo79193S("\r\n");
        }
        c26617h1.mo79193S("\r\n");
        this.f12491d = 1;
    }
}
