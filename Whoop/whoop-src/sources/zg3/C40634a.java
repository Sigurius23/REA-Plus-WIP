package zg3;

import android.os.Looper;
import eh3.C13206j;
import java.util.concurrent.atomic.AtomicReference;
import yg3.C39532a;
import yg3.C39533b;

/* JADX INFO: renamed from: zg3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40634a {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f175383b = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final C13206j f175384a;

    public C40634a() {
        AtomicReference atomicReference = C39532a.f170082b.f170083a;
        if (atomicReference.get() == null) {
            while (!atomicReference.compareAndSet(null, C39533b.f170084a) && atomicReference.get() == null) {
            }
        }
        ((C39533b) atomicReference.get()).getClass();
        this.f175384a = new C13206j(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static C13206j m131874a() {
        C40634a c40634a;
        loop0: while (true) {
            AtomicReference atomicReference = f175383b;
            c40634a = (C40634a) atomicReference.get();
            if (c40634a != null) {
                break;
            }
            c40634a = new C40634a();
            do {
                if (atomicReference.compareAndSet(null, c40634a)) {
                    break loop0;
                }
            } while (atomicReference.get() == null);
        }
        return c40634a.f175384a;
    }
}
