package lf0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import gb1.AbstractC15693u;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l01.C23045q;
import l72.C23401h;
import l83.C23454a0;
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
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.c1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/d1;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Llf0/d1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llf0/e1;", "style", "Li91/a;", "f", "(Llf0/e1;Landroidx/compose/runtime/Composer;I)Li91/a;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23904c1 {

    /* JADX INFO: renamed from: lf0.c1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94527a;

        static {
            int[] iArr = new int[EnumC23912e1.values().length];
            try {
                iArr[EnumC23912e1.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23912e1.HIGHLIGHTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC23912e1.NO_BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94527a = iArr;
        }
    }

    /* JADX INFO: renamed from: lf0.c1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f94528w = new b();

        /* JADX INFO: renamed from: a */
        public final long m70270a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m70270a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lf0.c1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f94529w = new c();

        /* JADX INFO: renamed from: a */
        public final long m70271a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m70271a((C39336i) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r29v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v9, types: [x81.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public static final void m70266c(Modifier modifier, C23908d1 state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        ?? r14;
        Object obj;
        float f13;
        Modifier modifier4;
        C0209i c0209i;
        C0209i c0209i2;
        C0213j c0213j;
        C0209i c0209i3;
        C2314t c2314t;
        ?? r10;
        long jM95624D;
        C28655q c28655q;
        ?? r15;
        ?? r16;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(851915781);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t2;
            }
            Modifier modifierM52567e = AbstractC18249c.m52567e(AbstractC1102d.m3409f(1.0f, modifier2), m70269f(state.getStyle(), c28655q2, 0), AbstractC33253j.m105489e(12), null, 4, null);
            boolean z4 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && c28655q2.m87157i(state))) | ((i15 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                C23045q c23045q = new C23045q(onViewEvent, state, 11);
                c28655q2.m87172p0(c23045q);
                obj = c23045q;
            }
            obj = objM87133R;
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM52567e, false, null, null, (InterfaceC4339a) obj, 15);
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, modifierM3362g);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i4, c22994r1M66759a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N);
            AbstractC22403o imageUrl = state.getImageUrl();
            EnumC16313m0 leftIcon = state.getLeftIcon();
            if (imageUrl != null) {
                c28655q2.m87150e0(1644512252);
                c0209i2 = c0209i4;
                c2314t = c2314t2;
                c0213j = c0213j2;
                c0209i = c0209i6;
                f13 = f14;
                modifier4 = modifier2;
                c0209i3 = c0209i7;
                r10 = 0;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(imageUrl, null, null, c28655q2, AbstractC22403o.f87638a, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(32, c2314t), AbstractC33253j.m105489e(6)), null, C39102j.f168199a, 0.0f, null, c28655q2, 24624, 104);
                C28655q c28655q3 = c28655q2;
                c28655q3.m87173q(false);
                c28655q = c28655q3;
            } else {
                f13 = f14;
                modifier4 = modifier2;
                c0209i = c0209i6;
                c0209i2 = c0209i4;
                c0213j = c0213j2;
                c0209i3 = c0209i7;
                c2314t = c2314t2;
                r10 = 0;
                r10 = 0;
                if (leftIcon != null) {
                    C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q2, 1644839178, leftIcon, c28655q2, 6);
                    if (state.getStyle() == EnumC23912e1.HIGHLIGHTED || leftIcon == EnumC16313m0.WHOOP_LOGO_CIRCLE) {
                        c28655q2.m87150e0(-224027029);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                    } else {
                        c28655q2.m87150e0(-224025944);
                        jM95624D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                    }
                    AbstractC15005f3.m43108b(c27430eM53378s, null, AbstractC1102d.m3419p(20, c2314t), jM95624D, c28655q2, 432, 0);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                } else {
                    c28655q2.m87150e0(1645209473);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                }
            }
            if ((((double) 1.0f) > 0.0d ? 1 : r10) == 0) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f15 = 1 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), f15, 0.0f, 0.0f, 0.0f, 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, r10);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N2);
            String title = state.getTitle();
            ?? r17 = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a b6 = r17.m121952e(c28655q, i17).getB2();
            long brandWhite = r17.m121949b(c28655q, i17).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            C28655q c28655q4 = c28655q;
            AbstractC30795n.m94707h(title, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q4, 0, i18, 196602);
            ?? r18 = c28655q4;
            if (state.getWarning() == null) {
                r18.m87150e0(978458751);
                r18.m87173q(r10);
                r15 = r18;
            } else {
                r18.m87150e0(978458752);
                AbstractC30795n.m94707h(state.getWarning(), null, r17.m121949b(r18, i17).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r17.m121952e(r18, i17).getB4(), null, r18, 0, i18, 196602);
                ?? r19 = r18;
                r19.m87173q(r10);
                r15 = r19;
            }
            r15.m87173q(true);
            String subtitle = state.getSubtitle();
            if (subtitle == null) {
                r15.m87150e0(1645803835);
                r15.m87173q(r10);
                r16 = r15;
            } else {
                r15.m87150e0(1645803836);
                ?? r29 = r15;
                AbstractC30795n.m94707h(subtitle, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f15, 0.0f, 11), r17.m121949b(r15, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r17.m121952e(r15, i17).getN9(), null, r29, 48, i18, 196600);
                ?? r110 = r29;
                r110.m87173q(r10);
                r16 = r110;
            }
            EnumC16313m0 rightIcon = state.getRightIcon();
            if (rightIcon == null) {
                r16.m87150e0(1646090244);
                r16.m87173q(r10);
            } else {
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(r16, 1646090245, rightIcon, r16, 6), null, AbstractC1102d.m3419p(16, c2314t), r17.m121949b(r16, i17).getWhite70(), r16, 432, 0);
                r16.m87173q(r10);
            }
            r16.m87173q(true);
            modifier3 = modifier4;
            r14 = r16;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            r14 = c28655q2;
        }
        C28677v1 c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 15, (Object) modifier3, (Object) state, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m70267d(Function1 function1, C23908d1 c23908d1) {
        function1.invoke(c23908d1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m70268e(Modifier modifier, C23908d1 c23908d1, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70266c(modifier, c23908d1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final AbstractC18247a m70269f(EnumC23912e1 enumC23912e1, Composer composer, int i13) {
        int i14 = a.f94527a[enumC23912e1.ordinal()];
        C28676v0 c28676v0 = C28635l.f115821a;
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-390426545);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = b.f94528w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC18247a abstractC18247aM52575m = AbstractC18249c.m52575m(p745y81.Function1.m125323a((Function1) objM87133R));
            c28655q.m87173q(false);
            return abstractC18247aM52575m;
        }
        if (i14 == 2) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-390423667);
            c28655q2.m87173q(false);
            return AbstractC18249c.m52570h(AbstractC15693u.m44155b(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1304018857)), new C17919x(AbstractC17918w0.m51515c(1304880095)), new C17919x(AbstractC17918w0.m51515c(1306117814)), new C17919x(AbstractC17918w0.m51515c(1303619776))), null, 0, 316.0f, false, 22, null));
        }
        if (i14 != 3) {
            throw AbstractC11895b.m32003v(-390427697, (C28655q) composer, false);
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-390412141);
        Object objM87133R2 = c28655q3.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = c.f94529w;
            c28655q3.m87172p0(objM87133R2);
        }
        AbstractC18247a abstractC18247aM52575m2 = AbstractC18249c.m52575m(p745y81.Function1.m125323a((Function1) objM87133R2));
        c28655q3.m87173q(false);
        return abstractC18247aM52575m2;
    }
}
