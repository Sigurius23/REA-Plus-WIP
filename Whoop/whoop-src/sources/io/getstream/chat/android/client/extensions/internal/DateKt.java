package io.getstream.chat.android.client.extensions.internal;

import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m65681d2 = {"isLaterThanDays", "", "Ljava/util/Date;", "daysInMillis", "", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DateKt {
    public static final boolean isLaterThanDays(Date date, long j7) {
        AbstractC22676k.m65750j(date, "<this>");
        return new Date().getTime() - date.getTime() > j7;
    }
}
