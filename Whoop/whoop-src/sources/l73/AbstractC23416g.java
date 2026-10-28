package l73;

import java.util.concurrent.TimeUnit;
import n73.InterfaceC26443b;
import u73.RunnableC34579a;

/* JADX INFO: renamed from: l73.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23416g {
    static {
        Boolean.getBoolean("rx2.scheduler.use-nanotime");
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC23415f mo67908a();

    /* JADX INFO: renamed from: b */
    public InterfaceC26443b mo67909b(RunnableC34579a runnableC34579a) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC23415f abstractC23415fMo67908a = mo67908a();
        RunnableC23414e runnableC23414e = new RunnableC23414e(runnableC34579a, abstractC23415fMo67908a);
        abstractC23415fMo67908a.mo67906a(runnableC23414e, 5L, timeUnit);
        return runnableC23414e;
    }
}
