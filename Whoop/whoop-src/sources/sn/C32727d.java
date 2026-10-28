package sn;

import java.io.IOException;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31558o1;
import p465rm.C31552m1;
import p465rm.C31555n1;
import tn.C33956b;

/* JADX INFO: renamed from: sn.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32727d extends AbstractC32741k {

    /* JADX INFO: renamed from: E */
    public final long f136047E;

    /* JADX INFO: renamed from: F */
    public final boolean f136048F;

    /* JADX INFO: renamed from: y */
    public final long f136049y;

    /* JADX INFO: renamed from: z */
    public final long f136050z;

    public C32727d(AbstractC31558o1 abstractC31558o1, long j7, long j13) throws IOException {
        super(abstractC31558o1);
        boolean z4 = false;
        z4 = false;
        z4 = false;
        final int i13 = 1;
        if (abstractC31558o1.mo97133h() != 1) {
            final int i14 = z4 ? 1 : 0;
            throw new IOException(i14) { // from class: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    String str = i14 != 0 ? i14 != 1 ? i14 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
                    super(str.length() != 0 ? "Illegal clipping: ".concat(str) : new String("Illegal clipping: "));
                }
            };
        }
        C31555n1 c31555n1Mo97136m = abstractC31558o1.mo97136m(0, new C31555n1(), 0L);
        long jMax = Math.max(0L, j7);
        if (!c31555n1Mo97136m.f130316L && jMax != 0 && !c31555n1Mo97136m.f130312H) {
            throw new IOException(i13) { // from class: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    String str = i13 != 0 ? i13 != 1 ? i13 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
                    super(str.length() != 0 ? "Illegal clipping: ".concat(str) : new String("Illegal clipping: "));
                }
            };
        }
        long jMax2 = j13 == Long.MIN_VALUE ? c31555n1Mo97136m.f130318N : Math.max(0L, j13);
        long j14 = c31555n1Mo97136m.f130318N;
        if (j14 != -9223372036854775807L) {
            jMax2 = jMax2 > j14 ? j14 : jMax2;
            if (jMax > jMax2) {
                final int i15 = 2;
                throw new IOException(i15) { // from class: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        String str = i15 != 0 ? i15 != 1 ? i15 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
                        super(str.length() != 0 ? "Illegal clipping: ".concat(str) : new String("Illegal clipping: "));
                    }
                };
            }
        }
        this.f136049y = jMax;
        this.f136050z = jMax2;
        this.f136047E = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (c31555n1Mo97136m.f130313I && (jMax2 == -9223372036854775807L || (j14 != -9223372036854775807L && jMax2 == j14))) {
            z4 = true;
        }
        this.f136048F = z4;
    }

    @Override // sn.AbstractC32741k, p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: f */
    public final C31552m1 mo97131f(int i13, C31552m1 c31552m1, boolean z4) {
        this.f136120x.mo97131f(0, c31552m1, z4);
        long j7 = c31552m1.f130281E - this.f136049y;
        long j13 = this.f136047E;
        c31552m1.m97157h(c31552m1.f130284w, c31552m1.f130285x, 0, j13 != -9223372036854775807L ? j13 - j7 : -9223372036854775807L, j7, C33956b.f142378F, false);
        return c31552m1;
    }

    @Override // sn.AbstractC32741k, p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: m */
    public final C31555n1 mo97136m(int i13, C31555n1 c31555n1, long j7) {
        this.f136120x.mo97136m(0, c31555n1, 0L);
        long j13 = c31555n1.f130321Q;
        long j14 = this.f136049y;
        c31555n1.f130321Q = j13 + j14;
        c31555n1.f130318N = this.f136047E;
        c31555n1.f130313I = this.f136048F;
        long j15 = c31555n1.f130317M;
        if (j15 != -9223372036854775807L) {
            long jMax = Math.max(j15, j14);
            c31555n1.f130317M = jMax;
            long j16 = this.f136050z;
            if (j16 != -9223372036854775807L) {
                jMax = Math.min(jMax, j16);
            }
            c31555n1.f130317M = jMax - j14;
        }
        long jM71669G = AbstractC24567y.m71669G(j14);
        long j17 = c31555n1.f130309E;
        if (j17 != -9223372036854775807L) {
            c31555n1.f130309E = j17 + jM71669G;
        }
        long j18 = c31555n1.f130310F;
        if (j18 != -9223372036854775807L) {
            c31555n1.f130310F = j18 + jM71669G;
        }
        return c31555n1;
    }
}
