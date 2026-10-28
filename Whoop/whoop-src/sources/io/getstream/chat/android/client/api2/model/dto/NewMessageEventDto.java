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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0096\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\nHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010 \u001a\u0004\b+\u0010\u001f¨\u0006A"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "cid", "channel_member_count", "", "channel_custom", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelCustomDto;", "channel_type", "channel_id", "message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "watcher_count", "total_unread_count", "unread_channels", "channel_message_count", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelCustomDto;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;IIILjava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCid", "getChannel_member_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChannel_custom", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelCustomDto;", "getChannel_type", "getChannel_id", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getWatcher_count", "()I", "getTotal_unread_count", "getUnread_channels", "getChannel_message_count", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelCustomDto;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;IIILjava/lang/Integer;)Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NewMessageEventDto extends ChatEventDto {
    private final DownstreamChannelCustomDto channel_custom;
    private final String channel_id;
    private final Integer channel_member_count;
    private final Integer channel_message_count;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final DownstreamMessageDto message;
    private final int total_unread_count;
    private final String type;
    private final int unread_channels;
    private final DownstreamUserDto user;
    private final int watcher_count;

    public /* synthetic */ NewMessageEventDto(String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, Integer num, DownstreamChannelCustomDto downstreamChannelCustomDto, String str3, String str4, DownstreamMessageDto downstreamMessageDto, int i13, int i14, int i15, Integer num2, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, exactDate, downstreamUserDto, str2, num, downstreamChannelCustomDto, str3, str4, downstreamMessageDto, (i16 & 512) != 0 ? 0 : i13, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i14, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? 0 : i15, (i16 & 4096) != 0 ? null : num2);
    }

    public static /* synthetic */ NewMessageEventDto copy$default(NewMessageEventDto newMessageEventDto, String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, Integer num, DownstreamChannelCustomDto downstreamChannelCustomDto, String str3, String str4, DownstreamMessageDto downstreamMessageDto, int i13, int i14, int i15, Integer num2, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = newMessageEventDto.type;
        }
        return newMessageEventDto.copy(str, (i16 & 2) != 0 ? newMessageEventDto.created_at : exactDate, (i16 & 4) != 0 ? newMessageEventDto.user : downstreamUserDto, (i16 & 8) != 0 ? newMessageEventDto.cid : str2, (i16 & 16) != 0 ? newMessageEventDto.channel_member_count : num, (i16 & 32) != 0 ? newMessageEventDto.channel_custom : downstreamChannelCustomDto, (i16 & 64) != 0 ? newMessageEventDto.channel_type : str3, (i16 & 128) != 0 ? newMessageEventDto.channel_id : str4, (i16 & 256) != 0 ? newMessageEventDto.message : downstreamMessageDto, (i16 & 512) != 0 ? newMessageEventDto.watcher_count : i13, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? newMessageEventDto.total_unread_count : i14, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? newMessageEventDto.unread_channels : i15, (i16 & 4096) != 0 ? newMessageEventDto.channel_message_count : num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getWatcher_count() {
        return this.watcher_count;
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
    public final Integer getChannel_message_count() {
        return this.channel_message_count;
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
    public final Integer getChannel_member_count() {
        return this.channel_member_count;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DownstreamChannelCustomDto getChannel_custom() {
        return this.channel_custom;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChannel_type() {
        return this.channel_type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    public final NewMessageEventDto copy(String type, ExactDate created_at, DownstreamUserDto user, String cid, Integer channel_member_count, DownstreamChannelCustomDto channel_custom, String channel_type, String channel_id, DownstreamMessageDto message, int watcher_count, int total_unread_count, int unread_channels, Integer channel_message_count) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(message, "message");
        return new NewMessageEventDto(type, created_at, user, cid, channel_member_count, channel_custom, channel_type, channel_id, message, watcher_count, total_unread_count, unread_channels, channel_message_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMessageEventDto)) {
            return false;
        }
        NewMessageEventDto newMessageEventDto = (NewMessageEventDto) other;
        return AbstractC22676k.m65745e(this.type, newMessageEventDto.type) && AbstractC22676k.m65745e(this.created_at, newMessageEventDto.created_at) && AbstractC22676k.m65745e(this.user, newMessageEventDto.user) && AbstractC22676k.m65745e(this.cid, newMessageEventDto.cid) && AbstractC22676k.m65745e(this.channel_member_count, newMessageEventDto.channel_member_count) && AbstractC22676k.m65745e(this.channel_custom, newMessageEventDto.channel_custom) && AbstractC22676k.m65745e(this.channel_type, newMessageEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, newMessageEventDto.channel_id) && AbstractC22676k.m65745e(this.message, newMessageEventDto.message) && this.watcher_count == newMessageEventDto.watcher_count && this.total_unread_count == newMessageEventDto.total_unread_count && this.unread_channels == newMessageEventDto.unread_channels && AbstractC22676k.m65745e(this.channel_message_count, newMessageEventDto.channel_message_count);
    }

    public final DownstreamChannelCustomDto getChannel_custom() {
        return this.channel_custom;
    }

    public final String getChannel_id() {
        return this.channel_id;
    }

    public final Integer getChannel_member_count() {
        return this.channel_member_count;
    }

    public final Integer getChannel_message_count() {
        return this.channel_message_count;
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

    public final DownstreamMessageDto getMessage() {
        return this.message;
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

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public final int getWatcher_count() {
        return this.watcher_count;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC3855a.m11819c(this.user, AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31), 31, this.cid);
        Integer num = this.channel_member_count;
        int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
        DownstreamChannelCustomDto downstreamChannelCustomDto = this.channel_custom;
        int iM30448b = AbstractC11266d.m30448b(this.unread_channels, AbstractC11266d.m30448b(this.total_unread_count, AbstractC11266d.m30448b(this.watcher_count, (this.message.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (downstreamChannelCustomDto == null ? 0 : downstreamChannelCustomDto.hashCode())) * 31, 31, this.channel_type), 31, this.channel_id)) * 31, 31), 31), 31);
        Integer num2 = this.channel_message_count;
        return iM30448b + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str2 = this.cid;
        Integer num = this.channel_member_count;
        DownstreamChannelCustomDto downstreamChannelCustomDto = this.channel_custom;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        DownstreamMessageDto downstreamMessageDto = this.message;
        int i13 = this.watcher_count;
        int i14 = this.total_unread_count;
        int i15 = this.unread_channels;
        Integer num2 = this.channel_message_count;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("NewMessageEventDto(type=", str, ", created_at=", exactDate, ", user=");
        AbstractC11478a.m30865q(sbM30861m, downstreamUserDto, ", cid=", str2, ", channel_member_count=");
        sbM30861m.append(num);
        sbM30861m.append(", channel_custom=");
        sbM30861m.append(downstreamChannelCustomDto);
        sbM30861m.append(", channel_type=");
        AbstractC11266d.m30444B(sbM30861m, str3, ", channel_id=", str4, ", message=");
        sbM30861m.append(downstreamMessageDto);
        sbM30861m.append(", watcher_count=");
        sbM30861m.append(i13);
        sbM30861m.append(", total_unread_count=");
        AbstractC30802r.m94773v(sbM30861m, i14, ", unread_channels=", i15, ", channel_message_count=");
        return AbstractC11478a.m30859k(sbM30861m, num2, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMessageEventDto(String type, ExactDate created_at, DownstreamUserDto user, String cid, Integer num, DownstreamChannelCustomDto downstreamChannelCustomDto, String channel_type, String channel_id, DownstreamMessageDto message, int i13, int i14, int i15, Integer num2) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(message, "message");
        this.type = type;
        this.created_at = created_at;
        this.user = user;
        this.cid = cid;
        this.channel_member_count = num;
        this.channel_custom = downstreamChannelCustomDto;
        this.channel_type = channel_type;
        this.channel_id = channel_id;
        this.message = message;
        this.watcher_count = i13;
        this.total_unread_count = i14;
        this.unread_channels = i15;
        this.channel_message_count = num2;
    }
}
