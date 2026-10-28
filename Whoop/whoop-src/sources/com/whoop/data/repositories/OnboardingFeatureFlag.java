package com.whoop.data.repositories;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IN_APP_JOIN_FLOW_SHIPPING_TILES' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b<\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@¨\u0006A"}, m65681d2 = {"Lcom/whoop/data/repositories/OnboardingFeatureFlag;", "", "flagName", "", "onboardingOnly", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getFlagName", "()Ljava/lang/String;", "getOnboardingOnly", "()Z", "APP_DESTINATION_ANDROID", "FIX_HOME_FLASH_ON_REENTRY", "APP_DESTINATION_TRIAL_ORDERED_ANDROID", "APP_DESTINATION_CACHE", "HW_ONLY_ON_COMPLETE_ANDROID", "HW_ONLY_PERMISSION_SUBMISSION_ANDROID", "HW_ONLY_BOOTSTRAP_SESSION_ANDROID", "IN_APP_JOIN_FLOW_SHIPPING_TILES", "IN_APP_JOIN_FLOW_SHIPPING_INFO", "IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT", "IAJF_PREPAIDS_UC_BACK_ANDROID", "NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID", "CREDENTIAL_MANAGER_ANDROID", "EMAIL_DIALOG_TEXT_STYLING", "EMAIL_FIRST_BACK_NAV_FIX", "HOME_XP", "HOME_GLOW_HUG", "DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC", "DAY_ZERO_CALENDAR_BLOCK", "HOME_ONBOARDING_FUTURE_IA", "UPCYCLE_ONBOARDING_ANDROID", "FEATURE_FLAG_FETCH_V2", "LOGIN_REDIRECT_DIALOG_ENABLED", "SKIP_PAIRING_IF_ALREADY_PAIRED", "HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE", "IMAGE_LANGUAGE_SUPPORT_ANDROID", "PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT", "CC_SCREEN_INPUT_HANDLING", "MOBILE_SCREEN_ERROR_OBSERVABILITY", "FASTER_DEVICE_EDUCATION", "FAMILY_PLAN_STARTER_ANDROID", "KT_SERIALIZATION_ACTIVATION", "DROID_IAJF_LOGIN_NAVIGATION", "PASSWORD_RESET_FLOW", "KT_SERIALIZATION_AUTH_SERVICE", "KT_SERIALIZATION_BOOTSTRAP_API", "KT_SERIALIZATION_MEMBERSHIP_V0", "ANDROID_SEON_LOGIN", "ANDROID_SEON_LOGIN_RETRY", "ANDROID_SEON_PW_SCREEN", "ANDROID_SEON_CHECKOUT", "EMPTY_RESPONSE_BODY_HANDLING", "ONBOARDING_CASTLE_DISCOVERY", "ONBOARDING_TOKEN_RECOVERY", "ACCOUNT_TRANSITION_SESSION_AWARE_AUTH", "ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK", "LOCALE_HEADER", "ONBOARDING_ARABIC_LANGUAGE_ENABLED", "MFA_DOUBLE_POP", "PAIRING_COMPLETION_DESTINATION_NAV", "PLAN_PICKER_DESTINATION_NAV", "STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING", "ENABLE_SOFTWARE_TOKEN_MFA_ANDROID", "feature-flag_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OnboardingFeatureFlag {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ OnboardingFeatureFlag[] $VALUES;
    public static final OnboardingFeatureFlag FAMILY_PLAN_STARTER_ANDROID;
    public static final OnboardingFeatureFlag IN_APP_JOIN_FLOW_SHIPPING_TILES;
    public static final OnboardingFeatureFlag IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT;
    public static final OnboardingFeatureFlag KT_SERIALIZATION_MEMBERSHIP_V0;
    private final String flagName;
    private final boolean onboardingOnly;
    public static final OnboardingFeatureFlag APP_DESTINATION_ANDROID = new OnboardingFeatureFlag("APP_DESTINATION_ANDROID", 0, "android-app-destination", false);
    public static final OnboardingFeatureFlag FIX_HOME_FLASH_ON_REENTRY = new OnboardingFeatureFlag("FIX_HOME_FLASH_ON_REENTRY", 1, "android-fix-home-flash-on-reentry", false);
    public static final OnboardingFeatureFlag APP_DESTINATION_TRIAL_ORDERED_ANDROID = new OnboardingFeatureFlag("APP_DESTINATION_TRIAL_ORDERED_ANDROID", 2, "app-destination-trial-ordered-android", false);
    public static final OnboardingFeatureFlag APP_DESTINATION_CACHE = new OnboardingFeatureFlag("APP_DESTINATION_CACHE", 3, "android-app-destination-cache", false);
    public static final OnboardingFeatureFlag HW_ONLY_ON_COMPLETE_ANDROID = new OnboardingFeatureFlag("HW_ONLY_ON_COMPLETE_ANDROID", 4, "android-hw-only-on-complete", false);
    public static final OnboardingFeatureFlag HW_ONLY_PERMISSION_SUBMISSION_ANDROID = new OnboardingFeatureFlag("HW_ONLY_PERMISSION_SUBMISSION_ANDROID", 5, "android-hw-only-permission-submission", false);
    public static final OnboardingFeatureFlag HW_ONLY_BOOTSTRAP_SESSION_ANDROID = new OnboardingFeatureFlag("HW_ONLY_BOOTSTRAP_SESSION_ANDROID", 6, "android-hw-only-bootstrap-session", false);
    public static final OnboardingFeatureFlag IN_APP_JOIN_FLOW_SHIPPING_INFO = new OnboardingFeatureFlag("IN_APP_JOIN_FLOW_SHIPPING_INFO", 8, "in-app-join-flow-android-shipping-info-onboarding", false);
    public static final OnboardingFeatureFlag IAJF_PREPAIDS_UC_BACK_ANDROID = new OnboardingFeatureFlag("IAJF_PREPAIDS_UC_BACK_ANDROID", 10, "iajf-prepaids-uc-back-android", false, 2, null);
    public static final OnboardingFeatureFlag NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID = new OnboardingFeatureFlag("NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID", 11, "native-store-match-any-iajf-source-android", false, 2, null);
    public static final OnboardingFeatureFlag CREDENTIAL_MANAGER_ANDROID = new OnboardingFeatureFlag("CREDENTIAL_MANAGER_ANDROID", 12, "credential-manager-android", false, 2, null);
    public static final OnboardingFeatureFlag EMAIL_DIALOG_TEXT_STYLING = new OnboardingFeatureFlag("EMAIL_DIALOG_TEXT_STYLING", 13, "email-first-dialog-text-styling-android", false, 2, null);
    public static final OnboardingFeatureFlag EMAIL_FIRST_BACK_NAV_FIX = new OnboardingFeatureFlag("EMAIL_FIRST_BACK_NAV_FIX", 14, "email-first-back-nav-fix", false, 2, null);
    public static final OnboardingFeatureFlag HOME_XP = new OnboardingFeatureFlag("HOME_XP", 15, "home-xp", false);
    public static final OnboardingFeatureFlag HOME_GLOW_HUG = new OnboardingFeatureFlag("HOME_GLOW_HUG", 16, "home-glow-hug", false);
    public static final OnboardingFeatureFlag DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC = new OnboardingFeatureFlag("DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC", 17, "disable-animations-until-activity-gets-updated-logic", false);
    public static final OnboardingFeatureFlag DAY_ZERO_CALENDAR_BLOCK = new OnboardingFeatureFlag("DAY_ZERO_CALENDAR_BLOCK", 18, "day-zero-calendar-block", false);
    public static final OnboardingFeatureFlag HOME_ONBOARDING_FUTURE_IA = new OnboardingFeatureFlag("HOME_ONBOARDING_FUTURE_IA", 19, "home-onboarding-future-ia", false);
    public static final OnboardingFeatureFlag UPCYCLE_ONBOARDING_ANDROID = new OnboardingFeatureFlag("UPCYCLE_ONBOARDING_ANDROID", 20, "upcycle-onboarding-android", true);
    public static final OnboardingFeatureFlag FEATURE_FLAG_FETCH_V2 = new OnboardingFeatureFlag("FEATURE_FLAG_FETCH_V2", 21, "android-feature-flag-fetch-v2", false);
    public static final OnboardingFeatureFlag LOGIN_REDIRECT_DIALOG_ENABLED = new OnboardingFeatureFlag("LOGIN_REDIRECT_DIALOG_ENABLED", 22, "login-redirect-dialog-enabled-android", false, 2, null);
    public static final OnboardingFeatureFlag SKIP_PAIRING_IF_ALREADY_PAIRED = new OnboardingFeatureFlag("SKIP_PAIRING_IF_ALREADY_PAIRED", 23, "skip-pairing-if-already-paired-android", false, 2, null);
    public static final OnboardingFeatureFlag HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE = new OnboardingFeatureFlag("HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE", 24, "remove-scooter-trial-text-override-android", false, 2, null);
    public static final OnboardingFeatureFlag IMAGE_LANGUAGE_SUPPORT_ANDROID = new OnboardingFeatureFlag("IMAGE_LANGUAGE_SUPPORT_ANDROID", 25, "image-language-support-android", false);
    public static final OnboardingFeatureFlag PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT = new OnboardingFeatureFlag("PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT", 26, "pairing-first-membership-adjustment-android", false);
    public static final OnboardingFeatureFlag CC_SCREEN_INPUT_HANDLING = new OnboardingFeatureFlag("CC_SCREEN_INPUT_HANDLING", 27, "android-cc-input-error-handling", false);
    public static final OnboardingFeatureFlag MOBILE_SCREEN_ERROR_OBSERVABILITY = new OnboardingFeatureFlag("MOBILE_SCREEN_ERROR_OBSERVABILITY", 28, "maverick-screen-error-observability", false);
    public static final OnboardingFeatureFlag FASTER_DEVICE_EDUCATION = new OnboardingFeatureFlag("FASTER_DEVICE_EDUCATION", 29, "faster-device-education-android", false, 2, null);
    public static final OnboardingFeatureFlag KT_SERIALIZATION_ACTIVATION = new OnboardingFeatureFlag("KT_SERIALIZATION_ACTIVATION", 31, "kt-serialization-activation", false);
    public static final OnboardingFeatureFlag DROID_IAJF_LOGIN_NAVIGATION = new OnboardingFeatureFlag("DROID_IAJF_LOGIN_NAVIGATION", 32, "droid-iajf-log-in-navigation", false);
    public static final OnboardingFeatureFlag PASSWORD_RESET_FLOW = new OnboardingFeatureFlag("PASSWORD_RESET_FLOW", 33, "password-reset-flow-android", false);
    public static final OnboardingFeatureFlag KT_SERIALIZATION_AUTH_SERVICE = new OnboardingFeatureFlag("KT_SERIALIZATION_AUTH_SERVICE", 34, "kt-serialization-auth-service", false);
    public static final OnboardingFeatureFlag KT_SERIALIZATION_BOOTSTRAP_API = new OnboardingFeatureFlag("KT_SERIALIZATION_BOOTSTRAP_API", 35, "kt-serialization-bootstrap-api", false, 2, null);
    public static final OnboardingFeatureFlag ANDROID_SEON_LOGIN = new OnboardingFeatureFlag("ANDROID_SEON_LOGIN", 37, "android-seon-login", false);
    public static final OnboardingFeatureFlag ANDROID_SEON_LOGIN_RETRY = new OnboardingFeatureFlag("ANDROID_SEON_LOGIN_RETRY", 38, "android-seon-login-retry", false);
    public static final OnboardingFeatureFlag ANDROID_SEON_PW_SCREEN = new OnboardingFeatureFlag("ANDROID_SEON_PW_SCREEN", 39, "android-seon-pw-screen", false);
    public static final OnboardingFeatureFlag ANDROID_SEON_CHECKOUT = new OnboardingFeatureFlag("ANDROID_SEON_CHECKOUT", 40, "android-seon-checkout", false);
    public static final OnboardingFeatureFlag EMPTY_RESPONSE_BODY_HANDLING = new OnboardingFeatureFlag("EMPTY_RESPONSE_BODY_HANDLING", 41, "android-empty-response-body-handling", false);
    public static final OnboardingFeatureFlag ONBOARDING_CASTLE_DISCOVERY = new OnboardingFeatureFlag("ONBOARDING_CASTLE_DISCOVERY", 42, "droid-castle-discovery-onboarding", false);
    public static final OnboardingFeatureFlag ONBOARDING_TOKEN_RECOVERY = new OnboardingFeatureFlag("ONBOARDING_TOKEN_RECOVERY", 43, "onboarding-token-recovery-android", false);
    public static final OnboardingFeatureFlag ACCOUNT_TRANSITION_SESSION_AWARE_AUTH = new OnboardingFeatureFlag("ACCOUNT_TRANSITION_SESSION_AWARE_AUTH", 44, "account-transition-session-aware-auth-android", false);
    public static final OnboardingFeatureFlag ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK = new OnboardingFeatureFlag("ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK", 45, "remove-account-creation-strap-check-android", false);
    public static final OnboardingFeatureFlag LOCALE_HEADER = new OnboardingFeatureFlag("LOCALE_HEADER", 46, "locale-header-onboarding-droid", true);
    public static final OnboardingFeatureFlag ONBOARDING_ARABIC_LANGUAGE_ENABLED = new OnboardingFeatureFlag("ONBOARDING_ARABIC_LANGUAGE_ENABLED", 47, "onboarding-arabic-language-enabled-android", true);
    public static final OnboardingFeatureFlag MFA_DOUBLE_POP = new OnboardingFeatureFlag("MFA_DOUBLE_POP", 48, "mfa-double-pop", false);
    public static final OnboardingFeatureFlag PAIRING_COMPLETION_DESTINATION_NAV = new OnboardingFeatureFlag("PAIRING_COMPLETION_DESTINATION_NAV", 49, "pairing-completion-destination-nav-android", false);
    public static final OnboardingFeatureFlag PLAN_PICKER_DESTINATION_NAV = new OnboardingFeatureFlag("PLAN_PICKER_DESTINATION_NAV", 50, "plan-picker-destination-nav-android", false, 2, null);
    public static final OnboardingFeatureFlag STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING = new OnboardingFeatureFlag("STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING", 51, "android-strap-lock-unlock-enabled-onboarding", false);
    public static final OnboardingFeatureFlag ENABLE_SOFTWARE_TOKEN_MFA_ANDROID = new OnboardingFeatureFlag("ENABLE_SOFTWARE_TOKEN_MFA_ANDROID", 52, "enable-software-token-mfa-android", false);

    private static final /* synthetic */ OnboardingFeatureFlag[] $values() {
        return new OnboardingFeatureFlag[]{APP_DESTINATION_ANDROID, FIX_HOME_FLASH_ON_REENTRY, APP_DESTINATION_TRIAL_ORDERED_ANDROID, APP_DESTINATION_CACHE, HW_ONLY_ON_COMPLETE_ANDROID, HW_ONLY_PERMISSION_SUBMISSION_ANDROID, HW_ONLY_BOOTSTRAP_SESSION_ANDROID, IN_APP_JOIN_FLOW_SHIPPING_TILES, IN_APP_JOIN_FLOW_SHIPPING_INFO, IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT, IAJF_PREPAIDS_UC_BACK_ANDROID, NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID, CREDENTIAL_MANAGER_ANDROID, EMAIL_DIALOG_TEXT_STYLING, EMAIL_FIRST_BACK_NAV_FIX, HOME_XP, HOME_GLOW_HUG, DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC, DAY_ZERO_CALENDAR_BLOCK, HOME_ONBOARDING_FUTURE_IA, UPCYCLE_ONBOARDING_ANDROID, FEATURE_FLAG_FETCH_V2, LOGIN_REDIRECT_DIALOG_ENABLED, SKIP_PAIRING_IF_ALREADY_PAIRED, HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE, IMAGE_LANGUAGE_SUPPORT_ANDROID, PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT, CC_SCREEN_INPUT_HANDLING, MOBILE_SCREEN_ERROR_OBSERVABILITY, FASTER_DEVICE_EDUCATION, FAMILY_PLAN_STARTER_ANDROID, KT_SERIALIZATION_ACTIVATION, DROID_IAJF_LOGIN_NAVIGATION, PASSWORD_RESET_FLOW, KT_SERIALIZATION_AUTH_SERVICE, KT_SERIALIZATION_BOOTSTRAP_API, KT_SERIALIZATION_MEMBERSHIP_V0, ANDROID_SEON_LOGIN, ANDROID_SEON_LOGIN_RETRY, ANDROID_SEON_PW_SCREEN, ANDROID_SEON_CHECKOUT, EMPTY_RESPONSE_BODY_HANDLING, ONBOARDING_CASTLE_DISCOVERY, ONBOARDING_TOKEN_RECOVERY, ACCOUNT_TRANSITION_SESSION_AWARE_AUTH, ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK, LOCALE_HEADER, ONBOARDING_ARABIC_LANGUAGE_ENABLED, MFA_DOUBLE_POP, PAIRING_COMPLETION_DESTINATION_NAV, PLAN_PICKER_DESTINATION_NAV, STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING, ENABLE_SOFTWARE_TOKEN_MFA_ANDROID};
    }

    static {
        int i13 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z4 = false;
        IN_APP_JOIN_FLOW_SHIPPING_TILES = new OnboardingFeatureFlag("IN_APP_JOIN_FLOW_SHIPPING_TILES", 7, "iajf-shipping-preview-tile-android", z4, i13, defaultConstructorMarker);
        IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT = new OnboardingFeatureFlag("IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT", 9, "iajf-universal-checkout-zero-dollar-payment-android", z4, i13, defaultConstructorMarker);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        FAMILY_PLAN_STARTER_ANDROID = new OnboardingFeatureFlag("FAMILY_PLAN_STARTER_ANDROID", 30, "family-plan-explainer-android", false, 2, defaultConstructorMarker2);
        KT_SERIALIZATION_MEMBERSHIP_V0 = new OnboardingFeatureFlag("KT_SERIALIZATION_MEMBERSHIP_V0", 36, "kt-serialization-membership-v0", false, 2, defaultConstructorMarker2);
        OnboardingFeatureFlag[] onboardingFeatureFlagArr$values = $values();
        $VALUES = onboardingFeatureFlagArr$values;
        $ENTRIES = AbstractC15751g.m44468u(onboardingFeatureFlagArr$values);
    }

    private OnboardingFeatureFlag(String str, int i13, String str2, boolean z4) {
        super(str, i13);
        this.flagName = str2;
        this.onboardingOnly = z4;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static OnboardingFeatureFlag valueOf(String str) {
        return (OnboardingFeatureFlag) Enum.valueOf(OnboardingFeatureFlag.class, str);
    }

    public static OnboardingFeatureFlag[] values() {
        return (OnboardingFeatureFlag[]) $VALUES.clone();
    }

    public final String getFlagName() {
        return this.flagName;
    }

    public final boolean getOnboardingOnly() {
        return this.onboardingOnly;
    }

    public /* synthetic */ OnboardingFeatureFlag(String str, int i13, String str2, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, (i14 & 2) != 0 ? true : z4);
    }
}
