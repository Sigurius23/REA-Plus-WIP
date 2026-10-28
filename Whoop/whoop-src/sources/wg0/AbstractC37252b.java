package wg0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wg0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "currentText", "finalText", "", "charsPerStep", "a", "(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37252b {
    /* JADX INFO: renamed from: a */
    public static final String m119395a(String currentText, String finalText, int i13) {
        AbstractC22676k.m65750j(currentText, "currentText");
        AbstractC22676k.m65750j(finalText, "finalText");
        if (currentText.length() >= finalText.length()) {
            return finalText;
        }
        if (i13 < 1) {
            i13 = 1;
        }
        int length = currentText.length();
        String strSubstring = finalText.substring(0, i13 >= finalText.codePointCount(length, finalText.length()) ? finalText.length() : finalText.offsetByCodePoints(length, i13));
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }
}
