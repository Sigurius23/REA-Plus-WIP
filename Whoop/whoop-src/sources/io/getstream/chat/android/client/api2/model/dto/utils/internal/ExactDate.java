package io.getstream.chat.android.client.api2.model.dto.utils.internal;

import com.mapbox.common.HttpHeaders;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\rJ\u000e\u0010\u000e\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "", HttpHeaders.DATE, "Ljava/util/Date;", "rawDate", "", "<init>", "(Ljava/util/Date;Ljava/lang/String;)V", "getDate$stream_chat_android_client_release", "()Ljava/util/Date;", "getRawDate$stream_chat_android_client_release", "()Ljava/lang/String;", "component1", "component1$stream_chat_android_client_release", "component2", "component2$stream_chat_android_client_release", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ExactDate {
    private final Date date;
    private final String rawDate;

    public ExactDate(Date date, String rawDate) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(rawDate, "rawDate");
        this.date = date;
        this.rawDate = rawDate;
    }

    public static /* synthetic */ ExactDate copy$default(ExactDate exactDate, Date date, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            date = exactDate.date;
        }
        if ((i13 & 2) != 0) {
            str = exactDate.rawDate;
        }
        return exactDate.copy(date, str);
    }

    /* JADX INFO: renamed from: component1$stream_chat_android_client_release, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2$stream_chat_android_client_release, reason: from getter */
    public final String getRawDate() {
        return this.rawDate;
    }

    public final ExactDate copy(Date date, String rawDate) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(rawDate, "rawDate");
        return new ExactDate(date, rawDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExactDate)) {
            return false;
        }
        ExactDate exactDate = (ExactDate) other;
        return AbstractC22676k.m65745e(this.date, exactDate.date) && AbstractC22676k.m65745e(this.rawDate, exactDate.rawDate);
    }

    public final Date getDate$stream_chat_android_client_release() {
        return this.date;
    }

    public final String getRawDate$stream_chat_android_client_release() {
        return this.rawDate;
    }

    public int hashCode() {
        return this.rawDate.hashCode() + (this.date.hashCode() * 31);
    }

    public String toString() {
        return "ExactDate(date=" + this.date + ", rawDate=" + this.rawDate + ")";
    }
}
