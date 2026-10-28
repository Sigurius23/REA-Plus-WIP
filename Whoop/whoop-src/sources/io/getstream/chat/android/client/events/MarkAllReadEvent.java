package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.User;
import java.util.Date;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B=\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/events/MarkAllReadEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "Lio/getstream/chat/android/client/events/HasUnreadCounts;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "totalUnreadCount", "", "unreadChannels", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;II)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getTotalUnreadCount", "()I", "getUnreadChannels", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MarkAllReadEvent extends ChatEvent implements UserEvent, HasUnreadCounts {
    private final Date createdAt;
    private final String rawCreatedAt;
    private final int totalUnreadCount;
    private final String type;
    private final int unreadChannels;
    private final User user;

    public /* synthetic */ MarkAllReadEvent(String str, Date date, String str2, User user, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, date, str2, user, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? 0 : i14);
    }

    public static /* synthetic */ MarkAllReadEvent copy$default(MarkAllReadEvent markAllReadEvent, String str, Date date, String str2, User user, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = markAllReadEvent.type;
        }
        if ((i15 & 2) != 0) {
            date = markAllReadEvent.createdAt;
        }
        if ((i15 & 4) != 0) {
            str2 = markAllReadEvent.rawCreatedAt;
        }
        if ((i15 & 8) != 0) {
            user = markAllReadEvent.user;
        }
        if ((i15 & 16) != 0) {
            i13 = markAllReadEvent.totalUnreadCount;
        }
        if ((i15 & 32) != 0) {
            i14 = markAllReadEvent.unreadChannels;
        }
        int i16 = i13;
        int i17 = i14;
        return markAllReadEvent.copy(str, date, str2, user, i16, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    public final MarkAllReadEvent copy(String type, Date createdAt, String rawCreatedAt, User user, int totalUnreadCount, int unreadChannels) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        return new MarkAllReadEvent(type, createdAt, rawCreatedAt, user, totalUnreadCount, unreadChannels);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkAllReadEvent)) {
            return false;
        }
        MarkAllReadEvent markAllReadEvent = (MarkAllReadEvent) other;
        return AbstractC22676k.m65745e(this.type, markAllReadEvent.type) && AbstractC22676k.m65745e(this.createdAt, markAllReadEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, markAllReadEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, markAllReadEvent.user) && this.totalUnreadCount == markAllReadEvent.totalUnreadCount && this.unreadChannels == markAllReadEvent.unreadChannels;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadCounts
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadCounts
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    @Override // io.getstream.chat.android.client.events.UserEvent
    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        return Integer.hashCode(this.unreadChannels) + AbstractC11266d.m30448b(this.totalUnreadCount, AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31), 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.user;
        int i13 = this.totalUnreadCount;
        int i14 = this.unreadChannels;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("MarkAllReadEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", totalUnreadCount=");
        return AbstractC26725a.m79505i(sbM11830n, i13, ", unreadChannels=", i14, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkAllReadEvent(String type, Date createdAt, String rawCreatedAt, User user, int i13, int i14) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.user = user;
        this.totalUnreadCount = i13;
        this.unreadChannels = i14;
    }
}
