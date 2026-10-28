package wg0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wg0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "currentText", "finalText", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37261k {
    /* JADX INFO: renamed from: a */
    public static final String m119423a(String currentText, String finalText) {
        AbstractC22676k.m65750j(currentText, "currentText");
        AbstractC22676k.m65750j(finalText, "finalText");
        int length = currentText.length();
        if (length < finalText.length()) {
            String strSubstring = finalText.substring(length);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            Integer numM119422a = C37260j.f159404a.m119422a(strSubstring);
            if (numM119422a != null) {
                return AbstractC39414r.m125866L0(numM119422a.intValue() + length + 1, finalText);
            }
        }
        return finalText;
    }
}
