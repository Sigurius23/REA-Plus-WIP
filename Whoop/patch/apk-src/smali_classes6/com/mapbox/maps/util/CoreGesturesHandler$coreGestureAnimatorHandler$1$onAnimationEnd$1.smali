.class final Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1;->onAnimationEnd(Landroid/animation/Animator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mapbox/maps/util/CoreGesturesHandler;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/util/CoreGesturesHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1;->this$0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1;->this$0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mapbox/maps/util/CoreGesturesHandler;->access$setGestureAnimationStarted$p(Lcom/mapbox/maps/util/CoreGesturesHandler;Z)V

    .line 3
    iget-object v0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1;->this$0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    invoke-static {v0}, Lcom/mapbox/maps/util/CoreGesturesHandler;->access$isSetCenterAltitudeModeNeeded(Lcom/mapbox/maps/util/CoreGesturesHandler;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1;->this$0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    invoke-static {v0}, Lcom/mapbox/maps/util/CoreGesturesHandler;->access$getMapCameraManagerDelegate$p(Lcom/mapbox/maps/util/CoreGesturesHandler;)Lmv/a;

    move-result-object v0

    iget-object v2, p0, Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1;->this$0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    invoke-static {v2}, Lcom/mapbox/maps/util/CoreGesturesHandler;->access$getCachedCenterAltitudeMode$p(Lcom/mapbox/maps/util/CoreGesturesHandler;)Lcom/mapbox/maps/MapCenterAltitudeMode;

    move-result-object v2

    invoke-interface {v0, v2}, Lmv/a;->setCenterAltitudeMode(Lcom/mapbox/maps/MapCenterAltitudeMode;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/util/CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1;->this$0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    invoke-static {v0}, Lcom/mapbox/maps/util/CoreGesturesHandler;->access$getMapTransformDelegate$p(Lcom/mapbox/maps/util/CoreGesturesHandler;)Lmv/h;

    move-result-object v0

    invoke-interface {v0, v1}, Lmv/h;->setGestureInProgress(Z)V

    return-void
.end method
