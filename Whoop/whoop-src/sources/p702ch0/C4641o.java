package p702ch0;

import android.content.Context;
import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p734sl0.C32645n0;

/* JADX INFO: renamed from: ch0.o */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4641o implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18852w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18853x;

    public /* synthetic */ C4641o(Object obj, int i13) {
        this.f18852w = i13;
        this.f18853x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f18852w) {
            case 0:
                return Float.valueOf(AbstractC4639n.j.m14527h((InterfaceC28601c1) this.f18853x));
            case 1:
                return AbstractC4653u.m14656v((InterfaceC4339a) this.f18853x);
            case 2:
                return AbstractC4658w0.m14713j((Context) this.f18853x);
            default:
                return AbstractC4658w0.m14717n((C32645n0) this.f18853x);
        }
    }
}
