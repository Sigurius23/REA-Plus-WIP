package mx1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import ax1.AbstractC2119a;
import b91.C2886a;
import bm0.C3412o;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jx1.C22004a;
import jx1.C22006b;
import jx1.C22016g;
import jx1.C22017g0;
import jx1.C22018h;
import jx1.C22020j;
import jx1.C22021k;
import jx1.C22027q;
import jx1.C22036z;
import k71.C22252i;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kl2.C22571f;
import l72.C23407n;
import l83.C23454a0;
import l83.C23465k;
import m31.C25002h;
import m83.AbstractC25267u;
import mi2.C25592o;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: mx1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a+\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Ljx1/q;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "B", "(Ljx1/q;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "title", "Lkd1/o;", "tierImage", "profilePhoto", "z", "(Ljava/lang/String;Lkd1/o;Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "", "Ljx1/z;", "membershipInfo", "F", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Ljx1/j;", "downgradingInfo", "r", "(Ljx1/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljx1/g0;", "switchBillingInfo", "H", "(Ljx1/g0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljx1/a;", "additionalInfo", "p", "(Ljx1/a;Landroidx/compose/runtime/Composer;I)V", "Ljx1/k;", "inactiveInfo", "v", "(Ljx1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26004j {

    /* JADX INFO: renamed from: mx1.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f102795w = new a();

        /* JADX INFO: renamed from: a */
        public final long m77205a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m77205a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m77168A(String str, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, int i13, Composer composer, int i14) {
        m77204z(str, abstractC22403o, abstractC22403o2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    /* JADX WARN: Code duplicated, block: B:58:0x017a  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0199  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x0202  */
    /* JADX WARN: Code duplicated, block: B:72:0x0210  */
    /* JADX WARN: Code duplicated, block: B:75:0x0251  */
    /* JADX WARN: Code duplicated, block: B:76:0x025c  */
    /* JADX WARN: Code duplicated, block: B:79:0x028d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0297  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:87:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0307  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7891. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:61)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:298)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX INFO: renamed from: B */
    public static final void m77169B(C22027q viewState, Modifier modifier, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean zM87157i;
        Object objM87133R;
        Modifier modifierM52565c;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        int iHashCode2;
        int i16;
        ?? r10;
        char c3;
        C28655q c28655q2;
        C22020j c22020jM62966b;
        Function1 function1;
        C28655q c28655q3;
        C22017g0 c22017g0M62971h;
        Function1 function2;
        C28655q c28655q4;
        C22004a c22004aM62965a;
        C28655q c28655q5;
        C22021k c22021kM62967c;
        C28655q c28655q6;
        int i17;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(619869339);
        if ((i13 & 6) == 0) {
            i15 = (c28655q7.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q7.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q7.m87157i(onViewEvent)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM44456i = AbstractC15751g.m44456i(1, AbstractC18489d0.m53364e(modifier4, 3, 4), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(16777215)), new C17919x(C38072d.f163053a.m121949b(c28655q7, C38072d.f163054b).getWhite10())), 0L, 0L, 14), AbstractC33253j.m105489e(12));
                boolean z13 = !viewState.getStyle().getBackgroundColors().isEmpty();
                zM87157i = c28655q7.m87157i(viewState);
                objM87133R = c28655q7.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C26000f(viewState, 0);
                    c28655q7.m87172p0(objM87133R);
                }
                Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM44456i, z13, (Function1) objM87133R);
                if (viewState.getStyle().getBackground() != null) {
                    modifierM52565c = AbstractC18249c.m52565c(c2314t, viewState.getStyle().getBackground());
                } else {
                    modifierM52565c = null;
                }
                float f13 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 2.5d) * f13, AbstractC15676d.m44103f(modifierM44099b, modifierM52565c));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q7, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f13), C2299e.f9110M, c28655q7, 6);
                iHashCode2 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q7.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, c2314t);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q7, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N2);
                String strM62973j = viewState.getTitle();
                AbstractC22403o abstractC22403oM62972i = viewState.getTierImage();
                AbstractC22403o abstractC22403oM62969f = viewState.getProfilePhoto();
                i16 = AbstractC22403o.f87638a;
                m77204z(strM62973j, abstractC22403oM62972i, abstractC22403oM62969f, c28655q7, (i16 << 3) | (i16 << 6));
                if (viewState.m62968e().isEmpty()) {
                    modifier3 = modifier4;
                    r10 = 0;
                    C28655q c28655q8 = c28655q7;
                    c3 = 3;
                    c28655q8.m87150e0(1562497963);
                    c28655q8.m87173q(false);
                    c28655q2 = c28655q8;
                } else {
                    c28655q7.m87150e0(1562398980);
                    modifier3 = modifier4;
                    c3 = 3;
                    r10 = 0;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q7, 0, 255);
                    C28655q c28655q9 = c28655q7;
                    m77173F(viewState.m62968e(), c28655q9, 0);
                    c28655q9.m87173q(false);
                    c28655q2 = c28655q9;
                }
                c22020jM62966b = viewState.getDowngradingInfo();
                if (c22020jM62966b == null) {
                    c28655q2.m87150e0(1562542695);
                    c28655q2.m87173q(r10);
                    function1 = onViewEvent;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(1562542696);
                    C28655q c28655q10 = c28655q2;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q10, 0, 255);
                    C28655q c28655q11 = c28655q10;
                    int i19 = C9598e.f28134d;
                    function1 = onViewEvent;
                    m77196r(c22020jM62966b, function1, c28655q11, i19 | i16 | i19 | ((i15 >> 3) & 112));
                    c28655q11.m87173q(r10);
                    c28655q3 = c28655q11;
                }
                c22017g0M62971h = viewState.getSwitchBillingInfo();
                if (c22017g0M62971h == null) {
                    c28655q3.m87150e0(1562715489);
                    c28655q3.m87173q(r10);
                    function2 = function1;
                    c28655q4 = c28655q3;
                } else {
                    c28655q3.m87150e0(1562715490);
                    C28655q c28655q12 = c28655q3;
                    function2 = onViewEvent;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q12, 0, 255);
                    C28655q c28655q13 = c28655q12;
                    m77175H(c22017g0M62971h, function2, c28655q13, C9598e.f28134d | ((i15 >> 3) & 112));
                    c28655q13.m87173q(r10);
                    c28655q4 = c28655q13;
                }
                c22004aM62965a = viewState.getAdditionalInfo();
                if (c22004aM62965a == null) {
                    c28655q4.m87150e0(1562890391);
                    c28655q4.m87173q(r10);
                    c28655q5 = c28655q4;
                } else {
                    c28655q4.m87150e0(1562890392);
                    C28655q c28655q14 = c28655q4;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q14, 0, 255);
                    C28655q c28655q15 = c28655q14;
                    m77194p(c22004aM62965a, c28655q15, r10);
                    c28655q15.m87173q(r10);
                    c28655q5 = c28655q15;
                }
                c22021kM62967c = viewState.getInactiveInfo();
                if (c22021kM62967c == null) {
                    c28655q5.m87150e0(1563042384);
                    c28655q5.m87173q(r10);
                    c28655q6 = c28655q5;
                } else {
                    c28655q5.m87150e0(1563042385);
                    C28655q c28655q16 = c28655q5;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q16, 0, 255);
                    C28655q c28655q17 = c28655q16;
                    m77200v(c22021kM62967c, function2, c28655q17, ((i15 >> 3) & 112) | C9598e.f28134d);
                    c28655q17.m87173q(r10);
                    c28655q6 = c28655q17;
                }
                c28655q6.m87173q(true);
                c28655q6.m87173q(true);
                c28655q = c28655q6;
            } else {
                C28655q c28655q18 = c28655q7;
                c28655q18.m87138X();
                modifier3 = modifier2;
                c28655q = c28655q18;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 5, modifier3, onViewEvent, viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q7.m87157i(onViewEvent)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q7.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM44456i2 = AbstractC15751g.m44456i(1, AbstractC18489d0.m53364e(modifier4, 3, 4), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(16777215)), new C17919x(C38072d.f163053a.m121949b(c28655q7, C38072d.f163054b).getWhite10())), 0L, 0L, 14), AbstractC33253j.m105489e(12));
            boolean z14 = !viewState.getStyle().getBackgroundColors().isEmpty();
            zM87157i = c28655q7.m87157i(viewState);
            objM87133R = c28655q7.m87133R();
            if (zM87157i) {
                objM87133R = new C26000f(viewState, 0);
                c28655q7.m87172p0(objM87133R);
            } else {
                objM87133R = new C26000f(viewState, 0);
                c28655q7.m87172p0(objM87133R);
            }
            Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM44456i2, z14, (Function1) objM87133R);
            if (viewState.getStyle().getBackground() != null) {
                modifierM52565c = AbstractC18249c.m52565c(c2314t, viewState.getStyle().getBackground());
            } else {
                modifierM52565c = null;
            }
            float f14 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 2.5d) * f14, AbstractC15676d.m44103f(modifierM44099b2, modifierM52565c));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q7.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q7, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a);
            } else {
                c28655q7.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q7, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N3);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f14), C2299e.f9110M, c28655q7, 6);
            iHashCode2 = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q7.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q7, c2314t);
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q7, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N4);
            String strM62973j2 = viewState.getTitle();
            AbstractC22403o abstractC22403oM62972i2 = viewState.getTierImage();
            AbstractC22403o abstractC22403oM62969f2 = viewState.getProfilePhoto();
            i16 = AbstractC22403o.f87638a;
            m77204z(strM62973j2, abstractC22403oM62972i2, abstractC22403oM62969f2, c28655q7, (i16 << 3) | (i16 << 6));
            if (viewState.m62968e().isEmpty()) {
                c28655q7.m87150e0(1562398980);
                modifier3 = modifier4;
                c3 = 3;
                r10 = 0;
                AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q7, 0, 255);
                C28655q c28655q19 = c28655q7;
                m77173F(viewState.m62968e(), c28655q19, 0);
                c28655q19.m87173q(false);
                c28655q2 = c28655q19;
            } else {
                modifier3 = modifier4;
                r10 = 0;
                C28655q c28655q20 = c28655q7;
                c3 = 3;
                c28655q20.m87150e0(1562497963);
                c28655q20.m87173q(false);
                c28655q2 = c28655q20;
            }
            c22020jM62966b = viewState.getDowngradingInfo();
            if (c22020jM62966b == null) {
                c28655q2.m87150e0(1562542695);
                c28655q2.m87173q(r10);
                function1 = onViewEvent;
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(1562542696);
                C28655q c28655q110 = c28655q2;
                AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q110, 0, 255);
                C28655q c28655q111 = c28655q110;
                int i110 = C9598e.f28134d;
                function1 = onViewEvent;
                m77196r(c22020jM62966b, function1, c28655q111, i110 | i16 | i110 | ((i15 >> 3) & 112));
                c28655q111.m87173q(r10);
                c28655q3 = c28655q111;
            }
            c22017g0M62971h = viewState.getSwitchBillingInfo();
            if (c22017g0M62971h == null) {
                c28655q3.m87150e0(1562715489);
                c28655q3.m87173q(r10);
                function2 = function1;
                c28655q4 = c28655q3;
            } else {
                c28655q3.m87150e0(1562715490);
                C28655q c28655q112 = c28655q3;
                function2 = onViewEvent;
                AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q112, 0, 255);
                C28655q c28655q113 = c28655q112;
                m77175H(c22017g0M62971h, function2, c28655q113, C9598e.f28134d | ((i15 >> 3) & 112));
                c28655q113.m87173q(r10);
                c28655q4 = c28655q113;
            }
            c22004aM62965a = viewState.getAdditionalInfo();
            if (c22004aM62965a == null) {
                c28655q4.m87150e0(1562890391);
                c28655q4.m87173q(r10);
                c28655q5 = c28655q4;
            } else {
                c28655q4.m87150e0(1562890392);
                C28655q c28655q114 = c28655q4;
                AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q114, 0, 255);
                C28655q c28655q115 = c28655q114;
                m77194p(c22004aM62965a, c28655q115, r10);
                c28655q115.m87173q(r10);
                c28655q5 = c28655q115;
            }
            c22021kM62967c = viewState.getInactiveInfo();
            if (c22021kM62967c == null) {
                c28655q5.m87150e0(1563042384);
                c28655q5.m87173q(r10);
                c28655q6 = c28655q5;
            } else {
                c28655q5.m87150e0(1563042385);
                C28655q c28655q116 = c28655q5;
                AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q116, 0, 255);
                C28655q c28655q117 = c28655q116;
                m77200v(c22021kM62967c, function2, c28655q117, ((i15 >> 3) & 112) | C9598e.f28134d);
                c28655q117.m87173q(r10);
                c28655q6 = c28655q117;
            }
            c28655q6.m87173q(true);
            c28655q6.m87173q(true);
            c28655q = c28655q6;
        } else {
            C28655q c28655q118 = c28655q7;
            c28655q118.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q118;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 5, modifier3, onViewEvent, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Modifier m77170C(C22027q c22027q, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1125a.m3478a(AbstractC18249c.m52565c(C2314t.f9131w, AbstractC18249c.m52575m(p745y81.Function1.m125323a(a.f102795w))), new C26000f(c22027q, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m77171D(C22027q c22027q, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        C17909s c17909s = AbstractC17911t.f69612b;
        List<C22006b> backgroundColors = c22027q.getStyle().getBackgroundColors();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(backgroundColors, 10));
        for (C22006b c22006b : backgroundColors) {
            arrayList.add(new C23465k(Float.valueOf(c22006b.getStop()), new C17919x(c22006b.getColor())));
        }
        C23465k[] c23465kArr = (C23465k[]) arrayList.toArray(new C23465k[0]);
        C23465k[] c23465kArr2 = (C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        float fHypot = (float) Math.hypot(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)));
        c17909s.getClass();
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51488f(c23465kArr2, jFloatToRawIntBits, fHypot, 3), 0L, 0L, c22027q.getStyle().getAlpha(), null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m77172E(C22027q c22027q, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m77169B(c22027q, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: F */
    private static final void m77173F(List<C22036z> list, Composer composer, int i13) {
        C28655q c28655q;
        int i14;
        C28655q c28655q2;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1499507050);
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q3.m87157i(list) ? 4 : 2) : i13;
        int i16 = 0;
        boolean z4 = true;
        if (c28655q3.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * 4);
            float f13 = 1.0f;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            c28655q3.m87150e0(-657928310);
            List<C22036z> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            C28655q c28655q4 = c28655q3;
            for (C22036z c22036z : list2) {
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, z4);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, i16);
                int iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, layoutWeightElement);
                InterfaceC0221l.f734a.getClass();
                InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
                String strM63018b = c22036z.getTitle();
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                long jM125385c1 = c38072d.m121949b(c28655q4, i17).getWhite70();
                C2886a c2886aM8438s = c38072d.m121952e(c28655q4, i17).getH5();
                int i18 = C2886a.f11498d << 18;
                C28655q c28655q5 = c28655q4;
                ArrayList arrayList2 = arrayList;
                C2314t c2314t2 = c2314t;
                AbstractC30795n.m94707h(strM63018b, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q5, 0, i18, 196602);
                AbstractC30795n.m94707h(c22036z.getValue(), AbstractC1102d.m3409f(1.0f, c2314t2), c38072d.m121949b(c28655q5, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i17).getN7(), null, c28655q5, 48, i18, 196600);
                C28655q c28655q6 = c28655q5;
                String strM63017a = c22036z.getSubtitle();
                if (strM63017a == null) {
                    c28655q6.m87150e0(1252901721);
                    c28655q6.m87173q(false);
                    i14 = 0;
                    c28655q2 = c28655q6;
                } else {
                    i14 = 0;
                    AbstractC30795n.m94707h(strM63017a, null, AbstractC25012a.m73370c(c28655q6, 1252901722, c38072d, c28655q6, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q6, i17).getB4(), null, c28655q6, 0, i18, 196602);
                    C28655q c28655q7 = c28655q6;
                    c28655q7.m87173q(false);
                    c28655q2 = c28655q7;
                }
                c28655q2.m87173q(true);
                arrayList2.add(C23454a0.f92919a);
                i16 = i14;
                arrayList = arrayList2;
                z4 = true;
                c2314t = c2314t2;
                f13 = 1.0f;
                c28655q4 = c28655q2;
            }
            c28655q4.m87173q(i16);
            c28655q4.m87173q(z4);
            c28655q = c28655q4;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m77174G(List list, int i13, Composer composer, int i14) {
        m77173F(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0407  */
    /* JADX WARN: Code duplicated, block: B:103:0x040c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0410  */
    /* JADX WARN: Code duplicated, block: B:107:0x0414  */
    /* JADX WARN: Code duplicated, block: B:110:0x041d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0421  */
    /* JADX WARN: Code duplicated, block: B:116:0x042b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0433  */
    /* JADX WARN: Code duplicated, block: B:95:0x038a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0390  */
    /* JADX INFO: renamed from: H */
    private static final void m77175H(C22017g0 c22017g0, final Function1 function1, Composer composer, int i13) {
        int i14;
        final Function1 function2;
        final C22017g0 c22017g1;
        C0213j c0213j;
        C0209i c0209i;
        final C22017g0 c22017g2;
        boolean z4;
        boolean z13;
        Object objM87133R;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2128902695);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c22017g0) : c28655q.m87157i(c22017g0) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f13 = 8;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * f13);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            C22961h c22961h = AbstractC22977m.f90656g;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            float f14 = ((float) 0.5d) * f13;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            String strM62930f = c22017g0.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125385c1 = c38072d.m121949b(c28655q, i16).getWhite70();
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i16).getH4();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM62930f, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i17, 196602);
            AbstractC30795n.m94707h(c22017g0.getSubtitle(), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 0, i17, 196602);
            c28655q.m87173q(true);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 6);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            C0209i c0209i6 = c0209i;
            C0213j c0213j3 = c0213j;
            AbstractC30795n.m94707h(c22017g0.getStrikethroughPrice(), null, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i16).getSh5(), C23285v0.m67364b(c38072d.m121952e(c28655q, i16).getSh5().getStyle(), 0L, 0L, null, null, 0L, 0, 0L, null, null, 16773119), null, 2, null), null, c28655q, 0, i17, 196602);
            AbstractC30795n.m94707h(c22017g0.getPrice(), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 0, i17, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, c2305k, c28655q, 6);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i16).getBrandWhite(), c38072d.m121949b(c28655q, i16).getBrandBlack(), 0L, 0L, c28655q, 0, 12);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c22017g0.getPrimaryCta().getText());
            int i18 = i15 & 112;
            boolean z17 = i18 == 32;
            int i19 = i15 & 14;
            if (i19 != 4) {
                if ((i15 & 8) != 0) {
                    c22017g2 = c22017g0;
                    if (c28655q.m87157i(c22017g2)) {
                    }
                    z13 = z17 | z4;
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z13 || objM87133R == c28676v0) {
                        final int i24 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: mx1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i24) {
                                    case 0:
                                        return AbstractC26004j.m77176I(function1, c22017g2);
                                    default:
                                        return AbstractC26004j.m77177J(function1, c22017g2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    int i25 = (TextResource.$stable << 18) | 6;
                    AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, i25, 0, 7998);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i16).getWhite20(), c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c22017g0.getSecondaryCta().getText());
                    if (i18 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i19 != 4) {
                        if ((i15 & 8) != 0) {
                            c22017g1 = c22017g0;
                            if (c28655q.m87157i(c22017g1)) {
                            }
                            z16 = z15 | z14;
                            objM87133R2 = c28655q.m87133R();
                            if (!z16 || objM87133R2 == c28676v0) {
                                function2 = function1;
                                final int i26 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC26004j.m77176I(function2, c22017g1);
                                            default:
                                                return AbstractC26004j.m77177J(function2, c22017g1);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                function2 = function1;
                            }
                            AbstractC27292z.m82343j(modifierM3409f3, false, false, null, null, null, textResourceM21278l2, c15077m1M43196a2, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i25, 0, 7998);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                        } else {
                            c22017g1 = c22017g0;
                        }
                        z15 = false;
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            function2 = function1;
                            final int i27 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i27) {
                                        case 0:
                                            return AbstractC26004j.m77176I(function2, c22017g1);
                                        default:
                                            return AbstractC26004j.m77177J(function2, c22017g1);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function2 = function1;
                            final int i28 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i28) {
                                        case 0:
                                            return AbstractC26004j.m77176I(function2, c22017g1);
                                        default:
                                            return AbstractC26004j.m77177J(function2, c22017g1);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27292z.m82343j(modifierM3409f3, false, false, null, null, null, textResourceM21278l2, c15077m1M43196a2, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i25, 0, 7998);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                    } else {
                        c22017g1 = c22017g0;
                    }
                    z15 = true;
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        function2 = function1;
                        final int i29 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i29) {
                                    case 0:
                                        return AbstractC26004j.m77176I(function2, c22017g1);
                                    default:
                                        return AbstractC26004j.m77177J(function2, c22017g1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function2 = function1;
                        final int i210 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i210) {
                                    case 0:
                                        return AbstractC26004j.m77176I(function2, c22017g1);
                                    default:
                                        return AbstractC26004j.m77177J(function2, c22017g1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82343j(modifierM3409f3, false, false, null, null, null, textResourceM21278l2, c15077m1M43196a2, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i25, 0, 7998);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                } else {
                    c22017g2 = c22017g0;
                }
                z4 = false;
                z13 = z17 | z4;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (z13) {
                    final int i211 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: mx1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211) {
                                case 0:
                                    return AbstractC26004j.m77176I(function1, c22017g2);
                                default:
                                    return AbstractC26004j.m77177J(function1, c22017g2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i212 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: mx1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i212) {
                                case 0:
                                    return AbstractC26004j.m77176I(function1, c22017g2);
                                default:
                                    return AbstractC26004j.m77177J(function1, c22017g2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                int i213 = (TextResource.$stable << 18) | 6;
                AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, i213, 0, 7998);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                C15077m1 c15077m1M43196a3 = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i16).getWhite20(), c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c22017g0.getSecondaryCta().getText());
                if (i18 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i19 != 4) {
                    if ((i15 & 8) != 0) {
                        c22017g1 = c22017g0;
                        if (c28655q.m87157i(c22017g1)) {
                        }
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            function2 = function1;
                            final int i214 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i214) {
                                        case 0:
                                            return AbstractC26004j.m77176I(function2, c22017g1);
                                        default:
                                            return AbstractC26004j.m77177J(function2, c22017g1);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function2 = function1;
                            final int i215 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i215) {
                                        case 0:
                                            return AbstractC26004j.m77176I(function2, c22017g1);
                                        default:
                                            return AbstractC26004j.m77177J(function2, c22017g1);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27292z.m82343j(modifierM3409f4, false, false, null, null, null, textResourceM21278l3, c15077m1M43196a3, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i213, 0, 7998);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                    } else {
                        c22017g1 = c22017g0;
                    }
                    z15 = false;
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        function2 = function1;
                        final int i216 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i216) {
                                    case 0:
                                        return AbstractC26004j.m77176I(function2, c22017g1);
                                    default:
                                        return AbstractC26004j.m77177J(function2, c22017g1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function2 = function1;
                        final int i217 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i217) {
                                    case 0:
                                        return AbstractC26004j.m77176I(function2, c22017g1);
                                    default:
                                        return AbstractC26004j.m77177J(function2, c22017g1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82343j(modifierM3409f4, false, false, null, null, null, textResourceM21278l3, c15077m1M43196a3, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i213, 0, 7998);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                } else {
                    c22017g1 = c22017g0;
                }
                z15 = true;
                z16 = z15 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    function2 = function1;
                    final int i218 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i218) {
                                case 0:
                                    return AbstractC26004j.m77176I(function2, c22017g1);
                                default:
                                    return AbstractC26004j.m77177J(function2, c22017g1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function2 = function1;
                    final int i219 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i219) {
                                case 0:
                                    return AbstractC26004j.m77176I(function2, c22017g1);
                                default:
                                    return AbstractC26004j.m77177J(function2, c22017g1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27292z.m82343j(modifierM3409f4, false, false, null, null, null, textResourceM21278l3, c15077m1M43196a3, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i213, 0, 7998);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c22017g2 = c22017g0;
            }
            z4 = true;
            z13 = z17 | z4;
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (z13) {
                final int i2110 = 0;
                objM87133R = new InterfaceC4339a() { // from class: mx1.h
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2110) {
                            case 0:
                                return AbstractC26004j.m77176I(function1, c22017g2);
                            default:
                                return AbstractC26004j.m77177J(function1, c22017g2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                final int i2111 = 0;
                objM87133R = new InterfaceC4339a() { // from class: mx1.h
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2111) {
                            case 0:
                                return AbstractC26004j.m77176I(function1, c22017g2);
                            default:
                                return AbstractC26004j.m77177J(function1, c22017g2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            int i2112 = (TextResource.$stable << 18) | 6;
            AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, i2112, 0, 7998);
            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
            C15077m1 c15077m1M43196a4 = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i16).getWhite20(), c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c22017g0.getSecondaryCta().getText());
            if (i18 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (i19 != 4) {
                if ((i15 & 8) != 0) {
                    c22017g1 = c22017g0;
                    if (c28655q.m87157i(c22017g1)) {
                    }
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        function2 = function1;
                        final int i2113 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2113) {
                                    case 0:
                                        return AbstractC26004j.m77176I(function2, c22017g1);
                                    default:
                                        return AbstractC26004j.m77177J(function2, c22017g1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function2 = function1;
                        final int i2114 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2114) {
                                    case 0:
                                        return AbstractC26004j.m77176I(function2, c22017g1);
                                    default:
                                        return AbstractC26004j.m77177J(function2, c22017g1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82343j(modifierM3409f5, false, false, null, null, null, textResourceM21278l4, c15077m1M43196a4, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i2112, 0, 7998);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                } else {
                    c22017g1 = c22017g0;
                }
                z15 = false;
                z16 = z15 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    function2 = function1;
                    final int i2115 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2115) {
                                case 0:
                                    return AbstractC26004j.m77176I(function2, c22017g1);
                                default:
                                    return AbstractC26004j.m77177J(function2, c22017g1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function2 = function1;
                    final int i2116 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2116) {
                                case 0:
                                    return AbstractC26004j.m77176I(function2, c22017g1);
                                default:
                                    return AbstractC26004j.m77177J(function2, c22017g1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27292z.m82343j(modifierM3409f5, false, false, null, null, null, textResourceM21278l4, c15077m1M43196a4, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i2112, 0, 7998);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c22017g1 = c22017g0;
            }
            z15 = true;
            z16 = z15 | z14;
            objM87133R2 = c28655q.m87133R();
            if (z16) {
                function2 = function1;
                final int i2117 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2117) {
                            case 0:
                                return AbstractC26004j.m77176I(function2, c22017g1);
                            default:
                                return AbstractC26004j.m77177J(function2, c22017g1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            } else {
                function2 = function1;
                final int i2118 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: mx1.h
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2118) {
                            case 0:
                                return AbstractC26004j.m77176I(function2, c22017g1);
                            default:
                                return AbstractC26004j.m77177J(function2, c22017g1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27292z.m82343j(modifierM3409f5, false, false, null, null, null, textResourceM21278l4, c15077m1M43196a4, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i2112, 0, 7998);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            function2 = function1;
            c22017g1 = c22017g0;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(c22017g1, function2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m77176I(Function1 function1, C22017g0 c22017g0) {
        function1.invoke(new AbstractC2119a.i(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        function1.invoke(c22017g0.getPrimaryCta().getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m77177J(Function1 function1, C22017g0 c22017g0) {
        function1.invoke(c22017g0.getSecondaryCta().getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m77178K(C22017g0 c22017g0, Function1 function1, int i13, Composer composer, int i14) {
        m77175H(c22017g0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m77194p(C22004a c22004a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(651601556);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(c22004a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM62885b = c22004a.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125385c1 = c38072d.m121949b(c28655q, i15).getWhite70();
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i15).getH4();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM62885b, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(c22004a.getContent(), null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(c22004a, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m77195q(C22004a c22004a, int i13, Composer composer, int i14) {
        m77194p(c22004a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0480 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0487  */
    /* JADX WARN: Code duplicated, block: B:123:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:125:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:127:0x051a  */
    /* JADX WARN: Code duplicated, block: B:128:0x051c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0528  */
    /* JADX WARN: Code duplicated, block: B:135:0x0530  */
    /* JADX INFO: renamed from: r */
    private static final void m77196r(C22020j c22020j, Function1 function1, Composer composer, int i13) {
        int i14;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C38072d c38072d;
        C2314t c2314t;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z4;
        C22020j c22020j2;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int i15;
        C38072d c38072d2;
        C22016g c22016gM62940d;
        boolean z15;
        boolean zM87157i;
        Object objM87133R2;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-358955887);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c22020j) : c28655q.m87157i(c22020j) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            float f13 = 3;
            float f14 = 8;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f13 * f14);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N);
            C22961h c22961h = AbstractC22977m.f90656g;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C2306l c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N2);
            float f15 = ((float) 0.5d) * f14;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f15);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N3);
            String strM62941e = c22020j.getTitle();
            long jM51517e = AbstractC17918w0.m51517e(4294551589L);
            C38072d c38072d3 = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d3.m121952e(c28655q, i17).getH4();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM62941e, null, jM51517e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 384, i18, 196602);
            float f16 = f13 * 4;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16), c2306l, c28655q, 6);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                c0209i = c0209i7;
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                c0209i = c0209i7;
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
            Modifier modifierM3411h = AbstractC1102d.m3411h(f16, c2314t2);
            AbstractC22403o abstractC22403oM62938b = c22020j.getFromMembership();
            int i19 = AbstractC22403o.f87638a;
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM62938b, null, null, c28655q, i19, 3);
            C39077b1 c39077b1 = C39102j.f168200b;
            C0209i c0209i9 = c0209i;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3411h, null, c39077b1, 0.0f, null, c28655q, 25008, 104);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.ARROW_FORWARD.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3411h(f16, c2314t2), c38072d3.m121949b(c28655q, i17).getBrandWhite(), c28655q, 432, 0);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c22020j.getToMembership(), null, null, c28655q, i19, 3), null, AbstractC1102d.m3411h(f16, c2314t2), null, c39077b1, 0.0f, null, c28655q, 25008, 104);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            if (c22020j.getDaysLeft() == null) {
                c28655q2.m87150e0(595242119);
                c28655q2.m87173q(false);
                z4 = true;
                c38072d = c38072d3;
                c2314t = c2314t2;
                c0209i4 = c0209i9;
                c0209i3 = c0209i8;
            } else {
                c28655q2.m87150e0(595242120);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9112O, c28655q2, 54);
                int iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                    c0209i2 = c0209i9;
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i2);
                } else {
                    c0209i2 = c0209i9;
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                String strM62932b = c22020j.getDaysLeft().getTitle();
                long jM125385c1 = c38072d3.m121949b(c28655q2, i17).getWhite70();
                C2886a c2886aM8438s = c38072d3.m121952e(c28655q2, i17).getH5();
                c38072d = c38072d3;
                c2314t = c2314t2;
                c0209i3 = c0209i8;
                c0209i4 = c0209i2;
                z4 = true;
                AbstractC30795n.m94707h(strM62932b, null, jM125385c1, 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q2, 0, i18, 196090);
                AbstractC30795n.m94707h(c22020j.getDaysLeft().getDays(), null, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB1(), null, c28655q2, 0, i18, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z4);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f14, c2305k, c28655q2, 6);
            int iHashCode6 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            C2314t c2314t3 = c2314t;
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N6);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t3);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C28655q c28655q3 = c28655q2;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i17).getBrandWhite(), c38072d.m121949b(c28655q2, i17).getBrandBlack(), 0L, 0L, c28655q3, 0, 12);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c22020j.getPrimaryCta().getText());
            int i24 = i16 & 112;
            boolean z16 = i24 == 32 ? z4 : false;
            if ((i16 & 14) != 4) {
                if ((i16 & 8) != 0) {
                    c22020j2 = c22020j;
                    if (c28655q3.m87157i(c22020j2)) {
                    }
                    z14 = z16 | z13;
                    objM87133R = c28655q3.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z14 || objM87133R == c28676v0) {
                        objM87133R = new C25592o(6, function1, c22020j2);
                        c28655q3.m87172p0(objM87133R);
                    }
                    i15 = (TextResource.$stable << 18) | 6;
                    c38072d2 = c38072d;
                    AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q3, i15, 0, 7998);
                    c28655q = c28655q3;
                    c22016gM62940d = c22020j.getSecondaryCta();
                    if (c22016gM62940d == null) {
                        c28655q.m87150e0(-1185123032);
                        c28655q.m87173q(false);
                        function2 = function1;
                    } else {
                        c28655q.m87150e0(-1185123031);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                        C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q, i17).getWhite20(), c38072d2.m121949b(c28655q, i17).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c22016gM62940d.getText());
                        if (i24 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87157i = z15 | c28655q.m87157i(c22016gM62940d);
                        objM87133R2 = c28655q.m87133R();
                        if (!zM87157i || objM87133R2 == c28676v0) {
                            function2 = function1;
                            objM87133R2 = new C26001g(function2, c22016gM62940d, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function2 = function1;
                        }
                        AbstractC27292z.m82343j(modifierM3409f3, false, false, null, null, null, textResourceM21278l2, c15077m1M43196a2, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i15, 0, 7998);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                } else {
                    c22020j2 = c22020j;
                }
                z13 = false;
                z14 = z16 | z13;
                objM87133R = c28655q3.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (z14) {
                    objM87133R = new C25592o(6, function1, c22020j2);
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = new C25592o(6, function1, c22020j2);
                    c28655q3.m87172p0(objM87133R);
                }
                i15 = (TextResource.$stable << 18) | 6;
                c38072d2 = c38072d;
                AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q3, i15, 0, 7998);
                c28655q = c28655q3;
                c22016gM62940d = c22020j.getSecondaryCta();
                if (c22016gM62940d == null) {
                    c28655q.m87150e0(-1185123032);
                    c28655q.m87173q(false);
                    function2 = function1;
                } else {
                    c28655q.m87150e0(-1185123031);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t3);
                    C15077m1 c15077m1M43196a3 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q, i17).getWhite20(), c38072d2.m121949b(c28655q, i17).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c22016gM62940d.getText());
                    if (i24 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i = z15 | c28655q.m87157i(c22016gM62940d);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        function2 = function1;
                        objM87133R2 = new C26001g(function2, c22016gM62940d, 1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function2 = function1;
                        objM87133R2 = new C26001g(function2, c22016gM62940d, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82343j(modifierM3409f4, false, false, null, null, null, textResourceM21278l3, c15077m1M43196a3, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i15, 0, 7998);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c22020j2 = c22020j;
            }
            z13 = z4;
            z14 = z16 | z13;
            objM87133R = c28655q3.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (z14) {
                objM87133R = new C25592o(6, function1, c22020j2);
                c28655q3.m87172p0(objM87133R);
            } else {
                objM87133R = new C25592o(6, function1, c22020j2);
                c28655q3.m87172p0(objM87133R);
            }
            i15 = (TextResource.$stable << 18) | 6;
            c38072d2 = c38072d;
            AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q3, i15, 0, 7998);
            c28655q = c28655q3;
            c22016gM62940d = c22020j.getSecondaryCta();
            if (c22016gM62940d == null) {
                c28655q.m87150e0(-1185123032);
                c28655q.m87173q(false);
                function2 = function1;
            } else {
                c28655q.m87150e0(-1185123031);
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t3);
                C15077m1 c15077m1M43196a4 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q, i17).getWhite20(), c38072d2.m121949b(c28655q, i17).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c22016gM62940d.getText());
                if (i24 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = z15 | c28655q.m87157i(c22016gM62940d);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    function2 = function1;
                    objM87133R2 = new C26001g(function2, c22016gM62940d, 1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function2 = function1;
                    objM87133R2 = new C26001g(function2, c22016gM62940d, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27292z.m82343j(modifierM3409f5, false, false, null, null, null, textResourceM21278l4, c15077m1M43196a4, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i15, 0, 7998);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(c22020j, function2, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m77197s(Function1 function1, C22020j c22020j) {
        String strM62931a;
        C22018h c22018hM62937a = c22020j.getDaysLeft();
        if (c22018hM62937a == null || (strM62931a = c22018hM62937a.getDays()) == null) {
            strM62931a = "";
        }
        function1.invoke(new AbstractC2119a.a(null, null, strM62931a, null, c22020j.getTrackingTier(), null, 43, null));
        function1.invoke(c22020j.getPrimaryCta().getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m77198t(Function1 function1, C22016g c22016g) {
        function1.invoke(c22016g.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m77199u(C22020j c22020j, Function1 function1, int i13, Composer composer, int i14) {
        m77196r(c22020j, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:111:0x0405  */
    /* JADX WARN: Code duplicated, block: B:113:0x0414  */
    /* JADX WARN: Code duplicated, block: B:115:0x044a  */
    /* JADX WARN: Code duplicated, block: B:116:0x044c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0458  */
    /* JADX WARN: Code duplicated, block: B:123:0x0460  */
    /* JADX INFO: renamed from: v */
    private static final void m77200v(C22021k c22021k, Function1 function1, Composer composer, int i13) {
        int i14;
        C0213j c0213j;
        C0209i c0209i;
        C0213j c0213j2;
        C0209i c0209i2;
        C2314t c2314t;
        C0209i c0209i3;
        C0209i c0209i4;
        C0209i c0209i5;
        C22021k c22021k2;
        boolean z4;
        boolean z13;
        Object objM87133R;
        int i15;
        C22016g c22016gM62946c;
        boolean z14;
        boolean zM87157i;
        Object objM87133R2;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1757815199);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c22021k) : c28655q.m87157i(c22021k) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            float f13 = 8;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * f13);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j3 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
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
            C22961h c22961h = AbstractC22977m.f90656g;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N2);
            float f14 = ((float) 0.5d) * f13;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i8);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N3);
            String strM62948e = c22021k.getTitle();
            long jM51517e = AbstractC17918w0.m51517e(4294551589L);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i17).getH4();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM62948e, null, jM51517e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 384, i18, 196602);
            AbstractC30795n.m94707h(c22021k.getSubtitle(), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getSh3(), null, c28655q, 0, i18, 196602);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            if (c22021k.getDaysLeft() == null) {
                c28655q2.m87150e0(430884861);
                c28655q2.m87173q(false);
                c0213j2 = c0213j3;
                c0209i2 = c0209i6;
                c0209i5 = c0209i7;
                c0209i3 = c0209i8;
                c0209i4 = c0209i9;
                c2314t = c2314t2;
            } else {
                c28655q2.m87150e0(430884862);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9112O, c28655q2, 54);
                int iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j = c0213j3;
                    c28655q2.m87163l(c0213j);
                } else {
                    c0213j = c0213j3;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                    c0209i = c0209i8;
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    c0209i = c0209i8;
                }
                AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
                c0213j2 = c0213j;
                c0209i2 = c0209i6;
                c2314t = c2314t2;
                c0209i3 = c0209i;
                c0209i4 = c0209i9;
                c0209i5 = c0209i7;
                AbstractC30795n.m94707h(c22021k.getDaysLeft().getTitle(), null, c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getH5(), null, c28655q2, 0, i18, 196090);
                AbstractC30795n.m94707h(c22021k.getDaysLeft().getDays(), null, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB1(), null, c28655q2, 0, i18, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, c2305k, c28655q2, 6);
            int iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            C2314t c2314t3 = c2314t;
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t3);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i17).getBrandWhite(), c38072d.m121949b(c28655q2, i17).getBrandBlack(), 0L, 0L, c28655q2, 0, 12);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c22021k.getPrimaryCta().getText());
            int i19 = i16 & 112;
            boolean z15 = i19 == 32;
            if ((i16 & 14) != 4) {
                if ((i16 & 8) != 0) {
                    c22021k2 = c22021k;
                    if (c28655q2.m87157i(c22021k2)) {
                    }
                    z13 = z4 | z15;
                    objM87133R = c28655q2.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C25592o(5, function1, c22021k2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    i15 = (TextResource.$stable << 18) | 6;
                    C28655q c28655q3 = c28655q2;
                    AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q3, i15, 0, 7998);
                    c28655q = c28655q3;
                    c22016gM62946c = c22021k.getSecondaryCta();
                    if (c22016gM62946c == null) {
                        c28655q.m87150e0(-1051222344);
                        c28655q.m87173q(false);
                        function2 = function1;
                    } else {
                        c28655q.m87150e0(-1051222343);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                        C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i17).getWhite20(), c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c22016gM62946c.getText());
                        if (i19 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i = c28655q.m87157i(c22016gM62946c) | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (!zM87157i || objM87133R2 == c28676v0) {
                            function2 = function1;
                            objM87133R2 = new C26001g(function2, c22016gM62946c, 0);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function2 = function1;
                        }
                        AbstractC27292z.m82343j(modifierM3409f3, false, false, null, null, null, textResourceM21278l2, c15077m1M43196a2, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i15, 0, 7998);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                } else {
                    c22021k2 = c22021k;
                }
                z4 = false;
                z13 = z4 | z15;
                objM87133R = c28655q2.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (z13) {
                    objM87133R = new C25592o(5, function1, c22021k2);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C25592o(5, function1, c22021k2);
                    c28655q2.m87172p0(objM87133R);
                }
                i15 = (TextResource.$stable << 18) | 6;
                C28655q c28655q4 = c28655q2;
                AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q4, i15, 0, 7998);
                c28655q = c28655q4;
                c22016gM62946c = c22021k.getSecondaryCta();
                if (c22016gM62946c == null) {
                    c28655q.m87150e0(-1051222344);
                    c28655q.m87173q(false);
                    function2 = function1;
                } else {
                    c28655q.m87150e0(-1051222343);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t3);
                    C15077m1 c15077m1M43196a3 = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i17).getWhite20(), c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c22016gM62946c.getText());
                    if (i19 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = c28655q.m87157i(c22016gM62946c) | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        function2 = function1;
                        objM87133R2 = new C26001g(function2, c22016gM62946c, 0);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function2 = function1;
                        objM87133R2 = new C26001g(function2, c22016gM62946c, 0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82343j(modifierM3409f4, false, false, null, null, null, textResourceM21278l3, c15077m1M43196a3, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i15, 0, 7998);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c22021k2 = c22021k;
            }
            z4 = true;
            z13 = z4 | z15;
            objM87133R = c28655q2.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (z13) {
                objM87133R = new C25592o(5, function1, c22021k2);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C25592o(5, function1, c22021k2);
                c28655q2.m87172p0(objM87133R);
            }
            i15 = (TextResource.$stable << 18) | 6;
            C28655q c28655q5 = c28655q2;
            AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q5, i15, 0, 7998);
            c28655q = c28655q5;
            c22016gM62946c = c22021k.getSecondaryCta();
            if (c22016gM62946c == null) {
                c28655q.m87150e0(-1051222344);
                c28655q.m87173q(false);
                function2 = function1;
            } else {
                c28655q.m87150e0(-1051222343);
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t3);
                C15077m1 c15077m1M43196a4 = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i17).getWhite20(), c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c22016gM62946c.getText());
                if (i19 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = c28655q.m87157i(c22016gM62946c) | z14;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    function2 = function1;
                    objM87133R2 = new C26001g(function2, c22016gM62946c, 0);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function2 = function1;
                    objM87133R2 = new C26001g(function2, c22016gM62946c, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27292z.m82343j(modifierM3409f5, false, false, null, null, null, textResourceM21278l4, c15077m1M43196a4, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i15, 0, 7998);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(c22021k, function2, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m77201w(Function1 function1, C22021k c22021k) {
        String strM62931a;
        C22018h c22018hM62944a = c22021k.getDaysLeft();
        if (c22018hM62944a == null || (strM62931a = c22018hM62944a.getDays()) == null) {
            strM62931a = "";
        }
        function1.invoke(new AbstractC2119a.b(null, null, strM62931a, null, c22021k.getTrackingTier(), null, 43, null));
        function1.invoke(c22021k.getPrimaryCta().getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m77202x(Function1 function1, C22016g c22016g) {
        function1.invoke(c22016g.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m77203y(C22021k c22021k, Function1 function1, int i13, Composer composer, int i14) {
        m77200v(c22021k, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m77204z(String str, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        float f13;
        C0209i c0209i;
        C0213j c0213j;
        C0209i c0209i2;
        C2314t c2314t;
        C0209i c0209i3;
        C0209i c0209i4;
        C28655q c28655q2;
        boolean z4;
        C0213j c0213j2;
        C0209i c0209i5;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1331539886);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q3.m87153g(abstractC22403o) : c28655q3.m87157i(abstractC22403o) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q3.m87153g(abstractC22403o2) : c28655q3.m87157i(abstractC22403o2) ? 256 : 128;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f14 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f14), C2299e.f9110M, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, c2314t2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j3 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j3);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i6, c23010xM66775a);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m);
            C0209i c0209i8 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i8);
            }
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N);
            if (str == null) {
                c28655q3.m87150e0(1512802922);
                c28655q3.m87173q(false);
                c0213j = c0213j3;
                i15 = i14;
                c0209i3 = c0209i6;
                c28655q2 = c28655q3;
                c0209i4 = c0209i7;
                f13 = f14;
                z4 = false;
                c0209i = c0209i9;
                c0209i2 = c0209i8;
                c2314t = c2314t2;
            } else {
                c28655q3.m87150e0(1512802923);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                i15 = i14;
                f13 = f14;
                c0209i = c0209i9;
                c0213j = c0213j3;
                c0209i2 = c0209i8;
                c2314t = c2314t2;
                c0209i3 = c0209i6;
                c0209i4 = c0209i7;
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q3, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i16).getH5(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                c28655q2 = c28655q3;
                z4 = false;
                c28655q2.m87173q(false);
            }
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C2314t c2314t3 = c2314t;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t3);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j2 = c0213j;
                c28655q2.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                c28655q2.m87178s0();
            }
            C0209i c0209i10 = c0209i3;
            AbstractC28683x.m87239G(c28655q2, c0209i10, c22994r1M66759a);
            C0209i c0209i11 = c0209i4;
            AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i5 = c0209i2;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i5);
            } else {
                c0209i5 = c0209i2;
            }
            C0209i c0209i12 = c0209i;
            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N2);
            int i17 = AbstractC22403o.f87638a;
            AbstractC26013s.m77305b(abstractC22403o, null, false, c28655q2, i17 | ((i15 >> 3) & 14), 6);
            float f15 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(10 * f15, c2314t3), 2, f15);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, z4);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM53364e);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N3);
            C28655q c28655q4 = c28655q2;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o2, null, null, c28655q2, i17 | ((i15 >> 6) & 14), 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13 * f15, c2314t3), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q4, 24624, 104);
            c28655q = c28655q4;
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(str, abstractC22403o, abstractC22403o2, i13, 14);
        }
    }
}
