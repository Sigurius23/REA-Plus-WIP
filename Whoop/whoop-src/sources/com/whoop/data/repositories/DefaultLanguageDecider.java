package com.whoop.data.repositories;

import com.whoop.data.local.prefs.PreferenceHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25265s;
import or2.AbstractC28202t0;
import or2.InterfaceC28197r1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/data/repositories/DefaultLanguageDecider;", "", "Lor2/r1;", "systemResources", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "", "", "onForAllLanguages", "<init>", "(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/util/Set;)V", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "()Ljava/lang/String;", "Lor2/r1;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "Ljava/util/Set;", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DefaultLanguageDecider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Set<String> onForAllLanguages;
    private final PreferenceHelper preferenceHelper;
    private final InterfaceC28197r1 systemResources;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;", "", "<init>", "()V", "allowedByRegion", "", "locale", "Ljava/util/Locale;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean allowedByRegion(Locale locale) {
            AbstractC22676k.m65750j(locale, "locale");
            if (AbstractC22676k.m65745e(locale.getLanguage(), "pt")) {
                return new Locale("pt", "PT").equals(locale);
            }
            return true;
        }

        private Companion() {
        }
    }

    public DefaultLanguageDecider(InterfaceC28197r1 systemResources, PreferenceHelper preferenceHelper, Set<String> onForAllLanguages) {
        AbstractC22676k.m65750j(systemResources, "systemResources");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(onForAllLanguages, "onForAllLanguages");
        this.systemResources = systemResources;
        this.preferenceHelper = preferenceHelper;
        this.onForAllLanguages = onForAllLanguages;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final String m134155default() {
        String language;
        List<Locale> listM85350a = AbstractC28202t0.m85350a(this.systemResources.mo85333c());
        Object obj = null;
        List listM125906y0 = AbstractC39414r.m125906y0(PreferenceHelper.getStringValueFromLanguagePrefs$default(this.preferenceHelper, LanguageRepositoryKt.ALLOWED_LANGUAGES, null, 2, null), new String[]{","}, 6);
        if (AbstractC39414r.m125890i0((CharSequence) AbstractC25265s.m74096F0(listM125906y0))) {
            for (Object obj2 : listM85350a) {
                Locale locale = (Locale) obj2;
                if (this.onForAllLanguages.contains(locale.getLanguage()) && INSTANCE.allowedByRegion(locale)) {
                    obj = obj2;
                    break;
                }
            }
            Locale locale2 = (Locale) obj;
            return (locale2 == null || (language = locale2.getLanguage()) == null) ? LanguageRepositoryKt.DEFAULT_LANGUAGE : language;
        }
        for (Locale locale3 : listM85350a) {
            Iterator it = listM125906y0.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(locale3.getLanguage(), (String) it.next()) && INSTANCE.allowedByRegion(locale3)) {
                    String language2 = locale3.getLanguage();
                    AbstractC22676k.m65749i(language2, "getLanguage(...)");
                    return language2;
                }
            }
        }
        return LanguageRepositoryKt.DEFAULT_LANGUAGE;
    }
}
