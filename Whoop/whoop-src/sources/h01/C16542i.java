package h01;

import c93.InterfaceC4339a;
import p31.AbstractC28795f;
import p390p1.InterfaceC28601c1;
import p720m91.AbstractC25303l;
import um1.AbstractC35086d;

/* JADX INFO: renamed from: h01.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16542i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63648w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f63649x;

    public /* synthetic */ C16542i(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f63648w = i13;
        this.f63649x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f63648w) {
            case 0:
                return AbstractC16549p.m46764R(this.f63649x);
            case 1:
                return Integer.valueOf(AbstractC16549p.m46766T(this.f63649x));
            case 2:
                return AbstractC16559z.m46882x(this.f63649x);
            case 3:
                return Integer.valueOf(AbstractC16559z.m46884z(this.f63649x));
            case 4:
                return AbstractC25303l.m74288o(this.f63649x);
            case 5:
                return AbstractC28795f.m87550F(this.f63649x);
            default:
                return AbstractC35086d.m110967w(this.f63649x);
        }
    }
}
