package dh3;

import java.util.concurrent.atomic.AtomicBoolean;
import p098dt.AbstractC12350b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: dh3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C12053b extends AtomicBoolean implements InterfaceC38282i {

    /* JADX INFO: renamed from: w */
    public final AbstractC38292s f39963w;

    /* JADX INFO: renamed from: x */
    public final Object f39964x;

    public C12053b(AbstractC38292s abstractC38292s, Object obj) {
        this.f39963w = abstractC38292s;
        this.f39964x = obj;
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j7 != 0 && compareAndSet(false, true)) {
            AbstractC38292s abstractC38292s = this.f39963w;
            if (abstractC38292s.mo14749a()) {
                return;
            }
            Object obj = this.f39964x;
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
    }
}
