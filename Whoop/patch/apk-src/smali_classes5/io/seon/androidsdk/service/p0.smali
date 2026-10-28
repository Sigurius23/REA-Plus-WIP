.class public final Lio/seon/androidsdk/service/p0;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"

# interfaces
.implements Landroid/location/LocationListener;


# static fields
.field public static final p:[Ljava/lang/String;

.field public static final q:Ljava/util/Map;


# instance fields
.field public final e:Ljava/util/ArrayList;

.field public f:Lio/sentry/hints/j;

.field public g:Landroid/content/Context;

.field public h:Landroid/location/LocationManager;

.field public i:Landroid/content/pm/PackageManager;

.field public j:Ljava/util/concurrent/CountDownLatch;

.field public k:Z

.field public l:Landroid/location/Location;

.field public m:Landroid/location/Location;

.field public n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

.field public o:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const-string v6, "mock_location_apps"

    const-string v7, "timestamp"

    const-string v0, "latitude"

    const-string v1, "longitude"

    const-string v2, "accuracy"

    const-string v3, "is_cached"

    const-string v4, "status"

    const-string v5, "is_simulated"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/p0;->p:[Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "network"

    const/4 v2, 0x2

    const/4 v3, 0x1

    const-string v4, "fused"

    invoke-static {v3, v0, v1, v2, v4}, Lih0/d0;->x(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "gps"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/p0;->q:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lio/seon/androidsdk/service/g;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 6

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lio/seon/androidsdk/service/g0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/seon/androidsdk/service/g0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "experimental_device_location"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x3

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->k()Ljava/util/HashMap;

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

    sget-object v5, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v5, v1, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :goto_1
    const-string v5, "gnss_capabilities"

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v4, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {v4}, Landroid/location/LocationManager;->getGnssHardwareModelName()Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catch_1
    move-exception v4

    goto :goto_3

    :catchall_1
    :goto_2
    move-object v4, v3

    goto :goto_4

    :goto_3
    sget-object v5, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v5, v1, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2

    :goto_4
    const-string v5, "gnss_hardware_model_name"

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    iget-object v4, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {v4}, Landroid/location/LocationManager;->getGnssYearOfHardware()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    :goto_5
    move-object v1, v3

    goto :goto_6

    :catch_2
    move-exception v4

    sget-object v5, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v5, v1, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_5

    :goto_6
    const-string v4, "gnss_year_of_hardware"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v4, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->SUCCESS:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    if-eq v1, v4, :cond_0

    sget-object v4, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_SUPPORT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    if-eq v1, v4, :cond_0

    iput-object v3, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    sget-object v1, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->UNKNOWN:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object v1, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lio/seon/androidsdk/service/p0;->o:Z

    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->f()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lio/seon/androidsdk/service/o0;

    invoke-direct {v3, p0, v1}, Lio/seon/androidsdk/service/o0;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const-class v1, Lio/seon/androidsdk/service/o;

    monitor-enter v1

    :try_start_3
    invoke-static {v3}, Lio/seon/androidsdk/service/o;->l(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    monitor-exit v1

    new-instance v1, Lio/seon/androidsdk/service/o0;

    invoke-direct {v1, p0, v2}, Lio/seon/androidsdk/service/o0;-><init>(Ljava/lang/Object;I)V

    const-class v2, Lio/seon/androidsdk/service/o;

    monitor-enter v2

    :try_start_4
    invoke-static {v1}, Lio/seon/androidsdk/service/o;->l(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    monitor-exit v2

    return-object v0

    :catchall_3
    move-exception v0

    monitor-exit v2

    throw v0

    :catchall_4
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw v0

    :cond_1
    return-object v0
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 4

    const-string v0, "passive"

    const-string v1, "network"

    const-string v2, "gps"

    :try_start_0
    iget-object v3, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    iput-object v3, p0, Lio/seon/androidsdk/service/p0;->g:Landroid/content/Context;

    const-string p1, "location"

    invoke-virtual {v3, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/LocationManager;

    iput-object p1, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/p0;->i:Landroid/content/pm/PackageManager;

    new-instance p1, Landroid/location/Location;

    const-string v3, "default"

    invoke-direct {p1, v3}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/seon/androidsdk/service/p0;->l:Landroid/location/Location;

    sget-object v3, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->UNKNOWN:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object v3, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iget-object v3, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    if-eqz v3, :cond_6

    iget-object v3, p0, Lio/seon/androidsdk/service/p0;->i:Landroid/content/pm/PackageManager;

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->f()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_SUPPORT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    if-ne p1, v0, :cond_7

    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->l:Landroid/location/Location;

    iput-object p1, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    return-void

    :cond_1
    iget-boolean p1, p0, Lio/seon/androidsdk/service/p0;->k:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v3, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    if-eqz p1, :cond_2

    :try_start_1
    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {p1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    const-string v2, "fused"

    invoke-virtual {p1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {p1, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {p1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->g()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    :try_start_3
    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->g()V

    :goto_0
    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->g()V

    return-void

    :cond_6
    :goto_1
    iput-object p1, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    sget-object p1, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_SUPPORT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object p1, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_7
    return-void
.end method

.method public final f()Z
    .locals 4

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->i:Landroid/content/pm/PackageManager;

    const-string v1, "android.hardware.location"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_SUPPORT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    :goto_0
    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-boolean v1, p0, Lio/seon/androidsdk/service/p0;->k:Z

    return v1

    :cond_0
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {v0}, Landroid/location/LocationManager;->isLocationEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->DISABLED:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->g:Landroid/content/Context;

    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0, v2}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->i:Landroid/content/pm/PackageManager;

    const-string v3, "android.hardware.location.gps"

    invoke-virtual {v0, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v2, p0, Lio/seon/androidsdk/service/p0;->k:Z

    return v2

    :cond_2
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->g:Landroid/content/Context;

    const-string v3, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iput-boolean v1, p0, Lio/seon/androidsdk/service/p0;->k:Z

    return v2

    :cond_3
    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_PERMISSION:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    goto :goto_0
.end method

.method public final g()V
    .locals 8

    const-string v0, "passive"

    :try_start_0
    iget-object v1, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    const-string v3, "passive"

    invoke-virtual {p0, v0}, Lio/seon/androidsdk/service/p0;->h(Ljava/lang/String;)J

    move-result-wide v4

    const/4 v6, 0x0

    move-object v7, p0

    invoke-virtual/range {v2 .. v7}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public final h(Ljava/lang/String;)J
    .locals 7

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0x258

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    const-string v3, "gps"

    invoke-static {p1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide/16 v3, 0x1e

    :goto_0
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    goto :goto_1

    :cond_0
    const-wide/16 v3, 0xa

    goto :goto_0

    :goto_1
    const-wide/16 v5, 0x2

    div-long v5, v1, v5

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x64

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final i(Lio/sentry/hints/j;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Lio/sentry/hints/j;

    const/16 v0, 0x1b

    invoke-direct {p1, v0}, Lio/sentry/hints/j;-><init>(I)V

    :cond_0
    iput-object p1, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->i:Landroid/content/pm/PackageManager;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->f()Z

    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    :goto_0
    return-void
.end method

.method public final j(Landroid/location/Location;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v3

    sub-long/2addr v1, v3

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    long-to-double v1, v1

    iget-object v3, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v3, 0x258

    int-to-double v3, v3

    const-wide v5, 0x3f847ae147ae147bL    # 0.01

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    cmpl-double v1, v1, v3

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-ge v1, v2, :cond_2

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->hasAccuracy()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v1

    cmp-long p1, v1, v3

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0

    :cond_2
    invoke-virtual {p1}, Landroid/location/Location;->isComplete()Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final k()Ljava/util/HashMap;
    .locals 10

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return-object v2

    :cond_0
    iget-object v1, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {v1}, Landroid/location/LocationManager;->getGnssCapabilities()Landroid/location/GnssCapabilities;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/GnssCapabilities;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x3

    sget-object v8, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    if-lt v0, v6, :cond_1

    :try_start_0
    invoke-virtual {v1}, Landroid/location/GnssCapabilities;->hasAntennaInfo()Z

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    move v0, v5

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    :goto_1
    move-object v0, v2

    goto :goto_3

    :goto_2
    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1

    :goto_3
    const-string v9, "has_antenna_info"

    invoke-virtual {v4, v9, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v6, :cond_2

    invoke-virtual {v1}, Landroid/location/GnssCapabilities;->hasMeasurements()Z

    move-result v0

    goto :goto_4

    :cond_2
    move v0, v5

    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    :goto_5
    move-object v0, v2

    goto :goto_6

    :catch_1
    move-exception v0

    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_5

    :goto_6
    const-string v9, "has_measurements"

    invoke-virtual {v4, v9, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v6, :cond_3

    invoke-virtual {v1}, Landroid/location/GnssCapabilities;->hasNavigationMessages()Z

    move-result v5

    :cond_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_8

    :catchall_2
    :goto_7
    move-object v0, v2

    goto :goto_8

    :catch_2
    move-exception v0

    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_7

    :goto_8
    const-string v1, "has_navigation_messages"

    invoke-virtual {v4, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    const-string v0, "SCHEDULING"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_a

    :catchall_3
    :goto_9
    move-object v0, v2

    goto :goto_a

    :catch_3
    move-exception v0

    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_9

    :goto_a
    const-string v1, "has_scheduling"

    invoke-virtual {v4, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4
    const-string v0, "TOTAL_POWER"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_c

    :catchall_4
    :goto_b
    move-object v0, v2

    goto :goto_c

    :catch_4
    move-exception v0

    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_b

    :goto_c
    const-string v1, "has_power_total"

    invoke-virtual {v4, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_5
    const-string v0, "SINGLEBAND_TRACKING_POWER"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_e

    :catchall_5
    :goto_d
    move-object v0, v2

    goto :goto_e

    :catch_5
    move-exception v0

    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_d

    :goto_e
    const-string v1, "has_power_singleband_tracking"

    invoke-virtual {v4, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_6
    const-string v0, "MULTIBAND_TRACKING_POWER"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_10

    :catchall_6
    :goto_f
    move-object v0, v2

    goto :goto_10

    :catch_6
    move-exception v0

    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_f

    :goto_10
    const-string v1, "has_power_multiband_tracking"

    invoke-virtual {v4, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_7
    const-string v0, "SINGLEBAND_ACQUISITION_POWER"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_12

    :catchall_7
    :goto_11
    move-object v0, v2

    goto :goto_12

    :catch_7
    move-exception v0

    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_11

    :goto_12
    const-string v1, "has_power_singleband_acquisition"

    invoke-virtual {v4, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_8
    const-string v0, "MULTIBAND_ACQUISITION_POWER"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_14

    :catchall_8
    :goto_13
    move-object v0, v2

    goto :goto_14

    :catch_8
    move-exception v0

    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_13

    :goto_14
    const-string v1, "has_power_multiband_acquisition"

    invoke-virtual {v4, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_9
    const-string v0, "OTHER_MODES_POWER"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_15

    :catch_9
    move-exception v0

    invoke-virtual {v8, v7, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_9
    :goto_15
    const-string v0, "has_power_other_modes"

    invoke-virtual {v4, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4
.end method

.method public final l()Landroid/location/Location;
    .locals 5

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    iget-object v1, p0, Lio/seon/androidsdk/service/p0;->l:Landroid/location/Location;

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lio/seon/androidsdk/service/p0;->j(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v1

    invoke-virtual {v0}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v3

    sub-long/2addr v1, v3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v1, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->UNKNOWN:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object v1, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->f()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->l:Landroid/location/Location;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    return-object v0

    :cond_2
    sget-object v1, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->DISABLED:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    if-eq v0, v1, :cond_3

    sget-object v1, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_PERMISSION:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    if-ne v0, v1, :cond_6

    :cond_3
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lio/seon/androidsdk/service/p0;->k:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    const-string v1, "fused"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    const-string v1, "network"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    const-string v1, "network"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    const-string v1, "network"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_PROVIDER:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->l:Landroid/location/Location;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    return-object v0

    :cond_7
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {v2, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/seon/androidsdk/service/p0;->j(Landroid/location/Location;)Z

    move-result v2

    if-nez v2, :cond_9

    const/4 v1, 0x0

    :cond_9
    if-eqz v1, :cond_8

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->SUCCESS:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object v1, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    return-object v1

    :cond_a
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v1, p0, Lio/seon/androidsdk/service/p0;->j:Ljava/util/concurrent/CountDownLatch;

    new-instance v1, Lio/sentry/android/core/r0;

    const/4 v2, 0x7

    invoke-direct {v1, v2, p0, v0}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-class v0, Lio/seon/androidsdk/service/o;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Lio/seon/androidsdk/service/o;->l(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    :try_start_1
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->j:Ljava/util/concurrent/CountDownLatch;

    iget-object v1, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0xbb8

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->TIMEOUT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->l:Landroid/location/Location;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_b
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    return-object v0

    :catch_0
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->FAIL:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->l:Landroid/location/Location;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    :goto_0
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v1, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->UNKNOWN:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    if-ne v0, v1, :cond_c

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->FAIL:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    :cond_c
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    if-nez v0, :cond_d

    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->l:Landroid/location/Location;

    iput-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    :cond_d
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final onLocationChanged(Landroid/location/Location;)V
    .locals 4

    invoke-virtual {p0, p1}, Lio/seon/androidsdk/service/p0;->j(Landroid/location/Location;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    invoke-virtual {p0, v0}, Lio/seon/androidsdk/service/p0;->j(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/seon/androidsdk/service/p0;->q:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iget-object v2, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    iget-object v3, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    invoke-virtual {v3}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    cmpg-float v2, v2, v3

    if-ltz v2, :cond_2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v0, v1, :cond_3

    :cond_2
    iput-object p1, p0, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    sget-object p1, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->SUCCESS:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    iput-object p1, p0, Lio/seon/androidsdk/service/p0;->n:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    :cond_3
    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->j:Ljava/util/concurrent/CountDownLatch;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_4
    iget-boolean p1, p0, Lio/seon/androidsdk/service/p0;->o:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/seon/androidsdk/service/p0;->o:Z

    :cond_5
    :goto_0
    return-void
.end method

.method public final onProviderDisabled(Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->f()Z

    move-result v0

    const-string v1, "gps"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lio/seon/androidsdk/service/p0;->k:Z

    if-nez v2, :cond_0

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    :cond_1
    return-void
.end method

.method public final onProviderEnabled(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lio/seon/androidsdk/service/p0;->f()Z

    move-result v0

    const-string v1, "gps"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lio/seon/androidsdk/service/p0;->k:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lio/seon/androidsdk/service/o0;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lio/seon/androidsdk/service/o0;-><init>(Ljava/lang/Object;I)V

    sget-object v0, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const-class v0, Lio/seon/androidsdk/service/o;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lio/seon/androidsdk/service/o;->l(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    new-instance p1, Lio/seon/androidsdk/service/o0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lio/seon/androidsdk/service/o0;-><init>(Ljava/lang/Object;I)V

    const-class v0, Lio/seon/androidsdk/service/o;

    monitor-enter v0

    :try_start_1
    invoke-static {p1}, Lio/seon/androidsdk/service/o;->l(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    const/4 p3, 0x2

    if-ne p2, p3, :cond_0

    invoke-virtual {p0, p1}, Lio/seon/androidsdk/service/p0;->onProviderEnabled(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lio/seon/androidsdk/service/p0;->onProviderDisabled(Ljava/lang/String;)V

    return-void
.end method
