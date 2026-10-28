.class public final Lb30/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:Lan/d;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:La1/j;


# direct methods
.method public constructor <init>(Lan/d;Landroid/view/View;La1/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/s3;->a:Lan/d;

    iput-object p2, p0, Lb30/s3;->b:Landroid/view/View;

    iput-object p3, p0, Lb30/s3;->c:La1/j;

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget-object p1, p0, Lb30/s3;->a:Lan/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x2

    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iget-object v0, p0, Lb30/s3;->b:Landroid/view/View;

    const-string v1, "rotation"

    invoke-static {v0, v1, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v0, 0x5dc

    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance v0, Lb30/q3;

    const/4 v1, 0x0

    iget-object v2, p0, Lb30/s3;->c:La1/j;

    invoke-direct {v0, v2, v1}, Lb30/q3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
