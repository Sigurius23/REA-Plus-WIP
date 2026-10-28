package p197hj;

import android.app.Activity;
import com.amplitude.android.engagement.C4861a;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hj.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC17323f implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67105w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4861a f67106x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Activity f67107y;

    public /* synthetic */ RunnableC17323f(C4861a c4861a, Activity activity, int i13) {
        this.f67105w = i13;
        this.f67106x = c4861a;
        this.f67107y = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f67105w;
        Activity activity = this.f67107y;
        C4861a this$0 = this.f67106x;
        switch (i13) {
            case 0:
                AbstractC22676k.m65750j(this$0, "this$0");
                this$0.m15519e(activity, true);
                break;
            default:
                C23470p c23470p = C4861a.f20258n;
                this$0.m15519e(activity, false);
                break;
        }
    }
}
