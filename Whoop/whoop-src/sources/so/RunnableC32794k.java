package so;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p073cq.RunnableC11044m;
import pg3.C29203o;

/* JADX INFO: renamed from: so.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC32794k implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f136484w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ServiceConnectionC32796m f136485x;

    public /* synthetic */ RunnableC32794k(ServiceConnectionC32796m serviceConnectionC32796m, int i13) {
        this.f136484w = i13;
        this.f136485x = serviceConnectionC32796m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f136484w) {
            case 0:
                break;
            default:
                ServiceConnectionC32796m serviceConnectionC32796m = this.f136485x;
                synchronized (serviceConnectionC32796m) {
                    if (serviceConnectionC32796m.f136489w == 1) {
                        serviceConnectionC32796m.m102848a("Timed out while binding");
                    }
                    break;
                }
                return;
        }
        while (true) {
            ServiceConnectionC32796m serviceConnectionC32796m2 = this.f136485x;
            synchronized (serviceConnectionC32796m2) {
                try {
                    if (serviceConnectionC32796m2.f136489w != 2) {
                        return;
                    }
                    if (serviceConnectionC32796m2.f136492z.isEmpty()) {
                        serviceConnectionC32796m2.m102850c();
                        return;
                    }
                    C32797n c32797n = (C32797n) serviceConnectionC32796m2.f136492z.poll();
                    serviceConnectionC32796m2.f136487E.put(c32797n.f136493a, c32797n);
                    ((ScheduledExecutorService) serviceConnectionC32796m2.f136488F.f136501c).schedule(new RunnableC11044m(serviceConnectionC32796m2, c32797n, false, 13), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(c32797n)));
                    }
                    C32798o c32798o = serviceConnectionC32796m2.f136488F;
                    Messenger messenger = serviceConnectionC32796m2.f136490x;
                    int i13 = c32797n.f136495c;
                    Context context = (Context) c32798o.f136500b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i13;
                    messageObtain.arg1 = c32797n.f136493a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", c32797n.m102852a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", c32797n.f136496d);
                    messageObtain.setData(bundle);
                    try {
                        C29203o c29203o = serviceConnectionC32796m2.f136491y;
                        Messenger messenger2 = (Messenger) c29203o.f118198w;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            C32791h c32791h = (C32791h) c29203o.f118199x;
                            if (c32791h == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            c32791h.m102847b(messageObtain);
                        }
                    } catch (RemoteException e5) {
                        serviceConnectionC32796m2.m102848a(e5.getMessage());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
