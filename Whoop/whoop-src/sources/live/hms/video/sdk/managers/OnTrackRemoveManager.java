package live.hms.video.sdk.managers;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.media.tracks.HMSRemoteTrack;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRemotePeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m65681d2 = {"Llive/hms/video/sdk/managers/OnTrackRemoveManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/media/tracks/HMSTrack;", "store", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OnTrackRemoveManager implements IManager<HMSTrack> {
    private static final String TAG = "OnTrackRemoveManager";
    private final SDKStore store;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSTrackType.values().length];
            try {
                iArr[HMSTrackType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSTrackType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OnTrackRemoveManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSTrack params) {
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        SDKStore.TrackMetadataPair trackMetadata = getStore().getTrackMetadata(params.getTrackId());
        if (trackMetadata != null) {
            Object nativeTrackById = getStore().getNativeTrackById(params.getTrackId());
            if (nativeTrackById != null) {
                HMSRemoteTrack hMSRemoteTrack = (HMSRemoteTrack) nativeTrackById;
                HMSRemoteTrack hMSRemoteTrack2 = (HMSRemoteTrack) params;
                if (hMSRemoteTrack.getSsrc() != hMSRemoteTrack2.getSsrc()) {
                    HMSLogger.INSTANCE.m71139i(TAG, "TRACK%% AVOID_SEND_TRACK_REMOVED NEW_SSRC: " + hMSRemoteTrack.getSsrc() + " OLD_SSRC: " + hMSRemoteTrack2.getSsrc());
                    return arrayList;
                }
            } else {
                HMSLogger.m71137e(TAG, "TRACK%%Remove trackId not found");
            }
            HMSPeer peerById = getStore().getPeerById(trackMetadata.getPeerId());
            if (peerById != null) {
                HMSRemotePeer hMSRemotePeer = (HMSRemotePeer) peerById;
                if (AbstractC22676k.m65745e(params.getSource(), "regular")) {
                    int i13 = WhenMappings.$EnumSwitchMapping$0[params.getType().ordinal()];
                    if (i13 == 1) {
                        String trackId = params.getTrackId();
                        HMSRemoteAudioTrack audioTrack = hMSRemotePeer.getAudioTrack();
                        if (AbstractC22676k.m65745e(trackId, audioTrack != null ? audioTrack.getTrackId() : null)) {
                            hMSRemotePeer.setAudioTrack$lib_release(null);
                        }
                    } else {
                        if (i13 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String trackId2 = params.getTrackId();
                        HMSRemoteVideoTrack videoTrack = hMSRemotePeer.getVideoTrack();
                        if (AbstractC22676k.m65745e(trackId2, videoTrack != null ? videoTrack.getTrackId() : null)) {
                            hMSRemotePeer.setVideoTrack$lib_release(null);
                        }
                    }
                } else {
                    peerById.getAuxiliaryTracks().remove(params);
                }
                Log.i(TAG, "TRACK%% SEND_TRACK_REMOVED peer: " + peerById.getName() + " ssrc:" + ((HMSRemoteTrack) params).getSsrc());
                arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, params, peerById));
            } else {
                HMSLogger.m71137e(TAG, "No peer found " + params);
            }
        }
        getStore().remove(params);
        return arrayList;
    }
}
