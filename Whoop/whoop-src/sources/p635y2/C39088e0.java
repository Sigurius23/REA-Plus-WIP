package p635y2;

import c93.InterfaceC4351m;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import p002a0.C0057v0;
import p005a3.C0203g1;
import p005a3.C0230n0;
import p005a3.EnumC0206h0;
import p446r1.C30848b;
import p446r1.C30849c;
import p603x2.AbstractC37831a;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39088e0 implements InterfaceC39140v1, InterfaceC39133t0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C39097h0 f168155w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39115n0 f168156x;

    public C39088e0(C39115n0 c39115n0) {
        this.f168156x = c39115n0;
        this.f168155w = c39115n0.f168231H;
    }

    @Override // p635y2.InterfaceC39126r
    /* JADX INFO: renamed from: A */
    public final boolean mo781A() {
        return this.f168155w.mo781A();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: D0 */
    public final long mo722D0(long j7) {
        return this.f168155w.mo722D0(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: F */
    public final int mo724F(float f13) {
        return this.f168155w.mo724F(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: K */
    public final float mo726K(long j7) {
        return this.f168155w.mo726K(j7);
    }

    @Override // p635y2.InterfaceC39133t0
    /* JADX INFO: renamed from: W */
    public final InterfaceC39130s0 mo86822W(int i13, int i14, Map map, Function1 function1) {
        return this.f168155w.mo795x0(i13, i14, map, null, function1);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: e0 */
    public final float mo733e0(int i13) {
        return this.f168155w.mo733e0(i13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: f0 */
    public final float mo734f0(float f13) {
        return f13 / this.f168155w.getDensity();
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f168155w.f168189x;
    }

    @Override // p635y2.InterfaceC39126r
    public final EnumC39181m getLayoutDirection() {
        return this.f168155w.f168188w;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: h */
    public final long mo735h(float f13) {
        return this.f168155w.mo735h(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: i */
    public final long mo736i(long j7) {
        return this.f168155w.mo736i(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: l */
    public final float mo738l(long j7) {
        return this.f168155w.mo738l(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f168155w.f168190y;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q */
    public final long mo742q(float f13) {
        return this.f168155w.mo742q(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q0 */
    public final float mo743q0(float f13) {
        return this.f168155w.getDensity() * f13;
    }

    @Override // p635y2.InterfaceC39140v1
    /* JADX INFO: renamed from: s0 */
    public final List mo124616s0(Object obj, InterfaceC4351m interfaceC4351m) {
        C39115n0 c39115n0 = this.f168156x;
        C0057v0 c0057v0 = c39115n0.f168235L;
        C0057v0 c0057v1 = c39115n0.f168233J;
        C0230n0 c0230n0 = c39115n0.f168240w;
        C0057v0 c0057v2 = c39115n0.f168230G;
        C0230n0 c0230n1 = (C0230n0) c0057v2.m129g(obj);
        if (c0230n1 != null && ((C30848b) c0230n0.m639r()).f127226w.m94892j(c0230n1) < c39115n0.f168243z) {
            return c0230n1.m635p();
        }
        C30849c c30849c = c39115n0.f168236M;
        if (c30849c.f127229y < c39115n0.f168228E) {
            AbstractC37831a.m121373a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i13 = c30849c.f127229y;
        int i14 = c39115n0.f168228E;
        if (i13 == i14) {
            c30849c.m94885b(obj);
        } else {
            Object[] objArr = c30849c.f127227w;
            Object obj2 = objArr[i14];
            objArr[i14] = obj;
        }
        c39115n0.f168228E++;
        if (c0057v1.m124b(obj)) {
            C0230n0 c0230n2 = (C0230n0) c0057v1.m129g(obj);
            C39091f0 c39091f0 = c0230n2 != null ? (C39091f0) c39115n0.f168229F.m129g(c0230n2) : null;
            if (c39091f0 != null && c39091f0.f168165d) {
                c39115n0.m124646i(c0230n2, obj, false, interfaceC4351m);
            }
        } else {
            if (c0230n0.m605X()) {
                c39115n0.m124643d();
                if (!c0057v2.m125c(obj)) {
                    c0057v0.m133k(obj);
                    Object objM129g = c0057v1.m129g(obj);
                    if (objM129g == null) {
                        objM129g = c39115n0.m124647j(obj);
                        if (objM129g != null) {
                            int iM94892j = ((C30848b) c0230n0.m639r()).f127226w.m94892j(objM129g);
                            int i15 = ((C30848b) c0230n0.m639r()).f127226w.f127229y;
                            c0230n0.f768P = true;
                            c0230n0.m624i0(iM94892j, i15, 1);
                            c0230n0.f768P = false;
                            c39115n0.f168238O++;
                        } else {
                            int i16 = ((C30848b) c0230n0.m639r()).f127226w.f127229y;
                            C0230n0 c0230n3 = new C0230n0(2);
                            c0230n0.f768P = true;
                            c0230n0.m597O(i16, c0230n3);
                            c0230n0.f768P = false;
                            c39115n0.f168238O++;
                            objM129g = c0230n3;
                        }
                        c0057v1.m135m(obj, objM129g);
                    }
                    c39115n0.m124646i((C0230n0) objM129g, obj, false, interfaceC4351m);
                }
            }
            c0057v0.m135m(obj, !c0230n0.m605X() ? new C39109l0() : new C39112m0(c39115n0, obj));
            if (c0230n0.m646v() == EnumC0206h0.f693y) {
                c0230n0.m642s0(true);
            } else {
                C0230n0.m574t0(c0230n0, true, 6);
            }
        }
        C0230n0 c0230n4 = (C0230n0) c0057v1.m129g(obj);
        if (c0230n4 == null) {
            return C25271y.f99162w;
        }
        List listM522C0 = c0230n4.m652z().m522C0();
        int size = listM522C0.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((C0203g1) ((C30848b) listM522C0).get(i17)).f653F.f840b = true;
        }
        return listM522C0;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: w0 */
    public final int mo86824w0(long j7) {
        return this.f168155w.mo86824w0(j7);
    }

    @Override // p635y2.InterfaceC39133t0
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC39130s0 mo795x0(int i13, int i14, Map map, Function1 function1, Function1 function2) {
        return this.f168155w.mo795x0(i13, i14, map, function1, function2);
    }
}
