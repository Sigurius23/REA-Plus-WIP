package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import hc3.AbstractC17182o;
import kc3.C22365e;
import p218ic.C18358g;
import p605x6.AbstractC38008m;
import p605x6.C38015t;
import p605x6.InterfaceC38001f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lx6/f;", "sessionManager", "Lx6/t;", "timeouts", "Lbc3/z;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lx6/f;Lx6/t;Lbc3/z;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SessionWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: E */
    public final String f5999E;

    /* JADX INFO: renamed from: w */
    public final WorkerParameters f6000w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC38001f f6001x;

    /* JADX INFO: renamed from: y */
    public final C38015t f6002y;

    /* JADX INFO: renamed from: z */
    public final AbstractC3076z f6003z;

    public SessionWorker(Context context, WorkerParameters workerParameters, InterfaceC38001f interfaceC38001f, C38015t c38015t, AbstractC3076z abstractC3076z) {
        super(context, workerParameters);
        this.f6000w = workerParameters;
        this.f6001x = interfaceC38001f;
        this.f6002y = c38015t;
        this.f6003z = abstractC3076z;
        C18358g inputData = getInputData();
        interfaceC38001f.getClass();
        String strM52860c = inputData.m52860c("KEY");
        if (strM52860c == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.f5999E = strM52860c;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x0104 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #0 {all -> 0x004e, blocks: (B:41:0x00ca, B:44:0x00e3, B:52:0x0104, B:55:0x011e, B:15:0x0049, B:22:0x0062), top: B:69:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e A[Catch: all -> 0x004e, PHI: r2 r6 r12
      0x011e: PHI (r2v13 int) = (r2v11 int), (r2v14 int) binds: [B:15:0x0049, B:53:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r6v6 p6.l) = (r6v4 p6.l), (r6v9 p6.l) binds: [B:15:0x0049, B:53:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r12v17 java.lang.Object) = (r12v2 java.lang.Object), (r12v22 java.lang.Object) binds: [B:15:0x0049, B:53:0x011b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x004e, blocks: (B:41:0x00ca, B:44:0x00e3, B:52:0x0104, B:55:0x011e, B:15:0x0049, B:22:0x0062), top: B:69:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013c, code lost:
    
        if (bc3.AbstractC3006f0.m8705K(r7, r8, r0) == r1) goto L65;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c3 -> B:38:0x00c4). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(q83.InterfaceC30057d r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.doWork(q83.d):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final AbstractC3076z getCoroutineContext() {
        return this.f6003z;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, AbstractC38008m.f162812a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, InterfaceC38001f interfaceC38001f, C38015t c38015t, AbstractC3076z abstractC3076z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC38001f interfaceC38001f2 = (i13 & 4) != 0 ? AbstractC38008m.f162812a : interfaceC38001f;
        C38015t c38015t2 = (i13 & 8) != 0 ? new C38015t() : c38015t;
        if ((i13 & 16) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = AbstractC17182o.f65999a;
        }
        this(context, workerParameters, interfaceC38001f2, c38015t2, abstractC3076z);
    }
}
