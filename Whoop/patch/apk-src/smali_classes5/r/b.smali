.class public final Lr/b;
.super Ls/n1;
.source "SourceFile"


# instance fields
.field public final synthetic J:I

.field public final synthetic K:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr/b;->J:I

    .line 1
    iput-object p1, p0, Lr/b;->K:Landroid/view/View;

    .line 2
    invoke-direct {p0, p1}, Ls/n1;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Ls/g;Ls/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lr/b;->J:I

    .line 3
    iput-object p1, p0, Lr/b;->K:Landroid/view/View;

    invoke-direct {p0, p2}, Ls/n1;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lr/b0;
    .locals 1

    iget v0, p0, Lr/b;->J:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lr/b;->K:Landroid/view/View;

    check-cast v0, Ls/g;

    iget-object v0, v0, Ls/g;->w:Ls/h;

    iget-object v0, v0, Ls/h;->S:Ls/d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lr/v;->a()Lr/t;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lr/b;->K:Landroid/view/View;

    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->F:Lr/c;

    if-eqz v0, :cond_1

    check-cast v0, Ls/e;

    iget-object v0, v0, Ls/e;->a:Ls/h;

    iget-object v0, v0, Ls/h;->T:Ls/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lr/v;->a()Lr/t;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Lr/b;->J:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lr/b;->K:Landroid/view/View;

    check-cast v0, Ls/g;

    iget-object v0, v0, Ls/g;->w:Ls/h;

    invoke-virtual {v0}, Ls/h;->l()Z

    const/4 v0, 0x1

    return v0

    :pswitch_0
    iget-object v0, p0, Lr/b;->K:Landroid/view/View;

    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->z:Lr/k;

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->w:Lr/n;

    invoke-interface {v1, v0}, Lr/k;->a(Lr/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr/b;->b()Lr/b0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr/b0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()Z
    .locals 2

    iget v0, p0, Lr/b;->J:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ls/n1;->d()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lr/b;->K:Landroid/view/View;

    check-cast v0, Ls/g;

    iget-object v0, v0, Ls/g;->w:Ls/h;

    iget-object v1, v0, Ls/h;->U:Ls/f;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ls/h;->c()Z

    const/4 v0, 0x1

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
