package ch3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p098dt.AbstractC12350b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C4699o extends AtomicLong implements InterfaceC38282i {

    /* JADX INFO: renamed from: w */
    public final AbstractC38292s f19245w;

    /* JADX INFO: renamed from: x */
    public final Iterator f19246x;

    public C4699o(AbstractC38292s abstractC38292s, Iterator it) {
        this.f19245w = abstractC38292s;
        this.f19246x = it;
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        if (get() == Long.MAX_VALUE) {
            return;
        }
        Iterator it = this.f19246x;
        AbstractC38292s abstractC38292s = this.f19245w;
        if (j7 == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
            while (!abstractC38292s.mo14749a()) {
                try {
                    abstractC38292s.onNext(it.next());
                    if (abstractC38292s.mo14749a()) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (abstractC38292s.mo14749a()) {
                                return;
                            }
                            abstractC38292s.onCompleted();
                            return;
                        }
                    } catch (Throwable th3) {
                        AbstractC12350b.m34574W(th3, abstractC38292s);
                        return;
                    }
                } catch (Throwable th4) {
                    AbstractC12350b.m34574W(th4, abstractC38292s);
                    return;
                }
            }
            return;
        }
        if (j7 <= 0 || AbstractC4677d.m14745b(this, j7) != 0) {
            return;
        }
        do {
            long j13 = 0;
            while (true) {
                if (j13 == j7) {
                    j7 = get();
                    if (j13 == j7) {
                        break;
                    }
                } else {
                    if (abstractC38292s.mo14749a()) {
                        return;
                    }
                    try {
                        abstractC38292s.onNext(it.next());
                        if (abstractC38292s.mo14749a()) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                if (abstractC38292s.mo14749a()) {
                                    return;
                                }
                                abstractC38292s.onCompleted();
                                return;
                            }
                            j13++;
                        } catch (Throwable th5) {
                            AbstractC12350b.m34574W(th5, abstractC38292s);
                            return;
                        }
                    } catch (Throwable th6) {
                        AbstractC12350b.m34574W(th6, abstractC38292s);
                        return;
                    }
                }
            }
            j7 = AbstractC4677d.m14747d(this, j13);
        } while (j7 != 0);
    }
}
