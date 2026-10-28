package bm2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i91.AbstractC18249c;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import p91.AbstractC29011e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: bm2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016\"\u0016\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016\"\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016\"\u0017\u0010#\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lbm2/h0;", "viewState", "Ll83/a0;", "e", "(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V", "i", "g", "", "score", "k", "(ILandroidx/compose/runtime/Composer;I)V", "m", "(Lbm2/h0;)V", "Lbm2/m1;", "style", "", "alpha", "Ly81/e;", "n", "(Lbm2/m1;F)Ly81/e;", "Ly3/f;", "a", "F", "topIndicatorIconOffsetY", "b", "topIndicatorTextOffsetY", "c", "topIndicatorIconOffsetX", "d", "topIndicatorTextOffsetX", "topIndicatorXPercent", "f", "Lbm2/h0;", "getDemoMeterViewState", "()Lbm2/h0;", "demoMeterViewState", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3447i {

    /* JADX INFO: renamed from: c */
    private static final float f13509c;

    /* JADX INFO: renamed from: d */
    private static float f13510d;

    /* JADX INFO: renamed from: e */
    private static float f13511e;

    /* JADX INFO: renamed from: a */
    private static final float f13507a = -12;

    /* JADX INFO: renamed from: b */
    private static final float f13508b = -32;

    /* JADX INFO: renamed from: f */
    private static final C3445h0 f13512f = new C3445h0(100, AbstractC37056f.m118959K(new C3473s0(EnumC3461m1.VO2_MAX_1, 0.38f, 15, 34, AbstractC8693b.m21278l("15")), new C3473s0(EnumC3461m1.VO2_MAX_2, 0.18f, 35, 39, AbstractC8693b.m21278l("35")), new C3473s0(EnumC3461m1.VO2_MAX_3, 0.18f, 40, 44, AbstractC8693b.m21278l("40")), new C3473s0(EnumC3461m1.VO2_MAX_4, 0.18f, 45, 49, AbstractC8693b.m21278l("45")), new C3473s0(EnumC3461m1.VO2_MAX_5, 0.08f, 50, 55, AbstractC8693b.m21278l("50+"))));

    /* JADX INFO: renamed from: bm2.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13513a;

        static {
            int[] iArr = new int[EnumC3461m1.values().length];
            try {
                iArr[EnumC3461m1.VO2_MAX_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3461m1.VO2_MAX_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3461m1.VO2_MAX_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3461m1.VO2_MAX_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3461m1.VO2_MAX_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13513a = iArr;
        }
    }

    /* JADX INFO: renamed from: bm2.i$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f13514w;

        public b(float f13) {
            this.f13514w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m10081a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f13514w, whoopColor.getGreyL1());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10081a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f13515w;

        public c(float f13) {
            this.f13515w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m10082a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f13515w, whoopColor.getStrainZone1());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10082a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f13516w;

        public d(float f13) {
            this.f13516w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m10083a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f13516w, whoopColor.getRecovery());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10083a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.i$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f13517w;

        public e(float f13) {
            this.f13517w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m10084a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f13517w, whoopColor.getSleepLightSleep());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10084a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.i$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f13518w;

        public f(float f13) {
            this.f13518w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m10085a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f13518w, whoopColor.getSleepRemSleep());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10085a((C39336i) obj));
        }
    }

    static {
        float f13 = -8;
        f13509c = f13;
        f13510d = f13;
    }

    /* JADX INFO: renamed from: e */
    public static final void m10070e(C3445h0 viewState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1178508959);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(3 * f13, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 2 * f13, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM124374d = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM124374d);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            int i15 = i14 & 14;
            m10074i(viewState, c28655q, i15);
            Integer numM10064a = viewState.getScore();
            if (numM10064a == null) {
                c28655q.m87150e0(2027095675);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2027095676);
                int iIntValue = numM10064a.intValue();
                m10078m(viewState);
                m10076k(iIntValue, c28655q, 0);
                c28655q.m87173q(false);
            }
            m10072g(viewState, c28655q, i15);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3441g(viewState, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m10071f(C3445h0 c3445h0, int i13, Composer composer, int i14) {
        m10070e(c3445h0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: g */
    public static final void m10072g(C3445h0 viewState, Composer composer, int i13) {
        C28655q c28655q;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(370489224);
        int i14 = 2;
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(viewState) ? 4 : 2) : i13;
        boolean z13 = false;
        boolean z14 = 1;
        if (c28655q2.m87135U(i15 & 1, (i15 & 3) != 2)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            float f14 = 0.0f;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, 0.0f, f13, 1)), AbstractC33253j.m105491g(0.0f, 0.0f, f13, f13, 3));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM118994r);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
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
            c28655q2.m87150e0(1112161537);
            int i16 = 0;
            for (Object obj : viewState.m10065b()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C3473s0 c3473s0 = (C3473s0) obj;
                float fM10217e = c3473s0.getWidthPercent();
                if (fM10217e <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (fM10217e > Float.MAX_VALUE) {
                    fM10217e = Float.MAX_VALUE;
                }
                Modifier modifierM52565c = AbstractC18249c.m52565c(new LayoutWeightElement(fM10217e, z14), AbstractC18249c.m52575m(m10079n(c3473s0.getStyle(), 0.4f)));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z13);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM52565c);
                InterfaceC0221l.f734a.getClass();
                InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                float f15 = 8;
                float f16 = (float) z14;
                C2314t c2314t2 = c2314t;
                int i18 = i16;
                int i19 = i14;
                float f17 = f14;
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3473s0.getDisplayValue(), c28655q2, TextResource.$stable), AbstractC1099a.m3398t(AbstractC1102d.m3411h(i14 * f15, c2314t), f16 * f15, 0.0f, 0.0f, 0.0f, 14), m10080o(c3473s0.getStyle(), f14, i14, null).mo134584toComposableColorWaAFU9c(c28655q2, 0), AbstractC31061c.m95626b(C39183o.m124805c(AbstractC35745c.m113246h(11)), 4294967296L, (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)), null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN9(), null, c28655q3, 48, C2886a.f11498d << 18, 196080);
                c28655q3.m87173q(true);
                if (i18 < viewState.m10065b().size() - 1) {
                    c28655q3.m87150e0(620634516);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3424u(f16, c2314t2));
                    z4 = false;
                    c28655q3.m87173q(false);
                } else {
                    z4 = false;
                    c28655q3.m87150e0(620702747);
                    c28655q3.m87173q(false);
                }
                z14 = 1;
                c2314t = c2314t2;
                c28655q2 = c28655q3;
                z13 = z4;
                i16 = i17;
                i14 = i19;
                f14 = f17;
            }
            C28655q c28655q4 = c28655q2;
            c28655q4.m87173q(z13);
            c28655q4.m87173q(z14);
            c28655q = c28655q4;
        } else {
            C28655q c28655q5 = c28655q2;
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3441g(viewState, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m10073h(C3445h0 c3445h0, int i13, Composer composer, int i14) {
        m10072g(c3445h0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m10074i(C3445h0 viewState, Composer composer, int i13) {
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(780548276);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105491g(f13, f13, 0.0f, 0.0f, 12));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
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
            c28655q.m87150e0(-1850696954);
            int i15 = 0;
            for (Object obj : viewState.m10065b()) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C3473s0 c3473s0 = (C3473s0) obj;
                float fM10217e = c3473s0.getWidthPercent();
                C2314t c2314t2 = c2314t;
                if (fM10217e <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (fM10217e > Float.MAX_VALUE) {
                    fM10217e = Float.MAX_VALUE;
                }
                AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3411h(f13, new LayoutWeightElement(fM10217e, true)), AbstractC18249c.m52575m(m10080o(c3473s0.getStyle(), 0.0f, 2, null))), c28655q, 0);
                if (i15 < viewState.m10065b().size() - 1) {
                    c28655q.m87150e0(1284228134);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(1, c2314t2));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1284296365);
                    c28655q.m87173q(false);
                }
                i15 = i16;
                c2314t = c2314t2;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3441g(viewState, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m10075j(C3445h0 c3445h0, int i13, Composer composer, int i14) {
        m10074i(c3445h0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m10076k(int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-592326122);
        if ((i14 & 6) == 0) {
            i15 = i14 | (c28655q.m87149e(i13) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            float f13 = f13511e;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3391m = AbstractC1099a.m3391m(AbstractC29011e.m88150k(c2314t, f13, 0.0f, null, 4, null), f13510d, f13508b);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3391m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            String strM21275i = AbstractC8693b.m21275i(String.valueOf(i13), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21275i, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), AbstractC31061c.m95626b(C39183o.m124805c(AbstractC35745c.m113246h(17)), 4294967296L, (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getN6(), null, c28655q, 0, C2886a.f11498d << 18, 196594);
            c28655q = c28655q;
            c28655q.m87173q(true);
            Modifier modifierM3419p = AbstractC1102d.m3419p(16, AbstractC1099a.m3391m(AbstractC29011e.m88150k(c2314t, f13511e, 0.0f, null, 4, null), f13509c, f13507a));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3419p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getHealth().getPicker(), c28655q, 6), null, null, C17919x.f69637n, c28655q, 3120, 4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3444h(i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m10077l(int i13, int i14, Composer composer, int i15) {
        m10076k(i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m10078m(C3445h0 viewState) {
        float fM10217e;
        float f13;
        AbstractC22676k.m65750j(viewState, "viewState");
        Integer numM10064a = viewState.getScore();
        if (numM10064a != null) {
            int iIntValue = numM10064a.intValue();
            if (iIntValue > 99) {
                f13510d = -14;
            }
            int i13 = 0;
            float fM10217e2 = 0.0f;
            for (Object obj : viewState.m10065b()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C3473s0 c3473s0 = (C3473s0) obj;
                int iM10214b = c3473s0.getLowerBound();
                if (iIntValue <= c3473s0.getUpperBound() && iM10214b <= iIntValue) {
                    int iM10216d = c3473s0.getUpperBound() - c3473s0.getLowerBound();
                    int iM10214b2 = iIntValue - c3473s0.getLowerBound();
                    float fM10217e3 = c3473s0.getWidthPercent() / iM10216d;
                    float f14 = (iM10216d - iM10214b2) * fM10217e3;
                    if (f14 == 0.0f) {
                        f14 = fM10217e3 / 2;
                    }
                    if (iIntValue == c3473s0.getLowerBound()) {
                        f14 = 0.0f;
                    }
                    if (fM10217e2 > 0.0f) {
                        if (iIntValue == c3473s0.getLowerBound()) {
                            f13 = fM10217e2 - f14;
                        } else {
                            fM10217e = (iIntValue == c3473s0.getUpperBound() ? c3473s0.getWidthPercent() : c3473s0.getWidthPercent()) + fM10217e2;
                            f13 = fM10217e - f14;
                        }
                    } else if (iIntValue == c3473s0.getLowerBound()) {
                        f13 = 0.0f;
                    } else {
                        fM10217e = c3473s0.getWidthPercent();
                        f13 = fM10217e - f14;
                    }
                    f13511e = f13;
                }
                fM10217e2 += c3473s0.getWidthPercent();
                if (iIntValue >= c3473s0.getUpperBound() && f13511e == 0.0f) {
                    f13511e = 1.0f;
                }
                i13 = i14;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC39332e m10079n(EnumC3461m1 style, float f13) {
        AbstractC22676k.m65750j(style, "style");
        int i13 = a.f13513a[style.ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(new b(f13));
        }
        if (i13 == 2) {
            return p745y81.Function1.m125323a(new c(f13));
        }
        if (i13 == 3) {
            return p745y81.Function1.m125323a(new d(f13));
        }
        if (i13 == 4) {
            return p745y81.Function1.m125323a(new e(f13));
        }
        if (i13 == 5) {
            return p745y81.Function1.m125323a(new f(f13));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ InterfaceC39332e m10080o(EnumC3461m1 enumC3461m1, float f13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 1.0f;
        }
        return m10079n(enumC3461m1, f13);
    }
}
