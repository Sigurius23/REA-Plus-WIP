package w63;

import io.ktor.utils.p228io.internal.C19995e;
import io.seon.androidsdk.service.AbstractC20660e1;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p715kotlin.jvm.internal.AbstractC22676k;
import t63.AbstractC33559b;
import x63.InterfaceC38034f;

/* JADX INFO: renamed from: w63.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C36866a extends AbstractC20660e1 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f157699i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f157700j;

    /* JADX INFO: renamed from: k */
    public static final C19995e f157701k = new C19995e(2);

    /* JADX INFO: renamed from: l */
    public static final C19995e f157702l;

    /* JADX INFO: renamed from: m */
    public static final C36866a f157703m;

    /* JADX INFO: renamed from: h */
    public final InterfaceC38034f f157704h;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    static {
        C19995e c19995e = new C19995e(1);
        f157702l = c19995e;
        f157703m = new C36866a(AbstractC33559b.f140038a, c19995e);
        f157699i = AtomicReferenceFieldUpdater.newUpdater(C36866a.class, Object.class, "nextRef");
        f157700j = AtomicIntegerFieldUpdater.newUpdater(C36866a.class, "refCount");
    }

    public C36866a(ByteBuffer byteBuffer, InterfaceC38034f interfaceC38034f) {
        super(byteBuffer);
        this.f157704h = interfaceC38034f;
        this.nextRef = null;
        this.refCount = 1;
    }

    /* JADX INFO: renamed from: g */
    public final C36866a m118244g() {
        return (C36866a) f157699i.getAndSet(this, null);
    }

    /* JADX INFO: renamed from: h */
    public final C36866a m118245h() {
        return (C36866a) this.nextRef;
    }

    /* JADX INFO: renamed from: i */
    public final int m118246i() {
        return this.refCount;
    }

    /* JADX INFO: renamed from: j */
    public final void m118247j(InterfaceC38034f pool) {
        int i13;
        int i14;
        AbstractC22676k.m65750j(pool, "pool");
        do {
            i13 = this.refCount;
            if (i13 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i14 = i13 - 1;
        } while (!f157700j.compareAndSet(this, i13, i14));
        if (i14 == 0) {
            InterfaceC38034f interfaceC38034f = this.f157704h;
            if (interfaceC38034f != null) {
                pool = interfaceC38034f;
            }
            pool.mo55795a1(this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m118248k() {
        m56794e(0);
        int i13 = this.f77290f;
        int i14 = this.f77288d;
        this.f77286b = i14;
        this.f77287c = i14;
        this.f77289e = i13 - i14;
        this.nextRef = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m118249l(C36866a c36866a) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (c36866a == null) {
            m118244g();
            return;
        }
        do {
            atomicReferenceFieldUpdater = f157699i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c36866a)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    /* JADX INFO: renamed from: m */
    public final void m118250m() {
        int i13;
        do {
            i13 = this.refCount;
            if (i13 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i13 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f157700j.compareAndSet(this, i13, 1));
    }
}
