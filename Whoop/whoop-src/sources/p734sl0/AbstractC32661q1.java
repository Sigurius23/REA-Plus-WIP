package p734sl0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import qk2.C30453i;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sl0.q1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ly81/e;", "color", "Lcom/whoop/design/util/TextResource;", "text", "", "icon", "Ll83/a0;", "b", "(Ly81/e;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32661q1 {
    /* JADX INFO: renamed from: b */
    public static final void m102241b(InterfaceC39332e color, TextResource text, int i13, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1984506444);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87157i(color) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? c28655q.m87153g(text) : c28655q.m87157i(text) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long brandBlack = c38072d.m121949b(c28655q, i16).getBrandBlack();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, brandBlack, c17916v0);
            float f13 = 8;
            float f14 = ((float) 1.5d) * f13;
            float f15 = 1;
            int i17 = i15 & 14;
            float f16 = 4 * f15;
            int i18 = i15;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(2 * f13, AbstractC15751g.m44455h(AbstractC1099a.m3394p(f14, modifierM3358c), f15, color.mo134584toComposableColorWaAFU9c(c28655q, i17), AbstractC33253j.m105489e(f16))));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            int i19 = i18 >> 3;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6), "", AbstractC1099a.m3394p(f16, AbstractC1092a.m3358c(c2314t, color.mo134584toComposableColorWaAFU9c(c28655q, i17), AbstractC33253j.m105489e(f16))), 0L, c28655q, 48, 8);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q, (i19 & 14) | TextResource.$stable), null, color.mo134584toComposableColorWaAFU9c(c28655q, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(color, i13, text, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m102242c(InterfaceC39332e interfaceC39332e, TextResource textResource, int i13, int i14, Composer composer, int i15) {
        m102241b(interfaceC39332e, textResource, i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }
}
