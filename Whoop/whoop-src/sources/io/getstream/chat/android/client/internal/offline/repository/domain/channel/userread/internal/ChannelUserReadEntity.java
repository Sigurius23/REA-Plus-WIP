package io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal;

import c13.AbstractC3855a;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;", "", "userId", "", "lastReceivedEventDate", "Ljava/util/Date;", "unreadMessages", "", "lastRead", "lastReadMessageId", "lastDeliveredAt", "lastDeliveredMessageId", "<init>", "(Ljava/lang/String;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getLastReceivedEventDate", "()Ljava/util/Date;", "getUnreadMessages", "()I", "getLastRead", "getLastReadMessageId", "getLastDeliveredAt", "getLastDeliveredMessageId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelUserReadEntity {
    private final Date lastDeliveredAt;
    private final String lastDeliveredMessageId;
    private final Date lastRead;
    private final String lastReadMessageId;
    private final Date lastReceivedEventDate;
    private final int unreadMessages;
    private final String userId;

    public ChannelUserReadEntity(String userId, Date lastReceivedEventDate, int i13, Date lastRead, String str, Date date, String str2) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(lastReceivedEventDate, "lastReceivedEventDate");
        AbstractC22676k.m65750j(lastRead, "lastRead");
        this.userId = userId;
        this.lastReceivedEventDate = lastReceivedEventDate;
        this.unreadMessages = i13;
        this.lastRead = lastRead;
        this.lastReadMessageId = str;
        this.lastDeliveredAt = date;
        this.lastDeliveredMessageId = str2;
    }

    public static /* synthetic */ ChannelUserReadEntity copy$default(ChannelUserReadEntity channelUserReadEntity, String str, Date date, int i13, Date date2, String str2, Date date3, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = channelUserReadEntity.userId;
        }
        if ((i14 & 2) != 0) {
            date = channelUserReadEntity.lastReceivedEventDate;
        }
        if ((i14 & 4) != 0) {
            i13 = channelUserReadEntity.unreadMessages;
        }
        if ((i14 & 8) != 0) {
            date2 = channelUserReadEntity.lastRead;
        }
        if ((i14 & 16) != 0) {
            str2 = channelUserReadEntity.lastReadMessageId;
        }
        if ((i14 & 32) != 0) {
            date3 = channelUserReadEntity.lastDeliveredAt;
        }
        if ((i14 & 64) != 0) {
            str3 = channelUserReadEntity.lastDeliveredMessageId;
        }
        Date date4 = date3;
        String str4 = str3;
        String str5 = str2;
        int i15 = i13;
        return channelUserReadEntity.copy(str, date, i15, date2, str5, date4, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
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

    public final ChannelUserReadEntity copy(String userId, Date lastReceivedEventDate, int unreadMessages, Date lastRead, String lastReadMessageId, Date lastDeliveredAt, String lastDeliveredMessageId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(lastReceivedEventDate, "lastReceivedEventDate");
        AbstractC22676k.m65750j(lastRead, "lastRead");
        return new ChannelUserReadEntity(userId, lastReceivedEventDate, unreadMessages, lastRead, lastReadMessageId, lastDeliveredAt, lastDeliveredMessageId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelUserReadEntity)) {
            return false;
        }
        ChannelUserReadEntity channelUserReadEntity = (ChannelUserReadEntity) other;
        return AbstractC22676k.m65745e(this.userId, channelUserReadEntity.userId) && AbstractC22676k.m65745e(this.lastReceivedEventDate, channelUserReadEntity.lastReceivedEventDate) && this.unreadMessages == channelUserReadEntity.unreadMessages && AbstractC22676k.m65745e(this.lastRead, channelUserReadEntity.lastRead) && AbstractC22676k.m65745e(this.lastReadMessageId, channelUserReadEntity.lastReadMessageId) && AbstractC22676k.m65745e(this.lastDeliveredAt, channelUserReadEntity.lastDeliveredAt) && AbstractC22676k.m65745e(this.lastDeliveredMessageId, channelUserReadEntity.lastDeliveredMessageId);
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

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.lastRead, AbstractC11266d.m30448b(this.unreadMessages, AbstractC38963t7.m124373c(this.lastReceivedEventDate, this.userId.hashCode() * 31, 31), 31), 31);
        String str = this.lastReadMessageId;
        int iHashCode = (iM124373c + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.lastDeliveredAt;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.lastDeliveredMessageId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.userId;
        Date date = this.lastReceivedEventDate;
        int i13 = this.unreadMessages;
        Date date2 = this.lastRead;
        String str2 = this.lastReadMessageId;
        Date date3 = this.lastDeliveredAt;
        String str3 = this.lastDeliveredMessageId;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ChannelUserReadEntity(userId=", str, ", lastReceivedEventDate=", date, ", unreadMessages=");
        sbM11830n.append(i13);
        sbM11830n.append(", lastRead=");
        sbM11830n.append(date2);
        sbM11830n.append(", lastReadMessageId=");
        AbstractC13673n.m38579z(sbM11830n, str2, ", lastDeliveredAt=", date3, ", lastDeliveredMessageId=");
        return AbstractC25012a.m73376i(str3, ")", sbM11830n);
    }
}
