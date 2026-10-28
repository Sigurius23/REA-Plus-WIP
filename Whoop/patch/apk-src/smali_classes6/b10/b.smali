.class public final Lb10/b;
.super Lyy/c;
.source "SourceFile"


# instance fields
.field public final j:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultProductUsageTokens"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 18
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    .line 19
    :goto_0
    instance-of v1, v0, Ll83/m;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 20
    :cond_0
    move-object v3, v0

    check-cast v3, Landroid/content/pm/PackageInfo;

    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    move-object v4, v0

    .line 22
    new-instance v5, Lb10/a;

    const/4 v0, 0x0

    invoke-direct {v5, p3, v0}, Lb10/a;-><init>(Lc93/a;I)V

    .line 23
    new-instance p3, Lyy/i0;

    invoke-direct {p3, p1}, Lyy/i0;-><init>(Landroid/content/Context;)V

    new-instance v6, Lab/g0;

    const/4 p1, 0x3

    invoke-direct {v6, p3, p1}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    move-object v1, p0

    move-object v7, p2

    .line 24
    invoke-direct/range {v1 .. v7}, Lb10/b;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Lk83/a;Lk83/a;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultProductUsageTokens"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lar0/a;

    const/16 v1, 0xb

    invoke-direct {v0, p3, v1}, Lar0/a;-><init>(Ljava/lang/String;I)V

    .line 4
    invoke-direct {p0, p1, p2, v0}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk83/a;)V
    .locals 8

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 8
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    .line 9
    :goto_0
    instance-of v1, v0, Ll83/m;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 10
    :cond_0
    move-object v3, v0

    check-cast v3, Landroid/content/pm/PackageInfo;

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    move-object v4, v0

    .line 12
    new-instance v0, Lyy/i0;

    invoke-direct {v0, p1}, Lyy/i0;-><init>(Landroid/content/Context;)V

    new-instance v6, Lab/g0;

    const/4 p1, 0x3

    invoke-direct {v6, v0, p1}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    .line 13
    sget-object v7, Lm83/a0;->w:Lm83/a0;

    move-object v1, p0

    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v7}, Lb10/b;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Lk83/a;Lk83/a;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Lk83/a;Lk83/a;Ljava/util/Set;)V
    .locals 1

    const-string v0, "defaultProductUsageTokens"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p5}, Lyy/c;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Lk83/a;Lk83/a;)V

    move-object p1, p0

    .line 2
    iput-object p6, p1, Lb10/b;->j:Ljava/util/Set;

    return-void
.end method

.method public static c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;
    .locals 9

    sget-object v0, Ly00/f8;->y:Ly00/f8;

    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_0

    sget-object p2, Lm83/a0;->w:Lm83/a0;

    :cond_0
    and-int/lit8 v1, p6, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object p3, v2

    :cond_1
    and-int/lit8 v1, p6, 0x8

    if-eqz v1, :cond_2

    move-object v0, v2

    :cond_2
    and-int/lit8 v1, p6, 0x10

    if-eqz v1, :cond_3

    move-object p4, v2

    :cond_3
    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_4

    move-object p5, v2

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p6, "event"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "productUsageTokens"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p6, p0, Lb10/b;->j:Ljava/util/Set;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p6, p2}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p6

    if-nez p6, :cond_5

    move-object v3, p2

    goto :goto_0

    :cond_5
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_6

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const-string v4, ","

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p2

    const-string p6, "product_usage"

    invoke-static {p6, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    goto :goto_1

    :cond_6
    move-object p2, v2

    :goto_1
    sget-object p6, Lm83/z;->w:Lm83/z;

    if-nez p2, :cond_7

    move-object p2, p6

    :cond_7
    if-eqz p3, :cond_8

    const-string v1, "source_type"

    invoke-static {v1, p3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :cond_8
    move-object v1, v2

    :goto_2
    if-nez v1, :cond_9

    move-object v1, p6

    :cond_9
    invoke-static {p2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    if-eqz v0, :cond_a

    iget-object p3, v0, Ly00/f8;->w:Ljava/lang/String;

    goto :goto_3

    :cond_a
    if-nez p3, :cond_b

    const-string p3, "unknown"

    goto :goto_3

    :cond_b
    move-object p3, v2

    :goto_3
    if-eqz p3, :cond_c

    const-string v0, "token_type"

    invoke-static {v0, p3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p3

    goto :goto_4

    :cond_c
    move-object p3, v2

    :goto_4
    if-nez p3, :cond_d

    move-object p3, p6

    :cond_d
    invoke-static {p2, p3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    if-eqz p4, :cond_e

    const-string p3, "3ds2_ui_type"

    invoke-virtual {p4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p3

    goto :goto_5

    :cond_e
    move-object p3, v2

    :goto_5
    if-nez p3, :cond_f

    move-object p3, p6

    :cond_f
    invoke-static {p2, p3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    if-eqz p5, :cond_10

    const-string p3, "error_message"

    invoke-static {p3, p5}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    :cond_10
    if-nez v2, :cond_11

    goto :goto_6

    :cond_11
    move-object p6, v2

    :goto_6
    invoke-static {p2, p6}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lb10/b;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lyy/a;Ljava/util/Map;)Lyy/b;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    sget-object v2, Lm83/z;->w:Lm83/z;

    const-string v3, "event"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "additionalParams"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lb10/b;->j:Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_1

    move-object v8, v5

    check-cast v8, Ljava/lang/Iterable;

    const/4 v12, 0x0

    const/16 v13, 0x3e

    const-string v9, ","

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "product_usage"

    invoke-static {v6, v5}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_2

    move-object v5, v2

    :cond_2
    invoke-static {v5, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v5

    new-instance v6, Lyy/b;

    new-instance v8, Ll83/k;

    const-string v0, "analytics_ua"

    const-string v9, "analytics.stripe_android-1.0"

    invoke-direct {v8, v0, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, v1, Lyy/c;->d:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v9, "uk_"

    const/4 v10, 0x0

    invoke-static {v0, v9, v10}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_3

    const-string v0, "[REDACTED_LIVE_KEY]"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_3
    :goto_2
    instance-of v9, v0, Ll83/m;

    if-eqz v9, :cond_4

    const-string v0, "pk_undefined"

    :cond_4
    new-instance v9, Ll83/k;

    const-string v10, "publishable_key"

    invoke-direct {v9, v10, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    new-instance v10, Ll83/k;

    const-string v11, "os_name"

    invoke-direct {v10, v11, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    new-instance v11, Ll83/k;

    const-string v12, "os_release"

    invoke-direct {v11, v12, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v12, Ll83/k;

    const-string v13, "os_version"

    invoke-direct {v12, v13, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lyy/c;->h:Ljava/lang/String;

    new-instance v13, Ll83/k;

    const-string v14, "device_type"

    invoke-direct {v13, v14, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Ll83/k;

    const-string v0, "bindings_version"

    const-string v15, "22.6.1"

    invoke-direct {v14, v0, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v15, Ll83/k;

    const-string v7, "is_development"

    invoke-direct {v15, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lyy/c;->g:Ljava/util/UUID;

    new-instance v7, Ll83/k;

    move-object/from16 v19, v2

    const-string v2, "session_id"

    invoke-direct {v7, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v16, v7

    move-object/from16 p2, v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    long-to-double v7, v7

    const-wide v17, 0x408f400000000000L    # 1000.0

    div-double v7, v7, v17

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v7, "timestamp"

    invoke-direct {v2, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Ll83/k;

    const-string v8, "locale"

    invoke-direct {v7, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v8, p2

    move-object/from16 v17, v2

    move-object/from16 v18, v7

    filled-new-array/range {v8 .. v18}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, v1, Lyy/c;->e:Lk83/a;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_5

    move-object/from16 v2, v19

    goto :goto_3

    :cond_5
    const-string v7, "network_type"

    invoke-static {v7, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    :goto_3
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, v1, Lyy/c;->f:Lk83/a;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_6

    const-string v7, "plugin_type"

    invoke-static {v7, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_4

    :cond_6
    move-object/from16 v2, v19

    :goto_4
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, v1, Lyy/c;->b:Landroid/content/pm/PackageInfo;

    iget-object v7, v1, Lyy/c;->a:Landroid/content/pm/PackageManager;

    if-eqz v7, :cond_b

    if-eqz v2, :cond_b

    iget-object v8, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v8, :cond_7

    invoke-virtual {v8, v7}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v7

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    if-eqz v7, :cond_8

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_9

    :cond_8
    const/4 v7, 0x0

    :cond_9
    if-nez v7, :cond_a

    iget-object v7, v1, Lyy/c;->c:Ljava/lang/String;

    :cond_a
    new-instance v8, Ll83/k;

    const-string v9, "app_name"

    invoke-direct {v8, v9, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v7, Ll83/k;

    const-string v9, "app_version"

    invoke-direct {v7, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v8, v7}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    goto :goto_6

    :cond_b
    move-object/from16 v2, v19

    :goto_6
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {v4}, Lyy/a;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v0, v5}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    sget-object v2, Lyy/a0;->b:Lyy/a0;

    invoke-virtual {v2}, Lyy/e0;->a()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-direct {v6, v0, v2}, Lyy/b;-><init>(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    return-object v6
.end method

.method public final b(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lyy/b;
    .locals 9

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->y:Lkr/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->F:Lt83/b;

    invoke-virtual {v0}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    iget-object v2, v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->w:Ljava/lang/String;

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    if-nez v1, :cond_2

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->z:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    :cond_2
    move-object v6, v1

    const/4 v7, 0x0

    const/16 v8, 0x2e

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-static/range {v2 .. v8}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    return-object p1
.end method
