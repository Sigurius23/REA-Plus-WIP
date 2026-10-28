package live.hms.video.sdk.models;

import java.util.ArrayList;
import live.hms.video.media.tracks.HMSLocalAudioTrack;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sdk.models.role.PublishParams;
import live.hms.video.sdk.models.role.SubscribeParams;
import live.hms.video.utils.IdHelper;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0003H\u0016R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u0011@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSLocalPeer;", "Llive/hms/video/sdk/models/HMSPeer;", "customerUserId", "", "name", "role", "Llive/hms/video/sdk/models/role/HMSRole;", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;)V", "value", "Llive/hms/video/media/tracks/HMSLocalAudioTrack;", "audioTrack", "getAudioTrack", "()Llive/hms/video/media/tracks/HMSLocalAudioTrack;", "setAudioTrack$lib_release", "(Llive/hms/video/media/tracks/HMSLocalAudioTrack;)V", "Llive/hms/video/media/tracks/HMSLocalVideoTrack;", "videoTrack", "getVideoTrack", "()Llive/hms/video/media/tracks/HMSLocalVideoTrack;", "setVideoTrack$lib_release", "(Llive/hms/video/media/tracks/HMSLocalVideoTrack;)V", "isWebrtcPeer", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSLocalPeer extends HMSPeer {
    private HMSLocalAudioTrack audioTrack;
    private HMSLocalVideoTrack videoTrack;

    public /* synthetic */ HMSLocalPeer(String str, String str2, HMSRole hMSRole, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, hMSRole, (i13 & 8) != 0 ? "" : str3);
    }

    public final boolean isWebrtcPeer() {
        PublishParams publishParams = getHmsRole().getPublishParams();
        ArrayList<String> allowed = publishParams != null ? publishParams.getAllowed() : null;
        boolean z4 = allowed == null || allowed.isEmpty();
        SubscribeParams subscribeParams = getHmsRole().getSubscribeParams();
        ArrayList<String> subscribeTo = subscribeParams != null ? subscribeParams.getSubscribeTo() : null;
        return (z4 && (subscribeTo == null || subscribeTo.isEmpty())) ? false : true;
    }

    public void setAudioTrack$lib_release(HMSLocalAudioTrack hMSLocalAudioTrack) {
        this.audioTrack = hMSLocalAudioTrack;
    }

    public void setVideoTrack$lib_release(HMSLocalVideoTrack hMSLocalVideoTrack) {
        this.videoTrack = hMSLocalVideoTrack;
    }

    @Override // live.hms.video.sdk.models.HMSPeer
    public String toString() {
        return AbstractC39421y.m125926K(super.toString(), "HMSPeer", "HMSLocalPeer", false);
    }

    @Override // live.hms.video.sdk.models.HMSPeer
    public HMSLocalAudioTrack getAudioTrack() {
        return this.audioTrack;
    }

    @Override // live.hms.video.sdk.models.HMSPeer
    public HMSLocalVideoTrack getVideoTrack() {
        return this.videoTrack;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSLocalPeer(String str, String name, HMSRole role, String description) {
        super(IdHelper.INSTANCE.makePeerId(), str, name, true, HMSPeerType.REGULAR, role, 0L, description);
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(description, "description");
    }
}
