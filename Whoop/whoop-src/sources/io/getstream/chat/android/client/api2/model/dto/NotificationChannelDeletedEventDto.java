package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\fHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelDeletedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "cid", "channel_type", "channel_id", "channel", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "total_unread_count", "", "unread_channels", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;II)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getCid", "getChannel_type", "getChannel_id", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getTotal_unread_count", "()I", "getUnread_channels", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationChannelDeletedEventDto extends ChatEventDto {
    private final DownstreamChannelDto channel;
    private final String channel_id;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final int total_unread_count;
    private final String type;
    private final int unread_channels;

    public /* synthetic */ NotificationChannelDeletedEventDto(String str, ExactDate exactDate, String str2, String str3, String str4, DownstreamChannelDto downstreamChannelDto, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, exactDate, str2, str3, str4, downstreamChannelDto, (i15 & 64) != 0 ? 0 : i13, (i15 & 128) != 0 ? 0 : i14);
    }

    public static /* synthetic */ NotificationChannelDeletedEventDto copy$default(NotificationChannelDeletedEventDto notificationChannelDeletedEventDto, String str, ExactDate exactDate, String str2, String str3, String str4, DownstreamChannelDto downstreamChannelDto, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = notificationChannelDeletedEventDto.type;
        }
        if ((i15 & 2) != 0) {
            exactDate = notificationChannelDeletedEventDto.created_at;
        }
        if ((i15 & 4) != 0) {
            str2 = notificationChannelDeletedEventDto.cid;
        }
        if ((i15 & 8) != 0) {
            str3 = notificationChannelDeletedEventDto.channel_type;
        }
        if ((i15 & 16) != 0) {
            str4 = notificationChannelDeletedEventDto.channel_id;
        }
        if ((i15 & 32) != 0) {
            downstreamChannelDto = notificationChannelDeletedEventDto.channel;
        }
        if ((i15 & 64) != 0) {
            i13 = notificationChannelDeletedEventDto.total_unread_count;
        }
        if ((i15 & 128) != 0) {
            i14 = notificationChannelDeletedEventDto.unread_channels;
        }
        int i16 = i13;
        int i17 = i14;
        String str5 = str4;
        DownstreamChannelDto downstreamChannelDto2 = downstreamChannelDto;
        return notificationChannelDeletedEventDto.copy(str, exactDate, str2, str3, str5, downstreamChannelDto2, i16, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannel_type() {
        return this.channel_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getUnread_channels() {
        return this.unread_channels;
    }

    public final NotificationChannelDeletedEventDto copy(String type, ExactDate created_at, String cid, String channel_type, String channel_id, DownstreamChannelDto channel, int total_unread_count, int unread_channels) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(channel, "channel");
        return new NotificationChannelDeletedEventDto(type, created_at, cid, channel_type, channel_id, channel, total_unread_count, unread_channels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationChannelDeletedEventDto)) {
            return false;
        }
        NotificationChannelDeletedEventDto notificationChannelDeletedEventDto = (NotificationChannelDeletedEventDto) other;
        return AbstractC22676k.m65745e(this.type, notificationChannelDeletedEventDto.type) && AbstractC22676k.m65745e(this.created_at, notificationChannelDeletedEventDto.created_at) && AbstractC22676k.m65745e(this.cid, notificationChannelDeletedEventDto.cid) && AbstractC22676k.m65745e(this.channel_type, notificationChannelDeletedEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, notificationChannelDeletedEventDto.channel_id) && AbstractC22676k.m65745e(this.channel, notificationChannelDeletedEventDto.channel) && this.total_unread_count == notificationChannelDeletedEventDto.total_unread_count && this.unread_channels == notificationChannelDeletedEventDto.unread_channels;
    }

    public final DownstreamChannelDto getChannel() {
        return this.channel;
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

    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUnread_channels() {
        return this.unread_channels;
    }

    public int hashCode() {
        return Integer.hashCode(this.unread_channels) + AbstractC11266d.m30448b(this.total_unread_count, (this.channel.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31, this.cid), 31, this.channel_type), 31, this.channel_id)) * 31, 31);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        String str2 = this.cid;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        int i13 = this.total_unread_count;
        int i14 = this.unread_channels;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("NotificationChannelDeletedEventDto(type=", str, ", created_at=", exactDate, ", cid=");
        AbstractC11266d.m30444B(sbM30861m, str2, ", channel_type=", str3, ", channel_id=");
        sbM30861m.append(str4);
        sbM30861m.append(", channel=");
        sbM30861m.append(downstreamChannelDto);
        sbM30861m.append(", total_unread_count=");
        return AbstractC26725a.m79505i(sbM30861m, i13, ", unread_channels=", i14, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationChannelDeletedEventDto(String type, ExactDate created_at, String cid, String channel_type, String channel_id, DownstreamChannelDto channel, int i13, int i14) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(channel, "channel");
        this.type = type;
        this.created_at = created_at;
        this.cid = cid;
        this.channel_type = channel_type;
        this.channel_id = channel_id;
        this.channel = channel;
        this.total_unread_count = i13;
        this.unread_channels = i14;
    }
}
