.class public final Lfv1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfv1/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0097@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lfv1/a;",
        "Lfv1/c;",
        "Lcom/google/android/gms/location/FusedLocationProviderClient;",
        "fusedLocationClient",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/google/android/gms/location/FusedLocationProviderClient;Ltr2/n;)V",
        "Lfv1/b;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/google/android/gms/location/FusedLocationProviderClient;",
        "b",
        "Ltr2/n;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/location/FusedLocationProviderClient;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/FusedLocationProviderClient;Ltr2/n;)V
    .locals 1

    const-string v0, "fusedLocationClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfv1/a;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    iput-object p2, p0, Lfv1/a;->b:Ltr2/n;

    return-void
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 21
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lfv1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lfv1/a$a;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lfv1/a$a;

    iget v3, v2, Lfv1/a$a;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lfv1/a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Lfv1/a$a;

    invoke-direct {v2, v1, v0}, Lfv1/a$a;-><init>(Lfv1/a;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Lfv1/a$a;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lfv1/a$a;->z:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lfv1/a$a;->w:Ljava/lang/Object;

    check-cast v3, Landroid/location/Location;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, v1, Lfv1/a;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {v0}, Lcom/google/android/gms/location/FusedLocationProviderClient;->getLastLocation()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    const-string v4, "getLastLocation(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput v6, v2, Lfv1/a$a;->z:I

    invoke-static {v0, v2}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast v0, Landroid/location/Location;

    if-nez v0, :cond_6

    iget-object v0, v1, Lfv1/a;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    const/16 v4, 0x68

    invoke-virtual {v0, v4, v7}, Lcom/google/android/gms/location/FusedLocationProviderClient;->getCurrentLocation(ILcq/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    const-string v4, "getCurrentLocation(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v2, Lfv1/a$a;->w:Ljava/lang/Object;

    iput v5, v2, Lfv1/a$a;->z:I

    invoke-static {v0, v2}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    :goto_2
    return-object v3

    :cond_5
    :goto_3
    check-cast v0, Landroid/location/Location;

    :cond_6
    if-eqz v0, :cond_7

    new-instance v8, Lfv1/b;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v11

    invoke-virtual {v0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v13

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v0}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result v5

    float-to-double v5, v5

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v19

    move-wide v15, v3

    move-wide/from16 v17, v5

    invoke-direct/range {v8 .. v20}, Lfv1/b;-><init>(DDDDDJ)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v8

    :cond_7
    return-object v7

    :goto_4
    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v2, v1, Lfv1/a;->b:Ltr2/n;

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Failed to retrieve location"

    invoke-interface {v2, v4, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v7
.end method
