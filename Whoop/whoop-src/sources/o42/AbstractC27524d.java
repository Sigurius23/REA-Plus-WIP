package o42;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import k71.C22252i;
import l83.C23454a0;
import n42.C26280d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: o42.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Ln42/d;", "dataSharingBox", "Ll83/a0;", "b", "(Ln42/d;Landroidx/compose/runtime/Composer;I)V", "privacy-consent_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27524d {
    /* JADX INFO: renamed from: b */
    public static final void m82965b(C26280d dataSharingBox, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(dataSharingBox, "dataSharingBox");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1723393844);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(dataSharingBox) : c28655q.m87157i(dataSharingBox) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 3;
            float f14 = 4;
            float f15 = f13 * f14;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f15));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f16 = 8;
            float f17 = f13 * f16;
            float f18 = f16 * f14;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q, i15).getWhite5(), AbstractC17918w0.f69621a), f18, f17);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(dataSharingBox.getIcon(), c28655q, 6), "", AbstractC1102d.m3419p(f18, c2314t), c38072d.m121949b(c28655q, i15).getBrandWhite(), c28655q, 432, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            TextResource title = dataSharingBox.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(title, c28655q, i16);
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a h7 = c38072d.m121952e(c28655q, i15).getH3();
            C36775k c36775k = new C36775k(3);
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, i17, 196090);
            float f19 = 2 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(dataSharingBox.getSubtitle(), c28655q, i16), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 0, i17, 196090);
            AbstractC18489d0.m53380u(5, f14, c2314t, c28655q);
            AbstractC15751g.m44449b(null, c38072d.m121949b(c28655q, i15).getWhite10(), 1, 0.0f, c28655q, 384, 9);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(dataSharingBox.getViewableBy(), c28655q, i16), null, c38072d.m121949b(c28655q, i15).getWhite90(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB3(), null, c28655q, 0, i17, 196090);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(dataSharingBox, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m82966c(C26280d c26280d, int i13, Composer composer, int i14) {
        m82965b(c26280d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
