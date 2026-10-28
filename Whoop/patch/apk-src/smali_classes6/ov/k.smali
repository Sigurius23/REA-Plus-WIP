.class public final Lov/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lov/o;


# direct methods
.method public synthetic constructor <init>(Lov/o;I)V
    .locals 0

    iput p2, p0, Lov/k;->a:I

    iput-object p1, p0, Lov/k;->b:Lov/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Lov/k;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget v0, p0, Lov/k;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lov/k;->b:Lov/o;

    iget-object v0, p1, Lov/o;->y:Lio/sentry/android/replay/video/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v0, Lou/o;

    const-string v2, "gesturesManager.standardScaleGestureDetector"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lov/o;->R:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v0, p1, Lov/o;->K:Lfv/a;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lov/o;->g0:Lcom/mapbox/maps/ScreenCoordinate;

    check-cast v0, Lfv/h;

    invoke-virtual {v0, p1}, Lfv/h;->k(Lcom/mapbox/maps/ScreenCoordinate;)V

    return-void

    :cond_0
    const-string p1, "cameraAnimationsPlugin"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_2
    const-string p1, "gesturesManager"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lov/k;->b:Lov/o;

    iget-object v0, p1, Lov/o;->K:Lfv/a;

    if-eqz v0, :cond_3

    iget-object p1, p1, Lov/o;->m0:Lcom/mapbox/maps/ScreenCoordinate;

    check-cast v0, Lfv/h;

    invoke-virtual {v0, p1}, Lfv/h;->k(Lcom/mapbox/maps/ScreenCoordinate;)V

    return-void

    :cond_3
    const-string p1, "cameraAnimationsPlugin"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Lov/k;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    iget v0, p0, Lov/k;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lov/k;->b:Lov/o;

    iget-object v0, p1, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v0, Lou/o;

    const-string v1, "gesturesManager.standardScaleGestureDetector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lov/o;->R:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_1
    const-string p1, "gesturesManager"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
