package g83;

import b83.C2810f;
import b83.EnumC2812h;
import b83.InterfaceC2805a;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p012ab.C0682h0;

/* JADX INFO: renamed from: g83.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C15575a implements InterfaceC26443b, InterfaceC2805a {

    /* JADX INFO: renamed from: E */
    public C0682h0 f58495E;

    /* JADX INFO: renamed from: F */
    public boolean f58496F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f58497G;

    /* JADX INFO: renamed from: H */
    public long f58498H;

    /* JADX INFO: renamed from: w */
    public final InterfaceC23413d f58499w;

    /* JADX INFO: renamed from: x */
    public final C15576b f58500x;

    /* JADX INFO: renamed from: y */
    public boolean f58501y;

    /* JADX INFO: renamed from: z */
    public boolean f58502z;

    public C15575a(InterfaceC23413d interfaceC23413d, C15576b c15576b) {
        this.f58499w = interfaceC23413d;
        this.f58500x = c15576b;
    }

    /* JADX INFO: renamed from: a */
    public final void m43872a(long j7, Object obj) {
        if (this.f58497G) {
            return;
        }
        if (!this.f58496F) {
            synchronized (this) {
                try {
                    if (this.f58497G) {
                        return;
                    }
                    if (this.f58498H == j7) {
                        return;
                    }
                    if (this.f58502z) {
                        C0682h0 c0682h0 = this.f58495E;
                        if (c0682h0 == null) {
                            c0682h0 = new C0682h0(2, (byte) 0);
                            this.f58495E = c0682h0;
                        }
                        c0682h0.m1691f(obj);
                        return;
                    }
                    this.f58501y = true;
                    this.f58496F = true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        test(obj);
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f58497G) {
            return;
        }
        this.f58497G = true;
        this.f58500x.m43874e(this);
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f58497G;
    }

    @Override // p73.InterfaceC28962c
    public final boolean test(Object obj) {
        if (this.f58497G) {
            return true;
        }
        InterfaceC23413d interfaceC23413d = this.f58499w;
        if (obj == EnumC2812h.f11003w) {
            interfaceC23413d.onComplete();
            return true;
        }
        if (obj instanceof C2810f) {
            interfaceC23413d.onError(((C2810f) obj).f11001w);
            return true;
        }
        interfaceC23413d.onNext(obj);
        return false;
    }
}
