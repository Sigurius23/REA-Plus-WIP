.class public final Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J/\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ%\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u000e\u0010\u0012J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0015J\u0015\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R(\u0010\u0019\u001a\u00020\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0019\u0010\u001a\u0012\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lcom/google/android/gms/location/LocationRequest;",
        "request",
        "Ltp/g;",
        "callback",
        "Landroid/os/Looper;",
        "looper",
        "Lcom/google/android/gms/tasks/Task;",
        "Ljava/lang/Void;",
        "requestLocationUpdates",
        "(Lcom/google/android/gms/location/LocationRequest;Ltp/g;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;",
        "Landroid/app/PendingIntent;",
        "pendingIntent",
        "(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;",
        "removeLocationUpdates",
        "(Ltp/g;)Lcom/google/android/gms/tasks/Task;",
        "(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;",
        "Landroid/location/Location;",
        "getLastLocation",
        "()Lcom/google/android/gms/tasks/Task;",
        "googleFusedLocationProviderClient",
        "Ljava/lang/Object;",
        "getGoogleFusedLocationProviderClient",
        "()Ljava/lang/Object;",
        "setGoogleFusedLocationProviderClient",
        "(Ljava/lang/Object;)V",
        "getGoogleFusedLocationProviderClient$annotations",
        "()V",
        "Companion",
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
.field public static final Companion:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;

.field private static final GOOGLE_FUSED_LOCATION_PROVIDER_CLIENT:Ljava/lang/String; = "com.google.android.gms.location.FusedLocationProviderClient"

.field private static final available$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private static getLastLocation:Ljava/lang/reflect/Method;

.field public static removeLocationUpdatesCallback:Ljava/lang/reflect/Method;

.field public static removeLocationUpdatesPendingIntent:Ljava/lang/reflect/Method;

.field public static requestLocationUpdatesCallback:Ljava/lang/reflect/Method;

.field public static requestLocationUpdatesPendingIntent:Ljava/lang/reflect/Method;


# instance fields
.field private googleFusedLocationProviderClient:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->Companion:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;

    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion$available$2;->INSTANCE:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion$available$2;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->available$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ltp/h;->a:Lcom/google/android/gms/common/api/f;

    new-instance v0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-direct {v0, p1}, Lcom/google/android/gms/location/FusedLocationProviderClient;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->googleFusedLocationProviderClient:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getAvailable$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->available$delegate:Ll83/h;

    return-object v0
.end method

.method public static final synthetic access$setGetLastLocation$cp(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->getLastLocation:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static synthetic getGoogleFusedLocationProviderClient$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getGoogleFusedLocationProviderClient()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->googleFusedLocationProviderClient:Ljava/lang/Object;

    return-object v0
.end method

.method public final getLastLocation()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->getLastLocation:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->googleFusedLocationProviderClient:Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tasks/Task;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    const-string v0, "getLastLocation"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance v1, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {v1, v0}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    return-object v1
.end method

.method public final removeLocationUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 2
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

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    :try_start_0
    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->Companion:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;->getRemoveLocationUpdatesPendingIntent()Ljava/lang/reflect/Method;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->googleFusedLocationProviderClient:Ljava/lang/Object;

    .line 8
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 9
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 10
    new-instance v0, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {v0, p1}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public final removeLocationUpdates(Ltp/g;)Lcom/google/android/gms/tasks/Task;
    .locals 2
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

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->Companion:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;->getRemoveLocationUpdatesCallback()Ljava/lang/reflect/Method;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->googleFusedLocationProviderClient:Ljava/lang/Object;

    .line 3
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 4
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 5
    new-instance v0, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {v0, p1}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public final requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 2
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

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingIntent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    :try_start_0
    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->Companion:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;->getRequestLocationUpdatesPendingIntent()Ljava/lang/reflect/Method;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->googleFusedLocationProviderClient:Ljava/lang/Object;

    .line 8
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 9
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 10
    new-instance p2, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {p2, p1}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    return-object p2
.end method

.method public final requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Ltp/g;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;
    .locals 2
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

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->Companion:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;->getRequestLocationUpdatesCallback()Ljava/lang/reflect/Method;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->googleFusedLocationProviderClient:Ljava/lang/Object;

    .line 3
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    .line 4
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 5
    new-instance p2, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {p2, p1}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    return-object p2
.end method

.method public final setGoogleFusedLocationProviderClient(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->googleFusedLocationProviderClient:Ljava/lang/Object;

    return-void
.end method
