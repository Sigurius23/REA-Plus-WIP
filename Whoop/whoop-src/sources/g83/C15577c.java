package g83;

import java.util.concurrent.atomic.AtomicBoolean;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;

/* JADX INFO: renamed from: g83.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C15577c extends AtomicBoolean implements InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final InterfaceC23413d f58512w;

    /* JADX INFO: renamed from: x */
    public final C15578d f58513x;

    public C15577c(InterfaceC23413d interfaceC23413d, C15578d c15578d) {
        this.f58512w = interfaceC23413d;
        this.f58513x = c15578d;
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f58513x.m43875e(this);
        }
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return get();
    }
}
