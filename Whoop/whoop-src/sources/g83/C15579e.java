package g83;

import java.util.concurrent.atomic.AtomicInteger;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;

/* JADX INFO: renamed from: g83.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15579e extends AtomicInteger implements InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final InterfaceC23413d f58518w;

    /* JADX INFO: renamed from: x */
    public final C15581g f58519x;

    /* JADX INFO: renamed from: y */
    public Integer f58520y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f58521z;

    public C15579e(InterfaceC23413d interfaceC23413d, C15581g c15581g) {
        this.f58518w = interfaceC23413d;
        this.f58519x = c15581g;
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f58521z) {
            return;
        }
        this.f58521z = true;
        this.f58519x.m43878f(this);
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f58521z;
    }
}
