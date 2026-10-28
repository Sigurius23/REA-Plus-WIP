package y73;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: y73.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C39290b {

    /* JADX INFO: renamed from: a */
    public final int f169052a;

    /* JADX INFO: renamed from: b */
    public final C39291c[] f169053b;

    /* JADX INFO: renamed from: c */
    public long f169054c;

    public C39290b(int i13, ThreadFactory threadFactory) {
        this.f169052a = i13;
        this.f169053b = new C39291c[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            this.f169053b[i14] = new C39291c(threadFactory);
        }
    }
}
