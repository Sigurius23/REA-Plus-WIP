package live.hms.video.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import live.hms.video.media.settings.HMSSimulcastLayer;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.managers.IManager;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.TrackForLayerUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m65681d2 = {"Llive/hms/video/sdk/TrackLayerUpdateManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$OnTrackLayerUpdate;", "store", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "TAG", "", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class TrackLayerUpdateManager implements IManager<HMSNotifications.OnTrackLayerUpdate> {
    private final String TAG;
    private final SDKStore store;

    public TrackLayerUpdateManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
        this.TAG = "TrackLayerUpdateManager";
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.OnTrackLayerUpdate params) {
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        HMSLogger.INSTANCE.m71140v(this.TAG, "OnTrackLayerUpdate params: " + params);
        Map<String, TrackForLayerUpdate> tracks = params.getTracks();
        if (tracks != null) {
            for (Map.Entry<String, TrackForLayerUpdate> entry : tracks.entrySet()) {
                String key = entry.getKey();
                TrackForLayerUpdate value = entry.getValue();
                HMSTrack nativeTrackById = getStore().getNativeTrackById(key);
                if (nativeTrackById != null && (nativeTrackById instanceof HMSRemoteVideoTrack)) {
                    HMSRemoteVideoTrack hMSRemoteVideoTrack = (HMSRemoteVideoTrack) nativeTrackById;
                    boolean isDegraded = hMSRemoteVideoTrack.getIsDegraded();
                    boolean z4 = value.getSubscriberDegraded() && value.getCurrentSimulcastLayer() == HMSSimulcastLayer.NONE;
                    hMSRemoteVideoTrack.setCurrentLayer$lib_release(value.getCurrentSimulcastLayer());
                    hMSRemoteVideoTrack.setDegraded$lib_release(z4);
                    if (z4 != isDegraded) {
                        HMSPeer peerByTrackId = getStore().getPeerByTrackId(nativeTrackById.getTrackId());
                        SDKUpdate.Track track = peerByTrackId != null ? new SDKUpdate.Track(z4 ? HMSTrackUpdate.TRACK_DEGRADED : HMSTrackUpdate.TRACK_RESTORED, nativeTrackById, peerByTrackId) : null;
                        if (track != null) {
                            arrayList.add(track);
                        }
                    }
                }
            }
        }
        HMSLogger.INSTANCE.m71140v(this.TAG, "Updates: " + arrayList);
        return arrayList;
    }
}
