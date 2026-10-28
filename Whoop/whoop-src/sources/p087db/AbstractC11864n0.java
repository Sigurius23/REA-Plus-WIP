package p087db;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: db.n0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11864n0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f38700a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: a */
    public static String m31839a(CharSequence charSequence) {
        return f38700a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
