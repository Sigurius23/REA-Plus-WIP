package io.getstream.chat.android.client.api;

import java.util.Set;
import m83.C25235a0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/api/MessageBufferConfig;", "", "channelTypes", "", "", "capacity", "", "overflow", "Lio/getstream/chat/android/client/api/MessageBufferOverflow;", "<init>", "(Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;)V", "getChannelTypes", "()Ljava/util/Set;", "getCapacity", "()I", "getOverflow", "()Lio/getstream/chat/android/client/api/MessageBufferOverflow;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageBufferConfig {
    private final int capacity;
    private final Set<String> channelTypes;
    private final MessageBufferOverflow overflow;

    public MessageBufferConfig() {
        this(null, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageBufferConfig copy$default(MessageBufferConfig messageBufferConfig, Set set, int i13, MessageBufferOverflow messageBufferOverflow, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            set = messageBufferConfig.channelTypes;
        }
        if ((i14 & 2) != 0) {
            i13 = messageBufferConfig.capacity;
        }
        if ((i14 & 4) != 0) {
            messageBufferOverflow = messageBufferConfig.overflow;
        }
        return messageBufferConfig.copy(set, i13, messageBufferOverflow);
    }

    public final Set<String> component1() {
        return this.channelTypes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageBufferOverflow getOverflow() {
        return this.overflow;
    }

    public final MessageBufferConfig copy(Set<String> channelTypes, int capacity, MessageBufferOverflow overflow) {
        AbstractC22676k.m65750j(channelTypes, "channelTypes");
        AbstractC22676k.m65750j(overflow, "overflow");
        return new MessageBufferConfig(channelTypes, capacity, overflow);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageBufferConfig)) {
            return false;
        }
        MessageBufferConfig messageBufferConfig = (MessageBufferConfig) other;
        return AbstractC22676k.m65745e(this.channelTypes, messageBufferConfig.channelTypes) && this.capacity == messageBufferConfig.capacity && this.overflow == messageBufferConfig.overflow;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final Set<String> getChannelTypes() {
        return this.channelTypes;
    }

    public final MessageBufferOverflow getOverflow() {
        return this.overflow;
    }

    public final int hashCode() {
        return this.overflow.hashCode() + AbstractC11266d.m30448b(this.capacity, this.channelTypes.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MessageBufferConfig(channelTypes=" + this.channelTypes + ", capacity=" + this.capacity + ", overflow=" + this.overflow + ")";
    }

    public MessageBufferConfig(Set<String> channelTypes, int i13, MessageBufferOverflow overflow) {
        AbstractC22676k.m65750j(channelTypes, "channelTypes");
        AbstractC22676k.m65750j(overflow, "overflow");
        this.channelTypes = channelTypes;
        this.capacity = i13;
        this.overflow = overflow;
    }

    public /* synthetic */ MessageBufferConfig(Set set, int i13, MessageBufferOverflow messageBufferOverflow, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? C25235a0.f99113w : set, (i14 & 2) != 0 ? Integer.MAX_VALUE : i13, (i14 & 4) != 0 ? MessageBufferOverflow.DROP_OLDEST : messageBufferOverflow);
    }
}
