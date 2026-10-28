.class public final Lb4/r;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb4/s;


# direct methods
.method public synthetic constructor <init>(Lb4/s;I)V
    .locals 0

    iput p2, p0, Lb4/r;->w:I

    iput-object p1, p0, Lb4/r;->x:Lb4/s;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lb4/r;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg2/a;

    iget-object v0, p0, Lb4/r;->x:Lb4/s;

    invoke-static {v0}, Lb4/n;->e(Lb2/v;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {v0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v2

    invoke-static {v0}, Ldp/d;->W(La3/n;)Landroid/view/View;

    move-result-object v3

    instance-of v4, v1, Landroid/view/ViewGroup;

    const-string v5, "host view did not take focus"

    if-nez v4, :cond_1

    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {v2, v3, v1}, Lb4/n;->d(Lg2/k;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v2

    iget v4, p1, Lg2/a;->a:I

    invoke-static {v4}, Ljc/x;->u0(I)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_0

    :cond_2
    const/16 v4, 0x82

    :goto_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v6

    iget-object v0, v0, Lb4/s;->O:Landroid/view/View;

    if-eqz v0, :cond_3

    move-object v7, v3

    check-cast v7, Landroid/view/ViewGroup;

    invoke-virtual {v6, v7, v0, v4}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v3

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v6, v0, v2, v4}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_4

    invoke-static {v1, v0}, Lb4/n;->c(Landroid/view/View;Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, v4, v2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    const/4 v0, 0x1

    iput-boolean v0, p1, Lg2/a;->b:Z

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lg2/a;

    iget-object v0, p0, Lb4/r;->x:Lb4/s;

    invoke-static {v0}, Lb4/n;->e(Lb2/v;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {v0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v2

    invoke-static {v0}, Ldp/d;->W(La3/n;)Landroid/view/View;

    move-result-object v0

    iget v3, p1, Lg2/a;->a:I

    invoke-static {v3}, Ljc/x;->u0(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v0, v1}, Lb4/n;->d(Lg2/k;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-static {v1, v3, v0}, Ljc/x;->o0(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x1

    iput-boolean v0, p1, Lg2/a;->b:Z

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
