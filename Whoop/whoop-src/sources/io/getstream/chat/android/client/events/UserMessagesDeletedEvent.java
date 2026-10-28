package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.User;
import java.util.Date;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m65681d2 = {"Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "cid", "channelType", "channelId", "hardDelete", "", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getCid", "getChannelType", "getChannelId", "getHardDelete", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UserMessagesDeletedEvent extends ChatEvent implements UserEvent {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final boolean hardDelete;
    private final String rawCreatedAt;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMessagesDeletedEvent(String type, Date createdAt, String str, User user, String str2, String str3, String str4, boolean z4) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(user, "user");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = str;
        this.user = user;
        this.cid = str2;
        this.channelType = str3;
        this.channelId = str4;
        this.hardDelete = z4;
    }

    public static /* synthetic */ UserMessagesDeletedEvent copy$default(UserMessagesDeletedEvent userMessagesDeletedEvent, String str, Date date, String str2, User user, String str3, String str4, String str5, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userMessagesDeletedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = userMessagesDeletedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = userMessagesDeletedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            user = userMessagesDeletedEvent.user;
        }
        if ((i13 & 16) != 0) {
            str3 = userMessagesDeletedEvent.cid;
        }
        if ((i13 & 32) != 0) {
            str4 = userMessagesDeletedEvent.channelType;
        }
        if ((i13 & 64) != 0) {
            str5 = userMessagesDeletedEvent.channelId;
        }
        if ((i13 & 128) != 0) {
            z4 = userMessagesDeletedEvent.hardDelete;
        }
        String str6 = str5;
        boolean z13 = z4;
        String str7 = str3;
        String str8 = str4;
        return userMessagesDeletedEvent.copy(str, date, str2, user, str7, str8, str6, z13);
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
    public final String getCid() {
        return this.cid;
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
    public final boolean getHardDelete() {
        return this.hardDelete;
    }

    public final UserMessagesDeletedEvent copy(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, boolean hardDelete) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(user, "user");
        return new UserMessagesDeletedEvent(type, createdAt, rawCreatedAt, user, cid, channelType, channelId, hardDelete);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMessagesDeletedEvent)) {
            return false;
        }
        UserMessagesDeletedEvent userMessagesDeletedEvent = (UserMessagesDeletedEvent) other;
        return AbstractC22676k.m65745e(this.type, userMessagesDeletedEvent.type) && AbstractC22676k.m65745e(this.createdAt, userMessagesDeletedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, userMessagesDeletedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, userMessagesDeletedEvent.user) && AbstractC22676k.m65745e(this.cid, userMessagesDeletedEvent.cid) && AbstractC22676k.m65745e(this.channelType, userMessagesDeletedEvent.channelType) && AbstractC22676k.m65745e(this.channelId, userMessagesDeletedEvent.channelId) && this.hardDelete == userMessagesDeletedEvent.hardDelete;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final String getCid() {
        return this.cid;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getHardDelete() {
        return this.hardDelete;
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
        int iM124373c = AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31);
        String str = this.rawCreatedAt;
        int iM30850b = AbstractC11478a.m30850b(this.user, (iM124373c + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.cid;
        int iHashCode = (iM30850b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelType;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channelId;
        return Boolean.hashCode(this.hardDelete) + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.user;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        boolean z4 = this.hardDelete;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("UserMessagesDeletedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", cid=");
        AbstractC11266d.m30444B(sbM11830n, str3, ", channelType=", str4, ", channelId=");
        return AbstractC21702c.m61137h(sbM11830n, str5, ", hardDelete=", z4, ")");
    }
}
