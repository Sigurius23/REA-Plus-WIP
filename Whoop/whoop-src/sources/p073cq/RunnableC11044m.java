package p073cq;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.ExecutorC1834u1;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import cd3.C4455g;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import hc3.AbstractC17167b;
import hc3.AbstractC17176i;
import hc3.C17174g;
import ht.ExecutorC17621j;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import p097ds.InterfaceFutureC12319v;
import p218ic.C18389w;
import p278kc.C22346a;
import p420qc.C30207q;
import p457rc.C31220c;
import p505ts.AbstractC34132o;
import p529uo.AbstractC35107c;
import p529uo.AbstractC35117h;
import p529uo.InterfaceC35119i;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29203o;
import q83.C30064k;
import so.C32797n;
import so.RunnableC32794k;
import so.ServiceConnectionC32796m;
import to.C33961a;
import to.C33971f;
import to.C34003v;

/* JADX INFO: renamed from: cq.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11044m implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34650w;

    /* JADX INFO: renamed from: x */
    public Object f34651x;

    /* JADX INFO: renamed from: y */
    public final Object f34652y;

    public /* synthetic */ RunnableC11044m(int i13, Object obj, Object obj2) {
        this.f34650w = i13;
        this.f34651x = obj2;
        this.f34652y = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m29690a() {
        synchronized (((C31220c) this.f34652y).f128596y) {
            try {
                Object objApply = ((C31220c) this.f34652y).f128597z.apply(this.f34651x);
                C31220c c31220c = (C31220c) this.f34652y;
                Object obj = c31220c.f128594w;
                if (obj == null && objApply != null) {
                    c31220c.f128594w = objApply;
                    c31220c.f128593E.postValue(objApply);
                } else if (obj != null && !obj.equals(objApply)) {
                    C31220c c31220c2 = (C31220c) this.f34652y;
                    c31220c2.f128594w = objApply;
                    c31220c2.f128593E.postValue(objApply);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m29691b() {
        try {
            ((Runnable) this.f34652y).run();
            synchronized (((ExecutorC1834u1) this.f34651x).f7182E) {
                ((ExecutorC1834u1) this.f34651x).m5453a();
            }
        } catch (Throwable th3) {
            synchronized (((ExecutorC1834u1) this.f34651x).f7182E) {
                ((ExecutorC1834u1) this.f34651x).m5453a();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m29692c() {
        ServiceConnectionC32796m serviceConnectionC32796m = (ServiceConnectionC32796m) this.f34651x;
        IBinder iBinder = (IBinder) this.f34652y;
        synchronized (serviceConnectionC32796m) {
            if (iBinder == null) {
                serviceConnectionC32796m.m102848a("Null service connection");
                return;
            }
            try {
                serviceConnectionC32796m.f136491y = new C29203o(iBinder);
                serviceConnectionC32796m.f136489w = 2;
                ((ScheduledExecutorService) serviceConnectionC32796m.f136488F.f136501c).execute(new RunnableC32794k(serviceConnectionC32796m, 0));
            } catch (RemoteException e5) {
                serviceConnectionC32796m.m102848a(e5.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m29693d() {
        ServiceConnectionC32796m serviceConnectionC32796m = (ServiceConnectionC32796m) this.f34651x;
        int i13 = ((C32797n) this.f34652y).f136493a;
        synchronized (serviceConnectionC32796m) {
            C32797n c32797n = (C32797n) serviceConnectionC32796m.f136487E.get(i13);
            if (c32797n != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i13);
                serviceConnectionC32796m.f136487E.remove(i13);
                c32797n.m102853b(new zzt("Timed out waiting for response", null));
                serviceConnectionC32796m.m102850c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f34651x).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        ht.ExecutorC17621j.f68338F.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f34651x), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f34651x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m29694e() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f34652y     // Catch: java.lang.Throwable -> L58
            ht.j r2 = (ht.ExecutorC17621j) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f68341x     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f34652y     // Catch: java.lang.Throwable -> L20
            ht.j r0 = (ht.ExecutorC17621j) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f68342y     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f68343z     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f68343z = r6     // Catch: java.lang.Throwable -> L20
            r0.f68342y = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f34652y     // Catch: java.lang.Throwable -> L20
            ht.j r4 = (ht.ExecutorC17621j) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f68341x     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f34651x = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f34652y     // Catch: java.lang.Throwable -> L20
            ht.j r0 = (ht.ExecutorC17621j) r0     // Catch: java.lang.Throwable -> L20
            r0.f68342y = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f34651x     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f34651x = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = ht.ExecutorC17621j.f68338F     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f34651x     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f34651x = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073cq.RunnableC11044m.m29694e():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC35119i interfaceC35119i;
        switch (this.f34650w) {
            case 0:
                C11045n c11045n = (C11045n) this.f34652y;
                Task task = (Task) this.f34651x;
                if (task.isCanceled()) {
                    c11045n.f34656z.m29705d();
                    return;
                }
                try {
                    c11045n.f34656z.m29702a(c11045n.f34655y.mo11178a(task));
                    return;
                } catch (RuntimeExecutionException e5) {
                    if (e5.getCause() instanceof Exception) {
                        c11045n.f34656z.m29704c((Exception) e5.getCause());
                        return;
                    } else {
                        c11045n.f34656z.m29704c(e5);
                        return;
                    }
                } catch (Exception e13) {
                    c11045n.f34656z.m29704c(e13);
                    return;
                }
            case 1:
                C11045n c11045n2 = (C11045n) this.f34652y;
                try {
                    Task task2 = (Task) c11045n2.f34655y.mo11178a((Task) this.f34651x);
                    if (task2 == null) {
                        c11045n2.mo1681n(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC11049r executorC11049r = AbstractC11041j.f34646b;
                    task2.addOnSuccessListener(executorC11049r, c11045n2);
                    task2.addOnFailureListener(executorC11049r, c11045n2);
                    task2.addOnCanceledListener(executorC11049r, c11045n2);
                    return;
                } catch (RuntimeExecutionException e14) {
                    if (e14.getCause() instanceof Exception) {
                        c11045n2.f34656z.m29704c((Exception) e14.getCause());
                        return;
                    } else {
                        c11045n2.f34656z.m29704c(e14);
                        return;
                    }
                } catch (Exception e15) {
                    c11045n2.f34656z.m29704c(e15);
                    return;
                }
            case 2:
                C11046o c11046o = (C11046o) this.f34652y;
                synchronized (c11046o.f34659y) {
                    try {
                        InterfaceC11035d interfaceC11035d = (InterfaceC11035d) c11046o.f34660z;
                        if (interfaceC11035d != null) {
                            interfaceC11035d.mo944q((Task) this.f34651x);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 3:
                C11046o c11046o2 = (C11046o) this.f34652y;
                synchronized (c11046o2.f34659y) {
                    try {
                        InterfaceC11037f interfaceC11037f = (InterfaceC11037f) c11046o2.f34660z;
                        if (interfaceC11037f != null) {
                            interfaceC11037f.onSuccess(((Task) this.f34651x).getResult());
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case 4:
                C11046o c11046o3 = (C11046o) this.f34652y;
                try {
                    C11052u c11052uMo8623i = ((InterfaceC11039h) c11046o3.f34659y).mo8623i(((Task) this.f34651x).getResult());
                    ExecutorC11049r executorC11049r2 = AbstractC11041j.f34646b;
                    c11052uMo8623i.addOnSuccessListener(executorC11049r2, c11046o3);
                    c11052uMo8623i.addOnFailureListener(executorC11049r2, c11046o3);
                    c11052uMo8623i.addOnCanceledListener(executorC11049r2, c11046o3);
                    return;
                } catch (RuntimeExecutionException e16) {
                    if (e16.getCause() instanceof Exception) {
                        c11046o3.mo1681n((Exception) e16.getCause());
                        return;
                    } else {
                        c11046o3.mo1681n(e16);
                        return;
                    }
                } catch (CancellationException unused) {
                    c11046o3.mo2320d();
                    return;
                } catch (Exception e17) {
                    c11046o3.mo1681n(e17);
                    return;
                }
            case 5:
                C11052u c11052u = (C11052u) this.f34651x;
                try {
                    c11052u.m29702a(((Callable) this.f34652y).call());
                    return;
                } catch (Exception e18) {
                    c11052u.m29704c(e18);
                    return;
                } catch (Throwable th5) {
                    c11052u.m29704c(new RuntimeException(th5));
                    return;
                }
            case 6:
                int i13 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f34651x).run();
                    } catch (Throwable th6) {
                        AbstractC3006f0.m8727u(C30064k.f122676w, th6);
                    }
                    try {
                        Runnable runnableM48497s = ((C17174g) this.f34652y).m48497s();
                        if (runnableM48497s == null) {
                            return;
                        }
                        this.f34651x = runnableM48497s;
                        i13++;
                        if (i13 >= 16) {
                            C17174g c17174g = (C17174g) this.f34652y;
                            if (AbstractC17167b.m48483i(c17174g.f65982x, c17174g)) {
                                C17174g c17174g2 = (C17174g) this.f34652y;
                                AbstractC17167b.m48482h(c17174g2.f65982x, c17174g2, this);
                                return;
                            }
                        }
                    } catch (Throwable th7) {
                        C17174g c17174g3 = (C17174g) this.f34652y;
                        synchronized (c17174g3.f65980F) {
                            C17174g.f65978G.decrementAndGet(c17174g3);
                            throw th7;
                        }
                    }
                    break;
                }
                break;
            case 7:
                try {
                    m29694e();
                    return;
                } catch (Error e19) {
                    synchronized (((ExecutorC17621j) this.f34652y).f68341x) {
                        ((ExecutorC17621j) this.f34652y).f68342y = 1;
                        throw e19;
                    }
                }
            case 8:
                C3033m c3033m = (C3033m) this.f34652y;
                InterfaceFutureC12319v interfaceFutureC12319v = (InterfaceFutureC12319v) this.f34651x;
                if (interfaceFutureC12319v.isCancelled()) {
                    c3033m.cancel(null);
                    return;
                }
                boolean z4 = false;
                while (true) {
                    try {
                        try {
                            Object obj = interfaceFutureC12319v.get();
                            if (z4) {
                                Thread.currentThread().interrupt();
                            }
                            c3033m.resumeWith(obj);
                            return;
                        } catch (ExecutionException e22) {
                            Throwable cause = e22.getCause();
                            AbstractC22676k.m65747g(cause);
                            c3033m.resumeWith(AbstractC34132o.m107888l(cause));
                            return;
                        }
                    } catch (InterruptedException unused2) {
                        z4 = true;
                    } catch (Throwable th8) {
                        if (z4) {
                            Thread.currentThread().interrupt();
                        }
                        throw th8;
                    }
                }
                break;
            case 9:
                C18389w c18389wM52886d = C18389w.m52886d();
                String str = C22346a.f87187e;
                StringBuilder sb4 = new StringBuilder("Scheduling work ");
                C30207q c30207q = (C30207q) this.f34651x;
                sb4.append(c30207q.f123634a);
                c18389wM52886d.m52888a(str, sb4.toString());
                ((C22346a) this.f34652y).f87188a.mo60625e(c30207q);
                return;
            case 10:
                m29690a();
                return;
            case 11:
                m29691b();
                return;
            case 12:
                m29692c();
                return;
            case 13:
                m29693d();
                return;
            default:
                C4969a c4969a = (C4969a) this.f34651x;
                C4455g c4455g = (C4455g) this.f34652y;
                C33971f c33971f = (C33971f) c4455g.f17960F;
                InterfaceC4973d interfaceC4973d = (InterfaceC4973d) c4455g.f17962x;
                C34003v c34003v = (C34003v) c33971f.f142423J.get((C33961a) c4455g.f17963y);
                if (c34003v == null) {
                    return;
                }
                if (!c4969a.m15588b()) {
                    c34003v.m107486l(c4969a, null);
                    return;
                }
                c4455g.f17961w = true;
                if (interfaceC4973d.mo5665a()) {
                    if (!c4455g.f17961w || (interfaceC35119i = (InterfaceC35119i) c4455g.f17964z) == null) {
                        return;
                    }
                    ((AbstractC35107c) interfaceC4973d).m111060i(interfaceC35119i, (Set) c4455g.f17959E);
                    return;
                }
                try {
                    AbstractC35117h abstractC35117h = (AbstractC35117h) interfaceC4973d;
                    ((AbstractC35107c) interfaceC4973d).m111060i(null, abstractC35117h.mo5665a() ? abstractC35117h.f149028y : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e24) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e24);
                    ((AbstractC35107c) interfaceC4973d).m111059f("Failed to get service from broker.");
                    c34003v.m107486l(new C4969a(10), null);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f34650w) {
            case 7:
                Runnable runnable = (Runnable) this.f34651x;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + AbstractC17176i.m48498A(((ExecutorC17621j) this.f34652y).f68342y) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC11044m(Object obj, Object obj2, boolean z4, int i13) {
        this.f34650w = i13;
        this.f34651x = obj;
        this.f34652y = obj2;
    }

    public RunnableC11044m(ExecutorC17621j executorC17621j) {
        this.f34650w = 7;
        this.f34652y = executorC17621j;
    }
}
