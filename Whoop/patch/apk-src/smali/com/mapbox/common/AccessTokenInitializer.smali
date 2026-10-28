.class public final Lcom/mapbox/common/AccessTokenInitializer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011R#\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/mapbox/common/AccessTokenInitializer;",
        "",
        "<init>",
        "()V",
        "",
        "getAccessTokenFromEnv",
        "()Ljava/lang/String;",
        "Ll83/a0;",
        "readEnvAndSetAccessToken",
        "",
        "isAccessTokenInitializationAllowed",
        "()Z",
        "allowed",
        "setAllowInitialization",
        "(Z)V",
        "getAllowInitialization",
        "MAPBOX_PREFERENCES_NAME",
        "Ljava/lang/String;",
        "SETTING_NAME",
        "TAG",
        "Landroid/content/SharedPreferences;",
        "kotlin.jvm.PlatformType",
        "preferences$delegate",
        "Ll83/h;",
        "getPreferences",
        "()Landroid/content/SharedPreferences;",
        "preferences",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/mapbox/common/AccessTokenInitializer;

.field private static final MAPBOX_PREFERENCES_NAME:Ljava/lang/String; = "mapbox_initialization_settings"

.field private static final SETTING_NAME:Ljava/lang/String; = "MapboxInitialized"

.field private static final TAG:Ljava/lang/String; = "AccessTokenInitializer"

.field private static final preferences$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/AccessTokenInitializer;

    invoke-direct {v0}, Lcom/mapbox/common/AccessTokenInitializer;-><init>()V

    sput-object v0, Lcom/mapbox/common/AccessTokenInitializer;->INSTANCE:Lcom/mapbox/common/AccessTokenInitializer;

    sget-object v0, Lcom/mapbox/common/AccessTokenInitializer$preferences$2;->INSTANCE:Lcom/mapbox/common/AccessTokenInitializer$preferences$2;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/AccessTokenInitializer;->preferences$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final getAccessTokenFromEnv()Ljava/lang/String;
    .locals 4

    :try_start_0
    sget-object v0, Lcom/mapbox/common/MapboxSDKCommon;->INSTANCE:Lcom/mapbox/common/MapboxSDKCommon;

    invoke-virtual {v0}, Lcom/mapbox/common/MapboxSDKCommon;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v2, "mapbox_access_token"

    const-string v3, "string"

    invoke-virtual {v0, v2, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "resources.getString(defa\u2026boxAccessTokenResourceId)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const-string v0, "Unable to fetch `mapbox_access_token` resource value"

    const-string v1, "AccessTokenInitializer"

    invoke-static {v0, v1}, Lcom/mapbox/common/Log;->warning(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method private static final getAllowInitialization()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/mapbox/common/AccessTokenInitializer;->INSTANCE:Lcom/mapbox/common/AccessTokenInitializer;

    invoke-direct {v1}, Lcom/mapbox/common/AccessTokenInitializer;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "MapboxInitialized"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to get a value for MapboxInitialized: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AccessTokenInitializer"

    invoke-static {v1, v2}, Lcom/mapbox/common/Log;->error(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method private final getPreferences()Landroid/content/SharedPreferences;
    .locals 1

    sget-object v0, Lcom/mapbox/common/AccessTokenInitializer;->preferences$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public static final isAccessTokenInitializationAllowed()Z
    .locals 5

    const/4 v0, 0x1

    :try_start_0
    sget-object v1, Lcom/mapbox/common/MapboxSDKCommon;->INSTANCE:Lcom/mapbox/common/MapboxSDKCommon;

    invoke-virtual {v1}, Lcom/mapbox/common/MapboxSDKCommon;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v3, "com.mapbox.common.enable_delayed_initialization_logic"

    const-string v4, "bool"

    invoke-virtual {v1, v3, v4, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-static {}, Lcom/mapbox/common/AccessTokenInitializer;->getAllowInitialization()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to get access token initialization status: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AccessTokenInitializer"

    invoke-static {v1, v2}, Lcom/mapbox/common/Log;->error(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return v0
.end method

.method public static final readEnvAndSetAccessToken()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static final setAllowInitialization(Z)V
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "common/AccessToken/allowInitializationTrue"

    invoke-static {v0}, Lcom/mapbox/common/FeatureTelemetryCounter;->create(Ljava/lang/String;)Lcom/mapbox/common/FeatureTelemetryCounter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/common/FeatureTelemetryCounter;->increment()V

    goto :goto_0

    :cond_0
    const-string v0, "common/AccessToken/allowInitializationFalse"

    invoke-static {v0}, Lcom/mapbox/common/FeatureTelemetryCounter;->create(Ljava/lang/String;)Lcom/mapbox/common/FeatureTelemetryCounter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/common/FeatureTelemetryCounter;->increment()V

    :goto_0
    sget-object v0, Lcom/mapbox/common/AccessTokenInitializer;->INSTANCE:Lcom/mapbox/common/AccessTokenInitializer;

    invoke-direct {v0}, Lcom/mapbox/common/AccessTokenInitializer;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "MapboxInitialized"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
