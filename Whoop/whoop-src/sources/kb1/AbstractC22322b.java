package kb1;

import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kb1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ljava/util/Locale;", "a", "(Ljava/util/Locale;)Ljava/util/Locale;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22322b {
    /* JADX INFO: renamed from: a */
    public static final Locale m64142a(Locale locale) {
        AbstractC22676k.m65750j(locale, "<this>");
        Locale localeBuild = new Locale.Builder().setLocale(locale).setUnicodeLocaleKeyword("nu", "latn").build();
        AbstractC22676k.m65749i(localeBuild, "build(...)");
        return localeBuild;
    }
}
