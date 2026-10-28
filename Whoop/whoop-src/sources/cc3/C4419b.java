package cc3;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.RunnableC1605m;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.C3033m;
import bc3.C3078z1;
import bc3.InterfaceC3026k0;
import bc3.InterfaceC3056s0;
import bp0.C3526n;
import hc3.AbstractC17182o;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: cc3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C4419b extends AbstractC3069w1 implements InterfaceC3026k0 {

    /* JADX INFO: renamed from: w */
    public final Handler f17879w;

    /* JADX INFO: renamed from: x */
    public final String f17880x;

    /* JADX INFO: renamed from: y */
    public final boolean f17881y;

    /* JADX INFO: renamed from: z */
    public final C4419b f17882z;

    public C4419b(Handler handler, String str, boolean z4) {
        this.f17879w = handler;
        this.f17880x = str;
        this.f17881y = z4;
        this.f17882z = z4 ? this : new C4419b(handler, str, true);
    }

    /* JADX INFO: renamed from: T */
    public final void m13864T(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        AbstractC3006f0.m8715i(interfaceC30063j, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d.f87316w.dispatch(interfaceC30063j, runnable);
    }

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        if (this.f17879w.post(runnable)) {
            return;
        }
        m13864T(interfaceC30063j, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4419b)) {
            return false;
        }
        C4419b c4419b = (C4419b) obj;
        return c4419b.f17879w == this.f17879w && c4419b.f17881y == this.f17881y;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f17879w) ^ (this.f17881y ? 1231 : 1237);
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: i */
    public final InterfaceC3056s0 mo8690i(long j7, final Runnable runnable, InterfaceC30063j interfaceC30063j) {
        if (j7 > DurationKt.MAX_MILLIS) {
            j7 = 4611686018427387903L;
        }
        if (this.f17879w.postDelayed(runnable, j7)) {
            return new InterfaceC3056s0() { // from class: cc3.a
                @Override // bc3.InterfaceC3056s0
                public final void dispose() {
                    this.f17877w.f17879w.removeCallbacks(runnable);
                }
            };
        }
        m13864T(interfaceC30063j, runnable);
        return C3078z1.f12113w;
    }

    @Override // bc3.AbstractC3076z
    public final boolean isDispatchNeeded(InterfaceC30063j interfaceC30063j) {
        return (this.f17881y && AbstractC22676k.m65745e(Looper.myLooper(), this.f17879w.getLooper())) ? false : true;
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: m */
    public final void mo8691m(long j7, C3033m c3033m) {
        RunnableC1605m runnableC1605m = new RunnableC1605m(2, c3033m, this);
        if (j7 > DurationKt.MAX_MILLIS) {
            j7 = 4611686018427387903L;
        }
        if (this.f17879w.postDelayed(runnableC1605m, j7)) {
            c3033m.m8776u(new C3526n(1, this, runnableC1605m));
        } else {
            m13864T(c3033m.f12054E, runnableC1605m);
        }
    }

    @Override // bc3.AbstractC3069w1
    /* JADX INFO: renamed from: s */
    public final AbstractC3069w1 mo8825s() {
        return this.f17882z;
    }

    @Override // bc3.AbstractC3069w1, bc3.AbstractC3076z
    public final String toString() {
        AbstractC3069w1 abstractC3069w1Mo8825s;
        String str;
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 abstractC3069w1 = AbstractC17182o.f65999a;
        if (this == abstractC3069w1) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC3069w1Mo8825s = abstractC3069w1.mo8825s();
            } catch (UnsupportedOperationException unused) {
                abstractC3069w1Mo8825s = null;
            }
            str = this == abstractC3069w1Mo8825s ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f17880x;
        if (string == null) {
            string = this.f17879w.toString();
        }
        return this.f17881y ? AbstractC2875y.m8299l(string, ".immediate") : string;
    }

    public C4419b(Handler handler) {
        this(handler, null, false);
    }
}
