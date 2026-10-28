package io.getstream.chat.android.client.api2.model.dto;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelDto;", "", "channel_id", "", "unread_count", "", "last_read", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;ILjava/util/Date;)V", "getChannel_id", "()Ljava/lang/String;", "getUnread_count", "()I", "getLast_read", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadChannelDto {
    private final String channel_id;
    private final Date last_read;
    private final int unread_count;

    public UnreadChannelDto(String channel_id, int i13, Date last_read) {
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(last_read, "last_read");
        this.channel_id = channel_id;
        this.unread_count = i13;
        this.last_read = last_read;
    }

    public static /* synthetic */ UnreadChannelDto copy$default(UnreadChannelDto unreadChannelDto, String str, int i13, Date date, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = unreadChannelDto.channel_id;
        }
        if ((i14 & 2) != 0) {
            i13 = unreadChannelDto.unread_count;
        }
        if ((i14 & 4) != 0) {
            date = unreadChannelDto.last_read;
        }
        return unreadChannelDto.copy(str, i13, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnread_count() {
        return this.unread_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getLast_read() {
        return this.last_read;
    }

    public final UnreadChannelDto copy(String channel_id, int unread_count, Date last_read) {
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(last_read, "last_read");
        return new UnreadChannelDto(channel_id, unread_count, last_read);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadChannelDto)) {
            return false;
        }
        UnreadChannelDto unreadChannelDto = (UnreadChannelDto) other;
        return AbstractC22676k.m65745e(this.channel_id, unreadChannelDto.channel_id) && this.unread_count == unreadChannelDto.unread_count && AbstractC22676k.m65745e(this.last_read, unreadChannelDto.last_read);
    }

    public final String getChannel_id() {
        return this.channel_id;
    }

    public final Date getLast_read() {
        return this.last_read;
    }

    public final int getUnread_count() {
        return this.unread_count;
    }

    public int hashCode() {
        return this.last_read.hashCode() + AbstractC11266d.m30448b(this.unread_count, this.channel_id.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.channel_id;
        int i13 = this.unread_count;
        return AbstractC13673n.m38564k(AbstractC11266d.m30467u(i13, "UnreadChannelDto(channel_id=", str, ", unread_count=", ", last_read="), this.last_read, ")");
    }
}
