package p284ko;

import android.os.SystemClock;

/* JADX INFO: renamed from: ko.p */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C22632p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C22633q f89033a;

    /* JADX INFO: renamed from: a */
    public final void m65568a(int i13) {
        C22633q c22633q = this.f89033a;
        synchronized (c22633q) {
            int i14 = c22633q.f89049i;
            if (i14 == 0 || c22633q.f89045e) {
                if (i14 == i13) {
                    return;
                }
                c22633q.f89049i = i13;
                if (i13 != 1 && i13 != 0 && i13 != 8) {
                    c22633q.f89052l = c22633q.m65569a(i13);
                    c22633q.f89044d.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c22633q.m65570b(c22633q.f89046f > 0 ? (int) (jElapsedRealtime - c22633q.f89047g) : 0, c22633q.f89048h, c22633q.f89052l);
                    c22633q.f89047g = jElapsedRealtime;
                    c22633q.f89048h = 0L;
                    c22633q.f89051k = 0L;
                    c22633q.f89050j = 0L;
                    C22621h0 c22621h0 = c22633q.f89043c;
                    c22621h0.f88990b.clear();
                    c22621h0.f88992d = -1;
                    c22621h0.f88993e = 0;
                    c22621h0.f88994f = 0;
                }
            }
        }
    }
}
