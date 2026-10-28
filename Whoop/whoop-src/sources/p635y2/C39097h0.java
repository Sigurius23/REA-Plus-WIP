package p635y2;

import c93.InterfaceC4351m;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import p002a0.C0057v0;
import p005a3.C0230n0;
import p005a3.EnumC0206h0;
import p446r1.C30848b;
import p603x2.AbstractC37831a;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39097h0 implements InterfaceC39140v1 {

    /* JADX INFO: renamed from: w */
    public EnumC39181m f168188w = EnumC39181m.f168424x;

    /* JADX INFO: renamed from: x */
    public float f168189x;

    /* JADX INFO: renamed from: y */
    public float f168190y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C39115n0 f168191z;

    public C39097h0(C39115n0 c39115n0) {
        this.f168191z = c39115n0;
    }

    @Override // p635y2.InterfaceC39126r
    /* JADX INFO: renamed from: A */
    public final boolean mo781A() {
        C39115n0 c39115n0 = this.f168191z;
        return c39115n0.f168240w.m646v() == EnumC0206h0.f694z || c39115n0.f168240w.m646v() == EnumC0206h0.f692x;
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f168189x;
    }

    @Override // p635y2.InterfaceC39126r
    public final EnumC39181m getLayoutDirection() {
        return this.f168188w;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f168190y;
    }

    @Override // p635y2.InterfaceC39140v1
    /* JADX INFO: renamed from: s0 */
    public final List mo124616s0(Object obj, InterfaceC4351m interfaceC4351m) {
        C39115n0 c39115n0 = this.f168191z;
        c39115n0.m124643d();
        C0230n0 c0230n0 = c39115n0.f168240w;
        EnumC0206h0 enumC0206h0M646v = c0230n0.m646v();
        EnumC0206h0 enumC0206h0 = EnumC0206h0.f691w;
        if (enumC0206h0M646v != enumC0206h0 && enumC0206h0M646v != EnumC0206h0.f693y && enumC0206h0M646v != EnumC0206h0.f692x && enumC0206h0M646v != EnumC0206h0.f694z) {
            AbstractC37831a.m121374b("subcompose can only be used inside the measure or layout blocks");
        }
        C0057v0 c0057v0 = c39115n0.f168230G;
        Object objM129g = c0057v0.m129g(obj);
        if (objM129g == null) {
            objM129g = (C0230n0) c39115n0.f168233J.m133k(obj);
            if (objM129g != null) {
                if (c39115n0.f168238O <= 0) {
                    AbstractC37831a.m121374b("Check failed.");
                }
                c39115n0.f168238O--;
            } else {
                objM129g = c39115n0.m124647j(obj);
                if (objM129g == null) {
                    int i13 = c39115n0.f168243z;
                    C0230n0 c0230n1 = new C0230n0(2);
                    c0230n0.f768P = true;
                    c0230n0.m597O(i13, c0230n1);
                    c0230n0.f768P = false;
                    objM129g = c0230n1;
                }
            }
            c0057v0.m135m(obj, objM129g);
        }
        C0230n0 c0230n2 = (C0230n0) objM129g;
        if (AbstractC25265s.m74102I0(c39115n0.f168243z, c0230n0.m639r()) != c0230n2) {
            int iM94892j = ((C30848b) c0230n0.m639r()).f127226w.m94892j(c0230n2);
            if (iM94892j < c39115n0.f168243z) {
                AbstractC37831a.m121373a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i14 = c39115n0.f168243z;
            if (i14 != iM94892j) {
                c0230n0.f768P = true;
                c0230n0.m624i0(iM94892j, i14, 1);
                c0230n0.f768P = false;
            }
        }
        c39115n0.f168243z++;
        c39115n0.m124646i(c0230n2, obj, false, interfaceC4351m);
        return (enumC0206h0M646v == enumC0206h0 || enumC0206h0M646v == EnumC0206h0.f693y) ? c0230n2.m635p() : c0230n2.m634o();
    }

    @Override // p635y2.InterfaceC39133t0
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC39130s0 mo795x0(int i13, int i14, Map map, Function1 function1, Function1 function2) {
        if ((i13 & (-16777216)) != 0 || ((-16777216) & i14) != 0) {
            AbstractC37831a.m121374b("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C39094g0(i13, i14, map, function1, this, this.f168191z, function2);
    }
}
