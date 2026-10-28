package androidx.lifecycle;

import p399pb.C29047d;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1602l implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6270w = 0;

    /* JADX INFO: renamed from: x */
    public final Object f6271x;

    /* JADX INFO: renamed from: y */
    public final Object f6272y;

    public C1602l(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC1577e0 interfaceC1577e0) {
        AbstractC22676k.m65750j(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f6271x = defaultLifecycleObserver;
        this.f6272y = interfaceC1577e0;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 source, EnumC1632v event) {
        switch (this.f6270w) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f6271x;
                AbstractC22676k.m65750j(source, "source");
                AbstractC22676k.m65750j(event, "event");
                switch (AbstractC1599k.f6265a[event.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(source);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(source);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(source);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(source);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(source);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(source);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                InterfaceC1577e0 interfaceC1577e0 = (InterfaceC1577e0) this.f6272y;
                if (interfaceC1577e0 != null) {
                    interfaceC1577e0.mo4080h(source, event);
                    return;
                }
                return;
            default:
                AbstractC22676k.m65750j(source, "source");
                AbstractC22676k.m65750j(event, "event");
                if (event == EnumC1632v.ON_START) {
                    ((AbstractC1638x) this.f6271x).mo4988d(this);
                    ((C29047d) this.f6272y).m88294d();
                    return;
                }
                return;
        }
    }

    public C1602l(AbstractC1638x abstractC1638x, C29047d c29047d) {
        this.f6271x = abstractC1638x;
        this.f6272y = c29047d;
    }
}
