.class public final Lcom/whoop/ui/ThrobberView;
.super Lcom/whoop/ui/views/ColoredImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/ThrobberView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0008\u0006*\u0001\u001b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0019\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\nJ\r\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\nR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/ui/ThrobberView;",
        "Lcom/whoop/ui/views/ColoredImageView;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Ll83/a0;",
        "e",
        "()V",
        "",
        "scale",
        "setScale",
        "(F)V",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "f",
        "g",
        "Landroid/animation/AnimatorSet;",
        "w",
        "Landroid/animation/AnimatorSet;",
        "animation",
        "",
        "x",
        "Z",
        "isAnimating",
        "com/whoop/ui/m",
        "y",
        "Lcom/whoop/ui/m;",
        "listener",
        "a",
        "legacy_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private w:Landroid/animation/AnimatorSet;

.field private x:Z

.field private final y:Lcom/whoop/ui/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/views/ColoredImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lcom/whoop/ui/m;

    invoke-direct {p1, p0}, Lcom/whoop/ui/m;-><init>(Lcom/whoop/ui/ThrobberView;)V

    iput-object p1, p0, Lcom/whoop/ui/ThrobberView;->y:Lcom/whoop/ui/m;

    invoke-direct {p0}, Lcom/whoop/ui/ThrobberView;->e()V

    return-void
.end method

.method public static final synthetic d(Lcom/whoop/ui/ThrobberView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/ui/ThrobberView;->x:Z

    return p0
.end method

.method private final e()V
    .locals 8

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lvu1/c;->o:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/whoop/ui/ThrobberView;->setScale(F)V

    new-instance v1, Lcom/whoop/ui/ThrobberView$a;

    invoke-direct {v1, p0}, Lcom/whoop/ui/ThrobberView$a;-><init>(Lcom/whoop/ui/ThrobberView;)V

    const/high16 v2, 0x3f700000    # 0.9375f

    const-wide/16 v3, 0x58

    invoke-virtual {v1, v2, v3, v4}, Lcom/whoop/ui/ThrobberView$a;->a(FJ)Lcom/whoop/ui/ThrobberView$a;

    move-result-object v1

    const/high16 v5, 0x3fa00000    # 1.25f

    const-wide/16 v6, 0x84

    invoke-virtual {v1, v5, v6, v7}, Lcom/whoop/ui/ThrobberView$a;->a(FJ)Lcom/whoop/ui/ThrobberView$a;

    move-result-object v1

    invoke-virtual {v1, v2, v3, v4}, Lcom/whoop/ui/ThrobberView$a;->a(FJ)Lcom/whoop/ui/ThrobberView$a;

    move-result-object v1

    const v5, 0x3f933333    # 1.15f

    invoke-virtual {v1, v5, v3, v4}, Lcom/whoop/ui/ThrobberView$a;->a(FJ)Lcom/whoop/ui/ThrobberView$a;

    move-result-object v1

    const-wide/16 v3, 0x9a

    invoke-virtual {v1, v2, v3, v4}, Lcom/whoop/ui/ThrobberView$a;->a(FJ)Lcom/whoop/ui/ThrobberView$a;

    move-result-object v1

    const-wide/16 v2, 0x226

    invoke-virtual {v1, v0, v2, v3}, Lcom/whoop/ui/ThrobberView$a;->a(FJ)Lcom/whoop/ui/ThrobberView$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/ui/ThrobberView$a;->b()Landroid/animation/AnimatorSet;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/ThrobberView;->w:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_1

    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-void

    :cond_1
    const-string v0, "animation"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final setScale(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/ThrobberView;->x:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/ThrobberView;->x:Z

    iget-object v0, p0, Lcom/whoop/ui/ThrobberView;->w:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :cond_1
    const-string v0, "animation"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final g()V
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/ThrobberView;->x:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/ThrobberView;->w:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/ui/ThrobberView;->x:Z

    return-void

    :cond_1
    const-string v0, "animation"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public onAttachedToWindow()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/ThrobberView;->w:Landroid/animation/AnimatorSet;

    const/4 v1, 0x0

    const-string v2, "animation"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/whoop/ui/ThrobberView;->y:Lcom/whoop/ui/m;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/ui/ThrobberView;->w:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/ui/ThrobberView;->y:Lcom/whoop/ui/m;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    return-void

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/whoop/ui/ThrobberView;->w:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/ui/ThrobberView;->y:Lcom/whoop/ui/m;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :cond_0
    const-string v0, "animation"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
