.class public final Lb30/q3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb30/q3;->a:I

    iput-object p1, p0, Lb30/q3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lb30/q3;Landroid/animation/Animator;I)V
    .locals 8

    instance-of v0, p1, Lgv/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lgv/d;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_9

    iget-object p0, p0, Lb30/q3;->b:Ljava/lang/Object;

    check-cast p0, Lfv/h;

    iget-object v2, p0, Lfv/h;->x:Ljava/util/LinkedHashSet;

    iget-boolean v3, v0, Lgv/d;->K:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    new-array v3, v4, [Landroid/animation/ValueAnimator;

    aput-object v0, v3, v5

    sget-object v6, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v7, Leb/s;

    invoke-direct {v7, v3, p0, v5, v4}, Leb/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v6, v7}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    :cond_1
    iget-boolean v3, v0, Lgv/d;->L:Z

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lfv/h;->T:Lcom/mapbox/maps/MapboxMap;

    if-eqz p1, :cond_3

    invoke-interface {p1, v5}, Lmv/h;->setUserAnimationInProgress(Z)V

    goto :goto_1

    :cond_3
    const-string p0, "mapTransformDelegate"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_1
    iget-object p1, p0, Lfv/h;->J:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzv/a;

    invoke-static {p2}, Le4/p;->e(I)I

    move-result v3

    const-string v5, "type"

    if-eqz v3, :cond_6

    if-eq v3, v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lgv/d;->k()Lfv/j;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Lgv/d;->k()Lfv/j;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lfv/h;->e()V

    :cond_8
    :goto_3
    return-void

    :cond_9
    new-instance p0, Lcom/mapbox/maps/MapboxCameraAnimationException;

    const-string p1, "Could not finish animation as it must be an instance of CameraAnimator and not null!"

    invoke-direct {p0, p1}, Lcom/mapbox/maps/MapboxCameraAnimationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final b(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method private final c(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method private final d(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 3

    iget v0, p0, Lb30/q3;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lfv/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lfv/e;-><init>(Lb30/q3;Landroid/animation/Animator;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget v0, p0, Lb30/q3;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lb30/q3;->b:Ljava/lang/Object;

    check-cast p1, Lkv/d;

    iget-object p1, p1, Lkv/d;->y:Lkv/a;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    check-cast p1, Lkv/b;

    invoke-virtual {p1, v0}, Lkv/b;->setCompassVisible(Z)V

    return-void

    :cond_0
    const-string p1, "compassView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lfv/e;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lfv/e;-><init>(Lb30/q3;Landroid/animation/Animator;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lb30/q3;->b:Ljava/lang/Object;

    check-cast p1, La1/j;

    invoke-virtual {p1}, La1/j;->invoke()Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Lb30/q3;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "animator"

    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "animation"

    goto :goto_0

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 5

    iget v0, p0, Lb30/q3;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    invoke-virtual {v0}, Lcom/mapbox/maps/threading/AnimationThreadController;->getUsingBackgroundThread()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/animation/Animator;->getDuration()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-object v1, p0, Lb30/q3;->b:Ljava/lang/Object;

    check-cast v1, Lfv/h;

    move-object v2, p1

    check-cast v2, Lgv/d;

    sget-object v3, Lfv/h;->W:[Lj93/z;

    new-instance v3, Lfv/b;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1, v2}, Lfv/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lgv/d;->j(Lfv/b;)V

    :cond_0
    new-instance v1, Lfv/e;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v2}, Lfv/e;-><init>(Lb30/q3;Landroid/animation/Animator;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
