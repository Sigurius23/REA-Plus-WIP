package p314m;

import android.content.res.Configuration;
import android.os.LocaleList;
import p029b5.C2728g;

/* JADX INFO: renamed from: m.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24862u {
    /* JADX INFO: renamed from: a */
    public static void m72887a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: b */
    public static C2728g m72888b(Configuration configuration) {
        return C2728g.m7698a(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m72889c(C2728g c2728g) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c2728g.m7703e()));
    }

    /* JADX INFO: renamed from: d */
    public static void m72890d(Configuration configuration, C2728g c2728g) {
        configuration.setLocales(LocaleList.forLanguageTags(c2728g.m7703e()));
    }
}
