package live.hms.video.sdk.models;

import live.hms.video.media.settings.HMSVideoTrackSettings;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/models/LastTrackState;", "", "isLocalVideoMuted", "", "isLocalAudioMuted", "isScreenSharePublished", "isCameraFacing", "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "<init>", "(ZZZLlive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V", "()Z", "()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class LastTrackState {
    private final HMSVideoTrackSettings.CameraFacing isCameraFacing;
    private final boolean isLocalAudioMuted;
    private final boolean isLocalVideoMuted;
    private final boolean isScreenSharePublished;

    public LastTrackState(boolean z4, boolean z13, boolean z14, HMSVideoTrackSettings.CameraFacing isCameraFacing) {
        AbstractC22676k.m65750j(isCameraFacing, "isCameraFacing");
        this.isLocalVideoMuted = z4;
        this.isLocalAudioMuted = z13;
        this.isScreenSharePublished = z14;
        this.isCameraFacing = isCameraFacing;
    }

    public static /* synthetic */ LastTrackState copy$default(LastTrackState lastTrackState, boolean z4, boolean z13, boolean z14, HMSVideoTrackSettings.CameraFacing cameraFacing, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = lastTrackState.isLocalVideoMuted;
        }
        if ((i13 & 2) != 0) {
            z13 = lastTrackState.isLocalAudioMuted;
        }
        if ((i13 & 4) != 0) {
            z14 = lastTrackState.isScreenSharePublished;
        }
        if ((i13 & 8) != 0) {
            cameraFacing = lastTrackState.isCameraFacing;
        }
        return lastTrackState.copy(z4, z13, z14, cameraFacing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLocalVideoMuted() {
        return this.isLocalVideoMuted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLocalAudioMuted() {
        return this.isLocalAudioMuted;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsScreenSharePublished() {
        return this.isScreenSharePublished;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HMSVideoTrackSettings.CameraFacing getIsCameraFacing() {
        return this.isCameraFacing;
    }

    public final LastTrackState copy(boolean isLocalVideoMuted, boolean isLocalAudioMuted, boolean isScreenSharePublished, HMSVideoTrackSettings.CameraFacing isCameraFacing) {
        AbstractC22676k.m65750j(isCameraFacing, "isCameraFacing");
        return new LastTrackState(isLocalVideoMuted, isLocalAudioMuted, isScreenSharePublished, isCameraFacing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastTrackState)) {
            return false;
        }
        LastTrackState lastTrackState = (LastTrackState) other;
        return this.isLocalVideoMuted == lastTrackState.isLocalVideoMuted && this.isLocalAudioMuted == lastTrackState.isLocalAudioMuted && this.isScreenSharePublished == lastTrackState.isScreenSharePublished && this.isCameraFacing == lastTrackState.isCameraFacing;
    }

    public int hashCode() {
        return this.isCameraFacing.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLocalVideoMuted) * 31, 31, this.isLocalAudioMuted), 31, this.isScreenSharePublished);
    }

    public final HMSVideoTrackSettings.CameraFacing isCameraFacing() {
        return this.isCameraFacing;
    }

    public final boolean isLocalAudioMuted() {
        return this.isLocalAudioMuted;
    }

    public final boolean isLocalVideoMuted() {
        return this.isLocalVideoMuted;
    }

    public final boolean isScreenSharePublished() {
        return this.isScreenSharePublished;
    }

    public String toString() {
        return "LastTrackState(isLocalVideoMuted=" + this.isLocalVideoMuted + ", isLocalAudioMuted=" + this.isLocalAudioMuted + ", isScreenSharePublished=" + this.isScreenSharePublished + ", isCameraFacing=" + this.isCameraFacing + ')';
    }
}
