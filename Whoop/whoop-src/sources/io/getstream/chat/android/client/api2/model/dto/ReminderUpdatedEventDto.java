package io.getstream.chat.android.client.api2.model.dto;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ReminderUpdatedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "message_id", "user_id", "cid", NotificationCompat.CATEGORY_REMINDER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getMessage_id", "getUser_id", "getCid", "getReminder", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReminderUpdatedEventDto extends ChatEventDto {
    private final String cid;
    private final ExactDate created_at;
    private final String message_id;
    private final DownstreamReminderDto reminder;
    private final String type;
    private final String user_id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderUpdatedEventDto(String type, ExactDate created_at, String message_id, String user_id, String cid, DownstreamReminderDto reminder) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(reminder, "reminder");
        this.type = type;
        this.created_at = created_at;
        this.message_id = message_id;
        this.user_id = user_id;
        this.cid = cid;
        this.reminder = reminder;
    }

    public static /* synthetic */ ReminderUpdatedEventDto copy$default(ReminderUpdatedEventDto reminderUpdatedEventDto, String str, ExactDate exactDate, String str2, String str3, String str4, DownstreamReminderDto downstreamReminderDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reminderUpdatedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = reminderUpdatedEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            str2 = reminderUpdatedEventDto.message_id;
        }
        if ((i13 & 8) != 0) {
            str3 = reminderUpdatedEventDto.user_id;
        }
        if ((i13 & 16) != 0) {
            str4 = reminderUpdatedEventDto.cid;
        }
        if ((i13 & 32) != 0) {
            downstreamReminderDto = reminderUpdatedEventDto.reminder;
        }
        String str5 = str4;
        DownstreamReminderDto downstreamReminderDto2 = downstreamReminderDto;
        return reminderUpdatedEventDto.copy(str, exactDate, str2, str3, str5, downstreamReminderDto2);
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
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DownstreamReminderDto getReminder() {
        return this.reminder;
    }

    public final ReminderUpdatedEventDto copy(String type, ExactDate created_at, String message_id, String user_id, String cid, DownstreamReminderDto reminder) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(reminder, "reminder");
        return new ReminderUpdatedEventDto(type, created_at, message_id, user_id, cid, reminder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReminderUpdatedEventDto)) {
            return false;
        }
        ReminderUpdatedEventDto reminderUpdatedEventDto = (ReminderUpdatedEventDto) other;
        return AbstractC22676k.m65745e(this.type, reminderUpdatedEventDto.type) && AbstractC22676k.m65745e(this.created_at, reminderUpdatedEventDto.created_at) && AbstractC22676k.m65745e(this.message_id, reminderUpdatedEventDto.message_id) && AbstractC22676k.m65745e(this.user_id, reminderUpdatedEventDto.user_id) && AbstractC22676k.m65745e(this.cid, reminderUpdatedEventDto.cid) && AbstractC22676k.m65745e(this.reminder, reminderUpdatedEventDto.reminder);
    }

    public final String getCid() {
        return this.cid;
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final DownstreamReminderDto getReminder() {
        return this.reminder;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return this.reminder.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31, this.message_id), 31, this.user_id), 31, this.cid);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        String str2 = this.message_id;
        String str3 = this.user_id;
        String str4 = this.cid;
        DownstreamReminderDto downstreamReminderDto = this.reminder;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("ReminderUpdatedEventDto(type=", str, ", created_at=", exactDate, ", message_id=");
        AbstractC11266d.m30444B(sbM30861m, str2, ", user_id=", str3, ", cid=");
        sbM30861m.append(str4);
        sbM30861m.append(", reminder=");
        sbM30861m.append(downstreamReminderDto);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }
}
