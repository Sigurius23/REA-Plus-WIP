package cw2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2561k6;
import b91.C2886a;
import br2.C3565g;
import c41.C4007d1;
import c93.InterfaceC4339a;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import kd1.C22411w;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: cw2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c\"\u0014\u0010#\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u0014\u0010%\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001c\"\u0014\u0010&\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c\"\u0014\u0010(\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001c¨\u0006)"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcw2/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lcw2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "title", "titleSuffix", "m", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "subtitle", "subtitleSuffix", "Li2/x;", "subtitleColor", "k", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lgz0/m0;", "icon", "tint", "i", "(Lgz0/m0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "ROW_HORIZONTAL_PADDING", "b", "ROW_VERTICAL_PADDING", "c", "ROW_CONTENT_SPACING", "d", "TITLE_SUBTITLE_SPACING", "e", "INLINE_TEXT_SPACING", "ROW_ICON_SIZE", "g", "LIST_TEMPLATE_ITEM_SPACING", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11163d {

    /* JADX INFO: renamed from: a */
    private static final float f35731a;

    /* JADX INFO: renamed from: b */
    private static final float f35732b;

    /* JADX INFO: renamed from: c */
    private static final float f35733c;

    /* JADX INFO: renamed from: d */
    private static final float f35734d;

    /* JADX INFO: renamed from: e */
    private static final float f35735e;

    /* JADX INFO: renamed from: f */
    private static final float f35736f;

    /* JADX INFO: renamed from: g */
    private static final float f35737g;

    static {
        float f13 = 8;
        f35731a = 2 * f13;
        float f14 = ((float) 1.5d) * f13;
        f35732b = f14;
        f35733c = f14;
        f35734d = ((float) 0.25d) * f13;
        f35735e = ((float) 0.5d) * f13;
        float f15 = 4;
        f35736f = 5 * f15;
        f35737g = f15 * f15;
    }

    /* JADX INFO: renamed from: f */
    public static final void m30254f(Modifier modifier, C11164e viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C17919x c17919xM31989h;
        long jM73370c;
        C38072d c38072d;
        C0209i c0209i;
        int i16;
        C17919x c17919xM31989h2;
        long jM73370c2;
        long jM73370c3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1073999517);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i18 = 0;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i17 != 0 ? C2314t.f9131w : modifier2;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            GenericInteraction genericInteractionM30263a = viewState.getGenericInteraction();
            boolean z4 = genericInteractionM30263a != null;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC34132o.m107879c(z4 ? 1.0f : 0.6f, AbstractC1102d.m3409f(1.0f, modifier3)), C22411w.f87680a.m64535a().m64090c());
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, c38072d2.m121949b(c28655q, i19).getWhite10(), AbstractC17918w0.f69621a);
            C18027i c18027i = new C18027i(0);
            boolean zM87157i = ((i15 & 896) == 256) | c28655q.m87157i(genericInteractionM30263a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C11161b(genericInteractionM30263a, onViewEvent, i18);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3360e(modifierM3358c, interfaceC21083i, null, z4, c18027i, (InterfaceC4339a) objM87133R2, 8), f35731a, f35732b);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f35733c), C2299e.f9108K, c28655q, 54);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            EnumC16313m0 enumC16313m0M30264b = viewState.getLeadingIcon();
            C17919x c17919xM31989h3 = null;
            if (enumC16313m0M30264b == null) {
                c28655q.m87150e0(2096555159);
                c28655q.m87173q(false);
                c0209i = c0209i5;
                c38072d = c38072d2;
                i16 = i19;
            } else {
                c28655q.m87150e0(2096555160);
                EnumC39333f enumC39333fM30265c = viewState.getLeadingIconColor();
                if (enumC39333fM30265c == null) {
                    c28655q.m87150e0(704172419);
                    c28655q.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q.m87150e0(-1362758082);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333fM30265c.mo134584toComposableColorWaAFU9c(c28655q, 0));
                }
                if (c17919xM31989h == null) {
                    jM73370c = AbstractC25012a.m73370c(c28655q, -1362756782, c38072d2, c28655q, i19);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1362758921);
                    c28655q.m87173q(false);
                    jM73370c = c17919xM31989h.f69639a;
                }
                c38072d = c38072d2;
                c0209i = c0209i5;
                i16 = i19;
                m30257i(enumC16313m0M30264b, jM73370c, null, c28655q, 0, 4);
                c28655q.m87173q(false);
            }
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f35734d), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
            m30261m(viewState.getTitle(), viewState.getTitleSuffix(), null, c28655q, 0, 4);
            String strM30266e = viewState.getSubtitle();
            String strM30268g = viewState.getSubtitleSuffix();
            EnumC39333f enumC39333fM30267f = viewState.getSubtitleColor();
            if (enumC39333fM30267f == null) {
                c28655q.m87150e0(1442332741);
                c28655q.m87173q(false);
                c17919xM31989h2 = null;
            } else {
                c28655q.m87150e0(1570547516);
                c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, enumC39333fM30267f.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            if (c17919xM31989h2 == null) {
                jM73370c2 = AbstractC25012a.m73370c(c28655q, 1570548816, c38072d, c28655q, i16);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1570546770);
                c28655q.m87173q(false);
                jM73370c2 = c17919xM31989h2.f69639a;
            }
            m30259k(strM30266e, strM30268g, jM73370c2, null, c28655q, 0, 8);
            c28655q = c28655q;
            c28655q.m87173q(true);
            EnumC16313m0 enumC16313m0M30271j = viewState.getTrailingIcon();
            if (enumC16313m0M30271j == null) {
                c28655q.m87150e0(2097353750);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2097353751);
                EnumC39333f enumC39333fM30272k = viewState.getTrailingIconColor();
                if (enumC39333fM30272k == null) {
                    c28655q.m87150e0(959275994);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(169491719);
                    c17919xM31989h3 = AbstractC11895b.m31989h(c28655q, false, enumC39333fM30272k.mo134584toComposableColorWaAFU9c(c28655q, 0));
                }
                C17919x c17919x = c17919xM31989h3;
                if (c17919x == null) {
                    jM73370c3 = AbstractC25012a.m73370c(c28655q, 169493019, c38072d, c28655q, i16);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(169490849);
                    c28655q.m87173q(false);
                    jM73370c3 = c17919x.f69639a;
                }
                m30257i(enumC16313m0M30271j, jM73370c3, null, c28655q, 0, 4);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(modifier2, viewState, onViewEvent, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m30255g(GenericInteraction genericInteraction, Function1 function1) {
        if (genericInteraction != null) {
            function1.invoke(genericInteraction);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m30256h(Modifier modifier, C11164e c11164e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m30254f(modifier, c11164e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    private static final void m30257i(EnumC16313m0 enumC16313m0, long j7, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1096189918);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC16313m0.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f35736f, modifier4), j7, c28655q, ((i15 << 6) & 7168) | 48, 0);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3565g(enumC16313m0, j7, modifier3, i13, i14, 1);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f35736f, modifier4), j7, c28655q, ((i15 << 6) & 7168) | 48, 0);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3565g(enumC16313m0, j7, modifier3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m30258j(EnumC16313m0 enumC16313m0, long j7, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m30257i(enumC16313m0, j7, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x016c  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    private static final void m30259k(String str, String str2, long j7, Modifier modifier, Composer composer, int i13, int i14) {
        String str3;
        int i15;
        String str4;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(184948130);
        if ((i13 & 6) == 0) {
            str3 = str;
            i15 = (c28655q2.m87153g(str3) ? 4 : 2) | i13;
        } else {
            str3 = str;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            str4 = str2;
            i15 |= c28655q2.m87153g(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87151f(j7) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f35735e), C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                int i18 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(str3, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d.m121952e(c28655q2, i17).getB3(), null, c28655q2, i15 & 910, i18 | 3072, 188410);
                AbstractC30795n.m94707h(str4, null, c38072d.m121949b(c28655q2, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q2, i17).getB3(), null, c28655q2, (i15 >> 3) & 14, i18 | 3120, 186362);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                modifier2 = modifier3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11162c(str, str2, j7, modifier2, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f35735e), C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifier3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            int i110 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str3, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q2, i19).getB3(), null, c28655q2, i15 & 910, i110 | 3072, 188410);
            AbstractC30795n.m94707h(str4, null, c38072d2.m121949b(c28655q2, i19).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d2.m121952e(c28655q2, i19).getB3(), null, c28655q2, (i15 >> 3) & 14, i110 | 3120, 186362);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11162c(str, str2, j7, modifier2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m30260l(String str, String str2, long j7, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m30259k(str, str2, j7, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x015f  */
    /* JADX WARN: Code duplicated, block: B:51:0x016a  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    private static final void m30261m(String str, String str2, Modifier modifier, Composer composer, int i13, int i14) {
        String str3;
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1684688607);
        if ((i13 & 6) == 0) {
            str3 = str;
            i15 = (c28655q2.m87153g(str3) ? 4 : 2) | i13;
        } else {
            str3 = str;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f35735e), C2299e.f9109L, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                int i18 = C2886a.f11498d << 18;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(str3, null, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q2, i17).getH4(), null, c28655q2, i15 & 14, i18 | 3120, 186362);
                AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d.m121952e(c28655q2, i17).getB2(), null, c28655q2, (i15 >> 3) & 14, i18 | 3072, 188410);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2561k6(str, str2, modifier3, i13, i14, 1);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f35735e), C2299e.f9109L, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            int i110 = C2886a.f11498d << 18;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94707h(str3, null, c38072d2.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d2.m121952e(c28655q2, i19).getH4(), null, c28655q2, i15 & 14, i110 | 3120, 186362);
            AbstractC30795n.m94707h(str2, null, c38072d2.m121949b(c28655q2, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q2, i19).getB2(), null, c28655q2, (i15 >> 3) & 14, i110 | 3072, 188410);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2561k6(str, str2, modifier3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m30262n(String str, String str2, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m30261m(str, str2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
