package p085d9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.health.platform.client.proto.C1533u;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.google.firebase.messaging.FirebaseMessaging;
import d30.C11535h;
import io.sentry.internal.debugmeta.C20378c;
import java.util.concurrent.Executor;
import lr.RunnableC24693e;
import ml.C25660b;
import p027b3.AbstractC2351b;
import p133f1.C13968p1;
import p309lo.AbstractC24567y;
import p309lo.C24559q;
import p309lo.C24560r;
import p450r5.RunnableC30928b;
import p465rm.C31543j1;
import p516u8.C34586d;
import p607x8.C38058m;
import p692zt.RunnableC41115s;
import ro.C31624i;

/* JADX INFO: renamed from: d9.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C11787e extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38221a;

    /* JADX INFO: renamed from: b */
    public Object f38222b;

    public /* synthetic */ C11787e(Object obj, int i13) {
        this.f38221a = i13;
        this.f38222b = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m31605a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((RunnableC41115s) this.f38222b).f177233y.f21616b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:63:0x010d  */
    /* JADX WARN: Code duplicated, block: B:64:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i13;
        switch (this.f38221a) {
            case 0:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C11535h c11535h = (C11535h) this.f38222b;
                c11535h.m30992b(C11781b.m31592b(context, intent, (C34586d) c11535h.f37193j, (C31624i) c11535h.f37192i));
                return;
            case 1:
                C24560r c24560r = (C24560r) this.f38222b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i13 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i13 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            i13 = 9;
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i13 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                        i13 = 4;
                                        break;
                                    case 13:
                                        i13 = 5;
                                        break;
                                    case 16:
                                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                    default:
                                        i13 = 6;
                                        break;
                                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                        i13 = 2;
                                        break;
                                    case 20:
                                        if (AbstractC24567y.f95875a < 29) {
                                            i13 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i13 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i13 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                        i13 = 4;
                                        break;
                                    case 13:
                                        i13 = 5;
                                        break;
                                    case 16:
                                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                    default:
                                        i13 = 6;
                                        break;
                                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                        i13 = 2;
                                        break;
                                    case 20:
                                        if (AbstractC24567y.f95875a < 29) {
                                            i13 = 0;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i13 = type != 9 ? 8 : 7;
                            } else {
                                i13 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i14 = AbstractC24567y.f95875a;
                if (i14 >= 29 && i13 == 5) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        C24559q c24559q = new C24559q(c24560r);
                        if (i14 < 31) {
                            telephonyManager.listen(c24559q, 1);
                        } else {
                            telephonyManager.listen(c24559q, 1048576);
                        }
                        telephonyManager.listen(c24559q, 0);
                        return;
                    } catch (RuntimeException unused2) {
                    }
                }
                C24560r.m71617a(c24560r, i13);
                return;
            case 2:
                ((AbstractC2351b) this.f38222b).mo7243B();
                return;
            case 3:
                C25660b c25660b = (C25660b) this.f38222b;
                boolean z4 = c25660b.f100915y;
                c25660b.f100915y = C25660b.m75554i(context);
                if (z4 != ((C25660b) this.f38222b).f100915y) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + ((C25660b) this.f38222b).f100915y);
                    }
                    C25660b c25660b2 = (C25660b) this.f38222b;
                    C20378c c20378c = c25660b2.f100914x;
                    if (!c25660b2.f100915y) {
                        c20378c.getClass();
                        return;
                    }
                    synchronized (((ComponentCallbacks2C4966h) c20378c.f76423y)) {
                        ((C13968p1) c20378c.f76422x).m39761s();
                        break;
                    }
                    return;
                }
                return;
            case 4:
                C31543j1 c31543j1 = (C31543j1) this.f38222b;
                ((Handler) c31543j1.f130199e).post(new RunnableC24693e(c31543j1, 16));
                return;
            case 5:
                ((Executor) ((C38058m) this.f38222b).f163011c).execute(new RunnableC30928b(20, this, context));
                return;
            default:
                RunnableC41115s runnableC41115s = (RunnableC41115s) this.f38222b;
                if (runnableC41115s != null && runnableC41115s.m133480a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    RunnableC41115s runnableC41115s2 = (RunnableC41115s) this.f38222b;
                    runnableC41115s2.f177233y.getClass();
                    FirebaseMessaging.m16383b(runnableC41115s2, 0L);
                    ((RunnableC41115s) this.f38222b).f177233y.f21616b.unregisterReceiver(this);
                    this.f38222b = null;
                    return;
                }
                return;
        }
    }

    public C11787e(RunnableC41115s runnableC41115s) {
        this.f38221a = 6;
        this.f38222b = runnableC41115s;
    }
}
