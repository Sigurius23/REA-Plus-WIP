.class public final Lzb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:Lzb/c;

.field public final synthetic b:Lzb/d;


# direct methods
.method public constructor <init>(Lzb/d;Lzb/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzb/b;->b:Lzb/d;

    iput-object p2, p0, Lzb/b;->a:Lzb/c;

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 6

    iget-object v0, p0, Lzb/b;->b:Lzb/d;

    const/high16 v1, 0x3f800000    # 1.0f

    iget-object v2, p0, Lzb/b;->a:Lzb/c;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lzb/d;->a(FLzb/c;Z)V

    iget v4, v2, Lzb/c;->d:F

    iput v4, v2, Lzb/c;->j:F

    iget v4, v2, Lzb/c;->e:F

    iput v4, v2, Lzb/c;->k:F

    iget v4, v2, Lzb/c;->f:F

    iput v4, v2, Lzb/c;->l:F

    iget v4, v2, Lzb/c;->i:I

    add-int/2addr v4, v3

    iget-object v3, v2, Lzb/c;->h:[I

    array-length v5, v3

    rem-int/2addr v4, v5

    iput v4, v2, Lzb/c;->i:I

    aget v3, v3, v4

    iput v3, v2, Lzb/c;->p:I

    iget-boolean v2, v0, Lzb/d;->E:Z

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lzb/d;->E:Z

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    const-wide/16 v0, 0x534

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    return-void

    :cond_0
    iget p1, v0, Lzb/d;->z:F

    add-float/2addr p1, v1

    iput p1, v0, Lzb/d;->z:F

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lzb/b;->b:Lzb/d;

    const/4 v0, 0x0

    iput v0, p1, Lzb/d;->z:F

    return-void
.end method
