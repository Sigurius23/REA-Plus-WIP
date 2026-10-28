package z33;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import com.iterable.iterableapi.C5368r1;
import f53.C14118f;
import j43.C21317a;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23467m;
import l83.C23470p;
import m83.C25235a0;
import p026b2.C2320z;
import p098dt.AbstractC12350b;
import p460rg.AbstractC31375j;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: z33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C40053b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2994c0 f172854a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f172855b;

    /* JADX INFO: renamed from: c */
    public final C23470p f172856c;

    /* JADX INFO: renamed from: d */
    public final Object f172857d;

    /* JADX INFO: renamed from: e */
    public final C5368r1 f172858e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f172859f;

    /* JADX INFO: renamed from: g */
    public volatile Object f172860g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f172861h;

    public C40053b(InterfaceC2994c0 scope, ConnectivityManager connectivityManager) {
        AbstractC22676k.m65750j(scope, "scope");
        this.f172854a = scope;
        this.f172855b = connectivityManager;
        this.f172856c = AbstractC1772c1.m5382S(this, "Video:NetworkStateProvider");
        this.f172857d = new Object();
        this.f172858e = new C5368r1(this, 2);
        this.f172859f = m128401c();
        this.f172860g = C25235a0.f99113w;
        this.f172861h = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: a */
    public static final void m128399a(C40053b c40053b) {
        boolean zM128401c = c40053b.m128401c();
        InterfaceC30057d interfaceC30057d = null;
        if (!c40053b.f172859f && zM128401c) {
            C2345k c2345kM128400b = c40053b.m128400b();
            InterfaceC2339e interfaceC2339e = c2345kM128400b.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, c2345kM128400b.f9273a)) {
                c2345kM128400b.f9274b.log(enumC2341g, c2345kM128400b.f9273a, "[notifyListenersIfNetworkStateChanged] #network; Network connected.", null);
            }
            c40053b.f172859f = true;
            AbstractC3006f0.m8732z(c40053b.f172854a, null, null, new C40052a(c40053b.f172860g, interfaceC30057d, 0), 3);
            return;
        }
        if (!c40053b.f172859f || zM128401c) {
            return;
        }
        C2345k c2345kM128400b2 = c40053b.m128400b();
        InterfaceC2339e interfaceC2339e2 = c2345kM128400b2.f9275c;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM128400b2.f9273a)) {
            c2345kM128400b2.f9274b.log(enumC2341g2, c2345kM128400b2.f9273a, "[notifyListenersIfNetworkStateChanged] #network; Network disconnected.", null);
        }
        c40053b.f172859f = false;
        AbstractC3006f0.m8732z(c40053b.f172854a, null, null, new C40052a(c40053b.f172860g, interfaceC30057d, 1), 3);
    }

    /* JADX INFO: renamed from: b */
    public final C2345k m128400b() {
        return (C2345k) this.f172856c.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m128401c() {
        Object objM107888l;
        try {
            ConnectivityManager connectivityManager = this.f172855b;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                objM107888l = Boolean.valueOf(networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16));
            } else {
                objM107888l = null;
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Boolean bool = (Boolean) (objM107888l instanceof C23467m ? null : objM107888l);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: d */
    public final void m128402d(C14118f listener) {
        AbstractC22676k.m65750j(listener, "listener");
        synchronized (this.f172857d) {
            this.f172860g = AbstractC12350b.m34555D(listener, this.f172860g);
            if (this.f172861h.compareAndSet(false, true)) {
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
                AbstractC22676k.m65749i(networkRequestBuild, "build(...)");
                AbstractC31375j.m96487c(this.f172855b, new C2320z(27, networkRequestBuild, this.f172858e));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: e */
    public final void m128403e(C14118f listener) {
        AbstractC22676k.m65750j(listener, "listener");
        synchronized (this.f172857d) {
            try {
                LinkedHashSet linkedHashSetM34604y = AbstractC12350b.m34604y(listener, this.f172860g);
                if (linkedHashSetM34604y.isEmpty() && this.f172861h.compareAndSet(true, false)) {
                    AbstractC31375j.m96487c(this.f172855b, new C21317a(this.f172858e, 26));
                }
                this.f172860g = linkedHashSetM34604y;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
