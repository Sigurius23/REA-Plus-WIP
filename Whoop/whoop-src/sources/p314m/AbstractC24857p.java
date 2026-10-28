package p314m;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: m.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24857p {
    /* JADX INFO: renamed from: a */
    public static LocaleList m72877a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m72878b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
