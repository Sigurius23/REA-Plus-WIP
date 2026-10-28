package to;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: to.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C34007z extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public Context f142510a;

    /* JADX INFO: renamed from: b */
    public final AbstractC34006y f142511b;

    public C34007z(AbstractC34006y abstractC34006y) {
        this.f142511b = abstractC34006y;
    }

    /* JADX INFO: renamed from: a */
    public final void m107492a(Context context) {
        this.f142510a = context;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m107493b() {
        try {
            Context context = this.f142510a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f142510a = null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f142511b.mo107467a();
            m107493b();
        }
    }
}
