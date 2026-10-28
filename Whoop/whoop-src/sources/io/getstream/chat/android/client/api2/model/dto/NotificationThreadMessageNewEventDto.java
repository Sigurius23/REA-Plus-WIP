package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "cid", "channel_id", "channel_type", "message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "channel", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "unread_threads", "", "unread_thread_messages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)V", "getType", "()Ljava/lang/String;", "getCid", "getChannel_id", "getChannel_type", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUnread_threads", "()I", "getUnread_thread_messages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationThreadMessageNewEventDto extends ChatEventDto {
    private final DownstreamChannelDto channel;
    private final String channel_id;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final DownstreamMessageDto message;
    private final String type;
    private final int unread_thread_messages;
    private final int unread_threads;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationThreadMessageNewEventDto(String type, String cid, String channel_id, String channel_type, DownstreamMessageDto message, DownstreamChannelDto channel, ExactDate created_at, int i13, int i14) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(created_at, "created_at");
        this.type = type;
        this.cid = cid;
        this.channel_id = channel_id;
        this.channel_type = channel_type;
        this.message = message;
        this.channel = channel;
        this.created_at = created_at;
        this.unread_threads = i13;
        this.unread_thread_messages = i14;
    }

    public static /* synthetic */ NotificationThreadMessageNewEventDto copy$default(NotificationThreadMessageNewEventDto notificationThreadMessageNewEventDto, String str, String str2, String str3, String str4, DownstreamMessageDto downstreamMessageDto, DownstreamChannelDto downstreamChannelDto, ExactDate exactDate, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = notificationThreadMessageNewEventDto.type;
        }
        if ((i15 & 2) != 0) {
            str2 = notificationThreadMessageNewEventDto.cid;
        }
        if ((i15 & 4) != 0) {
            str3 = notificationThreadMessageNewEventDto.channel_id;
        }
        if ((i15 & 8) != 0) {
            str4 = notificationThreadMessageNewEventDto.channel_type;
        }
        if ((i15 & 16) != 0) {
            downstreamMessageDto = notificationThreadMessageNewEventDto.message;
        }
        if ((i15 & 32) != 0) {
            downstreamChannelDto = notificationThreadMessageNewEventDto.channel;
        }
        if ((i15 & 64) != 0) {
            exactDate = notificationThreadMessageNewEventDto.created_at;
        }
        if ((i15 & 128) != 0) {
            i13 = notificationThreadMessageNewEventDto.unread_threads;
        }
        if ((i15 & 256) != 0) {
            i14 = notificationThreadMessageNewEventDto.unread_thread_messages;
        }
        int i16 = i13;
        int i17 = i14;
        DownstreamChannelDto downstreamChannelDto2 = downstreamChannelDto;
        ExactDate exactDate2 = exactDate;
        DownstreamMessageDto downstreamMessageDto2 = downstreamMessageDto;
        String str5 = str3;
        return notificationThreadMessageNewEventDto.copy(str, str2, str5, str4, downstreamMessageDto2, downstreamChannelDto2, exactDate2, i16, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannel_type() {
        return this.channel_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getUnread_threads() {
        return this.unread_threads;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUnread_thread_messages() {
        return this.unread_thread_messages;
    }

    public final NotificationThreadMessageNewEventDto copy(String type, String cid, String channel_id, String channel_type, DownstreamMessageDto message, DownstreamChannelDto channel, ExactDate created_at, int unread_threads, int unread_thread_messages) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(created_at, "created_at");
        return new NotificationThreadMessageNewEventDto(type, cid, channel_id, channel_type, message, channel, created_at, unread_threads, unread_thread_messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationThreadMessageNewEventDto)) {
            return false;
        }
        NotificationThreadMessageNewEventDto notificationThreadMessageNewEventDto = (NotificationThreadMessageNewEventDto) other;
        return AbstractC22676k.m65745e(this.type, notificationThreadMessageNewEventDto.type) && AbstractC22676k.m65745e(this.cid, notificationThreadMessageNewEventDto.cid) && AbstractC22676k.m65745e(this.channel_id, notificationThreadMessageNewEventDto.channel_id) && AbstractC22676k.m65745e(this.channel_type, notificationThreadMessageNewEventDto.channel_type) && AbstractC22676k.m65745e(this.message, notificationThreadMessageNewEventDto.message) && AbstractC22676k.m65745e(this.channel, notificationThreadMessageNewEventDto.channel) && AbstractC22676k.m65745e(this.created_at, notificationThreadMessageNewEventDto.created_at) && this.unread_threads == notificationThreadMessageNewEventDto.unread_threads && this.unread_thread_messages == notificationThreadMessageNewEventDto.unread_thread_messages;
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

    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUnread_thread_messages() {
        return this.unread_thread_messages;
    }

    public final int getUnread_threads() {
        return this.unread_threads;
    }

    public int hashCode() {
        return Integer.hashCode(this.unread_thread_messages) + AbstractC11266d.m30448b(this.unread_threads, AbstractC3855a.m11820d(this.created_at, (this.channel.hashCode() + ((this.message.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.cid), 31, this.channel_id), 31, this.channel_type)) * 31)) * 31, 31), 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.cid;
        String str3 = this.channel_id;
        String str4 = this.channel_type;
        DownstreamMessageDto downstreamMessageDto = this.message;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        ExactDate exactDate = this.created_at;
        int i13 = this.unread_threads;
        int i14 = this.unread_thread_messages;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NotificationThreadMessageNewEventDto(type=", str, ", cid=", str2, ", channel_id=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", channel_type=", str4, ", message=");
        sbM32001t.append(downstreamMessageDto);
        sbM32001t.append(", channel=");
        sbM32001t.append(downstreamChannelDto);
        sbM32001t.append(", created_at=");
        sbM32001t.append(exactDate);
        sbM32001t.append(", unread_threads=");
        sbM32001t.append(i13);
        sbM32001t.append(", unread_thread_messages=");
        return AbstractC18489d0.m53371l(sbM32001t, i14, ")");
    }
}
