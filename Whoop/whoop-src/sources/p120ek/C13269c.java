package p120ek;

import ad3.C0783z;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import com.google.crypto.tink.internal.C5101l0;
import p114eb.C12968k;
import p173gj.C15903d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ek.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13269c extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public C12968k f45950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectivityManager f45951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5101l0 f45952c;

    public C13269c(ConnectivityManager connectivityManager, C5101l0 c5101l0) {
        this.f45951b = connectivityManager;
        this.f45952c = c5101l0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC22676k.m65750j(network, "network");
        NetworkCapabilities networkCapabilities = this.f45951b.getNetworkCapabilities(network);
        C0783z c0783z = (C0783z) this.f45952c.f21444y;
        boolean z4 = true;
        if (networkCapabilities != null) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (!networkCapabilities.hasCapability(12) || !zHasCapability) {
                z4 = false;
            }
        }
        C12968k c12968k = new C12968k();
        c12968k.f44791c = network;
        c12968k.f44792d = c0783z;
        c12968k.f44789a = z4;
        c12968k.f44790b = false;
        if (z4) {
            C15903d c15903d = (C15903d) c0783z.f2818x;
            c15903d.f60138k.debug("AndroidNetworkListener, onNetworkAvailable.");
            c15903d.f60128a.f60167p = Boolean.FALSE;
            AbstractC3006f0.m8732z(c15903d.f60130c, c15903d.f60131d, null, new C1849z1(c15903d, null, 6), 2);
        } else {
            c0783z.m1872q();
        }
        this.f45950a = c12968k;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z4) {
        AbstractC22676k.m65750j(network, "network");
        C12968k c12968k = this.f45950a;
        if (c12968k != null) {
            C12968k.m36451h(c12968k, network, false, z4, 2);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC22676k.m65750j(network, "network");
        AbstractC22676k.m65750j(networkCapabilities, "networkCapabilities");
        C12968k c12968k = this.f45950a;
        if (c12968k != null) {
            C12968k.m36451h(c12968k, network, networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16), false, 4);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC22676k.m65750j(network, "network");
        C12968k c12968k = this.f45950a;
        if (c12968k != null) {
            C12968k.m36451h(c12968k, network, false, false, 4);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        ((C0783z) this.f45952c.f21444y).m1872q();
    }
}
