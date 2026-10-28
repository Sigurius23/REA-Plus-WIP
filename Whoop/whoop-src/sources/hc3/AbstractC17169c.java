package hc3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hc3.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17169c {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65965w = AtomicReferenceFieldUpdater.newUpdater(AbstractC17169c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65966x = AtomicReferenceFieldUpdater.newUpdater(AbstractC17169c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC17169c(AbstractC17189v abstractC17189v) {
        this._prev$volatile = abstractC17189v;
    }

    /* JADX INFO: renamed from: b */
    public final void m48492b() {
        f65966x.set(this, null);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC17169c m48493c() {
        Object obj = f65965w.get(this);
        if (obj == AbstractC17167b.f65956a) {
            return null;
        }
        return (AbstractC17169c) obj;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo48494d();

    /* JADX INFO: renamed from: e */
    public final void m48495e() {
        Object obj;
        AbstractC17169c abstractC17169cM48493c;
        if (m48493c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65966x;
            AbstractC17169c abstractC17169c = (AbstractC17169c) atomicReferenceFieldUpdater.get(this);
            while (abstractC17169c != null && abstractC17169c.mo48494d()) {
                abstractC17169c = (AbstractC17169c) atomicReferenceFieldUpdater.get(abstractC17169c);
            }
            AbstractC17169c abstractC17169cM48493c2 = m48493c();
            AbstractC22676k.m65747g(abstractC17169cM48493c2);
            while (abstractC17169cM48493c2.mo48494d() && (abstractC17169cM48493c = abstractC17169cM48493c2.m48493c()) != null) {
                abstractC17169cM48493c2 = abstractC17169cM48493c;
            }
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC17169cM48493c2);
            } while (!AbstractC13673n.m38551C(atomicReferenceFieldUpdater, abstractC17169cM48493c2, obj, ((AbstractC17169c) obj) == null ? null : abstractC17169c));
            if (abstractC17169c != null) {
                f65965w.set(abstractC17169c, abstractC17169cM48493c2);
            }
            if (!abstractC17169cM48493c2.mo48494d() || abstractC17169cM48493c2.m48493c() == null) {
                if (abstractC17169c == null || !abstractC17169c.mo48494d()) {
                    return;
                }
            }
        }
    }
}
