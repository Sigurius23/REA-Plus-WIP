package e83;

import a83.EnumC0575c;
import b83.C2810f;
import b83.EnumC2812h;
import b83.InterfaceC2805a;
import eg3.InterfaceC13183b;
import hg3.AbstractC17269i;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import l73.InterfaceC23411b;
import p012ab.C0682h0;

/* JADX INFO: renamed from: e83.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C12856a extends AtomicLong implements InterfaceC13183b, InterfaceC2805a {

    /* JADX INFO: renamed from: E */
    public C0682h0 f44173E;

    /* JADX INFO: renamed from: F */
    public boolean f44174F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f44175G;

    /* JADX INFO: renamed from: H */
    public long f44176H;

    /* JADX INFO: renamed from: w */
    public final InterfaceC23411b f44177w;

    /* JADX INFO: renamed from: x */
    public final C12857b f44178x;

    /* JADX INFO: renamed from: y */
    public boolean f44179y;

    /* JADX INFO: renamed from: z */
    public boolean f44180z;

    public C12856a(InterfaceC23411b interfaceC23411b, C12857b c12857b) {
        this.f44177w = interfaceC23411b;
        this.f44178x = c12857b;
    }

    /* JADX INFO: renamed from: a */
    public final void m36112a(long j7, Object obj) {
        if (this.f44175G) {
            return;
        }
        if (!this.f44174F) {
            synchronized (this) {
                try {
                    if (this.f44175G) {
                        return;
                    }
                    if (this.f44176H == j7) {
                        return;
                    }
                    if (this.f44180z) {
                        C0682h0 c0682h0 = this.f44173E;
                        if (c0682h0 == null) {
                            c0682h0 = new C0682h0(2, (byte) 0);
                            this.f44173E = c0682h0;
                        }
                        c0682h0.m1691f(obj);
                        return;
                    }
                    this.f44179y = true;
                    this.f44174F = true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        test(obj);
    }

    @Override // eg3.InterfaceC13183b
    public final void cancel() {
        if (this.f44175G) {
            return;
        }
        this.f44175G = true;
        this.f44178x.m36115d(this);
    }

    @Override // eg3.InterfaceC13183b
    public final void request(long j7) {
        if (EnumC0575c.m1490b(j7)) {
            AbstractC17269i.m48908p(this, j7);
        }
    }

    @Override // p73.InterfaceC28962c
    public final boolean test(Object obj) {
        if (this.f44175G) {
            return true;
        }
        if (obj == EnumC2812h.f11003w) {
            this.f44177w.onComplete();
            return true;
        }
        if (obj instanceof C2810f) {
            this.f44177w.onError(((C2810f) obj).f11001w);
            return true;
        }
        long j7 = get();
        if (j7 == 0) {
            cancel();
            this.f44177w.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            return true;
        }
        this.f44177w.onNext(obj);
        if (j7 == Long.MAX_VALUE) {
            return false;
        }
        decrementAndGet();
        return false;
    }
}
