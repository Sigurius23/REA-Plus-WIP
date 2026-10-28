package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\r\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/client/events/UserStartWatchingEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "Lio/getstream/chat/android/client/events/HasWatcherCount;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "watcherCount", "", "channelType", "channelId", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getWatcherCount", "()I", "getChannelType", "getChannelId", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UserStartWatchingEvent extends CidEvent implements UserEvent, HasWatcherCount {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String rawCreatedAt;
    private final String type;
    private final User user;
    private final int watcherCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStartWatchingEvent(String type, Date createdAt, String rawCreatedAt, String cid, int i13, String channelType, String channelId, User user) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(user, "user");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.cid = cid;
        this.watcherCount = i13;
        this.channelType = channelType;
        this.channelId = channelId;
        this.user = user;
    }

    public static /* synthetic */ UserStartWatchingEvent copy$default(UserStartWatchingEvent userStartWatchingEvent, String str, Date date, String str2, String str3, int i13, String str4, String str5, User user, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = userStartWatchingEvent.type;
        }
        if ((i14 & 2) != 0) {
            date = userStartWatchingEvent.createdAt;
        }
        if ((i14 & 4) != 0) {
            str2 = userStartWatchingEvent.rawCreatedAt;
        }
        if ((i14 & 8) != 0) {
            str3 = userStartWatchingEvent.cid;
        }
        if ((i14 & 16) != 0) {
            i13 = userStartWatchingEvent.watcherCount;
        }
        if ((i14 & 32) != 0) {
            str4 = userStartWatchingEvent.channelType;
        }
        if ((i14 & 64) != 0) {
            str5 = userStartWatchingEvent.channelId;
        }
        if ((i14 & 128) != 0) {
            user = userStartWatchingEvent.user;
        }
        String str6 = str5;
        User user2 = user;
        int i15 = i13;
        String str7 = str4;
        return userStartWatchingEvent.copy(str, date, str2, str3, i15, str7, str6, user2);
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
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWatcherCount() {
        return this.watcherCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final UserStartWatchingEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, int watcherCount, String channelType, String channelId, User user) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(user, "user");
        return new UserStartWatchingEvent(type, createdAt, rawCreatedAt, cid, watcherCount, channelType, channelId, user);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStartWatchingEvent)) {
            return false;
        }
        UserStartWatchingEvent userStartWatchingEvent = (UserStartWatchingEvent) other;
        return AbstractC22676k.m65745e(this.type, userStartWatchingEvent.type) && AbstractC22676k.m65745e(this.createdAt, userStartWatchingEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, userStartWatchingEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, userStartWatchingEvent.cid) && this.watcherCount == userStartWatchingEvent.watcherCount && AbstractC22676k.m65745e(this.channelType, userStartWatchingEvent.channelType) && AbstractC22676k.m65745e(this.channelId, userStartWatchingEvent.channelId) && AbstractC22676k.m65745e(this.user, userStartWatchingEvent.user);
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelId() {
        return this.channelId;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelType() {
        return this.channelType;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getCid() {
        return this.cid;
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

    @Override // io.getstream.chat.android.client.events.HasWatcherCount
    public final int getWatcherCount() {
        return this.watcherCount;
    }

    public final int hashCode() {
        return this.user.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.watcherCount, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31, this.cid), 31), 31, this.channelType), 31, this.channelId);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.cid;
        int i13 = this.watcherCount;
        String str4 = this.channelType;
        String str5 = this.channelId;
        User user = this.user;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("UserStartWatchingEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", watcherCount=");
        AbstractC11895b.m31979B(i13, ", channelType=", str4, ", channelId=", sbM11830n);
        sbM11830n.append(str5);
        sbM11830n.append(", user=");
        sbM11830n.append(user);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }

    public /* synthetic */ UserStartWatchingEvent(String str, Date date, String str2, String str3, int i13, String str4, String str5, User user, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, str3, (i14 & 16) != 0 ? 0 : i13, str4, str5, user);
    }
}
