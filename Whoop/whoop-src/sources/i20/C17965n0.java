package i20;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import g40.InterfaceC15391m3;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC30802r;
import p026b2.C2314t;
import p163g1.C15017g4;
import p164g2.C15247s;
import p291l0.AbstractC22953f;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: i20.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17965n0 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Integer f69775E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f69776F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f69777w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f69778x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC15391m3 f69779y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28670t2 f69780z;

    public C17965n0(boolean z4, List list, InterfaceC15391m3 interfaceC15391m3, InterfaceC28601c1 interfaceC28601c1, Integer num, Function1 function1) {
        this.f69777w = z4;
        this.f69778x = list;
        this.f69779y = interfaceC15391m3;
        this.f69780z = interfaceC28601c1;
        this.f69775E = num;
        this.f69776F = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC22973k1 paddingValues = (InterfaceC22973k1) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(paddingValues, "paddingValues");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(paddingValues) ? 4 : 2;
        }
        int i13 = iIntValue & 19;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 18) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
                return c23454a0;
            }
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1597847960);
        Object objM87133R = c28655q2.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC33745d.m106649h(c28655q2);
        }
        C15247s c15247s = (C15247s) objM87133R;
        Object objM94759h = AbstractC30802r.m94759h(-1597845913, c28655q2, false);
        InterfaceC30057d interfaceC30057d = null;
        if (objM94759h == c28676v0) {
            objM94759h = new C17962m0(c15247s, interfaceC30057d, 0);
            c28655q2.m87172p0(objM94759h);
        }
        c28655q2.m87173q(false);
        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM94759h, c23454a0);
        AbstractC17960l1.m51583j(AbstractC1099a.m3393o(paddingValues, AbstractC22953f.m66725n(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, C2314t.f9131w)))), null, AbstractC37817c.m121344e(786859541, c28655q2, new C15017g4(this.f69777w, this.f69778x, this.f69779y, c15247s, this.f69780z, this.f69775E, this.f69776F)), c28655q2, 384);
        return c23454a0;
    }
}
