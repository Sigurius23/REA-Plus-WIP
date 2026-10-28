package io.getstream.chat.android.client.api;

import java.util.Set;
import m83.C25235a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/api/MessageLimitConfig;", "", "channelMessageLimits", "", "Lio/getstream/chat/android/client/api/ChannelMessageLimit;", "messageBufferConfig", "Lio/getstream/chat/android/client/api/MessageBufferConfig;", "<init>", "(Ljava/util/Set;Lio/getstream/chat/android/client/api/MessageBufferConfig;)V", "getChannelMessageLimits", "()Ljava/util/Set;", "getMessageBufferConfig", "()Lio/getstream/chat/android/client/api/MessageBufferConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageLimitConfig {
    private final Set<ChannelMessageLimit> channelMessageLimits;
    private final MessageBufferConfig messageBufferConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageLimitConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageLimitConfig copy$default(MessageLimitConfig messageLimitConfig, Set set, MessageBufferConfig messageBufferConfig, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            set = messageLimitConfig.channelMessageLimits;
        }
        if ((i13 & 2) != 0) {
            messageBufferConfig = messageLimitConfig.messageBufferConfig;
        }
        return messageLimitConfig.copy(set, messageBufferConfig);
    }

    public final Set<ChannelMessageLimit> component1() {
        return this.channelMessageLimits;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageBufferConfig getMessageBufferConfig() {
        return this.messageBufferConfig;
    }

    public final MessageLimitConfig copy(Set<ChannelMessageLimit> channelMessageLimits, MessageBufferConfig messageBufferConfig) {
        AbstractC22676k.m65750j(channelMessageLimits, "channelMessageLimits");
        AbstractC22676k.m65750j(messageBufferConfig, "messageBufferConfig");
        return new MessageLimitConfig(channelMessageLimits, messageBufferConfig);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageLimitConfig)) {
            return false;
        }
        MessageLimitConfig messageLimitConfig = (MessageLimitConfig) other;
        return AbstractC22676k.m65745e(this.channelMessageLimits, messageLimitConfig.channelMessageLimits) && AbstractC22676k.m65745e(this.messageBufferConfig, messageLimitConfig.messageBufferConfig);
    }

    public final Set<ChannelMessageLimit> getChannelMessageLimits() {
        return this.channelMessageLimits;
    }

    public final MessageBufferConfig getMessageBufferConfig() {
        return this.messageBufferConfig;
    }

    public final int hashCode() {
        return this.messageBufferConfig.hashCode() + (this.channelMessageLimits.hashCode() * 31);
    }

    public final String toString() {
        return "MessageLimitConfig(channelMessageLimits=" + this.channelMessageLimits + ", messageBufferConfig=" + this.messageBufferConfig + ")";
    }

    public MessageLimitConfig(Set<ChannelMessageLimit> channelMessageLimits, MessageBufferConfig messageBufferConfig) {
        AbstractC22676k.m65750j(channelMessageLimits, "channelMessageLimits");
        AbstractC22676k.m65750j(messageBufferConfig, "messageBufferConfig");
        this.channelMessageLimits = channelMessageLimits;
        this.messageBufferConfig = messageBufferConfig;
    }

    public /* synthetic */ MessageLimitConfig(Set set, MessageBufferConfig messageBufferConfig, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25235a0.f99113w : set, (i13 & 2) != 0 ? new MessageBufferConfig(null, 0, null, 7, null) : messageBufferConfig);
    }
}
