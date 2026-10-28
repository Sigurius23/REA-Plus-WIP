package io.getstream.chat.android.models;

import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/models/PendingMessage;", "", "message", "Lio/getstream/chat/android/models/Message;", "metadata", "", "", "<init>", "(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getMetadata", "()Ljava/util/Map;", "newBuilder", "Lio/getstream/chat/android/models/PendingMessage$Builder;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Builder", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PendingMessage {
    private final Message message;
    private final Map<String, String> metadata;

    public PendingMessage(Message message, Map<String, String> metadata) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(metadata, "metadata");
        this.message = message;
        this.metadata = metadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingMessage copy$default(PendingMessage pendingMessage, Message message, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            message = pendingMessage.message;
        }
        if ((i13 & 2) != 0) {
            map = pendingMessage.metadata;
        }
        return pendingMessage.copy(message, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    public final Map<String, String> component2() {
        return this.metadata;
    }

    public final PendingMessage copy(Message message, Map<String, String> metadata) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(metadata, "metadata");
        return new PendingMessage(message, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingMessage)) {
            return false;
        }
        PendingMessage pendingMessage = (PendingMessage) other;
        return AbstractC22676k.m65745e(this.message, pendingMessage.message) && AbstractC22676k.m65745e(this.metadata, pendingMessage.metadata);
    }

    public final Message getMessage() {
        return this.message;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.message.hashCode() * 31);
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "PendingMessage(message=" + this.message + ", metadata=" + this.metadata + ")";
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\r\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/models/PendingMessage$Builder;", "", "<init>", "()V", "pendingMessage", "Lio/getstream/chat/android/models/PendingMessage;", "(Lio/getstream/chat/android/models/PendingMessage;)V", "message", "Lio/getstream/chat/android/models/Message;", "metadata", "", "", "withMessage", "withMetadata", "build", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private Message message;
        private Map<String, String> metadata;

        public Builder() {
            this.message = new Message(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -1, 65535, null);
            this.metadata = C25272z.f99163w;
        }

        public final PendingMessage build() {
            return new PendingMessage(this.message, this.metadata);
        }

        public final Builder withMessage(Message message) {
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
            return this;
        }

        public final Builder withMetadata(Map<String, String> metadata) {
            AbstractC22676k.m65750j(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(PendingMessage pendingMessage) {
            this();
            AbstractC22676k.m65750j(pendingMessage, "pendingMessage");
            this.message = pendingMessage.getMessage();
            this.metadata = pendingMessage.getMetadata();
        }
    }
}
