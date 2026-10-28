package b30;

import a20.C0162b;
import a30.C0296h1;
import a30.C0299i1;
import a30.C0302j1;
import a30.InterfaceC0305k1;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.android.R;
import l83.C23454a0;
import p026b2.C2314t;
import p040c0.InterfaceC3764o;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12313p;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15005f3;
import p163g1.C14970c1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: b30.y2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2661y2 implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f10423w;

    public C2661y2(boolean z4) {
        this.f10423w = z4;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC3764o AnimatedContent = (InterfaceC3764o) obj;
        InterfaceC0305k1 interfaceC0305k1 = (InterfaceC0305k1) obj2;
        int iIntValue = ((Number) obj4).intValue();
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        C28655q c28655q = (C28655q) ((Composer) obj3);
        c28655q.m87150e0(-426977067);
        if (this.f10423w) {
            c28655q.m87173q(false);
            if (interfaceC0305k1 instanceof C0302j1) {
                c28655q.m87150e0(-351197219);
                AbstractC12313p.m34294l(c28655q, 0);
                c28655q.m87173q(false);
            } else if (interfaceC0305k1 instanceof C0296h1) {
                c28655q.m87150e0(-351073064);
                c28655q.m87150e0(-426965722);
                boolean z4 = (((iIntValue & 112) ^ 48) > 32 && c28655q.m87157i(interfaceC0305k1)) || (iIntValue & 48) == 32;
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0162b(interfaceC0305k1, null, 8);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, interfaceC0305k1);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_googlepay_primary_button_checkmark, c28655q, 0), null, AbstractC1102d.m3415l(48, C2314t.f9131w), ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e(), c28655q, 432, 0);
                c28655q.m87173q(false);
            } else {
                if (interfaceC0305k1 != null && !(interfaceC0305k1 instanceof C0299i1)) {
                    throw AbstractC11895b.m32003v(-426972683, c28655q, false);
                }
                c28655q.m87150e0(-426948978);
                c28655q.m87173q(false);
            }
        } else {
            AbstractC12313p.m34294l(c28655q, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }
}
