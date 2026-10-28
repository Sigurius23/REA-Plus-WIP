package p218ic;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ic.p */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC18376p implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71536w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AtomicBoolean f71537x;

    public /* synthetic */ RunnableC18376p(AtomicBoolean atomicBoolean, int i13) {
        this.f71536w = i13;
        this.f71537x = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f71536w) {
            case 0:
                this.f71537x.set(true);
                break;
            default:
                this.f71537x.set(true);
                break;
        }
    }
}
