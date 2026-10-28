package p009a8;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import nh3.AbstractC26725a;
import p546v7.C35752b;
import qg3.C30352d;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: a8.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C0532b implements Handler.Callback {

    /* JADX INFO: renamed from: w */
    public final Context f1842w;

    /* JADX INFO: renamed from: x */
    public final Handler f1843x;

    /* JADX INFO: renamed from: y */
    public final HashMap f1844y = new HashMap();

    public C0532b(Context context, Looper looper) {
        this.f1842w = context;
        this.f1843x = new Handler(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C30352d c30352d;
        int i13 = message.what;
        Handler handler = this.f1843x;
        switch (i13) {
            case 1:
                ServiceConnectionC0536f serviceConnectionC0536f = (ServiceConnectionC0536f) message.obj;
                HashMap map = serviceConnectionC0536f.f1850E;
                ConcurrentLinkedQueue concurrentLinkedQueue = serviceConnectionC0536f.f1857x;
                for (Map.Entry entry : map.entrySet()) {
                    AbstractC37978j.m121657r("ServiceConnection", "Re-registering listener: " + entry.getKey());
                    serviceConnectionC0536f.m1305c((C0531a) entry.getValue());
                }
                concurrentLinkedQueue.add((C0531a) serviceConnectionC0536f.f1858y.f124536y);
                for (C0531a c0531a : new ArrayList(concurrentLinkedQueue)) {
                    if (concurrentLinkedQueue.remove(c0531a)) {
                        serviceConnectionC0536f.m1305c(c0531a);
                    }
                }
                handler.removeMessages(6, serviceConnectionC0536f);
                handler.sendMessageDelayed(handler.obtainMessage(6, serviceConnectionC0536f), 15000L);
                return true;
            case 2:
                ServiceConnectionC0536f serviceConnectionC0536f2 = (ServiceConnectionC0536f) message.obj;
                C30352d c30352d2 = serviceConnectionC0536f2.f1858y;
                if (serviceConnectionC0536f2.f1850E.isEmpty()) {
                    c30352d2.getClass();
                    AbstractC37978j.m121657r("ServiceConnection", "No listeners registered, service HealthData is not automatically reconnected.");
                    return true;
                }
                serviceConnectionC0536f2.f1854I++;
                c30352d2.getClass();
                AbstractC37978j.m121657r("ServiceConnection", "Listeners for service HealthData are registered, reconnecting.");
                serviceConnectionC0536f2.m1304b();
                return true;
            case 3:
                C0531a c0531a2 = (C0531a) message.obj;
                switch (c0531a2.f1840a) {
                    case 0:
                        c30352d = (C30352d) c0531a2.f1841b;
                        break;
                    default:
                        c30352d = ((C35752b) c0531a2.f1841b).f152038a;
                        break;
                }
                String strM92817q = c30352d.m92817q();
                HashMap map2 = this.f1844y;
                ServiceConnectionC0536f serviceConnectionC0536f3 = (ServiceConnectionC0536f) map2.get(strM92817q);
                if (serviceConnectionC0536f3 == null) {
                    serviceConnectionC0536f3 = new ServiceConnectionC0536f(this.f1842w, c30352d, new C0534d(0), this);
                    map2.put(strM92817q, serviceConnectionC0536f3);
                }
                IBinder iBinder = serviceConnectionC0536f3.f1852G;
                if (iBinder == null || !iBinder.isBinderAlive()) {
                    serviceConnectionC0536f3.f1857x.add(c0531a2);
                    serviceConnectionC0536f3.m1304b();
                } else {
                    serviceConnectionC0536f3.m1305c(c0531a2);
                }
                handler.removeMessages(6, serviceConnectionC0536f3);
                handler.sendMessageDelayed(handler.obtainMessage(6, serviceConnectionC0536f3), 15000L);
                return true;
            case 4:
                throw AbstractC26725a.m79500d(message.obj);
            case 5:
                throw AbstractC26725a.m79500d(message.obj);
            case 6:
                ServiceConnectionC0536f serviceConnectionC0536f4 = (ServiceConnectionC0536f) message.obj;
                if (!handler.hasMessages(3) && !handler.hasMessages(4) && !handler.hasMessages(5)) {
                    if (serviceConnectionC0536f4.f1857x.isEmpty() && serviceConnectionC0536f4.f1850E.isEmpty()) {
                        serviceConnectionC0536f4.m1307e();
                        return true;
                    }
                    handler.removeMessages(6, serviceConnectionC0536f4);
                    handler.sendMessageDelayed(handler.obtainMessage(6, serviceConnectionC0536f4), 15000L);
                }
                return true;
            default:
                Log.e("ConnectionManager", "Received unknown message: " + message.what);
                return false;
        }
    }
}
