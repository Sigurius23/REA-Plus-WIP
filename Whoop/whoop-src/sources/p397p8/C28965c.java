package p397p8;

import android.util.Log;
import io.seon.androidsdk.service.CallableC20673j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: p8.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C28965c extends FutureTask {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ RunnableC28963a f117138w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28965c(RunnableC28963a runnableC28963a, CallableC20673j callableC20673j) {
        super(callableC20673j);
        this.f117138w = runnableC28963a;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC28963a runnableC28963a = this.f117138w;
        AtomicBoolean atomicBoolean = runnableC28963a.f117130E;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            runnableC28963a.m87967a(obj);
        } catch (InterruptedException e5) {
            Log.w("AsyncTask", e5);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            runnableC28963a.m87967a(null);
        } catch (ExecutionException e13) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e13.getCause());
        } catch (Throwable th3) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th3);
        }
    }
}
