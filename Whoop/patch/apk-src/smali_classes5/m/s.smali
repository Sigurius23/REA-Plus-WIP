.class public final Lm/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/w;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm/a0;


# direct methods
.method public synthetic constructor <init>(Lm/a0;I)V
    .locals 0

    iput p2, p0, Lm/s;->w:I

    iput-object p1, p0, Lm/s;->x:Lm/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Lr/l;Z)V
    .locals 9

    iget v0, p0, Lm/s;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lr/l;->l()Lr/l;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    move-object p1, v0

    :cond_1
    iget-object v4, p0, Lm/s;->x:Lm/a0;

    iget-object v5, v4, Lm/a0;->l0:[Lm/z;

    if-eqz v5, :cond_2

    array-length v6, v5

    goto :goto_1

    :cond_2
    move v6, v1

    :goto_1
    if-ge v1, v6, :cond_4

    aget-object v7, v5, v1

    if-eqz v7, :cond_3

    iget-object v8, v7, Lm/z;->h:Lr/l;

    if-ne v8, p1, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_6

    if-eqz v3, :cond_5

    iget p1, v7, Lm/z;->a:I

    invoke-virtual {v4, p1, v7, v0}, Lm/a0;->v(ILm/z;Lr/l;)V

    invoke-virtual {v4, v7, v2}, Lm/a0;->x(Lm/z;Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v4, v7, p2}, Lm/a0;->x(Lm/z;Z)V

    :cond_6
    :goto_3
    return-void

    :pswitch_0
    iget-object p2, p0, Lm/s;->x:Lm/a0;

    invoke-virtual {p2, p1}, Lm/a0;->w(Lr/l;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Lr/l;)Z
    .locals 2

    iget v0, p0, Lm/s;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lr/l;->l()Lr/l;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lm/s;->x:Lm/a0;

    iget-boolean v1, v0, Lm/a0;->f0:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lm/a0;->q0:Z

    if-nez v0, :cond_0

    const/16 v0, 0x6c

    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    iget-object v0, p0, Lm/s;->x:Lm/a0;

    iget-object v0, v0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
