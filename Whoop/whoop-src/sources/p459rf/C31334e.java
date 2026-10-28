package p459rf;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: rf.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C31334e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128934w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f128935x;

    public /* synthetic */ C31334e(long j7, int i13) {
        this.f128934w = i13;
        this.f128935x = j7;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f128934w) {
            case 0:
                return "finished sending request body: bytesSent=" + this.f128935x;
            case 1:
                return "response body finished: bytesConsumed=" + this.f128935x;
            default:
                return "response headers end: contentLengthHeader=" + this.f128935x;
        }
    }
}
