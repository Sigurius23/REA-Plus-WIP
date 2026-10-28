package p218ic;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import nw0.C27198e;
import p097ds.InterfaceFutureC12319v;
import p329n0.C26057j;
import p457rc.C31230m;
import p457rc.C31231n;
import q83.AbstractC30060g;
import sc.InterfaceC32351a;

/* JADX INFO: renamed from: ic.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18388v {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public AbstractC18388v(Context context, WorkerParameters workerParameters) {
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f7337f;
    }

    public abstract InterfaceFutureC12319v getForegroundInfoAsync();

    public final UUID getId() {
        return this.mWorkerParams.f7332a;
    }

    public final C18358g getInputData() {
        return this.mWorkerParams.f7333b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f7335d.f814z;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f7336e;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f7334c;
    }

    public InterfaceC32351a getTaskExecutor() {
        return this.mWorkerParams.f7339h;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f7335d.f812x;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f7335d.f813y;
    }

    public AbstractC18385t0 getWorkerFactory() {
        return this.mWorkerParams.f7340i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC12319v setForegroundAsync(C18370m c18370m) {
        C31230m c31230m = this.mWorkerParams.f7342k;
        Context applicationContext = getApplicationContext();
        return AbstractC30060g.m92129t(c31230m.f128609a.f133915a, "setForegroundAsync", new C27198e(c31230m, getId(), c18370m, applicationContext, 10));
    }

    public InterfaceFutureC12319v setProgressAsync(C18358g c18358g) {
        C31231n c31231n = this.mWorkerParams.f7341j;
        getApplicationContext();
        return AbstractC30060g.m92129t(c31231n.f128614b.f133915a, "updateProgress", new C26057j(c31231n, getId(), c18358g, 28));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC12319v startWork();

    public final void stop(int i13) {
        if (this.mStopReason.compareAndSet(-256, i13)) {
            onStopped();
        }
    }
}
