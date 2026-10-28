package t73;

import bi.AbstractC3269g;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import mm.C25680d;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.EnumC30024c;

/* JADX INFO: renamed from: t73.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C33588a extends AtomicReference implements InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final C25680d f140170w;

    /* JADX INFO: renamed from: x */
    public final C25680d f140171x;

    public C33588a(C25680d c25680d, C25680d c25680d2) {
        this.f140170w = c25680d;
        this.f140171x = c25680d2;
    }

    /* JADX INFO: renamed from: a */
    public final void m106087a(Throwable th3) {
        lazySet(EnumC30024c.f122536w);
        try {
            this.f140171x.accept(th3);
        } catch (Throwable th4) {
            AbstractC3269g.m9495a0(th4);
            AbstractC21598x.m60677d0(new CompositeException(th3, th4));
        }
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        EnumC30024c.m91915a(this);
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return get() == EnumC30024c.f122536w;
    }
}
