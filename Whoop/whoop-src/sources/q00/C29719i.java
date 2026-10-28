package q00;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import g00.AbstractC14936g;
import g00.C14931b;
import l83.C23454a0;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p331n2.AbstractC26165a;
import p390p1.C28655q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: q00.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C29719i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C29719i f121534w = new C29719i();

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(R.drawable.stripe_ic_material_more_vert, composer, 0);
                String strM92103Y = AbstractC30060g.m92103Y(composer, R.string.stripe_edit);
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(-443512897);
                C14931b c14931b = (C14931b) c28655q2.m87161k(AbstractC14936g.f55706c);
                c28655q2.m87173q(false);
                AbstractC15005f3.m43107a(abstractC26165aM88500I, strM92103Y, AbstractC1102d.m3419p(24, C2314t.f9131w), c14931b.f55684w, composer, 384, 0);
            }
        } else {
            AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(R.drawable.stripe_ic_material_more_vert, composer, 0);
            String strM92103Y2 = AbstractC30060g.m92103Y(composer, R.string.stripe_edit);
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(-443512897);
            C14931b c14931b2 = (C14931b) c28655q3.m87161k(AbstractC14936g.f55706c);
            c28655q3.m87173q(false);
            AbstractC15005f3.m43107a(abstractC26165aM88500I2, strM92103Y2, AbstractC1102d.m3419p(24, C2314t.f9131w), c14931b2.f55684w, composer, 384, 0);
        }
        return C23454a0.f92919a;
    }
}
