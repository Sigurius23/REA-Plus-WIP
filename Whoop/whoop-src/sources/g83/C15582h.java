package g83;

import b83.C2809e;
import b83.C2810f;
import b83.EnumC2812h;
import b83.InterfaceC2805a;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p012ab.C0682h0;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: g83.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C15582h extends AbstractC15583i implements InterfaceC2805a {

    /* JADX INFO: renamed from: w */
    public final C15578d f58531w;

    /* JADX INFO: renamed from: x */
    public boolean f58532x;

    /* JADX INFO: renamed from: y */
    public C0682h0 f58533y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f58534z;

    public C15582h(C15578d c15578d) {
        this.f58531w = c15578d;
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        boolean z4 = true;
        if (!this.f58534z) {
            synchronized (this) {
                try {
                    if (!this.f58534z) {
                        if (this.f58532x) {
                            C0682h0 c0682h0 = this.f58533y;
                            if (c0682h0 == null) {
                                c0682h0 = new C0682h0(2, (byte) 0);
                                this.f58533y = c0682h0;
                            }
                            c0682h0.m1691f(new C2809e(interfaceC26443b));
                            return;
                        }
                        this.f58532x = true;
                        z4 = false;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (z4) {
            interfaceC26443b.dispose();
        } else {
            this.f58531w.mo13591b(interfaceC26443b);
            m43879e();
        }
    }

    @Override // l73.AbstractC23412c
    /* JADX INFO: renamed from: d */
    public final void mo43873d(InterfaceC23413d interfaceC23413d) {
        this.f58531w.m67905c(interfaceC23413d);
    }

    /* JADX INFO: renamed from: e */
    public final void m43879e() {
        C0682h0 c0682h0;
        while (true) {
            synchronized (this) {
                try {
                    c0682h0 = this.f58533y;
                    if (c0682h0 == null) {
                        this.f58532x = false;
                        return;
                    }
                    this.f58533y = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c0682h0.m1696k(this);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        if (this.f58534z) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f58534z) {
                    return;
                }
                this.f58534z = true;
                if (!this.f58532x) {
                    this.f58532x = true;
                    this.f58531w.onComplete();
                    return;
                }
                C0682h0 c0682h0 = this.f58533y;
                if (c0682h0 == null) {
                    c0682h0 = new C0682h0(2, (byte) 0);
                    this.f58533y = c0682h0;
                }
                c0682h0.m1691f(EnumC2812h.f11003w);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        if (this.f58534z) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        synchronized (this) {
            try {
                boolean z4 = true;
                if (!this.f58534z) {
                    this.f58534z = true;
                    if (this.f58532x) {
                        C0682h0 c0682h0 = this.f58533y;
                        if (c0682h0 == null) {
                            c0682h0 = new C0682h0(2, (byte) 0);
                            this.f58533y = c0682h0;
                        }
                        c0682h0.m1705u(new C2810f(th3));
                        return;
                    }
                    this.f58532x = true;
                    z4 = false;
                }
                if (z4) {
                    AbstractC21598x.m60677d0(th3);
                } else {
                    this.f58531w.onError(th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        if (this.f58534z) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f58534z) {
                    return;
                }
                if (!this.f58532x) {
                    this.f58532x = true;
                    this.f58531w.onNext(obj);
                    m43879e();
                } else {
                    C0682h0 c0682h0 = this.f58533y;
                    if (c0682h0 == null) {
                        c0682h0 = new C0682h0(2, (byte) 0);
                        this.f58533y = c0682h0;
                    }
                    c0682h0.m1691f(obj);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p73.InterfaceC28962c
    public final boolean test(Object obj) {
        EnumC2812h enumC2812h = EnumC2812h.f11003w;
        C15578d c15578d = this.f58531w;
        if (obj == enumC2812h) {
            c15578d.onComplete();
            return true;
        }
        if (obj instanceof C2810f) {
            c15578d.onError(((C2810f) obj).f11001w);
            return true;
        }
        if (obj instanceof C2809e) {
            c15578d.mo13591b(((C2809e) obj).f11000w);
            return false;
        }
        c15578d.onNext(obj);
        return false;
    }
}
