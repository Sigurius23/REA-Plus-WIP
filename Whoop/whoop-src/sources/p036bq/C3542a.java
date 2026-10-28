package p036bq;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p035bp.C3512c;
import p433qp.C30530a;
import p479s4.AbstractC32122c;
import p529uo.AbstractC35135w;
import p687zo.AbstractC40910c;
import p687zo.AbstractC40911d;
import p687zo.C40908a;

/* JADX INFO: renamed from: bq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3542a {

    /* JADX INFO: renamed from: n */
    public static final long f14246n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o */
    public static volatile ScheduledExecutorService f14247o = null;

    /* JADX INFO: renamed from: p */
    public static final Object f14248p = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f14249a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f14250b;

    /* JADX INFO: renamed from: c */
    public int f14251c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f14252d;

    /* JADX INFO: renamed from: e */
    public long f14253e;

    /* JADX INFO: renamed from: f */
    public final HashSet f14254f;

    /* JADX INFO: renamed from: g */
    public boolean f14255g;

    /* JADX INFO: renamed from: h */
    public C30530a f14256h;

    /* JADX INFO: renamed from: i */
    public final C40908a f14257i;

    /* JADX INFO: renamed from: j */
    public final String f14258j;

    /* JADX INFO: renamed from: k */
    public final HashMap f14259k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f14260l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f14261m;

    public C3542a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f14249a = new Object();
        this.f14251c = 0;
        this.f14254f = new HashSet();
        this.f14255g = true;
        this.f14257i = C40908a.f176317a;
        this.f14259k = new HashMap();
        this.f14260l = new AtomicInteger(0);
        AbstractC35135w.m111093e("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f14256h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f14258j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f14258j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb4 = new StringBuilder(29);
            sb4.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb4.toString());
        }
        this.f14250b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = AbstractC40911d.f176326a;
        synchronized (AbstractC40911d.class) {
            Boolean bool = AbstractC40911d.f176328c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = AbstractC32122c.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                AbstractC40911d.f176328c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i13 = AbstractC40910c.f176325a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = ((Context) C3512c.m10398a(context).f3422w).getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i14 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = AbstractC40911d.f176327b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i14), packageName);
                            } catch (Exception e5) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e5);
                            }
                        } else {
                            Method method3 = AbstractC40911d.f176326a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i14));
                                } catch (Exception e13) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e13);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f14250b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e14) {
                    Log.wtf("WakeLock", e14.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f14247o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f14248p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f14247o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f14247o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.f14261m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m10575a(long j7) {
        this.f14260l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f14246n), 1L);
        if (j7 > 0) {
            jMax = Math.min(j7, jMax);
        }
        synchronized (this.f14249a) {
            try {
                if (!m10576b()) {
                    this.f14256h = C30530a.f125537w;
                    this.f14250b.acquire();
                    this.f14257i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f14251c++;
                if (this.f14255g) {
                    TextUtils.isEmpty(null);
                }
                C3544c c3544c = (C3544c) this.f14259k.get(null);
                if (c3544c == null) {
                    c3544c = new C3544c();
                    this.f14259k.put(null, c3544c);
                }
                c3544c.f14264a++;
                this.f14257i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j13 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j13 > this.f14253e) {
                    this.f14253e = j13;
                    ScheduledFuture scheduledFuture = this.f14252d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f14252d = this.f14261m.schedule(new RunnableC3543b(this, 0), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10576b() {
        boolean z4;
        synchronized (this.f14249a) {
            z4 = this.f14251c > 0;
        }
        return z4;
    }

    /* JADX INFO: renamed from: c */
    public final void m10577c() {
        if (this.f14260l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f14258j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f14249a) {
            try {
                if (this.f14255g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f14259k.containsKey(null)) {
                    C3544c c3544c = (C3544c) this.f14259k.get(null);
                    if (c3544c != null) {
                        int i13 = c3544c.f14264a - 1;
                        c3544c.f14264a = i13;
                        if (i13 == 0) {
                            this.f14259k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f14258j).concat(" counter does not exist"));
                }
                m10579e();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10578d() {
        HashSet hashSet = this.f14254f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: e */
    public final void m10579e() {
        synchronized (this.f14249a) {
            try {
                if (m10576b()) {
                    if (this.f14255g) {
                        int i13 = this.f14251c - 1;
                        this.f14251c = i13;
                        if (i13 > 0) {
                            return;
                        }
                    } else {
                        this.f14251c = 0;
                    }
                    m10578d();
                    Iterator it = this.f14259k.values().iterator();
                    while (it.hasNext()) {
                        ((C3544c) it.next()).f14264a = 0;
                    }
                    this.f14259k.clear();
                    ScheduledFuture scheduledFuture = this.f14252d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f14252d = null;
                        this.f14253e = 0L;
                    }
                    if (this.f14250b.isHeld()) {
                        try {
                            try {
                                this.f14250b.release();
                                if (this.f14256h != null) {
                                    this.f14256h = null;
                                }
                            } catch (RuntimeException e5) {
                                if (!e5.getClass().equals(RuntimeException.class)) {
                                    throw e5;
                                }
                                Log.e("WakeLock", String.valueOf(this.f14258j).concat(" failed to release!"), e5);
                                if (this.f14256h != null) {
                                    this.f14256h = null;
                                }
                            }
                        } catch (Throwable th3) {
                            if (this.f14256h != null) {
                                this.f14256h = null;
                            }
                            throw th3;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f14258j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
