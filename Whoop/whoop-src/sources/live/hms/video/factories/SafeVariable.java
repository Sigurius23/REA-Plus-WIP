package live.hms.video.factories;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.InterfaceC3055s;
import c93.InterfaceC4339a;
import io.sentry.android.core.RunnableC20151r0;
import l83.InterfaceC23462h;
import lh1.C24069a;
import live.hms.video.connection.degredation.C24117a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/factories/SafeVariable;", "T", "", "<init>", "()V", "Lkotlin/Function0;", "block", "Ll83/a0;", "initialize", "(Lc93/a;)V", "get", "(Lq83/d;)Ljava/lang/Object;", "reset", "Lbc3/s;", "deferred", "Lbc3/s;", "Landroid/os/HandlerThread;", "safeHandlerThread$delegate", "Ll83/h;", "getSafeHandlerThread", "()Landroid/os/HandlerThread;", "safeHandlerThread", "Landroid/os/Handler;", "safeHandler$delegate", "getSafeHandler", "()Landroid/os/Handler;", "safeHandler", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SafeVariable<T> {
    private InterfaceC3055s deferred = AbstractC3006f0.m8707a();

    /* JADX INFO: renamed from: safeHandlerThread$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h safeHandlerThread = AbstractC30060g.m92088H(new C24069a(4));

    /* JADX INFO: renamed from: safeHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h safeHandler = AbstractC30060g.m92088H(new C24117a(this, 2));

    private final Handler getSafeHandler() {
        return (Handler) this.safeHandler.getValue();
    }

    private final HandlerThread getSafeHandlerThread() {
        return (HandlerThread) this.safeHandlerThread.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4(InterfaceC4339a block, SafeVariable this$0) {
        AbstractC22676k.m65750j(block, "$block");
        AbstractC22676k.m65750j(this$0, "this$0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((C3058t) this$0.deferred).m8807L(block.invoke());
        Log.d("Profiling", " Time taken (:SafeVariable>webrtc>initialize): " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms thread name " + Thread.currentThread().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandlerThread safeHandlerThread_delegate$lambda$1() {
        HandlerThread handlerThread = new HandlerThread("safe-variable-thread");
        handlerThread.start();
        return handlerThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler safeHandler_delegate$lambda$2(SafeVariable this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new Handler(this$0.getSafeHandlerThread().getLooper());
    }

    public final Object get(InterfaceC30057d<? super T> interfaceC30057d) {
        Object objM8817m = ((C3058t) this.deferred).m8817m(interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8817m;
    }

    public final void initialize(InterfaceC4339a block) {
        AbstractC22676k.m65750j(block, "block");
        getSafeHandler().post(new RunnableC20151r0(15, block, this));
    }

    public final void reset() {
        this.deferred = AbstractC3006f0.m8707a();
    }
}
