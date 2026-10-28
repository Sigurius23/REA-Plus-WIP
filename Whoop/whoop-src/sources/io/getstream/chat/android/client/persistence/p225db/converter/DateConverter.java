package io.getstream.chat.android.client.persistence.p225db.converter;

import com.mapbox.common.HttpHeaders;
import java.util.Date;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;", "", "<init>", "()V", "fromDb", "Ljava/util/Date;", "value", "", "(Ljava/lang/Long;)Ljava/util/Date;", "toDb", HttpHeaders.DATE, "(Ljava/util/Date;)Ljava/lang/Long;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DateConverter {
    public final Date fromDb(Long value) {
        if (value != null) {
            return new Date(value.longValue());
        }
        return null;
    }

    public final Long toDb(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
