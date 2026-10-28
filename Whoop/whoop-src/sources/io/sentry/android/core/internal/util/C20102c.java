package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20431n0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20441o0;
import io.sentry.InterfaceC20454p0;
import io.sentry.InterfaceC20602v0;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.AbstractC20118j0;
import io.sentry.android.core.C20071e0;
import io.sentry.android.core.C20121k0;
import io.sentry.android.core.InterfaceC20060b0;
import io.sentry.util.C20579a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20102c implements InterfaceC20454p0, InterfaceC20060b0 {

    /* JADX INFO: renamed from: M */
    public static volatile ConnectivityManager f75511M;

    /* JADX INFO: renamed from: E */
    public final ArrayList f75516E;

    /* JADX INFO: renamed from: F */
    public final C20579a f75517F;

    /* JADX INFO: renamed from: G */
    public volatile C20101b f75518G;

    /* JADX INFO: renamed from: H */
    public volatile NetworkCapabilities f75519H;

    /* JADX INFO: renamed from: I */
    public volatile Network f75520I;

    /* JADX INFO: renamed from: J */
    public volatile long f75521J;

    /* JADX INFO: renamed from: K */
    public final AtomicBoolean f75522K;

    /* JADX INFO: renamed from: w */
    public final Context f75523w;

    /* JADX INFO: renamed from: x */
    public final C20513q6 f75524x;

    /* JADX INFO: renamed from: y */
    public final C20121k0 f75525y;

    /* JADX INFO: renamed from: z */
    public final C20103d f75526z;

    /* JADX INFO: renamed from: L */
    public static final C20579a f75510L = new C20579a();

    /* JADX INFO: renamed from: N */
    public static final C20579a f75512N = new C20579a();

    /* JADX INFO: renamed from: O */
    public static final ArrayList f75513O = new ArrayList();

    /* JADX INFO: renamed from: P */
    public static final int[] f75514P = {1, 0, 3, 2};

    /* JADX INFO: renamed from: Q */
    public static final int[] f75515Q = new int[2];

    public C20102c(Context context, C20513q6 c20513q6, C20121k0 c20121k0) {
        C20103d c20103d = C20103d.f75527w;
        this.f75517F = new C20579a();
        this.f75521J = 0L;
        this.f75522K = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.f75523w = applicationContext != null ? applicationContext : context;
        this.f75524x = c20513q6;
        this.f75525y = c20121k0;
        this.f75526z = c20103d;
        this.f75516E = new ArrayList();
        int[] iArr = f75515Q;
        iArr[0] = 12;
        iArr[1] = 16;
        m55987T(new RunnableC20100a(this, 0));
        C20071e0.f75391E.m55941b(this);
    }

    /* JADX INFO: renamed from: J */
    public static ConnectivityManager m55982J(Context context, InterfaceC20602v0 interfaceC20602v0) {
        if (f75511M != null) {
            return f75511M;
        }
        C20535s c20535sM56711a = f75510L.m56711a();
        try {
            if (f75511M != null) {
                ConnectivityManager connectivityManager = f75511M;
                c20535sM56711a.close();
                return connectivityManager;
            }
            f75511M = (ConnectivityManager) context.getSystemService("connectivity");
            if (f75511M == null) {
                interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f75511M;
            c20535sM56711a.close();
            return connectivityManager2;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m55983b(Context context, InterfaceC20602v0 interfaceC20602v0, C20121k0 c20121k0, ConnectivityManager.NetworkCallback networkCallback) {
        c20121k0.getClass();
        if (!AbstractC37056f.m118954F(context)) {
            interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        C20535s c20535sM56711a = f75512N.m56711a();
        try {
            f75513O.add(networkCallback);
            c20535sM56711a.close();
            return true;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m55984s(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20454p0
    /* JADX INFO: renamed from: G */
    public final String mo55985G() {
        this.f75526z.getClass();
        if (SystemClock.uptimeMillis() - this.f75521J >= 120000) {
            m55990b0(null);
        }
        return m55994x();
    }

    @Override // io.sentry.InterfaceC20454p0
    /* JADX INFO: renamed from: K0 */
    public final boolean mo55986K0(InterfaceC20441o0 interfaceC20441o0) {
        C20535s c20535sM56711a = this.f75517F.m56711a();
        try {
            this.f75516E.add(interfaceC20441o0);
            c20535sM56711a.close();
            m55991h();
            return this.f75518G != null;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m55987T(Runnable runnable) {
        C20513q6 c20513q6 = this.f75524x;
        try {
            c20513q6.getExecutorService().submit(runnable);
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "AndroidConnectionStatusProvider submit failed", th3);
        }
    }

    @Override // io.sentry.InterfaceC20454p0
    /* JADX INFO: renamed from: W0 */
    public final void mo55988W0(InterfaceC20441o0 interfaceC20441o0) {
        C20535s c20535sM56711a = this.f75517F.m56711a();
        try {
            this.f75516E.remove(interfaceC20441o0);
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m55989a0(boolean z4) {
        C20535s c20535sM56711a = this.f75517F.m56711a();
        if (z4) {
            try {
                this.f75516E.clear();
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        C20101b c20101b = this.f75518G;
        this.f75518G = null;
        if (c20101b != null) {
            Context context = this.f75523w;
            InterfaceC20602v0 logger = this.f75524x.getLogger();
            ConnectivityManager connectivityManagerM55982J = m55982J(context, logger);
            if (connectivityManagerM55982J != null) {
                try {
                    connectivityManagerM55982J.unregisterNetworkCallback(c20101b);
                } catch (Throwable th5) {
                    logger.mo16060j(EnumC20436n5.WARNING, "unregisterNetworkCallback failed", th5);
                }
            }
        }
        this.f75519H = null;
        this.f75520I = null;
        this.f75521J = 0L;
        c20535sM56711a.close();
        this.f75524x.getLogger().mo16066m(EnumC20436n5.DEBUG, "Network callback unregistered", new Object[0]);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m55990b0(NetworkCapabilities networkCapabilities) {
        C20535s c20535sM56711a = this.f75517F.m56711a();
        try {
            if (networkCapabilities != null) {
                this.f75519H = networkCapabilities;
            } else {
                if (!AbstractC37056f.m118954F(this.f75523w)) {
                    this.f75524x.getLogger().mo16066m(EnumC20436n5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f75519H = null;
                    this.f75526z.getClass();
                    this.f75521J = SystemClock.uptimeMillis();
                    c20535sM56711a.close();
                    return;
                }
                this.f75525y.getClass();
                ConnectivityManager connectivityManagerM55982J = m55982J(this.f75523w, this.f75524x.getLogger());
                if (connectivityManagerM55982J != null) {
                    Network activeNetwork = connectivityManagerM55982J.getActiveNetwork();
                    this.f75519H = activeNetwork != null ? connectivityManagerM55982J.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f75519H = null;
                }
            }
            this.f75526z.getClass();
            this.f75521J = SystemClock.uptimeMillis();
            this.f75524x.getLogger().mo16066m(EnumC20436n5.DEBUG, "Cache updated - Status: " + m55993m() + ", Type: " + m55994x(), new Object[0]);
        } catch (Throwable th3) {
            try {
                this.f75524x.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to update connection status cache", th3);
                this.f75519H = null;
                this.f75526z.getClass();
                this.f75521J = SystemClock.uptimeMillis();
            } catch (Throwable th4) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        c20535sM56711a.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m55987T(new RunnableC20277c7(this, 7));
    }

    /* JADX INFO: renamed from: h */
    public final void m55991h() {
        if (AbstractC20118j0.m56013g() && this.f75518G == null) {
            C20535s c20535sM56711a = this.f75517F.m56711a();
            try {
                if (this.f75518G != null) {
                    c20535sM56711a.close();
                    return;
                }
                C20101b c20101b = new C20101b(this, 0);
                Context context = this.f75523w;
                InterfaceC20602v0 logger = this.f75524x.getLogger();
                this.f75525y.getClass();
                ConnectivityManager connectivityManagerM55982J = m55982J(context, logger);
                if (connectivityManagerM55982J != null) {
                    if (AbstractC37056f.m118954F(context)) {
                        try {
                            connectivityManagerM55982J.registerDefaultNetworkCallback(c20101b);
                            this.f75518G = c20101b;
                            this.f75524x.getLogger().mo16066m(EnumC20436n5.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th3) {
                            logger.mo16060j(EnumC20436n5.WARNING, "registerDefaultNetworkCallback failed", th3);
                            this.f75524x.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to register network callback", new Object[0]);
                        }
                        c20535sM56711a.close();
                    }
                    logger.mo16066m(EnumC20436n5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.f75524x.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to register network callback", new Object[0]);
                c20535sM56711a.close();
            } catch (Throwable th4) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: i */
    public final void mo55909i() {
        if (this.f75518G != null) {
            return;
        }
        m55987T(new RunnableC20100a(this, 2));
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: k */
    public final void mo55910k() {
        if (this.f75518G == null) {
            return;
        }
        m55987T(new RunnableC20100a(this, 1));
    }

    @Override // io.sentry.InterfaceC20454p0
    /* JADX INFO: renamed from: l */
    public final EnumC20431n0 mo55992l() {
        this.f75526z.getClass();
        if (SystemClock.uptimeMillis() - this.f75521J >= 120000) {
            m55990b0(null);
        }
        return m55993m();
    }

    /* JADX INFO: renamed from: m */
    public final EnumC20431n0 m55993m() {
        if (this.f75519H != null) {
            NetworkCapabilities networkCapabilities = this.f75519H;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.f75525y.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i13 : f75514P) {
                        if (networkCapabilities.hasTransport(i13)) {
                            return EnumC20431n0.CONNECTED;
                        }
                    }
                }
            }
            return EnumC20431n0.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerM55982J = m55982J(this.f75523w, this.f75524x.getLogger());
        if (connectivityManagerM55982J == null) {
            return EnumC20431n0.UNKNOWN;
        }
        Context context = this.f75523w;
        InterfaceC20602v0 logger = this.f75524x.getLogger();
        if (!AbstractC37056f.m118954F(context)) {
            logger.mo16066m(EnumC20436n5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return EnumC20431n0.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerM55982J.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? EnumC20431n0.CONNECTED : EnumC20431n0.DISCONNECTED;
            }
            logger.mo16066m(EnumC20436n5.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return EnumC20431n0.DISCONNECTED;
        } catch (Throwable th3) {
            logger.mo16060j(EnumC20436n5.WARNING, "Could not retrieve Connection Status", th3);
            return EnumC20431n0.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m55994x() {
        NetworkCapabilities networkCapabilities = this.f75519H;
        if (networkCapabilities != null) {
            return m55984s(networkCapabilities);
        }
        Context context = this.f75523w;
        InterfaceC20602v0 logger = this.f75524x.getLogger();
        C20121k0 c20121k0 = this.f75525y;
        ConnectivityManager connectivityManagerM55982J = m55982J(context, logger);
        if (connectivityManagerM55982J != null) {
            if (!AbstractC37056f.m118954F(context)) {
                logger.mo16066m(EnumC20436n5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                c20121k0.getClass();
                Network activeNetwork = connectivityManagerM55982J.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.mo16066m(EnumC20436n5.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerM55982J.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.mo16066m(EnumC20436n5.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th3) {
                logger.mo16060j(EnumC20436n5.ERROR, "Failed to retrieve network info", th3);
                return null;
            }
        }
        return null;
    }
}
