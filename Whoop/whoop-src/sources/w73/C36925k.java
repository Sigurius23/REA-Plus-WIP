package w73;

import ad3.C0783z;
import bi.AbstractC3269g;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p037bu.C3632c;
import p249jc.AbstractC21598x;
import q73.EnumC30024c;
import r73.AbstractC31056a;
import s73.InterfaceC32243a;

/* JADX INFO: renamed from: w73.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C36925k implements InterfaceC23413d, InterfaceC32243a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f157987E;

    /* JADX INFO: renamed from: F */
    public final Object f157988F;

    /* JADX INFO: renamed from: w */
    public final InterfaceC23413d f157989w;

    /* JADX INFO: renamed from: x */
    public InterfaceC26443b f157990x;

    /* JADX INFO: renamed from: y */
    public InterfaceC32243a f157991y;

    /* JADX INFO: renamed from: z */
    public boolean f157992z;

    public C36925k(InterfaceC23413d interfaceC23413d, Object obj, int i13) {
        this.f157987E = i13;
        this.f157989w = interfaceC23413d;
        this.f157988F = obj;
    }

    @Override // s73.InterfaceC32244b
    /* JADX INFO: renamed from: a */
    public int mo1488a() {
        switch (this.f157987E) {
        }
        return 0;
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        if (EnumC30024c.m91917c(this.f157990x, interfaceC26443b)) {
            this.f157990x = interfaceC26443b;
            if (interfaceC26443b instanceof InterfaceC32243a) {
                this.f157991y = (InterfaceC32243a) interfaceC26443b;
            }
            this.f157989w.mo13591b(this);
        }
    }

    @Override // s73.InterfaceC32247e
    public final void clear() {
        this.f157991y.clear();
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        this.f157990x.dispose();
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f157990x.isDisposed();
    }

    @Override // s73.InterfaceC32247e
    public final boolean isEmpty() {
        return this.f157991y.isEmpty();
    }

    @Override // s73.InterfaceC32247e
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        if (this.f157992z) {
            return;
        }
        this.f157992z = true;
        this.f157989w.onComplete();
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        if (this.f157992z) {
            AbstractC21598x.m60677d0(th3);
        } else {
            this.f157992z = true;
            this.f157989w.onError(th3);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        switch (this.f157987E) {
            case 0:
                try {
                    if (((Class) ((C0783z) this.f157988F).f2818x).isInstance(obj)) {
                        this.f157989w.onNext(obj);
                    }
                } catch (Throwable th3) {
                    AbstractC3269g.m9495a0(th3);
                    this.f157990x.dispose();
                    onError(th3);
                    return;
                }
                break;
            default:
                if (!this.f157992z) {
                    try {
                        Object objCast = ((Class) ((C3632c) this.f157988F).f14788w).cast(obj);
                        AbstractC31056a.m95616a(objCast, "The mapper function returned a null value.");
                        this.f157989w.onNext(objCast);
                    } catch (Throwable th4) {
                        AbstractC3269g.m9495a0(th4);
                        this.f157990x.dispose();
                        onError(th4);
                    }
                    break;
                }
                break;
        }
    }

    @Override // s73.InterfaceC32247e
    public final Object poll() {
        Object objPoll;
        switch (this.f157987E) {
            case 0:
                break;
            default:
                Object objPoll2 = this.f157991y.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objCast = ((Class) ((C3632c) this.f157988F).f14788w).cast(objPoll2);
                AbstractC31056a.m95616a(objCast, "The mapper function returned a null value.");
                return objCast;
        }
        do {
            objPoll = this.f157991y.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((Class) ((C0783z) this.f157988F).f2818x).isInstance(objPoll));
        return objPoll;
    }
}
