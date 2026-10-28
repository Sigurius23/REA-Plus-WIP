package io.getstream.chat.android.models;

import java.util.Date;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/models/MessageReminderInfo;", "", "remindAt", "Ljava/util/Date;", "createdAt", "updatedAt", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getRemindAt", "()Ljava/util/Date;", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageReminderInfo {
    private final Date createdAt;
    private final Date remindAt;
    private final Date updatedAt;

    public MessageReminderInfo(Date date, Date createdAt, Date updatedAt) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.remindAt = date;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static /* synthetic */ MessageReminderInfo copy$default(MessageReminderInfo messageReminderInfo, Date date, Date date2, Date date3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            date = messageReminderInfo.remindAt;
        }
        if ((i13 & 2) != 0) {
            date2 = messageReminderInfo.createdAt;
        }
        if ((i13 & 4) != 0) {
            date3 = messageReminderInfo.updatedAt;
        }
        return messageReminderInfo.copy(date, date2, date3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getRemindAt() {
        return this.remindAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final MessageReminderInfo copy(Date remindAt, Date createdAt, Date updatedAt) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new MessageReminderInfo(remindAt, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReminderInfo)) {
            return false;
        }
        MessageReminderInfo messageReminderInfo = (MessageReminderInfo) other;
        return AbstractC22676k.m65745e(this.remindAt, messageReminderInfo.remindAt) && AbstractC22676k.m65745e(this.createdAt, messageReminderInfo.createdAt) && AbstractC22676k.m65745e(this.updatedAt, messageReminderInfo.updatedAt);
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getRemindAt() {
        return this.remindAt;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Date date = this.remindAt;
        return this.updatedAt.hashCode() + AbstractC38963t7.m124373c(this.createdAt, (date == null ? 0 : date.hashCode()) * 31, 31);
    }

    public String toString() {
        Date date = this.remindAt;
        Date date2 = this.createdAt;
        Date date3 = this.updatedAt;
        StringBuilder sb4 = new StringBuilder("MessageReminderInfo(remindAt=");
        sb4.append(date);
        sb4.append(", createdAt=");
        sb4.append(date2);
        sb4.append(", updatedAt=");
        return AbstractC13673n.m38564k(sb4, date3, ")");
    }
}
