package hj0;

import in2.InterfaceC18732d;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: renamed from: hj0.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u00020\u00068\u0004X\u0085\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m65681d2 = {"Lhj0/n;", "", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "<init>", "(Ltr2/n;Lrr2/c;Lin2/d;)V", "", "thr", "", "message", "logRetrofitSuspendException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;", "Ltr2/n;", "getLogger", "()Ltr2/n;", "Lrr2/c;", "getCrashReporter", "()Lrr2/c;", "Lin2/d;", "getDispatcherFactory", "()Lin2/d;", "getDispatcherFactory$annotations", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public abstract class AbstractC17355n {
    private final InterfaceC31766c crashReporter;
    private final InterfaceC18732d dispatcherFactory;
    private final InterfaceC34116n logger;

    public AbstractC17355n(InterfaceC34116n logger, InterfaceC31766c crashReporter, InterfaceC18732d dispatcherFactory) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        this.logger = logger;
        this.crashReporter = crashReporter;
        this.dispatcherFactory = dispatcherFactory;
    }

    @InterfaceC23457c
    public static /* synthetic */ void getDispatcherFactory$annotations() {
    }

    public final InterfaceC31766c getCrashReporter() {
        return this.crashReporter;
    }

    public final InterfaceC18732d getDispatcherFactory() {
        return this.dispatcherFactory;
    }

    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    public final String logRetrofitSuspendException(Throwable thr, String message) {
        AbstractC22676k.m65750j(thr, "thr");
        AbstractC22676k.m65750j(message, "message");
        return AbstractC36685b.m117759a(thr, message, this.logger, this.crashReporter);
    }
}
