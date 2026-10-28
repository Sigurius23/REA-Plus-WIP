.class public abstract Lgv/d;
.super Landroid/animation/ValueAnimator;
.source "SourceFile"


# instance fields
.field public E:Z

.field public F:Lfv/b;

.field public G:Lb30/q3;

.field public final H:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final I:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public J:Z

.field public K:Z

.field public L:Z

.field public final w:Landroid/animation/TypeEvaluator;

.field public x:Ljava/lang/String;

.field public final y:Ljava/lang/Object;

.field public final z:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/animation/TypeEvaluator;Lfv/i;)V
    .locals 1

    const-string v0, "evaluator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object p1, p0, Lgv/d;->w:Landroid/animation/TypeEvaluator;

    iget-object v0, p2, Lfv/i;->c:Ljava/lang/String;

    iput-object v0, p0, Lgv/d;->x:Ljava/lang/String;

    iget-object v0, p2, Lfv/i;->b:Ljava/lang/Object;

    iput-object v0, p0, Lgv/d;->y:Ljava/lang/Object;

    iget-object p2, p2, Lfv/i;->a:[Ljava/lang/Object;

    iput-object p2, p0, Lgv/d;->z:[Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lgv/d;->H:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lgv/d;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    const/4 v0, 0x0

    aget-object p2, p2, v0

    filled-new-array {p2, p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p2}, Lgv/d;->setObjectValues([Ljava/lang/Object;)V

    invoke-super {p0, p1}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    return-void
.end method

.method public static final synthetic a(Landroid/animation/Animator$AnimatorListener;Lgv/d;)V
    .locals 0

    invoke-super {p1, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public static final synthetic b(Landroid/animation/ValueAnimator$AnimatorUpdateListener;Lgv/d;)V
    .locals 0

    invoke-super {p1, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public static final synthetic c(Lgv/d;)V
    .locals 0

    invoke-super {p0}, Landroid/animation/ValueAnimator;->cancel()V

    return-void
.end method

.method public static final synthetic d(Lgv/d;)V
    .locals 0

    invoke-super {p0}, Landroid/animation/Animator;->removeAllListeners()V

    return-void
.end method

.method public static final synthetic e(Lgv/d;)V
    .locals 0

    invoke-super {p0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    return-void
.end method

.method public static final synthetic f(Landroid/animation/Animator$AnimatorListener;Lgv/d;)V
    .locals 0

    invoke-super {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public static final synthetic g(Landroid/animation/ValueAnimator$AnimatorUpdateListener;Lgv/d;)V
    .locals 0

    invoke-super {p1, p0}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public static final synthetic h(Lgv/d;)V
    .locals 0

    invoke-super {p0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method


# virtual methods
.method public final addListener(Landroid/animation/Animator$AnimatorListener;)V
    .locals 2

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lgv/b;

    invoke-direct {v1, p0, p1}, Lgv/b;-><init>(Lgv/d;Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public final addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 2

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lgv/c;

    invoke-direct {v1, p0, p1}, Lgv/c;-><init>(Lgv/d;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public final cancel()V
    .locals 3

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lfv/c;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lfv/c;-><init>(Lgv/d;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public final getAnimatedValue()Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Landroid/animation/Animator;->getDuration()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lgv/d;->z:[Ljava/lang/Object;

    invoke-static {v0}, Lm83/n;->E0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Any"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-super {p0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "super.getAnimatedValue()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final i(Lb30/q3;)V
    .locals 1

    invoke-super {p0}, Landroid/animation/Animator;->removeAllListeners()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lgv/d;->E:Z

    iput-object p1, p0, Lgv/d;->G:Lb30/q3;

    invoke-super {p0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, Lgv/d;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/Animator$AnimatorListener;

    invoke-super {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(Lfv/b;)V
    .locals 1

    invoke-super {p0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    iput-object p1, p0, Lgv/d;->F:Lfv/b;

    invoke-super {p0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p0, Lgv/d;->H:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-super {p0, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract k()Lfv/j;
.end method

.method public final l()V
    .locals 1

    iget-object v0, p0, Lgv/d;->G:Lb30/q3;

    invoke-super {p0, v0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lgv/d;->G:Lb30/q3;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lgv/d;->E:Z

    return-void
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Lgv/d;->F:Lfv/b;

    invoke-super {p0, v0}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lgv/d;->F:Lfv/b;

    return-void
.end method

.method public final removeAllListeners()V
    .locals 3

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lfv/c;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lfv/c;-><init>(Lgv/d;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public final removeAllUpdateListeners()V
    .locals 3

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lfv/c;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Lfv/c;-><init>(Lgv/d;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public final removeListener(Landroid/animation/Animator$AnimatorListener;)V
    .locals 2

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lgv/b;

    invoke-direct {v1, p1, p0}, Lgv/b;-><init>(Landroid/animation/Animator$AnimatorListener;Lgv/d;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public final removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 2

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lgv/c;

    invoke-direct {v1, p1, p0}, Lgv/c;-><init>(Landroid/animation/ValueAnimator$AnimatorUpdateListener;Lgv/d;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public final varargs setObjectValues([Ljava/lang/Object;)V
    .locals 1

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V

    return-void
.end method

.method public final start()V
    .locals 3

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lfv/c;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lfv/c;-><init>(Lgv/d;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method
