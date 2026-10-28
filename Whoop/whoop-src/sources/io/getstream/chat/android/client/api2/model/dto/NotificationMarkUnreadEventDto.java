package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u000fHÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "cid", "channel_type", "channel_id", "first_unread_message_id", "last_read_message_id", "last_read_at", "unread_messages", "", "total_unread_count", "unread_channels", "thread_id", "unread_threads", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/String;I)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCid", "getChannel_type", "getChannel_id", "getFirst_unread_message_id", "getLast_read_message_id", "getLast_read_at", "getUnread_messages", "()I", "getTotal_unread_count", "getUnread_channels", "getThread_id", "getUnread_threads", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationMarkUnreadEventDto extends ChatEventDto {
    private final String channel_id;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final String first_unread_message_id;
    private final ExactDate last_read_at;
    private final String last_read_message_id;
    private final String thread_id;
    private final int total_unread_count;
    private final String type;
    private final int unread_channels;
    private final int unread_messages;
    private final int unread_threads;
    private final DownstreamUserDto user;

    public /* synthetic */ NotificationMarkUnreadEventDto(String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3, String str4, String str5, String str6, ExactDate exactDate2, int i13, int i14, int i15, String str7, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, exactDate, downstreamUserDto, str2, str3, str4, str5, str6, exactDate2, i13, i14, i15, (i17 & 4096) != 0 ? null : str7, (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 0 : i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getUnread_messages() {
        return this.unread_messages;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getUnread_channels() {
        return this.unread_channels;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getThread_id() {
        return this.thread_id;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getUnread_threads() {
        return this.unread_threads;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannel_type() {
        return this.channel_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFirst_unread_message_id() {
        return this.first_unread_message_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ExactDate getLast_read_at() {
        return this.last_read_at;
    }

    public final NotificationMarkUnreadEventDto copy(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, String first_unread_message_id, String last_read_message_id, ExactDate last_read_at, int unread_messages, int total_unread_count, int unread_channels, String thread_id, int unread_threads) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(first_unread_message_id, "first_unread_message_id");
        AbstractC22676k.m65750j(last_read_at, "last_read_at");
        return new NotificationMarkUnreadEventDto(type, created_at, user, cid, channel_type, channel_id, first_unread_message_id, last_read_message_id, last_read_at, unread_messages, total_unread_count, unread_channels, thread_id, unread_threads);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationMarkUnreadEventDto)) {
            return false;
        }
        NotificationMarkUnreadEventDto notificationMarkUnreadEventDto = (NotificationMarkUnreadEventDto) other;
        return AbstractC22676k.m65745e(this.type, notificationMarkUnreadEventDto.type) && AbstractC22676k.m65745e(this.created_at, notificationMarkUnreadEventDto.created_at) && AbstractC22676k.m65745e(this.user, notificationMarkUnreadEventDto.user) && AbstractC22676k.m65745e(this.cid, notificationMarkUnreadEventDto.cid) && AbstractC22676k.m65745e(this.channel_type, notificationMarkUnreadEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, notificationMarkUnreadEventDto.channel_id) && AbstractC22676k.m65745e(this.first_unread_message_id, notificationMarkUnreadEventDto.first_unread_message_id) && AbstractC22676k.m65745e(this.last_read_message_id, notificationMarkUnreadEventDto.last_read_message_id) && AbstractC22676k.m65745e(this.last_read_at, notificationMarkUnreadEventDto.last_read_at) && this.unread_messages == notificationMarkUnreadEventDto.unread_messages && this.total_unread_count == notificationMarkUnreadEventDto.total_unread_count && this.unread_channels == notificationMarkUnreadEventDto.unread_channels && AbstractC22676k.m65745e(this.thread_id, notificationMarkUnreadEventDto.thread_id) && this.unread_threads == notificationMarkUnreadEventDto.unread_threads;
    }

    public final String getChannel_id() {
        return this.channel_id;
    }

    public final String getChannel_type() {
        return this.channel_type;
    }

    public final String getCid() {
        return this.cid;
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final String getFirst_unread_message_id() {
        return this.first_unread_message_id;
    }

    public final ExactDate getLast_read_at() {
        return this.last_read_at;
    }

    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUnread_channels() {
        return this.unread_channels;
    }

    public final int getUnread_messages() {
        return this.unread_messages;
    }

    public final int getUnread_threads() {
        return this.unread_threads;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11819c(this.user, AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31), 31, this.cid), 31, this.channel_type), 31, this.channel_id), 31, this.first_unread_message_id);
        String str = this.last_read_message_id;
        int iM30448b = AbstractC11266d.m30448b(this.unread_channels, AbstractC11266d.m30448b(this.total_unread_count, AbstractC11266d.m30448b(this.unread_messages, AbstractC3855a.m11820d(this.last_read_at, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        String str2 = this.thread_id;
        return Integer.hashCode(this.unread_threads) + ((iM30448b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str2 = this.cid;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        String str5 = this.first_unread_message_id;
        String str6 = this.last_read_message_id;
        ExactDate exactDate2 = this.last_read_at;
        int i13 = this.unread_messages;
        int i14 = this.total_unread_count;
        int i15 = this.unread_channels;
        String str7 = this.thread_id;
        int i16 = this.unread_threads;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("NotificationMarkUnreadEventDto(type=", str, ", created_at=", exactDate, ", user=");
        AbstractC11478a.m30865q(sbM30861m, downstreamUserDto, ", cid=", str2, ", channel_type=");
        AbstractC11266d.m30444B(sbM30861m, str3, ", channel_id=", str4, ", first_unread_message_id=");
        AbstractC11266d.m30444B(sbM30861m, str5, ", last_read_message_id=", str6, ", last_read_at=");
        sbM30861m.append(exactDate2);
        sbM30861m.append(", unread_messages=");
        sbM30861m.append(i13);
        sbM30861m.append(", total_unread_count=");
        AbstractC30802r.m94773v(sbM30861m, i14, ", unread_channels=", i15, ", thread_id=");
        sbM30861m.append(str7);
        sbM30861m.append(", unread_threads=");
        sbM30861m.append(i16);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMarkUnreadEventDto(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, String first_unread_message_id, String str, ExactDate last_read_at, int i13, int i14, int i15, String str2, int i16) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(first_unread_message_id, "first_unread_message_id");
        AbstractC22676k.m65750j(last_read_at, "last_read_at");
        this.type = type;
        this.created_at = created_at;
        this.user = user;
        this.cid = cid;
        this.channel_type = channel_type;
        this.channel_id = channel_id;
        this.first_unread_message_id = first_unread_message_id;
        this.last_read_message_id = str;
        this.last_read_at = last_read_at;
        this.unread_messages = i13;
        this.total_unread_count = i14;
        this.unread_channels = i15;
        this.thread_id = str2;
        this.unread_threads = i16;
    }
}
