package i20;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.android.R;
import h02.C16574h;
import l83.C23454a0;
import p026b2.C2314t;
import p291l0.InterfaceC23013y;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p479s4.AbstractC32128i;
import p547v8.AbstractC35785b;
import p708hb2.C17095c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: i20.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17936d1 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69708w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17954j1 f69709x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28670t2 f69710y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28670t2 f69711z;

    public /* synthetic */ C17936d1(C17954j1 c17954j1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, int i13) {
        this.f69708w = i13;
        this.f69709x = c17954j1;
        this.f69710y = interfaceC28601c1;
        this.f69711z = interfaceC28601c2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17951i1 interfaceC17951i1;
        C28655q c28655q;
        C17954j1 c17954j1;
        boolean zM87157i;
        Object objM87133R;
        C17954j1 c17954j2;
        C17975s c17975s;
        String str;
        String str2;
        InterfaceC28670t2 interfaceC28670t2;
        C28655q c28655q2;
        boolean zM87157i2;
        Object objM87133R2;
        C17973r c17973r;
        switch (this.f69708w) {
            case 0:
                InterfaceC23013y InputAddressScreen = (InterfaceC23013y) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(InputAddressScreen, "$this$InputAddressScreen");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q3 = (C28655q) composer;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        interfaceC17951i1 = (InterfaceC17951i1) this.f69710y.getValue();
                        if (interfaceC17951i1 instanceof C17948h1) {
                            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 8, 7);
                            boolean z4 = ((C17948h1) interfaceC17951i1).f69730a;
                            String strM113396S = AbstractC35785b.m113396S(AbstractC32128i.m100054h(R.string.stripe_paymentsheet_address_element_use_billing_as_shipping), composer);
                            boolean zBooleanValue = ((Boolean) this.f69711z.getValue()).booleanValue();
                            c28655q = (C28655q) composer;
                            c28655q.m87150e0(365265841);
                            c17954j1 = this.f69709x;
                            zM87157i = c28655q.m87157i(c17954j1);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i || objM87133R == C28635l.f115821a) {
                                objM87133R = new C17095c(c17954j1, 7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            AbstractC37926s0.m121463a(modifierM3398t, null, z4, strM113396S, zBooleanValue, (Function1) objM87133R, c28655q, 6, 2);
                        }
                    }
                } else {
                    interfaceC17951i1 = (InterfaceC17951i1) this.f69710y.getValue();
                    if (interfaceC17951i1 instanceof C17948h1) {
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 8, 7);
                        boolean z13 = ((C17948h1) interfaceC17951i1).f69730a;
                        String strM113396S2 = AbstractC35785b.m113396S(AbstractC32128i.m100054h(R.string.stripe_paymentsheet_address_element_use_billing_as_shipping), composer);
                        boolean zBooleanValue2 = ((Boolean) this.f69711z.getValue()).booleanValue();
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(365265841);
                        c17954j1 = this.f69709x;
                        zM87157i = c28655q.m87157i(c17954j1);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R = new C17095c(c17954j1, 7);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C17095c(c17954j1, 7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        AbstractC37926s0.m121463a(modifierM3398t2, null, z13, strM113396S2, zBooleanValue2, (Function1) objM87133R, c28655q, 6, 2);
                    }
                }
                break;
            default:
                InterfaceC23013y InputAddressScreen2 = (InterfaceC23013y) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(InputAddressScreen2, "$this$InputAddressScreen");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q4 = (C28655q) composer2;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        c17954j2 = this.f69709x;
                        c17975s = c17954j2.f69756w.f69728x;
                        if (c17975s != null || (c17973r = c17975s.f69799E) == null) {
                            str = null;
                        } else {
                            str = c17973r.f69797x;
                        }
                        str2 = str;
                        if (str2 != null) {
                            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 4, 1);
                            interfaceC28670t2 = this.f69710y;
                            boolean zBooleanValue3 = ((Boolean) interfaceC28670t2.getValue()).booleanValue();
                            boolean zBooleanValue4 = ((Boolean) this.f69711z.getValue()).booleanValue();
                            c28655q2 = (C28655q) composer2;
                            c28655q2.m87150e0(-1424141903);
                            zM87157i2 = c28655q2.m87157i(c17954j2) | c28655q2.m87153g(interfaceC28670t2);
                            objM87133R2 = c28655q2.m87133R();
                            if (zM87157i2 || objM87133R2 == C28635l.f115821a) {
                                objM87133R2 = new C16574h(13, c17954j2, interfaceC28670t2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            c28655q2.m87173q(false);
                            AbstractC37926s0.m121463a(modifierM3396r, null, zBooleanValue3, str2, zBooleanValue4, (Function1) objM87133R2, c28655q2, 6, 2);
                        }
                    }
                } else {
                    c17954j2 = this.f69709x;
                    c17975s = c17954j2.f69756w.f69728x;
                    if (c17975s != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    str2 = str;
                    if (str2 != null) {
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 4, 1);
                        interfaceC28670t2 = this.f69710y;
                        boolean zBooleanValue5 = ((Boolean) interfaceC28670t2.getValue()).booleanValue();
                        boolean zBooleanValue6 = ((Boolean) this.f69711z.getValue()).booleanValue();
                        c28655q2 = (C28655q) composer2;
                        c28655q2.m87150e0(-1424141903);
                        zM87157i2 = c28655q2.m87157i(c17954j2) | c28655q2.m87153g(interfaceC28670t2);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i2) {
                            objM87133R2 = new C16574h(13, c17954j2, interfaceC28670t2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16574h(13, c17954j2, interfaceC28670t2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        c28655q2.m87173q(false);
                        AbstractC37926s0.m121463a(modifierM3396r2, null, zBooleanValue5, str2, zBooleanValue6, (Function1) objM87133R2, c28655q2, 6, 2);
                    }
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
