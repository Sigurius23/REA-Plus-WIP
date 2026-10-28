package ud3;

import com.iterable.iterableapi.C5378v;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import v63.AbstractC35745c;
import va3.AbstractC35844b;
import wb3.AbstractC37056f;
import wd3.C37167a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ud3.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34830n0 {

    /* JADX INFO: renamed from: a */
    public C34810e0 f146687a;

    /* JADX INFO: renamed from: d */
    public AbstractC34846v0 f146690d;

    /* JADX INFO: renamed from: e */
    public AbstractC35745c f146691e = C37167a.f158950a;

    /* JADX INFO: renamed from: b */
    public String f146688b = "GET";

    /* JADX INFO: renamed from: c */
    public C22677k0 f146689c = new C22677k0(2, false);

    /* JADX INFO: renamed from: a */
    public final void m109900a(String name, String value) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        this.f146689c.m65761b(name, value);
    }

    /* JADX INFO: renamed from: b */
    public final void m109901b(C34817h cacheControl) {
        AbstractC22676k.m65750j(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        if (string.length() == 0) {
            this.f146689c.m65769j("Cache-Control");
        } else {
            m109902c("Cache-Control", string);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m109902c(String name, String value) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        C22677k0 c22677k0 = this.f146689c;
        c22677k0.getClass();
        AbstractC35844b.m113764e(name);
        AbstractC35844b.m113765f(value, name);
        c22677k0.m65769j(name);
        AbstractC35844b.m113761b(c22677k0, name, value);
    }

    /* JADX INFO: renamed from: d */
    public final void m109903d(C34807d0 headers) {
        AbstractC22676k.m65750j(headers, "headers");
        this.f146689c = headers.m109865d();
    }

    /* JADX INFO: renamed from: e */
    public final void m109904e(String method, AbstractC34846v0 abstractC34846v0) {
        AbstractC22676k.m65750j(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC34846v0 == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC11895b.m31996o("method ", method, " must have a request body.").toString());
            }
        } else if (!AbstractC37056f.m118969X(method)) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("method ", method, " must not have a request body.").toString());
        }
        this.f146688b = method;
        this.f146690d = abstractC34846v0;
    }

    /* JADX INFO: renamed from: f */
    public final void m109905f(String url) {
        AbstractC22676k.m65750j(url, "url");
        if (AbstractC39421y.m125930O(url, "ws:", true)) {
            String strSubstring = url.substring(3);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            url = "http:".concat(strSubstring);
        } else if (AbstractC39421y.m125930O(url, "wss:", true)) {
            String strSubstring2 = url.substring(4);
            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
            url = "https:".concat(strSubstring2);
        }
        AbstractC22676k.m65750j(url, "<this>");
        C5378v c5378v = new C5378v(1);
        c5378v.m16528d(null, url);
        this.f146687a = c5378v.m16526b();
    }
}
