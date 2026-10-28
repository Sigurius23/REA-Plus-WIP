package bc3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: bc3.w */
/* JADX INFO: loaded from: classes5.dex */
public class C3067w {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12103b = AtomicIntegerFieldUpdater.newUpdater(C3067w.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f12104a;

    public C3067w(Throwable th3, boolean z4) {
        this.f12104a = th3;
        this._handled$volatile = z4 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f12104a + ']';
    }
}
