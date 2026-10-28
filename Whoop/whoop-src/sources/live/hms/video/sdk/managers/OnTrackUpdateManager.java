package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/sdk/managers/OnTrackUpdateManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;", "store", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "data", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "peerId", "", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OnTrackUpdateManager implements IManager<HMSNotifications.TrackMetadata> {
    private static final String TAG = "OnTrackUpdateManager";
    private final SDKStore store;

    public OnTrackUpdateManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    public static /* synthetic */ List manage$default(OnTrackUpdateManager onTrackUpdateManager, HMSNotifications.Track track, String str, HMSNotifications.TrackMetadata trackMetadata, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            trackMetadata = null;
        }
        return onTrackUpdateManager.manage(track, str, trackMetadata);
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.TrackMetadata params) {
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        for (HMSNotifications.Track track : params.getTracks()) {
            arrayList.addAll(manage(track, params.getPeer().getPeerId(), params));
        }
        return arrayList;
    }

    public final List<SDKUpdate> manage(HMSNotifications.Track data, String peerId, HMSNotifications.TrackMetadata params) {
        HMSTrackUpdate hMSTrackUpdate;
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(peerId, "peerId");
        ArrayList arrayList = new ArrayList();
        HMSPeer peerById = getStore().getPeerById(peerId);
        if (peerById == null && params != null) {
            peerById = getStore().add(params.getPeer().toPeerJoin());
        }
        if (peerById != null) {
            if (!peerById.getIsLocal()) {
                HMSTrack nativeTrackById = getStore().getNativeTrackById(data.getTrackId());
                if (nativeTrackById != null) {
                    if (!(nativeTrackById instanceof HMSRemoteAudioTrack) && !(nativeTrackById instanceof HMSRemoteVideoTrack)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    if (nativeTrackById.getIsMute() != data.isMute()) {
                        if (data.isMute()) {
                            hMSTrackUpdate = HMSTrackUpdate.TRACK_MUTED;
                        } else {
                            hMSTrackUpdate = HMSTrackUpdate.TRACK_UNMUTED;
                        }
                        arrayList.add(new SDKUpdate.Track(hMSTrackUpdate, nativeTrackById, peerById));
                    }
                    if (!AbstractC22676k.m65745e(nativeTrackById.getDescription(), data.getDescription())) {
                        arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_DESCRIPTION_CHANGED, nativeTrackById, peerById));
                    }
                    getStore().updateRTCTrack(data);
                    return arrayList;
                }
                if (getStore().getTrackMetadata(data.getTrackId()) != null) {
                    getStore().updateTrackMetaData(peerId, data);
                    return arrayList;
                }
                HMSLogger.m71137e(TAG, "onTrackUpdateNotification: Cannot find track for " + data + ", peer=" + peerById);
                return arrayList;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        HMSLogger.m71137e(TAG, "onTrackUpdateNotification: Cannot find respective peer for track=" + data + " , store=" + getStore());
        return arrayList;
    }
}
