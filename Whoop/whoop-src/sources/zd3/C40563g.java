package zd3;

import ae3.C0802j;
import ae3.InterfaceC0798f;
import ae3.InterfaceC0799g;
import java.io.IOException;
import java.net.SocketException;
import ne3.AbstractC26604b;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34798a0;
import ud3.AbstractC34846v0;
import ud3.C34832o0;
import ud3.C34848w0;
import ud3.C34850x0;
import z63.C40132d;

/* JADX INFO: renamed from: zd3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C40563g {

    /* JADX INFO: renamed from: a */
    public final C40571o f174685a;

    /* JADX INFO: renamed from: b */
    public final AbstractC34798a0 f174686b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC40564h f174687c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0799g f174688d;

    /* JADX INFO: renamed from: e */
    public boolean f174689e;

    /* JADX INFO: renamed from: f */
    public boolean f174690f;

    public C40563g(C40571o c40571o, AbstractC34798a0 eventListener, InterfaceC40564h finder, InterfaceC0799g interfaceC0799g) {
        AbstractC22676k.m65750j(eventListener, "eventListener");
        AbstractC22676k.m65750j(finder, "finder");
        this.f174685a = c40571o;
        this.f174686b = eventListener;
        this.f174687c = finder;
        this.f174688d = interfaceC0799g;
    }

    /* JADX INFO: renamed from: a */
    public static IOException m131534a(C40563g c40563g, long j7, boolean z4, IOException iOException, int i13) {
        C40571o c40571o = c40563g.f174685a;
        boolean z13 = true;
        boolean z14 = false;
        boolean z15 = (i13 & 4) == 0;
        boolean z16 = (i13 & 8) == 0;
        AbstractC34798a0 abstractC34798a0 = c40563g.f174686b;
        if (iOException != null) {
            c40563g.m131539f(iOException);
        }
        if (z16) {
            if (iOException != null) {
                abstractC34798a0.requestFailed(c40571o, iOException);
            } else {
                abstractC34798a0.requestBodyEnd(c40571o, j7);
            }
        }
        if (z15) {
            if (iOException != null) {
                abstractC34798a0.responseFailed(c40571o, iOException);
            } else {
                abstractC34798a0.responseBodyEnd(c40571o, j7);
            }
        }
        if (!z16 || z4) {
            z13 = false;
        }
        if (z15 && !z4) {
            z14 = true;
        }
        return c40571o.m131552h(c40563g, z13, z14, (z15 && z4) ? z13 : false, (z16 && z4) ? z13 : z14, iOException);
    }

    /* JADX INFO: renamed from: b */
    public final C40561e m131535b(C34832o0 request, boolean z4) {
        AbstractC22676k.m65750j(request, "request");
        this.f174689e = z4;
        AbstractC34846v0 abstractC34846v0 = request.f146715d;
        AbstractC22676k.m65747g(abstractC34846v0);
        long jContentLength = abstractC34846v0.contentLength();
        this.f174686b.requestBodyStart(this.f174685a);
        return new C40561e(this, this.f174688d.mo1929g(request, jContentLength), jContentLength, false);
    }

    /* JADX INFO: renamed from: c */
    public final C40572p m131536c() {
        InterfaceC0798f interfaceC0798fMo1932j = this.f174688d.mo1932j();
        C40572p c40572p = interfaceC0798fMo1932j instanceof C40572p ? (C40572p) interfaceC0798fMo1932j : null;
        if (c40572p != null) {
            return c40572p;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    /* JADX INFO: renamed from: d */
    public final C0802j m131537d(C34850x0 c34850x0) throws IOException {
        C40563g c40563g;
        InterfaceC0799g interfaceC0799g = this.f174688d;
        try {
            String strM109863a = c34850x0.f146777F.m109863a("Content-Type");
            if (strM109863a == null) {
                strM109863a = null;
            }
            long jMo1924b = interfaceC0799g.mo1924b(c34850x0);
            c40563g = this;
            try {
                return new C0802j(strM109863a, jMo1924b, AbstractC26604b.m79158c(new C40562f(c40563g, interfaceC0799g.mo1925c(c34850x0), jMo1924b, false)));
            } catch (IOException e5) {
                e = e5;
                IOException iOException = e;
                c40563g.f174686b.responseFailed(c40563g.f174685a, iOException);
                m131539f(iOException);
                throw iOException;
            }
        } catch (IOException e13) {
            e = e13;
            c40563g = this;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C34848w0 m131538e(boolean z4) throws IOException {
        try {
            C34848w0 c34848w0Mo1927e = this.f174688d.mo1927e(z4);
            if (c34848w0Mo1927e == null) {
                return c34848w0Mo1927e;
            }
            c34848w0Mo1927e.f146774n = this;
            return c34848w0Mo1927e;
        } catch (IOException e5) {
            this.f174686b.responseFailed(this.f174685a, e5);
            m131539f(e5);
            throw e5;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m131539f(IOException iOException) {
        this.f174690f = true;
        this.f174688d.mo1932j().mo1922h(this.f174685a, iOException);
    }

    /* JADX INFO: renamed from: g */
    public final C40132d m131540g() throws SocketException {
        C40571o c40571o = this.f174685a;
        if (c40571o.f174711K) {
            throw new IllegalStateException("Check failed.");
        }
        c40571o.f174711K = true;
        c40571o.f174706F.m79171j();
        synchronized (c40571o) {
            if (c40571o.f174719S == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (c40571o.f174715O || c40571o.f174716P) {
                throw new IllegalStateException("Check failed.");
            }
            if (c40571o.f174713M) {
                throw new IllegalStateException("Check failed.");
            }
            if (!c40571o.f174714N) {
                throw new IllegalStateException("Check failed.");
            }
            c40571o.f174714N = false;
            c40571o.f174715O = true;
            c40571o.f174716P = true;
        }
        InterfaceC0798f interfaceC0798fMo1932j = this.f174688d.mo1932j();
        AbstractC22676k.m65748h(interfaceC0798fMo1932j, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        C40572p c40572p = (C40572p) interfaceC0798fMo1932j;
        c40572p.f174728e.setSoTimeout(0);
        c40572p.mo1920c();
        return new C40132d(this);
    }
}
