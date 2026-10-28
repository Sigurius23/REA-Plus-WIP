package p707gt1;

import c93.InterfaceC4339a;
import ft1.InterfaceC14770c;

/* JADX INFO: renamed from: gt1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16187a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61491w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC14770c.g f61492x;

    public /* synthetic */ C16187a(InterfaceC14770c.g gVar, int i13) {
        this.f61491w = i13;
        this.f61492x = gVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f61491w) {
            case 0:
                return Boolean.valueOf(AbstractC16188b.m45746i(this.f61492x));
            default:
                return AbstractC16202p.m45853i(this.f61492x);
        }
    }
}
