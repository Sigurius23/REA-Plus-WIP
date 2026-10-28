package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23454a0;
import p009a8.RunnableC0533c;
import p029b5.C2725d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: androidx.fragment.app.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C1327o extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5691w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1335q f5692x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f5693y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ViewGroup f5694z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327o(C1335q c1335q, ViewGroup viewGroup, Object obj) {
        super(0);
        this.f5692x = c1335q;
        this.f5694z = viewGroup;
        this.f5693y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f5691w) {
            case 0:
                this.f5692x.f5764f.mo4092e(this.f5694z, this.f5693y);
                break;
            default:
                C1335q c1335q = this.f5692x;
                ArrayList arrayList = c1335q.f5761c;
                AbstractC1314k2 abstractC1314k2 = c1335q.f5764f;
                if (arrayList.isEmpty()) {
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    Object obj = c1335q.f5775q;
                    AbstractC22676k.m65747g(obj);
                    abstractC1314k2.mo4115d(obj, new RunnableC0533c(2, c1335q, this.f5694z));
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((C1339r) it.next()).f5663a.f5755g) {
                            if (AbstractC1329o1.m4132M(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            C2725d c2725d = new C2725d();
                            abstractC1314k2.mo4103u(((C1339r) arrayList.get(0)).f5663a.f5751c, this.f5693y, c2725d, new RunnableC1319m(c1335q, 2));
                            c2725d.m7694a();
                        }
                    }
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    Object obj2 = c1335q.f5775q;
                    AbstractC22676k.m65747g(obj2);
                    abstractC1314k2.mo4115d(obj2, new RunnableC0533c(2, c1335q, this.f5694z));
                }
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327o(C1335q c1335q, Object obj, ViewGroup viewGroup) {
        super(0);
        this.f5692x = c1335q;
        this.f5693y = obj;
        this.f5694z = viewGroup;
    }
}
