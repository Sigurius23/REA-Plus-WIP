package p031b9;

import android.os.Looper;
import p516u8.AbstractC34609o0;
import p607x8.AbstractC38046a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.f1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2831f1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2828e1 f11159a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2825d1 f11160b;

    /* JADX INFO: renamed from: c */
    public int f11161c;

    /* JADX INFO: renamed from: d */
    public Object f11162d;

    /* JADX INFO: renamed from: e */
    public final Looper f11163e;

    /* JADX INFO: renamed from: f */
    public boolean f11164f;

    public C2831f1(InterfaceC2825d1 interfaceC2825d1, InterfaceC2828e1 interfaceC2828e1, AbstractC34609o0 abstractC34609o0, int i13, Looper looper) {
        this.f11160b = interfaceC2825d1;
        this.f11159a = interfaceC2828e1;
        this.f11163e = looper;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8126a(boolean z4) {
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    public final void m8127b() {
        AbstractC35849g.m113807i(!this.f11164f);
        this.f11164f = true;
        C2848l0 c2848l0 = (C2848l0) this.f11160b;
        synchronized (c2848l0) {
            if (!c2848l0.f11283d0 && c2848l0.f11263J.getThread().isAlive()) {
                c2848l0.f11261H.m121878a(14, this).m121876b();
                return;
            }
            AbstractC38046a.m121826u("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m8126a(false);
        }
    }
}
