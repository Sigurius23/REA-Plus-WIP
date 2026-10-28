package hc3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: hc3.l */
/* JADX INFO: loaded from: classes5.dex */
public class C17179l {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65990a = AtomicReferenceFieldUpdater.newUpdater(C17179l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C17181n(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m48529a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65990a;
            C17181n c17181n = (C17181n) atomicReferenceFieldUpdater.get(this);
            int iM48532a = c17181n.m48532a(runnable);
            if (iM48532a == 0) {
                return true;
            }
            if (iM48532a == 1) {
                C17181n c17181nM48534c = c17181n.m48534c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c17181n, c17181nM48534c) && atomicReferenceFieldUpdater.get(this) == c17181n) {
                }
            } else if (iM48532a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m48530b() {
        C17181n c17181n = (C17181n) f65990a.get(this);
        c17181n.getClass();
        long j7 = C17181n.f65993f.get(c17181n);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    /* JADX INFO: renamed from: c */
    public final Object m48531c() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65990a;
            C17181n c17181n = (C17181n) atomicReferenceFieldUpdater.get(this);
            Object objM48535d = c17181n.m48535d();
            if (objM48535d != C17181n.f65994g) {
                return objM48535d;
            }
            C17181n c17181nM48534c = c17181n.m48534c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c17181n, c17181nM48534c) && atomicReferenceFieldUpdater.get(this) == c17181n) {
            }
        }
    }
}
