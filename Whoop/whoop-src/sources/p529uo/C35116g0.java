package p529uo;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: uo.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C35116g0 implements Handler.Callback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C35118h0 f149027w;

    public /* synthetic */ C35116g0(C35118h0 c35118h0) {
        this.f149027w = c35118h0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i13 = message.what;
        if (i13 == 0) {
            C35118h0 c35118h0 = this.f149027w;
            synchronized (c35118h0.f149032a) {
                try {
                    C35112e0 c35112e0 = (C35112e0) message.obj;
                    ServiceConnectionC35114f0 serviceConnectionC35114f0 = (ServiceConnectionC35114f0) c35118h0.f149032a.get(c35112e0);
                    if (serviceConnectionC35114f0 != null && serviceConnectionC35114f0.f149007w.isEmpty()) {
                        if (serviceConnectionC35114f0.f149009y) {
                            C35112e0 c35112e1 = serviceConnectionC35114f0.f149004E;
                            C35118h0 c35118h1 = serviceConnectionC35114f0.f149006G;
                            c35118h1.f149034c.removeMessages(1, c35112e1);
                            c35118h1.f149035d.m126908b(c35118h1.f149033b, serviceConnectionC35114f0);
                            serviceConnectionC35114f0.f149009y = false;
                            serviceConnectionC35114f0.f149008x = 2;
                        }
                        c35118h0.f149032a.remove(c35112e0);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
        if (i13 != 1) {
            return false;
        }
        C35118h0 c35118h2 = this.f149027w;
        synchronized (c35118h2.f149032a) {
            try {
                C35112e0 c35112e2 = (C35112e0) message.obj;
                ServiceConnectionC35114f0 serviceConnectionC35114f1 = (ServiceConnectionC35114f0) c35118h2.f149032a.get(c35112e2);
                if (serviceConnectionC35114f1 != null && serviceConnectionC35114f1.f149008x == 3) {
                    String strValueOf = String.valueOf(c35112e2);
                    StringBuilder sb4 = new StringBuilder(strValueOf.length() + 47);
                    sb4.append("Timeout waiting for ServiceConnection callback ");
                    sb4.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb4.toString(), new Exception());
                    ComponentName componentName = serviceConnectionC35114f1.f149005F;
                    if (componentName == null) {
                        c35112e2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c35112e2.f148996b;
                        AbstractC35135w.m111094f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    serviceConnectionC35114f1.onServiceDisconnected(componentName);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return true;
    }
}
