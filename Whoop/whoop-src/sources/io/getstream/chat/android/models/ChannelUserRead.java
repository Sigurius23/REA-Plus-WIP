package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import java.util.Date;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/models/ChannelUserRead;", "Lio/getstream/chat/android/models/UserEntity;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "lastReceivedEventDate", "Ljava/util/Date;", "unreadMessages", "", "lastRead", "lastReadMessageId", "", "lastDeliveredAt", "lastDeliveredMessageId", "<init>", "(Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getLastReceivedEventDate", "()Ljava/util/Date;", "getUnreadMessages", "()I", "getLastRead", "getLastReadMessageId", "()Ljava/lang/String;", "getLastDeliveredAt", "getLastDeliveredMessageId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelUserRead implements UserEntity {
    private final Date lastDeliveredAt;
    private final String lastDeliveredMessageId;
    private final Date lastRead;
    private final String lastReadMessageId;
    private final Date lastReceivedEventDate;
    private final int unreadMessages;
    private final User user;

    public ChannelUserRead(User user, Date lastReceivedEventDate, int i13, Date lastRead, String str, Date date, String str2) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(lastReceivedEventDate, "lastReceivedEventDate");
        AbstractC22676k.m65750j(lastRead, "lastRead");
        this.user = user;
        this.lastReceivedEventDate = lastReceivedEventDate;
        this.unreadMessages = i13;
        this.lastRead = lastRead;
        this.lastReadMessageId = str;
        this.lastDeliveredAt = date;
        this.lastDeliveredMessageId = str2;
    }

    public static /* synthetic */ ChannelUserRead copy$default(ChannelUserRead channelUserRead, User user, Date date, int i13, Date date2, String str, Date date3, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            user = channelUserRead.user;
        }
        if ((i14 & 2) != 0) {
            date = channelUserRead.lastReceivedEventDate;
        }
        if ((i14 & 4) != 0) {
            i13 = channelUserRead.unreadMessages;
        }
        if ((i14 & 8) != 0) {
            date2 = channelUserRead.lastRead;
        }
        if ((i14 & 16) != 0) {
            str = channelUserRead.lastReadMessageId;
        }
        if ((i14 & 32) != 0) {
            date3 = channelUserRead.lastDeliveredAt;
        }
        if ((i14 & 64) != 0) {
            str2 = channelUserRead.lastDeliveredMessageId;
        }
        Date date4 = date3;
        String str3 = str2;
        String str4 = str;
        int i15 = i13;
        return channelUserRead.copy(user, date, i15, date2, str4, date4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getLastReceivedEventDate() {
        return this.lastReceivedEventDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUnreadMessages() {
        return this.unreadMessages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getLastRead() {
        return this.lastRead;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getLastDeliveredAt() {
        return this.lastDeliveredAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLastDeliveredMessageId() {
        return this.lastDeliveredMessageId;
    }

    public final ChannelUserRead copy(User user, Date lastReceivedEventDate, int unreadMessages, Date lastRead, String lastReadMessageId, Date lastDeliveredAt, String lastDeliveredMessageId) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(lastReceivedEventDate, "lastReceivedEventDate");
        AbstractC22676k.m65750j(lastRead, "lastRead");
        return new ChannelUserRead(user, lastReceivedEventDate, unreadMessages, lastRead, lastReadMessageId, lastDeliveredAt, lastDeliveredMessageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelUserRead)) {
            return false;
        }
        ChannelUserRead channelUserRead = (ChannelUserRead) other;
        return AbstractC22676k.m65745e(this.user, channelUserRead.user) && AbstractC22676k.m65745e(this.lastReceivedEventDate, channelUserRead.lastReceivedEventDate) && this.unreadMessages == channelUserRead.unreadMessages && AbstractC22676k.m65745e(this.lastRead, channelUserRead.lastRead) && AbstractC22676k.m65745e(this.lastReadMessageId, channelUserRead.lastReadMessageId) && AbstractC22676k.m65745e(this.lastDeliveredAt, channelUserRead.lastDeliveredAt) && AbstractC22676k.m65745e(this.lastDeliveredMessageId, channelUserRead.lastDeliveredMessageId);
    }

    public final Date getLastDeliveredAt() {
        return this.lastDeliveredAt;
    }

    public final String getLastDeliveredMessageId() {
        return this.lastDeliveredMessageId;
    }

    public final Date getLastRead() {
        return this.lastRead;
    }

    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    public final Date getLastReceivedEventDate() {
        return this.lastReceivedEventDate;
    }

    public final int getUnreadMessages() {
        return this.unreadMessages;
    }

    @Override // io.getstream.chat.android.models.UserEntity
    public User getUser() {
        return this.user;
    }

    @Override // io.getstream.chat.android.models.UserEntity
    public String getUserId() {
        return super.getUserId();
    }

    public int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.lastRead, AbstractC11266d.m30448b(this.unreadMessages, AbstractC38963t7.m124373c(this.lastReceivedEventDate, this.user.hashCode() * 31, 31), 31), 31);
        String str = this.lastReadMessageId;
        int iHashCode = (iM124373c + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.lastDeliveredAt;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.lastDeliveredMessageId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        User user = this.user;
        Date date = this.lastReceivedEventDate;
        int i13 = this.unreadMessages;
        Date date2 = this.lastRead;
        String str = this.lastReadMessageId;
        Date date3 = this.lastDeliveredAt;
        String str2 = this.lastDeliveredMessageId;
        StringBuilder sb4 = new StringBuilder("ChannelUserRead(user=");
        sb4.append(user);
        sb4.append(", lastReceivedEventDate=");
        sb4.append(date);
        sb4.append(", unreadMessages=");
        sb4.append(i13);
        sb4.append(", lastRead=");
        sb4.append(date2);
        sb4.append(", lastReadMessageId=");
        AbstractC13673n.m38579z(sb4, str, ", lastDeliveredAt=", date3, ", lastDeliveredMessageId=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public /* synthetic */ ChannelUserRead(User user, Date date, int i13, Date date2, String str, Date date3, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, date, i13, date2, str, (i14 & 32) != 0 ? null : date3, (i14 & 64) != 0 ? null : str2);
    }
}
