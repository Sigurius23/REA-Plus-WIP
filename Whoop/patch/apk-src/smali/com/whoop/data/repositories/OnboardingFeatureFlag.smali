.class public final enum Lcom/whoop/data/repositories/OnboardingFeatureFlag;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008<\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*j\u0002\u0008+j\u0002\u0008,j\u0002\u0008-j\u0002\u0008.j\u0002\u0008/j\u0002\u00080j\u0002\u00081j\u0002\u00082j\u0002\u00083j\u0002\u00084j\u0002\u00085j\u0002\u00086j\u0002\u00087j\u0002\u00088j\u0002\u00089j\u0002\u0008:j\u0002\u0008;j\u0002\u0008<j\u0002\u0008=j\u0002\u0008>j\u0002\u0008?j\u0002\u0008@\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
        "",
        "flagName",
        "",
        "onboardingOnly",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Z)V",
        "getFlagName",
        "()Ljava/lang/String;",
        "getOnboardingOnly",
        "()Z",
        "APP_DESTINATION_ANDROID",
        "FIX_HOME_FLASH_ON_REENTRY",
        "APP_DESTINATION_TRIAL_ORDERED_ANDROID",
        "APP_DESTINATION_CACHE",
        "HW_ONLY_ON_COMPLETE_ANDROID",
        "HW_ONLY_PERMISSION_SUBMISSION_ANDROID",
        "HW_ONLY_BOOTSTRAP_SESSION_ANDROID",
        "IN_APP_JOIN_FLOW_SHIPPING_TILES",
        "IN_APP_JOIN_FLOW_SHIPPING_INFO",
        "IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT",
        "IAJF_PREPAIDS_UC_BACK_ANDROID",
        "NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID",
        "CREDENTIAL_MANAGER_ANDROID",
        "EMAIL_DIALOG_TEXT_STYLING",
        "EMAIL_FIRST_BACK_NAV_FIX",
        "HOME_XP",
        "HOME_GLOW_HUG",
        "DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC",
        "DAY_ZERO_CALENDAR_BLOCK",
        "HOME_ONBOARDING_FUTURE_IA",
        "UPCYCLE_ONBOARDING_ANDROID",
        "FEATURE_FLAG_FETCH_V2",
        "LOGIN_REDIRECT_DIALOG_ENABLED",
        "SKIP_PAIRING_IF_ALREADY_PAIRED",
        "HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE",
        "IMAGE_LANGUAGE_SUPPORT_ANDROID",
        "PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT",
        "CC_SCREEN_INPUT_HANDLING",
        "MOBILE_SCREEN_ERROR_OBSERVABILITY",
        "FASTER_DEVICE_EDUCATION",
        "FAMILY_PLAN_STARTER_ANDROID",
        "KT_SERIALIZATION_ACTIVATION",
        "DROID_IAJF_LOGIN_NAVIGATION",
        "PASSWORD_RESET_FLOW",
        "KT_SERIALIZATION_AUTH_SERVICE",
        "KT_SERIALIZATION_BOOTSTRAP_API",
        "KT_SERIALIZATION_MEMBERSHIP_V0",
        "ANDROID_SEON_LOGIN",
        "ANDROID_SEON_LOGIN_RETRY",
        "ANDROID_SEON_PW_SCREEN",
        "ANDROID_SEON_CHECKOUT",
        "EMPTY_RESPONSE_BODY_HANDLING",
        "ONBOARDING_CASTLE_DISCOVERY",
        "ONBOARDING_TOKEN_RECOVERY",
        "ACCOUNT_TRANSITION_SESSION_AWARE_AUTH",
        "ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK",
        "LOCALE_HEADER",
        "ONBOARDING_ARABIC_LANGUAGE_ENABLED",
        "MFA_DOUBLE_POP",
        "PAIRING_COMPLETION_DESTINATION_NAV",
        "PLAN_PICKER_DESTINATION_NAV",
        "STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING",
        "ENABLE_SOFTWARE_TOKEN_MFA_ANDROID",
        "feature-flag_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ACCOUNT_TRANSITION_SESSION_AWARE_AUTH:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ANDROID_SEON_CHECKOUT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ANDROID_SEON_LOGIN:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ANDROID_SEON_LOGIN_RETRY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ANDROID_SEON_PW_SCREEN:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum APP_DESTINATION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum APP_DESTINATION_CACHE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum APP_DESTINATION_TRIAL_ORDERED_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum CC_SCREEN_INPUT_HANDLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum CREDENTIAL_MANAGER_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum DAY_ZERO_CALENDAR_BLOCK:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum DROID_IAJF_LOGIN_NAVIGATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum EMAIL_DIALOG_TEXT_STYLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum EMAIL_FIRST_BACK_NAV_FIX:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum EMPTY_RESPONSE_BODY_HANDLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ENABLE_SOFTWARE_TOKEN_MFA_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum FAMILY_PLAN_STARTER_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum FASTER_DEVICE_EDUCATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum FEATURE_FLAG_FETCH_V2:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum FIX_HOME_FLASH_ON_REENTRY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum HOME_GLOW_HUG:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum HOME_ONBOARDING_FUTURE_IA:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum HOME_XP:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum HW_ONLY_BOOTSTRAP_SESSION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum HW_ONLY_ON_COMPLETE_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum HW_ONLY_PERMISSION_SUBMISSION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum IAJF_PREPAIDS_UC_BACK_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum IMAGE_LANGUAGE_SUPPORT_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum IN_APP_JOIN_FLOW_SHIPPING_INFO:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum IN_APP_JOIN_FLOW_SHIPPING_TILES:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum KT_SERIALIZATION_ACTIVATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum KT_SERIALIZATION_AUTH_SERVICE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum KT_SERIALIZATION_BOOTSTRAP_API:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum KT_SERIALIZATION_MEMBERSHIP_V0:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum LOCALE_HEADER:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum LOGIN_REDIRECT_DIALOG_ENABLED:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum MFA_DOUBLE_POP:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum MOBILE_SCREEN_ERROR_OBSERVABILITY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ONBOARDING_ARABIC_LANGUAGE_ENABLED:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ONBOARDING_CASTLE_DISCOVERY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum ONBOARDING_TOKEN_RECOVERY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum PAIRING_COMPLETION_DESTINATION_NAV:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum PASSWORD_RESET_FLOW:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum PLAN_PICKER_DESTINATION_NAV:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum SKIP_PAIRING_IF_ALREADY_PAIRED:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

.field public static final enum UPCYCLE_ONBOARDING_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;


# instance fields
.field private final flagName:Ljava/lang/String;

.field private final onboardingOnly:Z


# direct methods
.method private static final synthetic $values()[Lcom/whoop/data/repositories/OnboardingFeatureFlag;
    .locals 54

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->APP_DESTINATION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v2, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FIX_HOME_FLASH_ON_REENTRY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v3, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->APP_DESTINATION_TRIAL_ORDERED_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v4, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->APP_DESTINATION_CACHE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HW_ONLY_ON_COMPLETE_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HW_ONLY_PERMISSION_SUBMISSION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v7, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HW_ONLY_BOOTSTRAP_SESSION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v8, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IN_APP_JOIN_FLOW_SHIPPING_TILES:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v9, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IN_APP_JOIN_FLOW_SHIPPING_INFO:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v10, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v11, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IAJF_PREPAIDS_UC_BACK_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v12, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v13, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->CREDENTIAL_MANAGER_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v14, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->EMAIL_DIALOG_TEXT_STYLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v15, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->EMAIL_FIRST_BACK_NAV_FIX:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v16, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_XP:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v17, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_GLOW_HUG:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v18, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v19, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->DAY_ZERO_CALENDAR_BLOCK:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v20, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_ONBOARDING_FUTURE_IA:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v21, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->UPCYCLE_ONBOARDING_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v22, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FEATURE_FLAG_FETCH_V2:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v23, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->LOGIN_REDIRECT_DIALOG_ENABLED:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v24, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->SKIP_PAIRING_IF_ALREADY_PAIRED:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v25, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v26, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IMAGE_LANGUAGE_SUPPORT_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v27, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v28, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->CC_SCREEN_INPUT_HANDLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v29, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->MOBILE_SCREEN_ERROR_OBSERVABILITY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v30, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FASTER_DEVICE_EDUCATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v31, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FAMILY_PLAN_STARTER_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v32, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_ACTIVATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v33, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->DROID_IAJF_LOGIN_NAVIGATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v34, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PASSWORD_RESET_FLOW:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v35, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_AUTH_SERVICE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v36, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_BOOTSTRAP_API:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v37, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_MEMBERSHIP_V0:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v38, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_LOGIN:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v39, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_LOGIN_RETRY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v40, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_PW_SCREEN:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v41, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_CHECKOUT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v42, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->EMPTY_RESPONSE_BODY_HANDLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v43, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ONBOARDING_CASTLE_DISCOVERY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v44, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ONBOARDING_TOKEN_RECOVERY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v45, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ACCOUNT_TRANSITION_SESSION_AWARE_AUTH:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v46, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v47, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->LOCALE_HEADER:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v48, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ONBOARDING_ARABIC_LANGUAGE_ENABLED:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v49, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->MFA_DOUBLE_POP:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v50, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PAIRING_COMPLETION_DESTINATION_NAV:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v51, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PLAN_PICKER_DESTINATION_NAV:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v52, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    sget-object v53, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ENABLE_SOFTWARE_TOKEN_MFA_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    filled-new-array/range {v1 .. v53}, [Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const-string v1, "android-app-destination"

    const-string v2, "APP_DESTINATION_ANDROID"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->APP_DESTINATION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const-string v1, "android-fix-home-flash-on-reentry"

    const-string v2, "FIX_HOME_FLASH_ON_REENTRY"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4, v1, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FIX_HOME_FLASH_ON_REENTRY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v1, 0x2

    const-string v2, "app-destination-trial-ordered-android"

    const-string v5, "APP_DESTINATION_TRIAL_ORDERED_ANDROID"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->APP_DESTINATION_TRIAL_ORDERED_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v1, 0x3

    const-string v2, "android-app-destination-cache"

    const-string v5, "APP_DESTINATION_CACHE"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->APP_DESTINATION_CACHE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v1, 0x4

    const-string v2, "android-hw-only-on-complete"

    const-string v5, "HW_ONLY_ON_COMPLETE_ANDROID"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HW_ONLY_ON_COMPLETE_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v1, 0x5

    const-string v2, "android-hw-only-permission-submission"

    const-string v5, "HW_ONLY_PERMISSION_SUBMISSION_ANDROID"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HW_ONLY_PERMISSION_SUBMISSION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v1, 0x6

    const-string v2, "android-hw-only-bootstrap-session"

    const-string v5, "HW_ONLY_BOOTSTRAP_SESSION_ANDROID"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HW_ONLY_BOOTSTRAP_SESSION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-string v7, "IN_APP_JOIN_FLOW_SHIPPING_TILES"

    const/4 v8, 0x7

    const-string v9, "iajf-shipping-preview-tile-android"

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IN_APP_JOIN_FLOW_SHIPPING_TILES:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x8

    const-string v2, "in-app-join-flow-android-shipping-info-onboarding"

    const-string v5, "IN_APP_JOIN_FLOW_SHIPPING_INFO"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IN_APP_JOIN_FLOW_SHIPPING_INFO:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const-string v7, "IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT"

    const/16 v8, 0x9

    const-string v9, "iajf-universal-checkout-zero-dollar-payment-android"

    invoke-direct/range {v6 .. v12}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IN_APP_JOIN_FLOW_UNIVERSAL_CHECKOUT_ZERO_DOLLAR_PAYMENT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v7, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v12, 0x2

    const/4 v13, 0x0

    const-string v8, "IAJF_PREPAIDS_UC_BACK_ANDROID"

    const/16 v9, 0xa

    const-string v10, "iajf-prepaids-uc-back-android"

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IAJF_PREPAIDS_UC_BACK_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v8, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v13, 0x2

    const/4 v14, 0x0

    const-string v9, "NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID"

    const/16 v10, 0xb

    const-string v11, "native-store-match-any-iajf-source-android"

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v9, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v14, 0x2

    const/4 v15, 0x0

    const-string v10, "CREDENTIAL_MANAGER_ANDROID"

    const/16 v11, 0xc

    const-string v12, "credential-manager-android"

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->CREDENTIAL_MANAGER_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v10, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v15, 0x2

    const/16 v16, 0x0

    const-string v11, "EMAIL_DIALOG_TEXT_STYLING"

    const/16 v12, 0xd

    const-string v13, "email-first-dialog-text-styling-android"

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->EMAIL_DIALOG_TEXT_STYLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v11, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v16, 0x2

    const/16 v17, 0x0

    const-string v12, "EMAIL_FIRST_BACK_NAV_FIX"

    const/16 v13, 0xe

    const-string v14, "email-first-back-nav-fix"

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v11, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->EMAIL_FIRST_BACK_NAV_FIX:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0xf

    const-string v2, "home-xp"

    const-string v5, "HOME_XP"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_XP:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x10

    const-string v2, "home-glow-hug"

    const-string v5, "HOME_GLOW_HUG"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_GLOW_HUG:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x11

    const-string v2, "disable-animations-until-activity-gets-updated-logic"

    const-string v5, "DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x12

    const-string v2, "day-zero-calendar-block"

    const-string v5, "DAY_ZERO_CALENDAR_BLOCK"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->DAY_ZERO_CALENDAR_BLOCK:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x13

    const-string v2, "home-onboarding-future-ia"

    const-string v5, "HOME_ONBOARDING_FUTURE_IA"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_ONBOARDING_FUTURE_IA:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x14

    const-string v2, "upcycle-onboarding-android"

    const-string v5, "UPCYCLE_ONBOARDING_ANDROID"

    invoke-direct {v0, v5, v1, v2, v4}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->UPCYCLE_ONBOARDING_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x15

    const-string v2, "android-feature-flag-fetch-v2"

    const-string v5, "FEATURE_FLAG_FETCH_V2"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FEATURE_FLAG_FETCH_V2:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-string v7, "LOGIN_REDIRECT_DIALOG_ENABLED"

    const/16 v8, 0x16

    const-string v9, "login-redirect-dialog-enabled-android"

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->LOGIN_REDIRECT_DIALOG_ENABLED:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v7, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v12, 0x2

    const/4 v13, 0x0

    const-string v8, "SKIP_PAIRING_IF_ALREADY_PAIRED"

    const/16 v9, 0x17

    const-string v10, "skip-pairing-if-already-paired-android"

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->SKIP_PAIRING_IF_ALREADY_PAIRED:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v8, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v13, 0x2

    const/4 v14, 0x0

    const-string v9, "HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE"

    const/16 v10, 0x18

    const-string v11, "remove-scooter-trial-text-override-android"

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x19

    const-string v2, "image-language-support-android"

    const-string v5, "IMAGE_LANGUAGE_SUPPORT_ANDROID"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->IMAGE_LANGUAGE_SUPPORT_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x1a

    const-string v2, "pairing-first-membership-adjustment-android"

    const-string v5, "PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x1b

    const-string v2, "android-cc-input-error-handling"

    const-string v5, "CC_SCREEN_INPUT_HANDLING"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->CC_SCREEN_INPUT_HANDLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x1c

    const-string v2, "maverick-screen-error-observability"

    const-string v5, "MOBILE_SCREEN_ERROR_OBSERVABILITY"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->MOBILE_SCREEN_ERROR_OBSERVABILITY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-string v7, "FASTER_DEVICE_EDUCATION"

    const/16 v8, 0x1d

    const-string v9, "faster-device-education-android"

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FASTER_DEVICE_EDUCATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v7, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v12, 0x2

    const/4 v13, 0x0

    const-string v8, "FAMILY_PLAN_STARTER_ANDROID"

    const/16 v9, 0x1e

    const-string v10, "family-plan-explainer-android"

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FAMILY_PLAN_STARTER_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x1f

    const-string v2, "kt-serialization-activation"

    const-string v5, "KT_SERIALIZATION_ACTIVATION"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_ACTIVATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x20

    const-string v2, "droid-iajf-log-in-navigation"

    const-string v5, "DROID_IAJF_LOGIN_NAVIGATION"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->DROID_IAJF_LOGIN_NAVIGATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x21

    const-string v2, "password-reset-flow-android"

    const-string v5, "PASSWORD_RESET_FLOW"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PASSWORD_RESET_FLOW:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x22

    const-string v2, "kt-serialization-auth-service"

    const-string v5, "KT_SERIALIZATION_AUTH_SERVICE"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_AUTH_SERVICE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-string v7, "KT_SERIALIZATION_BOOTSTRAP_API"

    const/16 v8, 0x23

    const-string v9, "kt-serialization-bootstrap-api"

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_BOOTSTRAP_API:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v7, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v12, 0x2

    const-string v8, "KT_SERIALIZATION_MEMBERSHIP_V0"

    const/16 v9, 0x24

    const-string v10, "kt-serialization-membership-v0"

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_MEMBERSHIP_V0:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x25

    const-string v2, "android-seon-login"

    const-string v5, "ANDROID_SEON_LOGIN"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_LOGIN:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x26

    const-string v2, "android-seon-login-retry"

    const-string v5, "ANDROID_SEON_LOGIN_RETRY"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_LOGIN_RETRY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x27

    const-string v2, "android-seon-pw-screen"

    const-string v5, "ANDROID_SEON_PW_SCREEN"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_PW_SCREEN:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x28

    const-string v2, "android-seon-checkout"

    const-string v5, "ANDROID_SEON_CHECKOUT"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_CHECKOUT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x29

    const-string v2, "android-empty-response-body-handling"

    const-string v5, "EMPTY_RESPONSE_BODY_HANDLING"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->EMPTY_RESPONSE_BODY_HANDLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x2a

    const-string v2, "droid-castle-discovery-onboarding"

    const-string v5, "ONBOARDING_CASTLE_DISCOVERY"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ONBOARDING_CASTLE_DISCOVERY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x2b

    const-string v2, "onboarding-token-recovery-android"

    const-string v5, "ONBOARDING_TOKEN_RECOVERY"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ONBOARDING_TOKEN_RECOVERY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x2c

    const-string v2, "account-transition-session-aware-auth-android"

    const-string v5, "ACCOUNT_TRANSITION_SESSION_AWARE_AUTH"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ACCOUNT_TRANSITION_SESSION_AWARE_AUTH:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x2d

    const-string v2, "remove-account-creation-strap-check-android"

    const-string v5, "ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK"

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x2e

    const-string v2, "locale-header-onboarding-droid"

    const-string v5, "LOCALE_HEADER"

    invoke-direct {v0, v5, v1, v2, v4}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->LOCALE_HEADER:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x2f

    const-string v2, "onboarding-arabic-language-enabled-android"

    const-string v5, "ONBOARDING_ARABIC_LANGUAGE_ENABLED"

    invoke-direct {v0, v5, v1, v2, v4}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ONBOARDING_ARABIC_LANGUAGE_ENABLED:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x30

    const-string v2, "mfa-double-pop"

    const-string v4, "MFA_DOUBLE_POP"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->MFA_DOUBLE_POP:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x31

    const-string v2, "pairing-completion-destination-nav-android"

    const-string v4, "PAIRING_COMPLETION_DESTINATION_NAV"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PAIRING_COMPLETION_DESTINATION_NAV:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const-string v6, "PLAN_PICKER_DESTINATION_NAV"

    const/16 v7, 0x32

    const-string v8, "plan-picker-destination-nav-android"

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PLAN_PICKER_DESTINATION_NAV:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x33

    const-string v2, "android-strap-lock-unlock-enabled-onboarding"

    const-string v4, "STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    new-instance v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/16 v1, 0x34

    const-string v2, "enable-software-token-mfa-android"

    const-string v4, "ENABLE_SOFTWARE_TOKEN_MFA_ANDROID"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ENABLE_SOFTWARE_TOKEN_MFA_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-static {}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->$values()[Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->$VALUES:[Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->flagName:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->onboardingOnly:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/data/repositories/OnboardingFeatureFlag;
    .locals 1

    const-class v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    return-object p0
.end method

.method public static values()[Lcom/whoop/data/repositories/OnboardingFeatureFlag;
    .locals 1

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->$VALUES:[Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    return-object v0
.end method


# virtual methods
.method public final getFlagName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->flagName:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnboardingOnly()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->onboardingOnly:Z

    return v0
.end method
