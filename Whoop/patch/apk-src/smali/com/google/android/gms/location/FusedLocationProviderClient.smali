.class public Lcom/google/android/gms/location/FusedLocationProviderClient;
.super Lcom/google/android/gms/common/api/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/h;"
    }
.end annotation


# static fields
.field public static final KEY_MOCK_LOCATION:Ljava/lang/String; = "mockLocation"
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field public static final KEY_VERTICAL_ACCURACY:Ljava/lang/String; = "verticalAccuracy"
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Ltp/h;->a:Lcom/google/android/gms/common/api/f;

    new-instance v1, Ljc/b;

    const/16 v2, 0x18

    .line 2
    invoke-direct {v1, v2}, Ljc/b;-><init>(I)V

    .line 3
    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Ljc/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    .line 4
    sget-object v3, Ltp/h;->a:Lcom/google/android/gms/common/api/f;

    new-instance v0, Ljc/b;

    const/16 v1, 0x18

    .line 5
    invoke-direct {v0, v1}, Ljc/b;-><init>(I)V

    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    .line 7
    new-instance v5, Lcom/google/android/gms/common/api/g;

    invoke-direct {v5, v0, v1}, Lcom/google/android/gms/common/api/g;-><init>(Ljc/b;Landroid/os/Looper;)V

    const/4 v2, 0x0

    .line 8
    sget-object v4, Lcom/google/android/gms/common/api/c;->g:Lcom/google/android/gms/common/api/b;

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method

.method private final zze(Lnp/j;Ltp/g;Landroid/os/Looper;Ltp/u;I)Lcom/google/android/gms/tasks/Task;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/j;",
            "Ltp/g;",
            "Landroid/os/Looper;",
            "Ltp/u;",
            "I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p3}, Lse/a;->m0(Landroid/os/Looper;)Landroid/os/Looper;

    move-result-object p3

    const-class v0, Ltp/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, p2, v0}, Ls2/h;->g(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)Lto/k;

    move-result-object v7

    new-instance v3, Ltp/r;

    invoke-direct {v3, p0, v7}, Ltp/r;-><init>(Lcom/google/android/gms/location/FusedLocationProviderClient;Lto/k;)V

    new-instance v1, La30/w0;

    const/16 v8, 0xe

    move-object v2, p0

    move-object v6, p1

    move-object v4, p2

    move-object v5, p4

    invoke-direct/range {v1 .. v8}, La30/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {}, Lto/m;->a()Llo/r;

    move-result-object p1

    invoke-virtual {p1, v1}, Llo/r;->c(La30/w0;)V

    invoke-virtual {p1, v3}, Llo/r;->h(Ltp/r;)V

    invoke-virtual {p1, v7}, Llo/r;->i(Lto/k;)V

    invoke-virtual {p1, p5}, Llo/r;->g(I)V

    invoke-virtual {p1}, Llo/r;->b()Lto/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doRegisterEventListener(Lto/m;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public flushLocations()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    sget-object v1, Ltp/o;->y:Ltp/o;

    invoke-virtual {v0, v1}, Le73/b;->m(Lto/n;)V

    const/16 v1, 0x976

    invoke-virtual {v0, v1}, Le73/b;->o(I)V

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentLocation(ILcq/a;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p2    # Lcq/a;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcq/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->b()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/LocationRequest;->k(I)V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->i(J)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->h(J)V

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationRequest;->f()V

    invoke-static {v0}, Lnp/j;->b(Lcom/google/android/gms/location/LocationRequest;)Lnp/j;

    move-result-object p1

    invoke-virtual {p1}, Lnp/j;->i()V

    invoke-virtual {p1}, Lnp/j;->f()V

    new-instance v0, Lq30/w0;

    const/16 v1, 0x11

    invoke-direct {v0, p0, p2, p1, v1}, Lq30/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object p1

    invoke-virtual {p1, v0}, Le73/b;->m(Lto/n;)V

    sget-object v0, Ltp/h;->d:Lcom/google/android/gms/common/c;

    filled-new-array {v0}, [Lcom/google/android/gms/common/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Le73/b;->n([Lcom/google/android/gms/common/c;)V

    const/16 v0, 0x96f

    invoke-virtual {p1, v0}, Le73/b;->o(I)V

    invoke-virtual {p1}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    if-eqz p2, :cond_0

    new-instance v0, Lcq/i;

    invoke-direct {v0, p2}, Lcq/i;-><init>(Lcq/a;)V

    new-instance p2, Lcq/q;

    const/4 v1, 0x2

    invoke-direct {p2, v1, v0}, Lcq/q;-><init>(ILcq/i;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcq/b;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, v0, Lcq/i;->a:Lcq/u;

    :cond_0
    return-object p1
.end method

.method public getLastLocation()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Lq30/u0;

    const/16 v2, 0x1c

    invoke-direct {v1, p0, v2}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Le73/b;->m(Lto/n;)V

    const/16 v1, 0x96e

    invoke-virtual {v0, v1}, Le73/b;->o(I)V

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public getLocationAvailability()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/location/LocationAvailability;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    sget-object v1, Ltp/o;->x:Ltp/o;

    invoke-virtual {v0, v1}, Le73/b;->m(Lto/n;)V

    const/16 v1, 0x970

    invoke-virtual {v0, v1}, Le73/b;->o(I)V

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public removeLocationUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Ltp/p;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ltp/p;-><init>(ILandroid/app/PendingIntent;)V

    .line 2
    invoke-virtual {v0, v1}, Le73/b;->m(Lto/n;)V

    const/16 p1, 0x972

    .line 3
    invoke-virtual {v0, p1}, Le73/b;->o(I)V

    .line 4
    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public removeLocationUpdates(Ltp/g;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ltp/g;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltp/g;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-class v0, Ltp/g;

    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ls2/h;->h(Ltp/g;Ljava/lang/String;)Lto/j;

    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doUnregisterEventListener(Lto/j;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 8
    invoke-static {p1}, Ls3/d;->t(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Lcom/google/android/gms/location/LocationRequest;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p2    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lnp/j;->b(Lcom/google/android/gms/location/LocationRequest;)Lnp/j;

    move-result-object p1

    .line 2
    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Lq30/w0;

    const/16 v2, 0x12

    invoke-direct {v1, p0, p1, p2, v2}, Lq30/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 3
    invoke-virtual {v0, v1}, Le73/b;->m(Lto/n;)V

    const/16 p1, 0x971

    .line 4
    invoke-virtual {v0, p1}, Le73/b;->o(I)V

    .line 5
    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    .line 6
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Ltp/g;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;
    .locals 6
    .param p1    # Lcom/google/android/gms/location/LocationRequest;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p2    # Ltp/g;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p3    # Landroid/os/Looper;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Ltp/g;",
            "Landroid/os/Looper;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 7
    invoke-static {p1}, Lnp/j;->b(Lcom/google/android/gms/location/LocationRequest;)Lnp/j;

    move-result-object v1

    const/4 v4, 0x0

    const/16 v5, 0x984

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/location/FusedLocationProviderClient;->zze(Lnp/j;Ltp/g;Landroid/os/Looper;Ltp/u;I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public setMockLocation(Landroid/location/Location;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Landroid/location/Location;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Lq30/u0;

    const/16 v2, 0x1a

    invoke-direct {v1, p1, v2}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Le73/b;->m(Lto/n;)V

    const/16 p1, 0x975

    invoke-virtual {v0, p1}, Le73/b;->o(I)V

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public setMockMode(Z)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Lb9/m1;

    const/4 v2, 0x5

    invoke-direct {v1, p1, v2}, Lb9/m1;-><init>(ZI)V

    invoke-virtual {v0, v1}, Le73/b;->m(Lto/n;)V

    const/16 p1, 0x974

    invoke-virtual {v0, p1}, Le73/b;->o(I)V

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lnp/j;Landroid/app/PendingIntent;Lnp/i;Lcq/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Ltp/s;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p4}, Ltp/s;-><init>(ILcq/i;)V

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/h;->getContextAttributionTag()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Lnp/j;->h(Ljava/lang/String;)V

    iget-object p3, p3, Lnp/i;->A:Lcd3/g;

    iget-object p3, p3, Lcd3/g;->E:Ljava/lang/Object;

    check-cast p3, Laj/c;

    iget-object p4, p3, Laj/c;->x:Ljava/lang/Object;

    check-cast p4, Lnp/i;

    invoke-virtual {p4}, Luo/c;->c()V

    invoke-virtual {p3}, Laj/c;->a0()Lnp/e;

    move-result-object p3

    invoke-static {p1, p2, v0}, Lnp/k;->b(Lnp/j;Landroid/app/PendingIntent;Ltp/s;)Lnp/k;

    move-result-object p1

    invoke-virtual {p3, p1}, Lnp/e;->j0(Lnp/k;)V

    return-void
.end method

.method public final zzb(Ltp/v;Ltp/g;Ltp/u;Lnp/j;Lto/k;Lnp/i;Lcq/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Ltp/t;

    new-instance v1, Lq/f;

    invoke-direct {v1, p0, p1, p2, p3}, Lq/f;-><init>(Lcom/google/android/gms/location/FusedLocationProviderClient;Ltp/v;Ltp/g;Ltp/u;)V

    invoke-direct {v0, p7, v1}, Ltp/t;-><init>(Lcq/i;Lq/f;)V

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/h;->getContextAttributionTag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Lnp/j;->h(Ljava/lang/String;)V

    iget-object p1, p6, Lnp/i;->A:Lcd3/g;

    monitor-enter p1

    :try_start_0
    iget-object p2, p6, Lnp/i;->A:Lcd3/g;

    invoke-virtual {p2, p4, p5, v0}, Lcd3/g;->L(Lnp/j;Lto/k;Ltp/t;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final synthetic zzc(Lcq/a;Lnp/j;Lnp/i;Lcq/i;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v2, Ltp/q;

    invoke-direct {v2, p0, p4}, Ltp/q;-><init>(Lcom/google/android/gms/location/FusedLocationProviderClient;Lcq/i;)V

    if-eqz p1, :cond_0

    new-instance p3, Lq3/i;

    invoke-direct {p3, p0, v2}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p3}, Lcq/a;->a(Lcq/g;)Lcq/l;

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    new-instance v4, Lcq/q;

    const/4 p1, 0x5

    invoke-direct {v4, p1, p4}, Lcq/q;-><init>(ILcq/i;)V

    const/16 v5, 0x985

    move-object v0, p0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/location/FusedLocationProviderClient;->zze(Lnp/j;Ltp/g;Landroid/os/Looper;Ltp/u;I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lcq/q;

    const/4 p3, 0x1

    invoke-direct {p2, p3, p4}, Lcq/q;-><init>(ILcq/i;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcq/b;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final zzd(Lnp/i;Lcq/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/h;->getContextAttributionTag()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lnp/i;->A:Lcd3/g;

    iget-object p1, p1, Luo/c;->v:Luo/d0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Luo/d0;->x:[Lcom/google/android/gms/common/c;

    :goto_0
    sget-object v2, Ltp/h;->c:Lcom/google/android/gms/common/c;

    invoke-static {p1, v2}, Ls30/e;->f([Ljava/lang/Object;Lcom/google/android/gms/common/c;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, v1, Lcd3/g;->E:Ljava/lang/Object;

    check-cast p1, Laj/c;

    iget-object v1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lnp/i;

    invoke-virtual {v1}, Luo/c;->c()V

    invoke-virtual {p1}, Laj/c;->a0()Lnp/e;

    move-result-object p1

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 v0, 0x50

    invoke-virtual {p1, v1, v0}, Lnp/a;->X(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Lnp/l;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    goto :goto_1

    :cond_1
    iget-object p1, v1, Lcd3/g;->E:Ljava/lang/Object;

    check-cast p1, Laj/c;

    iget-object v0, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lnp/i;

    invoke-virtual {v0}, Luo/c;->c()V

    invoke-virtual {p1}, Laj/c;->a0()Lnp/e;

    move-result-object p1

    const/4 v0, 0x7

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lnp/a;->X(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Lnp/l;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    :goto_1
    invoke-virtual {p2, v0}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void
.end method
