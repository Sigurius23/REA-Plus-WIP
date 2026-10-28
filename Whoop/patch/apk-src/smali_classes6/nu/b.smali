.class public final Lnu/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/whoop/realtime/presentation/StartActivityActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/presentation/StartActivityActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnu/b;->a:Lcom/whoop/realtime/presentation/StartActivityActivity;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/realtime/presentation/StartActivityActivity;)V
    .locals 5

    const-string v0, "PermissionsManager"

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x1000

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v2, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-static {v1, v2}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v1, v3}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v1, v4}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v3, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v1, "Location permissions are missing"

    invoke-virtual {p1, v0, v1}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, v3, v1, v2}, Lnu/b;->b(Lcom/whoop/realtime/presentation/StartActivityActivity;ZZZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :goto_1
    sget-object v1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v0, p1}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Lcom/whoop/realtime/presentation/StartActivityActivity;ZZZ)V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_0

    const-string p2, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p3, :cond_1

    const-string p2, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1d

    if-lt p2, p3, :cond_2

    if-eqz p4, :cond_2

    const-string p2, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 p2, 0x0

    new-array p3, p2, [Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    const-string p4, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/String;

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    array-length v0, p3

    move v1, p2

    :goto_0
    if-ge v1, v0, :cond_4

    aget-object v2, p3, v1

    invoke-static {p1, v2}, Landroidx/core/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lnu/b;->a:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-interface {v0, p4}, Lnu/a;->e(Ljava/util/List;)V

    :cond_5
    invoke-static {p1, p3, p2}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void
.end method
