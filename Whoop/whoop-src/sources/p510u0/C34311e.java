package p510u0;

import p000.AbstractC11266d;
import p105e1.C12517d;
import p294l3.C23254g;
import p294l3.C23275q0;
import p294l3.C23277r0;
import p294l3.C23286w;
import p636y3.C39183o;
import p636y3.C39184p;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: u0.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C34311e implements InterfaceC34372z0 {

    /* JADX INFO: renamed from: a */
    public final long f144073a;

    /* JADX INFO: renamed from: b */
    public final long f144074b;

    /* JADX INFO: renamed from: c */
    public final long f144075c;

    public C34311e(long j7, long j13, long j14) {
        this.f144073a = j7;
        this.f144074b = j13;
        this.f144075c = j14;
        long j15 = C39183o.f168428c;
        if (C39183o.m124803a(j7, j15)) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (C39183o.m124803a(j13, j15)) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (C39183o.m124803a(j14, j15)) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (C39184p.m124808a(C39183o.m124804b(j7), C39183o.m124804b(j13))) {
            AbstractC35745c.m113243b(j7, j13);
            if (Float.compare(C39183o.m124805c(j7), C39183o.m124805c(j13)) > 0) {
                this.f144073a = j13;
            }
        }
        if (C39184p.m124808a(C39183o.m124804b(j14), 4294967296L)) {
            long jM113248j = AbstractC35745c.m113248j(1.0E-4f, 4294967296L);
            AbstractC35745c.m113243b(j14, jM113248j);
            if (Float.compare(C39183o.m124805c(j14), C39183o.m124805c(jM113248j)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (C39183o.m124805c(this.f144073a) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (C39183o.m124805c(j13) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m108614a(C23277r0 c23277r0) {
        C23286w c23286w = c23277r0.f92228b;
        long j7 = c23277r0.f92229c;
        C23275q0 c23275q0 = c23277r0.f92227a;
        int i13 = c23275q0.f92221f;
        if (i13 == 1 || i13 == 3) {
            return ((float) ((int) (j7 >> 32))) < c23286w.f92261d || c23277r0.m67335d();
        }
        if (i13 != 4 && i13 != 5 && i13 != 2) {
            throw new IllegalArgumentException("TextOverflow type " + ((Object) AbstractC35745c.m113250m(c23275q0.f92221f)) + " is not supported.");
        }
        int i14 = c23286w.f92263f;
        if (i14 != 0) {
            if (i14 == 1) {
                return c23277r0.m67343l(0);
            }
            if (i13 == 4 || i13 == 5) {
                return ((float) ((int) (j7 >> 32))) < c23286w.f92261d || c23277r0.m67335d();
            }
            if (i13 == 2) {
                return c23277r0.m67343l(i14 - 1);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final long m108615b(C12517d c12517d, long j7, C23254g c23254g) {
        float fMo726K = c12517d.mo726K(this.f144075c);
        float fMo726K2 = c12517d.mo726K(this.f144073a);
        float fMo726K3 = c12517d.mo726K(this.f144074b);
        float f13 = 2;
        float f14 = (fMo726K2 + fMo726K3) / f13;
        float f15 = fMo726K2;
        float f16 = fMo726K3;
        while (f16 - f15 >= fMo726K) {
            if (m108614a(c12517d.m35166b(j7, c12517d.mo742q(f14)))) {
                f16 = f14;
            } else {
                f15 = f14;
            }
            f14 = (f15 + f16) / f13;
        }
        float fFloor = (((float) Math.floor((f15 - fMo726K2) / fMo726K)) * fMo726K) + fMo726K2;
        float f17 = fMo726K + fFloor;
        if (f17 <= fMo726K3 && !m108614a(c12517d.m35166b(j7, c12517d.mo742q(f17)))) {
            fFloor = f17;
        }
        return c12517d.mo742q(fFloor);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C34311e)) {
            return false;
        }
        C34311e c34311e = (C34311e) obj;
        return C39183o.m124803a(c34311e.f144073a, this.f144073a) && C39183o.m124803a(c34311e.f144074b, this.f144074b) && C39183o.m124803a(c34311e.f144075c, this.f144075c);
    }

    public final int hashCode() {
        C39184p[] c39184pArr = C39183o.f168427b;
        return Long.hashCode(this.f144075c) + AbstractC11266d.m30451e(Long.hashCode(this.f144073a) * 31, this.f144074b, 31);
    }
}
