package jp1;

import am2.C1012d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bm0.C3403f;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import fp1.C14673a;
import fp1.C14676d;
import gb1.AbstractC15673b0;
import hp1.AbstractC17546f;
import hp1.C17553m;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import io2.C20769k0;
import java.util.ArrayList;
import java.util.ListIterator;
import l83.C23454a0;
import m83.AbstractC25267u;
import n83.C26459b;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p251jg.C21650c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30784c;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39420x;

/* JADX INFO: renamed from: jp1.u */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhp1/m;", "viewState", "Lkotlin/Function1;", "Lhp1/f;", "Ll83/a0;", "onViewEvent", "n", "(Lhp1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lbs", "oz", "B", "(FF)F", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21869u {

    /* JADX INFO: renamed from: jp1.u$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"jp1/u$a", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC28620h0 {
        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m61969A(C17553m c17553m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m61984n(c17553m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final float m61970B(float f13, float f14) {
        return (float) ((((double) f14) * 28.3495d) + (((double) f13) * 453.592d));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029f  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:111:0x031d  */
    /* JADX WARN: Code duplicated, block: B:112:0x031f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0326  */
    /* JADX WARN: Code duplicated, block: B:118:0x0333  */
    /* JADX WARN: Code duplicated, block: B:123:0x0348  */
    /* JADX WARN: Code duplicated, block: B:125:0x034c  */
    /* JADX WARN: Code duplicated, block: B:126:0x034e  */
    /* JADX WARN: Code duplicated, block: B:129:0x035a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0361  */
    /* JADX WARN: Code duplicated, block: B:133:0x0366  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:152:0x040f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0429  */
    /* JADX WARN: Code duplicated, block: B:156:0x042b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0432  */
    /* JADX WARN: Code duplicated, block: B:163:0x043a  */
    /* JADX WARN: Code duplicated, block: B:165:0x044b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0455  */
    /* JADX WARN: Code duplicated, block: B:170:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[LOOP:0: B:116:0x032a->B:172:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0205  */
    /* JADX WARN: Code duplicated, block: B:95:0x0292  */
    /* JADX WARN: Code duplicated, block: B:98:0x029b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX INFO: renamed from: n */
    public static final void m61984n(C17553m viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        C39967p c39967p;
        Object objM87133R2;
        C39967p c39967p2;
        Object objM87133R3;
        C39967p c39967p3;
        boolean zM87157i;
        Object objM87133R4;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        int i17;
        boolean z13;
        Object objM87133R5;
        float f13;
        int iHashCode2;
        TextResource textResourceM49940c;
        float f14;
        boolean zM87157i2;
        Object objM87133R6;
        C28676v0 c28676v1;
        C39967p c39967p4;
        C39967p c39967p5;
        C39967p c39967p6;
        C28676v0 c28676v2;
        C39967p c39967p7;
        C39967p c39967p8;
        boolean z14;
        boolean z15;
        boolean zM87157i3;
        Object objM87133R7;
        C28676v0 c28676v3;
        C28676v0 c28676v4;
        C2314t c2314t2;
        int i18;
        C28676v0 c28676v5;
        ?? r15;
        ?? r10;
        Object objM87133R8;
        C28676v0 c28676v6;
        ListIterator listIterator;
        C26459b c26459b;
        Object objM87133R9;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-433984802);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C21650c(27);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function3 = (Function1) objM87133R9;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39967p();
                    c28655q2.m87172p0(objM87133R);
                }
                c39967p = (C39967p) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C39967p();
                    c28655q2.m87172p0(objM87133R2);
                }
                c39967p2 = (C39967p) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C39967p();
                    c28655q2.m87172p0(objM87133R3);
                }
                c39967p3 = (C39967p) objM87133R3;
                zM87157i = c28655q2.m87157i(viewState);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i || objM87133R4 == c28676v0) {
                    objM87133R4 = new C21868t(c39967p3, viewState, c39967p, c39967p2);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R4, c28655q2);
                c2314t = C2314t.f9131w;
                Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66725n);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    i16 = i15;
                } else {
                    i16 = i15;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    TextResource textResourceM49942e = viewState.getNavigationTitle();
                    TextResource textResourceM49941d = viewState.getNavigationSubtitle();
                    i17 = i16 & 112;
                    if (i17 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z13 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C21860l(function3, 3);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    int i24 = TextResource.$stable;
                    Function1 function4 = function3;
                    AbstractC21865q.m61949e(textResourceM49942e, textResourceM49941d, 0, null, null, (InterfaceC4339a) objM87133R5, c28655q2, i24 | (i24 << 3), 28);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(f13, true));
                    float f15 = 3;
                    float f16 = 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f15 * f16, c2314t);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    if (viewState.getCount() == 1) {
                        textResourceM49940c = viewState.getSingleTitle();
                    } else {
                        textResourceM49940c = viewState.getMultipleTitle();
                    }
                    String strM21274h = AbstractC8693b.m21274h(textResourceM49940c, c28655q2, i24);
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM21274h, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i25).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i25).getT1(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
                    float f17 = 4;
                    float f18 = f16 * f17;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f18, c2314t));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f14, false);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f18);
                    zM87157i2 = c28655q2.m87157i(viewState);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i2) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R6 == c28676v1) {
                            c39967p4 = c39967p;
                            c39967p5 = c39967p2;
                            c39967p6 = c39967p3;
                        }
                        c28676v2 = c28676v1;
                        c39967p7 = c39967p4;
                        C39967p c39967p9 = c39967p5;
                        c39967p8 = c39967p6;
                        AbstractC22674j.m65717c(layoutWeightElement, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R6, c28655q2, 24576, 494);
                        AbstractC18489d0.m53380u(7, f17, c2314t, c28655q2);
                        EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                        String strM21274h2 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i24);
                        long jM125399i0 = c38072d.m121949b(c28655q2, i25).getSleepLightSleep();
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (c39967p8.contains(Boolean.TRUE)) {
                            z14 = false;
                        } else {
                            if (c39967p7 != null || !c39967p7.isEmpty()) {
                                listIterator = c39967p7.listIterator();
                                while (true) {
                                    c26459b = (C26459b) listIterator;
                                    if (c26459b.hasNext()) {
                                        if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                            z14 = false;
                                        }
                                    }
                                }
                            }
                            z14 = true;
                        }
                        if (i17 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87157i3 = z15 | c28655q2.m87157i(viewState);
                        objM87133R7 = c28655q2.m87133R();
                        if (zM87157i3) {
                            c28676v3 = c28676v2;
                        } else {
                            c28676v3 = c28676v2;
                            if (objM87133R7 == c28676v3) {
                                c2314t2 = c2314t;
                                c28676v4 = c28676v3;
                            }
                            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, z14, jM125399i0, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                            c28655q = c28655q2;
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15 * f17, c2314t2));
                            if (viewState.getSkipNextId() != null || viewState.getSkipTitle() == null) {
                                i18 = i17;
                                c28676v5 = c28676v4;
                                r15 = 0;
                                c28655q.m87150e0(1899650224);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1899482049);
                                TextResource textResourceM49946i = viewState.getSkipTitle();
                                boolean zM87157i4 = (i17 == 32) | c28655q.m87157i(viewState);
                                Object objM87133R10 = c28655q.m87133R();
                                if (zM87157i4) {
                                    c28676v6 = c28676v4;
                                } else {
                                    c28676v6 = c28676v4;
                                    if (objM87133R10 == c28676v6) {
                                    }
                                    c28676v5 = c28676v6;
                                    i18 = i17;
                                    AbstractC27265l0.m82217i(null, null, textResourceM49946i, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q, TextResource.$stable << 6, 0, 4091);
                                    c28655q = c28655q;
                                    r15 = 0;
                                    c28655q.m87173q(false);
                                }
                                objM87133R10 = new C21851c(2, function4, viewState);
                                c28655q.m87172p0(objM87133R10);
                                c28676v5 = c28676v6;
                                i18 = i17;
                                AbstractC27265l0.m82217i(null, null, textResourceM49946i, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q, TextResource.$stable << 6, 0, 4091);
                                c28655q = c28655q;
                                r15 = 0;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            if (i18 == 32) {
                                r10 = 1;
                            } else {
                                r10 = r15;
                            }
                            objM87133R8 = c28655q.m87133R();
                            if (r10 == 0 || objM87133R8 == c28676v5) {
                                function2 = r15;
                                objM87133R8 = new C21860l(function2, 4);
                                c28655q.m87172p0(objM87133R8);
                            } else {
                                function2 = function4;
                            }
                            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                        }
                        c28676v4 = c28676v3;
                        c2314t2 = c2314t;
                        C1012d c1012d = new C1012d(function4, viewState, c39967p7, c39967p9, 18);
                        c28655q2.m87172p0(c1012d);
                        objM87133R7 = c1012d;
                        AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, z14, jM125399i0, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                        c28655q = c28655q2;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15 * f17, c2314t2));
                        if (viewState.getSkipNextId() != null) {
                            i18 = i17;
                            c28676v5 = c28676v4;
                            r15 = 0;
                            c28655q.m87150e0(1899650224);
                            c28655q.m87173q(false);
                        } else {
                            i18 = i17;
                            c28676v5 = c28676v4;
                            r15 = 0;
                            c28655q.m87150e0(1899650224);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        if (i18 == 32) {
                            r10 = 1;
                        } else {
                            r10 = r15;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (r10 == 0) {
                            function2 = r15;
                            objM87133R8 = new C21860l(function2, 4);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            function2 = r15;
                            objM87133R8 = new C21860l(function2, 4);
                            c28655q.m87172p0(objM87133R8);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                    }
                    c39967p4 = c39967p;
                    c39967p5 = c39967p2;
                    c39967p6 = c39967p3;
                    objM87133R6 = new C21868t(viewState, c39967p6, c39967p4, c39967p5);
                    c28655q2.m87172p0(objM87133R6);
                    c28676v2 = c28676v1;
                    c39967p7 = c39967p4;
                    C39967p c39967p10 = c39967p5;
                    c39967p8 = c39967p6;
                    AbstractC22674j.m65717c(layoutWeightElement, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R6, c28655q2, 24576, 494);
                    AbstractC18489d0.m53380u(7, f17, c2314t, c28655q2);
                    EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                    String strM21274h3 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i24);
                    long jM125399i1 = c38072d.m121949b(c28655q2, i25).getSleepLightSleep();
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (c39967p8.contains(Boolean.TRUE)) {
                        z14 = false;
                    } else {
                        if (c39967p7 != null) {
                            listIterator = c39967p7.listIterator();
                            while (true) {
                                c26459b = (C26459b) listIterator;
                                if (c26459b.hasNext()) {
                                    if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                        z14 = false;
                                    }
                                }
                            }
                        } else {
                            listIterator = c39967p7.listIterator();
                            while (true) {
                                c26459b = (C26459b) listIterator;
                                if (c26459b.hasNext()) {
                                    if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                        z14 = false;
                                    }
                                }
                            }
                        }
                        z14 = true;
                    }
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i3 = z15 | c28655q2.m87157i(viewState);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i3) {
                        c28676v3 = c28676v2;
                        if (objM87133R7 == c28676v3) {
                            c2314t2 = c2314t;
                            c28676v4 = c28676v3;
                        }
                        AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h3, z14, jM125399i1, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                        c28655q = c28655q2;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15 * f17, c2314t2));
                        if (viewState.getSkipNextId() != null) {
                            i18 = i17;
                            c28676v5 = c28676v4;
                            r15 = 0;
                            c28655q.m87150e0(1899650224);
                            c28655q.m87173q(false);
                        } else {
                            i18 = i17;
                            c28676v5 = c28676v4;
                            r15 = 0;
                            c28655q.m87150e0(1899650224);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        if (i18 == 32) {
                            r10 = 1;
                        } else {
                            r10 = r15;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (r10 == 0) {
                            function2 = r15;
                            objM87133R8 = new C21860l(function2, 4);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            function2 = r15;
                            objM87133R8 = new C21860l(function2, 4);
                            c28655q.m87172p0(objM87133R8);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                    } else {
                        c28676v3 = c28676v2;
                    }
                    c28676v4 = c28676v3;
                    c2314t2 = c2314t;
                    C1012d c1012d2 = new C1012d(function4, viewState, c39967p7, c39967p10, 18);
                    c28655q2.m87172p0(c1012d2);
                    objM87133R7 = c1012d2;
                    AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h3, z14, jM125399i1, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                    c28655q = c28655q2;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15 * f17, c2314t2));
                    if (viewState.getSkipNextId() != null) {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    } else {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i18 == 32) {
                        r10 = 1;
                    } else {
                        r10 = r15;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (r10 == 0) {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                TextResource textResourceM49942e2 = viewState.getNavigationTitle();
                TextResource textResourceM49941d2 = viewState.getNavigationSubtitle();
                i17 = i16 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R5 = c28655q2.m87133R();
                if (z13) {
                    objM87133R5 = new C21860l(function3, 3);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C21860l(function3, 3);
                    c28655q2.m87172p0(objM87133R5);
                }
                int i26 = TextResource.$stable;
                Function1 function5 = function3;
                AbstractC21865q.m61949e(textResourceM49942e2, textResourceM49941d2, 0, null, null, (InterfaceC4339a) objM87133R5, c28655q2, i26 | (i26 << 3), 28);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(f13, true));
                float f19 = 3;
                float f110 = 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f19 * f110, c2314t);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                if (viewState.getCount() == 1) {
                    textResourceM49940c = viewState.getSingleTitle();
                } else {
                    textResourceM49940c = viewState.getMultipleTitle();
                }
                String strM21274h4 = AbstractC8693b.m21274h(textResourceM49940c, c28655q2, i26);
                C38072d c38072d2 = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h4, AbstractC1102d.m3409f(1.0f, c2314t), c38072d2.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i27).getT1(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
                float f111 = 4;
                float f112 = f110 * f111;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f112, c2314t));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f14, false);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f112);
                zM87157i2 = c28655q2.m87157i(viewState);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i2) {
                    c28676v1 = c28676v0;
                    if (objM87133R6 == c28676v1) {
                        c39967p4 = c39967p;
                        c39967p5 = c39967p2;
                        c39967p6 = c39967p3;
                    }
                    c28676v2 = c28676v1;
                    c39967p7 = c39967p4;
                    C39967p c39967p11 = c39967p5;
                    c39967p8 = c39967p6;
                    AbstractC22674j.m65717c(layoutWeightElement2, null, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R6, c28655q2, 24576, 494);
                    AbstractC18489d0.m53380u(7, f111, c2314t, c28655q2);
                    EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                    String strM21274h5 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i26);
                    long jM125399i2 = c38072d2.m121949b(c28655q2, i27).getSleepLightSleep();
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (c39967p8.contains(Boolean.TRUE)) {
                        z14 = false;
                    } else {
                        if (c39967p7 != null) {
                            listIterator = c39967p7.listIterator();
                            while (true) {
                                c26459b = (C26459b) listIterator;
                                if (c26459b.hasNext()) {
                                    if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                        z14 = false;
                                    }
                                }
                            }
                        } else {
                            listIterator = c39967p7.listIterator();
                            while (true) {
                                c26459b = (C26459b) listIterator;
                                if (c26459b.hasNext()) {
                                    if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                        z14 = false;
                                    }
                                }
                            }
                        }
                        z14 = true;
                    }
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i3 = z15 | c28655q2.m87157i(viewState);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i3) {
                        c28676v3 = c28676v2;
                        if (objM87133R7 == c28676v3) {
                            c2314t2 = c2314t;
                            c28676v4 = c28676v3;
                        }
                        AbstractC27282u.m82292h(modifierM3409f3, enumC27284v3, strM21274h5, z14, jM125399i2, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                        c28655q = c28655q2;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19 * f111, c2314t2));
                        if (viewState.getSkipNextId() != null) {
                            i18 = i17;
                            c28676v5 = c28676v4;
                            r15 = 0;
                            c28655q.m87150e0(1899650224);
                            c28655q.m87173q(false);
                        } else {
                            i18 = i17;
                            c28676v5 = c28676v4;
                            r15 = 0;
                            c28655q.m87150e0(1899650224);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        if (i18 == 32) {
                            r10 = 1;
                        } else {
                            r10 = r15;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (r10 == 0) {
                            function2 = r15;
                            objM87133R8 = new C21860l(function2, 4);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            function2 = r15;
                            objM87133R8 = new C21860l(function2, 4);
                            c28655q.m87172p0(objM87133R8);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                    } else {
                        c28676v3 = c28676v2;
                    }
                    c28676v4 = c28676v3;
                    c2314t2 = c2314t;
                    C1012d c1012d3 = new C1012d(function5, viewState, c39967p7, c39967p11, 18);
                    c28655q2.m87172p0(c1012d3);
                    objM87133R7 = c1012d3;
                    AbstractC27282u.m82292h(modifierM3409f3, enumC27284v3, strM21274h5, z14, jM125399i2, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                    c28655q = c28655q2;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19 * f111, c2314t2));
                    if (viewState.getSkipNextId() != null) {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    } else {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i18 == 32) {
                        r10 = 1;
                    } else {
                        r10 = r15;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (r10 == 0) {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                } else {
                    c28676v1 = c28676v0;
                }
                c39967p4 = c39967p;
                c39967p5 = c39967p2;
                c39967p6 = c39967p3;
                objM87133R6 = new C21868t(viewState, c39967p6, c39967p4, c39967p5);
                c28655q2.m87172p0(objM87133R6);
                c28676v2 = c28676v1;
                c39967p7 = c39967p4;
                C39967p c39967p12 = c39967p5;
                c39967p8 = c39967p6;
                AbstractC22674j.m65717c(layoutWeightElement2, null, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R6, c28655q2, 24576, 494);
                AbstractC18489d0.m53380u(7, f111, c2314t, c28655q2);
                EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
                String strM21274h6 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i26);
                long jM125399i3 = c38072d2.m121949b(c28655q2, i27).getSleepLightSleep();
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (c39967p8.contains(Boolean.TRUE)) {
                    z14 = false;
                } else {
                    if (c39967p7 != null) {
                        listIterator = c39967p7.listIterator();
                        while (true) {
                            c26459b = (C26459b) listIterator;
                            if (c26459b.hasNext()) {
                                if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                    z14 = false;
                                }
                            }
                        }
                    } else {
                        listIterator = c39967p7.listIterator();
                        while (true) {
                            c26459b = (C26459b) listIterator;
                            if (c26459b.hasNext()) {
                                if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                    z14 = false;
                                }
                            }
                        }
                    }
                    z14 = true;
                }
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i3 = z15 | c28655q2.m87157i(viewState);
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i3) {
                    c28676v3 = c28676v2;
                    if (objM87133R7 == c28676v3) {
                        c2314t2 = c2314t;
                        c28676v4 = c28676v3;
                    }
                    AbstractC27282u.m82292h(modifierM3409f4, enumC27284v4, strM21274h6, z14, jM125399i3, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                    c28655q = c28655q2;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19 * f111, c2314t2));
                    if (viewState.getSkipNextId() != null) {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    } else {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i18 == 32) {
                        r10 = 1;
                    } else {
                        r10 = r15;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (r10 == 0) {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                } else {
                    c28676v3 = c28676v2;
                }
                c28676v4 = c28676v3;
                c2314t2 = c2314t;
                C1012d c1012d4 = new C1012d(function5, viewState, c39967p7, c39967p12, 18);
                c28655q2.m87172p0(c1012d4);
                objM87133R7 = c1012d4;
                AbstractC27282u.m82292h(modifierM3409f4, enumC27284v4, strM21274h6, z14, jM125399i3, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19 * f111, c2314t2));
                if (viewState.getSkipNextId() != null) {
                    i18 = i17;
                    c28676v5 = c28676v4;
                    r15 = 0;
                    c28655q.m87150e0(1899650224);
                    c28655q.m87173q(false);
                } else {
                    i18 = i17;
                    c28676v5 = c28676v4;
                    r15 = 0;
                    c28655q.m87150e0(1899650224);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i18 == 32) {
                    r10 = 1;
                } else {
                    r10 = r15;
                }
                objM87133R8 = c28655q.m87133R();
                if (r10 == 0) {
                    function2 = r15;
                    objM87133R8 = new C21860l(function2, 4);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function2 = r15;
                    objM87133R8 = new C21860l(function2, 4);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function2, i14, 8);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C21650c(27);
                    c28655q2.m87172p0(objM87133R9);
                }
                function3 = (Function1) objM87133R9;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C39967p();
                c28655q2.m87172p0(objM87133R);
            }
            c39967p = (C39967p) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C39967p();
                c28655q2.m87172p0(objM87133R2);
            }
            c39967p2 = (C39967p) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C39967p();
                c28655q2.m87172p0(objM87133R3);
            }
            c39967p3 = (C39967p) objM87133R3;
            zM87157i = c28655q2.m87157i(viewState);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R4 = new C21868t(c39967p3, viewState, c39967p, c39967p2);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C21868t(c39967p3, viewState, c39967p, c39967p2);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R4, c28655q2);
            c2314t = C2314t.f9131w;
            Modifier modifierM66725n2 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM66725n2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                i16 = i15;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                TextResource textResourceM49942e3 = viewState.getNavigationTitle();
                TextResource textResourceM49941d3 = viewState.getNavigationSubtitle();
                i17 = i16 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R5 = c28655q2.m87133R();
                if (z13) {
                    objM87133R5 = new C21860l(function3, 3);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C21860l(function3, 3);
                    c28655q2.m87172p0(objM87133R5);
                }
                int i28 = TextResource.$stable;
                Function1 function6 = function3;
                AbstractC21865q.m61949e(textResourceM49942e3, textResourceM49941d3, 0, null, null, (InterfaceC4339a) objM87133R5, c28655q2, i28 | (i28 << 3), 28);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(f13, true));
                float f113 = 3;
                float f114 = 8;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f113 * f114, c2314t);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, C2299e.f9111N, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3394p3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                if (viewState.getCount() == 1) {
                    textResourceM49940c = viewState.getSingleTitle();
                } else {
                    textResourceM49940c = viewState.getMultipleTitle();
                }
                String strM21274h7 = AbstractC8693b.m21274h(textResourceM49940c, c28655q2, i28);
                C38072d c38072d3 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h7, AbstractC1102d.m3409f(1.0f, c2314t), c38072d3.m121949b(c28655q2, i29).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i29).getT1(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
                float f115 = 4;
                float f116 = f114 * f115;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f116, c2314t));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f14, false);
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f116);
                zM87157i2 = c28655q2.m87157i(viewState);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i2) {
                    c28676v1 = c28676v0;
                    if (objM87133R6 == c28676v1) {
                        c39967p4 = c39967p;
                        c39967p5 = c39967p2;
                        c39967p6 = c39967p3;
                    }
                    c28676v2 = c28676v1;
                    c39967p7 = c39967p4;
                    C39967p c39967p13 = c39967p5;
                    c39967p8 = c39967p6;
                    AbstractC22674j.m65717c(layoutWeightElement3, null, null, c22971kM66746i3, null, null, false, null, (Function1) objM87133R6, c28655q2, 24576, 494);
                    AbstractC18489d0.m53380u(7, f115, c2314t, c28655q2);
                    EnumC27284v enumC27284v5 = EnumC27284v.TextLarge;
                    String strM21274h8 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i28);
                    long jM125399i4 = c38072d3.m121949b(c28655q2, i29).getSleepLightSleep();
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (c39967p8.contains(Boolean.TRUE)) {
                        z14 = false;
                    } else {
                        if (c39967p7 != null) {
                            listIterator = c39967p7.listIterator();
                            while (true) {
                                c26459b = (C26459b) listIterator;
                                if (c26459b.hasNext()) {
                                    if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                        z14 = false;
                                    }
                                }
                            }
                        } else {
                            listIterator = c39967p7.listIterator();
                            while (true) {
                                c26459b = (C26459b) listIterator;
                                if (c26459b.hasNext()) {
                                    if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                        z14 = false;
                                    }
                                }
                            }
                        }
                        z14 = true;
                    }
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i3 = z15 | c28655q2.m87157i(viewState);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i3) {
                        c28676v3 = c28676v2;
                        if (objM87133R7 == c28676v3) {
                            c2314t2 = c2314t;
                            c28676v4 = c28676v3;
                        }
                        AbstractC27282u.m82292h(modifierM3409f5, enumC27284v5, strM21274h8, z14, jM125399i4, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                        c28655q = c28655q2;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f113 * f115, c2314t2));
                        if (viewState.getSkipNextId() != null) {
                            i18 = i17;
                            c28676v5 = c28676v4;
                            r15 = 0;
                            c28655q.m87150e0(1899650224);
                            c28655q.m87173q(false);
                        } else {
                            i18 = i17;
                            c28676v5 = c28676v4;
                            r15 = 0;
                            c28655q.m87150e0(1899650224);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        if (i18 == 32) {
                            r10 = 1;
                        } else {
                            r10 = r15;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (r10 == 0) {
                            function2 = r15;
                            objM87133R8 = new C21860l(function2, 4);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            function2 = r15;
                            objM87133R8 = new C21860l(function2, 4);
                            c28655q.m87172p0(objM87133R8);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                    } else {
                        c28676v3 = c28676v2;
                    }
                    c28676v4 = c28676v3;
                    c2314t2 = c2314t;
                    C1012d c1012d5 = new C1012d(function6, viewState, c39967p7, c39967p13, 18);
                    c28655q2.m87172p0(c1012d5);
                    objM87133R7 = c1012d5;
                    AbstractC27282u.m82292h(modifierM3409f5, enumC27284v5, strM21274h8, z14, jM125399i4, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                    c28655q = c28655q2;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f113 * f115, c2314t2));
                    if (viewState.getSkipNextId() != null) {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    } else {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i18 == 32) {
                        r10 = 1;
                    } else {
                        r10 = r15;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (r10 == 0) {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                } else {
                    c28676v1 = c28676v0;
                }
                c39967p4 = c39967p;
                c39967p5 = c39967p2;
                c39967p6 = c39967p3;
                objM87133R6 = new C21868t(viewState, c39967p6, c39967p4, c39967p5);
                c28655q2.m87172p0(objM87133R6);
                c28676v2 = c28676v1;
                c39967p7 = c39967p4;
                C39967p c39967p14 = c39967p5;
                c39967p8 = c39967p6;
                AbstractC22674j.m65717c(layoutWeightElement3, null, null, c22971kM66746i3, null, null, false, null, (Function1) objM87133R6, c28655q2, 24576, 494);
                AbstractC18489d0.m53380u(7, f115, c2314t, c28655q2);
                EnumC27284v enumC27284v6 = EnumC27284v.TextLarge;
                String strM21274h9 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i28);
                long jM125399i5 = c38072d3.m121949b(c28655q2, i29).getSleepLightSleep();
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (c39967p8.contains(Boolean.TRUE)) {
                    z14 = false;
                } else {
                    if (c39967p7 != null) {
                        listIterator = c39967p7.listIterator();
                        while (true) {
                            c26459b = (C26459b) listIterator;
                            if (c26459b.hasNext()) {
                                if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                    z14 = false;
                                }
                            }
                        }
                    } else {
                        listIterator = c39967p7.listIterator();
                        while (true) {
                            c26459b = (C26459b) listIterator;
                            if (c26459b.hasNext()) {
                                if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                    z14 = false;
                                }
                            }
                        }
                    }
                    z14 = true;
                }
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i3 = z15 | c28655q2.m87157i(viewState);
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i3) {
                    c28676v3 = c28676v2;
                    if (objM87133R7 == c28676v3) {
                        c2314t2 = c2314t;
                        c28676v4 = c28676v3;
                    }
                    AbstractC27282u.m82292h(modifierM3409f6, enumC27284v6, strM21274h9, z14, jM125399i5, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                    c28655q = c28655q2;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f113 * f115, c2314t2));
                    if (viewState.getSkipNextId() != null) {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    } else {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i18 == 32) {
                        r10 = 1;
                    } else {
                        r10 = r15;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (r10 == 0) {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                } else {
                    c28676v3 = c28676v2;
                }
                c28676v4 = c28676v3;
                c2314t2 = c2314t;
                C1012d c1012d6 = new C1012d(function6, viewState, c39967p7, c39967p14, 18);
                c28655q2.m87172p0(c1012d6);
                objM87133R7 = c1012d6;
                AbstractC27282u.m82292h(modifierM3409f6, enumC27284v6, strM21274h9, z14, jM125399i5, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f113 * f115, c2314t2));
                if (viewState.getSkipNextId() != null) {
                    i18 = i17;
                    c28676v5 = c28676v4;
                    r15 = 0;
                    c28655q.m87150e0(1899650224);
                    c28655q.m87173q(false);
                } else {
                    i18 = i17;
                    c28676v5 = c28676v4;
                    r15 = 0;
                    c28655q.m87150e0(1899650224);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i18 == 32) {
                    r10 = 1;
                } else {
                    r10 = r15;
                }
                objM87133R8 = c28655q.m87133R();
                if (r10 == 0) {
                    function2 = r15;
                    objM87133R8 = new C21860l(function2, 4);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function2 = r15;
                    objM87133R8 = new C21860l(function2, 4);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
            } else {
                i16 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
            TextResource textResourceM49942e4 = viewState.getNavigationTitle();
            TextResource textResourceM49941d4 = viewState.getNavigationSubtitle();
            i17 = i16 & 112;
            if (i17 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R5 = c28655q2.m87133R();
            if (z13) {
                objM87133R5 = new C21860l(function3, 3);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C21860l(function3, 3);
                c28655q2.m87172p0(objM87133R5);
            }
            int i210 = TextResource.$stable;
            Function1 function7 = function3;
            AbstractC21865q.m61949e(textResourceM49942e4, textResourceM49941d4, 0, null, null, (InterfaceC4339a) objM87133R5, c28655q2, i210 | (i210 << 3), 28);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(f13, true));
            float f117 = 3;
            float f118 = 8;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f117 * f118, c2314t);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, C2299e.f9111N, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3394p4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
            if (viewState.getCount() == 1) {
                textResourceM49940c = viewState.getSingleTitle();
            } else {
                textResourceM49940c = viewState.getMultipleTitle();
            }
            String strM21274h10 = AbstractC8693b.m21274h(textResourceM49940c, c28655q2, i210);
            C38072d c38072d4 = C38072d.f163053a;
            int i211 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h10, AbstractC1102d.m3409f(1.0f, c2314t), c38072d4.m121949b(c28655q2, i211).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i211).getT1(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
            float f119 = 4;
            float f1110 = f118 * f119;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f1110, c2314t));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f14 = Float.MAX_VALUE;
            } else {
                f14 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f14, false);
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f1110);
            zM87157i2 = c28655q2.m87157i(viewState);
            objM87133R6 = c28655q2.m87133R();
            if (zM87157i2) {
                c28676v1 = c28676v0;
                if (objM87133R6 == c28676v1) {
                    c39967p4 = c39967p;
                    c39967p5 = c39967p2;
                    c39967p6 = c39967p3;
                }
                c28676v2 = c28676v1;
                c39967p7 = c39967p4;
                C39967p c39967p15 = c39967p5;
                c39967p8 = c39967p6;
                AbstractC22674j.m65717c(layoutWeightElement4, null, null, c22971kM66746i4, null, null, false, null, (Function1) objM87133R6, c28655q2, 24576, 494);
                AbstractC18489d0.m53380u(7, f119, c2314t, c28655q2);
                EnumC27284v enumC27284v7 = EnumC27284v.TextLarge;
                String strM21274h11 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i210);
                long jM125399i6 = c38072d4.m121949b(c28655q2, i211).getSleepLightSleep();
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (c39967p8.contains(Boolean.TRUE)) {
                    z14 = false;
                } else {
                    if (c39967p7 != null) {
                        listIterator = c39967p7.listIterator();
                        while (true) {
                            c26459b = (C26459b) listIterator;
                            if (c26459b.hasNext()) {
                                if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                    z14 = false;
                                }
                            }
                        }
                    } else {
                        listIterator = c39967p7.listIterator();
                        while (true) {
                            c26459b = (C26459b) listIterator;
                            if (c26459b.hasNext()) {
                                if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                    z14 = false;
                                }
                            }
                        }
                    }
                    z14 = true;
                }
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i3 = z15 | c28655q2.m87157i(viewState);
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i3) {
                    c28676v3 = c28676v2;
                    if (objM87133R7 == c28676v3) {
                        c2314t2 = c2314t;
                        c28676v4 = c28676v3;
                    }
                    AbstractC27282u.m82292h(modifierM3409f7, enumC27284v7, strM21274h11, z14, jM125399i6, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                    c28655q = c28655q2;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f117 * f119, c2314t2));
                    if (viewState.getSkipNextId() != null) {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    } else {
                        i18 = i17;
                        c28676v5 = c28676v4;
                        r15 = 0;
                        c28655q.m87150e0(1899650224);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i18 == 32) {
                        r10 = 1;
                    } else {
                        r10 = r15;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (r10 == 0) {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function2 = r15;
                        objM87133R8 = new C21860l(function2, 4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
                } else {
                    c28676v3 = c28676v2;
                }
                c28676v4 = c28676v3;
                c2314t2 = c2314t;
                C1012d c1012d7 = new C1012d(function7, viewState, c39967p7, c39967p15, 18);
                c28655q2.m87172p0(c1012d7);
                objM87133R7 = c1012d7;
                AbstractC27282u.m82292h(modifierM3409f7, enumC27284v7, strM21274h11, z14, jM125399i6, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f117 * f119, c2314t2));
                if (viewState.getSkipNextId() != null) {
                    i18 = i17;
                    c28676v5 = c28676v4;
                    r15 = 0;
                    c28655q.m87150e0(1899650224);
                    c28655q.m87173q(false);
                } else {
                    i18 = i17;
                    c28676v5 = c28676v4;
                    r15 = 0;
                    c28655q.m87150e0(1899650224);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i18 == 32) {
                    r10 = 1;
                } else {
                    r10 = r15;
                }
                objM87133R8 = c28655q.m87133R();
                if (r10 == 0) {
                    function2 = r15;
                    objM87133R8 = new C21860l(function2, 4);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function2 = r15;
                    objM87133R8 = new C21860l(function2, 4);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
            } else {
                c28676v1 = c28676v0;
            }
            c39967p4 = c39967p;
            c39967p5 = c39967p2;
            c39967p6 = c39967p3;
            objM87133R6 = new C21868t(viewState, c39967p6, c39967p4, c39967p5);
            c28655q2.m87172p0(objM87133R6);
            c28676v2 = c28676v1;
            c39967p7 = c39967p4;
            C39967p c39967p16 = c39967p5;
            c39967p8 = c39967p6;
            AbstractC22674j.m65717c(layoutWeightElement4, null, null, c22971kM66746i4, null, null, false, null, (Function1) objM87133R6, c28655q2, 24576, 494);
            AbstractC18489d0.m53380u(7, f119, c2314t, c28655q2);
            EnumC27284v enumC27284v8 = EnumC27284v.TextLarge;
            String strM21274h12 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i210);
            long jM125399i7 = c38072d4.m121949b(c28655q2, i211).getSleepLightSleep();
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
            if (c39967p8.contains(Boolean.TRUE)) {
                z14 = false;
            } else {
                if (c39967p7 != null) {
                    listIterator = c39967p7.listIterator();
                    while (true) {
                        c26459b = (C26459b) listIterator;
                        if (c26459b.hasNext()) {
                            if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                z14 = false;
                            }
                        }
                    }
                } else {
                    listIterator = c39967p7.listIterator();
                    while (true) {
                        c26459b = (C26459b) listIterator;
                        if (c26459b.hasNext()) {
                            if (AbstractC22676k.m65745e((String) c26459b.next(), "")) {
                                z14 = false;
                            }
                        }
                    }
                }
                z14 = true;
            }
            if (i17 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i3 = z15 | c28655q2.m87157i(viewState);
            objM87133R7 = c28655q2.m87133R();
            if (zM87157i3) {
                c28676v3 = c28676v2;
                if (objM87133R7 == c28676v3) {
                    c2314t2 = c2314t;
                    c28676v4 = c28676v3;
                }
                AbstractC27282u.m82292h(modifierM3409f8, enumC27284v8, strM21274h12, z14, jM125399i7, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f117 * f119, c2314t2));
                if (viewState.getSkipNextId() != null) {
                    i18 = i17;
                    c28676v5 = c28676v4;
                    r15 = 0;
                    c28655q.m87150e0(1899650224);
                    c28655q.m87173q(false);
                } else {
                    i18 = i17;
                    c28676v5 = c28676v4;
                    r15 = 0;
                    c28655q.m87150e0(1899650224);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i18 == 32) {
                    r10 = 1;
                } else {
                    r10 = r15;
                }
                objM87133R8 = c28655q.m87133R();
                if (r10 == 0) {
                    function2 = r15;
                    objM87133R8 = new C21860l(function2, 4);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function2 = r15;
                    objM87133R8 = new C21860l(function2, 4);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
            } else {
                c28676v3 = c28676v2;
            }
            c28676v4 = c28676v3;
            c2314t2 = c2314t;
            C1012d c1012d8 = new C1012d(function7, viewState, c39967p7, c39967p16, 18);
            c28655q2.m87172p0(c1012d8);
            objM87133R7 = c1012d8;
            AbstractC27282u.m82292h(modifierM3409f8, enumC27284v8, strM21274h12, z14, jM125399i7, null, false, (InterfaceC4339a) objM87133R7, c28655q2, 54, 96);
            c28655q = c28655q2;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f117 * f119, c2314t2));
            if (viewState.getSkipNextId() != null) {
                i18 = i17;
                c28676v5 = c28676v4;
                r15 = 0;
                c28655q.m87150e0(1899650224);
                c28655q.m87173q(false);
            } else {
                i18 = i17;
                c28676v5 = c28676v4;
                r15 = 0;
                c28655q.m87150e0(1899650224);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (i18 == 32) {
                r10 = 1;
            } else {
                r10 = r15;
            }
            objM87133R8 = c28655q.m87133R();
            if (r10 == 0) {
                function2 = r15;
                objM87133R8 = new C21860l(function2, 4);
                c28655q.m87172p0(objM87133R8);
            } else {
                function2 = r15;
                objM87133R8 = new C21860l(function2, 4);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, r15, c28655q, r15, 1);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function2, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m61985o(AbstractC17546f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC28620h0 m61986p(C39967p c39967p, C17553m c17553m, C39967p c39967p2, C39967p c39967p3, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        int iM49939b = c17553m.getCount();
        ArrayList arrayList = new ArrayList(iM49939b);
        for (int i13 = 0; i13 < iM49939b; i13++) {
            arrayList.add(Boolean.FALSE);
        }
        c39967p.addAll(arrayList);
        if (c17553m.m49948k().isEmpty()) {
            int iM49939b2 = c17553m.getCount();
            ArrayList arrayList2 = new ArrayList(iM49939b2);
            for (int i14 = 0; i14 < iM49939b2; i14++) {
                arrayList2.add("");
            }
            c39967p2.addAll(arrayList2);
        } else {
            c39967p2.addAll(c17553m.m49948k());
        }
        if (c17553m.m49949l().isEmpty()) {
            int iM49939b3 = c17553m.getCount();
            ArrayList arrayList3 = new ArrayList(iM49939b3);
            for (int i15 = 0; i15 < iM49939b3; i15++) {
                arrayList3.add("");
            }
            c39967p3.addAll(arrayList3);
        } else {
            c39967p3.addAll(c17553m.m49949l());
        }
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m61987q(Function1 function1) {
        function1.invoke(AbstractC17546f.a.f67870a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m61988r(C17553m c17553m, C39967p c39967p, C39967p c39967p2, C39967p c39967p3, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77555a(LazyColumn, c17553m.getCount(), null, new C37816b(new C3403f(c39967p, c17553m, c39967p2, c39967p3, 4), true, -1175263596), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m61989s(C39967p c39967p, C17553m c17553m, C39967p c39967p2, C39967p c39967p3, InterfaceC1103a items, int i13, Composer composer, int i14) {
        int i15;
        C39967p c39967p4 = c39967p;
        int i16 = i13;
        AbstractC22676k.m65750j(items, "$this$items");
        if ((i14 & 48) == 0) {
            i15 = i14 | (((C28655q) composer).m87149e(i16) ? 32 : 16);
        } else {
            i15 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 145) != 144)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
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
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
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
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            float f13 = 4;
            float f14 = 3 * f13;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
            TextResource textResourceM49937f = c17553m.getTextField().getTitle();
            TextResource textResourceM21278l = AbstractC8693b.m21278l((String) c39967p2.get(i16));
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            AbstractC30784c.c cVar = new AbstractC30784c.c(c17553m.getTextField().getFirstTextFieldUnits(), null, 2, 0 == true ? 1 : 0);
            boolean zBooleanValue = ((Boolean) c39967p4.get(i16)).booleanValue();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C21864p(4);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int i17 = i15 & 112;
            boolean zM87157i = (i17 == 32) | c28655q.m87157i(c17553m);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C21867s c21867s = new C21867s(c17553m, c39967p3, i16, c39967p4, c39967p2);
                i16 = i16;
                c39967p4 = c39967p4;
                c28655q.m87172p0(c21867s);
                objM87133R2 = c21867s;
            }
            Function1 function1 = (Function1) objM87133R2;
            int i18 = TextResource.$stable;
            int i19 = (i18 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i18 << 9) | (AbstractC30784c.c.f126792d << 21) | (i18 << 24);
            C2314t c2314t2 = c2314t;
            AbstractC30792k.m94678l(layoutWeightElement, textResourceM21278l, null, textResourceM49937f, null, null, null, cVar, textResourceM21267a, zBooleanValue, false, null, 0L, false, 8, 0, 0, false, null, false, false, 0, false, null, null, c33252iM105489e, null, null, null, null, interfaceC4339a, function1, c28655q, i19, 24576, 0, 6, 1040170068, 0);
            C28655q c28655q2 = c28655q;
            if (c17553m.getTextField().getSecondTextFieldUnits() == null) {
                c28655q2.m87150e0(1154992619);
                c28655q2.m87173q(false);
                i18 = i18;
                c2314t2 = c2314t2;
            } else {
                AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, 1154992620, f13, f13, c2314t2));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f14);
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l((String) c39967p3.get(i16));
                TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                AbstractC30784c.c cVar2 = new AbstractC30784c.c(c17553m.getTextField().getSecondTextFieldUnits(), null, 2, 0 == true ? 1 : 0);
                boolean zBooleanValue2 = ((Boolean) c39967p4.get(i16)).booleanValue();
                Object objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C21864p(3);
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                boolean zM87157i2 = (i17 == 32) | c28655q2.m87157i(c17553m);
                Object objM87133R4 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    C21867s c21867s2 = new C21867s(c39967p2, i16, c39967p4, c17553m, c39967p3);
                    c28655q2.m87172p0(c21867s2);
                    objM87133R4 = c21867s2;
                }
                AbstractC30792k.m94678l(layoutWeightElement2, textResourceM21278l2, null, textResourceM21267a2, null, null, null, cVar2, textResourceM21267a3, zBooleanValue2, false, null, 0L, false, 8, 0, 0, false, null, false, false, 0, false, null, null, c33252iM105489e2, null, null, null, null, interfaceC4339a2, (Function1) objM87133R4, c28655q2, i19, 24576, 0, 6, 1040170068, 0);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            if (((Boolean) c39967p4.get(i16)).booleanValue()) {
                c28655q2.m87150e0(725940763);
                Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t2, C2299e.f9104G);
                String strM21274h = AbstractC8693b.m21274h(c17553m.getTextField().getErrorMessage(), c28655q2, i18);
                C38072d c38072d = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(strM21274h, modifierMo3400a, c38072d.m121949b(c28655q2, i24).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getB2(), null, c28655q3, 0, C2886a.f11498d << 18, 196600);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(726298100);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m61990t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m61991u(C17553m c17553m, C39967p c39967p, int i13, C39967p c39967p2, C39967p c39967p3, String text) {
        AbstractC22676k.m65750j(text, "text");
        Float fM125915y = AbstractC39420x.m125915y(text);
        float fFloatValue = fM125915y != null ? fM125915y.floatValue() : 0.0f;
        if (c17553m.getTextField().getSecondTextFieldUnits() != null) {
            Float fM125915y2 = AbstractC39420x.m125915y((String) c39967p.get(i13));
            fFloatValue = m61970B(fFloatValue, fM125915y2 != null ? fM125915y2.floatValue() : 0.0f);
        }
        float fM49935d = c17553m.getTextField().getMinValueG();
        boolean z4 = false;
        if (fFloatValue <= c17553m.getTextField().getMaxValueG() && fM49935d <= fFloatValue) {
            z4 = true;
        }
        c39967p2.set(i13, Boolean.valueOf(!z4));
        c39967p3.set(i13, text);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m61992v() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m61993w(C39967p c39967p, int i13, C39967p c39967p2, C17553m c17553m, C39967p c39967p3, String text) {
        AbstractC22676k.m65750j(text, "text");
        Float fM125915y = AbstractC39420x.m125915y((String) c39967p.get(i13));
        float fFloatValue = fM125915y != null ? fM125915y.floatValue() : 0.0f;
        Float fM125915y2 = AbstractC39420x.m125915y(text);
        float fM61970B = m61970B(fFloatValue, fM125915y2 != null ? fM125915y2.floatValue() : 0.0f);
        float fM49935d = c17553m.getTextField().getMinValueG();
        boolean z4 = false;
        if (fM61970B <= c17553m.getTextField().getMaxValueG() && fM49935d <= fM61970B) {
            z4 = true;
        }
        c39967p2.set(i13, Boolean.valueOf(!z4));
        c39967p3.set(i13, text);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m61994x(Function1 function1, C17553m c17553m, C39967p c39967p, C39967p c39967p2) {
        HormonalScreenId hormonalScreenIdM49943f = c17553m.getNextId();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c39967p, 10));
        ListIterator listIterator = c39967p.listIterator();
        int i13 = 0;
        while (true) {
            C26459b c26459b = (C26459b) listIterator;
            if (!c26459b.hasNext()) {
                function1.invoke(new AbstractC17546f.c(hormonalScreenIdM49943f, new C14676d(null, null, arrayList, false, null, 0, c39967p, c39967p2, null, null, 827, null)));
                return C23454a0.f92919a;
            }
            Object next = c26459b.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            String str = (String) next;
            float fFloatValue = 0.0f;
            if (c17553m.getTextField().getSecondTextFieldUnits() != null) {
                Float fM125915y = AbstractC39420x.m125915y(str);
                float fFloatValue2 = fM125915y != null ? fM125915y.floatValue() : 0.0f;
                Float fM125915y2 = AbstractC39420x.m125915y((String) c39967p2.get(i13));
                fFloatValue = m61970B(fFloatValue2, fM125915y2 != null ? fM125915y2.floatValue() : 0.0f);
            } else {
                Float fM125915y3 = AbstractC39420x.m125915y(str);
                if (fM125915y3 != null) {
                    fFloatValue = fM125915y3.floatValue();
                }
            }
            arrayList.add(new C14673a(fFloatValue));
            i13 = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m61995y(Function1 function1, C17553m c17553m, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC17546f.g(c17553m.getSkipNextId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m61996z(Function1 function1) {
        function1.invoke(AbstractC17546f.a.f67870a);
        return C23454a0.f92919a;
    }
}
