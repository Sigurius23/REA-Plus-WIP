.class public final Landroidx/recyclerview/widget/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/ArrayList;

.field public final synthetic y:Landroidx/recyclerview/widget/q;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/q;Ljava/util/ArrayList;I)V
    .locals 0

    iput p3, p0, Landroidx/recyclerview/widget/k;->w:I

    iput-object p1, p0, Landroidx/recyclerview/widget/k;->y:Landroidx/recyclerview/widget/q;

    iput-object p2, p0, Landroidx/recyclerview/widget/k;->x:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    iget v0, p0, Landroidx/recyclerview/widget/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/k;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v3, p0, Landroidx/recyclerview/widget/k;->y:Landroidx/recyclerview/widget/q;

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/o2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    iget-object v6, v3, Landroidx/recyclerview/widget/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v5, v6}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    iget-wide v7, v3, Landroidx/recyclerview/widget/p1;->c:J

    invoke-virtual {v6, v7, v8}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    new-instance v7, Landroidx/recyclerview/widget/l;

    invoke-direct {v7, v3, v2, v4, v5}, Landroidx/recyclerview/widget/l;-><init>(Landroidx/recyclerview/widget/q;Landroidx/recyclerview/widget/o2;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V

    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v3, Landroidx/recyclerview/widget/q;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v4, p0, Landroidx/recyclerview/widget/k;->y:Landroidx/recyclerview/widget/q;

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroidx/recyclerview/widget/o;

    iget-object v2, v4, Landroidx/recyclerview/widget/q;->r:Ljava/util/ArrayList;

    iget-wide v9, v4, Landroidx/recyclerview/widget/p1;->f:J

    iget-object v3, v5, Landroidx/recyclerview/widget/o;->a:Landroidx/recyclerview/widget/o2;

    const/4 v6, 0x0

    if-nez v3, :cond_2

    move-object v7, v6

    goto :goto_2

    :cond_2
    iget-object v3, v3, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    move-object v7, v3

    :goto_2
    iget-object v3, v5, Landroidx/recyclerview/widget/o;->b:Landroidx/recyclerview/widget/o2;

    if-eqz v3, :cond_3

    iget-object v6, v3, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    :cond_3
    move-object v11, v6

    const/4 v12, 0x0

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v9, v10}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    iget-object v3, v5, Landroidx/recyclerview/widget/o;->a:Landroidx/recyclerview/widget/o2;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v3, v5, Landroidx/recyclerview/widget/o;->e:I

    iget v8, v5, Landroidx/recyclerview/widget/o;->c:I

    sub-int/2addr v3, v8

    int-to-float v3, v3

    invoke-virtual {v6, v3}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    iget v3, v5, Landroidx/recyclerview/widget/o;->f:I

    iget v8, v5, Landroidx/recyclerview/widget/o;->d:I

    sub-int/2addr v3, v8

    int-to-float v3, v3

    invoke-virtual {v6, v3}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    invoke-virtual {v6, v12}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v13

    new-instance v3, Landroidx/recyclerview/widget/n;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Landroidx/recyclerview/widget/n;-><init>(Landroidx/recyclerview/widget/q;Landroidx/recyclerview/widget/o;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    invoke-virtual {v13, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_4
    if-eqz v11, :cond_1

    invoke-virtual {v11}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    iget-object v3, v5, Landroidx/recyclerview/widget/o;->b:Landroidx/recyclerview/widget/o2;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v12}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v3, Landroidx/recyclerview/widget/n;

    const/4 v8, 0x1

    move-object v7, v11

    invoke-direct/range {v3 .. v8}, Landroidx/recyclerview/widget/n;-><init>(Landroidx/recyclerview/widget/q;Landroidx/recyclerview/widget/o;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v4, Landroidx/recyclerview/widget/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v4, p0, Landroidx/recyclerview/widget/k;->y:Landroidx/recyclerview/widget/q;

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/p;

    iget-object v5, v2, Landroidx/recyclerview/widget/p;->a:Landroidx/recyclerview/widget/o2;

    iget v3, v2, Landroidx/recyclerview/widget/p;->b:I

    iget v6, v2, Landroidx/recyclerview/widget/p;->c:I

    iget v7, v2, Landroidx/recyclerview/widget/p;->d:I

    iget v2, v2, Landroidx/recyclerview/widget/p;->e:I

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v8, v7

    iget-object v7, v5, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sub-int v3, v8, v3

    sub-int v8, v2, v6

    const/4 v2, 0x0

    if-eqz v3, :cond_6

    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    :cond_6
    if-eqz v8, :cond_7

    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    :cond_7
    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    iget-object v2, v4, Landroidx/recyclerview/widget/q;->p:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v10, v4, Landroidx/recyclerview/widget/p1;->e:J

    invoke-virtual {v9, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    move v6, v3

    new-instance v3, Landroidx/recyclerview/widget/m;

    invoke-direct/range {v3 .. v9}, Landroidx/recyclerview/widget/m;-><init>(Landroidx/recyclerview/widget/q;Landroidx/recyclerview/widget/o2;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_3

    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v4, Landroidx/recyclerview/widget/q;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
