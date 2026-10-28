package p163g1;

import am2.C1008b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bm2.C3424a0;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import i93.C18279e;
import i93.InterfaceC18280f;
import j93.InterfaceC21467g;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p180h0.AbstractC16412k1;
import p180h0.EnumC16377d2;
import p238j0.InterfaceC21083i;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22663d0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.z5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15211z5 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC21083i f57116E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f57117F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C15177w1 f57118G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC28601c1 f57119H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC18280f f57120w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f57121x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f57122y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f57123z;

    public C15211z5(InterfaceC18280f interfaceC18280f, float f13, List list, InterfaceC4339a interfaceC4339a, InterfaceC21083i interfaceC21083i, boolean z4, C15177w1 c15177w1, InterfaceC28601c1 interfaceC28601c1) {
        this.f57120w = interfaceC18280f;
        this.f57121x = f13;
        this.f57122y = list;
        this.f57123z = interfaceC4339a;
        this.f57116E = interfaceC21083i;
        this.f57117F = z4;
        this.f57118G = c15177w1;
        this.f57119H = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28676v0 c28676v0;
        InterfaceC28690z0 interfaceC28690z0;
        C15091n5 c15091n5;
        InterfaceC23004v interfaceC23004v = (InterfaceC23004v) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(interfaceC23004v) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z4 = c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x;
            float fM124765i = C39169a.m124765i(((C1101c) interfaceC23004v).f4585b);
            C22663d0 c22663d0 = new C22663d0();
            C22663d0 c22663d1 = new C22663d0();
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            float f13 = AbstractC15019g6.f56199a;
            c22663d0.f89331w = Math.max(fM124765i - interfaceC39171c.mo743q0(f13), 0.0f);
            c22663d1.f89331w = Math.min(interfaceC39171c.mo743q0(f13), c22663d0.f89331w);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R == c28676v1) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            float f14 = this.f57121x;
            InterfaceC18280f interfaceC18280f = this.f57120w;
            if (objM87133R2 == c28676v1) {
                float fFloatValue = ((Number) interfaceC18280f.getStart()).floatValue();
                float fFloatValue2 = ((Number) interfaceC18280f.mo52651d()).floatValue();
                float f15 = c22663d1.f89331w;
                float f16 = c22663d0.f89331w;
                float f17 = fFloatValue2 - fFloatValue;
                float f18 = f17 == 0.0f ? 0.0f : (f14 - fFloatValue) / f17;
                if (f18 < 0.0f) {
                    f18 = 0.0f;
                }
                if (f18 > 1.0f) {
                    f18 = 1.0f;
                }
                objM87133R2 = AbstractC11266d.m30468v(AbstractC12889b.m36249O(f15, f16, f18), c28655q);
            }
            InterfaceC28690z0 interfaceC28690z1 = (InterfaceC28690z0) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v1) {
                objM87133R3 = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z2 = (InterfaceC28690z0) objM87133R3;
            boolean zM87147d = c28655q.m87147d(c22663d1.f89331w) | c28655q.m87147d(c22663d0.f89331w) | c28655q.m87153g(interfaceC18280f);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87147d || objM87133R4 == c28676v1) {
                C15091n5 c15091n6 = new C15091n5(new C1008b(interfaceC28690z1, interfaceC28690z2, c22663d1, c22663d0, this.f57119H, interfaceC18280f));
                c28655q.m87172p0(c15091n6);
                objM87133R4 = c15091n6;
            }
            C15091n5 c15091n7 = (C15091n5) objM87133R4;
            boolean zM87153g = c28655q.m87153g(interfaceC18280f) | c28655q.m87147d(c22663d1.f89331w) | c28655q.m87147d(c22663d0.f89331w);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87153g || objM87133R5 == c28676v1) {
                objM87133R5 = new C15181w5(interfaceC18280f, c22663d1, c22663d0);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC15019g6.m43119a((Function1) ((InterfaceC21467g) objM87133R5), interfaceC18280f, new C18279e(c22663d1.f89331w, c22663d0.f89331w), interfaceC28690z1, this.f57121x, c28655q, 3072);
            boolean zM87157i = c28655q.m87157i(this.f57122y) | c28655q.m87147d(c22663d1.f89331w) | c28655q.m87147d(c22663d0.f89331w) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15091n7) | c28655q.m87153g(this.f57123z);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i || objM87133R6 == c28676v1) {
                c28676v0 = c28676v1;
                interfaceC28690z0 = interfaceC28690z1;
                C3424a0 c3424a0 = new C3424a0(interfaceC28690z0, this.f57122y, c22663d1, c22663d0, interfaceC2994c0, c15091n7, this.f57123z, 4);
                c15091n5 = c15091n7;
                c28655q.m87172p0(c3424a0);
                objM87133R6 = c3424a0;
            } else {
                c28676v0 = c28676v1;
                c15091n5 = c15091n7;
                interfaceC28690z0 = interfaceC28690z1;
            }
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F((Function1) objM87133R6, c28655q);
            C28676v0 c28676v2 = c28676v0;
            C15008f6 c15008f6 = new C15008f6(this.f57117F, c15091n5, this.f57116E, fM124765i, z4, interfaceC28690z2, interfaceC28690z0, interfaceC28601c1M87238F);
            C15091n5 c15091n8 = c15091n5;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118997u = AbstractC37056f.m118997u(c2314t, c15008f6);
            EnumC16377d2 enumC16377d2 = EnumC16377d2.f62972x;
            boolean zBooleanValue = ((Boolean) c15091n8.f56503b.getValue()).booleanValue();
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87238F);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87153g2 || objM87133R7 == c28676v2) {
                objM87133R7 = new C15191x5(interfaceC28601c1M87238F, null, 0);
                c28655q.m87172p0(objM87133R7);
            }
            Modifier modifierM46598a = AbstractC16412k1.m46598a(c2314t, c15091n8, enumC16377d2, this.f57117F, this.f57116E, zBooleanValue, null, (Function3) objM87133R7, z4, 32);
            float fM36283m = AbstractC12889b.m36283m(f14, ((Number) interfaceC18280f.getStart()).floatValue(), ((Number) interfaceC18280f.mo52651d()).floatValue());
            float fFloatValue3 = ((Number) interfaceC18280f.getStart()).floatValue();
            float fFloatValue4 = ((Number) interfaceC18280f.mo52651d()).floatValue() - fFloatValue3;
            float f19 = fFloatValue4 == 0.0f ? 0.0f : (fM36283m - fFloatValue3) / fFloatValue4;
            if (f19 < 0.0f) {
                f19 = 0.0f;
            }
            AbstractC15019g6.m43121c(this.f57117F, f19 > 1.0f ? 1.0f : f19, this.f57122y, this.f57118G, c22663d0.f89331w - c22663d1.f89331w, this.f57116E, modifierM118997u.mo3471e(modifierM46598a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
