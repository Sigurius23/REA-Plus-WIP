package e83;

import b83.C2810f;
import b83.C2811g;
import b83.EnumC2812h;
import eg3.InterfaceC13183b;
import l73.InterfaceC23411b;
import p012ab.C0682h0;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: e83.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C12861f extends AbstractC12858c {

    /* JADX INFO: renamed from: E */
    public volatile boolean f44196E;

    /* JADX INFO: renamed from: x */
    public final C12857b f44197x;

    /* JADX INFO: renamed from: y */
    public boolean f44198y;

    /* JADX INFO: renamed from: z */
    public C0682h0 f44199z;

    public C12861f(C12857b c12857b) {
        this.f44197x = c12857b;
    }

    @Override // eg3.InterfaceC13182a
    /* JADX INFO: renamed from: b */
    public final void mo36113b(InterfaceC13183b interfaceC13183b) {
        boolean z4 = true;
        if (!this.f44196E) {
            synchronized (this) {
                try {
                    if (!this.f44196E) {
                        if (this.f44198y) {
                            C0682h0 c0682h0 = this.f44199z;
                            if (c0682h0 == null) {
                                c0682h0 = new C0682h0(2, (byte) 0);
                                this.f44199z = c0682h0;
                            }
                            c0682h0.m1691f(new C2811g(interfaceC13183b));
                            return;
                        }
                        this.f44198y = true;
                        z4 = false;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (z4) {
            interfaceC13183b.cancel();
        } else {
            this.f44197x.mo36113b(interfaceC13183b);
            m36117d();
        }
    }

    @Override // l73.AbstractC23410a
    /* JADX INFO: renamed from: c */
    public final void mo36114c(InterfaceC23411b interfaceC23411b) {
        this.f44197x.m67903a(interfaceC23411b);
    }

    /* JADX INFO: renamed from: d */
    public final void m36117d() {
        C0682h0 c0682h0;
        while (true) {
            synchronized (this) {
                try {
                    c0682h0 = this.f44199z;
                    if (c0682h0 == null) {
                        this.f44198y = false;
                        return;
                    }
                    this.f44199z = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c0682h0.m1690e(this.f44197x);
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onComplete() {
        if (this.f44196E) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f44196E) {
                    return;
                }
                this.f44196E = true;
                if (!this.f44198y) {
                    this.f44198y = true;
                    this.f44197x.onComplete();
                    return;
                }
                C0682h0 c0682h0 = this.f44199z;
                if (c0682h0 == null) {
                    c0682h0 = new C0682h0(2, (byte) 0);
                    this.f44199z = c0682h0;
                }
                c0682h0.m1691f(EnumC2812h.f11003w);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onError(Throwable th3) {
        if (this.f44196E) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        synchronized (this) {
            try {
                boolean z4 = true;
                if (!this.f44196E) {
                    this.f44196E = true;
                    if (this.f44198y) {
                        C0682h0 c0682h0 = this.f44199z;
                        if (c0682h0 == null) {
                            c0682h0 = new C0682h0(2, (byte) 0);
                            this.f44199z = c0682h0;
                        }
                        c0682h0.m1705u(new C2810f(th3));
                        return;
                    }
                    this.f44198y = true;
                    z4 = false;
                }
                if (z4) {
                    AbstractC21598x.m60677d0(th3);
                } else {
                    this.f44197x.onError(th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onNext(Object obj) {
        if (this.f44196E) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f44196E) {
                    return;
                }
                if (!this.f44198y) {
                    this.f44198y = true;
                    this.f44197x.onNext(obj);
                    m36117d();
                } else {
                    C0682h0 c0682h0 = this.f44199z;
                    if (c0682h0 == null) {
                        c0682h0 = new C0682h0(2, (byte) 0);
                        this.f44199z = c0682h0;
                    }
                    c0682h0.m1691f(obj);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
