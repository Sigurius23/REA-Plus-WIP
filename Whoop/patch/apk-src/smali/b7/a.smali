.class public final Lb7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lb7/a;

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb7/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb7/a;->a:Lb7/a;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    const-string v0, "android.health.connect.action.HEALTH_HOME_SETTINGS"

    goto :goto_0

    :cond_0
    const-string v0, "androidx.health.ACTION_HEALTH_CONNECT_SETTINGS"

    :goto_0
    sput-object v0, Lb7/a;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Lb7/a;Landroid/content/Context;)Lb7/b;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "com.google.android.apps.healthdata"

    invoke-static {p1, p0}, Lb7/a;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance p0, Le7/r;

    invoke-direct {p0, p1}, Le7/r;-><init>(Landroid/content/Context;)V

    return-object p0

    :cond_0
    new-instance v0, Le7/g;

    invoke-static {p1, p0}, Ls7/a;->g(Landroid/content/Context;Ljava/lang/String;)Lv7/b;

    move-result-object p0

    invoke-direct {v0, p0}, Le7/g;-><init>(Lv7/b;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Service not available"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "SDK version too low"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)I
    .locals 5

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "context.packageManager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    const-string v2, "{\n                    @S\u2026= */ 0)\n                }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-boolean v2, v2, Landroid/content/pm/ApplicationInfo;->enabled:Z

    if-eqz v2, :cond_2

    const-string v2, "com.google.android.apps.healthdata"

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Lrj/j;->t(Landroid/content/pm/PackageInfo;)J

    move-result-wide v1

    const-wide/32 v3, 0x10c0f

    cmp-long v1, v1, v3

    if-ltz v1, :cond_2

    :cond_1
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE"

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v1, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    const-string p1, "packageManager.queryIntentServices(bindIntent, 0)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    :goto_0
    const/4 p0, 0x3

    return p0

    :catch_0
    :cond_2
    const/4 p0, 0x2

    return p0
.end method

.method public static synthetic c(Lb7/a;Landroid/content/Context;)I
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "com.google.android.apps.healthdata"

    invoke-static {p1, p0}, Lb7/a;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    return p0
.end method
