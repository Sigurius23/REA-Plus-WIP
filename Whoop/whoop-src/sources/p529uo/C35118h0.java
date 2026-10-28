package p529uo;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.C4969a;
import java.util.HashMap;
import jp.HandlerC21846d;
import p655yo.C39678a;

/* JADX INFO: renamed from: uo.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C35118h0 {

    /* JADX INFO: renamed from: g */
    public static final Object f149029g = new Object();

    /* JADX INFO: renamed from: h */
    public static C35118h0 f149030h;

    /* JADX INFO: renamed from: i */
    public static HandlerThread f149031i;

    /* JADX INFO: renamed from: a */
    public final HashMap f149032a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f149033b;

    /* JADX INFO: renamed from: c */
    public volatile HandlerC21846d f149034c;

    /* JADX INFO: renamed from: d */
    public final C39678a f149035d;

    /* JADX INFO: renamed from: e */
    public final long f149036e;

    /* JADX INFO: renamed from: f */
    public final long f149037f;

    public C35118h0(Context context, Looper looper) {
        C35116g0 c35116g0 = new C35116g0(this);
        this.f149033b = context.getApplicationContext();
        HandlerC21846d handlerC21846d = new HandlerC21846d(looper, c35116g0);
        Looper.getMainLooper();
        this.f149034c = handlerC21846d;
        this.f149035d = C39678a.m126907a();
        this.f149036e = 5000L;
        this.f149037f = 300000L;
    }

    /* JADX INFO: renamed from: a */
    public final C4969a m111070a(C35112e0 c35112e0, ServiceConnectionC35104a0 serviceConnectionC35104a0, String str) {
        HashMap map = this.f149032a;
        synchronized (map) {
            try {
                ServiceConnectionC35114f0 serviceConnectionC35114f0 = (ServiceConnectionC35114f0) map.get(c35112e0);
                C4969a c4969aM111069a = null;
                if (serviceConnectionC35114f0 == null) {
                    serviceConnectionC35114f0 = new ServiceConnectionC35114f0(this, c35112e0);
                    serviceConnectionC35114f0.f149007w.put(serviceConnectionC35104a0, serviceConnectionC35104a0);
                    c4969aM111069a = serviceConnectionC35114f0.m111069a(str, null);
                    map.put(c35112e0, serviceConnectionC35114f0);
                } else {
                    this.f149034c.removeMessages(0, c35112e0);
                    if (serviceConnectionC35114f0.f149007w.containsKey(serviceConnectionC35104a0)) {
                        String string = c35112e0.toString();
                        StringBuilder sb4 = new StringBuilder(string.length() + 81);
                        sb4.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb4.append(string);
                        throw new IllegalStateException(sb4.toString());
                    }
                    serviceConnectionC35114f0.f149007w.put(serviceConnectionC35104a0, serviceConnectionC35104a0);
                    int i13 = serviceConnectionC35114f0.f149008x;
                    if (i13 == 1) {
                        serviceConnectionC35104a0.onServiceConnected(serviceConnectionC35114f0.f149005F, serviceConnectionC35114f0.f149010z);
                    } else if (i13 == 2) {
                        c4969aM111069a = serviceConnectionC35114f0.m111069a(str, null);
                    }
                }
                if (serviceConnectionC35114f0.f149009y) {
                    return C4969a.f20478E;
                }
                if (c4969aM111069a == null) {
                    c4969aM111069a = new C4969a(-1);
                }
                return c4969aM111069a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m111071b(String str, ServiceConnection serviceConnection, boolean z4) {
        C35112e0 c35112e0 = new C35112e0(str, z4);
        AbstractC35135w.m111095g(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f149032a;
        synchronized (map) {
            try {
                ServiceConnectionC35114f0 serviceConnectionC35114f0 = (ServiceConnectionC35114f0) map.get(c35112e0);
                if (serviceConnectionC35114f0 == null) {
                    String string = c35112e0.toString();
                    StringBuilder sb4 = new StringBuilder(string.length() + 50);
                    sb4.append("Nonexistent connection status for service config: ");
                    sb4.append(string);
                    throw new IllegalStateException(sb4.toString());
                }
                if (!serviceConnectionC35114f0.f149007w.containsKey(serviceConnection)) {
                    String string2 = c35112e0.toString();
                    StringBuilder sb5 = new StringBuilder(string2.length() + 76);
                    sb5.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb5.append(string2);
                    throw new IllegalStateException(sb5.toString());
                }
                serviceConnectionC35114f0.f149007w.remove(serviceConnection);
                if (serviceConnectionC35114f0.f149007w.isEmpty()) {
                    this.f149034c.sendMessageDelayed(this.f149034c.obtainMessage(0, c35112e0), this.f149036e);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
