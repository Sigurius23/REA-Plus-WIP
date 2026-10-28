.class public final synthetic Lfv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lfv/b;->a:I

    iput-object p2, p0, Lfv/b;->b:Ljava/lang/Object;

    iput-object p3, p0, Lfv/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    iget v0, p0, Lfv/b;->a:I

    iget-object v1, p0, Lfv/b;->c:Ljava/lang/Object;

    iget-object v2, p0, Lfv/b;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout;

    check-cast v1, Lkr/g;

    sget v0, Lcom/google/android/material/appbar/AppBarLayout;->c0:I

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v1, p1}, Lkr/g;->l(F)V

    iget-object v0, v2, Lcom/google/android/material/appbar/AppBarLayout;->V:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Lkr/g;

    if-eqz v1, :cond_0

    check-cast v0, Lkr/g;

    invoke-virtual {v0, p1}, Lkr/g;->l(F)V

    :cond_0
    iget-object p1, v2, Lcom/google/android/material/appbar/AppBarLayout;->R:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :pswitch_0
    check-cast v2, Lla/b;

    iget-object p1, v2, Lla/b;->x:Ljava/lang/Object;

    check-cast p1, Lm/n0;

    iget-object p1, p1, Lm/n0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void

    :pswitch_1
    check-cast v2, Lfv/h;

    check-cast v1, Lgv/d;

    const-string v0, "$animator"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v3, Lev/h;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v1, p1, v4}, Lev/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v3}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
