package me3;

import ae3.AbstractC0800h;
import ae3.C0801i;
import io.getstream.chat.android.client.api.QueryParams;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import m83.C25235a0;
import ne3.C26616h;
import ne3.C26642v;
import ne3.InterfaceC26620j;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34818h0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import v63.AbstractC35744b;
import va3.AbstractC35854l;
import yb0.AbstractC39383f;
import yb3.AbstractC39397a;
import yb3.C39412p;
import zd3.C40563g;
import zd3.C40572p;

/* JADX INFO: renamed from: me3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C25480c implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC25479b f99801w;

    /* JADX INFO: renamed from: x */
    public volatile Object f99802x;

    /* JADX INFO: renamed from: y */
    public volatile C25235a0 f99803y;

    /* JADX INFO: renamed from: z */
    public volatile EnumC25478a f99804z;

    public C25480c(InterfaceC25479b logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.f99801w = logger;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.f99802x = c25235a0;
        this.f99803y = c25235a0;
        this.f99804z = EnumC25478a.f99796w;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: a */
    public final void m74899a(C34807d0 c34807d0, int i13) {
        String strM109867g = this.f99802x.contains(c34807d0.m109864c(i13)) ? "██" : c34807d0.m109867g(i13);
        this.f99801w.log(c34807d0.m109864c(i13) + ": " + strM109867g);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) throws Exception {
        boolean z4;
        boolean z13;
        String str;
        Long lValueOf;
        Charset charsetM109889a;
        Long lValueOf2;
        Charset charsetM109889a2;
        AbstractC22676k.m65750j(chain, "chain");
        EnumC25478a enumC25478a = this.f99804z;
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        if (enumC25478a == EnumC25478a.f99796w) {
            return c0801i.m1939b(c34832o0);
        }
        boolean z14 = true;
        boolean z15 = enumC25478a == EnumC25478a.f99799z;
        if (!z15 && enumC25478a != EnumC25478a.f99798y) {
            z14 = false;
        }
        AbstractC34846v0 abstractC34846v0 = c34832o0.f146715d;
        C40563g c40563g = c0801i.f2954d;
        C40572p c40572pM131536c = c40563g != null ? c40563g.m131536c() : null;
        StringBuilder sb4 = new StringBuilder("--> ");
        sb4.append(c34832o0.f146713b);
        sb4.append(' ');
        C34810e0 url = c34832o0.f146712a;
        String str2 = QueryParams.URL;
        AbstractC22676k.m65750j(url, "url");
        this.f99803y.getClass();
        sb4.append(url.f146570i);
        String str3 = " ";
        sb4.append(c40572pM131536c != null ? " " + c40572pM131536c.f174730g : "");
        String string = sb4.toString();
        if (!z14 && abstractC34846v0 != null) {
            StringBuilder sbM35484d = AbstractC12682p.m35484d(string, " (");
            sbM35484d.append(abstractC34846v0.contentLength());
            sbM35484d.append("-byte body)");
            string = sbM35484d.toString();
        }
        this.f99801w.log(string);
        if (z14) {
            C34807d0 c34807d0 = c34832o0.f146714c;
            z4 = z15;
            if (abstractC34846v0 != null) {
                C34818h0 contentType = abstractC34846v0.getContentType();
                z13 = z14;
                if (contentType != null && c34807d0.m109863a("Content-Type") == null) {
                    this.f99801w.log("Content-Type: " + contentType);
                }
                if (abstractC34846v0.contentLength() != -1 && c34807d0.m109863a("Content-Length") == null) {
                    this.f99801w.log("Content-Length: " + abstractC34846v0.contentLength());
                }
            } else {
                z13 = z14;
                str2 = QueryParams.URL;
                str3 = " ";
            }
            int size = c34807d0.size();
            for (int i13 = 0; i13 < size; i13++) {
                m74899a(c34807d0, i13);
            }
            if (!z4 || abstractC34846v0 == null) {
                this.f99801w.log("--> END " + c34832o0.f146713b);
            } else {
                String strM109863a = c34832o0.f146714c.m109863a("Content-Encoding");
                if (strM109863a != null && !strM109863a.equalsIgnoreCase("identity") && !strM109863a.equalsIgnoreCase("gzip")) {
                    this.f99801w.log("--> END " + c34832o0.f146713b + " (encoded body omitted)");
                } else if (abstractC34846v0.isDuplex()) {
                    this.f99801w.log("--> END " + c34832o0.f146713b + " (duplex request body omitted)");
                } else if (abstractC34846v0.isOneShot()) {
                    this.f99801w.log("--> END " + c34832o0.f146713b + " (one-shot body omitted)");
                } else {
                    C26616h c26616h = new C26616h();
                    abstractC34846v0.writeTo(c26616h);
                    if ("gzip".equalsIgnoreCase(c34807d0.m109863a("Content-Encoding"))) {
                        lValueOf2 = Long.valueOf(c26616h.f105866x);
                        C26642v c26642v = new C26642v(c26616h);
                        try {
                            c26616h = new C26616h();
                            c26616h.mo79189N0(c26642v);
                            c26642v.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC35854l.m113829i(c26642v, th3);
                                throw th4;
                            }
                        }
                    } else {
                        lValueOf2 = null;
                    }
                    C34818h0 contentType2 = abstractC34846v0.getContentType();
                    if (contentType2 != null) {
                        C39412p c39412p = C34818h0.f146589e;
                        charsetM109889a2 = contentType2.m109889a(null);
                        if (charsetM109889a2 == null) {
                            charsetM109889a2 = AbstractC39397a.f169546a;
                        }
                    } else {
                        charsetM109889a2 = AbstractC39397a.f169546a;
                    }
                    this.f99801w.log("");
                    if (!AbstractC35744b.m113232e(c26616h)) {
                        this.f99801w.log("--> END " + c34832o0.f146713b + " (binary " + abstractC34846v0.contentLength() + "-byte body omitted)");
                    } else if (lValueOf2 != null) {
                        this.f99801w.log("--> END " + c34832o0.f146713b + " (" + c26616h.f105866x + "-byte, " + lValueOf2.longValue() + "-gzipped-byte body)");
                    } else {
                        this.f99801w.log(c26616h.mo79183H0(charsetM109889a2));
                        this.f99801w.log("--> END " + c34832o0.f146713b + " (" + abstractC34846v0.contentLength() + "-byte body)");
                    }
                }
            }
        } else {
            z4 = z15;
            z13 = z14;
            str2 = QueryParams.URL;
            str3 = " ";
        }
        long jNanoTime = System.nanoTime();
        try {
            C34850x0 c34850x0M1939b = c0801i.m1939b(c34832o0);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            AbstractC34799a1 abstractC34799a1 = c34850x0M1939b.f146778G;
            AbstractC22676k.m65747g(abstractC34799a1);
            long jMo1941i = abstractC34799a1.mo1941i();
            String str4 = jMo1941i != -1 ? jMo1941i + "-byte" : "unknown-length";
            InterfaceC25479b interfaceC25479b = this.f99801w;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("<-- " + c34850x0M1939b.f146792z);
            if (c34850x0M1939b.f146791y.length() > 0) {
                str = str3;
                sb5.append(str + c34850x0M1939b.f146791y);
            } else {
                str = str3;
            }
            StringBuilder sb6 = new StringBuilder(str);
            C34810e0 c34810e0 = c34850x0M1939b.f146789w.f146712a;
            AbstractC22676k.m65750j(c34810e0, str2);
            this.f99803y.getClass();
            sb6.append(c34810e0.f146570i);
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            sb5.append(sb6.toString());
            if (!z13) {
                sb5.append(", " + str4 + " body");
            }
            sb5.append(")");
            interfaceC25479b.log(sb5.toString());
            if (z13) {
                C34807d0 c34807d1 = c34850x0M1939b.f146777F;
                int size2 = c34807d1.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    m74899a(c34807d1, i14);
                }
                if (z4 && AbstractC0800h.m1933a(c34850x0M1939b)) {
                    String strM109863a2 = c34850x0M1939b.f146777F.m109863a("Content-Encoding");
                    if (strM109863a2 != null && !strM109863a2.equalsIgnoreCase("identity") && !strM109863a2.equalsIgnoreCase("gzip")) {
                        this.f99801w.log("<-- END HTTP (encoded body omitted)");
                        return c34850x0M1939b;
                    }
                    C34818h0 c34818h0Mo1942k = c34850x0M1939b.f146778G.mo1942k();
                    if (c34818h0Mo1942k != null && c34818h0Mo1942k.f146592b.equals("text") && c34818h0Mo1942k.f146593c.equals("event-stream")) {
                        this.f99801w.log("<-- END HTTP (streaming)");
                        return c34850x0M1939b;
                    }
                    InterfaceC26620j interfaceC26620jMo1940d1 = abstractC34799a1.mo1940d1();
                    interfaceC26620jMo1940d1.request(Long.MAX_VALUE);
                    long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                    C26616h c26616hMo79205f = interfaceC26620jMo1940d1.mo79205f();
                    if ("gzip".equalsIgnoreCase(c34807d1.m109863a("Content-Encoding"))) {
                        lValueOf = Long.valueOf(c26616hMo79205f.f105866x);
                        C26642v c26642v2 = new C26642v(c26616hMo79205f.m79210i());
                        try {
                            c26616hMo79205f = new C26616h();
                            c26616hMo79205f.mo79189N0(c26642v2);
                            c26642v2.close();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                AbstractC35854l.m113829i(c26642v2, th5);
                                throw th6;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    C34818h0 c34818h0Mo1942k2 = abstractC34799a1.mo1942k();
                    if (c34818h0Mo1942k2 != null) {
                        C39412p c39412p2 = C34818h0.f146589e;
                        charsetM109889a = c34818h0Mo1942k2.m109889a(null);
                        if (charsetM109889a == null) {
                            charsetM109889a = AbstractC39397a.f169546a;
                        }
                    } else {
                        charsetM109889a = AbstractC39397a.f169546a;
                    }
                    if (!AbstractC35744b.m113232e(c26616hMo79205f)) {
                        this.f99801w.log("");
                        InterfaceC25479b interfaceC25479b2 = this.f99801w;
                        StringBuilder sbM125596b = AbstractC39383f.m125596b(millis2, "<-- END HTTP (", "ms, binary ");
                        sbM125596b.append(c26616hMo79205f.f105866x);
                        sbM125596b.append("-byte body omitted)");
                        interfaceC25479b2.log(sbM125596b.toString());
                        return c34850x0M1939b;
                    }
                    if (jMo1941i != 0) {
                        this.f99801w.log("");
                        this.f99801w.log(c26616hMo79205f.m79210i().mo79183H0(charsetM109889a));
                    }
                    InterfaceC25479b interfaceC25479b3 = this.f99801w;
                    StringBuilder sb7 = new StringBuilder();
                    StringBuilder sbM125596b2 = AbstractC39383f.m125596b(millis2, "<-- END HTTP (", "ms, ");
                    sbM125596b2.append(c26616hMo79205f.f105866x);
                    sbM125596b2.append("-byte");
                    sb7.append(sbM125596b2.toString());
                    if (lValueOf != null) {
                        sb7.append(", " + lValueOf.longValue() + "-gzipped-byte");
                    }
                    sb7.append(" body)");
                    interfaceC25479b3.log(sb7.toString());
                    return c34850x0M1939b;
                }
                this.f99801w.log("<-- END HTTP");
            }
            return c34850x0M1939b;
        } catch (Exception e5) {
            long millis3 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            InterfaceC25479b interfaceC25479b4 = this.f99801w;
            StringBuilder sb8 = new StringBuilder();
            sb8.append("<-- HTTP FAILED: " + e5 + '.');
            StringBuilder sb9 = new StringBuilder(str3);
            C34810e0 c34810e1 = c34832o0.f146712a;
            AbstractC22676k.m65750j(c34810e1, str2);
            this.f99803y.getClass();
            sb9.append(c34810e1.f146570i);
            sb9.append(" (");
            sb9.append(millis3);
            sb9.append("ms)");
            sb8.append(sb9.toString());
            interfaceC25479b4.log(sb8.toString());
            throw e5;
        }
    }
}
