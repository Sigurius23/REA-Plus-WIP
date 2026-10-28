package or2;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.q0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Ljava/util/Locale;", "b", "(Ljava/util/Locale;)Ljava/util/Locale;", "Landroid/content/Context;", "a", "(Landroid/content/Context;)Landroid/content/Context;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28193q0 {
    /* JADX INFO: renamed from: a */
    public static final Context m85322a(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        if (locale == null || !AbstractC22676k.m65745e(locale.getLanguage(), "ar") || AbstractC22676k.m65745e(locale.getUnicodeLocaleType("nu"), "latn")) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(m85323b(locale));
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
        contextThemeWrapper.applyOverrideConfiguration(configuration);
        return contextThemeWrapper;
    }

    /* JADX INFO: renamed from: b */
    public static final Locale m85323b(Locale locale) {
        AbstractC22676k.m65750j(locale, "<this>");
        Locale localeBuild = new Locale.Builder().setLocale(locale).setUnicodeLocaleKeyword("nu", "latn").build();
        AbstractC22676k.m65749i(localeBuild, "build(...)");
        return localeBuild;
    }
}
