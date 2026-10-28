.class public abstract Lsv/d;
.super Landroid/animation/ValueAnimator;
.source "SourceFile"


# static fields
.field public static final E:Landroid/view/animation/LinearInterpolator;


# instance fields
.field public w:Lkotlin/jvm/functions/Function1;

.field public final x:Landroid/animation/ValueAnimator;

.field public y:Lrv/p;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lsv/d;->E:Landroid/view/animation/LinearInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/animation/TypeEvaluator;)V
    .locals 2

    invoke-direct {p0}, Landroid/animation/ValueAnimator;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lsv/d;->setObjectValues([Ljava/lang/Object;)V

    invoke-super {p0, p1}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    new-instance p1, Ldb/e;

    const/16 v0, 0xb

    invoke-direct {p1, p0, v0}, Ldb/e;-><init>(Ljava/lang/Object;I)V

    invoke-super {p0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v0, 0x3e8

    invoke-virtual {p0, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    sget-object p1, Lsv/d;->E:Landroid/view/animation/LinearInterpolator;

    invoke-virtual {p0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {p0}, Lsv/d;->clone()Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lsv/d;->x:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/Animator;->getDuration()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "targets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lsv/d;->b()V

    if-nez p2, :cond_0

    array-length p2, p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lsv/d;->setObjectValues([Ljava/lang/Object;)V

    sget-object p1, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance p2, Lsv/c;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lsv/c;-><init>(Lsv/d;I)V

    invoke-virtual {p1, p2}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsv/d;->x:Landroid/animation/ValueAnimator;

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    array-length p2, p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V

    sget-object p1, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance p2, Lsv/c;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lsv/c;-><init>(Lsv/d;I)V

    invoke-virtual {p1, p2}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public final b()V
    .locals 3

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lsv/c;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lsv/c;-><init>(Lsv/d;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public abstract c(Ljava/lang/Object;F)V
.end method

.method public final bridge synthetic clone()Landroid/animation/Animator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsv/d;->clone()Landroid/animation/ValueAnimator;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Landroid/animation/ValueAnimator;
    .locals 2

    .line 3
    invoke-super {p0}, Landroid/animation/ValueAnimator;->clone()Landroid/animation/ValueAnimator;

    move-result-object v0

    const-string v1, "super.clone()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lsv/d;->clone()Landroid/animation/ValueAnimator;

    move-result-object v0

    return-object v0
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
