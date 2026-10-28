package z73;

import a83.EnumC0575c;
import bi.AbstractC3269g;
import com.whoop.data.repositories.C6656c;
import eg3.InterfaceC13183b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23411b;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import p249jc.C21565a;
import r73.AbstractC31056a;
import v73.EnumC35777c;

/* JADX INFO: renamed from: z73.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40164a extends AtomicReference implements InterfaceC23411b, InterfaceC13183b, InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final C6656c f173319w;

    /* JADX INFO: renamed from: x */
    public final C21565a f173320x = AbstractC31056a.f128065d;

    /* JADX INFO: renamed from: y */
    public final C21565a f173321y = AbstractC31056a.f128063b;

    /* JADX INFO: renamed from: z */
    public final EnumC35777c f173322z = EnumC35777c.f152146w;

    public C40164a(C6656c c6656c) {
        this.f173319w = c6656c;
    }

    @Override // eg3.InterfaceC13182a
    /* JADX INFO: renamed from: b */
    public final void mo36113b(InterfaceC13183b interfaceC13183b) {
        boolean z4;
        while (true) {
            if (compareAndSet(null, interfaceC13183b)) {
                z4 = true;
                break;
            } else if (get() != null) {
                interfaceC13183b.cancel();
                if (get() != EnumC0575c.f2049w) {
                    AbstractC21598x.m60677d0(new ProtocolViolationException("Subscription already set!"));
                }
                z4 = false;
                break;
            }
        }
        if (z4) {
            try {
                this.f173322z.accept(this);
            } catch (Throwable th3) {
                AbstractC3269g.m9495a0(th3);
                interfaceC13183b.cancel();
                onError(th3);
            }
        }
    }

    @Override // eg3.InterfaceC13183b
    public final void cancel() {
        EnumC0575c.m1489a(this);
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        EnumC0575c.m1489a(this);
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return get() == EnumC0575c.f2049w;
    }

    @Override // eg3.InterfaceC13182a
    public final void onComplete() {
        Object obj = get();
        EnumC0575c enumC0575c = EnumC0575c.f2049w;
        if (obj != enumC0575c) {
            lazySet(enumC0575c);
            try {
                this.f173321y.getClass();
            } catch (Throwable th3) {
                AbstractC3269g.m9495a0(th3);
                AbstractC21598x.m60677d0(th3);
            }
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onError(Throwable th3) {
        Object obj = get();
        EnumC0575c enumC0575c = EnumC0575c.f2049w;
        if (obj == enumC0575c) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        lazySet(enumC0575c);
        try {
            this.f173320x.accept(th3);
        } catch (Throwable th4) {
            AbstractC3269g.m9495a0(th4);
            AbstractC21598x.m60677d0(new CompositeException(th3, th4));
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f173319w.accept(obj);
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            ((InterfaceC13183b) get()).cancel();
            onError(th3);
        }
    }

    @Override // eg3.InterfaceC13183b
    public final void request(long j7) {
        ((InterfaceC13183b) get()).request(j7);
    }
}
