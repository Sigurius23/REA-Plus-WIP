package p679zf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: zf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C40603d {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f174960e = AtomicIntegerFieldUpdater.newUpdater(C40603d.class, "b");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f174961f = AtomicIntegerFieldUpdater.newUpdater(C40603d.class, "c");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f174962g = AtomicIntegerFieldUpdater.newUpdater(C40603d.class, "d");

    /* JADX INFO: renamed from: a */
    public final int f174963a;

    /* JADX INFO: renamed from: c */
    public volatile /* synthetic */ int f174965c;

    /* JADX INFO: renamed from: b */
    public volatile /* synthetic */ int f174964b = 0;

    /* JADX INFO: renamed from: d */
    public volatile /* synthetic */ int f174966d = 0;

    public C40603d(int i13) {
        this.f174963a = i13;
        this.f174965c = i13;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BufferCapacity(availableForRead: ");
        sb4.append(this.f174964b);
        sb4.append(", availableForWrite: ");
        sb4.append(this.f174965c);
        sb4.append(", pendingFlush: ");
        sb4.append(this.f174966d);
        sb4.append(", capacity: ");
        return AbstractC11895b.m31999r(sb4, this.f174963a, ')');
    }
}
