package io.ktor.utils.p228io.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C20005o {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f75067b = AtomicIntegerFieldUpdater.newUpdater(C20005o.class, "_availableForRead$internal");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f75068c = AtomicIntegerFieldUpdater.newUpdater(C20005o.class, "_availableForWrite$internal");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f75069d = AtomicIntegerFieldUpdater.newUpdater(C20005o.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* JADX INFO: renamed from: a */
    public final int f75070a;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public C20005o(int i13) {
        this.f75070a = i13;
        this._availableForWrite$internal = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m55805a(int i13) {
        int i14;
        int i15;
        do {
            i14 = this._availableForWrite$internal;
            i15 = i14 + i13;
            if (i15 > this.f75070a) {
                StringBuilder sbM30465s = AbstractC11266d.m30465s(i14, i13, "Completed read overflow: ", " + ", " = ");
                sbM30465s.append(i15);
                sbM30465s.append(" > ");
                sbM30465s.append(this.f75070a);
                throw new IllegalArgumentException(sbM30465s.toString());
            }
        } while (!f75068c.compareAndSet(this, i14, i15));
    }

    /* JADX INFO: renamed from: b */
    public final void m55806b(int i13) {
        int i14;
        int i15;
        do {
            i14 = this._pendingToFlush;
            i15 = i14 + i13;
            if (i15 > this.f75070a) {
                StringBuilder sbM30465s = AbstractC11266d.m30465s(i14, i13, "Complete write overflow: ", " + ", " > ");
                sbM30465s.append(this.f75070a);
                throw new IllegalArgumentException(sbM30465s.toString());
            }
        } while (!f75069d.compareAndSet(this, i14, i15));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m55807c() {
        int andSet = f75069d.getAndSet(this, 0);
        if (andSet == 0) {
            return this._availableForRead$internal > 0;
        }
        return f75067b.addAndGet(this, andSet) > 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m55808d() {
        return this._availableForWrite$internal == 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m55809e() {
        this._availableForRead$internal = this.f75070a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m55810f() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f75070a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m55811g() {
        int i13;
        do {
            i13 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i13 != this.f75070a) {
                return false;
            }
        } while (!f75068c.compareAndSet(this, i13, 0));
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final int m55812h(int i13) {
        int i14;
        int iMin;
        do {
            i14 = this._availableForWrite$internal;
            iMin = Math.min(i13, i14);
            if (iMin == 0) {
                return 0;
            }
        } while (!f75068c.compareAndSet(this, i14, i14 - iMin));
        return Math.min(i13, i14);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RingBufferCapacity[read: ");
        sb4.append(this._availableForRead$internal);
        sb4.append(", write: ");
        sb4.append(this._availableForWrite$internal);
        sb4.append(", flush: ");
        sb4.append(this._pendingToFlush);
        sb4.append(", capacity: ");
        return AbstractC11895b.m31999r(sb4, this.f75070a, ']');
    }
}
