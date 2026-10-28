package p292l1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import e61.C12764g;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p163g1.C14994e3;
import p181h2.C16620e;
import p208i2.AbstractC17921y;
import p208i2.C17903p;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22989q;
import p331n2.AbstractC26165a;
import p354o1.AbstractC27384w;
import p355o2.AbstractC27422a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p635y2.C39102j;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.r1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23164r1 {

    /* JADX INFO: renamed from: a */
    public static final Modifier f91621a = AbstractC1102d.m3419p(AbstractC27384w.f110064d, C2314t.f9131w);

    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX INFO: renamed from: a */
    public static final void m67132a(final AbstractC26165a abstractC26165a, final String str, final Modifier modifier, final long j7, Composer composer, final int i13) {
        AbstractC26165a abstractC26165a2;
        int i14;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2142239481);
        if ((i13 & 6) == 0) {
            abstractC26165a2 = abstractC26165a;
            i14 = (c28655q.m87157i(abstractC26165a2) ? 4 : 2) | i13;
        } else {
            abstractC26165a2 = abstractC26165a;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87151f(j7) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            boolean z4 = (((i14 & 7168) ^ 3072) > 2048 && c28655q.m87151f(j7)) || (i14 & 3072) == 2048;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = C17919x.m51542d(j7, C17919x.f69637n) ? null : new C17903p(j7, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17921y abstractC17921y = (AbstractC17921y) objM87133R;
            Modifier modifier3 = C2314t.f9131w;
            if (str != null) {
                c28655q.m87150e0(-536990979);
                boolean z13 = (i14 & 112) == 32;
                Object objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C12764g(str, 4);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifier3, false, (Function1) objM87133R2);
                c28655q.m87173q(false);
                modifier2 = modifierM51775c;
            } else {
                c28655q.m87150e0(-536832197);
                c28655q.m87173q(false);
                modifier2 = modifier3;
            }
            Modifier modifier4 = modifier2;
            if (C16620e.m47210b(abstractC26165a2.getF4822H(), 9205357640488583168L)) {
                modifier3 = f91621a;
            } else {
                long f4822h = abstractC26165a2.getF4822H();
                if (Float.isInfinite(Float.intBitsToFloat((int) (f4822h >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (f4822h & 4294967295L)))) {
                    modifier3 = f91621a;
                }
            }
            AbstractC22989q.m66760a(AbstractC1125a.m3481d(modifier.mo3471e(modifier3), abstractC26165a2, null, C39102j.f168200b, 0.0f, abstractC17921y, 22).mo3471e(modifier4), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l1.q1
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC23164r1.m67132a(abstractC26165a, str, modifier, j7, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m67133b(C27430e c27430e, String str, Modifier modifier, long j7, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        long j13;
        boolean z4;
        long j14;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        Modifier modifier5;
        long j15;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-126890956);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(c27430e) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    j13 = j7;
                    if (c28655q.m87151f(j13)) {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i16;
                } else {
                    j13 = j7;
                }
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i16;
            } else {
                j13 = j7;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if (i17 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        modifier5 = modifier4;
                        j15 = ((C17919x) c28655q.m87161k(AbstractC23168s.m67135a())).f69639a;
                    } else {
                        modifier5 = modifier4;
                    }
                    c28655q.m87175r();
                    m67132a(AbstractC27422a.m82849c(c27430e, c28655q), str, modifier5, j15, c28655q, (i15 & 112) | 8 | (i15 & 896) | (i15 & 7168));
                    modifier3 = modifier5;
                    j14 = j15;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    modifier5 = modifier2;
                }
                j15 = j13;
                c28655q.m87175r();
                m67132a(AbstractC27422a.m82849c(c27430e, c28655q), str, modifier5, j15, c28655q, (i15 & 112) | 8 | (i15 & 896) | (i15 & 7168));
                modifier3 = modifier5;
                j14 = j15;
            } else {
                c28655q.m87138X();
                j14 = j13;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14994e3(c27430e, str, modifier3, j14, i13, i14, 1);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                j13 = j7;
                if (c28655q.m87151f(j13)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i16;
            } else {
                j13 = j7;
            }
            i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i16;
        } else {
            j13 = j7;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    modifier5 = modifier4;
                    j15 = ((C17919x) c28655q.m87161k(AbstractC23168s.m67135a())).f69639a;
                } else {
                    modifier5 = modifier4;
                    j15 = j13;
                }
            } else {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    modifier5 = modifier4;
                    j15 = ((C17919x) c28655q.m87161k(AbstractC23168s.m67135a())).f69639a;
                } else {
                    modifier5 = modifier4;
                    j15 = j13;
                }
            }
            c28655q.m87175r();
            m67132a(AbstractC27422a.m82849c(c27430e, c28655q), str, modifier5, j15, c28655q, (i15 & 112) | 8 | (i15 & 896) | (i15 & 7168));
            modifier3 = modifier5;
            j14 = j15;
        } else {
            c28655q.m87138X();
            j14 = j13;
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14994e3(c27430e, str, modifier3, j14, i13, i14, 1);
        }
    }
}
