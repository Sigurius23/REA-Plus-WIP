package com.google.firebase.messaging;

import aa3.C0627i1;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.profileinstaller.ExecutorC1651b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.internal.C5099k0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.iterable.iterableapi.C5317e;
import et.InterfaceC13595a;
import gt.C16167f;
import io.sentry.android.core.C20119j1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002a0.C0022g;
import p020ap.ThreadFactoryC1879b;
import p032bc.C2953i;
import p037bu.C3633d;
import p073cq.C11052u;
import p073cq.InterfaceC11037f;
import p098dt.C12355g;
import p107e3.AbstractC12601b;
import p117eh.C13184a;
import p465rm.C31559p;
import p529uo.AbstractC35135w;
import p549vb.AbstractC35862g;
import p692zt.C41106j;
import p692zt.C41114r;
import p692zt.C41119w;
import p692zt.RunnableC41115s;
import pt.InterfaceC29509b;
import so.C32785b;
import so.C32788e;
import so.C32797n;
import so.C32798o;
import so.ExecutorC32799p;
import st.InterfaceC32956a;
import tt.InterfaceC34150d;
import u93.C34671d0;
import va3.AbstractC35854l;
import vd1.C35909c;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: k */
    public static C34671d0 f21612k;

    /* JADX INFO: renamed from: m */
    public static ScheduledThreadPoolExecutor f21614m;

    /* JADX INFO: renamed from: a */
    public final C12355g f21615a;

    /* JADX INFO: renamed from: b */
    public final Context f21616b;

    /* JADX INFO: renamed from: c */
    public final C5099k0 f21617c;

    /* JADX INFO: renamed from: d */
    public final C41106j f21618d;

    /* JADX INFO: renamed from: e */
    public final C13184a f21619e;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f21620f;

    /* JADX INFO: renamed from: g */
    public final ThreadPoolExecutor f21621g;

    /* JADX INFO: renamed from: h */
    public final C20119j1 f21622h;

    /* JADX INFO: renamed from: i */
    public boolean f21623i;

    /* JADX INFO: renamed from: j */
    public static final long f21611j = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: l */
    public static InterfaceC32956a f21613l = new C16167f(6);

    public FirebaseMessaging(C12355g c12355g, InterfaceC32956a interfaceC32956a, InterfaceC32956a interfaceC32956a2, InterfaceC34150d interfaceC34150d, InterfaceC32956a interfaceC32956a3, InterfaceC29509b interfaceC29509b) {
        c12355g.m34610a();
        Context context = c12355g.f41519a;
        final C20119j1 c20119j1 = new C20119j1();
        final int i13 = 0;
        c20119j1.f75585b = 0;
        c20119j1.f75586c = context;
        c12355g.m34610a();
        C32785b c32785b = new C32785b(c12355g.f41519a);
        final C5099k0 c5099k0 = new C5099k0();
        c5099k0.f21439x = c12355g;
        c5099k0.f21440y = c20119j1;
        c5099k0.f21441z = c32785b;
        c5099k0.f21436E = interfaceC32956a;
        c5099k0.f21437F = interfaceC32956a2;
        c5099k0.f21438w = interfaceC34150d;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC1879b("Firebase-Messaging-Task"));
        final int i14 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1879b("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1879b("Firebase-Messaging-File-Io"));
        this.f21623i = false;
        f21613l = interfaceC32956a3;
        this.f21615a = c12355g;
        C13184a c13184a = new C13184a();
        c13184a.f45699d = this;
        c13184a.f45697b = interfaceC29509b;
        this.f21619e = c13184a;
        c12355g.m34610a();
        final Context context2 = c12355g.f41519a;
        this.f21616b = context2;
        C5317e c5317e = new C5317e(2);
        this.f21622h = c20119j1;
        this.f21617c = c5099k0;
        this.f21618d = new C41106j(executorServiceNewSingleThreadExecutor);
        this.f21620f = scheduledThreadPoolExecutor;
        this.f21621g = threadPoolExecutor;
        c12355g.m34610a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c5317e);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: zt.k

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ FirebaseMessaging f177208x;

            {
                this.f177208x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11052u c11052uM15639c;
                int i15;
                switch (i13) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f177208x;
                        if (firebaseMessaging.f21619e.m37077c() && firebaseMessaging.m16392j(firebaseMessaging.m16388f())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f21623i) {
                                    firebaseMessaging.m16391i(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f177208x;
                        final Context context3 = firebaseMessaging2.f21616b;
                        AbstractC12601b.m35316c(context3);
                        C5099k0 c5099k1 = firebaseMessaging2.f21617c;
                        final boolean zM16390h = firebaseMessaging2.m16390h();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesM113840c = AbstractC35862g.m113840c(context3);
                            if (!sharedPreferencesM113840c.contains("proxy_retention") || sharedPreferencesM113840c.getBoolean("proxy_retention", false) != zM16390h) {
                                C32785b c32785b2 = (C32785b) c5099k1.f21441z;
                                if (c32785b2.f136468c.m14109b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zM16390h);
                                    C32798o c32798oM102855b = C32798o.m102855b(c32785b2.f136467b);
                                    synchronized (c32798oM102855b) {
                                        i15 = c32798oM102855b.f136499a;
                                        c32798oM102855b.f136499a = i15 + 1;
                                    }
                                    c11052uM15639c = c32798oM102855b.m102857c(new C32797n(i15, 4, bundle, 0));
                                } else {
                                    c11052uM15639c = Tasks.m15639c(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                c11052uM15639c.addOnSuccessListener(new ExecutorC1651b(0), new InterfaceC11037f() { // from class: zt.o
                                    @Override // p073cq.InterfaceC11037f
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = AbstractC35862g.m113840c(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zM16390h);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.m16390h()) {
                            firebaseMessaging2.m16389g();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1879b("Firebase-Messaging-Topics-Io"));
        int i15 = C41119w.f177247j;
        Tasks.m15638b(scheduledThreadPoolExecutor2, new Callable() { // from class: zt.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C41117u c41117u;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C20119j1 c20119j2 = c20119j1;
                C5099k0 c5099k1 = c5099k0;
                synchronized (C41117u.class) {
                    try {
                        WeakReference weakReference = C41117u.f177239b;
                        c41117u = weakReference != null ? (C41117u) weakReference.get() : null;
                        if (c41117u == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            C41117u c41117u2 = new C41117u();
                            synchronized (c41117u2) {
                                c41117u2.f177240a = C0627i1.m1616m(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            C41117u.f177239b = new WeakReference(c41117u2);
                            c41117u = c41117u2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return new C41119w(firebaseMessaging, c20119j2, c41117u, c5099k1, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new C35909c(this, 5));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: zt.k

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ FirebaseMessaging f177208x;

            {
                this.f177208x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11052u c11052uM15639c;
                int i16;
                switch (i14) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f177208x;
                        if (firebaseMessaging.f21619e.m37077c() && firebaseMessaging.m16392j(firebaseMessaging.m16388f())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f21623i) {
                                    firebaseMessaging.m16391i(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f177208x;
                        final Context context3 = firebaseMessaging2.f21616b;
                        AbstractC12601b.m35316c(context3);
                        C5099k0 c5099k1 = firebaseMessaging2.f21617c;
                        final boolean zM16390h = firebaseMessaging2.m16390h();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesM113840c = AbstractC35862g.m113840c(context3);
                            if (!sharedPreferencesM113840c.contains("proxy_retention") || sharedPreferencesM113840c.getBoolean("proxy_retention", false) != zM16390h) {
                                C32785b c32785b2 = (C32785b) c5099k1.f21441z;
                                if (c32785b2.f136468c.m14109b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zM16390h);
                                    C32798o c32798oM102855b = C32798o.m102855b(c32785b2.f136467b);
                                    synchronized (c32798oM102855b) {
                                        i16 = c32798oM102855b.f136499a;
                                        c32798oM102855b.f136499a = i16 + 1;
                                    }
                                    c11052uM15639c = c32798oM102855b.m102857c(new C32797n(i16, 4, bundle, 0));
                                } else {
                                    c11052uM15639c = Tasks.m15639c(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                c11052uM15639c.addOnSuccessListener(new ExecutorC1651b(0), new InterfaceC11037f() { // from class: zt.o
                                    @Override // p073cq.InterfaceC11037f
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = AbstractC35862g.m113840c(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zM16390h);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.m16390h()) {
                            firebaseMessaging2.m16389g();
                            return;
                        }
                        return;
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m16383b(Runnable runnable, long j7) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f21614m == null) {
                    f21614m = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1879b("TAG"));
                }
                f21614m.schedule(runnable, j7, TimeUnit.SECONDS);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized FirebaseMessaging m16384c() {
        return getInstance(C12355g.m34608b());
    }

    /* JADX INFO: renamed from: d */
    public static synchronized C34671d0 m16385d(Context context) {
        try {
            if (f21612k == null) {
                f21612k = new C34671d0(context);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f21612k;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C12355g c12355g) {
        FirebaseMessaging firebaseMessaging;
        c12355g.m34610a();
        firebaseMessaging = (FirebaseMessaging) c12355g.f41522d.mo1617a(FirebaseMessaging.class);
        AbstractC35135w.m111095g(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX INFO: renamed from: a */
    public final String m16386a() {
        Task taskContinueWithTask;
        C41114r c41114rM16388f = m16388f();
        if (!m16392j(c41114rM16388f)) {
            return c41114rM16388f.f177228a;
        }
        String strM56014c = C20119j1.m56014c(this.f21615a);
        C41106j c41106j = this.f21618d;
        synchronized (c41106j) {
            taskContinueWithTask = (Task) ((C0022g) c41106j.f177206b).get(strM56014c);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strM56014c);
                }
                C5099k0 c5099k0 = this.f21617c;
                taskContinueWithTask = c5099k0.m16011o(c5099k0.m16001T(C20119j1.m56014c((C12355g) c5099k0.f21439x), "*", new Bundle())).onSuccessTask(this.f21621g, new C2953i(this, strM56014c, c41114rM16388f, 17)).continueWithTask((Executor) c41106j.f177205a, new C3633d(c41106j, strM56014c));
                ((C0022g) c41106j.f177206b).put(strM56014c, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strM56014c);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e5) {
            throw new IOException(e5);
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m16387e() {
        C12355g c12355g = this.f21615a;
        c12355g.m34610a();
        return "[DEFAULT]".equals(c12355g.f41520b) ? "" : c12355g.m34611c();
    }

    /* JADX INFO: renamed from: f */
    public final C41114r m16388f() {
        C41114r c41114rM133479b;
        C34671d0 c34671d0M16385d = m16385d(this.f21616b);
        String strM16387e = m16387e();
        String strM56014c = C20119j1.m56014c(this.f21615a);
        synchronized (c34671d0M16385d) {
            c41114rM133479b = C41114r.m133479b(((SharedPreferences) c34671d0M16385d.f146043w).getString(C34671d0.m109559a(strM16387e, strM56014c), null));
        }
        return c41114rM133479b;
    }

    /* JADX INFO: renamed from: g */
    public final void m16389g() {
        Task taskM15639c;
        int i13;
        C32785b c32785b = (C32785b) this.f21617c.f21441z;
        if (c32785b.f136468c.m14109b() >= 241100000) {
            C32798o c32798oM102855b = C32798o.m102855b(c32785b.f136467b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c32798oM102855b) {
                i13 = c32798oM102855b.f136499a;
                c32798oM102855b.f136499a = i13 + 1;
            }
            taskM15639c = c32798oM102855b.m102857c(new C32797n(i13, 5, bundle, 1)).continueWith(ExecutorC32799p.f136503w, C32788e.f136475w);
        } else {
            taskM15639c = Tasks.m15639c(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskM15639c.addOnSuccessListener(this.f21620f, new C31559p(this, 25));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m16390h() {
        Context context = this.f21616b;
        AbstractC12601b.m35316c(context);
        if (!AbstractC12601b.m35317d(context)) {
            return false;
        }
        C12355g c12355g = this.f21615a;
        c12355g.m34610a();
        if (c12355g.f41522d.mo1617a(InterfaceC13595a.class) != null) {
            return true;
        }
        return AbstractC35854l.m113830j() && f21613l != null;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m16391i(long j7) {
        m16383b(new RunnableC41115s(this, Math.min(Math.max(30L, 2 * j7), f21611j)), j7);
        this.f21623i = true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m16392j(C41114r c41114r) {
        if (c41114r != null) {
            return System.currentTimeMillis() > c41114r.f177230c + C41114r.f177227d || !this.f21622h.m56016b().equals(c41114r.f177229b);
        }
        return true;
    }
}
