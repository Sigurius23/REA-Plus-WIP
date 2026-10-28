package io.getstream.chat.android.p226ui.common.utils;

import java.util.regex.Pattern;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/StringUtils;", "", "<init>", "()V", "removeTimePrefix", "", "attachmentName", "usedDateFormat", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StringUtils {
    public static final int $stable = 0;
    public static final StringUtils INSTANCE = new StringUtils();

    private StringUtils() {
    }

    public final String removeTimePrefix(String attachmentName, String usedDateFormat) {
        AbstractC22676k.m65750j(usedDateFormat, "usedDateFormat");
        String pattern = "STREAM_\\S{" + (usedDateFormat.length() + 1) + "}";
        AbstractC22676k.m65750j(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        if (attachmentName == null || !patternCompile.matcher(attachmentName).find()) {
            return attachmentName;
        }
        AbstractC22676k.m65750j(attachmentName, "input");
        String strReplaceFirst = patternCompile.matcher(attachmentName).replaceFirst("");
        AbstractC22676k.m65749i(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }
}
