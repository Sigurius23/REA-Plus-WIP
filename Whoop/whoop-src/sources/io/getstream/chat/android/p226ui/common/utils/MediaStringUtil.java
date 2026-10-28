package io.getstream.chat.android.p226ui.common.utils;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;", "", "<init>", "()V", "convertVideoLength", "", "videoLengthInSeconds", "", "locale", "Ljava/util/Locale;", "convertFileSizeByteCount", "bytes", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaStringUtil {
    public static final int $stable = 0;
    public static final MediaStringUtil INSTANCE = new MediaStringUtil();

    private MediaStringUtil() {
    }

    public static final String convertFileSizeByteCount(long bytes) {
        if (bytes <= 0) {
            return "0 B";
        }
        if (bytes < 1024) {
            return bytes + " B";
        }
        double d3 = bytes;
        int iLog = (int) (Math.log(d3) / Math.log(1024.0d));
        return AbstractC11895b.m31997p(new DecimalFormat("###.##").format(d3 / Math.pow(1024.0d, iLog)), " ", String.valueOf("KMGTPE".charAt(iLog - 1)), "B");
    }

    public static final String convertVideoLength(long videoLengthInSeconds, Locale locale) {
        AbstractC22676k.m65750j(locale, "locale");
        if (videoLengthInSeconds <= 0) {
            return "--:--:--";
        }
        long j7 = DateTimeConstants.SECONDS_PER_HOUR;
        long j13 = 60;
        return String.format(locale, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(videoLengthInSeconds / j7), Long.valueOf((videoLengthInSeconds % j7) / j13), Long.valueOf(videoLengthInSeconds % j13)}, 3));
    }

    public static /* synthetic */ String convertVideoLength$default(long j7, Locale locale, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault(...)");
        }
        return convertVideoLength(j7, locale);
    }
}
