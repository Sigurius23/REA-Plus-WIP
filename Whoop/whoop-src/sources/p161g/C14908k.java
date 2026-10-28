package p161g;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1625s1;
import androidx.lifecycle.C1641y;
import androidx.lifecycle.RunnableC1605m;
import c93.InterfaceC4339a;
import p021av.C2088b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: g.k */
/* JADX INFO: loaded from: classes.dex */
public final class C14908k extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55587w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractActivityC14909l f55588x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14908k(AbstractActivityC14909l abstractActivityC14909l, int i13) {
        super(0);
        this.f55587w = i13;
        this.f55588x = abstractActivityC14909l;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f55587w) {
            case 0:
                AbstractActivityC14909l abstractActivityC14909l = this.f55588x;
                return new C1625s1(abstractActivityC14909l.getApplication(), abstractActivityC14909l, abstractActivityC14909l.getIntent() != null ? abstractActivityC14909l.getIntent().getExtras() : null);
            case 1:
                AbstractActivityC14909l abstractActivityC14909l2 = this.f55588x;
                return new C14916s(abstractActivityC14909l2.reportFullyDrawnExecutor, new C2088b(abstractActivityC14909l2, 17));
            default:
                AbstractActivityC14909l abstractActivityC14909l3 = this.f55588x;
                C14923z c14923z = new C14923z(new RunnableC14898c(abstractActivityC14909l3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC14909l3.getLifecycle().mo4986a(new C1641y(1, c14923z, abstractActivityC14909l3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC1605m(5, abstractActivityC14909l3, c14923z));
                    }
                }
                return c14923z;
        }
    }
}
