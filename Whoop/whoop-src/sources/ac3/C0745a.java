package ac3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ac3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0745a {
    private volatile int _value = 0;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C0745a.class, "_value");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1812a() {
        return this._value != 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m1813b() {
        this._value = 1;
    }

    public final String toString() {
        return String.valueOf(m1812a());
    }
}
