package to;

import android.os.Looper;
import p020ap.ExecutorC1878a;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: to.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C33981k {

    /* JADX INFO: renamed from: a */
    public final ExecutorC1878a f142451a;

    /* JADX INFO: renamed from: b */
    public volatile C33979j f142452b;

    public C33981k(Looper looper, Object obj, String str) {
        this.f142451a = new ExecutorC1878a(looper);
        AbstractC35135w.m111095g(obj, "Listener must not be null");
        AbstractC35135w.m111092d(str);
        this.f142452b = new C33979j(obj, str);
    }

    /* JADX INFO: renamed from: a */
    public final C33979j m107450a() {
        return this.f142452b;
    }
}
