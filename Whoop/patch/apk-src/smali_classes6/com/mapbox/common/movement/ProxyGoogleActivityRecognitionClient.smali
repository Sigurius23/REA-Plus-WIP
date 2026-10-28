.class public final Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Ltp/d;",
        "activityTransitionRequest",
        "Landroid/app/PendingIntent;",
        "pendingIntent",
        "Lcom/google/android/gms/tasks/Task;",
        "Ljava/lang/Void;",
        "requestActivityTransitionUpdates",
        "(Ltp/d;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;",
        "",
        "detectionIntervalMillis",
        "callbackIntent",
        "requestActivityUpdates",
        "(JLandroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;",
        "removeActivityTransitionUpdates",
        "(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;",
        "removeActivityUpdates",
        "googleActivityRecognitionClient",
        "Ljava/lang/Object;",
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
.field public static final Companion:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;

.field private static final available$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private static removeActivityTransitionUpdates:Ljava/lang/reflect/Method;

.field private static removeActivityUpdates:Ljava/lang/reflect/Method;

.field private static requestActivityTransitionUpdates:Ljava/lang/reflect/Method;

.field private static requestActivityUpdates:Ljava/lang/reflect/Method;


# instance fields
.field private final googleActivityRecognitionClient:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->Companion:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;

    sget-object v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion$available$2;->INSTANCE:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion$available$2;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->available$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/location/ActivityRecognition;->getClient(Landroid/content/Context;)Lcom/google/android/gms/location/ActivityRecognitionClient;

    move-result-object p1

    const-string v0, "getClient(context)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->googleActivityRecognitionClient:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getAvailable$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->available$delegate:Ll83/h;

    return-object v0
.end method

.method public static final synthetic access$setRemoveActivityTransitionUpdates$cp(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->removeActivityTransitionUpdates:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static final synthetic access$setRemoveActivityUpdates$cp(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->removeActivityUpdates:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static final synthetic access$setRequestActivityTransitionUpdates$cp(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->requestActivityTransitionUpdates:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static final synthetic access$setRequestActivityUpdates$cp(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->requestActivityUpdates:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final removeActivityTransitionUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
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

    :try_start_0
    sget-object v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->removeActivityTransitionUpdates:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->googleActivityRecognitionClient:Ljava/lang/Object;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/gms/tasks/Task;

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-string p1, "removeActivityTransitionUpdates"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance v0, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {v0, p1}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public final removeActivityUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
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

    :try_start_0
    sget-object v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->removeActivityUpdates:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->googleActivityRecognitionClient:Ljava/lang/Object;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/gms/tasks/Task;

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-string p1, "removeActivityUpdates"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance v0, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {v0, p1}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public final requestActivityTransitionUpdates(Ltp/d;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltp/d;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "activityTransitionRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingIntent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->requestActivityTransitionUpdates:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->googleActivityRecognitionClient:Ljava/lang/Object;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/gms/tasks/Task;

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-string p1, "requestActivityTransitionUpdates"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance p2, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {p2, p1}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    return-object p2
.end method

.method public final requestActivityUpdates(JLandroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "callbackIntent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->requestActivityUpdates:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->googleActivityRecognitionClient:Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/gms/tasks/Task;

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-string p1, "requestActivityUpdates"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance p2, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {p2, p1}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    return-object p2
.end method
