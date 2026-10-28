package p179h;

import androidx.core.app.ActivityOptionsCompat;
import l83.C23454a0;
import p236j.AbstractC21065d;
import p236j.C21070i;

/* JADX INFO: renamed from: h.i */
/* JADX INFO: loaded from: classes.dex */
public final class C16351i extends AbstractC21065d {

    /* JADX INFO: renamed from: a */
    public final C16343a f62867a;

    public C16351i(C16343a c16343a) {
        this.f62867a = c16343a;
    }

    @Override // p236j.AbstractC21065d
    /* JADX INFO: renamed from: a */
    public final void mo4052a(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        C23454a0 c23454a0;
        C21070i c21070i = this.f62867a.f62849a;
        if (c21070i != null) {
            c21070i.mo4052a(obj, activityOptionsCompat);
            c23454a0 = C23454a0.f92919a;
        } else {
            c23454a0 = null;
        }
        if (c23454a0 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    @Override // p236j.AbstractC21065d
    /* JADX INFO: renamed from: b */
    public final void mo4053b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
