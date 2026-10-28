package live.hms.video.sdk.models.role;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m65681d2 = {"Llive/hms/video/sdk/models/role/PublishParams;", "", "audio", "Llive/hms/video/sdk/models/role/AudioParams;", "video", "Llive/hms/video/sdk/models/role/VideoParams;", HMSTrackSource.SCREEN, "allowed", "Ljava/util/ArrayList;", "", "simulcast", "Llive/hms/video/sdk/models/role/Simulcast;", "<init>", "(Llive/hms/video/sdk/models/role/AudioParams;Llive/hms/video/sdk/models/role/VideoParams;Llive/hms/video/sdk/models/role/VideoParams;Ljava/util/ArrayList;Llive/hms/video/sdk/models/role/Simulcast;)V", "getAudio", "()Llive/hms/video/sdk/models/role/AudioParams;", "getVideo", "()Llive/hms/video/sdk/models/role/VideoParams;", "getScreen", "getAllowed", "()Ljava/util/ArrayList;", "getSimulcast", "()Llive/hms/video/sdk/models/role/Simulcast;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PublishParams {

    @SerializedName("allowed")
    private final ArrayList<String> allowed;

    @SerializedName("audio")
    private final AudioParams audio;

    @SerializedName(HMSTrackSource.SCREEN)
    private final VideoParams screen;

    @SerializedName("simulcast")
    private final Simulcast simulcast;

    @SerializedName("video")
    private final VideoParams video;

    public PublishParams(AudioParams audioParams, VideoParams videoParams, VideoParams videoParams2, ArrayList<String> allowed, Simulcast simulcast) {
        AbstractC22676k.m65750j(allowed, "allowed");
        this.audio = audioParams;
        this.video = videoParams;
        this.screen = videoParams2;
        this.allowed = allowed;
        this.simulcast = simulcast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublishParams copy$default(PublishParams publishParams, AudioParams audioParams, VideoParams videoParams, VideoParams videoParams2, ArrayList arrayList, Simulcast simulcast, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            audioParams = publishParams.audio;
        }
        if ((i13 & 2) != 0) {
            videoParams = publishParams.video;
        }
        if ((i13 & 4) != 0) {
            videoParams2 = publishParams.screen;
        }
        if ((i13 & 8) != 0) {
            arrayList = publishParams.allowed;
        }
        if ((i13 & 16) != 0) {
            simulcast = publishParams.simulcast;
        }
        Simulcast simulcast2 = simulcast;
        VideoParams videoParams3 = videoParams2;
        return publishParams.copy(audioParams, videoParams, videoParams3, arrayList, simulcast2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AudioParams getAudio() {
        return this.audio;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoParams getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VideoParams getScreen() {
        return this.screen;
    }

    public final ArrayList<String> component4() {
        return this.allowed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Simulcast getSimulcast() {
        return this.simulcast;
    }

    public final PublishParams copy(AudioParams audio, VideoParams video, VideoParams screen, ArrayList<String> allowed, Simulcast simulcast) {
        AbstractC22676k.m65750j(allowed, "allowed");
        return new PublishParams(audio, video, screen, allowed, simulcast);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishParams)) {
            return false;
        }
        PublishParams publishParams = (PublishParams) other;
        return AbstractC22676k.m65745e(this.audio, publishParams.audio) && AbstractC22676k.m65745e(this.video, publishParams.video) && AbstractC22676k.m65745e(this.screen, publishParams.screen) && AbstractC22676k.m65745e(this.allowed, publishParams.allowed) && AbstractC22676k.m65745e(this.simulcast, publishParams.simulcast);
    }

    public final ArrayList<String> getAllowed() {
        return this.allowed;
    }

    public final AudioParams getAudio() {
        return this.audio;
    }

    public final VideoParams getScreen() {
        return this.screen;
    }

    public final Simulcast getSimulcast() {
        return this.simulcast;
    }

    public final VideoParams getVideo() {
        return this.video;
    }

    public int hashCode() {
        AudioParams audioParams = this.audio;
        int iHashCode = (audioParams == null ? 0 : audioParams.hashCode()) * 31;
        VideoParams videoParams = this.video;
        int iHashCode2 = (iHashCode + (videoParams == null ? 0 : videoParams.hashCode())) * 31;
        VideoParams videoParams2 = this.screen;
        int iHashCode3 = (this.allowed.hashCode() + ((iHashCode2 + (videoParams2 == null ? 0 : videoParams2.hashCode())) * 31)) * 31;
        Simulcast simulcast = this.simulcast;
        return iHashCode3 + (simulcast != null ? simulcast.hashCode() : 0);
    }

    public String toString() {
        return "PublishParams(audio=" + this.audio + ", video=" + this.video + ", screen=" + this.screen + ", allowed=" + this.allowed + ", simulcast=" + this.simulcast + ')';
    }

    public /* synthetic */ PublishParams(AudioParams audioParams, VideoParams videoParams, VideoParams videoParams2, ArrayList arrayList, Simulcast simulcast, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioParams, videoParams, videoParams2, (i13 & 8) != 0 ? new ArrayList() : arrayList, simulcast);
    }
}
