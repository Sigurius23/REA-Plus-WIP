package p426qi;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;
import p014aj.C0929d;
import p420qc.C30194d;

/* JADX INFO: renamed from: qi.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC30379e implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f124654w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f124655x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f124656y;

    public /* synthetic */ CallableC30379e(Object obj, int i13, int i14) {
        this.f124654w = i14;
        this.f124656y = obj;
        this.f124655x = i13;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f124654w) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f124656y;
                boolean z4 = lottieAnimationView.f20250J;
                int i13 = this.f124655x;
                if (!z4) {
                    return AbstractC30391l.m92868g(lottieAnimationView.getContext(), i13, null);
                }
                Context context = lottieAnimationView.getContext();
                return AbstractC30391l.m92868g(context, i13, AbstractC30391l.m92873l(context, i13));
            default:
                WorkDatabase workDatabase = (WorkDatabase) ((C0929d) this.f124656y).f3422w;
                Long lM92417a = workDatabase.mo5516c().m92417a("next_job_scheduler_id");
                int i14 = 0;
                int iLongValue = lM92417a != null ? (int) lM92417a.longValue() : 0;
                workDatabase.mo5516c().m92418b(new C30194d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > this.f124655x) {
                    workDatabase.mo5516c().m92418b(new C30194d("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i14 = iLongValue;
                }
                return Integer.valueOf(i14);
        }
    }
}
