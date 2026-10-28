.class public final Lbc/p;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lbc/p;->a:I

    iput-object p3, p0, Lbc/p;->b:Ljava/lang/Object;

    iput-object p1, p0, Lbc/p;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Lbc/w;La0/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lbc/p;->a:I

    .line 2
    iput-object p1, p0, Lbc/p;->c:Ljava/lang/Object;

    iput-object p2, p0, Lbc/p;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Lbc/p;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lbc/p;->b:Ljava/lang/Object;

    check-cast p1, Lh5/u0;

    invoke-interface {p1}, Lh5/u0;->a()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget v0, p0, Lbc/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lbc/p;->b:Ljava/lang/Object;

    check-cast p1, Lh5/d1;

    const/high16 v0, 0x3f800000    # 1.0f

    iget-object v1, p1, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {v1, v0}, Lh5/c1;->d(F)V

    iget-object v0, p0, Lbc/p;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lh5/y0;->e(Landroid/view/View;Lh5/d1;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lbc/p;->b:Ljava/lang/Object;

    check-cast p1, Lh5/u0;

    invoke-interface {p1}, Lh5/u0;->c()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lbc/p;->b:Ljava/lang/Object;

    check-cast v0, La0/g;

    invoke-virtual {v0, p1}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbc/p;->c:Ljava/lang/Object;

    check-cast v0, Lbc/w;

    iget-object v0, v0, Lbc/w;->N:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Lbc/p;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lbc/p;->b:Ljava/lang/Object;

    check-cast p1, Lh5/u0;

    invoke-interface {p1}, Lh5/u0;->b()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lbc/p;->c:Ljava/lang/Object;

    check-cast v0, Lbc/w;

    iget-object v0, v0, Lbc/w;->N:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
