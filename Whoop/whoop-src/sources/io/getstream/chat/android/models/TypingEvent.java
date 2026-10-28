package io.getstream.chat.android.models;

import java.util.List;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/models/TypingEvent;", "", "channelId", "", "users", "", "Lio/getstream/chat/android/models/User;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getChannelId", "()Ljava/lang/String;", "getUsers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class TypingEvent {
    private final String channelId;
    private final List<User> users;

    public TypingEvent(String channelId, List<User> users) {
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(users, "users");
        this.channelId = channelId;
        this.users = users;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypingEvent copy$default(TypingEvent typingEvent, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = typingEvent.channelId;
        }
        if ((i13 & 2) != 0) {
            list = typingEvent.users;
        }
        return typingEvent.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    public final List<User> component2() {
        return this.users;
    }

    public final TypingEvent copy(String channelId, List<User> users) {
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(users, "users");
        return new TypingEvent(channelId, users);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingEvent)) {
            return false;
        }
        TypingEvent typingEvent = (TypingEvent) other;
        return AbstractC22676k.m65745e(this.channelId, typingEvent.channelId) && AbstractC22676k.m65745e(this.users, typingEvent.users);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return this.users.hashCode() + (this.channelId.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("TypingEvent(channelId=", this.channelId, ", users=", ")", this.users);
    }
}
