.class public final Lfv/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lgv/d;


# direct methods
.method public synthetic constructor <init>(Lgv/d;I)V
    .locals 0

    iput p2, p0, Lfv/c;->w:I

    iput-object p1, p0, Lfv/c;->x:Lgv/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lfv/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfv/c;->x:Lgv/d;

    iget-boolean v1, v0, Lgv/d;->E:Z

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    iput-boolean v1, v0, Lgv/d;->J:Z

    invoke-virtual {v0}, Landroid/animation/Animator;->getDuration()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_4

    invoke-virtual {v0}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v1

    cmp-long v1, v1, v3

    if-nez v1, :cond_4

    invoke-virtual {v0}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;

    move-result-object v1

    const-string v2, "listeners"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator$AnimatorListener;

    invoke-interface {v3, v0}, Landroid/animation/Animator$AnimatorListener;->onAnimationStart(Landroid/animation/Animator;)V

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lgv/d;->F:Lfv/b;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Lfv/b;->onAnimationUpdate(Landroid/animation/ValueAnimator;)V

    :cond_1
    iget-object v2, v0, Lgv/d;->H:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    if-eqz v3, :cond_2

    invoke-interface {v3, v0}, Landroid/animation/ValueAnimator$AnimatorUpdateListener;->onAnimationUpdate(Landroid/animation/ValueAnimator;)V

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator$AnimatorListener;

    invoke-interface {v2, v0}, Landroid/animation/Animator$AnimatorListener;->onAnimationEnd(Landroid/animation/Animator;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lgv/d;->h(Lgv/d;)V

    goto :goto_3

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Animation "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lgv/d;->k()Lfv/j;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " was not registered and will not run. Register it with registerAnimation() method."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Mbgl-CameraAnimator"

    invoke-static {v1, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfv/c;->x:Lgv/d;

    invoke-static {v0}, Lgv/d;->e(Lgv/d;)V

    iget-object v1, v0, Lgv/d;->F:Lfv/b;

    if-eqz v1, :cond_7

    invoke-static {v1, v0}, Lgv/d;->b(Landroid/animation/ValueAnimator$AnimatorUpdateListener;Lgv/d;)V

    :cond_7
    iget-object v0, v0, Lgv/d;->H:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lfv/c;->x:Lgv/d;

    invoke-static {v0}, Lgv/d;->d(Lgv/d;)V

    iget-object v1, v0, Lgv/d;->G:Lb30/q3;

    if-eqz v1, :cond_8

    invoke-static {v1, v0}, Lgv/d;->a(Landroid/animation/Animator$AnimatorListener;Lgv/d;)V

    :cond_8
    iget-object v0, v0, Lgv/d;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    const/4 v0, 0x1

    iget-object v1, p0, Lfv/c;->x:Lgv/d;

    iput-boolean v0, v1, Lgv/d;->J:Z

    invoke-static {v1}, Lgv/d;->c(Lgv/d;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lfv/c;->x:Lgv/d;

    invoke-virtual {v0}, Lgv/d;->cancel()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lfv/c;->x:Lgv/d;

    invoke-virtual {v0}, Lgv/d;->cancel()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
