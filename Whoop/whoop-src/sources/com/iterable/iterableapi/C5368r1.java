package com.iterable.iterableapi;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import lq0.C24656d;
import mc.AbstractC25412i;
import mc.C25404a;
import mc.C25405b;
import p031b9.C2817b;
import p098dt.AbstractC12350b;
import p218ic.C18389w;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import z33.C40052a;
import z33.C40053b;

/* JADX INFO: renamed from: com.iterable.iterableapi.r1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5368r1 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f21814c = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21815a;

    /* JADX INFO: renamed from: b */
    public final Object f21816b;

    public /* synthetic */ C5368r1(Object obj, int i13) {
        this.f21815a = i13;
        this.f21816b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f21815a) {
            case 0:
                super.onAvailable(network);
                C2817b c2817b = (C2817b) this.f21816b;
                ((HashSet) c2817b.f11021E).add(network);
                AbstractC12350b.m34577Z("NetworkConnectivityManager", "Network Connected");
                c2817b.f11023x = true;
                Iterator it = new ArrayList((ArrayList) c2817b.f11025z).iterator();
                while (it.hasNext()) {
                    ((C5316d2) it.next()).m16427c();
                }
                break;
            case 1:
            default:
                super.onAvailable(network);
                break;
            case 2:
                AbstractC22676k.m65750j(network, "network");
                C40053b c40053b = (C40053b) this.f21816b;
                C2345k c2345kM128400b = c40053b.m128400b();
                InterfaceC2339e interfaceC2339e = c2345kM128400b.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                String str = c2345kM128400b.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM128400b.f9274b.log(enumC2341g, str, "[callback#onAvailable] #network; onAvailable :: " + network, null);
                }
                C40053b.m128399a(c40053b);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f21815a) {
            case 1:
                AbstractC22676k.m65750j(network, "network");
                AbstractC22676k.m65750j(networkCapabilities, "networkCapabilities");
                C18389w.m52886d().m52888a(AbstractC25412i.f99516a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((C24656d) this.f21816b).invoke(C25404a.f99501a);
                break;
            case 2:
                AbstractC22676k.m65750j(network, "network");
                AbstractC22676k.m65750j(networkCapabilities, "networkCapabilities");
                C40053b c40053b = (C40053b) this.f21816b;
                C2345k c2345kM128400b = c40053b.m128400b();
                InterfaceC2339e interfaceC2339e = c2345kM128400b.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                String str = c2345kM128400b.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM128400b.f9274b.log(enumC2341g, str, "[callback#onCapabilitiesChanged] #network; onCapabilitiesChanged :: " + networkCapabilities, null);
                }
                C40053b.m128399a(c40053b);
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Set] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f21815a) {
            case 0:
                super.onLost(network);
                AbstractC12350b.m34577Z("NetworkConnectivityManager", "Network Disconnected");
                C2817b c2817b = (C2817b) this.f21816b;
                HashSet hashSet = (HashSet) c2817b.f11021E;
                hashSet.remove(network);
                if (hashSet.isEmpty()) {
                    c2817b.f11023x = false;
                    Iterator it = new ArrayList((ArrayList) c2817b.f11025z).iterator();
                    while (it.hasNext()) {
                        ((C5316d2) it.next()).getClass();
                    }
                }
                break;
            case 1:
                AbstractC22676k.m65750j(network, "network");
                C18389w.m52886d().m52888a(AbstractC25412i.f99516a, "NetworkRequestConstraintController onLost callback");
                ((C24656d) this.f21816b).invoke(new C25405b(7));
                break;
            default:
                AbstractC22676k.m65750j(network, "network");
                C2345k c2345kM128400b = ((C40053b) this.f21816b).m128400b();
                InterfaceC2339e interfaceC2339e = c2345kM128400b.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                InterfaceC30057d interfaceC30057d = null;
                if (interfaceC2339e.isLoggable(enumC2341g, c2345kM128400b.f9273a)) {
                    c2345kM128400b.f9274b.log(enumC2341g, c2345kM128400b.f9273a, "[callback#onLost] #network; onLost :: " + network, null);
                }
                ((C40053b) this.f21816b).f172859f = false;
                C40053b c40053b = (C40053b) this.f21816b;
                AbstractC3006f0.m8732z(c40053b.f172854a, null, null, new C40052a(c40053b.f172860g, interfaceC30057d, 1), 3);
                break;
        }
    }

    public C5368r1(C24656d c24656d) {
        this.f21815a = 1;
        this.f21816b = c24656d;
    }
}
