package p635y2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gb.C15657r;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0222l0;
import p005a3.InterfaceC0221l;
import p02.C28589a;
import p026b2.C2314t;
import p043c4.C3951c;
import p181h2.C16618c;
import p342nj.C26742g;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28647o;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y2.q1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39125q1 {

    /* JADX INFO: renamed from: a */
    public static final C39077b1 f168266a = new C39077b1(7);

    /* JADX INFO: renamed from: a */
    public static final void m124655a(Modifier modifier, C37816b c37816b, InterfaceC39127r0 interfaceC39127r0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1663319424);
        int i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13 | (c28655q.m87153g(interfaceC39127r0) ? 256 : 128);
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int iHashCode = Integer.hashCode(Long.hashCode(c28655q.f115904T));
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C0213j c0213j = C0213j.f711y;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            InterfaceC0221l.f734a.getClass();
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            if (c28655q.f115903S) {
                c28655q.m87143b(C23454a0.f92919a, new C28589a(3));
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC18489d0.m53384y(6, c37816b, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15657r(modifier, c37816b, interfaceC39127r0, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m124656b(Modifier modifier, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1298353104);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C39137u1(C39077b1.f168132x);
                c28655q.m87172p0(objM87133R);
            }
            m124657c((C39137u1) objM87133R, modifier, interfaceC4351m, c28655q, (i15 << 3) & MessageListItemViewType.GIPHY);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26742g(modifier2, interfaceC4351m, i13, i14, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m124657c(C39137u1 c39137u1, Modifier modifier, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-511989831);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c39137u1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int iHashCode = Long.hashCode(c28655q.f115904T);
            C28647o c28647oM87237E = AbstractC28683x.m87237E(c28655q);
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C0213j c0213j = C0213j.f711y;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c39137u1.f168284c, c39137u1);
            AbstractC28683x.m87239G(c28655q, c39137u1.f168285d, c28647oM87237E);
            AbstractC28683x.m87239G(c28655q, c39137u1.f168286e, interfaceC4351m);
            InterfaceC0221l.f734a.getClass();
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            c28655q.m87173q(true);
            if (c28655q.m87121F()) {
                c28655q.m87150e0(-1259216055);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1259274676);
                boolean zM87157i = c28655q.m87157i(c39137u1);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0222l0(c39137u1, 22);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3951c(c39137u1, modifier, interfaceC4351m, i13, 9);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m124658d(long j7, long j13) {
        return Math.min(Float.intBitsToFloat((int) (j13 >> 32)) / Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)) / Float.intBitsToFloat((int) (j7 & 4294967295L)));
    }

    /* JADX INFO: renamed from: e */
    public static final C16618c m124659e(InterfaceC39147y interfaceC39147y) {
        InterfaceC39147y interfaceC39147yMo3517V = interfaceC39147y.mo3517V();
        return interfaceC39147yMo3517V != null ? interfaceC39147yMo3517V.mo3547r(interfaceC39147y, true) : new C16618c(0.0f, 0.0f, (int) (interfaceC39147y.mo3541n() >> 32), (int) (interfaceC39147y.mo3541n() & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static final C16618c m124660f(InterfaceC39147y interfaceC39147y) {
        InterfaceC39147y interfaceC39147yM124662h = m124662h(interfaceC39147y);
        float fMo3541n = (int) (interfaceC39147yM124662h.mo3541n() >> 32);
        float fMo3541n2 = (int) (interfaceC39147yM124662h.mo3541n() & 4294967295L);
        C16618c c16618cMo3547r = interfaceC39147yM124662h.mo3547r(interfaceC39147y, true);
        float f13 = c16618cMo3547r.f63939a;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > fMo3541n) {
            f13 = fMo3541n;
        }
        float f14 = c16618cMo3547r.f63940b;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > fMo3541n2) {
            f14 = fMo3541n2;
        }
        float f15 = c16618cMo3547r.f63941c;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f15 <= fMo3541n) {
            fMo3541n = f15;
        }
        float f16 = c16618cMo3547r.f63942d;
        float f17 = f16 >= 0.0f ? f16 : 0.0f;
        if (f17 <= fMo3541n2) {
            fMo3541n2 = f17;
        }
        if (f13 == fMo3541n || f14 == fMo3541n2) {
            return C16618c.f63938e;
        }
        long jMo3510E = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
        long jMo3510E2 = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo3541n)) << 32));
        long jMo3510E3 = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(fMo3541n)) << 32) | (((long) Float.floatToRawIntBits(fMo3541n2)) & 4294967295L));
        long jMo3510E4 = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(fMo3541n2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3510E >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo3510E2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo3510E4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo3510E3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo3510E & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo3510E2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo3510E4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo3510E3 & 4294967295L));
        return new C16618c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m124661g(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC39147y m124662h(InterfaceC39147y interfaceC39147y) {
        InterfaceC39147y interfaceC39147y2;
        InterfaceC39147y interfaceC39147yMo3517V = interfaceC39147y.mo3517V();
        while (true) {
            InterfaceC39147y interfaceC39147y3 = interfaceC39147yMo3517V;
            interfaceC39147y2 = interfaceC39147y;
            interfaceC39147y = interfaceC39147y3;
            if (interfaceC39147y == null) {
                break;
            }
            interfaceC39147yMo3517V = interfaceC39147y.mo3517V();
        }
        NodeCoordinator nodeCoordinator = interfaceC39147y2 instanceof NodeCoordinator ? (NodeCoordinator) interfaceC39147y2 : null;
        if (nodeCoordinator == null) {
            return interfaceC39147y2;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f4860Q;
        while (true) {
            NodeCoordinator nodeCoordinator3 = nodeCoordinator2;
            NodeCoordinator nodeCoordinator4 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator3;
            if (nodeCoordinator == null) {
                return nodeCoordinator4;
            }
            nodeCoordinator2 = nodeCoordinator.f4860Q;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final long m124663i(long j7, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) * Float.intBitsToFloat((int) (j7 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 & 4294967295L)) * Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
