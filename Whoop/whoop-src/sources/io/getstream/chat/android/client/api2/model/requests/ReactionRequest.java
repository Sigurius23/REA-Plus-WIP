package io.getstream.chat.android.client.api2.model.requests;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api2.model.dto.UpstreamReactionDto;
import live.hms.video.utils.HMSFieldTrials;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;", "", "reaction", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;", "enforce_unique", "", "skip_push", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;ZZ)V", "getReaction", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;", "getEnforce_unique", "()Z", "getSkip_push", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReactionRequest {
    private final boolean enforce_unique;
    private final UpstreamReactionDto reaction;
    private final boolean skip_push;

    public ReactionRequest(UpstreamReactionDto reaction, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(reaction, "reaction");
        this.reaction = reaction;
        this.enforce_unique = z4;
        this.skip_push = z13;
    }

    public static /* synthetic */ ReactionRequest copy$default(ReactionRequest reactionRequest, UpstreamReactionDto upstreamReactionDto, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            upstreamReactionDto = reactionRequest.reaction;
        }
        if ((i13 & 2) != 0) {
            z4 = reactionRequest.enforce_unique;
        }
        if ((i13 & 4) != 0) {
            z13 = reactionRequest.skip_push;
        }
        return reactionRequest.copy(upstreamReactionDto, z4, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UpstreamReactionDto getReaction() {
        return this.reaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnforce_unique() {
        return this.enforce_unique;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSkip_push() {
        return this.skip_push;
    }

    public final ReactionRequest copy(UpstreamReactionDto reaction, boolean enforce_unique, boolean skip_push) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return new ReactionRequest(reaction, enforce_unique, skip_push);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionRequest)) {
            return false;
        }
        ReactionRequest reactionRequest = (ReactionRequest) other;
        return AbstractC22676k.m65745e(this.reaction, reactionRequest.reaction) && this.enforce_unique == reactionRequest.enforce_unique && this.skip_push == reactionRequest.skip_push;
    }

    public final boolean getEnforce_unique() {
        return this.enforce_unique;
    }

    public final UpstreamReactionDto getReaction() {
        return this.reaction;
    }

    public final boolean getSkip_push() {
        return this.skip_push;
    }

    public int hashCode() {
        return Boolean.hashCode(this.skip_push) + AbstractC2875y.m8289b(this.reaction.hashCode() * 31, 31, this.enforce_unique);
    }

    public String toString() {
        UpstreamReactionDto upstreamReactionDto = this.reaction;
        boolean z4 = this.enforce_unique;
        boolean z13 = this.skip_push;
        StringBuilder sb4 = new StringBuilder("ReactionRequest(reaction=");
        sb4.append(upstreamReactionDto);
        sb4.append(", enforce_unique=");
        sb4.append(z4);
        sb4.append(", skip_push=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }
}
