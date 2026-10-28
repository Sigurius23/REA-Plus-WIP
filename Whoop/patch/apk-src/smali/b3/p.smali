.class public final Lb3/p;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/platform/AndroidComposeView;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V
    .locals 0

    iput p2, p0, Lb3/p;->w:I

    iput-object p1, p0, Lb3/p;->x:Landroidx/compose/ui/platform/AndroidComposeView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lb3/p;->w:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lb3/p;->x:Landroidx/compose/ui/platform/AndroidComposeView;

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc93/a;

    invoke-virtual {v4}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne v2, v0, :cond_1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lb2/b;

    invoke-direct {v1, p1, v5}, Lb2/b;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ls2/c;

    invoke-virtual {p1}, Ls2/c;->b()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-static {p1}, Ls2/e;->D(Landroid/view/KeyEvent;)J

    move-result-wide v6

    sget v0, Ls2/b;->r:I

    invoke-static {}, Ls2/a;->s()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v1}, Lg2/d;->a(I)Lg2/d;

    move-result-object v0

    goto/16 :goto_6

    :cond_3
    invoke-static {}, Ls2/a;->r()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v5}, Lg2/d;->a(I)Lg2/d;

    move-result-object v0

    goto/16 :goto_6

    :cond_4
    invoke-static {}, Ls2/a;->z()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p1}, Ls2/e;->O(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    goto :goto_1

    :cond_5
    move v0, v5

    :goto_1
    invoke-static {v0}, Lg2/d;->a(I)Lg2/d;

    move-result-object v0

    goto/16 :goto_6

    :cond_6
    invoke-static {}, Ls2/a;->n()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x4

    invoke-static {v0}, Lg2/d;->a(I)Lg2/d;

    move-result-object v0

    goto/16 :goto_6

    :cond_7
    invoke-static {}, Ls2/a;->m()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x3

    invoke-static {v0}, Lg2/d;->a(I)Lg2/d;

    move-result-object v0

    goto/16 :goto_6

    :cond_8
    invoke-static {}, Ls2/a;->o()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_10

    invoke-static {}, Ls2/a;->v()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {}, Ls2/a;->l()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_f

    invoke-static {}, Ls2/a;->u()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_4

    :cond_a
    invoke-static {}, Ls2/a;->k()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-static {}, Ls2/a;->p()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-static {}, Ls2/a;->t()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_3

    :cond_b
    invoke-static {}, Ls2/a;->i()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {}, Ls2/a;->q()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_2

    :cond_c
    move-object v0, v2

    goto :goto_6

    :cond_d
    :goto_2
    const/16 v0, 0x8

    invoke-static {v0}, Lg2/d;->a(I)Lg2/d;

    move-result-object v0

    goto :goto_6

    :cond_e
    :goto_3
    const/4 v0, 0x7

    invoke-static {v0}, Lg2/d;->a(I)Lg2/d;

    move-result-object v0

    goto :goto_6

    :cond_f
    :goto_4
    const/4 v0, 0x6

    invoke-static {v0}, Lg2/d;->a(I)Lg2/d;

    move-result-object v0

    goto :goto_6

    :cond_10
    :goto_5
    const/4 v0, 0x5

    invoke-static {v0}, Lg2/d;->a(I)Lg2/d;

    move-result-object v0

    :goto_6
    if-eqz v0, :cond_20

    invoke-static {p1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result p1

    invoke-static {p1, v1}, Ls2/d;->j(II)Z

    move-result p1

    if-nez p1, :cond_11

    goto/16 :goto_d

    :cond_11
    invoke-virtual {v0}, Lg2/d;->d()I

    move-result p1

    invoke-static {p1}, Ljc/x;->u0(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getEmbeddedViewFocusRect()Lh2/c;

    move-result-object v1

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v6

    invoke-virtual {v0}, Lg2/d;->d()I

    move-result v7

    new-instance v8, Lb3/v;

    invoke-direct {v8, v0, v5}, Lb3/v;-><init>(Lg2/d;I)V

    check-cast v6, Lg2/l;

    invoke-virtual {v6, v7, v1, v8}, Lg2/l;->g(ILh2/c;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v6, :cond_12

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_7

    :cond_12
    move v6, v5

    :goto_7
    if-eqz v6, :cond_13

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto/16 :goto_e

    :cond_13
    invoke-virtual {v0}, Lg2/d;->d()I

    move-result v6

    invoke-static {v6}, Lg2/g;->v(I)Z

    move-result v6

    if-nez v6, :cond_14

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_e

    :cond_14
    if-eqz p1, :cond_1d

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    sget-object v7, Lb3/d2;->f:Lat/b;

    invoke-static {}, Ldc/a;->A()Lb3/d2;

    move-result-object v7

    move-object v8, v4

    :cond_15
    :goto_8
    const-string v9, "null cannot be cast to non-null type android.view.ViewGroup"

    if-eqz v8, :cond_18

    invoke-virtual {v4}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroid/view/ViewGroup;

    invoke-virtual {v7, v6, v8, v10}, Lb3/d2;->b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_15

    invoke-virtual {v8, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_16

    goto :goto_a

    :cond_16
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v10

    :goto_9
    if-eqz v10, :cond_19

    if-ne v10, v4, :cond_17

    goto :goto_8

    :cond_17
    invoke-interface {v10}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v10

    goto :goto_9

    :cond_18
    move-object v8, v2

    :cond_19
    :goto_a
    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1a

    goto :goto_b

    :cond_1a
    move-object v8, v2

    :goto_b
    if-eqz v8, :cond_1d

    if-eqz v1, :cond_1b

    invoke-static {v1}, Li2/w0;->D(Lh2/c;)Landroid/graphics/Rect;

    move-result-object v1

    goto :goto_c

    :cond_1b
    move-object v1, v2

    :goto_c
    if-eqz v1, :cond_1c

    invoke-virtual {v4}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v6, v4, v1}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {v6, v8, v1}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v8, p1, v1}, Ljc/x;->o0(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_1d

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_e

    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid rect"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1d
    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object p1

    invoke-virtual {v0}, Lg2/d;->d()I

    move-result v1

    check-cast p1, Lg2/l;

    invoke-virtual {p1, v1, v3, v3}, Lg2/l;->d(IZZ)Z

    move-result p1

    if-nez p1, :cond_1e

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_e

    :cond_1e
    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object p1

    invoke-virtual {v0}, Lg2/d;->d()I

    move-result v1

    new-instance v4, Lb3/v;

    invoke-direct {v4, v0, v3}, Lb3/v;-><init>(Lg2/d;I)V

    check-cast p1, Lg2/l;

    invoke-virtual {p1, v1, v2, v4}, Lg2/l;->g(ILh2/c;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_1f

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    :cond_1f
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_e

    :cond_20
    :goto_d
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_e
    return-object p1

    :pswitch_1
    check-cast p1, Lr2/a;

    iget p1, p1, Lr2/a;->a:I

    if-ne p1, v5, :cond_21

    invoke-virtual {v4}, Landroid/view/View;->isInTouchMode()Z

    move-result v3

    goto :goto_f

    :cond_21
    if-ne p1, v1, :cond_23

    invoke-virtual {v4}, Landroid/view/View;->isInTouchMode()Z

    move-result p1

    if-eqz p1, :cond_22

    invoke-virtual {v4}, Landroid/view/View;->requestFocusFromTouch()Z

    move-result v3

    goto :goto_f

    :cond_22
    move v3, v5

    :cond_23
    :goto_f
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
