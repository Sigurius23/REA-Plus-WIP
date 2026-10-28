package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009a\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\fHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017¨\u0006?"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkReadEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "cid", "channel_type", "channel_id", "total_unread_count", "", "unread_channels", "thread_id", "thread", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "unread_threads", "unread_thread_messages", "last_read_message_id", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCid", "getChannel_type", "getChannel_id", "getTotal_unread_count", "()I", "getUnread_channels", "getThread_id", "getThread", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "getUnread_threads", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnread_thread_messages", "getLast_read_message_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkReadEventDto;", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationMarkReadEventDto extends ChatEventDto {
    private final String channel_id;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final String last_read_message_id;
    private final DownstreamThreadInfoDto thread;
    private final String thread_id;
    private final int total_unread_count;
    private final String type;
    private final int unread_channels;
    private final Integer unread_thread_messages;
    private final Integer unread_threads;
    private final DownstreamUserDto user;

    public /* synthetic */ NotificationMarkReadEventDto(String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3, String str4, int i13, int i14, String str5, DownstreamThreadInfoDto downstreamThreadInfoDto, Integer num, Integer num2, String str6, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, exactDate, downstreamUserDto, str2, str3, str4, (i15 & 64) != 0 ? 0 : i13, (i15 & 128) != 0 ? 0 : i14, (i15 & 256) != 0 ? null : str5, (i15 & 512) != 0 ? null : downstreamThreadInfoDto, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : num, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : num2, str6);
    }

    public static /* synthetic */ NotificationMarkReadEventDto copy$default(NotificationMarkReadEventDto notificationMarkReadEventDto, String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3, String str4, int i13, int i14, String str5, DownstreamThreadInfoDto downstreamThreadInfoDto, Integer num, Integer num2, String str6, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = notificationMarkReadEventDto.type;
        }
        return notificationMarkReadEventDto.copy(str, (i15 & 2) != 0 ? notificationMarkReadEventDto.created_at : exactDate, (i15 & 4) != 0 ? notificationMarkReadEventDto.user : downstreamUserDto, (i15 & 8) != 0 ? notificationMarkReadEventDto.cid : str2, (i15 & 16) != 0 ? notificationMarkReadEventDto.channel_type : str3, (i15 & 32) != 0 ? notificationMarkReadEventDto.channel_id : str4, (i15 & 64) != 0 ? notificationMarkReadEventDto.total_unread_count : i13, (i15 & 128) != 0 ? notificationMarkReadEventDto.unread_channels : i14, (i15 & 256) != 0 ? notificationMarkReadEventDto.thread_id : str5, (i15 & 512) != 0 ? notificationMarkReadEventDto.thread : downstreamThreadInfoDto, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? notificationMarkReadEventDto.unread_threads : num, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? notificationMarkReadEventDto.unread_thread_messages : num2, (i15 & 4096) != 0 ? notificationMarkReadEventDto.last_read_message_id : str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final DownstreamThreadInfoDto getThread() {
        return this.thread;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getUnread_threads() {
        return this.unread_threads;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getUnread_thread_messages() {
        return this.unread_thread_messages;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLast_read_message_id() {
        return this.last_read_message_id;
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
    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getUnread_channels() {
        return this.unread_channels;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getThread_id() {
        return this.thread_id;
    }

    public final NotificationMarkReadEventDto copy(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, int total_unread_count, int unread_channels, String thread_id, DownstreamThreadInfoDto thread, Integer unread_threads, Integer unread_thread_messages, String last_read_message_id) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        return new NotificationMarkReadEventDto(type, created_at, user, cid, channel_type, channel_id, total_unread_count, unread_channels, thread_id, thread, unread_threads, unread_thread_messages, last_read_message_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationMarkReadEventDto)) {
            return false;
        }
        NotificationMarkReadEventDto notificationMarkReadEventDto = (NotificationMarkReadEventDto) other;
        return AbstractC22676k.m65745e(this.type, notificationMarkReadEventDto.type) && AbstractC22676k.m65745e(this.created_at, notificationMarkReadEventDto.created_at) && AbstractC22676k.m65745e(this.user, notificationMarkReadEventDto.user) && AbstractC22676k.m65745e(this.cid, notificationMarkReadEventDto.cid) && AbstractC22676k.m65745e(this.channel_type, notificationMarkReadEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, notificationMarkReadEventDto.channel_id) && this.total_unread_count == notificationMarkReadEventDto.total_unread_count && this.unread_channels == notificationMarkReadEventDto.unread_channels && AbstractC22676k.m65745e(this.thread_id, notificationMarkReadEventDto.thread_id) && AbstractC22676k.m65745e(this.thread, notificationMarkReadEventDto.thread) && AbstractC22676k.m65745e(this.unread_threads, notificationMarkReadEventDto.unread_threads) && AbstractC22676k.m65745e(this.unread_thread_messages, notificationMarkReadEventDto.unread_thread_messages) && AbstractC22676k.m65745e(this.last_read_message_id, notificationMarkReadEventDto.last_read_message_id);
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

    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    public final DownstreamThreadInfoDto getThread() {
        return this.thread;
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

    public final Integer getUnread_thread_messages() {
        return this.unread_thread_messages;
    }

    public final Integer getUnread_threads() {
        return this.unread_threads;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.unread_channels, AbstractC11266d.m30448b(this.total_unread_count, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11819c(this.user, AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31), 31, this.cid), 31, this.channel_type), 31, this.channel_id), 31), 31);
        String str = this.thread_id;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        DownstreamThreadInfoDto downstreamThreadInfoDto = this.thread;
        int iHashCode2 = (iHashCode + (downstreamThreadInfoDto == null ? 0 : downstreamThreadInfoDto.hashCode())) * 31;
        Integer num = this.unread_threads;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unread_thread_messages;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.last_read_message_id;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str2 = this.cid;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        int i13 = this.total_unread_count;
        int i14 = this.unread_channels;
        String str5 = this.thread_id;
        DownstreamThreadInfoDto downstreamThreadInfoDto = this.thread;
        Integer num = this.unread_threads;
        Integer num2 = this.unread_thread_messages;
        String str6 = this.last_read_message_id;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("NotificationMarkReadEventDto(type=", str, ", created_at=", exactDate, ", user=");
        AbstractC11478a.m30865q(sbM30861m, downstreamUserDto, ", cid=", str2, ", channel_type=");
        AbstractC11266d.m30444B(sbM30861m, str3, ", channel_id=", str4, ", total_unread_count=");
        AbstractC30802r.m94773v(sbM30861m, i13, ", unread_channels=", i14, ", thread_id=");
        sbM30861m.append(str5);
        sbM30861m.append(", thread=");
        sbM30861m.append(downstreamThreadInfoDto);
        sbM30861m.append(", unread_threads=");
        AbstractC31061c.m95621A(sbM30861m, num, ", unread_thread_messages=", num2, ", last_read_message_id=");
        return AbstractC25012a.m73376i(str6, ")", sbM30861m);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMarkReadEventDto(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, int i13, int i14, String str, DownstreamThreadInfoDto downstreamThreadInfoDto, Integer num, Integer num2, String str2) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        this.type = type;
        this.created_at = created_at;
        this.user = user;
        this.cid = cid;
        this.channel_type = channel_type;
        this.channel_id = channel_id;
        this.total_unread_count = i13;
        this.unread_channels = i14;
        this.thread_id = str;
        this.thread = downstreamThreadInfoDto;
        this.unread_threads = num;
        this.unread_thread_messages = num2;
        this.last_read_message_id = str2;
    }
}
