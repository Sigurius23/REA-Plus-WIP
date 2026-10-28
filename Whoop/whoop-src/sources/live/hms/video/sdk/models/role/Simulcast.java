package live.hms.video.sdk.models.role;

import com.google.gson.annotations.SerializedName;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/sdk/models/role/Simulcast;", "", "video", "Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;", HMSTrackSource.SCREEN, "<init>", "(Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;)V", "getVideo", "()Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;", "getScreen", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Simulcast {

    @SerializedName(HMSTrackSource.SCREEN)
    private final VideoSimulcastLayersParams screen;

    @SerializedName("video")
    private final VideoSimulcastLayersParams video;

    public Simulcast(VideoSimulcastLayersParams videoSimulcastLayersParams, VideoSimulcastLayersParams videoSimulcastLayersParams2) {
        this.video = videoSimulcastLayersParams;
        this.screen = videoSimulcastLayersParams2;
    }

    public static /* synthetic */ Simulcast copy$default(Simulcast simulcast, VideoSimulcastLayersParams videoSimulcastLayersParams, VideoSimulcastLayersParams videoSimulcastLayersParams2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            videoSimulcastLayersParams = simulcast.video;
        }
        if ((i13 & 2) != 0) {
            videoSimulcastLayersParams2 = simulcast.screen;
        }
        return simulcast.copy(videoSimulcastLayersParams, videoSimulcastLayersParams2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoSimulcastLayersParams getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoSimulcastLayersParams getScreen() {
        return this.screen;
    }

    public final Simulcast copy(VideoSimulcastLayersParams video, VideoSimulcastLayersParams screen) {
        return new Simulcast(video, screen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Simulcast)) {
            return false;
        }
        Simulcast simulcast = (Simulcast) other;
        return AbstractC22676k.m65745e(this.video, simulcast.video) && AbstractC22676k.m65745e(this.screen, simulcast.screen);
    }

    public final VideoSimulcastLayersParams getScreen() {
        return this.screen;
    }

    public final VideoSimulcastLayersParams getVideo() {
        return this.video;
    }

    public int hashCode() {
        VideoSimulcastLayersParams videoSimulcastLayersParams = this.video;
        int iHashCode = (videoSimulcastLayersParams == null ? 0 : videoSimulcastLayersParams.hashCode()) * 31;
        VideoSimulcastLayersParams videoSimulcastLayersParams2 = this.screen;
        return iHashCode + (videoSimulcastLayersParams2 != null ? videoSimulcastLayersParams2.hashCode() : 0);
    }

    public String toString() {
        return "Simulcast(video=" + this.video + ", screen=" + this.screen + ')';
    }
}
