package live.hms.video.network;

import android.content.Context;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m65681d2 = {"Llive/hms/video/network/HMSNetworkManagerLegacy;", "Llive/hms/video/network/HMSNetworkManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getConnectedNetworkType", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSNetworkManagerLegacy extends HMSNetworkManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSNetworkManagerLegacy(Context context) {
        super(context);
        AbstractC22676k.m65750j(context, "context");
    }

    @Override // live.hms.video.network.HMSNetworkManager
    public String getConnectedNetworkType() {
        return isConnectedOverWifi() ? "wifi" : "cellular";
    }
}
