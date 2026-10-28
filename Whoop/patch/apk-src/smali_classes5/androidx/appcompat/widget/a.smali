.class public final Landroidx/appcompat/widget/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/j;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    iput p2, p0, Landroidx/appcompat/widget/a;->w:I

    iput-object p1, p0, Landroidx/appcompat/widget/a;->x:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lr/l;Landroid/view/MenuItem;)Z
    .locals 3

    iget v0, p0, Landroidx/appcompat/widget/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroid/view/ViewGroup;

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->r0:Lr/j;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lr/j;->a(Lr/l;Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    iget-object p1, p0, Landroidx/appcompat/widget/a;->x:Landroid/view/ViewGroup;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->L:Ls/k;

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    check-cast p1, Lq30/u0;

    iget-object p1, p1, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p1, Landroidx/appcompat/widget/Toolbar;->j0:Lh5/n;

    invoke-virtual {v1, p2}, Lh5/n;->a(Landroid/view/MenuItem;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move p1, v2

    goto :goto_1

    :cond_1
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->l0:Ls/q2;

    if-eqz p1, :cond_2

    check-cast p1, Lm/h0;

    iget-object p1, p1, Lm/h0;->w:Lm/i0;

    iget-object p1, p1, Lm/i0;->b:Landroid/view/Window$Callback;

    invoke-interface {p1, v0, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    goto :goto_1

    :cond_2
    move p1, v0

    :goto_1
    if-eqz p1, :cond_3

    move v0, v2

    :cond_3
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lr/l;)V
    .locals 3

    iget v0, p0, Landroidx/appcompat/widget/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroid/view/ViewGroup;

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->E:Ls/h;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ls/h;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->j0:Lh5/n;

    iget-object v1, v1, Lh5/n;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh5/o;

    check-cast v2, Landroidx/fragment/app/e1;

    iget-object v2, v2, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/o1;

    invoke-virtual {v2, p1}, Landroidx/fragment/app/o1;->t(Landroid/view/Menu;)Z

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->r0:Lr/j;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lr/j;->b(Lr/l;)V

    :cond_2
    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroid/view/ViewGroup;

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->G:Lr/j;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lr/j;->b(Lr/l;)V

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
