package io.getstream.chat.android.client.api2.model.requests;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/ReminderRequest;", "", "remind_at", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getRemind_at", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReminderRequest {
    private final Date remind_at;

    public ReminderRequest(Date date) {
        this.remind_at = date;
    }

    public static /* synthetic */ ReminderRequest copy$default(ReminderRequest reminderRequest, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            date = reminderRequest.remind_at;
        }
        return reminderRequest.copy(date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getRemind_at() {
        return this.remind_at;
    }

    public final ReminderRequest copy(Date remind_at) {
        return new ReminderRequest(remind_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReminderRequest) && AbstractC22676k.m65745e(this.remind_at, ((ReminderRequest) other).remind_at);
    }

    public final Date getRemind_at() {
        return this.remind_at;
    }

    public int hashCode() {
        Date date = this.remind_at;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public String toString() {
        return "ReminderRequest(remind_at=" + this.remind_at + ")";
    }
}
