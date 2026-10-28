package p20;

import n20.C26168c;
import n20.C26169d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: p20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C28743e implements InterfaceC35521h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116332w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28744f f116333x;

    public /* synthetic */ C28743e(C28744f c28744f, int i13) {
        this.f116332w = i13;
        this.f116333x = c28744f;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f116332w) {
            case 0:
                return new C26168c(this.f116333x.f116345c, 1);
            default:
                return new C26169d(this.f116333x.f116345c, 1);
        }
    }
}
