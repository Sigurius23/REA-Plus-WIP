package oe3;

import java.io.EOFException;
import java.util.ArrayList;
import m83.AbstractC25265s;
import ne3.C26611e0;
import ne3.C26616h;
import ne3.C26622k;
import ne3.C26624l;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oe3.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27883c {

    /* JADX INFO: renamed from: a */
    public static final C26624l f112429a;

    /* JADX INFO: renamed from: b */
    public static final C26624l f112430b;

    /* JADX INFO: renamed from: c */
    public static final C26624l f112431c;

    /* JADX INFO: renamed from: d */
    public static final C26624l f112432d;

    /* JADX INFO: renamed from: e */
    public static final C26624l f112433e;

    static {
        C26622k c26622k = C26624l.f105882z;
        f112429a = C26622k.m79241b("/");
        f112430b = C26622k.m79241b("\\");
        f112431c = C26622k.m79241b("/\\");
        f112432d = C26622k.m79241b(".");
        f112433e = C26622k.m79241b("..");
    }

    /* JADX INFO: renamed from: a */
    public static final int m84154a(C26611e0 c26611e0) {
        C26624l c26624l = c26611e0.f105849w;
        if (c26624l.mo79253d() != 0) {
            if (c26624l.mo79257i(0) != 47) {
                if (c26624l.mo79257i(0) == 92) {
                    if (c26624l.mo79253d() > 2 && c26624l.mo79257i(1) == 92) {
                        C26624l other = f112430b;
                        AbstractC22676k.m65750j(other, "other");
                        int iMo79255f = c26624l.mo79255f(2, other.mo79256h());
                        return iMo79255f == -1 ? c26624l.mo79253d() : iMo79255f;
                    }
                } else if (c26624l.mo79253d() > 2 && c26624l.mo79257i(1) == 58 && c26624l.mo79257i(2) == 92) {
                    char cMo79257i = (char) c26624l.mo79257i(0);
                    if ('a' <= cMo79257i && cMo79257i < '{') {
                        return 3;
                    }
                    if ('A' <= cMo79257i && cMo79257i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static final C26611e0 m84155b(C26611e0 c26611e0, C26611e0 child, boolean z4) {
        AbstractC22676k.m65750j(child, "child");
        if (m84154a(child) != -1 || child.m79178g() != null) {
            return child;
        }
        C26624l c26624lM84156c = m84156c(c26611e0);
        if (c26624lM84156c == null && (c26624lM84156c = m84156c(child)) == null) {
            c26624lM84156c = m84159f(C26611e0.f105848x);
        }
        C26616h c26616h = new C26616h();
        c26616h.m79217l1(c26611e0.f105849w);
        if (c26616h.f105866x > 0) {
            c26616h.m79217l1(c26624lM84156c);
        }
        c26616h.m79217l1(child.f105849w);
        return m84157d(c26616h, z4);
    }

    /* JADX INFO: renamed from: c */
    public static final C26624l m84156c(C26611e0 c26611e0) {
        C26624l c26624l = c26611e0.f105849w;
        C26624l c26624l2 = f112429a;
        if (C26624l.m79247g(c26624l, c26624l2) != -1) {
            return c26624l2;
        }
        C26624l c26624l3 = c26611e0.f105849w;
        C26624l c26624l4 = f112430b;
        if (C26624l.m79247g(c26624l3, c26624l4) != -1) {
            return c26624l4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fe A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final C26611e0 m84157d(C26616h c26616h, boolean z4) throws EOFException {
        C26624l c26624l;
        long j7;
        char cM79229s;
        boolean z13;
        ArrayList arrayList;
        boolean zMo79222o;
        C26624l c26624l2;
        int size;
        int i13;
        long jMo79206f0;
        C26624l c26624lMo79218m0;
        C26624l c26624l3;
        C26616h c26616h2 = new C26616h();
        C26624l c26624lM84158e = null;
        int i14 = 0;
        while (true) {
            if (!c26616h.mo79202d0(0L, f112429a)) {
                c26624l = f112430b;
                if (!c26616h.mo79202d0(0L, c26624l)) {
                    break;
                }
            }
            byte b = c26616h.readByte();
            if (c26624lM84158e == null) {
                c26624lM84158e = m84158e(b);
            }
            i14++;
        }
        boolean z14 = i14 >= 2 && AbstractC22676k.m65745e(c26624lM84158e, c26624l);
        C26624l c26624l4 = f112431c;
        if (z14) {
            AbstractC22676k.m65747g(c26624lM84158e);
            c26616h2.m79217l1(c26624lM84158e);
            c26616h2.m79217l1(c26624lM84158e);
        } else {
            if (i14 <= 0) {
                long jMo79206f1 = c26616h.mo79206f0(c26624l4);
                if (c26624lM84158e == null) {
                    c26624lM84158e = jMo79206f1 == -1 ? m84159f(C26611e0.f105848x) : m84158e(c26616h.m79229s(jMo79206f1));
                }
                if (AbstractC22676k.m65745e(c26624lM84158e, c26624l) && c26616h.f105866x >= 2) {
                    j7 = -1;
                    if (c26616h.m79229s(1L) == 58 && (('a' <= (cM79229s = (char) c26616h.m79229s(0L)) && cM79229s < '{') || ('A' <= cM79229s && cM79229s < '['))) {
                        if (jMo79206f1 == 2) {
                            c26616h2.write(c26616h, 3L);
                        } else {
                            c26616h2.write(c26616h, 2L);
                        }
                    }
                }
                if (c26616h2.f105866x > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zMo79222o = c26616h.mo79222o();
                    c26624l2 = f112432d;
                    if (!zMo79222o) {
                        break;
                    }
                    jMo79206f0 = c26616h.mo79206f0(c26624l4);
                    if (jMo79206f0 == j7) {
                        c26624lMo79218m0 = c26616h.mo79218m0(c26616h.f105866x);
                    } else {
                        c26624lMo79218m0 = c26616h.mo79218m0(jMo79206f0);
                        c26616h.readByte();
                    }
                    c26624l3 = f112433e;
                    if (AbstractC22676k.m65745e(c26624lMo79218m0, c26624l3)) {
                        if (z13 || !arrayList.isEmpty()) {
                            if (z4 || (!z13 && (arrayList.isEmpty() || AbstractC22676k.m65745e(AbstractC25265s.m74112P0(arrayList), c26624l3)))) {
                                arrayList.add(c26624lMo79218m0);
                            } else if (!z14 || arrayList.size() != 1) {
                                AbstractC25265s.m74136m1(arrayList);
                            }
                        }
                    } else if (AbstractC22676k.m65745e(c26624lMo79218m0, c26624l2) && !AbstractC22676k.m65745e(c26624lMo79218m0, C26624l.f105881E)) {
                        arrayList.add(c26624lMo79218m0);
                    }
                }
                size = arrayList.size();
                for (i13 = 0; i13 < size; i13++) {
                    if (i13 > 0) {
                        c26616h2.m79217l1(c26624lM84158e);
                    }
                    c26616h2.m79217l1((C26624l) arrayList.get(i13));
                }
                if (c26616h2.f105866x == 0) {
                    c26616h2.m79217l1(c26624l2);
                }
                return new C26611e0(c26616h2.mo79218m0(c26616h2.f105866x));
            }
            AbstractC22676k.m65747g(c26624lM84158e);
            c26616h2.m79217l1(c26624lM84158e);
        }
        j7 = -1;
        if (c26616h2.f105866x > 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zMo79222o = c26616h.mo79222o();
            c26624l2 = f112432d;
            if (!zMo79222o) {
                break;
                break;
            }
            jMo79206f0 = c26616h.mo79206f0(c26624l4);
            if (jMo79206f0 == j7) {
                c26624lMo79218m0 = c26616h.mo79218m0(c26616h.f105866x);
            } else {
                c26624lMo79218m0 = c26616h.mo79218m0(jMo79206f0);
                c26616h.readByte();
            }
            c26624l3 = f112433e;
            if (AbstractC22676k.m65745e(c26624lMo79218m0, c26624l3)) {
                if (z13) {
                }
                if (z4) {
                }
                arrayList.add(c26624lMo79218m0);
            } else if (AbstractC22676k.m65745e(c26624lMo79218m0, c26624l2)) {
            }
        }
        size = arrayList.size();
        while (i13 < size) {
            if (i13 > 0) {
                c26616h2.m79217l1(c26624lM84158e);
            }
            c26616h2.m79217l1((C26624l) arrayList.get(i13));
        }
        if (c26616h2.f105866x == 0) {
            c26616h2.m79217l1(c26624l2);
        }
        return new C26611e0(c26616h2.mo79218m0(c26616h2.f105866x));
    }

    /* JADX INFO: renamed from: e */
    public static final C26624l m84158e(byte b) {
        if (b == 47) {
            return f112429a;
        }
        if (b == 92) {
            return f112430b;
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(b, "not a directory separator: "));
    }

    /* JADX INFO: renamed from: f */
    public static final C26624l m84159f(String str) {
        if (AbstractC22676k.m65745e(str, "/")) {
            return f112429a;
        }
        if (AbstractC22676k.m65745e(str, "\\")) {
            return f112430b;
        }
        throw new IllegalArgumentException(AbstractC11266d.m30461o("not a directory separator: ", str));
    }
}
