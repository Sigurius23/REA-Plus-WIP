package io.getstream.chat.android.client.api2.model.requests;

import c13.AbstractC3855a;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/MarkUnreadRequest;", "", "message_id", "", "message_timestamp", "Ljava/util/Date;", "thread_id", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getMessage_id", "()Ljava/lang/String;", "getMessage_timestamp", "()Ljava/util/Date;", "getThread_id", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MarkUnreadRequest {
    private final String message_id;
    private final Date message_timestamp;
    private final String thread_id;

    public MarkUnreadRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MarkUnreadRequest copy$default(MarkUnreadRequest markUnreadRequest, String str, Date date, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = markUnreadRequest.message_id;
        }
        if ((i13 & 2) != 0) {
            date = markUnreadRequest.message_timestamp;
        }
        if ((i13 & 4) != 0) {
            str2 = markUnreadRequest.thread_id;
        }
        return markUnreadRequest.copy(str, date, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getMessage_timestamp() {
        return this.message_timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThread_id() {
        return this.thread_id;
    }

    public final MarkUnreadRequest copy(String message_id, Date message_timestamp, String thread_id) {
        return new MarkUnreadRequest(message_id, message_timestamp, thread_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkUnreadRequest)) {
            return false;
        }
        MarkUnreadRequest markUnreadRequest = (MarkUnreadRequest) other;
        return AbstractC22676k.m65745e(this.message_id, markUnreadRequest.message_id) && AbstractC22676k.m65745e(this.message_timestamp, markUnreadRequest.message_timestamp) && AbstractC22676k.m65745e(this.thread_id, markUnreadRequest.thread_id);
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final Date getMessage_timestamp() {
        return this.message_timestamp;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public int hashCode() {
        String str = this.message_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.message_timestamp;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.thread_id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.thread_id, ")", AbstractC3855a.m11830n("MarkUnreadRequest(message_id=", this.message_id, ", message_timestamp=", this.message_timestamp, ", thread_id="));
    }

    public MarkUnreadRequest(String str, Date date, String str2) {
        this.message_id = str;
        this.message_timestamp = date;
        this.thread_id = str2;
    }

    public /* synthetic */ MarkUnreadRequest(String str, Date date, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : date, (i13 & 4) != 0 ? null : str2);
    }
}
