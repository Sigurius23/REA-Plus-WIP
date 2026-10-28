package p719m22;

import a22.AbstractC0172a;
import a22.AbstractC0173b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import io.sentry.config.AbstractC20301a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k71.C22241a0;
import kl2.C22571f;
import kw1.C22852c;
import l01.C23045q;
import l72.C23401h;
import l83.C23454a0;
import lt2.C24738a;
import m01.C24875c;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24679k;
import p723o22.Function0;
import pf.AbstractC29125c;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qt0.C30586b;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39281n;
import y71.C39282o;

/* JADX INFO: renamed from: m22.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aS\u0010\t\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\r\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"", "Lqt0/b;", "deviceList", "Lkotlin/Function1;", "Ll83/a0;", "onDeviceSelected", "Lkotlin/Function0;", "onTroubleConnectingClicked", "onBackClicked", "u", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "l", "(Landroidx/compose/runtime/Composer;I)V", "n", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "device", "r", "(Lqt0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24949d {
    /* JADX INFO: renamed from: l */
    private static final void m73123l(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1089127947);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC0172a.f521a, c28655q, 0), null, AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m73124m(int i13, Composer composer, int i14) {
        m73123l(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x020f A[LOOP:0: B:73:0x0209->B:75:0x020f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x025d  */
    /* JADX WARN: Code duplicated, block: B:80:0x026a  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    private static final void m73125n(List<C30586b> list, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4339a interfaceC4339a4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        int iHashCode2;
        Iterator<T> it;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1241861187);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(list) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
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
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24875c(5);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24738a(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    float f13 = 8;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3396r(c2314t, 2 * f13, 0.0f, 2));
                    C22957g c22957g = AbstractC22977m.f90653d;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 6);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
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
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    Function1 function5 = function4;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f536c);
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    C2886a c2886aM8417O = c38072d.m121952e(c28655q2, i24).getT2();
                    long jM125430y = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    int i25 = C2886a.f11498d << 18;
                    function3 = function5;
                    i18 = i15;
                    AbstractC30795n.m94707h(strM92103Y, modifierM3409f, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 48, i25, 196600);
                    AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f537d), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getB1(), null, c28655q2, 48, i25, 196600);
                    float f14 = 4;
                    float f15 = 6 * f14;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t));
                    C23010x c23010xM73381n = AbstractC25012a.m73381n(3, f14, c2305k, c28655q2, 6);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM73381n);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    c28655q2.m87150e0(-236644465);
                    it = list.iterator();
                    while (it.hasNext()) {
                        m73129r((C30586b) it.next(), function3, c28655q2, i18 & 112);
                    }
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(true);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14 * f13, c2314t));
                    InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                    AbstractC27271o0.m82253b(null, false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f552s)), null, null, null, null, null, false, null, interfaceC4339a5, c28655q2, TextResource.$stable << 6, (i18 >> 6) & 14, 1019);
                    c28655q = c28655q2;
                    AbstractC30007c.m91851u(c2314t, f15, c28655q, true);
                    interfaceC4339a3 = interfaceC4339a5;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23401h(i13, i14, 27, list, function3, interfaceC4339a3);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24875c(5);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24738a(15);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                float f16 = 8;
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3396r(c2314t2, 2 * f16, 0.0f, 2));
                C22957g c22957g2 = AbstractC22977m.f90653d;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
                Function1 function6 = function4;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f536c);
                C38072d c38072d2 = C38072d.f163053a;
                int i26 = C38072d.f163054b;
                C2886a c2886aM8417O2 = c38072d2.m121952e(c28655q2, i26).getT2();
                long jM125430y2 = c38072d2.m121949b(c28655q2, i26).getBrandWhite();
                int i27 = C2886a.f11498d << 18;
                function3 = function6;
                i18 = i15;
                AbstractC30795n.m94707h(strM92103Y2, modifierM3409f2, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q2, 48, i27, 196600);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f537d), AbstractC1102d.m3409f(1.0f, c2314t2), c38072d2.m121949b(c28655q2, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i26).getB1(), null, c28655q2, 48, i27, 196600);
                float f17 = 4;
                float f18 = 6 * f17;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f18, c2314t2));
                C23010x c23010xM73381n2 = AbstractC25012a.m73381n(3, f17, c2305k2, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM73381n2);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
                c28655q2.m87150e0(-236644465);
                it = list.iterator();
                while (it.hasNext()) {
                    m73129r((C30586b) it.next(), function3, c28655q2, i18 & 112);
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(true);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f17 * f16, c2314t2));
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                AbstractC27271o0.m82253b(null, false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f552s)), null, null, null, null, null, false, null, interfaceC4339a6, c28655q2, TextResource.$stable << 6, (i18 >> 6) & 14, 1019);
                c28655q = c28655q2;
                AbstractC30007c.m91851u(c2314t2, f18, c28655q, true);
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 27, list, function3, interfaceC4339a3);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
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
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24875c(5);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24738a(15);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                float f19 = 8;
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3396r(c2314t3, 2 * f19, 0.0f, 2));
                C22957g c22957g3 = AbstractC22977m.f90653d;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3407d3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N5);
                Function1 function7 = function4;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                String strM92103Y3 = AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f536c);
                C38072d c38072d3 = C38072d.f163053a;
                int i28 = C38072d.f163054b;
                C2886a c2886aM8417O3 = c38072d3.m121952e(c28655q2, i28).getT2();
                long jM125430y3 = c38072d3.m121949b(c28655q2, i28).getBrandWhite();
                int i29 = C2886a.f11498d << 18;
                function3 = function7;
                i18 = i15;
                AbstractC30795n.m94707h(strM92103Y3, modifierM3409f3, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O3, null, c28655q2, 48, i29, 196600);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f537d), AbstractC1102d.m3409f(1.0f, c2314t3), c38072d3.m121949b(c28655q2, i28).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i28).getB1(), null, c28655q2, 48, i29, 196600);
                float f110 = 4;
                float f111 = 6 * f110;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111, c2314t3));
                C23010x c23010xM73381n3 = AbstractC25012a.m73381n(3, f110, c2305k3, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM73381n3);
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N6);
                c28655q2.m87150e0(-236644465);
                it = list.iterator();
                while (it.hasNext()) {
                    m73129r((C30586b) it.next(), function3, c28655q2, i18 & 112);
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(true);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f110 * f19, c2314t3));
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                AbstractC27271o0.m82253b(null, false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f552s)), null, null, null, null, null, false, null, interfaceC4339a7, c28655q2, TextResource.$stable << 6, (i18 >> 6) & 14, 1019);
                c28655q = c28655q2;
                AbstractC30007c.m91851u(c2314t3, f111, c28655q, true);
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 27, list, function3, interfaceC4339a3);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24875c(5);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C24738a(15);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            float f112 = 8;
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3396r(c2314t4, 2 * f112, 0.0f, 2));
            C22957g c22957g4 = AbstractC22977m.f90653d;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3407d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N7);
            Function1 function8 = function4;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
            String strM92103Y4 = AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f536c);
            C38072d c38072d4 = C38072d.f163053a;
            int i210 = C38072d.f163054b;
            C2886a c2886aM8417O4 = c38072d4.m121952e(c28655q2, i210).getT2();
            long jM125430y4 = c38072d4.m121949b(c28655q2, i210).getBrandWhite();
            int i211 = C2886a.f11498d << 18;
            function3 = function8;
            i18 = i15;
            AbstractC30795n.m94707h(strM92103Y4, modifierM3409f4, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O4, null, c28655q2, 48, i211, 196600);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f537d), AbstractC1102d.m3409f(1.0f, c2314t4), c38072d4.m121949b(c28655q2, i210).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i210).getB1(), null, c28655q2, 48, i211, 196600);
            float f113 = 4;
            float f114 = 6 * f113;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f114, c2314t4));
            C23010x c23010xM73381n4 = AbstractC25012a.m73381n(3, f113, c2305k4, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, c2314t4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM73381n4);
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N8);
            c28655q2.m87150e0(-236644465);
            it = list.iterator();
            while (it.hasNext()) {
                m73129r((C30586b) it.next(), function3, c28655q2, i18 & 112);
            }
            c28655q2.m87173q(false);
            c28655q2.m87173q(true);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f113 * f112, c2314t4));
            InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
            AbstractC27271o0.m82253b(null, false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f552s)), null, null, null, null, null, false, null, interfaceC4339a8, c28655q2, TextResource.$stable << 6, (i18 >> 6) & 14, 1019);
            c28655q = c28655q2;
            AbstractC30007c.m91851u(c2314t4, f114, c28655q, true);
            interfaceC4339a3 = interfaceC4339a8;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 27, list, function3, interfaceC4339a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m73126o(C30586b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m73127p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m73128q(List list, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m73125n(list, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m73129r(C30586b c30586b, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1441282624);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c30586b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C39282o.Companion companion = C39282o.INSTANCE;
            String strM93823b = c30586b.getName();
            Locale US = Locale.US;
            AbstractC22676k.m65749i(US, "US");
            String upperCase = strM93823b.toUpperCase(US);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            C39282o c39282oM125229d = C39282o.Companion.m125229d(companion, AbstractC8693b.m21278l(upperCase), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388606, null);
            boolean zM87157i = c28655q.m87157i(c30586b) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C23045q(function1, c30586b, 25);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39281n.m125207c(null, c39282oM125229d, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 1);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(c30586b, function1, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m73130s(Function1 function1, C30586b c30586b) {
        function1.invoke(c30586b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m73131t(C30586b c30586b, Function1 function1, int i13, Composer composer, int i14) {
        m73129r(c30586b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x011d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x0134  */
    /* JADX WARN: Code duplicated, block: B:83:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Code duplicated, block: B:89:0x0172  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public static final void m73132u(List<C30586b> deviceList, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a3;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a4;
        int i19;
        boolean z4;
        Function1 function3;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4339a interfaceC4339a7;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(deviceList, "deviceList");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-630330124);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(deviceList) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a3 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i19 = 2048;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C24875c(4);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function4 = (Function1) objM87133R4;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C24738a(13);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C24738a(14);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                        }
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13 || objM87133R == c28676v0) {
                            objM87133R = new C24679k(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                        Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66723l);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        m73123l(c28655q, 0);
                        Function0.m82899b(interfaceC4339a4, c28655q, (i15 >> 9) & 14);
                        Function1 function5 = function4;
                        m73125n(deviceList, function5, interfaceC4339a7, c28655q, i15 & 1022, 0);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a7;
                        function3 = function5;
                    } else {
                        c28655q.m87138X();
                        function3 = function2;
                        interfaceC4339a5 = interfaceC4339a3;
                    }
                    interfaceC4339a6 = interfaceC4339a4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C22852c(deviceList, function3, interfaceC4339a5, interfaceC4339a6, i13, i14);
                    }
                }
                i15 |= 3072;
                interfaceC4339a4 = interfaceC4339a2;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C24875c(4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C24738a(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24738a(14);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C24679k(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C24679k(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                    Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66723l2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    m73123l(c28655q, 0);
                    Function0.m82899b(interfaceC4339a4, c28655q, (i15 >> 9) & 14);
                    Function1 function6 = function4;
                    m73125n(deviceList, function6, interfaceC4339a7, c28655q, i15 & 1022, 0);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a7;
                    function3 = function6;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a5 = interfaceC4339a3;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c(deviceList, function3, interfaceC4339a5, interfaceC4339a6, i13, i14);
                }
            }
            i15 |= 384;
            interfaceC4339a3 = interfaceC4339a;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C24875c(4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C24738a(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24738a(14);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C24679k(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C24679k(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                    Modifier modifierM66723l3 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66723l3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    m73123l(c28655q, 0);
                    Function0.m82899b(interfaceC4339a4, c28655q, (i15 >> 9) & 14);
                    Function1 function7 = function4;
                    m73125n(deviceList, function7, interfaceC4339a7, c28655q, i15 & 1022, 0);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a7;
                    function3 = function7;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a5 = interfaceC4339a3;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c(deviceList, function3, interfaceC4339a5, interfaceC4339a6, i13, i14);
                }
            }
            i15 |= 3072;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C24875c(4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C24738a(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24738a(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                }
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C24679k(interfaceC4339a4, 6);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C24679k(interfaceC4339a4, 6);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                Modifier modifierM66723l4 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66723l4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                m73123l(c28655q, 0);
                Function0.m82899b(interfaceC4339a4, c28655q, (i15 >> 9) & 14);
                Function1 function8 = function4;
                m73125n(deviceList, function8, interfaceC4339a7, c28655q, i15 & 1022, 0);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a7;
                function3 = function8;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a5 = interfaceC4339a3;
            }
            interfaceC4339a6 = interfaceC4339a4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(deviceList, function3, interfaceC4339a5, interfaceC4339a6, i13, i14);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C24875c(4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C24738a(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24738a(14);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C24679k(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C24679k(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                    Modifier modifierM66723l5 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM66723l5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    m73123l(c28655q, 0);
                    Function0.m82899b(interfaceC4339a4, c28655q, (i15 >> 9) & 14);
                    Function1 function9 = function4;
                    m73125n(deviceList, function9, interfaceC4339a7, c28655q, i15 & 1022, 0);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a7;
                    function3 = function9;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a5 = interfaceC4339a3;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c(deviceList, function3, interfaceC4339a5, interfaceC4339a6, i13, i14);
                }
            }
            i15 |= 3072;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C24875c(4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C24738a(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24738a(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                }
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C24679k(interfaceC4339a4, 6);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C24679k(interfaceC4339a4, 6);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                Modifier modifierM66723l6 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM66723l6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                m73123l(c28655q, 0);
                Function0.m82899b(interfaceC4339a4, c28655q, (i15 >> 9) & 14);
                Function1 function10 = function4;
                m73125n(deviceList, function10, interfaceC4339a7, c28655q, i15 & 1022, 0);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a7;
                function3 = function10;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a5 = interfaceC4339a3;
            }
            interfaceC4339a6 = interfaceC4339a4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(deviceList, function3, interfaceC4339a5, interfaceC4339a6, i13, i14);
            }
        }
        i15 |= 384;
        interfaceC4339a3 = interfaceC4339a;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C24875c(4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C24738a(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24738a(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                }
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C24679k(interfaceC4339a4, 6);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C24679k(interfaceC4339a4, 6);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                Modifier modifierM66723l7 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66723l7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                m73123l(c28655q, 0);
                Function0.m82899b(interfaceC4339a4, c28655q, (i15 >> 9) & 14);
                Function1 function11 = function4;
                m73125n(deviceList, function11, interfaceC4339a7, c28655q, i15 & 1022, 0);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a7;
                function3 = function11;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a5 = interfaceC4339a3;
            }
            interfaceC4339a6 = interfaceC4339a4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(deviceList, function3, interfaceC4339a5, interfaceC4339a6, i13, i14);
            }
        }
        i15 |= 3072;
        interfaceC4339a4 = interfaceC4339a2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C24875c(4);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C24738a(13);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24738a(14);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            }
            if ((i15 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C24679k(interfaceC4339a4, 6);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C24679k(interfaceC4339a4, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
            Modifier modifierM66723l8 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM66723l8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            m73123l(c28655q, 0);
            Function0.m82899b(interfaceC4339a4, c28655q, (i15 >> 9) & 14);
            Function1 function12 = function4;
            m73125n(deviceList, function12, interfaceC4339a7, c28655q, i15 & 1022, 0);
            c28655q.m87173q(true);
            interfaceC4339a5 = interfaceC4339a7;
            function3 = function12;
        } else {
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a5 = interfaceC4339a3;
        }
        interfaceC4339a6 = interfaceC4339a4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c(deviceList, function3, interfaceC4339a5, interfaceC4339a6, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m73133v(C30586b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m73134w() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m73135x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m73136y(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m73137z(List list, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m73132u(list, function1, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
