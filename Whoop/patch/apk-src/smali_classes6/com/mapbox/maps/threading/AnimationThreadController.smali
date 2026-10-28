.class public final Lcom/mapbox/maps/threading/AnimationThreadController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/mapbox/maps/MapboxExperimental;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u001b\u0010\u0008\u001a\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\n\u001a\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\u0004\u0008\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u0003R$\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/mapbox/maps/threading/AnimationThreadController;",
        "",
        "<init>",
        "()V",
        "Ll83/a0;",
        "useBackgroundThread",
        "Lkotlin/Function0;",
        "function",
        "postOnMainThread",
        "(Lc93/a;)V",
        "postOnAnimatorThread",
        "useMainThread",
        "",
        "<set-?>",
        "usingBackgroundThread",
        "Z",
        "getUsingBackgroundThread",
        "()Z",
        "Landroid/os/Handler;",
        "mainHandler",
        "Landroid/os/Handler;",
        "Landroid/os/HandlerThread;",
        "backgroundAnimationThread",
        "Landroid/os/HandlerThread;",
        "backgroundAnimationHandler",
        "",
        "TAG",
        "Ljava/lang/String;",
        "BACKGROUND_ANIMATION_THREAD_NAME",
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


# static fields
.field private static final BACKGROUND_ANIMATION_THREAD_NAME:Ljava/lang/String; = "MapboxAnimThread"

.field public static final INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

.field private static final TAG:Ljava/lang/String; = "AnimThreadController"

.field private static backgroundAnimationHandler:Landroid/os/Handler;

.field private static backgroundAnimationThread:Landroid/os/HandlerThread;

.field private static final mainHandler:Landroid/os/Handler;

.field private static volatile usingBackgroundThread:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/threading/AnimationThreadController;

    invoke-direct {v0}, Lcom/mapbox/maps/threading/AnimationThreadController;-><init>()V

    sput-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->mainHandler:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lc93/a;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread$lambda$1(Lc93/a;)V

    return-void
.end method

.method public static synthetic b(Lc93/a;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread$lambda$3$lambda$2(Lc93/a;)V

    return-void
.end method

.method private static final postOnAnimatorThread$lambda$3$lambda$2(Lc93/a;)V
    .locals 1

    const-string v0, "$function"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final postOnMainThread$lambda$1(Lc93/a;)V
    .locals 1

    const-string v0, "$function"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getUsingBackgroundThread()Z
    .locals 1

    sget-boolean v0, Lcom/mapbox/maps/threading/AnimationThreadController;->usingBackgroundThread:Z

    return v0
.end method

.method public final postOnAnimatorThread(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lcom/mapbox/maps/threading/AnimationThreadController;->usingBackgroundThread:Z

    if-eqz v0, :cond_3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    sget-object v1, Lcom/mapbox/maps/threading/AnimationThreadController;->backgroundAnimationThread:Landroid/os/HandlerThread;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_1
    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->backgroundAnimationHandler:Landroid/os/Handler;

    if-eqz v0, :cond_2

    new-instance v1, Lb4/a;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, Lb4/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    const-string p1, "AnimThreadController"

    const-string v0, "useBackgroundThread was called but handler is null, animator event is skipped!"

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p0, p1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    return-void
.end method

.method public final postOnMainThread(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_0
    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lb4/a;

    const/4 v2, 0x5

    invoke-direct {v1, p1, v2}, Lb4/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final useBackgroundThread()V
    .locals 3

    sget-boolean v0, Lcom/mapbox/maps/threading/AnimationThreadController;->usingBackgroundThread:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/mapbox/maps/threading/AnimationThreadController;->usingBackgroundThread:Z

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->backgroundAnimationThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_1
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "MapboxAnimThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lcom/mapbox/maps/threading/AnimationThreadController;->backgroundAnimationHandler:Landroid/os/Handler;

    sput-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->backgroundAnimationThread:Landroid/os/HandlerThread;

    return-void
.end method

.method public final useMainThread()V
    .locals 2

    sget-boolean v0, Lcom/mapbox/maps/threading/AnimationThreadController;->usingBackgroundThread:Z

    if-eqz v0, :cond_2

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->backgroundAnimationHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->backgroundAnimationThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_1
    const/4 v0, 0x0

    sput-boolean v0, Lcom/mapbox/maps/threading/AnimationThreadController;->usingBackgroundThread:Z

    sput-object v1, Lcom/mapbox/maps/threading/AnimationThreadController;->backgroundAnimationThread:Landroid/os/HandlerThread;

    sput-object v1, Lcom/mapbox/maps/threading/AnimationThreadController;->backgroundAnimationHandler:Landroid/os/Handler;

    :cond_2
    return-void
.end method
