package p669z2;

import androidx.compose.p018ui.platform.AndroidComposeView;
import java.util.HashSet;
import p002a0.C0047q0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.C0189d;
import p005a3.C0222l0;
import p005a3.C0230n0;
import p026b2.AbstractC2316v;
import p446r1.C30849c;
import p603x2.AbstractC37831a;

/* JADX INFO: renamed from: z2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C40001d {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f172585a;

    /* JADX INFO: renamed from: b */
    public final C30849c f172586b = new C30849c(new C0189d[16]);

    /* JADX INFO: renamed from: c */
    public final C30849c f172587c = new C30849c(new C40005h[16]);

    /* JADX INFO: renamed from: d */
    public final C30849c f172588d = new C30849c(new C0230n0[16]);

    /* JADX INFO: renamed from: e */
    public final C30849c f172589e = new C30849c(new C40005h[16]);

    /* JADX INFO: renamed from: f */
    public boolean f172590f;

    public C40001d(AndroidComposeView androidComposeView) {
        this.f172585a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: b */
    public static void m128237b(AbstractC2316v abstractC2316v, C40005h c40005h, HashSet hashSet) {
        if (!abstractC2316v.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitSubtreeIf called on an unattached node");
        }
        C30849c c30849c = new C30849c(new AbstractC2316v[16]);
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9142w;
        AbstractC2316v abstractC2316v3 = abstractC2316v2.f9133F;
        if (abstractC2316v3 == null) {
            AbstractC0201g.m501a(c30849c, abstractC2316v2);
        } else {
            c30849c.m94885b(abstractC2316v3);
        }
        while (true) {
            int i13 = c30849c.f127229y;
            if (i13 == 0) {
                return;
            }
            AbstractC2316v abstractC2316v4 = (AbstractC2316v) c30849c.m94894l(i13 - 1);
            if ((abstractC2316v4.f9145z & 32) != 0) {
                AbstractC2316v abstractC2316v5 = abstractC2316v4;
                while (true) {
                    if (abstractC2316v5 != null) {
                        if ((abstractC2316v5.f9144y & 32) != 0) {
                            ?? M504d = abstractC2316v5;
                            ?? c30849c2 = 0;
                            while (M504d != 0) {
                                if (M504d instanceof InterfaceC40002e) {
                                    InterfaceC40002e interfaceC40002e = (InterfaceC40002e) M504d;
                                    if (interfaceC40002e instanceof C0189d) {
                                        C0189d c0189d = (C0189d) interfaceC40002e;
                                        if ((c0189d.f616O instanceof InterfaceC40000c) && c0189d.f618Q.contains(c40005h)) {
                                            hashSet.add(interfaceC40002e);
                                        }
                                    }
                                    if (interfaceC40002e.mo474v().mo113251c(c40005h)) {
                                        break;
                                    }
                                } else if ((M504d.f9144y & 32) != 0 && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v6 = ((AbstractC0233o) M504d).f804P;
                                    int i14 = 0;
                                    M504d = M504d;
                                    c30849c2 = c30849c2;
                                    while (abstractC2316v6 != null) {
                                        if ((abstractC2316v6.f9144y & 32) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                c30849c2 = c30849c2;
                                                M504d = abstractC2316v6;
                                            } else {
                                                if (c30849c2 == 0) {
                                                    c30849c2 = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (M504d != 0) {
                                                    c30849c2.m94885b(M504d);
                                                    M504d = 0;
                                                }
                                                c30849c2.m94885b(abstractC2316v6);
                                            }
                                        }
                                        abstractC2316v6 = abstractC2316v6.f9133F;
                                        M504d = M504d;
                                        c30849c2 = c30849c2;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                M504d = AbstractC0201g.m504d(c30849c2);
                            }
                        }
                        abstractC2316v5 = abstractC2316v5.f9133F;
                    }
                }
            }
            AbstractC0201g.m501a(c30849c, abstractC2316v4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m128238a() {
        if (this.f172590f) {
            return;
        }
        this.f172590f = true;
        C0222l0 c0222l0 = new C0222l0(this, 24);
        C0047q0 c0047q0 = this.f172585a.f4931V0;
        if (c0047q0.m103f(c0222l0) >= 0) {
            return;
        }
        c0047q0.m98a(c0222l0);
    }
}
