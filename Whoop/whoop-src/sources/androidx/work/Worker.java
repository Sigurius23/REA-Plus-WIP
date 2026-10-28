package androidx.work;

import android.content.Context;
import j93.AbstractC21478l0;
import java.util.concurrent.Executor;
import p047c9.C4312c;
import p097ds.InterfaceFutureC12319v;
import p218ic.AbstractC18388v;
import p218ic.C18370m;
import p218ic.C18383s0;
import p218ic.C18384t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Landroidx/work/Worker;", "Lic/v;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lds/v;", "Lic/u;", "startWork", "()Lds/v;", "Lic/m;", "getForegroundInfoAsync", "b", "()Lic/m;", "work-runtime_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public abstract class Worker extends AbstractC18388v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(workerParams, "workerParams");
    }

    /* JADX INFO: renamed from: a */
    public abstract C18384t mo5513a();

    /* JADX INFO: renamed from: b */
    public C18370m m5514b() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // p218ic.AbstractC18388v
    public InterfaceFutureC12319v getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        AbstractC22676k.m65749i(backgroundExecutor, "getBackgroundExecutor(...)");
        return AbstractC21478l0.m60455z(new C4312c(2, backgroundExecutor, new C18383s0(this, 1)));
    }

    @Override // p218ic.AbstractC18388v
    public final InterfaceFutureC12319v startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        AbstractC22676k.m65749i(backgroundExecutor, "getBackgroundExecutor(...)");
        return AbstractC21478l0.m60455z(new C4312c(2, backgroundExecutor, new C18383s0(this, 0)));
    }
}
