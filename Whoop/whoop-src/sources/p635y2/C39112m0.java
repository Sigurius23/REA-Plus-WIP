package p635y2;

import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.profileinstaller.ProfileVerifier;
import bd3.C3131k0;
import p002a0.AbstractC0054u;
import p002a0.C0026h0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.AbstractC0242q0;
import p005a3.C0223l1;
import p005a3.C0230n0;
import p005a3.EnumC0236o2;
import p005a3.InterfaceC0240p2;
import p026b2.AbstractC2316v;
import p446r1.C30848b;
import p446r1.C30849c;
import p603x2.AbstractC37831a;

/* JADX INFO: renamed from: y2.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C39112m0 implements InterfaceC39131s1 {

    /* JADX INFO: renamed from: a */
    public final C0026h0 f168223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39115n0 f168224b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f168225c;

    public C39112m0(C39115n0 c39115n0, Object obj) {
        this.f168224b = c39115n0;
        this.f168225c = obj;
        int[] iArr = AbstractC0054u.f166a;
        this.f168223a = new C0026h0();
    }

    @Override // p635y2.InterfaceC39131s1
    /* JADX INFO: renamed from: a */
    public final long mo124637a(int i13) {
        C0230n0 c0230n0 = (C0230n0) this.f168224b.f168233J.m129g(this.f168225c);
        if (c0230n0 == null || !c0230n0.m605X()) {
            return 0L;
        }
        int i14 = ((C30848b) c0230n0.m637q()).f127226w.f127229y;
        if (i13 < 0 || i13 >= i14) {
            AbstractC37831a.m121376d("Index (" + i13 + ") is out of bound of [0, " + i14 + ')');
        }
        if (!this.f168223a.m62b(i13)) {
            return 0L;
        }
        return (((long) ((C0230n0) ((C30848b) c0230n0.m637q()).get(i13)).m592J()) << 32) | (((long) ((C0230n0) ((C30848b) c0230n0.m637q()).get(i13)).m641s()) & 4294967295L);
    }

    @Override // p635y2.InterfaceC39131s1
    /* JADX INFO: renamed from: b */
    public final int mo124638b() {
        C0230n0 c0230n0 = (C0230n0) this.f168224b.f168233J.m129g(this.f168225c);
        if (c0230n0 != null) {
            return ((C30848b) c0230n0.m637q()).f127226w.f127229y;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [bd3.k0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // p635y2.InterfaceC39131s1
    /* JADX INFO: renamed from: c */
    public final void mo124639c(C3131k0 c3131k0) {
        C0223l1 c0223l1;
        AbstractC2316v abstractC2316v;
        EnumC0236o2 enumC0236o2;
        C0230n0 c0230n0 = (C0230n0) this.f168224b.f168233J.m129g(this.f168225c);
        if (c0230n0 == null || (c0223l1 = c0230n0.f783e0) == null || (abstractC2316v = (AbstractC2316v) c0223l1.f743g) == null) {
            return;
        }
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
            if ((abstractC2316v4.f9145z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                AbstractC2316v abstractC2316v5 = abstractC2316v4;
                while (true) {
                    if (abstractC2316v5 != null) {
                        if ((abstractC2316v5.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            ?? M504d = abstractC2316v5;
                            ?? c30849c2 = 0;
                            while (M504d != 0) {
                                if (M504d instanceof InterfaceC0240p2) {
                                    InterfaceC0240p2 interfaceC0240p2 = (InterfaceC0240p2) M504d;
                                    if ("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(interfaceC0240p2.mo276f())) {
                                        c3131k0.invoke(interfaceC0240p2);
                                        enumC0236o2 = EnumC0236o2.f808x;
                                    } else {
                                        enumC0236o2 = EnumC0236o2.f807w;
                                    }
                                    if (enumC0236o2 != EnumC0236o2.f809y) {
                                        if (enumC0236o2 == EnumC0236o2.f808x) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M504d.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v6 = ((AbstractC0233o) M504d).f804P;
                                    int i14 = 0;
                                    M504d = M504d;
                                    c30849c2 = c30849c2;
                                    while (abstractC2316v6 != null) {
                                        if ((abstractC2316v6.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
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

    @Override // p635y2.InterfaceC39131s1
    /* JADX INFO: renamed from: d */
    public final void mo124640d(int i13, long j7) {
        C39115n0 c39115n0 = this.f168224b;
        C0230n0 c0230n0 = (C0230n0) c39115n0.f168233J.m129g(this.f168225c);
        if (c0230n0 == null || !c0230n0.m605X()) {
            return;
        }
        int i14 = ((C30848b) c0230n0.m637q()).f127226w.f127229y;
        if (i13 < 0 || i13 >= i14) {
            AbstractC37831a.m121376d("Index (" + i13 + ") is out of bound of [0, " + i14 + ')');
        }
        if (c0230n0.m606Y()) {
            AbstractC37831a.m121373a("Pre-measure called on node that is not placed");
        }
        C0230n0 c0230n1 = c39115n0.f168240w;
        c0230n1.f768P = true;
        ((AndroidComposeView) AbstractC0242q0.m750a(c0230n0)).m3593y((C0230n0) ((C30848b) c0230n0.m637q()).get(i13), j7);
        c0230n1.f768P = false;
        this.f168223a.m61a(i13);
    }

    @Override // p635y2.InterfaceC39131s1
    public final void dispose() {
        C39115n0 c39115n0 = this.f168224b;
        C0230n0 c0230n0 = c39115n0.f168240w;
        c39115n0.m124643d();
        C0230n0 c0230n1 = (C0230n0) c39115n0.f168233J.m133k(this.f168225c);
        if (c0230n1 != null) {
            if (c39115n0.f168238O <= 0) {
                AbstractC37831a.m121374b("No pre-composed items to dispose");
            }
            int iM94892j = ((C30848b) c0230n0.m639r()).f127226w.m94892j(c0230n1);
            if (iM94892j < ((C30848b) c0230n0.m639r()).f127226w.f127229y - c39115n0.f168238O) {
                AbstractC37831a.m121374b("Item is not in pre-composed item range");
            }
            c39115n0.f168237N++;
            c39115n0.f168238O--;
            C39091f0 c39091f0 = (C39091f0) c39115n0.f168229F.m129g(c0230n1);
            if (c39091f0 != null) {
                C39115n0.m124641b(c39091f0);
            }
            int i13 = (((C30848b) c0230n0.m639r()).f127226w.f127229y - c39115n0.f168238O) - c39115n0.f168237N;
            c0230n0.f768P = true;
            c0230n0.m624i0(iM94892j, i13, 1);
            c0230n0.f768P = false;
            c39115n0.m124642c(i13);
        }
    }
}
