package kc3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jh3.AbstractC21702c;

/* JADX INFO: renamed from: kc3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C22373m {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f87331b = AtomicReferenceFieldUpdater.newUpdater(C22373m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f87332c = AtomicIntegerFieldUpdater.newUpdater(C22373m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f87333d = AtomicIntegerFieldUpdater.newUpdater(C22373m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f87334e = AtomicIntegerFieldUpdater.newUpdater(C22373m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f87335a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC22369i m64291a(AbstractRunnableC22369i abstractRunnableC22369i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f87332c;
        if (atomicIntegerFieldUpdater.get(this) - f87333d.get(this) == 127) {
            return abstractRunnableC22369i;
        }
        if (abstractRunnableC22369i.f87322x) {
            f87334e.incrementAndGet(this);
        }
        int i13 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f87335a;
            if (atomicReferenceArray.get(i13) == null) {
                atomicReferenceArray.lazySet(i13, abstractRunnableC22369i);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC22369i m64292b() {
        AbstractRunnableC22369i abstractRunnableC22369i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f87333d;
            int i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 - f87332c.get(this) == 0) {
                return null;
            }
            int i14 = i13 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i13, i13 + 1) && (abstractRunnableC22369i = (AbstractRunnableC22369i) this.f87335a.getAndSet(i14, null)) != null) {
                if (abstractRunnableC22369i.f87322x) {
                    f87334e.decrementAndGet(this);
                }
                return abstractRunnableC22369i;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractRunnableC22369i m64293c(int i13, boolean z4) {
        int i14 = i13 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f87335a;
        AbstractRunnableC22369i abstractRunnableC22369i = (AbstractRunnableC22369i) atomicReferenceArray.get(i14);
        if (abstractRunnableC22369i == null || abstractRunnableC22369i.f87322x != z4 || !AbstractC21702c.m61153x(atomicReferenceArray, i14, abstractRunnableC22369i)) {
            return null;
        }
        if (z4) {
            f87334e.decrementAndGet(this);
        }
        return abstractRunnableC22369i;
    }
}
