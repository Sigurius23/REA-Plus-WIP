package p292l1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2647w2;
import c93.InterfaceC4351m;
import d30.C11547l0;
import jt1.C21937b;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import p026b2.C2314t;
import p043c4.InterfaceC3964i0;
import p077d0.AbstractC11343d2;
import p077d0.C11421z1;
import p132f0.C13776c1;
import p163g1.C15001f;
import p208i2.InterfaceC17869a1;
import p291l0.C22976l1;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24906i;
import p354o1.AbstractC27379r;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;

/* JADX INFO: renamed from: l1.u4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23185u4 {

    /* JADX INFO: renamed from: a */
    public static final float f91709a;

    /* JADX INFO: renamed from: b */
    public static final float f91710b = 24;

    /* JADX INFO: renamed from: c */
    public static final float f91711c = 40;

    /* JADX INFO: renamed from: d */
    public static final C22976l1 f91712d;

    static {
        float f13 = 4;
        f91709a = f13;
        float f14 = 8;
        f91712d = new C22976l1(f14, f13, f14, f13);
    }

    /* JADX INFO: renamed from: a */
    public static final void m67144a(final C23197w4 c23197w4, Modifier modifier, float f13, InterfaceC17869a1 interfaceC17869a1, long j7, long j13, float f14, float f15, final C37816b c37816b, Composer composer, final int i13) {
        int i14;
        C28655q c28655q;
        final Modifier modifier2;
        final float f16;
        final InterfaceC17869a1 interfaceC17869a2;
        final long j14;
        final long j15;
        final float f17;
        final float f18;
        long jM67118d;
        int i15;
        float f19;
        long jM67118d2;
        float f24;
        Modifier modifier3;
        InterfaceC17869a1 interfaceC17869a3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-343758958);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(c23197w4) : c28655q2.m87157i(c23197w4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i16 = i14 | 3504;
        if ((i13 & 24576) == 0) {
            i16 = i14 | 11696;
        }
        if ((196608 & i13) == 0) {
            i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i16 |= 524288;
        }
        int i17 = 113246208 | i16;
        if ((805306368 & i13) == 0) {
            i17 |= c28655q2.m87157i(c37816b) ? 536870912 : 268435456;
        }
        if (c28655q2.m87135U(i17 & 1, (306783379 & i17) != 306783378)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                f16 = AbstractC23167r4.f91625a;
                InterfaceC17869a1 interfaceC17869a1M67130b = AbstractC23160q3.m67130b(AbstractC27379r.f110036b, c28655q2);
                jM67118d = AbstractC23138n.m67118d(AbstractC27379r.f110037c, c28655q2);
                i15 = i17 & (-4186113);
                f19 = 0;
                jM67118d2 = AbstractC23138n.m67118d(AbstractC27379r.f110035a, c28655q2);
                f24 = 0;
                modifier3 = C2314t.f9131w;
                interfaceC17869a3 = interfaceC17869a1M67130b;
            } else {
                c28655q2.m87138X();
                i15 = i17 & (-4186113);
                modifier3 = modifier;
                f16 = f13;
                interfaceC17869a3 = interfaceC17869a1;
                jM67118d = j7;
                jM67118d2 = j13;
                f19 = f14;
                f24 = f15;
            }
            c28655q2.m87175r();
            c28655q2.m87150e0(-1719831991);
            c28655q2.m87173q(false);
            int i18 = i15 >> 9;
            c28655q = c28655q2;
            AbstractC23077c4.m67048a(modifier3, interfaceC17869a3, jM67118d2, 0L, f19, f24, null, AbstractC37817c.m121344e(-1573998995, c28655q2, new C23179t4(f16, jM67118d, c37816b)), c28655q, (57344 & i18) | 12582912 | (i18 & 458752), 72);
            j14 = jM67118d;
            modifier2 = modifier3;
            interfaceC17869a2 = interfaceC17869a3;
            j15 = jM67118d2;
            f17 = f19;
            f18 = f24;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            f16 = f13;
            interfaceC17869a2 = interfaceC17869a1;
            j14 = j7;
            j15 = j13;
            f17 = f14;
            f18 = f15;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l1.s4
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC23185u4.m67144a(c23197w4, modifier2, f16, interfaceC17869a2, j14, j15, f17, f18, c37816b, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m67145b(InterfaceC3964i0 interfaceC3964i0, C37816b c37816b, C23203x4 c23203x4, Modifier modifier, boolean z4, C37816b c37816b2, Composer composer, int i13) {
        int i14;
        InterfaceC3964i0 interfaceC3964i1;
        C23203x4 c23203x5;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-293753984);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC3964i0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(c23203x4) : c28655q.m87157i(c23203x4) ? 256 : 128;
        }
        int i15 = i14 | 14380032;
        if ((100663296 & i13) == 0) {
            i15 |= c28655q.m87157i(c37816b2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q.m87135U(i15 & 1, (38347923 & i15) != 38347922)) {
            C11421z1 c11421z1M30543e = AbstractC11343d2.m30543e(c23203x4.f91825b, "tooltip transition", c28655q, 48);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                new C21937b(9, interfaceC28601c1);
                objM87133R2 = new C23197w4();
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC3964i1 = interfaceC3964i0;
            c23203x5 = c23203x4;
            AbstractC24899e0.m72994a(interfaceC3964i1, AbstractC37817c.m121344e(-527401546, c28655q, new C15001f(c11421z1M30543e, c37816b, (C23197w4) objM87133R2)), c23203x5, AbstractC37817c.m121344e(-23901870, c28655q, new C2647w2(21, interfaceC28601c1, c37816b2)), c28655q, (i15 & 14) | 100663344 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15));
            modifier = C2314t.f9131w;
            z13 = true;
        } else {
            interfaceC3964i1 = interfaceC3964i0;
            c23203x5 = c23203x4;
            c28655q.m87138X();
            z13 = z4;
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11547l0(interfaceC3964i1, c37816b, c23203x5, modifier2, z13, c37816b2, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23203x4 m67146c(Composer composer) {
        C13776c1 c13776c1 = AbstractC24906i.f97560a;
        boolean zM87155h = ((C28655q) composer).m87155h(false) | ((C28655q) composer).m87153g(c13776c1);
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (zM87155h || objM87133R == C28635l.f115821a) {
            objM87133R = new C23203x4(c13776c1);
            c28655q.m87172p0(objM87133R);
        }
        return (C23203x4) objM87133R;
    }
}
