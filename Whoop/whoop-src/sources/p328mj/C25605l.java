package p328mj;

import android.app.Activity;
import java.lang.ref.WeakReference;
import p197hj.InterfaceC17318a;

/* JADX INFO: renamed from: mj.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C25605l implements InterfaceC17318a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C25609p f100453a;

    public C25605l(C25609p c25609p) {
        this.f100453a = c25609p;
    }

    @Override // p197hj.InterfaceC17318a
    /* JADX INFO: renamed from: a */
    public final void mo49082a(Activity activity) {
        C25609p c25609p = this.f100453a;
        c25609p.m75334d();
        c25609p.f100467g = new WeakReference(activity);
        c25609p.m75333c();
    }
}
