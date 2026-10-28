package io.getstream.chat.android.client.api2.model.dto;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UnreadThreadDto;", "", "parent_message_id", "", "unread_count", "", "last_read", "Ljava/util/Date;", "last_read_message_id", "<init>", "(Ljava/lang/String;ILjava/util/Date;Ljava/lang/String;)V", "getParent_message_id", "()Ljava/lang/String;", "getUnread_count", "()I", "getLast_read", "()Ljava/util/Date;", "getLast_read_message_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadThreadDto {
    private final Date last_read;
    private final String last_read_message_id;
    private final String parent_message_id;
    private final int unread_count;

    public UnreadThreadDto(String parent_message_id, int i13, Date last_read, String last_read_message_id) {
        AbstractC22676k.m65750j(parent_message_id, "parent_message_id");
        AbstractC22676k.m65750j(last_read, "last_read");
        AbstractC22676k.m65750j(last_read_message_id, "last_read_message_id");
        this.parent_message_id = parent_message_id;
        this.unread_count = i13;
        this.last_read = last_read;
        this.last_read_message_id = last_read_message_id;
    }

    public static /* synthetic */ UnreadThreadDto copy$default(UnreadThreadDto unreadThreadDto, String str, int i13, Date date, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = unreadThreadDto.parent_message_id;
        }
        if ((i14 & 2) != 0) {
            i13 = unreadThreadDto.unread_count;
        }
        if ((i14 & 4) != 0) {
            date = unreadThreadDto.last_read;
        }
        if ((i14 & 8) != 0) {
            str2 = unreadThreadDto.last_read_message_id;
        }
        return unreadThreadDto.copy(str, i13, date, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnread_count() {
        return this.unread_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getLast_read() {
        return this.last_read;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    public final UnreadThreadDto copy(String parent_message_id, int unread_count, Date last_read, String last_read_message_id) {
        AbstractC22676k.m65750j(parent_message_id, "parent_message_id");
        AbstractC22676k.m65750j(last_read, "last_read");
        AbstractC22676k.m65750j(last_read_message_id, "last_read_message_id");
        return new UnreadThreadDto(parent_message_id, unread_count, last_read, last_read_message_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadThreadDto)) {
            return false;
        }
        UnreadThreadDto unreadThreadDto = (UnreadThreadDto) other;
        return AbstractC22676k.m65745e(this.parent_message_id, unreadThreadDto.parent_message_id) && this.unread_count == unreadThreadDto.unread_count && AbstractC22676k.m65745e(this.last_read, unreadThreadDto.last_read) && AbstractC22676k.m65745e(this.last_read_message_id, unreadThreadDto.last_read_message_id);
    }

    public final Date getLast_read() {
        return this.last_read;
    }

    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    public final int getUnread_count() {
        return this.unread_count;
    }

    public int hashCode() {
        return this.last_read_message_id.hashCode() + AbstractC38963t7.m124373c(this.last_read, AbstractC11266d.m30448b(this.unread_count, this.parent_message_id.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.parent_message_id;
        int i13 = this.unread_count;
        Date date = this.last_read;
        String str2 = this.last_read_message_id;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "UnreadThreadDto(parent_message_id=", str, ", unread_count=", ", last_read=");
        sbM30467u.append(date);
        sbM30467u.append(", last_read_message_id=");
        sbM30467u.append(str2);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }
}
