package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.EnumC2888c;
import bs1.C3603v;
import c31.C3929m;
import c93.InterfaceC4339a;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import java.io.IOException;
import l83.C23454a0;
import ny0.C27273p0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C0003a0;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.r2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/p2;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lc41/n2;", "l", "(Lc41/n2;)Landroidx/compose/ui/Modifier;", "Ly3/f;", "a", "F", "IconContentSpacing", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4106r2 {

    /* JADX INFO: renamed from: a */
    private static final float f16662a;

    /* JADX INFO: renamed from: c41.r2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16663a;

        static {
            int[] iArr = new int[EnumC4078n2.values().length];
            try {
                iArr[EnumC4078n2.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4078n2.AI_COACH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16663a = iArr;
        }
    }

    static {
        float f13 = 4;
        f16662a = f13 * f13;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m12647f(Modifier modifier, C4092p2 state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1539986274);
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
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
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
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C3929m(14);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC31926e.m99375j(null, state.getTileStyle(), state.getBackground().mo134584toComposableColorWaAFU9c(c28655q, 0), null, null, null, 0.0f, AbstractC37817c.m121344e(-349208036, c28655q, new C0003a0(11, state, function4)), c28655q, 12582912, 121);
                c28655q.m87173q(true);
                function3 = function4;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(modifier2, state, function3, i13, i14, 2);
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
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C3929m(14);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC31926e.m99375j(null, state.getTileStyle(), state.getBackground().mo134584toComposableColorWaAFU9c(c28655q, 0), null, null, null, 0.0f, AbstractC37817c.m121344e(-349208036, c28655q, new C0003a0(11, state, function4)), c28655q, 12582912, 121);
            c28655q.m87173q(true);
            function3 = function4;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(modifier2, state, function3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m12648g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m12649h(C4092p2 c4092p2, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        boolean z4;
        long jMo134584toComposableColorWaAFU9c;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        float f13;
        C0209i c0209i4;
        C0209i c0209i5;
        char c3;
        int i14;
        C2314t c2314t;
        boolean z13;
        C17919x c17919xM31989h;
        long jM95627c;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f14 = 8;
            float f15 = 2 * f14;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(f15, c2314t2));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m);
            C0209i c0209i8 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i8);
            }
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N2);
            EnumC16313m0 icon = c4092p2.getIcon();
            if (icon == null) {
                c28655q.m87150e0(325135219);
                c28655q.m87173q(false);
                c0209i2 = c0209i7;
                c0209i = c0209i8;
                c0213j = c0213j2;
            } else {
                C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q, 325135220, icon, c28655q, 6);
                Modifier modifierMo3471e = AbstractC1102d.m3419p(c4092p2.getIconSize(), c2314t2).mo3471e(m12653l(c4092p2.getIconGradient()));
                int i15 = a.f16663a[c4092p2.getIconGradient().ordinal()];
                if (i15 == 1) {
                    z4 = false;
                    c28655q.m87150e0(358921409);
                    jMo134584toComposableColorWaAFU9c = c4092p2.getContentColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (i15 != 2) {
                        throw AbstractC11895b.m32003v(358918095, c28655q, false);
                    }
                    c28655q.m87150e0(358924792);
                    z4 = false;
                    jMo134584toComposableColorWaAFU9c = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                c0213j = c0213j2;
                c0209i = c0209i8;
                c0209i2 = c0209i7;
                AbstractC15005f3.m43108b(c27430eM53378s, null, modifierMo3471e, jMo134584toComposableColorWaAFU9c, c28655q, 48, 0);
                AbstractC25012a.m73389v(c2314t2, f16662a, c28655q, z4);
            }
            float f16 = 4;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 0.5d) * f16);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            if (!c4092p2.getIsDismissable()) {
                f15 = 0 * f14;
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(layoutWeightElement, 0.0f, 0.0f, f15, 0.0f, 11);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i, r44, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            C0209i c0209i10 = c0209i2;
            AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i3 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                c0209i3 = c0209i;
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N3);
            TextResource title = c4092p2.getTitle();
            if (title == null) {
                c28655q.m87150e0(1104961604);
                c28655q.m87173q(false);
                c0209i4 = c0209i10;
                f13 = f16;
                c3 = 0;
                i14 = 0;
                c0209i5 = c0209i3;
            } else {
                c28655q.m87150e0(1104961605);
                f13 = f16;
                c0209i4 = c0209i10;
                c0209i5 = c0209i3;
                c3 = 0;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q, 0), null, c4092p2.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                i14 = 0;
                c28655q.m87173q(false);
            }
            C28655q c28655q2 = c28655q;
            AbstractC21048g.m58807M(AbstractC8693b.m21274h(c4092p2.getContent(), c28655q, i14), null, false, C21053l.f79834a.m58880a(EnumC2888c.INSTANCE.m8402a(c4092p2.getContentTypography()).getStyle(), c4092p2.getContentColor().mo134584toComposableColorWaAFU9c(c28655q, i14), C38072d.f163053a.m121949b(c28655q, 6).getStrain(), 0L, null, c4092p2.getStrongEmphasisTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0, c4092p2.getEmphasisTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32600), null, 0, 0, 0, false, c28655q2, 0, 502);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            if (c4092p2.m12568r().isEmpty()) {
                c2314t = c2314t2;
                z13 = true;
                c28655q2.m87150e0(1234704412);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1233839512);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                int iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
                c28655q2.m87150e0(1636157646);
                for (C25306o c25306o : c4092p2.m12568r()) {
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(((float) 1.5d) * f14, c2314t2));
                    AbstractC25303l.m74290q(c25306o, null, new C22931l(10, c4092p2, c25306o), function1, c28655q2, 0, 2);
                    c2314t2 = c2314t2;
                }
                c2314t = c2314t2;
                z13 = true;
                AbstractC25012a.m73392y(c28655q2, false, true, false);
            }
            c28655q2.m87173q(z13);
            if (c4092p2.getIsDismissable()) {
                c28655q2.m87150e0(-842266448);
                float f17 = ((float) 1.5d) * f14;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(c3, c2314t), 0.0f, f17, f17, 0.0f, 9);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q2, 6);
                int iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j3 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j3);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                C0209i c0209i11 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i11);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * f13, c2314t);
                boolean zM87157i = c28655q2.m87157i(c4092p2) | c28655q2.m87153g(function1);
                Object objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3603v(c4092p2, function1, 13);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3419p, false, null, null, (InterfaceC4339a) objM87133R, 15);
                C38072d c38072d = C38072d.f163053a;
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCross(), c28655q2, 6);
                String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62307b0, c28655q2, 0);
                InterfaceC39332e dismissIconColor = c4092p2.getDismissIconColor();
                if (dismissIconColor == null) {
                    c28655q2.m87150e0(-751766255);
                    c28655q2.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q2.m87150e0(391391472);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, dismissIconColor.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                }
                if (c17919xM31989h == null) {
                    jM95627c = AbstractC31061c.m95627c(c28655q2, 391392772, c38072d, c28655q2, 6);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(391390757);
                    c28655q2.m87173q(false);
                    jM95627c = c17919xM31989h.f69639a;
                }
                AbstractC15005f3.m43108b(c27430eM107874S, strM21273g, modifierM3362g, jM95627c, c28655q2, 0, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-841199738);
                c28655q2.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Modifier m12650i(C4092p2 c4092p2, C25306o c25306o, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1707998895);
        EnumC4085o2 itemsAlignment = c4092p2.getItemsAlignment();
        EnumC4085o2 enumC4085o2 = EnumC4085o2.TEXT;
        Modifier modifierM3398t = C2314t.f9131w;
        if (itemsAlignment == enumC4085o2 && (c25306o.getState() instanceof C27273p0)) {
            modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, c4092p2.getIconSize() + f16662a, 0.0f, 0.0f, 0.0f, 14);
        }
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12651j(C4092p2 c4092p2, Function1 function1) {
        Action dismissAction = c4092p2.getDismissAction();
        if (dismissAction != null) {
            function1.invoke(new DesignItemInteraction(dismissAction, c4092p2.getDismissAnalyticEvent()));
        } else {
            function1.invoke(new C4071m2(c4092p2.getComponentDismissalId()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m12652k(Modifier modifier, C4092p2 c4092p2, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12647f(modifier, c4092p2, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final Modifier m12653l(EnumC4078n2 enumC4078n2) {
        int i13 = a.f16663a[enumC4078n2.ordinal()];
        C2314t c2314t = C2314t.f9131w;
        if (i13 == 1) {
            return c2314t;
        }
        if (i13 == 2) {
            return AbstractC15673b0.m44061s(c2314t, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC15673b0.m44049m(), 0.0f, 0.0f, 14));
        }
        throw new NoWhenBranchMatchedException();
    }
}
