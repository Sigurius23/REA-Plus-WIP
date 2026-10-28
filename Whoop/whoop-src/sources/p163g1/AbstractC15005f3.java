package p163g1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import e61.C12764g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p181h2.C16620e;
import p208i2.AbstractC17921y;
import p208i2.C17903p;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22989q;
import p331n2.AbstractC26165a;
import p355o2.AbstractC27422a;
import p355o2.C27430e;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p635y2.C39102j;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g1.f3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15005f3 {

    /* JADX INFO: renamed from: a */
    public static final Modifier f56129a = AbstractC1102d.m3419p(24, C2314t.f9131w);

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:93:0x0157  */
    /* JADX WARN: Code duplicated, block: B:95:0x0177  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182  */
    /* JADX INFO: renamed from: a */
    public static final void m43107a(AbstractC26165a abstractC26165a, String str, Modifier modifier, long j7, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        long jM51541c;
        boolean z4;
        Modifier modifier3;
        long j13;
        C28677v1 c28677v1M87180u;
        int i16;
        Modifier modifier4;
        boolean z13;
        Object objM87133R;
        Modifier modifierM51775c;
        long f4822h;
        boolean z14;
        Object objM87133R2;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1142959010);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(abstractC26165a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                jM51541c = j7;
                if ((i14 & 8) == 0 || !c28655q.m87151f(jM51541c)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                } else {
                    i17 = 2048;
                }
                i15 |= i17;
            } else {
                jM51541c = j7;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                modifier4 = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i18 != 0) {
                        modifier2 = modifier4;
                    }
                    if ((i14 & 8) != 0) {
                        jM51541c = C17919x.m51541c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a);
                        i15 &= -7169;
                    }
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                }
                c28655q.m87175r();
                z13 = (((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87151f(jM51541c)) || (i15 & 3072) == 2048;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    if (C17919x.m51542d(jM51541c, C17919x.f69637n)) {
                        objM87133R = null;
                    } else {
                        objM87133R = new C17903p(jM51541c, 5);
                    }
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC17921y abstractC17921y = (AbstractC17921y) objM87133R;
                if (str != null) {
                    c28655q.m87150e0(609231686);
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C12764g(str, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifier4, false, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(609390468);
                    c28655q.m87173q(false);
                    modifierM51775c = modifier4;
                }
                Modifier modifier5 = modifier2;
                if (C16620e.m47210b(abstractC26165a.getF4822H(), 9205357640488583168L)) {
                    modifier4 = f56129a;
                } else {
                    f4822h = abstractC26165a.getF4822H();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (f4822h >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (f4822h & 4294967295L)))) {
                        modifier4 = f56129a;
                    }
                }
                AbstractC22989q.m66760a(AbstractC1125a.m3481d(modifier5.mo3471e(modifier4), abstractC26165a, null, C39102j.f168200b, 0.0f, abstractC17921y, 22).mo3471e(modifierM51775c), c28655q, 0);
                modifier3 = modifier5;
                j13 = jM51541c;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                j13 = jM51541c;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14994e3(abstractC26165a, str, modifier3, j13, i13, i14, 0);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i13 & 3072) == 0) {
            jM51541c = j7;
            if ((i14 & 8) == 0) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        } else {
            jM51541c = j7;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            modifier4 = C2314t.f9131w;
            if (i16 != 0) {
                if (i18 != 0) {
                    modifier2 = modifier4;
                }
                if ((i14 & 8) != 0) {
                    jM51541c = C17919x.m51541c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a);
                    i15 &= -7169;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = modifier4;
                }
                if ((i14 & 8) != 0) {
                    jM51541c = C17919x.m51541c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a);
                    i15 &= -7169;
                }
            }
            c28655q.m87175r();
            if (((i15 & 7168) ^ 3072) <= 2048) {
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13) {
                if (C17919x.m51542d(jM51541c, C17919x.f69637n)) {
                    objM87133R = null;
                } else {
                    objM87133R = new C17903p(jM51541c, 5);
                }
                c28655q.m87172p0(objM87133R);
            } else {
                if (C17919x.m51542d(jM51541c, C17919x.f69637n)) {
                    objM87133R = null;
                } else {
                    objM87133R = new C17903p(jM51541c, 5);
                }
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17921y abstractC17921y2 = (AbstractC17921y) objM87133R;
            if (str != null) {
                c28655q.m87150e0(609231686);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C12764g(str, 2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12764g(str, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM51775c = AbstractC18032n.m51775c(modifier4, false, (Function1) objM87133R2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(609390468);
                c28655q.m87173q(false);
                modifierM51775c = modifier4;
            }
            Modifier modifier6 = modifier2;
            if (C16620e.m47210b(abstractC26165a.getF4822H(), 9205357640488583168L)) {
                f4822h = abstractC26165a.getF4822H();
                if (Float.isInfinite(Float.intBitsToFloat((int) (f4822h >> 32)))) {
                    modifier4 = f56129a;
                }
            } else {
                modifier4 = f56129a;
            }
            AbstractC22989q.m66760a(AbstractC1125a.m3481d(modifier6.mo3471e(modifier4), abstractC26165a, null, C39102j.f168200b, 0.0f, abstractC17921y2, 22).mo3471e(modifierM51775c), c28655q, 0);
            modifier3 = modifier6;
            j13 = jM51541c;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            j13 = jM51541c;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14994e3(abstractC26165a, str, modifier3, j13, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43108b(C27430e c27430e, String str, Modifier modifier, long j7, Composer composer, int i13, int i14) {
        if ((i14 & 4) != 0) {
            modifier = C2314t.f9131w;
        }
        Modifier modifier2 = modifier;
        if ((i14 & 8) != 0) {
            C28655q c28655q = (C28655q) composer;
            j7 = C17919x.m51541c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a);
        }
        m43107a(AbstractC27422a.m82849c(c27430e, composer), str, modifier2, j7, composer, (i13 & 112) | 8 | (i13 & 896) | (i13 & 7168), 0);
    }
}
