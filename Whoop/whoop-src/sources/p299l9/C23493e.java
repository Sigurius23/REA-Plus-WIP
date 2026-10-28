package p299l9;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import p516u8.AbstractC34609o0;
import p516u8.C34582b;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: l9.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C23493e extends AbstractC23523r {

    /* JADX INFO: renamed from: c */
    public final long f92994c;

    /* JADX INFO: renamed from: d */
    public final long f92995d;

    /* JADX INFO: renamed from: e */
    public final long f92996e;

    /* JADX INFO: renamed from: f */
    public final boolean f92997f;

    public C23493e(AbstractC34609o0 abstractC34609o0, long j7, long j13) throws ClippingMediaSource$IllegalClippingException {
        super(abstractC34609o0);
        if (j13 != Long.MIN_VALUE && j13 < j7) {
            throw new ClippingMediaSource$IllegalClippingException(2, j7, j13);
        }
        boolean z4 = false;
        if (abstractC34609o0.mo8136h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        C34607n0 c34607n0Mo8129m = abstractC34609o0.mo8129m(0, new C34607n0(), 0L);
        long jMax = Math.max(0L, j7);
        if (!c34607n0Mo8129m.f145711k && jMax != 0 && !c34607n0Mo8129m.f145708h) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j13 == Long.MIN_VALUE ? c34607n0Mo8129m.f145713m : Math.max(0L, j13);
        long j14 = c34607n0Mo8129m.f145713m;
        if (j14 != -9223372036854775807L) {
            jMax2 = jMax2 > j14 ? j14 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f92994c = jMax;
        this.f92995d = jMax2;
        this.f92996e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c34607n0Mo8129m.f145709i && (jMax2 == -9223372036854775807L || (j14 != -9223372036854775807L && jMax2 == j14))) {
            z4 = true;
        }
        this.f92997f = z4;
    }

    @Override // p299l9.AbstractC23523r, p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: f */
    public final C34605m0 mo8128f(int i13, C34605m0 c34605m0, boolean z4) {
        this.f93108b.mo8128f(0, c34605m0, z4);
        long j7 = c34605m0.f145695e - this.f92994c;
        long j13 = this.f92996e;
        c34605m0.m109399h(c34605m0.f145691a, c34605m0.f145692b, 0, j13 != -9223372036854775807L ? j13 - j7 : -9223372036854775807L, j7, C34582b.f145636c, false);
        return c34605m0;
    }

    @Override // p299l9.AbstractC23523r, p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: m */
    public final C34607n0 mo8129m(int i13, C34607n0 c34607n0, long j7) {
        this.f93108b.mo8129m(0, c34607n0, 0L);
        long j13 = c34607n0.f145716p;
        long j14 = this.f92994c;
        c34607n0.f145716p = j13 + j14;
        c34607n0.f145713m = this.f92996e;
        c34607n0.f145709i = this.f92997f;
        long j15 = c34607n0.f145712l;
        if (j15 != -9223372036854775807L) {
            long jMax = Math.max(j15, j14);
            c34607n0.f145712l = jMax;
            long j16 = this.f92995d;
            if (j16 != -9223372036854775807L) {
                jMax = Math.min(jMax, j16);
            }
            c34607n0.f145712l = jMax - j14;
        }
        long jM121907U = AbstractC38065t.m121907U(j14);
        long j17 = c34607n0.f145705e;
        if (j17 != -9223372036854775807L) {
            c34607n0.f145705e = j17 + jM121907U;
        }
        long j18 = c34607n0.f145706f;
        if (j18 != -9223372036854775807L) {
            c34607n0.f145706f = j18 + jM121907U;
        }
        return c34607n0;
    }
}
