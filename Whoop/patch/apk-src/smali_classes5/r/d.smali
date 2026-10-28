.class public final Lr/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lr/d;->w:I

    iput-object p1, p0, Lr/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    iget v0, p0, Lr/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lr/d;->x:Ljava/lang/Object;

    check-cast v0, Ls/i0;

    iget-object v1, v0, Ls/i0;->g0:Ls/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Ls/i0;->e0:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ls/i0;->q()V

    invoke-virtual {v0}, Ls/v1;->c()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ls/v1;->dismiss()V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lr/d;->x:Ljava/lang/Object;

    check-cast v0, Ls/l0;

    invoke-virtual {v0}, Ls/l0;->getInternalPopup()Ls/k0;

    move-result-object v1

    invoke-interface {v1}, Ls/k0;->a()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Ls/l0;->F:Ls/k0;

    invoke-virtual {v0}, Landroid/view/View;->getTextDirection()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getTextAlignment()I

    move-result v3

    invoke-interface {v1, v2, v3}, Ls/k0;->j(II)V

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    return-void

    :pswitch_1
    iget-object v0, p0, Lr/d;->x:Ljava/lang/Object;

    check-cast v0, Lr/c0;

    iget-object v1, v0, Lr/c0;->H:Ls/a2;

    invoke-virtual {v0}, Lr/c0;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-boolean v2, v1, Ls/v1;->Y:Z

    if-nez v2, :cond_5

    iget-object v2, v0, Lr/c0;->M:Landroid/view/View;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ls/v1;->c()V

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {v0}, Lr/c0;->dismiss()V

    :cond_5
    :goto_2
    return-void

    :pswitch_2
    iget-object v0, p0, Lr/d;->x:Ljava/lang/Object;

    check-cast v0, Lr/f;

    iget-object v1, v0, Lr/f;->H:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lr/f;->a()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_8

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr/e;

    iget-object v2, v2, Lr/e;->a:Ls/a2;

    iget-boolean v2, v2, Ls/v1;->Y:Z

    if-nez v2, :cond_8

    iget-object v2, v0, Lr/f;->O:Landroid/view/View;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr/e;

    iget-object v1, v1, Lr/e;->a:Ls/a2;

    invoke-virtual {v1}, Ls/v1;->c()V

    goto :goto_3

    :cond_7
    :goto_4
    invoke-virtual {v0}, Lr/f;->dismiss()V

    :cond_8
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
