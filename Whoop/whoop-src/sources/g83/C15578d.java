package g83;

import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: g83.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C15578d extends AbstractC15583i {

    /* JADX INFO: renamed from: y */
    public static final C15577c[] f58514y = new C15577c[0];

    /* JADX INFO: renamed from: z */
    public static final C15577c[] f58515z = new C15577c[0];

    /* JADX INFO: renamed from: w */
    public final AtomicReference f58516w = new AtomicReference(f58515z);

    /* JADX INFO: renamed from: x */
    public Throwable f58517x;

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        if (this.f58516w.get() == f58514y) {
            interfaceC26443b.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l73.AbstractC23412c
    /* JADX INFO: renamed from: d */
    public final void mo43873d(InterfaceC23413d interfaceC23413d) {
        C15577c c15577c = new C15577c(interfaceC23413d, this);
        interfaceC23413d.mo13591b(c15577c);
        while (true) {
            AtomicReference atomicReference = this.f58516w;
            C15577c[] c15577cArr = (C15577c[]) atomicReference.get();
            if (c15577cArr == f58514y) {
                Throwable th3 = this.f58517x;
                if (th3 != null) {
                    interfaceC23413d.onError(th3);
                    return;
                } else {
                    interfaceC23413d.onComplete();
                    return;
                }
            }
            int length = c15577cArr.length;
            C15577c[] c15577cArr2 = new C15577c[length + 1];
            System.arraycopy(c15577cArr, 0, c15577cArr2, 0, length);
            c15577cArr2[length] = c15577c;
            do {
                if (atomicReference.compareAndSet(c15577cArr, c15577cArr2)) {
                    if (c15577c.get()) {
                        m43875e(c15577c);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == c15577cArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m43875e(C15577c c15577c) {
        C15577c[] c15577cArr;
        while (true) {
            AtomicReference atomicReference = this.f58516w;
            C15577c[] c15577cArr2 = (C15577c[]) atomicReference.get();
            if (c15577cArr2 == f58514y || c15577cArr2 == (c15577cArr = f58515z)) {
                return;
            }
            int length = c15577cArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (c15577cArr2[i13] == c15577c) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length != 1) {
                c15577cArr = new C15577c[length - 1];
                System.arraycopy(c15577cArr2, 0, c15577cArr, 0, i13);
                System.arraycopy(c15577cArr2, i13 + 1, c15577cArr, i13, (length - i13) - 1);
            }
            while (!atomicReference.compareAndSet(c15577cArr2, c15577cArr)) {
                if (atomicReference.get() != c15577cArr2) {
                }
            }
            return;
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        AtomicReference atomicReference = this.f58516w;
        Object obj = atomicReference.get();
        Object obj2 = f58514y;
        if (obj == obj2) {
            return;
        }
        C15577c[] c15577cArr = (C15577c[]) atomicReference.getAndSet(obj2);
        for (C15577c c15577c : c15577cArr) {
            if (!c15577c.get()) {
                c15577c.f58512w.onComplete();
            }
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        AbstractC31056a.m95616a(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f58516w;
        Object obj = atomicReference.get();
        Object obj2 = f58514y;
        if (obj == obj2) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        this.f58517x = th3;
        C15577c[] c15577cArr = (C15577c[]) atomicReference.getAndSet(obj2);
        for (C15577c c15577c : c15577cArr) {
            if (c15577c.get()) {
                AbstractC21598x.m60677d0(th3);
            } else {
                c15577c.f58512w.onError(th3);
            }
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        AbstractC31056a.m95616a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C15577c c15577c : (C15577c[]) this.f58516w.get()) {
            if (!c15577c.get()) {
                c15577c.f58512w.onNext(obj);
            }
        }
    }
}
