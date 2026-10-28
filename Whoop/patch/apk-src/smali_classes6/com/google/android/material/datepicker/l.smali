.class public final Lcom/google/android/material/datepicker/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/material/datepicker/l;->w:I

    iput-object p1, p0, Lcom/google/android/material/datepicker/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    iget v0, p0, Lcom/google/android/material/datepicker/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->e()V

    return-void

    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->x:Ljava/lang/Object;

    check-cast p1, Lq/b;

    invoke-virtual {p1}, Lq/b;->c()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->x:Ljava/lang/Object;

    check-cast v0, Lm/h;

    iget-object v1, v0, Lm/h;->i:Landroid/widget/Button;

    if-ne p1, v1, :cond_0

    iget-object v1, v0, Lm/h;->k:Landroid/os/Message;

    if-eqz v1, :cond_0

    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lm/h;->l:Landroid/widget/Button;

    if-ne p1, v1, :cond_1

    iget-object v1, v0, Lm/h;->n:Landroid/os/Message;

    if-eqz v1, :cond_1

    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lm/h;->o:Landroid/widget/Button;

    if-ne p1, v1, :cond_2

    iget-object p1, v0, Lm/h;->q:Landroid/os/Message;

    if-eqz p1, :cond_2

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_3
    iget-object p1, v0, Lm/h;->E:Lm/f;

    const/4 v1, 0x1

    iget-object v0, v0, Lm/h;->b:Lm/j;

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/media3/ui/TrackSelectionView;

    iget-object v1, v0, Landroidx/media3/ui/TrackSelectionView;->G:Ljava/util/HashMap;

    iget-object v2, v0, Landroidx/media3/ui/TrackSelectionView;->y:Landroid/widget/CheckedTextView;

    const/4 v3, 0x1

    if-ne p1, v2, :cond_4

    iput-boolean v3, v0, Landroidx/media3/ui/TrackSelectionView;->L:Z

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    goto/16 :goto_3

    :cond_4
    iget-object v2, v0, Landroidx/media3/ui/TrackSelectionView;->z:Landroid/widget/CheckedTextView;

    const/4 v4, 0x0

    if-ne p1, v2, :cond_5

    iput-boolean v4, v0, Landroidx/media3/ui/TrackSelectionView;->L:Z

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    goto/16 :goto_3

    :cond_5
    iput-boolean v4, v0, Landroidx/media3/ui/TrackSelectionView;->L:Z

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Ldb/t0;

    iget-object v5, v2, Ldb/t0;->a:Lu8/u0;

    iget-object v6, v5, Lu8/u0;->b:Lu8/p0;

    iget v2, v2, Ldb/t0;->b:I

    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu8/q0;

    if-nez v7, :cond_7

    iget-boolean p1, v0, Landroidx/media3/ui/TrackSelectionView;->I:Z

    if-nez p1, :cond_6

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-lez p1, :cond_6

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    :cond_6
    new-instance p1, Lu8/q0;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v2

    invoke-direct {p1, v6, v2}, Lu8/q0;-><init>(Lu8/p0;Ljava/util/List;)V

    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    :cond_7
    new-instance v8, Ljava/util/ArrayList;

    iget-object v7, v7, Lu8/q0;->b:Lzr/g0;

    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    check-cast p1, Landroid/widget/CheckedTextView;

    invoke-virtual {p1}, Landroid/widget/CheckedTextView;->isChecked()Z

    move-result p1

    iget-boolean v7, v0, Landroidx/media3/ui/TrackSelectionView;->H:Z

    if-eqz v7, :cond_8

    iget-boolean v5, v5, Lu8/u0;->c:Z

    if-eqz v5, :cond_8

    move v5, v3

    goto :goto_1

    :cond_8
    move v5, v4

    :goto_1
    if-nez v5, :cond_a

    iget-boolean v7, v0, Landroidx/media3/ui/TrackSelectionView;->I:Z

    if-eqz v7, :cond_9

    iget-object v7, v0, Landroidx/media3/ui/TrackSelectionView;->F:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-le v7, v3, :cond_9

    goto :goto_2

    :cond_9
    move v3, v4

    :cond_a
    :goto_2
    if-eqz p1, :cond_c

    if-eqz v3, :cond_c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {v1, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_b
    new-instance p1, Lu8/q0;

    invoke-direct {p1, v6, v8}, Lu8/q0;-><init>(Lu8/p0;Ljava/util/List;)V

    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_c
    if-nez p1, :cond_e

    if-eqz v5, :cond_d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lu8/q0;

    invoke-direct {p1, v6, v8}, Lu8/q0;-><init>(Lu8/p0;Ljava/util/List;)V

    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_d
    new-instance p1, Lu8/q0;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v2

    invoke-direct {p1, v6, v2}, Lu8/q0;-><init>(Lu8/p0;Ljava/util/List;)V

    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    :goto_3
    invoke-virtual {v0}, Landroidx/media3/ui/TrackSelectionView;->a()V

    return-void

    :pswitch_3
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/datepicker/m;

    iget v0, p1, Lcom/google/android/material/datepicker/m;->E:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_f

    invoke-virtual {p1, v1}, Lcom/google/android/material/datepicker/m;->z(I)V

    goto :goto_4

    :cond_f
    if-ne v0, v1, :cond_10

    invoke-virtual {p1, v2}, Lcom/google/android/material/datepicker/m;->z(I)V

    :cond_10
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
