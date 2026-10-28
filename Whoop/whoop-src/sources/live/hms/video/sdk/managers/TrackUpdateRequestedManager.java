package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.media.tracks.HMSLocalAudioTrack;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;", "store", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;", "handleRequest", "", "isMute", "", "givenPeerId", "requestedTrack", "Llive/hms/video/media/tracks/HMSTrack;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class TrackUpdateRequestedManager implements IManager<HMSNotifications.TrackUpdateRequest> {
    private final String TAG;
    private final SDKStore store;

    public TrackUpdateRequestedManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
        this.TAG = "TrackUpdateRequestedManager";
    }

    private final List<SDKUpdate> handleRequest(boolean isMute, String givenPeerId, HMSTrack requestedTrack) {
        ArrayList arrayList = new ArrayList();
        HMSLocalPeer localPeer = getStore().getLocalPeer();
        HMSPeer peerById = getStore().getPeerById(givenPeerId);
        if (localPeer != null && requestedTrack != null) {
            if (isMute) {
                if (requestedTrack instanceof HMSLocalAudioTrack) {
                    ((HMSLocalAudioTrack) requestedTrack).setMute(isMute);
                } else if (requestedTrack instanceof HMSLocalVideoTrack) {
                    ((HMSLocalVideoTrack) requestedTrack).setMute(isMute);
                }
                arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_MUTED, requestedTrack, localPeer));
            }
            arrayList.add(new SDKUpdate.HMSTrackStateUpdate(requestedTrack, peerById, isMute));
        }
        return arrayList;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.TrackUpdateRequest params) {
        HMSTrack[] allTracks;
        AbstractC22676k.m65750j(params, "params");
        HMSLocalPeer localPeer = getStore().getLocalPeer();
        HMSTrack hMSTrack = null;
        if (localPeer != null && (allTracks = localPeer.getAllTracks()) != null) {
            for (HMSTrack hMSTrack2 : allTracks) {
                if (AbstractC22676k.m65745e(hMSTrack2.getTrackId(), params.getTrackid())) {
                    hMSTrack = hMSTrack2;
                    break;
                }
            }
        }
        return handleRequest(params.isMute(), params.getPeerId(), hMSTrack);
    }

    public final List<SDKUpdate> manage(HMSNotifications.ChangeTrackMuteRequest params) {
        ArrayList arrayList;
        HMSTrack[] allTracks;
        String type;
        AbstractC22676k.m65750j(params, "params");
        HMSTrackType hMSTrackTypeFrom$lib_release = HMSTrackType.INSTANCE.from$lib_release(params.getType());
        HMSLocalPeer localPeer = getStore().getLocalPeer();
        ArrayList arrayList2 = null;
        if (localPeer == null || (allTracks = localPeer.getAllTracks()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (HMSTrack hMSTrack : allTracks) {
                String source = params.getSource();
                if ((source == null || source.length() == 0 || AbstractC22676k.m65745e(hMSTrack.getSource(), params.getSource())) && ((type = params.getType()) == null || type.length() == 0 || hMSTrack.getType() == hMSTrackTypeFrom$lib_release)) {
                    arrayList.add(hMSTrack);
                }
            }
        }
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList2, handleRequest(params.getMute(), params.getPeerId(), (HMSTrack) it.next()));
            }
        }
        return arrayList2 == null ? C25271y.f99162w : arrayList2;
    }
}
