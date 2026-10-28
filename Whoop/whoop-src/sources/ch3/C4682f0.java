package ch3;

import java.util.concurrent.atomic.AtomicLong;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4682f0 extends AtomicLong implements InterfaceC38282i {

    /* JADX INFO: renamed from: w */
    public final C4684g0 f19163w;

    public C4682f0(C4684g0 c4684g0) {
        this.f19163w = c4684g0;
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        if (j7 <= 0) {
            if (j7 < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        } else {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            AbstractC4677d.m14745b(this, j7);
            this.f19163w.m14757h();
        }
    }
}
