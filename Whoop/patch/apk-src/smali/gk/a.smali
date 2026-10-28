.class public final Lgk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final synthetic k:Leb/k;


# direct methods
.method public constructor <init>(Leb/k;)V
    .locals 14

    iget-object v0, p1, Leb/k;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    const-string v2, "phone"

    iput-object p1, p0, Lgk/a;->k:Leb/k;

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v4, "RELEASE"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lgk/a;->d:Ljava/lang/String;

    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v4, "BRAND"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lgk/a;->e:Ljava/lang/String;

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v4, "MANUFACTURER"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lgk/a;->f:Ljava/lang/String;

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v5, "MODEL"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, p0, Lgk/a;->g:Ljava/lang/String;

    invoke-static {}, Lgk/a;->a()Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "locale.language"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, p0, Lgk/a;->i:Ljava/lang/String;

    iget-boolean p1, p1, Leb/k;->a:Z

    const/4 v4, 0x4

    const/4 v5, 0x3

    const-string v6, "Amplitude"

    const/4 v7, 0x2

    const-string v8, "null cannot be cast to non-null type kotlin.String"

    const-string v9, "getId"

    const/4 v10, 0x0

    const-class v11, Landroid/content/Context;

    const/4 v12, 0x0

    if-eqz p1, :cond_3

    const-string p1, "Amazon"

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v0, "limit_ad_tracking"

    invoke-static {p1, v0, v10}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    const-string v0, "advertising_id"

    invoke-static {p1, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_0
    :try_start_0
    const-string p1, "com.google.android.gms.ads.identifier.AdvertisingIdClient"

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string v3, "getAdvertisingIdInfo"

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {p1, v3, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v12, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v3, "isLimitAdTrackingEnabled"

    invoke-virtual {v0, v3, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, p1, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    move-object v0, v12

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v9, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, p1, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    invoke-static {v7, v4}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "Encountered an error connecting to Google Play Services for advertising id"

    invoke-static {v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "Google Play Services not available for advertising id"

    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_2
    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "Google Play Services SDK not found for advertising id!"

    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_1
    move-object p1, v12

    :goto_2
    iput-object p1, p0, Lgk/a;->a:Ljava/lang/String;

    iget-object p1, p0, Lgk/a;->k:Leb/k;

    iget-object p1, p1, Leb/k;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    const-string v0, "context.packageManager.g\u2026o(context.packageName, 0)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_3

    :catch_3
    move-object p1, v12

    :goto_3
    iput-object p1, p0, Lgk/a;->c:Ljava/lang/String;

    :try_start_2
    iget-object p1, p0, Lgk/a;->k:Leb/k;

    iget-object p1, p1, Leb/k;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/telephony/TelephonyManager;

    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_4

    :catch_4
    move-object p1, v12

    :goto_4
    iput-object p1, p0, Lgk/a;->h:Ljava/lang/String;

    iget-object p1, p0, Lgk/a;->k:Leb/k;

    :try_start_3
    iget-object p1, p1, Leb/k;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/telephony/TelephonyManager;

    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result v0

    if-eq v0, v7, :cond_4

    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "US"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    goto :goto_5

    :catch_5
    :cond_4
    move-object p1, v12

    :goto_5
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    invoke-static {}, Lgk/a;->a()Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    const-string v0, "locale.country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    iput-object p1, p0, Lgk/a;->b:Ljava/lang/String;

    const-string p1, "Google Play Services Util not found!"

    const-string v0, "Google Play Services not available"

    :try_start_4
    const-class v1, Lcom/google/android/gms/common/e;

    sget-object v2, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v2, "isGooglePlayServicesAvailable"

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iget-object v2, p0, Lgk/a;->k:Leb/k;

    iget-object v2, v2, Leb/k;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v12, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Integer;

    if-eqz v2, :cond_7

    check-cast v1, Ljava/lang/Integer;

    goto :goto_6

    :catch_6
    move-exception p1

    goto :goto_7

    :cond_7
    move-object v1, v12

    :goto_6
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_4
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_4 .. :try_end_4} :catch_b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_a
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    goto :goto_8

    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error when checking for Google Play Services: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_8

    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    :catch_7
    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_8

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    :catch_8
    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_8

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    :catch_9
    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_8

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    :catch_a
    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_8

    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    :catch_b
    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_8

    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    :goto_8
    iget-object p1, p0, Lgk/a;->k:Leb/k;

    iget-boolean p1, p1, Leb/k;->b:Z

    if-eqz p1, :cond_9

    :try_start_5
    const-string p1, "com.google.android.gms.appset.AppSet"

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getClient"

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iget-object v0, p0, Lgk/a;->k:Leb/k;

    iget-object v0, v0, Leb/k;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v12, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getAppSetIdInfo"

    invoke-virtual {v0, v1, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, p1, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-class v0, Lcom/google/android/gms/tasks/Tasks;

    const-string v1, "await"

    const-class v2, Lcom/google/android/gms/tasks/Task;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v12, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v9, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, p1, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_e
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_5 .. :try_end_5} :catch_d
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_c

    move-object v12, p1

    goto :goto_9

    :catch_c
    invoke-static {v7, v4}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_9

    const-string p1, "Encountered an error connecting to Google Play Services for app set id"

    invoke-static {v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    :catch_d
    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_9

    const-string p1, "Google Play Services not available for app set id"

    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    :catch_e
    invoke-static {v7, v5}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_9

    const-string p1, "Google Play Services SDK not found for app set id!"

    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    :goto_9
    iput-object v12, p0, Lgk/a;->j:Ljava/lang/String;

    return-void
.end method

.method public static a()Ljava/util/Locale;
    .locals 2

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v0

    const-string v1, "configuration.locales"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v0

    :goto_0
    const-string v1, "{\n                    va\u2026      }\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
