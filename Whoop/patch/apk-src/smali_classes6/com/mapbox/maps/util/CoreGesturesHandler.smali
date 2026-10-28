.class public final Lcom/mapbox/maps/util/CoreGesturesHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/mapbox/maps/util/CoreGesturesHandler;",
        "",
        "Lmv/h;",
        "mapTransformDelegate",
        "Lmv/a;",
        "mapCameraManagerDelegate",
        "<init>",
        "(Lmv/h;Lmv/a;)V",
        "",
        "isSetCenterAltitudeModeNeeded",
        "()Z",
        "Ll83/a0;",
        "notifyCoreGestureStarted",
        "()V",
        "notifyCoreTouchEnded",
        "Lmv/h;",
        "Lmv/a;",
        "gestureAnimationStarted",
        "Z",
        "gestureStarted",
        "Lcom/mapbox/maps/MapCenterAltitudeMode;",
        "cachedCenterAltitudeMode",
        "Lcom/mapbox/maps/MapCenterAltitudeMode;",
        "Landroid/animation/AnimatorListenerAdapter;",
        "coreGestureAnimatorHandler",
        "Landroid/animation/AnimatorListenerAdapter;",
        "getCoreGestureAnimatorHandler",
        "()Landroid/animation/AnimatorListenerAdapter;",
        "sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private cachedCenterAltitudeMode:Lcom/mapbox/maps/MapCenterAltitudeMode;

.field private final coreGestureAnimatorHandler:Landroid/animation/AnimatorListenerAdapter;

.field private gestureAnimationStarted:Z

.field private gestureStarted:Z

.field private final mapCameraManagerDelegate:Lmv/a;

.field private final mapTransformDelegate:Lmv/h;


# direct methods
.method public constructor <init>(Lmv/h;Lmv/a;)V
    .locals 1

    const-string v0, "mapTransformDelegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapCameraManagerDelegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->mapTransformDelegate:Lmv/h;

    iput-object p2, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->mapCameraManagerDelegate:Lmv/a;

    invoke-interface {p2}, Lmv/a;->getCenterAltitudeMode()Lcom/mapbox/maps/MapCenterAltitudeMode;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->cachedCenterAltitudeMode:Lcom/mapbox/maps/MapCenterAltitudeMode;

    new-instance p1, Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1;-><init>(Lcom/mapbox/maps/util/CoreGesturesHandler;)V

    iput-object p1, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->coreGestureAnimatorHandler:Landroid/animation/AnimatorListenerAdapter;

    return-void
.end method

.method public static final synthetic access$getCachedCenterAltitudeMode$p(Lcom/mapbox/maps/util/CoreGesturesHandler;)Lcom/mapbox/maps/MapCenterAltitudeMode;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->cachedCenterAltitudeMode:Lcom/mapbox/maps/MapCenterAltitudeMode;

    return-object p0
.end method

.method public static final synthetic access$getMapCameraManagerDelegate$p(Lcom/mapbox/maps/util/CoreGesturesHandler;)Lmv/a;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->mapCameraManagerDelegate:Lmv/a;

    return-object p0
.end method

.method public static final synthetic access$getMapTransformDelegate$p(Lcom/mapbox/maps/util/CoreGesturesHandler;)Lmv/h;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->mapTransformDelegate:Lmv/h;

    return-object p0
.end method

.method public static final synthetic access$isSetCenterAltitudeModeNeeded(Lcom/mapbox/maps/util/CoreGesturesHandler;)Z
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/util/CoreGesturesHandler;->isSetCenterAltitudeModeNeeded()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setCachedCenterAltitudeMode$p(Lcom/mapbox/maps/util/CoreGesturesHandler;Lcom/mapbox/maps/MapCenterAltitudeMode;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->cachedCenterAltitudeMode:Lcom/mapbox/maps/MapCenterAltitudeMode;

    return-void
.end method

.method public static final synthetic access$setGestureAnimationStarted$p(Lcom/mapbox/maps/util/CoreGesturesHandler;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->gestureAnimationStarted:Z

    return-void
.end method

.method public static final synthetic access$setGestureStarted$p(Lcom/mapbox/maps/util/CoreGesturesHandler;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->gestureStarted:Z

    return-void
.end method

.method private final isSetCenterAltitudeModeNeeded()Z
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->cachedCenterAltitudeMode:Lcom/mapbox/maps/MapCenterAltitudeMode;

    sget-object v1, Lcom/mapbox/maps/MapCenterAltitudeMode;->SEA:Lcom/mapbox/maps/MapCenterAltitudeMode;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final getCoreGestureAnimatorHandler()Landroid/animation/AnimatorListenerAdapter;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->coreGestureAnimatorHandler:Landroid/animation/AnimatorListenerAdapter;

    return-object v0
.end method

.method public final notifyCoreGestureStarted()V
    .locals 2

    iget-boolean v0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->gestureStarted:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lcom/mapbox/maps/util/CoreGesturesHandler$notifyCoreGestureStarted$1;

    invoke-direct {v1, p0}, Lcom/mapbox/maps/util/CoreGesturesHandler$notifyCoreGestureStarted$1;-><init>(Lcom/mapbox/maps/util/CoreGesturesHandler;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    :cond_0
    return-void
.end method

.method public final notifyCoreTouchEnded()V
    .locals 2

    iget-boolean v0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->gestureStarted:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler;->gestureAnimationStarted:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lcom/mapbox/maps/util/CoreGesturesHandler$notifyCoreTouchEnded$1;

    invoke-direct {v1, p0}, Lcom/mapbox/maps/util/CoreGesturesHandler$notifyCoreTouchEnded$1;-><init>(Lcom/mapbox/maps/util/CoreGesturesHandler;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    :cond_0
    return-void
.end method
