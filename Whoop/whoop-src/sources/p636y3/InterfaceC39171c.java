package p636y3;

import p670z3.AbstractC40036b;
import p670z3.InterfaceC40035a;
import r80.AbstractC31061c;
import v63.AbstractC35745c;
import vf3.AbstractC35952b;

/* JADX INFO: renamed from: y3.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC39171c {
    /* JADX INFO: renamed from: D0 */
    default long mo722D0(long j7) {
        if (j7 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo743q0 = mo743q0(C39176h.m124787c(j7));
        return (((long) Float.floatToRawIntBits(mo743q0(C39176h.m124786b(j7)))) & 4294967295L) | (Float.floatToRawIntBits(fMo743q0) << 32);
    }

    /* JADX INFO: renamed from: F */
    default int mo724F(float f13) {
        float fMo743q0 = mo743q0(f13);
        if (Float.isInfinite(fMo743q0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo743q0);
    }

    /* JADX INFO: renamed from: K */
    default float mo726K(long j7) {
        if (!C39184p.m124808a(C39183o.m124804b(j7), 4294967296L)) {
            AbstractC39177i.m124790b("Only Sp can convert to Px");
        }
        return mo743q0(mo738l(j7));
    }

    /* JADX INFO: renamed from: e0 */
    default float mo733e0(int i13) {
        return i13 / getDensity();
    }

    /* JADX INFO: renamed from: f0 */
    default float mo734f0(float f13) {
        return f13 / getDensity();
    }

    float getDensity();

    /* JADX INFO: renamed from: h */
    default long mo735h(float f13) {
        float[] fArr = AbstractC40036b.f172746a;
        if (getFontScale() < 1.03f) {
            return AbstractC31061c.m95626b(f13, 4294967296L, this);
        }
        InterfaceC40035a interfaceC40035aM128366a = AbstractC40036b.m128366a(getFontScale());
        return AbstractC35745c.m113248j(interfaceC40035aM128366a != null ? interfaceC40035aM128366a.mo124801a(f13) : f13 / getFontScale(), 4294967296L);
    }

    /* JADX INFO: renamed from: i */
    default long mo736i(long j7) {
        if (j7 != 9205357640488583168L) {
            return AbstractC35952b.m114193a(mo734f0(Float.intBitsToFloat((int) (j7 >> 32))), mo734f0(Float.intBitsToFloat((int) (j7 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: l */
    default float mo738l(long j7) {
        float fM124805c;
        float fMo740m0;
        if (!C39184p.m124808a(C39183o.m124804b(j7), 4294967296L)) {
            AbstractC39177i.m124790b("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC40036b.f172746a;
        if (getFontScale() >= 1.03f) {
            InterfaceC40035a interfaceC40035aM128366a = AbstractC40036b.m128366a(getFontScale());
            fM124805c = C39183o.m124805c(j7);
            if (interfaceC40035aM128366a != null) {
                return interfaceC40035aM128366a.mo124802b(fM124805c);
            }
            fMo740m0 = getFontScale();
        } else {
            fM124805c = C39183o.m124805c(j7);
            fMo740m0 = getFontScale();
        }
        return fMo740m0 * fM124805c;
    }

    /* JADX INFO: renamed from: m0 */
    float getFontScale();

    /* JADX INFO: renamed from: q */
    default long mo742q(float f13) {
        return mo735h(mo734f0(f13));
    }

    /* JADX INFO: renamed from: q0 */
    default float mo743q0(float f13) {
        return getDensity() * f13;
    }

    /* JADX INFO: renamed from: w0 */
    default int mo86824w0(long j7) {
        return Math.round(mo726K(j7));
    }
}
