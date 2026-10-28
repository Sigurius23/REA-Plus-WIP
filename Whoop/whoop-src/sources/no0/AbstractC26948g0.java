package no0;

import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import lo0.C24571b0;
import lo0.EnumC24591l0;
import lo0.InterfaceC24615z;
import mf2.C25514e;
import n72.C26439b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p668z1.C39970s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: no0.g0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m65681d2 = {"Llo0/b0;", "viewState", "Lkotlin/Function1;", "Llo0/z;", "Ll83/a0;", "onEvent", "n", "(Llo0/b0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lc0/l0;", "A", "()Lc0/l0;", "x", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26948g0 {

    /* JADX INFO: renamed from: no0.g0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f107476a;

        static {
            int[] iArr = new int[EnumC24591l0.values().length];
            try {
                iArr[EnumC24591l0.Forward.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24591l0.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24591l0.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f107476a = iArr;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final C3756l0 m80475A() {
        return AbstractC1089a.m3345c(AbstractC3788w0.m11585m(AbstractC11348f.m30574v(300, 0, null, 6), new C26439b(20)), AbstractC3788w0.m11589q(AbstractC11348f.m30574v(300, 0, null, 6), new C26439b(21)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final int m80476B(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final int m80477C(int i13) {
        return -i13;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125  */
    /* JADX WARN: Code duplicated, block: B:66:0x012a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143  */
    /* JADX WARN: Code duplicated, block: B:74:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x018d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0194  */
    /* JADX WARN: Code duplicated, block: B:81:0x0199  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:93:0x020d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0217  */
    /* JADX WARN: Code duplicated, block: B:97:0x0225 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public static final void m80491n(C24571b0 viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C26942d0 c26942d0;
        C28676v0 c28676v0;
        Function1 function4;
        C24571b0.b bVarM71712f;
        final Function1 function5;
        EnumC24591l0 enumC24591l0M71713g;
        Object objM87133R;
        final C39970s c39970s;
        boolean zM87153g;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C37816b c37816bM121344e;
        C24571b0.b.f fVar;
        String strM71752e;
        boolean z13;
        Object objM87133R3;
        C28676v0 c28676v1;
        boolean zM87149e;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-264260107);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C26439b(17);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                bVarM71712f = viewState.getScreenContent();
                if (bVarM71712f == null) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    } else {
                        c26942d0 = new C26942d0(viewState, function4, i13, i14, 0);
                    }
                } else {
                    function5 = function4;
                    String strMo71718a = bVarM71712f.getIntakeStepId();
                    enumC24591l0M71713g = viewState.getStepTransition();
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39970s();
                        c28655q.m87172p0(objM87133R);
                    }
                    c39970s = (C39970s) objM87133R;
                    zM87153g = c28655q.m87153g(bVarM71712f);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g || objM87133R2 == c28676v0) {
                        objM87133R2 = new C26964o0(4, c39970s, bVarM71712f);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87257k((InterfaceC4339a) objM87133R2, c28655q);
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
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
                    c37816bM121344e = null;
                    if (bVarM71712f instanceof C24571b0.b.f) {
                        fVar = (C24571b0.b.f) bVarM71712f;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        strM71752e = fVar.getNavigationSkipTitle();
                    } else {
                        strM71752e = null;
                    }
                    TextResource textResourceMo71719b = bVarM71712f.getToolbarTitle();
                    Integer numM38561h = AbstractC13673n.m38561h(C38072d.f163053a);
                    if (strM71752e == null) {
                        c28655q.m87150e0(-166831436);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-166831435);
                        c37816bM121344e = AbstractC37817c.m121344e(1421632688, c28655q, new C26961n(function5, strM71752e));
                        c28655q.m87173q(false);
                    }
                    AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceMo71719b, null, numM38561h, null, null, null, null, null, false, c37816bM121344e, null, null, null, null, null, null, 65018, null);
                    Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, c2314t);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z13) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R3 == c28676v1) {
                        }
                        AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (!(((double) 1.0f) > 0.0d)) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM124374d = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                        zM87149e = c28655q.m87149e(enumC24591l0M71713g.ordinal());
                        objM87133R4 = c28655q.m87133R();
                        if (zM87149e || objM87133R4 == c28676v1) {
                            objM87133R4 = new C26944e0(enumC24591l0M71713g, 0);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC1089a.m3344b(strMo71718a, modifierM124374d, (Function1) objM87133R4, null, "ClinicianVideoSchedulingIntakeStep", null, AbstractC37817c.m121344e(-1402540971, c28655q, new InterfaceC4352n() { // from class: no0.f0
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC26948g0.m80499v(c39970s, function5, (InterfaceC3764o) obj, (String) obj2, (Composer) obj3, iIntValue);
                            }
                        }), c28655q, 1597440, 40);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        function3 = function5;
                    }
                    objM87133R3 = new C25514e(function5, 21);
                    c28655q.m87172p0(objM87133R3);
                    AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (!(((double) 1.0f) > 0.0d)) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM124374d2 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                    zM87149e = c28655q.m87149e(enumC24591l0M71713g.ordinal());
                    objM87133R4 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R4 = new C26944e0(enumC24591l0M71713g, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26944e0(enumC24591l0M71713g, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC1089a.m3344b(strMo71718a, modifierM124374d2, (Function1) objM87133R4, null, "ClinicianVideoSchedulingIntakeStep", null, AbstractC37817c.m121344e(-1402540971, c28655q, new InterfaceC4352n() { // from class: no0.f0
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC26948g0.m80499v(c39970s, function5, (InterfaceC3764o) obj, (String) obj2, (Composer) obj3, iIntValue);
                        }
                    }), c28655q, 1597440, 40);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    function3 = function5;
                }
                c28677v1M87180u.f115982d = c26942d0;
            }
            c28655q.m87138X();
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c26942d0 = new C26942d0(viewState, function3, i13, i14, 1);
                c28677v1M87180u.f115982d = c26942d0;
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C26439b(17);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            bVarM71712f = viewState.getScreenContent();
            if (bVarM71712f == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                } else {
                    c26942d0 = new C26942d0(viewState, function4, i13, i14, 0);
                }
            } else {
                function5 = function4;
                String strMo71718a2 = bVarM71712f.getIntakeStepId();
                enumC24591l0M71713g = viewState.getStepTransition();
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39970s();
                    c28655q.m87172p0(objM87133R);
                }
                c39970s = (C39970s) objM87133R;
                zM87153g = c28655q.m87153g(bVarM71712f);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new C26964o0(4, c39970s, bVarM71712f);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C26964o0(4, c39970s, bVarM71712f);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87257k((InterfaceC4339a) objM87133R2, c28655q);
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM114675c2 = AbstractC36095b.m114675c(c2314t2, 1.0f);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM114675c2);
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
                c37816bM121344e = null;
                if (bVarM71712f instanceof C24571b0.b.f) {
                    fVar = (C24571b0.b.f) bVarM71712f;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    strM71752e = fVar.getNavigationSkipTitle();
                } else {
                    strM71752e = null;
                }
                TextResource textResourceMo71719b2 = bVarM71712f.getToolbarTitle();
                Integer numM38561h2 = AbstractC13673n.m38561h(C38072d.f163053a);
                if (strM71752e == null) {
                    c28655q.m87150e0(-166831436);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-166831435);
                    c37816bM121344e = AbstractC37817c.m121344e(1421632688, c28655q, new C26961n(function5, strM71752e));
                    c28655q.m87173q(false);
                }
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceMo71719b2, null, numM38561h2, null, null, null, null, null, false, c37816bM121344e, null, null, null, null, null, null, 65018, null);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(1 * 8, c2314t2);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z13) {
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                    }
                    AbstractC6719b.m20143d(modifierM3394p2, aVar2, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (!(((double) 1.0f) > 0.0d)) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM124374d3 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                    zM87149e = c28655q.m87149e(enumC24591l0M71713g.ordinal());
                    objM87133R4 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R4 = new C26944e0(enumC24591l0M71713g, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26944e0(enumC24591l0M71713g, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC1089a.m3344b(strMo71718a2, modifierM124374d3, (Function1) objM87133R4, null, "ClinicianVideoSchedulingIntakeStep", null, AbstractC37817c.m121344e(-1402540971, c28655q, new InterfaceC4352n() { // from class: no0.f0
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC26948g0.m80499v(c39970s, function5, (InterfaceC3764o) obj, (String) obj2, (Composer) obj3, iIntValue);
                        }
                    }), c28655q, 1597440, 40);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    function3 = function5;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R3 = new C25514e(function5, 21);
                c28655q.m87172p0(objM87133R3);
                AbstractC6719b.m20143d(modifierM3394p2, aVar2, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (!(((double) 1.0f) > 0.0d)) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d4 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                zM87149e = c28655q.m87149e(enumC24591l0M71713g.ordinal());
                objM87133R4 = c28655q.m87133R();
                if (zM87149e) {
                    objM87133R4 = new C26944e0(enumC24591l0M71713g, 0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26944e0(enumC24591l0M71713g, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC1089a.m3344b(strMo71718a2, modifierM124374d4, (Function1) objM87133R4, null, "ClinicianVideoSchedulingIntakeStep", null, AbstractC37817c.m121344e(-1402540971, c28655q, new InterfaceC4352n() { // from class: no0.f0
                    @Override // c93.InterfaceC4352n
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC26948g0.m80499v(c39970s, function5, (InterfaceC3764o) obj, (String) obj2, (Composer) obj3, iIntValue);
                    }
                }), c28655q, 1597440, 40);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function3 = function5;
            }
            c28677v1M87180u.f115982d = c26942d0;
        }
        c28655q.m87138X();
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c26942d0 = new C26942d0(viewState, function3, i13, i14, 1);
            c28677v1M87180u.f115982d = c26942d0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m80492o(InterfaceC24615z it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m80493p(C24571b0 c24571b0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80491n(c24571b0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m80494q(C39970s c39970s, C24571b0.b bVar) {
        c39970s.put(bVar.getIntakeStepId(), bVar);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m80495r(Function1 function1, String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C25514e(function1, 20);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), 2 * 8, 0.0f, 2);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(str, modifierM3396r, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getFormLabel(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m80496s(Function1 function1) {
        function1.invoke(InterfaceC24615z.m.f96240a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m80497t(Function1 function1) {
        function1.invoke(InterfaceC24615z.n.f96241a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C3756l0 m80498u(EnumC24591l0 enumC24591l0, InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        int i13 = a.f107476a[enumC24591l0.ordinal()];
        if (i13 == 1) {
            return m80475A();
        }
        if (i13 == 2) {
            return m80501x();
        }
        if (i13 == 3) {
            return AbstractC1089a.m3345c(AbstractC3730c1.f15251a, AbstractC3736e1.f15289a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m80499v(C39970s c39970s, Function1 function1, InterfaceC3764o AnimatedContent, String animatedStepId, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        AbstractC22676k.m65750j(animatedStepId, "animatedStepId");
        C24571b0.b bVar = (C24571b0.b) c39970s.get(animatedStepId);
        if (bVar instanceof C24571b0.b.C41960b) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(777863796);
            AbstractC26933a0.m80404i((C24571b0.b.C41960b) bVar, function1, c28655q, 0, 0);
            c28655q.m87173q(false);
        } else if (bVar instanceof C24571b0.b.e) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(777869076);
            AbstractC26962n0.m80710l((C24571b0.b.e) bVar, function1, c28655q2, 0, 0);
            c28655q2.m87173q(false);
        } else if (bVar instanceof C24571b0.b.c) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(777874356);
            AbstractC26952i0.m80556i((C24571b0.b.c) bVar, function1, c28655q3, 0, 0);
            c28655q3.m87173q(false);
        } else if (bVar instanceof C24571b0.b.d) {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(777879735);
            AbstractC26958l0.m80597I((C24571b0.b.d) bVar, function1, c28655q4, 0, 0);
            c28655q4.m87173q(false);
        } else if (bVar instanceof C24571b0.b.f) {
            C28655q c28655q5 = (C28655q) composer;
            c28655q5.m87150e0(777885042);
            AbstractC26966p0.m80754k((C24571b0.b.f) bVar, function1, c28655q5, 0, 0);
            c28655q5.m87173q(false);
        } else if (bVar instanceof C24571b0.b.a) {
            C28655q c28655q6 = (C28655q) composer;
            c28655q6.m87150e0(777890293);
            AbstractC26985z.m80913f((C24571b0.b.a) bVar, function1, c28655q6, 0);
            c28655q6.m87173q(false);
        } else {
            if (bVar != null) {
                throw AbstractC11895b.m32003v(777859948, (C28655q) composer, false);
            }
            C28655q c28655q7 = (C28655q) composer;
            c28655q7.m87150e0(777893104);
            AbstractC22989q.m66760a(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), c28655q7, 6);
            c28655q7.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m80500w(C24571b0 c24571b0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80491n(c24571b0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final C3756l0 m80501x() {
        return AbstractC1089a.m3345c(AbstractC3788w0.m11585m(AbstractC11348f.m30574v(300, 0, null, 6), new C26439b(18)), AbstractC3788w0.m11589q(AbstractC11348f.m30574v(300, 0, null, 6), new C26439b(19)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final int m80502y(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final int m80503z(int i13) {
        return i13;
    }
}
