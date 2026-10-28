package pg3;

import retrofit2.HttpException;

/* JADX INFO: renamed from: pg3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C29191i implements InterfaceC29189h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118176w;

    /* JADX INFO: renamed from: x */
    public final C29195k f118177x;

    public /* synthetic */ C29191i(C29195k c29195k, int i13) {
        this.f118176w = i13;
        this.f118177x = c29195k;
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: g */
    public final void mo2323g(InterfaceC29182e interfaceC29182e, C29218v0 c29218v0) {
        switch (this.f118176w) {
            case 0:
                boolean z4 = c29218v0.f118269a.f146788Q;
                C29195k c29195k = this.f118177x;
                if (!z4) {
                    c29195k.completeExceptionally(new HttpException(c29218v0));
                } else {
                    c29195k.complete(c29218v0.f118270b);
                }
                break;
            default:
                this.f118177x.complete(c29218v0);
                break;
        }
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: r */
    public final void mo2329r(InterfaceC29182e interfaceC29182e, Throwable th3) {
        switch (this.f118176w) {
            case 0:
                this.f118177x.completeExceptionally(th3);
                break;
            default:
                this.f118177x.completeExceptionally(th3);
                break;
        }
    }
}
