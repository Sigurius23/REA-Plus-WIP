.class public final Lg23/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final E:I

.field public F:Z

.field public G:F

.field public final w:Landroid/view/View;

.field public final x:Lm23/a;

.field public final y:Landroidx/room/v0;

.field public final z:Lm23/a;


# direct methods
.method public constructor <init>(Landroid/view/View;Lm23/a;Landroidx/room/v0;Lm23/a;)V
    .locals 1

    const-string v0, "swipeView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg23/a;->w:Landroid/view/View;

    iput-object p2, p0, Lg23/a;->x:Lm23/a;

    iput-object p3, p0, Lg23/a;->y:Landroidx/room/v0;

    iput-object p4, p0, Lg23/a;->z:Lm23/a;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x4

    iput p1, p0, Lg23/a;->E:I

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 3

    iget-object v0, p0, Lg23/a;->w:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Ldb/e;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Ldb/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-string v1, "setUpdateListener(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ld0/w1;

    const/4 v2, 0x3

    invoke-direct {v1, p1, p0, v2}, Ld0/w1;-><init>(FLjava/lang/Object;I)V

    new-instance p1, Lar/d;

    const/4 v2, 0x6

    invoke-direct {p1, v1, v2}, Lar/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-string v0, "setListener(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    iget-object v1, p0, Lg23/a;->w:Landroid/view/View;

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    iget v3, p0, Lg23/a;->E:I

    const/4 v4, 0x0

    if-eq v0, v2, :cond_1

    const/4 v5, 0x2

    if-eq v0, v5, :cond_0

    const/4 p2, 0x3

    if-eq v0, p2, :cond_1

    return v4

    :cond_0
    iget-boolean p1, p0, Lg23/a;->F:Z

    if-eqz p1, :cond_6

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget p2, p0, Lg23/a;->G:F

    sub-float/2addr p1, p2

    invoke-virtual {v1, p1}, Landroid/view/View;->setTranslationY(F)V

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lg23/a;->y:Landroidx/room/v0;

    invoke-virtual {v0, p1, p2}, Landroidx/room/v0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2

    :cond_1
    iget-boolean p2, p0, Lg23/a;->F:Z

    if-eqz p2, :cond_6

    iput-boolean v4, p0, Lg23/a;->F:Z

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result p2

    neg-int v0, v3

    int-to-float v0, v0

    cmpg-float p2, p2, v0

    const/4 v0, 0x0

    if-gez p2, :cond_2

    int-to-float p1, p1

    neg-float p1, p1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result p2

    int-to-float v1, v3

    cmpl-float p2, p2, v1

    if-lez p2, :cond_3

    int-to-float p1, p1

    goto :goto_0

    :cond_3
    move p1, v0

    :goto_0
    cmpg-float p2, p1, v0

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    iget-object p2, p0, Lg23/a;->z:Lm23/a;

    invoke-virtual {p2}, Lm23/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p1, p0, Lg23/a;->x:Lm23/a;

    invoke-virtual {p1}, Lm23/a;->invoke()Ljava/lang/Object;

    return v2

    :cond_5
    :goto_1
    invoke-virtual {p0, p1}, Lg23/a;->a(F)V

    :cond_6
    return v2

    :cond_7
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    if-eqz v1, :cond_8

    invoke-virtual {v1, p1}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    :cond_8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1

    if-eqz p1, :cond_9

    iput-boolean v2, p0, Lg23/a;->F:Z

    :cond_9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lg23/a;->G:F

    return v2
.end method
