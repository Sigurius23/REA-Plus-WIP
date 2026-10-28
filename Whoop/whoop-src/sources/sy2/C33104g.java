package sy2;

import c93.InterfaceC4339a;
import p164g2.InterfaceC15237i;

/* JADX INFO: renamed from: sy2.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33104g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138073w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC15237i f138074x;

    public /* synthetic */ C33104g(InterfaceC15237i interfaceC15237i, int i13) {
        this.f138073w = i13;
        this.f138074x = interfaceC15237i;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f138073w) {
            case 0:
                return AbstractC33108k.m104912k(this.f138074x);
            case 1:
                return AbstractC33110m.m104933h(this.f138074x);
            default:
                return AbstractC33113p.m104958l(this.f138074x);
        }
    }
}
