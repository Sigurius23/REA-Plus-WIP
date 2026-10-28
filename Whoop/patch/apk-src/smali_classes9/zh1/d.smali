.class public final Lzh1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzh1/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lzh1/d;",
        "Lzh1/a;",
        "Lcom/google/android/gms/location/FusedLocationProviderClient;",
        "fusedLocationClient",
        "Lfv1/c;",
        "locationManager",
        "Lgi1/b;",
        "gpsPermissionHelper",
        "<init>",
        "(Lcom/google/android/gms/location/FusedLocationProviderClient;Lfv1/c;Lgi1/b;)V",
        "Lec3/l;",
        "Lfv1/b;",
        "start",
        "()Lec3/l;",
        "Ll83/a0;",
        "stop",
        "()V",
        "a",
        "Lcom/google/android/gms/location/FusedLocationProviderClient;",
        "b",
        "Lfv1/c;",
        "c",
        "Lgi1/b;",
        "Ltp/g;",
        "d",
        "Ltp/g;",
        "locationCallback",
        "gps-tracking_release"
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

.field private final b:Lfv1/c;

.field private final c:Lgi1/b;

.field private d:Ltp/g;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/FusedLocationProviderClient;Lfv1/c;Lgi1/b;)V
    .locals 1

    const-string v0, "fusedLocationClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gpsPermissionHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzh1/d;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    iput-object p2, p0, Lzh1/d;->b:Lfv1/c;

    iput-object p3, p0, Lzh1/d;->c:Lgi1/b;

    return-void
.end method

.method public static final synthetic a(Lzh1/d;)Lcom/google/android/gms/location/FusedLocationProviderClient;
    .locals 0

    iget-object p0, p0, Lzh1/d;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    return-object p0
.end method

.method public static final synthetic b(Lzh1/d;)Lgi1/b;
    .locals 0

    iget-object p0, p0, Lzh1/d;->c:Lgi1/b;

    return-object p0
.end method

.method public static final synthetic c(Lzh1/d;)Ltp/g;
    .locals 0

    iget-object p0, p0, Lzh1/d;->d:Ltp/g;

    return-object p0
.end method

.method public static final synthetic d(Lzh1/d;)Lfv1/c;
    .locals 0

    iget-object p0, p0, Lzh1/d;->b:Lfv1/c;

    return-object p0
.end method

.method public static final synthetic e(Lzh1/d;Ltp/g;)V
    .locals 0

    iput-object p1, p0, Lzh1/d;->d:Ltp/g;

    return-void
.end method


# virtual methods
.method public start()Lec3/l;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lzh1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lzh1/d$a;-><init>(Lzh1/d;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object v0

    return-object v0
.end method

.method public stop()V
    .locals 2

    iget-object v0, p0, Lzh1/d;->d:Ltp/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lzh1/d;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Ltp/g;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lzh1/d;->d:Ltp/g;

    return-void
.end method
