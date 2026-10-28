package b83;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: b83.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2806b extends AtomicReference {
    /* JADX INFO: renamed from: a */
    public final boolean m7991a(Throwable th3) {
        C2807c c2807c = AbstractC2808d.f10999a;
        while (true) {
            Throwable th4 = (Throwable) get();
            if (th4 == AbstractC2808d.f10999a) {
                return false;
            }
            Throwable compositeException = th4 == null ? th3 : new CompositeException(th4, th3);
            while (!compareAndSet(th4, compositeException)) {
                if (get() != th4) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m7992b() {
        C2807c c2807c = AbstractC2808d.f10999a;
        Throwable th3 = (Throwable) get();
        C2807c c2807c2 = AbstractC2808d.f10999a;
        return th3 != c2807c2 ? (Throwable) getAndSet(c2807c2) : th3;
    }
}
