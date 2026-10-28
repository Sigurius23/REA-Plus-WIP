package p197hj;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.RunnableC1645z0;
import c93.InterfaceC4339a;
import p281kj.C22508c;
import p281kj.C22509d;
import p281kj.C22510e;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17325h extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C17325h f67110x;

    /* JADX INFO: renamed from: y */
    public static final C17325h f67111y;

    /* JADX INFO: renamed from: z */
    public static final C17325h f67112z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67113w;

    static {
        int i13 = 0;
        f67110x = new C17325h(i13, 0);
        f67111y = new C17325h(i13, 1);
        f67112z = new C17325h(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17325h(int i13, int i14) {
        super(i13);
        this.f67113w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f67113w) {
            case 0:
                return new C22508c();
            case 1:
                C22509d c22509d = new C22509d();
                Handler handler = new Handler(Looper.getMainLooper());
                c22509d.f88220e = handler;
                RunnableC1645z0 runnableC1645z0 = new RunnableC1645z0(c22509d, 16);
                c22509d.f88221f = runnableC1645z0;
                handler.postDelayed(runnableC1645z0, 60000L);
                return c22509d;
            default:
                return new C22510e();
        }
    }
}
