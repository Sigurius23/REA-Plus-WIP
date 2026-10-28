package mc;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import p218ic.C18389w;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mc.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C25410g extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public static final C25410g f99509a = new C25410g();

    /* JADX INFO: renamed from: b */
    public static final Object f99510b = new Object();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f99511c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static NetworkCapabilities f99512d;

    /* JADX INFO: renamed from: e */
    public static boolean f99513e;

    /* JADX INFO: renamed from: f */
    public static boolean f99514f;

    /* JADX INFO: renamed from: a */
    public static boolean m74596a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        return !f99514f && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    /* JADX INFO: renamed from: b */
    public static void m74597b() {
        ArrayList<C23465k> arrayList = new ArrayList();
        synchronized (f99510b) {
            try {
                for (Map.Entry entry : f99511c.entrySet()) {
                    Function1 function1 = (Function1) entry.getKey();
                    NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                    C25410g c25410g = f99509a;
                    NetworkCapabilities networkCapabilities = f99512d;
                    c25410g.getClass();
                    arrayList.add(new C23465k(function1, m74596a(networkRequest, networkCapabilities) ? C25404a.f99501a : new C25405b(7)));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        for (C23465k c23465k : arrayList) {
            ((Function1) c23465k.f92937w).invoke((AbstractC25406c) c23465k.f92938x);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z4) {
        AbstractC22676k.m65750j(network, "network");
        C18389w.m52886d().m52888a(AbstractC25412i.f99516a, "NetworkRequestConstraintController onBlockedStatusChanged callback");
        synchronized (f99510b) {
            if (f99514f == z4) {
                return;
            }
            f99514f = z4;
            m74597b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC22676k.m65750j(network, "network");
        AbstractC22676k.m65750j(networkCapabilities, "networkCapabilities");
        C18389w.m52886d().m52888a(AbstractC25412i.f99516a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f99510b) {
            f99512d = networkCapabilities;
        }
        m74597b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC22676k.m65750j(network, "network");
        C18389w.m52886d().m52888a(AbstractC25412i.f99516a, "NetworkRequestConstraintController onLost callback");
        synchronized (f99510b) {
            f99512d = null;
            Iterator it = f99511c.keySet().iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(new C25405b(7));
            }
        }
    }
}
