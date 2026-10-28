package sy2;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: sy2.u */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33118u implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138154w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f138155x;

    public /* synthetic */ C33118u(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f138154w = i13;
        this.f138155x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f138154w) {
            case 0:
                return Boolean.valueOf(AbstractC33117t.c.a.m105014h(this.f138155x));
            case 1:
                return AbstractC33102e.m104881m(this.f138155x);
            case 2:
                return AbstractC33102e.m104882n(this.f138155x);
            default:
                return AbstractC33102e.m104885q(this.f138155x);
        }
    }
}
