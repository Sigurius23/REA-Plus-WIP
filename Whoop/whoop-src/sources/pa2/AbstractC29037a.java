package pa2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import nq0.C27050m;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import oa2.C27753a;
import oa2.C27754b;
import oa2.C27756d;
import oa2.InterfaceC27755c;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p389p0.C28557w0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p395p6.C28884h1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28330f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: pa2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Loa2/d;", "viewState", "Lkotlin/Function2;", "Lcom/whoop/navigation/e;", "", "Ll83/a0;", "onClick", "Lkotlin/Function1;", "Loa2/c;", "onViewEvent", "g", "(Loa2/d;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29037a {
    /* JADX WARN: Code duplicated, block: B:100:0x039c  */
    /* JADX WARN: Code duplicated, block: B:103:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:106:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:107:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:111:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:112:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:114:0x0415  */
    /* JADX WARN: Code duplicated, block: B:115:0x0417  */
    /* JADX WARN: Code duplicated, block: B:118:0x0421 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0427  */
    /* JADX WARN: Code duplicated, block: B:125:0x0463  */
    /* JADX WARN: Code duplicated, block: B:126:0x0465  */
    /* JADX WARN: Code duplicated, block: B:129:0x046e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0474  */
    /* JADX WARN: Code duplicated, block: B:135:0x04af  */
    /* JADX WARN: Code duplicated, block: B:138:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:68:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0197  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x020e  */
    /* JADX WARN: Code duplicated, block: B:90:0x027d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0281  */
    /* JADX WARN: Code duplicated, block: B:96:0x029c  */
    /* JADX WARN: Code duplicated, block: B:99:0x039a  */
    /* JADX INFO: renamed from: g */
    public static final void m88276g(C27756d viewState, InterfaceC4351m interfaceC4351m, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4351m interfaceC4351m2;
        boolean z4;
        C28655q c28655q;
        InterfaceC4351m interfaceC4351m3;
        Function1 function2;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4351m interfaceC4351m4;
        Function1 function3;
        C2307m c2307m;
        int iHashCode;
        C2314t c2314t;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C27753a myAccountHeader;
        int iHashCode2;
        float f13;
        int iHashCode3;
        InterfaceC4351m interfaceC4351m5;
        AbstractC22403o icon;
        int iHashCode4;
        C0209i c0209i5;
        char c3;
        char c7;
        boolean z13;
        C28655q c28655q2;
        int iHashCode5;
        int i16;
        float f14;
        EnumC27284v enumC27284v;
        int i17;
        boolean z14;
        boolean z15;
        Object objM87133R;
        C28676v0 c28676v1;
        InterfaceC4351m interfaceC4351m6;
        InterfaceC4351m interfaceC4351m7;
        C28676v0 c28676v2;
        C28655q c28655q3;
        C27754b switchCta;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        C28676v0 c28676v3;
        InterfaceC4351m interfaceC4351m8;
        InterfaceC4351m interfaceC4351m9;
        boolean z18;
        boolean z19;
        Object objM87133R3;
        InterfaceC4351m interfaceC4351m10;
        InterfaceC4351m interfaceC4351m11;
        boolean z24;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(324041071);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q4.m87153g(viewState) : c28655q4.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i15 |= c28655q4.m87157i(interfaceC4351m2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C28557w0(8);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if ((i14 & 4) != 0) {
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C28884h1(10);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function1;
                }
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                myAccountHeader = viewState.getMyAccountHeader();
                if (myAccountHeader == null) {
                    c28655q4.m87150e0(37667876);
                    c28655q4.m87173q(false);
                    interfaceC4351m11 = interfaceC4351m4;
                    c28655q = c28655q4;
                    z24 = true;
                } else {
                    c28655q4.m87150e0(37667877);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q4, 48);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    int i19 = i15;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    f13 = 8;
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.5d, f13, C2299e.f9108K, c28655q4, 54);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M53376q);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
                    interfaceC4351m5 = interfaceC4351m4;
                    icon = myAccountHeader.getIcon();
                    if (icon == null) {
                        c28655q4.m87150e0(-113817891);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                        c0209i5 = c0209i3;
                        z13 = true;
                        c3 = 2;
                        c7 = 4;
                    } else {
                        c28655q4.m87150e0(-113817890);
                        C38072d c38072d = C38072d.f163053a;
                        int i24 = C38072d.f163054b;
                        float f15 = 4;
                        Modifier modifierM31987f = AbstractC11895b.m31987f(2, f15, c2314t, c38072d.m121949b(c28655q4, i24).getBrandWhite());
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM31987f);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N4);
                        Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f15, AbstractC1099a.m3394p(((float) 0.5d) * f13, c2314t));
                        c0209i5 = c0209i3;
                        c3 = 2;
                        c7 = 4;
                        AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(icon, null, null, c28655q4, AbstractC22403o.f87638a, 3);
                        long brandBlack = c38072d.m121949b(c28655q4, i24).getBrandBlack();
                        z13 = true;
                        AbstractC15005f3.m43107a(abstractC26165aM64500i, null, modifierM3419p, brandBlack, c28655q4, 432, 0);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f13), C2299e.f9110M, c28655q2, 6);
                    iHashCode5 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                    TextResource title = myAccountHeader.getTitle();
                    i16 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(title, c28655q2, i16);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    C2886a b6 = c38072d2.m121952e(c28655q2, i25).getB1();
                    long brandWhite = c38072d2.m121949b(c28655q2, i25).getBrandWhite();
                    int i26 = C2886a.f11498d << 18;
                    C28655q c28655q5 = c28655q2;
                    AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q5, 0, i26, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(myAccountHeader.getSubtitle(), c28655q5, i16), null, c38072d2.m121949b(c28655q5, i25).getGreyL2(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q5, i25).getB3(), null, c28655q5, 0, i26, 196602);
                    c28655q5.m87173q(true);
                    c28655q5.m87173q(true);
                    f14 = 2 * f13;
                    Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13), 16, 4, c38072d2.m121949b(c28655q5, i25).getBrandWhite());
                    enumC27284v = EnumC27284v.TextMedium;
                    String strM21274h2 = AbstractC8693b.m21274h(myAccountHeader.getJoinCta().getText(), c28655q5, i16);
                    long black20 = c38072d2.m121949b(c28655q5, i25).getBlack20();
                    boolean zM87157i = c28655q5.m87157i(myAccountHeader);
                    i17 = i19 & 112;
                    if (i17 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i | z14;
                    objM87133R = c28655q5.m87133R();
                    if (z15) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R == c28676v1) {
                            interfaceC4351m6 = interfaceC4351m5;
                        }
                        interfaceC4351m7 = interfaceC4351m6;
                        c28676v2 = c28676v1;
                        AbstractC27282u.m82292h(modifierM95629e, enumC27284v, strM21274h2, false, black20, null, false, (InterfaceC4339a) objM87133R, c28655q5, 48, 104);
                        c28655q3 = c28655q5;
                        switchCta = myAccountHeader.getSwitchCta();
                        if (switchCta == null) {
                            c28655q3.m87150e0(-184474362);
                            c28655q3.m87173q(false);
                            interfaceC4351m9 = interfaceC4351m7;
                            c28676v3 = c28676v2;
                        } else {
                            c28655q3.m87150e0(-184474361);
                            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13);
                            String strM21274h3 = AbstractC8693b.m21274h(switchCta.getText(), c28655q3, i16);
                            boolean zM87157i2 = c28655q3.m87157i(switchCta);
                            if (i17 == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = zM87157i2 | z16;
                            objM87133R2 = c28655q3.m87133R();
                            c28676v3 = c28676v2;
                            if (!z17 || objM87133R2 == c28676v3) {
                                interfaceC4351m8 = interfaceC4351m7;
                                objM87133R2 = new C28448b(17, switchCta, interfaceC4351m8);
                                c28655q3.m87172p0(objM87133R2);
                            } else {
                                interfaceC4351m8 = interfaceC4351m7;
                            }
                            interfaceC4351m9 = interfaceC4351m8;
                            AbstractC27282u.m82292h(modifierM3398t, enumC27284v, strM21274h3, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q3, 54, 120);
                            c28655q3 = c28655q3;
                            c28655q3.m87173q(false);
                        }
                        EnumC27269n0 enumC27269n0 = EnumC27269n0.TextMedium;
                        TextResource text = myAccountHeader.getCancelCta().getText();
                        boolean zM87157i3 = c28655q3.m87157i(myAccountHeader);
                        if (i17 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zM87157i3 | z18;
                        objM87133R3 = c28655q3.m87133R();
                        if (!z19 || objM87133R3 == c28676v3) {
                            interfaceC4351m10 = interfaceC4351m9;
                            objM87133R3 = new C27050m(23, myAccountHeader, interfaceC4351m10);
                            c28655q3.m87172p0(objM87133R3);
                        } else {
                            interfaceC4351m10 = interfaceC4351m9;
                        }
                        interfaceC4351m11 = interfaceC4351m10;
                        C28655q c28655q6 = c28655q3;
                        z24 = true;
                        AbstractC27265l0.m82217i(null, enumC27269n0, text, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q6, (i16 << 6) | 48, 0, 4089);
                        c28655q = c28655q6;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    interfaceC4351m6 = interfaceC4351m5;
                    objM87133R = new C28448b(16, myAccountHeader, interfaceC4351m6);
                    c28655q5.m87172p0(objM87133R);
                    interfaceC4351m7 = interfaceC4351m6;
                    c28676v2 = c28676v1;
                    AbstractC27282u.m82292h(modifierM95629e, enumC27284v, strM21274h2, false, black20, null, false, (InterfaceC4339a) objM87133R, c28655q5, 48, 104);
                    c28655q3 = c28655q5;
                    switchCta = myAccountHeader.getSwitchCta();
                    if (switchCta == null) {
                        c28655q3.m87150e0(-184474362);
                        c28655q3.m87173q(false);
                        interfaceC4351m9 = interfaceC4351m7;
                        c28676v3 = c28676v2;
                    } else {
                        c28655q3.m87150e0(-184474361);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13);
                        String strM21274h4 = AbstractC8693b.m21274h(switchCta.getText(), c28655q3, i16);
                        boolean zM87157i4 = c28655q3.m87157i(switchCta);
                        if (i17 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zM87157i4 | z16;
                        objM87133R2 = c28655q3.m87133R();
                        c28676v3 = c28676v2;
                        if (z17) {
                            interfaceC4351m8 = interfaceC4351m7;
                            objM87133R2 = new C28448b(17, switchCta, interfaceC4351m8);
                            c28655q3.m87172p0(objM87133R2);
                        } else {
                            interfaceC4351m8 = interfaceC4351m7;
                            objM87133R2 = new C28448b(17, switchCta, interfaceC4351m8);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        interfaceC4351m9 = interfaceC4351m8;
                        AbstractC27282u.m82292h(modifierM3398t2, enumC27284v, strM21274h4, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q3, 54, 120);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    }
                    EnumC27269n0 enumC27269n1 = EnumC27269n0.TextMedium;
                    TextResource text2 = myAccountHeader.getCancelCta().getText();
                    boolean zM87157i5 = c28655q3.m87157i(myAccountHeader);
                    if (i17 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i5 | z18;
                    objM87133R3 = c28655q3.m87133R();
                    if (z19) {
                        interfaceC4351m10 = interfaceC4351m9;
                        objM87133R3 = new C27050m(23, myAccountHeader, interfaceC4351m10);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        interfaceC4351m10 = interfaceC4351m9;
                        objM87133R3 = new C27050m(23, myAccountHeader, interfaceC4351m10);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC4351m11 = interfaceC4351m10;
                    C28655q c28655q7 = c28655q3;
                    z24 = true;
                    AbstractC27265l0.m82217i(null, enumC27269n1, text2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q7, (i16 << 6) | 48, 0, 4089);
                    c28655q = c28655q7;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z24);
                interfaceC4351m3 = interfaceC4351m11;
                function2 = function3;
            } else {
                c28655q = c28655q4;
                c28655q.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(viewState, interfaceC4351m3, function2, i13, i14, 16);
            }
        }
        i15 |= 48;
        interfaceC4351m2 = interfaceC4351m;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C28557w0(8);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
            } else {
                interfaceC4351m4 = interfaceC4351m2;
            }
            if ((i14 & 4) != 0) {
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C28884h1(10);
                    c28655q4.m87172p0(objM87133R4);
                }
                function3 = (Function1) objM87133R4;
            } else {
                function3 = function1;
            }
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m6);
            c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N6);
            myAccountHeader = viewState.getMyAccountHeader();
            if (myAccountHeader == null) {
                c28655q4.m87150e0(37667876);
                c28655q4.m87173q(false);
                interfaceC4351m11 = interfaceC4351m4;
                c28655q = c28655q4;
                z24 = true;
            } else {
                c28655q4.m87150e0(37667877);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q4, 48);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                int i110 = i15;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m7);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N7);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                f13 = 8;
                C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 1.5d, f13, C2299e.f9108K, c28655q4, 54);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM3409f2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M53376q2);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m8);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N8);
                interfaceC4351m5 = interfaceC4351m4;
                icon = myAccountHeader.getIcon();
                if (icon == null) {
                    c28655q4.m87150e0(-113817891);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                    c0209i5 = c0209i3;
                    z13 = true;
                    c3 = 2;
                    c7 = 4;
                } else {
                    c28655q4.m87150e0(-113817890);
                    C38072d c38072d3 = C38072d.f163053a;
                    int i27 = C38072d.f163054b;
                    float f16 = 4;
                    Modifier modifierM31987f2 = AbstractC11895b.m31987f(2, f16, c2314t, c38072d3.m121949b(c28655q4, i27).getBrandWhite());
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierM31987f2);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m9);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N9);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * f16, AbstractC1099a.m3394p(((float) 0.5d) * f13, c2314t));
                    c0209i5 = c0209i3;
                    c3 = 2;
                    c7 = 4;
                    AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(icon, null, null, c28655q4, AbstractC22403o.f87638a, 3);
                    long brandBlack2 = c38072d3.m121949b(c28655q4, i27).getBrandBlack();
                    z13 = true;
                    AbstractC15005f3.m43107a(abstractC26165aM64500i2, null, modifierM3419p2, brandBlack2, c28655q4, 432, 0);
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f13), C2299e.f9110M, c28655q2, 6);
                iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m10);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N10);
                TextResource title2 = myAccountHeader.getTitle();
                i16 = TextResource.$stable;
                String strM21274h5 = AbstractC8693b.m21274h(title2, c28655q2, i16);
                C38072d c38072d4 = C38072d.f163053a;
                int i28 = C38072d.f163054b;
                C2886a b8 = c38072d4.m121952e(c28655q2, i28).getB1();
                long brandWhite2 = c38072d4.m121949b(c28655q2, i28).getBrandWhite();
                int i29 = C2886a.f11498d << 18;
                C28655q c28655q8 = c28655q2;
                AbstractC30795n.m94707h(strM21274h5, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q8, 0, i29, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(myAccountHeader.getSubtitle(), c28655q8, i16), null, c38072d4.m121949b(c28655q8, i28).getGreyL2(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q8, i28).getB3(), null, c28655q8, 0, i29, 196602);
                c28655q8.m87173q(true);
                c28655q8.m87173q(true);
                f14 = 2 * f13;
                Modifier modifierM95629e2 = AbstractC31061c.m95629e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13), 16, 4, c38072d4.m121949b(c28655q8, i28).getBrandWhite());
                enumC27284v = EnumC27284v.TextMedium;
                String strM21274h6 = AbstractC8693b.m21274h(myAccountHeader.getJoinCta().getText(), c28655q8, i16);
                long black21 = c38072d4.m121949b(c28655q8, i28).getBlack20();
                boolean zM87157i6 = c28655q8.m87157i(myAccountHeader);
                i17 = i110 & 112;
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i6 | z14;
                objM87133R = c28655q8.m87133R();
                if (z15) {
                    c28676v1 = c28676v0;
                    if (objM87133R == c28676v1) {
                        interfaceC4351m6 = interfaceC4351m5;
                    }
                    interfaceC4351m7 = interfaceC4351m6;
                    c28676v2 = c28676v1;
                    AbstractC27282u.m82292h(modifierM95629e2, enumC27284v, strM21274h6, false, black21, null, false, (InterfaceC4339a) objM87133R, c28655q8, 48, 104);
                    c28655q3 = c28655q8;
                    switchCta = myAccountHeader.getSwitchCta();
                    if (switchCta == null) {
                        c28655q3.m87150e0(-184474362);
                        c28655q3.m87173q(false);
                        interfaceC4351m9 = interfaceC4351m7;
                        c28676v3 = c28676v2;
                    } else {
                        c28655q3.m87150e0(-184474361);
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13);
                        String strM21274h7 = AbstractC8693b.m21274h(switchCta.getText(), c28655q3, i16);
                        boolean zM87157i7 = c28655q3.m87157i(switchCta);
                        if (i17 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zM87157i7 | z16;
                        objM87133R2 = c28655q3.m87133R();
                        c28676v3 = c28676v2;
                        if (z17) {
                            interfaceC4351m8 = interfaceC4351m7;
                            objM87133R2 = new C28448b(17, switchCta, interfaceC4351m8);
                            c28655q3.m87172p0(objM87133R2);
                        } else {
                            interfaceC4351m8 = interfaceC4351m7;
                            objM87133R2 = new C28448b(17, switchCta, interfaceC4351m8);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        interfaceC4351m9 = interfaceC4351m8;
                        AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, strM21274h7, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q3, 54, 120);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    }
                    EnumC27269n0 enumC27269n2 = EnumC27269n0.TextMedium;
                    TextResource text3 = myAccountHeader.getCancelCta().getText();
                    boolean zM87157i8 = c28655q3.m87157i(myAccountHeader);
                    if (i17 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i8 | z18;
                    objM87133R3 = c28655q3.m87133R();
                    if (z19) {
                        interfaceC4351m10 = interfaceC4351m9;
                        objM87133R3 = new C27050m(23, myAccountHeader, interfaceC4351m10);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        interfaceC4351m10 = interfaceC4351m9;
                        objM87133R3 = new C27050m(23, myAccountHeader, interfaceC4351m10);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC4351m11 = interfaceC4351m10;
                    C28655q c28655q9 = c28655q3;
                    z24 = true;
                    AbstractC27265l0.m82217i(null, enumC27269n2, text3, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q9, (i16 << 6) | 48, 0, 4089);
                    c28655q = c28655q9;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c28676v1 = c28676v0;
                }
                interfaceC4351m6 = interfaceC4351m5;
                objM87133R = new C28448b(16, myAccountHeader, interfaceC4351m6);
                c28655q8.m87172p0(objM87133R);
                interfaceC4351m7 = interfaceC4351m6;
                c28676v2 = c28676v1;
                AbstractC27282u.m82292h(modifierM95629e2, enumC27284v, strM21274h6, false, black21, null, false, (InterfaceC4339a) objM87133R, c28655q8, 48, 104);
                c28655q3 = c28655q8;
                switchCta = myAccountHeader.getSwitchCta();
                if (switchCta == null) {
                    c28655q3.m87150e0(-184474362);
                    c28655q3.m87173q(false);
                    interfaceC4351m9 = interfaceC4351m7;
                    c28676v3 = c28676v2;
                } else {
                    c28655q3.m87150e0(-184474361);
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13);
                    String strM21274h8 = AbstractC8693b.m21274h(switchCta.getText(), c28655q3, i16);
                    boolean zM87157i9 = c28655q3.m87157i(switchCta);
                    if (i17 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i9 | z16;
                    objM87133R2 = c28655q3.m87133R();
                    c28676v3 = c28676v2;
                    if (z17) {
                        interfaceC4351m8 = interfaceC4351m7;
                        objM87133R2 = new C28448b(17, switchCta, interfaceC4351m8);
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        interfaceC4351m8 = interfaceC4351m7;
                        objM87133R2 = new C28448b(17, switchCta, interfaceC4351m8);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    interfaceC4351m9 = interfaceC4351m8;
                    AbstractC27282u.m82292h(modifierM3398t4, enumC27284v, strM21274h8, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q3, 54, 120);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                }
                EnumC27269n0 enumC27269n3 = EnumC27269n0.TextMedium;
                TextResource text4 = myAccountHeader.getCancelCta().getText();
                boolean zM87157i10 = c28655q3.m87157i(myAccountHeader);
                if (i17 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i10 | z18;
                objM87133R3 = c28655q3.m87133R();
                if (z19) {
                    interfaceC4351m10 = interfaceC4351m9;
                    objM87133R3 = new C27050m(23, myAccountHeader, interfaceC4351m10);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    interfaceC4351m10 = interfaceC4351m9;
                    objM87133R3 = new C27050m(23, myAccountHeader, interfaceC4351m10);
                    c28655q3.m87172p0(objM87133R3);
                }
                interfaceC4351m11 = interfaceC4351m10;
                C28655q c28655q10 = c28655q3;
                z24 = true;
                AbstractC27265l0.m82217i(null, enumC27269n3, text4, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q10, (i16 << 6) | 48, 0, 4089);
                c28655q = c28655q10;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z24);
            interfaceC4351m3 = interfaceC4351m11;
            function2 = function3;
        } else {
            c28655q = c28655q4;
            c28655q.m87138X();
            interfaceC4351m3 = interfaceC4351m2;
            function2 = function1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(viewState, interfaceC4351m3, function2, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m88277h(C9598e c9598e, String str) {
        AbstractC22676k.m65750j(c9598e, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m88278i(InterfaceC27755c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m88279j(C27753a c27753a, InterfaceC4351m interfaceC4351m) {
        C27754b joinCta = c27753a.getJoinCta();
        C9598e destination = joinCta.getDestination();
        if (destination != null) {
            interfaceC4351m.invoke(destination, joinCta.getTracking());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m88280k(C27754b c27754b, InterfaceC4351m interfaceC4351m) {
        C9598e destination = c27754b.getDestination();
        if (destination != null) {
            interfaceC4351m.invoke(destination, c27754b.getTracking());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m88281l(C27753a c27753a, InterfaceC4351m interfaceC4351m, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C27754b cancelCta = c27753a.getCancelCta();
        C9598e destination = cancelCta.getDestination();
        if (destination != null) {
            interfaceC4351m.invoke(destination, cancelCta.getTracking());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m88282m(C27756d c27756d, InterfaceC4351m interfaceC4351m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m88276g(c27756d, interfaceC4351m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
