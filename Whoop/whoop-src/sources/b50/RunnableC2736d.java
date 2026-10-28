package b50;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import p027b3.AbstractC2351b;

/* JADX INFO: renamed from: b50.d */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2736d implements Runnable {

    /* JADX INFO: renamed from: w */
    public final long f10763w = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: x */
    public long f10764x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC2351b f10765y;

    public RunnableC2736d(AbstractC2351b abstractC2351b) {
        this.f10765y = abstractC2351b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j7 = this.f10764x;
        AbstractC2351b abstractC2351b = this.f10765y;
        if (j7 < 5000) {
            abstractC2351b.mo7247F();
            this.f10764x = SystemClock.elapsedRealtime() - this.f10763w;
            ((Handler) abstractC2351b.f9291b).postDelayed(this, 500L);
        } else {
            new TimeoutException();
            abstractC2351b.mo7248G();
            abstractC2351b.m7254g();
        }
    }
}
