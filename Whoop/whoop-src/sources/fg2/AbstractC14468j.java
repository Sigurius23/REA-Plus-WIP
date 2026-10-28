package fg2;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import bs1.C3590i;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import eg2.AbstractC13172e;
import eg2.EnumC13178k;
import f41.C14068f;
import kd1.C22411w;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p133f1.C13921a0;
import p133f1.C13998z1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.C23016z;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.C33252i;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import vf2.AbstractC35950b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: fg2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u000e\u0010\u000b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "isLoading", "isError", "Lkotlin/Function1;", "", "Ll83/a0;", "onNext", "g", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "phoneNumber", "termsAccepted", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14468j {
    /* JADX WARN: Code duplicated, block: B:101:0x036a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0378  */
    /* JADX WARN: Code duplicated, block: B:109:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x0428  */
    /* JADX WARN: Code duplicated, block: B:113:0x042c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0439  */
    /* JADX WARN: Code duplicated, block: B:120:0x044b  */
    /* JADX WARN: Code duplicated, block: B:123:0x045c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0463  */
    /* JADX WARN: Code duplicated, block: B:130:0x046b  */
    /* JADX WARN: Code duplicated, block: B:133:0x049c  */
    /* JADX WARN: Code duplicated, block: B:136:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:82:0x014b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0160  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0274  */
    /* JADX WARN: Code duplicated, block: B:93:0x0288  */
    /* JADX WARN: Code duplicated, block: B:94:0x0294  */
    /* JADX WARN: Code duplicated, block: B:97:0x0359  */
    /* JADX WARN: Code duplicated, block: B:98:0x035d  */
    /* JADX INFO: renamed from: g */
    public static final void m41270g(Modifier modifier, boolean z4, boolean z13, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        int i16;
        boolean z14;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        boolean z15;
        boolean z16;
        Modifier modifier3;
        Function1 function3;
        boolean z17;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z18;
        boolean z19;
        C28676v0 c28676v0;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z24;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function4;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        int iHashCode2;
        C0209i c0209i2;
        Object objM87133R5;
        C0209i c0209i3;
        int iHashCode3;
        boolean z25;
        Object objM87133R6;
        Function1 function5;
        Object objM87133R7;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-328742518);
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
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                i15 |= c28655q.m87155h(z4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z14 = z13;
                    if (c28655q.m87155h(z14)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function2 = function1;
                        if (c28655q.m87157i(function2)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z15)) {
                        c2314t = C2314t.f9131w;
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i25 != 0) {
                            z18 = false;
                        } else {
                            z18 = z4;
                        }
                        if (i16 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C14068f(19);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function2 = (Function1) objM87133R7;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z("");
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        if (m41272i(interfaceC28601c1).length() > 0 || !m41274k(interfaceC28601c2)) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        float f13 = 8;
                        float f14 = 2 * f13;
                        float f15 = 1 * f13;
                        Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier2), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f15, 7), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        boolean z26 = z18;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i4 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                        C0209i c0209i5 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        Modifier modifier4 = modifier2;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i6 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                        String strM21273g = AbstractC8693b.m21273g(AbstractC35950b.f153101u, c28655q, 0);
                        C38072d c38072d = C38072d.f163053a;
                        int i26 = C38072d.f163054b;
                        C2886a c2886aM8418P = c38072d.m121952e(c28655q, i26).getT3();
                        long jM125430y = c38072d.m121949b(c28655q, i26).getBrandWhite();
                        int i27 = C2886a.f11498d << 18;
                        function4 = function2;
                        int i28 = i15;
                        AbstractC30795n.m94707h(strM21273g, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i27, 196602);
                        AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153099s, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 48, i27, 196600);
                        float f16 = 4 * f13;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f16, 0.0f, 0.0f, 13);
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(m41272i(interfaceC28601c1));
                        C14460b c14460b = C14460b.f52784a;
                        InterfaceC4351m interfaceC4351mM41201c = c14460b.m41201c();
                        TextResource textResourceM21267a = AbstractC8693b.m21267a();
                        C33252i c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13998z1(17);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            interfaceC28601c3 = interfaceC28601c1;
                            objM87133R4 = new C13921a0(6, interfaceC28601c3);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            interfaceC28601c3 = interfaceC28601c1;
                        }
                        Function1 function6 = (Function1) objM87133R4;
                        int i29 = TextResource.$stable;
                        interfaceC28601c4 = interfaceC28601c3;
                        AbstractC30792k.m94678l(modifierM3398t, textResourceM21278l, null, null, null, interfaceC4351mM41201c, null, null, textResourceM21267a, false, false, null, 0L, true, 4, 0, 7, true, null, false, false, 0, false, null, null, c33252iM64090c, null, null, null, null, interfaceC4339a, function6, c28655q, (i29 << 3) | 805502982 | (i29 << 24), 14183424, 0, 54, 1039965404, 0);
                        boolean z27 = z19;
                        AbstractC1090b.m3350e(C23016z.f90757a, z27, AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), null, null, null, c14460b.m41202d(), c28655q, 1573254 | ((i28 >> 3) & 112), 28);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13);
                        C2307m c2307m = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            c0209i2 = c0209i;
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153100t);
                        AbstractC33088k.g gVar = new AbstractC33088k.g(AbstractC2890e.m8450e().getB1(), C2299e.f9107J);
                        boolean zM41274k = m41274k(interfaceC28601c2);
                        float f17 = 0 * f13;
                        C22976l1 c22976l1 = new C22976l1(f17, f17, f17, f17);
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13921a0(7, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        c0209i3 = c0209i2;
                        AbstractC33087j.m104824f(c8688bM21277k, gVar, zM41274k, false, 0, 0L, null, c22976l1, false, 0L, (Function1) objM87133R5, c28655q, 12582912 | TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 6, 888);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, f16, f14, 3 * f13, 1);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                        EnumC13178k enumC13178k = EnumC13178k.INPUT;
                        z25 = (i28 & 7168) == 2048;
                        objM87133R6 = c28655q.m87133R();
                        if (!z25 || objM87133R6 == c28676v0) {
                            function5 = function4;
                            objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            function5 = function4;
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                        int i34 = i28 << 3;
                        z14 = z27;
                        AbstractC13172e.m36935g(enumC13178k, z24, z26, z14, interfaceC4339a2, c28655q, (i34 & 896) | 6 | (i34 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        function3 = function5;
                        z16 = z26;
                        modifier3 = modifier4;
                    } else {
                        c28655q.m87138X();
                        z16 = z4;
                        modifier3 = modifier2;
                        function3 = function2;
                    }
                    z17 = z14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C14467i(modifier3, z16, z17, function3, i13, i14);
                    }
                }
                i15 |= 3072;
                function2 = function1;
                if ((i15 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C14068f(19);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function2 = (Function1) objM87133R7;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    if (m41272i(interfaceC28601c1).length() > 0) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    float f18 = 8;
                    float f19 = 2 * f18;
                    float f110 = 1 * f18;
                    Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier2), f19, 0.0f, 2), 0.0f, 0.0f, 0.0f, f110, 7), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    boolean z28 = z18;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i7 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a2);
                    C0209i c0209i8 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    Modifier modifier5 = modifier2;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                    String strM21273g2 = AbstractC8693b.m21273g(AbstractC35950b.f153101u, c28655q, 0);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i210 = C38072d.f163054b;
                    C2886a c2886aM8418P2 = c38072d2.m121952e(c28655q, i210).getT3();
                    long jM125430y2 = c38072d2.m121949b(c28655q, i210).getBrandWhite();
                    int i211 = C2886a.f11498d << 18;
                    function4 = function2;
                    int i212 = i15;
                    AbstractC30795n.m94707h(strM21273g2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q, 0, i211, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153099s, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f110, 0.0f, 0.0f, 13), c38072d2.m121949b(c28655q, i210).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i210).getB1(), null, c28655q, 48, i211, 196600);
                    float f111 = 4 * f18;
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111, 0.0f, 0.0f, 13);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(m41272i(interfaceC28601c1));
                    C14460b c14460b2 = C14460b.f52784a;
                    InterfaceC4351m interfaceC4351mM41201c2 = c14460b2.m41201c();
                    TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                    C33252i c33252iM64090c2 = C22411w.f87680a.m64535a().m64090c();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13998z1(17);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        interfaceC28601c3 = interfaceC28601c1;
                        objM87133R4 = new C13921a0(6, interfaceC28601c3);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        interfaceC28601c3 = interfaceC28601c1;
                    }
                    Function1 function7 = (Function1) objM87133R4;
                    int i213 = TextResource.$stable;
                    interfaceC28601c4 = interfaceC28601c3;
                    AbstractC30792k.m94678l(modifierM3398t4, textResourceM21278l2, null, null, null, interfaceC4351mM41201c2, null, null, textResourceM21267a2, false, false, null, 0L, true, 4, 0, 7, true, null, false, false, 0, false, null, null, c33252iM64090c2, null, null, null, null, interfaceC4339a3, function7, c28655q, (i213 << 3) | 805502982 | (i213 << 24), 14183424, 0, 54, 1039965404, 0);
                    boolean z29 = z19;
                    AbstractC1090b.m3350e(C23016z.f90757a, z29, AbstractC1099a.m3398t(c2314t, 0.0f, f19, 0.0f, 0.0f, 13), null, null, null, c14460b2.m41202d(), c28655q, 1573254 | ((i212 >> 3) & 112), 28);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, f111, 0.0f, 0.0f, 13);
                    C2307m c2307m2 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
                    TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC35950b.f153100t);
                    AbstractC33088k.g gVar2 = new AbstractC33088k.g(AbstractC2890e.m8450e().getB1(), C2299e.f9107J);
                    boolean zM41274k2 = m41274k(interfaceC28601c2);
                    float f112 = 0 * f18;
                    C22976l1 c22976l2 = new C22976l1(f112, f112, f112, f112);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13921a0(7, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    c0209i3 = c0209i2;
                    AbstractC33087j.m104824f(c8688bM21277k2, gVar2, zM41274k2, false, 0, 0L, null, c22976l2, false, 0L, (Function1) objM87133R5, c28655q, 12582912 | TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 6, 888);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 0.0f, f111, f19, 3 * f18, 1);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                    EnumC13178k enumC13178k2 = EnumC13178k.INPUT;
                    if ((i212 & 7168) == 2048) {
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z25) {
                        function5 = function4;
                        objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function5 = function4;
                        objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    int i35 = i212 << 3;
                    z14 = z29;
                    AbstractC13172e.m36935g(enumC13178k2, z24, z28, z14, interfaceC4339a4, c28655q, (i35 & 896) | 6 | (i35 & 7168), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function5;
                    z16 = z28;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    z16 = z4;
                    modifier3 = modifier2;
                    function3 = function2;
                }
                z17 = z14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14467i(modifier3, z16, z17, function3, i13, i14);
                }
            }
            i15 |= 384;
            z14 = z13;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C14068f(19);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function2 = (Function1) objM87133R7;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    if (m41272i(interfaceC28601c1).length() > 0) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    float f113 = 8;
                    float f114 = 2 * f113;
                    float f115 = 1 * f113;
                    Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier2), f114, 0.0f, 2), 0.0f, 0.0f, 0.0f, f115, 7), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM92116f2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    boolean z210 = z18;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i10 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a3);
                    C0209i c0209i11 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    Modifier modifier6 = modifier2;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    String strM21273g3 = AbstractC8693b.m21273g(AbstractC35950b.f153101u, c28655q, 0);
                    C38072d c38072d3 = C38072d.f163053a;
                    int i214 = C38072d.f163054b;
                    C2886a c2886aM8418P3 = c38072d3.m121952e(c28655q, i214).getT3();
                    long jM125430y3 = c38072d3.m121949b(c28655q, i214).getBrandWhite();
                    int i215 = C2886a.f11498d << 18;
                    function4 = function2;
                    int i216 = i15;
                    AbstractC30795n.m94707h(strM21273g3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P3, null, c28655q, 0, i215, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153099s, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f115, 0.0f, 0.0f, 13), c38072d3.m121949b(c28655q, i214).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i214).getB1(), null, c28655q, 48, i215, 196600);
                    float f116 = 4 * f113;
                    Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f116, 0.0f, 0.0f, 13);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m41272i(interfaceC28601c1));
                    C14460b c14460b3 = C14460b.f52784a;
                    InterfaceC4351m interfaceC4351mM41201c3 = c14460b3.m41201c();
                    TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                    C33252i c33252iM64090c3 = C22411w.f87680a.m64535a().m64090c();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13998z1(17);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        interfaceC28601c3 = interfaceC28601c1;
                        objM87133R4 = new C13921a0(6, interfaceC28601c3);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        interfaceC28601c3 = interfaceC28601c1;
                    }
                    Function1 function8 = (Function1) objM87133R4;
                    int i217 = TextResource.$stable;
                    interfaceC28601c4 = interfaceC28601c3;
                    AbstractC30792k.m94678l(modifierM3398t7, textResourceM21278l3, null, null, null, interfaceC4351mM41201c3, null, null, textResourceM21267a3, false, false, null, 0L, true, 4, 0, 7, true, null, false, false, 0, false, null, null, c33252iM64090c3, null, null, null, null, interfaceC4339a5, function8, c28655q, (i217 << 3) | 805502982 | (i217 << 24), 14183424, 0, 54, 1039965404, 0);
                    boolean z211 = z19;
                    AbstractC1090b.m3350e(C23016z.f90757a, z211, AbstractC1099a.m3398t(c2314t, 0.0f, f114, 0.0f, 0.0f, 13), null, null, null, c14460b3.m41202d(), c28655q, 1573254 | ((i216 >> 3) & 112), 28);
                    Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, 0.0f, f116, 0.0f, 0.0f, 13);
                    C2307m c2307m3 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC35950b.f153100t);
                    AbstractC33088k.g gVar3 = new AbstractC33088k.g(AbstractC2890e.m8450e().getB1(), C2299e.f9107J);
                    boolean zM41274k3 = m41274k(interfaceC28601c2);
                    float f117 = 0 * f113;
                    C22976l1 c22976l3 = new C22976l1(f117, f117, f117, f117);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13921a0(7, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    c0209i3 = c0209i2;
                    AbstractC33087j.m104824f(c8688bM21277k3, gVar3, zM41274k3, false, 0, 0L, null, c22976l3, false, 0L, (Function1) objM87133R5, c28655q, 12582912 | TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 6, 888);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    Modifier modifierM3398t9 = AbstractC1099a.m3398t(c2314t, 0.0f, f116, f114, 3 * f113, 1);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t9);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N9);
                    EnumC13178k enumC13178k3 = EnumC13178k.INPUT;
                    if ((i216 & 7168) == 2048) {
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z25) {
                        function5 = function4;
                        objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function5 = function4;
                        objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R6;
                    int i36 = i216 << 3;
                    z14 = z211;
                    AbstractC13172e.m36935g(enumC13178k3, z24, z210, z14, interfaceC4339a6, c28655q, (i36 & 896) | 6 | (i36 & 7168), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function5;
                    z16 = z210;
                    modifier3 = modifier6;
                } else {
                    c28655q.m87138X();
                    z16 = z4;
                    modifier3 = modifier2;
                    function3 = function2;
                }
                z17 = z14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14467i(modifier3, z16, z17, function3, i13, i14);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i25 != 0) {
                    z18 = false;
                } else {
                    z18 = z4;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C14068f(19);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function2 = (Function1) objM87133R7;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                if (m41272i(interfaceC28601c1).length() > 0) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                float f118 = 8;
                float f119 = 2 * f118;
                float f1110 = 1 * f118;
                Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier2), f119, 0.0f, 2), 0.0f, 0.0f, 0.0f, f1110, 7), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM92116f3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                boolean z212 = z18;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i13 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i13, c23010xM66775a4);
                C0209i c0209i14 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                Modifier modifier7 = modifier2;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i15 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N10);
                String strM21273g4 = AbstractC8693b.m21273g(AbstractC35950b.f153101u, c28655q, 0);
                C38072d c38072d4 = C38072d.f163053a;
                int i218 = C38072d.f163054b;
                C2886a c2886aM8418P4 = c38072d4.m121952e(c28655q, i218).getT3();
                long jM125430y4 = c38072d4.m121949b(c28655q, i218).getBrandWhite();
                int i219 = C2886a.f11498d << 18;
                function4 = function2;
                int i2110 = i15;
                AbstractC30795n.m94707h(strM21273g4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P4, null, c28655q, 0, i219, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153099s, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f1110, 0.0f, 0.0f, 13), c38072d4.m121949b(c28655q, i218).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i218).getB1(), null, c28655q, 48, i219, 196600);
                float f1111 = 4 * f118;
                Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111, 0.0f, 0.0f, 13);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(m41272i(interfaceC28601c1));
                C14460b c14460b4 = C14460b.f52784a;
                InterfaceC4351m interfaceC4351mM41201c4 = c14460b4.m41201c();
                TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                C33252i c33252iM64090c4 = C22411w.f87680a.m64535a().m64090c();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C13998z1(17);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R4 = new C13921a0(6, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                }
                Function1 function9 = (Function1) objM87133R4;
                int i2111 = TextResource.$stable;
                interfaceC28601c4 = interfaceC28601c3;
                AbstractC30792k.m94678l(modifierM3398t10, textResourceM21278l4, null, null, null, interfaceC4351mM41201c4, null, null, textResourceM21267a4, false, false, null, 0L, true, 4, 0, 7, true, null, false, false, 0, false, null, null, c33252iM64090c4, null, null, null, null, interfaceC4339a7, function9, c28655q, (i2111 << 3) | 805502982 | (i2111 << 24), 14183424, 0, 54, 1039965404, 0);
                boolean z213 = z19;
                AbstractC1090b.m3350e(C23016z.f90757a, z213, AbstractC1099a.m3398t(c2314t, 0.0f, f119, 0.0f, 0.0f, 13), null, null, null, c14460b4.m41202d(), c28655q, 1573254 | ((i2110 >> 3) & 112), 28);
                Modifier modifierM3398t11 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111, 0.0f, 0.0f, 13);
                C2307m c2307m4 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m4, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3398t11);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N11);
                TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC35950b.f153100t);
                AbstractC33088k.g gVar4 = new AbstractC33088k.g(AbstractC2890e.m8450e().getB1(), C2299e.f9107J);
                boolean zM41274k4 = m41274k(interfaceC28601c2);
                float f1112 = 0 * f118;
                C22976l1 c22976l4 = new C22976l1(f1112, f1112, f1112, f1112);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13921a0(7, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                c0209i3 = c0209i2;
                AbstractC33087j.m104824f(c8688bM21277k4, gVar4, zM41274k4, false, 0, 0L, null, c22976l4, false, 0L, (Function1) objM87133R5, c28655q, 12582912 | TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 6, 888);
                c28655q = c28655q;
                c28655q.m87173q(true);
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111, f119, 3 * f118, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m4, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3398t12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N12);
                EnumC13178k enumC13178k4 = EnumC13178k.INPUT;
                if ((i2110 & 7168) == 2048) {
                }
                objM87133R6 = c28655q.m87133R();
                if (z25) {
                    function5 = function4;
                    objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function5 = function4;
                    objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R6;
                int i37 = i2110 << 3;
                z14 = z213;
                AbstractC13172e.m36935g(enumC13178k4, z24, z212, z14, interfaceC4339a8, c28655q, (i37 & 896) | 6 | (i37 & 7168), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function5;
                z16 = z212;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                z16 = z4;
                modifier3 = modifier2;
                function3 = function2;
            }
            z17 = z14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14467i(modifier3, z16, z17, function3, i13, i14);
            }
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z14 = z13;
                if (c28655q.m87155h(z14)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C14068f(19);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function2 = (Function1) objM87133R7;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    if (m41272i(interfaceC28601c1).length() > 0) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    float f1113 = 8;
                    float f1114 = 2 * f1113;
                    float f1115 = 1 * f1113;
                    Modifier modifierM92116f4 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier2), f1114, 0.0f, 2), 0.0f, 0.0f, 0.0f, f1115, 7), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM92116f4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    boolean z214 = z18;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i16 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a5);
                    C0209i c0209i17 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    Modifier modifier8 = modifier2;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i18 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N13);
                    String strM21273g5 = AbstractC8693b.m21273g(AbstractC35950b.f153101u, c28655q, 0);
                    C38072d c38072d5 = C38072d.f163053a;
                    int i2112 = C38072d.f163054b;
                    C2886a c2886aM8418P5 = c38072d5.m121952e(c28655q, i2112).getT3();
                    long jM125430y5 = c38072d5.m121949b(c28655q, i2112).getBrandWhite();
                    int i2113 = C2886a.f11498d << 18;
                    function4 = function2;
                    int i2114 = i15;
                    AbstractC30795n.m94707h(strM21273g5, null, jM125430y5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P5, null, c28655q, 0, i2113, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153099s, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f1115, 0.0f, 0.0f, 13), c38072d5.m121949b(c28655q, i2112).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, i2112).getB1(), null, c28655q, 48, i2113, 196600);
                    float f1116 = 4 * f1113;
                    Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1116, 0.0f, 0.0f, 13);
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m41272i(interfaceC28601c1));
                    C14460b c14460b5 = C14460b.f52784a;
                    InterfaceC4351m interfaceC4351mM41201c5 = c14460b5.m41201c();
                    TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                    C33252i c33252iM64090c5 = C22411w.f87680a.m64535a().m64090c();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13998z1(17);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        interfaceC28601c3 = interfaceC28601c1;
                        objM87133R4 = new C13921a0(6, interfaceC28601c3);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        interfaceC28601c3 = interfaceC28601c1;
                    }
                    Function1 function10 = (Function1) objM87133R4;
                    int i2115 = TextResource.$stable;
                    interfaceC28601c4 = interfaceC28601c3;
                    AbstractC30792k.m94678l(modifierM3398t13, textResourceM21278l5, null, null, null, interfaceC4351mM41201c5, null, null, textResourceM21267a5, false, false, null, 0L, true, 4, 0, 7, true, null, false, false, 0, false, null, null, c33252iM64090c5, null, null, null, null, interfaceC4339a9, function10, c28655q, (i2115 << 3) | 805502982 | (i2115 << 24), 14183424, 0, 54, 1039965404, 0);
                    boolean z215 = z19;
                    AbstractC1090b.m3350e(C23016z.f90757a, z215, AbstractC1099a.m3398t(c2314t, 0.0f, f1114, 0.0f, 0.0f, 13), null, null, null, c14460b5.m41202d(), c28655q, 1573254 | ((i2114 >> 3) & 112), 28);
                    Modifier modifierM3398t14 = AbstractC1099a.m3398t(c2314t, 0.0f, f1116, 0.0f, 0.0f, 13);
                    C2307m c2307m5 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m5, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3398t14);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC39127r0M66763d9);
                    AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N14);
                    TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC35950b.f153100t);
                    AbstractC33088k.g gVar5 = new AbstractC33088k.g(AbstractC2890e.m8450e().getB1(), C2299e.f9107J);
                    boolean zM41274k5 = m41274k(interfaceC28601c2);
                    float f1117 = 0 * f1113;
                    C22976l1 c22976l5 = new C22976l1(f1117, f1117, f1117, f1117);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13921a0(7, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    c0209i3 = c0209i2;
                    AbstractC33087j.m104824f(c8688bM21277k5, gVar5, zM41274k5, false, 0, 0L, null, c22976l5, false, 0L, (Function1) objM87133R5, c28655q, 12582912 | TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 6, 888);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    Modifier modifierM3398t15 = AbstractC1099a.m3398t(c2314t, 0.0f, f1116, f1114, 3 * f1113, 1);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m5, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3398t15);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m15);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N15);
                    EnumC13178k enumC13178k5 = EnumC13178k.INPUT;
                    if ((i2114 & 7168) == 2048) {
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z25) {
                        function5 = function4;
                        objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function5 = function4;
                        objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R6;
                    int i38 = i2114 << 3;
                    z14 = z215;
                    AbstractC13172e.m36935g(enumC13178k5, z24, z214, z14, interfaceC4339a10, c28655q, (i38 & 896) | 6 | (i38 & 7168), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function5;
                    z16 = z214;
                    modifier3 = modifier8;
                } else {
                    c28655q.m87138X();
                    z16 = z4;
                    modifier3 = modifier2;
                    function3 = function2;
                }
                z17 = z14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14467i(modifier3, z16, z17, function3, i13, i14);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i25 != 0) {
                    z18 = false;
                } else {
                    z18 = z4;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C14068f(19);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function2 = (Function1) objM87133R7;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                if (m41272i(interfaceC28601c1).length() > 0) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                float f1118 = 8;
                float f1119 = 2 * f1118;
                float f11110 = 1 * f1118;
                Modifier modifierM92116f5 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier2), f1119, 0.0f, 2), 0.0f, 0.0f, 0.0f, f11110, 7), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM92116f5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                boolean z216 = z18;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i19 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a6);
                C0209i c0209i110 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                Modifier modifier9 = modifier2;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N16);
                String strM21273g6 = AbstractC8693b.m21273g(AbstractC35950b.f153101u, c28655q, 0);
                C38072d c38072d6 = C38072d.f163053a;
                int i2116 = C38072d.f163054b;
                C2886a c2886aM8418P6 = c38072d6.m121952e(c28655q, i2116).getT3();
                long jM125430y6 = c38072d6.m121949b(c28655q, i2116).getBrandWhite();
                int i2117 = C2886a.f11498d << 18;
                function4 = function2;
                int i2118 = i15;
                AbstractC30795n.m94707h(strM21273g6, null, jM125430y6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P6, null, c28655q, 0, i2117, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153099s, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f11110, 0.0f, 0.0f, 13), c38072d6.m121949b(c28655q, i2116).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, i2116).getB1(), null, c28655q, 48, i2117, 196600);
                float f11111 = 4 * f1118;
                Modifier modifierM3398t16 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111, 0.0f, 0.0f, 13);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(m41272i(interfaceC28601c1));
                C14460b c14460b6 = C14460b.f52784a;
                InterfaceC4351m interfaceC4351mM41201c6 = c14460b6.m41201c();
                TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                C33252i c33252iM64090c6 = C22411w.f87680a.m64535a().m64090c();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C13998z1(17);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R4 = new C13921a0(6, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                }
                Function1 function11 = (Function1) objM87133R4;
                int i2119 = TextResource.$stable;
                interfaceC28601c4 = interfaceC28601c3;
                AbstractC30792k.m94678l(modifierM3398t16, textResourceM21278l6, null, null, null, interfaceC4351mM41201c6, null, null, textResourceM21267a6, false, false, null, 0L, true, 4, 0, 7, true, null, false, false, 0, false, null, null, c33252iM64090c6, null, null, null, null, interfaceC4339a11, function11, c28655q, (i2119 << 3) | 805502982 | (i2119 << 24), 14183424, 0, 54, 1039965404, 0);
                boolean z217 = z19;
                AbstractC1090b.m3350e(C23016z.f90757a, z217, AbstractC1099a.m3398t(c2314t, 0.0f, f1119, 0.0f, 0.0f, 13), null, null, null, c14460b6.m41202d(), c28655q, 1573254 | ((i2118 >> 3) & 112), 28);
                Modifier modifierM3398t17 = AbstractC1099a.m3398t(c2314t, 0.0f, f11111, 0.0f, 0.0f, 13);
                C2307m c2307m6 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m6, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3398t17);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC39127r0M66763d11);
                AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m17);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N17);
                TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC35950b.f153100t);
                AbstractC33088k.g gVar6 = new AbstractC33088k.g(AbstractC2890e.m8450e().getB1(), C2299e.f9107J);
                boolean zM41274k6 = m41274k(interfaceC28601c2);
                float f11112 = 0 * f1118;
                C22976l1 c22976l6 = new C22976l1(f11112, f11112, f11112, f11112);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13921a0(7, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                c0209i3 = c0209i2;
                AbstractC33087j.m104824f(c8688bM21277k6, gVar6, zM41274k6, false, 0, 0L, null, c22976l6, false, 0L, (Function1) objM87133R5, c28655q, 12582912 | TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 6, 888);
                c28655q = c28655q;
                c28655q.m87173q(true);
                Modifier modifierM3398t18 = AbstractC1099a.m3398t(c2314t, 0.0f, f11111, f1119, 3 * f1118, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m6, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3398t18);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N18);
                EnumC13178k enumC13178k6 = EnumC13178k.INPUT;
                if ((i2118 & 7168) == 2048) {
                }
                objM87133R6 = c28655q.m87133R();
                if (z25) {
                    function5 = function4;
                    objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function5 = function4;
                    objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                int i39 = i2118 << 3;
                z14 = z217;
                AbstractC13172e.m36935g(enumC13178k6, z24, z216, z14, interfaceC4339a12, c28655q, (i39 & 896) | 6 | (i39 & 7168), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function5;
                z16 = z216;
                modifier3 = modifier9;
            } else {
                c28655q.m87138X();
                z16 = z4;
                modifier3 = modifier2;
                function3 = function2;
            }
            z17 = z14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14467i(modifier3, z16, z17, function3, i13, i14);
            }
        }
        i15 |= 384;
        z14 = z13;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i25 != 0) {
                    z18 = false;
                } else {
                    z18 = z4;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C14068f(19);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function2 = (Function1) objM87133R7;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                if (m41272i(interfaceC28601c1).length() > 0) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                float f11113 = 8;
                float f11114 = 2 * f11113;
                float f11115 = 1 * f11113;
                Modifier modifierM92116f6 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier2), f11114, 0.0f, 2), 0.0f, 0.0f, 0.0f, f11115, 7), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM92116f6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                boolean z218 = z18;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i112 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i112, c23010xM66775a7);
                C0209i c0209i113 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m19);
                c0209i = C0217k.f732j;
                Modifier modifier10 = modifier2;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i114 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N19);
                String strM21273g7 = AbstractC8693b.m21273g(AbstractC35950b.f153101u, c28655q, 0);
                C38072d c38072d7 = C38072d.f163053a;
                int i21110 = C38072d.f163054b;
                C2886a c2886aM8418P7 = c38072d7.m121952e(c28655q, i21110).getT3();
                long jM125430y7 = c38072d7.m121949b(c28655q, i21110).getBrandWhite();
                int i21111 = C2886a.f11498d << 18;
                function4 = function2;
                int i21112 = i15;
                AbstractC30795n.m94707h(strM21273g7, null, jM125430y7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P7, null, c28655q, 0, i21111, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153099s, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f11115, 0.0f, 0.0f, 13), c38072d7.m121949b(c28655q, i21110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, i21110).getB1(), null, c28655q, 48, i21111, 196600);
                float f11116 = 4 * f11113;
                Modifier modifierM3398t19 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11116, 0.0f, 0.0f, 13);
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(m41272i(interfaceC28601c1));
                C14460b c14460b7 = C14460b.f52784a;
                InterfaceC4351m interfaceC4351mM41201c7 = c14460b7.m41201c();
                TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                C33252i c33252iM64090c7 = C22411w.f87680a.m64535a().m64090c();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C13998z1(17);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R4 = new C13921a0(6, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                }
                Function1 function12 = (Function1) objM87133R4;
                int i21113 = TextResource.$stable;
                interfaceC28601c4 = interfaceC28601c3;
                AbstractC30792k.m94678l(modifierM3398t19, textResourceM21278l7, null, null, null, interfaceC4351mM41201c7, null, null, textResourceM21267a7, false, false, null, 0L, true, 4, 0, 7, true, null, false, false, 0, false, null, null, c33252iM64090c7, null, null, null, null, interfaceC4339a13, function12, c28655q, (i21113 << 3) | 805502982 | (i21113 << 24), 14183424, 0, 54, 1039965404, 0);
                boolean z219 = z19;
                AbstractC1090b.m3350e(C23016z.f90757a, z219, AbstractC1099a.m3398t(c2314t, 0.0f, f11114, 0.0f, 0.0f, 13), null, null, null, c14460b7.m41202d(), c28655q, 1573254 | ((i21112 >> 3) & 112), 28);
                Modifier modifierM3398t110 = AbstractC1099a.m3398t(c2314t, 0.0f, f11116, 0.0f, 0.0f, 13);
                C2307m c2307m7 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m7, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3398t110);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d13);
                AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m110);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N110);
                TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC35950b.f153100t);
                AbstractC33088k.g gVar7 = new AbstractC33088k.g(AbstractC2890e.m8450e().getB1(), C2299e.f9107J);
                boolean zM41274k7 = m41274k(interfaceC28601c2);
                float f11117 = 0 * f11113;
                C22976l1 c22976l7 = new C22976l1(f11117, f11117, f11117, f11117);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13921a0(7, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                c0209i3 = c0209i2;
                AbstractC33087j.m104824f(c8688bM21277k7, gVar7, zM41274k7, false, 0, 0L, null, c22976l7, false, 0L, (Function1) objM87133R5, c28655q, 12582912 | TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 6, 888);
                c28655q = c28655q;
                c28655q.m87173q(true);
                Modifier modifierM3398t111 = AbstractC1099a.m3398t(c2314t, 0.0f, f11116, f11114, 3 * f11113, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m7, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3398t111);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N111);
                EnumC13178k enumC13178k7 = EnumC13178k.INPUT;
                if ((i21112 & 7168) == 2048) {
                }
                objM87133R6 = c28655q.m87133R();
                if (z25) {
                    function5 = function4;
                    objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function5 = function4;
                    objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R6;
                int i310 = i21112 << 3;
                z14 = z219;
                AbstractC13172e.m36935g(enumC13178k7, z24, z218, z14, interfaceC4339a14, c28655q, (i310 & 896) | 6 | (i310 & 7168), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function5;
                z16 = z218;
                modifier3 = modifier10;
            } else {
                c28655q.m87138X();
                z16 = z4;
                modifier3 = modifier2;
                function3 = function2;
            }
            z17 = z14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14467i(modifier3, z16, z17, function3, i13, i14);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            if (i25 != 0) {
                z18 = false;
            } else {
                z18 = z4;
            }
            if (i16 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C14068f(19);
                    c28655q.m87172p0(objM87133R7);
                }
                function2 = (Function1) objM87133R7;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            if (m41272i(interfaceC28601c1).length() > 0) {
                z24 = false;
            } else {
                z24 = false;
            }
            float f11118 = 8;
            float f11119 = 2 * f11118;
            float f111110 = 1 * f11118;
            Modifier modifierM92116f7 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier2), f11119, 0.0f, 2), 0.0f, 0.0f, 0.0f, f111110, 7), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM92116f7);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            boolean z2110 = z18;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i115 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i115, c23010xM66775a8);
            C0209i c0209i116 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            Modifier modifier11 = modifier2;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i117 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N112);
            String strM21273g8 = AbstractC8693b.m21273g(AbstractC35950b.f153101u, c28655q, 0);
            C38072d c38072d8 = C38072d.f163053a;
            int i21114 = C38072d.f163054b;
            C2886a c2886aM8418P8 = c38072d8.m121952e(c28655q, i21114).getT3();
            long jM125430y8 = c38072d8.m121949b(c28655q, i21114).getBrandWhite();
            int i21115 = C2886a.f11498d << 18;
            function4 = function2;
            int i21116 = i15;
            AbstractC30795n.m94707h(strM21273g8, null, jM125430y8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P8, null, c28655q, 0, i21115, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153099s, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f111110, 0.0f, 0.0f, 13), c38072d8.m121949b(c28655q, i21114).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, i21114).getB1(), null, c28655q, 48, i21115, 196600);
            float f111111 = 4 * f11118;
            Modifier modifierM3398t112 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111111, 0.0f, 0.0f, 13);
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(m41272i(interfaceC28601c1));
            C14460b c14460b8 = C14460b.f52784a;
            InterfaceC4351m interfaceC4351mM41201c8 = c14460b8.m41201c();
            TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
            C33252i c33252iM64090c8 = C22411w.f87680a.m64535a().m64090c();
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C13998z1(17);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R3;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                interfaceC28601c3 = interfaceC28601c1;
                objM87133R4 = new C13921a0(6, interfaceC28601c3);
                c28655q.m87172p0(objM87133R4);
            } else {
                interfaceC28601c3 = interfaceC28601c1;
            }
            Function1 function13 = (Function1) objM87133R4;
            int i21117 = TextResource.$stable;
            interfaceC28601c4 = interfaceC28601c3;
            AbstractC30792k.m94678l(modifierM3398t112, textResourceM21278l8, null, null, null, interfaceC4351mM41201c8, null, null, textResourceM21267a8, false, false, null, 0L, true, 4, 0, 7, true, null, false, false, 0, false, null, null, c33252iM64090c8, null, null, null, null, interfaceC4339a15, function13, c28655q, (i21117 << 3) | 805502982 | (i21117 << 24), 14183424, 0, 54, 1039965404, 0);
            boolean z2111 = z19;
            AbstractC1090b.m3350e(C23016z.f90757a, z2111, AbstractC1099a.m3398t(c2314t, 0.0f, f11119, 0.0f, 0.0f, 13), null, null, null, c14460b8.m41202d(), c28655q, 1573254 | ((i21116 >> 3) & 112), 28);
            Modifier modifierM3398t113 = AbstractC1099a.m3398t(c2314t, 0.0f, f111111, 0.0f, 0.0f, 13);
            C2307m c2307m8 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m8, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3398t113);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC39127r0M66763d15);
            AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC28653p1M87165m113);
            if (c28655q.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N113);
            TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC35950b.f153100t);
            AbstractC33088k.g gVar8 = new AbstractC33088k.g(AbstractC2890e.m8450e().getB1(), C2299e.f9107J);
            boolean zM41274k8 = m41274k(interfaceC28601c2);
            float f111112 = 0 * f11118;
            C22976l1 c22976l8 = new C22976l1(f111112, f111112, f111112, f111112);
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C13921a0(7, interfaceC28601c2);
                c28655q.m87172p0(objM87133R5);
            }
            c0209i3 = c0209i2;
            AbstractC33087j.m104824f(c8688bM21277k8, gVar8, zM41274k8, false, 0, 0L, null, c22976l8, false, 0L, (Function1) objM87133R5, c28655q, 12582912 | TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 6, 888);
            c28655q = c28655q;
            c28655q.m87173q(true);
            Modifier modifierM3398t114 = AbstractC1099a.m3398t(c2314t, 0.0f, f111111, f11119, 3 * f11118, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m8, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3398t114);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC28653p1M87165m114);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N114);
            EnumC13178k enumC13178k8 = EnumC13178k.INPUT;
            if ((i21116 & 7168) == 2048) {
            }
            objM87133R6 = c28655q.m87133R();
            if (z25) {
                function5 = function4;
                objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                c28655q.m87172p0(objM87133R6);
            } else {
                function5 = function4;
                objM87133R6 = new C3590i(function5, interfaceC28601c4, 16);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R6;
            int i311 = i21116 << 3;
            z14 = z2111;
            AbstractC13172e.m36935g(enumC13178k8, z24, z2110, z14, interfaceC4339a16, c28655q, (i311 & 896) | 6 | (i311 & 7168), 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function5;
            z16 = z2110;
            modifier3 = modifier11;
        } else {
            c28655q.m87138X();
            z16 = z4;
            modifier3 = modifier2;
            function3 = function2;
        }
        z17 = z14;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14467i(modifier3, z16, z17, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m41271h(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final String m41272i(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: j */
    private static final void m41273j(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m41274k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m41275l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m41276m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m41277n(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m41273j(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m41278o(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m41275l(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m41279p(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(m41272i(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m41280q(Modifier modifier, boolean z4, boolean z13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m41270g(modifier, z4, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
