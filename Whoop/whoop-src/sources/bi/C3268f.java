package bi;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: renamed from: bi.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C3268f implements InterfaceC3267e {

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f12767b;

    public C3268f(ConnectivityManager connectivityManager) {
        this.f12767b = connectivityManager;
    }

    @Override // bi.InterfaceC3267e
    public final boolean isOnline() {
        ConnectivityManager connectivityManager = this.f12767b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
