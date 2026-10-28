package io.sentry.android.core;

import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.C6656c;
import io.sentry.C20315e;
import io.sentry.C20371i4;
import io.sentry.C20440o;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.transport.C20554d;
import io.sentry.util.C20579a;
import io.sentry.util.C20584f;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;
import p211i5.C18090c;

/* JADX INFO: renamed from: io.sentry.android.core.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20160u0 implements InterfaceC20060b0 {

    /* JADX INFO: renamed from: G */
    public final boolean f75747G;

    /* JADX INFO: renamed from: H */
    public final boolean f75748H;

    /* JADX INFO: renamed from: x */
    public final long f75751x;

    /* JADX INFO: renamed from: y */
    public C20440o f75752y;

    /* JADX INFO: renamed from: w */
    public final AtomicLong f75750w = new AtomicLong(0);

    /* JADX INFO: renamed from: z */
    public final C20584f f75753z = new C20584f(new C18090c(24));

    /* JADX INFO: renamed from: E */
    public final C20579a f75745E = new C20579a();

    /* JADX INFO: renamed from: F */
    public final C20371i4 f75746F = C20371i4.f76402a;

    /* JADX INFO: renamed from: I */
    public final C20554d f75749I = C20554d.f77025w;

    public C20160u0(long j7, boolean z4, boolean z13) {
        this.f75751x = j7;
        this.f75747G = z4;
        this.f75748H = z13;
    }

    /* JADX INFO: renamed from: a */
    public final void m56068a(String str) {
        if (this.f75748H) {
            C20315e c20315e = new C20315e();
            c20315e.f76286E = NotificationCompat.CATEGORY_NAVIGATION;
            c20315e.m56470c(str, "state");
            c20315e.f76288G = "app.lifecycle";
            c20315e.f76290I = EnumC20436n5.INFO;
            this.f75746F.mo56428h(c20315e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56069b() {
        C20535s c20535sM56711a = this.f75745E.m56711a();
        try {
            C20440o c20440o = this.f75752y;
            if (c20440o != null) {
                c20440o.cancel();
                this.f75752y = null;
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: i */
    public final void mo55909i() {
        m56069b();
        this.f75749I.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C6656c c6656c = new C6656c(this, 6);
        C20371i4 c20371i4 = this.f75746F;
        c20371i4.mo56439s(c6656c);
        AtomicLong atomicLong = this.f75750w;
        long j7 = atomicLong.get();
        if (j7 == 0 || j7 + this.f75751x <= jCurrentTimeMillis) {
            if (this.f75747G) {
                c20371i4.mo56441u();
            }
            c20371i4.mo56432l().getReplayController().mo56102x();
        }
        c20371i4.mo56432l().getReplayController().resume();
        atomicLong.set(jCurrentTimeMillis);
        m56068a("foreground");
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: k */
    public final void mo55910k() {
        this.f75749I.getClass();
        this.f75750w.set(System.currentTimeMillis());
        this.f75746F.mo56432l().getReplayController().pause();
        C20535s c20535sM56711a = this.f75745E.m56711a();
        try {
            m56069b();
            this.f75752y = new C20440o(this, 1);
            ((Timer) this.f75753z.m56714a()).schedule(this.f75752y, this.f75751x);
            c20535sM56711a.close();
            m56068a("background");
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
