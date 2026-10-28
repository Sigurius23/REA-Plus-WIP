.class public final Lcom/whoop/data/repositories/FeatureFlagRepositoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000b\n\u0000\n\u0002\u0010\u000e\n\u0003\u0008\u0082\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\'\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010S\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010T\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010U\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010V\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010W\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010X\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010Y\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010Z\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010[\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\\\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010]\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010^\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010_\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010`\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010a\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010c\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010d\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010g\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010h\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010i\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010j\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010k\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010l\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010m\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010o\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010p\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010q\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010s\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010u\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010v\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010w\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010x\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010y\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010z\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010{\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010|\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010}\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010~\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u007f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0080\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0081\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0082\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "GIFT_WHOOP_EXTENSION",
        "",
        "NEW_CYCLE_STORAGE",
        "DROID_COMPRESS_IMAGE",
        "WHOOP_PRO_SUBSCRIPTION",
        "NEVER_POP_JOURNAL",
        "REMOVE_TEAM_CHAT_IMPLICIT_BROADCAST",
        "PRIVACY_ARCHV2_SCREEN",
        "GENERIC_PUSH_NOTIFICATIONS_ENABLED",
        "USER_JOURNEY_CUSTOM_ANIMATIONS",
        "CUSTOMIZE_JOURNAL_ONBOARDING",
        "PROFILE_NAVIGATION_FIX",
        "PROFILE_ACHIEVEMENTS_OVERLAY",
        "PROFILE_USERNAME_FIELD",
        "PROFILE_SETTINGS_GEAR",
        "INTERNATIONALIZED_TEAM_VIEWS",
        "NATIVE_EDUCATION_RECOVERY",
        "NATIVE_EDUCATION_STRAIN",
        "NATIVE_EDUCATION_SLEEP",
        "TRENDS_EDUCATION_CAROUSEL",
        "TRENDS_EDUCATION_CAROUSEL_V2",
        "MX_CONTENT_SEARCH",
        "ONLY_ENGLISH_IN_APP_CONTENT",
        "SMART_ALARM_POLL_TRIGGER",
        "ADD_ACTIVITY_REMEMBER_STRAP_LOCATION",
        "CACHED_VIEWED_ACTIVITY",
        "START_ACTIVITY_REVAMP",
        "WEEKLY_PLAN_API_FIX",
        "WEEKLY_PLAN_TOP_LEVEL_SCREEN",
        "WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING",
        "WEEKLY_PLAN_HOME_TILE_BEHAVIOR_IMPACTS",
        "HOME_SERVICE_MOBILE_METRIC",
        "JOURNAL_CYCLE_ID_FIX",
        "ANDROID_ONBOARDING_JOURNAL_DATE_NAV",
        "HOME_PILLAR_BEHAVIOR_FIX",
        "HOME_ERROR_ANALYTICS_FIX",
        "COMMUNITY_TEAMS_CRASH",
        "NEW_AUTH_USER_STORAGE",
        "ENCRYPTION_FAILURE_LOGGING",
        "NEW_AUTH_STORAGE_MONITORING",
        "NOTIFICATION_UNSUB_MONITORING",
        "CANCEL_MEMBERSHIP_BUTTON",
        "MEMBERSHIP_PAUSE_BUTTON",
        "MY_ACCOUNT_REFRESH_FIX",
        "WTE_NEW_GAUGE",
        "BEDTIME_OFF_BODY_EXPERIMENT",
        "URL_VALIDATION_DEFAULT_OAUTH_TOKEN_REFRESHER",
        "DESIGN_LOTTIE_LOADING",
        "STOP_LINK_LOCALIZATION",
        "START_ACTIVITY_SKIP_COUNTDOWN_TIMER_START_RECORDING",
        "WEIGHTLIFTING_START_STOP_SETS_VIA_STRAP",
        "SKIP_TIMESTAMP_RECALCULATION",
        "WEIGHTLIFTING_AUTO_START_STOP_SETS",
        "WEIGHTLIFTING_INTERACTIVE_NOTIFICATIONS",
        "AUTO_RESUME_TO_ST_WORKOUT",
        "AUTO_RESUME_TO_STRAIN_COACH_WORKOUT",
        "STRENGTH_TRAINER_UNDO_SETS",
        "STRENGTH_TRAINER_REMEMBER_DEVICE_LOCATION",
        "STRENGTH_TRAINER_SELECT_EXERCISE_BOTTOM_SHEET_LOGIC",
        "HOME_REDESIGN_REFRESH_FIX",
        "HOME_NAVIGATION_REDUCER",
        "PREVENT_JOURNAL_AUTOPOP_RECOVERY_COUNT",
        "HOME_FUTURE_IA",
        "HOME_IA_CARET",
        "HIDE_SHARE",
        "CELEBRATION_RENDER_FAILURE_METRIC",
        "USE_NEW_AUTO_POP_DATA_STORE",
        "EDUCATION_STICKY_HEADER_NAV",
        "MEMBER_DATA_EXPORT",
        "REMOVE_COACHING_HEALTH_MONITOR",
        "STRESS_TREND_CTA",
        "STEALTH_MODE",
        "ARABIC_OPT_OUT_SETTINGS_BUTTON_ENABLED_ANDROID",
        "ARABIC_FEEDBACK_BUTTON_ENABLED_ANDROID",
        "AI_CHAT_ENTRY_GRADIENT_BORDER",
        "DAILY_OUTLOOK_PUSH_NOTIFICATION",
        "HAL_EDUCATION_HUB",
        "HAL_OPTIMIZATIONS",
        "HAL_STRENGTH_TRAINER_ROUNDED_CORNERS",
        "HAL_ADDITIONAL_CONTEXT_CONTRACT",
        "HAL_DYNAMIC_SUGGESTIONS_CONTAINER",
        "HAL_WAKE_UP_REPORT_BETA_TAG",
        "HAL_BFF_BETA_TAG",
        "HAL_SUGGESTIONS_MARKDOWN",
        "WHOOP_COACH_FEEDBACK_V3",
        "WHOOP_COACH_LONG_LOADING",
        "OPTIMAL_BEDTIME_RECS",
        "SLEEP_PLANNER_CEREAL_BOX",
        "WEEKLY_PLAN_SLEEP_PLANER_V2",
        "AUTO_ACTIVITY_RECS",
        "AIM_ACTIVITY_RECS_TILE_REDESIGN",
        "SETTINGS_BANNERS",
        "TRIAL_CANCEL_SETTINGS",
        "REGULATORY_LABELS_SCREEN",
        "DEVICE_SETTINGS_REGULATORY_TILES",
        "DISABLE_GPS_SOUTH_KOREA",
        "MY_ACCOUNT_TRIALS_HEADER",
        "RAF_HUB",
        "HOLIDAY_STYLING_ANDROID",
        "HOLIDAY_TAG_IN_SETTINGS",
        "AUTH_WEB_VIEW_UPGRADE_SUPPORT",
        "ADVANCED_LABS_MANAGEMENT_MENU_ITEM",
        "AL_MORE_TAB_EXPERIMENT",
        "ADVANCED_LABS_STANDALONE",
        "APP_WIDGET_V2_DONT_KILL_APP",
        "SHEPHERD_NOTIFICATION_FEATURE_ANDROID",
        "LABRADOR_NOTIFICATION_FEATURE_ANDROID",
        "LABRADOR_ENTRYPOINT_BFF",
        "WEEKLY_PLAN_STRAIN_COACH",
        "WHOOP_COACH_TYPEWRITER_EFFECT_FIX",
        "AICHAT_CONVERSATION_SCROLL_POSITIONING",
        "BODY_COMPOSITION",
        "HEALTHSPAN_COACHING",
        "WTE_STRAIN_COACH_SPORT",
        "CUSTOM_BOTTOM_SHEET",
        "FEATURE_ONBOARDING_PROGRESS_BUTTON",
        "TAPPABLE_EFFECT_CARDS",
        "MEDIA_CARD_ARTICLE_TILE_MIGRATION",
        "ANDROID_BACKGROUND_GPS_COLLECTION",
        "ANDROID_FOREGROUND_GPS_COLLECTION",
        "ANDROID_GPS_SETTINGS_PAGE",
        "KT_SERIALIZATION_CYCLE_METADATA",
        "KT_SERIALIZATION_HEALTH_MONITOR_USERS_API",
        "KT_SERIALIZATION_ONBOARDING_STATUS",
        "KT_SERIALIZATION_USERS_PREFERENCE",
        "KT_SERIALIZATION_USERS_SERVICE",
        "KT_SERIALIZATION_LEGACY_TEAM_SERVICE",
        "KT_SERIALIZATION_HOME_COMPONENT_DISMISS",
        "KT_SERIALIZATION_MEMBERSHIP_V2",
        "KT_SERIALIZATION_MEMBERSHIP_API",
        "KT_SERIALIZATION_ACTIVITIES_API",
        "core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ADD_ACTIVITY_REMEMBER_STRAP_LOCATION:Ljava/lang/String; = "add-activity-remember-strap-location"

.field public static final ADVANCED_LABS_MANAGEMENT_MENU_ITEM:Ljava/lang/String; = "advanced-labs-management-menu-item"

.field public static final ADVANCED_LABS_STANDALONE:Ljava/lang/String; = "advanced-labs-standalone"

.field public static final AICHAT_CONVERSATION_SCROLL_POSITIONING:Ljava/lang/String; = "android-aichat-conversation-scroll-positioning"

.field public static final AIM_ACTIVITY_RECS_TILE_REDESIGN:Ljava/lang/String; = "aim-activity-recs-tile-redesign"

.field public static final AI_CHAT_ENTRY_GRADIENT_BORDER:Ljava/lang/String; = "ai-chat-entry-gradient-border"

.field public static final AL_MORE_TAB_EXPERIMENT:Ljava/lang/String; = "advanced-labs-more-tab-experiment"

.field public static final ANDROID_BACKGROUND_GPS_COLLECTION:Ljava/lang/String; = "android-background-gps-collection"

.field public static final ANDROID_FOREGROUND_GPS_COLLECTION:Ljava/lang/String; = "android-foreground-gps-collection"

.field public static final ANDROID_GPS_SETTINGS_PAGE:Ljava/lang/String; = "android-gps-settings-page"

.field public static final ANDROID_ONBOARDING_JOURNAL_DATE_NAV:Ljava/lang/String; = "android-onboarding-journal-date-nav"

.field public static final APP_WIDGET_V2_DONT_KILL_APP:Ljava/lang/String; = "android-widget-v2-dont-kill-app"

.field public static final ARABIC_FEEDBACK_BUTTON_ENABLED_ANDROID:Ljava/lang/String; = "arabic-feedback-button-enabled-android"

.field public static final ARABIC_OPT_OUT_SETTINGS_BUTTON_ENABLED_ANDROID:Ljava/lang/String; = "arabic-opt-out-settings-button-enabled-android"

.field public static final AUTH_WEB_VIEW_UPGRADE_SUPPORT:Ljava/lang/String; = "auth-web-view-upgrade-support"

.field public static final AUTO_ACTIVITY_RECS:Ljava/lang/String; = "auto-activity-recs"

.field public static final AUTO_RESUME_TO_STRAIN_COACH_WORKOUT:Ljava/lang/String; = "auto-resume-to-strain-coach-workout"

.field public static final AUTO_RESUME_TO_ST_WORKOUT:Ljava/lang/String; = "auto-resume-to-st-workout"

.field public static final BEDTIME_OFF_BODY_EXPERIMENT:Ljava/lang/String; = "bedtime-off-body-experiment-android"

.field public static final BODY_COMPOSITION:Ljava/lang/String; = "body-comp"

.field public static final CACHED_VIEWED_ACTIVITY:Ljava/lang/String; = "cache_viewed_activity"

.field public static final CANCEL_MEMBERSHIP_BUTTON:Ljava/lang/String; = "cancel-membership-button-android"

.field public static final CELEBRATION_RENDER_FAILURE_METRIC:Ljava/lang/String; = "celebration-render-failure-metric-android"

.field public static final COMMUNITY_TEAMS_CRASH:Ljava/lang/String; = "android-community-teams-crash"

.field public static final CUSTOMIZE_JOURNAL_ONBOARDING:Ljava/lang/String; = "customize-journal-onboarding"

.field public static final CUSTOM_BOTTOM_SHEET:Ljava/lang/String; = "customize-bottom-sheet"

.field public static final DAILY_OUTLOOK_PUSH_NOTIFICATION:Ljava/lang/String; = "daily-outlook-push-notification"

.field public static final DESIGN_LOTTIE_LOADING:Ljava/lang/String; = "ds-lottie-loading"

.field public static final DEVICE_SETTINGS_REGULATORY_TILES:Ljava/lang/String; = "device-settings-regulatory-tiles-android"

.field public static final DISABLE_GPS_SOUTH_KOREA:Ljava/lang/String; = "disable-gps-south-korea"

.field public static final DROID_COMPRESS_IMAGE:Ljava/lang/String; = "droid-compress-image"

.field public static final EDUCATION_STICKY_HEADER_NAV:Ljava/lang/String; = "in-app-education-sticky-header"

.field public static final ENCRYPTION_FAILURE_LOGGING:Ljava/lang/String; = "encryption-failure-logging-android"

.field public static final FEATURE_ONBOARDING_PROGRESS_BUTTON:Ljava/lang/String; = "feature-onboarding-progress-button"

.field public static final GENERIC_PUSH_NOTIFICATIONS_ENABLED:Ljava/lang/String; = "generic-push-notifications-enabled"

.field public static final GIFT_WHOOP_EXTENSION:Ljava/lang/String; = "gift-whoop-extension"

.field public static final HAL_ADDITIONAL_CONTEXT_CONTRACT:Ljava/lang/String; = "hal-conversation-context"

.field public static final HAL_BFF_BETA_TAG:Ljava/lang/String; = "bff-beta-tag"

.field public static final HAL_DYNAMIC_SUGGESTIONS_CONTAINER:Ljava/lang/String; = "hal-dynamic-suggestion-container"

.field public static final HAL_EDUCATION_HUB:Ljava/lang/String; = "hal-educational-hub"

.field public static final HAL_OPTIMIZATIONS:Ljava/lang/String; = "hal-optimizations"

.field public static final HAL_STRENGTH_TRAINER_ROUNDED_CORNERS:Ljava/lang/String; = "hal-strength-trainer-rounded-corners"

.field public static final HAL_SUGGESTIONS_MARKDOWN:Ljava/lang/String; = "hal-suggestions-markdown"

.field public static final HAL_WAKE_UP_REPORT_BETA_TAG:Ljava/lang/String; = "hal-wake-up-report-beta-tag"

.field public static final HEALTHSPAN_COACHING:Ljava/lang/String; = "healthspan-coaching-backend"

.field public static final HIDE_SHARE:Ljava/lang/String; = "remove-squarables"

.field public static final HOLIDAY_STYLING_ANDROID:Ljava/lang/String; = "holiday-styling-android"

.field public static final HOLIDAY_TAG_IN_SETTINGS:Ljava/lang/String; = "holiday-tag-in-settings-android"

.field public static final HOME_ERROR_ANALYTICS_FIX:Ljava/lang/String; = "android-home-error-analytics"

.field public static final HOME_FUTURE_IA:Ljava/lang/String; = "home-future-ia"

.field public static final HOME_IA_CARET:Ljava/lang/String; = "home-ia-caret"

.field public static final HOME_NAVIGATION_REDUCER:Ljava/lang/String; = "home-navigation-reducer-android"

.field public static final HOME_PILLAR_BEHAVIOR_FIX:Ljava/lang/String; = "home-pillar-behavior-fix"

.field public static final HOME_REDESIGN_REFRESH_FIX:Ljava/lang/String; = "home-redesign-android-refresh-fix"

.field public static final HOME_SERVICE_MOBILE_METRIC:Ljava/lang/String; = "home-service-mobile-metric-android"

.field public static final INTERNATIONALIZED_TEAM_VIEWS:Ljava/lang/String; = "internationalized-team-views"

.field public static final JOURNAL_CYCLE_ID_FIX:Ljava/lang/String; = "android-journal-cycleId-fix"

.field public static final KT_SERIALIZATION_ACTIVITIES_API:Ljava/lang/String; = "kt-serialization-activities-api"

.field public static final KT_SERIALIZATION_CYCLE_METADATA:Ljava/lang/String; = "kt-serialization-cycle-metadata"

.field public static final KT_SERIALIZATION_HEALTH_MONITOR_USERS_API:Ljava/lang/String; = "kt-serialization-health-monitor-users-api"

.field public static final KT_SERIALIZATION_HOME_COMPONENT_DISMISS:Ljava/lang/String; = "kt-serialization-home-component-dismiss"

.field public static final KT_SERIALIZATION_LEGACY_TEAM_SERVICE:Ljava/lang/String; = "kt-serialization-legacy-team-service"

.field public static final KT_SERIALIZATION_MEMBERSHIP_API:Ljava/lang/String; = "kt-serialization-membership-api"

.field public static final KT_SERIALIZATION_MEMBERSHIP_V2:Ljava/lang/String; = "kt-serialization-membership-v2"

.field public static final KT_SERIALIZATION_ONBOARDING_STATUS:Ljava/lang/String; = "kt-serialization-onboarding-status"

.field public static final KT_SERIALIZATION_USERS_PREFERENCE:Ljava/lang/String; = "kt-serialization-users-preference"

.field public static final KT_SERIALIZATION_USERS_SERVICE:Ljava/lang/String; = "kt-serialization-users-service"

.field public static final LABRADOR_ENTRYPOINT_BFF:Ljava/lang/String; = "labrador-entrypoint-bff"

.field public static final LABRADOR_NOTIFICATION_FEATURE_ANDROID:Ljava/lang/String; = "labrador-notification-feature-android"

.field public static final MEDIA_CARD_ARTICLE_TILE_MIGRATION:Ljava/lang/String; = "media-card-article-tile-migration-android"

.field public static final MEMBERSHIP_PAUSE_BUTTON:Ljava/lang/String; = "membership-pause-button-android"

.field public static final MEMBER_DATA_EXPORT:Ljava/lang/String; = "data-export-v0"

.field public static final MX_CONTENT_SEARCH:Ljava/lang/String; = "mx-content-search-android"

.field public static final MY_ACCOUNT_REFRESH_FIX:Ljava/lang/String; = "my-account-refresh-fix-android"

.field public static final MY_ACCOUNT_TRIALS_HEADER:Ljava/lang/String; = "my-account-trials-header-android"

.field public static final NATIVE_EDUCATION_RECOVERY:Ljava/lang/String; = "mx-native-education-recovery-android"

.field public static final NATIVE_EDUCATION_SLEEP:Ljava/lang/String; = "mx-native-education-sleep-android"

.field public static final NATIVE_EDUCATION_STRAIN:Ljava/lang/String; = "mx-native-education-strain-android"

.field public static final NEVER_POP_JOURNAL:Ljava/lang/String; = "never-show-journal-intro"

.field public static final NEW_AUTH_STORAGE_MONITORING:Ljava/lang/String; = "new-auth-user-storage-metric-monitoring-android"

.field public static final NEW_AUTH_USER_STORAGE:Ljava/lang/String; = "new-auth-user-storage-android"

.field public static final NEW_CYCLE_STORAGE:Ljava/lang/String; = "android-new-cycle-storage"

.field public static final NOTIFICATION_UNSUB_MONITORING:Ljava/lang/String; = "android-notification-unsub-monitoring"

.field public static final ONLY_ENGLISH_IN_APP_CONTENT:Ljava/lang/String; = "only-english-in-app-content-android"

.field public static final OPTIMAL_BEDTIME_RECS:Ljava/lang/String; = "optimal-bedtime-recs"

.field public static final PREVENT_JOURNAL_AUTOPOP_RECOVERY_COUNT:Ljava/lang/String; = "prevent-journal-autopop-based-on-recovery-count"

.field public static final PRIVACY_ARCHV2_SCREEN:Ljava/lang/String; = "privacy-archv2-screen"

.field public static final PROFILE_ACHIEVEMENTS_OVERLAY:Ljava/lang/String; = "profile-achievements-overlay"

.field public static final PROFILE_NAVIGATION_FIX:Ljava/lang/String; = "profile-navigation-fix-android"

.field public static final PROFILE_SETTINGS_GEAR:Ljava/lang/String; = "android-profile-settings-gear"

.field public static final PROFILE_USERNAME_FIELD:Ljava/lang/String; = "android-profile-username-field"

.field public static final RAF_HUB:Ljava/lang/String; = "raf-hub-android"

.field public static final REGULATORY_LABELS_SCREEN:Ljava/lang/String; = "regulatory-labels-android"

.field public static final REMOVE_COACHING_HEALTH_MONITOR:Ljava/lang/String; = "remove-health-monitor-plan-tab"

.field public static final REMOVE_TEAM_CHAT_IMPLICIT_BROADCAST:Ljava/lang/String; = "android-remove-team-chat-implicit-broadcast"

.field public static final SETTINGS_BANNERS:Ljava/lang/String; = "settings-banners"

.field public static final SHEPHERD_NOTIFICATION_FEATURE_ANDROID:Ljava/lang/String; = "arrhythmia-notification-feature-android"

.field public static final SKIP_TIMESTAMP_RECALCULATION:Ljava/lang/String; = "skip-timestamp-recalculation"

.field public static final SLEEP_PLANNER_CEREAL_BOX:Ljava/lang/String; = "sleep-planner-cereal-box"

.field public static final SMART_ALARM_POLL_TRIGGER:Ljava/lang/String; = "smart_alarm_poll_triggered"

.field public static final START_ACTIVITY_REVAMP:Ljava/lang/String; = "start-activity-revamp"

.field public static final START_ACTIVITY_SKIP_COUNTDOWN_TIMER_START_RECORDING:Ljava/lang/String; = "start-activity-skip-countdown-timer-start-recording"

.field public static final STEALTH_MODE:Ljava/lang/String; = "stealth-mode"

.field public static final STOP_LINK_LOCALIZATION:Ljava/lang/String; = "stop-link-localization"

.field public static final STRENGTH_TRAINER_REMEMBER_DEVICE_LOCATION:Ljava/lang/String; = "st-remember-device-location"

.field public static final STRENGTH_TRAINER_SELECT_EXERCISE_BOTTOM_SHEET_LOGIC:Ljava/lang/String; = "st-select-exercise-bottom-sheet-logic"

.field public static final STRENGTH_TRAINER_UNDO_SETS:Ljava/lang/String; = "st-undo-sets-android"

.field public static final STRESS_TREND_CTA:Ljava/lang/String; = "stress-trends"

.field public static final TAPPABLE_EFFECT_CARDS:Ljava/lang/String; = "tappable-effect-cards"

.field public static final TRENDS_EDUCATION_CAROUSEL:Ljava/lang/String; = "mx-trends-education-carousel-android"

.field public static final TRENDS_EDUCATION_CAROUSEL_V2:Ljava/lang/String; = "mx-trends-education-carousel-v2-android"

.field public static final TRIAL_CANCEL_SETTINGS:Ljava/lang/String; = "trials-cancel-phase-2-settings"

.field public static final URL_VALIDATION_DEFAULT_OAUTH_TOKEN_REFRESHER:Ljava/lang/String; = "url-validation-default-oauth-token-freshser"

.field public static final USER_JOURNEY_CUSTOM_ANIMATIONS:Ljava/lang/String; = "user-journey-custom-animations-android"

.field public static final USE_NEW_AUTO_POP_DATA_STORE:Ljava/lang/String; = "use-new-autopop-data-store"

.field public static final WEEKLY_PLAN_API_FIX:Ljava/lang/String; = "weekly-plan-api-fix"

.field public static final WEEKLY_PLAN_HOME_TILE_BEHAVIOR_IMPACTS:Ljava/lang/String; = "weekly-plan-home-tile-behavior-impacts"

.field public static final WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING:Ljava/lang/String; = "weekly-plan-in-journal-non-onboarding"

.field public static final WEEKLY_PLAN_SLEEP_PLANER_V2:Ljava/lang/String; = "weekly-plan-sleep-planner-v2"

.field public static final WEEKLY_PLAN_STRAIN_COACH:Ljava/lang/String; = "weekly-plan-strain-gauge"

.field public static final WEEKLY_PLAN_TOP_LEVEL_SCREEN:Ljava/lang/String; = "weekly-plan-top-level-screen"

.field public static final WEIGHTLIFTING_AUTO_START_STOP_SETS:Ljava/lang/String; = "weightlifting-auto-start-stop-sets"

.field public static final WEIGHTLIFTING_INTERACTIVE_NOTIFICATIONS:Ljava/lang/String; = "strengthtrainer-interactive-workout-notification"

.field public static final WEIGHTLIFTING_START_STOP_SETS_VIA_STRAP:Ljava/lang/String; = "weightlifting-start-stop-sets-via-strap"

.field public static final WHOOP_COACH_FEEDBACK_V3:Ljava/lang/String; = "whoop-coach-feedback-v3"

.field public static final WHOOP_COACH_LONG_LOADING:Ljava/lang/String; = "coach-long-loading-android"

.field public static final WHOOP_COACH_TYPEWRITER_EFFECT_FIX:Ljava/lang/String; = "whoop-coach-typewriter-effect-fix"

.field public static final WHOOP_PRO_SUBSCRIPTION:Ljava/lang/String; = "whoop-pro"

.field public static final WTE_NEW_GAUGE:Ljava/lang/String; = "wte-new-gauge-android"

.field public static final WTE_STRAIN_COACH_SPORT:Ljava/lang/String; = "wte-strain-coach-sport-id-android"
