package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ChatActivityStatsResponse;", "", "messages", "Lio/getstream/android/video/generated/models/MessageStatsResponse;", "(Lio/getstream/android/video/generated/models/MessageStatsResponse;)V", "getMessages", "()Lio/getstream/android/video/generated/models/MessageStatsResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ChatActivityStatsResponse {
    private final MessageStatsResponse messages;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatActivityStatsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChatActivityStatsResponse copy$default(ChatActivityStatsResponse chatActivityStatsResponse, MessageStatsResponse messageStatsResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            messageStatsResponse = chatActivityStatsResponse.messages;
        }
        return chatActivityStatsResponse.copy(messageStatsResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageStatsResponse getMessages() {
        return this.messages;
    }

    public final ChatActivityStatsResponse copy(@InterfaceC30731q(name = "Messages") MessageStatsResponse messages) {
        return new ChatActivityStatsResponse(messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChatActivityStatsResponse) && AbstractC22676k.m65745e(this.messages, ((ChatActivityStatsResponse) other).messages);
    }

    public final MessageStatsResponse getMessages() {
        return this.messages;
    }

    public int hashCode() {
        MessageStatsResponse messageStatsResponse = this.messages;
        if (messageStatsResponse == null) {
            return 0;
        }
        return messageStatsResponse.hashCode();
    }

    public String toString() {
        return "ChatActivityStatsResponse(messages=" + this.messages + ")";
    }

    public ChatActivityStatsResponse(@InterfaceC30731q(name = "Messages") MessageStatsResponse messageStatsResponse) {
        this.messages = messageStatsResponse;
    }

    public /* synthetic */ ChatActivityStatsResponse(MessageStatsResponse messageStatsResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : messageStatsResponse);
    }
}
