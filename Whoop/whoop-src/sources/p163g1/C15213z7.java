package p163g1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci0.C4728c;
import l83.C23454a0;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13821r1;
import p209i3.AbstractC18032n;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p635y2.AbstractC39125q1;
import q83.AbstractC30060g;
import qc1.C30217a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.z7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15213z7 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f57131E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f57132w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37816b f57133x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f57134y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37816b f57135z;

    public C15213z7(float f13, C37816b c37816b, InterfaceC4351m interfaceC4351m, C37816b c37816b2, int i13) {
        this.f57132w = f13;
        this.f57133x = c37816b;
        this.f57134y = interfaceC4351m;
        this.f57135z = c37816b2;
        this.f57131E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            boolean zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87153g(interfaceC2994c0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C15061k5(interfaceC2994c0, c13821r1M92099U);
                c28655q.m87172p0(objM87133R2);
            }
            C15061k5 c15061k5 = (C15061k5) objM87133R2;
            Modifier modifierM118995s = AbstractC37056f.m118995s(AbstractC18032n.m51775c(AbstractC30060g.m92100V(AbstractC1102d.m3428y(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), C2299e.f9117z, false, 2), c13821r1M92099U, true, false), false, new C30217a(12)));
            boolean zM87147d = c28655q.m87147d(this.f57132w);
            C37816b c37816b = this.f57133x;
            boolean zM87153g2 = zM87147d | c28655q.m87153g(c37816b) | c28655q.m87153g(this.f57134y);
            C37816b c37816b2 = this.f57135z;
            boolean zM87153g3 = zM87153g2 | c28655q.m87153g(c37816b2) | c28655q.m87157i(c15061k5) | c28655q.m87149e(this.f57131E);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v0) {
                C4728c c4728c = new C4728c(this.f57132w, c37816b, this.f57134y, c15061k5, this.f57131E, c37816b2);
                c28655q.m87172p0(c4728c);
                objM87133R3 = c4728c;
            }
            AbstractC39125q1.m124656b(modifierM118995s, (InterfaceC4351m) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
