package androidx.work;

import a20.C0162b;
import android.content.Context;
import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import l83.C23454a0;
import l83.InterfaceC23457c;
import p097ds.InterfaceFutureC12319v;
import p218ic.AbstractC18388v;
import p218ic.C18356f;
import p218ic.C18358g;
import p218ic.C18370m;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m65681d2 = {"Landroidx/work/CoroutineWorker;", "Lic/v;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lds/v;", "Lic/u;", "startWork", "()Lds/v;", "Lic/m;", "getForegroundInfo", "(Lq83/d;)Ljava/lang/Object;", "Lic/g;", "data", "Ll83/a0;", "setProgress", "(Lic/g;Lq83/d;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Lic/m;Lq83/d;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "Lbc3/z;", "coroutineContext", "Lbc3/z;", "getCoroutineContext", "()Lbc3/z;", "getCoroutineContext$annotations", "ic/f", "work-runtime_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public abstract class CoroutineWorker extends AbstractC18388v {
    private final AbstractC3076z coroutineContext;
    private final WorkerParameters params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(params, "params");
        this.params = params;
        this.coroutineContext = C18356f.f71476w;
    }

    @InterfaceC23457c
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC30057d<? super C18370m> interfaceC30057d) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC30057d interfaceC30057d);

    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public AbstractC3076z getF6003z() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC30057d<? super C18370m> interfaceC30057d) {
        return getForegroundInfo$suspendImpl(this, interfaceC30057d);
    }

    @Override // p218ic.AbstractC18388v
    public final InterfaceFutureC12319v getForegroundInfoAsync() {
        return AbstractC30060g.m92086F(getF6003z().plus(AbstractC3006f0.m8709c()), new C0162b(this, null, 28));
    }

    @Override // p218ic.AbstractC18388v
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(C18370m c18370m, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        InterfaceFutureC12319v foregroundAsync = setForegroundAsync(c18370m);
        AbstractC22676k.m65749i(foregroundAsync, "setForegroundAsync(...)");
        Object objM108238x = AbstractC34235f.m108238x(foregroundAsync, interfaceC30057d);
        return objM108238x == EnumC31071a.f128113w ? objM108238x : C23454a0.f92919a;
    }

    public final Object setProgress(C18358g c18358g, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        InterfaceFutureC12319v progressAsync = setProgressAsync(c18358g);
        AbstractC22676k.m65749i(progressAsync, "setProgressAsync(...)");
        Object objM108238x = AbstractC34235f.m108238x(progressAsync, interfaceC30057d);
        return objM108238x == EnumC31071a.f128113w ? objM108238x : C23454a0.f92919a;
    }

    @Override // p218ic.AbstractC18388v
    public final InterfaceFutureC12319v startWork() {
        InterfaceC30063j coroutineContext = !AbstractC22676k.m65745e(getF6003z(), C18356f.f71476w) ? getF6003z() : this.params.f7338g;
        AbstractC22676k.m65747g(coroutineContext);
        return AbstractC30060g.m92086F(coroutineContext.plus(AbstractC3006f0.m8709c()), new C1849z1(this, null, 5));
    }
}
