package p20;

import kr.C22791j;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: p20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C28740b implements InterfaceC35521h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116328w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22791j f116329x;

    public /* synthetic */ C28740b(C22791j c22791j, int i13) {
        this.f116328w = i13;
        this.f116329x = c22791j;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f116328w) {
            case 0:
                return new C28742d((C22791j) this.f116329x.f89754b);
            default:
                return new C28741c((C22791j) this.f116329x.f89754b);
        }
    }
}
