package androidx.fragment.app;

import android.util.Log;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.n */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC1323n implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5680w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1334p2 f5681x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1335q f5682y;

    public /* synthetic */ RunnableC1323n(C1334p2 c1334p2, C1335q c1335q, int i13) {
        this.f5680w = i13;
        this.f5681x = c1334p2;
        this.f5682y = c1335q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5680w) {
            case 0:
                C1334p2 operation = this.f5681x;
                AbstractC22676k.m65750j(operation, "$operation");
                C1335q this$0 = this.f5682y;
                AbstractC22676k.m65750j(this$0, "this$0");
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.m4202c(this$0);
                break;
            default:
                C1334p2 operation2 = this.f5681x;
                AbstractC22676k.m65750j(operation2, "$operation");
                C1335q this$1 = this.f5682y;
                AbstractC22676k.m65750j(this$1, "this$0");
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation2 + " has completed");
                }
                operation2.m4202c(this$1);
                break;
        }
    }
}
