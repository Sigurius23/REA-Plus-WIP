package p197hj;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.amplitude.android.engagement.C4861a;

/* JADX INFO: renamed from: hj.k */
/* JADX INFO: loaded from: classes.dex */
public final class C17328k implements InterfaceC17318a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4861a f67119a;

    public C17328k(C4861a c4861a) {
        this.f67119a = c4861a;
    }

    @Override // p197hj.InterfaceC17318a
    /* JADX INFO: renamed from: a */
    public final void mo49082a(Activity activity) {
        Handler handler = new Handler(Looper.getMainLooper());
        C4861a c4861a = this.f67119a;
        handler.postDelayed(new RunnableC17323f(c4861a, activity, 1), 100L);
        c4861a.m15520f(activity);
    }
}
