package j41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import hy0.C17794v;
import ih0.AbstractC18489d0;
import ik1.C18608e;
import iz0.C21045d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k71.C22256m;
import l83.C23454a0;
import lk1.AbstractC24493c;
import nk1.C26798d;
import ok1.C27994a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22965i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: j41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lok1/a;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lok1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "healthspan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21315c {
    /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:102:0x031a  */
    /* JADX WARN: Code duplicated, block: B:108:0x036d  */
    /* JADX WARN: Code duplicated, block: B:110:0x037d  */
    /* JADX WARN: Code duplicated, block: B:111:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:114:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x043a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0462  */
    /* JADX WARN: Code duplicated, block: B:121:0x046d  */
    /* JADX WARN: Code duplicated, block: B:122:0x049a  */
    /* JADX WARN: Code duplicated, block: B:124:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:125:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:131:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:137:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[LOOP:1: B:52:0x00a6->B:139:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:69:0x013f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:82:0x0194  */
    /* JADX WARN: Code duplicated, block: B:83:0x0218  */
    /* JADX WARN: Code duplicated, block: B:86:0x0252  */
    /* JADX WARN: Code duplicated, block: B:87:0x0256  */
    /* JADX WARN: Code duplicated, block: B:92:0x0271  */
    /* JADX WARN: Code duplicated, block: B:97:0x0282  */
    /* JADX WARN: Code duplicated, block: B:98:0x02bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
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
    public static final void m59840c(Modifier modifier, C27994a viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Function1 function4;
        List<InterfaceC25312u> listM84429c;
        Iterator<T> it;
        boolean z13;
        float f13;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        float f14;
        float f15;
        InterfaceC22965i interfaceC22965i;
        C2306l c2306l;
        int iHashCode2;
        Function1 function5;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        C2314t c2314t2;
        C0209i c0209i3;
        C2306l c2306l2;
        float f16;
        float f17;
        ?? r10;
        C28655q c28655q2;
        int iHashCode3;
        C28655q c28655q3;
        int i17;
        C28655q c28655q4;
        Modifier modifier3;
        float f18;
        boolean z14;
        C28655q c28655q5;
        ?? r14;
        C28655q c28655q6;
        Function1 function6;
        float f19;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(-895122853);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q7.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q7.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q7.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if (i19 != 0) {
                    objM87133R = c28655q7.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21045d(20);
                        c28655q7.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                listM84429c = viewState.m84429c();
                if (!(listM84429c instanceof Collection) && listM84429c.isEmpty()) {
                    z13 = false;
                    break;
                }
                it = listM84429c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((InterfaceC25312u) it.next()) instanceof C18608e) {
                            z13 = true;
                            break;
                        }
                    } else {
                        z13 = false;
                        break;
                    }
                }
                f13 = 10;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(modifier2, 0.0f, f13, 1));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q7, 0);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q7, c0209i4, c23010xM66775a);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i2);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i5, modifierM118962N);
                f14 = 12;
                f15 = 4;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f14, 7), f15, 0.0f, 2);
                if (viewState.getTitleDisplay() != null) {
                    interfaceC22965i = AbstractC22977m.f90656g;
                } else {
                    interfaceC22965i = AbstractC22977m.f90651b;
                }
                c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(interfaceC22965i, c2306l, c28655q7, 48);
                iHashCode2 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q7.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, modifierM3396r);
                c28655q7.m87158i0();
                function5 = function4;
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC28653p1M87165m2);
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i5, modifierM118962N2);
                if (viewState.getTitleDisplay() != null) {
                    c28655q7.m87150e0(-1121702353);
                    int i24 = i15;
                    String titleDisplay = viewState.getTitleDisplay();
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    i16 = i24;
                    f17 = f13;
                    r10 = 0;
                    c2314t2 = c2314t;
                    interfaceC4339a2 = interfaceC4339a;
                    f16 = f15;
                    c2306l2 = c2306l;
                    c0209i3 = c0209i;
                    AbstractC30795n.m94707h(titleDisplay, null, c38072d.m121949b(c28655q7, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q7, i25).getT3(), null, c28655q7, 0, C2886a.f11498d << 18, 196602);
                    C28655q c28655q8 = c28655q7;
                    c28655q8.m87173q(false);
                    c28655q2 = c28655q8;
                } else {
                    i16 = i15;
                    interfaceC4339a2 = interfaceC4339a;
                    c2314t2 = c2314t;
                    c0209i3 = c0209i;
                    c2306l2 = c2306l;
                    f16 = f15;
                    f17 = f13;
                    r10 = 0;
                    c28655q7.m87150e0(-1121505875);
                    c28655q7.m87173q(false);
                    c28655q2 = c28655q7;
                }
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                if (z13) {
                    c28655q2.m87150e0(-63182416);
                    C28655q c28655q9 = c28655q2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(C38072d.f163053a.m121951d().getHealth().getPicker(), c28655q2, 6), null, AbstractC1102d.m3421r(c2314t2, f14, (float) 7.5d), C17919x.f69637n, c28655q9, 3504, 0);
                    C28655q c28655q10 = c28655q9;
                    AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3424u(5, c2314t2));
                    c28655q10.m87173q(r10);
                    c28655q3 = c28655q10;
                } else {
                    c28655q2.m87150e0(-62758615);
                    c28655q2.m87173q(r10);
                    c28655q3 = c28655q2;
                }
                if (viewState.getPrimaryDescriptionDisplay() != null) {
                    c28655q3.m87150e0(-62663631);
                    String primaryDescriptionDisplay = viewState.getPrimaryDescriptionDisplay();
                    C38072d c38072d2 = C38072d.f163053a;
                    int i26 = C38072d.f163054b;
                    C2886a b6 = c38072d2.m121952e(c28655q3, i26).getB2();
                    long white70 = c38072d2.m121949b(c28655q3, i26).getWhite70();
                    i17 = 18;
                    C28655q c28655q11 = c28655q3;
                    AbstractC30795n.m94707h(primaryDescriptionDisplay, null, white70, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q11, 0, C2886a.f11498d << 18, 196602);
                    C28655q c28655q12 = c28655q11;
                    c28655q12.m87173q(r10);
                    c28655q4 = c28655q12;
                } else {
                    i17 = 18;
                    c28655q3.m87150e0(-62438199);
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                }
                if (viewState.getPrimaryDescriptionDisplay() != null || viewState.getSecondaryDescriptionDisplay() == null) {
                    modifier3 = modifier2;
                    f18 = f17;
                    z14 = true;
                    c28655q4.m87150e0(-61946167);
                    c28655q4.m87173q(r10);
                } else {
                    c28655q4.m87150e0(-62311347);
                    f18 = f17;
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3424u(f18, c2314t2));
                    modifier3 = modifier2;
                    z14 = true;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3424u(1, AbstractC1102d.m3411h(i17, modifier3)), C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite20(), AbstractC17918w0.f69621a), c28655q4, r10);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3424u(f18, c2314t2));
                    c28655q4.m87173q(r10);
                }
                if (z13) {
                    c28655q4.m87150e0(-61886678);
                    C38072d c38072d3 = C38072d.f163053a;
                    C28655q c28655q13 = c28655q4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getHealth().getPicker(), c28655q4, 6), null, AbstractC1127a.m3488c(AbstractC1102d.m3421r(c2314t2, f18, (float) 6.25d), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 180.0f, null, null, 0, 524031), c38072d3.m121949b(c28655q4, C38072d.f163054b).getWhite50(), c28655q13, 432, 0);
                    C28655q c28655q14 = c28655q13;
                    AbstractC22953f.m66715b(c28655q14, AbstractC1102d.m3424u(5, c2314t2));
                    c28655q14.m87173q(r10);
                    c28655q5 = c28655q14;
                } else {
                    c28655q4.m87150e0(-61395607);
                    c28655q4.m87173q(r10);
                    c28655q5 = c28655q4;
                }
                if (viewState.getSecondaryDescriptionDisplay() != null) {
                    c28655q5.m87150e0(-61298577);
                    String secondaryDescriptionDisplay = viewState.getSecondaryDescriptionDisplay();
                    C38072d c38072d4 = C38072d.f163053a;
                    int i27 = C38072d.f163054b;
                    C2886a b8 = c38072d4.m121952e(c28655q5, i27).getB2();
                    C28655q c28655q15 = c28655q5;
                    r14 = z14;
                    AbstractC30795n.m94707h(secondaryDescriptionDisplay, null, c38072d4.m121949b(c28655q5, i27).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q15, 0, C2886a.f11498d << 18, 196602);
                    C28655q c28655q16 = c28655q15;
                    c28655q16.m87173q(r10);
                    c28655q6 = c28655q16;
                } else {
                    r14 = z14;
                    c28655q5.m87150e0(-61071223);
                    c28655q5.m87173q(r10);
                    c28655q6 = c28655q5;
                }
                c28655q6.m87173q(r14);
                c28655q6.m87173q(r14);
                c28655q6.m87150e0(-1234492630);
                for (InterfaceC25312u interfaceC25312u : viewState.m84429c()) {
                    if (interfaceC25312u instanceof C22256m) {
                        c28655q6.m87150e0(-1856771705);
                        function6 = function5;
                        AbstractC25303l.m74291r(interfaceC25312u, AbstractC24493c.m71286b(), null, function6, c28655q6, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                        AbstractC22953f.m66715b(c28655q6, AbstractC1099a.m3394p(((float) r14) * 8, c2314t2));
                        c28655q6.m87173q(r10);
                        f19 = f16;
                    } else {
                        function6 = function5;
                        if (interfaceC25312u instanceof C26798d) {
                            f19 = f16;
                            AbstractC22953f.m66715b(c28655q6, AbstractC18489d0.m53365f(c28655q6, -1856526867, f19, f19, c2314t2));
                            AbstractC25303l.m74291r(interfaceC25312u, AbstractC24493c.m71286b(), null, function6, c28655q6, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                            c28655q6.m87173q(r10);
                        } else {
                            f19 = f16;
                            c28655q6.m87150e0(494308270);
                            AbstractC25303l.m74291r(interfaceC25312u, AbstractC24493c.m71286b(), null, function6, c28655q6, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                            c28655q6.m87173q(r10);
                        }
                    }
                    f16 = f19;
                    function5 = function6;
                }
                c28655q6.m87173q(r10);
                c28655q6.m87173q(r14);
                function3 = function5;
                modifier2 = modifier3;
                c28655q = c28655q6;
            } else {
                c28655q7.m87138X();
                function3 = function2;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 26, modifier2, (Object) viewState, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q7.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            if (i19 != 0) {
                objM87133R = c28655q7.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21045d(20);
                    c28655q7.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            listM84429c = viewState.m84429c();
            if (!(listM84429c instanceof Collection)) {
                it = listM84429c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((InterfaceC25312u) it.next()) instanceof C18608e) {
                            z13 = true;
                            break;
                        }
                    } else {
                        z13 = false;
                        break;
                    }
                }
            } else {
                it = listM84429c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((InterfaceC25312u) it.next()) instanceof C18608e) {
                            z13 = true;
                            break;
                        }
                    } else {
                        z13 = false;
                        break;
                    }
                }
            }
            f13 = 10;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(modifier2, 0.0f, f13, 1));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q7, 0);
            iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q7.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q7, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a);
            } else {
                c28655q7.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q7, c0209i6, c23010xM66775a2);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC28653p1M87165m4);
            c0209i2 = C0217k.f732j;
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i2);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N4);
            f14 = 12;
            f15 = 4;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f14, 7), f15, 0.0f, 2);
            if (viewState.getTitleDisplay() != null) {
                interfaceC22965i = AbstractC22977m.f90656g;
            } else {
                interfaceC22965i = AbstractC22977m.f90651b;
            }
            c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(interfaceC22965i, c2306l, c28655q7, 48);
            iHashCode2 = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q7.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q7, modifierM3396r2);
            c28655q7.m87158i0();
            function5 = function4;
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, c0209i6, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC28653p1M87165m5);
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N5);
            if (viewState.getTitleDisplay() != null) {
                c28655q7.m87150e0(-1121702353);
                int i28 = i15;
                String titleDisplay2 = viewState.getTitleDisplay();
                C38072d c38072d5 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                i16 = i28;
                f17 = f13;
                r10 = 0;
                c2314t2 = c2314t;
                interfaceC4339a2 = interfaceC4339a;
                f16 = f15;
                c2306l2 = c2306l;
                c0209i3 = c0209i;
                AbstractC30795n.m94707h(titleDisplay2, null, c38072d5.m121949b(c28655q7, i29).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q7, i29).getT3(), null, c28655q7, 0, C2886a.f11498d << 18, 196602);
                C28655q c28655q17 = c28655q7;
                c28655q17.m87173q(false);
                c28655q2 = c28655q17;
            } else {
                i16 = i15;
                interfaceC4339a2 = interfaceC4339a;
                c2314t2 = c2314t;
                c0209i3 = c0209i;
                c2306l2 = c2306l;
                f16 = f15;
                f17 = f13;
                r10 = 0;
                c28655q7.m87150e0(-1121505875);
                c28655q7.m87173q(false);
                c28655q2 = c28655q7;
            }
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q2, 48);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
            if (z13) {
                c28655q2.m87150e0(-63182416);
                C28655q c28655q18 = c28655q2;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(C38072d.f163053a.m121951d().getHealth().getPicker(), c28655q2, 6), null, AbstractC1102d.m3421r(c2314t2, f14, (float) 7.5d), C17919x.f69637n, c28655q18, 3504, 0);
                C28655q c28655q19 = c28655q18;
                AbstractC22953f.m66715b(c28655q19, AbstractC1102d.m3424u(5, c2314t2));
                c28655q19.m87173q(r10);
                c28655q3 = c28655q19;
            } else {
                c28655q2.m87150e0(-62758615);
                c28655q2.m87173q(r10);
                c28655q3 = c28655q2;
            }
            if (viewState.getPrimaryDescriptionDisplay() != null) {
                c28655q3.m87150e0(-62663631);
                String primaryDescriptionDisplay2 = viewState.getPrimaryDescriptionDisplay();
                C38072d c38072d6 = C38072d.f163053a;
                int i210 = C38072d.f163054b;
                C2886a b14 = c38072d6.m121952e(c28655q3, i210).getB2();
                long white71 = c38072d6.m121949b(c28655q3, i210).getWhite70();
                i17 = 18;
                C28655q c28655q110 = c28655q3;
                AbstractC30795n.m94707h(primaryDescriptionDisplay2, null, white71, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b14, null, c28655q110, 0, C2886a.f11498d << 18, 196602);
                C28655q c28655q111 = c28655q110;
                c28655q111.m87173q(r10);
                c28655q4 = c28655q111;
            } else {
                i17 = 18;
                c28655q3.m87150e0(-62438199);
                c28655q3.m87173q(r10);
                c28655q4 = c28655q3;
            }
            if (viewState.getPrimaryDescriptionDisplay() != null) {
                modifier3 = modifier2;
                f18 = f17;
                z14 = true;
                c28655q4.m87150e0(-61946167);
                c28655q4.m87173q(r10);
            } else {
                modifier3 = modifier2;
                f18 = f17;
                z14 = true;
                c28655q4.m87150e0(-61946167);
                c28655q4.m87173q(r10);
            }
            if (z13) {
                c28655q4.m87150e0(-61886678);
                C38072d c38072d7 = C38072d.f163053a;
                C28655q c28655q112 = c28655q4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d7.m121951d().getHealth().getPicker(), c28655q4, 6), null, AbstractC1127a.m3488c(AbstractC1102d.m3421r(c2314t2, f18, (float) 6.25d), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 180.0f, null, null, 0, 524031), c38072d7.m121949b(c28655q4, C38072d.f163054b).getWhite50(), c28655q112, 432, 0);
                C28655q c28655q113 = c28655q112;
                AbstractC22953f.m66715b(c28655q113, AbstractC1102d.m3424u(5, c2314t2));
                c28655q113.m87173q(r10);
                c28655q5 = c28655q113;
            } else {
                c28655q4.m87150e0(-61395607);
                c28655q4.m87173q(r10);
                c28655q5 = c28655q4;
            }
            if (viewState.getSecondaryDescriptionDisplay() != null) {
                c28655q5.m87150e0(-61298577);
                String secondaryDescriptionDisplay2 = viewState.getSecondaryDescriptionDisplay();
                C38072d c38072d8 = C38072d.f163053a;
                int i211 = C38072d.f163054b;
                C2886a b15 = c38072d8.m121952e(c28655q5, i211).getB2();
                C28655q c28655q114 = c28655q5;
                r14 = z14;
                AbstractC30795n.m94707h(secondaryDescriptionDisplay2, null, c38072d8.m121949b(c28655q5, i211).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b15, null, c28655q114, 0, C2886a.f11498d << 18, 196602);
                C28655q c28655q115 = c28655q114;
                c28655q115.m87173q(r10);
                c28655q6 = c28655q115;
            } else {
                r14 = z14;
                c28655q5.m87150e0(-61071223);
                c28655q5.m87173q(r10);
                c28655q6 = c28655q5;
            }
            c28655q6.m87173q(r14);
            c28655q6.m87173q(r14);
            c28655q6.m87150e0(-1234492630);
            while (r1.hasNext()) {
                if (interfaceC25312u instanceof C22256m) {
                    c28655q6.m87150e0(-1856771705);
                    function6 = function5;
                    AbstractC25303l.m74291r(interfaceC25312u, AbstractC24493c.m71286b(), null, function6, c28655q6, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                    AbstractC22953f.m66715b(c28655q6, AbstractC1099a.m3394p(((float) r14) * 8, c2314t2));
                    c28655q6.m87173q(r10);
                    f19 = f16;
                } else {
                    function6 = function5;
                    if (interfaceC25312u instanceof C26798d) {
                        f19 = f16;
                        AbstractC22953f.m66715b(c28655q6, AbstractC18489d0.m53365f(c28655q6, -1856526867, f19, f19, c2314t2));
                        AbstractC25303l.m74291r(interfaceC25312u, AbstractC24493c.m71286b(), null, function6, c28655q6, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                        c28655q6.m87173q(r10);
                    } else {
                        f19 = f16;
                        c28655q6.m87150e0(494308270);
                        AbstractC25303l.m74291r(interfaceC25312u, AbstractC24493c.m71286b(), null, function6, c28655q6, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                        c28655q6.m87173q(r10);
                    }
                }
                f16 = f19;
                function5 = function6;
            }
            c28655q6.m87173q(r10);
            c28655q6.m87173q(r14);
            function3 = function5;
            modifier2 = modifier3;
            c28655q = c28655q6;
        } else {
            c28655q7.m87138X();
            function3 = function2;
            c28655q = c28655q7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 26, modifier2, (Object) viewState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m59841d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m59842e(Modifier modifier, C27994a c27994a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m59840c(modifier, c27994a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
