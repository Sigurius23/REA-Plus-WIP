package bc3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: bc3.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3047p1 implements InterfaceC3011g1 {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12070x = AtomicIntegerFieldUpdater.newUpdater(C3047p1.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12071y = AtomicReferenceFieldUpdater.newUpdater(C3047p1.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12072z = AtomicReferenceFieldUpdater.newUpdater(C3047p1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: w */
    public final C3072x1 f12073w;

    public C3047p1(C3072x1 c3072x1, Throwable th3) {
        this.f12073w = c3072x1;
        this._rootCause$volatile = th3;
    }

    /* JADX INFO: renamed from: a */
    public final void m8794a(Throwable th3) {
        Throwable thM8795c = m8795c();
        if (thM8795c == null) {
            f12071y.set(this, th3);
            return;
        }
        if (th3 == thM8795c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12072z;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th3);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th3);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th3 == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th3);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // bc3.InterfaceC3011g1
    /* JADX INFO: renamed from: b */
    public final C3072x1 mo8733b() {
        return this.f12073w;
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m8795c() {
        return (Throwable) f12071y.get(this);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8796d() {
        return m8795c() != null;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m8797e(Throwable th3) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12072z;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM8795c = m8795c();
        if (thM8795c != null) {
            arrayList.add(0, thM8795c);
        }
        if (th3 != null && !th3.equals(thM8795c)) {
            arrayList.add(th3);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC3006f0.f12022h);
        return arrayList;
    }

    @Override // bc3.InterfaceC3011g1
    public final boolean isActive() {
        return m8795c() == null;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Finishing[cancelling=");
        sb4.append(m8796d());
        sb4.append(", completing=");
        sb4.append(f12070x.get(this) == 1);
        sb4.append(", rootCause=");
        sb4.append(m8795c());
        sb4.append(", exceptions=");
        sb4.append(f12072z.get(this));
        sb4.append(", list=");
        sb4.append(this.f12073w);
        sb4.append(']');
        return sb4.toString();
    }
}
