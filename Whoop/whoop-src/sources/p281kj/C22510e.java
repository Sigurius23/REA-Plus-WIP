package p281kj;

import android.os.Handler;
import io.sentry.RunnableC20277c7;
import p197hj.C17334q;

/* JADX INFO: renamed from: kj.e */
/* JADX INFO: loaded from: classes.dex */
public final class C22510e {

    /* JADX INFO: renamed from: a */
    public C17334q f88222a;

    /* JADX INFO: renamed from: b */
    public int f88223b;

    /* JADX INFO: renamed from: c */
    public long f88224c;

    /* JADX INFO: renamed from: d */
    public float f88225d;

    /* JADX INFO: renamed from: e */
    public float f88226e;

    /* JADX INFO: renamed from: f */
    public Handler f88227f;

    /* JADX INFO: renamed from: g */
    public RunnableC20277c7 f88228g;

    /* JADX INFO: renamed from: a */
    public final void m65011a() {
        Handler handler;
        this.f88223b = 0;
        this.f88224c = 0L;
        this.f88225d = 0.0f;
        this.f88226e = 0.0f;
        RunnableC20277c7 runnableC20277c7 = this.f88228g;
        if (runnableC20277c7 != null && (handler = this.f88227f) != null) {
            handler.removeCallbacks(runnableC20277c7);
        }
        this.f88227f = null;
        this.f88228g = null;
    }
}
