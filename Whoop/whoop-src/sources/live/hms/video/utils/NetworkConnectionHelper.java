package live.hms.video.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, m65681d2 = {"Llive/hms/video/utils/NetworkConnectionHelper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Network;", "network", "Ll83/a0;", "updateNetworkInfo", "(Landroid/net/Network;)V", "Lkotlin/Function1;", "", "onStatusChange", "start", "(Lkotlin/jvm/functions/Function1;)V", "stop", "()V", "Landroid/net/ConnectivityManager;", "manager", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "callback", "Landroid/net/ConnectivityManager$NetworkCallback;", "", "wifiNetworkHandle", "Ljava/lang/String;", "cellularNetworkHandle", "isWifiConnected", "()Z", "isCellularConnected", "isConnected", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class NetworkConnectionHelper {
    private static final String TAG = "NetworkConnectionHelper";
    private ConnectivityManager.NetworkCallback callback;
    private String cellularNetworkHandle;
    private final ConnectivityManager manager;
    private String wifiNetworkHandle;

    public NetworkConnectionHelper(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Object systemService = context.getSystemService("connectivity");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.manager = (ConnectivityManager) systemService;
        this.wifiNetworkHandle = "";
        this.cellularNetworkHandle = "";
    }

    private final boolean isCellularConnected() {
        return !AbstractC39414r.m125890i0(this.cellularNetworkHandle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConnected() {
        return isWifiConnected() || isCellularConnected();
    }

    private final boolean isWifiConnected() {
        return !AbstractC39414r.m125890i0(this.wifiNetworkHandle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNetworkInfo(Network network) {
        NetworkCapabilities networkCapabilities = this.manager.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            if (AbstractC22676k.m65745e(this.wifiNetworkHandle, network.toString())) {
                this.wifiNetworkHandle = "";
            }
            if (AbstractC22676k.m65745e(this.cellularNetworkHandle, network.toString())) {
                this.cellularNetworkHandle = "";
                return;
            }
            return;
        }
        String string = networkCapabilities.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Locale locale = Locale.ENGLISH;
        String strM95641q = AbstractC31061c.m95641q(locale, "ENGLISH", string, locale, "toLowerCase(...)");
        if (AbstractC39414r.m125876U(strM95641q, "wifi", false)) {
            this.wifiNetworkHandle = network.toString();
        }
        if (strM95641q.contentEquals("cellular")) {
            this.cellularNetworkHandle = network.toString();
        }
    }

    public final void start(final Function1 onStatusChange) {
        AbstractC22676k.m65750j(onStatusChange, "onStatusChange");
        if (this.callback != null) {
            stop();
        }
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: live.hms.video.utils.NetworkConnectionHelper.start.2
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                AbstractC22676k.m65750j(network, "network");
                super.onAvailable(network);
                boolean zIsConnected = NetworkConnectionHelper.this.isConnected();
                NetworkConnectionHelper.this.updateNetworkInfo(network);
                if (zIsConnected || !NetworkConnectionHelper.this.isConnected()) {
                    return;
                }
                onStatusChange.invoke(Boolean.valueOf(NetworkConnectionHelper.this.isConnected()));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                AbstractC22676k.m65750j(network, "network");
                super.onLost(network);
                NetworkConnectionHelper.this.updateNetworkInfo(network);
                onStatusChange.invoke(Boolean.valueOf(NetworkConnectionHelper.this.isConnected()));
            }
        };
        this.manager.registerNetworkCallback(networkRequestBuild, networkCallback);
        this.callback = networkCallback;
    }

    public final void stop() {
        ConnectivityManager connectivityManager = this.manager;
        ConnectivityManager.NetworkCallback networkCallback = this.callback;
        AbstractC22676k.m65747g(networkCallback);
        connectivityManager.unregisterNetworkCallback(networkCallback);
        this.callback = null;
    }
}
