.class abstract Lcom/whoop/ui/views/LiveHeartRateView$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/views/LiveHeartRateView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/views/LiveHeartRateView$e$c;
    }
.end annotation


# instance fields
.field private final a:Lcom/whoop/ui/views/LiveHeartRateView$h;

.field private final b:Landroid/view/View;

.field private final c:Landroid/os/Handler;

.field private final d:Ljava/lang/Runnable;

.field private e:Z

.field private f:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/whoop/ui/views/LiveHeartRateView$e$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/whoop/ui/views/LiveHeartRateView$h;Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->f:Ljava/util/LinkedList;

    iput-object p2, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->a:Lcom/whoop/ui/views/LiveHeartRateView$h;

    iput-object p3, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->b:Landroid/view/View;

    iput-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->c:Landroid/os/Handler;

    new-instance p1, Lcom/whoop/ui/views/LiveHeartRateView$e$a;

    invoke-direct {p1, p0}, Lcom/whoop/ui/views/LiveHeartRateView$e$a;-><init>(Lcom/whoop/ui/views/LiveHeartRateView$e;)V

    iput-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->d:Ljava/lang/Runnable;

    return-void
.end method

.method public static bridge synthetic a(Lcom/whoop/ui/views/LiveHeartRateView$e;)Ljava/util/LinkedList;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->f:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/whoop/ui/views/LiveHeartRateView$e;)Lcom/whoop/ui/views/LiveHeartRateView$h;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->a:Lcom/whoop/ui/views/LiveHeartRateView$h;

    return-object p0
.end method


# virtual methods
.method public abstract c()V
.end method

.method public d(J)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->b:Landroid/view/View;

    const/4 v1, 0x4

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    const-string v3, "scaleX"

    invoke-static {v0, v3, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->b:Landroid/view/View;

    new-array v1, v1, [F

    fill-array-data v1, :array_1

    const-string v3, "scaleY"

    invoke-static {v2, v3, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {v2, p1, p2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    const/4 p1, 0x2

    new-array p1, p1, [Landroid/animation/Animator;

    const/4 p2, 0x0

    aput-object v0, p1, p2

    const/4 v0, 0x1

    aput-object v1, p1, v0

    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance p1, Lh8/a;

    invoke-direct {p1, p2}, Lh8/a;-><init>(I)V

    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f7c28f6    # 0.985f
        0x3f81eb85    # 1.015f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f7c28f6    # 0.985f
        0x3f81eb85    # 1.015f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public e(JJ)V
    .locals 6

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->a:Lcom/whoop/ui/views/LiveHeartRateView$h;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$h;->a()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x2

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    const-string v3, "scaleX"

    invoke-static {v0, v3, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    new-array v3, v1, [F

    fill-array-data v3, :array_1

    const-string v4, "scaleY"

    invoke-static {v0, v4, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    new-array v4, v1, [F

    fill-array-data v4, :array_2

    const-string v5, "alpha"

    invoke-static {v0, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {v5, p1, p2}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    invoke-virtual {v5, p3, p4}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    const/4 p1, 0x3

    new-array p1, p1, [Landroid/animation/Animator;

    const/4 p2, 0x0

    aput-object v2, p1, p2

    const/4 p2, 0x1

    aput-object v3, p1, p2

    aput-object v4, p1, v1

    invoke-virtual {v5, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v5, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p1, Lcom/whoop/ui/views/LiveHeartRateView$e$c;

    invoke-direct {p1, v5, v0}, Lcom/whoop/ui/views/LiveHeartRateView$e$c;-><init>(Landroid/animation/Animator;Landroid/view/View;)V

    new-instance p2, Lcom/whoop/ui/views/LiveHeartRateView$e$b;

    invoke-direct {p2, p0, v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView$e$b;-><init>(Lcom/whoop/ui/views/LiveHeartRateView$e;Landroid/view/View;Lcom/whoop/ui/views/LiveHeartRateView$e$c;)V

    invoke-virtual {v5, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p2, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->f:Ljava/util/LinkedList;

    invoke-virtual {p2, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x40000000    # 2.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x40000000    # 2.0f
    .end array-data

    :array_2
    .array-data 4
        0x3ea8f5c3    # 0.33f
        0x0
    .end array-data
.end method

.method public f()Lcom/whoop/ui/views/LiveHeartRateView$h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->a:Lcom/whoop/ui/views/LiveHeartRateView$h;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->e:Z

    return v0
.end method

.method public h(J)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public i(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->f()Lcom/whoop/ui/views/LiveHeartRateView$h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView$h;->c(I)V

    return-void
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->e:Z

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public k()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->e:Z

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->f:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/ui/views/LiveHeartRateView$e$c;

    iget-object v2, v1, Lcom/whoop/ui/views/LiveHeartRateView$e$c;->a:Landroid/animation/Animator;

    invoke-virtual {v2}, Landroid/animation/Animator;->removeAllListeners()V

    iget-object v2, v1, Lcom/whoop/ui/views/LiveHeartRateView$e$c;->a:Landroid/animation/Animator;

    invoke-virtual {v2}, Landroid/animation/Animator;->end()V

    iget-object v2, v1, Lcom/whoop/ui/views/LiveHeartRateView$e$c;->a:Landroid/animation/Animator;

    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    iget-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->a:Lcom/whoop/ui/views/LiveHeartRateView$h;

    iget-object v1, v1, Lcom/whoop/ui/views/LiveHeartRateView$e$c;->b:Landroid/view/View;

    invoke-virtual {v2, v1}, Lcom/whoop/ui/views/LiveHeartRateView$h;->b(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e;->f:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    return-void
.end method
