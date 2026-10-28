package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SendReactionResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "reaction", "Lio/getstream/android/video/generated/models/ReactionResponse;", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/ReactionResponse;)V", "getDuration", "()Ljava/lang/String;", "getReaction", "()Lio/getstream/android/video/generated/models/ReactionResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SendReactionResponse {
    private final String duration;
    private final ReactionResponse reaction;

    public SendReactionResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "reaction") ReactionResponse reaction) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(reaction, "reaction");
        this.duration = duration;
        this.reaction = reaction;
    }

    public static /* synthetic */ SendReactionResponse copy$default(SendReactionResponse sendReactionResponse, String str, ReactionResponse reactionResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sendReactionResponse.duration;
        }
        if ((i13 & 2) != 0) {
            reactionResponse = sendReactionResponse.reaction;
        }
        return sendReactionResponse.copy(str, reactionResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReactionResponse getReaction() {
        return this.reaction;
    }

    public final SendReactionResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "reaction") ReactionResponse reaction) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(reaction, "reaction");
        return new SendReactionResponse(duration, reaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendReactionResponse)) {
            return false;
        }
        SendReactionResponse sendReactionResponse = (SendReactionResponse) other;
        return AbstractC22676k.m65745e(this.duration, sendReactionResponse.duration) && AbstractC22676k.m65745e(this.reaction, sendReactionResponse.reaction);
    }

    public final String getDuration() {
        return this.duration;
    }

    public final ReactionResponse getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        return this.reaction.hashCode() + (this.duration.hashCode() * 31);
    }

    public String toString() {
        return "SendReactionResponse(duration=" + this.duration + ", reaction=" + this.reaction + ")";
    }
}
