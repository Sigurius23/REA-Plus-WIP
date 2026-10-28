package p589wn;

import p556vm.C36136c;

/* JADX INFO: renamed from: wn.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37400h implements Comparable {

    /* JADX INFO: renamed from: E */
    public final long f160012E;

    /* JADX INFO: renamed from: F */
    public final C36136c f160013F;

    /* JADX INFO: renamed from: G */
    public final String f160014G;

    /* JADX INFO: renamed from: H */
    public final String f160015H;

    /* JADX INFO: renamed from: I */
    public final long f160016I;

    /* JADX INFO: renamed from: J */
    public final long f160017J;

    /* JADX INFO: renamed from: K */
    public final boolean f160018K;

    /* JADX INFO: renamed from: w */
    public final String f160019w;

    /* JADX INFO: renamed from: x */
    public final C37399g f160020x;

    /* JADX INFO: renamed from: y */
    public final long f160021y;

    /* JADX INFO: renamed from: z */
    public final int f160022z;

    public AbstractC37400h(String str, C37399g c37399g, long j7, int i13, long j13, C36136c c36136c, String str2, String str3, long j14, long j15, boolean z4) {
        this.f160019w = str;
        this.f160020x = c37399g;
        this.f160021y = j7;
        this.f160022z = i13;
        this.f160012E = j13;
        this.f160013F = c36136c;
        this.f160014G = str2;
        this.f160015H = str3;
        this.f160016I = j14;
        this.f160017J = j15;
        this.f160018K = z4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l7 = (Long) obj;
        long jLongValue = l7.longValue();
        long j7 = this.f160012E;
        if (j7 > jLongValue) {
            return 1;
        }
        return j7 < l7.longValue() ? -1 : 0;
    }
}
