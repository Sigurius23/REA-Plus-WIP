.class public abstract Lq52/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aO\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "",
        "Ll83/k;",
        "",
        "",
        "timeline",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onAnim",
        "Lkotlin/Function0;",
        "onEnd",
        "Landroid/animation/ValueAnimator;",
        "b",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;)Landroid/animation/ValueAnimator;",
        "realtime-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lq52/a;->c(Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final b(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;)Landroid/animation/ValueAnimator;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            ")",
            "Landroid/animation/ValueAnimator;"
        }
    .end annotation

    const-string v0, "timeline"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAnim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ge v2, v0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    new-array v4, v3, [Landroid/animation/Keyframe;

    move v5, v1

    :goto_1
    if-ge v5, v3, :cond_4

    if-nez v5, :cond_2

    move v7, v1

    goto :goto_3

    :cond_2
    new-instance v6, Li93/j;

    add-int/lit8 v7, v5, -0x1

    invoke-direct {v6, v1, v7, v0}, Li93/h;-><init>(III)V

    invoke-static {p0, v6}, Lm83/s;->s1(Ljava/util/List;Li93/j;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v1

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/k;

    iget-object v8, v8, Ll83/k;->x:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    add-int/2addr v7, v8

    goto :goto_2

    :cond_3
    :goto_3
    int-to-float v6, v7

    int-to-float v7, v2

    div-float/2addr v6, v7

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll83/k;

    iget-object v7, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v6, v7}, Landroid/animation/Keyframe;->ofFloat(FF)Landroid/animation/Keyframe;

    move-result-object v6

    const-string v7, "ofFloat(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Landroid/animation/Keyframe;

    const-string v0, "value"

    invoke-static {v0, p0}, Landroid/animation/PropertyValuesHolder;->ofKeyframe(Ljava/lang/String;[Landroid/animation/Keyframe;)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    filled-new-array {p0}, [Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    invoke-static {p0}, Landroid/animation/ValueAnimator;->ofPropertyValuesHolder([Landroid/animation/PropertyValuesHolder;)Landroid/animation/ValueAnimator;

    move-result-object p0

    new-instance v0, Ldb/e;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Ldb/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p1, Lq52/a$a;

    invoke-direct {p1, p2}, Lq52/a$a;-><init>(Lc93/a;)V

    invoke-virtual {p0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    int-to-long p1, v2

    invoke-virtual {p0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    return-object p0
.end method

.method private static final c(Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
