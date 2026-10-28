package p692zt;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p020ap.ThreadFactoryC1879b;
import p085d9.C11787e;

/* JADX INFO: renamed from: zt.s */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC41115s implements Runnable {

    /* JADX INFO: renamed from: w */
    public final long f177231w;

    /* JADX INFO: renamed from: x */
    public final PowerManager.WakeLock f177232x;

    /* JADX INFO: renamed from: y */
    public final FirebaseMessaging f177233y;

    /* JADX INFO: renamed from: z */
    public final ThreadPoolExecutor f177234z = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1879b("firebase-iid-executor"));

    public RunnableC41115s(FirebaseMessaging firebaseMessaging, long j7) {
        this.f177233y = firebaseMessaging;
        this.f177231w = j7;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f21616b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f177232x = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m133480a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f177233y.f21616b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m133481b() throws IOException {
        try {
            if (this.f177233y.m16386a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e5) {
            String message = e5.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e5.getMessage() != null) {
                    throw e5;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e5.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f177232x;
        C41113q c41113qM133448u = C41113q.m133448u();
        FirebaseMessaging firebaseMessaging = this.f177233y;
        if (c41113qM133448u.m133477z(firebaseMessaging.f21616b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f21623i = true;
                }
                if (!firebaseMessaging.f21622h.m56018e()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f21623i = false;
                    }
                    if (C41113q.m133448u().m133477z(firebaseMessaging.f21616b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (C41113q.m133448u().m133476y(firebaseMessaging.f21616b) && !m133480a()) {
                    new C11787e(this).m31605a();
                    if (C41113q.m133448u().m133477z(firebaseMessaging.f21616b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (m133481b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f21623i = false;
                    }
                } else {
                    firebaseMessaging.m16391i(this.f177231w);
                }
                if (C41113q.m133448u().m133477z(firebaseMessaging.f21616b)) {
                    wakeLock.release();
                }
            } catch (IOException e5) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e5.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f21623i = false;
                    if (C41113q.m133448u().m133477z(firebaseMessaging.f21616b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th3) {
            if (C41113q.m133448u().m133477z(firebaseMessaging.f21616b)) {
                wakeLock.release();
            }
            throw th3;
        }
    }
}
