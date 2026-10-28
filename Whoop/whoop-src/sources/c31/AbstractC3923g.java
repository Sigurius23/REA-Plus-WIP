package c31;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bs1.C3595n;
import bs1.C3603v;
import c93.InterfaceC4339a;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18042x;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22989q;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p411q2.InterfaceC29805a;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c31.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"", "enabled", "Ly81/e;", "circleColor", "Li2/t;", "circleBrush", "iconColor", "Lgz0/m0;", "icon", "", "testTag", "Lkotlin/Function1;", "Lc31/c;", "Ll83/a0;", "onViewEvent", "e", "(ZLy81/e;Li2/t;Ly81/e;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3923g {
    /* JADX WARN: Code duplicated, block: B:102:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:114:0x0221  */
    /* JADX WARN: Code duplicated, block: B:116:0x0229  */
    /* JADX WARN: Code duplicated, block: B:117:0x0235  */
    /* JADX WARN: Code duplicated, block: B:119:0x024a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0257  */
    /* JADX WARN: Code duplicated, block: B:123:0x0267  */
    /* JADX WARN: Code duplicated, block: B:125:0x028b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0296  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:87:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0139  */
    /* JADX WARN: Code duplicated, block: B:95:0x0152  */
    /* JADX WARN: Code duplicated, block: B:98:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x0187  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX INFO: renamed from: e */
    public static final void m11910e(boolean z4, InterfaceC39332e interfaceC39332e, AbstractC17911t abstractC17911t, InterfaceC39332e interfaceC39332e2, EnumC16313m0 icon, String str, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        String str2;
        int i16;
        Function1 function2;
        int i17;
        int i18;
        boolean z13;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        InterfaceC29805a interfaceC29805a;
        C2314t c2314t;
        boolean z14;
        boolean z15;
        Object objM87133R;
        String str3;
        boolean z16;
        Modifier modifierM3599a;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ?? r10;
        int i19;
        long jM53363d;
        boolean z17;
        C17919x c17919xM31989h;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(icon, "icon");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(599269241);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(interfaceC39332e) : c28655q2.m87157i(interfaceC39332e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(abstractC17911t) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q2.m87153g(interfaceC39332e2) : c28655q2.m87157i(interfaceC39332e2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87149e(icon.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i24 = i14 & 32;
        if (i24 == 0) {
            if ((196608 & i13) == 0) {
                str2 = str;
                i15 |= c28655q2.m87153g(str2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 = i14 & 64;
            if (i16 != 0) {
                if ((1572864 & i13) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((599187 & i18) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i18 & 1, z13)) {
                    if (i24 != 0) {
                        str2 = null;
                    }
                    obj = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == obj) {
                            objM87133R3 = new C3595n(26);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function2 = (Function1) objM87133R3;
                    }
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    float fM11957b = AbstractC3928l.m11957b();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3419p = AbstractC1102d.m3419p(fM11957b, c2314t);
                    boolean zM87157i = c28655q2.m87157i(interfaceC29805a);
                    if ((i18 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i | z14;
                    objM87133R = c28655q2.m87133R();
                    if (z15 || objM87133R == obj) {
                        objM87133R = new C3603v(interfaceC29805a, function2, 5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    str3 = str2;
                    Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3419p, z4, null, null, (InterfaceC4339a) objM87133R, 14);
                    if (str3 != null) {
                        c28655q2.m87150e0(-1348495112);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == obj) {
                            objM87133R2 = new C3595n(27);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        z16 = false;
                        modifierM3599a = AbstractC1136a.m3599a(AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2), str3);
                        c28655q2.m87173q(false);
                    } else {
                        z16 = false;
                        c28655q2.m87150e0(-1348286823);
                        c28655q2.m87173q(false);
                        modifierM3599a = c2314t;
                    }
                    Modifier modifierMo3471e = modifierM3362g.mo3471e(modifierM3599a);
                    C2307m c2307m = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, z16);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
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
                    if (interfaceC39332e == null) {
                        c28655q2.m87150e0(1356565061);
                        r10 = 0;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1356565062);
                        r10 = 0;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 3) & 14), AbstractC33253j.f138651a), c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    if (abstractC17911t == null) {
                        c28655q2.m87150e0(1356868985);
                        c28655q2.m87173q(r10);
                        i19 = 4;
                    } else {
                        c28655q2.m87150e0(1356868986);
                        i19 = 4;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t), abstractC17911t, AbstractC33253j.f138651a, 0.0f, 4), c28655q2, r10);
                        c28655q2.m87173q(r10);
                    }
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * i19, C1100b.f4583a.mo3400a(c2314t, c2307m));
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6);
                    if (z4) {
                        c28655q2.m87150e0(1357368613);
                        if (interfaceC39332e2 == null) {
                            c28655q2.m87150e0(1357378191);
                            z17 = false;
                            c28655q2.m87173q(false);
                            c17919xM31989h = null;
                        } else {
                            z17 = false;
                            c28655q2.m87150e0(875070386);
                            c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 9) & 14));
                        }
                        if (c17919xM31989h == null) {
                            c28655q2.m87150e0(875071689);
                            jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, z17);
                        } else {
                            c28655q2.m87150e0(875070077);
                            c28655q2.m87173q(z17);
                            jM53363d = c17919xM31989h.f69639a;
                        }
                        c28655q2.m87173q(z17);
                    } else {
                        c28655q2.m87150e0(1357449802);
                        jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q2, 6, false);
                    }
                    str2 = str3;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p2, jM53363d, c28655q2, 48, 0);
                    C28655q c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    function3 = function2;
                    c28655q = c28655q3;
                } else {
                    C28655q c28655q4 = c28655q2;
                    c28655q4.m87138X();
                    function3 = function2;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(z4, interfaceC39332e, abstractC17911t, interfaceC39332e2, icon, str2, function3, i13, i14);
                }
            }
            i15 |= 1572864;
            function2 = function1;
            i18 = i15;
            if ((599187 & i18) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z13)) {
                if (i24 != 0) {
                    str2 = null;
                }
                obj = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = new C3595n(26);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function2 = (Function1) objM87133R3;
                }
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                float fM11957b2 = AbstractC3928l.m11957b();
                c2314t = C2314t.f9131w;
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(fM11957b2, c2314t);
                boolean zM87157i2 = c28655q2.m87157i(interfaceC29805a);
                if ((i18 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i2 | z14;
                objM87133R = c28655q2.m87133R();
                if (z15) {
                    objM87133R = new C3603v(interfaceC29805a, function2, 5);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3603v(interfaceC29805a, function2, 5);
                    c28655q2.m87172p0(objM87133R);
                }
                str3 = str2;
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3419p3, z4, null, null, (InterfaceC4339a) objM87133R, 14);
                if (str3 != null) {
                    c28655q2.m87150e0(-1348495112);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C3595n(27);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z16 = false;
                    modifierM3599a = AbstractC1136a.m3599a(AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2), str3);
                    c28655q2.m87173q(false);
                } else {
                    z16 = false;
                    c28655q2.m87150e0(-1348286823);
                    c28655q2.m87173q(false);
                    modifierM3599a = c2314t;
                }
                Modifier modifierMo3471e2 = modifierM3362g2.mo3471e(modifierM3599a);
                C2307m c2307m2 = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, z16);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
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
                if (interfaceC39332e == null) {
                    c28655q2.m87150e0(1356565061);
                    r10 = 0;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1356565062);
                    r10 = 0;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 3) & 14), AbstractC33253j.f138651a), c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                if (abstractC17911t == null) {
                    c28655q2.m87150e0(1356868985);
                    c28655q2.m87173q(r10);
                    i19 = 4;
                } else {
                    c28655q2.m87150e0(1356868986);
                    i19 = 4;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t), abstractC17911t, AbstractC33253j.f138651a, 0.0f, 4), c28655q2, r10);
                    c28655q2.m87173q(r10);
                }
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(6 * i19, C1100b.f4583a.mo3400a(c2314t, c2307m2));
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6);
                if (z4) {
                    c28655q2.m87150e0(1357368613);
                    if (interfaceC39332e2 == null) {
                        c28655q2.m87150e0(1357378191);
                        z17 = false;
                        c28655q2.m87173q(false);
                        c17919xM31989h = null;
                    } else {
                        z17 = false;
                        c28655q2.m87150e0(875070386);
                        c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 9) & 14));
                    }
                    if (c17919xM31989h == null) {
                        c28655q2.m87150e0(875071689);
                        jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, z17);
                    } else {
                        c28655q2.m87150e0(875070077);
                        c28655q2.m87173q(z17);
                        jM53363d = c17919xM31989h.f69639a;
                    }
                    c28655q2.m87173q(z17);
                } else {
                    c28655q2.m87150e0(1357449802);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q2, 6, false);
                }
                str2 = str3;
                AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3419p4, jM53363d, c28655q2, 48, 0);
                C28655q c28655q5 = c28655q2;
                c28655q5.m87173q(true);
                function3 = function2;
                c28655q = c28655q5;
            } else {
                C28655q c28655q6 = c28655q2;
                c28655q6.m87138X();
                function3 = function2;
                c28655q = c28655q6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(z4, interfaceC39332e, abstractC17911t, interfaceC39332e2, icon, str2, function3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        str2 = str;
        i16 = i14 & 64;
        if (i16 != 0) {
            if ((1572864 & i13) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((599187 & i18) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z13)) {
                if (i24 != 0) {
                    str2 = null;
                }
                obj = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = new C3595n(26);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function2 = (Function1) objM87133R3;
                }
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                float fM11957b3 = AbstractC3928l.m11957b();
                c2314t = C2314t.f9131w;
                Modifier modifierM3419p5 = AbstractC1102d.m3419p(fM11957b3, c2314t);
                boolean zM87157i3 = c28655q2.m87157i(interfaceC29805a);
                if ((i18 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i3 | z14;
                objM87133R = c28655q2.m87133R();
                if (z15) {
                    objM87133R = new C3603v(interfaceC29805a, function2, 5);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3603v(interfaceC29805a, function2, 5);
                    c28655q2.m87172p0(objM87133R);
                }
                str3 = str2;
                Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3419p5, z4, null, null, (InterfaceC4339a) objM87133R, 14);
                if (str3 != null) {
                    c28655q2.m87150e0(-1348495112);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C3595n(27);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z16 = false;
                    modifierM3599a = AbstractC1136a.m3599a(AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2), str3);
                    c28655q2.m87173q(false);
                } else {
                    z16 = false;
                    c28655q2.m87150e0(-1348286823);
                    c28655q2.m87173q(false);
                    modifierM3599a = c2314t;
                }
                Modifier modifierMo3471e3 = modifierM3362g3.mo3471e(modifierM3599a);
                C2307m c2307m3 = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, z16);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e3);
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
                if (interfaceC39332e == null) {
                    c28655q2.m87150e0(1356565061);
                    r10 = 0;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1356565062);
                    r10 = 0;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 3) & 14), AbstractC33253j.f138651a), c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                if (abstractC17911t == null) {
                    c28655q2.m87150e0(1356868985);
                    c28655q2.m87173q(r10);
                    i19 = 4;
                } else {
                    c28655q2.m87150e0(1356868986);
                    i19 = 4;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t), abstractC17911t, AbstractC33253j.f138651a, 0.0f, 4), c28655q2, r10);
                    c28655q2.m87173q(r10);
                }
                Modifier modifierM3419p6 = AbstractC1102d.m3419p(6 * i19, C1100b.f4583a.mo3400a(c2314t, c2307m3));
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6);
                if (z4) {
                    c28655q2.m87150e0(1357368613);
                    if (interfaceC39332e2 == null) {
                        c28655q2.m87150e0(1357378191);
                        z17 = false;
                        c28655q2.m87173q(false);
                        c17919xM31989h = null;
                    } else {
                        z17 = false;
                        c28655q2.m87150e0(875070386);
                        c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 9) & 14));
                    }
                    if (c17919xM31989h == null) {
                        c28655q2.m87150e0(875071689);
                        jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, z17);
                    } else {
                        c28655q2.m87150e0(875070077);
                        c28655q2.m87173q(z17);
                        jM53363d = c17919xM31989h.f69639a;
                    }
                    c28655q2.m87173q(z17);
                } else {
                    c28655q2.m87150e0(1357449802);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q2, 6, false);
                }
                str2 = str3;
                AbstractC15005f3.m43108b(c27430eM107874S3, null, modifierM3419p6, jM53363d, c28655q2, 48, 0);
                C28655q c28655q7 = c28655q2;
                c28655q7.m87173q(true);
                function3 = function2;
                c28655q = c28655q7;
            } else {
                C28655q c28655q8 = c28655q2;
                c28655q8.m87138X();
                function3 = function2;
                c28655q = c28655q8;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(z4, interfaceC39332e, abstractC17911t, interfaceC39332e2, icon, str2, function3, i13, i14);
            }
        }
        i15 |= 1572864;
        function2 = function1;
        i18 = i15;
        if ((599187 & i18) != 599186) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z13)) {
            if (i24 != 0) {
                str2 = null;
            }
            obj = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = new C3595n(26);
                    c28655q2.m87172p0(objM87133R3);
                }
                function2 = (Function1) objM87133R3;
            }
            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
            float fM11957b4 = AbstractC3928l.m11957b();
            c2314t = C2314t.f9131w;
            Modifier modifierM3419p7 = AbstractC1102d.m3419p(fM11957b4, c2314t);
            boolean zM87157i4 = c28655q2.m87157i(interfaceC29805a);
            if ((i18 & 3670016) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i4 | z14;
            objM87133R = c28655q2.m87133R();
            if (z15) {
                objM87133R = new C3603v(interfaceC29805a, function2, 5);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C3603v(interfaceC29805a, function2, 5);
                c28655q2.m87172p0(objM87133R);
            }
            str3 = str2;
            Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM3419p7, z4, null, null, (InterfaceC4339a) objM87133R, 14);
            if (str3 != null) {
                c28655q2.m87150e0(-1348495112);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C3595n(27);
                    c28655q2.m87172p0(objM87133R2);
                }
                z16 = false;
                modifierM3599a = AbstractC1136a.m3599a(AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2), str3);
                c28655q2.m87173q(false);
            } else {
                z16 = false;
                c28655q2.m87150e0(-1348286823);
                c28655q2.m87173q(false);
                modifierM3599a = c2314t;
            }
            Modifier modifierMo3471e4 = modifierM3362g4.mo3471e(modifierM3599a);
            C2307m c2307m4 = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m4, z16);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e4);
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
            if (interfaceC39332e == null) {
                c28655q2.m87150e0(1356565061);
                r10 = 0;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1356565062);
                r10 = 0;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 3) & 14), AbstractC33253j.f138651a), c28655q2, 0);
                c28655q2.m87173q(false);
            }
            if (abstractC17911t == null) {
                c28655q2.m87150e0(1356868985);
                c28655q2.m87173q(r10);
                i19 = 4;
            } else {
                c28655q2.m87150e0(1356868986);
                i19 = 4;
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t), abstractC17911t, AbstractC33253j.f138651a, 0.0f, 4), c28655q2, r10);
                c28655q2.m87173q(r10);
            }
            Modifier modifierM3419p8 = AbstractC1102d.m3419p(6 * i19, C1100b.f4583a.mo3400a(c2314t, c2307m4));
            C27430e c27430eM107874S4 = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6);
            if (z4) {
                c28655q2.m87150e0(1357368613);
                if (interfaceC39332e2 == null) {
                    c28655q2.m87150e0(1357378191);
                    z17 = false;
                    c28655q2.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    z17 = false;
                    c28655q2.m87150e0(875070386);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 9) & 14));
                }
                if (c17919xM31989h == null) {
                    c28655q2.m87150e0(875071689);
                    jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, z17);
                } else {
                    c28655q2.m87150e0(875070077);
                    c28655q2.m87173q(z17);
                    jM53363d = c17919xM31989h.f69639a;
                }
                c28655q2.m87173q(z17);
            } else {
                c28655q2.m87150e0(1357449802);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q2, 6, false);
            }
            str2 = str3;
            AbstractC15005f3.m43108b(c27430eM107874S4, null, modifierM3419p8, jM53363d, c28655q2, 48, 0);
            C28655q c28655q9 = c28655q2;
            c28655q9.m87173q(true);
            function3 = function2;
            c28655q = c28655q9;
        } else {
            C28655q c28655q10 = c28655q2;
            c28655q10.m87138X();
            function3 = function2;
            c28655q = c28655q10;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(z4, interfaceC39332e, abstractC17911t, interfaceC39332e2, icon, str2, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11911f(EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11912g(InterfaceC29805a interfaceC29805a, Function1 function1) {
        interfaceC29805a.mo7428a(0);
        function1.invoke(EnumC3919c.FILLED_BUTTON);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m11913h(InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18042x.m51816a(semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m11914i(boolean z4, InterfaceC39332e interfaceC39332e, AbstractC17911t abstractC17911t, InterfaceC39332e interfaceC39332e2, EnumC16313m0 enumC16313m0, String str, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m11910e(z4, interfaceC39332e, abstractC17911t, interfaceC39332e2, enumC16313m0, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
