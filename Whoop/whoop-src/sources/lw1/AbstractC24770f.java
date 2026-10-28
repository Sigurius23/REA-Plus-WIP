package lw1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import js2.C21927e;
import jt1.C21937b;
import l72.C23401h;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.C24174a;
import lt2.C24738a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lw1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a;\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llw1/k;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onApplyPromoCodeClicked", "g", "(Landroidx/compose/ui/Modifier;Llw1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "a", "Ljava/util/List;", "getPromoCodeViewStates", "()Ljava/util/List;", "PromoCodeViewStates", "code", "", "isExpanded", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24770f {

    /* JADX INFO: renamed from: a */
    private static final List<C24775k> f96875a;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("PROMO CODE");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("PROMO CODE?");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("APPLY");
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_ALERT;
        f96875a = AbstractC37056f.m118959K(new C24775k(true, false, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, null, null, enumC39333f), new C24775k(true, true, AbstractC8693b.m21278l("PROMO CODE"), AbstractC8693b.m21278l("PROMO CODE?"), AbstractC8693b.m21278l("APPLY"), null, null, enumC39333f), new C24775k(true, true, AbstractC8693b.m21278l("PROMO CODE"), AbstractC8693b.m21278l("PROMO CODE?"), AbstractC8693b.m21278l("APPLY"), "EXT10", AbstractC8693b.m21278l("Discount Applied"), EnumC39333f.ACCENT_ACTION), new C24775k(true, true, AbstractC8693b.m21278l("PROMO CODE"), AbstractC8693b.m21278l("PROMO CODE?"), AbstractC8693b.m21278l("APPLY"), "TEST", AbstractC8693b.m21278l("Invalid Promo Code"), enumC39333f));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:105:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:119:0x0337  */
    /* JADX WARN: Code duplicated, block: B:121:0x0343  */
    /* JADX WARN: Code duplicated, block: B:124:0x0390  */
    /* JADX WARN: Code duplicated, block: B:127:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:129:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:131:0x040d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0479  */
    /* JADX WARN: Code duplicated, block: B:136:0x048c  */
    /* JADX WARN: Code duplicated, block: B:139:0x049a  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:85:0x0218  */
    /* JADX WARN: Code duplicated, block: B:86:0x021a  */
    /* JADX WARN: Code duplicated, block: B:88:0x021d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0253  */
    /* JADX WARN: Code duplicated, block: B:94:0x0266  */
    /* JADX WARN: Code duplicated, block: B:95:0x0273  */
    /* JADX WARN: Code duplicated, block: B:98:0x02cc  */
    /* JADX INFO: renamed from: g */
    public static final void m72559g(Modifier modifier, C24775k c24775k, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        boolean z13;
        C28655q c28655q2;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        boolean z14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        C38072d c38072d;
        int i17;
        Function1 function5;
        int i18;
        int iHashCode2;
        boolean z15;
        Object objM87133R4;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        C24775k c24775k2;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R6;
        Function1 function6;
        boolean z19;
        long jM125339H;
        Object objM87133R7;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(783486391);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(c24775k) : c28655q3.m87157i(c24775k) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C24174a(25);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    function2 = (Function1) objM87133R7;
                }
                if (c24775k == null && c24775k.getEnabled()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    c28655q3.m87150e0(1991078134);
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(c24775k.getPromoCode());
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(c24775k.getExpanded()));
                        c28655q3.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    if (m72563k(interfaceC28601c2)) {
                        c28655q3.m87150e0(1991230592);
                        Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                        float f13 = 8;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q3, 6);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            i16 = i15;
                        } else {
                            i16 = i15;
                            if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                            TextResource textResourceM72611d = c24775k.getExpandedInputTitle();
                            int i25 = TextResource.$stable;
                            String strM21274h = AbstractC8693b.m21274h(textResourceM72611d, c28655q3, i25);
                            c38072d = C38072d.f163053a;
                            i17 = C38072d.f163054b;
                            C2886a c2886aM8432m = c38072d.m121952e(c28655q3, i17).getFormLabel();
                            long jM125385c1 = c38072d.m121949b(c28655q3, i17).getWhite70();
                            int i26 = C2886a.f11498d << 18;
                            function5 = function2;
                            i18 = i16;
                            Modifier modifier3 = modifier2;
                            AbstractC30795n.m94707h(strM21274h, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m, null, c28655q3, 0, i26, 196602);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q3, 48);
                            iHashCode2 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                            if (1.0f > 0.0d) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (!z15) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 2 * f13, 0.0f, 11);
                            TextResource textResourceM21278l = AbstractC8693b.m21278l(m72561i(interfaceC28601c1));
                            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("");
                            InterfaceC4351m interfaceC4351mM72516b = C24765a.f96870a.m72516b();
                            objM87133R4 = c28655q3.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C24738a(1);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                            objM87133R5 = c28655q3.m87133R();
                            if (objM87133R5 == c28676v0) {
                                interfaceC28601c3 = interfaceC28601c1;
                                objM87133R5 = new C21927e(11, interfaceC28601c3);
                                c28655q3.m87172p0(objM87133R5);
                            } else {
                                interfaceC28601c3 = interfaceC28601c1;
                            }
                            interfaceC28601c4 = interfaceC28601c3;
                            AbstractC30792k.m94678l(modifierM3398t, textResourceM21278l, null, null, null, null, interfaceC4351mM72516b, null, textResourceM21278l2, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a, (Function1) objM87133R5, c28655q3, (i25 << 3) | 1572864 | (i25 << 24), 24576, 0, 54, 1073725116, 0);
                            if ((i18 & 112) != 32) {
                                if ((i18 & 64) != 0) {
                                    c24775k2 = c24775k;
                                    if (c28655q3.m87157i(c24775k2)) {
                                    }
                                    if ((i18 & 896) == 256) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    z18 = z17 | z16;
                                    objM87133R6 = c28655q3.m87133R();
                                    if (!z18 || objM87133R6 == c28676v0) {
                                        function6 = function5;
                                        objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                        c28655q3.m87172p0(objM87133R6);
                                    } else {
                                        function6 = function5;
                                    }
                                    Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                                    String strM21274h2 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i25);
                                    C2886a c2886aM8430k = c38072d.m121952e(c28655q3, i17).getBtS();
                                    if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                                        z19 = false;
                                        c28655q3.m87150e0(-1891962323);
                                        jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                                    } else {
                                        jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                                        z19 = false;
                                    }
                                    c28655q3.m87173q(z19);
                                    function4 = function6;
                                    AbstractC30795n.m94707h(strM21274h2, modifierM3362g, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k, null, c28655q3, 0, i26, 196600);
                                    c28655q2 = c28655q3;
                                    c28655q2.m87173q(true);
                                    if (c24775k2.getStatusText() == null && AbstractC8693b.m21270d(c24775k2.getStatusText())) {
                                        c28655q2.m87150e0(749644592);
                                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c24775k2.getStatusText(), c28655q2, i25), null, c24775k2.getStatusColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB4(), null, c28655q2, 0, i26, 196602);
                                        c28655q2 = c28655q2;
                                        z14 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z14 = false;
                                        c28655q2.m87150e0(749884439);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(true);
                                    c28655q2.m87173q(z14);
                                    modifier2 = modifier3;
                                } else {
                                    c24775k2 = c24775k;
                                }
                                z16 = false;
                                if ((i18 & 896) == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z17 | z16;
                                objM87133R6 = c28655q3.m87133R();
                                if (z18) {
                                    function6 = function5;
                                    objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                    c28655q3.m87172p0(objM87133R6);
                                } else {
                                    function6 = function5;
                                    objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                    c28655q3.m87172p0(objM87133R6);
                                }
                                Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                                String strM21274h3 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i25);
                                C2886a c2886aM8430k2 = c38072d.m121952e(c28655q3, i17).getBtS();
                                if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                                    jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                                    z19 = false;
                                } else {
                                    z19 = false;
                                    c28655q3.m87150e0(-1891962323);
                                    jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                                }
                                c28655q3.m87173q(z19);
                                function4 = function6;
                                AbstractC30795n.m94707h(strM21274h3, modifierM3362g2, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k2, null, c28655q3, 0, i26, 196600);
                                c28655q2 = c28655q3;
                                c28655q2.m87173q(true);
                                if (c24775k2.getStatusText() == null) {
                                    z14 = false;
                                    c28655q2.m87150e0(749884439);
                                    c28655q2.m87173q(false);
                                } else {
                                    z14 = false;
                                    c28655q2.m87150e0(749884439);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(z14);
                                modifier2 = modifier3;
                            } else {
                                c24775k2 = c24775k;
                            }
                            z16 = true;
                            if ((i18 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z17 | z16;
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                function6 = function5;
                                objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                function6 = function5;
                                objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            Modifier modifierM3362g3 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                            String strM21274h4 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i25);
                            C2886a c2886aM8430k3 = c38072d.m121952e(c28655q3, i17).getBtS();
                            if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                                jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                                z19 = false;
                            } else {
                                z19 = false;
                                c28655q3.m87150e0(-1891962323);
                                jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                            }
                            c28655q3.m87173q(z19);
                            function4 = function6;
                            AbstractC30795n.m94707h(strM21274h4, modifierM3362g3, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k3, null, c28655q3, 0, i26, 196600);
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(true);
                            if (c24775k2.getStatusText() == null) {
                                z14 = false;
                                c28655q2.m87150e0(749884439);
                                c28655q2.m87173q(false);
                            } else {
                                z14 = false;
                                c28655q2.m87150e0(749884439);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(z14);
                            modifier2 = modifier3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
                        TextResource textResourceM72611d2 = c24775k.getExpandedInputTitle();
                        int i27 = TextResource.$stable;
                        String strM21274h5 = AbstractC8693b.m21274h(textResourceM72611d2, c28655q3, i27);
                        c38072d = C38072d.f163053a;
                        i17 = C38072d.f163054b;
                        C2886a c2886aM8432m2 = c38072d.m121952e(c28655q3, i17).getFormLabel();
                        long jM125385c2 = c38072d.m121949b(c28655q3, i17).getWhite70();
                        int i28 = C2886a.f11498d << 18;
                        function5 = function2;
                        i18 = i16;
                        Modifier modifier4 = modifier2;
                        AbstractC30795n.m94707h(strM21274h5, null, jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m2, null, c28655q3, 0, i28, 196602);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q3, 48);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N3);
                        if (1.0f > 0.0d) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 2 * f13, 0.0f, 11);
                        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m72561i(interfaceC28601c1));
                        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("");
                        InterfaceC4351m interfaceC4351mM72516b2 = C24765a.f96870a.m72516b();
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C24738a(1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c3 = interfaceC28601c1;
                            objM87133R5 = new C21927e(11, interfaceC28601c3);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c3 = interfaceC28601c1;
                        }
                        interfaceC28601c4 = interfaceC28601c3;
                        AbstractC30792k.m94678l(modifierM3398t2, textResourceM21278l3, null, null, null, null, interfaceC4351mM72516b2, null, textResourceM21278l4, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a2, (Function1) objM87133R5, c28655q3, (i27 << 3) | 1572864 | (i27 << 24), 24576, 0, 54, 1073725116, 0);
                        if ((i18 & 112) != 32) {
                            if ((i18 & 64) != 0) {
                                c24775k2 = c24775k;
                                if (c28655q3.m87157i(c24775k2)) {
                                }
                                if ((i18 & 896) == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z17 | z16;
                                objM87133R6 = c28655q3.m87133R();
                                if (z18) {
                                    function6 = function5;
                                    objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                    c28655q3.m87172p0(objM87133R6);
                                } else {
                                    function6 = function5;
                                    objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                    c28655q3.m87172p0(objM87133R6);
                                }
                                Modifier modifierM3362g4 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                                String strM21274h6 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i27);
                                C2886a c2886aM8430k4 = c38072d.m121952e(c28655q3, i17).getBtS();
                                if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                                    jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                                    z19 = false;
                                } else {
                                    z19 = false;
                                    c28655q3.m87150e0(-1891962323);
                                    jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                                }
                                c28655q3.m87173q(z19);
                                function4 = function6;
                                AbstractC30795n.m94707h(strM21274h6, modifierM3362g4, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k4, null, c28655q3, 0, i28, 196600);
                                c28655q2 = c28655q3;
                                c28655q2.m87173q(true);
                                if (c24775k2.getStatusText() == null) {
                                    z14 = false;
                                    c28655q2.m87150e0(749884439);
                                    c28655q2.m87173q(false);
                                } else {
                                    z14 = false;
                                    c28655q2.m87150e0(749884439);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(z14);
                                modifier2 = modifier4;
                            } else {
                                c24775k2 = c24775k;
                            }
                            z16 = false;
                            if ((i18 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z17 | z16;
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                function6 = function5;
                                objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                function6 = function5;
                                objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            Modifier modifierM3362g5 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                            String strM21274h7 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i27);
                            C2886a c2886aM8430k5 = c38072d.m121952e(c28655q3, i17).getBtS();
                            if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                                jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                                z19 = false;
                            } else {
                                z19 = false;
                                c28655q3.m87150e0(-1891962323);
                                jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                            }
                            c28655q3.m87173q(z19);
                            function4 = function6;
                            AbstractC30795n.m94707h(strM21274h7, modifierM3362g5, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k5, null, c28655q3, 0, i28, 196600);
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(true);
                            if (c24775k2.getStatusText() == null) {
                                z14 = false;
                                c28655q2.m87150e0(749884439);
                                c28655q2.m87173q(false);
                            } else {
                                z14 = false;
                                c28655q2.m87150e0(749884439);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(z14);
                            modifier2 = modifier4;
                        } else {
                            c24775k2 = c24775k;
                        }
                        z16 = true;
                        if ((i18 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | z16;
                        objM87133R6 = c28655q3.m87133R();
                        if (z18) {
                            function6 = function5;
                            objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            function6 = function5;
                            objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        Modifier modifierM3362g6 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                        String strM21274h8 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i27);
                        C2886a c2886aM8430k6 = c38072d.m121952e(c28655q3, i17).getBtS();
                        if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                            jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                            z19 = false;
                        } else {
                            z19 = false;
                            c28655q3.m87150e0(-1891962323);
                            jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                        }
                        c28655q3.m87173q(z19);
                        function4 = function6;
                        AbstractC30795n.m94707h(strM21274h8, modifierM3362g6, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k6, null, c28655q3, 0, i28, 196600);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        if (c24775k2.getStatusText() == null) {
                            z14 = false;
                            c28655q2.m87150e0(749884439);
                            c28655q2.m87173q(false);
                        } else {
                            z14 = false;
                            c28655q2.m87150e0(749884439);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(z14);
                        modifier2 = modifier4;
                    } else {
                        Modifier modifier5 = modifier2;
                        function4 = function2;
                        c28655q3.m87150e0(1993208175);
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C21937b(23, interfaceC28601c2);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        modifier2 = modifier5;
                        Modifier modifierMo3471e2 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15).mo3471e(modifier2);
                        String strM21274h9 = AbstractC8693b.m21274h(c24775k.getInputTitle(), c28655q3, TextResource.$stable);
                        C38072d c38072d2 = C38072d.f163053a;
                        int i29 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strM21274h9, modifierMo3471e2, c38072d2.m121949b(c28655q3, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i29).getFormLabel(), null, c28655q3, 0, C2886a.f11498d << 18, 196600);
                        c28655q2 = c28655q3;
                        z14 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                } else {
                    c28655q2 = c28655q3;
                    function4 = function2;
                    c28655q2.m87150e0(1993527723);
                    c28655q2.m87173q(false);
                }
                c28655q = c28655q2;
                function3 = function4;
            } else {
                c28655q3.m87138X();
                c28655q = c28655q3;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 25, (Object) modifier2, (Object) c24775k, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C24174a(25);
                    c28655q3.m87172p0(objM87133R7);
                }
                function2 = (Function1) objM87133R7;
            }
            if (c24775k == null) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (z13) {
                c28655q3.m87150e0(1991078134);
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(c24775k.getPromoCode());
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(c24775k.getExpanded()));
                    c28655q3.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                if (m72563k(interfaceC28601c2)) {
                    c28655q3.m87150e0(1991230592);
                    Modifier modifierMo3471e3 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                    float f14 = 8;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q3, 6);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i6 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i6, c23010xM66775a2);
                    C0209i c0209i7 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        i16 = i15;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i8 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N4);
                        TextResource textResourceM72611d3 = c24775k.getExpandedInputTitle();
                        int i210 = TextResource.$stable;
                        String strM21274h10 = AbstractC8693b.m21274h(textResourceM72611d3, c28655q3, i210);
                        c38072d = C38072d.f163053a;
                        i17 = C38072d.f163054b;
                        C2886a c2886aM8432m3 = c38072d.m121952e(c28655q3, i17).getFormLabel();
                        long jM125385c3 = c38072d.m121949b(c28655q3, i17).getWhite70();
                        int i211 = C2886a.f11498d << 18;
                        function5 = function2;
                        i18 = i16;
                        Modifier modifier6 = modifier2;
                        AbstractC30795n.m94707h(strM21274h10, null, jM125385c3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m3, null, c28655q3, 0, i211, 196602);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q3, 48);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i6, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m5);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N5);
                        if (1.0f > 0.0d) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 2 * f14, 0.0f, 11);
                        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m72561i(interfaceC28601c1));
                        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("");
                        InterfaceC4351m interfaceC4351mM72516b3 = C24765a.f96870a.m72516b();
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C24738a(1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c3 = interfaceC28601c1;
                            objM87133R5 = new C21927e(11, interfaceC28601c3);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c3 = interfaceC28601c1;
                        }
                        interfaceC28601c4 = interfaceC28601c3;
                        AbstractC30792k.m94678l(modifierM3398t3, textResourceM21278l5, null, null, null, null, interfaceC4351mM72516b3, null, textResourceM21278l6, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a3, (Function1) objM87133R5, c28655q3, (i210 << 3) | 1572864 | (i210 << 24), 24576, 0, 54, 1073725116, 0);
                        if ((i18 & 112) != 32) {
                            if ((i18 & 64) != 0) {
                                c24775k2 = c24775k;
                                if (c28655q3.m87157i(c24775k2)) {
                                }
                                if ((i18 & 896) == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z17 | z16;
                                objM87133R6 = c28655q3.m87133R();
                                if (z18) {
                                    function6 = function5;
                                    objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                    c28655q3.m87172p0(objM87133R6);
                                } else {
                                    function6 = function5;
                                    objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                    c28655q3.m87172p0(objM87133R6);
                                }
                                Modifier modifierM3362g7 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                                String strM21274h11 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i210);
                                C2886a c2886aM8430k7 = c38072d.m121952e(c28655q3, i17).getBtS();
                                if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                                    jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                                    z19 = false;
                                } else {
                                    z19 = false;
                                    c28655q3.m87150e0(-1891962323);
                                    jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                                }
                                c28655q3.m87173q(z19);
                                function4 = function6;
                                AbstractC30795n.m94707h(strM21274h11, modifierM3362g7, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k7, null, c28655q3, 0, i211, 196600);
                                c28655q2 = c28655q3;
                                c28655q2.m87173q(true);
                                if (c24775k2.getStatusText() == null) {
                                    z14 = false;
                                    c28655q2.m87150e0(749884439);
                                    c28655q2.m87173q(false);
                                } else {
                                    z14 = false;
                                    c28655q2.m87150e0(749884439);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(z14);
                                modifier2 = modifier6;
                            } else {
                                c24775k2 = c24775k;
                            }
                            z16 = false;
                            if ((i18 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z17 | z16;
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                function6 = function5;
                                objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                function6 = function5;
                                objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            Modifier modifierM3362g8 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                            String strM21274h12 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i210);
                            C2886a c2886aM8430k8 = c38072d.m121952e(c28655q3, i17).getBtS();
                            if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                                jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                                z19 = false;
                            } else {
                                z19 = false;
                                c28655q3.m87150e0(-1891962323);
                                jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                            }
                            c28655q3.m87173q(z19);
                            function4 = function6;
                            AbstractC30795n.m94707h(strM21274h12, modifierM3362g8, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k8, null, c28655q3, 0, i211, 196600);
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(true);
                            if (c24775k2.getStatusText() == null) {
                                z14 = false;
                                c28655q2.m87150e0(749884439);
                                c28655q2.m87173q(false);
                            } else {
                                z14 = false;
                                c28655q2.m87150e0(749884439);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(z14);
                            modifier2 = modifier6;
                        } else {
                            c24775k2 = c24775k;
                        }
                        z16 = true;
                        if ((i18 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | z16;
                        objM87133R6 = c28655q3.m87133R();
                        if (z18) {
                            function6 = function5;
                            objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            function6 = function5;
                            objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        Modifier modifierM3362g9 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                        String strM21274h13 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i210);
                        C2886a c2886aM8430k9 = c38072d.m121952e(c28655q3, i17).getBtS();
                        if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                            jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                            z19 = false;
                        } else {
                            z19 = false;
                            c28655q3.m87150e0(-1891962323);
                            jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                        }
                        c28655q3.m87173q(z19);
                        function4 = function6;
                        AbstractC30795n.m94707h(strM21274h13, modifierM3362g9, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k9, null, c28655q3, 0, i211, 196600);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        if (c24775k2.getStatusText() == null) {
                            z14 = false;
                            c28655q2.m87150e0(749884439);
                            c28655q2.m87173q(false);
                        } else {
                            z14 = false;
                            c28655q2.m87150e0(749884439);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(z14);
                        modifier2 = modifier6;
                    } else {
                        i16 = i15;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N4);
                    TextResource textResourceM72611d4 = c24775k.getExpandedInputTitle();
                    int i212 = TextResource.$stable;
                    String strM21274h14 = AbstractC8693b.m21274h(textResourceM72611d4, c28655q3, i212);
                    c38072d = C38072d.f163053a;
                    i17 = C38072d.f163054b;
                    C2886a c2886aM8432m4 = c38072d.m121952e(c28655q3, i17).getFormLabel();
                    long jM125385c4 = c38072d.m121949b(c28655q3, i17).getWhite70();
                    int i213 = C2886a.f11498d << 18;
                    function5 = function2;
                    i18 = i16;
                    Modifier modifier7 = modifier2;
                    AbstractC30795n.m94707h(strM21274h14, null, jM125385c4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m4, null, c28655q3, 0, i213, 196602);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q3, 48);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i6, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m6);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N6);
                    if (1.0f > 0.0d) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 2 * f14, 0.0f, 11);
                    TextResource textResourceM21278l7 = AbstractC8693b.m21278l(m72561i(interfaceC28601c1));
                    TextResource textResourceM21278l8 = AbstractC8693b.m21278l("");
                    InterfaceC4351m interfaceC4351mM72516b4 = C24765a.f96870a.m72516b();
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C24738a(1);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c3 = interfaceC28601c1;
                        objM87133R5 = new C21927e(11, interfaceC28601c3);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c3 = interfaceC28601c1;
                    }
                    interfaceC28601c4 = interfaceC28601c3;
                    AbstractC30792k.m94678l(modifierM3398t4, textResourceM21278l7, null, null, null, null, interfaceC4351mM72516b4, null, textResourceM21278l8, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a4, (Function1) objM87133R5, c28655q3, (i212 << 3) | 1572864 | (i212 << 24), 24576, 0, 54, 1073725116, 0);
                    if ((i18 & 112) != 32) {
                        if ((i18 & 64) != 0) {
                            c24775k2 = c24775k;
                            if (c28655q3.m87157i(c24775k2)) {
                            }
                            if ((i18 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z17 | z16;
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                function6 = function5;
                                objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                function6 = function5;
                                objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            Modifier modifierM3362g10 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                            String strM21274h15 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i212);
                            C2886a c2886aM8430k10 = c38072d.m121952e(c28655q3, i17).getBtS();
                            if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                                jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                                z19 = false;
                            } else {
                                z19 = false;
                                c28655q3.m87150e0(-1891962323);
                                jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                            }
                            c28655q3.m87173q(z19);
                            function4 = function6;
                            AbstractC30795n.m94707h(strM21274h15, modifierM3362g10, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k10, null, c28655q3, 0, i213, 196600);
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(true);
                            if (c24775k2.getStatusText() == null) {
                                z14 = false;
                                c28655q2.m87150e0(749884439);
                                c28655q2.m87173q(false);
                            } else {
                                z14 = false;
                                c28655q2.m87150e0(749884439);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(z14);
                            modifier2 = modifier7;
                        } else {
                            c24775k2 = c24775k;
                        }
                        z16 = false;
                        if ((i18 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | z16;
                        objM87133R6 = c28655q3.m87133R();
                        if (z18) {
                            function6 = function5;
                            objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            function6 = function5;
                            objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        Modifier modifierM3362g11 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                        String strM21274h16 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i212);
                        C2886a c2886aM8430k11 = c38072d.m121952e(c28655q3, i17).getBtS();
                        if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                            jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                            z19 = false;
                        } else {
                            z19 = false;
                            c28655q3.m87150e0(-1891962323);
                            jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                        }
                        c28655q3.m87173q(z19);
                        function4 = function6;
                        AbstractC30795n.m94707h(strM21274h16, modifierM3362g11, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k11, null, c28655q3, 0, i213, 196600);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        if (c24775k2.getStatusText() == null) {
                            z14 = false;
                            c28655q2.m87150e0(749884439);
                            c28655q2.m87173q(false);
                        } else {
                            z14 = false;
                            c28655q2.m87150e0(749884439);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(z14);
                        modifier2 = modifier7;
                    } else {
                        c24775k2 = c24775k;
                    }
                    z16 = true;
                    if ((i18 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | z16;
                    objM87133R6 = c28655q3.m87133R();
                    if (z18) {
                        function6 = function5;
                        objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        function6 = function5;
                        objM87133R6 = new C18656a0(c24775k2, function6, interfaceC28601c4, 24);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3362g12 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R6, 15);
                    String strM21274h17 = AbstractC8693b.m21274h(c24775k2.getApplyCtaText(), c28655q3, i212);
                    C2886a c2886aM8430k12 = c38072d.m121952e(c28655q3, i17).getBtS();
                    if (AbstractC22676k.m65745e(m72561i(interfaceC28601c4), c24775k2.getPromoCode())) {
                        jM125339H = AbstractC25012a.m73366B(c28655q3, -1891963407, c38072d, c28655q3, i17);
                        z19 = false;
                    } else {
                        z19 = false;
                        c28655q3.m87150e0(-1891962323);
                        jM125339H = c38072d.m121949b(c28655q3, i17).getGreyL3();
                    }
                    c28655q3.m87173q(z19);
                    function4 = function6;
                    AbstractC30795n.m94707h(strM21274h17, modifierM3362g12, jM125339H, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k12, null, c28655q3, 0, i213, 196600);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(true);
                    if (c24775k2.getStatusText() == null) {
                        z14 = false;
                        c28655q2.m87150e0(749884439);
                        c28655q2.m87173q(false);
                    } else {
                        z14 = false;
                        c28655q2.m87150e0(749884439);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(z14);
                    modifier2 = modifier7;
                } else {
                    Modifier modifier8 = modifier2;
                    function4 = function2;
                    c28655q3.m87150e0(1993208175);
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C21937b(23, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    modifier2 = modifier8;
                    Modifier modifierMo3471e4 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15).mo3471e(modifier2);
                    String strM21274h18 = AbstractC8693b.m21274h(c24775k.getInputTitle(), c28655q3, TextResource.$stable);
                    C38072d c38072d3 = C38072d.f163053a;
                    int i214 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM21274h18, modifierMo3471e4, c38072d3.m121949b(c28655q3, i214).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q3, i214).getFormLabel(), null, c28655q3, 0, C2886a.f11498d << 18, 196600);
                    c28655q2 = c28655q3;
                    z14 = false;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
            } else {
                c28655q2 = c28655q3;
                function4 = function2;
                c28655q2.m87150e0(1993527723);
                c28655q2.m87173q(false);
            }
            c28655q = c28655q2;
            function3 = function4;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 25, (Object) modifier2, (Object) c24775k, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m72560h(String str) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final String m72561i(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: j */
    private static final void m72562j(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m72563k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m72564l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m72565m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m72566n(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m72562j(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m72567o(C24775k c24775k, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        if (!AbstractC22676k.m65745e(m72561i(interfaceC28601c1), c24775k.getPromoCode())) {
            function1.invoke(m72561i(interfaceC28601c1));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m72568p(InterfaceC28601c1 interfaceC28601c1) {
        m72564l(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m72569q(Modifier modifier, C24775k c24775k, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m72559g(modifier, c24775k, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
