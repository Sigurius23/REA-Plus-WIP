package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c31.C3929m;
import ge3.AbstractC15751g;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.o4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/p4;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lc41/p4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4087o4 {
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:60:0x0155  */
    /* JADX WARN: Code duplicated, block: B:65:0x0170  */
    /* JADX WARN: Code duplicated, block: B:69:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x0207  */
    /* JADX WARN: Code duplicated, block: B:79:0x022f  */
    /* JADX WARN: Code duplicated, block: B:82:0x023a  */
    /* JADX WARN: Code duplicated, block: B:85:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m12543c(Modifier modifier, C4094p4 viewState, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int i17;
        int i18;
        float f13;
        int i19;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2102228514);
        int i24 = i14 & 1;
        if (i24 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C3929m(22);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                Modifier modifierM53364e = AbstractC18489d0.m53364e(modifier4, 3, 4);
                C38072d c38072d = C38072d.f163053a;
                Modifier modifierM44456i = AbstractC15751g.m44456i(1, AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, 6).getWhite5(), AbstractC17918w0.f69621a), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(16777215)), new C17919x(c38072d.m121949b(c28655q, 6).getWhite5())), 0L, 0L, 14), AbstractC33253j.m105489e(12));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44456i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c28655q.m87150e0(706110781);
                i17 = 0;
                for (Object obj : viewState.m12578a()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    f13 = 8;
                    AbstractC4066l4.m12455p(AbstractC1099a.m3394p(0 * f13, modifier4), C4108r4.m12654b((C4108r4) obj, null, EnumC4073m4.LIST, null, null, null, null, null, null, null, null, null, null, 4093, null), function4, c28655q, i16 & 896, 0);
                    Function1 function5 = function4;
                    if (i17 != AbstractC37056f.m118951C(viewState.m12578a())) {
                        c28655q.m87150e0(-1423638847);
                        i19 = i16;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 2 * f13, 0.0f, 2), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                        c28655q.m87173q(false);
                    } else {
                        i19 = i16;
                        c28655q.m87150e0(-1423536020);
                        c28655q.m87173q(false);
                    }
                    i17 = i18;
                    function4 = function5;
                    i16 = i19;
                    c2314t = c2314t;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                modifier3 = modifier4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(modifier3, viewState, function3, i13, i14, 5);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i25 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C3929m(22);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(modifier4, 3, 4);
            C38072d c38072d2 = C38072d.f163053a;
            Modifier modifierM44456i2 = AbstractC15751g.m44456i(1, AbstractC1092a.m3358c(modifierM53364e2, c38072d2.m121949b(c28655q, 6).getWhite5(), AbstractC17918w0.f69621a), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(16777215)), new C17919x(c38072d2.m121949b(c28655q, 6).getWhite5())), 0L, 0L, 14), AbstractC33253j.m105489e(12));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44456i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            c28655q.m87150e0(706110781);
            i17 = 0;
            while (r1.hasNext()) {
                i18 = i17 + 1;
                if (i17 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                f13 = 8;
                AbstractC4066l4.m12455p(AbstractC1099a.m3394p(0 * f13, modifier4), C4108r4.m12654b((C4108r4) obj, null, EnumC4073m4.LIST, null, null, null, null, null, null, null, null, null, null, 4093, null), function4, c28655q, i16 & 896, 0);
                Function1 function6 = function4;
                if (i17 != AbstractC37056f.m118951C(viewState.m12578a())) {
                    c28655q.m87150e0(-1423638847);
                    i19 = i16;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 2 * f13, 0.0f, 2), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                    c28655q.m87173q(false);
                } else {
                    i19 = i16;
                    c28655q.m87150e0(-1423536020);
                    c28655q.m87173q(false);
                }
                i17 = i18;
                function4 = function6;
                i16 = i19;
                c2314t = c2314t;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            modifier3 = modifier4;
            function3 = function4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(modifier3, viewState, function3, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m12544d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m12545e(Modifier modifier, C4094p4 c4094p4, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m12543c(modifier, c4094p4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
