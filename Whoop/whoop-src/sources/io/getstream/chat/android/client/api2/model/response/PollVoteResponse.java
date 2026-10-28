package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamVoteDto;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "vote", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;)V", "getDuration", "()Ljava/lang/String;", "getVote", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollVoteResponse {
    private final String duration;
    private final DownstreamVoteDto vote;

    public PollVoteResponse(String duration, DownstreamVoteDto vote) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(vote, "vote");
        this.duration = duration;
        this.vote = vote;
    }

    public static /* synthetic */ PollVoteResponse copy$default(PollVoteResponse pollVoteResponse, String str, DownstreamVoteDto downstreamVoteDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pollVoteResponse.duration;
        }
        if ((i13 & 2) != 0) {
            downstreamVoteDto = pollVoteResponse.vote;
        }
        return pollVoteResponse.copy(str, downstreamVoteDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownstreamVoteDto getVote() {
        return this.vote;
    }

    public final PollVoteResponse copy(String duration, DownstreamVoteDto vote) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(vote, "vote");
        return new PollVoteResponse(duration, vote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollVoteResponse)) {
            return false;
        }
        PollVoteResponse pollVoteResponse = (PollVoteResponse) other;
        return AbstractC22676k.m65745e(this.duration, pollVoteResponse.duration) && AbstractC22676k.m65745e(this.vote, pollVoteResponse.vote);
    }

    public final String getDuration() {
        return this.duration;
    }

    public final DownstreamVoteDto getVote() {
        return this.vote;
    }

    public int hashCode() {
        return this.vote.hashCode() + (this.duration.hashCode() * 31);
    }

    public String toString() {
        return "PollVoteResponse(duration=" + this.duration + ", vote=" + this.vote + ")";
    }
}
