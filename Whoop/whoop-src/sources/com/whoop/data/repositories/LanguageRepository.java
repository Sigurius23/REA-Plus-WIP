package com.whoop.data.repositories;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.LifecycleDestroyedException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.remote.domain.response.AllowedLanguagesResponseDto;
import com.whoop.data.remote.domain.response.EnabledLanguagesResponse;
import com.whoop.service.network.LanguageApi;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import hc3.AbstractC17182o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kc3.C22365e;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import od1.C27858u;
import or2.AbstractC28202t0;
import or2.C28162g;
import or2.InterfaceC28197r1;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p029b5.C2728g;
import p138f6.AbstractC14134f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u001e\n\u0002\b\u0017\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010+J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0086@¢\u0006\u0004\b-\u0010#J\u000f\u0010.\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020!H\u0082@¢\u0006\u0004\b0\u0010#J\u0010\u00101\u001a\u00020!H\u0082@¢\u0006\u0004\b1\u0010#J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0082@¢\u0006\u0004\b2\u0010#J\u001e\u00104\u001a\b\u0012\u0004\u0012\u00020\n0,2\u0006\u00103\u001a\u00020\nH\u0082@¢\u0006\u0004\b4\u00105J%\u00108\u001a\u00020!2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\n0,2\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020\nH\u0002¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020;H\u0082@¢\u0006\u0004\b>\u0010#J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010,H\u0082@¢\u0006\u0004\b?\u0010#J#\u0010A\u001a\b\u0012\u0004\u0012\u00020\n0,2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020;2\u0006\u0010C\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010=J\u001d\u0010E\u001a\u00020!2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010+J\u001d\u0010H\u001a\u00020!2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0002¢\u0006\u0004\bH\u0010FJ\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0082@¢\u0006\u0004\bI\u0010#J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0082@¢\u0006\u0004\bJ\u0010#J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0082@¢\u0006\u0004\bK\u0010#J$\u0010M\u001a\b\u0012\u0004\u0012\u00020\n0,2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0082@¢\u0006\u0004\bM\u0010NJ'\u0010P\u001a\u0004\u0018\u00010\n2\u0006\u0010C\u001a\u00020\n2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\n0OH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020;2\u0006\u0010R\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010=J\u0017\u0010T\u001a\u00020;2\u0006\u0010R\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010=J%\u0010U\u001a\u00020;2\u0006\u0010R\u001a\u00020\n2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\n0OH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020;2\u0006\u0010R\u001a\u00020\nH\u0002¢\u0006\u0004\bW\u0010=J\u0010\u0010X\u001a\u00020!H\u0082@¢\u0006\u0004\bX\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010YR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ZR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010[R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\\R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\\R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010]R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010^R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010`R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010aR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010d¨\u0006f"}, m65681d2 = {"Lcom/whoop/data/repositories/LanguageRepository;", "Lcom/whoop/data/repositories/LanguageChecker;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/whoop/service/network/LanguageApi;", "languageApi", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lod1/u;", "userContext", "", "", "appSupportedLanguages", "onForAllLanguages", "Lor2/r1;", "systemResources", "Lor2/g;", "buildConfigProvider", "Lbc3/c0;", "coroutineScope", "Landroidx/lifecycle/g0;", "processLifecycleOwner", "Lcom/whoop/data/repositories/DefaultLanguageDecider;", "defaultLanguageDecider", "Ll83/h;", "Lcom/whoop/data/repositories/CachedDataLanguageRefresher;", "languageRefresher", "La6/g;", "Lf6/f;", "prefsDataStore", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/LanguageApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Ljava/util/Set;Ljava/util/Set;Lor2/r1;Lor2/g;Lbc3/c0;Landroidx/lifecycle/g0;Lcom/whoop/data/repositories/DefaultLanguageDecider;Ll83/h;La6/g;Ltr2/n;)V", "Ll83/a0;", "onLanguageChanged", "(Lq83/d;)Ljava/lang/Object;", "owner", "onStart", "(Landroidx/lifecycle/g0;)V", "Ljava/util/Locale;", "getAllowedLanguage", "()Ljava/util/Locale;", "getHeader", "()Ljava/lang/String;", "", "fetchAllowedLanguagesForUi", "removeCachedLanguageData", "()V", "cacheAllowedLanguageListAndHeader", "updatedAllowedLanguageList", "localesToUse", "previouslyCachedAllowedLanguagesString", "computeAllowedLanguageListFromPreviouslyCachedList", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "allowedLanguagesList", "oldLanguage", "setAppLocaleList", "(Ljava/util/List;Ljava/lang/String;)V", "language", "", "isNotEnglish", "(Ljava/lang/String;)Z", "isFirstPreferredLanguageOnForAll", "fetchAllowedLanguages", "allowedLanguagesFromBackend", "sanitizeAllowedLanguagesFromBackendForRegion", "(Ljava/util/List;)Ljava/util/List;", "locale", "displayForUi", "cacheComputedAllowedLanguageList", "(Ljava/util/List;)V", "getComputedAllowedLanguageList", "cacheComputedLanguageHeader", "getAllowedLanguagesAuthed", "getEnabledLanguages", "getAllowedLanguagesOnboarding", "acceptedLanguages", "filterSystemLocalePreferences", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "shouldInclude", "(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;", "localeString", "thisAppVersionHasStringsFor", "isOnForAll", "regionMatch", "(Ljava/lang/String;Ljava/util/Collection;)Z", "pseudoLocale", "updateBackendLanguagePreference", "Lcom/whoop/service/network/LanguageApi;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "Lod1/u;", "Ljava/util/Set;", "Lor2/r1;", "Lor2/g;", "Lbc3/c0;", "Landroidx/lifecycle/g0;", "Lcom/whoop/data/repositories/DefaultLanguageDecider;", "Ll83/h;", "La6/g;", "Ltr2/n;", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LanguageRepository implements LanguageChecker, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Set<String> appSupportedLanguages;
    private final C28162g buildConfigProvider;
    private final InterfaceC2994c0 coroutineScope;
    private final DefaultLanguageDecider defaultLanguageDecider;
    private final LanguageApi languageApi;
    private final InterfaceC23462h languageRefresher;
    private final InterfaceC34116n logger;
    private final Set<String> onForAllLanguages;
    private final PreferenceHelper preferenceHelper;
    private final InterfaceC0422g prefsDataStore;
    private final InterfaceC1585g0 processLifecycleOwner;
    private final InterfaceC28197r1 systemResources;
    private final C27858u userContext;

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/data/repositories/LanguageRepository$Companion;", "", "<init>", "()V", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lcom/whoop/data/repositories/DefaultLanguageDecider;", "defaultLanguageDecider", "", "", "getComputedLanguageHeader", "(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/List;", "Lor2/r1;", "systemResources", "Ljava/util/Locale;", "obtainAllowedLanguage", "(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/Locale;", "language", "country", "buildFormattingLocale", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Locale;", "print", "(Ljava/util/Locale;)Ljava/lang/String;", "Ljava/util/Locale$Builder;", "useWesternArabicNumbers", "(Ljava/util/Locale$Builder;)Ljava/util/Locale$Builder;", "getAcceptLanguageHeaderValue", "(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/lang/String;", "getFormattingLocaleHeaderValue", "(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Locale buildFormattingLocale(String language, String country) {
            Locale.Builder builder = new Locale.Builder();
            builder.setLanguage(language);
            if (country.length() > 0) {
                builder.setRegion(country);
            }
            if (AbstractC22676k.m65745e(language, LanguageRepositoryKt.ARABIC.getLanguage())) {
                Locale localeBuild = useWesternArabicNumbers(builder).build();
                AbstractC22676k.m65747g(localeBuild);
                return localeBuild;
            }
            Locale localeBuild2 = builder.build();
            AbstractC22676k.m65747g(localeBuild2);
            return localeBuild2;
        }

        private final List<String> getComputedLanguageHeader(PreferenceHelper preferenceHelper, DefaultLanguageDecider defaultLanguageDecider) {
            String strM134155default;
            String stringValueFromLanguagePrefs$default = PreferenceHelper.getStringValueFromLanguagePrefs$default(preferenceHelper, LanguageRepositoryKt.ACCEPT_LANGUAGE_HEADER, null, 2, null);
            if (!AbstractC39414r.m125890i0(stringValueFromLanguagePrefs$default)) {
                return AbstractC39414r.m125906y0(stringValueFromLanguagePrefs$default, new String[]{","}, 6);
            }
            if (defaultLanguageDecider == null || (strM134155default = defaultLanguageDecider.m134155default()) == null) {
                strM134155default = LanguageRepositoryKt.DEFAULT_LANGUAGE;
            }
            return AbstractC37056f.m118958J(strM134155default);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Locale obtainAllowedLanguage(InterfaceC28197r1 systemResources, PreferenceHelper preferenceHelper, DefaultLanguageDecider defaultLanguageDecider) {
            C2728g c2728gMo85332b = systemResources.mo85332b();
            if (c2728gMo85332b.m7701c()) {
                Locale localeForLanguageTag = Locale.forLanguageTag(getComputedLanguageHeader(preferenceHelper, defaultLanguageDecider).get(0));
                AbstractC22676k.m65747g(localeForLanguageTag);
                return localeForLanguageTag;
            }
            Locale localeM7700b = c2728gMo85332b.m7700b(0);
            if (localeM7700b != null) {
                return localeM7700b;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        private final String print(Locale locale) {
            String unicodeLocaleType = locale.getUnicodeLocaleType("nu");
            if (unicodeLocaleType == null) {
                String string = locale.toString();
                AbstractC22676k.m65747g(string);
                return string;
            }
            return locale.getLanguage() + "_" + locale.getCountry() + "_u-nu-" + unicodeLocaleType;
        }

        private final Locale.Builder useWesternArabicNumbers(Locale.Builder builder) {
            Locale.Builder unicodeLocaleKeyword = builder.setUnicodeLocaleKeyword("nu", "latn");
            AbstractC22676k.m65749i(unicodeLocaleKeyword, "setUnicodeLocaleKeyword(...)");
            return unicodeLocaleKeyword;
        }

        public final String getAcceptLanguageHeaderValue(PreferenceHelper preferenceHelper, DefaultLanguageDecider defaultLanguageDecider) {
            AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
            List<String> computedLanguageHeader = getComputedLanguageHeader(preferenceHelper, defaultLanguageDecider);
            StringBuilder sb4 = new StringBuilder();
            int size = computedLanguageHeader.size();
            double d3 = 0.9d;
            for (int i13 = 0; i13 < size; i13++) {
                if (i13 == 0) {
                    sb4.append(computedLanguageHeader.get(i13));
                } else {
                    sb4.append(",");
                    sb4.append(computedLanguageHeader.get(i13));
                    sb4.append(";");
                    sb4.append(d3);
                    d3 -= 0.1d;
                }
            }
            String string = sb4.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            return string;
        }

        public final String getFormattingLocaleHeaderValue(InterfaceC28197r1 systemResources, PreferenceHelper preferenceHelper, DefaultLanguageDecider defaultLanguageDecider) {
            AbstractC22676k.m65750j(systemResources, "systemResources");
            AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
            Locale localeObtainAllowedLanguage = obtainAllowedLanguage(systemResources, preferenceHelper, defaultLanguageDecider);
            String country = localeObtainAllowedLanguage.getCountry();
            if (country.length() == 0) {
                country = ((Locale) AbstractC25265s.m74096F0(AbstractC28202t0.m85350a(systemResources.mo85331a()))).getCountry();
            }
            String language = localeObtainAllowedLanguage.getLanguage();
            AbstractC22676k.m65749i(language, "getLanguage(...)");
            AbstractC22676k.m65747g(country);
            return print(buildFormattingLocale(language, country));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$cacheAllowedLanguageListAndHeader$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {165, 167, 169, 174, 178, 183}, m100432m = "cacheAllowedLanguageListAndHeader", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65871 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C65871(InterfaceC30057d<? super C65871> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.cacheAllowedLanguageListAndHeader(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$fetchAllowedLanguages$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {278, 280, 284}, m100432m = "fetchAllowedLanguages", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65881 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C65881(InterfaceC30057d<? super C65881> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.fetchAllowedLanguages(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$fetchAllowedLanguagesForUi$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {302}, m100432m = "fetchAllowedLanguagesForUi", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65891 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65891(InterfaceC30057d<? super C65891> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.fetchAllowedLanguagesForUi(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$filterSystemLocalePreferences$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {350}, m100432m = "filterSystemLocalePreferences", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65901 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C65901(InterfaceC30057d<? super C65901> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.filterSystemLocalePreferences(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesAuthed$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {330, 331}, m100432m = "getAllowedLanguagesAuthed", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65911 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C65911(InterfaceC30057d<? super C65911> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.getAllowedLanguagesAuthed(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesAuthed$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesAuthed$2", m100430f = "LanguageRepository.kt", m100431l = {332}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65922 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $regions;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65922(String str, InterfaceC30057d<? super C65922> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$regions = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return LanguageRepository.this.new C65922(this.$regions, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                LanguageApi languageApi = LanguageRepository.this.languageApi;
                String str = this.$regions;
                this.label = 1;
                obj = languageApi.getAllowedLanguagesAuthedWithHeader("ANDROID", str, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return ((AllowedLanguagesResponseDto) obj).toAllowedLanguageResponse().getAllowedLanguages();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<String>> interfaceC30057d) {
            return ((C65922) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesOnboarding$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {343, 344}, m100432m = "getAllowedLanguagesOnboarding", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65931 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C65931(InterfaceC30057d<? super C65931> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.getAllowedLanguagesOnboarding(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesOnboarding$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesOnboarding$2", m100430f = "LanguageRepository.kt", m100431l = {345}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65942 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $regions;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65942(String str, InterfaceC30057d<? super C65942> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$regions = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return LanguageRepository.this.new C65942(this.$regions, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                LanguageApi languageApi = LanguageRepository.this.languageApi;
                String str = this.$regions;
                this.label = 1;
                obj = languageApi.getAllowedLanguagesOnboardingWithHeader("ANDROID", str, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return ((AllowedLanguagesResponseDto) obj).toAllowedLanguageResponse().getAllowedLanguages();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<String>> interfaceC30057d) {
            return ((C65942) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$getEnabledLanguages$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {337}, m100432m = "getEnabledLanguages", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65951 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65951(InterfaceC30057d<? super C65951> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.getEnabledLanguages(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$getEnabledLanguages$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository$getEnabledLanguages$2", m100430f = "LanguageRepository.kt", m100431l = {338}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65962 extends AbstractC32275i implements Function1 {
        int label;

        public C65962(InterfaceC30057d<? super C65962> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return LanguageRepository.this.new C65962(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                LanguageApi languageApi = LanguageRepository.this.languageApi;
                this.label = 1;
                obj = languageApi.getEnabledLanguagesForPicker("ANDROID", this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return ((EnabledLanguagesResponse) obj).getEnabledLanguages();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<String>> interfaceC30057d) {
            return ((C65962) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$isFirstPreferredLanguageOnForAll$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {269}, m100432m = "isFirstPreferredLanguageOnForAll", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65971 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65971(InterfaceC30057d<? super C65971> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.isFirstPreferredLanguageOnForAll(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$localesToUse$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {205}, m100432m = "localesToUse", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65981 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65981(InterfaceC30057d<? super C65981> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.localesToUse(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$onLanguageChanged$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {152, 153}, m100432m = "onLanguageChanged", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65991 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65991(InterfaceC30057d<? super C65991> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.onLanguageChanged(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$onStart$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository$onStart$1", m100430f = "LanguageRepository.kt", m100431l = {188, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66001 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C66001(InterfaceC30057d<? super C66001> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return LanguageRepository.this.new C66001(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66001) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            if (r5.cacheAllowedLanguageListAndHeader(r4) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L35
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L2a
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                com.whoop.data.repositories.LanguageRepository r5 = com.whoop.data.repositories.LanguageRepository.this
                r4.label = r3
                java.lang.Object r5 = com.whoop.data.repositories.LanguageRepository.access$updatedAllowedLanguageList(r5, r4)
                if (r5 != r0) goto L2a
                goto L34
            L2a:
                com.whoop.data.repositories.LanguageRepository r5 = com.whoop.data.repositories.LanguageRepository.this
                r4.label = r2
                java.lang.Object r5 = com.whoop.data.repositories.LanguageRepository.access$cacheAllowedLanguageListAndHeader(r5, r4)
                if (r5 != r0) goto L35
            L34:
                return r0
            L35:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.LanguageRepository.C66001.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1", m100430f = "LanguageRepository.kt", m100431l = {411}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66011 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ C2728g $locales;
        final /* synthetic */ String $newLanguage;
        final /* synthetic */ String $oldLanguage;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66011(C2728g c2728g, String str, String str2, InterfaceC30057d<? super C66011> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$locales = c2728g;
            this.$newLanguage = str;
            this.$oldLanguage = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C66011 c66011 = LanguageRepository.this.new C66011(this.$locales, this.$newLanguage, this.$oldLanguage, interfaceC30057d);
            c66011.L$0 = obj;
            return c66011;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66011) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:21:0x00cb A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC4339a interfaceC4339a;
            final InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC1638x lifecycle = LanguageRepository.this.processLifecycleOwner.getLifecycle();
                final LanguageRepository languageRepository = LanguageRepository.this;
                final C2728g c2728g = this.$locales;
                final String str = this.$newLanguage;
                final String str2 = this.$oldLanguage;
                EnumC1635w enumC1635w = EnumC1635w.f6328z;
                C22365e c22365e = AbstractC3050q0.f12077a;
                AbstractC3069w1 abstractC3069w1Mo8825s = AbstractC17182o.f65999a.mo8825s();
                boolean zIsDispatchNeeded = abstractC3069w1Mo8825s.isDispatchNeeded(getContext());
                if (zIsDispatchNeeded) {
                    interfaceC4339a = new InterfaceC4339a() { // from class: com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1
                        @Override // c93.InterfaceC4339a
                        public final C23454a0 invoke() {
                            languageRepository.logger.mo85228t("setting appSpecificLocalList to " + c2728g + " first=" + str + " oldLanguage=" + str2, new AbstractC30556a.a[0]);
                            languageRepository.systemResources.mo85334d(c2728g);
                            if (!AbstractC22676k.m65745e(str, str2)) {
                                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new LanguageRepository$setAppLocaleList$1$1$1(languageRepository, str, str2, null), 3);
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.Z$0 = zIsDispatchNeeded;
                    this.label = 1;
                    if (AbstractC1613o1.m5026p(lifecycle, enumC1635w, zIsDispatchNeeded, abstractC3069w1Mo8825s, interfaceC4339a, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (lifecycle.getCurrentState() == EnumC1635w.f6325w) {
                        throw new LifecycleDestroyedException();
                    }
                    if (lifecycle.getCurrentState().compareTo(enumC1635w) >= 0) {
                        languageRepository.logger.mo85228t("setting appSpecificLocalList to " + c2728g + " first=" + str + " oldLanguage=" + str2, new AbstractC30556a.a[0]);
                        languageRepository.systemResources.mo85334d(c2728g);
                        if (!AbstractC22676k.m65745e(str, str2)) {
                            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new LanguageRepository$setAppLocaleList$1$1$1(languageRepository, str, str2, null), 3);
                        }
                    } else {
                        interfaceC4339a = new InterfaceC4339a() { // from class: com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1
                            @Override // c93.InterfaceC4339a
                            public final C23454a0 invoke() {
                                languageRepository.logger.mo85228t("setting appSpecificLocalList to " + c2728g + " first=" + str + " oldLanguage=" + str2, new AbstractC30556a.a[0]);
                                languageRepository.systemResources.mo85334d(c2728g);
                                if (!AbstractC22676k.m65745e(str, str2)) {
                                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new LanguageRepository$setAppLocaleList$1$1$1(languageRepository, str, str2, null), 3);
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.Z$0 = zIsDispatchNeeded;
                        this.label = 1;
                        if (AbstractC1613o1.m5026p(lifecycle, enumC1635w, zIsDispatchNeeded, abstractC3069w1Mo8825s, interfaceC4339a, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$updateBackendLanguagePreference$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository$updateBackendLanguagePreference$2", m100430f = "LanguageRepository.kt", m100431l = {398}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66042 extends AbstractC32275i implements Function1 {
        int label;

        public C66042(InterfaceC30057d<? super C66042> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return LanguageRepository.this.new C66042(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            LanguageApi languageApi = LanguageRepository.this.languageApi;
            this.label = 1;
            Object objUpdateLanguagePreference = languageApi.updateLanguagePreference(this);
            return objUpdateLanguagePreference == enumC31071a ? enumC31071a : objUpdateLanguagePreference;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((C66042) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$updatedAllowedLanguageList$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository", m100430f = "LanguageRepository.kt", m100431l = {194}, m100432m = "updatedAllowedLanguageList", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66051 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C66051(InterfaceC30057d<? super C66051> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageRepository.this.updatedAllowedLanguageList(this);
        }
    }

    public LanguageRepository(LanguageApi languageApi, PreferenceHelper preferenceHelper, C27858u userContext, Set<String> appSupportedLanguages, Set<String> onForAllLanguages, InterfaceC28197r1 systemResources, C28162g buildConfigProvider, InterfaceC2994c0 coroutineScope, InterfaceC1585g0 processLifecycleOwner, DefaultLanguageDecider defaultLanguageDecider, InterfaceC23462h languageRefresher, InterfaceC0422g prefsDataStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(languageApi, "languageApi");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(appSupportedLanguages, "appSupportedLanguages");
        AbstractC22676k.m65750j(onForAllLanguages, "onForAllLanguages");
        AbstractC22676k.m65750j(systemResources, "systemResources");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(processLifecycleOwner, "processLifecycleOwner");
        AbstractC22676k.m65750j(defaultLanguageDecider, "defaultLanguageDecider");
        AbstractC22676k.m65750j(languageRefresher, "languageRefresher");
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.languageApi = languageApi;
        this.preferenceHelper = preferenceHelper;
        this.userContext = userContext;
        this.appSupportedLanguages = appSupportedLanguages;
        this.onForAllLanguages = onForAllLanguages;
        this.systemResources = systemResources;
        this.buildConfigProvider = buildConfigProvider;
        this.coroutineScope = coroutineScope;
        this.processLifecycleOwner = processLifecycleOwner;
        this.defaultLanguageDecider = defaultLanguageDecider;
        this.languageRefresher = languageRefresher;
        this.prefsDataStore = prefsDataStore;
        this.logger = logger;
        if (!appSupportedLanguages.containsAll(onForAllLanguages)) {
            throw new IllegalStateException("onForAllLanguages must be a subset of appSupportedLanguages");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (r8 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (r8 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
    
        if (r8 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r8 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
    
        if (updateBackendLanguagePreference(r0) == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cacheAllowedLanguageListAndHeader(q83.InterfaceC30057d<? super l83.C23454a0> r8) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.LanguageRepository.cacheAllowedLanguageListAndHeader(q83.d):java.lang.Object");
    }

    private final void cacheComputedAllowedLanguageList(List<String> allowedLanguagesList) {
        this.preferenceHelper.putStringValueIntoLanguagePrefs(LanguageRepositoryKt.ALLOWED_LANGUAGES, AbstractC25265s.m74110N0(allowedLanguagesList, ",", null, null, null, 62));
    }

    private final void cacheComputedLanguageHeader(List<String> allowedLanguagesList) {
        String strM74110N0 = AbstractC25265s.m74110N0(allowedLanguagesList, ",", null, null, null, 62);
        String str = (String) AbstractC39414r.m125906y0(PreferenceHelper.getStringValueFromLanguagePrefs$default(this.preferenceHelper, LanguageRepositoryKt.ACCEPT_LANGUAGE_HEADER, null, 2, null), new String[]{","}, 6).get(0);
        this.preferenceHelper.putStringValueIntoLanguagePrefs(LanguageRepositoryKt.ACCEPT_LANGUAGE_HEADER, strM74110N0);
        this.logger.mo85216g(AbstractC11266d.m30461o("Cached accept language header: ", strM74110N0), new AbstractC30556a.a[0]);
        setAppLocaleList(allowedLanguagesList, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object computeAllowedLanguageListFromPreviouslyCachedList(String str, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return filterSystemLocalePreferences(AbstractC39414r.m125906y0(str, new String[]{","}, 6), interfaceC30057d);
    }

    private final boolean displayForUi(String locale) {
        return thisAppVersionHasStringsFor(locale) || thisAppVersionHasStringsFor((String) AbstractC25265s.m74096F0(AbstractC39414r.m125906y0(locale, new String[]{"-"}, 6))) || locale.equals(LanguageRepositoryKt.EURO_PORTUGUESE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r7 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAllowedLanguages(q83.InterfaceC30057d<? super java.util.List<java.lang.String>> r7) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.whoop.data.repositories.LanguageRepository.C65881
            if (r0 == 0) goto L13
            r0 = r7
            com.whoop.data.repositories.LanguageRepository$fetchAllowedLanguages$1 r0 = (com.whoop.data.repositories.LanguageRepository.C65881) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.repositories.LanguageRepository$fetchAllowedLanguages$1 r0 = new com.whoop.data.repositories.LanguageRepository$fetchAllowedLanguages$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            p505ts.AbstractC34132o.m107864I(r7)
            goto L84
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L65
        L41:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L59
        L45:
            p505ts.AbstractC34132o.m107864I(r7)
            od1.u r7 = r6.userContext
            boolean r7 = r7.m84058i()
            if (r7 == 0) goto L5c
            r0.label = r5
            java.lang.Object r7 = r6.getAllowedLanguagesAuthed(r0)
            if (r7 != r1) goto L59
            goto L81
        L59:
            java.util.List r7 = (java.util.List) r7
            goto L67
        L5c:
            r0.label = r4
            java.lang.Object r7 = r6.getAllowedLanguagesOnboarding(r0)
            if (r7 != r1) goto L65
            goto L81
        L65:
            java.util.List r7 = (java.util.List) r7
        L67:
            java.util.List r7 = r6.sanitizeAllowedLanguagesFromBackendForRegion(r7)
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r4 = 0
            if (r2 != 0) goto La5
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = r6.filterSystemLocalePreferences(r7, r0)
            if (r0 != r1) goto L82
        L81:
            return r1
        L82:
            r1 = r7
            r7 = r0
        L84:
            java.util.List r7 = (java.util.List) r7
            tr2.n r0 = r6.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "fetchAllowedLanguages filtered "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " to "
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            r2 = 0
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r2]
            r0.mo85228t(r1, r2)
            return r7
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.LanguageRepository.fetchAllowedLanguages(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object filterSystemLocalePreferences(List<String> list, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        C65901 c65901;
        if (interfaceC30057d instanceof C65901) {
            c65901 = (C65901) interfaceC30057d;
            int i13 = c65901.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65901.label = i13 - Integer.MIN_VALUE;
            } else {
                c65901 = new C65901(interfaceC30057d);
            }
        } else {
            c65901 = new C65901(interfaceC30057d);
        }
        Object objLocalesToUse = c65901.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c65901.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objLocalesToUse);
            c65901.L$0 = list;
            c65901.label = 1;
            objLocalesToUse = localesToUse(c65901);
            if (objLocalesToUse == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c65901.L$0;
            AbstractC34132o.m107864I(objLocalesToUse);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objLocalesToUse).iterator();
        while (it.hasNext()) {
            String strShouldInclude = shouldInclude((String) it.next(), list);
            if (strShouldInclude != null) {
                arrayList.add(strShouldInclude);
            }
        }
        return arrayList.isEmpty() ? AbstractC25265s.m74093D1(this.onForAllLanguages) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r14 == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAllowedLanguagesAuthed(q83.InterfaceC30057d<? super java.util.List<java.lang.String>> r14) throws java.lang.Exception {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.whoop.data.repositories.LanguageRepository.C65911
            if (r0 == 0) goto L14
            r0 = r14
            com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesAuthed$1 r0 = (com.whoop.data.repositories.LanguageRepository.C65911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesAuthed$1 r0 = new com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesAuthed$1
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r0 = r6.L$0
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r14)
            goto L7d
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L38:
            p505ts.AbstractC34132o.m107864I(r14)
            goto L48
        L3c:
            p505ts.AbstractC34132o.m107864I(r14)
            r6.label = r3
            java.lang.Object r14 = r13.localesToUse(r6)
            if (r14 != r0) goto L48
            goto L7c
        L48:
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L56
            java.lang.String r14 = "en-US"
            java.util.List r14 = wb3.AbstractC37056f.m118958J(r14)
        L56:
            r7 = r14
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r11 = 0
            r12 = 62
            java.lang.String r8 = ","
            r9 = 0
            r10 = 0
            java.lang.String r14 = m83.AbstractC25265s.m74110N0(r7, r8, r9, r10, r11, r12)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r3 = r2
            tr2.n r2 = r13.logger
            com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesAuthed$2 r5 = new com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesAuthed$2
            r4 = 0
            r5.<init>(r14, r4)
            r6.L$0 = r4
            r6.label = r3
            r3 = 0
            java.lang.String r4 = "Unable to retrieve allowed languages from Authed endpoint, returning empty list"
            java.lang.Object r14 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L7d
        L7c:
            return r0
        L7d:
            u02.a r14 = (u02.InterfaceC34385a) r14
            java.lang.Object r14 = u02.AbstractC34386b.m108737b(r14)
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L89
            m83.y r14 = m83.C25271y.f99162w
        L89:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.LanguageRepository.getAllowedLanguagesAuthed(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r14 == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAllowedLanguagesOnboarding(q83.InterfaceC30057d<? super java.util.List<java.lang.String>> r14) throws java.lang.Exception {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.whoop.data.repositories.LanguageRepository.C65931
            if (r0 == 0) goto L14
            r0 = r14
            com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesOnboarding$1 r0 = (com.whoop.data.repositories.LanguageRepository.C65931) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesOnboarding$1 r0 = new com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesOnboarding$1
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r0 = r6.L$0
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r14)
            goto L7d
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L38:
            p505ts.AbstractC34132o.m107864I(r14)
            goto L48
        L3c:
            p505ts.AbstractC34132o.m107864I(r14)
            r6.label = r3
            java.lang.Object r14 = r13.localesToUse(r6)
            if (r14 != r0) goto L48
            goto L7c
        L48:
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L56
            java.lang.String r14 = "en-US"
            java.util.List r14 = wb3.AbstractC37056f.m118958J(r14)
        L56:
            r7 = r14
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r11 = 0
            r12 = 62
            java.lang.String r8 = ","
            r9 = 0
            r10 = 0
            java.lang.String r14 = m83.AbstractC25265s.m74110N0(r7, r8, r9, r10, r11, r12)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r3 = r2
            tr2.n r2 = r13.logger
            com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesOnboarding$2 r5 = new com.whoop.data.repositories.LanguageRepository$getAllowedLanguagesOnboarding$2
            r4 = 0
            r5.<init>(r14, r4)
            r6.L$0 = r4
            r6.label = r3
            r3 = 0
            java.lang.String r4 = "Unable to retrieve allowed languages from Onboarding endpoint, returning empty list"
            java.lang.Object r14 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L7d
        L7c:
            return r0
        L7d:
            u02.a r14 = (u02.InterfaceC34385a) r14
            java.lang.Object r14 = u02.AbstractC34386b.m108737b(r14)
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L89
            m83.y r14 = m83.C25271y.f99162w
        L89:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.LanguageRepository.getAllowedLanguagesOnboarding(q83.d):java.lang.Object");
    }

    private final String getComputedAllowedLanguageList() {
        return PreferenceHelper.getStringValueFromLanguagePrefs$default(this.preferenceHelper, LanguageRepositoryKt.ALLOWED_LANGUAGES, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object getEnabledLanguages(InterfaceC30057d<? super List<String>> interfaceC30057d) throws Exception {
        C65951 c65951;
        if (interfaceC30057d instanceof C65951) {
            c65951 = (C65951) interfaceC30057d;
            int i13 = c65951.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65951.label = i13 - Integer.MIN_VALUE;
            } else {
                c65951 = new C65951(interfaceC30057d);
            }
        } else {
            c65951 = new C65951(interfaceC30057d);
        }
        C65951 c65952 = c65951;
        Object objM108730a = c65952.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65952.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108730a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            C65962 c65962 = new C65962(null);
            c65952.label = 1;
            objM108730a = companion.m108730a(interfaceC34116n, null, "Unable to retrieve enabled languages, returning empty list", c65962, c65952);
            if (objM108730a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108730a);
        }
        List list = (List) AbstractC34386b.m108737b((InterfaceC34385a) objM108730a);
        return list == null ? C25271y.f99162w : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object isFirstPreferredLanguageOnForAll(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C65971 c65971;
        if (interfaceC30057d instanceof C65971) {
            c65971 = (C65971) interfaceC30057d;
            int i13 = c65971.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65971.label = i13 - Integer.MIN_VALUE;
            } else {
                c65971 = new C65971(interfaceC30057d);
            }
        } else {
            c65971 = new C65971(interfaceC30057d);
        }
        Object objLocalesToUse = c65971.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c65971.label;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objLocalesToUse);
            c65971.label = 1;
            objLocalesToUse = localesToUse(c65971);
            if (objLocalesToUse == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objLocalesToUse);
        }
        Locale localeForLanguageTag = Locale.forLanguageTag((String) AbstractC25265s.m74096F0((List) objLocalesToUse));
        Set<String> set = this.onForAllLanguages;
        if ((set instanceof Collection) && set.isEmpty()) {
            z4 = false;
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (!AbstractC22676k.m65745e(localeForLanguageTag.getLanguage(), new Locale((String) it.next()).getLanguage()) || !DefaultLanguageDecider.INSTANCE.allowedByRegion(localeForLanguageTag)) {
                }
            }
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotEnglish(String language) {
        return !AbstractC22676k.m65745e(Locale.forLanguageTag(language).getLanguage(), Locale.ENGLISH.getLanguage());
    }

    private final boolean isOnForAll(String localeString) {
        return this.onForAllLanguages.contains(localeString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object localesToUse(InterfaceC30057d<? super List<String>> interfaceC30057d) {
        C65981 c65981;
        if (interfaceC30057d instanceof C65981) {
            c65981 = (C65981) interfaceC30057d;
            int i13 = c65981.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65981.label = i13 - Integer.MIN_VALUE;
            } else {
                c65981 = new C65981(interfaceC30057d);
            }
        } else {
            c65981 = new C65981(interfaceC30057d);
        }
        Object objM36575A = c65981.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65981.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l data = this.prefsDataStore.getData();
            c65981.label = 1;
            objM36575A = AbstractC13091v.m36575A(data, c65981);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
        }
        if (AbstractC22676k.m65745e(((AbstractC14134f) objM36575A).mo40227b(LanguageRepositoryKt.getKEY_USER_LANGUAGE_OVERRIDE()), Boolean.TRUE)) {
            String strM7703e = this.systemResources.mo85332b().m7703e();
            AbstractC22676k.m65749i(strM7703e, "toLanguageTags(...)");
            return AbstractC39414r.m125906y0(strM7703e, new String[]{","}, 6);
        }
        String strM7703e2 = this.systemResources.mo85331a().m7703e();
        AbstractC22676k.m65749i(strM7703e2, "toLanguageTags(...)");
        return AbstractC39414r.m125906y0(strM7703e2, new String[]{","}, 6);
    }

    private final boolean pseudoLocale(String localeString) {
        return AbstractC22676k.m65745e(localeString, "en-XA") && this.buildConfigProvider.getDebuggable();
    }

    private final boolean regionMatch(String localeString, Collection<String> acceptedLanguages) {
        return AbstractC22676k.m65745e(localeString, LanguageRepositoryKt.EURO_PORTUGUESE) && acceptedLanguages.contains(LanguageRepositoryKt.EURO_PORTUGUESE);
    }

    private final void removeCachedLanguageData() {
        this.preferenceHelper.putStringValueIntoLanguagePrefs(LanguageRepositoryKt.ACCEPT_LANGUAGE_HEADER, LanguageRepositoryKt.DEFAULT_LANGUAGE);
        this.preferenceHelper.putStringValueIntoLanguagePrefs(LanguageRepositoryKt.ALLOWED_LANGUAGES, "");
    }

    private final List<String> sanitizeAllowedLanguagesFromBackendForRegion(List<String> allowedLanguagesFromBackend) {
        List<String> list = allowedLanguagesFromBackend;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (String str : list) {
            if (AbstractC22676k.m65745e(str, "pt")) {
                str = LanguageRepositoryKt.EURO_PORTUGUESE;
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    private final void setAppLocaleList(List<String> allowedLanguagesList, String oldLanguage) {
        String str = (String) AbstractC25265s.m74096F0(allowedLanguagesList);
        Locale locale = (Locale) AbstractC25265s.m74100H0(AbstractC28202t0.m85350a(this.systemResources.mo85331a()));
        this.logger.mo85228t("setAppLocaleList setAppLocaleList=" + locale + " newLanguage=" + str + " oldLanguage=" + oldLanguage, new AbstractC30556a.a[0]);
        C2728g c2728gM7698a = (AbstractC22676k.m65745e(str, locale != null ? locale.getLanguage() : null) && DefaultLanguageDecider.INSTANCE.allowedByRegion(locale)) ? C2728g.f10738b : C2728g.m7698a(AbstractC25265s.m74110N0(allowedLanguagesList, ",", null, null, null, 62));
        AbstractC22676k.m65747g(c2728gM7698a);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5019i(this.processLifecycleOwner.getLifecycle()), null, null, new C66011(c2728gM7698a, str, oldLanguage, null), 3);
    }

    private final String shouldInclude(String locale, Collection<String> acceptedLanguages) {
        if (!pseudoLocale(locale) && ((!acceptedLanguages.contains(locale) || !thisAppVersionHasStringsFor(locale)) && !isOnForAll(locale))) {
            String str = (String) AbstractC25265s.m74096F0(AbstractC39414r.m125906y0(locale, new String[]{"-"}, 6));
            DefaultLanguageDecider.Companion companion = DefaultLanguageDecider.INSTANCE;
            Locale localeForLanguageTag = Locale.forLanguageTag(locale);
            AbstractC22676k.m65749i(localeForLanguageTag, "forLanguageTag(...)");
            if (companion.allowedByRegion(localeForLanguageTag) && ((acceptedLanguages.contains(str) && thisAppVersionHasStringsFor(str)) || isOnForAll(str))) {
                return str;
            }
            if (!regionMatch(locale, acceptedLanguages)) {
                return null;
            }
        }
        return locale;
    }

    private final boolean thisAppVersionHasStringsFor(String localeString) {
        return this.appSupportedLanguages.contains(localeString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateBackendLanguagePreference(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Exception {
        Object objM108730a = InterfaceC34385a.INSTANCE.m108730a(this.logger, null, "Unable to report app locale to backend", new C66042(null), interfaceC30057d);
        return objM108730a == EnumC31071a.f128113w ? objM108730a : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updatedAllowedLanguageList(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Exception {
        C66051 c66051;
        if (interfaceC30057d instanceof C66051) {
            c66051 = (C66051) interfaceC30057d;
            int i13 = c66051.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66051.label = i13 - Integer.MIN_VALUE;
            } else {
                c66051 = new C66051(interfaceC30057d);
            }
        } else {
            c66051 = new C66051(interfaceC30057d);
        }
        Object objFetchAllowedLanguages = c66051.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c66051.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objFetchAllowedLanguages);
            c66051.label = 1;
            objFetchAllowedLanguages = fetchAllowedLanguages(c66051);
            if (objFetchAllowedLanguages == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objFetchAllowedLanguages);
        }
        List<String> list = (List) objFetchAllowedLanguages;
        if (list != null) {
            cacheComputedAllowedLanguageList(list);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchAllowedLanguagesForUi(InterfaceC30057d<? super List<String>> interfaceC30057d) throws Exception {
        C65891 c65891;
        if (interfaceC30057d instanceof C65891) {
            c65891 = (C65891) interfaceC30057d;
            int i13 = c65891.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65891.label = i13 - Integer.MIN_VALUE;
            } else {
                c65891 = new C65891(interfaceC30057d);
            }
        } else {
            c65891 = new C65891(interfaceC30057d);
        }
        Object enabledLanguages = c65891.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c65891.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(enabledLanguages);
            c65891.label = 1;
            enabledLanguages = getEnabledLanguages(c65891);
            if (enabledLanguages == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(enabledLanguages);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) enabledLanguages) {
            if (displayForUi((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList.isEmpty() ? AbstractC25265s.m74093D1(this.onForAllLanguages) : arrayList;
    }

    @Override // com.whoop.data.repositories.LanguageChecker
    public Locale getAllowedLanguage() {
        return INSTANCE.obtainAllowedLanguage(this.systemResources, this.preferenceHelper, this.defaultLanguageDecider);
    }

    public final String getHeader() {
        return PreferenceHelper.getStringValueFromLanguagePrefs$default(this.preferenceHelper, LanguageRepositoryKt.ACCEPT_LANGUAGE_HEADER, null, 2, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        super.onCreate(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (updatedAllowedLanguageList(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLanguageChanged(q83.InterfaceC30057d<? super l83.C23454a0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.whoop.data.repositories.LanguageRepository.C65991
            if (r0 == 0) goto L13
            r0 = r6
            com.whoop.data.repositories.LanguageRepository$onLanguageChanged$1 r0 = (com.whoop.data.repositories.LanguageRepository.C65991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.repositories.LanguageRepository$onLanguageChanged$1 r0 = new com.whoop.data.repositories.LanguageRepository$onLanguageChanged$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r6)
            goto L4e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L45
        L36:
            p505ts.AbstractC34132o.m107864I(r6)
            r5.removeCachedLanguageData()
            r0.label = r4
            java.lang.Object r6 = r5.cacheAllowedLanguageListAndHeader(r0)
            if (r6 != r1) goto L45
            goto L4d
        L45:
            r0.label = r3
            java.lang.Object r6 = r5.updatedAllowedLanguageList(r0)
            if (r6 != r1) goto L4e
        L4d:
            return r1
        L4e:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.LanguageRepository.onLanguageChanged(q83.d):java.lang.Object");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new C66001(null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LanguageRepository(LanguageApi languageApi, PreferenceHelper preferenceHelper, C27858u c27858u, Set set, Set set2, InterfaceC28197r1 interfaceC28197r1, C28162g c28162g, InterfaceC2994c0 interfaceC2994c0, InterfaceC1585g0 interfaceC1585g0, DefaultLanguageDecider defaultLanguageDecider, InterfaceC23462h interfaceC23462h, InterfaceC0422g interfaceC0422g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC2994c0 interfaceC2994c0M8708b;
        if ((i13 & 128) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0M8708b = AbstractC3006f0.m8708b(AbstractC17182o.f65999a.mo8825s().plus(AbstractC3006f0.m8710d()));
        } else {
            interfaceC2994c0M8708b = interfaceC2994c0;
        }
        this(languageApi, preferenceHelper, c27858u, set, set2, interfaceC28197r1, c28162g, interfaceC2994c0M8708b, interfaceC1585g0, defaultLanguageDecider, interfaceC23462h, interfaceC0422g, (i13 & 4096) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LanguageRepository") : interfaceC34116n);
    }
}
