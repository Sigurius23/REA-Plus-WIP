package ml;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import io.sentry.internal.debugmeta.C20378c;
import p085d9.C11787e;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: ml.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C25660b implements InterfaceC25659a {

    /* JADX INFO: renamed from: E */
    public final C11787e f100912E = new C11787e(this, 3);

    /* JADX INFO: renamed from: w */
    public final Context f100913w;

    /* JADX INFO: renamed from: x */
    public final C20378c f100914x;

    /* JADX INFO: renamed from: y */
    public boolean f100915y;

    /* JADX INFO: renamed from: z */
    public boolean f100916z;

    public C25660b(Context context, C20378c c20378c) {
        this.f100913w = context.getApplicationContext();
        this.f100914x = c20378c;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m75554i(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        AbstractC29125c.m88539p(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e5) {
            if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                return true;
            }
            Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e5);
            return true;
        }
    }

    @Override // ml.InterfaceC25662d
    public final void onDestroy() {
    }

    @Override // ml.InterfaceC25662d
    public final void onStart() {
        if (this.f100916z) {
            return;
        }
        Context context = this.f100913w;
        this.f100915y = m75554i(context);
        try {
            context.registerReceiver(this.f100912E, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f100916z = true;
        } catch (SecurityException e5) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e5);
            }
        }
    }

    @Override // ml.InterfaceC25662d
    public final void onStop() {
        if (this.f100916z) {
            this.f100913w.unregisterReceiver(this.f100912E);
            this.f100916z = false;
        }
    }
}
