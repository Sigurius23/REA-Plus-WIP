package g83;

import b83.AbstractC2808d;
import b83.C2810f;
import b83.EnumC2812h;
import d13.AbstractC11478a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p012ab.C0682h0;
import p249jc.AbstractC21598x;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: g83.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C15576b extends AbstractC15583i {

    /* JADX INFO: renamed from: G */
    public static final Object[] f58503G = new Object[0];

    /* JADX INFO: renamed from: H */
    public static final C15575a[] f58504H = new C15575a[0];

    /* JADX INFO: renamed from: I */
    public static final C15575a[] f58505I = new C15575a[0];

    /* JADX INFO: renamed from: E */
    public final AtomicReference f58506E;

    /* JADX INFO: renamed from: F */
    public long f58507F;

    /* JADX INFO: renamed from: w */
    public final AtomicReference f58508w;

    /* JADX INFO: renamed from: x */
    public final AtomicReference f58509x;

    /* JADX INFO: renamed from: y */
    public final Lock f58510y;

    /* JADX INFO: renamed from: z */
    public final Lock f58511z;

    public C15576b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f58510y = reentrantReadWriteLock.readLock();
        this.f58511z = reentrantReadWriteLock.writeLock();
        this.f58509x = new AtomicReference(f58504H);
        this.f58508w = new AtomicReference();
        this.f58506E = new AtomicReference();
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        if (this.f58506E.get() != null) {
            interfaceC26443b.dispose();
        }
    }

    @Override // l73.AbstractC23412c
    /* JADX INFO: renamed from: d */
    public final void mo43873d(InterfaceC23413d interfaceC23413d) {
        C15575a[] c15575aArr;
        C15575a[] c15575aArr2;
        C0682h0 c0682h0;
        C15575a c15575a = new C15575a(interfaceC23413d, this);
        interfaceC23413d.mo13591b(c15575a);
        AtomicReference atomicReference = this.f58509x;
        do {
            c15575aArr = (C15575a[]) atomicReference.get();
            if (c15575aArr == f58505I) {
                Throwable th3 = (Throwable) this.f58506E.get();
                if (th3 == AbstractC2808d.f10999a) {
                    interfaceC23413d.onComplete();
                    return;
                } else {
                    interfaceC23413d.onError(th3);
                    return;
                }
            }
            int length = c15575aArr.length;
            c15575aArr2 = new C15575a[length + 1];
            System.arraycopy(c15575aArr, 0, c15575aArr2, 0, length);
            c15575aArr2[length] = c15575a;
        } while (!AbstractC11478a.m30871w(atomicReference, c15575aArr, c15575aArr2));
        if (c15575a.f58497G) {
            m43874e(c15575a);
            return;
        }
        if (c15575a.f58497G) {
            return;
        }
        synchronized (c15575a) {
            try {
                if (c15575a.f58497G) {
                    return;
                }
                if (c15575a.f58501y) {
                    return;
                }
                C15576b c15576b = c15575a.f58500x;
                Lock lock = c15576b.f58510y;
                lock.lock();
                c15575a.f58498H = c15576b.f58507F;
                Object obj = c15576b.f58508w.get();
                lock.unlock();
                c15575a.f58502z = obj != null;
                c15575a.f58501y = true;
                if (obj == null || c15575a.test(obj)) {
                    return;
                }
                while (!c15575a.f58497G) {
                    synchronized (c15575a) {
                        try {
                            c0682h0 = c15575a.f58495E;
                            if (c0682h0 == null) {
                                c15575a.f58502z = false;
                                return;
                            }
                            c15575a.f58495E = null;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    c0682h0.m1696k(c15575a);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m43874e(C15575a c15575a) {
        AtomicReference atomicReference;
        C15575a[] c15575aArr;
        C15575a[] c15575aArr2;
        do {
            atomicReference = this.f58509x;
            c15575aArr = (C15575a[]) atomicReference.get();
            int length = c15575aArr.length;
            if (length == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (c15575aArr[i13] == c15575a) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length == 1) {
                c15575aArr2 = f58504H;
            } else {
                C15575a[] c15575aArr3 = new C15575a[length - 1];
                System.arraycopy(c15575aArr, 0, c15575aArr3, 0, i13);
                System.arraycopy(c15575aArr, i13 + 1, c15575aArr3, i13, (length - i13) - 1);
                c15575aArr2 = c15575aArr3;
            }
        } while (!AbstractC11478a.m30871w(atomicReference, c15575aArr, c15575aArr2));
    }

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        if (AbstractC11478a.m30868t(this.f58506E, AbstractC2808d.f10999a)) {
            AtomicReference atomicReference = this.f58509x;
            C15575a[] c15575aArr = f58505I;
            C15575a[] c15575aArr2 = (C15575a[]) atomicReference.getAndSet(c15575aArr);
            EnumC2812h enumC2812h = EnumC2812h.f11003w;
            if (c15575aArr2 != c15575aArr) {
                Lock lock = this.f58511z;
                lock.lock();
                this.f58507F++;
                this.f58508w.lazySet(enumC2812h);
                lock.unlock();
            }
            for (C15575a c15575a : c15575aArr2) {
                c15575a.m43872a(this.f58507F, enumC2812h);
            }
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        AbstractC31056a.m95616a(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!AbstractC11478a.m30872x(this.f58506E, th3)) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        C2810f c2810f = new C2810f(th3);
        AtomicReference atomicReference = this.f58509x;
        C15575a[] c15575aArr = f58505I;
        C15575a[] c15575aArr2 = (C15575a[]) atomicReference.getAndSet(c15575aArr);
        if (c15575aArr2 != c15575aArr) {
            Lock lock = this.f58511z;
            lock.lock();
            this.f58507F++;
            this.f58508w.lazySet(c2810f);
            lock.unlock();
        }
        for (C15575a c15575a : c15575aArr2) {
            c15575a.m43872a(this.f58507F, c2810f);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        AbstractC31056a.m95616a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f58506E.get() != null) {
            return;
        }
        Lock lock = this.f58511z;
        lock.lock();
        this.f58507F++;
        this.f58508w.lazySet(obj);
        lock.unlock();
        for (C15575a c15575a : (C15575a[]) this.f58509x.get()) {
            c15575a.m43872a(this.f58507F, obj);
        }
    }
}
