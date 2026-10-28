package w00;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import ec3.InterfaceC13037f2;
import j00.C21108k;
import j00.EnumC21096d0;
import java.util.Set;
import m83.C25271y;
import o73.C27648a;
import p026b2.C2314t;
import p390p1.C28655q;
import p477s2.AbstractC32069a;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import x30.AbstractC37891g1;

/* JADX INFO: renamed from: w00.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C36660r extends AbstractC37891g1 {

    /* JADX INFO: renamed from: c */
    public final String f157044c;

    /* JADX INFO: renamed from: d */
    public final Object f157045d;

    /* JADX INFO: renamed from: e */
    public final boolean f157046e;

    /* JADX INFO: renamed from: f */
    public final float f157047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36660r(IdentifierSpec identifierSpec, EnumC21096d0 enumC21096d0, boolean z4, String merchantName, InterfaceC13037f2 interfaceC13037f2, boolean z13) {
        float f13;
        super(identifierSpec, false);
        AbstractC22676k.m65750j(merchantName, "merchantName");
        this.f157044c = merchantName;
        this.f157045d = interfaceC13037f2;
        this.f157046e = z13;
        if (enumC21096d0 == EnumC21096d0.f79990x) {
            f13 = 0;
        } else {
            f13 = enumC21096d0 == EnumC21096d0.f79989w ? 4 : z4 ? 6 : 2;
        }
        this.f157047f = f13;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43551e() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ec3.f2, java.lang.Object] */
    @Override // x30.AbstractC37891g1
    /* JADX INFO: renamed from: g */
    public final void mo82070g(boolean z4, Set hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i13) {
        String strM113395R;
        AbstractC22676k.m65750j(hiddenIdentifiers, "hiddenIdentifiers");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(63850881);
        C21108k c21108k = (C21108k) C27648a.m83597t(this.f157045d, c28655q, 0).getValue();
        String str = this.f157044c;
        boolean z13 = this.f157046e;
        if (c21108k == null || !c21108k.f80052i || z13) {
            c28655q.m87150e0(1568957008);
            strM113395R = AbstractC35785b.m113395R(AbstractC30060g.m92102X(R.string.stripe_paymentsheet_card_mandate_signup_toggle_off, new Object[]{str}, c28655q));
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1568713038);
            strM113395R = AbstractC35785b.m113395R(AbstractC30060g.m92102X(R.string.stripe_paymentsheet_card_mandate_signup_toggle_on_v3, new Object[]{str}, c28655q));
            c28655q.m87173q(false);
        }
        AbstractC32069a.m99663a(strM113395R, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, this.f157047f, 0.0f, 0.0f, 13), z13 ? 3 : 5, 0, null, c28655q, 0, 24);
        c28655q.m87173q(false);
    }
}
