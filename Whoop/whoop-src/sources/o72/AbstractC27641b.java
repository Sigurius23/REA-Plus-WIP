package o72;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import f72.AbstractC14227b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m72.C25204c;
import mi2.C25592o;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27207n;
import ny0.AbstractC27282u;
import ny0.C27266m;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: o72.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lm72/c;", "viewState", "", "navigationTitle", "Lkotlin/Function1;", "Lf72/b;", "Ll83/a0;", "onNavigationEvent", "e", "(Landroidx/compose/ui/Modifier;Lm72/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27641b {
    /* JADX WARN: Code duplicated, block: B:101:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:104:0x033d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0351  */
    /* JADX WARN: Code duplicated, block: B:114:0x0357  */
    /* JADX WARN: Code duplicated, block: B:117:0x0361  */
    /* JADX WARN: Code duplicated, block: B:121:0x0369  */
    /* JADX WARN: Code duplicated, block: B:123:0x0390  */
    /* JADX WARN: Code duplicated, block: B:126:0x039b  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0213  */
    /* JADX WARN: Code duplicated, block: B:92:0x022e  */
    /* JADX WARN: Code duplicated, block: B:95:0x028a  */
    /* JADX WARN: Code duplicated, block: B:96:0x028e  */
    /* JADX INFO: renamed from: e */
    public static final void m83461e(Modifier modifier, C25204c c25204c, String navigationTitle, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        boolean z13;
        Object objM87133R;
        Function1 function5;
        int i17;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        boolean z14;
        Object objM87133R2;
        Function1 function6;
        Object objM87133R3;
        C25204c viewState = c25204c;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1925644101);
        int i18 = i14 & 1;
        if (i18 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(navigationTitle) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C27266m(27);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier4);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(navigationTitle);
                C38072d c38072d = C38072d.f163053a;
                AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C27207n(function4, 7);
                    c28655q.m87172p0(objM87133R);
                }
                function5 = function4;
                i17 = i15;
                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                float f13 = 20;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3407d(1.0f, modifier4));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 40, 7);
                C2305k c2305k = C2299e.f9111N;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                Modifier modifierM3419p = AbstractC1102d.m3419p(100, c2314t);
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(c25204c.getLockedIcon(), null, null, c28655q, AbstractC22403o.f87638a, 3);
                long j7 = C17919x.f69637n;
                Modifier modifier5 = modifier4;
                AbstractC15005f3.m43107a(abstractC26165aM64500i, null, modifierM3419p, j7, c28655q, 3504, 0);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4), c2305k, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                String strM73802e = c25204c.getHeaderTextDisplay();
                int i24 = C38072d.f163054b;
                C2886a c2886aM8436q = c38072d.m121952e(c28655q, i24).getH3();
                long jM125430y = c38072d.m121949b(c28655q, i24).getBrandWhite();
                int i25 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM73802e, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q, 0, i25, 196602);
                AbstractC30795n.m94707h(c25204c.getDescriptionDisplay(), null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 0, i25, 196090);
                c28655q.m87173q(true);
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 2);
                EnumC27284v enumC27284v = EnumC27284v.TextMedium;
                String strM73800c = c25204c.getButtonTextDisplay();
                AbstractC17911t abstractC17911tM73798a = c25204c.getButtonBrush();
                if ((i17 & 112) != 32) {
                    viewState = c25204c;
                    boolean z15 = (i17 & 64) == 0 && c28655q.m87157i(viewState);
                    z14 = z15 | (i16 == 2048);
                    objM87133R2 = c28655q.m87133R();
                    if (!z14 || objM87133R2 == c28676v0) {
                        function6 = function5;
                        objM87133R2 = new C25592o(viewState, function6, 24);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function6 = function5;
                    }
                    AbstractC27282u.m82292h(modifierM3396r, enumC27284v, strM73800c, false, j7, abstractC17911tM73798a, false, (InterfaceC4339a) objM87133R2, c28655q, 24630, 72);
                    c28655q = c28655q;
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    function3 = function6;
                    modifier3 = modifier5;
                } else {
                    viewState = c25204c;
                }
                z14 = z15 | (i16 == 2048);
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    function6 = function5;
                    objM87133R2 = new C25592o(viewState, function6, 24);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function6 = function5;
                    objM87133R2 = new C25592o(viewState, function6, 24);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27282u.m82292h(modifierM3396r, enumC27284v, strM73800c, false, j7, abstractC17911tM73798a, false, (InterfaceC4339a) objM87133R2, c28655q, 24630, 72);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, true, true, true);
                function3 = function6;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a(modifier3, viewState, navigationTitle, function3, i13, i14, 0);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C27266m(27);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier4);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(navigationTitle);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM21278l2, null, AbstractC13673n.m38561h(c38072d2), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            i16 = i15 & 7168;
            if (i16 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C27207n(function4, 7);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C27207n(function4, 7);
                c28655q.m87172p0(objM87133R);
            }
            function5 = function4;
            i17 = i15;
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            float f14 = 20;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, AbstractC1102d.m3407d(1.0f, modifier4));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 40, 7);
            C2305k c2305k2 = C2299e.f9111N;
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k2, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a5);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(100, c2314t);
            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(c25204c.getLockedIcon(), null, null, c28655q, AbstractC22403o.f87638a, 3);
            long j13 = C17919x.f69637n;
            Modifier modifier6 = modifier4;
            AbstractC15005f3.m43107a(abstractC26165aM64500i2, null, modifierM3419p2, j13, c28655q, 3504, 0);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4), c2305k2, c28655q, 54);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N8);
            String strM73802e2 = c25204c.getHeaderTextDisplay();
            int i26 = C38072d.f163054b;
            C2886a c2886aM8436q2 = c38072d2.m121952e(c28655q, i26).getH3();
            long jM125430y2 = c38072d2.m121949b(c28655q, i26).getBrandWhite();
            int i27 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM73802e2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q2, null, c28655q, 0, i27, 196602);
            AbstractC30795n.m94707h(c25204c.getDescriptionDisplay(), null, c38072d2.m121949b(c28655q, i26).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i26).getB1(), null, c28655q, 0, i27, 196090);
            c28655q.m87173q(true);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2);
            EnumC27284v enumC27284v2 = EnumC27284v.TextMedium;
            String strM73800c2 = c25204c.getButtonTextDisplay();
            AbstractC17911t abstractC17911tM73798a2 = c25204c.getButtonBrush();
            if ((i17 & 112) != 32) {
                viewState = c25204c;
                if ((i17 & 64) == 0) {
                }
                z14 = z15 | (i16 == 2048);
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    function6 = function5;
                    objM87133R2 = new C25592o(viewState, function6, 24);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function6 = function5;
                    objM87133R2 = new C25592o(viewState, function6, 24);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27282u.m82292h(modifierM3396r2, enumC27284v2, strM73800c2, false, j13, abstractC17911tM73798a2, false, (InterfaceC4339a) objM87133R2, c28655q, 24630, 72);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, true, true, true);
                function3 = function6;
                modifier3 = modifier6;
            } else {
                viewState = c25204c;
            }
            z14 = z15 | (i16 == 2048);
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                function6 = function5;
                objM87133R2 = new C25592o(viewState, function6, 24);
                c28655q.m87172p0(objM87133R2);
            } else {
                function6 = function5;
                objM87133R2 = new C25592o(viewState, function6, 24);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27282u.m82292h(modifierM3396r2, enumC27284v2, strM73800c2, false, j13, abstractC17911tM73798a2, false, (InterfaceC4339a) objM87133R2, c28655q, 24630, 72);
            c28655q = c28655q;
            AbstractC25012a.m73392y(c28655q, true, true, true);
            function3 = function6;
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(modifier3, viewState, navigationTitle, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m83462f(AbstractC14227b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m83463g(Function1 function1) {
        function1.invoke(AbstractC14227b.b.f51971a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m83464h(C25204c c25204c, Function1 function1) {
        C9598e c9598eM73799b = c25204c.getButtonDestination();
        if (c9598eM73799b != null) {
            function1.invoke(new AbstractC14227b.c(c9598eM73799b));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m83465i(Modifier modifier, C25204c c25204c, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m83461e(modifier, c25204c, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
