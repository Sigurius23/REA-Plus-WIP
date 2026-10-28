.class public final Lio/seon/androidsdk/service/j1;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"


# static fields
.field public static final f:[Ljava/lang/String;


# instance fields
.field public e:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "region_timezone"

    const-string v1, "timezone_identifier"

    const-string v2, "region_country"

    const-string v3, "region_language"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/j1;->f:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 6

    sget-object v0, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x3

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lio/seon/androidsdk/service/j1;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget-object v4, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    :goto_0
    move-object v4, v3

    goto :goto_1

    :catch_0
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :goto_1
    const-string v5, "region_country"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catch_1
    move-exception v4

    goto :goto_3

    :catchall_1
    :goto_2
    move-object v0, v3

    goto :goto_4

    :goto_3
    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2

    :goto_4
    const-string v2, "region_language"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/g0;

    const/4 v2, 0x5

    invoke-direct {v0, p0, v2}, Lio/seon/androidsdk/service/g0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "region_timezone"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catch_2
    :catchall_2
    const-string v0, "timezone_identifier"

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 1

    iget-object v0, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/seon/androidsdk/service/j1;->e:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    return-void
.end method
