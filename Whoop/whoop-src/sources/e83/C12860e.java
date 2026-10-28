package e83;

import d13.AbstractC11478a;
import eg3.InterfaceC13183b;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23411b;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: e83.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C12860e extends AbstractC12858c {

    /* JADX INFO: renamed from: x */
    public final AtomicReference f44194x = new AtomicReference(f44192E);

    /* JADX INFO: renamed from: y */
    public Throwable f44195y;

    /* JADX INFO: renamed from: z */
    public static final C12859d[] f44193z = new C12859d[0];

    /* JADX INFO: renamed from: E */
    public static final C12859d[] f44192E = new C12859d[0];

    @Override // eg3.InterfaceC13182a
    /* JADX INFO: renamed from: b */
    public final void mo36113b(InterfaceC13183b interfaceC13183b) {
        if (this.f44194x.get() == f44193z) {
            interfaceC13183b.cancel();
        } else {
            interfaceC13183b.request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l73.AbstractC23410a
    /* JADX INFO: renamed from: c */
    public final void mo36114c(InterfaceC23411b interfaceC23411b) {
        C12859d c12859d = new C12859d(interfaceC23411b, this);
        interfaceC23411b.mo36113b(c12859d);
        while (true) {
            AtomicReference atomicReference = this.f44194x;
            C12859d[] c12859dArr = (C12859d[]) atomicReference.get();
            if (c12859dArr == f44193z) {
                Throwable th3 = this.f44195y;
                if (th3 != null) {
                    interfaceC23411b.onError(th3);
                    return;
                } else {
                    interfaceC23411b.onComplete();
                    return;
                }
            }
            int length = c12859dArr.length;
            C12859d[] c12859dArr2 = new C12859d[length + 1];
            System.arraycopy(c12859dArr, 0, c12859dArr2, 0, length);
            c12859dArr2[length] = c12859d;
            do {
                if (atomicReference.compareAndSet(c12859dArr, c12859dArr2)) {
                    if (c12859d.get() == Long.MIN_VALUE) {
                        m36116d(c12859d);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == c12859dArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m36116d(C12859d c12859d) {
        AtomicReference atomicReference;
        C12859d[] c12859dArr;
        C12859d[] c12859dArr2;
        do {
            atomicReference = this.f44194x;
            c12859dArr = (C12859d[]) atomicReference.get();
            if (c12859dArr == f44193z || c12859dArr == (c12859dArr2 = f44192E)) {
                return;
            }
            int length = c12859dArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (c12859dArr[i13] == c12859d) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length != 1) {
                c12859dArr2 = new C12859d[length - 1];
                System.arraycopy(c12859dArr, 0, c12859dArr2, 0, i13);
                System.arraycopy(c12859dArr, i13 + 1, c12859dArr2, i13, (length - i13) - 1);
            }
        } while (!AbstractC11478a.m30871w(atomicReference, c12859dArr, c12859dArr2));
    }

    @Override // eg3.InterfaceC13182a
    public final void onComplete() {
        AtomicReference atomicReference = this.f44194x;
        Object obj = atomicReference.get();
        Object obj2 = f44193z;
        if (obj == obj2) {
            return;
        }
        C12859d[] c12859dArr = (C12859d[]) atomicReference.getAndSet(obj2);
        for (C12859d c12859d : c12859dArr) {
            if (c12859d.get() != Long.MIN_VALUE) {
                c12859d.f44190w.onComplete();
            }
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onError(Throwable th3) {
        AbstractC31056a.m95616a(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f44194x;
        Object obj = atomicReference.get();
        Object obj2 = f44193z;
        if (obj == obj2) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        this.f44195y = th3;
        C12859d[] c12859dArr = (C12859d[]) atomicReference.getAndSet(obj2);
        for (C12859d c12859d : c12859dArr) {
            if (c12859d.get() != Long.MIN_VALUE) {
                c12859d.f44190w.onError(th3);
            } else {
                AbstractC21598x.m60677d0(th3);
            }
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onNext(Object obj) {
        long j7;
        long j13;
        AbstractC31056a.m95616a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C12859d c12859d : (C12859d[]) this.f44194x.get()) {
            InterfaceC23411b interfaceC23411b = c12859d.f44190w;
            long j14 = c12859d.get();
            if (j14 != Long.MIN_VALUE) {
                if (j14 != 0) {
                    interfaceC23411b.onNext(obj);
                    do {
                        j7 = c12859d.get();
                        if (j7 == Long.MIN_VALUE || j7 == Long.MAX_VALUE) {
                            break;
                        }
                        j13 = j7 - 1;
                        if (j13 < 0) {
                            AbstractC21598x.m60677d0(new IllegalStateException(AbstractC11895b.m31994m(j13, "More produced than requested: ")));
                            j13 = 0;
                        }
                    } while (!c12859d.compareAndSet(j7, j13));
                } else {
                    c12859d.cancel();
                    interfaceC23411b.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }
}
