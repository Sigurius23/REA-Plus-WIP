package p218ic;

import android.content.Context;
import androidx.work.WorkerParameters;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic.t0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18385t0 {
    /* JADX INFO: renamed from: a */
    public final AbstractC18388v m52884a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(workerClassName, "workerClassName");
        AbstractC22676k.m65750j(workerParameters, "workerParameters");
        try {
            Class<? extends U> clsAsSubclass = Class.forName(workerClassName).asSubclass(AbstractC18388v.class);
            AbstractC22676k.m65747g(clsAsSubclass);
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                AbstractC22676k.m65747g(objNewInstance);
                AbstractC18388v abstractC18388v = (AbstractC18388v) objNewInstance;
                if (!abstractC18388v.isUsed()) {
                    return abstractC18388v;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th3) {
                C18389w.m52886d().m52890c(AbstractC18387u0.f71553a, "Could not instantiate ".concat(workerClassName), th3);
                throw th3;
            }
        } catch (Throwable th4) {
            C18389w.m52886d().m52890c(AbstractC18387u0.f71553a, "Invalid class: ".concat(workerClassName), th4);
            throw th4;
        }
    }
}
