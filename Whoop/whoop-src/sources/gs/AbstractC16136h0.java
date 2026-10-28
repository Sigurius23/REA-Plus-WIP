package gs;

import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.TinkBugException;
import p692zt.C41113q;

/* JADX INFO: renamed from: gs.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16136h0 {

    /* JADX INFO: renamed from: a */
    public static final C16148q f61281a;

    /* JADX INFO: renamed from: b */
    public static final C16148q f61282b;

    /* JADX INFO: renamed from: c */
    public static final C16145n f61283c;

    /* JADX INFO: renamed from: d */
    public static final C16145n f61284d;

    /* JADX INFO: renamed from: e */
    public static final C16141k f61285e;

    /* JADX INFO: renamed from: f */
    public static final C16141k f61286f;

    static {
        C16139j c16139j = C16139j.f61301h;
        C16139j c16139j2 = C16139j.f61298e;
        C16139j c16139j3 = C16139j.f61304k;
        C16139j c16139j4 = C16139j.f61307n;
        try {
            C41113q c41113qM45693b = C16148q.m45693b();
            c41113qM45693b.m133457I();
            c41113qM45693b.m133459K(16);
            c41113qM45693b.m133460L();
            c41113qM45693b.f177222E = c16139j4;
            f61281a = c41113qM45693b.m133465j();
            try {
                C41113q c41113qM45693b2 = C16148q.m45693b();
                c41113qM45693b2.m133457I();
                c41113qM45693b2.m133459K(32);
                c41113qM45693b2.m133460L();
                c41113qM45693b2.f177222E = c16139j4;
                f61282b = c41113qM45693b2.m133465j();
                try {
                    C41113q c41113qM45692b = C16145n.m45692b();
                    c41113qM45692b.m133458J(16);
                    c41113qM45692b.m133459K(16);
                    c41113qM45692b.m133460L();
                    c41113qM45692b.f177222E = c16139j3;
                    f61283c = c41113qM45692b.m133464g();
                    try {
                        C41113q c41113qM45692b2 = C16145n.m45692b();
                        c41113qM45692b2.m133458J(16);
                        c41113qM45692b2.m133459K(32);
                        c41113qM45692b2.m133460L();
                        c41113qM45692b2.f177222E = c16139j3;
                        f61284d = c41113qM45692b2.m133464g();
                        try {
                            C5099k0 c5099k0M45691b = C16141k.m45691b();
                            c5099k0M45691b.m15995M(16);
                            c5099k0M45691b.m15998P(32);
                            c5099k0M45691b.m16000S(16);
                            c5099k0M45691b.m15999Q(16);
                            c5099k0M45691b.f21436E = c16139j2;
                            c5099k0M45691b.f21437F = c16139j;
                            f61285e = c5099k0M45691b.m16006f();
                            try {
                                C5099k0 c5099k0M45691b2 = C16141k.m45691b();
                                c5099k0M45691b2.m15995M(32);
                                c5099k0M45691b2.m15998P(32);
                                c5099k0M45691b2.m16000S(32);
                                c5099k0M45691b2.m15999Q(16);
                                c5099k0M45691b2.f21436E = c16139j2;
                                c5099k0M45691b2.f21437F = c16139j;
                                f61286f = c5099k0M45691b2.m16006f();
                            } catch (Exception e5) {
                                throw new TinkBugException(e5);
                            }
                        } catch (Exception e13) {
                            throw new TinkBugException(e13);
                        }
                    } catch (Exception e14) {
                        throw new TinkBugException(e14);
                    }
                } catch (Exception e15) {
                    throw new TinkBugException(e15);
                }
            } catch (Exception e16) {
                throw new TinkBugException(e16);
            }
        } catch (Exception e17) {
            throw new TinkBugException(e17);
        }
    }
}
