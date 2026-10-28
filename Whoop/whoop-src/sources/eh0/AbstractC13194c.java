package eh0;

import a01.C0086f;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33166b0;
import p736sz0.C33169c0;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: eh0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lsz0/c0;", "subtitleMarkdown", "", "Lhy0/h1;", "tags", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13194c {
    /* JADX WARN: Code duplicated, block: B:78:0x0150  */
    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:92:0x0259  */
    /* JADX WARN: Code duplicated, block: B:93:0x0289  */
    /* JADX INFO: renamed from: c */
    public static final void m37098c(Modifier modifier, TextResource title, TextResource subtitle, C33169c0 c33169c0, List<C17750h1> tags, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        C33169c0 c33169c1;
        Modifier modifier3;
        int i16;
        int iHashCode;
        int i17;
        C38072d c38072d;
        int i18;
        int i19;
        int i24;
        C33169c0 c33169c2 = c33169c0;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tags, "tags");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-474008616);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(subtitle) : c28655q.m87157i(subtitle) ? 256 : 128;
        }
        int i26 = i14 & 8;
        if (i26 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q.m87153g(c33169c2) : c28655q.m87157i(c33169c2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(tags) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i25 != 0 ? c2314t : modifier2;
            if (i26 != 0) {
                c33169c2 = null;
            }
            float f13 = 8;
            float f14 = 1 * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier4), f14, 2 * f13);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * f13);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C33169c0 c33169c3 = c33169c2;
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            Modifier modifier5 = modifier4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                i16 = i15;
            } else {
                i16 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 0.5d, f13, c2305k, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(title, c28655q, ((i16 >> 3) & 14) | i17);
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                C2886a c2886aM8417O = c38072d.m121952e(c28655q, i18).getT2();
                long brandWhite = c38072d.m121949b(c28655q, i18).getBrandWhite();
                i19 = C2886a.f11498d << 18;
                i24 = i16;
                AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                if (c33169c3 != null) {
                    c28655q.m87150e0(-658349648);
                    AbstractC33166b0.m105053d(null, c33169c3, 0, 0, 0, c28655q, (C33169c0.f138321k << 3) | ((i24 >> 6) & 112), 29);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-658252773);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(subtitle, c28655q, i17 | ((i24 >> 6) & 14)), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 0, i19, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (tags.isEmpty()) {
                    c28655q.m87150e0(-3113344);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-3406449);
                    C28655q c28655q2 = c28655q;
                    AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(f14), null, 0, 0, AbstractC37817c.m121344e(-1799364318, c28655q, new C13193b(tags, 0)), c28655q2, 1573296, 57);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c33169c1 = c33169c3;
                modifier3 = modifier5;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n((float) 0.5d, f13, c2305k, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            i17 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(title, c28655q, ((i16 >> 3) & 14) | i17);
            c38072d = C38072d.f163053a;
            i18 = C38072d.f163054b;
            C2886a c2886aM8417O2 = c38072d.m121952e(c28655q, i18).getT2();
            long brandWhite2 = c38072d.m121949b(c28655q, i18).getBrandWhite();
            i19 = C2886a.f11498d << 18;
            i24 = i16;
            AbstractC30795n.m94707h(strM21274h2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q, 0, i19, 196602);
            c28655q = c28655q;
            if (c33169c3 != null) {
                c28655q.m87150e0(-658349648);
                AbstractC33166b0.m105053d(null, c33169c3, 0, 0, 0, c28655q, (C33169c0.f138321k << 3) | ((i24 >> 6) & 112), 29);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-658252773);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(subtitle, c28655q, i17 | ((i24 >> 6) & 14)), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (tags.isEmpty()) {
                c28655q.m87150e0(-3406449);
                C28655q c28655q3 = c28655q;
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(f14), null, 0, 0, AbstractC37817c.m121344e(-1799364318, c28655q, new C13193b(tags, 0)), c28655q3, 1573296, 57);
                c28655q = c28655q3;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-3113344);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c33169c1 = c33169c3;
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            c33169c1 = c33169c2;
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(modifier3, title, subtitle, c33169c1, tags, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m37099d(List list, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC17746g1.m50872h((C17750h1) it.next(), null, null, c28655q, C17750h1.f69012w, 6);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m37100e(Modifier modifier, TextResource textResource, TextResource textResource2, C33169c0 c33169c0, List list, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m37098c(modifier, textResource, textResource2, c33169c0, list, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
