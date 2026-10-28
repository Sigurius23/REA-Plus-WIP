package eh3;

import gh3.ThreadFactoryC15864i;

/* JADX INFO: renamed from: eh3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C13203g {

    /* JADX INFO: renamed from: a */
    public final int f45762a;

    /* JADX INFO: renamed from: b */
    public final C13204h[] f45763b;

    /* JADX INFO: renamed from: c */
    public long f45764c;

    public C13203g(ThreadFactoryC15864i threadFactoryC15864i, int i13) {
        this.f45762a = i13;
        this.f45763b = new C13204h[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            this.f45763b[i14] = new C13204h(threadFactoryC15864i);
        }
    }
}
