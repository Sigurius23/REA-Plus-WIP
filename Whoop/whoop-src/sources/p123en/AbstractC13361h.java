package p123en;

import ed3.C13117a;
import ed3.C13131o;
import io.sentry.internal.debugmeta.C20378c;
import p607x8.C38059n;
import qg3.C30352d;

/* JADX INFO: renamed from: en.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13361h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46696a;

    /* JADX INFO: renamed from: b */
    public long f46697b;

    /* JADX INFO: renamed from: c */
    public long f46698c;

    /* JADX INFO: renamed from: d */
    public long f46699d;

    /* JADX INFO: renamed from: e */
    public int f46700e;

    /* JADX INFO: renamed from: f */
    public int f46701f;

    /* JADX INFO: renamed from: g */
    public long f46702g;

    /* JADX INFO: renamed from: h */
    public boolean f46703h;

    /* JADX INFO: renamed from: i */
    public boolean f46704i;

    /* JADX INFO: renamed from: j */
    public final Object f46705j;

    /* JADX INFO: renamed from: k */
    public Object f46706k;

    /* JADX INFO: renamed from: l */
    public Object f46707l;

    /* JADX INFO: renamed from: m */
    public Object f46708m;

    /* JADX INFO: renamed from: n */
    public Object f46709n;

    public AbstractC13361h(int i13) {
        this.f46696a = i13;
        switch (i13) {
            case 1:
                this.f46705j = new C13131o(2);
                this.f46709n = new C30352d(27, (char) 0);
                break;
            default:
                this.f46705j = new C13131o(1);
                this.f46709n = new C20378c(12, (char) 0);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo37622a(long j7) {
        switch (this.f46696a) {
            case 0:
                this.f46699d = j7;
                break;
            default:
                this.f46699d = j7;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo37613b(C13117a c13117a);

    /* JADX INFO: renamed from: c */
    public abstract long mo37623c(C38059n c38059n);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo37614d(C13117a c13117a, long j7, C20378c c20378c);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo37624e(C38059n c38059n, long j7, C30352d c30352d);

    /* JADX INFO: renamed from: f */
    public void mo37615f(boolean z4) {
        switch (this.f46696a) {
            case 0:
                if (z4) {
                    this.f46709n = new C20378c(12, (char) 0);
                    this.f46698c = 0L;
                    this.f46700e = 0;
                } else {
                    this.f46700e = 1;
                }
                this.f46697b = -1L;
                this.f46699d = 0L;
                break;
            default:
                if (z4) {
                    this.f46709n = new C30352d(27, (char) 0);
                    this.f46698c = 0L;
                    this.f46700e = 0;
                } else {
                    this.f46700e = 1;
                }
                this.f46697b = -1L;
                this.f46699d = 0L;
                break;
        }
    }
}
