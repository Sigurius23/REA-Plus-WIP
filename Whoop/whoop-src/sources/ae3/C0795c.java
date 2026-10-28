package ae3;

import java.io.IOException;
import java.net.ProtocolException;
import ne3.AbstractC26604b;
import ne3.C26617h0;
import okhttp3.internal.http2.ConnectionShutdownException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import ud3.AbstractC34798a0;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34832o0;
import ud3.C34848w0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import wb3.AbstractC37056f;
import wd3.C37170d;
import zd3.C40563g;
import zd3.C40571o;

/* JADX INFO: renamed from: ae3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C0795c implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w */
    public static final C0795c f2944w = new C0795c();

    /* JADX WARN: Code duplicated, block: B:100:0x019d A[Catch: IOException -> 0x0142, TryCatch #8 {IOException -> 0x0142, blocks: (B:78:0x0133, B:80:0x013c, B:83:0x0145, B:95:0x0191, B:100:0x019d, B:106:0x01ab, B:107:0x01b2, B:109:0x01b5, B:112:0x01c1, B:118:0x01cf, B:120:0x0202, B:122:0x0210, B:125:0x021a, B:132:0x022f, B:135:0x023c, B:136:0x0260, B:127:0x0220, B:119:0x01ed, B:91:0x016c, B:93:0x0175, B:94:0x0178), top: B:157:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab A[Catch: IOException -> 0x0142, TryCatch #8 {IOException -> 0x0142, blocks: (B:78:0x0133, B:80:0x013c, B:83:0x0145, B:95:0x0191, B:100:0x019d, B:106:0x01ab, B:107:0x01b2, B:109:0x01b5, B:112:0x01c1, B:118:0x01cf, B:120:0x0202, B:122:0x0210, B:125:0x021a, B:132:0x022f, B:135:0x023c, B:136:0x0260, B:127:0x0220, B:119:0x01ed, B:91:0x016c, B:93:0x0175, B:94:0x0178), top: B:157:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b5 A[Catch: IOException -> 0x0142, TryCatch #8 {IOException -> 0x0142, blocks: (B:78:0x0133, B:80:0x013c, B:83:0x0145, B:95:0x0191, B:100:0x019d, B:106:0x01ab, B:107:0x01b2, B:109:0x01b5, B:112:0x01c1, B:118:0x01cf, B:120:0x0202, B:122:0x0210, B:125:0x021a, B:132:0x022f, B:135:0x023c, B:136:0x0260, B:127:0x0220, B:119:0x01ed, B:91:0x016c, B:93:0x0175, B:94:0x0178), top: B:157:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ed A[Catch: IOException -> 0x0142, TryCatch #8 {IOException -> 0x0142, blocks: (B:78:0x0133, B:80:0x013c, B:83:0x0145, B:95:0x0191, B:100:0x019d, B:106:0x01ab, B:107:0x01b2, B:109:0x01b5, B:112:0x01c1, B:118:0x01cf, B:120:0x0202, B:122:0x0210, B:125:0x021a, B:132:0x022f, B:135:0x023c, B:136:0x0260, B:127:0x0220, B:119:0x01ed, B:91:0x016c, B:93:0x0175, B:94:0x0178), top: B:157:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0210 A[Catch: IOException -> 0x0142, TryCatch #8 {IOException -> 0x0142, blocks: (B:78:0x0133, B:80:0x013c, B:83:0x0145, B:95:0x0191, B:100:0x019d, B:106:0x01ab, B:107:0x01b2, B:109:0x01b5, B:112:0x01c1, B:118:0x01cf, B:120:0x0202, B:122:0x0210, B:125:0x021a, B:132:0x022f, B:135:0x023c, B:136:0x0260, B:127:0x0220, B:119:0x01ed, B:91:0x016c, B:93:0x0175, B:94:0x0178), top: B:157:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0218  */
    /* JADX WARN: Code duplicated, block: B:127:0x0220 A[Catch: IOException -> 0x0142, TryCatch #8 {IOException -> 0x0142, blocks: (B:78:0x0133, B:80:0x013c, B:83:0x0145, B:95:0x0191, B:100:0x019d, B:106:0x01ab, B:107:0x01b2, B:109:0x01b5, B:112:0x01c1, B:118:0x01cf, B:120:0x0202, B:122:0x0210, B:125:0x021a, B:132:0x022f, B:135:0x023c, B:136:0x0260, B:127:0x0220, B:119:0x01ed, B:91:0x016c, B:93:0x0175, B:94:0x0178), top: B:157:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0269 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:157:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c A[Catch: IOException -> 0x0142, TryCatch #8 {IOException -> 0x0142, blocks: (B:78:0x0133, B:80:0x013c, B:83:0x0145, B:95:0x0191, B:100:0x019d, B:106:0x01ab, B:107:0x01b2, B:109:0x01b5, B:112:0x01c1, B:118:0x01cf, B:120:0x0202, B:122:0x0210, B:125:0x021a, B:132:0x022f, B:135:0x023c, B:136:0x0260, B:127:0x0220, B:119:0x01ed, B:91:0x016c, B:93:0x0175, B:94:0x0178), top: B:157:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0175 A[Catch: IOException -> 0x0142, TryCatch #8 {IOException -> 0x0142, blocks: (B:78:0x0133, B:80:0x013c, B:83:0x0145, B:95:0x0191, B:100:0x019d, B:106:0x01ab, B:107:0x01b2, B:109:0x01b5, B:112:0x01c1, B:118:0x01cf, B:120:0x0202, B:122:0x0210, B:125:0x021a, B:132:0x022f, B:135:0x023c, B:136:0x0260, B:127:0x0220, B:119:0x01ed, B:91:0x016c, B:93:0x0175, B:94:0x0178), top: B:157:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0198  */
    /* JADX WARN: Code duplicated, block: B:98:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) throws IOException {
        C34848w0 c34848w0M131538e;
        IOException iOException;
        C34848w0 c34848w0M131538e2;
        boolean z4;
        ?? r15;
        C34850x0 c34850x0M109930a;
        int i13;
        AbstractC34799a1 abstractC34799a1;
        boolean z13;
        String str;
        C34850x0 c34850x0M109930a2;
        String strM109863a;
        String strM109863a2;
        boolean z14;
        C34848w0 c34848w0;
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C40563g c40563g = c0801i.f2954d;
        AbstractC22676k.m65747g(c40563g);
        InterfaceC0799g interfaceC0799g = c40563g.f174688d;
        AbstractC34798a0 abstractC34798a0 = c40563g.f174686b;
        C40571o c40571o = c40563g.f174685a;
        C34832o0 c34832o0 = c0801i.f2955e;
        AbstractC34846v0 abstractC34846v0 = c34832o0.f146715d;
        C34807d0 c34807d0 = c34832o0.f146714c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z15 = false;
        ?? r16 = 1;
        boolean z16 = true;
        boolean z17 = AbstractC37056f.m118969X(c34832o0.f146713b) && abstractC34846v0 != null;
        String str2 = "Connection";
        boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(c34807d0.m109863a("Connection"));
        try {
            try {
                abstractC34798a0.requestHeadersStart(c40571o);
                interfaceC0799g.mo1928f(c34832o0);
                abstractC34798a0.requestHeadersEnd(c40571o, c34832o0);
                if (z17) {
                    try {
                        if ("100-continue".equalsIgnoreCase(c34807d0.m109863a("Expect"))) {
                            try {
                                try {
                                    interfaceC0799g.mo1930h();
                                    c34848w0M131538e = c40563g.m131538e(true);
                                    try {
                                        abstractC34798a0.responseHeadersStart(c40571o);
                                        c34848w0 = c34848w0M131538e;
                                        z16 = false;
                                    } catch (IOException e5) {
                                        e = e5;
                                        r16 = "upgrade";
                                        if (!(e instanceof ConnectionShutdownException) || !c40563g.f174690f) {
                                            throw e;
                                        }
                                        C34848w0 c34848w1 = c34848w0M131538e;
                                        iOException = e;
                                        c34848w0M131538e2 = c34848w1;
                                        if (c34848w0M131538e2 == null) {
                                            try {
                                                r15 = r16;
                                                z4 = z16;
                                                c34848w0M131538e2 = c40563g.m131538e(false);
                                                AbstractC22676k.m65747g(c34848w0M131538e2);
                                                if (z4) {
                                                    abstractC34798a0.responseHeadersStart(c40571o);
                                                    z4 = false;
                                                }
                                            } catch (IOException e13) {
                                                if (iOException == null) {
                                                    throw e13;
                                                }
                                                AbstractC29125c.m88530g(iOException, e13);
                                                throw iOException;
                                            }
                                        }
                                        r15 = r16;
                                        z4 = z16;
                                        c34848w0M131538e2.f146761a = c34832o0;
                                        c34848w0M131538e2.f146765e = c40563g.m131536c().f174729f;
                                        c34848w0M131538e2.f146772l = jCurrentTimeMillis;
                                        c34848w0M131538e2.f146773m = System.currentTimeMillis();
                                        c34850x0M109930a = c34848w0M131538e2.m109930a();
                                        i13 = c34850x0M109930a.f146792z;
                                        while (true) {
                                            abstractC34799a1 = c34850x0M109930a.f146778G;
                                            if (i13 != 100) {
                                                break;
                                            }
                                            C34848w0 c34848w0M131538e3 = c40563g.m131538e(false);
                                            AbstractC22676k.m65747g(c34848w0M131538e3);
                                            if (z4) {
                                                abstractC34798a0.responseHeadersStart(c40571o);
                                            }
                                            c34848w0M131538e3.f146761a = c34832o0;
                                            c34848w0M131538e3.f146765e = c40563g.m131536c().f174729f;
                                            c34848w0M131538e3.f146772l = jCurrentTimeMillis;
                                            c34848w0M131538e3.f146773m = System.currentTimeMillis();
                                            c34850x0M109930a = c34848w0M131538e3.m109930a();
                                            i13 = c34850x0M109930a.f146792z;
                                        }
                                        abstractC34798a0.responseHeadersEnd(c40571o, c34850x0M109930a);
                                        if (i13 == 101) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            if (c40563g.m131536c().f174733j != null) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (!z14) {
                                                throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                            }
                                        }
                                        if (z13) {
                                            str = str2;
                                            strM109863a2 = c34850x0M109930a.f146777F.m109863a(str);
                                            if (strM109863a2 == null) {
                                                strM109863a2 = null;
                                            }
                                            if (r15.equalsIgnoreCase(strM109863a2)) {
                                                z15 = true;
                                            }
                                        } else {
                                            str = str2;
                                        }
                                        if (zEqualsIgnoreCase) {
                                            C0802j c0802jM131537d = c40563g.m131537d(c34850x0M109930a);
                                            C34848w0 c34848w0M109933h = c34850x0M109930a.m109933h();
                                            c34848w0M109933h.f146767g = c0802jM131537d;
                                            c34848w0M109933h.f146775o = new C0794b();
                                            c34850x0M109930a2 = c34848w0M109933h.m109930a();
                                        } else {
                                            C0802j c0802jM131537d2 = c40563g.m131537d(c34850x0M109930a);
                                            C34848w0 c34848w0M109933h2 = c34850x0M109930a.m109933h();
                                            c34848w0M109933h2.f146767g = c0802jM131537d2;
                                            c34848w0M109933h2.f146775o = new C0794b();
                                            c34850x0M109930a2 = c34848w0M109933h2.m109930a();
                                        }
                                        if ("close".equalsIgnoreCase(c34850x0M109930a2.f146789w.f146714c.m109863a(str))) {
                                            interfaceC0799g.mo1932j().mo1920c();
                                        } else {
                                            strM109863a = c34850x0M109930a2.f146777F.m109863a(str);
                                            if (strM109863a == null) {
                                                strM109863a = null;
                                            }
                                            if ("close".equalsIgnoreCase(strM109863a)) {
                                                interfaceC0799g.mo1932j().mo1920c();
                                            }
                                        }
                                        if (i13 == 204) {
                                            throw new ProtocolException("HTTP " + i13 + " had non-zero Content-Length: " + c34850x0M109930a2.f146778G.mo1941i());
                                        }
                                        throw new ProtocolException("HTTP " + i13 + " had non-zero Content-Length: " + c34850x0M109930a2.f146778G.mo1941i());
                                        return c34850x0M109930a2;
                                    }
                                } catch (IOException e14) {
                                    abstractC34798a0.requestFailed(c40571o, e14);
                                    c40563g.m131539f(e14);
                                    throw e14;
                                }
                            } catch (IOException e15) {
                                e = e15;
                                c34848w0M131538e = null;
                            }
                        } else {
                            z16 = true;
                            c34848w0 = null;
                        }
                        if (c34848w0 == null) {
                            try {
                                if (abstractC34846v0.isDuplex()) {
                                    try {
                                        interfaceC0799g.mo1930h();
                                        abstractC34846v0.writeTo(AbstractC26604b.m79157b(c40563g.m131535b(c34832o0, true)));
                                    } catch (IOException e16) {
                                        abstractC34798a0.requestFailed(c40571o, e16);
                                        c40563g.m131539f(e16);
                                        throw e16;
                                    }
                                } else {
                                    C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(c40563g.m131535b(c34832o0, false));
                                    abstractC34846v0.writeTo(c26617h0M79157b);
                                    c26617h0M79157b.close();
                                }
                                str2 = "Connection";
                                r16 = "upgrade";
                            } catch (IOException e17) {
                                e = e17;
                                str2 = "Connection";
                                r16 = "upgrade";
                                c34848w0M131538e = c34848w0;
                                if (!(e instanceof ConnectionShutdownException)) {
                                    throw e;
                                }
                                throw e;
                            }
                        } else {
                            str2 = "Connection";
                            r16 = "upgrade";
                            try {
                                c40571o.m131552h(c40563g, true, false, false, false, null);
                                if (!(c40563g.m131536c().f174733j != null)) {
                                    interfaceC0799g.mo1932j().mo1920c();
                                }
                            } catch (IOException e18) {
                                e = e18;
                                c34848w0M131538e = c34848w0;
                                if (!(e instanceof ConnectionShutdownException)) {
                                    throw e;
                                }
                                throw e;
                            }
                        }
                        c34848w0M131538e = c34848w0;
                        r16 = r16;
                        z16 = z16;
                    } catch (IOException e19) {
                        e = e19;
                        str2 = "Connection";
                        r16 = "upgrade";
                        c34848w0M131538e = null;
                        z16 = true;
                        if (!(e instanceof ConnectionShutdownException)) {
                            throw e;
                        }
                        throw e;
                    }
                } else {
                    str2 = "Connection";
                    r16 = "upgrade";
                    c40571o.m131552h(c40563g, true, false, false, false, null);
                    c34848w0M131538e = null;
                    z16 = true;
                }
                if (abstractC34846v0 != null) {
                    try {
                        if (!abstractC34846v0.isDuplex()) {
                            try {
                                interfaceC0799g.mo1923a();
                            } catch (IOException e22) {
                                abstractC34798a0.requestFailed(c40571o, e22);
                                c40563g.m131539f(e22);
                                throw e22;
                            }
                        }
                        c34848w0M131538e2 = c34848w0M131538e;
                        iOException = null;
                        r15 = r16;
                        z4 = z16;
                    } catch (IOException e24) {
                        e = e24;
                        if (!(e instanceof ConnectionShutdownException)) {
                            throw e;
                        }
                        throw e;
                    }
                } else {
                    interfaceC0799g.mo1923a();
                    c34848w0M131538e2 = c34848w0M131538e;
                    iOException = null;
                    r15 = r16;
                    z4 = z16;
                }
                while (true) {
                    abstractC34799a1 = c34850x0M109930a.f146778G;
                    if (i13 != 100 && (102 > i13 || i13 >= 200)) {
                        break;
                    }
                    C34848w0 c34848w0M131538e4 = c40563g.m131538e(false);
                    AbstractC22676k.m65747g(c34848w0M131538e4);
                    if (z4) {
                        abstractC34798a0.responseHeadersStart(c40571o);
                    }
                    c34848w0M131538e4.f146761a = c34832o0;
                    c34848w0M131538e4.f146765e = c40563g.m131536c().f174729f;
                    c34848w0M131538e4.f146772l = jCurrentTimeMillis;
                    c34848w0M131538e4.f146773m = System.currentTimeMillis();
                    c34850x0M109930a = c34848w0M131538e4.m109930a();
                    i13 = c34850x0M109930a.f146792z;
                }
            } catch (IOException e25) {
                abstractC34798a0.requestFailed(c40571o, e25);
                c40563g.m131539f(e25);
                throw e25;
            }
        } catch (IOException e26) {
            e = e26;
        }
        if (c34848w0M131538e2 == null) {
            r15 = r16;
            z4 = z16;
            c34848w0M131538e2 = c40563g.m131538e(false);
            AbstractC22676k.m65747g(c34848w0M131538e2);
            if (z4) {
                abstractC34798a0.responseHeadersStart(c40571o);
                z4 = false;
            }
        }
        r15 = r16;
        z4 = z16;
        c34848w0M131538e2.f146761a = c34832o0;
        c34848w0M131538e2.f146765e = c40563g.m131536c().f174729f;
        c34848w0M131538e2.f146772l = jCurrentTimeMillis;
        c34848w0M131538e2.f146773m = System.currentTimeMillis();
        c34850x0M109930a = c34848w0M131538e2.m109930a();
        i13 = c34850x0M109930a.f146792z;
        abstractC34798a0.responseHeadersEnd(c40571o, c34850x0M109930a);
        if (i13 == 101) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            if (c40563g.m131536c().f174733j != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
            }
        }
        if (z13) {
            str = str2;
            strM109863a2 = c34850x0M109930a.f146777F.m109863a(str);
            if (strM109863a2 == null) {
                strM109863a2 = null;
            }
            if (r15.equalsIgnoreCase(strM109863a2)) {
                z15 = true;
            }
        } else {
            str = str2;
        }
        if (zEqualsIgnoreCase || !z15) {
            C0802j c0802jM131537d3 = c40563g.m131537d(c34850x0M109930a);
            C34848w0 c34848w0M109933h3 = c34850x0M109930a.m109933h();
            c34848w0M109933h3.f146767g = c0802jM131537d3;
            c34848w0M109933h3.f146775o = new C0794b();
            c34850x0M109930a2 = c34848w0M109933h3.m109930a();
        } else {
            C34848w0 c34848w0M109933h4 = c34850x0M109930a.m109933h();
            c34848w0M109933h4.f146767g = new C37170d(abstractC34799a1.mo1942k(), abstractC34799a1.mo1941i());
            c34848w0M109933h4.f146768h = c40563g.m131540g();
            c34850x0M109930a2 = c34848w0M109933h4.m109930a();
        }
        if ("close".equalsIgnoreCase(c34850x0M109930a2.f146789w.f146714c.m109863a(str))) {
            interfaceC0799g.mo1932j().mo1920c();
        } else {
            strM109863a = c34850x0M109930a2.f146777F.m109863a(str);
            if (strM109863a == null) {
                strM109863a = null;
            }
            if ("close".equalsIgnoreCase(strM109863a)) {
                interfaceC0799g.mo1932j().mo1920c();
            }
        }
        if ((i13 == 204 && i13 != 205) || c34850x0M109930a2.f146778G.mo1941i() <= 0) {
            return c34850x0M109930a2;
        }
        throw new ProtocolException("HTTP " + i13 + " had non-zero Content-Length: " + c34850x0M109930a2.f146778G.mo1941i());
    }
}
