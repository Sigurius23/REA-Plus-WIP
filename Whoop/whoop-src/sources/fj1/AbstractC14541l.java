package fj1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ej1.C13242h;
import f02.C13917c;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.util.List;
import l83.C23454a0;
import lz0.AbstractC24818c;
import lz0.C24816a;
import lz0.C24817b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p133f1.C13989w1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import s21.EnumC32086i;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: fj1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lfj1/m;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Lfj1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly81/f;", "color", "e", "(Landroidx/compose/ui/Modifier;Ly81/f;Landroidx/compose/runtime/Composer;II)V", "a", "Lfj1/m;", "getFakePregnancyCardState", "()Lfj1/m;", "fakePregnancyCardState", "", "b", "Ljava/util/List;", "getPostpartumStates", "()Ljava/util/List;", "postpartumStates", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14541l {

    /* JADX INFO: renamed from: a */
    private static final C14542m f53161a;

    /* JADX INFO: renamed from: b */
    private static final List<C14542m> f53162b;

    /* JADX INFO: renamed from: fj1.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f53163a;

        static {
            int[] iArr = new int[EnumC32086i.values().length];
            try {
                iArr[EnumC32086i.STEP_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32086i.PROGRESS_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53163a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Pregnancy Insights");
        EnumC16313m0 enumC16313m0 = EnumC16313m0.CARET_FORWARD;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("3RD Trimester");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Week 32");
        EnumC39333f enumC39333f = EnumC39333f.STRAIN_ZONE_3;
        f53161a = new C14542m(textResourceM21278l, enumC16313m0, new C14538i(textResourceM21278l2, textResourceM21278l3, enumC39333f), null, AbstractC37056f.m118959K(new C24816a(enumC39333f, 0.0f, 0.33f, null, false), new C24816a(enumC39333f, 0.34f, 0.67f, null, false), new C24816a(enumC39333f, 0.68f, 1.0f, Float.valueOf(0.85f), true)), AbstractC37056f.m118958J(new C24817b(0.83f, AbstractC8693b.m21278l("32"), enumC39333f, true)), null, 72, null);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Postpartum");
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("4th trimester");
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("Week 6");
        EnumC39333f enumC39333f2 = EnumC39333f.RECOVERY;
        C14538i c14538i = new C14538i(textResourceM21278l5, textResourceM21278l6, enumC39333f2);
        EnumC32086i enumC32086i = EnumC32086i.PROGRESS_BAR;
        List listM118958J = AbstractC37056f.m118958J(new C24816a(enumC39333f2, 0.0f, 1.0f, Float.valueOf(0.5f), false));
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("6");
        EnumC39333f enumC39333f3 = EnumC39333f.BRAND_WHITE;
        EnumC32086i enumC32086i2 = null;
        List list = null;
        List list2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        f53162b = AbstractC37056f.m118959K(new C14542m(textResourceM21278l4, enumC16313m0, c14538i, enumC32086i, listM118958J, AbstractC37056f.m118958J(new C24817b(0.5f, textResourceM21278l7, enumC39333f3, true)), 0 == true ? 1 : 0, 64, null), new C14542m(AbstractC8693b.m21278l("Hormonal Insights"), enumC16313m0, new C14538i(AbstractC8693b.m21278l("NO DATA"), null, enumC39333f3, 2, null), enumC32086i2, list, list2, objArr, 120, null));
    }

    /* JADX INFO: renamed from: e */
    public static final void m41519e(Modifier modifier, EnumC39333f enumC39333f, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        EnumC39333f enumC39333f2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(914659586);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC39333f == null ? -1 : enumC39333f.ordinal()) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            enumC39333f2 = i17 != 0 ? EnumC39333f.WHITE_10 : enumC39333f;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifier2, 0.0f, 3 * 8, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            int i18 = (i15 >> 3) & 14;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC18489d0.m53364e(AbstractC29011e.m88144e(c2314t, 0.0f, 0.0f, 1.0f, 0.35f, new C29007a(0.0f, 0.0f, false, false, 12, null)), 1, 4), C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent()), new C17919x(enumC39333f2.mo134584toComposableColorWaAFU9c(c28655q, i18)), new C17919x(enumC39333f2.mo134584toComposableColorWaAFU9c(c28655q, i18)), new C17919x(enumC39333f2.mo134584toComposableColorWaAFU9c(c28655q, i18))), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            enumC39333f2 = enumC39333f;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14540k(modifier2, enumC39333f2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m41520f(Modifier modifier, EnumC39333f enumC39333f, int i13, int i14, Composer composer, int i15) {
        m41519e(modifier, enumC39333f, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m41521g(Modifier modifier, C14542m state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1843131931);
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
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            boolean zM87157i = c28655q2.m87157i(state) | ((i15 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C13989w1(7, state, onViewEvent);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1772c1.m5391i(modifier4, false, null, (InterfaceC4339a) objM87133R, 3), null, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(1541024117, c28655q2, new C13242h(state, 14)), c28655q, 12582912, 126);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 6, modifier3, onViewEvent, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m41522h(C14542m c14542m, Function1 function1) {
        C9598e c9598eM41526b = c14542m.getDestination();
        if (c9598eM41526b != null) {
            function1.invoke(c9598eM41526b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m41523i(C14542m c14542m, Composer composer, int i13) {
        C38072d c38072d;
        int i14;
        float f13;
        C0213j c0213j;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f14 = 8;
            float f15 = 2 * f14;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
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
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f15, 7);
            C22949e c22949e = AbstractC22953f.f90591c;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM41530g = c14542m.getTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM41530g, c28655q, i15);
            C38072d c38072d2 = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d2.m121952e(c28655q, i16).getH4();
            long brandWhite = c38072d2.m121949b(c28655q, i16).getBrandWhite();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i17, 196602);
            C28655q c28655q2 = c28655q;
            EnumC16313m0 enumC16313m0M41527c = c14542m.getEndIcon();
            if (enumC16313m0M41527c == null) {
                c28655q2.m87150e0(1423479439);
                c28655q2.m87173q(false);
                c38072d = c38072d2;
                i14 = i16;
            } else {
                c38072d = c38072d2;
                i14 = i16;
                float f16 = 4;
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q2, 1423479440, enumC16313m0M41527c, c28655q2, 6), null, AbstractC1102d.m3419p(f16 * f16, c2314t), c38072d.m121949b(c28655q2, i14).getWhite50(), c28655q2, 432, 0);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            C14538i c14538iM41525a = c14542m.getBody();
            if (c14538iM41525a == null) {
                c28655q2.m87150e0(554780639);
                c28655q2.m87173q(false);
                z4 = true;
            } else {
                c28655q2.m87150e0(554780640);
                int i18 = a.f53163a[c14542m.getType().ordinal()];
                if (i18 == 1) {
                    f13 = f15;
                } else {
                    if (i18 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = f14 * 1;
                }
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, f13, 1);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 48);
                int iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j = c0213j2;
                    c28655q2.m87163l(c0213j);
                } else {
                    c0213j = c0213j2;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                Modifier modifierM3409f = AbstractC1102d.m3409f(0.4f, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q2, 6);
                int iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                C28655q c28655q3 = c28655q2;
                C38072d c38072d3 = c38072d;
                int i19 = i14;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c14538iM41525a.getTitle(), c28655q2, i15), null, c14538iM41525a.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getH5(), null, c28655q3, 0, i17, 196602);
                c28655q2 = c28655q3;
                TextResource textResourceM41510b = c14538iM41525a.getMetricTitle();
                if (textResourceM41510b == null) {
                    c28655q2.m87150e0(731494878);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(731494879);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM41510b, c28655q2, i15), null, c38072d3.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i19).getT4(), null, c28655q2, 0, i17, 196602);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                if (c14542m.m41529f() != null) {
                    c28655q2.m87150e0(1296889369);
                    AbstractC24818c.m72728d(null, c14542m.getType(), c14542m.m41529f(), c14542m.m41528e(), c28655q2, 0, 1);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1297143414);
                    m41519e(null, null, c28655q2, 0, 3);
                    c28655q2.m87173q(false);
                }
                z4 = true;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m41524j(Modifier modifier, C14542m c14542m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m41521g(modifier, c14542m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
