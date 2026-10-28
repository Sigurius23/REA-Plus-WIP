package p561vt;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p249jc.C21567b;
import tt.C34155i;

/* JADX INFO: renamed from: vt.d */
/* JADX INFO: loaded from: classes.dex */
public final class C36483d {

    /* JADX INFO: renamed from: d */
    public static final long f155826d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e */
    public static final long f155827e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final C34155i f155828a;

    /* JADX INFO: renamed from: b */
    public long f155829b;

    /* JADX INFO: renamed from: c */
    public int f155830c;

    public C36483d() {
        if (C21567b.f82709x == null) {
            Pattern pattern = C34155i.f143156c;
            C21567b.f82709x = new C21567b(28);
        }
        C21567b c21567b = C21567b.f82709x;
        if (C34155i.f143157d == null) {
            C34155i.f143157d = new C34155i(c21567b);
        }
        this.f155828a = C34155i.f143157d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX INFO: renamed from: a */
    public final synchronized boolean m116914a() {
        boolean z4;
        if (this.f155830c != 0) {
            this.f155828a.f143158a.getClass();
            if (System.currentTimeMillis() > this.f155829b) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = true;
        }
        return z4;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m116915b(int i13) {
        long jMin;
        if ((i13 >= 200 && i13 < 300) || i13 == 401 || i13 == 404) {
            synchronized (this) {
                this.f155830c = 0;
            }
            return;
        }
        this.f155830c++;
        synchronized (this) {
            try {
                if (i13 == 429 || (i13 >= 500 && i13 < 600)) {
                    double dPow = Math.pow(2.0d, this.f155830c);
                    this.f155828a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f155827e);
                } else {
                    jMin = f155826d;
                }
                this.f155828a.f143158a.getClass();
                this.f155829b = System.currentTimeMillis() + jMin;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return;
        throw th;
    }
}
