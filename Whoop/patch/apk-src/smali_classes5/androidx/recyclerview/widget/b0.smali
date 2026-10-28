.class public final Landroidx/recyclerview/widget/b0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;Z)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/recyclerview/widget/b0;->a:I

    .line 1
    iput-boolean p2, p0, Landroidx/recyclerview/widget/b0;->b:Z

    iput-object p1, p0, Landroidx/recyclerview/widget/b0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/d0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/b0;->a:I

    .line 3
    iput-object p1, p0, Landroidx/recyclerview/widget/b0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Landroidx/recyclerview/widget/b0;->b:Z

    return-void
.end method

.method public constructor <init>(Lar/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/b0;->a:I

    .line 2
    iput-object p1, p0, Landroidx/recyclerview/widget/b0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/b0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/b0;->b:Z

    return-void

    :pswitch_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/b0;->b:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget p1, p0, Landroidx/recyclerview/widget/b0;->a:I

    packed-switch p1, :pswitch_data_0

    iget-boolean p1, p0, Landroidx/recyclerview/widget/b0;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/b0;->c:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, Landroidx/recyclerview/widget/b0;->c:Ljava/lang/Object;

    check-cast p1, Lar/k;

    const/4 v0, 0x0

    iput v0, p1, Lar/k;->r:I

    const/4 v1, 0x0

    iput-object v1, p1, Lar/k;->l:Landroid/animation/Animator;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/b0;->b:Z

    if-nez v1, :cond_1

    iget-object p1, p1, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcr/q;->a(IZ)V

    :cond_1
    return-void

    :pswitch_1
    iget-object p1, p0, Landroidx/recyclerview/widget/b0;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/recyclerview/widget/d0;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/b0;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Landroidx/recyclerview/widget/b0;->b:Z

    goto :goto_0

    :cond_2
    iget-object v0, p1, Landroidx/recyclerview/widget/d0;->z:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-nez v0, :cond_3

    iput v1, p1, Landroidx/recyclerview/widget/d0;->A:I

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/d0;->h(I)V

    goto :goto_0

    :cond_3
    const/4 v0, 0x2

    iput v0, p1, Landroidx/recyclerview/widget/d0;->A:I

    iget-object p1, p1, Landroidx/recyclerview/widget/d0;->s:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/b0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    iget-boolean p1, p0, Landroidx/recyclerview/widget/b0;->b:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/b0;->c:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/recyclerview/widget/b0;->c:Ljava/lang/Object;

    check-cast v0, Lar/k;

    iget-object v1, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, Lcr/q;->a(IZ)V

    const/4 v1, 0x1

    iput v1, v0, Lar/k;->r:I

    iput-object p1, v0, Lar/k;->l:Landroid/animation/Animator;

    iput-boolean v2, p0, Landroidx/recyclerview/widget/b0;->b:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
