package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
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
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33174e;
import p736sz0.C33180g;
import p736sz0.C33183h;
import p736sz0.EnumC33177f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.a0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40265a0 {
    /* JADX INFO: renamed from: b */
    public static final void m129311b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2030607530);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C38072d c38072d = C38072d.f163053a;
            C33183h c33183h = new C33183h(c38072d.m121951d().getVarious().getFeedbackThumbsUp(), "Thumbs up", c38072d.m121951d().getVarious().getThumbUp(), "Thumbs up", null, 16, null);
            C33183h c33183h2 = new C33183h(c38072d.m121951d().getVarious().getFeedbackThumbsDown(), "Thumbs down", c38072d.m121951d().getVarious().getThumbDown(), "Thumbs down", null, 16, null);
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2 * f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            EnumC33177f enumC33177f = EnumC33177f.NONE;
            C33180g c33180g = new C33180g("Was this visit summary helpful?", enumC33177f, c33183h, c33183h2);
            int i14 = C33180g.f138347e << 3;
            AbstractC33174e.m105100g(null, c33180g, null, c28655q, i14, 5);
            AbstractC33174e.m105100g(null, new C33180g("Was this visit summary helpful?", EnumC33177f.POSITIVE, c33183h, c33183h2), null, c28655q, i14, 5);
            AbstractC33174e.m105100g(null, new C33180g("Was this visit summary helpful?", EnumC33177f.NEGATIVE, c33183h, c33183h2), null, c28655q, i14, 5);
            AbstractC33174e.m105100g(null, new C33180g(null, enumC33177f, c33183h, c33183h2), null, c28655q, i14, 5);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40363j(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m129312c(int i13, Composer composer, int i14) {
        m129311b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
