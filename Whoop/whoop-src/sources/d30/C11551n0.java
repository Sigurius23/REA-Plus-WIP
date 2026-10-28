package d30;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import com.whoop.android.R;
import h20.C16766y0;
import h20.C16772z0;
import java.util.ArrayList;
import l83.C23454a0;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11894a;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.InterfaceC22997s1;
import p292l1.AbstractC23096g;
import p292l1.AbstractC23164r1;
import p316m1.AbstractC24899e0;
import p331n2.AbstractC26165a;
import p355o2.AbstractC27433f0;
import p355o2.C27428d;
import p355o2.C27430e;
import p355o2.C27438i;
import p355o2.C27442m;
import p355o2.C27449t;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: d30.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11551n0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37259w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f37260x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f37261y;

    public C11551n0(C37816b c37816b, boolean z4) {
        this.f37261y = c37816b;
        this.f37260x = z4;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x011f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0147  */
    /* JADX WARN: Code duplicated, block: B:40:0x014a  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C16766y0 c16766y0;
        String strM73002i;
        int i13 = this.f37259w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C2314t c2314t = C2314t.f9131w;
        Object obj4 = this.f37261y;
        boolean z4 = this.f37260x;
        switch (i13) {
            case 0:
                InterfaceC22997s1 RowButtonWithEndIconOuterContent = (InterfaceC22997s1) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                C16772z0 c16772z0 = (C16772z0) obj4;
                AbstractC22676k.m65750j(RowButtonWithEndIconOuterContent, "$this$RowButtonWithEndIconOuterContent");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C28655q) composer).m87153g(RowButtonWithEndIconOuterContent) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else if (z4) {
                        AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(R.drawable.stripe_ic_checkmark, composer, 0);
                        Modifier modifierM3392n = AbstractC1099a.m3392n(AbstractC1099a.m3398t(RowButtonWithEndIconOuterContent.mo66771a(c2314t, C2299e.f9108K), 0.0f, 0.0f, c16772z0.f64464F, 0.0f, 11), 3, 0.0f, 2);
                        if (AbstractC11894a.m31939G(composer)) {
                            c16766y0 = c16772z0.f64468J;
                        } else {
                            c16766y0 = c16772z0.f64467I;
                        }
                        AbstractC15005f3.m43107a(abstractC26165aM88500I, null, modifierM3392n, AbstractC17918w0.m51515c(c16766y0.f64442x), composer, 48, 0);
                    }
                } else if (z4) {
                    AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(R.drawable.stripe_ic_checkmark, composer, 0);
                    Modifier modifierM3392n2 = AbstractC1099a.m3392n(AbstractC1099a.m3398t(RowButtonWithEndIconOuterContent.mo66771a(c2314t, C2299e.f9108K), 0.0f, 0.0f, c16772z0.f64464F, 0.0f, 11), 3, 0.0f, 2);
                    if (AbstractC11894a.m31939G(composer)) {
                        c16766y0 = c16772z0.f64468J;
                    } else {
                        c16766y0 = c16772z0.f64467I;
                    }
                    AbstractC15005f3.m43107a(abstractC26165aM88500I2, null, modifierM3392n2, AbstractC17918w0.m51515c(c16766y0.f64442x), composer, 48, 0);
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (!c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c28655q2.m87138X();
                } else {
                    ((C37816b) obj4).invoke(c28655q2, 0);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(AbstractC23096g.f91205d, c2314t));
                    C27430e c27430eM82859b = AbstractC24899e0.f97534f;
                    if (c27430eM82859b == null) {
                        C27428d c27428d = new C27428d("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        int i14 = AbstractC27433f0.f110561a;
                        C17875c1 c17875c1 = new C17875c1(C17919x.f69625b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new C27442m(7.0f, 10.0f));
                        arrayList.add(new C27449t(5.0f, 5.0f));
                        arrayList.add(new C27449t(5.0f, -5.0f));
                        arrayList.add(C27438i.f110602c);
                        C27428d.m82858a(c27428d, arrayList, c17875c1);
                        c27430eM82859b = c27428d.m82859b();
                        AbstractC24899e0.f97534f = c27430eM82859b;
                    }
                    C27430e c27430e = c27430eM82859b;
                    if (z4) {
                        c28655q2.m87150e0(1509384391);
                        strM73002i = AbstractC24899e0.m73002i(c28655q2, R.string.m3c_date_picker_switch_to_day_selection);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1509478662);
                        strM73002i = AbstractC24899e0.m73002i(c28655q2, R.string.m3c_date_picker_switch_to_year_selection);
                        c28655q2.m87173q(false);
                    }
                    AbstractC23164r1.m67133b(c27430e, strM73002i, AbstractC1772c1.m5375L(z4 ? 180.0f : 0.0f, c2314t), 0L, c28655q2, 0, 8);
                }
                break;
        }
        return c23454a0;
    }

    public C11551n0(boolean z4, C16772z0 c16772z0) {
        this.f37260x = z4;
        this.f37261y = c16772z0;
    }
}
