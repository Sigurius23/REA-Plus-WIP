package hc3;

import bc3.AbstractC3006f0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hc3.k */
/* JADX INFO: loaded from: classes5.dex */
public class C17178k {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65987w = AtomicReferenceFieldUpdater.newUpdater(C17178k.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65988x = AtomicReferenceFieldUpdater.newUpdater(C17178k.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65989y = AtomicReferenceFieldUpdater.newUpdater(C17178k.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: c */
    public final boolean m48525c(C17178k c17178k, int i13) {
        while (true) {
            C17178k c17178kM48526d = m48526d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65988x;
            if (c17178kM48526d == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c17178kM48526d = (C17178k) obj;
                    if (!c17178kM48526d.mo8829g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c17178kM48526d);
                }
            }
            if (c17178kM48526d instanceof C17175h) {
                return (((C17175h) c17178kM48526d).f65985z & i13) == 0 && c17178kM48526d.m48525c(c17178k, i13);
            }
            atomicReferenceFieldUpdater.set(c17178k, c17178kM48526d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f65987w;
            atomicReferenceFieldUpdater2.set(c17178k, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(c17178kM48526d, this, c17178k)) {
                    c17178k.m48527e(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(c17178kM48526d) == this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final C17178k m48526d() {
        C17178k c17178k;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f65988x;
            C17178k c17178k2 = (C17178k) atomicReferenceFieldUpdater2.get(this);
            c17178k = c17178k2;
            while (true) {
                C17178k c17178k3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f65987w;
                    obj = atomicReferenceFieldUpdater.get(c17178k);
                    if (obj == this) {
                        if (c17178k2 != c17178k && !AbstractC17176i.m48521w(atomicReferenceFieldUpdater2, this, c17178k2, c17178k)) {
                            break;
                        }
                        break;
                    }
                    if (mo8829g()) {
                        return null;
                    }
                    if (!(obj instanceof C17186s)) {
                        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c17178k3 = c17178k;
                        c17178k = (C17178k) obj;
                    } else {
                        if (c17178k3 != null) {
                            break;
                        }
                        c17178k = (C17178k) atomicReferenceFieldUpdater2.get(c17178k);
                    }
                }
                if (!AbstractC17176i.m48521w(atomicReferenceFieldUpdater, c17178k3, c17178k, ((C17186s) obj).f66004a)) {
                    break;
                }
                c17178k = c17178k3;
            }
        }
        return c17178k;
    }

    /* JADX INFO: renamed from: e */
    public final void m48527e(C17178k c17178k) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65988x;
            C17178k c17178k2 = (C17178k) atomicReferenceFieldUpdater.get(c17178k);
            if (f65987w.get(this) != c17178k) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c17178k, c17178k2, this)) {
                    if (mo8829g()) {
                        c17178k.m48526d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c17178k) == c17178k2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C17178k m48528f() {
        C17178k c17178k;
        Object obj = f65987w.get(this);
        C17186s c17186s = obj instanceof C17186s ? (C17186s) obj : null;
        if (c17186s != null && (c17178k = c17186s.f66004a) != null) {
            return c17178k;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C17178k) obj;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo8829g() {
        return f65987w.get(this) instanceof C17186s;
    }

    public String toString() {
        return new C17177j(this) + '@' + AbstractC3006f0.m8724r(this);
    }
}
