.class public final Lcom/mapbox/common/movement/GoogleActivityRecognition;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/movement/ActivityRecognitionClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;,
        Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;,
        Lcom/mapbox/common/movement/GoogleActivityRecognition$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0008\u0006*\u0001+\u0008\u0001\u0018\u0000 .2\u00020\u0001:\u0002./B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0017\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-\u00a8\u00060"
    }
    d2 = {
        "Lcom/mapbox/common/movement/GoogleActivityRecognition;",
        "Lcom/mapbox/common/movement/ActivityRecognitionClient;",
        "Landroid/content/Context;",
        "context",
        "Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;",
        "mode",
        "<init>",
        "(Landroid/content/Context;Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;)V",
        "",
        "hasActivityRecognitionPermission",
        "()Z",
        "",
        "activityRecognitionPermissionName",
        "()Ljava/lang/String;",
        "Ll83/a0;",
        "start",
        "()V",
        "stop",
        "isPlatformActivityRecognitionAvailable",
        "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;",
        "observer",
        "addObserver",
        "(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V",
        "removeObserver",
        "Landroid/content/Context;",
        "Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "observers",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "isSubscribed",
        "Z",
        "Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;",
        "activityClient",
        "Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;",
        "Landroid/content/IntentFilter;",
        "activityUpdatesIntentFilter",
        "Landroid/content/IntentFilter;",
        "Landroid/app/PendingIntent;",
        "activityUpdatesPendingIntent$delegate",
        "Ll83/h;",
        "getActivityUpdatesPendingIntent",
        "()Landroid/app/PendingIntent;",
        "activityUpdatesPendingIntent",
        "com/mapbox/common/movement/GoogleActivityRecognition$broadcast$1",
        "broadcast",
        "Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;",
        "Companion",
        "Mode",
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
.field private static final ACTIVITY_DETECTION_INTERVAL_MILLIS:J = 0x3e8L

.field public static final ACTIVITY_UPDATES_ACTION:Ljava/lang/String; = "com.mapbox.common.movement.action.ACTIVITY_RECOGNITION_UPDATES"

.field private static final ACTIVITY_UPDATES_CODE:I = 0x3e8

.field public static final Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

.field public static final GOOGLE_ACTIVITY_RECOGNITION_CLIENT:Ljava/lang/String; = "com.google.android.gms.location.ActivityRecognitionClient"

.field public static final TAG:Ljava/lang/String; = "ActivityRecognitionObserver"

.field private static final TRANSITION_API_CONFIDENCE_SCORE:I = 0x55

.field private static final TRANSITION_API_MONITORING_TYPES$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private static googlePlayActivityRecognitionBundled:Z


# instance fields
.field private final activityClient:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;

.field private final activityUpdatesIntentFilter:Landroid/content/IntentFilter;

.field private final activityUpdatesPendingIntent$delegate:Ll83/h;

.field private final broadcast:Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;

.field private final context:Landroid/content/Context;

.field private isSubscribed:Z

.field private final mode:Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;

.field private final observers:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    sget-object v0, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2;->INSTANCE:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->TRANSITION_API_MONITORING_TYPES$delegate:Ll83/h;

    const-string v0, "com.google.android.gms.location.ActivityRecognitionClient"

    invoke-static {v0}, Lcom/mapbox/common/location/LocationServiceUtils;->isOnClasspath(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->googlePlayActivityRecognitionBundled:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->mode:Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;

    .line 4
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p2, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->observers:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    new-instance p2, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;

    invoke-direct {p2, p1}, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityClient:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;

    .line 6
    new-instance p1, Landroid/content/IntentFilter;

    const-string p2, "com.mapbox.common.movement.action.ACTIVITY_RECOGNITION_UPDATES"

    invoke-direct {p1, p2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityUpdatesIntentFilter:Landroid/content/IntentFilter;

    .line 7
    new-instance p1, Lcom/mapbox/common/movement/GoogleActivityRecognition$activityUpdatesPendingIntent$2;

    invoke-direct {p1, p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$activityUpdatesPendingIntent$2;-><init>(Lcom/mapbox/common/movement/GoogleActivityRecognition;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityUpdatesPendingIntent$delegate:Ll83/h;

    .line 8
    new-instance p1, Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;

    invoke-direct {p1, p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;-><init>(Lcom/mapbox/common/movement/GoogleActivityRecognition;)V

    iput-object p1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->broadcast:Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 9
    sget-object p2, Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;->TRANSITION_API:Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/movement/GoogleActivityRecognition;-><init>(Landroid/content/Context;Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;)V

    return-void
.end method

.method public static final synthetic access$getContext$p(Lcom/mapbox/common/movement/GoogleActivityRecognition;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getGooglePlayActivityRecognitionBundled$cp()Z
    .locals 1

    sget-boolean v0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->googlePlayActivityRecognitionBundled:Z

    return v0
.end method

.method public static final synthetic access$getMode$p(Lcom/mapbox/common/movement/GoogleActivityRecognition;)Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->mode:Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;

    return-object p0
.end method

.method public static final synthetic access$getObservers$p(Lcom/mapbox/common/movement/GoogleActivityRecognition;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->observers:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method public static final synthetic access$getTRANSITION_API_MONITORING_TYPES$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->TRANSITION_API_MONITORING_TYPES$delegate:Ll83/h;

    return-object v0
.end method

.method public static final synthetic access$setGooglePlayActivityRecognitionBundled$cp(Z)V
    .locals 0

    sput-boolean p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->googlePlayActivityRecognitionBundled:Z

    return-void
.end method

.method private final activityRecognitionPermissionName()Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const-string v0, "android.permission.ACTIVITY_RECOGNITION"

    return-object v0

    :cond_0
    const-string v0, "com.google.android.gms.permission.ACTIVITY_RECOGNITION"

    return-object v0
.end method

.method private final getActivityUpdatesPendingIntent()Landroid/app/PendingIntent;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityUpdatesPendingIntent$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-activityUpdatesPendingIntent>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/PendingIntent;

    return-object v0
.end method

.method private final hasActivityRecognitionPermission()Z
    .locals 2

    iget-object v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->context:Landroid/content/Context;

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityRecognitionPermissionName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public addObserver(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->observers:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public isPlatformActivityRecognitionAvailable()Z
    .locals 1

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->hasActivityRecognitionPermission()Z

    move-result v0

    return v0
.end method

.method public removeObserver(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->observers:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public declared-synchronized start()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "start() skipped. isSubscribed: "

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->isSubscribed:Z

    if-nez v1, :cond_3

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->hasActivityRecognitionPermission()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->isSubscribed:Z

    iget-object v1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->broadcast:Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;

    iget-object v3, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityUpdatesIntentFilter:Landroid/content/IntentFilter;

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Ls4/c;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->mode:Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;

    sget-object v2, Lcom/mapbox/common/movement/GoogleActivityRecognition$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    if-eq v1, v0, :cond_2

    if-eq v1, v4, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    iget-object v1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityClient:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->getActivityUpdatesPendingIntent()Landroid/app/PendingIntent;

    move-result-object v2

    const-wide/16 v3, 0x3e8

    invoke-virtual {v1, v3, v4, v2}, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->requestActivityUpdates(JLandroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    const-string v2, "requestActivityUpdates"

    invoke-static {v0, v1, v2}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->access$withLogs(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    sget-object v0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    iget-object v1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityClient:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;

    new-instance v2, Ltp/d;

    invoke-static {v0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->access$getTRANSITION_API_MONITORING_TYPES(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v4, v4}, Ltp/d;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->getActivityUpdatesPendingIntent()Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->requestActivityTransitionUpdates(Ltp/d;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    const-string v2, "requestActivityTransitionUpdates"

    invoke-static {v0, v1, v2}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->access$withLogs(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_3
    :goto_1
    :try_start_1
    sget-object v1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v2, "ActivityRecognitionObserver"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->isSubscribed:Z

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", has permission: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->hasActivityRecognitionPermission()Z

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized stop()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "stop() skipped. isSubscribed: "

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->isSubscribed:Z

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->hasActivityRecognitionPermission()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->isSubscribed:Z

    iget-object v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->broadcast:Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->mode:Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;

    sget-object v1, Lcom/mapbox/common/movement/GoogleActivityRecognition$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    iget-object v1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityClient:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->getActivityUpdatesPendingIntent()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->removeActivityUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    const-string v2, "removeActivityUpdates"

    invoke-static {v0, v1, v2}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->access$withLogs(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    sget-object v0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    iget-object v1, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->activityClient:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->getActivityUpdatesPendingIntent()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->removeActivityTransitionUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    const-string v2, "removeActivityTransitionUpdates"

    invoke-static {v0, v1, v2}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->access$withLogs(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_3
    :goto_1
    :try_start_1
    sget-object v1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v2, "ActivityRecognitionObserver"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/common/movement/GoogleActivityRecognition;->isSubscribed:Z

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", has permission: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->hasActivityRecognitionPermission()Z

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
