package live.hms.video.sdk.models;

import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.sdk.models.role.HMSRole;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001c\u001a\u00020\u0003H\u0016R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0016@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSRemotePeer;", "Llive/hms/video/sdk/models/HMSPeer;", "peerId", "", "customerUserId", "name", "role", "Llive/hms/video/sdk/models/role/HMSRole;", "joinedAt", "", "description", "type", "Llive/hms/video/sdk/models/HMSPeerType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V", "value", "Llive/hms/video/media/tracks/HMSRemoteAudioTrack;", "audioTrack", "getAudioTrack", "()Llive/hms/video/media/tracks/HMSRemoteAudioTrack;", "setAudioTrack$lib_release", "(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;)V", "Llive/hms/video/media/tracks/HMSRemoteVideoTrack;", "videoTrack", "getVideoTrack", "()Llive/hms/video/media/tracks/HMSRemoteVideoTrack;", "setVideoTrack$lib_release", "(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)V", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSRemotePeer extends HMSPeer {
    private HMSRemoteAudioTrack audioTrack;
    private HMSRemoteVideoTrack videoTrack;

    public /* synthetic */ HMSRemotePeer(String str, String str2, String str3, HMSRole hMSRole, long j7, String str4, HMSPeerType hMSPeerType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, hMSRole, j7, (i13 & 32) != 0 ? "" : str4, hMSPeerType);
    }

    public void setAudioTrack$lib_release(HMSRemoteAudioTrack hMSRemoteAudioTrack) {
        this.audioTrack = hMSRemoteAudioTrack;
    }

    public void setVideoTrack$lib_release(HMSRemoteVideoTrack hMSRemoteVideoTrack) {
        this.videoTrack = hMSRemoteVideoTrack;
    }

    @Override // live.hms.video.sdk.models.HMSPeer
    public String toString() {
        return AbstractC39421y.m125926K(super.toString(), "HMSPeer", "HMSRemotePeer", false);
    }

    @Override // live.hms.video.sdk.models.HMSPeer
    public HMSRemoteAudioTrack getAudioTrack() {
        return this.audioTrack;
    }

    @Override // live.hms.video.sdk.models.HMSPeer
    public HMSRemoteVideoTrack getVideoTrack() {
        return this.videoTrack;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSRemotePeer(String peerId, String str, String name, HMSRole role, long j7, String description, HMSPeerType type) {
        super(peerId, str, name, false, type, role, j7, description);
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(type, "type");
    }
}
