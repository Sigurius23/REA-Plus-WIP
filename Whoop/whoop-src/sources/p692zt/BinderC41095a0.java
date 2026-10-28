package p692zt;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.profileinstaller.ExecutorC1651b;
import vd1.C35909c;
import zd3.C40576t;

/* JADX INFO: renamed from: zt.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC41095a0 extends Binder {

    /* JADX INFO: renamed from: f */
    public final C40576t f177176f;

    public BinderC41095a0(C40576t c40576t) {
        this.f177176f = c40576t;
    }

    /* JADX INFO: renamed from: a */
    public final void m133433a(C41097b0 c41097b0) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        AbstractServiceC41104h.m133438a((AbstractServiceC41104h) this.f177176f.f174764a, c41097b0.f177179a).addOnCompleteListener(new ExecutorC1651b(0), new C35909c(c41097b0, 6));
    }
}
