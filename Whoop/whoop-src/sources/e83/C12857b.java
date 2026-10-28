package e83;

import b83.AbstractC2808d;
import b83.C2810f;
import b83.EnumC2812h;
import d13.AbstractC11478a;
import eg3.InterfaceC13183b;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l73.InterfaceC23411b;
import p012ab.C0682h0;
import p249jc.AbstractC21598x;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: e83.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C12857b extends AbstractC12858c {

    /* JADX INFO: renamed from: H */
    public static final Object[] f44181H = new Object[0];

    /* JADX INFO: renamed from: I */
    public static final C12856a[] f44182I = new C12856a[0];

    /* JADX INFO: renamed from: J */
    public static final C12856a[] f44183J = new C12856a[0];

    /* JADX INFO: renamed from: E */
    public final AtomicReference f44184E = new AtomicReference();

    /* JADX INFO: renamed from: F */
    public final AtomicReference f44185F;

    /* JADX INFO: renamed from: G */
    public long f44186G;

    /* JADX INFO: renamed from: x */
    public final AtomicReference f44187x;

    /* JADX INFO: renamed from: y */
    public final Lock f44188y;

    /* JADX INFO: renamed from: z */
    public final Lock f44189z;

    public C12857b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f44188y = reentrantReadWriteLock.readLock();
        this.f44189z = reentrantReadWriteLock.writeLock();
        this.f44187x = new AtomicReference(f44182I);
        this.f44185F = new AtomicReference();
    }

    @Override // eg3.InterfaceC13182a
    /* JADX INFO: renamed from: b */
    public final void mo36113b(InterfaceC13183b interfaceC13183b) {
        if (this.f44185F.get() != null) {
            interfaceC13183b.cancel();
        } else {
            interfaceC13183b.request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l73.AbstractC23410a
    /* JADX INFO: renamed from: c */
    public final void mo36114c(InterfaceC23411b interfaceC23411b) {
        C0682h0 c0682h0;
        C12856a c12856a = new C12856a(interfaceC23411b, this);
        interfaceC23411b.mo36113b(c12856a);
        AtomicReference atomicReference = this.f44187x;
        while (true) {
            C12856a[] c12856aArr = (C12856a[]) atomicReference.get();
            if (c12856aArr == f44183J) {
                Throwable th3 = (Throwable) this.f44185F.get();
                if (th3 == AbstractC2808d.f10999a) {
                    interfaceC23411b.onComplete();
                    return;
                } else {
                    interfaceC23411b.onError(th3);
                    return;
                }
            }
            int length = c12856aArr.length;
            C12856a[] c12856aArr2 = new C12856a[length + 1];
            System.arraycopy(c12856aArr, 0, c12856aArr2, 0, length);
            c12856aArr2[length] = c12856a;
            do {
                if (atomicReference.compareAndSet(c12856aArr, c12856aArr2)) {
                    if (c12856a.f44175G) {
                        m36115d(c12856a);
                        return;
                    }
                    if (c12856a.f44175G) {
                        return;
                    }
                    synchronized (c12856a) {
                        try {
                            if (c12856a.f44175G) {
                                return;
                            }
                            if (c12856a.f44179y) {
                                return;
                            }
                            C12857b c12857b = c12856a.f44178x;
                            Lock lock = c12857b.f44188y;
                            lock.lock();
                            c12856a.f44176H = c12857b.f44186G;
                            Object obj = c12857b.f44184E.get();
                            lock.unlock();
                            c12856a.f44180z = obj != null;
                            c12856a.f44179y = true;
                            if (obj == null || c12856a.test(obj)) {
                                return;
                            }
                            while (!c12856a.f44175G) {
                                synchronized (c12856a) {
                                    try {
                                        c0682h0 = c12856a.f44173E;
                                        if (c0682h0 == null) {
                                            c12856a.f44180z = false;
                                            return;
                                        }
                                        c12856a.f44173E = null;
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                                c0682h0.m1696k(c12856a);
                            }
                            return;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            } while (atomicReference.get() == c12856aArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m36115d(C12856a c12856a) {
        AtomicReference atomicReference;
        C12856a[] c12856aArr;
        C12856a[] c12856aArr2;
        do {
            atomicReference = this.f44187x;
            c12856aArr = (C12856a[]) atomicReference.get();
            int length = c12856aArr.length;
            if (length == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (c12856aArr[i13] == c12856a) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length == 1) {
                c12856aArr2 = f44182I;
            } else {
                C12856a[] c12856aArr3 = new C12856a[length - 1];
                System.arraycopy(c12856aArr, 0, c12856aArr3, 0, i13);
                System.arraycopy(c12856aArr, i13 + 1, c12856aArr3, i13, (length - i13) - 1);
                c12856aArr2 = c12856aArr3;
            }
        } while (!AbstractC11478a.m30871w(atomicReference, c12856aArr, c12856aArr2));
    }

    @Override // eg3.InterfaceC13182a
    public final void onComplete() {
        if (AbstractC11478a.m30868t(this.f44185F, AbstractC2808d.f10999a)) {
            AtomicReference atomicReference = this.f44187x;
            C12856a[] c12856aArr = (C12856a[]) atomicReference.get();
            EnumC2812h enumC2812h = EnumC2812h.f11003w;
            C12856a[] c12856aArr2 = f44183J;
            if (c12856aArr != c12856aArr2 && (c12856aArr = (C12856a[]) atomicReference.getAndSet(c12856aArr2)) != c12856aArr2) {
                Lock lock = this.f44189z;
                lock.lock();
                this.f44186G++;
                this.f44184E.lazySet(enumC2812h);
                lock.unlock();
            }
            for (C12856a c12856a : c12856aArr) {
                c12856a.m36112a(this.f44186G, enumC2812h);
            }
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onError(Throwable th3) {
        AbstractC31056a.m95616a(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!AbstractC11478a.m30872x(this.f44185F, th3)) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        C2810f c2810f = new C2810f(th3);
        AtomicReference atomicReference = this.f44187x;
        C12856a[] c12856aArr = (C12856a[]) atomicReference.get();
        C12856a[] c12856aArr2 = f44183J;
        if (c12856aArr != c12856aArr2 && (c12856aArr = (C12856a[]) atomicReference.getAndSet(c12856aArr2)) != c12856aArr2) {
            Lock lock = this.f44189z;
            lock.lock();
            this.f44186G++;
            this.f44184E.lazySet(c2810f);
            lock.unlock();
        }
        for (C12856a c12856a : c12856aArr) {
            c12856a.m36112a(this.f44186G, c2810f);
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onNext(Object obj) {
        AbstractC31056a.m95616a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f44185F.get() != null) {
            return;
        }
        Lock lock = this.f44189z;
        lock.lock();
        this.f44186G++;
        this.f44184E.lazySet(obj);
        lock.unlock();
        for (C12856a c12856a : (C12856a[]) this.f44187x.get()) {
            c12856a.m36112a(this.f44186G, obj);
        }
    }
}
