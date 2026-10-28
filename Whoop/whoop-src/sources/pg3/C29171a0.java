package pg3;

import ne3.InterfaceC26620j;
import ud3.AbstractC34799a1;
import ud3.C34818h0;

/* JADX INFO: renamed from: pg3.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29171a0 extends AbstractC34799a1 {

    /* JADX INFO: renamed from: y */
    public final C34818h0 f118130y;

    /* JADX INFO: renamed from: z */
    public final long f118131z;

    public C29171a0(C34818h0 c34818h0, long j7) {
        this.f118130y = c34818h0;
        this.f118131z = j7;
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC26620j mo1940d1() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: i */
    public final long mo1941i() {
        return this.f118131z;
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: k */
    public final C34818h0 mo1942k() {
        return this.f118130y;
    }
}
