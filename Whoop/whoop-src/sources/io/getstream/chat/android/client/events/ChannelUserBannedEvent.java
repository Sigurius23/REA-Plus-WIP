package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "channelType", "channelId", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "expiration", "shadow", "", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/util/Date;Z)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getChannelType", "getChannelId", "getUser", "()Lio/getstream/chat/android/models/User;", "getExpiration", "getShadow", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelUserBannedEvent extends CidEvent implements UserEvent {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final Date expiration;
    private final String rawCreatedAt;
    private final boolean shadow;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelUserBannedEvent(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, User user, Date date, boolean z4) {
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
        this.channelType = channelType;
        this.channelId = channelId;
        this.user = user;
        this.expiration = date;
        this.shadow = z4;
    }

    public static /* synthetic */ ChannelUserBannedEvent copy$default(ChannelUserBannedEvent channelUserBannedEvent, String str, Date date, String str2, String str3, String str4, String str5, User user, Date date2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelUserBannedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = channelUserBannedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = channelUserBannedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            str3 = channelUserBannedEvent.cid;
        }
        if ((i13 & 16) != 0) {
            str4 = channelUserBannedEvent.channelType;
        }
        if ((i13 & 32) != 0) {
            str5 = channelUserBannedEvent.channelId;
        }
        if ((i13 & 64) != 0) {
            user = channelUserBannedEvent.user;
        }
        if ((i13 & 128) != 0) {
            date2 = channelUserBannedEvent.expiration;
        }
        if ((i13 & 256) != 0) {
            z4 = channelUserBannedEvent.shadow;
        }
        Date date3 = date2;
        boolean z13 = z4;
        String str6 = str5;
        User user2 = user;
        String str7 = str4;
        String str8 = str2;
        return channelUserBannedEvent.copy(str, date, str8, str3, str7, str6, user2, date3, z13);
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
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getExpiration() {
        return this.expiration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShadow() {
        return this.shadow;
    }

    public final ChannelUserBannedEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, User user, Date expiration, boolean shadow) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(user, "user");
        return new ChannelUserBannedEvent(type, createdAt, rawCreatedAt, cid, channelType, channelId, user, expiration, shadow);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelUserBannedEvent)) {
            return false;
        }
        ChannelUserBannedEvent channelUserBannedEvent = (ChannelUserBannedEvent) other;
        return AbstractC22676k.m65745e(this.type, channelUserBannedEvent.type) && AbstractC22676k.m65745e(this.createdAt, channelUserBannedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, channelUserBannedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, channelUserBannedEvent.cid) && AbstractC22676k.m65745e(this.channelType, channelUserBannedEvent.channelType) && AbstractC22676k.m65745e(this.channelId, channelUserBannedEvent.channelId) && AbstractC22676k.m65745e(this.user, channelUserBannedEvent.user) && AbstractC22676k.m65745e(this.expiration, channelUserBannedEvent.expiration) && this.shadow == channelUserBannedEvent.shadow;
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

    public final Date getExpiration() {
        return this.expiration;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    public final boolean getShadow() {
        return this.shadow;
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
        int iM30850b = AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31, this.cid), 31, this.channelType), 31, this.channelId), 31);
        Date date = this.expiration;
        return Boolean.hashCode(this.shadow) + ((iM30850b + (date == null ? 0 : date.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        User user = this.user;
        Date date2 = this.expiration;
        boolean z4 = this.shadow;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ChannelUserBannedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", channelType=");
        AbstractC11266d.m30444B(sbM11830n, str4, ", channelId=", str5, ", user=");
        sbM11830n.append(user);
        sbM11830n.append(", expiration=");
        sbM11830n.append(date2);
        sbM11830n.append(", shadow=");
        return AbstractC18489d0.m53372m(sbM11830n, z4, ")");
    }
}
