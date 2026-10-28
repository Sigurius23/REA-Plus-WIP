package bl2;

import android.view.View;
import com.whoop.training.activitydetection.ActivityDetectionFragment;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bl2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3372a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13166w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ActivityDetectionFragment f13167x;

    public /* synthetic */ C3372a(ActivityDetectionFragment activityDetectionFragment, int i13) {
        this.f13166w = i13;
        this.f13167x = activityDetectionFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13166w) {
            case 0:
                return ActivityDetectionFragment.m26537O(this.f13167x, (C3373b) obj);
            case 1:
                return ActivityDetectionFragment.m26535M(this.f13167x, (C3376e) obj);
            case 2:
                return ActivityDetectionFragment.m26532J(this.f13167x, (View) obj);
            default:
                return ActivityDetectionFragment.m26533K(this.f13167x, (View) obj);
        }
    }
}
