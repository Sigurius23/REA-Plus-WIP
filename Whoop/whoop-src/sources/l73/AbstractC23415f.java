package l73;

import java.util.concurrent.TimeUnit;
import n73.InterfaceC26443b;

/* JADX INFO: renamed from: l73.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23415f implements InterfaceC26443b {
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC26443b mo67906a(Runnable runnable, long j7, TimeUnit timeUnit);

    /* JADX INFO: renamed from: b */
    public void mo67907b(Runnable runnable) {
        mo67906a(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}
