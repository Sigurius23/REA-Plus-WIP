package ae3;

import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import m83.C25272z;
import ne3.C26616h;
import ne3.C26622k;
import ne3.C26624l;
import p460rg.AbstractC31375j;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34827m;
import ud3.C34839s;
import ud3.C34841t;
import ud3.C34850x0;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import yb3.AbstractC39397a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ae3.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0800h {

    /* JADX INFO: renamed from: a */
    public static final C26624l f2949a;

    /* JADX INFO: renamed from: b */
    public static final C26624l f2950b;

    static {
        C26622k c26622k = C26624l.f105882z;
        f2949a = C26622k.m79241b("\"\\");
        f2950b = C26622k.m79241b("\t ,=");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m1933a(C34850x0 c34850x0) {
        if (AbstractC22676k.m65745e(c34850x0.f146789w.f146713b, "HEAD")) {
            return false;
        }
        int i13 = c34850x0.f146792z;
        if (((i13 < 100 || i13 >= 200) && i13 != 204 && i13 != 304) || AbstractC37174h.m119138e(c34850x0) != -1) {
            return true;
        }
        String strM109863a = c34850x0.f146777F.m109863a("Transfer-Encoding");
        if (strM109863a == null) {
            strM109863a = null;
        }
        return "chunked".equalsIgnoreCase(strM109863a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0106 A[EDGE_INSN: B:76:0x0106->B:64:0x0106 BREAK  A[LOOP:2: B:22:0x006f->B:63:0x0103], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m1934b(C26616h c26616h, ArrayList arrayList) {
        String strM1935c;
        while (true) {
            String strM1935c2 = null;
            while (true) {
                if (strM1935c2 == null) {
                    m1937e(c26616h);
                    strM1935c2 = m1935c(c26616h);
                    if (strM1935c2 == null) {
                        return;
                    }
                }
                boolean zM1937e = m1937e(c26616h);
                String strM1935c3 = m1935c(c26616h);
                if (strM1935c3 == null) {
                    if (c26616h.mo79222o()) {
                        arrayList.add(new C34827m(strM1935c2, C25272z.f99163w));
                        return;
                    }
                    return;
                }
                int iM119131p = AbstractC37172f.m119131p(c26616h);
                boolean zM1937e2 = m1937e(c26616h);
                if (zM1937e || !(zM1937e2 || c26616h.mo79222o())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iM119131p2 = AbstractC37172f.m119131p(c26616h) + iM119131p;
                    while (true) {
                        if (strM1935c3 != null) {
                            if (iM119131p2 != 0) {
                                break;
                                break;
                            }
                            if (iM119131p2 <= 1) {
                                return;
                            }
                            if (c26616h.mo79222o()) {
                                strM1935c = m1935c(c26616h);
                            } else {
                                strM1935c = m1935c(c26616h);
                            }
                            if (strM1935c != null) {
                                return;
                            }
                            if (m1937e(c26616h)) {
                            }
                            strM1935c3 = null;
                        } else {
                            strM1935c3 = m1935c(c26616h);
                            if (!m1937e(c26616h)) {
                                iM119131p2 = AbstractC37172f.m119131p(c26616h);
                                if (iM119131p2 != 0) {
                                    break;
                                }
                                if (iM119131p2 <= 1 || m1937e(c26616h)) {
                                    return;
                                }
                                if (c26616h.mo79222o() || c26616h.m79229s(0L) != 34) {
                                    strM1935c = m1935c(c26616h);
                                } else {
                                    if (c26616h.readByte() != 34) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    C26616h c26616h2 = new C26616h();
                                    while (true) {
                                        long jMo79206f0 = c26616h.mo79206f0(f2949a);
                                        if (jMo79206f0 != -1) {
                                            if (c26616h.m79229s(jMo79206f0) == 34) {
                                                c26616h2.write(c26616h, jMo79206f0);
                                                c26616h.readByte();
                                                strM1935c = c26616h2.m79194S0();
                                                break;
                                            } else if (c26616h.f105866x != jMo79206f0 + 1) {
                                                c26616h2.write(c26616h, jMo79206f0);
                                                c26616h.readByte();
                                                c26616h2.write(c26616h, 1L);
                                            }
                                        }
                                        strM1935c = null;
                                        break;
                                    }
                                }
                                if (strM1935c != null || ((String) linkedHashMap.put(strM1935c3, strM1935c)) != null) {
                                    return;
                                }
                                if (m1937e(c26616h) && !c26616h.mo79222o()) {
                                    return;
                                } else {
                                    strM1935c3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    arrayList.add(new C34827m(strM1935c2, linkedHashMap));
                    strM1935c2 = strM1935c3;
                } else {
                    StringBuilder sbM53374o = AbstractC18489d0.m53374o(strM1935c3);
                    sbM53374o.append(AbstractC39421y.m125925J(iM119131p, "="));
                    Map mapSingletonMap = Collections.singletonMap(null, sbM53374o.toString());
                    AbstractC22676k.m65749i(mapSingletonMap, "singletonMap(...)");
                    arrayList.add(new C34827m(strM1935c2, mapSingletonMap));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m1935c(C26616h c26616h) {
        long jMo79206f0 = c26616h.mo79206f0(f2950b);
        if (jMo79206f0 == -1) {
            jMo79206f0 = c26616h.f105866x;
        }
        if (jMo79206f0 != 0) {
            return c26616h.m79188M0(jMo79206f0, AbstractC39397a.f169546a);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m1936d(C34841t c34841t, C34810e0 url, C34807d0 headers) {
        AbstractC22676k.m65750j(c34841t, "<this>");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(headers, "headers");
        if (c34841t == C34841t.f146748w) {
            return;
        }
        Pattern pattern = C34839s.f146732k;
        AbstractC31375j.m96495k(url, headers).isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m1937e(C26616h c26616h) {
        boolean z4 = false;
        while (!c26616h.mo79222o()) {
            byte bM79229s = c26616h.m79229s(0L);
            if (bM79229s != 44) {
                if (bM79229s != 32 && bM79229s != 9) {
                    break;
                }
                c26616h.readByte();
            } else {
                c26616h.readByte();
                z4 = true;
            }
        }
        return z4;
    }
}
