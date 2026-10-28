package v31;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bm2.C3444h;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import id2.C18432q;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import lz0.AbstractC24821f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import uf0.C34904e;
import v01.C35509k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: v31.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lv31/g;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Landroidx/compose/ui/Modifier;Lv31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "totalCount", "filledCount", "i", "(IILandroidx/compose/runtime/Composer;I)V", "filledPercentage", "g", "(ILandroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35610f {

    /* JADX INFO: renamed from: v31.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f151390a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f151391b;

        static {
            int[] iArr = new int[EnumC35612h.values().length];
            try {
                iArr[EnumC35612h.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35612h.ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f151390a = iArr;
            int[] iArr2 = new int[EnumC35606b.values().length];
            try {
                iArr2[EnumC35606b.DISCRETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC35606b.CONTINUOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f151391b = iArr2;
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m112810g(int i13, Composer composer, int i14) {
        int i15;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(930229698);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            i16 = i13;
            AbstractC24821f.m72736b(null, i16, 100, C17909s.m51483a(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, 6).getAccentOnboardingAction()), new C17919x(c38072d.m121949b(c28655q, 6).getAccentOnboardingAction())), 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, 6).getWhite20(), false, 1 * 4, c28655q, ((i15 << 3) & 112) | 1769856, 1);
        } else {
            i16 = i13;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3444h(i16, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m112811h(int i13, int i14, Composer composer, int i15) {
        m112810g(i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m112812i(final int i13, final int i14, Composer composer, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-357752511);
        if ((i15 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, false, AbstractC37817c.m121344e(657258411, c28655q, new Function3() { // from class: v31.e
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC35610f.m112813j(i13, i14, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 3078, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18432q(i13, i14, i15, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m112813j(int i13, int i14, InterfaceC23004v BoxWithConstraints, Composer composer, int i15) {
        long jM53363d;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i15 & 6) == 0) {
            i15 |= ((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            int i16 = i13 > 7 ? i13 : 7;
            float f13 = 1 * 4;
            float fM3403d = (((C1101c) BoxWithConstraints).m3403d() - ((i16 - 1) * f13)) / i16;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, c28655q, 6);
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
            c28655q.m87150e0(2028442127);
            for (int i17 = 0; i17 < i13; i17++) {
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f13, AbstractC1102d.m3424u(fM3403d, c2314t)), AbstractC33253j.m105489e(f13));
                if (i17 < i14) {
                    c28655q.m87150e0(145180323);
                    jM53363d = C38072d.f163053a.m121949b(c28655q, 6).getAccentOnboardingAction();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(145288978);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, 6, false);
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM118994r, jM53363d, AbstractC17918w0.f69621a), c28655q, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m112814k(int i13, int i14, int i15, Composer composer, int i16) {
        m112812i(i13, i14, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:115:0x0302  */
    /* JADX WARN: Code duplicated, block: B:118:0x030d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0312  */
    /* JADX WARN: Code duplicated, block: B:123:0x0324  */
    /* JADX WARN: Code duplicated, block: B:126:0x032f  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:69:0x016a  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0189  */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    /* JADX WARN: Code duplicated, block: B:82:0x021e  */
    /* JADX WARN: Code duplicated, block: B:84:0x022d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0247  */
    /* JADX WARN: Code duplicated, block: B:87:0x0249  */
    /* JADX WARN: Code duplicated, block: B:90:0x0250  */
    /* JADX WARN: Code duplicated, block: B:92:0x0254  */
    /* JADX WARN: Code duplicated, block: B:96:0x0297  */
    /* JADX WARN: Code duplicated, block: B:97:0x029c  */
    /* JADX WARN: Code duplicated, block: B:99:0x029f  */
    /* JADX INFO: renamed from: l */
    public static final void m112815l(Modifier modifier, C35611g viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        float f13;
        float f14;
        int i16;
        long jM125416r;
        float f15;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier5;
        int iHashCode2;
        int i17;
        C38072d c38072d;
        Function1 function5;
        EnumC16313m0 enumC16313m0M112821c;
        float f16;
        C2314t c2314t2;
        boolean z13;
        Object objM87133R;
        C35605a c35605aM112822e;
        EnumC35606b enumC35606bM112800d;
        int i18;
        Integer numM112799c;
        int iIntValue;
        Integer numM112798b;
        int iIntValue2;
        Float fM112797a;
        float fFloatValue;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1567917923);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35509k(3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                f13 = 3;
                f14 = 4;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), f13, f14);
                i16 = a.f151390a[viewState.getStyle().ordinal()];
                if (i16 != 1) {
                    c28655q.m87150e0(-764384150);
                    jM125416r = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
                    c28655q.m87173q(false);
                } else {
                    if (i16 == 2) {
                        throw AbstractC11895b.m32003v(-764387034, c28655q, false);
                    }
                    c28655q.m87150e0(-764382092);
                    c28655q.m87173q(false);
                    jM125416r = AbstractC17918w0.m51515c(650858200);
                }
                f15 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f15, AbstractC1092a.m3358c(modifierM53364e, jM125416r, AbstractC17918w0.f69621a));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier5 = modifier4;
                } else {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    i17 = i15;
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, 0);
                    c38072d = C38072d.f163053a;
                    function5 = function4;
                    AbstractC30795n.m94707h(strM21274h, layoutWeightElement, c38072d.m121949b(c28655q, 6).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    enumC16313m0M112821c = viewState.getCloseIcon();
                    if (enumC16313m0M112821c == null) {
                        c28655q.m87150e0(1168899427);
                        c28655q.m87173q(false);
                        f16 = f15;
                        c2314t2 = c2314t;
                    } else {
                        f16 = f15;
                        c2314t2 = c2314t;
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1168899428, f13, f16, c2314t2));
                        Modifier modifierM3419p = AbstractC1102d.m3419p(f14 * f14, c2314t2);
                        if ((i17 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13 || objM87133R == c28676v0) {
                            objM87133R = new C34904e(function5, 10);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M112821c.toWhoopIcon(), c28655q, 6), AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0), AbstractC1092a.m3362g(modifierM3419p, false, null, null, (InterfaceC4339a) objM87133R, 15), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c35605aM112822e = viewState.getProgressBar();
                    if (c35605aM112822e != null) {
                        enumC35606bM112800d = c35605aM112822e.getType();
                    } else {
                        enumC35606bM112800d = null;
                    }
                    if (enumC35606bM112800d == null) {
                        c28655q.m87150e0(1650457174);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1650457175);
                        AbstractC18489d0.m53380u(1, f16, c2314t2, c28655q);
                        i18 = a.f151391b[enumC35606bM112800d.ordinal()];
                        if (i18 != 1) {
                            c28655q.m87150e0(527230321);
                            numM112799c = viewState.getProgressBar().getDiscreteStepTotal();
                            if (numM112799c != null) {
                                iIntValue = numM112799c.intValue();
                            } else {
                                iIntValue = 1;
                            }
                            numM112798b = viewState.getProgressBar().getDiscreteFilledTotal();
                            if (numM112798b != null) {
                                iIntValue2 = numM112798b.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            m112812i(iIntValue, iIntValue2, c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (i18 == 2) {
                                throw AbstractC11895b.m32003v(-675730749, c28655q, false);
                            }
                            c28655q.m87150e0(527513413);
                            fM112797a = viewState.getProgressBar().getContinuousProgress();
                            if (fM112797a != null) {
                                fFloatValue = fM112797a.floatValue();
                            } else {
                                fFloatValue = 0.0f;
                            }
                            m112810g((int) (fFloatValue * 100), c28655q, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                i17 = i15;
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, 0);
                c38072d = C38072d.f163053a;
                function5 = function4;
                AbstractC30795n.m94707h(strM21274h2, layoutWeightElement2, c38072d.m121949b(c28655q, 6).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                enumC16313m0M112821c = viewState.getCloseIcon();
                if (enumC16313m0M112821c == null) {
                    c28655q.m87150e0(1168899427);
                    c28655q.m87173q(false);
                    f16 = f15;
                    c2314t2 = c2314t;
                } else {
                    f16 = f15;
                    c2314t2 = c2314t;
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1168899428, f13, f16, c2314t2));
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(f14 * f14, c2314t2);
                    if ((i17 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C34904e(function5, 10);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C34904e(function5, 10);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M112821c.toWhoopIcon(), c28655q, 6), AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0), AbstractC1092a.m3362g(modifierM3419p2, false, null, null, (InterfaceC4339a) objM87133R, 15), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c35605aM112822e = viewState.getProgressBar();
                if (c35605aM112822e != null) {
                    enumC35606bM112800d = c35605aM112822e.getType();
                } else {
                    enumC35606bM112800d = null;
                }
                if (enumC35606bM112800d == null) {
                    c28655q.m87150e0(1650457174);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1650457175);
                    AbstractC18489d0.m53380u(1, f16, c2314t2, c28655q);
                    i18 = a.f151391b[enumC35606bM112800d.ordinal()];
                    if (i18 != 1) {
                        c28655q.m87150e0(527230321);
                        numM112799c = viewState.getProgressBar().getDiscreteStepTotal();
                        if (numM112799c != null) {
                            iIntValue = numM112799c.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        numM112798b = viewState.getProgressBar().getDiscreteFilledTotal();
                        if (numM112798b != null) {
                            iIntValue2 = numM112798b.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        m112812i(iIntValue, iIntValue2, c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i18 == 2) {
                            throw AbstractC11895b.m32003v(-675730749, c28655q, false);
                        }
                        c28655q.m87150e0(527513413);
                        fM112797a = viewState.getProgressBar().getContinuousProgress();
                        if (fM112797a != null) {
                            fFloatValue = fM112797a.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        m112810g((int) (fFloatValue * 100), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(modifier3, viewState, function3, i13, i14, 0);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35509k(3);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            f13 = 3;
            f14 = 4;
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), f13, f14);
            i16 = a.f151390a[viewState.getStyle().ordinal()];
            if (i16 != 1) {
                c28655q.m87150e0(-764384150);
                jM125416r = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
                c28655q.m87173q(false);
            } else {
                if (i16 == 2) {
                    throw AbstractC11895b.m32003v(-764387034, c28655q, false);
                }
                c28655q.m87150e0(-764382092);
                c28655q.m87173q(false);
                jM125416r = AbstractC17918w0.m51515c(650858200);
            }
            f15 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f15, AbstractC1092a.m3358c(modifierM53364e2, jM125416r, AbstractC17918w0.f69621a));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier5 = modifier4;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                i17 = i15;
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                String strM21274h3 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, 0);
                c38072d = C38072d.f163053a;
                function5 = function4;
                AbstractC30795n.m94707h(strM21274h3, layoutWeightElement3, c38072d.m121949b(c28655q, 6).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                enumC16313m0M112821c = viewState.getCloseIcon();
                if (enumC16313m0M112821c == null) {
                    c28655q.m87150e0(1168899427);
                    c28655q.m87173q(false);
                    f16 = f15;
                    c2314t2 = c2314t;
                } else {
                    f16 = f15;
                    c2314t2 = c2314t;
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1168899428, f13, f16, c2314t2));
                    Modifier modifierM3419p3 = AbstractC1102d.m3419p(f14 * f14, c2314t2);
                    if ((i17 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C34904e(function5, 10);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C34904e(function5, 10);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M112821c.toWhoopIcon(), c28655q, 6), AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0), AbstractC1092a.m3362g(modifierM3419p3, false, null, null, (InterfaceC4339a) objM87133R, 15), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c35605aM112822e = viewState.getProgressBar();
                if (c35605aM112822e != null) {
                    enumC35606bM112800d = c35605aM112822e.getType();
                } else {
                    enumC35606bM112800d = null;
                }
                if (enumC35606bM112800d == null) {
                    c28655q.m87150e0(1650457174);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1650457175);
                    AbstractC18489d0.m53380u(1, f16, c2314t2, c28655q);
                    i18 = a.f151391b[enumC35606bM112800d.ordinal()];
                    if (i18 != 1) {
                        c28655q.m87150e0(527230321);
                        numM112799c = viewState.getProgressBar().getDiscreteStepTotal();
                        if (numM112799c != null) {
                            iIntValue = numM112799c.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        numM112798b = viewState.getProgressBar().getDiscreteFilledTotal();
                        if (numM112798b != null) {
                            iIntValue2 = numM112798b.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        m112812i(iIntValue, iIntValue2, c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i18 == 2) {
                            throw AbstractC11895b.m32003v(-675730749, c28655q, false);
                        }
                        c28655q.m87150e0(527513413);
                        fM112797a = viewState.getProgressBar().getContinuousProgress();
                        if (fM112797a != null) {
                            fFloatValue = fM112797a.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        m112810g((int) (fFloatValue * 100), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier5;
            } else {
                modifier5 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            i17 = i15;
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
            String strM21274h4 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, 0);
            c38072d = C38072d.f163053a;
            function5 = function4;
            AbstractC30795n.m94707h(strM21274h4, layoutWeightElement4, c38072d.m121949b(c28655q, 6).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
            c28655q = c28655q;
            enumC16313m0M112821c = viewState.getCloseIcon();
            if (enumC16313m0M112821c == null) {
                c28655q.m87150e0(1168899427);
                c28655q.m87173q(false);
                f16 = f15;
                c2314t2 = c2314t;
            } else {
                f16 = f15;
                c2314t2 = c2314t;
                AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1168899428, f13, f16, c2314t2));
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(f14 * f14, c2314t2);
                if ((i17 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C34904e(function5, 10);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C34904e(function5, 10);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M112821c.toWhoopIcon(), c28655q, 6), AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0), AbstractC1092a.m3362g(modifierM3419p4, false, null, null, (InterfaceC4339a) objM87133R, 15), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c35605aM112822e = viewState.getProgressBar();
            if (c35605aM112822e != null) {
                enumC35606bM112800d = c35605aM112822e.getType();
            } else {
                enumC35606bM112800d = null;
            }
            if (enumC35606bM112800d == null) {
                c28655q.m87150e0(1650457174);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1650457175);
                AbstractC18489d0.m53380u(1, f16, c2314t2, c28655q);
                i18 = a.f151391b[enumC35606bM112800d.ordinal()];
                if (i18 != 1) {
                    c28655q.m87150e0(527230321);
                    numM112799c = viewState.getProgressBar().getDiscreteStepTotal();
                    if (numM112799c != null) {
                        iIntValue = numM112799c.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    numM112798b = viewState.getProgressBar().getDiscreteFilledTotal();
                    if (numM112798b != null) {
                        iIntValue2 = numM112798b.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    m112812i(iIntValue, iIntValue2, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (i18 == 2) {
                        throw AbstractC11895b.m32003v(-675730749, c28655q, false);
                    }
                    c28655q.m87150e0(527513413);
                    fM112797a = viewState.getProgressBar().getContinuousProgress();
                    if (fM112797a != null) {
                        fFloatValue = fM112797a.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    m112810g((int) (fFloatValue * 100), c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier3, viewState, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m112816m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m112817n(Function1 function1) {
        C23454a0 c23454a0 = C23454a0.f92919a;
        function1.invoke(c23454a0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m112818o(Modifier modifier, C35611g c35611g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m112815l(modifier, c35611g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
