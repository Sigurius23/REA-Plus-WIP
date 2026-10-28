package p163g1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2161b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d30.C11545k0;
import e93.AbstractC12889b;
import ep1.C13421p;
import gm1.C15992b;
import j93.AbstractC21478l0;
import java.util.LinkedHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.C2319y;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3760m1;
import p077d0.C11347e2;
import p077d0.InterfaceC11419z;
import p133f1.C13921a0;
import p133f1.C13953k1;
import p180h0.AbstractC16412k1;
import p180h0.EnumC16377d2;
import p208i2.C17919x;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p507tx.AbstractC34235f;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.r7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15133r7 {

    /* JADX INFO: renamed from: a */
    public static final float f56711a;

    /* JADX INFO: renamed from: c */
    public static final float f56713c;

    /* JADX INFO: renamed from: f */
    public static final float f56716f;

    /* JADX INFO: renamed from: g */
    public static final float f56717g;

    /* JADX INFO: renamed from: h */
    public static final float f56718h;

    /* JADX INFO: renamed from: b */
    public static final float f56712b = 14;

    /* JADX INFO: renamed from: d */
    public static final float f56714d = 24;

    /* JADX INFO: renamed from: e */
    public static final float f56715e = 2;

    /* JADX INFO: renamed from: i */
    public static final C11347e2 f56719i = new C11347e2(100, (InterfaceC11419z) null, 6);

    /* JADX INFO: renamed from: j */
    public static final float f56720j = 1;

    /* JADX INFO: renamed from: k */
    public static final float f56721k = 6;

    /* JADX INFO: renamed from: l */
    public static final float f56722l = 125;

    static {
        float f13 = 34;
        f56711a = f13;
        float f14 = 20;
        f56713c = f14;
        f56716f = f13;
        f56717g = f14;
        f56718h = f13 - f14;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x023d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0240  */
    /* JADX WARN: Code duplicated, block: B:105:0x0244  */
    /* JADX WARN: Code duplicated, block: B:106:0x0259  */
    /* JADX WARN: Code duplicated, block: B:108:0x025e  */
    /* JADX WARN: Code duplicated, block: B:111:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0273  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02db  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:125:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0309  */
    /* JADX WARN: Code duplicated, block: B:129:0x032f  */
    /* JADX WARN: Code duplicated, block: B:132:0x033c  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x0144  */
    /* JADX WARN: Code duplicated, block: B:84:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x016e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x0215  */
    /* JADX WARN: Code duplicated, block: B:95:0x0217  */
    /* JADX WARN: Code duplicated, block: B:98:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0226  */
    /* JADX INFO: renamed from: a */
    public static final void m43183a(boolean z4, Function1 function1, Modifier modifier, boolean z13, InterfaceC15103o7 interfaceC15103o7, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z14;
        int i17;
        int i18;
        InterfaceC15103o7 interfaceC15103o7M108196A;
        boolean z15;
        boolean z16;
        InterfaceC15103o7 interfaceC15103o8;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        int i19;
        int i24;
        Modifier modifier4;
        Modifier modifier5;
        boolean z17;
        C28655q c28655q2;
        boolean z18;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC21083i interfaceC21083i;
        float fMo743q0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        final float fMo743q1;
        boolean zM87147d;
        Object obj;
        C14947a0 c14947a0;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        int i25;
        InterfaceC28601c1 interfaceC28601c1M87238F2;
        boolean zM87153g;
        Object objM87133R3;
        C14947a0 c14947a1;
        boolean z19;
        boolean zM87153g2;
        Object objM87133R4;
        boolean z24;
        boolean z25;
        int i26;
        Modifier modifierM3447a;
        boolean z26;
        C14947a0 c14947a2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87153g3;
        Object objM87133R5;
        int i27;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(25866825);
        int i28 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(function1) ? 32 : 16;
        }
        int i29 = i14 & 4;
        if (i29 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q3.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z13;
                    if (c28655q3.m87155h(z14)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i15 | 24576;
                if ((196608 & i13) == 0) {
                    if ((i14 & 32) == 0) {
                        interfaceC15103o7M108196A = interfaceC15103o7;
                        if (c28655q3.m87153g(interfaceC15103o7M108196A)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i18 |= i27;
                    } else {
                        interfaceC15103o7M108196A = interfaceC15103o7;
                    }
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    i18 |= i27;
                } else {
                    interfaceC15103o7M108196A = interfaceC15103o7;
                }
                if ((74899 & i18) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q3.m87135U(i18 & 1, z15)) {
                    c28655q3.m87140Z();
                    i19 = i13 & 1;
                    i24 = i18;
                    modifier4 = C2314t.f9131w;
                    if (i19 != 0 || c28655q3.m87118C()) {
                        if (i29 != 0) {
                            modifier5 = modifier4;
                        } else {
                            modifier5 = modifier2;
                        }
                        if (i16 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if ((i14 & 32) != 0) {
                            z18 = false;
                            c28655q2 = c28655q3;
                            interfaceC15103o7M108196A = AbstractC34235f.m108196A(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c28655q3, 1023);
                            i24 &= -458753;
                            z14 = z17;
                            modifier2 = modifier5;
                        } else {
                            c28655q2 = c28655q3;
                            z18 = false;
                            modifier2 = modifier5;
                            z14 = z17;
                        }
                    } else {
                        c28655q3.m87138X();
                        if ((i14 & 32) != 0) {
                            i24 &= -458753;
                        }
                        z18 = false;
                        c28655q2 = c28655q3;
                    }
                    c28655q2.m87175r();
                    c28655q2.m87150e0(1799821714);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    interfaceC21083i = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(z18);
                    C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u2)).mo743q0(f56718h);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    fMo743q1 = ((InterfaceC39171c) c28655q2.m87161k(c28674u2)).mo743q0(f56722l);
                    zM87147d = c28655q2.m87147d(fMo743q0) | c28655q2.m87147d(fMo743q1);
                    Object objM87133R6 = c28655q2.m87133R();
                    obj = objM87133R6;
                    if (zM87147d || objM87133R6 == c28676v0) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(Boolean.FALSE, Float.valueOf(0.0f));
                        linkedHashMap.put(Boolean.TRUE, Float.valueOf(fMo743q0));
                        C15059k3 c15059k3 = new C15059k3(linkedHashMap);
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        C14947a0 c14947a3 = new C14947a0(boolValueOf, new C15160u4(i28), new InterfaceC4339a() { // from class: g1.p7
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return Float.valueOf(fMo743q1);
                            }
                        }, f56719i, new C15992b(26));
                        c14947a3.f55777n.setValue(c15059k3);
                        c14947a3.m43075j(boolValueOf);
                        c28655q2.m87172p0(c14947a3);
                        obj = c14947a3;
                    }
                    c14947a0 = (C14947a0) obj;
                    int i34 = i24 >> 3;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q2);
                    i25 = i24 & 14;
                    interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Boolean.valueOf(z4), c28655q2);
                    zM87153g = c28655q2.m87153g(c14947a0) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R3 = c28655q2.m87133R();
                    if (!zM87153g || objM87133R3 == c28676v0) {
                        objM87133R3 = new C2319y(c14947a0, interfaceC28601c1M87238F2, interfaceC28601c1M87238F, interfaceC28601c1, (InterfaceC30057d) null, 7);
                        c14947a1 = c14947a0;
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        c14947a1 = c14947a0;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, c14947a1);
                    Boolean boolValueOf2 = Boolean.valueOf(z4);
                    Boolean bool = (Boolean) interfaceC28601c1.getValue();
                    bool.getClass();
                    if (i25 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87153g2 = z19 | c28655q2.m87153g(c14947a1);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g2 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C13953k1(z4, c14947a1, (InterfaceC30057d) null);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(boolValueOf2, bool, (InterfaceC4351m) objM87133R4, c28655q2);
                    if (c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (function1 != null) {
                        boolean z27 = z14;
                        i26 = 2;
                        modifierM3447a = AbstractC1112d.m3447a(modifier4, z4, interfaceC21083i, null, z27, new C18027i(2), function1);
                        z25 = z27;
                    } else {
                        z25 = z14;
                        i26 = 2;
                        modifierM3447a = modifier4;
                    }
                    if (function1 != null) {
                        C28674u2 c28674u3 = AbstractC15027h3.f56241a;
                        modifier4 = MinimumInteractiveModifier.f4718w;
                    }
                    Modifier modifierMo3471e = modifier2.mo3471e(modifier4).mo3471e(modifierM3447a);
                    EnumC16377d2 enumC16377d2 = EnumC16377d2.f62972x;
                    if (z25 || function1 == null) {
                        z26 = false;
                    } else {
                        z26 = true;
                    }
                    c14947a2 = c14947a1;
                    Modifier modifierM3416m = AbstractC1102d.m3416m(AbstractC1099a.m3394p(f56715e, AbstractC1102d.m3428y(AbstractC16412k1.m46598a(modifierMo3471e, c14947a1.f55769f, enumC16377d2, z26, interfaceC21083i, false, null, new C15075m(c14947a1, null), z24, 32), C2299e.f9102E, false, i26)), f56716f, f56717g);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3416m);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    boolean zBooleanValue = ((Boolean) c14947a2.f55771h.getValue()).booleanValue();
                    zM87153g3 = c28655q2.m87153g(c14947a2);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g3 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C15145t(c14947a2, 5);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC15103o7 interfaceC15103o9 = interfaceC15103o7M108196A;
                    m43184b(zBooleanValue, z25, interfaceC15103o9, (InterfaceC4339a) objM87133R5, interfaceC21083i, c28655q2, (i34 & 896) | 6 | ((i24 >> 6) & 7168));
                    c28655q2.m87173q(true);
                    z16 = z25;
                    interfaceC15103o8 = interfaceC15103o9;
                    c28655q = c28655q2;
                } else {
                    C28655q c28655q4 = c28655q3;
                    c28655q4.m87138X();
                    z16 = z14;
                    interfaceC15103o8 = interfaceC15103o7M108196A;
                    c28655q = c28655q4;
                }
                modifier3 = modifier2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(z4, function1, modifier3, z16, interfaceC15103o8, i13, i14, 4);
                }
            }
            i15 |= 3072;
            z14 = z13;
            i18 = i15 | 24576;
            if ((196608 & i13) == 0) {
                if ((i14 & 32) == 0) {
                    interfaceC15103o7M108196A = interfaceC15103o7;
                    if (c28655q3.m87153g(interfaceC15103o7M108196A)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i18 |= i27;
                } else {
                    interfaceC15103o7M108196A = interfaceC15103o7;
                }
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i18 |= i27;
            } else {
                interfaceC15103o7M108196A = interfaceC15103o7;
            }
            if ((74899 & i18) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q3.m87135U(i18 & 1, z15)) {
                c28655q3.m87140Z();
                i19 = i13 & 1;
                i24 = i18;
                modifier4 = C2314t.f9131w;
                if (i19 != 0) {
                    if (i29 != 0) {
                        modifier5 = modifier4;
                    } else {
                        modifier5 = modifier2;
                    }
                    if (i16 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if ((i14 & 32) != 0) {
                        z18 = false;
                        c28655q2 = c28655q3;
                        interfaceC15103o7M108196A = AbstractC34235f.m108196A(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c28655q3, 1023);
                        i24 &= -458753;
                        z14 = z17;
                        modifier2 = modifier5;
                    } else {
                        c28655q2 = c28655q3;
                        z18 = false;
                        modifier2 = modifier5;
                        z14 = z17;
                    }
                } else {
                    if (i29 != 0) {
                        modifier5 = modifier4;
                    } else {
                        modifier5 = modifier2;
                    }
                    if (i16 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if ((i14 & 32) != 0) {
                        z18 = false;
                        c28655q2 = c28655q3;
                        interfaceC15103o7M108196A = AbstractC34235f.m108196A(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c28655q3, 1023);
                        i24 &= -458753;
                        z14 = z17;
                        modifier2 = modifier5;
                    } else {
                        c28655q2 = c28655q3;
                        z18 = false;
                        modifier2 = modifier5;
                        z14 = z17;
                    }
                }
                c28655q2.m87175r();
                c28655q2.m87150e0(1799821714);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(z18);
                C28674u2 c28674u4 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u4)).mo743q0(f56718h);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                fMo743q1 = ((InterfaceC39171c) c28655q2.m87161k(c28674u4)).mo743q0(f56722l);
                zM87147d = c28655q2.m87147d(fMo743q0) | c28655q2.m87147d(fMo743q1);
                Object objM87133R7 = c28655q2.m87133R();
                obj = objM87133R7;
                if (zM87147d) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put(Boolean.FALSE, Float.valueOf(0.0f));
                    linkedHashMap2.put(Boolean.TRUE, Float.valueOf(fMo743q0));
                    C15059k3 c15059k4 = new C15059k3(linkedHashMap2);
                    Boolean boolValueOf3 = Boolean.valueOf(z4);
                    C14947a0 c14947a4 = new C14947a0(boolValueOf3, new C15160u4(i28), new InterfaceC4339a() { // from class: g1.p7
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return Float.valueOf(fMo743q1);
                        }
                    }, f56719i, new C15992b(26));
                    c14947a4.f55777n.setValue(c15059k4);
                    c14947a4.m43075j(boolValueOf3);
                    c28655q2.m87172p0(c14947a4);
                    obj = c14947a4;
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put(Boolean.FALSE, Float.valueOf(0.0f));
                    linkedHashMap3.put(Boolean.TRUE, Float.valueOf(fMo743q0));
                    C15059k3 c15059k5 = new C15059k3(linkedHashMap3);
                    Boolean boolValueOf4 = Boolean.valueOf(z4);
                    C14947a0 c14947a5 = new C14947a0(boolValueOf4, new C15160u4(i28), new InterfaceC4339a() { // from class: g1.p7
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return Float.valueOf(fMo743q1);
                        }
                    }, f56719i, new C15992b(26));
                    c14947a5.f55777n.setValue(c15059k5);
                    c14947a5.m43075j(boolValueOf4);
                    c28655q2.m87172p0(c14947a5);
                    obj = c14947a5;
                }
                c14947a0 = (C14947a0) obj;
                int i35 = i24 >> 3;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q2);
                i25 = i24 & 14;
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Boolean.valueOf(z4), c28655q2);
                zM87153g = c28655q2.m87153g(c14947a0) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C2319y(c14947a0, interfaceC28601c1M87238F2, interfaceC28601c1M87238F, interfaceC28601c1, (InterfaceC30057d) null, 7);
                    c14947a1 = c14947a0;
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C2319y(c14947a0, interfaceC28601c1M87238F2, interfaceC28601c1M87238F, interfaceC28601c1, (InterfaceC30057d) null, 7);
                    c14947a1 = c14947a0;
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, c14947a1);
                Boolean boolValueOf5 = Boolean.valueOf(z4);
                Boolean bool2 = (Boolean) interfaceC28601c1.getValue();
                bool2.getClass();
                if (i25 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87153g2 = z19 | c28655q2.m87153g(c14947a1);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R4 = new C13953k1(z4, c14947a1, (InterfaceC30057d) null);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C13953k1(z4, c14947a1, (InterfaceC30057d) null);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(boolValueOf5, bool2, (InterfaceC4351m) objM87133R4, c28655q2);
                if (c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (function1 != null) {
                    boolean z28 = z14;
                    i26 = 2;
                    modifierM3447a = AbstractC1112d.m3447a(modifier4, z4, interfaceC21083i, null, z28, new C18027i(2), function1);
                    z25 = z28;
                } else {
                    z25 = z14;
                    i26 = 2;
                    modifierM3447a = modifier4;
                }
                if (function1 != null) {
                    C28674u2 c28674u5 = AbstractC15027h3.f56241a;
                    modifier4 = MinimumInteractiveModifier.f4718w;
                }
                Modifier modifierMo3471e2 = modifier2.mo3471e(modifier4).mo3471e(modifierM3447a);
                EnumC16377d2 enumC16377d3 = EnumC16377d2.f62972x;
                if (z25) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                c14947a2 = c14947a1;
                Modifier modifierM3416m2 = AbstractC1102d.m3416m(AbstractC1099a.m3394p(f56715e, AbstractC1102d.m3428y(AbstractC16412k1.m46598a(modifierMo3471e2, c14947a1.f55769f, enumC16377d3, z26, interfaceC21083i, false, null, new C15075m(c14947a1, null), z24, 32), C2299e.f9102E, false, i26)), f56716f, f56717g);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3416m2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                boolean zBooleanValue2 = ((Boolean) c14947a2.f55771h.getValue()).booleanValue();
                zM87153g3 = c28655q2.m87153g(c14947a2);
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R5 = new C15145t(c14947a2, 5);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C15145t(c14947a2, 5);
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC15103o7 interfaceC15103o10 = interfaceC15103o7M108196A;
                m43184b(zBooleanValue2, z25, interfaceC15103o10, (InterfaceC4339a) objM87133R5, interfaceC21083i, c28655q2, (i35 & 896) | 6 | ((i24 >> 6) & 7168));
                c28655q2.m87173q(true);
                z16 = z25;
                interfaceC15103o8 = interfaceC15103o10;
                c28655q = c28655q2;
            } else {
                C28655q c28655q5 = c28655q3;
                c28655q5.m87138X();
                z16 = z14;
                interfaceC15103o8 = interfaceC15103o7M108196A;
                c28655q = c28655q5;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(z4, function1, modifier3, z16, interfaceC15103o8, i13, i14, 4);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                if (c28655q3.m87155h(z14)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i15 | 24576;
            if ((196608 & i13) == 0) {
                if ((i14 & 32) == 0) {
                    interfaceC15103o7M108196A = interfaceC15103o7;
                    if (c28655q3.m87153g(interfaceC15103o7M108196A)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i18 |= i27;
                } else {
                    interfaceC15103o7M108196A = interfaceC15103o7;
                }
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i18 |= i27;
            } else {
                interfaceC15103o7M108196A = interfaceC15103o7;
            }
            if ((74899 & i18) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q3.m87135U(i18 & 1, z15)) {
                c28655q3.m87140Z();
                i19 = i13 & 1;
                i24 = i18;
                modifier4 = C2314t.f9131w;
                if (i19 != 0) {
                    if (i29 != 0) {
                        modifier5 = modifier4;
                    } else {
                        modifier5 = modifier2;
                    }
                    if (i16 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if ((i14 & 32) != 0) {
                        z18 = false;
                        c28655q2 = c28655q3;
                        interfaceC15103o7M108196A = AbstractC34235f.m108196A(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c28655q3, 1023);
                        i24 &= -458753;
                        z14 = z17;
                        modifier2 = modifier5;
                    } else {
                        c28655q2 = c28655q3;
                        z18 = false;
                        modifier2 = modifier5;
                        z14 = z17;
                    }
                } else {
                    if (i29 != 0) {
                        modifier5 = modifier4;
                    } else {
                        modifier5 = modifier2;
                    }
                    if (i16 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if ((i14 & 32) != 0) {
                        z18 = false;
                        c28655q2 = c28655q3;
                        interfaceC15103o7M108196A = AbstractC34235f.m108196A(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c28655q3, 1023);
                        i24 &= -458753;
                        z14 = z17;
                        modifier2 = modifier5;
                    } else {
                        c28655q2 = c28655q3;
                        z18 = false;
                        modifier2 = modifier5;
                        z14 = z17;
                    }
                }
                c28655q2.m87175r();
                c28655q2.m87150e0(1799821714);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(z18);
                C28674u2 c28674u6 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u6)).mo743q0(f56718h);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                fMo743q1 = ((InterfaceC39171c) c28655q2.m87161k(c28674u6)).mo743q0(f56722l);
                zM87147d = c28655q2.m87147d(fMo743q0) | c28655q2.m87147d(fMo743q1);
                Object objM87133R8 = c28655q2.m87133R();
                obj = objM87133R8;
                if (zM87147d) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    linkedHashMap4.put(Boolean.FALSE, Float.valueOf(0.0f));
                    linkedHashMap4.put(Boolean.TRUE, Float.valueOf(fMo743q0));
                    C15059k3 c15059k6 = new C15059k3(linkedHashMap4);
                    Boolean boolValueOf6 = Boolean.valueOf(z4);
                    C14947a0 c14947a6 = new C14947a0(boolValueOf6, new C15160u4(i28), new InterfaceC4339a() { // from class: g1.p7
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return Float.valueOf(fMo743q1);
                        }
                    }, f56719i, new C15992b(26));
                    c14947a6.f55777n.setValue(c15059k6);
                    c14947a6.m43075j(boolValueOf6);
                    c28655q2.m87172p0(c14947a6);
                    obj = c14947a6;
                } else {
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap5.put(Boolean.FALSE, Float.valueOf(0.0f));
                    linkedHashMap5.put(Boolean.TRUE, Float.valueOf(fMo743q0));
                    C15059k3 c15059k7 = new C15059k3(linkedHashMap5);
                    Boolean boolValueOf7 = Boolean.valueOf(z4);
                    C14947a0 c14947a7 = new C14947a0(boolValueOf7, new C15160u4(i28), new InterfaceC4339a() { // from class: g1.p7
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return Float.valueOf(fMo743q1);
                        }
                    }, f56719i, new C15992b(26));
                    c14947a7.f55777n.setValue(c15059k7);
                    c14947a7.m43075j(boolValueOf7);
                    c28655q2.m87172p0(c14947a7);
                    obj = c14947a7;
                }
                c14947a0 = (C14947a0) obj;
                int i36 = i24 >> 3;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q2);
                i25 = i24 & 14;
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Boolean.valueOf(z4), c28655q2);
                zM87153g = c28655q2.m87153g(c14947a0) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C2319y(c14947a0, interfaceC28601c1M87238F2, interfaceC28601c1M87238F, interfaceC28601c1, (InterfaceC30057d) null, 7);
                    c14947a1 = c14947a0;
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C2319y(c14947a0, interfaceC28601c1M87238F2, interfaceC28601c1M87238F, interfaceC28601c1, (InterfaceC30057d) null, 7);
                    c14947a1 = c14947a0;
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, c14947a1);
                Boolean boolValueOf8 = Boolean.valueOf(z4);
                Boolean bool3 = (Boolean) interfaceC28601c1.getValue();
                bool3.getClass();
                if (i25 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87153g2 = z19 | c28655q2.m87153g(c14947a1);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R4 = new C13953k1(z4, c14947a1, (InterfaceC30057d) null);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C13953k1(z4, c14947a1, (InterfaceC30057d) null);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(boolValueOf8, bool3, (InterfaceC4351m) objM87133R4, c28655q2);
                if (c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (function1 != null) {
                    boolean z29 = z14;
                    i26 = 2;
                    modifierM3447a = AbstractC1112d.m3447a(modifier4, z4, interfaceC21083i, null, z29, new C18027i(2), function1);
                    z25 = z29;
                } else {
                    z25 = z14;
                    i26 = 2;
                    modifierM3447a = modifier4;
                }
                if (function1 != null) {
                    C28674u2 c28674u7 = AbstractC15027h3.f56241a;
                    modifier4 = MinimumInteractiveModifier.f4718w;
                }
                Modifier modifierMo3471e3 = modifier2.mo3471e(modifier4).mo3471e(modifierM3447a);
                EnumC16377d2 enumC16377d4 = EnumC16377d2.f62972x;
                if (z25) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                c14947a2 = c14947a1;
                Modifier modifierM3416m3 = AbstractC1102d.m3416m(AbstractC1099a.m3394p(f56715e, AbstractC1102d.m3428y(AbstractC16412k1.m46598a(modifierMo3471e3, c14947a1.f55769f, enumC16377d4, z26, interfaceC21083i, false, null, new C15075m(c14947a1, null), z24, 32), C2299e.f9102E, false, i26)), f56716f, f56717g);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3416m3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                boolean zBooleanValue3 = ((Boolean) c14947a2.f55771h.getValue()).booleanValue();
                zM87153g3 = c28655q2.m87153g(c14947a2);
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R5 = new C15145t(c14947a2, 5);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C15145t(c14947a2, 5);
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC15103o7 interfaceC15103o11 = interfaceC15103o7M108196A;
                m43184b(zBooleanValue3, z25, interfaceC15103o11, (InterfaceC4339a) objM87133R5, interfaceC21083i, c28655q2, (i36 & 896) | 6 | ((i24 >> 6) & 7168));
                c28655q2.m87173q(true);
                z16 = z25;
                interfaceC15103o8 = interfaceC15103o11;
                c28655q = c28655q2;
            } else {
                C28655q c28655q6 = c28655q3;
                c28655q6.m87138X();
                z16 = z14;
                interfaceC15103o8 = interfaceC15103o7M108196A;
                c28655q = c28655q6;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(z4, function1, modifier3, z16, interfaceC15103o8, i13, i14, 4);
            }
        }
        i15 |= 3072;
        z14 = z13;
        i18 = i15 | 24576;
        if ((196608 & i13) == 0) {
            if ((i14 & 32) == 0) {
                interfaceC15103o7M108196A = interfaceC15103o7;
                if (c28655q3.m87153g(interfaceC15103o7M108196A)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i18 |= i27;
            } else {
                interfaceC15103o7M108196A = interfaceC15103o7;
            }
            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i18 |= i27;
        } else {
            interfaceC15103o7M108196A = interfaceC15103o7;
        }
        if ((74899 & i18) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q3.m87135U(i18 & 1, z15)) {
            c28655q3.m87140Z();
            i19 = i13 & 1;
            i24 = i18;
            modifier4 = C2314t.f9131w;
            if (i19 != 0) {
                if (i29 != 0) {
                    modifier5 = modifier4;
                } else {
                    modifier5 = modifier2;
                }
                if (i16 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if ((i14 & 32) != 0) {
                    z18 = false;
                    c28655q2 = c28655q3;
                    interfaceC15103o7M108196A = AbstractC34235f.m108196A(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c28655q3, 1023);
                    i24 &= -458753;
                    z14 = z17;
                    modifier2 = modifier5;
                } else {
                    c28655q2 = c28655q3;
                    z18 = false;
                    modifier2 = modifier5;
                    z14 = z17;
                }
            } else {
                if (i29 != 0) {
                    modifier5 = modifier4;
                } else {
                    modifier5 = modifier2;
                }
                if (i16 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if ((i14 & 32) != 0) {
                    z18 = false;
                    c28655q2 = c28655q3;
                    interfaceC15103o7M108196A = AbstractC34235f.m108196A(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, c28655q3, 1023);
                    i24 &= -458753;
                    z14 = z17;
                    modifier2 = modifier5;
                } else {
                    c28655q2 = c28655q3;
                    z18 = false;
                    modifier2 = modifier5;
                    z14 = z17;
                }
            }
            c28655q2.m87175r();
            c28655q2.m87150e0(1799821714);
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R;
            c28655q2.m87173q(z18);
            C28674u2 c28674u8 = AbstractC2453v1.f9569h;
            fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u8)).mo743q0(f56718h);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            fMo743q1 = ((InterfaceC39171c) c28655q2.m87161k(c28674u8)).mo743q0(f56722l);
            zM87147d = c28655q2.m87147d(fMo743q0) | c28655q2.m87147d(fMo743q1);
            Object objM87133R9 = c28655q2.m87133R();
            obj = objM87133R9;
            if (zM87147d) {
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put(Boolean.FALSE, Float.valueOf(0.0f));
                linkedHashMap6.put(Boolean.TRUE, Float.valueOf(fMo743q0));
                C15059k3 c15059k8 = new C15059k3(linkedHashMap6);
                Boolean boolValueOf9 = Boolean.valueOf(z4);
                C14947a0 c14947a8 = new C14947a0(boolValueOf9, new C15160u4(i28), new InterfaceC4339a() { // from class: g1.p7
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return Float.valueOf(fMo743q1);
                    }
                }, f56719i, new C15992b(26));
                c14947a8.f55777n.setValue(c15059k8);
                c14947a8.m43075j(boolValueOf9);
                c28655q2.m87172p0(c14947a8);
                obj = c14947a8;
            } else {
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put(Boolean.FALSE, Float.valueOf(0.0f));
                linkedHashMap7.put(Boolean.TRUE, Float.valueOf(fMo743q0));
                C15059k3 c15059k9 = new C15059k3(linkedHashMap7);
                Boolean boolValueOf10 = Boolean.valueOf(z4);
                C14947a0 c14947a9 = new C14947a0(boolValueOf10, new C15160u4(i28), new InterfaceC4339a() { // from class: g1.p7
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return Float.valueOf(fMo743q1);
                    }
                }, f56719i, new C15992b(26));
                c14947a9.f55777n.setValue(c15059k9);
                c14947a9.m43075j(boolValueOf10);
                c28655q2.m87172p0(c14947a9);
                obj = c14947a9;
            }
            c14947a0 = (C14947a0) obj;
            int i37 = i24 >> 3;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q2);
            i25 = i24 & 14;
            interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Boolean.valueOf(z4), c28655q2);
            zM87153g = c28655q2.m87153g(c14947a0) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R3 = new C2319y(c14947a0, interfaceC28601c1M87238F2, interfaceC28601c1M87238F, interfaceC28601c1, (InterfaceC30057d) null, 7);
                c14947a1 = c14947a0;
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C2319y(c14947a0, interfaceC28601c1M87238F2, interfaceC28601c1M87238F, interfaceC28601c1, (InterfaceC30057d) null, 7);
                c14947a1 = c14947a0;
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, c14947a1);
            Boolean boolValueOf11 = Boolean.valueOf(z4);
            Boolean bool4 = (Boolean) interfaceC28601c1.getValue();
            bool4.getClass();
            if (i25 == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            zM87153g2 = z19 | c28655q2.m87153g(c14947a1);
            objM87133R4 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R4 = new C13953k1(z4, c14947a1, (InterfaceC30057d) null);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C13953k1(z4, c14947a1, (InterfaceC30057d) null);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(boolValueOf11, bool4, (InterfaceC4351m) objM87133R4, c28655q2);
            if (c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                z24 = true;
            } else {
                z24 = false;
            }
            if (function1 != null) {
                boolean z210 = z14;
                i26 = 2;
                modifierM3447a = AbstractC1112d.m3447a(modifier4, z4, interfaceC21083i, null, z210, new C18027i(2), function1);
                z25 = z210;
            } else {
                z25 = z14;
                i26 = 2;
                modifierM3447a = modifier4;
            }
            if (function1 != null) {
                C28674u2 c28674u9 = AbstractC15027h3.f56241a;
                modifier4 = MinimumInteractiveModifier.f4718w;
            }
            Modifier modifierMo3471e4 = modifier2.mo3471e(modifier4).mo3471e(modifierM3447a);
            EnumC16377d2 enumC16377d5 = EnumC16377d2.f62972x;
            if (z25) {
                z26 = false;
            } else {
                z26 = false;
            }
            c14947a2 = c14947a1;
            Modifier modifierM3416m4 = AbstractC1102d.m3416m(AbstractC1099a.m3394p(f56715e, AbstractC1102d.m3428y(AbstractC16412k1.m46598a(modifierMo3471e4, c14947a1.f55769f, enumC16377d5, z26, interfaceC21083i, false, null, new C15075m(c14947a1, null), z24, 32), C2299e.f9102E, false, i26)), f56716f, f56717g);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3416m4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            boolean zBooleanValue4 = ((Boolean) c14947a2.f55771h.getValue()).booleanValue();
            zM87153g3 = c28655q2.m87153g(c14947a2);
            objM87133R5 = c28655q2.m87133R();
            if (zM87153g3) {
                objM87133R5 = new C15145t(c14947a2, 5);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C15145t(c14947a2, 5);
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC15103o7 interfaceC15103o12 = interfaceC15103o7M108196A;
            m43184b(zBooleanValue4, z25, interfaceC15103o12, (InterfaceC4339a) objM87133R5, interfaceC21083i, c28655q2, (i37 & 896) | 6 | ((i24 >> 6) & 7168));
            c28655q2.m87173q(true);
            z16 = z25;
            interfaceC15103o8 = interfaceC15103o12;
            c28655q = c28655q2;
        } else {
            C28655q c28655q7 = c28655q3;
            c28655q7.m87138X();
            z16 = z14;
            interfaceC15103o8 = interfaceC15103o7M108196A;
            c28655q = c28655q7;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(z4, function1, modifier3, z16, interfaceC15103o8, i13, i14, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43184b(boolean z4, boolean z13, InterfaceC15103o7 interfaceC15103o7, InterfaceC4339a interfaceC4339a, InterfaceC21083i interfaceC21083i, Composer composer, int i13) {
        int i14;
        long j7;
        long j13;
        long jM43186a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(70908914);
        int i15 = i13 & 6;
        C1100b c1100b = C1100b.f4583a;
        if (i15 == 0) {
            i14 = (c28655q.m87153g(c1100b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(interfaceC15103o7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(interfaceC21083i) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C39967p();
                c28655q.m87172p0(objM87133R);
            }
            C39967p c39967p = (C39967p) objM87133R;
            boolean z14 = (458752 & i14) == 131072;
            Object objM87133R2 = c28655q.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = new C15097o1(interfaceC21083i, c39967p, null, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC21083i);
            float f13 = !c39967p.isEmpty() ? f56721k : f56720j;
            C15187x1 c15187x1 = (C15187x1) interfaceC15103o7;
            c15187x1.getClass();
            c28655q.m87150e0(-1176343362);
            if (z13) {
                j7 = z4 ? c15187x1.f56994b : c15187x1.f56996d;
            } else {
                j7 = z4 ? c15187x1.f56998f : c15187x1.f57000h;
            }
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(new C17919x(j7), c28655q);
            c28655q.m87173q(false);
            C2307m c2307m = C2299e.f9102E;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c1100b.mo3400a(c2314t, c2307m));
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                objM87133R3 = new C13921a0(9, interfaceC28601c1M87238F);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R3, c28655q, 0);
            c28655q.m87150e0(-66424183);
            if (z13) {
                j13 = z4 ? c15187x1.f56993a : c15187x1.f56995c;
            } else {
                j13 = z4 ? c15187x1.f56997e : c15187x1.f56999g;
            }
            InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(new C17919x(j13), c28655q);
            c28655q.m87173q(false);
            C15137s1 c15137s1 = (C15137s1) c28655q.m87161k(AbstractC15158u2.f56854a);
            float f14 = ((C39174f) c28655q.m87161k(AbstractC15158u2.f56855b)).f168413w + f13;
            int i16 = i14;
            if (!C17919x.m51542d(((C17919x) interfaceC28601c1M87238F2.getValue()).f69639a, ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h()) || c15137s1 == null) {
                c28655q.m87150e0(-674731226);
                c28655q.m87173q(false);
                jM43186a = ((C17919x) interfaceC28601c1M87238F2.getValue()).f69639a;
            } else {
                c28655q.m87150e0(-674820165);
                jM43186a = c15137s1.m43186a(((C17919x) interfaceC28601c1M87238F2.getValue()).f69639a, f14, c28655q, 0);
                c28655q.m87173q(false);
            }
            InterfaceC28670t2 interfaceC28670t2M11569a = AbstractC3760m1.m11569a(jM43186a, null, null, c28655q, 0, 14);
            Modifier modifierMo3400a = c1100b.mo3400a(c2314t, C2299e.f9117z);
            boolean z15 = (i16 & 57344) == 16384;
            Object objM87133R4 = c28655q.m87133R();
            if (z15 || objM87133R4 == c28676v0) {
                objM87133R4 = new C2161b(interfaceC4339a, 29);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM3415l = AbstractC1102d.m3415l(f56713c, AbstractC1095d.m3369a(AbstractC1099a.m3390l(modifierMo3400a, (Function1) objM87133R4), interfaceC21083i, AbstractC15210z4.m43228a(0L, 4, false, f56714d)));
            C33252i c33252i = AbstractC33253j.f138651a;
            AbstractC22953f.m66715b(c28655q, AbstractC1092a.m3358c(AbstractC12889b.m36262a0(modifierM3415l, f13, c33252i, false, 0L, 0L, 24), ((C17919x) interfaceC28670t2M11569a.getValue()).f69639a, c33252i));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11545k0(z4, z13, interfaceC15103o7, interfaceC4339a, interfaceC21083i, i13, 1);
        }
    }
}
