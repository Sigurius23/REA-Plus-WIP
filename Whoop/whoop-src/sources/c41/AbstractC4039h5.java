package c41;

import a01.C0084d;
import am0.C0998b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bs1.C3603v;
import c11.C3837d;
import c31.C3929m;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15680h;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import ny0.C27246d;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.h5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006#"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/i5;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lgz0/m0;", "icon", "", "isCompleted", "m", "(Lgz0/m0;ZLandroidx/compose/runtime/Composer;I)V", "Ly3/f;", "a", "F", "ICON_SIZE_DP", "b", "BOX_SIZE_DP", "c", "BORDER_WIDTH_DP", "d", "Lc41/i5;", "o", "()Lc41/i5;", "completedStatusTileStateSample", "e", "p", "notCompletedStatusTileStateSample", "f", "getNoIconStatusTileStateSample", "noIconStatusTileStateSample", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4039h5 {

    /* JADX INFO: renamed from: a */
    private static final float f16390a;

    /* JADX INFO: renamed from: b */
    private static final float f16391b;

    /* JADX INFO: renamed from: c */
    private static final float f16392c;

    /* JADX INFO: renamed from: d */
    private static final C4046i5 f16393d;

    /* JADX INFO: renamed from: e */
    private static final C4046i5 f16394e;

    /* JADX INFO: renamed from: f */
    private static final C4046i5 f16395f;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        float f13 = 4;
        f16390a = 3 * f13;
        f16391b = 6 * f13;
        f16392c = ((float) 0.3d) * f13;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("MY JOURNAL");
        TextResource textResourceM21267a = AbstractC8693b.m21267a();
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_CHECKMARK;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("EDIT");
        EnumC16313m0 enumC16313m1 = EnumC16313m0.PENCIL;
        f16393d = new C4046i5(textResourceM21278l, textResourceM21267a, enumC16313m0, true, new C27256h(textResourceM21278l2, enumC16313m1, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554428, null), null, null, 96, null);
        C9598e c9598e = null;
        f16394e = new C4046i5(AbstractC8693b.m21278l("MY JOURNAL"), AbstractC8693b.m21278l("Your journal isn’t filled out yet. Track daily behaviors to understand their impact and improve your routine."), enumC16313m0, false, new C27256h(AbstractC8693b.m21278l("FILL OUT"), enumC16313m1, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554428, null), 0 == true ? 1 : 0, c9598e, 96, null);
        EnumC16313m0 enumC16313m2 = null;
        boolean z4 = true;
        f16395f = new C4046i5(AbstractC8693b.m21278l("MY JOURNAL"), AbstractC8693b.m21267a(), enumC16313m2, z4, new C27256h(AbstractC8693b.m21278l("ENABLE"), null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554430, null), c9598e, null, 100, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m12311g(Modifier modifier, C4046i5 state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int i16;
        Modifier modifier3;
        Function1 function4;
        Object objM87133R;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1852614132);
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
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
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
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                    i16 = i18;
                } else {
                    i16 = i18;
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C3929m(25);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                AbstractC31926e.m99375j(modifier3, null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-826208892, c28655q, new C0084d(modifier3, state, function4, 8)), c28655q, (i15 & 14) | 12582912, 122);
                function3 = function4;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(modifier2, state, function3, i13, i14, 6);
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
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
                i16 = i18;
            } else {
                i16 = i18;
                modifier3 = modifier2;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C3929m(25);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            AbstractC31926e.m99375j(modifier3, null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-826208892, c28655q, new C0084d(modifier3, state, function4, 8)), c28655q, (i15 & 14) | 12582912, 122);
            function3 = function4;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(modifier2, state, function3, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m12312h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12313i(Modifier modifier, C4046i5 c4046i5, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            boolean zM87157i = c28655q.m87157i(c4046i5) | c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C3603v(c4046i5, function1, 16);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifier, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3405b = AbstractC1102d.m3405b(AbstractC1099a.m3395q(modifierM3360e, f14, AbstractC8693b.m21270d(c4046i5.getSubtitle()) ? f14 : 1 * f13), 0.0f, 12 * 4, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3405b);
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
            C2306l c2306l = C2299e.f9108K;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f15 = 1 * f13;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f15);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            if (c4046i5.getIcon() == null) {
                c28655q.m87150e0(-31927322);
                i14 = 0;
                c28655q.m87173q(false);
            } else {
                i14 = 0;
                c28655q.m87150e0(-31927321);
                m12317m(c4046i5.getIcon(), c4046i5.getCompleted(), c28655q, 0);
                c28655q.m87173q(false);
            }
            String strM21274h = AbstractC8693b.m21274h(c4046i5.getTitle(), c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            C27256h c27256hM12348c = c4046i5.getCardButtonState();
            if (c27256hM12348c == null) {
                c28655q2.m87150e0(1507077842);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1507077843);
                C27246d c27246d = new C27246d();
                C27256h c27256hM82144b = C27256h.m82144b(c27256hM12348c, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33546239, null);
                boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87157i(c27256hM12348c);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new C3837d(function1, c27256hM12348c, 1);
                    c28655q2.m87172p0(objM87133R3);
                }
                c27246d.Compose(c2314t, c27256hM82144b, (Function1) objM87133R3, c28655q2, 6);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            if (AbstractC8693b.m21270d(c4046i5.getSubtitle())) {
                c28655q2.m87150e0(2035552675);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4046i5.getSubtitle(), c28655q2, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB2(), null, c28655q2, 48, 0, 196600);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(2035817384);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12314j(C4046i5 c4046i5, Function1 function1) {
        if (c4046i5.getDestination() != null) {
            function1.invoke(c4046i5);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m12315k(Function1 function1, C27256h c27256h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c27256h);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m12316l(Modifier modifier, C4046i5 c4046i5, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12311g(modifier, c4046i5, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m12317m(EnumC16313m0 enumC16313m0, boolean z4, Composer composer, int i13) {
        int i14;
        long jM53363d;
        long jM53363d2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(472860965);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC16313m0.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            if (z4) {
                c28655q.m87150e0(-847141649);
                jM53363d = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-847140564);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, 6, false);
            }
            long j7 = jM53363d;
            if (z4) {
                c28655q.m87150e0(-847138480);
                jM53363d2 = C38072d.f163053a.m121949b(c28655q, 6).getTransparent();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-847137364);
                jM53363d2 = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, 6, false);
            }
            EnumC39333f enumC39333f = z4 ? EnumC39333f.ACCENT_POSITIVE_TREND : EnumC39333f.TRANSPARENT;
            C13825t c13825tM48880a = AbstractC17269i.m48880a(f16392c, C17919x.m51541c(z4 ? 0.0f : 0.2f, jM53363d2));
            C33252i c33252i = AbstractC33253j.f138651a;
            float f13 = c13825tM48880a.f49345a;
            AbstractC17911t abstractC17911t = c13825tM48880a.f49346b;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44112a = AbstractC15680h.m44112a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f16391b, AbstractC15751g.m44456i(f13, c2314t, abstractC17911t, c33252i)), c33252i), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a), true);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44112a);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6), AbstractC8693b.m21275i("null", c28655q, 6), AbstractC1102d.m3419p(f16390a, AbstractC15680h.m44112a(c2314t, true)), j7, c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(enumC16313m0, z4, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m12318n(EnumC16313m0 enumC16313m0, boolean z4, int i13, Composer composer, int i14) {
        m12317m(enumC16313m0, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final C4046i5 m12319o() {
        return f16393d;
    }

    /* JADX INFO: renamed from: p */
    public static final C4046i5 m12320p() {
        return f16394e;
    }
}
