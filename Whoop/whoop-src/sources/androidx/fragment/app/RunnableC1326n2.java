package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.n2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1326n2 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5688w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1343s f5689x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1334p2 f5690y;

    public /* synthetic */ RunnableC1326n2(C1343s c1343s, C1334p2 c1334p2, int i13) {
        this.f5688w = i13;
        this.f5689x = c1343s;
        this.f5690y = c1334p2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5688w) {
            case 0:
                C1343s c1343s = this.f5689x;
                ArrayList arrayList = c1343s.f5791b;
                C1334p2 c1334p2 = this.f5690y;
                if (arrayList.contains(c1334p2)) {
                    int i13 = c1334p2.f5749a;
                    View view = c1334p2.f5751c.mView;
                    AbstractC22676k.m65749i(view, "operation.fragment.mView");
                    AbstractC30802r.m94752a(i13, view, c1343s.f5790a);
                }
                break;
            case 1:
                C1343s this$0 = this.f5689x;
                AbstractC22676k.m65750j(this$0, "this$0");
                C1334p2 operation = this.f5690y;
                AbstractC22676k.m65750j(operation, "$operation");
                this$0.m4215a(operation);
                break;
            default:
                C1343s c1343s2 = this.f5689x;
                ArrayList arrayList2 = c1343s2.f5791b;
                C1334p2 c1334p3 = this.f5690y;
                arrayList2.remove(c1334p3);
                c1343s2.f5792c.remove(c1334p3);
                break;
        }
    }
}
