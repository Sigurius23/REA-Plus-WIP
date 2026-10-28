package p510u0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p249jc.AbstractC21598x;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p392p3.AbstractC28771i;
import p392p3.C28772j;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p392p3.InterfaceC28770h;
import p505ts.AbstractC34132o;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: u0.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34321h0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144111w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f144112x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23285v0 f144113y;

    public C34321h0(int i13, int i14, C23285v0 c23285v0) {
        this.f144111w = i13;
        this.f144112x = i14;
        this.f144113y = c23285v0;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C28655q c28655q = (C28655q) ((Composer) obj2);
        c28655q.m87150e0(408240218);
        int i13 = this.f144111w;
        int i14 = this.f144112x;
        AbstractC34132o.m107873R(i13, i14);
        C2314t c2314t = C2314t.f9131w;
        if (i13 == 1 && i14 == Integer.MAX_VALUE) {
            c28655q.m87173q(false);
            return c2314t;
        }
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        InterfaceC28770h interfaceC28770h = (InterfaceC28770h) c28655q.m87161k(AbstractC2453v1.f9572k);
        EnumC39181m enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
        C23285v0 c23285v0 = this.f144113y;
        boolean zM87153g = c28655q.m87153g(c23285v0) | c28655q.m87149e(enumC39181m.ordinal());
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = AbstractC21598x.m60695p0(c23285v0, enumC39181m);
            c28655q.m87172p0(objM87133R);
        }
        C23285v0 c23285v1 = (C23285v0) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(interfaceC28770h) | c28655q.m87153g(c23285v1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            C23267m0 c23267m0 = c23285v1.f92255a;
            AbstractC28771i abstractC28771i = c23267m0.f92196f;
            C28780r c28780r = c23267m0.f92193c;
            if (c28780r == null) {
                c28780r = C28780r.f116539F;
            }
            C28776n c28776n = c23267m0.f92194d;
            int i15 = c28776n != null ? c28776n.f116535a : 0;
            C28777o c28777o = c23267m0.f92195e;
            objM87133R2 = ((C28772j) interfaceC28770h).m87529b(abstractC28771i, c28780r, i15, c28777o != null ? c28777o.f116536a : 65535);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R2;
        boolean zM87153g3 = c28655q.m87153g(interfaceC28670t2.getValue()) | c28655q.m87153g(interfaceC39171c) | c28655q.m87153g(interfaceC28770h) | c28655q.m87153g(c23285v0) | c28655q.m87149e(enumC39181m.ordinal());
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g3 || objM87133R3 == c28676v0) {
            objM87133R3 = Integer.valueOf((int) (AbstractC34316f1.m108616a(c23285v1, interfaceC39171c, interfaceC28770h, AbstractC34316f1.f144084a, 1) & 4294967295L));
            c28655q.m87172p0(objM87133R3);
        }
        int iIntValue = ((Number) objM87133R3).intValue();
        boolean zM87153g4 = c28655q.m87153g(interfaceC28670t2.getValue()) | c28655q.m87153g(interfaceC39171c) | c28655q.m87153g(interfaceC28770h) | c28655q.m87153g(c23285v0) | c28655q.m87149e(enumC39181m.ordinal());
        Object objM87133R4 = c28655q.m87133R();
        if (zM87153g4 || objM87133R4 == c28676v0) {
            StringBuilder sb4 = new StringBuilder();
            String str = AbstractC34316f1.f144084a;
            sb4.append(str);
            sb4.append('\n');
            sb4.append(str);
            objM87133R4 = Integer.valueOf((int) (AbstractC34316f1.m108616a(c23285v1, interfaceC39171c, interfaceC28770h, sb4.toString(), 2) & 4294967295L));
            c28655q.m87172p0(objM87133R4);
        }
        int iIntValue2 = ((Number) objM87133R4).intValue() - iIntValue;
        Integer numValueOf = i13 == 1 ? null : Integer.valueOf(((i13 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i14 != Integer.MAX_VALUE ? Integer.valueOf(((i14 - 1) * iIntValue2) + iIntValue) : null;
        Modifier modifierM3412i = AbstractC1102d.m3412i(c2314t, numValueOf != null ? interfaceC39171c.mo733e0(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? interfaceC39171c.mo733e0(numValueOf2.intValue()) : Float.NaN);
        c28655q.m87173q(false);
        return modifierM3412i;
    }
}
