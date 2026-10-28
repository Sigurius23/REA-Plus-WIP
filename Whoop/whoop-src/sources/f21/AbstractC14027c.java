package f21;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import d62.C11736b;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22994r1;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: f21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001a\u0010\r\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u001a\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lf21/d;", "viewState", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lf21/d;Landroidx/compose/runtime/Composer;II)V", "a", "Lf21/d;", "getPreviewCompactWithIconViewState", "()Lf21/d;", "previewCompactWithIconViewState", "getPreviewCompactNoIconViewState", "previewCompactNoIconViewState", "c", "getPreviewProminentWithIconViewState", "previewProminentWithIconViewState", "d", "getPreviewProminentNoIconViewState", "previewProminentNoIconViewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14027c {

    /* JADX INFO: renamed from: a */
    private static final C14028d f50048a;

    /* JADX INFO: renamed from: b */
    private static final C14028d f50049b;

    /* JADX INFO: renamed from: c */
    private static final C14028d f50050c;

    /* JADX INFO: renamed from: d */
    private static final C14028d f50051d;

    /* JADX INFO: renamed from: f21.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f50052a;

        static {
            int[] iArr = new int[EnumC14025a.values().length];
            try {
                iArr[EnumC14025a.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14025a.PROMINENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50052a = iArr;
        }
    }

    static {
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_INFORMATION;
        Integer numValueOf = Integer.valueOf(enumC16313m0.toWhoopIcon());
        EnumC14025a enumC14025a = EnumC14025a.COMPACT;
        f50048a = new C14028d("callout-1", numValueOf, "This is a sample callout with enough text to demonstrate the two-line maximum constraint and ellipsis truncation behavior.", enumC14025a);
        f50049b = new C14028d("callout-2", null, "This is a sample callout with enough text to demonstrate the two-line maximum constraint and ellipsis truncation behavior.", enumC14025a);
        Integer numValueOf2 = Integer.valueOf(enumC16313m0.toWhoopIcon());
        EnumC14025a enumC14025a2 = EnumC14025a.PROMINENT;
        f50050c = new C14028d("callout-3", numValueOf2, "This is a sample callout with enough text to demonstrate the two-line maximum constraint and ellipsis truncation behavior.", enumC14025a2);
        f50051d = new C14028d("callout-4", null, "This is a sample callout with enough text to demonstrate the two-line maximum constraint and ellipsis truncation behavior.", enumC14025a2);
    }

    /* JADX INFO: renamed from: b */
    public static final void m39918b(Modifier modifier, C14028d viewState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C2314t c2314t;
        C23285v0 style;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-145080677);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            if (i16 != 0) {
                c2314t = c2314t2;
                modifier2 = c2314t;
            } else {
                c2314t = c2314t2;
            }
            C21053l c21053l = C21053l.f79834a;
            int i17 = a.f50052a[viewState.getStyle().ordinal()];
            if (i17 == 1) {
                c28655q.m87150e0(-1983568416);
                style = C38072d.f163053a.m121952e(c28655q, 6).getB3().getStyle();
                c28655q.m87173q(false);
            } else {
                if (i17 != 2) {
                    throw AbstractC11895b.m32003v(-1983571573, c28655q, false);
                }
                c28655q.m87150e0(-1983565600);
                style = C38072d.f163053a.m121952e(c28655q, 6).getB1().getStyle();
                c28655q.m87173q(false);
            }
            C21054m c21054mM58880a = c21053l.m58880a(style, C38072d.f163053a.m121949b(c28655q, 6).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32764);
            c28655q = c28655q;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(viewState.getStyle().getSpacing()), viewState.getStyle().getVerticalAlignment(), c28655q, 0);
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
            if (viewState.getIcon() != null) {
                c28655q.m87150e0(-1033036844);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(viewState.getIcon().intValue(), c28655q, 0), null, AbstractC15673b0.m44061s(AbstractC1102d.m3419p(viewState.getStyle().getIconSize(), c2314t), AbstractC15673b0.m43972A()), C17919x.f69629f, c28655q, 3120, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1032735741);
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC21048g.m58807M(viewState.getBodyText(), new LayoutWeightElement(1.0f, true), false, c21054mM58880a, null, 2, 0, 2, false, c28655q, 12779520, 340);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(modifier3, i13, viewState, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m39919c(Modifier modifier, C14028d c14028d, int i13, int i14, Composer composer, int i15) {
        m39918b(modifier, c14028d, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
