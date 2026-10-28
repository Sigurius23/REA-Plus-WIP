package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamReactionDto;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/ReactionResponse;", "", "reaction", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;)V", "getReaction", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReactionResponse {
    private final DownstreamReactionDto reaction;

    public ReactionResponse(DownstreamReactionDto reaction) {
        AbstractC22676k.m65750j(reaction, "reaction");
        this.reaction = reaction;
    }

    public static /* synthetic */ ReactionResponse copy$default(ReactionResponse reactionResponse, DownstreamReactionDto downstreamReactionDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            downstreamReactionDto = reactionResponse.reaction;
        }
        return reactionResponse.copy(downstreamReactionDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownstreamReactionDto getReaction() {
        return this.reaction;
    }

    public final ReactionResponse copy(DownstreamReactionDto reaction) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return new ReactionResponse(reaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReactionResponse) && AbstractC22676k.m65745e(this.reaction, ((ReactionResponse) other).reaction);
    }

    public final DownstreamReactionDto getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        return this.reaction.hashCode();
    }

    public String toString() {
        return "ReactionResponse(reaction=" + this.reaction + ")";
    }
}
