.class public final Lb30/r3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lan/d;

.field public final synthetic c:I

.field public final synthetic d:La1/j;


# direct methods
.method public constructor <init>(Landroid/view/View;Lan/d;ILa1/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/r3;->a:Landroid/view/View;

    iput-object p2, p0, Lb30/r3;->b:Lan/d;

    iput p3, p0, Lb30/r3;->c:I

    iput-object p4, p0, Lb30/r3;->d:La1/j;

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 5

    iget-object p1, p0, Lb30/r3;->a:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lb30/r3;->b:Lan/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v3, v2

    iget v2, p0, Lb30/r3;->c:I

    int-to-float v2, v2

    div-float/2addr v2, v4

    sub-float/2addr v3, v2

    neg-float v2, v3

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v4, v3, v0

    const/4 v0, 0x1

    aput v2, v3, v0

    const-string v0, "translationX"

    invoke-static {p1, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget-wide v2, v1, Lan/d;->x:J

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance v2, Lb30/s3;

    iget-object v3, p0, Lb30/r3;->d:La1/j;

    invoke-direct {v2, v1, p1, v3}, Lb30/s3;-><init>(Lan/d;Landroid/view/View;La1/j;)V

    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object p1, p0, Lb30/r3;->a:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
