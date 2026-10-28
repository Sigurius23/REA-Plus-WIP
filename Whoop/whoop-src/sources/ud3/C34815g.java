package ud3;

import c33.C3936c;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import ne3.AbstractC26632p;
import ne3.C26603a0;
import ne3.C26611e0;
import ne3.InterfaceC26633p0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p031b9.C2817b;
import p249jc.C21567b;
import p460rg.AbstractC31366a;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29203o;
import wb3.AbstractC37056f;
import wd3.AbstractC37172f;
import xd3.C38220c;
import xd3.C38221d;
import xd3.C38223f;
import yb3.C39412p;
import yd3.C39473d;

/* JADX INFO: renamed from: ud3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C34815g implements Closeable, Flushable {

    /* JADX INFO: renamed from: w */
    public final C38223f f146573w;

    public C34815g(File file) {
        C26603a0 fileSystem = AbstractC26632p.f105900w;
        String str = C26611e0.f105848x;
        C26611e0 c26611e0M60607p = C21567b.m60607p(file);
        AbstractC22676k.m65750j(fileSystem, "fileSystem");
        C39473d taskRunner = C39473d.f169842l;
        AbstractC22676k.m65750j(taskRunner, "taskRunner");
        this.f146573w = new C38223f(fileSystem, c26611e0M60607p, taskRunner);
    }

    /* JADX INFO: renamed from: s */
    public static void m109883s(C34850x0 cached, C34850x0 c34850x0) {
        C2817b c2817bM122498i;
        AbstractC22676k.m65750j(cached, "cached");
        C34809e c34809e = new C34809e(c34850x0);
        AbstractC34799a1 abstractC34799a1 = cached.f146778G;
        AbstractC22676k.m65748h(abstractC34799a1, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        C38221d c38221d = ((C34806d) abstractC34799a1).f146545y;
        try {
            c2817bM122498i = c38221d.f163827z.m122498i(c38221d.f163825x, c38221d.f163824w);
            if (c2817bM122498i == null) {
                return;
            }
            try {
                c34809e.m109871c(c2817bM122498i);
                c2817bM122498i.m8006e();
            } catch (IOException unused) {
                if (c2817bM122498i != null) {
                    try {
                        c2817bM122498i.m8004a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
            c2817bM122498i = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C34850x0 m109884b(C34832o0 c34832o0) {
        C34810e0 c34810e0 = c34832o0.f146712a;
        try {
            C38221d c38221dM122499k = this.f146573w.m122499k(AbstractC31366a.m96474n(c34810e0));
            if (c38221dM122499k != null) {
                try {
                    C34809e c34809e = new C34809e((InterfaceC26633p0) c38221dM122499k.f163826y.get(0));
                    String method = c34809e.f146554c;
                    C34807d0 headers = c34809e.f146553b;
                    C34810e0 url = c34809e.f146552a;
                    C34807d0 c34807d0 = c34809e.f146558g;
                    String strM109863a = c34807d0.m109863a("Content-Type");
                    String strM109863a2 = c34807d0.m109863a("Content-Length");
                    AbstractC22676k.m65750j(url, "url");
                    AbstractC22676k.m65750j(headers, "headers");
                    AbstractC22676k.m65750j(method, "method");
                    C34830n0 c34830n0 = new C34830n0();
                    c34830n0.f146687a = url;
                    c34830n0.m109903d(headers);
                    c34830n0.m109904e(!method.equals(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR) ? method : "GET", null);
                    C34832o0 c34832o1 = new C34832o0(c34830n0);
                    C34848w0 c34848w0 = new C34848w0();
                    c34848w0.f146761a = c34832o1;
                    EnumC34828m0 protocol = c34809e.f146555d;
                    AbstractC22676k.m65750j(protocol, "protocol");
                    c34848w0.f146762b = protocol;
                    c34848w0.f146763c = c34809e.f146556e;
                    String message = c34809e.f146557f;
                    AbstractC22676k.m65750j(message, "message");
                    c34848w0.f146764d = message;
                    c34848w0.m109931c(c34807d0);
                    c34848w0.f146767g = new C34806d(c38221dM122499k, strM109863a, strM109863a2);
                    c34848w0.f146765e = c34809e.f146559h;
                    c34848w0.f146772l = c34809e.f146560i;
                    c34848w0.f146773m = c34809e.f146561j;
                    C34850x0 c34850x0M109930a = c34848w0.m109930a();
                    if (url.equals(c34810e0) && method.equals(c34832o0.f146713b)) {
                        Set<String> setM96481u = AbstractC31366a.m96481u(c34850x0M109930a.f146777F);
                        if (!(setM96481u instanceof Collection) || !setM96481u.isEmpty()) {
                            for (String str : setM96481u) {
                                if (!headers.m109868j(str).equals(c34832o0.f146714c.m109868j(str))) {
                                }
                            }
                        }
                        return c34850x0M109930a;
                    }
                    AbstractC37172f.m119117b(c34850x0M109930a.f146778G);
                    return null;
                } catch (IOException unused) {
                    AbstractC37172f.m119117b(c38221dM122499k);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f146573w.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f146573w.flush();
    }

    /* JADX INFO: renamed from: h */
    public final C3936c m109885h(C34850x0 c34850x0) {
        C2817b c2817bM122498i;
        C34832o0 c34832o0 = c34850x0.f146789w;
        String str = c34832o0.f146713b;
        if (AbstractC37056f.m118956H(str)) {
            try {
                m109886i(c34832o0);
            } catch (IOException unused) {
            }
            return null;
        }
        if (str.equals("GET") && !AbstractC31366a.m96481u(c34850x0.f146777F).contains("*")) {
            C34809e c34809e = new C34809e(c34850x0);
            try {
                C38223f c38223f = this.f146573w;
                String strM96474n = AbstractC31366a.m96474n(c34832o0.f146712a);
                C39412p c39412p = C38223f.f163828T;
                c2817bM122498i = c38223f.m122498i(-1L, strM96474n);
                if (c2817bM122498i != null) {
                    try {
                        c34809e.m109871c(c2817bM122498i);
                        return new C3936c(this, c2817bM122498i);
                    } catch (IOException unused2) {
                        if (c2817bM122498i != null) {
                            try {
                                c2817bM122498i.m8004a();
                            } catch (IOException unused3) {
                            }
                        }
                        return null;
                    }
                }
            } catch (IOException unused4) {
                c2817bM122498i = null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m109886i(C34832o0 request) {
        AbstractC22676k.m65750j(request, "request");
        C38223f c38223f = this.f146573w;
        String key = AbstractC31366a.m96474n(request.f146712a);
        synchronized (c38223f) {
            AbstractC22676k.m65750j(key, "key");
            c38223f.m122500m();
            c38223f.m122495b();
            C38223f.m122491p0(key);
            C38220c c38220c = (C38220c) c38223f.f163837I.get(key);
            if (c38220c == null) {
                return;
            }
            c38223f.m122496b0(c38220c);
            if (c38223f.f163835G <= c38223f.f163850y) {
                c38223f.f163843O = false;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m109887k() {
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m109888m(C29203o c29203o) {
    }
}
