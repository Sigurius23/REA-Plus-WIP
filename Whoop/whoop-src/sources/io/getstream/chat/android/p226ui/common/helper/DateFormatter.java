package io.getstream.chat.android.p226ui.common.helper;

import android.content.Context;
import com.mapbox.common.HttpHeaders;
import java.util.Date;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "", "formatDate", "", HttpHeaders.DATE, "Ljava/util/Date;", "formatTime", "formatRelativeTime", "formatRelativeDate", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface DateFormatter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;", "", "<init>", "()V", "from", "Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "context", "Landroid/content/Context;", "locale", "Ljava/util/Locale;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ DateFormatter from$default(Companion companion, Context context, Locale locale, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                locale = Locale.getDefault();
                AbstractC22676k.m65749i(locale, "getDefault(...)");
            }
            return companion.from(context, locale);
        }

        public final DateFormatter from(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return from$default(this, context, null, 2, null);
        }

        public final DateFormatter from(Context context, Locale locale) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(locale, "locale");
            return new DefaultDateFormatter(context, locale);
        }
    }

    static DateFormatter from(Context context) {
        return INSTANCE.from(context);
    }

    String formatDate(Date date);

    String formatRelativeDate(Date date);

    String formatRelativeTime(Date date);

    String formatTime(Date date);

    static DateFormatter from(Context context, Locale locale) {
        return INSTANCE.from(context, locale);
    }
}
