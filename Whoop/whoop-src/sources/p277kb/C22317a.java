package p277kb;

import androidx.room.C1833u0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: kb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C22317a {

    /* JADX INFO: renamed from: a */
    public final C1833u0 f87087a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f87088b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f87089c = new AtomicBoolean(false);

    public C22317a(C1833u0 c1833u0) {
        this.f87087a = c1833u0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m64131a() {
        synchronized (this) {
            if (this.f87089c.get()) {
                return false;
            }
            this.f87088b.incrementAndGet();
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m64132b() {
        synchronized (this) {
            this.f87088b.decrementAndGet();
            if (this.f87088b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }
}
