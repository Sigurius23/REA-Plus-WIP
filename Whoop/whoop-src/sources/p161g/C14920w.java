package p161g;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.w */
/* JADX INFO: loaded from: classes.dex */
public final class C14920w implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14918u f55604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C14918u f55605b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C14919v f55606c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C14919v f55607d;

    public C14920w(C14918u c14918u, C14918u c14918u2, C14919v c14919v, C14919v c14919v2) {
        this.f55604a = c14918u;
        this.f55605b = c14918u2;
        this.f55606c = c14919v;
        this.f55607d = c14919v2;
    }

    public final void onBackCancelled() {
        this.f55607d.invoke();
    }

    public final void onBackInvoked() {
        this.f55606c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC22676k.m65750j(backEvent, "backEvent");
        this.f55605b.invoke(new C14894a(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC22676k.m65750j(backEvent, "backEvent");
        this.f55604a.invoke(new C14894a(backEvent));
    }
}
