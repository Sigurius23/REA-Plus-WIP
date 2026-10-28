package p669z2;

import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.C0223l1;
import p005a3.C0224l2;
import p005a3.C0230n0;
import p005a3.InterfaceC0229n;
import p026b2.AbstractC2316v;
import p446r1.C30849c;
import p603x2.AbstractC37831a;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: z2.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC40002e extends InterfaceC40004g, InterfaceC0229n {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [a3.n, z2.e] */
    @Override // p669z2.InterfaceC40004g
    /* JADX INFO: renamed from: a */
    default Object mo464a(C40005h c40005h) {
        C0223l1 c0223l1;
        AbstractC2316v abstractC2316v = (AbstractC2316v) this;
        if (!abstractC2316v.f9142w.f9141N) {
            AbstractC37831a.m121373a("ModifierLocal accessed from an unattached node");
        }
        if (!abstractC2316v.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
        }
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9142w.f9132E;
        C0230n0 c0230n0M516p = AbstractC0201g.m516p(this);
        while (c0230n0M516p != null) {
            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & 32) != 0) {
                while (abstractC2316v2 != null) {
                    if ((abstractC2316v2.f9144y & 32) != 0) {
                        ?? M504d = abstractC2316v2;
                        ?? c30849c = 0;
                        while (M504d != 0) {
                            if (M504d instanceof InterfaceC40002e) {
                                InterfaceC40002e interfaceC40002e = (InterfaceC40002e) M504d;
                                if (interfaceC40002e.mo474v().mo113251c(c40005h)) {
                                    return interfaceC40002e.mo474v().mo113253e(c40005h);
                                }
                            } else if ((M504d.f9144y & 32) != 0 && (M504d instanceof AbstractC0233o)) {
                                AbstractC2316v abstractC2316v3 = ((AbstractC0233o) M504d).f804P;
                                int i13 = 0;
                                M504d = M504d;
                                c30849c = c30849c;
                                while (abstractC2316v3 != null) {
                                    if ((abstractC2316v3.f9144y & 32) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            c30849c = c30849c;
                                            M504d = abstractC2316v3;
                                        } else {
                                            if (c30849c == 0) {
                                                c30849c = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (M504d != 0) {
                                                c30849c.m94885b(M504d);
                                                M504d = 0;
                                            }
                                            c30849c.m94885b(abstractC2316v3);
                                        }
                                    }
                                    abstractC2316v3 = abstractC2316v3.f9133F;
                                    M504d = M504d;
                                    c30849c = c30849c;
                                }
                                if (i13 == 1) {
                                }
                            }
                            M504d = AbstractC0201g.m504d(c30849c);
                        }
                    }
                    abstractC2316v2 = abstractC2316v2.f9132E;
                }
            }
            c0230n0M516p = c0230n0M516p.m588G();
            abstractC2316v2 = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
        }
        return c40005h.f172591a.invoke();
    }

    /* JADX INFO: renamed from: v */
    default AbstractC35745c mo474v() {
        return C39999b.f172584a;
    }
}
