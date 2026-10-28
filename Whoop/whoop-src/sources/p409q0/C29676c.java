package p409q0;

import c93.InterfaceC4339a;
import p390p1.C28617g1;
import p390p1.C28621h1;

/* JADX INFO: renamed from: q0.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C29676c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121289w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC29701y f121290x;

    public /* synthetic */ C29676c(AbstractC29701y abstractC29701y, int i13) {
        this.f121289w = i13;
        this.f121290x = abstractC29701y;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iMo91148m;
        int iM91162k;
        switch (this.f121289w) {
            case 0:
                iMo91148m = this.f121290x.mo91148m();
                break;
            case 1:
                iMo91148m = this.f121290x.mo91148m();
                break;
            case 2:
                AbstractC29701y abstractC29701y = this.f121290x;
                return Integer.valueOf(abstractC29701y.f121440k.mo9765b() ? abstractC29701y.f121449t.m87024x() : abstractC29701y.m91162k());
            default:
                AbstractC29701y abstractC29701y2 = this.f121290x;
                C28621h1 c28621h1 = abstractC29701y2.f121448s;
                if (!abstractC29701y2.f121440k.mo9765b()) {
                    iM91162k = abstractC29701y2.m91162k();
                } else if (c28621h1.m87024x() != -1) {
                    iM91162k = c28621h1.m87024x();
                } else if (Math.abs(((C28617g1) abstractC29701y2.f121433d.f93080d).m87022x()) >= Math.abs(Math.min(abstractC29701y2.f121446q.mo743q0(AbstractC29677c0.f121291a), abstractC29701y2.m91164n() / 2.0f) / abstractC29701y2.m91164n())) {
                    iM91162k = ((Boolean) abstractC29701y2.f121428H.getValue()).booleanValue() ? abstractC29701y2.f121434e + 1 : abstractC29701y2.f121434e;
                } else {
                    iM91162k = abstractC29701y2.m91162k();
                }
                iMo91148m = abstractC29701y2.m91161j(iM91162k);
                break;
        }
        return Integer.valueOf(iMo91148m);
    }
}
