package p600x;

import android.os.LocaleList;

/* JADX INFO: renamed from: x.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC37788c {
    /* JADX INFO: renamed from: a */
    public static String m121290a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
