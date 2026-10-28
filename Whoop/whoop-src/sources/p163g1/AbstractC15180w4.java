package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.selection.AbstractC1110b;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import ep1.C13421p;
import fd3.C14408a;
import j93.AbstractC21478l0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3760m1;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p208i2.C17919x;
import p209i3.C18027i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g1.w4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15180w4 {

    /* JADX INFO: renamed from: b */
    public static final float f56974b;

    /* JADX INFO: renamed from: c */
    public static final float f56975c;

    /* JADX INFO: renamed from: d */
    public static final float f56976d;

    /* JADX INFO: renamed from: f */
    public static final float f56978f;

    /* JADX INFO: renamed from: a */
    public static final float f56973a = 24;

    /* JADX INFO: renamed from: e */
    public static final float f56977e = 12;

    static {
        float f13 = 2;
        f56974b = f13;
        float f14 = 20;
        f56975c = f14;
        f56976d = f14 / f13;
        f56978f = f13;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140  */
    /* JADX WARN: Code duplicated, block: B:83:0x0171  */
    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x018b  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX INFO: renamed from: a */
    public static final void m43211a(boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z13, C15167v1 c15167v1, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        boolean z16;
        C28677v1 c28677v1M87180u;
        float f13;
        InterfaceC28670t2 interfaceC28670t2M30587a;
        long j7;
        Object objM87238F;
        Object obj;
        Modifier modifier2;
        ?? r14;
        int i17;
        Modifier modifierM3444a;
        boolean zM87153g;
        Object objM87133R;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1314435585);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                i15 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i15 | 24576;
            if ((196608 & i13) == 0) {
                if (c28655q.m87153g(c15167v1)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            if ((74899 & i16) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i16 & 1, z15)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    z14 = i19 == 0 ? z14 : true;
                } else {
                    c28655q.m87138X();
                }
                c28655q.m87175r();
                if (z4) {
                    f13 = f56977e / 2;
                } else {
                    f13 = 0;
                }
                interfaceC28670t2M30587a = AbstractC11352g.m30587a(f13, AbstractC11348f.m30574v(100, 0, null, 6), null, c28655q, 48, 12);
                c15167v1.getClass();
                c28655q.m87150e0(1243421834);
                if (!z14) {
                    j7 = c15167v1.f56898c;
                } else if (z4) {
                    j7 = c15167v1.f56896a;
                } else {
                    j7 = c15167v1.f56897b;
                }
                if (z14) {
                    c28655q.m87150e0(-1312642667);
                    objM87238F = AbstractC3760m1.m11569a(j7, AbstractC11348f.m30574v(100, 0, null, 6), null, c28655q, 48, 12);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1312539964);
                    objM87238F = AbstractC28683x.m87238F(new C17919x(j7), c28655q);
                    c28655q.m87173q(false);
                }
                obj = objM87238F;
                c28655q.m87173q(false);
                modifier2 = C2314t.f9131w;
                if (interfaceC4339a != null) {
                    z16 = z14;
                    r14 = 0;
                    i17 = 2;
                    modifierM3444a = AbstractC1110b.m3444a(modifier2, z4, null, AbstractC15210z4.m43228a(0L, 4, false, f56973a), z16, new C18027i(3), interfaceC4339a);
                } else {
                    r14 = 0;
                    z16 = z14;
                    i17 = 2;
                    modifierM3444a = modifier2;
                }
                if (interfaceC4339a != null) {
                    C28674u2 c28674u2 = AbstractC15027h3.f56241a;
                    modifier2 = MinimumInteractiveModifier.f4718w;
                }
                Modifier modifierM3415l = AbstractC1102d.m3415l(f56975c, AbstractC1099a.m3394p(f56974b, AbstractC1102d.m3428y(modifier.mo3471e(modifier2).mo3471e(modifierM3444a), C2299e.f9102E, r14, i17)));
                zM87153g = c28655q.m87153g(obj) | c28655q.m87153g(r4);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C14408a(10, obj, interfaceC28670t2M30587a);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3415l, (Function1) objM87133R, c28655q, r14);
            } else {
                c28655q.m87138X();
                z16 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(z4, interfaceC4339a, modifier, z16, c15167v1, i13, i14);
            }
        }
        i15 |= 3072;
        z14 = z13;
        i16 = i15 | 24576;
        if ((196608 & i13) == 0) {
            if (c28655q.m87153g(c15167v1)) {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i18;
        }
        if ((74899 & i16) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i16 & 1, z15)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                z14 = i19 == 0 ? z14 : true;
            } else {
                z14 = i19 == 0 ? z14 : true;
            }
            c28655q.m87175r();
            if (z4) {
                f13 = f56977e / 2;
            } else {
                f13 = 0;
            }
            interfaceC28670t2M30587a = AbstractC11352g.m30587a(f13, AbstractC11348f.m30574v(100, 0, null, 6), null, c28655q, 48, 12);
            c15167v1.getClass();
            c28655q.m87150e0(1243421834);
            if (!z14) {
                j7 = c15167v1.f56898c;
            } else if (z4) {
                j7 = c15167v1.f56897b;
            } else {
                j7 = c15167v1.f56896a;
            }
            if (z14) {
                c28655q.m87150e0(-1312642667);
                objM87238F = AbstractC3760m1.m11569a(j7, AbstractC11348f.m30574v(100, 0, null, 6), null, c28655q, 48, 12);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1312539964);
                objM87238F = AbstractC28683x.m87238F(new C17919x(j7), c28655q);
                c28655q.m87173q(false);
            }
            obj = objM87238F;
            c28655q.m87173q(false);
            modifier2 = C2314t.f9131w;
            if (interfaceC4339a != null) {
                z16 = z14;
                r14 = 0;
                i17 = 2;
                modifierM3444a = AbstractC1110b.m3444a(modifier2, z4, null, AbstractC15210z4.m43228a(0L, 4, false, f56973a), z16, new C18027i(3), interfaceC4339a);
            } else {
                r14 = 0;
                z16 = z14;
                i17 = 2;
                modifierM3444a = modifier2;
            }
            if (interfaceC4339a != null) {
                C28674u2 c28674u3 = AbstractC15027h3.f56241a;
                modifier2 = MinimumInteractiveModifier.f4718w;
            }
            Modifier modifierM3415l2 = AbstractC1102d.m3415l(f56975c, AbstractC1099a.m3394p(f56974b, AbstractC1102d.m3428y(modifier.mo3471e(modifier2).mo3471e(modifierM3444a), C2299e.f9102E, r14, i17)));
            zM87153g = c28655q.m87153g(obj) | c28655q.m87153g(r4);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = new C14408a(10, obj, interfaceC28670t2M30587a);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C14408a(10, obj, interfaceC28670t2M30587a);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3415l2, (Function1) objM87133R, c28655q, r14);
        } else {
            c28655q.m87138X();
            z16 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(z4, interfaceC4339a, modifier, z16, c15167v1, i13, i14);
        }
    }
}
