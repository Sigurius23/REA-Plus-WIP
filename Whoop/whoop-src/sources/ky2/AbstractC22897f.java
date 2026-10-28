package ky2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16319p0;
import h02.C16576i;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import iy0.C21026a;
import l83.C23454a0;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: ky2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "subTitle", "Lkotlin/Function0;", "Ll83/a0;", "onBack", "c", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22897f {
    /* JADX INFO: renamed from: c */
    public static final void m66575c(TextResource title, TextResource textResource, InterfaceC4339a onBack, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(onBack, "onBack");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1694918208);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(title) : c28655q2.m87157i(title) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onBack) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC22953f.m66724m(c2314t)), ((float) 2.5d) * f13, 2 * f13), EnumC22935a1.f90538x);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3388j);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), EnumC39333f.BRAND_WHITE, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC39833e.f171716a);
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C21026a(onBack, 14);
                c28655q2.m87172p0(objM87133R);
            }
            int i15 = i14;
            AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R, c28655q2, C27270o.f109105k, 12);
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifierM3406c, true, 1.0f), 1 * 8, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(title, c28655q2, (i15 & 14) | i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i17).getH4();
            C36775k c36775k = new C36775k(3);
            int i18 = (C2886a.f11498d << 18) | 3120;
            AbstractC30795n.m94707h(strM21274h, modifierM3409f, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 2, false, 2, 0, null, c2886aM8437r, null, c28655q2, 48, i18, 185848);
            C28655q c28655q3 = c28655q2;
            if (textResource == null) {
                c28655q3.m87150e0(1951514284);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(1951514285);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q3, i16), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q3, i17).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q3, i17).getH5(), null, c28655q3, 48, i18, 185848);
                c28655q3 = c28655q3;
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            AbstractC31061c.m95650z(12, f13, c2314t, c28655q3, true);
            c28655q = c28655q3;
            AbstractC17755i2.m50938j(null, EnumC17744g.SOLID, null, null, null, 0L, 0L, null, c28655q, 48, 253);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(title, textResource, onBack, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m66576d(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m66577e(TextResource textResource, TextResource textResource2, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m66575c(textResource, textResource2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
