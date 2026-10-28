package io.getstream.chat.android.client.api2.model.dto;

import com.whoop.service.network.model.UserState;
import ih0.AbstractC18489d0;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamChannelUserRead;", "", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "last_read", "Ljava/util/Date;", "unread_messages", "", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/util/Date;I)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "getLast_read", "()Ljava/util/Date;", "getUnread_messages", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpstreamChannelUserRead {
    private final Date last_read;
    private final int unread_messages;
    private final UpstreamUserDto user;

    public UpstreamChannelUserRead(UpstreamUserDto user, Date last_read, int i13) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(last_read, "last_read");
        this.user = user;
        this.last_read = last_read;
        this.unread_messages = i13;
    }

    public static /* synthetic */ UpstreamChannelUserRead copy$default(UpstreamChannelUserRead upstreamChannelUserRead, UpstreamUserDto upstreamUserDto, Date date, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            upstreamUserDto = upstreamChannelUserRead.user;
        }
        if ((i14 & 2) != 0) {
            date = upstreamChannelUserRead.last_read;
        }
        if ((i14 & 4) != 0) {
            i13 = upstreamChannelUserRead.unread_messages;
        }
        return upstreamChannelUserRead.copy(upstreamUserDto, date, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UpstreamUserDto getUser() {
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

    public final UpstreamChannelUserRead copy(UpstreamUserDto user, Date last_read, int unread_messages) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(last_read, "last_read");
        return new UpstreamChannelUserRead(user, last_read, unread_messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamChannelUserRead)) {
            return false;
        }
        UpstreamChannelUserRead upstreamChannelUserRead = (UpstreamChannelUserRead) other;
        return AbstractC22676k.m65745e(this.user, upstreamChannelUserRead.user) && AbstractC22676k.m65745e(this.last_read, upstreamChannelUserRead.last_read) && this.unread_messages == upstreamChannelUserRead.unread_messages;
    }

    public final Date getLast_read() {
        return this.last_read;
    }

    public final int getUnread_messages() {
        return this.unread_messages;
    }

    public final UpstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        return Integer.hashCode(this.unread_messages) + AbstractC38963t7.m124373c(this.last_read, this.user.hashCode() * 31, 31);
    }

    public String toString() {
        UpstreamUserDto upstreamUserDto = this.user;
        Date date = this.last_read;
        int i13 = this.unread_messages;
        StringBuilder sb4 = new StringBuilder("UpstreamChannelUserRead(user=");
        sb4.append(upstreamUserDto);
        sb4.append(", last_read=");
        sb4.append(date);
        sb4.append(", unread_messages=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }
}
