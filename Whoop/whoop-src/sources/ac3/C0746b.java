package ac3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o23.InterfaceC27474d;

/* JADX INFO: renamed from: ac3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C0746b {
    private volatile Object value;

    static {
        AtomicReferenceFieldUpdater.newUpdater(C0746b.class, Object.class, "value");
    }

    public C0746b(Object obj) {
        this.value = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1814a() {
        return this.value;
    }

    /* JADX INFO: renamed from: b */
    public final void m1815b(InterfaceC27474d interfaceC27474d) {
        this.value = interfaceC27474d;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
