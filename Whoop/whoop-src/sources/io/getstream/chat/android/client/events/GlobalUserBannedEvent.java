package io.getstream.chat.android.client.events;

import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/client/events/GlobalUserBannedEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "type", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getUser", "()Lio/getstream/chat/android/models/User;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GlobalUserBannedEvent extends ChatEvent implements UserEvent {
    private final Date createdAt;
    private final String rawCreatedAt;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalUserBannedEvent(String type, User user, Date createdAt, String rawCreatedAt) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        this.type = type;
        this.user = user;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
    }

    public static /* synthetic */ GlobalUserBannedEvent copy$default(GlobalUserBannedEvent globalUserBannedEvent, String str, User user, Date date, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = globalUserBannedEvent.type;
        }
        if ((i13 & 2) != 0) {
            user = globalUserBannedEvent.user;
        }
        if ((i13 & 4) != 0) {
            date = globalUserBannedEvent.createdAt;
        }
        if ((i13 & 8) != 0) {
            str2 = globalUserBannedEvent.rawCreatedAt;
        }
        return globalUserBannedEvent.copy(str, user, date, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    public final GlobalUserBannedEvent copy(String type, User user, Date createdAt, String rawCreatedAt) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        return new GlobalUserBannedEvent(type, user, createdAt, rawCreatedAt);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalUserBannedEvent)) {
            return false;
        }
        GlobalUserBannedEvent globalUserBannedEvent = (GlobalUserBannedEvent) other;
        return AbstractC22676k.m65745e(this.type, globalUserBannedEvent.type) && AbstractC22676k.m65745e(this.user, globalUserBannedEvent.user) && AbstractC22676k.m65745e(this.createdAt, globalUserBannedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, globalUserBannedEvent.rawCreatedAt);
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    @Override // io.getstream.chat.android.client.events.UserEvent
    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        return this.rawCreatedAt.hashCode() + AbstractC38963t7.m124373c(this.createdAt, AbstractC11478a.m30850b(this.user, this.type.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "GlobalUserBannedEvent(type=" + this.type + ", user=" + this.user + ", createdAt=" + this.createdAt + ", rawCreatedAt=" + this.rawCreatedAt + ")";
    }
}
