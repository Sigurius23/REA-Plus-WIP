package p197hj;

import com.amplitude.android.engagement.C4861a;
import java.util.Map;
import m83.AbstractC25247g0;
import p031b9.AbstractC2875y;
import p328mj.C25609p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hj.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC17321d implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67100w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4861a f67101x;

    public /* synthetic */ RunnableC17321d(C4861a c4861a, int i13) {
        this.f67100w = i13;
        this.f67101x = c4861a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67100w) {
            case 0:
                C4861a this$0 = this.f67101x;
                AbstractC22676k.m65750j(this$0, "this$0");
                for (Map.Entry entry : AbstractC25247g0.m74001j0(this$0.f20265f).entrySet()) {
                    ((Number) entry.getKey()).intValue();
                    try {
                        ((C25609p) entry.getValue()).m75331a();
                    } catch (Exception e5) {
                        C4861a.f20259o.m16032K(AbstractC2875y.m8298k(e5, new StringBuilder("Error cleaning up nudge view manager during cleanup: ")));
                    }
                }
                break;
            default:
                this.f67101x.m15519e(C17338u.f67142w.m49083a(), false);
                break;
        }
    }
}
