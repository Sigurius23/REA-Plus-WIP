package p078d1;

import android.os.CancellationSignal;
import bc3.C2996c2;
import java.util.concurrent.CancellationException;
import p133f1.C13977s1;
import p294l3.C23283u0;
import p510u0.C34354s0;

/* JADX INFO: renamed from: d1.g */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11454g implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36748b;

    public /* synthetic */ C11454g(Object obj, int i13) {
        this.f36747a = i13;
        this.f36748b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f36747a) {
            case 0:
                C13977s1 c13977s1 = (C13977s1) this.f36748b;
                if (c13977s1 != null) {
                    C34354s0 c34354s0 = c13977s1.f49848d;
                    if (c34354s0 != null) {
                        c34354s0.m108663e(C23283u0.f92251b);
                    }
                    C34354s0 c34354s1 = c13977s1.f49848d;
                    if (c34354s1 != null) {
                        c34354s1.m108664f(C23283u0.f92251b);
                    }
                }
                break;
            default:
                ((C2996c2) this.f36748b).cancel((CancellationException) null);
                break;
        }
    }
}
