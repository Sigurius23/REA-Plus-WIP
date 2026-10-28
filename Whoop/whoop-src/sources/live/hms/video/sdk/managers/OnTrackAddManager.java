package live.hms.video.sdk.managers;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import live.hms.video.media.settings.HMSLayer;
import live.hms.video.media.settings.HMSSimulcastLayerDefinition;
import live.hms.video.media.settings.HMSVideoResolution;
import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.media.tracks.HMSRemoteTrack;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRemotePeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sdk.models.role.LayerParams;
import live.hms.video.sdk.models.role.PublishParams;
import live.hms.video.sdk.models.role.Simulcast;
import live.hms.video.sdk.models.role.VideoParams;
import live.hms.video.sdk.models.role.VideoSimulcastLayersParams;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\b\u0000\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Llive/hms/video/sdk/managers/OnTrackAddManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;", "Llive/hms/video/sdk/SDKStore;", "store", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "Llive/hms/video/media/tracks/HMSTrack;", "Llive/hms/video/sdk/models/HMSRemotePeer;", "peer", "", "", "Llive/hms/video/sdk/models/role/HMSRole;", "rolesMap", "Ll83/a0;", "addSimulcastLayerDefinitionFromPeer", "(Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSRemotePeer;Ljava/util/Map;)V", "track", "applyPeerToTrack", "(Llive/hms/video/sdk/models/HMSRemotePeer;Llive/hms/video/media/tracks/HMSTrack;)V", "params", "", "Llive/hms/video/sdk/models/SDKUpdate;", "manage", "(Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;)Ljava/util/List;", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "data", "peerId", "", "manageMetadata", "(Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;)[Llive/hms/video/sdk/models/SDKUpdate;", "manageNativeTrack", "(Llive/hms/video/media/tracks/HMSTrack;)Ljava/util/List;", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OnTrackAddManager implements IManager<HMSNotifications.TrackMetadata> {
    private static final String TAG = "OnTrackAddManager";
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

    public OnTrackAddManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    private final void addSimulcastLayerDefinitionFromPeer(HMSTrack hMSTrack, HMSRemotePeer hMSRemotePeer, Map<String, HMSRole> map) {
        PublishParams publishParams;
        PublishParams publishParams2;
        Simulcast simulcast;
        HMSRole hMSRole = map.get(hMSRemotePeer.getHmsRole().getName());
        VideoSimulcastLayersParams video = (hMSRole == null || (publishParams2 = hMSRole.getPublishParams()) == null || (simulcast = publishParams2.getSimulcast()) == null) ? null : simulcast.getVideo();
        HMSRole hMSRole2 = map.get(hMSRemotePeer.getHmsRole().getName());
        VideoParams video2 = (hMSRole2 == null || (publishParams = hMSRole2.getPublishParams()) == null) ? null : publishParams.getVideo();
        Iterable layers = video != null ? video.getLayers() : null;
        if (layers == null) {
            layers = C25271y.f99162w;
        }
        Iterable<LayerParams> iterable = layers;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        for (LayerParams layerParams : iterable) {
            int width = video2 != null ? video2.getWidth() : 0;
            Number scaleResolutionDownBy = layerParams.getScaleResolutionDownBy();
            if (scaleResolutionDownBy == null) {
                scaleResolutionDownBy = 1;
            }
            int iIntValue = width / scaleResolutionDownBy.intValue();
            int height = video2 != null ? video2.getHeight() : 0;
            Number scaleResolutionDownBy2 = layerParams.getScaleResolutionDownBy();
            if (scaleResolutionDownBy2 == null) {
                scaleResolutionDownBy2 = 1;
            }
            arrayList.add(new HMSSimulcastLayerDefinition(new HMSVideoResolution(iIntValue, height / scaleResolutionDownBy2.intValue()), addSimulcastLayerDefinitionFromPeer$ridToHMSLayerMapper(layerParams)));
        }
        HMSRemoteVideoTrack hMSRemoteVideoTrack = hMSTrack instanceof HMSRemoteVideoTrack ? (HMSRemoteVideoTrack) hMSTrack : null;
        if (hMSRemoteVideoTrack != null) {
            hMSRemoteVideoTrack.setLayerDefinition$lib_release(arrayList);
        }
    }

    private static final HMSLayer addSimulcastLayerDefinitionFromPeer$ridToHMSLayerMapper(LayerParams layerParams) {
        String rid = layerParams.getRid();
        if (rid != null) {
            int iHashCode = rid.hashCode();
            if (iHashCode != 102) {
                if (iHashCode != 104) {
                    if (iHashCode == 113 && rid.equals("q")) {
                        return HMSLayer.LOW;
                    }
                } else if (rid.equals(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT)) {
                    return HMSLayer.MEDIUM;
                }
            } else if (rid.equals("f")) {
                return HMSLayer.HIGH;
            }
        }
        return HMSLayer.HIGH;
    }

    private final void applyPeerToTrack(HMSRemotePeer peer, HMSTrack track) {
        if (AbstractC22676k.m65745e(track.getSource(), "regular")) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[track.getType().ordinal()];
            if (i13 == 1) {
                peer.setAudioTrack$lib_release((HMSRemoteAudioTrack) track);
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                peer.setVideoTrack$lib_release((HMSRemoteVideoTrack) track);
            }
        } else {
            peer.getAuxiliaryTracks().add(track);
        }
        addSimulcastLayerDefinitionFromPeer(track, peer, getStore().getRolesMap());
    }

    public static /* synthetic */ SDKUpdate[] manageMetadata$default(OnTrackAddManager onTrackAddManager, HMSNotifications.Track track, String str, HMSNotifications.TrackMetadata trackMetadata, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            trackMetadata = null;
        }
        return onTrackAddManager.manageMetadata(track, str, trackMetadata);
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    public final SDKUpdate[] manageMetadata(HMSNotifications.Track data, String peerId, HMSNotifications.TrackMetadata params) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(peerId, "peerId");
        ArrayList arrayList = new ArrayList();
        HMSPeer peerById = getStore().getPeerById(peerId);
        if (peerById == null && params != null) {
            peerById = getStore().add(params.getPeer().toPeerJoin());
        }
        if (peerById != null) {
            HMSRemotePeer hMSRemotePeer = (HMSRemotePeer) peerById;
            HMSTrack nativeTrackById = getStore().getNativeTrackById(data.getTrackId());
            if (nativeTrackById != null) {
                getStore().updateRTCTrack(data);
                applyPeerToTrack(hMSRemotePeer, nativeTrackById);
                arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_ADDED, nativeTrackById, peerById));
            }
            getStore().addTrackMetadata(data, peerId);
        }
        return (SDKUpdate[]) arrayList.toArray(new SDKUpdate[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<SDKUpdate> manageNativeTrack(HMSTrack track) {
        OnTrackAddManager onTrackAddManager;
        AbstractC22676k.m65750j(track, "track");
        ArrayList arrayList = new ArrayList();
        SDKStore.TrackMetadataPair trackMetadata = getStore().getTrackMetadata(track.getTrackId());
        if (trackMetadata != null) {
            HMSLogger.m71136d(TAG, "Track metadata already present for trackId : " + track.getTrackId());
            HMSPeer peerById = getStore().getPeerById(trackMetadata.getPeerId());
            if (peerById != null) {
                HMSRemotePeer hMSRemotePeer = (HMSRemotePeer) peerById;
                HMSTrack nativeTrackById = getStore().getNativeTrackById(track.getTrackId());
                if (nativeTrackById != 0) {
                    HMSRemoteTrack hMSRemoteTrack = (HMSRemoteTrack) nativeTrackById;
                    StringBuilder sb4 = new StringBuilder("TRACK%% tracks old_ssrc:");
                    sb4.append(hMSRemoteTrack.getSsrc());
                    sb4.append("  new_ssrc:");
                    HMSRemoteTrack hMSRemoteTrack2 = (HMSRemoteTrack) track;
                    sb4.append(hMSRemoteTrack2.getSsrc());
                    HMSLogger.m71136d(TAG, sb4.toString());
                    if (hMSRemoteTrack.getSsrc() != hMSRemoteTrack2.getSsrc()) {
                        String peerID = peerById.getPeerID();
                        String customerUserID = peerById.getCustomerUserID();
                        AbstractC22676k.m65747g(customerUserID);
                        HMSRemotePeer hMSRemotePeer2 = new HMSRemotePeer(peerID, customerUserID, peerById.getName(), peerById.getHmsRole(), peerById.getJoinedAt(), null, peerById.getType(), 32, null);
                        hMSRemotePeer2.setGroups$lib_release(peerById.getGroups$lib_release());
                        hMSRemotePeer2.setAudioTrack$lib_release(hMSRemotePeer.getAudioTrack());
                        hMSRemotePeer2.setVideoTrack$lib_release(hMSRemotePeer.getVideoTrack());
                        int i13 = WhenMappings.$EnumSwitchMapping$0[track.getType().ordinal()];
                        if (i13 == 1) {
                            hMSRemotePeer2.setAudioTrack$lib_release(null);
                        } else {
                            if (i13 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            hMSRemotePeer2.setVideoTrack$lib_release(null);
                        }
                        HMSLogger.INSTANCE.m71139i(TAG, "TRACK%% RECEIVED_ADDREQ_SEND_TRACK_REMOVE type: " + track.getType() + " audioTrack:" + hMSRemotePeer2.getAudioTrack() + " videoTrack: " + hMSRemotePeer2.getVideoTrack() + ' ');
                        getStore().removeNativeTrack(nativeTrackById);
                        arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, nativeTrackById, hMSRemotePeer2));
                    }
                } else {
                    HMSLogger.m71136d(TAG, "No native track exists in store with trackId : " + track.getTrackId());
                }
                getStore().addNativeTrack(track);
                getStore().updateRTCTrack(trackMetadata.getTrackData());
                onTrackAddManager = this;
                onTrackAddManager.applyPeerToTrack(hMSRemotePeer, track);
                arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_ADDED, track, peerById));
            } else {
                onTrackAddManager = this;
                HMSLogger.m71137e(TAG, "No peer found for trackID : " + track.getTrackId());
            }
        } else {
            onTrackAddManager = this;
            HMSLogger.m71136d(TAG, "Track metadata not yet received for trackId : " + track.getTrackId());
            onTrackAddManager.getStore().addNativeTrack(track);
        }
        if (onTrackAddManager.getStore().getLocalTracksMute()) {
            HMSTrack nativeTrackById2 = onTrackAddManager.getStore().getNativeTrackById(track.getTrackId());
            if (nativeTrackById2 instanceof HMSRemoteAudioTrack) {
                ((HMSRemoteAudioTrack) nativeTrackById2).setVolume(0.0d);
            }
        }
        return arrayList;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.TrackMetadata params) {
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        for (HMSNotifications.Track track : params.getTracks()) {
            AbstractC25265s.m74139o0(arrayList, manageMetadata(track, params.getPeer().getPeerId(), params));
        }
        return arrayList;
    }
}
