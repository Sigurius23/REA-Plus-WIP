package x30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.C2483b0;
import b30.C2552j5;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p088dc.AbstractC11894a;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p733ry2.C31918g;
import u10.C34418f;

/* JADX INFO: renamed from: x30.o1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37915o1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f162333E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f162334F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f162335G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f162336w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f162337x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f162338y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f162339z;

    public C37915o1(String str, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, String str2, boolean z4, String str3, String str4) {
        this.f162336w = str;
        this.f162337x = interfaceC4339a;
        this.f162338y = interfaceC4339a2;
        this.f162339z = str2;
        this.f162333E = z4;
        this.f162334F = str3;
        this.f162335G = str4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        String str;
        C37816b c37816bM121344e;
        InterfaceC4339a interfaceC4339a;
        boolean zM87153g;
        Object objM87133R;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "simple_dialog");
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-1105761405);
                str = this.f162336w;
                if (str == null) {
                    c37816bM121344e = null;
                } else {
                    c37816bM121344e = AbstractC37817c.m121344e(-1639783005, c28655q, new C2483b0(str, 7));
                }
                C37816b c37816b = c37816bM121344e;
                c28655q.m87173q(false);
                c28655q.m87150e0(-1105766663);
                interfaceC4339a = this.f162337x;
                zM87153g = c28655q.m87153g(interfaceC4339a);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C31918g(interfaceC4339a, 26);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC11894a.m31952a((InterfaceC4339a) objM87133R, AbstractC37817c.m121344e(746698413, c28655q, new C2552j5(this.f162338y, this.f162339z, this.f162333E)), modifierM3599a, AbstractC37817c.m121344e(-1029376661, c28655q, new C34418f(5, interfaceC4339a, this.f162334F)), AbstractC37817c.m121344e(-1917414198, c28655q, new C2483b0(this.f162335G, 8)), c37816b, null, 0L, 0L, null, c28655q, 28080, 960);
            }
        } else {
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "simple_dialog");
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-1105761405);
            str = this.f162336w;
            if (str == null) {
                c37816bM121344e = null;
            } else {
                c37816bM121344e = AbstractC37817c.m121344e(-1639783005, c28655q, new C2483b0(str, 7));
            }
            C37816b c37816b2 = c37816bM121344e;
            c28655q.m87173q(false);
            c28655q.m87150e0(-1105766663);
            interfaceC4339a = this.f162337x;
            zM87153g = c28655q.m87153g(interfaceC4339a);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = new C31918g(interfaceC4339a, 26);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C31918g(interfaceC4339a, 26);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC11894a.m31952a((InterfaceC4339a) objM87133R, AbstractC37817c.m121344e(746698413, c28655q, new C2552j5(this.f162338y, this.f162339z, this.f162333E)), modifierM3599a2, AbstractC37817c.m121344e(-1029376661, c28655q, new C34418f(5, interfaceC4339a, this.f162334F)), AbstractC37817c.m121344e(-1917414198, c28655q, new C2483b0(this.f162335G, 8)), c37816b2, null, 0L, 0L, null, c28655q, 28080, 960);
        }
        return C23454a0.f92919a;
    }
}
