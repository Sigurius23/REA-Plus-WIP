package b30;

import a30.InterfaceC0305k1;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.gestures.AbstractC1097b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.InterfaceC3747i0;
import p097ds.AbstractC12313p;
import p098dt.AbstractC12350b;
import p163g1.AbstractC14981d1;
import p163g1.C14970c1;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16478x2;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p510u0.C34337m1;
import p510u0.C34340n1;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq0.C31703x;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.v2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2640v2 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10304w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10305x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10306y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10307z;

    public /* synthetic */ C2640v2(Object obj, boolean z4, Object obj2, int i13) {
        this.f10304w = i13;
        this.f10306y = obj;
        this.f10305x = z4;
        this.f10307z = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10304w) {
            case 0:
                InterfaceC3747i0 AnimatedVisibility = (InterfaceC3747i0) obj;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
                C2307m c2307m = C2299e.f9102E;
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3414k(((C39174f) ((InterfaceC28601c1) this.f10306y).getValue()).f168413w, C2314t.f9131w)), C17919x.m51541c(0.9f, ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43093h()), AbstractC17918w0.f69621a);
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) this.f10307z;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iM87266t = AbstractC28683x.m87266t(composer);
                C28655q c28655q = (C28655q) composer;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                }
                AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                AbstractC12313p.m34293k(this.f10305x, (InterfaceC0305k1) interfaceC28670t2.getValue(), composer, 6);
                c28655q.m87173q(true);
                return C23454a0.f92919a;
            default:
                ((Number) obj3).intValue();
                C34340n1 c34340n1 = (C34340n1) this.f10306y;
                C28633k1 c28633k1 = c34340n1.f144253f;
                C28655q c28655q2 = (C28655q) ((Composer) obj2);
                c28655q2.m87150e0(805428266);
                boolean z4 = ((EnumC16377d2) c28633k1.getValue()) == EnumC16377d2.f62971w || !(c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x);
                boolean zM87153g = c28655q2.m87153g(c34340n1);
                Object objM87133R = c28655q2.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C31703x(c34340n1, 23);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC16478x2 interfaceC16478x2M34559H = AbstractC12350b.m34559H((Function1) objM87133R, c28655q2);
                boolean zM87153g2 = c28655q2.m87153g(interfaceC16478x2M34559H) | c28655q2.m87153g(c34340n1);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C34337m1(interfaceC16478x2M34559H, c34340n1);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3374b = AbstractC1097b.m3374b(C2314t.f9131w, (C34337m1) objM87133R2, (EnumC16377d2) c28633k1.getValue(), this.f10305x && c34340n1.f144249b.m87022x() != 0.0f, z4, (InterfaceC21083i) this.f10307z, 16);
                c28655q2.m87173q(false);
                return modifierM3374b;
        }
    }
}
