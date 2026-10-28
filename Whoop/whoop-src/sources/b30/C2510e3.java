package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p027b3.InterfaceC2464x2;
import p163g1.AbstractC14983d3;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.AbstractC37817c;

/* JADX INFO: renamed from: b30.e3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2510e3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f9775E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC2464x2 f9776w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f9777x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f9778y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f9779z;

    public C2510e3(InterfaceC2464x2 interfaceC2464x2, InterfaceC4339a interfaceC4339a, boolean z4, boolean z13, long j7) {
        this.f9776w = interfaceC2464x2;
        this.f9777x = interfaceC4339a;
        this.f9778y = z4;
        this.f9779z = z13;
        this.f9775E = j7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        InterfaceC2464x2 interfaceC2464x2;
        InterfaceC4339a interfaceC4339a;
        boolean zM87153g;
        Object objM87133R;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "SHEET_NAVIGATION_BUTTON_TAG");
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-1693973474);
                interfaceC2464x2 = this.f9776w;
                boolean zM87153g2 = c28655q.m87153g(interfaceC2464x2);
                interfaceC4339a = this.f9777x;
                zM87153g = zM87153g2 | c28655q.m87153g(interfaceC4339a);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C2494c3(interfaceC2464x2, interfaceC4339a);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC14983d3.m43104a((InterfaceC4339a) objM87133R, modifierM3599a, this.f9778y, AbstractC37817c.m121344e(951598290, c28655q, new C2502d3(this.f9779z, this.f9775E)), c28655q, 24624, 8);
            }
        } else {
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "SHEET_NAVIGATION_BUTTON_TAG");
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-1693973474);
            interfaceC2464x2 = this.f9776w;
            boolean zM87153g3 = c28655q.m87153g(interfaceC2464x2);
            interfaceC4339a = this.f9777x;
            zM87153g = zM87153g3 | c28655q.m87153g(interfaceC4339a);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = new C2494c3(interfaceC2464x2, interfaceC4339a);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2494c3(interfaceC2464x2, interfaceC4339a);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC14983d3.m43104a((InterfaceC4339a) objM87133R, modifierM3599a2, this.f9778y, AbstractC37817c.m121344e(951598290, c28655q, new C2502d3(this.f9779z, this.f9775E)), c28655q, 24624, 8);
        }
        return C23454a0.f92919a;
    }
}
