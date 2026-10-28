package t73;

import bi.AbstractC3269g;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import p249jc.C21565a;
import p249jc.C21567b;
import p73.InterfaceC28961b;
import q73.EnumC30024c;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: t73.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C33589b extends AtomicReference implements InterfaceC23413d, InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final InterfaceC28961b f140172w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC28961b f140173x;

    /* JADX INFO: renamed from: y */
    public final C21565a f140174y = AbstractC31056a.f128063b;

    /* JADX INFO: renamed from: z */
    public final C21567b f140175z = AbstractC31056a.f128064c;

    public C33589b(InterfaceC28961b interfaceC28961b, InterfaceC28961b interfaceC28961b2) {
        this.f140172w = interfaceC28961b;
        this.f140173x = interfaceC28961b2;
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        if (EnumC30024c.m91916b(this, interfaceC26443b)) {
            try {
                this.f140175z.getClass();
            } catch (Throwable th3) {
                AbstractC3269g.m9495a0(th3);
                interfaceC26443b.dispose();
                onError(th3);
            }
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

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(EnumC30024c.f122536w);
        try {
            this.f140174y.getClass();
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            AbstractC21598x.m60677d0(th3);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        if (isDisposed()) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        lazySet(EnumC30024c.f122536w);
        try {
            this.f140173x.accept(th3);
        } catch (Throwable th4) {
            AbstractC3269g.m9495a0(th4);
            AbstractC21598x.m60677d0(new CompositeException(th3, th4));
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f140172w.accept(obj);
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            ((InterfaceC26443b) get()).dispose();
            onError(th3);
        }
    }
}
