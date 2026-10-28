package b30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import d40.AbstractC11673r;
import l83.C23454a0;
import p163g1.AbstractC15005f3;
import p331n2.AbstractC26165a;
import p390p1.C28655q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: b30.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C2530h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f9833w;

    public C2530h(boolean z4) {
        this.f9833w = z4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        boolean z4;
        int i13;
        int i14;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                z4 = this.f9833w;
                if (z4) {
                    i13 = R.drawable.stripe_ic_paymentsheet_close;
                } else {
                    i13 = R.drawable.stripe_ic_paymentsheet_back;
                }
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(i13, composer, 0);
                if (z4) {
                    i14 = R.string.stripe_paymentsheet_close;
                } else {
                    i14 = R.string.stripe_back;
                }
                AbstractC15005f3.m43107a(abstractC26165aM88500I, AbstractC30060g.m92103Y(composer, i14), null, AbstractC11673r.m31082k(composer).f37675h, composer, 0, 4);
            }
        } else {
            z4 = this.f9833w;
            if (z4) {
                i13 = R.drawable.stripe_ic_paymentsheet_close;
            } else {
                i13 = R.drawable.stripe_ic_paymentsheet_back;
            }
            AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(i13, composer, 0);
            if (z4) {
                i14 = R.string.stripe_paymentsheet_close;
            } else {
                i14 = R.string.stripe_back;
            }
            AbstractC15005f3.m43107a(abstractC26165aM88500I2, AbstractC30060g.m92103Y(composer, i14), null, AbstractC11673r.m31082k(composer).f37675h, composer, 0, 4);
        }
        return C23454a0.f92919a;
    }
}
