package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import p029b5.C2728g;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleManagerCompat {

    /* JADX INFO: loaded from: classes5.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static C2728g getLocales(Configuration configuration) {
            return C2728g.m7698a(configuration.getLocales().toLanguageTags());
        }
    }

    public static class Api33Impl {
        private Api33Impl() {
        }

        public static LocaleList localeManagerGetApplicationLocales(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static LocaleList localeManagerGetSystemLocales(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    private LocaleManagerCompat() {
    }

    public static C2728g getApplicationLocales(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return C2728g.m7698a(AppLocalesStorageHelper.readLocales(context));
        }
        Object localeManagerForApplication = getLocaleManagerForApplication(context);
        return localeManagerForApplication != null ? C2728g.m7699f(Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication)) : C2728g.f10738b;
    }

    public static C2728g getConfigurationLocales(Configuration configuration) {
        return Api24Impl.getLocales(configuration);
    }

    private static Object getLocaleManagerForApplication(Context context) {
        return context.getSystemService("locale");
    }

    public static C2728g getSystemLocales(Context context) {
        C2728g c2728g = C2728g.f10738b;
        if (Build.VERSION.SDK_INT < 33) {
            return getConfigurationLocales(Resources.getSystem().getConfiguration());
        }
        Object localeManagerForApplication = getLocaleManagerForApplication(context);
        return localeManagerForApplication != null ? C2728g.m7699f(Api33Impl.localeManagerGetSystemLocales(localeManagerForApplication)) : c2728g;
    }
}
