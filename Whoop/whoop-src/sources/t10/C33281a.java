package t10;

import n20.C26168c;
import n20.C26169d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: t10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C33281a implements InterfaceC35521h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138751w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33282b f138752x;

    public /* synthetic */ C33281a(C33282b c33282b, int i13) {
        this.f138751w = i13;
        this.f138752x = c33282b;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f138751w) {
            case 0:
                return new C26169d(this.f138752x.f138779a, 3);
            default:
                return new C26168c(this.f138752x.f138779a, 3);
        }
    }
}
