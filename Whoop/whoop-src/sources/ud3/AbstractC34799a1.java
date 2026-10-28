package ud3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import ne3.C26616h;
import ne3.C26624l;
import ne3.InterfaceC26620j;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import yb3.AbstractC39397a;
import yb3.C39412p;

/* JADX INFO: renamed from: ud3.a1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34799a1 implements Closeable {

    /* JADX INFO: renamed from: x */
    public static final C34854z0 f146522x;

    /* JADX INFO: renamed from: w */
    public C34852y0 f146523w;

    static {
        C26624l c26624l = C26624l.f105881E;
        AbstractC22676k.m65750j(c26624l, "<this>");
        C26616h c26616h = new C26616h();
        c26616h.m79217l1(c26624l);
        f146522x = new C34854z0(null, c26624l.f105883w.length, c26616h);
    }

    /* JADX INFO: renamed from: b */
    public final InputStream m109858b() {
        return mo1940d1().mo79211i1();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC37172f.m119117b(mo1940d1());
    }

    /* JADX INFO: renamed from: d1 */
    public abstract InterfaceC26620j mo1940d1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: h */
    public final byte[] m109859h() throws IOException {
        long jMo1941i = mo1941i();
        if (jMo1941i > 2147483647L) {
            throw new IOException(AbstractC11895b.m31994m(jMo1941i, "Cannot buffer entire body for content length: "));
        }
        InterfaceC26620j interfaceC26620jMo1940d1 = mo1940d1();
        byte[] th3 = null;
        try {
            byte[] bArrMo79220n = interfaceC26620jMo1940d1.mo79220n();
            try {
                interfaceC26620jMo1940d1.close();
            } catch (Throwable th4) {
                th3 = th4;
            }
            th = th3;
            th3 = bArrMo79220n;
        } catch (Throwable th5) {
            th = th5;
            if (interfaceC26620jMo1940d1 != null) {
                try {
                    interfaceC26620jMo1940d1.close();
                } catch (Throwable th6) {
                    AbstractC29125c.m88530g(th, th6);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th3.length;
        if (jMo1941i == -1 || jMo1941i == length) {
            return th3;
        }
        throw new IOException("Content-Length (" + jMo1941i + ") and stream length (" + length + ") disagree");
    }

    /* JADX INFO: renamed from: i */
    public abstract long mo1941i();

    /* JADX INFO: renamed from: k */
    public abstract C34818h0 mo1942k();

    /* JADX WARN: Code duplicated, block: B:7:0x0013 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:24:0x0005 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: m */
    public final String m109860m() {
        Charset charsetM109889a;
        InterfaceC26620j interfaceC26620jMo1940d1 = mo1940d1();
        String th3 = null;
        try {
            C34818h0 c34818h0Mo1942k = mo1942k();
            if (c34818h0Mo1942k != null) {
                C39412p c39412p = C34818h0.f146589e;
                charsetM109889a = c34818h0Mo1942k.m109889a(null);
                if (charsetM109889a == null) {
                    charsetM109889a = AbstractC39397a.f169546a;
                }
            } else {
                charsetM109889a = AbstractC39397a.f169546a;
            }
            String strMo79183H0 = interfaceC26620jMo1940d1.mo79183H0(AbstractC37174h.m119139f(interfaceC26620jMo1940d1, charsetM109889a));
            try {
                interfaceC26620jMo1940d1.close();
            } catch (Throwable th4) {
                th3 = th4;
            }
            th = th3;
            th3 = strMo79183H0;
        } catch (Throwable th5) {
            th = th5;
            if (interfaceC26620jMo1940d1 != null) {
                try {
                    interfaceC26620jMo1940d1.close();
                } catch (Throwable th6) {
                    AbstractC29125c.m88530g(th, th6);
                }
            }
        }
        if (th == 0) {
            return th3;
        }
        throw th;
    }
}
