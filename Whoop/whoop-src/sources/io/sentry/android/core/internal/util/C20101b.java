package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import io.sentry.C20535s;
import io.sentry.EnumC20431n0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20441o0;
import java.util.Iterator;
import mc.C25408e;
import p005a3.C0237p;
import p218ic.C18389w;
import p364oc.AbstractC27813g;
import p364oc.C27812f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C20101b extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f75509b;

    public /* synthetic */ C20101b(Object obj, int i13) {
        this.f75508a = i13;
        this.f75509b = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m55981a() {
        ((C20102c) this.f75509b).f75522K.set(false);
        C20535s c20535sM56711a = ((C20102c) this.f75509b).f75517F.m56711a();
        try {
            ((C20102c) this.f75509b).f75519H = null;
            ((C20102c) this.f75509b).f75520I = null;
            C20102c c20102c = (C20102c) this.f75509b;
            c20102c.f75526z.getClass();
            c20102c.f75521J = SystemClock.uptimeMillis();
            ((C20102c) this.f75509b).f75524x.getLogger().mo16066m(EnumC20436n5.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = ((C20102c) this.f75509b).f75516E.iterator();
            while (it.hasNext()) {
                ((InterfaceC20441o0) it.next()).mo55903b(EnumC20431n0.DISCONNECTED);
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

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f75508a) {
            case 0:
                ((C20102c) this.f75509b).f75520I = network;
                if (((C20102c) this.f75509b).f75522K.getAndSet(true)) {
                    return;
                }
                C20535s c20535sM56711a = C20102c.f75512N.m56711a();
                try {
                    Iterator it = C20102c.f75513O.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                    }
                    c20535sM56711a.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        c20535sM56711a.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 1:
                C0237p.m668a((C0237p) this.f75509b, network, true);
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z4) {
        switch (this.f75508a) {
            case 2:
                AbstractC22676k.m65750j(network, "network");
                if (network.equals(((C27812f) this.f75509b).f112056f.getActiveNetwork())) {
                    C18389w.m52886d().m52888a(AbstractC27813g.f112060a, "Network blocked status changed: " + z4);
                    C27812f c27812f = (C27812f) this.f75509b;
                    Object objMo36475c = c27812f.f44831e;
                    if (objMo36475c == null) {
                        objMo36475c = c27812f.mo36475c();
                    }
                    C25408e c25408e = (C25408e) objMo36475c;
                    C27812f c27812f2 = (C27812f) this.f75509b;
                    synchronized (c27812f2.f112057g) {
                        if (c27812f2.f112058h == z4) {
                            return;
                        }
                        c27812f2.f112058h = z4;
                        ((C27812f) this.f75509b).m36476d(new C25408e(c25408e.f99504a, c25408e.f99505b, c25408e.f99506c, c25408e.f99507d, z4));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z4);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b2 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #3 {all -> 0x00bc, blocks: (B:36:0x00a2, B:37:0x00ac, B:39:0x00b2), top: B:71:0x00a2 }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        EnumC20431n0 enumC20431n0M55993m;
        C20535s c20535sM56711a;
        Iterator it;
        switch (this.f75508a) {
            case 0:
                if (network.equals(((C20102c) this.f75509b).f75520I)) {
                    NetworkCapabilities networkCapabilities = ((C20102c) this.f75509b).f75519H;
                    int i13 = 0;
                    if ((networkCapabilities == null) != (capabilities == null)) {
                        ((C20102c) this.f75509b).m55990b0(capabilities);
                        enumC20431n0M55993m = ((C20102c) this.f75509b).m55993m();
                        c20535sM56711a = ((C20102c) this.f75509b).f75517F.m56711a();
                        it = ((C20102c) this.f75509b).f75516E.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC20441o0) it.next()).mo55903b(enumC20431n0M55993m);
                        }
                        c20535sM56711a.close();
                    } else if (networkCapabilities != null || capabilities != null) {
                        int[] iArr = C20102c.f75515Q;
                        int length = iArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                int[] iArr2 = C20102c.f75514P;
                                int length2 = iArr2.length;
                                while (true) {
                                    if (i13 < length2) {
                                        int i15 = iArr2[i13];
                                        if (networkCapabilities.hasTransport(i15) == capabilities.hasTransport(i15)) {
                                            i13++;
                                        }
                                    }
                                }
                            } else {
                                int i16 = iArr[i14];
                                if (i16 == 0 || networkCapabilities.hasCapability(i16) == capabilities.hasCapability(i16)) {
                                    i14++;
                                }
                            }
                            ((C20102c) this.f75509b).m55990b0(capabilities);
                            enumC20431n0M55993m = ((C20102c) this.f75509b).m55993m();
                            c20535sM56711a = ((C20102c) this.f75509b).f75517F.m56711a();
                            try {
                                it = ((C20102c) this.f75509b).f75516E.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC20441o0) it.next()).mo55903b(enumC20431n0M55993m);
                                }
                                c20535sM56711a.close();
                            } catch (Throwable th3) {
                                try {
                                    c20535sM56711a.close();
                                    break;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                    }
                    C20535s c20535sM56711a2 = C20102c.f75512N.m56711a();
                    try {
                        Iterator it3 = C20102c.f75513O.iterator();
                        while (it3.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it3.next()).onCapabilitiesChanged(network, capabilities);
                        }
                        c20535sM56711a2.close();
                        return;
                    } catch (Throwable th5) {
                        try {
                            c20535sM56711a2.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                return;
            case 1:
            default:
                super.onCapabilitiesChanged(network, capabilities);
                return;
            case 2:
                AbstractC22676k.m65750j(network, "network");
                AbstractC22676k.m65750j(capabilities, "capabilities");
                C18389w.m52886d().m52888a(AbstractC27813g.f112060a, "Network capabilities changed: " + capabilities);
                C27812f c27812f = (C27812f) this.f75509b;
                c27812f.m36476d(AbstractC27813g.m83891a(capabilities, c27812f.f112058h));
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f75508a) {
            case 0:
                if (network.equals(((C20102c) this.f75509b).f75520I)) {
                    m55981a();
                    C20535s c20535sM56711a = C20102c.f75512N.m56711a();
                    try {
                        Iterator it = C20102c.f75513O.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                        }
                        c20535sM56711a.close();
                        return;
                    } catch (Throwable th3) {
                        try {
                            c20535sM56711a.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                return;
            case 1:
                C0237p.m668a((C0237p) this.f75509b, network, false);
                return;
            default:
                AbstractC22676k.m65750j(network, "network");
                C18389w.m52886d().m52888a(AbstractC27813g.f112060a, "Network connection lost");
                ((C27812f) this.f75509b).m36476d(new C25408e(false, false, false, false, false));
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.f75508a) {
            case 0:
                m55981a();
                C20535s c20535sM56711a = C20102c.f75512N.m56711a();
                try {
                    Iterator it = C20102c.f75513O.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                    }
                    c20535sM56711a.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        c20535sM56711a.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                super.onUnavailable();
                return;
        }
    }
}
