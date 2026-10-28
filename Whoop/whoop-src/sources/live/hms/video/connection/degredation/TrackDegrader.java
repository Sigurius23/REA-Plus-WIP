package live.hms.video.connection.degredation;

import live.hms.video.media.settings.HMSSimulcastLayer;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSVideoTrack;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/connection/degredation/TrackDegrader;", "", "Llive/hms/video/sdk/SDKStore;", "sdkStore", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "Llive/hms/video/media/tracks/HMSRemoteVideoTrack;", "hmsRemoteVideoTrack", "", "isDegradedNow", "Llive/hms/video/sdk/models/SDKUpdate$Track;", "getUpdateForTrack", "(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;Z)Llive/hms/video/sdk/models/SDKUpdate$Track;", "Llive/hms/video/media/tracks/HMSVideoTrack;", "track", "shouldUpdate", "(ZLlive/hms/video/media/tracks/HMSVideoTrack;)Z", "Ll83/a0;", "setDegraded", "(ZLlive/hms/video/media/tracks/HMSVideoTrack;)V", "changeTrackAndGetUpdate", "(ZLlive/hms/video/media/tracks/HMSRemoteVideoTrack;)Llive/hms/video/sdk/models/SDKUpdate$Track;", "Llive/hms/video/sdk/SDKStore;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class TrackDegrader {
    private final SDKStore sdkStore;

    public TrackDegrader(SDKStore sdkStore) {
        AbstractC22676k.m65750j(sdkStore, "sdkStore");
        this.sdkStore = sdkStore;
    }

    private final SDKUpdate.Track getUpdateForTrack(HMSRemoteVideoTrack hmsRemoteVideoTrack, boolean isDegradedNow) {
        HMSTrack nativeTrackById;
        HMSTrackUpdate hMSTrackUpdate = isDegradedNow ? HMSTrackUpdate.TRACK_DEGRADED : HMSTrackUpdate.TRACK_RESTORED;
        HMSPeer peerByTrackId = this.sdkStore.getPeerByTrackId(hmsRemoteVideoTrack.getTrackId());
        if (peerByTrackId == null || (nativeTrackById = this.sdkStore.getNativeTrackById(hmsRemoteVideoTrack.getTrackId())) == null) {
            return null;
        }
        return new SDKUpdate.Track(hMSTrackUpdate, nativeTrackById, peerByTrackId);
    }

    private final void setDegraded(boolean isDegradedNow, HMSVideoTrack track) {
        track.setDegraded$lib_release(isDegradedNow);
        if (track instanceof HMSRemoteVideoTrack) {
            if (isDegradedNow) {
                HMSRemoteVideoTrack.setExpectedLayer$lib_release$default((HMSRemoteVideoTrack) track, HMSSimulcastLayer.NONE, null, 2, null);
            } else {
                HMSRemoteVideoTrack.setExpectedLayer$lib_release$default((HMSRemoteVideoTrack) track, HMSSimulcastLayer.HIGH, null, 2, null);
            }
        }
    }

    private final boolean shouldUpdate(boolean isDegradedNow, HMSVideoTrack track) {
        return isDegradedNow != track.getIsDegraded();
    }

    public final SDKUpdate.Track changeTrackAndGetUpdate(boolean isDegradedNow, HMSRemoteVideoTrack track) {
        AbstractC22676k.m65750j(track, "track");
        if (!shouldUpdate(isDegradedNow, track)) {
            return null;
        }
        setDegraded(isDegradedNow, track);
        return getUpdateForTrack(track, isDegradedNow);
    }
}
