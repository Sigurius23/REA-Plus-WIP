package e83;

import a83.EnumC0575c;
import eg3.InterfaceC13183b;
import java.util.concurrent.atomic.AtomicLong;
import l73.InterfaceC23411b;

/* JADX INFO: renamed from: e83.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C12859d extends AtomicLong implements InterfaceC13183b {

    /* JADX INFO: renamed from: w */
    public final InterfaceC23411b f44190w;

    /* JADX INFO: renamed from: x */
    public final C12860e f44191x;

    public C12859d(InterfaceC23411b interfaceC23411b, C12860e c12860e) {
        this.f44190w = interfaceC23411b;
        this.f44191x = c12860e;
    }

    @Override // eg3.InterfaceC13183b
    public final void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.f44191x.m36116d(this);
        }
    }

    @Override // eg3.InterfaceC13183b
    public final void request(long j7) {
        long j13;
        long j14;
        if (EnumC0575c.m1490b(j7)) {
            do {
                j13 = get();
                if (j13 == Long.MIN_VALUE) {
                    return;
                }
                if (j13 == Long.MAX_VALUE) {
                    return;
                } else {
                    j14 = j13 + j7;
                }
            } while (!compareAndSet(j13, j14 >= 0 ? j14 : Long.MAX_VALUE));
        }
    }
}
