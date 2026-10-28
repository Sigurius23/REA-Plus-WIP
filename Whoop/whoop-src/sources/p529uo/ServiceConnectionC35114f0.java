package p529uo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p655yo.C39678a;
import p687zo.AbstractC40912e;

/* JADX INFO: renamed from: uo.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC35114f0 implements ServiceConnection {

    /* JADX INFO: renamed from: E */
    public final C35112e0 f149004E;

    /* JADX INFO: renamed from: F */
    public ComponentName f149005F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C35118h0 f149006G;

    /* JADX INFO: renamed from: w */
    public final HashMap f149007w = new HashMap();

    /* JADX INFO: renamed from: x */
    public int f149008x = 2;

    /* JADX INFO: renamed from: y */
    public boolean f149009y;

    /* JADX INFO: renamed from: z */
    public IBinder f149010z;

    public ServiceConnectionC35114f0(C35118h0 c35118h0, C35112e0 c35112e0) {
        this.f149006G = c35118h0;
        this.f149004E = c35112e0;
    }

    /* JADX INFO: renamed from: a */
    public final C4969a m111069a(String str, Executor executor) throws Throwable {
        try {
            Intent intentM111098a = AbstractC35136x.m111098a(this.f149006G.f149033b, this.f149004E);
            this.f149008x = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(AbstractC40912e.m132602a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                C35118h0 c35118h0 = this.f149006G;
                C39678a c39678a = c35118h0.f149035d;
                Context context = c35118h0.f149033b;
                C35112e0 c35112e0 = this.f149004E;
                try {
                    boolean zM126909c = c39678a.m126909c(context, str, intentM111098a, this, 4225, executor);
                    this.f149009y = zM126909c;
                    if (zM126909c) {
                        c35118h0.f149034c.sendMessageDelayed(c35118h0.f149034c.obtainMessage(1, c35112e0), c35118h0.f149037f);
                        C4969a c4969a = C4969a.f20478E;
                        StrictMode.setVmPolicy(vmPolicy);
                        return c4969a;
                    }
                    this.f149008x = 2;
                    try {
                        c35118h0.f149035d.m126908b(c35118h0.f149033b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    C4969a c4969a2 = new C4969a(16);
                    StrictMode.setVmPolicy(vmPolicy);
                    return c4969a2;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (zzaf e5) {
            return e5.f20541w;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C35118h0 c35118h0 = this.f149006G;
        synchronized (c35118h0.f149032a) {
            try {
                c35118h0.f149034c.removeMessages(1, this.f149004E);
                this.f149010z = iBinder;
                this.f149005F = componentName;
                Iterator it = this.f149007w.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f149008x = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C35118h0 c35118h0 = this.f149006G;
        synchronized (c35118h0.f149032a) {
            try {
                c35118h0.f149034c.removeMessages(1, this.f149004E);
                this.f149010z = null;
                this.f149005F = componentName;
                Iterator it = this.f149007w.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f149008x = 2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
