package p333n4;

import java.util.HashSet;
import p319m4.C25015d;
import p319m4.C25016e;
import p319m4.C25017f;
import p319m4.C25020i;

/* JADX INFO: renamed from: n4.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC26253i {

    /* JADX INFO: renamed from: a */
    public static final C26246b f104393a = new C26246b();

    /* JADX INFO: renamed from: a */
    public static boolean m77919a(C25016e c25016e) {
        int[] iArr = c25016e.f97940q0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        C25017f c25017f = c25016e.f97901U;
        if (c25017f == null) {
            c25017f = null;
        }
        if (c25017f != null) {
            int i15 = c25017f.f97940q0[0];
        }
        if (c25017f != null) {
            int i16 = c25017f.f97940q0[1];
        }
        boolean z4 = i13 == 1 || c25016e.mo73394B() || i13 == 2 || (i13 == 3 && c25016e.f97942s == 0 && c25016e.f97904X == 0.0f && c25016e.m73448u(0)) || (i13 == 3 && c25016e.f97942s == 1 && c25016e.m73449v(0, c25016e.m73445r()));
        boolean z13 = i14 == 1 || c25016e.mo73395C() || i14 == 2 || (i14 == 3 && c25016e.f97943t == 0 && c25016e.f97904X == 0.0f && c25016e.m73448u(1)) || (i14 == 3 && c25016e.f97943t == 1 && c25016e.m73449v(1, c25016e.m73441l()));
        return (c25016e.f97904X > 0.0f && (z4 || z13)) || (z4 && z13);
    }

    /* JADX INFO: renamed from: b */
    public static void m77920b(int i13, C25016e c25016e, InterfaceC26247c interfaceC26247c, boolean z4) {
        C25015d c25015d;
        C25015d c25015d2;
        boolean z13;
        C25015d c25015d3;
        C25015d c25015d4;
        if (c25016e.f97933n) {
            return;
        }
        if (!(c25016e instanceof C25017f) && c25016e.m73415A() && m77919a(c25016e)) {
            C25017f.m73454b0(c25016e, interfaceC26247c, new C26246b());
        }
        C25015d c25015dMo73439j = c25016e.mo73439j(2);
        C25015d c25015dMo73439j2 = c25016e.mo73439j(4);
        int iM73402d = c25015dMo73439j.m73402d();
        int iM73402d2 = c25015dMo73439j2.m73402d();
        HashSet<C25015d> hashSet = c25015dMo73439j.f97872a;
        if (hashSet != null && c25015dMo73439j.f97874c) {
            for (C25015d c25015d5 : hashSet) {
                C25016e c25016e2 = c25015d5.f97875d;
                int i14 = i13 + 1;
                boolean zM77919a = m77919a(c25016e2);
                C25015d c25015d6 = c25016e2.f97890J;
                C25015d c25015d7 = c25016e2.f97892L;
                if (c25016e2.m73415A() && zM77919a) {
                    z13 = true;
                    C25017f.m73454b0(c25016e2, interfaceC26247c, new C26246b());
                } else {
                    z13 = true;
                }
                boolean z14 = ((c25015d5 == c25015d6 && (c25015d4 = c25015d7.f97877f) != null && c25015d4.f97874c) || (c25015d5 == c25015d7 && (c25015d3 = c25015d6.f97877f) != null && c25015d3.f97874c)) ? z13 : false;
                int i15 = c25016e2.f97940q0[0];
                if (i15 != 3 || zM77919a) {
                    if (!c25016e2.m73415A()) {
                        if (c25015d5 == c25015d6 && c25015d7.f97877f == null) {
                            int iM73403e = c25015d6.m73403e() + iM73402d;
                            c25016e2.m73422L(iM73403e, c25016e2.m73445r() + iM73403e);
                            m77920b(i14, c25016e2, interfaceC26247c, z4);
                        } else if (c25015d5 == c25015d7 && c25015d6.f97877f == null) {
                            int iM73403e2 = iM73402d - c25015d7.m73403e();
                            c25016e2.m73422L(iM73403e2 - c25016e2.m73445r(), iM73403e2);
                            m77920b(i14, c25016e2, interfaceC26247c, z4);
                        } else if (z14 && !c25016e2.m73452y()) {
                            m77921c(i14, c25016e2, interfaceC26247c, z4);
                        }
                    }
                } else if (i15 == 3 && c25016e2.f97946w >= 0 && c25016e2.f97945v >= 0 && (c25016e2.f97922h0 == 8 || (c25016e2.f97942s == 0 && c25016e2.f97904X == 0.0f))) {
                    if (!c25016e2.m73452y() && !c25016e2.f97887G && z14 && !c25016e2.m73452y()) {
                        m77922d(i14, c25016e, interfaceC26247c, c25016e2, z4);
                    }
                }
            }
        }
        if (c25016e instanceof C25020i) {
            return;
        }
        HashSet<C25015d> hashSet2 = c25015dMo73439j2.f97872a;
        if (hashSet2 != null && c25015dMo73439j2.f97874c) {
            for (C25015d c25015d8 : hashSet2) {
                C25016e c25016e3 = c25015d8.f97875d;
                int i16 = i13 + 1;
                boolean zM77919a2 = m77919a(c25016e3);
                C25015d c25015d9 = c25016e3.f97890J;
                C25015d c25015d10 = c25016e3.f97892L;
                if (c25016e3.m73415A() && zM77919a2) {
                    C25017f.m73454b0(c25016e3, interfaceC26247c, new C26246b());
                }
                boolean z15 = (c25015d8 == c25015d9 && (c25015d2 = c25015d10.f97877f) != null && c25015d2.f97874c) || (c25015d8 == c25015d10 && (c25015d = c25015d9.f97877f) != null && c25015d.f97874c);
                int i17 = c25016e3.f97940q0[0];
                if (i17 != 3 || zM77919a2) {
                    if (!c25016e3.m73415A()) {
                        if (c25015d8 == c25015d9 && c25015d10.f97877f == null) {
                            int iM73403e3 = c25015d9.m73403e() + iM73402d2;
                            c25016e3.m73422L(iM73403e3, c25016e3.m73445r() + iM73403e3);
                            m77920b(i16, c25016e3, interfaceC26247c, z4);
                        } else if (c25015d8 == c25015d10 && c25015d9.f97877f == null) {
                            int iM73403e4 = iM73402d2 - c25015d10.m73403e();
                            c25016e3.m73422L(iM73403e4 - c25016e3.m73445r(), iM73403e4);
                            m77920b(i16, c25016e3, interfaceC26247c, z4);
                        } else if (z15 && !c25016e3.m73452y()) {
                            m77921c(i16, c25016e3, interfaceC26247c, z4);
                        }
                    }
                } else if (i17 == 3 && c25016e3.f97946w >= 0 && c25016e3.f97945v >= 0) {
                    if (c25016e3.f97922h0 == 8 || (c25016e3.f97942s == 0 && c25016e3.f97904X == 0.0f)) {
                        if (!c25016e3.m73452y() && !c25016e3.f97887G && z15 && !c25016e3.m73452y()) {
                            m77922d(i16, c25016e, interfaceC26247c, c25016e3, z4);
                        }
                    }
                }
            }
        }
        c25016e.f97933n = true;
    }

    /* JADX INFO: renamed from: c */
    public static void m77921c(int i13, C25016e c25016e, InterfaceC26247c interfaceC26247c, boolean z4) {
        float f13 = c25016e.f97916e0;
        C25015d c25015d = c25016e.f97890J;
        int iM73402d = c25015d.f97877f.m73402d();
        C25015d c25015d2 = c25016e.f97892L;
        int iM73402d2 = c25015d2.f97877f.m73402d();
        int iM73403e = c25015d.m73403e() + iM73402d;
        int iM73403e2 = iM73402d2 - c25015d2.m73403e();
        if (iM73402d == iM73402d2) {
            f13 = 0.5f;
        } else {
            iM73402d = iM73403e;
            iM73402d2 = iM73403e2;
        }
        int iM73445r = c25016e.m73445r();
        int i14 = (iM73402d2 - iM73402d) - iM73445r;
        if (iM73402d > iM73402d2) {
            i14 = (iM73402d - iM73402d2) - iM73445r;
        }
        int i15 = ((int) (i14 > 0 ? (f13 * i14) + 0.5f : f13 * i14)) + iM73402d;
        int i16 = i15 + iM73445r;
        if (iM73402d > iM73402d2) {
            i16 = i15 - iM73445r;
        }
        c25016e.m73422L(i15, i16);
        m77920b(i13 + 1, c25016e, interfaceC26247c, z4);
    }

    /* JADX INFO: renamed from: d */
    public static void m77922d(int i13, C25016e c25016e, InterfaceC26247c interfaceC26247c, C25016e c25016e2, boolean z4) {
        float f13 = c25016e2.f97916e0;
        C25015d c25015d = c25016e2.f97890J;
        int iM73403e = c25015d.m73403e() + c25015d.f97877f.m73402d();
        C25015d c25015d2 = c25016e2.f97892L;
        int iM73402d = c25015d2.f97877f.m73402d() - c25015d2.m73403e();
        if (iM73402d >= iM73403e) {
            int iM73445r = c25016e2.m73445r();
            if (c25016e2.f97922h0 != 8) {
                int i14 = c25016e2.f97942s;
                if (i14 == 2) {
                    iM73445r = (int) (c25016e2.f97916e0 * 0.5f * (c25016e instanceof C25017f ? c25016e.m73445r() : c25016e.f97901U.m73445r()));
                } else if (i14 == 0) {
                    iM73445r = iM73402d - iM73403e;
                }
                iM73445r = Math.max(c25016e2.f97945v, iM73445r);
                int i15 = c25016e2.f97946w;
                if (i15 > 0) {
                    iM73445r = Math.min(i15, iM73445r);
                }
            }
            int i16 = iM73403e + ((int) ((f13 * ((iM73402d - iM73403e) - iM73445r)) + 0.5f));
            c25016e2.m73422L(i16, iM73445r + i16);
            m77920b(i13 + 1, c25016e2, interfaceC26247c, z4);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m77923e(int i13, C25016e c25016e, InterfaceC26247c interfaceC26247c) {
        float f13 = c25016e.f97918f0;
        C25015d c25015d = c25016e.f97891K;
        int iM73402d = c25015d.f97877f.m73402d();
        C25015d c25015d2 = c25016e.f97893M;
        int iM73402d2 = c25015d2.f97877f.m73402d();
        int iM73403e = c25015d.m73403e() + iM73402d;
        int iM73403e2 = iM73402d2 - c25015d2.m73403e();
        if (iM73402d == iM73402d2) {
            f13 = 0.5f;
        } else {
            iM73402d = iM73403e;
            iM73402d2 = iM73403e2;
        }
        int iM73441l = c25016e.m73441l();
        int i14 = (iM73402d2 - iM73402d) - iM73441l;
        if (iM73402d > iM73402d2) {
            i14 = (iM73402d - iM73402d2) - iM73441l;
        }
        int i15 = (int) (i14 > 0 ? (f13 * i14) + 0.5f : f13 * i14);
        int i16 = iM73402d + i15;
        int i17 = i16 + iM73441l;
        if (iM73402d > iM73402d2) {
            i16 = iM73402d - i15;
            i17 = i16 - iM73441l;
        }
        c25016e.m73423M(i16, i17);
        m77925g(i13 + 1, c25016e, interfaceC26247c);
    }

    /* JADX INFO: renamed from: f */
    public static void m77924f(int i13, C25016e c25016e, InterfaceC26247c interfaceC26247c, C25016e c25016e2) {
        float f13 = c25016e2.f97918f0;
        C25015d c25015d = c25016e2.f97891K;
        int iM73403e = c25015d.m73403e() + c25015d.f97877f.m73402d();
        C25015d c25015d2 = c25016e2.f97893M;
        int iM73402d = c25015d2.f97877f.m73402d() - c25015d2.m73403e();
        if (iM73402d >= iM73403e) {
            int iM73441l = c25016e2.m73441l();
            if (c25016e2.f97922h0 != 8) {
                int i14 = c25016e2.f97943t;
                if (i14 == 2) {
                    iM73441l = (int) (f13 * 0.5f * (c25016e instanceof C25017f ? c25016e.m73441l() : c25016e.f97901U.m73441l()));
                } else if (i14 == 0) {
                    iM73441l = iM73402d - iM73403e;
                }
                iM73441l = Math.max(c25016e2.f97948y, iM73441l);
                int i15 = c25016e2.f97949z;
                if (i15 > 0) {
                    iM73441l = Math.min(i15, iM73441l);
                }
            }
            int i16 = iM73403e + ((int) ((f13 * ((iM73402d - iM73403e) - iM73441l)) + 0.5f));
            c25016e2.m73423M(i16, iM73441l + i16);
            m77925g(i13 + 1, c25016e2, interfaceC26247c);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m77925g(int i13, C25016e c25016e, InterfaceC26247c interfaceC26247c) {
        boolean z4;
        C25015d c25015d;
        C25015d c25015d2;
        C25015d c25015d3;
        C25015d c25015d4;
        if (c25016e.f97935o) {
            return;
        }
        if (!(c25016e instanceof C25017f) && c25016e.m73415A() && m77919a(c25016e)) {
            C25017f.m73454b0(c25016e, interfaceC26247c, new C26246b());
        }
        C25015d c25015dMo73439j = c25016e.mo73439j(3);
        C25015d c25015dMo73439j2 = c25016e.mo73439j(5);
        int iM73402d = c25015dMo73439j.m73402d();
        int iM73402d2 = c25015dMo73439j2.m73402d();
        HashSet<C25015d> hashSet = c25015dMo73439j.f97872a;
        if (hashSet != null && c25015dMo73439j.f97874c) {
            for (C25015d c25015d5 : hashSet) {
                C25016e c25016e2 = c25015d5.f97875d;
                int i14 = i13 + 1;
                boolean zM77919a = m77919a(c25016e2);
                C25015d c25015d6 = c25016e2.f97891K;
                C25015d c25015d7 = c25016e2.f97893M;
                if (c25016e2.m73415A() && zM77919a) {
                    C25017f.m73454b0(c25016e2, interfaceC26247c, new C26246b());
                }
                boolean z13 = (c25015d5 == c25015d6 && (c25015d4 = c25015d7.f97877f) != null && c25015d4.f97874c) || (c25015d5 == c25015d7 && (c25015d3 = c25015d6.f97877f) != null && c25015d3.f97874c);
                int i15 = c25016e2.f97940q0[1];
                if (i15 != 3 || zM77919a) {
                    if (!c25016e2.m73415A()) {
                        if (c25015d5 == c25015d6 && c25015d7.f97877f == null) {
                            int iM73403e = c25015d6.m73403e() + iM73402d;
                            c25016e2.m73423M(iM73403e, c25016e2.m73441l() + iM73403e);
                            m77925g(i14, c25016e2, interfaceC26247c);
                        } else if (c25015d5 == c25015d7 && c25015d6.f97877f == null) {
                            int iM73403e2 = iM73402d - c25015d7.m73403e();
                            c25016e2.m73423M(iM73403e2 - c25016e2.m73441l(), iM73403e2);
                            m77925g(i14, c25016e2, interfaceC26247c);
                        } else if (z13 && !c25016e2.m73453z()) {
                            m77923e(i14, c25016e2, interfaceC26247c);
                        }
                    }
                } else if (i15 == 3 && c25016e2.f97949z >= 0 && c25016e2.f97948y >= 0 && (c25016e2.f97922h0 == 8 || (c25016e2.f97943t == 0 && c25016e2.f97904X == 0.0f))) {
                    if (!c25016e2.m73453z() && !c25016e2.f97887G && z13 && !c25016e2.m73453z()) {
                        m77924f(i14, c25016e, interfaceC26247c, c25016e2);
                    }
                }
            }
        }
        boolean z14 = true;
        z14 = true;
        z14 = true;
        if (c25016e instanceof C25020i) {
            return;
        }
        HashSet<C25015d> hashSet2 = c25015dMo73439j2.f97872a;
        if (hashSet2 != null && c25015dMo73439j2.f97874c) {
            for (C25015d c25015d8 : hashSet2) {
                C25016e c25016e3 = c25015d8.f97875d;
                int i16 = i13 + 1;
                boolean zM77919a2 = m77919a(c25016e3);
                C25015d c25015d9 = c25016e3.f97891K;
                C25015d c25015d10 = c25016e3.f97893M;
                if (c25016e3.m73415A() && zM77919a2) {
                    C25017f.m73454b0(c25016e3, interfaceC26247c, new C26246b());
                }
                boolean z15 = (c25015d8 == c25015d9 && (c25015d2 = c25015d10.f97877f) != null && c25015d2.f97874c) || (c25015d8 == c25015d10 && (c25015d = c25015d9.f97877f) != null && c25015d.f97874c);
                int i17 = c25016e3.f97940q0[1];
                if (i17 != 3 || zM77919a2) {
                    if (!c25016e3.m73415A()) {
                        if (c25015d8 == c25015d9 && c25015d10.f97877f == null) {
                            int iM73403e3 = c25015d9.m73403e() + iM73402d2;
                            c25016e3.m73423M(iM73403e3, c25016e3.m73441l() + iM73403e3);
                            m77925g(i16, c25016e3, interfaceC26247c);
                        } else if (c25015d8 == c25015d10 && c25015d9.f97877f == null) {
                            int iM73403e4 = iM73402d2 - c25015d10.m73403e();
                            c25016e3.m73423M(iM73403e4 - c25016e3.m73441l(), iM73403e4);
                            m77925g(i16, c25016e3, interfaceC26247c);
                        } else if (z15 && !c25016e3.m73453z()) {
                            m77923e(i16, c25016e3, interfaceC26247c);
                        }
                    }
                } else if (i17 == 3 && c25016e3.f97949z >= 0 && c25016e3.f97948y >= 0 && (c25016e3.f97922h0 == 8 || (c25016e3.f97943t == 0 && c25016e3.f97904X == 0.0f))) {
                    if (!c25016e3.m73453z() && !c25016e3.f97887G && z15 && !c25016e3.m73453z()) {
                        m77924f(i16, c25016e, interfaceC26247c, c25016e3);
                    }
                }
            }
        }
        C25015d c25015dMo73439j3 = c25016e.mo73439j(6);
        if (c25015dMo73439j3.f97872a != null && c25015dMo73439j3.f97874c) {
            int iM73402d3 = c25015dMo73439j3.m73402d();
            for (C25015d c25015d11 : c25015dMo73439j3.f97872a) {
                C25016e c25016e4 = c25015d11.f97875d;
                int i18 = i13 + 1;
                boolean zM77919a3 = m77919a(c25016e4);
                C25015d c25015d12 = c25016e4.f97894N;
                if (c25016e4.m73415A() && zM77919a3) {
                    C25017f.m73454b0(c25016e4, interfaceC26247c, new C26246b());
                }
                if (c25016e4.f97940q0[z14 ? 1 : 0] != 3 || zM77919a3) {
                    if (!c25016e4.m73415A()) {
                        if (c25015d11 == c25015d12) {
                            int iM73403e5 = c25015d11.m73403e() + iM73402d3;
                            if (c25016e4.f97886F) {
                                int i19 = iM73403e5 - c25016e4.f97910b0;
                                int i24 = c25016e4.f97903W + i19;
                                c25016e4.f97908a0 = i19;
                                c25016e4.f97891K.m73410l(i19);
                                c25016e4.f97893M.m73410l(i24);
                                c25015d12.m73410l(iM73403e5);
                                z4 = z14 ? 1 : 0;
                                c25016e4.f97931m = z4;
                            } else {
                                z4 = z14 ? 1 : 0;
                            }
                            m77925g(i18, c25016e4, interfaceC26247c);
                        }
                        z14 = z4;
                    }
                }
                z4 = z14 ? 1 : 0;
                z14 = z4;
            }
        }
        c25016e.f97935o = z14;
    }
}
