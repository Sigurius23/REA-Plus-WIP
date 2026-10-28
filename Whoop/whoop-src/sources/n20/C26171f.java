package n20;

import a30.C0307l0;
import androidx.lifecycle.C1601k1;
import b00.C2179a;
import d00.C11425d;
import d00.C11433l;
import l83.C23454a0;
import p599wz.AbstractC37760u0;
import p599wz.C37708d;
import p599wz.C37718g0;
import p599wz.C37736m0;
import p599wz.C37751r0;
import p599wz.EnumC37721h0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29828m;
import ug.AbstractC34924m;
import v00.C35459c0;

/* JADX INFO: renamed from: n20.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C26171f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103763w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26174i f103764x;

    public /* synthetic */ C26171f(C26174i c26174i, int i13) {
        this.f103763w = i13;
        this.f103764x = c26174i;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C26173h c26173hM77735g;
        boolean zM110125G;
        switch (this.f103763w) {
            case 0:
                C26174i c26174i = this.f103764x;
                C26173h state = (C26173h) obj;
                AbstractC22676k.m65750j(state, "state");
                C0307l0 c0307l0 = state.f103767w.f1019E.f150995l0;
                C37718g0 c37718g0 = c0307l0 != null ? c0307l0.f1058w : null;
                AbstractC29840y abstractC29840y = c26174i.f103777h.f103856E;
                C37708d c37708d = (C37708d) c26174i.f103781l.f166664b.f45200w.getValue();
                if (c37718g0 == null || (((c26173hM77735g = c26174i.f103777h.m77735g()) != null && c26173hM77735g.f103769y) || !(abstractC29840y instanceof C29828m) || c37708d.f161571w == null)) {
                    c26174i.m77724g(state, abstractC29840y);
                } else {
                    c26174i.f103779j.getClass();
                    C2179a c2179a = new C2179a(c37718g0);
                    if (!c2179a.m6861b() || c2179a.f8664d) {
                        c26174i.m77724g(state, abstractC29840y);
                    } else {
                        C35459c0 c35459c0 = state.f103767w.f1019E;
                        C37751r0 c37751r0 = c26174i.f103782m;
                        EnumC37721h0 enumC37721h0 = EnumC37721h0.f161650x;
                        AbstractC37760u0 abstractC37760u0 = ((C29828m) abstractC29840y).f121916y;
                        c37751r0.m121159b(c35459c0, c37708d, c37718g0, enumC37721h0, new C37736m0(abstractC37760u0 != null ? abstractC37760u0.mo121164h() : null));
                    }
                }
                return C23454a0.f92919a;
            case 1:
                C26174i c26174i2 = this.f103764x;
                C26173h it = (C26173h) obj;
                AbstractC22676k.m65750j(it, "it");
                C11433l c11433l = ((C37708d) c26174i2.f103781l.f166664b.f45200w.getValue()).f161571w;
                if (AbstractC22676k.m65745e(c11433l != null ? c11433l.f36657L : null, C11425d.f36645a)) {
                    C26186u c26186u = c26174i2.f103777h;
                    c26186u.getClass();
                    C1601k1 c1601k1 = c26186u.f103861x;
                    C26173h c26173hM77735g2 = c26186u.m77735g();
                    c1601k1.m5004e(c26173hM77735g2 != null ? C26173h.m77716b(c26173hM77735g2, null, 3) : null, "state");
                }
                AbstractC29840y abstractC29840y2 = c26174i2.f103777h.f103856E;
                boolean z4 = false;
                if (abstractC29840y2 != null) {
                    if (abstractC29840y2 instanceof C29828m) {
                        zM110125G = ((C29828m) abstractC29840y2).f121916y != null;
                    } else {
                        zM110125G = AbstractC34924m.m110125G(abstractC29840y2);
                    }
                    if (!zM110125G) {
                        z4 = true;
                    }
                }
                if (z4) {
                    c26174i2.m77724g(it, c26174i2.f103777h.f103856E);
                }
                return C23454a0.f92919a;
            case 2:
                C26174i c26174i3 = this.f103764x;
                C26173h it3 = (C26173h) obj;
                AbstractC22676k.m65750j(it3, "it");
                c26174i3.m77724g(it3, c26174i3.f103777h.f103856E);
                break;
            case 3:
                C26174i c26174i4 = this.f103764x;
                C26173h it4 = (C26173h) obj;
                AbstractC22676k.m65750j(it4, "it");
                c26174i4.m77724g(it4, c26174i4.f103777h.f103856E);
                break;
            default:
                C26174i c26174i5 = this.f103764x;
                C26173h it5 = (C26173h) obj;
                AbstractC22676k.m65750j(it5, "it");
                c26174i5.m77724g(it5, c26174i5.f103777h.f103856E);
                break;
        }
        return C23454a0.f92919a;
    }
}
