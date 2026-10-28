package p005a3;

import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.profileinstaller.ProfileVerifier;
import com.google.crypto.tink.internal.C5101l0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.AbstractC0065z0;
import p002a0.C0039m0;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2315u;
import p134f2.InterfaceC14017f;
import p135f3.InterfaceC14037a;
import p164g2.AbstractC15235g;
import p164g2.C15236h;
import p164g2.C15240l;
import p164g2.C15252x;
import p164g2.InterfaceC15233e;
import p164g2.InterfaceC15245q;
import p209i3.InterfaceC18031m;
import p389p0.C28514d;
import p446r1.C30849c;
import p477s2.InterfaceC32074f;
import p512u2.InterfaceC34475u;
import p570w2.C36706a;
import p603x2.AbstractC37831a;
import p635y2.InterfaceC39080c0;
import p635y2.InterfaceC39095g1;
import p669z2.InterfaceC40000c;
import p669z2.InterfaceC40002e;
import p669z2.InterfaceC40003f;

/* JADX INFO: renamed from: a3.r1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0247r1 {

    /* JADX INFO: renamed from: a */
    public static final C0039m0 f856a;

    static {
        C0039m0 c0039m0 = AbstractC0065z0.f204a;
        f856a = new C0039m0();
    }

    /* JADX INFO: renamed from: a */
    public static final void m763a(AbstractC2316v abstractC2316v, int i13, int i14) {
        if (!(abstractC2316v instanceof AbstractC0233o)) {
            m764b(abstractC2316v, i13 & abstractC2316v.f9144y, i14);
            return;
        }
        AbstractC0233o abstractC0233o = (AbstractC0233o) abstractC2316v;
        int i15 = abstractC0233o.f803O;
        m764b(abstractC2316v, i15 & i13, i14);
        int i16 = (~i15) & i13;
        for (AbstractC2316v abstractC2316v2 = abstractC0233o.f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
            m763a(abstractC2316v2, i16, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m764b(AbstractC2316v abstractC2316v, int i13, int i14) {
        if (i14 != 0 || abstractC2316v.mo3462M0()) {
            if ((i13 & 2) != 0 && (abstractC2316v instanceof InterfaceC0186c0)) {
                AbstractC0201g.m509i((InterfaceC0186c0) abstractC2316v);
                if (i14 == 2) {
                    AbstractC0201g.m514n(abstractC2316v, 2).m3550t1();
                }
            }
            if ((i13 & 128) != 0 && (abstractC2316v instanceof InterfaceC0178a0) && i14 != 2) {
                AbstractC0201g.m516p(abstractC2316v).m600R();
            }
            if ((i13 & 256) != 0 && (abstractC2316v instanceof InterfaceC0249s)) {
                if (i14 == 1) {
                    C0230n0 c0230n0M516p = AbstractC0201g.m516p(abstractC2316v);
                    c0230n0M516p.m580B0(c0230n0M516p.f792n0 + 1);
                } else if (i14 == 2) {
                    C0230n0 c0230n0M516p2 = AbstractC0201g.m516p(abstractC2316v);
                    c0230n0M516p2.m580B0(c0230n0M516p2.f792n0 - 1);
                }
                if (i14 != 2) {
                    C0230n0 c0230n0M516p3 = AbstractC0201g.m516p(abstractC2316v);
                    if (c0230n0M516p3.f792n0 != 0 && !c0230n0M516p3.m644u() && !c0230n0M516p3.m577A() && !c0230n0M516p3.f791m0) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) AbstractC0242q0.m750a(c0230n0M516p3);
                        C5101l0 c5101l0 = androidComposeView.f4961r0.f629e;
                        c5101l0.getClass();
                        if (c0230n0M516p3.f792n0 > 0) {
                            ((C30849c) c5101l0.f21443x).m94885b(c0230n0M516p3);
                            c0230n0M516p3.f791m0 = true;
                        }
                        androidComposeView.m3577I(null);
                    }
                }
            }
            if ((i13 & 4) != 0 && (abstractC2316v instanceof InterfaceC0245r)) {
                AbstractC0201g.m508h((InterfaceC0245r) abstractC2316v);
            }
            if ((i13 & 8) != 0 && (abstractC2316v instanceof InterfaceC0216j2)) {
                AbstractC0201g.m516p(abstractC2316v).f769Q = true;
            }
            if ((i13 & 64) != 0 && (abstractC2316v instanceof InterfaceC0192d2)) {
                AbstractC0201g.m516p((InterfaceC0192d2) abstractC2316v).m602T();
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 && (abstractC2316v instanceof InterfaceC15245q)) {
                InterfaceC15245q interfaceC15245q = (InterfaceC15245q) abstractC2316v;
                C0205h.m533f();
                interfaceC15245q.mo469j0(C0205h.f687a);
                if (C0205h.m532e()) {
                    AbstractC2316v abstractC2316v2 = (AbstractC2316v) interfaceC15245q;
                    if (!abstractC2316v2.f9142w.f9141N) {
                        AbstractC37831a.m121374b("visitChildren called on an unattached node");
                    }
                    C30849c c30849c = new C30849c(new AbstractC2316v[16]);
                    AbstractC2316v abstractC2316v3 = abstractC2316v2.f9142w;
                    AbstractC2316v abstractC2316v4 = abstractC2316v3.f9133F;
                    if (abstractC2316v4 == null) {
                        AbstractC0201g.m501a(c30849c, abstractC2316v3);
                    } else {
                        c30849c.m94885b(abstractC2316v4);
                    }
                    while (true) {
                        int i15 = c30849c.f127229y;
                        if (i15 == 0) {
                            break;
                        }
                        AbstractC2316v abstractC2316vM504d = (AbstractC2316v) c30849c.m94894l(i15 - 1);
                        if ((abstractC2316vM504d.f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                            AbstractC0201g.m501a(c30849c, abstractC2316vM504d);
                        } else {
                            while (abstractC2316vM504d != null) {
                                if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    C30849c c30849c2 = null;
                                    while (abstractC2316vM504d != null) {
                                        if (abstractC2316vM504d instanceof C15252x) {
                                            AbstractC15235g.m43331u((C15252x) abstractC2316vM504d);
                                        } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                            int i16 = 0;
                                            for (AbstractC2316v abstractC2316v5 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v5 != null; abstractC2316v5 = abstractC2316v5.f9133F) {
                                                if ((abstractC2316v5.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                                    i16++;
                                                    if (i16 == 1) {
                                                        abstractC2316vM504d = abstractC2316v5;
                                                    } else {
                                                        if (c30849c2 == null) {
                                                            c30849c2 = new C30849c(new AbstractC2316v[16]);
                                                        }
                                                        if (abstractC2316vM504d != null) {
                                                            c30849c2.m94885b(abstractC2316vM504d);
                                                            abstractC2316vM504d = null;
                                                        }
                                                        c30849c2.m94885b(abstractC2316v5);
                                                    }
                                                }
                                            }
                                            if (i16 == 1) {
                                            }
                                        }
                                        abstractC2316vM504d = AbstractC0201g.m504d(c30849c2);
                                    }
                                    break;
                                }
                                abstractC2316vM504d = abstractC2316vM504d.f9133F;
                            }
                        }
                    }
                }
            }
            if ((i13 & 4096) == 0 || !(abstractC2316v instanceof InterfaceC15233e)) {
                return;
            }
            InterfaceC15233e interfaceC15233e = (InterfaceC15233e) abstractC2316v;
            C15236h c15236h = ((C15240l) AbstractC0201g.m517q(interfaceC15233e).getFocusOwner()).f57242d;
            if (c15236h.f57236d.m136a(interfaceC15233e)) {
                c15236h.m43337a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m765c(AbstractC2316v abstractC2316v) {
        if (!abstractC2316v.f9141N) {
            AbstractC37831a.m121374b("autoInvalidateUpdatedNode called on unattached node");
        }
        m763a(abstractC2316v, -1, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final int m766d(InterfaceC2315u interfaceC2315u) {
        int i13 = interfaceC2315u instanceof InterfaceC39080c0 ? 3 : 1;
        if (interfaceC2315u instanceof InterfaceC14017f) {
            i13 |= 4;
        }
        if (interfaceC2315u instanceof InterfaceC18031m) {
            i13 |= 8;
        }
        if (interfaceC2315u instanceof InterfaceC34475u) {
            i13 |= 16;
        }
        if ((interfaceC2315u instanceof InterfaceC40000c) || (interfaceC2315u instanceof InterfaceC40003f)) {
            i13 |= 32;
        }
        if (interfaceC2315u instanceof C28514d) {
            i13 |= 256;
        }
        if (interfaceC2315u instanceof InterfaceC39095g1) {
            i13 |= 64;
        }
        return interfaceC2315u instanceof InterfaceC14037a ? 524288 | i13 : i13;
    }

    /* JADX INFO: renamed from: e */
    public static final int m767e(AbstractC2316v abstractC2316v) {
        int i13 = abstractC2316v.f9144y;
        if (i13 != 0) {
            return i13;
        }
        Class<?> cls = abstractC2316v.getClass();
        C0039m0 c0039m0 = f856a;
        int iM91d = c0039m0.m91d(cls);
        if (iM91d >= 0) {
            return c0039m0.f116c[iM91d];
        }
        int i14 = abstractC2316v instanceof InterfaceC0186c0 ? 3 : 1;
        if (abstractC2316v instanceof InterfaceC0245r) {
            i14 |= 4;
        }
        if (abstractC2316v instanceof InterfaceC0216j2) {
            i14 |= 8;
        }
        if (abstractC2316v instanceof InterfaceC0200f2) {
            i14 |= 16;
        }
        if (abstractC2316v instanceof InterfaceC40002e) {
            i14 |= 32;
        }
        if (abstractC2316v instanceof InterfaceC0192d2) {
            i14 |= 64;
        }
        if (abstractC2316v instanceof InterfaceC0178a0) {
            i14 |= 128;
        }
        if (abstractC2316v instanceof InterfaceC0249s) {
            i14 |= 256;
        }
        if (abstractC2316v instanceof C15252x) {
            i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (abstractC2316v instanceof InterfaceC15245q) {
            i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        }
        if (abstractC2316v instanceof InterfaceC15233e) {
            i14 |= 4096;
        }
        if (abstractC2316v instanceof InterfaceC32074f) {
            i14 |= DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (abstractC2316v instanceof C36706a) {
            i14 |= DfuBaseService.ERROR_CONNECTION_MASK;
        }
        if (abstractC2316v instanceof InterfaceC0225m) {
            i14 |= 32768;
        }
        if (abstractC2316v instanceof InterfaceC0240p2) {
            i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
        }
        if (abstractC2316v instanceof InterfaceC14037a) {
            i14 |= 524288;
        }
        c0039m0.m95h(cls, i14);
        return i14;
    }

    /* JADX INFO: renamed from: f */
    public static final int m768f(AbstractC2316v abstractC2316v) {
        if (!(abstractC2316v instanceof AbstractC0233o)) {
            return m767e(abstractC2316v);
        }
        AbstractC0233o abstractC0233o = (AbstractC0233o) abstractC2316v;
        int iM768f = abstractC0233o.f803O;
        for (AbstractC2316v abstractC2316v2 = abstractC0233o.f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
            iM768f |= m768f(abstractC2316v2);
        }
        return iM768f;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m769g(int i13) {
        return (i13 & 128) != 0;
    }
}
