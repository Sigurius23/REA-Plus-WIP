package com.whoop.data.repositories;

import ge3.AbstractC15751g;
import java.util.Locale;
import p138f6.C14132d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, m65681d2 = {"", LanguageRepositoryKt.ALLOWED_LANGUAGES, "Ljava/lang/String;", LanguageRepositoryKt.ACCEPT_LANGUAGE_HEADER, "DEFAULT_LANGUAGE", "ENGLISH_LANGUAGE_WITH_LOCALE", "ENGLISH_PSEUDOLOCALE", "LANGUAGE_PREFS_NAME", "EURO_PORTUGUESE", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "ARABIC", "Ljava/util/Locale;", "Lf6/d;", "", "KEY_SHOW_LANGUAGE_MODAL", "Lf6/d;", "getKEY_SHOW_LANGUAGE_MODAL", "()Lf6/d;", "KEY_USER_LANGUAGE_OVERRIDE", "getKEY_USER_LANGUAGE_OVERRIDE", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LanguageRepositoryKt {
    public static final String ACCEPT_LANGUAGE_HEADER = "ACCEPT_LANGUAGE_HEADER";
    public static final String ALLOWED_LANGUAGES = "ALLOWED_LANGUAGES";
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String ENGLISH_LANGUAGE_WITH_LOCALE = "en-us";
    private static final String ENGLISH_PSEUDOLOCALE = "en-XA";
    public static final String EURO_PORTUGUESE = "pt-PT";
    public static final String LANGUAGE_PREFS_NAME = "LanguagePrefs";
    private static final Locale ARABIC = Locale.forLanguageTag("ar");
    private static final C14132d KEY_SHOW_LANGUAGE_MODAL = AbstractC15751g.m44453f("ShowLanguageModal");
    private static final C14132d KEY_USER_LANGUAGE_OVERRIDE = AbstractC15751g.m44453f("user-did-in-app-language-picker-override");

    public static final C14132d getKEY_SHOW_LANGUAGE_MODAL() {
        return KEY_SHOW_LANGUAGE_MODAL;
    }

    public static final C14132d getKEY_USER_LANGUAGE_OVERRIDE() {
        return KEY_USER_LANGUAGE_OVERRIDE;
    }
}
