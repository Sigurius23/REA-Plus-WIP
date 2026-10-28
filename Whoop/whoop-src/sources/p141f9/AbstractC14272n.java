package p141f9;

import java.math.RoundingMode;
import java.util.List;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: f9.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14272n extends AbstractC14277s {

    /* JADX INFO: renamed from: d */
    public final long f52115d;

    /* JADX INFO: renamed from: e */
    public final long f52116e;

    /* JADX INFO: renamed from: f */
    public final List f52117f;

    /* JADX INFO: renamed from: g */
    public final long f52118g;

    /* JADX INFO: renamed from: h */
    public final long f52119h;

    /* JADX INFO: renamed from: i */
    public final long f52120i;

    public AbstractC14272n(C14268j c14268j, long j7, long j13, long j14, long j15, List list, long j16, long j17, long j18) {
        super(c14268j, j7, j13);
        this.f52115d = j14;
        this.f52116e = j15;
        this.f52117f = list;
        this.f52120i = j16;
        this.f52118g = j17;
        this.f52119h = j18;
    }

    /* JADX INFO: renamed from: b */
    public final long m40755b(long j7, long j13) {
        long jMo40757d = mo40757d(j7);
        return jMo40757d != -1 ? jMo40757d : (int) (m40759f((j13 - this.f52119h) + this.f52120i, j7) - m40756c(j7, j13));
    }

    /* JADX INFO: renamed from: c */
    public final long m40756c(long j7, long j13) {
        long jMo40757d = mo40757d(j7);
        long j14 = this.f52115d;
        if (jMo40757d == -1) {
            long j15 = this.f52118g;
            if (j15 != -9223372036854775807L) {
                return Math.max(j14, m40759f((j13 - this.f52119h) - j15, j7));
            }
        }
        return j14;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo40757d(long j7);

    /* JADX INFO: renamed from: e */
    public final long m40758e(long j7, long j13) {
        long j14 = this.f52130b;
        long j15 = this.f52115d;
        List list = this.f52117f;
        if (list != null) {
            return (((C14275q) list.get((int) (j7 - j15))).f52126b * 1000000) / j14;
        }
        long jMo40757d = mo40757d(j13);
        return (jMo40757d == -1 || j7 != (j15 + jMo40757d) - 1) ? (this.f52116e * 1000000) / j14 : j13 - m40760g(j7);
    }

    /* JADX INFO: renamed from: f */
    public final long m40759f(long j7, long j13) {
        long jMo40757d = mo40757d(j13);
        long j14 = this.f52115d;
        if (jMo40757d != 0) {
            if (this.f52117f != null) {
                long j15 = (jMo40757d + j14) - 1;
                long j16 = j14;
                while (j16 <= j15) {
                    long j17 = ((j15 - j16) / 2) + j16;
                    long jM40760g = m40760g(j17);
                    if (jM40760g < j7) {
                        j16 = j17 + 1;
                    } else {
                        if (jM40760g <= j7) {
                            return j17;
                        }
                        j15 = j17 - 1;
                    }
                }
                return j16 == j14 ? j16 : j15;
            }
            long j18 = (j7 / ((this.f52116e * 1000000) / this.f52130b)) + j14;
            if (j18 >= j14) {
                return jMo40757d == -1 ? j18 : Math.min(j18, (j14 + jMo40757d) - 1);
            }
        }
        return j14;
    }

    /* JADX INFO: renamed from: g */
    public final long m40760g(long j7) {
        long j13 = this.f52115d;
        List list = this.f52117f;
        long j14 = list != null ? ((C14275q) list.get((int) (j7 - j13))).f52125a - this.f52131c : (j7 - j13) * this.f52116e;
        int i13 = AbstractC38065t.f163031a;
        return AbstractC38065t.m121903Q(j14, 1000000L, this.f52130b, RoundingMode.DOWN);
    }

    /* JADX INFO: renamed from: h */
    public abstract C14268j mo40761h(C14269k c14269k, long j7);

    /* JADX INFO: renamed from: i */
    public boolean mo40762i() {
        return this.f52117f != null;
    }
}
