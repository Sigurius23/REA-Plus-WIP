package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoReactionsResponse;", "", "reaction", "", "countOverTime", "Lio/getstream/android/video/generated/models/VideoReactionOverTimeResponse;", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/VideoReactionOverTimeResponse;)V", "getCountOverTime", "()Lio/getstream/android/video/generated/models/VideoReactionOverTimeResponse;", "getReaction", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class VideoReactionsResponse {
    private final VideoReactionOverTimeResponse countOverTime;
    private final String reaction;

    public VideoReactionsResponse(@InterfaceC30731q(name = "reaction") String reaction, @InterfaceC30731q(name = "count_over_time") VideoReactionOverTimeResponse videoReactionOverTimeResponse) {
        AbstractC22676k.m65750j(reaction, "reaction");
        this.reaction = reaction;
        this.countOverTime = videoReactionOverTimeResponse;
    }

    public static /* synthetic */ VideoReactionsResponse copy$default(VideoReactionsResponse videoReactionsResponse, String str, VideoReactionOverTimeResponse videoReactionOverTimeResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoReactionsResponse.reaction;
        }
        if ((i13 & 2) != 0) {
            videoReactionOverTimeResponse = videoReactionsResponse.countOverTime;
        }
        return videoReactionsResponse.copy(str, videoReactionOverTimeResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReaction() {
        return this.reaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoReactionOverTimeResponse getCountOverTime() {
        return this.countOverTime;
    }

    public final VideoReactionsResponse copy(@InterfaceC30731q(name = "reaction") String reaction, @InterfaceC30731q(name = "count_over_time") VideoReactionOverTimeResponse countOverTime) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return new VideoReactionsResponse(reaction, countOverTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoReactionsResponse)) {
            return false;
        }
        VideoReactionsResponse videoReactionsResponse = (VideoReactionsResponse) other;
        return AbstractC22676k.m65745e(this.reaction, videoReactionsResponse.reaction) && AbstractC22676k.m65745e(this.countOverTime, videoReactionsResponse.countOverTime);
    }

    public final VideoReactionOverTimeResponse getCountOverTime() {
        return this.countOverTime;
    }

    public final String getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        int iHashCode = this.reaction.hashCode() * 31;
        VideoReactionOverTimeResponse videoReactionOverTimeResponse = this.countOverTime;
        return iHashCode + (videoReactionOverTimeResponse == null ? 0 : videoReactionOverTimeResponse.hashCode());
    }

    public String toString() {
        return "VideoReactionsResponse(reaction=" + this.reaction + ", countOverTime=" + this.countOverTime + ")";
    }

    public /* synthetic */ VideoReactionsResponse(String str, VideoReactionOverTimeResponse videoReactionOverTimeResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : videoReactionOverTimeResponse);
    }
}
