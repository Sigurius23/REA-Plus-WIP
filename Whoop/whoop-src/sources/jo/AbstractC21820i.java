package jo;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: jo.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21820i {

    /* JADX INFO: renamed from: a */
    public static final Pattern f84140a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: a */
    public static String m61751a(CharSequence charSequence) {
        return f84140a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
