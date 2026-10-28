package p474s;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: s.o0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31989o0 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m99499a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m99500b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
