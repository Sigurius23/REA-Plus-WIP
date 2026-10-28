package live.hms.video.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/network/HMSNetworkManager;", "", "Landroid/content/Context;", "hmsContext", "<init>", "(Landroid/content/Context;)V", "", "isConnectedOverWifi", "()Z", "", "getConnectedNetworkType", "()Ljava/lang/String;", "Ll83/a0;", "start", "()V", "stop", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class HMSNetworkManager {
    private final ConnectivityManager connectivityManager;

    public HMSNetworkManager(Context hmsContext) {
        AbstractC22676k.m65750j(hmsContext, "hmsContext");
        Object systemService = hmsContext.getSystemService("connectivity");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    public String getConnectedNetworkType() {
        return "";
    }

    public final boolean isConnectedOverWifi() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = this.connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = this.connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1);
    }

    public void start() {
    }

    public void stop() {
    }
}
