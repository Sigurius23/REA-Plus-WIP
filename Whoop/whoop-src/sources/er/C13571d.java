package er;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p161g.C14894a;

/* JADX INFO: renamed from: er.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C13571d implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13569b f47920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13572e f47921b;

    public C13571d(C13572e c13572e, InterfaceC13569b interfaceC13569b) {
        this.f47921b = c13572e;
        this.f47920a = interfaceC13569b;
    }

    public final void onBackCancelled() {
        if (this.f47921b.f47919a != null) {
            this.f47920a.mo15709c();
        }
    }

    public final void onBackInvoked() {
        this.f47920a.mo15711d();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f47921b.f47919a != null) {
            this.f47920a.mo15705a(new C14894a(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f47921b.f47919a != null) {
            this.f47920a.mo15707b(new C14894a(backEvent));
        }
    }
}
