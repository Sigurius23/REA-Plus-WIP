package live.hms.video.connection.stats.quality;

import live.hms.video.sdk.models.HMSPeer;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/connection/stats/quality/HMSNetworkObserver;", "", "Llive/hms/video/connection/stats/quality/HMSNetworkQuality;", "quality", "Llive/hms/video/sdk/models/HMSPeer;", "peer", "Ll83/a0;", "onNetworkQuality", "(Llive/hms/video/connection/stats/quality/HMSNetworkQuality;Llive/hms/video/sdk/models/HMSPeer;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSNetworkObserver {
    void onNetworkQuality(HMSNetworkQuality quality, HMSPeer peer);
}
