package p635y2;

import androidx.compose.p018ui.CompositionLocalMapInjectionElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28606d2;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y2.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C39076b0 extends AbstractC22680m implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f168130w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f168131x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39076b0(int i13, Modifier modifier) {
        super(3);
        this.f168130w = i13;
        this.f168131x = modifier;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f168130w) {
            case 0:
                Composer composer = ((C28606d2) obj).f115724a;
                Composer composer2 = (Composer) obj2;
                ((Number) obj3).intValue();
                int iHashCode = Long.hashCode(((C28655q) composer2).f115904T);
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, this.f168131x);
                C28655q c28655q = (C28655q) composer;
                c28655q.m87152f0(509942095);
                InterfaceC0221l.f734a.getClass();
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                c28655q.m87173q(false);
                break;
            default:
                Composer composer3 = ((C28606d2) obj).f115724a;
                Composer composer4 = (Composer) obj2;
                ((Number) obj3).intValue();
                int iHashCode2 = Integer.hashCode(AbstractC28683x.m87266t(composer4));
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N2 = this.f168131x;
                if (modifierM118962N2 != c2314t) {
                    modifierM118962N2 = AbstractC37056f.m118962N(composer4, new CompositionLocalMapInjectionElement(((C28655q) composer4).m87165m()).mo3471e(modifierM118962N2));
                }
                C28655q c28655q2 = (C28655q) composer3;
                c28655q2.m87152f0(509942095);
                InterfaceC0221l.f734a.getClass();
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                c28655q2.m87173q(false);
                break;
        }
        return C23454a0.f92919a;
    }
}
