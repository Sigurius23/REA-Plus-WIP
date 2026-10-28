package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.AbstractC2526g3;
import b30.C2539i0;
import b30.C2550j3;
import b30.C2591o4;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivity;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivity;
import com.stripe.android.shoppay.ShopPayActivity;
import d30.C11558r;
import ec3.InterfaceC13037f2;
import g20.C15270p;
import g40.C15399o1;
import g40.C15404p1;
import g40.InterfaceC15391m3;
import h30.C16798c;
import h40.C16845k;
import i20.C17932c0;
import i20.C17934d;
import i20.C17940f;
import i20.C17957k1;
import i20.C17969p;
import i20.C17982v0;
import i20.C17983w;
import i20.C17985x;
import i20.InterfaceC17929b0;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21467g;
import java.util.Arrays;
import l83.C23454a0;
import m00.C24869a;
import n00.C26075c;
import o73.C27648a;
import p00.C28580q;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p048ce.AbstractC4482w;
import p077d0.C11421z1;
import p088dc.AbstractC11894a;
import p097ds.AbstractC12313p;
import p114eb.C12991u0;
import p132f0.C13821r1;
import p164g2.C15247s;
import p181h2.C16620e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC22973k1;
import p292l1.AbstractC23092f1;
import p292l1.C23067b0;
import p292l1.C23085e0;
import p292l1.C23104h1;
import p292l1.C23197w4;
import p292l1.C23204y;
import p292l1.InterfaceC23098g1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import sb3.AbstractC32350a;
import se.AbstractC32411b;
import u10.AbstractC34428p;
import u10.C34417e;
import u10.C34429q;
import wb3.AbstractC37056f;
import yb0.C39382e;

/* JADX INFO: renamed from: g1.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C15001f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56112w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f56113x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f56114y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56115z;

    public C15001f(C11421z1 c11421z1, C37816b c37816b, C23197w4 c23197w4) {
        this.f56112w = 8;
        this.f56113x = c11421z1;
        this.f56115z = c37816b;
        this.f56114y = c23197w4;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x034b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0371  */
    /* JADX WARN: Code duplicated, block: B:115:0x039e  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:127:0x0403  */
    /* JADX WARN: Code duplicated, block: B:136:0x045b  */
    /* JADX WARN: Code duplicated, block: B:139:0x047c  */
    /* JADX WARN: Code duplicated, block: B:148:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:151:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    /* JADX WARN: Code duplicated, block: B:47:0x013c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0232  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Exception {
        C37816b c37816bM121344e;
        C28655q c28655q;
        boolean zM87157i;
        Object objM87133R;
        C17957k1 c17957k1;
        C28655q c28655q2;
        boolean zM87157i2;
        Object objM87133R2;
        C17982v0 c17982v0;
        C28655q c28655q3;
        boolean zM87157i3;
        Object objM87133R3;
        InterfaceC30057d interfaceC30057d;
        C16845k c16845kM113944O;
        C28655q c28655q4;
        boolean zM87157i4;
        Object objM87133R4;
        C16845k c16845k;
        boolean zM87157i5;
        Object objM87133R5;
        C28655q c28655q5;
        boolean zM87153g;
        Object objM87133R6;
        boolean zM87157i6;
        Object objM87133R7;
        int i13 = this.f56112w;
        int i14 = 8;
        C2314t c2314t = C2314t.f9131w;
        C28676v0 c28676v0 = C28635l.f115821a;
        int i15 = 1;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f56115z;
        Object obj4 = this.f56114y;
        Object obj5 = this.f56113x;
        int i16 = 2;
        int i17 = 3;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q6 = (C28655q) composer;
                if (!c28655q6.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c28655q6.m87138X();
                } else {
                    InterfaceC4351m interfaceC4351m = (InterfaceC4351m) obj5;
                    InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) obj4;
                    C37816b c37816b = (C37816b) obj3;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q6, 0);
                    int iHashCode = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q6.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q6, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q6, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q6, C0217k.f726d, modifierM118962N);
                    C37816b c37816bM121344e2 = null;
                    if (interfaceC4351m == null) {
                        c28655q6.m87150e0(-97968969);
                        c28655q6.m87173q(false);
                        c37816bM121344e = null;
                    } else {
                        c28655q6.m87150e0(-97968968);
                        c37816bM121344e = AbstractC37817c.m121344e(1737550099, c28655q6, new C14990e(i15, interfaceC4351m));
                        c28655q6.m87173q(false);
                    }
                    if (interfaceC4351m2 == null) {
                        c28655q6.m87150e0(-97547524);
                    } else {
                        c28655q6.m87150e0(-97547523);
                        c37816bM121344e2 = AbstractC37817c.m121344e(1265552690, c28655q6, new C14990e(i17, interfaceC4351m2));
                    }
                    c28655q6.m87173q(false);
                    AbstractC15055k.m43140a(c37816bM121344e, c37816bM121344e2, c28655q6, 6);
                    AbstractC18489d0.m53384y(0, c37816b, c28655q6, true);
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q7 = (C28655q) composer2;
                if (!c28655q7.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c28655q7.m87138X();
                } else {
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3399u(AbstractC1099a.m3396r((Modifier) obj5, 0.0f, AbstractC15099o3.f56555d, 1), EnumC22935a1.f90538x), (C13821r1) obj4, 14);
                    Function3 function3 = (Function3) obj3;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q7, 0);
                    int iHashCode2 = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q7.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, modifierM92116f0);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j2);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m2);
                    C0209i c0209i2 = C0217k.f732j;
                    if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N2);
                    function3.invoke(C23016z.f90757a, c28655q7, 6);
                    c28655q7.m87173q(true);
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q8 = (C28655q) composer3;
                if (!c28655q8.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c28655q8.m87138X();
                } else {
                    Modifier modifierM3499c = AbstractC1131a.m3499c(c2314t, "border");
                    float f13 = AbstractC15050j4.f56342a;
                    Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3499c, new C14984d4(((C16620e) ((InterfaceC28601c1) obj4).getValue()).f63951a, obj3, (int) (null == true ? 1 : 0)));
                    InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) obj5;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, true);
                    int iHashCode3 = Long.hashCode(c28655q8.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q8.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q8, modifierM3480c);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j3 = C0217k.f724b;
                    c28655q8.m87158i0();
                    if (c28655q8.f115903S) {
                        c28655q8.m87163l(c0213j3);
                    } else {
                        c28655q8.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q8, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q8, C0217k.f728f, interfaceC28653p1M87165m3);
                    C0209i c0209i3 = C0217k.f732j;
                    if (c28655q8.f115903S || !AbstractC22676k.m65745e(c28655q8.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q8, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q8, C0217k.f726d, modifierM118962N3);
                    if (interfaceC4351m3 == null) {
                        c28655q8.m87150e0(-1295979683);
                    } else {
                        c28655q8.m87150e0(235288868);
                        interfaceC4351m3.invoke(c28655q8, 0);
                    }
                    c28655q8.m87173q(false);
                    c28655q8.m87173q(true);
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                C16845k c16845k2 = (C16845k) obj5;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj4;
                ShopPayActivity shopPayActivity = (ShopPayActivity) obj3;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    C16845k c16845k3 = (C16845k) obj5;
                    c28655q = (C28655q) composer4;
                    c28655q.m87150e0(1623079083);
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c16845k2) | c28655q.m87157i(shopPayActivity);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C11558r(interfaceC2994c0, c16845k2, shopPayActivity, 25);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C11558r(interfaceC2994c0, c16845k2, shopPayActivity, 25);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC12313p.m34277b(c16845k3, null, 0.0f, (InterfaceC4339a) objM87133R, AbstractC37817c.m121344e(1782822280, c28655q, new C16798c(shopPayActivity, null == true ? 1 : 0)), c28655q, 24584, 6);
                } else {
                    C28655q c28655q9 = (C28655q) composer4;
                    if (!c28655q9.m87121F()) {
                        C16845k c16845k4 = (C16845k) obj5;
                        c28655q = (C28655q) composer4;
                        c28655q.m87150e0(1623079083);
                        zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c16845k2) | c28655q.m87157i(shopPayActivity);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C11558r(interfaceC2994c0, c16845k2, shopPayActivity, 25);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        AbstractC12313p.m34277b(c16845k4, null, 0.0f, (InterfaceC4339a) objM87133R, AbstractC37817c.m121344e(1782822280, c28655q, new C16798c(shopPayActivity, null == true ? 1 : 0)), c28655q, 24584, 6);
                    } else {
                        c28655q9.m87138X();
                    }
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                AddressElementActivity addressElementActivity = (AddressElementActivity) obj4;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    C16845k c16845k5 = (C16845k) obj5;
                    c17957k1 = ((C17969p) addressElementActivity.f22376x.getValue()).f69790w;
                    c28655q2 = (C28655q) composer5;
                    c28655q2.m87150e0(582905322);
                    zM87157i2 = c28655q2.m87157i(c17957k1);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i2) {
                        C17934d c17934d = new C17934d(0, c17957k1, C17957k1.class, "dismiss", "dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0, 0);
                        c28655q2.m87172p0(c17934d);
                        objM87133R2 = c17934d;
                    } else {
                        C17934d c17934d2 = new C17934d(0, c17957k1, C17957k1.class, "dismiss", "dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0, 0);
                        c28655q2.m87172p0(c17934d2);
                        objM87133R2 = c17934d2;
                    }
                    c28655q2.m87173q(false);
                    AbstractC12313p.m34277b(c16845k5, null, 0.0f, (InterfaceC4339a) objM87133R2, AbstractC37817c.m121344e(589712743, c28655q2, new C17940f((C12991u0) obj3, addressElementActivity, i15)), c28655q2, 24584, 6);
                } else {
                    C28655q c28655q10 = (C28655q) composer5;
                    if (!c28655q10.m87121F()) {
                        C16845k c16845k6 = (C16845k) obj5;
                        c17957k1 = ((C17969p) addressElementActivity.f22376x.getValue()).f69790w;
                        c28655q2 = (C28655q) composer5;
                        c28655q2.m87150e0(582905322);
                        zM87157i2 = c28655q2.m87157i(c17957k1);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i2 || objM87133R2 == c28676v0) {
                            C17934d c17934d3 = new C17934d(0, c17957k1, C17957k1.class, "dismiss", "dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0, 0);
                            c28655q2.m87172p0(c17934d3);
                            objM87133R2 = c17934d3;
                        }
                        c28655q2.m87173q(false);
                        AbstractC12313p.m34277b(c16845k6, null, 0.0f, (InterfaceC4339a) objM87133R2, AbstractC37817c.m121344e(589712743, c28655q2, new C17940f((C12991u0) obj3, addressElementActivity, i15)), c28655q2, 24584, 6);
                    } else {
                        c28655q10.m87138X();
                    }
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                AutocompleteActivity autocompleteActivity = (AutocompleteActivity) obj4;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    C16845k c16845k7 = (C16845k) obj5;
                    c17982v0 = (C17982v0) autocompleteActivity.f22380x.getValue();
                    c28655q3 = (C28655q) composer6;
                    c28655q3.m87150e0(-1980177564);
                    zM87157i3 = c28655q3.m87157i(c17982v0);
                    objM87133R3 = c28655q3.m87133R();
                    if (zM87157i3) {
                        C2539i0 c2539i0 = new C2539i0(0, c17982v0, C17982v0.class, "onBackPressed", "onBackPressed()V", 0, 14);
                        c28655q3.m87172p0(c2539i0);
                        objM87133R3 = c2539i0;
                    } else {
                        C2539i0 c2539i1 = new C2539i0(0, c17982v0, C17982v0.class, "onBackPressed", "onBackPressed()V", 0, 14);
                        c28655q3.m87172p0(c2539i1);
                        objM87133R3 = c2539i1;
                    }
                    c28655q3.m87173q(false);
                    AbstractC12313p.m34277b(c16845k7, null, 0.0f, (InterfaceC4339a) ((InterfaceC21467g) objM87133R3), AbstractC37817c.m121344e(-1329885986, c28655q3, new C17985x(autocompleteActivity, (InterfaceC17929b0) obj3, i15)), c28655q3, 24584, 6);
                } else {
                    C28655q c28655q11 = (C28655q) composer6;
                    if (!c28655q11.m87121F()) {
                        C16845k c16845k8 = (C16845k) obj5;
                        c17982v0 = (C17982v0) autocompleteActivity.f22380x.getValue();
                        c28655q3 = (C28655q) composer6;
                        c28655q3.m87150e0(-1980177564);
                        zM87157i3 = c28655q3.m87157i(c17982v0);
                        objM87133R3 = c28655q3.m87133R();
                        if (zM87157i3 || objM87133R3 == c28676v0) {
                            C2539i0 c2539i2 = new C2539i0(0, c17982v0, C17982v0.class, "onBackPressed", "onBackPressed()V", 0, 14);
                            c28655q3.m87172p0(c2539i2);
                            objM87133R3 = c2539i2;
                        }
                        c28655q3.m87173q(false);
                        AbstractC12313p.m34277b(c16845k8, null, 0.0f, (InterfaceC4339a) ((InterfaceC21467g) objM87133R3), AbstractC37817c.m121344e(-1329885986, c28655q3, new C17985x(autocompleteActivity, (InterfaceC17929b0) obj3, i15)), c28655q3, 24584, 6);
                    } else {
                        c28655q11.m87138X();
                    }
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                C17932c0 c17932c0 = (C17932c0) obj4;
                AutocompleteActivity autocompleteActivity2 = (AutocompleteActivity) obj5;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    interfaceC30057d = null;
                    c16845kM113944O = AbstractC35902e.m113944O(null, composer7, 3);
                    c28655q4 = (C28655q) composer7;
                    c28655q4.m87150e0(-1747446857);
                    zM87157i4 = c28655q4.m87157i(autocompleteActivity2) | c28655q4.m87157i(c17932c0) | c28655q4.m87157i(c16845kM113944O);
                    objM87133R4 = c28655q4.m87133R();
                    if (zM87157i4) {
                        C15270p c15270p = new C15270p(autocompleteActivity2, c17932c0, c16845kM113944O, interfaceC30057d, 17);
                        c16845k = c16845kM113944O;
                        c28655q4.m87172p0(c15270p);
                        objM87133R4 = c15270p;
                    } else {
                        C15270p c15270p2 = new C15270p(autocompleteActivity2, c17932c0, c16845kM113944O, interfaceC30057d, 17);
                        c16845k = c16845kM113944O;
                        c28655q4.m87172p0(c15270p2);
                        objM87133R4 = c15270p2;
                    }
                    c28655q4.m87173q(false);
                    AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R4, c23454a0);
                    c28655q4.m87150e0(-1747422842);
                    zM87157i5 = c28655q4.m87157i(autocompleteActivity2);
                    objM87133R5 = c28655q4.m87133R();
                    if (zM87157i5) {
                        objM87133R5 = new C17983w(autocompleteActivity2, i16);
                        c28655q4.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C17983w(autocompleteActivity2, i16);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    c28655q4.m87173q(false);
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q4, 0, 1);
                    InterfaceC17929b0 interfaceC17929b0 = (InterfaceC17929b0) obj3;
                    interfaceC17929b0.mo51570h0(AbstractC37817c.m121344e(-1690993354, c28655q4, new C15001f(c16845k, autocompleteActivity2, interfaceC17929b0, 5)), c28655q4);
                } else {
                    C28655q c28655q12 = (C28655q) composer7;
                    if (!c28655q12.m87121F()) {
                        interfaceC30057d = null;
                        c16845kM113944O = AbstractC35902e.m113944O(null, composer7, 3);
                        c28655q4 = (C28655q) composer7;
                        c28655q4.m87150e0(-1747446857);
                        zM87157i4 = c28655q4.m87157i(autocompleteActivity2) | c28655q4.m87157i(c17932c0) | c28655q4.m87157i(c16845kM113944O);
                        objM87133R4 = c28655q4.m87133R();
                        if (zM87157i4 || objM87133R4 == c28676v0) {
                            C15270p c15270p3 = new C15270p(autocompleteActivity2, c17932c0, c16845kM113944O, interfaceC30057d, 17);
                            c16845k = c16845kM113944O;
                            c28655q4.m87172p0(c15270p3);
                            objM87133R4 = c15270p3;
                        } else {
                            c16845k = c16845kM113944O;
                        }
                        c28655q4.m87173q(false);
                        AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R4, c23454a0);
                        c28655q4.m87150e0(-1747422842);
                        zM87157i5 = c28655q4.m87157i(autocompleteActivity2);
                        objM87133R5 = c28655q4.m87133R();
                        if (zM87157i5 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C17983w(autocompleteActivity2, i16);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        c28655q4.m87173q(false);
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q4, 0, 1);
                        InterfaceC17929b0 interfaceC17929b1 = (InterfaceC17929b0) obj3;
                        interfaceC17929b1.mo51570h0(AbstractC37817c.m121344e(-1690993354, c28655q4, new C15001f(c16845k, autocompleteActivity2, interfaceC17929b1, 5)), c28655q4);
                    } else {
                        c28655q12.m87138X();
                    }
                }
                break;
            case 7:
                Composer composer8 = (Composer) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                InterfaceC23098g1 interfaceC23098g1 = (InterfaceC23098g1) obj5;
                C28655q c28655q13 = (C28655q) composer8;
                if (!c28655q13.m87135U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c28655q13.m87138X();
                } else {
                    C23104h1 c23104h1 = (C23104h1) interfaceC23098g1;
                    C23067b0.f90984a.m67043a(c23104h1.m67085b(), c23104h1.m67084a(), (C23085e0) obj4, AbstractC1099a.m3393o(AbstractC23092f1.f91172f, c2314t), ((C23204y) obj3).f91829c, c28655q13, 199680);
                }
                break;
            case 8:
                Composer composer9 = (Composer) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C28655q c28655q14 = (C28655q) composer9;
                if (!c28655q14.m87135U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c28655q14.m87138X();
                } else {
                    Modifier modifierM118997u = AbstractC37056f.m118997u(c2314t, new C2591o4((C11421z1) obj5, 9));
                    C37816b c37816b2 = (C37816b) obj3;
                    C23197w4 c23197w4 = (C23197w4) obj4;
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode4 = Long.hashCode(c28655q14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q14.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q14, modifierM118997u);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j4 = C0217k.f724b;
                    c28655q14.m87158i0();
                    if (c28655q14.f115903S) {
                        c28655q14.m87163l(c0213j4);
                    } else {
                        c28655q14.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q14, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q14, C0217k.f728f, interfaceC28653p1M87165m4);
                    C0209i c0209i4 = C0217k.f732j;
                    if (c28655q14.f115903S || !AbstractC22676k.m65745e(c28655q14.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q14, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q14, C0217k.f726d, modifierM118962N4);
                    c37816b2.invoke(c23197w4, c28655q14, 6);
                    c28655q14.m87173q(true);
                }
                break;
            case 9:
                Composer composer10 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    C24869a c24869a = (C24869a) obj4;
                    AbstractC5583n.m16773d((String) obj5, c24869a.f97416a, true, (Function1) obj3, c24869a.f97423h, null, composer10, 384, 32);
                } else {
                    C28655q c28655q15 = (C28655q) composer10;
                    if (!c28655q15.m87121F()) {
                        C24869a c24869a2 = (C24869a) obj4;
                        AbstractC5583n.m16773d((String) obj5, c24869a2.f97416a, true, (Function1) obj3, c24869a2.f97423h, null, composer10, 384, 32);
                    } else {
                        c28655q15.m87138X();
                    }
                }
                break;
            case 10:
                Composer composer11 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    C26075c c26075c = (C26075c) obj5;
                    AbstractC32411b.m101091e(!c26075c.f103263f, c26075c.f103261d, (InterfaceC15391m3) obj4, c26075c.f103262e, (C15247s) obj3, composer11, 24576);
                } else {
                    C28655q c28655q16 = (C28655q) composer11;
                    if (!c28655q16.m87121F()) {
                        C26075c c26075c2 = (C26075c) obj5;
                        AbstractC32411b.m101091e(!c26075c2.f103263f, c26075c2.f103261d, (InterfaceC15391m3) obj4, c26075c2.f103262e, (C15247s) obj3, composer11, 24576);
                    } else {
                        c28655q16.m87138X();
                    }
                }
                break;
            case 11:
                Composer composer12 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    float f14 = 8;
                    AbstractC11894a.m31958g(!((C28580q) obj5).f115648w, (C15399o1) obj4, AbstractC1136a.m3599a(AbstractC1102d.m3424u(328, c2314t), "verification_otp_tag"), AbstractC4482w.m13981Q(composer12).f55689b, null, f14, f14, " ", new C15404p1(AbstractC4482w.m13975K(composer12).f55668g, AbstractC4482w.m13975K(composer12).f55674m, AbstractC4482w.m13975K(composer12).f55664c, AbstractC4482w.m13975K(composer12).f55663b, AbstractC4482w.m13975K(composer12).f55664c), (float) 1.5d, (C15247s) obj3, composer12, 819659200, 6, 16);
                } else {
                    C28655q c28655q17 = (C28655q) composer12;
                    if (!c28655q17.m87121F()) {
                        float f15 = 8;
                        AbstractC11894a.m31958g(!((C28580q) obj5).f115648w, (C15399o1) obj4, AbstractC1136a.m3599a(AbstractC1102d.m3424u(328, c2314t), "verification_otp_tag"), AbstractC4482w.m13981Q(composer12).f55689b, null, f15, f15, " ", new C15404p1(AbstractC4482w.m13975K(composer12).f55668g, AbstractC4482w.m13975K(composer12).f55674m, AbstractC4482w.m13975K(composer12).f55664c, AbstractC4482w.m13975K(composer12).f55663b, AbstractC4482w.m13975K(composer12).f55664c), (float) 1.5d, (C15247s) obj3, composer12, 819659200, 6, 16);
                    } else {
                        c28655q17.m87138X();
                    }
                }
                break;
            case 12:
                Composer composer13 = (Composer) obj;
                ManageActivity manageActivity = (ManageActivity) obj3;
                AbstractC34428p abstractC34428p = (AbstractC34428p) obj5;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    c28655q5 = (C28655q) composer13;
                    c28655q5.m87150e0(-2084016887);
                    zM87153g = c28655q5.m87153g(abstractC34428p);
                    objM87133R6 = c28655q5.m87133R();
                    if (zM87153g) {
                        objM87133R6 = abstractC34428p.mo108795k();
                        c28655q5.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = abstractC34428p.mo108795k();
                        c28655q5.m87172p0(objM87133R6);
                    }
                    c28655q5.m87173q(false);
                    C2550j3 c2550j3 = (C2550j3) C27648a.m83597t((InterfaceC13037f2) objM87133R6, c28655q5, 0).getValue();
                    boolean zM94918a = ((C34429q) obj4).f144667b.m94918a();
                    c28655q5.m87150e0(-2084007014);
                    zM87157i6 = c28655q5.m87157i(manageActivity);
                    objM87133R7 = c28655q5.m87133R();
                    if (zM87157i6) {
                        objM87133R7 = new C34417e(manageActivity, i17);
                        c28655q5.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C34417e(manageActivity, i17);
                        c28655q5.m87172p0(objM87133R7);
                    }
                    c28655q5.m87173q(false);
                    AbstractC2526g3.m7464c(0.0f, 384, c28655q5, c2550j3, (InterfaceC4339a) objM87133R7, zM94918a, true);
                } else {
                    C28655q c28655q18 = (C28655q) composer13;
                    if (!c28655q18.m87121F()) {
                        c28655q5 = (C28655q) composer13;
                        c28655q5.m87150e0(-2084016887);
                        zM87153g = c28655q5.m87153g(abstractC34428p);
                        objM87133R6 = c28655q5.m87133R();
                        if (zM87153g || objM87133R6 == c28676v0) {
                            objM87133R6 = abstractC34428p.mo108795k();
                            c28655q5.m87172p0(objM87133R6);
                        }
                        c28655q5.m87173q(false);
                        C2550j3 c2550j4 = (C2550j3) C27648a.m83597t((InterfaceC13037f2) objM87133R6, c28655q5, 0).getValue();
                        boolean zM94918a2 = ((C34429q) obj4).f144667b.m94918a();
                        c28655q5.m87150e0(-2084007014);
                        zM87157i6 = c28655q5.m87157i(manageActivity);
                        objM87133R7 = c28655q5.m87133R();
                        if (zM87157i6 || objM87133R7 == c28676v0) {
                            objM87133R7 = new C34417e(manageActivity, i17);
                            c28655q5.m87172p0(objM87133R7);
                        }
                        c28655q5.m87173q(false);
                        AbstractC2526g3.m7464c(0.0f, 384, c28655q5, c2550j4, (InterfaceC4339a) objM87133R7, zM94918a2, true);
                    } else {
                        c28655q18.m87138X();
                    }
                }
                break;
            case 13:
                Composer composer14 = (Composer) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                C28655q c28655q19 = (C28655q) composer14;
                if (!c28655q19.m87135U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c28655q19.m87138X();
                } else {
                    AbstractC32350a.m100704k((String) obj5, (String) obj4, c28655q19, Arrays.copyOf((Object[]) obj3, 0));
                }
                break;
            default:
                Composer composer15 = (Composer) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C28655q c28655q20 = (C28655q) composer15;
                if (!c28655q20.m87135U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c28655q20.m87138X();
                } else {
                    Modifier modifier = (Modifier) obj5;
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj4;
                    Object objM87133R8 = c28655q20.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C39382e(i14, interfaceC28601c1);
                        c28655q20.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3500d = AbstractC1131a.m3500d(modifier, (Function1) objM87133R8);
                    C37816b c37816b3 = (C37816b) obj3;
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, true);
                    int iHashCode5 = Long.hashCode(c28655q20.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q20.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q20, modifierM3500d);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j5 = C0217k.f724b;
                    c28655q20.m87158i0();
                    if (c28655q20.f115903S) {
                        c28655q20.m87163l(c0213j5);
                    } else {
                        c28655q20.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q20, C0217k.f728f, interfaceC28653p1M87165m5);
                    C0209i c0209i5 = C0217k.f732j;
                    if (c28655q20.f115903S || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q20, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.f726d, modifierM118962N5);
                    AbstractC18489d0.m53384y(0, c37816b3, c28655q20, true);
                }
                break;
        }
        return c23454a0;
    }

    public /* synthetic */ C15001f(Object obj, Object obj2, Object obj3, int i13) {
        this.f56112w = i13;
        this.f56113x = obj;
        this.f56114y = obj2;
        this.f56115z = obj3;
    }

    public C15001f(InterfaceC28601c1 interfaceC28601c1, InterfaceC22973k1 interfaceC22973k1, InterfaceC4351m interfaceC4351m) {
        this.f56112w = 2;
        this.f56114y = interfaceC28601c1;
        this.f56115z = interfaceC22973k1;
        this.f56113x = interfaceC4351m;
    }
}
