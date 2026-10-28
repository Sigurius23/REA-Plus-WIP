package ce3;

import ae3.AbstractC0800h;
import ae3.C0801i;
import ae3.C0803k;
import ae3.InterfaceC0798f;
import ae3.InterfaceC0799g;
import androidx.room.AbstractC1772c1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ne3.C26624l;
import ne3.InterfaceC26629n0;
import ne3.InterfaceC26631o0;
import ne3.InterfaceC26633p0;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import r80.AbstractC31061c;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34826l0;
import ud3.C34832o0;
import ud3.C34848w0;
import ud3.C34850x0;
import ud3.EnumC34828m0;
import wd3.AbstractC37174h;
import zd3.C40572p;

/* JADX INFO: renamed from: ce3.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C4517r implements InterfaceC0799g {

    /* JADX INFO: renamed from: g */
    public static final List f18210g = AbstractC37174h.m119144k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: h */
    public static final List f18211h = AbstractC37174h.m119144k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* JADX INFO: renamed from: a */
    public final C40572p f18212a;

    /* JADX INFO: renamed from: b */
    public final C0801i f18213b;

    /* JADX INFO: renamed from: c */
    public final C4516q f18214c;

    /* JADX INFO: renamed from: d */
    public volatile C4524y f18215d;

    /* JADX INFO: renamed from: e */
    public final EnumC34828m0 f18216e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f18217f;

    public C4517r(C34826l0 c34826l0, C40572p c40572p, C0801i chain, C4516q http2Connection) {
        AbstractC22676k.m65750j(chain, "chain");
        AbstractC22676k.m65750j(http2Connection, "http2Connection");
        this.f18212a = c40572p;
        this.f18213b = chain;
        this.f18214c = http2Connection;
        List list = c34826l0.f146667s;
        EnumC34828m0 enumC34828m0 = EnumC34828m0.H2_PRIOR_KNOWLEDGE;
        this.f18216e = list.contains(enumC34828m0) ? enumC34828m0 : EnumC34828m0.HTTP_2;
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: a */
    public final void mo1923a() {
        C4524y c4524y = this.f18215d;
        AbstractC22676k.m65747g(c4524y);
        c4524y.f18243I.close();
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: b */
    public final long mo1924b(C34850x0 c34850x0) {
        if (AbstractC0800h.m1933a(c34850x0)) {
            return AbstractC37174h.m119138e(c34850x0);
        }
        return 0L;
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: c */
    public final InterfaceC26633p0 mo1925c(C34850x0 c34850x0) {
        C4524y c4524y = this.f18215d;
        AbstractC22676k.m65747g(c4524y);
        return c4524y.f18242H;
    }

    @Override // ae3.InterfaceC0799g
    public final void cancel() {
        this.f18217f = true;
        C4524y c4524y = this.f18215d;
        if (c4524y != null) {
            c4524y.m14154f(EnumC4496a.CANCEL);
        }
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: d */
    public final boolean mo1926d() {
        boolean z4;
        C4524y c4524y = this.f18215d;
        if (c4524y == null) {
            return false;
        }
        synchronized (c4524y) {
            C4522w c4522w = c4524y.f18242H;
            z4 = c4522w.f18235x && c4522w.f18237z.mo79222o();
        }
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: e */
    public final C34848w0 mo1927e(boolean z4) throws IOException {
        int i13;
        C34807d0 c34807d0;
        C4524y c4524y = this.f18215d;
        if (c4524y == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c4524y) {
            while (true) {
                if (!c4524y.f18240F.isEmpty() || c4524y.m14155g() != null) {
                    break;
                }
                if (!z4) {
                    c4524y.f18249x.getClass();
                    C4521v c4521v = c4524y.f18243I;
                    i13 = c4521v.f18230y || c4521v.f18228w ? 1 : 0;
                }
                if (i13 != 0) {
                    c4524y.f18244J.m79170i();
                }
                try {
                    try {
                        c4524y.wait();
                        if (i13 != 0) {
                            c4524y.f18244J.m14148l();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th3) {
                    if (i13 != 0) {
                        c4524y.f18244J.m14148l();
                    }
                    throw th3;
                }
            }
            if (c4524y.f18240F.isEmpty()) {
                IOException iOException = c4524y.f18247M;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC4496a enumC4496aM14155g = c4524y.m14155g();
                AbstractC22676k.m65747g(enumC4496aM14155g);
                throw new StreamResetException(enumC4496aM14155g);
            }
            Object objRemoveFirst = c4524y.f18240F.removeFirst();
            AbstractC22676k.m65749i(objRemoveFirst, "removeFirst(...)");
            c34807d0 = (C34807d0) objRemoveFirst;
        }
        EnumC34828m0 protocol = this.f18216e;
        AbstractC22676k.m65750j(protocol, "protocol");
        C22677k0 c22677k0 = new C22677k0(2, false);
        int size = c34807d0.size();
        C0803k c0803kM5372I = null;
        for (i13 = 0; i13 < size; i13++) {
            String strM109864c = c34807d0.m109864c(i13);
            String strM109867g = c34807d0.m109867g(i13);
            if (strM109864c.equals(":status")) {
                c0803kM5372I = AbstractC1772c1.m5372I("HTTP/1.1 ".concat(strM109867g));
            } else if (!f18211h.contains(strM109864c)) {
                c22677k0.m65763d(strM109864c, strM109867g);
            }
        }
        if (c0803kM5372I == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C34848w0 c34848w0 = new C34848w0();
        c34848w0.f146762b = protocol;
        c34848w0.f146763c = c0803kM5372I.f2964b;
        c34848w0.f146764d = (String) c0803kM5372I.f2966d;
        c34848w0.m109931c(c22677k0.m65766g());
        if (z4 && c34848w0.f146763c == 100) {
            return null;
        }
        return c34848w0;
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: f */
    public final void mo1928f(C34832o0 request) throws IOException {
        int i13;
        C4524y c4524y;
        boolean z4;
        AbstractC22676k.m65750j(request, "request");
        if (this.f18215d != null) {
            return;
        }
        boolean z13 = request.f146715d != null;
        C34807d0 c34807d0 = request.f146714c;
        ArrayList arrayList = new ArrayList(c34807d0.size() + 4);
        arrayList.add(new C4500c(request.f146713b, C4500c.f18127f));
        C26624l c26624l = C4500c.f18128g;
        C34810e0 url = request.f146712a;
        AbstractC22676k.m65750j(url, "url");
        String strM109873b = url.m109873b();
        String strM109875d = url.m109875d();
        if (strM109875d != null) {
            strM109873b = AbstractC11895b.m31992k('?', strM109873b, strM109875d);
        }
        arrayList.add(new C4500c(strM109873b, c26624l));
        String strM109863a = request.f146714c.m109863a("Host");
        if (strM109863a != null) {
            arrayList.add(new C4500c(strM109863a, C4500c.f18130i));
        }
        arrayList.add(new C4500c(url.f146562a, C4500c.f18129h));
        int size = c34807d0.size();
        for (int i14 = 0; i14 < size; i14++) {
            String strM109864c = c34807d0.m109864c(i14);
            Locale locale = Locale.US;
            String strM95641q = AbstractC31061c.m95641q(locale, "US", strM109864c, locale, "toLowerCase(...)");
            if (!f18210g.contains(strM95641q) || (strM95641q.equals("te") && c34807d0.m109867g(i14).equals("trailers"))) {
                arrayList.add(new C4500c(strM95641q, c34807d0.m109867g(i14)));
            }
        }
        C4516q c4516q = this.f18214c;
        c4516q.getClass();
        boolean z14 = !z13;
        synchronized (c4516q.f18203X) {
            synchronized (c4516q) {
                try {
                    if (c4516q.f18184E > 1073741823) {
                        c4516q.m14136k(EnumC4496a.REFUSED_STREAM);
                    }
                    if (c4516q.f18185F) {
                        throw new ConnectionShutdownException();
                    }
                    i13 = c4516q.f18184E;
                    c4516q.f18184E = i13 + 2;
                    c4524y = new C4524y(i13, c4516q, z14, false, null);
                    z4 = !z13 || c4516q.f18200U >= c4516q.f18201V || c4524y.f18251z >= c4524y.f18239E;
                    if (c4524y.m14157i()) {
                        c4516q.f18207x.put(Integer.valueOf(i13), c4524y);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c4516q.f18203X.m14164m(z14, i13, arrayList);
        }
        if (z4) {
            c4516q.f18203X.flush();
        }
        this.f18215d = c4524y;
        if (this.f18217f) {
            C4524y c4524y2 = this.f18215d;
            AbstractC22676k.m65747g(c4524y2);
            c4524y2.m14154f(EnumC4496a.CANCEL);
            throw new IOException("Canceled");
        }
        C4524y c4524y3 = this.f18215d;
        AbstractC22676k.m65747g(c4524y3);
        C4523x c4523x = c4524y3.f18244J;
        long j7 = this.f18213b.f2957g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4523x.mo79277g(j7, timeUnit);
        C4524y c4524y4 = this.f18215d;
        AbstractC22676k.m65747g(c4524y4);
        c4524y4.f18245K.mo79277g(this.f18213b.f2958h, timeUnit);
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: g */
    public final InterfaceC26629n0 mo1929g(C34832o0 request, long j7) {
        AbstractC22676k.m65750j(request, "request");
        C4524y c4524y = this.f18215d;
        AbstractC22676k.m65747g(c4524y);
        return c4524y.f18243I;
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: h */
    public final void mo1930h() {
        this.f18214c.f18203X.flush();
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: i */
    public final InterfaceC26631o0 mo1931i() {
        C4524y c4524y = this.f18215d;
        AbstractC22676k.m65747g(c4524y);
        return c4524y;
    }

    @Override // ae3.InterfaceC0799g
    /* JADX INFO: renamed from: j */
    public final InterfaceC0798f mo1932j() {
        return this.f18212a;
    }
}
