package or2;

import android.icu.text.NumberFormat;
import java.text.ParsePosition;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.g1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroid/icu/text/NumberFormat;", "", "text", "", "a", "(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28164g1 {
    /* JADX INFO: renamed from: a */
    public static final Number m85264a(NumberFormat numberFormat, String text) {
        AbstractC22676k.m65750j(numberFormat, "<this>");
        AbstractC22676k.m65750j(text, "text");
        ParsePosition parsePosition = new ParsePosition(0);
        Number number = numberFormat.parse(text, parsePosition);
        if (parsePosition.getErrorIndex() == -1 && parsePosition.getIndex() == text.length()) {
            return number;
        }
        return null;
    }
}
