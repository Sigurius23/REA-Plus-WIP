.class public final Lar/d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lar/d;->a:I

    iput-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Lar/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->W:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->J:Z

    return-void

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    iget v0, p0, Lar/d;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    return-void

    :pswitch_1
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->W:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->J:Z

    return-void

    :pswitch_3
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast v0, Lrv/r;

    iget-object v0, v0, Lrv/r;->e:Lq/f;

    iget-object v0, v0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lsv/e;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lsv/e;->G:Z

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :pswitch_4
    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;->b:Landroid/animation/AnimatorSet;

    return-void

    :pswitch_5
    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X(I)V

    iget-object v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void

    :pswitch_6
    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->h:Landroid/view/ViewPropertyAnimator;

    return-void

    :pswitch_7
    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->J(I)V

    iget-object v0, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_1
    return-void

    :pswitch_8
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lav/b;

    iget-object v2, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast v2, Lfv/h;

    const/16 v3, 0x10

    invoke-direct {v1, v2, v3}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    iget-object v0, v2, Lfv/h;->y:Lfv/o;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lfv/o;->b:Landroid/animation/AnimatorSet;

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-ne v0, p1, :cond_3

    iput-object v1, v2, Lfv/h;->y:Lfv/o;

    :cond_3
    return-void

    :pswitch_9
    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Ler/g;

    iget-object v0, p1, Ler/a;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p1, v1}, Ler/g;->b(F)V

    return-void

    :pswitch_a
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast v0, Ld0/w1;

    invoke-virtual {v0, p1}, Ld0/w1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_b
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_c
    iget-object v0, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast v0, La33/d;

    iget-object v1, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v1, Landroid/animation/ValueAnimator;

    if-ne v1, p1, :cond_4

    const/4 p1, 0x0

    iput-object p1, v0, La33/d;->y:Ljava/lang/Object;

    :cond_4
    return-void

    :pswitch_d
    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/textfield/l;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/r;->p()V

    iget-object p1, p1, Lcom/google/android/material/textfield/l;->r:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :pswitch_e
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast v0, Lcc/f;

    iget-object v1, v0, Lcc/f;->E:Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_5

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfr/c;

    invoke-virtual {v3, v0}, Lfr/c;->a(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return-void

    :pswitch_f
    iget-object v0, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast v0, Lbc/w;

    invoke-virtual {v0}, Lbc/w;->n()V

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :pswitch_10
    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Lar/k;

    const/4 v0, 0x0

    iput v0, p1, Lar/k;->r:I

    const/4 v0, 0x0

    iput-object v0, p1, Lar/k;->l:Landroid/animation/Animator;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 3

    iget v0, p0, Lar/d;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    return-void

    :sswitch_0
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Lsv/g;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iget-wide v1, p1, Lsv/g;->G:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lsv/d;->setObjectValues([Ljava/lang/Object;)V

    return-void

    :sswitch_1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    iget-object p1, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast p1, Lfr/r;

    iget v0, p1, Lfr/r;->g:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p1, Lfr/r;->f:Lfr/u;

    iget-object v2, v2, Lfr/e;->c:[I

    array-length v2, v2

    rem-int/2addr v0, v2

    iput v0, p1, Lfr/r;->g:I

    iput-boolean v1, p1, Lfr/r;->h:Z

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 4

    iget v0, p0, Lar/d;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    return-void

    :sswitch_0
    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :sswitch_1
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast v0, Lcc/f;

    iget-object v1, v0, Lcc/f;->E:Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfr/c;

    invoke-virtual {v3, v0}, Lfr/c;->b(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :sswitch_2
    iget-object v0, p0, Lar/d;->b:Ljava/lang/Object;

    check-cast v0, Lar/k;

    iget-object v1, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, Lcr/q;->a(IZ)V

    const/4 v1, 0x2

    iput v1, v0, Lar/k;->r:I

    iput-object p1, v0, Lar/k;->l:Landroid/animation/Animator;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x2 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
.end method
