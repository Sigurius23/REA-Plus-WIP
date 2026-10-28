package so;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import dc3.EnumC11916a;
import ec3.InterfaceC13058l;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p020ap.ThreadFactoryC1879b;
import p073cq.C11052u;
import p173gj.C15903d;
import p173gj.C15906g;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: so.o */
/* JADX INFO: loaded from: classes.dex */
public final class C32798o {

    /* JADX INFO: renamed from: e */
    public static C32798o f136498e;

    /* JADX INFO: renamed from: a */
    public int f136499a;

    /* JADX INFO: renamed from: b */
    public final Object f136500b;

    /* JADX INFO: renamed from: c */
    public final Object f136501c;

    /* JADX INFO: renamed from: d */
    public Object f136502d;

    public C32798o(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f136502d = new ServiceConnectionC32796m(this);
        this.f136499a = 1;
        this.f136501c = scheduledExecutorService;
        this.f136500b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C32798o m102855b(Context context) {
        try {
            if (f136498e == null) {
                f136498e = new C32798o(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC1879b("MessengerIpcClient"))));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f136498e;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[Catch: all -> 0x0034, PHI: r0 r9
      0x0090: PHI (r0v13 so.o) = (r0v9 so.o), (r0v21 so.o) binds: [B:22:0x0046, B:40:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r9v14 gj.g) = (r9v8 gj.g), (r9v17 gj.g) binds: [B:22:0x0046, B:40:0x008d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0034, blocks: (B:14:0x002f, B:45:0x00a8, B:42:0x0090, B:39:0x0079), top: B:50:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (r3.m33423b(r1) == r2) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [gj.d] */
    /* JADX WARN: Type inference failed for: r0v12, types: [so.o] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m102856a(s83.AbstractC32269c r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so.C32798o.m102856a(s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public synchronized C11052u m102857c(C32797n c32797n) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(c32797n.toString()));
            }
            if (!((ServiceConnectionC32796m) this.f136502d).m102851d(c32797n)) {
                ServiceConnectionC32796m serviceConnectionC32796m = new ServiceConnectionC32796m(this);
                this.f136502d = serviceConnectionC32796m;
                serviceConnectionC32796m.m102851d(c32797n);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return c32797n.f136494b.f34644a;
    }

    public C32798o(C15903d c15903d) {
        this.f136500b = c15903d;
        C15906g c15906g = c15903d.f60128a;
        this.f136502d = c15903d.f60138k;
        SharedPreferences sharedPreferences = c15906g.f60153b.getSharedPreferences("amplitude-android-" + c15906g.f60156e, 0);
        AbstractC22676k.m65749i(sharedPreferences, "config.context.getShared…xt.MODE_PRIVATE\n        )");
        this.f136501c = sharedPreferences;
        this.f136499a = sharedPreferences.getInt("storage_version", 0);
    }

    public C32798o(int i13, EnumC11916a enumC11916a, InterfaceC13058l interfaceC13058l, InterfaceC30063j interfaceC30063j) {
        this.f136500b = interfaceC13058l;
        this.f136499a = i13;
        this.f136501c = enumC11916a;
        this.f136502d = interfaceC30063j;
    }
}
