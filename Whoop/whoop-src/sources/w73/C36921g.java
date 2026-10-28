package w73;

import bi.AbstractC3269g;
import com.whoop.data.repositories.C6656c;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.EnumC30024c;

/* JADX INFO: renamed from: w73.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C36921g implements InterfaceC23413d, InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final InterfaceC23413d f157977w;

    /* JADX INFO: renamed from: x */
    public final C6656c f157978x;

    /* JADX INFO: renamed from: y */
    public InterfaceC26443b f157979y;

    /* JADX INFO: renamed from: z */
    public boolean f157980z;

    public C36921g(InterfaceC23413d interfaceC23413d, C6656c c6656c) {
        this.f157977w = interfaceC23413d;
        this.f157978x = c6656c;
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        if (EnumC30024c.m91917c(this.f157979y, interfaceC26443b)) {
            this.f157979y = interfaceC26443b;
            this.f157977w.mo13591b(this);
        }
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        this.f157979y.dispose();
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f157979y.isDisposed();
    }

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        if (this.f157980z) {
            return;
        }
        this.f157980z = true;
        this.f157977w.onComplete();
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        if (this.f157980z) {
            AbstractC21598x.m60677d0(th3);
        } else {
            this.f157980z = true;
            this.f157977w.onError(th3);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        if (this.f157980z) {
            return;
        }
        try {
            this.f157978x.accept(obj);
            this.f157977w.onNext(obj);
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            this.f157979y.dispose();
            onError(th3);
        }
    }
}
