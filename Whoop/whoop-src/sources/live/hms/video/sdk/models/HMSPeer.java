package live.hms.video.sdk.models;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.connection.stats.quality.HMSNetworkQuality;
import live.hms.video.media.tracks.HMSAudioTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSVideoTrack;
import live.hms.video.sdk.models.role.HMSRole;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010F\u001a\u00020\u0003H\u0016J\u0010\u0010G\u001a\u0004\u0018\u00010!2\u0006\u0010H\u001a\u00020\u0003J\u0011\u0010I\u001a\b\u0012\u0004\u0012\u00020!0J¢\u0006\u0002\u0010KR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR0\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 @@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010.R$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010.R(\u00102\u001a\u0004\u0018\u0001012\b\u0010\u001f\u001a\u0004\u0018\u000101@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R0\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010=j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`<X\u0080\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR&\u0010C\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078F@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0014\"\u0004\bD\u0010E¨\u0006L"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSPeer;", "", "peerID", "", "customerUserID", "name", "isLocal", "", "type", "Llive/hms/video/sdk/models/HMSPeerType;", "role", "Llive/hms/video/sdk/models/role/HMSRole;", "joinedAt", "", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/sdk/models/HMSPeerType;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;)V", "getPeerID", "()Ljava/lang/String;", "getCustomerUserID", "()Z", "getType", "()Llive/hms/video/sdk/models/HMSPeerType;", "videoTrack", "Llive/hms/video/media/tracks/HMSVideoTrack;", "getVideoTrack", "()Llive/hms/video/media/tracks/HMSVideoTrack;", "audioTrack", "Llive/hms/video/media/tracks/HMSAudioTrack;", "getAudioTrack", "()Llive/hms/video/media/tracks/HMSAudioTrack;", "value", "", "Llive/hms/video/media/tracks/HMSTrack;", "auxiliaryTracks", "getAuxiliaryTracks", "()Ljava/util/List;", "setAuxiliaryTracks$lib_release", "(Ljava/util/List;)V", "hmsRole", "getHmsRole", "()Llive/hms/video/sdk/models/role/HMSRole;", "setHmsRole$lib_release", "(Llive/hms/video/sdk/models/role/HMSRole;)V", "getName", "setName$lib_release", "(Ljava/lang/String;)V", "getMetadata", "setMetadata$lib_release", "Llive/hms/video/connection/stats/quality/HMSNetworkQuality;", "networkQuality", "getNetworkQuality", "()Llive/hms/video/connection/stats/quality/HMSNetworkQuality;", "setNetworkQuality$lib_release", "(Llive/hms/video/connection/stats/quality/HMSNetworkQuality;)V", "getJoinedAt", "()J", "setJoinedAt$lib_release", "(J)V", "groups", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getGroups$lib_release", "()Ljava/util/ArrayList;", "setGroups$lib_release", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "isHandRaised", "setHandRaised$lib_release", "(Z)V", "toString", "getTrackById", "trackId", "getAllTracks", "", "()[Llive/hms/video/media/tracks/HMSTrack;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class HMSPeer {
    private List<HMSTrack> auxiliaryTracks;
    private final String customerUserID;
    private ArrayList<String> groups;
    private HMSRole hmsRole;
    private boolean isHandRaised;
    private final boolean isLocal;
    private long joinedAt;
    private String metadata;
    private String name;
    private HMSNetworkQuality networkQuality;
    private final String peerID;
    private final HMSPeerType type;

    public HMSPeer(String peerID, String str, String name, boolean z4, HMSPeerType type, HMSRole role, long j7, String metadata) {
        AbstractC22676k.m65750j(peerID, "peerID");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(metadata, "metadata");
        this.peerID = peerID;
        this.customerUserID = str;
        this.isLocal = z4;
        this.type = type;
        this.auxiliaryTracks = new ArrayList();
        this.hmsRole = role;
        this.name = name;
        this.metadata = metadata;
        this.joinedAt = j7;
    }

    public final HMSTrack[] getAllTracks() {
        ArrayList arrayList = new ArrayList();
        HMSVideoTrack videoTrack = getVideoTrack();
        if (videoTrack != null) {
            arrayList.add(videoTrack);
        }
        HMSAudioTrack audioTrack = getAudioTrack();
        if (audioTrack != null) {
            arrayList.add(audioTrack);
        }
        arrayList.addAll(this.auxiliaryTracks);
        return (HMSTrack[]) arrayList.toArray(new HMSTrack[0]);
    }

    public abstract HMSAudioTrack getAudioTrack();

    public final List<HMSTrack> getAuxiliaryTracks() {
        return this.auxiliaryTracks;
    }

    public final String getCustomerUserID() {
        return this.customerUserID;
    }

    public final ArrayList<String> getGroups$lib_release() {
        return this.groups;
    }

    public final HMSRole getHmsRole() {
        return this.hmsRole;
    }

    public final long getJoinedAt() {
        return this.joinedAt;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final HMSNetworkQuality getNetworkQuality() {
        return this.networkQuality;
    }

    public final String getPeerID() {
        return this.peerID;
    }

    public final HMSTrack getTrackById(String trackId) {
        AbstractC22676k.m65750j(trackId, "trackId");
        HMSAudioTrack audioTrack = getAudioTrack();
        if (AbstractC22676k.m65745e(audioTrack != null ? audioTrack.getTrackId() : null, trackId)) {
            return getAudioTrack();
        }
        HMSVideoTrack videoTrack = getVideoTrack();
        if (AbstractC22676k.m65745e(videoTrack != null ? videoTrack.getTrackId() : null, trackId)) {
            return getVideoTrack();
        }
        for (HMSTrack hMSTrack : this.auxiliaryTracks) {
            if (AbstractC22676k.m65745e(hMSTrack.getTrackId(), trackId)) {
                return hMSTrack;
            }
        }
        return null;
    }

    public final HMSPeerType getType() {
        return this.type;
    }

    public abstract HMSVideoTrack getVideoTrack();

    public final boolean isHandRaised() {
        ArrayList<String> arrayList = this.groups;
        if (arrayList != null) {
            return arrayList.contains("_handraise");
        }
        return false;
    }

    /* JADX INFO: renamed from: isLocal, reason: from getter */
    public final boolean getIsLocal() {
        return this.isLocal;
    }

    public final void setAuxiliaryTracks$lib_release(List<HMSTrack> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.auxiliaryTracks = list;
    }

    public final void setGroups$lib_release(ArrayList<String> arrayList) {
        this.groups = arrayList;
    }

    public final void setHandRaised$lib_release(boolean z4) {
        this.isHandRaised = z4;
    }

    public final void setHmsRole$lib_release(HMSRole hMSRole) {
        AbstractC22676k.m65750j(hMSRole, "<set-?>");
        this.hmsRole = hMSRole;
    }

    public final void setJoinedAt$lib_release(long j7) {
        this.joinedAt = j7;
    }

    public final void setMetadata$lib_release(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.metadata = str;
    }

    public final void setName$lib_release(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.name = str;
    }

    public final void setNetworkQuality$lib_release(HMSNetworkQuality hMSNetworkQuality) {
        this.networkQuality = hMSNetworkQuality;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSPeer{peerId=");
        sb4.append(this.peerID);
        sb4.append(", name=");
        sb4.append(this.name);
        sb4.append(", role=");
        sb4.append(this.hmsRole);
        sb4.append(", customerDescription=");
        sb4.append(this.metadata);
        sb4.append(", audioTrack=");
        sb4.append(getAudioTrack());
        sb4.append(", videoTrack=");
        sb4.append(getVideoTrack());
        sb4.append(", auxiliaryTracks=");
        sb4.append(this.auxiliaryTracks);
        sb4.append(", customerId=");
        sb4.append(this.customerUserID);
        sb4.append(", customerDescription=");
        return AbstractC25012a.m73377j(sb4, this.metadata, '}');
    }

    public /* synthetic */ HMSPeer(String str, String str2, String str3, boolean z4, HMSPeerType hMSPeerType, HMSRole hMSRole, long j7, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z4, hMSPeerType, hMSRole, j7, (i13 & 128) != 0 ? "" : str4);
    }
}
