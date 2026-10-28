package do0;

import am2.C1012d;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq1.C1910d;
import b30.C2609r;
import c41.C4007d1;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d42.C11699o;
import df2.C12000a;
import dh0.C12040a;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import java.util.WeakHashMap;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p412q3.InterfaceC29873g0;
import p635y2.InterfaceC39127r0;
import p706eo0.AbstractC13372c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30784c;
import sn0.AbstractC32772b;
import wb3.AbstractC37056f;
import x81.C38072d;
import zn0.AbstractC40903a;
import zn0.C40905c;

/* JADX INFO: renamed from: do0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\r\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lzn0/c;", "viewState", "Lkotlin/Function1;", "Lzn0/a;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onBackPressed", "l", "(Lzn0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "currentPassword", "newPassword", "confirmPassword", "change-password_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12228b {
    /* JADX INFO: renamed from: A */
    private static final String m33965A(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: B */
    private static final void m33966B(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: C */
    private static final String m33967C(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0271  */
    /* JADX WARN: Code duplicated, block: B:108:0x0284  */
    /* JADX WARN: Code duplicated, block: B:109:0x0291  */
    /* JADX WARN: Code duplicated, block: B:112:0x02de  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0300  */
    /* JADX WARN: Code duplicated, block: B:123:0x030c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x030e  */
    /* JADX WARN: Code duplicated, block: B:127:0x031c  */
    /* JADX WARN: Code duplicated, block: B:128:0x031e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0325 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x032b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0366  */
    /* JADX WARN: Code duplicated, block: B:141:0x036f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0386  */
    /* JADX WARN: Code duplicated, block: B:145:0x0388  */
    /* JADX WARN: Code duplicated, block: B:148:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0396  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:153:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x0408  */
    /* JADX WARN: Code duplicated, block: B:167:0x0440  */
    /* JADX WARN: Code duplicated, block: B:176:0x045a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0464  */
    /* JADX WARN: Code duplicated, block: B:180:0x0466  */
    /* JADX WARN: Code duplicated, block: B:183:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x046f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0495  */
    /* JADX WARN: Code duplicated, block: B:189:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013f  */
    /* JADX WARN: Code duplicated, block: B:73:0x016f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x018e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x0201  */
    /* JADX WARN: Code duplicated, block: B:90:0x023c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:99:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m33979l(final C40905c viewState, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC28601c1 interfaceC28601c4;
        Function1 function5;
        float f13;
        int iHashCode2;
        boolean z13;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c5;
        String strM33992y;
        TextResource textResourceM21267a;
        int i18;
        boolean z14;
        boolean zM87157i;
        Object objM87133R5;
        final Function1 function6;
        Object objM87133R6;
        final Function1 function7;
        String strM33965A;
        TextResource textResourceM21267a2;
        boolean z15;
        boolean zM87157i2;
        Object objM87133R7;
        boolean z16;
        Object objM87133R8;
        InterfaceC28601c1 interfaceC28601c6;
        InterfaceC28601c1 interfaceC28601c7;
        String strM33967C;
        TextResource textResourceM21267a3;
        boolean z17;
        boolean zM87157i3;
        Object objM87133R9;
        boolean z18;
        Object objM87133R10;
        InterfaceC28601c1 interfaceC28601c8;
        InterfaceC28601c1 interfaceC28601c9;
        C2314t c2314t2;
        boolean z19;
        boolean z24;
        Object objM87133R11;
        Object objM87133R12;
        Object objM87133R13;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(298155202);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
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
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R13 = c28655q.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C12040a(29);
                            c28655q.m87172p0(objM87133R13);
                        }
                        function4 = (Function1) objM87133R13;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C12000a(24);
                            c28655q.m87172p0(objM87133R12);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R12;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(viewState.getInitialCurrentPassword());
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(viewState.getInitialNewPassword());
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(viewState.getInitialConfirmPassword());
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC15673b0.m44012U(), null, 0.0f, 6);
                    WeakHashMap weakHashMap = C22944c2.f90553v;
                    Modifier modifierM66727p = AbstractC22953f.m66727p(modifierM3357b, C22949e.m66712e(c28655q).f90559f);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66727p);
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
                    if (c28655q.f115903S) {
                        interfaceC28601c4 = interfaceC28601c1;
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        function5 = function4;
                        f13 = 8;
                        C23010x c23010xM73381n = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
                        Object[] objArr = 0;
                        Object[] objArr2 = 0;
                        AbstractC6721d.a aVar = new AbstractC6721d.a(new TextResource.C8688b(AbstractC32772b.f136284F, null, 2, 0 == true ? 1 : 0), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z13 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C11699o(interfaceC4339a4, 8);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                        int i24 = i15;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC32772b.f136286b, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
                        strM33992y = m33992y(interfaceC28601c5);
                        if (strM33992y != null || (textResourceM21267a = AbstractC8693b.m21278l(strM33992y)) == null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        TextResource textResource = textResourceM21267a;
                        AbstractC30784c abstractC30784cM132574c = viewState.getEndingType();
                        InterfaceC29873g0 interfaceC29873g0M132582k = viewState.getVisualTransformation();
                        i18 = i24 & 112;
                        if (i18 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i = z14 | c28655q.m87157i(viewState);
                        objM87133R5 = c28655q.m87133R();
                        if (!zM87157i || objM87133R5 == c28676v0) {
                            function6 = function5;
                            final int i25 = 0;
                            objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            return AbstractC12228b.m33984q(function6, viewState);
                                        case 1:
                                            return AbstractC12228b.m33986s(function6, viewState);
                                        default:
                                            return AbstractC12228b.m33988u(function6, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function6 = function5;
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C1910d(22, interfaceC28601c5);
                            c28655q.m87172p0(objM87133R6);
                        }
                        int i26 = TextResource.C8688b.f25889c << 3;
                        int i27 = TextResource.$stable;
                        int i28 = i26 | (i27 << 6);
                        int i29 = AbstractC30784c.f126784a << 15;
                        function7 = function6;
                        AbstractC12232f.m34019e(null, c8688b, textResource, null, null, abstractC30784cM132574c, null, interfaceC29873g0M132582k, false, interfaceC4339a6, (Function1) objM87133R6, c28655q, i28 | i29, 6, 345);
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC32772b.f136296l, null, 2, 0 == true ? 1 : 0);
                        strM33965A = m33965A(interfaceC28601c2);
                        if (strM33965A != null || (textResourceM21267a2 = AbstractC8693b.m21278l(strM33965A)) == null) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                        TextResource textResource2 = textResourceM21267a2;
                        TextResource textResourceM132573b = viewState.getConfirmPasswordErrorDescription();
                        AbstractC30784c abstractC30784cM132574c2 = viewState.getEndingType();
                        InterfaceC29873g0 interfaceC29873g0M132582k2 = viewState.getVisualTransformation();
                        TextResource textResourceM132578g = viewState.getNewPasswordPlaceHolderDescription();
                        if (i18 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87157i2 = c28655q.m87157i(viewState) | z15;
                        objM87133R7 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R7 == c28676v0) {
                            final int i34 = 1;
                            objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i34) {
                                        case 0:
                                            return AbstractC12228b.m33984q(function7, viewState);
                                        case 1:
                                            return AbstractC12228b.m33986s(function7, viewState);
                                        default:
                                            return AbstractC12228b.m33988u(function7, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R7);
                        }
                        InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R7;
                        if (i18 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (!z16 || objM87133R8 == c28676v0) {
                            interfaceC28601c6 = interfaceC28601c2;
                            objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            interfaceC28601c6 = interfaceC28601c2;
                        }
                        int i35 = i28 | (i27 << 12) | i29 | (i27 << 18);
                        interfaceC28601c7 = interfaceC28601c6;
                        AbstractC12232f.m34019e(null, c8688b2, textResource2, null, textResourceM132573b, abstractC30784cM132574c2, textResourceM132578g, interfaceC29873g0M132582k2, false, interfaceC4339a7, (Function1) objM87133R8, c28655q, i35, 0, 265);
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC32772b.f136285a, null, 2, 0 == true ? 1 : 0);
                        strM33967C = m33967C(interfaceC28601c3);
                        if (strM33967C != null || (textResourceM21267a3 = AbstractC8693b.m21278l(strM33967C)) == null) {
                            textResourceM21267a3 = AbstractC8693b.m21267a();
                        }
                        TextResource textResource3 = textResourceM21267a3;
                        TextResource textResourceM132573b2 = viewState.getConfirmPasswordErrorDescription();
                        AbstractC30784c abstractC30784cM132574c3 = viewState.getEndingType();
                        InterfaceC29873g0 interfaceC29873g0M132582k3 = viewState.getVisualTransformation();
                        TextResource textResourceM132578g2 = viewState.getNewPasswordPlaceHolderDescription();
                        if (i18 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i3 = c28655q.m87157i(viewState) | z17;
                        objM87133R9 = c28655q.m87133R();
                        if (zM87157i3 || objM87133R9 == c28676v0) {
                            final int i36 = 2;
                            objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i36) {
                                        case 0:
                                            return AbstractC12228b.m33984q(function7, viewState);
                                        case 1:
                                            return AbstractC12228b.m33986s(function7, viewState);
                                        default:
                                            return AbstractC12228b.m33988u(function7, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R9);
                        }
                        InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R9;
                        if (i18 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (!z18 || objM87133R10 == c28676v0) {
                            interfaceC28601c8 = interfaceC28601c3;
                            objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28601c8 = interfaceC28601c3;
                        }
                        interfaceC28601c9 = interfaceC28601c8;
                        AbstractC12232f.m34019e(null, c8688b3, textResource3, null, textResourceM132573b2, abstractC30784cM132574c3, textResourceM132578g2, interfaceC29873g0M132582k3, false, interfaceC4339a8, (Function1) objM87133R10, c28655q, i35, 0, 265);
                        if (viewState.m132581j().isEmpty()) {
                            c2314t2 = c2314t;
                            c28655q.m87150e0(1103321532);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1103060140);
                            float f14 = 2 * f13;
                            c2314t2 = c2314t;
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t2));
                            AbstractC13372c.m37677h(viewState.m132581j(), AbstractC1099a.m3394p(f14, c2314t2), c28655q, 48, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC22953f.m66727p(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9105H), C22949e.m66712e(c28655q).f90558e));
                        EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                        if (m33992y(interfaceC28601c5) != null || m33965A(interfaceC28601c7) == null || m33967C(interfaceC28601c9) == null || !viewState.getIsPasswordValid() || viewState.getIsSaving()) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        String strM21273g = AbstractC8693b.m21273g(AbstractC32772b.f136282D, c28655q, 0);
                        if (i18 == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R11 = c28655q.m87133R();
                        if (z24 || objM87133R11 == c28676v0) {
                            objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                            c28655q.m87172p0(objM87133R11);
                        }
                        AbstractC27282u.m82292h(modifierM3394p, enumC27284v, strM21273g, z19, 0L, null, false, (InterfaceC4339a) objM87133R11, c28655q, 48, 112);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a3 = interfaceC4339a5;
                        function3 = function7;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    function5 = function4;
                    f13 = 8;
                    C23010x c23010xM73381n2 = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
                    Object[] objArr3 = 0;
                    Object[] objArr4 = 0;
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(new TextResource.C8688b(AbstractC32772b.f136284F, null, 2, 0 == true ? 1 : 0), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        objM87133R4 = new C11699o(interfaceC4339a4, 8);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C11699o(interfaceC4339a4, 8);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a4;
                    int i210 = i15;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC6719b.m20143d(modifierM3398t2, aVar2, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC32772b.f136286b, objArr4 == true ? 1 : 0, 2, objArr3 == true ? 1 : 0);
                    strM33992y = m33992y(interfaceC28601c5);
                    if (strM33992y != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource4 = textResourceM21267a;
                    AbstractC30784c abstractC30784cM132574c4 = viewState.getEndingType();
                    InterfaceC29873g0 interfaceC29873g0M132582k4 = viewState.getVisualTransformation();
                    i18 = i210 & 112;
                    if (i18 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        function6 = function5;
                        final int i211 = 0;
                        objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i211) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function6, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function6, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function6, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function6 = function5;
                        final int i212 = 0;
                        objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i212) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function6, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function6, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function6, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C1910d(22, interfaceC28601c5);
                        c28655q.m87172p0(objM87133R6);
                    }
                    int i213 = TextResource.C8688b.f25889c << 3;
                    int i214 = TextResource.$stable;
                    int i215 = i213 | (i214 << 6);
                    int i216 = AbstractC30784c.f126784a << 15;
                    function7 = function6;
                    AbstractC12232f.m34019e(null, c8688b4, textResource4, null, null, abstractC30784cM132574c4, null, interfaceC29873g0M132582k4, false, interfaceC4339a10, (Function1) objM87133R6, c28655q, i215 | i216, 6, 345);
                    TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC32772b.f136296l, null, 2, 0 == true ? 1 : 0);
                    strM33965A = m33965A(interfaceC28601c2);
                    if (strM33965A != null) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    }
                    TextResource textResource5 = textResourceM21267a2;
                    TextResource textResourceM132573b3 = viewState.getConfirmPasswordErrorDescription();
                    AbstractC30784c abstractC30784cM132574c5 = viewState.getEndingType();
                    InterfaceC29873g0 interfaceC29873g0M132582k5 = viewState.getVisualTransformation();
                    TextResource textResourceM132578g3 = viewState.getNewPasswordPlaceHolderDescription();
                    if (i18 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i2 = c28655q.m87157i(viewState) | z15;
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i37 = 1;
                        objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i37) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        final int i38 = 1;
                        objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i38) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                    if (i18 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z16) {
                        interfaceC28601c6 = interfaceC28601c2;
                        objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c6 = interfaceC28601c2;
                        objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                        c28655q.m87172p0(objM87133R8);
                    }
                    int i39 = i215 | (i214 << 12) | i216 | (i214 << 18);
                    interfaceC28601c7 = interfaceC28601c6;
                    AbstractC12232f.m34019e(null, c8688b5, textResource5, null, textResourceM132573b3, abstractC30784cM132574c5, textResourceM132578g3, interfaceC29873g0M132582k5, false, interfaceC4339a11, (Function1) objM87133R8, c28655q, i39, 0, 265);
                    TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC32772b.f136285a, null, 2, 0 == true ? 1 : 0);
                    strM33967C = m33967C(interfaceC28601c3);
                    if (strM33967C != null) {
                        textResourceM21267a3 = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a3 = AbstractC8693b.m21267a();
                    }
                    TextResource textResource6 = textResourceM21267a3;
                    TextResource textResourceM132573b4 = viewState.getConfirmPasswordErrorDescription();
                    AbstractC30784c abstractC30784cM132574c6 = viewState.getEndingType();
                    InterfaceC29873g0 interfaceC29873g0M132582k6 = viewState.getVisualTransformation();
                    TextResource textResourceM132578g4 = viewState.getNewPasswordPlaceHolderDescription();
                    if (i18 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = c28655q.m87157i(viewState) | z17;
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i3) {
                        final int i310 = 2;
                        objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i310) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        final int i311 = 2;
                        objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R9;
                    if (i18 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z18) {
                        interfaceC28601c8 = interfaceC28601c3;
                        objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c8 = interfaceC28601c3;
                        objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                        c28655q.m87172p0(objM87133R10);
                    }
                    interfaceC28601c9 = interfaceC28601c8;
                    AbstractC12232f.m34019e(null, c8688b6, textResource6, null, textResourceM132573b4, abstractC30784cM132574c6, textResourceM132578g4, interfaceC29873g0M132582k6, false, interfaceC4339a12, (Function1) objM87133R10, c28655q, i39, 0, 265);
                    if (viewState.m132581j().isEmpty()) {
                        c28655q.m87150e0(1103060140);
                        float f15 = 2 * f13;
                        c2314t2 = c2314t;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
                        AbstractC13372c.m37677h(viewState.m132581j(), AbstractC1099a.m3394p(f15, c2314t2), c28655q, 48, 0);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c28655q.m87150e0(1103321532);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f13, AbstractC22953f.m66727p(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9105H), C22949e.m66712e(c28655q).f90558e));
                    EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                    if (m33992y(interfaceC28601c5) != null) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    String strM21273g2 = AbstractC8693b.m21273g(AbstractC32772b.f136282D, c28655q, 0);
                    if (i18 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R11 = c28655q.m87133R();
                    if (z24) {
                        objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                        c28655q.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                        c28655q.m87172p0(objM87133R11);
                    }
                    AbstractC27282u.m82292h(modifierM3394p2, enumC27284v2, strM21273g2, z19, 0L, null, false, (InterfaceC4339a) objM87133R11, c28655q, 48, 112);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a9;
                    function3 = function7;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4007d1(i13, i14, 26, viewState, interfaceC4339a3, function3);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C12040a(29);
                        c28655q.m87172p0(objM87133R13);
                    }
                    function4 = (Function1) objM87133R13;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C12000a(24);
                        c28655q.m87172p0(objM87133R12);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R12;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getInitialCurrentPassword());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(viewState.getInitialNewPassword());
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(viewState.getInitialConfirmPassword());
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                c2314t = C2314t.f9131w;
                Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC15673b0.m44012U(), null, 0.0f, 6);
                WeakHashMap weakHashMap2 = C22944c2.f90553v;
                Modifier modifierM66727p2 = AbstractC22953f.m66727p(modifierM3357b2, C22949e.m66712e(c28655q).f90559f);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66727p2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d2);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    interfaceC28601c4 = interfaceC28601c1;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    function5 = function4;
                    f13 = 8;
                    C23010x c23010xM73381n3 = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n3);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
                    Object[] objArr5 = 0;
                    Object[] objArr6 = 0;
                    AbstractC6721d.a aVar3 = new AbstractC6721d.a(new TextResource.C8688b(AbstractC32772b.f136284F, null, 2, 0 == true ? 1 : 0), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        objM87133R4 = new C11699o(interfaceC4339a4, 8);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C11699o(interfaceC4339a4, 8);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a13 = interfaceC4339a4;
                    int i217 = i15;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC6719b.m20143d(modifierM3398t3, aVar3, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC32772b.f136286b, objArr6 == true ? 1 : 0, 2, objArr5 == true ? 1 : 0);
                    strM33992y = m33992y(interfaceC28601c5);
                    if (strM33992y != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource7 = textResourceM21267a;
                    AbstractC30784c abstractC30784cM132574c7 = viewState.getEndingType();
                    InterfaceC29873g0 interfaceC29873g0M132582k7 = viewState.getVisualTransformation();
                    i18 = i217 & 112;
                    if (i18 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        function6 = function5;
                        final int i218 = 0;
                        objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i218) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function6, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function6, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function6, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function6 = function5;
                        final int i219 = 0;
                        objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i219) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function6, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function6, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function6, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C1910d(22, interfaceC28601c5);
                        c28655q.m87172p0(objM87133R6);
                    }
                    int i2110 = TextResource.C8688b.f25889c << 3;
                    int i2111 = TextResource.$stable;
                    int i2112 = i2110 | (i2111 << 6);
                    int i2113 = AbstractC30784c.f126784a << 15;
                    function7 = function6;
                    AbstractC12232f.m34019e(null, c8688b7, textResource7, null, null, abstractC30784cM132574c7, null, interfaceC29873g0M132582k7, false, interfaceC4339a14, (Function1) objM87133R6, c28655q, i2112 | i2113, 6, 345);
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC32772b.f136296l, null, 2, 0 == true ? 1 : 0);
                    strM33965A = m33965A(interfaceC28601c2);
                    if (strM33965A != null) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    }
                    TextResource textResource8 = textResourceM21267a2;
                    TextResource textResourceM132573b5 = viewState.getConfirmPasswordErrorDescription();
                    AbstractC30784c abstractC30784cM132574c8 = viewState.getEndingType();
                    InterfaceC29873g0 interfaceC29873g0M132582k8 = viewState.getVisualTransformation();
                    TextResource textResourceM132578g5 = viewState.getNewPasswordPlaceHolderDescription();
                    if (i18 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i2 = c28655q.m87157i(viewState) | z15;
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i312 = 1;
                        objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i312) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        final int i313 = 1;
                        objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i313) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R7;
                    if (i18 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z16) {
                        interfaceC28601c6 = interfaceC28601c2;
                        objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c6 = interfaceC28601c2;
                        objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                        c28655q.m87172p0(objM87133R8);
                    }
                    int i314 = i2112 | (i2111 << 12) | i2113 | (i2111 << 18);
                    interfaceC28601c7 = interfaceC28601c6;
                    AbstractC12232f.m34019e(null, c8688b8, textResource8, null, textResourceM132573b5, abstractC30784cM132574c8, textResourceM132578g5, interfaceC29873g0M132582k8, false, interfaceC4339a15, (Function1) objM87133R8, c28655q, i314, 0, 265);
                    TextResource.C8688b c8688b9 = new TextResource.C8688b(AbstractC32772b.f136285a, null, 2, 0 == true ? 1 : 0);
                    strM33967C = m33967C(interfaceC28601c3);
                    if (strM33967C != null) {
                        textResourceM21267a3 = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a3 = AbstractC8693b.m21267a();
                    }
                    TextResource textResource9 = textResourceM21267a3;
                    TextResource textResourceM132573b6 = viewState.getConfirmPasswordErrorDescription();
                    AbstractC30784c abstractC30784cM132574c9 = viewState.getEndingType();
                    InterfaceC29873g0 interfaceC29873g0M132582k9 = viewState.getVisualTransformation();
                    TextResource textResourceM132578g6 = viewState.getNewPasswordPlaceHolderDescription();
                    if (i18 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = c28655q.m87157i(viewState) | z17;
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i3) {
                        final int i315 = 2;
                        objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i315) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        final int i316 = 2;
                        objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i316) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R9;
                    if (i18 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z18) {
                        interfaceC28601c8 = interfaceC28601c3;
                        objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c8 = interfaceC28601c3;
                        objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                        c28655q.m87172p0(objM87133R10);
                    }
                    interfaceC28601c9 = interfaceC28601c8;
                    AbstractC12232f.m34019e(null, c8688b9, textResource9, null, textResourceM132573b6, abstractC30784cM132574c9, textResourceM132578g6, interfaceC29873g0M132582k9, false, interfaceC4339a16, (Function1) objM87133R10, c28655q, i314, 0, 265);
                    if (viewState.m132581j().isEmpty()) {
                        c28655q.m87150e0(1103060140);
                        float f16 = 2 * f13;
                        c2314t2 = c2314t;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t2));
                        AbstractC13372c.m37677h(viewState.m132581j(), AbstractC1099a.m3394p(f16, c2314t2), c28655q, 48, 0);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c28655q.m87150e0(1103321532);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    Modifier modifierM3394p3 = AbstractC1099a.m3394p(2 * f13, AbstractC22953f.m66727p(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9105H), C22949e.m66712e(c28655q).f90558e));
                    EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                    if (m33992y(interfaceC28601c5) != null) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    String strM21273g3 = AbstractC8693b.m21273g(AbstractC32772b.f136282D, c28655q, 0);
                    if (i18 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R11 = c28655q.m87133R();
                    if (z24) {
                        objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                        c28655q.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                        c28655q.m87172p0(objM87133R11);
                    }
                    AbstractC27282u.m82292h(modifierM3394p3, enumC27284v3, strM21273g3, z19, 0L, null, false, (InterfaceC4339a) objM87133R11, c28655q, 48, 112);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a13;
                    function3 = function7;
                } else {
                    interfaceC28601c4 = interfaceC28601c1;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                function5 = function4;
                f13 = 8;
                C23010x c23010xM73381n4 = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n4);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(new TextResource.C8688b(AbstractC32772b.f136284F, null, 2, 0 == true ? 1 : 0), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13) {
                    objM87133R4 = new C11699o(interfaceC4339a4, 8);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C11699o(interfaceC4339a4, 8);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a17 = interfaceC4339a4;
                int i2114 = i15;
                interfaceC28601c5 = interfaceC28601c4;
                AbstractC6719b.m20143d(modifierM3398t4, aVar4, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                TextResource.C8688b c8688b10 = new TextResource.C8688b(AbstractC32772b.f136286b, objArr8 == true ? 1 : 0, 2, objArr7 == true ? 1 : 0);
                strM33992y = m33992y(interfaceC28601c5);
                if (strM33992y != null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource10 = textResourceM21267a;
                AbstractC30784c abstractC30784cM132574c10 = viewState.getEndingType();
                InterfaceC29873g0 interfaceC29873g0M132582k10 = viewState.getVisualTransformation();
                i18 = i2114 & 112;
                if (i18 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    function6 = function5;
                    final int i2115 = 0;
                    objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2115) {
                                case 0:
                                    return AbstractC12228b.m33984q(function6, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function6, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function6, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function6 = function5;
                    final int i2116 = 0;
                    objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2116) {
                                case 0:
                                    return AbstractC12228b.m33984q(function6, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function6, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function6, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R5;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C1910d(22, interfaceC28601c5);
                    c28655q.m87172p0(objM87133R6);
                }
                int i2117 = TextResource.C8688b.f25889c << 3;
                int i2118 = TextResource.$stable;
                int i2119 = i2117 | (i2118 << 6);
                int i21110 = AbstractC30784c.f126784a << 15;
                function7 = function6;
                AbstractC12232f.m34019e(null, c8688b10, textResource10, null, null, abstractC30784cM132574c10, null, interfaceC29873g0M132582k10, false, interfaceC4339a18, (Function1) objM87133R6, c28655q, i2119 | i21110, 6, 345);
                TextResource.C8688b c8688b11 = new TextResource.C8688b(AbstractC32772b.f136296l, null, 2, 0 == true ? 1 : 0);
                strM33965A = m33965A(interfaceC28601c2);
                if (strM33965A != null) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
                TextResource textResource11 = textResourceM21267a2;
                TextResource textResourceM132573b7 = viewState.getConfirmPasswordErrorDescription();
                AbstractC30784c abstractC30784cM132574c11 = viewState.getEndingType();
                InterfaceC29873g0 interfaceC29873g0M132582k11 = viewState.getVisualTransformation();
                TextResource textResourceM132578g7 = viewState.getNewPasswordPlaceHolderDescription();
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i2 = c28655q.m87157i(viewState) | z15;
                objM87133R7 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i317 = 1;
                    objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i317) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                } else {
                    final int i318 = 1;
                    objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i318) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R7;
                if (i18 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z16) {
                    interfaceC28601c6 = interfaceC28601c2;
                    objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c6 = interfaceC28601c2;
                    objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                    c28655q.m87172p0(objM87133R8);
                }
                int i319 = i2119 | (i2118 << 12) | i21110 | (i2118 << 18);
                interfaceC28601c7 = interfaceC28601c6;
                AbstractC12232f.m34019e(null, c8688b11, textResource11, null, textResourceM132573b7, abstractC30784cM132574c11, textResourceM132578g7, interfaceC29873g0M132582k11, false, interfaceC4339a19, (Function1) objM87133R8, c28655q, i319, 0, 265);
                TextResource.C8688b c8688b12 = new TextResource.C8688b(AbstractC32772b.f136285a, null, 2, 0 == true ? 1 : 0);
                strM33967C = m33967C(interfaceC28601c3);
                if (strM33967C != null) {
                    textResourceM21267a3 = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a3 = AbstractC8693b.m21267a();
                }
                TextResource textResource12 = textResourceM21267a3;
                TextResource textResourceM132573b8 = viewState.getConfirmPasswordErrorDescription();
                AbstractC30784c abstractC30784cM132574c12 = viewState.getEndingType();
                InterfaceC29873g0 interfaceC29873g0M132582k12 = viewState.getVisualTransformation();
                TextResource textResourceM132578g8 = viewState.getNewPasswordPlaceHolderDescription();
                if (i18 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i3 = c28655q.m87157i(viewState) | z17;
                objM87133R9 = c28655q.m87133R();
                if (zM87157i3) {
                    final int i3110 = 2;
                    objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3110) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                } else {
                    final int i3111 = 2;
                    objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3111) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R9;
                if (i18 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z18) {
                    interfaceC28601c8 = interfaceC28601c3;
                    objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    interfaceC28601c8 = interfaceC28601c3;
                    objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                    c28655q.m87172p0(objM87133R10);
                }
                interfaceC28601c9 = interfaceC28601c8;
                AbstractC12232f.m34019e(null, c8688b12, textResource12, null, textResourceM132573b8, abstractC30784cM132574c12, textResourceM132578g8, interfaceC29873g0M132582k12, false, interfaceC4339a110, (Function1) objM87133R10, c28655q, i319, 0, 265);
                if (viewState.m132581j().isEmpty()) {
                    c28655q.m87150e0(1103060140);
                    float f17 = 2 * f13;
                    c2314t2 = c2314t;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t2));
                    AbstractC13372c.m37677h(viewState.m132581j(), AbstractC1099a.m3394p(f17, c2314t2), c28655q, 48, 0);
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c28655q.m87150e0(1103321532);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(2 * f13, AbstractC22953f.m66727p(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9105H), C22949e.m66712e(c28655q).f90558e));
                EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
                if (m33992y(interfaceC28601c5) != null) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                String strM21273g4 = AbstractC8693b.m21273g(AbstractC32772b.f136282D, c28655q, 0);
                if (i18 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R11 = c28655q.m87133R();
                if (z24) {
                    objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                    c28655q.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                    c28655q.m87172p0(objM87133R11);
                }
                AbstractC27282u.m82292h(modifierM3394p4, enumC27284v4, strM21273g4, z19, 0L, null, false, (InterfaceC4339a) objM87133R11, c28655q, 48, 112);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a17;
                function3 = function7;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 26, viewState, interfaceC4339a3, function3);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
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
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C12040a(29);
                        c28655q.m87172p0(objM87133R13);
                    }
                    function4 = (Function1) objM87133R13;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C12000a(24);
                        c28655q.m87172p0(objM87133R12);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R12;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getInitialCurrentPassword());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(viewState.getInitialNewPassword());
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(viewState.getInitialConfirmPassword());
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                c2314t = C2314t.f9131w;
                Modifier modifierM3357b3 = AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC15673b0.m44012U(), null, 0.0f, 6);
                WeakHashMap weakHashMap3 = C22944c2.f90553v;
                Modifier modifierM66727p3 = AbstractC22953f.m66727p(modifierM3357b3, C22949e.m66712e(c28655q).f90559f);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66727p3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d3);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    interfaceC28601c4 = interfaceC28601c1;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    function5 = function4;
                    f13 = 8;
                    C23010x c23010xM73381n5 = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM73381n5);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
                    Object[] objArr9 = 0;
                    Object[] objArr10 = 0;
                    AbstractC6721d.a aVar5 = new AbstractC6721d.a(new TextResource.C8688b(AbstractC32772b.f136284F, null, 2, 0 == true ? 1 : 0), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        objM87133R4 = new C11699o(interfaceC4339a4, 8);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C11699o(interfaceC4339a4, 8);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a111 = interfaceC4339a4;
                    int i21111 = i15;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC6719b.m20143d(modifierM3398t5, aVar5, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    TextResource.C8688b c8688b13 = new TextResource.C8688b(AbstractC32772b.f136286b, objArr10 == true ? 1 : 0, 2, objArr9 == true ? 1 : 0);
                    strM33992y = m33992y(interfaceC28601c5);
                    if (strM33992y != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource13 = textResourceM21267a;
                    AbstractC30784c abstractC30784cM132574c13 = viewState.getEndingType();
                    InterfaceC29873g0 interfaceC29873g0M132582k13 = viewState.getVisualTransformation();
                    i18 = i21111 & 112;
                    if (i18 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        function6 = function5;
                        final int i21112 = 0;
                        objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21112) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function6, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function6, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function6, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function6 = function5;
                        final int i21113 = 0;
                        objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21113) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function6, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function6, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function6, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C1910d(22, interfaceC28601c5);
                        c28655q.m87172p0(objM87133R6);
                    }
                    int i21114 = TextResource.C8688b.f25889c << 3;
                    int i21115 = TextResource.$stable;
                    int i21116 = i21114 | (i21115 << 6);
                    int i21117 = AbstractC30784c.f126784a << 15;
                    function7 = function6;
                    AbstractC12232f.m34019e(null, c8688b13, textResource13, null, null, abstractC30784cM132574c13, null, interfaceC29873g0M132582k13, false, interfaceC4339a112, (Function1) objM87133R6, c28655q, i21116 | i21117, 6, 345);
                    TextResource.C8688b c8688b14 = new TextResource.C8688b(AbstractC32772b.f136296l, null, 2, 0 == true ? 1 : 0);
                    strM33965A = m33965A(interfaceC28601c2);
                    if (strM33965A != null) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    }
                    TextResource textResource14 = textResourceM21267a2;
                    TextResource textResourceM132573b9 = viewState.getConfirmPasswordErrorDescription();
                    AbstractC30784c abstractC30784cM132574c14 = viewState.getEndingType();
                    InterfaceC29873g0 interfaceC29873g0M132582k14 = viewState.getVisualTransformation();
                    TextResource textResourceM132578g9 = viewState.getNewPasswordPlaceHolderDescription();
                    if (i18 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i2 = c28655q.m87157i(viewState) | z15;
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i3112 = 1;
                        objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3112) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        final int i3113 = 1;
                        objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3113) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R7;
                    if (i18 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z16) {
                        interfaceC28601c6 = interfaceC28601c2;
                        objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c6 = interfaceC28601c2;
                        objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                        c28655q.m87172p0(objM87133R8);
                    }
                    int i3114 = i21116 | (i21115 << 12) | i21117 | (i21115 << 18);
                    interfaceC28601c7 = interfaceC28601c6;
                    AbstractC12232f.m34019e(null, c8688b14, textResource14, null, textResourceM132573b9, abstractC30784cM132574c14, textResourceM132578g9, interfaceC29873g0M132582k14, false, interfaceC4339a113, (Function1) objM87133R8, c28655q, i3114, 0, 265);
                    TextResource.C8688b c8688b15 = new TextResource.C8688b(AbstractC32772b.f136285a, null, 2, 0 == true ? 1 : 0);
                    strM33967C = m33967C(interfaceC28601c3);
                    if (strM33967C != null) {
                        textResourceM21267a3 = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a3 = AbstractC8693b.m21267a();
                    }
                    TextResource textResource15 = textResourceM21267a3;
                    TextResource textResourceM132573b10 = viewState.getConfirmPasswordErrorDescription();
                    AbstractC30784c abstractC30784cM132574c15 = viewState.getEndingType();
                    InterfaceC29873g0 interfaceC29873g0M132582k15 = viewState.getVisualTransformation();
                    TextResource textResourceM132578g10 = viewState.getNewPasswordPlaceHolderDescription();
                    if (i18 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = c28655q.m87157i(viewState) | z17;
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i3) {
                        final int i3115 = 2;
                        objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3115) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        final int i3116 = 2;
                        objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3116) {
                                    case 0:
                                        return AbstractC12228b.m33984q(function7, viewState);
                                    case 1:
                                        return AbstractC12228b.m33986s(function7, viewState);
                                    default:
                                        return AbstractC12228b.m33988u(function7, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R9;
                    if (i18 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z18) {
                        interfaceC28601c8 = interfaceC28601c3;
                        objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c8 = interfaceC28601c3;
                        objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                        c28655q.m87172p0(objM87133R10);
                    }
                    interfaceC28601c9 = interfaceC28601c8;
                    AbstractC12232f.m34019e(null, c8688b15, textResource15, null, textResourceM132573b10, abstractC30784cM132574c15, textResourceM132578g10, interfaceC29873g0M132582k15, false, interfaceC4339a114, (Function1) objM87133R10, c28655q, i3114, 0, 265);
                    if (viewState.m132581j().isEmpty()) {
                        c28655q.m87150e0(1103060140);
                        float f18 = 2 * f13;
                        c2314t2 = c2314t;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t2));
                        AbstractC13372c.m37677h(viewState.m132581j(), AbstractC1099a.m3394p(f18, c2314t2), c28655q, 48, 0);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c28655q.m87150e0(1103321532);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    Modifier modifierM3394p5 = AbstractC1099a.m3394p(2 * f13, AbstractC22953f.m66727p(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9105H), C22949e.m66712e(c28655q).f90558e));
                    EnumC27284v enumC27284v5 = EnumC27284v.TextLarge;
                    if (m33992y(interfaceC28601c5) != null) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    String strM21273g5 = AbstractC8693b.m21273g(AbstractC32772b.f136282D, c28655q, 0);
                    if (i18 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R11 = c28655q.m87133R();
                    if (z24) {
                        objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                        c28655q.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                        c28655q.m87172p0(objM87133R11);
                    }
                    AbstractC27282u.m82292h(modifierM3394p5, enumC27284v5, strM21273g5, z19, 0L, null, false, (InterfaceC4339a) objM87133R11, c28655q, 48, 112);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a111;
                    function3 = function7;
                } else {
                    interfaceC28601c4 = interfaceC28601c1;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                function5 = function4;
                f13 = 8;
                C23010x c23010xM73381n6 = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM73381n6);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                AbstractC6721d.a aVar6 = new AbstractC6721d.a(new TextResource.C8688b(AbstractC32772b.f136284F, null, 2, 0 == true ? 1 : 0), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13) {
                    objM87133R4 = new C11699o(interfaceC4339a4, 8);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C11699o(interfaceC4339a4, 8);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a115 = interfaceC4339a4;
                int i21118 = i15;
                interfaceC28601c5 = interfaceC28601c4;
                AbstractC6719b.m20143d(modifierM3398t6, aVar6, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                TextResource.C8688b c8688b16 = new TextResource.C8688b(AbstractC32772b.f136286b, objArr12 == true ? 1 : 0, 2, objArr11 == true ? 1 : 0);
                strM33992y = m33992y(interfaceC28601c5);
                if (strM33992y != null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource16 = textResourceM21267a;
                AbstractC30784c abstractC30784cM132574c16 = viewState.getEndingType();
                InterfaceC29873g0 interfaceC29873g0M132582k16 = viewState.getVisualTransformation();
                i18 = i21118 & 112;
                if (i18 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    function6 = function5;
                    final int i21119 = 0;
                    objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21119) {
                                case 0:
                                    return AbstractC12228b.m33984q(function6, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function6, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function6, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function6 = function5;
                    final int i211110 = 0;
                    objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211110) {
                                case 0:
                                    return AbstractC12228b.m33984q(function6, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function6, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function6, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a116 = (InterfaceC4339a) objM87133R5;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C1910d(22, interfaceC28601c5);
                    c28655q.m87172p0(objM87133R6);
                }
                int i211111 = TextResource.C8688b.f25889c << 3;
                int i211112 = TextResource.$stable;
                int i211113 = i211111 | (i211112 << 6);
                int i211114 = AbstractC30784c.f126784a << 15;
                function7 = function6;
                AbstractC12232f.m34019e(null, c8688b16, textResource16, null, null, abstractC30784cM132574c16, null, interfaceC29873g0M132582k16, false, interfaceC4339a116, (Function1) objM87133R6, c28655q, i211113 | i211114, 6, 345);
                TextResource.C8688b c8688b17 = new TextResource.C8688b(AbstractC32772b.f136296l, null, 2, 0 == true ? 1 : 0);
                strM33965A = m33965A(interfaceC28601c2);
                if (strM33965A != null) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
                TextResource textResource17 = textResourceM21267a2;
                TextResource textResourceM132573b11 = viewState.getConfirmPasswordErrorDescription();
                AbstractC30784c abstractC30784cM132574c17 = viewState.getEndingType();
                InterfaceC29873g0 interfaceC29873g0M132582k17 = viewState.getVisualTransformation();
                TextResource textResourceM132578g11 = viewState.getNewPasswordPlaceHolderDescription();
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i2 = c28655q.m87157i(viewState) | z15;
                objM87133R7 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i3117 = 1;
                    objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3117) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                } else {
                    final int i3118 = 1;
                    objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3118) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R7;
                if (i18 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z16) {
                    interfaceC28601c6 = interfaceC28601c2;
                    objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c6 = interfaceC28601c2;
                    objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                    c28655q.m87172p0(objM87133R8);
                }
                int i3119 = i211113 | (i211112 << 12) | i211114 | (i211112 << 18);
                interfaceC28601c7 = interfaceC28601c6;
                AbstractC12232f.m34019e(null, c8688b17, textResource17, null, textResourceM132573b11, abstractC30784cM132574c17, textResourceM132578g11, interfaceC29873g0M132582k17, false, interfaceC4339a117, (Function1) objM87133R8, c28655q, i3119, 0, 265);
                TextResource.C8688b c8688b18 = new TextResource.C8688b(AbstractC32772b.f136285a, null, 2, 0 == true ? 1 : 0);
                strM33967C = m33967C(interfaceC28601c3);
                if (strM33967C != null) {
                    textResourceM21267a3 = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a3 = AbstractC8693b.m21267a();
                }
                TextResource textResource18 = textResourceM21267a3;
                TextResource textResourceM132573b12 = viewState.getConfirmPasswordErrorDescription();
                AbstractC30784c abstractC30784cM132574c18 = viewState.getEndingType();
                InterfaceC29873g0 interfaceC29873g0M132582k18 = viewState.getVisualTransformation();
                TextResource textResourceM132578g12 = viewState.getNewPasswordPlaceHolderDescription();
                if (i18 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i3 = c28655q.m87157i(viewState) | z17;
                objM87133R9 = c28655q.m87133R();
                if (zM87157i3) {
                    final int i31110 = 2;
                    objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31110) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                } else {
                    final int i31111 = 2;
                    objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31111) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a118 = (InterfaceC4339a) objM87133R9;
                if (i18 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z18) {
                    interfaceC28601c8 = interfaceC28601c3;
                    objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    interfaceC28601c8 = interfaceC28601c3;
                    objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                    c28655q.m87172p0(objM87133R10);
                }
                interfaceC28601c9 = interfaceC28601c8;
                AbstractC12232f.m34019e(null, c8688b18, textResource18, null, textResourceM132573b12, abstractC30784cM132574c18, textResourceM132578g12, interfaceC29873g0M132582k18, false, interfaceC4339a118, (Function1) objM87133R10, c28655q, i3119, 0, 265);
                if (viewState.m132581j().isEmpty()) {
                    c28655q.m87150e0(1103060140);
                    float f19 = 2 * f13;
                    c2314t2 = c2314t;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t2));
                    AbstractC13372c.m37677h(viewState.m132581j(), AbstractC1099a.m3394p(f19, c2314t2), c28655q, 48, 0);
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c28655q.m87150e0(1103321532);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM3394p6 = AbstractC1099a.m3394p(2 * f13, AbstractC22953f.m66727p(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9105H), C22949e.m66712e(c28655q).f90558e));
                EnumC27284v enumC27284v6 = EnumC27284v.TextLarge;
                if (m33992y(interfaceC28601c5) != null) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                String strM21273g6 = AbstractC8693b.m21273g(AbstractC32772b.f136282D, c28655q, 0);
                if (i18 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R11 = c28655q.m87133R();
                if (z24) {
                    objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                    c28655q.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                    c28655q.m87172p0(objM87133R11);
                }
                AbstractC27282u.m82292h(modifierM3394p6, enumC27284v6, strM21273g6, z19, 0L, null, false, (InterfaceC4339a) objM87133R11, c28655q, 48, 112);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a115;
                function3 = function7;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 26, viewState, interfaceC4339a3, function3);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R13 = c28655q.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = new C12040a(29);
                    c28655q.m87172p0(objM87133R13);
                }
                function4 = (Function1) objM87133R13;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R12 = c28655q.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = new C12000a(24);
                    c28655q.m87172p0(objM87133R12);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R12;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(viewState.getInitialCurrentPassword());
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(viewState.getInitialNewPassword());
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(viewState.getInitialConfirmPassword());
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            c2314t = C2314t.f9131w;
            Modifier modifierM3357b4 = AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC15673b0.m44012U(), null, 0.0f, 6);
            WeakHashMap weakHashMap4 = C22944c2.f90553v;
            Modifier modifierM66727p4 = AbstractC22953f.m66727p(modifierM3357b4, C22949e.m66712e(c28655q).f90559f);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM66727p4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d4);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                interfaceC28601c4 = interfaceC28601c1;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                function5 = function4;
                f13 = 8;
                C23010x c23010xM73381n7 = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM73381n7);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
                Object[] objArr13 = 0;
                Object[] objArr14 = 0;
                AbstractC6721d.a aVar7 = new AbstractC6721d.a(new TextResource.C8688b(AbstractC32772b.f136284F, null, 2, 0 == true ? 1 : 0), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13) {
                    objM87133R4 = new C11699o(interfaceC4339a4, 8);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C11699o(interfaceC4339a4, 8);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a119 = interfaceC4339a4;
                int i211115 = i15;
                interfaceC28601c5 = interfaceC28601c4;
                AbstractC6719b.m20143d(modifierM3398t7, aVar7, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                TextResource.C8688b c8688b19 = new TextResource.C8688b(AbstractC32772b.f136286b, objArr14 == true ? 1 : 0, 2, objArr13 == true ? 1 : 0);
                strM33992y = m33992y(interfaceC28601c5);
                if (strM33992y != null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource19 = textResourceM21267a;
                AbstractC30784c abstractC30784cM132574c19 = viewState.getEndingType();
                InterfaceC29873g0 interfaceC29873g0M132582k19 = viewState.getVisualTransformation();
                i18 = i211115 & 112;
                if (i18 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    function6 = function5;
                    final int i211116 = 0;
                    objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211116) {
                                case 0:
                                    return AbstractC12228b.m33984q(function6, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function6, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function6, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function6 = function5;
                    final int i211117 = 0;
                    objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211117) {
                                case 0:
                                    return AbstractC12228b.m33984q(function6, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function6, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function6, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R5;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C1910d(22, interfaceC28601c5);
                    c28655q.m87172p0(objM87133R6);
                }
                int i211118 = TextResource.C8688b.f25889c << 3;
                int i211119 = TextResource.$stable;
                int i2111110 = i211118 | (i211119 << 6);
                int i2111111 = AbstractC30784c.f126784a << 15;
                function7 = function6;
                AbstractC12232f.m34019e(null, c8688b19, textResource19, null, null, abstractC30784cM132574c19, null, interfaceC29873g0M132582k19, false, interfaceC4339a1110, (Function1) objM87133R6, c28655q, i2111110 | i2111111, 6, 345);
                TextResource.C8688b c8688b110 = new TextResource.C8688b(AbstractC32772b.f136296l, null, 2, 0 == true ? 1 : 0);
                strM33965A = m33965A(interfaceC28601c2);
                if (strM33965A != null) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
                TextResource textResource110 = textResourceM21267a2;
                TextResource textResourceM132573b13 = viewState.getConfirmPasswordErrorDescription();
                AbstractC30784c abstractC30784cM132574c110 = viewState.getEndingType();
                InterfaceC29873g0 interfaceC29873g0M132582k110 = viewState.getVisualTransformation();
                TextResource textResourceM132578g13 = viewState.getNewPasswordPlaceHolderDescription();
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i2 = c28655q.m87157i(viewState) | z15;
                objM87133R7 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i31112 = 1;
                    objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31112) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                } else {
                    final int i31113 = 1;
                    objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31113) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R7;
                if (i18 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z16) {
                    interfaceC28601c6 = interfaceC28601c2;
                    objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c6 = interfaceC28601c2;
                    objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                    c28655q.m87172p0(objM87133R8);
                }
                int i31114 = i2111110 | (i211119 << 12) | i2111111 | (i211119 << 18);
                interfaceC28601c7 = interfaceC28601c6;
                AbstractC12232f.m34019e(null, c8688b110, textResource110, null, textResourceM132573b13, abstractC30784cM132574c110, textResourceM132578g13, interfaceC29873g0M132582k110, false, interfaceC4339a1111, (Function1) objM87133R8, c28655q, i31114, 0, 265);
                TextResource.C8688b c8688b111 = new TextResource.C8688b(AbstractC32772b.f136285a, null, 2, 0 == true ? 1 : 0);
                strM33967C = m33967C(interfaceC28601c3);
                if (strM33967C != null) {
                    textResourceM21267a3 = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a3 = AbstractC8693b.m21267a();
                }
                TextResource textResource111 = textResourceM21267a3;
                TextResource textResourceM132573b14 = viewState.getConfirmPasswordErrorDescription();
                AbstractC30784c abstractC30784cM132574c111 = viewState.getEndingType();
                InterfaceC29873g0 interfaceC29873g0M132582k111 = viewState.getVisualTransformation();
                TextResource textResourceM132578g14 = viewState.getNewPasswordPlaceHolderDescription();
                if (i18 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i3 = c28655q.m87157i(viewState) | z17;
                objM87133R9 = c28655q.m87133R();
                if (zM87157i3) {
                    final int i31115 = 2;
                    objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31115) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                } else {
                    final int i31116 = 2;
                    objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31116) {
                                case 0:
                                    return AbstractC12228b.m33984q(function7, viewState);
                                case 1:
                                    return AbstractC12228b.m33986s(function7, viewState);
                                default:
                                    return AbstractC12228b.m33988u(function7, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a1112 = (InterfaceC4339a) objM87133R9;
                if (i18 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z18) {
                    interfaceC28601c8 = interfaceC28601c3;
                    objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    interfaceC28601c8 = interfaceC28601c3;
                    objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                    c28655q.m87172p0(objM87133R10);
                }
                interfaceC28601c9 = interfaceC28601c8;
                AbstractC12232f.m34019e(null, c8688b111, textResource111, null, textResourceM132573b14, abstractC30784cM132574c111, textResourceM132578g14, interfaceC29873g0M132582k111, false, interfaceC4339a1112, (Function1) objM87133R10, c28655q, i31114, 0, 265);
                if (viewState.m132581j().isEmpty()) {
                    c28655q.m87150e0(1103060140);
                    float f110 = 2 * f13;
                    c2314t2 = c2314t;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f110, c2314t2));
                    AbstractC13372c.m37677h(viewState.m132581j(), AbstractC1099a.m3394p(f110, c2314t2), c28655q, 48, 0);
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c28655q.m87150e0(1103321532);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM3394p7 = AbstractC1099a.m3394p(2 * f13, AbstractC22953f.m66727p(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9105H), C22949e.m66712e(c28655q).f90558e));
                EnumC27284v enumC27284v7 = EnumC27284v.TextLarge;
                if (m33992y(interfaceC28601c5) != null) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                String strM21273g7 = AbstractC8693b.m21273g(AbstractC32772b.f136282D, c28655q, 0);
                if (i18 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R11 = c28655q.m87133R();
                if (z24) {
                    objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                    c28655q.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                    c28655q.m87172p0(objM87133R11);
                }
                AbstractC27282u.m82292h(modifierM3394p7, enumC27284v7, strM21273g7, z19, 0L, null, false, (InterfaceC4339a) objM87133R11, c28655q, 48, 112);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a119;
                function3 = function7;
            } else {
                interfaceC28601c4 = interfaceC28601c1;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N10);
            function5 = function4;
            f13 = 8;
            C23010x c23010xM73381n8 = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM73381n8);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            AbstractC6721d.a aVar8 = new AbstractC6721d.a(new TextResource.C8688b(AbstractC32772b.f136284F, null, 2, 0 == true ? 1 : 0), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z13) {
                objM87133R4 = new C11699o(interfaceC4339a4, 8);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C11699o(interfaceC4339a4, 8);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a1113 = interfaceC4339a4;
            int i2111112 = i15;
            interfaceC28601c5 = interfaceC28601c4;
            AbstractC6719b.m20143d(modifierM3398t8, aVar8, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            TextResource.C8688b c8688b112 = new TextResource.C8688b(AbstractC32772b.f136286b, objArr16 == true ? 1 : 0, 2, objArr15 == true ? 1 : 0);
            strM33992y = m33992y(interfaceC28601c5);
            if (strM33992y != null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            } else {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            TextResource textResource112 = textResourceM21267a;
            AbstractC30784c abstractC30784cM132574c112 = viewState.getEndingType();
            InterfaceC29873g0 interfaceC29873g0M132582k112 = viewState.getVisualTransformation();
            i18 = i2111112 & 112;
            if (i18 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i = z14 | c28655q.m87157i(viewState);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i) {
                function6 = function5;
                final int i2111113 = 0;
                objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2111113) {
                            case 0:
                                return AbstractC12228b.m33984q(function6, viewState);
                            case 1:
                                return AbstractC12228b.m33986s(function6, viewState);
                            default:
                                return AbstractC12228b.m33988u(function6, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            } else {
                function6 = function5;
                final int i2111114 = 0;
                objM87133R5 = new InterfaceC4339a() { // from class: do0.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2111114) {
                            case 0:
                                return AbstractC12228b.m33984q(function6, viewState);
                            case 1:
                                return AbstractC12228b.m33986s(function6, viewState);
                            default:
                                return AbstractC12228b.m33988u(function6, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a1114 = (InterfaceC4339a) objM87133R5;
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C1910d(22, interfaceC28601c5);
                c28655q.m87172p0(objM87133R6);
            }
            int i2111115 = TextResource.C8688b.f25889c << 3;
            int i2111116 = TextResource.$stable;
            int i2111117 = i2111115 | (i2111116 << 6);
            int i2111118 = AbstractC30784c.f126784a << 15;
            function7 = function6;
            AbstractC12232f.m34019e(null, c8688b112, textResource112, null, null, abstractC30784cM132574c112, null, interfaceC29873g0M132582k112, false, interfaceC4339a1114, (Function1) objM87133R6, c28655q, i2111117 | i2111118, 6, 345);
            TextResource.C8688b c8688b113 = new TextResource.C8688b(AbstractC32772b.f136296l, null, 2, 0 == true ? 1 : 0);
            strM33965A = m33965A(interfaceC28601c2);
            if (strM33965A != null) {
                textResourceM21267a2 = AbstractC8693b.m21267a();
            } else {
                textResourceM21267a2 = AbstractC8693b.m21267a();
            }
            TextResource textResource113 = textResourceM21267a2;
            TextResource textResourceM132573b15 = viewState.getConfirmPasswordErrorDescription();
            AbstractC30784c abstractC30784cM132574c113 = viewState.getEndingType();
            InterfaceC29873g0 interfaceC29873g0M132582k113 = viewState.getVisualTransformation();
            TextResource textResourceM132578g15 = viewState.getNewPasswordPlaceHolderDescription();
            if (i18 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i2 = c28655q.m87157i(viewState) | z15;
            objM87133R7 = c28655q.m87133R();
            if (zM87157i2) {
                final int i31117 = 1;
                objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i31117) {
                            case 0:
                                return AbstractC12228b.m33984q(function7, viewState);
                            case 1:
                                return AbstractC12228b.m33986s(function7, viewState);
                            default:
                                return AbstractC12228b.m33988u(function7, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R7);
            } else {
                final int i31118 = 1;
                objM87133R7 = new InterfaceC4339a() { // from class: do0.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i31118) {
                            case 0:
                                return AbstractC12228b.m33984q(function7, viewState);
                            case 1:
                                return AbstractC12228b.m33986s(function7, viewState);
                            default:
                                return AbstractC12228b.m33988u(function7, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R7);
            }
            InterfaceC4339a interfaceC4339a1115 = (InterfaceC4339a) objM87133R7;
            if (i18 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R8 = c28655q.m87133R();
            if (z16) {
                interfaceC28601c6 = interfaceC28601c2;
                objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                c28655q.m87172p0(objM87133R8);
            } else {
                interfaceC28601c6 = interfaceC28601c2;
                objM87133R8 = new C2609r(function7, interfaceC28601c6, 8);
                c28655q.m87172p0(objM87133R8);
            }
            int i31119 = i2111117 | (i2111116 << 12) | i2111118 | (i2111116 << 18);
            interfaceC28601c7 = interfaceC28601c6;
            AbstractC12232f.m34019e(null, c8688b113, textResource113, null, textResourceM132573b15, abstractC30784cM132574c113, textResourceM132578g15, interfaceC29873g0M132582k113, false, interfaceC4339a1115, (Function1) objM87133R8, c28655q, i31119, 0, 265);
            TextResource.C8688b c8688b114 = new TextResource.C8688b(AbstractC32772b.f136285a, null, 2, 0 == true ? 1 : 0);
            strM33967C = m33967C(interfaceC28601c3);
            if (strM33967C != null) {
                textResourceM21267a3 = AbstractC8693b.m21267a();
            } else {
                textResourceM21267a3 = AbstractC8693b.m21267a();
            }
            TextResource textResource114 = textResourceM21267a3;
            TextResource textResourceM132573b16 = viewState.getConfirmPasswordErrorDescription();
            AbstractC30784c abstractC30784cM132574c114 = viewState.getEndingType();
            InterfaceC29873g0 interfaceC29873g0M132582k114 = viewState.getVisualTransformation();
            TextResource textResourceM132578g16 = viewState.getNewPasswordPlaceHolderDescription();
            if (i18 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i3 = c28655q.m87157i(viewState) | z17;
            objM87133R9 = c28655q.m87133R();
            if (zM87157i3) {
                final int i311110 = 2;
                objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i311110) {
                            case 0:
                                return AbstractC12228b.m33984q(function7, viewState);
                            case 1:
                                return AbstractC12228b.m33986s(function7, viewState);
                            default:
                                return AbstractC12228b.m33988u(function7, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R9);
            } else {
                final int i311111 = 2;
                objM87133R9 = new InterfaceC4339a() { // from class: do0.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i311111) {
                            case 0:
                                return AbstractC12228b.m33984q(function7, viewState);
                            case 1:
                                return AbstractC12228b.m33986s(function7, viewState);
                            default:
                                return AbstractC12228b.m33988u(function7, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R9);
            }
            InterfaceC4339a interfaceC4339a1116 = (InterfaceC4339a) objM87133R9;
            if (i18 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R10 = c28655q.m87133R();
            if (z18) {
                interfaceC28601c8 = interfaceC28601c3;
                objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                c28655q.m87172p0(objM87133R10);
            } else {
                interfaceC28601c8 = interfaceC28601c3;
                objM87133R10 = new C2609r(function7, interfaceC28601c8, 9);
                c28655q.m87172p0(objM87133R10);
            }
            interfaceC28601c9 = interfaceC28601c8;
            AbstractC12232f.m34019e(null, c8688b114, textResource114, null, textResourceM132573b16, abstractC30784cM132574c114, textResourceM132578g16, interfaceC29873g0M132582k114, false, interfaceC4339a1116, (Function1) objM87133R10, c28655q, i31119, 0, 265);
            if (viewState.m132581j().isEmpty()) {
                c28655q.m87150e0(1103060140);
                float f111 = 2 * f13;
                c2314t2 = c2314t;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f111, c2314t2));
                AbstractC13372c.m37677h(viewState.m132581j(), AbstractC1099a.m3394p(f111, c2314t2), c28655q, 48, 0);
                c28655q.m87173q(false);
            } else {
                c2314t2 = c2314t;
                c28655q.m87150e0(1103321532);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            Modifier modifierM3394p8 = AbstractC1099a.m3394p(2 * f13, AbstractC22953f.m66727p(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9105H), C22949e.m66712e(c28655q).f90558e));
            EnumC27284v enumC27284v8 = EnumC27284v.TextLarge;
            if (m33992y(interfaceC28601c5) != null) {
                z19 = false;
            } else {
                z19 = false;
            }
            String strM21273g8 = AbstractC8693b.m21273g(AbstractC32772b.f136282D, c28655q, 0);
            if (i18 == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            objM87133R11 = c28655q.m87133R();
            if (z24) {
                objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                c28655q.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C1012d(function7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c9);
                c28655q.m87172p0(objM87133R11);
            }
            AbstractC27282u.m82292h(modifierM3394p8, enumC27284v8, strM21273g8, z19, 0L, null, false, (InterfaceC4339a) objM87133R11, c28655q, 48, 112);
            c28655q = c28655q;
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a1113;
            function3 = function7;
        } else {
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(i13, i14, 26, viewState, interfaceC4339a3, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m33980m(AbstractC40903a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m33981n() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m33982o(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m33983p(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m33984q(Function1 function1, C40905c c40905c) {
        function1.invoke(new AbstractC40903a.b(!c40905c.getPasswordIsVisible()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m33985r(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m33993z(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m33986s(Function1 function1, C40905c c40905c) {
        function1.invoke(new AbstractC40903a.b(!c40905c.getPasswordIsVisible()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m33987t(Function1 function1, InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m33966B(interfaceC28601c1, it);
        function1.invoke(new AbstractC40903a.f(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m33988u(Function1 function1, C40905c c40905c) {
        function1.invoke(new AbstractC40903a.b(!c40905c.getPasswordIsVisible()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m33989v(Function1 function1, InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m33982o(interfaceC28601c1, it);
        function1.invoke(new AbstractC40903a.c(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m33990w(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        if (m33992y(interfaceC28601c1) != null && m33965A(interfaceC28601c2) != null && m33967C(interfaceC28601c3) != null) {
            String strM33992y = m33992y(interfaceC28601c1);
            AbstractC22676k.m65747g(strM33992y);
            String strM33965A = m33965A(interfaceC28601c2);
            AbstractC22676k.m65747g(strM33965A);
            String strM33967C = m33967C(interfaceC28601c3);
            AbstractC22676k.m65747g(strM33967C);
            function1.invoke(new AbstractC40903a.a(strM33992y, strM33965A, strM33967C));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m33991x(C40905c c40905c, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m33979l(c40905c, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final String m33992y(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: z */
    private static final void m33993z(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }
}
