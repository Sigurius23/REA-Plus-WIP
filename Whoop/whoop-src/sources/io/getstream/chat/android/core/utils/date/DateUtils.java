package io.getstream.chat.android.core.utils.date;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.TimeDuration;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a \u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\t\u0010\b\u001a)\u0010\f\u001a\u0004\u0018\u00010\u00002\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\n\"\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\n\"\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\r\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0014\u001a1\u0010\u0018\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001a\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, m65681d2 = {"Ljava/util/Date;", "that", "", "after", "(Ljava/util/Date;Ljava/util/Date;)Z", "dateA", "dateB", "max", "(Ljava/util/Date;Ljava/util/Date;)Ljava/util/Date;", "min", "", "dates", "maxOf", "([Ljava/util/Date;)Ljava/util/Date;", "minOf", "", "otherTime", "Lio/getstream/chat/android/models/TimeDuration;", "diff", "(Ljava/util/Date;J)Lio/getstream/chat/android/models/TimeDuration;", "(Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/models/TimeDuration;", AttachmentExtensionsKt.EXTRA_DURATION, "Lkotlin/Function0;", "now", "isWithinDurationFromNow", "(Ljava/util/Date;Lio/getstream/chat/android/models/TimeDuration;Lc93/a;)Z", "truncateFuture", "(Ljava/util/Date;Lc93/a;)Ljava/util/Date;", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DateUtils {

    /* JADX INFO: renamed from: io.getstream.chat.android.core.utils.date.DateUtils$isWithinDurationFromNow$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 176)
    public static final class C194651 implements InterfaceC4339a {
        public static final C194651 INSTANCE = new C194651();

        @Override // c93.InterfaceC4339a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.core.utils.date.DateUtils$truncateFuture$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 176)
    public static final class C194661 implements InterfaceC4339a {
        public static final C194661 INSTANCE = new C194661();

        @Override // c93.InterfaceC4339a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @InternalStreamChatApi
    public static final boolean after(Date date, Date date2) {
        if (date == null) {
            return false;
        }
        if (date2 == null) {
            return true;
        }
        return date.after(date2);
    }

    @InternalStreamChatApi
    public static final TimeDuration diff(Date date, long j7) {
        AbstractC22676k.m65750j(date, "<this>");
        return TimeDuration.INSTANCE.millis(Math.abs(date.getTime() - j7));
    }

    @InternalStreamChatApi
    public static final boolean isWithinDurationFromNow(Date date, TimeDuration duration, InterfaceC4339a now) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(now, "now");
        return date != null && ((Number) now.invoke()).longValue() - date.getTime() < duration.getMillis();
    }

    public static /* synthetic */ boolean isWithinDurationFromNow$default(Date date, TimeDuration duration, InterfaceC4339a now, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            now = C194651.INSTANCE;
        }
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(now, "now");
        return date != null && ((Number) now.invoke()).longValue() - date.getTime() < duration.getMillis();
    }

    @InternalStreamChatApi
    public static final Date max(Date date, Date date2) {
        return after(date, date2) ? date : date2;
    }

    @InternalStreamChatApi
    public static final Date maxOf(Date... dates) {
        AbstractC22676k.m65750j(dates, "dates");
        if (dates.length == 0) {
            return null;
        }
        Date dateMax = dates[0];
        int i13 = 1;
        int length = dates.length - 1;
        if (1 <= length) {
            while (true) {
                dateMax = max(dateMax, dates[i13]);
                if (i13 == length) {
                    break;
                }
                i13++;
            }
        }
        return dateMax;
    }

    @InternalStreamChatApi
    public static final Date min(Date date, Date date2) {
        return after(date, date2) ? date2 : date;
    }

    @InternalStreamChatApi
    public static final Date minOf(Date... dates) {
        AbstractC22676k.m65750j(dates, "dates");
        if (dates.length == 0) {
            return null;
        }
        Date dateMin = dates[0];
        int i13 = 1;
        int length = dates.length - 1;
        if (1 <= length) {
            while (true) {
                dateMin = min(dateMin, dates[i13]);
                if (i13 == length) {
                    break;
                }
                i13++;
            }
        }
        return dateMin;
    }

    @InternalStreamChatApi
    public static final Date truncateFuture(Date date, InterfaceC4339a now) {
        AbstractC22676k.m65750j(now, "now");
        if (date == null) {
            return null;
        }
        if (date.getTime() > ((Number) now.invoke()).longValue()) {
            date.setTime(((Number) now.invoke()).longValue());
        }
        return date;
    }

    public static /* synthetic */ Date truncateFuture$default(Date date, InterfaceC4339a now, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            now = C194661.INSTANCE;
        }
        AbstractC22676k.m65750j(now, "now");
        if (date == null) {
            return null;
        }
        if (date.getTime() > ((Number) now.invoke()).longValue()) {
            date.setTime(((Number) now.invoke()).longValue());
        }
        return date;
    }

    @InternalStreamChatApi
    public static final TimeDuration diff(Date date, Date that) {
        AbstractC22676k.m65750j(date, "<this>");
        AbstractC22676k.m65750j(that, "that");
        return TimeDuration.INSTANCE.millis(Math.abs(date.getTime() - that.getTime()));
    }
}
