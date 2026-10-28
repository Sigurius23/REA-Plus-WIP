package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.models.Message;
import java.util.Date;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003JS\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;", "", "oldestMessage", "Lio/getstream/chat/android/models/Message;", "newestMessage", "hasLoadedAllNextMessages", "", "hasLoadedAllPreviousMessages", "isLoadingNextMessages", "isLoadingPreviousMessages", "isLoadingMiddleMessages", "<init>", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZ)V", "getOldestMessage", "()Lio/getstream/chat/android/models/Message;", "getNewestMessage", "getHasLoadedAllNextMessages", "()Z", "getHasLoadedAllPreviousMessages", "isLoadingMessages", "isJumpingToMessage", "oldestMessageAt", "Ljava/util/Date;", "getOldestMessageAt", "()Ljava/util/Date;", "newestMessageAt", "getNewestMessageAt", "isInWindow", "message", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessagesPaginationState {
    private final boolean hasLoadedAllNextMessages;
    private final boolean hasLoadedAllPreviousMessages;
    private final boolean isLoadingMiddleMessages;
    private final boolean isLoadingNextMessages;
    private final boolean isLoadingPreviousMessages;
    private final Message newestMessage;
    private final Message oldestMessage;

    public MessagesPaginationState() {
        this(null, null, false, false, false, false, false, 127, null);
    }

    public static MessagesPaginationState copy$default(MessagesPaginationState messagesPaginationState, Message message, Message message2, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            message = messagesPaginationState.oldestMessage;
        }
        if ((i13 & 2) != 0) {
            message2 = messagesPaginationState.newestMessage;
        }
        if ((i13 & 4) != 0) {
            z4 = messagesPaginationState.hasLoadedAllNextMessages;
        }
        if ((i13 & 8) != 0) {
            z13 = messagesPaginationState.hasLoadedAllPreviousMessages;
        }
        if ((i13 & 16) != 0) {
            z14 = messagesPaginationState.isLoadingNextMessages;
        }
        if ((i13 & 32) != 0) {
            z15 = messagesPaginationState.isLoadingPreviousMessages;
        }
        if ((i13 & 64) != 0) {
            z16 = messagesPaginationState.isLoadingMiddleMessages;
        }
        boolean z17 = z16;
        messagesPaginationState.getClass();
        boolean z18 = z15;
        boolean z19 = z14;
        boolean z24 = z4;
        return new MessagesPaginationState(message, message2, z24, z13, z19, z18, z17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getOldestMessage() {
        return this.oldestMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Message getNewestMessage() {
        return this.newestMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasLoadedAllNextMessages() {
        return this.hasLoadedAllNextMessages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasLoadedAllPreviousMessages() {
        return this.hasLoadedAllPreviousMessages;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsLoadingNextMessages() {
        return this.isLoadingNextMessages;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsLoadingPreviousMessages() {
        return this.isLoadingPreviousMessages;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsLoadingMiddleMessages() {
        return this.isLoadingMiddleMessages;
    }

    public final MessagesPaginationState copy(Message oldestMessage, Message newestMessage, boolean hasLoadedAllNextMessages, boolean hasLoadedAllPreviousMessages, boolean isLoadingNextMessages, boolean isLoadingPreviousMessages, boolean isLoadingMiddleMessages) {
        return new MessagesPaginationState(oldestMessage, newestMessage, hasLoadedAllNextMessages, hasLoadedAllPreviousMessages, isLoadingNextMessages, isLoadingPreviousMessages, isLoadingMiddleMessages);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessagesPaginationState)) {
            return false;
        }
        MessagesPaginationState messagesPaginationState = (MessagesPaginationState) other;
        return AbstractC22676k.m65745e(this.oldestMessage, messagesPaginationState.oldestMessage) && AbstractC22676k.m65745e(this.newestMessage, messagesPaginationState.newestMessage) && this.hasLoadedAllNextMessages == messagesPaginationState.hasLoadedAllNextMessages && this.hasLoadedAllPreviousMessages == messagesPaginationState.hasLoadedAllPreviousMessages && this.isLoadingNextMessages == messagesPaginationState.isLoadingNextMessages && this.isLoadingPreviousMessages == messagesPaginationState.isLoadingPreviousMessages && this.isLoadingMiddleMessages == messagesPaginationState.isLoadingMiddleMessages;
    }

    public final boolean getHasLoadedAllNextMessages() {
        return this.hasLoadedAllNextMessages;
    }

    public final boolean getHasLoadedAllPreviousMessages() {
        return this.hasLoadedAllPreviousMessages;
    }

    public final Message getNewestMessage() {
        return this.newestMessage;
    }

    public final Date getNewestMessageAt() {
        Message message = this.newestMessage;
        if (message != null) {
            return message.getCreatedAt();
        }
        return null;
    }

    public final Message getOldestMessage() {
        return this.oldestMessage;
    }

    public final Date getOldestMessageAt() {
        Message message = this.oldestMessage;
        if (message != null) {
            return message.getCreatedAt();
        }
        return null;
    }

    public final int hashCode() {
        Message message = this.oldestMessage;
        int iHashCode = (message == null ? 0 : message.hashCode()) * 31;
        Message message2 = this.newestMessage;
        return Boolean.hashCode(this.isLoadingMiddleMessages) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (message2 != null ? message2.hashCode() : 0)) * 31, 31, this.hasLoadedAllNextMessages), 31, this.hasLoadedAllPreviousMessages), 31, this.isLoadingNextMessages), 31, this.isLoadingPreviousMessages);
    }

    public final boolean isInWindow(Message message) {
        AbstractC22676k.m65750j(message, "message");
        Date createdAtOrDefault = MessageExtensionsKt.getCreatedAtOrDefault(message, MessageKt.getNEVER());
        if (getOldestMessageAt() == null || createdAtOrDefault.compareTo(getOldestMessageAt()) >= 0) {
            return getNewestMessageAt() == null || createdAtOrDefault.compareTo(getNewestMessageAt()) <= 0;
        }
        return false;
    }

    public final boolean isJumpingToMessage() {
        return !this.hasLoadedAllNextMessages;
    }

    public final boolean isLoadingMessages() {
        return this.isLoadingNextMessages || this.isLoadingPreviousMessages || this.isLoadingMiddleMessages;
    }

    public final boolean isLoadingMiddleMessages() {
        return this.isLoadingMiddleMessages;
    }

    public final boolean isLoadingNextMessages() {
        return this.isLoadingNextMessages;
    }

    public final boolean isLoadingPreviousMessages() {
        return this.isLoadingPreviousMessages;
    }

    public final String toString() {
        Message message = this.oldestMessage;
        Message message2 = this.newestMessage;
        boolean z4 = this.hasLoadedAllNextMessages;
        boolean z13 = this.hasLoadedAllPreviousMessages;
        boolean z14 = this.isLoadingNextMessages;
        boolean z15 = this.isLoadingPreviousMessages;
        boolean z16 = this.isLoadingMiddleMessages;
        StringBuilder sb4 = new StringBuilder("MessagesPaginationState(oldestMessage=");
        sb4.append(message);
        sb4.append(", newestMessage=");
        sb4.append(message2);
        sb4.append(", hasLoadedAllNextMessages=");
        AbstractC38963t7.m124392v(sb4, z4, ", hasLoadedAllPreviousMessages=", z13, ", isLoadingNextMessages=");
        AbstractC38963t7.m124392v(sb4, z14, ", isLoadingPreviousMessages=", z15, ", isLoadingMiddleMessages=");
        return AbstractC18489d0.m53372m(sb4, z16, ")");
    }

    public MessagesPaginationState(Message message, Message message2, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.oldestMessage = message;
        this.newestMessage = message2;
        this.hasLoadedAllNextMessages = z4;
        this.hasLoadedAllPreviousMessages = z13;
        this.isLoadingNextMessages = z14;
        this.isLoadingPreviousMessages = z15;
        this.isLoadingMiddleMessages = z16;
    }

    public /* synthetic */ MessagesPaginationState(Message message, Message message2, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : message, (i13 & 2) != 0 ? null : message2, (i13 & 4) != 0 ? true : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? false : z15, (i13 & 64) != 0 ? false : z16);
    }
}
