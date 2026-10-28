package gh3;

import bh3.InterfaceC3254a;
import bh3.InterfaceC3260g;
import java.util.concurrent.atomic.AtomicBoolean;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: gh3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C15866k extends AtomicBoolean implements InterfaceC38282i, InterfaceC3254a {

    /* JADX INFO: renamed from: w */
    public final AbstractC38292s f59969w;

    /* JADX INFO: renamed from: x */
    public final Object f59970x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC3260g f59971y;

    public C15866k(AbstractC38292s abstractC38292s, Object obj, InterfaceC3260g interfaceC3260g) {
        this.f59969w = abstractC38292s;
        this.f59970x = obj;
        this.f59971y = interfaceC3260g;
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        AbstractC38292s abstractC38292s = this.f59969w;
        if (abstractC38292s.mo14749a()) {
            return;
        }
        Object obj = this.f59970x;
        try {
            abstractC38292s.onNext(obj);
            if (abstractC38292s.mo14749a()) {
                return;
            }
            abstractC38292s.onCompleted();
        } catch (Throwable th3) {
            AbstractC12350b.m34575X(th3, abstractC38292s, obj);
        }
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "n >= 0 required but it was "));
        }
        if (j7 == 0 || !compareAndSet(false, true)) {
            return;
        }
        this.f59969w.m122688c((InterfaceC38293t) this.f59971y.mo1678b(this));
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ScalarAsyncProducer[" + this.f59970x + ", " + get() + "]";
    }
}
