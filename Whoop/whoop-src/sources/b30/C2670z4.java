package b30;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import l83.C23454a0;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC14981d1;
import p163g1.C14970c1;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p475s0.C32034a;
import p530up.AbstractC35148d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.z4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2670z4 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f10453E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f10454F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Integer f10455G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ boolean f10456H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ boolean f10457I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ boolean f10458J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f10459w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10460x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f10461y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f10462z;

    public C2670z4(String str, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, int i13, String str2, Integer num, boolean z14, boolean z15, boolean z16) {
        this.f10459w = str;
        this.f10460x = z4;
        this.f10461y = z13;
        this.f10462z = interfaceC4339a;
        this.f10453E = i13;
        this.f10454F = str2;
        this.f10455G = num;
        this.f10456H = z14;
        this.f10457I = z15;
        this.f10458J = z16;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0063  */
    /* JADX WARN: Code duplicated, block: B:14:0x009a  */
    /* JADX WARN: Code duplicated, block: B:15:0x009e  */
    /* JADX WARN: Code duplicated, block: B:20:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:27:0x0125  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x002c, please report this as an issue */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2314t c2314t;
        boolean z4;
        C28655q c28655q;
        boolean zM87155h;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        float f14;
        String str;
        boolean zM87153g;
        Object objM87133R2;
        InterfaceC23001u BadgedBox = (InterfaceC23001u) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(BadgedBox, "$this$BadgedBox");
        if ((iIntValue & 17) == 16) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                String str2 = "SAVED_PAYMENT_METHOD_CARD_TEST_TAG_" + this.f10459w;
                c2314t = C2314t.f9131w;
                Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, str2);
                InterfaceC4339a interfaceC4339a = this.f10462z;
                boolean z13 = this.f10460x;
                z4 = this.f10461y;
                Modifier modifierM118997u = AbstractC37056f.m118997u(modifierM3599a, new C32034a(z13, z4, interfaceC4339a));
                c28655q = (C28655q) composer;
                c28655q.m87150e0(1345986350);
                zM87155h = c28655q.m87155h(z4);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87155h || objM87133R == c28676v0) {
                    objM87133R = new C2656x4(z4, 0);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM118997u, false, (Function1) objM87133R);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC2480a5.m7451c(null, z13, c28655q, this.f10453E, 0);
                long jM43090e = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e();
                f13 = 4;
                f14 = 6;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, f13, f14, 0.0f, 8);
                c28655q.m87150e0(1159230003);
                str = this.f10454F;
                zM87153g = c28655q.m87153g(str);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2663y4(str, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                C27648a.m83584g(this.f10455G, this.f10459w, jM43090e, AbstractC18032n.m51775c(modifierM3398t, false, (Function1) objM87133R2), this.f10456H, this.f10457I, c28655q, 0, 0);
                c28655q.m87150e0(1159235110);
                if (this.f10458J) {
                    AbstractC35148d.m111172c(AbstractC1099a.m3398t(c2314t, f14, f13, f14, 0.0f, 8), c28655q, 0);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            }
        } else {
            String str3 = "SAVED_PAYMENT_METHOD_CARD_TEST_TAG_" + this.f10459w;
            c2314t = C2314t.f9131w;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, str3);
            InterfaceC4339a interfaceC4339a2 = this.f10462z;
            boolean z14 = this.f10460x;
            z4 = this.f10461y;
            Modifier modifierM118997u2 = AbstractC37056f.m118997u(modifierM3599a2, new C32034a(z14, z4, interfaceC4339a2));
            c28655q = (C28655q) composer;
            c28655q.m87150e0(1345986350);
            zM87155h = c28655q.m87155h(z4);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87155h) {
                objM87133R = new C2656x4(z4, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2656x4(z4, 0);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM118997u2, false, (Function1) objM87133R);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM51775c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC2480a5.m7451c(null, z14, c28655q, this.f10453E, 0);
            long jM43090e2 = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e();
            f13 = 4;
            f14 = 6;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, f14, f13, f14, 0.0f, 8);
            c28655q.m87150e0(1159230003);
            str = this.f10454F;
            zM87153g = c28655q.m87153g(str);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R2 = new C2663y4(str, 0);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2663y4(str, 0);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            C27648a.m83584g(this.f10455G, this.f10459w, jM43090e2, AbstractC18032n.m51775c(modifierM3398t2, false, (Function1) objM87133R2), this.f10456H, this.f10457I, c28655q, 0, 0);
            c28655q.m87150e0(1159235110);
            if (this.f10458J) {
                AbstractC35148d.m111172c(AbstractC1099a.m3398t(c2314t, f14, f13, f14, 0.0f, 8), c28655q, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        return C23454a0.f92919a;
    }
}
