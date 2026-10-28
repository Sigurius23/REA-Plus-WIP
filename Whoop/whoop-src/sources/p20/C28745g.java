package p20;

import n20.C26168c;
import n20.C26169d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: p20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C28745g implements InterfaceC35521h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116369w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28746h f116370x;

    public /* synthetic */ C28745g(C28746h c28746h, int i13) {
        this.f116369w = i13;
        this.f116370x = c28746h;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f116369w) {
            case 0:
                return new C26169d(this.f116370x.f116397a, 2);
            default:
                return new C26168c(this.f116370x.f116397a, 2);
        }
    }
}
