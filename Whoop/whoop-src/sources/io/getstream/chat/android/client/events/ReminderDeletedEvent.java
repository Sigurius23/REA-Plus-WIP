package io.getstream.chat.android.client.events;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import io.getstream.chat.android.models.MessageReminder;
import java.util.Date;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/events/ReminderDeletedEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/HasReminder;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "channelType", "channelId", NotificationCompat.CATEGORY_REMINDER, "Lio/getstream/chat/android/models/MessageReminder;", "messageId", "userId", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getChannelType", "getChannelId", "getReminder", "()Lio/getstream/chat/android/models/MessageReminder;", "getMessageId", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReminderDeletedEvent extends CidEvent implements HasReminder {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String messageId;
    private final String rawCreatedAt;
    private final MessageReminder reminder;
    private final String type;
    private final String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderDeletedEvent(String type, Date createdAt, String str, String cid, String channelType, String channelId, MessageReminder reminder, String messageId, String userId) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(reminder, "reminder");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(userId, "userId");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = str;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.reminder = reminder;
        this.messageId = messageId;
        this.userId = userId;
    }

    public static /* synthetic */ ReminderDeletedEvent copy$default(ReminderDeletedEvent reminderDeletedEvent, String str, Date date, String str2, String str3, String str4, String str5, MessageReminder messageReminder, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reminderDeletedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = reminderDeletedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = reminderDeletedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            str3 = reminderDeletedEvent.cid;
        }
        if ((i13 & 16) != 0) {
            str4 = reminderDeletedEvent.channelType;
        }
        if ((i13 & 32) != 0) {
            str5 = reminderDeletedEvent.channelId;
        }
        if ((i13 & 64) != 0) {
            messageReminder = reminderDeletedEvent.reminder;
        }
        if ((i13 & 128) != 0) {
            str6 = reminderDeletedEvent.messageId;
        }
        if ((i13 & 256) != 0) {
            str7 = reminderDeletedEvent.userId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        MessageReminder messageReminder2 = messageReminder;
        String str11 = str4;
        String str12 = str2;
        return reminderDeletedEvent.copy(str, date, str12, str3, str11, str10, messageReminder2, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessageReminder getReminder() {
        return this.reminder;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final ReminderDeletedEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, MessageReminder reminder, String messageId, String userId) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(reminder, "reminder");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(userId, "userId");
        return new ReminderDeletedEvent(type, createdAt, rawCreatedAt, cid, channelType, channelId, reminder, messageId, userId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReminderDeletedEvent)) {
            return false;
        }
        ReminderDeletedEvent reminderDeletedEvent = (ReminderDeletedEvent) other;
        return AbstractC22676k.m65745e(this.type, reminderDeletedEvent.type) && AbstractC22676k.m65745e(this.createdAt, reminderDeletedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, reminderDeletedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, reminderDeletedEvent.cid) && AbstractC22676k.m65745e(this.channelType, reminderDeletedEvent.channelType) && AbstractC22676k.m65745e(this.channelId, reminderDeletedEvent.channelId) && AbstractC22676k.m65745e(this.reminder, reminderDeletedEvent.reminder) && AbstractC22676k.m65745e(this.messageId, reminderDeletedEvent.messageId) && AbstractC22676k.m65745e(this.userId, reminderDeletedEvent.userId);
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelId() {
        return this.channelId;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelType() {
        return this.channelType;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getCid() {
        return this.cid;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.HasReminder
    public final MessageReminder getReminder() {
        return this.reminder;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31);
        String str = this.rawCreatedAt;
        return this.userId.hashCode() + AbstractC11266d.m30450d((this.reminder.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM124373c + (str == null ? 0 : str.hashCode())) * 31, 31, this.cid), 31, this.channelType), 31, this.channelId)) * 31, 31, this.messageId);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        MessageReminder messageReminder = this.reminder;
        String str6 = this.messageId;
        String str7 = this.userId;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ReminderDeletedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", channelType=");
        AbstractC11266d.m30444B(sbM11830n, str4, ", channelId=", str5, ", reminder=");
        sbM11830n.append(messageReminder);
        sbM11830n.append(", messageId=");
        sbM11830n.append(str6);
        sbM11830n.append(", userId=");
        return AbstractC25012a.m73376i(str7, ")", sbM11830n);
    }
}
