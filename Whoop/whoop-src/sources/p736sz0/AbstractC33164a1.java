package p736sz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b91.C2886a;
import bm2.C3427b0;
import dp0.C12246b;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j50.C21330b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import s01.C32049e;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sz0.a1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m65681d2 = {"Lsz0/b1;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "n", "(Lsz0/b1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "title", "Lgz0/m0;", "leadingIcon", "trailingIcon", "f", "(Ljava/lang/String;Lgz0/m0;Lgz0/m0;Landroidx/compose/runtime/Composer;I)V", "icon", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V", "", NotificationCompat.CATEGORY_PROGRESS, "l", "(FLandroidx/compose/runtime/Composer;I)V", "leadingSubtext", "trailingSubtext", "j", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "a", "Lsz0/b1;", "previewViewState", "animatedProgress", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33164a1 {

    /* JADX INFO: renamed from: a */
    private static final C33167b1 f138301a = new C33167b1("SPEND $26 MORE TO GET FREE SHIPPING", 0.65f, "$0", "$75", EnumC16313m0.NEW_ARRIVALS, null, false, 96, null);

    /* JADX INFO: renamed from: f */
    private static final void m105032f(String str, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, Composer composer, int i13) {
        String str2;
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-625019260);
        if ((i13 & 6) == 0) {
            str2 = str;
            i14 = (c28655q2.m87153g(str2) ? 4 : 2) | i13;
        } else {
            str2 = str;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87149e(enumC16313m1 != null ? enumC16313m1.ordinal() : -1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, enumC16313m0 != null ? C2299e.f9108K : C2299e.f9109L, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (enumC16313m0 == null) {
                c28655q2.m87150e0(-810980795);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-810980794);
                m105034h(enumC16313m0, c28655q2, 0);
                AbstractC18489d0.m53381v(8, 1.5f, c2314t, c28655q2, false);
            }
            C38072d c38072d = C38072d.f163053a;
            C2886a c2886aM8414L = c38072d.m121952e(c28655q2, 6).getSh4();
            long jM125377a = c38072d.m121949b(c28655q2, 6).getAccentAction();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(str2, new LayoutWeightElement(1.0f, true), jM125377a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q2, i14 & 14, 0, 196600);
            c28655q = c28655q2;
            if (enumC16313m1 == null) {
                c28655q.m87150e0(-810649405);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-810649404);
                m105034h(enumC16313m1, c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(str, enumC16313m0, enumC16313m1, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m105033g(String str, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, int i13, Composer composer, int i14) {
        m105032f(str, enumC16313m0, enumC16313m1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m105034h(EnumC16313m0 enumC16313m0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1715014242);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC16313m0.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC23164r1.m67132a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(6 * 4, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21330b(enumC16313m0, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m105035i(EnumC16313m0 enumC16313m0, int i13, Composer composer, int i14) {
        m105034h(enumC16313m0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m105036j(String str, String str2, Composer composer, int i13) {
        int i14;
        String str3;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1007697634);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            C2886a c2886aM8408F = c38072d.m121952e(c28655q2, 6).getN9();
            long jM125385c1 = c38072d.m121949b(c28655q2, 6).getWhite70();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(str, new LayoutWeightElement(1.0f, true), jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8408F, null, c28655q2, i15 & 14, 0, 196600);
            str3 = str2;
            AbstractC30795n.m94707h(str3, null, c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN9(), null, c28655q2, (i15 >> 3) & 14, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            str3 = str2;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3427b0(str, str3, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m105037k(String str, String str2, int i13, Composer composer, int i14) {
        m105036j(str, str2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m105038l(float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1478161501);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f14 = 4;
            float f15 = 2 * f14;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(1 * f14, AbstractC1102d.m3409f(1.0f, c2314t)), AbstractC33253j.m105489e(f15));
            C38072d c38072d = C38072d.f163053a;
            long jM51541c = C17919x.m51541c(0.25f, c38072d.m121949b(c28655q, 6).getAccentAction());
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, jM51541c, c17916v0);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(f13, AbstractC1102d.m3406c(1.0f, c2314t)), AbstractC33253j.m105489e(f15)), c38072d.m121949b(c28655q, 6).getAccentAction(), c17916v0), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12246b(f13, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m105039m(float f13, int i13, Composer composer, int i14) {
        m105038l(f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m105040n(C33167b1 viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1746200022);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(AbstractC12889b.m36283m(viewState.getProgressPercentage(), 0.0f, 1.0f), null, "shipping-progress-bar", null, c28655q, 3072, 22);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8 * 0.75f), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m105032f(viewState.getTitleDisplay(), viewState.getLeadingIcon(), viewState.getIcon(), c28655q, 0);
            if (viewState.getHideProgressBar()) {
                c28655q.m87150e0(-164212446);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-164275872);
                m105038l(m105041o(interfaceC28670t2M30588b), c28655q, 0);
                c28655q.m87173q(false);
            }
            if (AbstractC39414r.m125890i0(viewState.getLeadingSubtext()) && AbstractC39414r.m125890i0(viewState.getTrailingSubtext())) {
                c28655q.m87150e0(-163945598);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-164112812);
                m105036j(viewState.getLeadingSubtext(), viewState.getTrailingSubtext(), c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33235z0(viewState, modifier2, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: o */
    private static final float m105041o(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m105042p(C33167b1 c33167b1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m105040n(c33167b1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
