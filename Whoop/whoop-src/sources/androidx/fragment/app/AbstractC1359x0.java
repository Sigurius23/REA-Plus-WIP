package androidx.fragment.app;

import android.os.Handler;

/* JADX INFO: renamed from: androidx.fragment.app.x0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1359x0 extends AbstractC1350u0 {

    /* JADX INFO: renamed from: w */
    public final AbstractActivityC1340r0 f5826w;

    /* JADX INFO: renamed from: x */
    public final AbstractActivityC1340r0 f5827x;

    /* JADX INFO: renamed from: y */
    public final Handler f5828y;

    /* JADX INFO: renamed from: z */
    public final C1333p1 f5829z;

    public AbstractC1359x0(AbstractActivityC1340r0 abstractActivityC1340r0) {
        Handler handler = new Handler();
        this.f5826w = abstractActivityC1340r0;
        this.f5827x = abstractActivityC1340r0;
        this.f5828y = handler;
        this.f5829z = new C1333p1();
    }
}
