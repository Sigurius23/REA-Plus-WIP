package pp2;

import androidx.fragment.app.AbstractActivityC1340r0;
import c93.InterfaceC4339a;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: pp2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29439c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119538w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f119539x;

    public /* synthetic */ C29439c(Object obj, int i13) {
        this.f119538w = i13;
        this.f119539x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f119538w) {
            case 0:
                return AbstractC29441e.m89842q((InterfaceC28601c1) this.f119539x);
            case 1:
                return AbstractC29452p.m89915i((UniversalCheckoutDestination.C10632d.a) this.f119539x);
            default:
                return AbstractC29452p.m89922p((AbstractActivityC1340r0) this.f119539x);
        }
    }
}
