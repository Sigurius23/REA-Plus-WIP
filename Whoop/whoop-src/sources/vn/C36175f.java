package vn;

import android.os.SystemClock;
import io.AbstractC18741c;
import java.util.List;
import p528un.InterfaceC35092c;

/* JADX INFO: renamed from: vn.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C36175f extends AbstractC18741c {

    /* JADX INFO: renamed from: g */
    public int f154758g;

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: c */
    public final int mo54492c() {
        return this.f154758g;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: g */
    public final Object mo54494g() {
        return null;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: o */
    public final int mo54496o() {
        return 0;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: q */
    public final void mo54497q(long j7, long j13, long j14, List list, InterfaceC35092c[] interfaceC35092cArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mo54506s(this.f154758g, jElapsedRealtime)) {
            for (int i13 = this.f73630b - 1; i13 >= 0; i13--) {
                if (!mo54506s(i13, jElapsedRealtime)) {
                    this.f154758g = i13;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
