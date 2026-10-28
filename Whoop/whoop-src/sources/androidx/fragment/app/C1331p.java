package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import c93.InterfaceC4339a;
import java.io.Serializable;
import l83.C23454a0;
import p043c4.C3948a0;
import p043c4.DialogC3954d0;
import p636y3.EnumC39181m;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: androidx.fragment.app.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C1331p extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Serializable f5743E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5744w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f5745x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f5746y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f5747z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1331p(Object obj, Object obj2, Object obj3, Serializable serializable, int i13) {
        super(0);
        this.f5744w = i13;
        this.f5745x = obj;
        this.f5746y = obj2;
        this.f5747z = obj3;
        this.f5743E = serializable;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f5744w) {
            case 0:
                C1335q c1335q = (C1335q) this.f5745x;
                AbstractC1314k2 abstractC1314k2 = c1335q.f5764f;
                ViewGroup viewGroup = (ViewGroup) this.f5746y;
                Object obj = this.f5747z;
                Object objMo4116i = abstractC1314k2.mo4116i(viewGroup, obj);
                c1335q.f5775q = objMo4116i;
                if (objMo4116i == null) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                ((C22669g0) this.f5743E).f89336w = new C1327o(c1335q, obj, viewGroup);
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + c1335q.f5762d + " to " + c1335q.f5763e);
                }
                return C23454a0.f92919a;
            default:
                ((DialogC3954d0) this.f5745x).m11996d((InterfaceC4339a) this.f5746y, (C3948a0) this.f5747z, (EnumC39181m) this.f5743E);
                return C23454a0.f92919a;
        }
    }
}
