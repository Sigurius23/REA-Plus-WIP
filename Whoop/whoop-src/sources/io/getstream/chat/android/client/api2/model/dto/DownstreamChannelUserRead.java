package io.getstream.chat.android.client.api2.model.dto;

import com.whoop.service.network.model.UserState;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "last_read", "Ljava/util/Date;", "unread_messages", "", "last_read_message_id", "", "last_delivered_at", "last_delivered_message_id", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Date;ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getLast_read", "()Ljava/util/Date;", "getUnread_messages", "()I", "getLast_read_message_id", "()Ljava/lang/String;", "getLast_delivered_at", "getLast_delivered_message_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamChannelUserRead {
    private final Date last_delivered_at;
    private final String last_delivered_message_id;
    private final Date last_read;
    private final String last_read_message_id;
    private final int unread_messages;
    private final DownstreamUserDto user;

    public DownstreamChannelUserRead(DownstreamUserDto user, Date last_read, int i13, String str, Date date, String str2) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(last_read, "last_read");
        this.user = user;
        this.last_read = last_read;
        this.unread_messages = i13;
        this.last_read_message_id = str;
        this.last_delivered_at = date;
        this.last_delivered_message_id = str2;
    }

    public static /* synthetic */ DownstreamChannelUserRead copy$default(DownstreamChannelUserRead downstreamChannelUserRead, DownstreamUserDto downstreamUserDto, Date date, int i13, String str, Date date2, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            downstreamUserDto = downstreamChannelUserRead.user;
        }
        if ((i14 & 2) != 0) {
            date = downstreamChannelUserRead.last_read;
        }
        if ((i14 & 4) != 0) {
            i13 = downstreamChannelUserRead.unread_messages;
        }
        if ((i14 & 8) != 0) {
            str = downstreamChannelUserRead.last_read_message_id;
        }
        if ((i14 & 16) != 0) {
            date2 = downstreamChannelUserRead.last_delivered_at;
        }
        if ((i14 & 32) != 0) {
            str2 = downstreamChannelUserRead.last_delivered_message_id;
        }
        Date date3 = date2;
        String str3 = str2;
        return downstreamChannelUserRead.copy(downstreamUserDto, date, i13, str, date3, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getLast_read() {
        return this.last_read;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUnread_messages() {
        return this.unread_messages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getLast_delivered_at() {
        return this.last_delivered_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLast_delivered_message_id() {
        return this.last_delivered_message_id;
    }

    public final DownstreamChannelUserRead copy(DownstreamUserDto user, Date last_read, int unread_messages, String last_read_message_id, Date last_delivered_at, String last_delivered_message_id) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(last_read, "last_read");
        return new DownstreamChannelUserRead(user, last_read, unread_messages, last_read_message_id, last_delivered_at, last_delivered_message_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamChannelUserRead)) {
            return false;
        }
        DownstreamChannelUserRead downstreamChannelUserRead = (DownstreamChannelUserRead) other;
        return AbstractC22676k.m65745e(this.user, downstreamChannelUserRead.user) && AbstractC22676k.m65745e(this.last_read, downstreamChannelUserRead.last_read) && this.unread_messages == downstreamChannelUserRead.unread_messages && AbstractC22676k.m65745e(this.last_read_message_id, downstreamChannelUserRead.last_read_message_id) && AbstractC22676k.m65745e(this.last_delivered_at, downstreamChannelUserRead.last_delivered_at) && AbstractC22676k.m65745e(this.last_delivered_message_id, downstreamChannelUserRead.last_delivered_message_id);
    }

    public final Date getLast_delivered_at() {
        return this.last_delivered_at;
    }

    public final String getLast_delivered_message_id() {
        return this.last_delivered_message_id;
    }

    public final Date getLast_read() {
        return this.last_read;
    }

    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    public final int getUnread_messages() {
        return this.unread_messages;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.unread_messages, AbstractC38963t7.m124373c(this.last_read, this.user.hashCode() * 31, 31), 31);
        String str = this.last_read_message_id;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.last_delivered_at;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.last_delivered_message_id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        DownstreamUserDto downstreamUserDto = this.user;
        Date date = this.last_read;
        int i13 = this.unread_messages;
        String str = this.last_read_message_id;
        Date date2 = this.last_delivered_at;
        String str2 = this.last_delivered_message_id;
        StringBuilder sb4 = new StringBuilder("DownstreamChannelUserRead(user=");
        sb4.append(downstreamUserDto);
        sb4.append(", last_read=");
        sb4.append(date);
        sb4.append(", unread_messages=");
        AbstractC11895b.m31979B(i13, ", last_read_message_id=", str, ", last_delivered_at=", sb4);
        sb4.append(date2);
        sb4.append(", last_delivered_message_id=");
        sb4.append(str2);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ DownstreamChannelUserRead(DownstreamUserDto downstreamUserDto, Date date, int i13, String str, Date date2, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(downstreamUserDto, date, i13, str, (i14 & 16) != 0 ? null : date2, (i14 & 32) != 0 ? null : str2);
    }
}
