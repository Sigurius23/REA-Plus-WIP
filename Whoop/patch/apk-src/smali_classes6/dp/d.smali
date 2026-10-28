.class public abstract Ldp/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/ClassLoader;

.field public static b:Ljava/lang/Thread;

.field public static c:Lo2/e;


# direct methods
.method public static A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "TRuntime."

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x6

    invoke-static {p0, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static final B(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;
    .locals 3

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eq v2, p2, :cond_1

    invoke-static {v2, p1, p2}, Ldp/d;->B(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static C(Lorg/json/JSONObject;)Ljk/c;
    .locals 3

    const-string v0, "source_name"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "source_version"

    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljk/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Ljk/c;->a:Ljava/lang/String;

    iput-object p0, v1, Ljk/c;->b:Ljava/lang/String;

    return-object v1
.end method

.method public static final D(Ly00/i;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const p0, 0x7f080852

    return p0

    :pswitch_1
    const p0, 0x7f0807d8

    return p0

    :pswitch_2
    const p0, 0x7f0807bf

    return p0

    :pswitch_3
    const p0, 0x7f080850

    return p0

    :pswitch_4
    const p0, 0x7f0807cb

    return p0

    :pswitch_5
    const p0, 0x7f0807db

    return p0

    :pswitch_6
    const p0, 0x7f0807ce

    return p0

    :pswitch_7
    const p0, 0x7f0807a7

    return p0

    :pswitch_8
    const p0, 0x7f0807df

    return p0

    :pswitch_9
    const p0, 0x7f080855

    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final E(Ly00/i;)I
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const p0, 0x7f080803

    return p0

    :pswitch_1
    const p0, 0x7f0807f7

    return p0

    :pswitch_2
    const p0, 0x7f0807ee

    return p0

    :pswitch_3
    const p0, 0x7f080800

    return p0

    :pswitch_4
    const p0, 0x7f0807f1

    return p0

    :pswitch_5
    const p0, 0x7f0807fa

    return p0

    :pswitch_6
    const p0, 0x7f0807f4

    return p0

    :pswitch_7
    const p0, 0x7f0807eb

    return p0

    :pswitch_8
    const p0, 0x7f0807fd

    return p0

    :pswitch_9
    const p0, 0x7f080806

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final F(II[F)F
    .locals 0

    sub-int/2addr p0, p1

    mul-int/lit8 p0, p0, 0x2

    add-int/lit8 p0, p0, 0x1

    aget p0, p2, p0

    return p0
.end method

.method public static G(Landroid/widget/EdgeEffect;)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Ld2/b;->i(Landroid/widget/EdgeEffect;)F

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final H(Lp1/q;)Lnf3/a;
    .locals 2

    const v0, 0x219e1579

    invoke-virtual {p0, v0}, Lp1/q;->f0(I)V

    const v0, -0x384349

    invoke-virtual {p0, v0}, Lp1/q;->f0(I)V

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    sget-object v0, Lpf3/a;->b:Lnf3/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "KoinApplication has not been started"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    check-cast v0, Lnf3/a;

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method public static final I(Ly00/o4;Z)Lzy/c;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/o4;->H:Ly00/z3;

    iget-boolean v1, p0, Ly00/o4;->S:Z

    iget-object v2, p0, Ly00/o4;->R:Ly00/s2;

    iget-object v3, p0, Ly00/o4;->E:Ly00/f4;

    if-nez v3, :cond_0

    const/4 v3, -0x1

    goto :goto_0

    :cond_0
    sget-object v4, Lb30/o2;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    :goto_0
    const/4 v4, 0x1

    const v5, 0x7f14102c

    const/4 v6, 0x0

    if-eq v3, v4, :cond_8

    const/4 v0, 0x2

    sget-object v4, Lm83/y;->w:Lm83/y;

    const v7, 0x7f1410a8

    if-eq v3, v0, :cond_6

    const/4 v0, 0x3

    if-eq v3, v0, :cond_3

    const/4 p0, 0x4

    if-eq v3, p0, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    if-eqz v2, :cond_d

    invoke-static {v2}, Lse/b;->E(Ly00/s2;)Lzy/c;

    move-result-object p0

    return-object p0

    :cond_2
    if-eqz v2, :cond_d

    invoke-static {v2}, Lse/b;->I(Ly00/s2;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_3
    if-eqz v1, :cond_4

    if-eqz p1, :cond_4

    invoke-static {v5}, Ls4/i;->h(I)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_4
    iget-object p0, p0, Ly00/o4;->Q:Ly00/l4;

    if-eqz p0, :cond_5

    iget-object v6, p0, Ly00/l4;->E:Ljava/lang/String;

    :cond_5
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v7, p0, v4}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_6
    iget-object p0, p0, Ly00/o4;->L:Ly00/e4;

    if-eqz p0, :cond_7

    iget-object v6, p0, Ly00/e4;->E:Ljava/lang/String;

    :cond_7
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v7, p0, v4}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_8
    if-eqz v1, :cond_b

    if-eqz p1, :cond_9

    invoke-static {v5}, Ls4/i;->h(I)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_9
    if-eqz v0, :cond_a

    iget-object v6, v0, Ly00/z3;->H:Ljava/lang/String;

    :cond_a
    invoke-static {v6}, Ldp/d;->w(Ljava/lang/String;)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-virtual {p0}, Ly00/o4;->f()Z

    move-result p0

    if-eqz p0, :cond_e

    if-eqz p1, :cond_c

    if-eqz v2, :cond_d

    invoke-static {v2}, Lse/b;->E(Ly00/s2;)Lzy/c;

    move-result-object p0

    return-object p0

    :cond_c
    if-eqz v2, :cond_d

    invoke-static {v2}, Lse/b;->I(Ly00/s2;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_d
    :goto_1
    return-object v6

    :cond_e
    if-eqz v0, :cond_f

    iget-object v6, v0, Ly00/z3;->H:Ljava/lang/String;

    :cond_f
    invoke-static {v6}, Ldp/d;->w(Ljava/lang/String;)Lzy/b;

    move-result-object p0

    return-object p0
.end method

.method public static final J(ZLjava/lang/Boolean;)I
    .locals 0

    if-eqz p0, :cond_0

    const p0, 0x7f08080d

    return p0

    :cond_0
    if-nez p1, :cond_1

    const p0, 0x7f080810

    return p0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_2

    const p0, 0x7f08080f

    return p0

    :cond_2
    const p0, 0x7f08080e

    return p0
.end method

.method public static synthetic K(ILjava/lang/Boolean;)I
    .locals 1

    and-int/lit8 v0, p0, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    :goto_0
    invoke-static {p0, p1}, Ldp/d;->J(ZLjava/lang/Boolean;)I

    move-result p0

    return p0
.end method

.method public static final L(Lm3/m;Landroid/text/Layout;Lb30/m;Landroid/graphics/RectF;ILkk1/b;)[I
    .locals 9

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    new-instance p4, Lxl/a;

    iget-object v1, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p0}, Lm3/m;->j()Lcom/google/android/material/textfield/p;

    move-result-object v2

    const/16 v3, 0x15

    invoke-direct {p4, v3, v1, v2}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    move-object v6, p4

    goto :goto_1

    :cond_0
    iget-object p4, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {p4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p4

    iget-object v1, p0, Lm3/m;->a:Landroid/text/TextPaint;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_1

    new-instance v2, Ln3/b;

    invoke-direct {v2, p4, v1}, Ln3/b;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V

    move-object p4, v2

    goto :goto_0

    :cond_1
    new-instance v1, Ln3/c;

    invoke-direct {v1, p4}, Ln3/c;-><init>(Ljava/lang/CharSequence;)V

    move-object p4, v1

    goto :goto_0

    :goto_1
    iget p4, p3, Landroid/graphics/RectF;->top:F

    float-to-int p4, p4

    invoke-virtual {p1, p4}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result p4

    iget v1, p3, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0, p4}, Lm3/m;->e(I)F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_2

    add-int/lit8 p4, p4, 0x1

    iget v1, p0, Lm3/m;->g:I

    if-lt p4, v1, :cond_2

    goto :goto_4

    :cond_2
    move v4, p4

    iget p4, p3, Landroid/graphics/RectF;->bottom:F

    float-to-int p4, p4

    invoke-virtual {p1, p4}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result p4

    if-nez p4, :cond_3

    iget v1, p3, Landroid/graphics/RectF;->bottom:F

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lm3/m;->g(I)F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_3

    goto :goto_4

    :cond_3
    const/4 v8, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v7, p5

    invoke-static/range {v1 .. v8}, Ldp/d;->N(Lm3/m;Landroid/text/Layout;Lb30/m;ILandroid/graphics/RectF;Ln3/d;Lkk1/b;Z)I

    move-result p0

    :goto_2
    move p1, v4

    const/4 p2, -0x1

    if-ne p0, p2, :cond_4

    if-ge p1, p4, :cond_4

    add-int/lit8 v4, p1, 0x1

    const/4 v8, 0x1

    invoke-static/range {v1 .. v8}, Ldp/d;->N(Lm3/m;Landroid/text/Layout;Lb30/m;ILandroid/graphics/RectF;Ln3/d;Lkk1/b;Z)I

    move-result p0

    goto :goto_2

    :cond_4
    if-ne p0, p2, :cond_5

    goto :goto_4

    :cond_5
    const/4 v8, 0x0

    move v4, p4

    invoke-static/range {v1 .. v8}, Ldp/d;->N(Lm3/m;Landroid/text/Layout;Lb30/m;ILandroid/graphics/RectF;Ln3/d;Lkk1/b;Z)I

    move-result p3

    :goto_3
    if-ne p3, p2, :cond_6

    if-ge p1, p4, :cond_6

    add-int/lit8 v4, p4, -0x1

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Ldp/d;->N(Lm3/m;Landroid/text/Layout;Lb30/m;ILandroid/graphics/RectF;Ln3/d;Lkk1/b;Z)I

    move-result p3

    move p4, v4

    goto :goto_3

    :cond_6
    if-ne p3, p2, :cond_7

    :goto_4
    const/4 p0, 0x0

    return-object p0

    :cond_7
    add-int/2addr p0, v0

    invoke-interface {v6, p0}, Ln3/d;->c(I)I

    move-result p0

    sub-int/2addr p3, v0

    invoke-interface {v6, p3}, Ln3/d;->d(I)I

    move-result p1

    filled-new-array {p0, p1}, [I

    move-result-object p0

    return-object p0
.end method

.method public static M(Ly00/o4;Ljava/lang/Boolean;I)I
    .locals 9

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v3, p2, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const/4 v4, 0x4

    and-int/2addr p2, v4

    const/4 v5, 0x0

    if-eqz p2, :cond_2

    move-object p1, v5

    :cond_2
    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v6, p0, Ly00/o4;->S:Z

    iget-object v7, p0, Ly00/o4;->E:Ly00/f4;

    if-nez v7, :cond_3

    const/4 v7, -0x1

    goto :goto_2

    :cond_3
    sget-object v8, Lb30/o2;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v8, v7

    :goto_2
    if-eq v7, v1, :cond_f

    const/4 p2, 0x2

    if-eq v7, p2, :cond_c

    const/4 p2, 0x3

    if-eq v7, p2, :cond_7

    if-eq v7, v4, :cond_4

    goto/16 :goto_c

    :cond_4
    if-nez v0, :cond_6

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    move v1, v2

    :cond_6
    :goto_3
    invoke-static {v1, p1}, Ldp/d;->J(ZLjava/lang/Boolean;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_c

    :cond_7
    if-eqz v6, :cond_a

    if-nez v0, :cond_9

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    move v1, v2

    :cond_9
    :goto_4
    invoke-static {v1, p1}, Ldp/d;->J(ZLjava/lang/Boolean;)I

    move-result p0

    goto :goto_5

    :cond_a
    iget-object p0, p0, Ly00/o4;->Q:Ly00/l4;

    if-eqz p0, :cond_b

    iget-object v5, p0, Ly00/l4;->y:Ljava/lang/String;

    :cond_b
    const p0, 0x7f0807d3

    invoke-static {p0, v5}, Lt20/j;->a(ILjava/lang/String;)I

    move-result p0

    :goto_5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_c

    :cond_c
    if-nez p1, :cond_d

    const p0, 0x7f080846

    goto :goto_6

    :cond_d
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_e

    const p0, 0x7f080845

    goto :goto_6

    :cond_e
    const p0, 0x7f080844

    :goto_6
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_c

    :cond_f
    invoke-virtual {p0}, Ly00/o4;->f()Z

    move-result v4

    if-nez v4, :cond_16

    if-eqz v6, :cond_10

    goto/16 :goto_a

    :cond_10
    iget-object p0, p0, Ly00/o4;->H:Ly00/z3;

    if-eqz p0, :cond_19

    sget-object v1, Ly00/i;->M:Lt9/c0;

    iget-object v2, p0, Ly00/z3;->L:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object v1

    sget-object v2, Ly00/i;->X:Ly00/i;

    if-eq v1, v2, :cond_11

    move-object v5, v1

    :cond_11
    if-nez v5, :cond_12

    iget-object v5, p0, Ly00/z3;->w:Ly00/i;

    :cond_12
    if-eqz v0, :cond_13

    invoke-static {v5}, Ldp/d;->D(Ly00/i;)I

    move-result p0

    goto/16 :goto_9

    :cond_13
    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Ldp/d;->E(Ly00/i;)I

    move-result p0

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    packed-switch p2, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const p2, 0x7f080802

    goto :goto_7

    :pswitch_1
    const p2, 0x7f0807f6

    goto :goto_7

    :pswitch_2
    const p2, 0x7f0807ed

    goto :goto_7

    :pswitch_3
    const p2, 0x7f0807ff

    goto :goto_7

    :pswitch_4
    const p2, 0x7f0807f0

    goto :goto_7

    :pswitch_5
    const p2, 0x7f0807f9

    goto :goto_7

    :pswitch_6
    const p2, 0x7f0807f3

    goto :goto_7

    :pswitch_7
    const p2, 0x7f0807ea

    goto :goto_7

    :pswitch_8
    const p2, 0x7f0807fc

    goto :goto_7

    :pswitch_9
    const p2, 0x7f080805

    :goto_7
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_a
    const v0, 0x7f080801

    goto :goto_8

    :pswitch_b
    const v0, 0x7f0807f5

    goto :goto_8

    :pswitch_c
    const v0, 0x7f0807ec

    goto :goto_8

    :pswitch_d
    const v0, 0x7f0807fe

    goto :goto_8

    :pswitch_e
    const v0, 0x7f0807ef

    goto :goto_8

    :pswitch_f
    const v0, 0x7f0807f8

    goto :goto_8

    :pswitch_10
    const v0, 0x7f0807f2

    goto :goto_8

    :pswitch_11
    const v0, 0x7f0807e9

    goto :goto_8

    :pswitch_12
    const v0, 0x7f0807fb

    goto :goto_8

    :pswitch_13
    const v0, 0x7f080804

    :goto_8
    if-nez p1, :cond_14

    goto :goto_9

    :cond_14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_15

    move p0, p2

    goto :goto_9

    :cond_15
    move p0, v0

    :goto_9
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_c

    :cond_16
    :goto_a
    if-nez v0, :cond_18

    if-eqz v3, :cond_17

    goto :goto_b

    :cond_17
    move v1, v2

    :cond_18
    :goto_b
    invoke-static {v1, p1}, Ldp/d;->J(ZLjava/lang/Boolean;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_19
    :goto_c
    if-eqz v5, :cond_1a

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1a
    const p0, 0x7f080803

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public static final N(Lm3/m;Landroid/text/Layout;Lb30/m;ILandroid/graphics/RectF;Ln3/d;Lkk1/b;Z)I
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineTop(I)I

    move-result v7

    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v8

    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineStart(I)I

    move-result v9

    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v1

    if-ne v9, v1, :cond_1

    :cond_0
    const/4 v10, -0x1

    goto/16 :goto_1e

    :cond_1
    sub-int/2addr v1, v9

    mul-int/lit8 v1, v1, 0x2

    new-array v11, v1, [F

    iget-object v12, v0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v12, v3}, Landroid/text/Layout;->getLineStart(I)I

    move-result v13

    invoke-virtual {v0, v3}, Lm3/m;->f(I)I

    move-result v14

    sub-int v15, v14, v13

    mul-int/lit8 v15, v15, 0x2

    if-lt v1, v15, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2"

    invoke-static {v1}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    new-instance v1, Lh3/g;

    invoke-direct {v1, v0}, Lh3/g;-><init>(Lm3/m;)V

    invoke-virtual {v12, v3}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v0

    const/4 v15, 0x0

    const/4 v10, 0x1

    if-ne v0, v10, :cond_3

    move v0, v10

    goto :goto_1

    :cond_3
    move v0, v15

    :goto_1
    move/from16 v16, v15

    :goto_2
    if-ge v13, v14, :cond_7

    invoke-virtual {v12, v13}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v17

    if-eqz v0, :cond_4

    if-nez v17, :cond_4

    invoke-virtual {v1, v13, v15, v15, v10}, Lh3/g;->a(IZZZ)F

    move-result v17

    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v1, v15, v10, v10, v10}, Lh3/g;->a(IZZZ)F

    move-result v15

    move/from16 v18, v0

    goto :goto_4

    :cond_4
    if-eqz v0, :cond_5

    if-eqz v17, :cond_5

    const/4 v15, 0x0

    invoke-virtual {v1, v13, v15, v15, v15}, Lh3/g;->a(IZZZ)F

    move-result v17

    move/from16 v18, v0

    add-int/lit8 v0, v13, 0x1

    invoke-virtual {v1, v0, v10, v10, v15}, Lh3/g;->a(IZZZ)F

    move-result v0

    move/from16 v15, v17

    move/from16 v17, v0

    goto :goto_4

    :cond_5
    move/from16 v18, v0

    const/4 v15, 0x0

    if-eqz v17, :cond_6

    invoke-virtual {v1, v13, v15, v15, v10}, Lh3/g;->a(IZZZ)F

    move-result v0

    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v1, v15, v10, v10, v10}, Lh3/g;->a(IZZZ)F

    move-result v17

    :goto_3
    move v15, v0

    goto :goto_4

    :cond_6
    invoke-virtual {v1, v13, v15, v15, v15}, Lh3/g;->a(IZZZ)F

    move-result v17

    add-int/lit8 v0, v13, 0x1

    invoke-virtual {v1, v0, v10, v10, v15}, Lh3/g;->a(IZZZ)F

    move-result v0

    goto :goto_3

    :goto_4
    aput v17, v11, v16

    add-int/lit8 v0, v16, 0x1

    aput v15, v11, v0

    add-int/lit8 v16, v16, 0x2

    add-int/lit8 v13, v13, 0x1

    move/from16 v0, v18

    const/4 v15, 0x0

    goto :goto_2

    :cond_7
    iget-object v0, v2, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0, v3}, Landroid/text/Layout;->getLineStart(I)I

    move-result v1

    invoke-virtual {v0, v3}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v3

    const/4 v15, 0x0

    invoke-virtual {v2, v1, v15}, Lb30/m;->B(IZ)I

    move-result v12

    invoke-virtual {v2, v12}, Lb30/m;->C(I)I

    move-result v13

    sub-int v14, v1, v13

    sub-int v13, v3, v13

    invoke-virtual {v2, v12}, Lb30/m;->t(I)Ljava/text/Bidi;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2, v14, v13}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    move-result-object v2

    if-nez v2, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v0

    new-array v3, v0, [Lm3/f;

    const/4 v15, 0x0

    :goto_5
    if-ge v15, v0, :cond_b

    new-instance v12, Lm3/f;

    invoke-virtual {v2, v15}, Ljava/text/Bidi;->getRunStart(I)I

    move-result v13

    add-int/2addr v13, v1

    invoke-virtual {v2, v15}, Ljava/text/Bidi;->getRunLimit(I)I

    move-result v14

    add-int/2addr v14, v1

    invoke-virtual {v2, v15}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v16

    move/from16 p2, v0

    rem-int/lit8 v0, v16, 0x2

    if-ne v0, v10, :cond_9

    move v0, v10

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    invoke-direct {v12, v13, v14, v0}, Lm3/f;-><init>(IIZ)V

    aput-object v12, v3, v15

    add-int/lit8 v15, v15, 0x1

    move/from16 v0, p2

    goto :goto_5

    :cond_a
    :goto_7
    new-instance v2, Lm3/f;

    invoke-virtual {v0, v1}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v0

    invoke-direct {v2, v1, v3, v0}, Lm3/f;-><init>(IIZ)V

    filled-new-array {v2}, [Lm3/f;

    move-result-object v3

    :cond_b
    if-eqz p7, :cond_c

    new-instance v0, Li93/j;

    array-length v1, v3

    sub-int/2addr v1, v10

    const/4 v15, 0x0

    invoke-direct {v0, v15, v1, v10}, Li93/h;-><init>(III)V

    goto :goto_8

    :cond_c
    const/4 v15, 0x0

    array-length v0, v3

    sub-int/2addr v0, v10

    new-instance v1, Li93/h;

    const/4 v2, -0x1

    invoke-direct {v1, v0, v15, v2}, Li93/h;-><init>(III)V

    move-object v0, v1

    :goto_8
    iget v1, v0, Li93/h;->w:I

    iget v2, v0, Li93/h;->x:I

    iget v0, v0, Li93/h;->y:I

    if-lez v0, :cond_d

    if-le v1, v2, :cond_e

    :cond_d
    if-gez v0, :cond_0

    if-gt v2, v1, :cond_0

    :cond_e
    :goto_9
    aget-object v12, v3, v1

    iget-boolean v13, v12, Lm3/f;->c:Z

    iget v14, v12, Lm3/f;->a:I

    iget v12, v12, Lm3/f;->b:I

    if-eqz v13, :cond_f

    add-int/lit8 v15, v12, -0x1

    sub-int/2addr v15, v9

    mul-int/lit8 v15, v15, 0x2

    aget v15, v11, v15

    goto :goto_a

    :cond_f
    sub-int v15, v14, v9

    mul-int/lit8 v15, v15, 0x2

    aget v15, v11, v15

    :goto_a
    if-eqz v13, :cond_10

    invoke-static {v14, v9, v11}, Ldp/d;->F(II[F)F

    move-result v16

    goto :goto_b

    :cond_10
    add-int/lit8 v10, v12, -0x1

    invoke-static {v10, v9, v11}, Ldp/d;->F(II[F)F

    move-result v16

    :goto_b
    if-eqz p7, :cond_25

    iget v10, v4, Landroid/graphics/RectF;->left:F

    cmpl-float v17, v16, v10

    if-ltz v17, :cond_24

    move/from16 v17, v0

    iget v0, v4, Landroid/graphics/RectF;->right:F

    cmpg-float v18, v15, v0

    if-gtz v18, :cond_19

    if-nez v13, :cond_11

    cmpg-float v10, v10, v15

    if-lez v10, :cond_12

    :cond_11
    if-eqz v13, :cond_13

    cmpl-float v0, v0, v16

    if-ltz v0, :cond_13

    :cond_12
    move v0, v14

    goto :goto_d

    :cond_13
    move v0, v12

    move v10, v14

    :goto_c
    sub-int v15, v0, v10

    move/from16 p3, v0

    const/4 v0, 0x1

    if-le v15, v0, :cond_17

    add-int v0, p3, v10

    div-int/lit8 v0, v0, 0x2

    sub-int v15, v0, v9

    mul-int/lit8 v15, v15, 0x2

    aget v15, v11, v15

    move/from16 v16, v0

    if-nez v13, :cond_14

    iget v0, v4, Landroid/graphics/RectF;->left:F

    cmpl-float v0, v15, v0

    if-gtz v0, :cond_15

    :cond_14
    if-eqz v13, :cond_16

    iget v0, v4, Landroid/graphics/RectF;->right:F

    cmpg-float v0, v15, v0

    if-gez v0, :cond_16

    :cond_15
    move/from16 v0, v16

    goto :goto_c

    :cond_16
    move/from16 v0, p3

    move/from16 v10, v16

    goto :goto_c

    :cond_17
    if-eqz v13, :cond_18

    move/from16 v0, p3

    goto :goto_d

    :cond_18
    move v0, v10

    :goto_d
    invoke-interface {v5, v0}, Ln3/d;->d(I)I

    move-result v0

    const/4 v10, -0x1

    if-ne v0, v10, :cond_1b

    :cond_19
    :goto_e
    move-object/from16 v18, v3

    :cond_1a
    :goto_f
    const/4 v14, -0x1

    goto/16 :goto_1d

    :cond_1b
    invoke-interface {v5, v0}, Ln3/d;->c(I)I

    move-result v10

    if-lt v10, v12, :cond_1c

    goto :goto_e

    :cond_1c
    if-ge v10, v14, :cond_1d

    goto :goto_10

    :cond_1d
    move v14, v10

    :goto_10
    if-le v0, v12, :cond_1e

    move v0, v12

    :cond_1e
    new-instance v10, Landroid/graphics/RectF;

    int-to-float v15, v7

    move/from16 p3, v0

    int-to-float v0, v8

    move-object/from16 v18, v3

    const/4 v3, 0x0

    invoke-direct {v10, v3, v15, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    move/from16 v0, p3

    :cond_1f
    :goto_11
    if-eqz v13, :cond_20

    add-int/lit8 v3, v0, -0x1

    sub-int/2addr v3, v9

    mul-int/lit8 v3, v3, 0x2

    aget v3, v11, v3

    goto :goto_12

    :cond_20
    sub-int v3, v14, v9

    mul-int/lit8 v3, v3, 0x2

    aget v3, v11, v3

    :goto_12
    iput v3, v10, Landroid/graphics/RectF;->left:F

    if-eqz v13, :cond_21

    invoke-static {v14, v9, v11}, Ldp/d;->F(II[F)F

    move-result v0

    goto :goto_13

    :cond_21
    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, v9, v11}, Ldp/d;->F(II[F)F

    move-result v0

    :goto_13
    iput v0, v10, Landroid/graphics/RectF;->right:F

    invoke-virtual {v6, v10, v4}, Lkk1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_22

    goto/16 :goto_1d

    :cond_22
    invoke-interface {v5, v14}, Ln3/d;->b(I)I

    move-result v14

    const/4 v0, -0x1

    if-eq v14, v0, :cond_1a

    if-lt v14, v12, :cond_23

    goto :goto_f

    :cond_23
    invoke-interface {v5, v14}, Ln3/d;->d(I)I

    move-result v0

    if-le v0, v12, :cond_1f

    move v0, v12

    goto :goto_11

    :cond_24
    move/from16 v17, v0

    goto :goto_e

    :cond_25
    move/from16 v17, v0

    move-object/from16 v18, v3

    iget v0, v4, Landroid/graphics/RectF;->left:F

    cmpl-float v3, v16, v0

    if-ltz v3, :cond_2e

    iget v3, v4, Landroid/graphics/RectF;->right:F

    cmpg-float v10, v15, v3

    if-gtz v10, :cond_2e

    if-nez v13, :cond_26

    cmpl-float v3, v3, v16

    if-gez v3, :cond_27

    :cond_26
    if-eqz v13, :cond_28

    cmpg-float v0, v0, v15

    if-gtz v0, :cond_28

    :cond_27
    add-int/lit8 v0, v12, -0x1

    :goto_14
    const/4 v15, 0x1

    goto :goto_16

    :cond_28
    move v0, v12

    move v3, v14

    :goto_15
    sub-int v10, v0, v3

    const/4 v15, 0x1

    if-le v10, v15, :cond_2c

    add-int v10, v0, v3

    div-int/lit8 v10, v10, 0x2

    sub-int v15, v10, v9

    mul-int/lit8 v15, v15, 0x2

    aget v15, v11, v15

    move/from16 p3, v0

    if-nez v13, :cond_29

    iget v0, v4, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v15, v0

    if-gtz v0, :cond_2a

    :cond_29
    if-eqz v13, :cond_2b

    iget v0, v4, Landroid/graphics/RectF;->left:F

    cmpg-float v0, v15, v0

    if-gez v0, :cond_2b

    :cond_2a
    move v0, v10

    goto :goto_15

    :cond_2b
    move/from16 v0, p3

    move v3, v10

    goto :goto_15

    :cond_2c
    move/from16 p3, v0

    if-eqz v13, :cond_2d

    move/from16 v0, p3

    goto :goto_14

    :cond_2d
    move v0, v3

    goto :goto_14

    :goto_16
    add-int/2addr v0, v15

    invoke-interface {v5, v0}, Ln3/d;->c(I)I

    move-result v0

    const/4 v10, -0x1

    if-ne v0, v10, :cond_2f

    :cond_2e
    :goto_17
    const/4 v12, -0x1

    goto :goto_1c

    :cond_2f
    invoke-interface {v5, v0}, Ln3/d;->d(I)I

    move-result v3

    if-gt v3, v14, :cond_30

    goto :goto_17

    :cond_30
    if-ge v0, v14, :cond_31

    move v0, v14

    :cond_31
    if-le v3, v12, :cond_32

    goto :goto_18

    :cond_32
    move v12, v3

    :goto_18
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v10, v7

    int-to-float v15, v8

    move/from16 p3, v0

    const/4 v0, 0x0

    invoke-direct {v3, v0, v10, v0, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    move/from16 v0, p3

    :cond_33
    :goto_19
    if-eqz v13, :cond_34

    add-int/lit8 v10, v12, -0x1

    sub-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x2

    aget v10, v11, v10

    goto :goto_1a

    :cond_34
    sub-int v10, v0, v9

    mul-int/lit8 v10, v10, 0x2

    aget v10, v11, v10

    :goto_1a
    iput v10, v3, Landroid/graphics/RectF;->left:F

    if-eqz v13, :cond_35

    invoke-static {v0, v9, v11}, Ldp/d;->F(II[F)F

    move-result v0

    goto :goto_1b

    :cond_35
    add-int/lit8 v0, v12, -0x1

    invoke-static {v0, v9, v11}, Ldp/d;->F(II[F)F

    move-result v0

    :goto_1b
    iput v0, v3, Landroid/graphics/RectF;->right:F

    invoke-virtual {v6, v3, v4}, Lkk1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_36

    goto :goto_1c

    :cond_36
    invoke-interface {v5, v12}, Ln3/d;->f(I)I

    move-result v12

    const/4 v10, -0x1

    if-eq v12, v10, :cond_2e

    if-gt v12, v14, :cond_37

    goto :goto_17

    :cond_37
    invoke-interface {v5, v12}, Ln3/d;->c(I)I

    move-result v0

    if-ge v0, v14, :cond_33

    move v0, v14

    goto :goto_19

    :goto_1c
    move v14, v12

    :goto_1d
    if-ltz v14, :cond_38

    return v14

    :cond_38
    if-eq v1, v2, :cond_0

    add-int v1, v1, v17

    move/from16 v0, v17

    move-object/from16 v3, v18

    const/4 v10, 0x1

    goto/16 :goto_9

    :goto_1e
    return v10
.end method

.method public static final O(Lq83/j;Ljava/lang/Throwable;)V
    .locals 4

    sget-object v0, Lhc3/e;->a:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/CoroutineExceptionHandler;

    :try_start_0
    invoke-interface {v1, p0, p1}, Lkotlinx/coroutines/CoroutineExceptionHandler;->handleException(Lq83/j;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Lkotlinx/coroutines/internal/ExceptionSuccessfullyProcessed; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    if-ne p1, v1, :cond_0

    move-object v2, p1

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Exception while trying to handle coroutine exception"

    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v2, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    return-void

    :cond_1
    :try_start_1
    new-instance v0, Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;

    invoke-direct {v0, p0}, Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;-><init>(Lq83/j;)V

    invoke-static {p1, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, Loa3/m;->a:Loa3/m;

    const-string v4, "kotlinType"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "writeGenericType"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/squareup/wire/n;->R(Llb3/y;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    sget-object v3, Lo93/o;->a:Lu93/f0;

    invoke-static {v0}, Lcom/squareup/wire/n;->R(Llb3/y;)Z

    invoke-static {v0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object v6

    invoke-virtual {v0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v7

    invoke-static {v0}, Lcom/squareup/wire/n;->L(Llb3/y;)Llb3/y;

    move-result-object v8

    invoke-static {v0}, Lcom/squareup/wire/n;->E(Llb3/y;)Ljava/util/List;

    move-result-object v9

    invoke-static {v0}, Lcom/squareup/wire/n;->N(Llb3/y;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v3, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v4, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Llb3/u0;

    invoke-virtual {v10}, Llb3/u0;->b()Llb3/y;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v3, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Llb3/k0;->y:Llb3/k0;

    sget-object v10, Lo93/o;->a:Lu93/f0;

    invoke-virtual {v10}, Lu93/f0;->e()Llb3/q0;

    move-result-object v10

    invoke-static {v0}, Lcom/squareup/wire/n;->M(Llb3/y;)Llb3/y;

    move-result-object v11

    invoke-static {v11}, Lio/sentry/config/a;->n(Llb3/y;)Llb3/v0;

    move-result-object v11

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-static {v11, v3, v10, v5}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v3

    invoke-static {v3, v4}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v10

    invoke-static {v0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object v3

    invoke-virtual {v3}, Lo93/h;->p()Llb3/c0;

    move-result-object v11

    const-string v3, "getNullableAnyType(...)"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x0

    invoke-static/range {v6 .. v12}, Lcom/squareup/wire/n;->t(Lo93/h;Ls93/i;Llb3/y;Ljava/util/List;Ljava/util/ArrayList;Llb3/y;Z)Llb3/c0;

    move-result-object v3

    invoke-virtual {v0}, Llb3/y;->k0()Z

    move-result v0

    invoke-virtual {v3, v0}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v0

    invoke-static {v0, v1, v2}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {v0}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-static {v0}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v4}, Lmb3/g;->O(Lob3/f;)Llb3/c0;

    move-result-object v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v0}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_3
    invoke-static {v4}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object v4

    invoke-static {v4}, Lmb3/g;->z(Lob3/l;)Z

    move-result v6

    const-string v7, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    const-string v8, "["

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-nez v6, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v6, "$receiver"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v11, v4, Llb3/q0;

    const-string v12, ", "

    const-string v13, "ClassicTypeSystemContext couldn\'t handle: "

    if-eqz v11, :cond_23

    move-object v11, v4

    check-cast v11, Llb3/q0;

    invoke-interface {v11}, Llb3/q0;->d()Lr93/h;

    move-result-object v11

    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lr93/e;

    invoke-static {v11}, Lo93/h;->u(Lr93/e;)Lo93/j;

    move-result-object v11

    if-eqz v11, :cond_7

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    sget-object v4, Loa3/l;->h:Loa3/k;

    goto :goto_1

    :pswitch_1
    sget-object v4, Loa3/l;->g:Loa3/k;

    goto :goto_1

    :pswitch_2
    sget-object v4, Loa3/l;->f:Loa3/k;

    goto :goto_1

    :pswitch_3
    sget-object v4, Loa3/l;->e:Loa3/k;

    goto :goto_1

    :pswitch_4
    sget-object v4, Loa3/l;->d:Loa3/k;

    goto :goto_1

    :pswitch_5
    sget-object v4, Loa3/l;->c:Loa3/k;

    goto :goto_1

    :pswitch_6
    sget-object v4, Loa3/l;->b:Loa3/k;

    goto :goto_1

    :pswitch_7
    sget-object v4, Loa3/l;->a:Loa3/k;

    :goto_1
    invoke-static {v0}, Lmb3/g;->I(Lob3/g;)Z

    move-result v6

    if-nez v6, :cond_6

    sget-object v6, Lfa3/x;->p:Lva3/e;

    const-string v9, "ENHANCED_NULLABILITY_ANNOTATION"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6}, Lmb3/g;->v(Lob3/g;Lva3/e;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_2

    :cond_5
    move v6, v5

    goto :goto_3

    :cond_6
    :goto_2
    move v6, v10

    :goto_3
    invoke-static {v4, v6}, Lkotlin/jvm/internal/j;->v(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v9

    goto/16 :goto_6

    :cond_7
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v11, v4, Llb3/q0;

    if-eqz v11, :cond_22

    move-object v11, v4

    check-cast v11, Llb3/q0;

    invoke-interface {v11}, Llb3/q0;->d()Lr93/h;

    move-result-object v11

    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lr93/e;

    invoke-static {v11}, Lo93/h;->s(Lr93/h;)Lo93/j;

    move-result-object v11

    if-eqz v11, :cond_9

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v6, Ldb3/c;->N:Ljava/util/EnumMap;

    invoke-virtual {v6, v11}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ldb3/c;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Ldb3/c;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Loa3/m;->a(Ljava/lang/String;)Loa3/l;

    move-result-object v9

    goto/16 :goto_6

    :cond_8
    const/4 v0, 0x6

    invoke-static {v0}, Ldb3/c;->a(I)V

    throw v9

    :cond_9
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v11, v4, Llb3/q0;

    if-eqz v11, :cond_21

    move-object v11, v4

    check-cast v11, Llb3/q0;

    invoke-interface {v11}, Llb3/q0;->d()Lr93/h;

    move-result-object v11

    if-eqz v11, :cond_a

    invoke-static {v11}, Lo93/h;->J(Lr93/h;)Z

    move-result v11

    if-ne v11, v10, :cond_a

    move v11, v10

    goto :goto_4

    :cond_a
    move v11, v5

    :goto_4
    if-eqz v11, :cond_f

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v4, Llb3/q0;

    if-eqz v6, :cond_e

    check-cast v4, Llb3/q0;

    invoke-interface {v4}, Llb3/q0;->d()Lr93/h;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lr93/e;

    invoke-static {v4}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object v4

    sget-object v6, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v4}, Lq93/d;->g(Lva3/f;)Lva3/c;

    move-result-object v4

    if-eqz v4, :cond_f

    iget-boolean v6, v1, Loa3/t;->d:Z

    if-nez v6, :cond_d

    sget-object v6, Lq93/d;->o:Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    instance-of v11, v6, Ljava/util/Collection;

    if-eqz v11, :cond_b

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_b

    goto :goto_5

    :cond_b
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lq93/c;

    iget-object v11, v11, Lq93/c;->a:Lva3/c;

    invoke-virtual {v11, v4}, Lva3/c;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_6

    :cond_d
    :goto_5
    invoke-static {v4}, Ldb3/b;->e(Lva3/c;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Loa3/m;->b(Ljava/lang/String;)Loa3/j;

    move-result-object v9

    goto :goto_6

    :cond_e
    invoke-static {v13, v4, v12}, Lm4/a;->m(Ljava/lang/String;Lob3/l;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v2, v1, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    :goto_6
    if-eqz v9, :cond_10

    iget-boolean v3, v1, Loa3/t;->a:Z

    invoke-static {v9, v3}, Lkotlin/jvm/internal/j;->v(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v0, v3, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    :cond_10
    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v4

    instance-of v6, v4, Llb3/x;

    if-eqz v6, :cond_12

    check-cast v4, Llb3/x;

    iget-object v0, v4, Llb3/x;->w:Llb3/y;

    if-eqz v0, :cond_11

    invoke-static {v0}, Lio/sentry/config/a;->U(Llb3/y;)Llb3/f1;

    move-result-object v0

    invoke-static {v0, v1, v2}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_11
    iget-object v1, v4, Llb3/x;->x:Ljava/util/LinkedHashSet;

    const-string v0, "types"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/AssertionError;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v2, "There should be no intersection type in existing descriptors, but found: "

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x0

    const/16 v6, 0x3f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_12
    invoke-interface {v4}, Llb3/q0;->d()Lr93/h;

    move-result-object v4

    if-eqz v4, :cond_20

    invoke-static {v4}, Lnb3/l;->f(Lr93/k;)Z

    move-result v6

    if-eqz v6, :cond_13

    const-string v0, "error/NonExistentClass"

    invoke-static {v0}, Loa3/m;->b(Ljava/lang/String;)Loa3/j;

    move-result-object v0

    check-cast v4, Lr93/e;

    return-object v0

    :cond_13
    instance-of v6, v4, Lr93/e;

    if-eqz v6, :cond_19

    invoke-static {v0}, Lo93/h;->z(Llb3/y;)Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-virtual {v0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v10, :cond_18

    invoke-virtual {v0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/u0;

    invoke-virtual {v0}, Llb3/u0;->b()Llb3/y;

    move-result-object v3

    const-string v4, "getType(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v4

    sget-object v5, Llb3/g1;->z:Llb3/g1;

    if-ne v4, v5, :cond_14

    const-string v0, "java/lang/Object"

    invoke-static {v0}, Loa3/m;->b(Ljava/lang/String;)Loa3/j;

    move-result-object v0

    goto :goto_8

    :cond_14
    invoke-virtual {v0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v0

    const-string v4, "getProjectionKind(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_16

    if-eq v0, v10, :cond_15

    iget-object v0, v1, Loa3/t;->c:Loa3/t;

    if-nez v0, :cond_17

    goto :goto_7

    :cond_15
    iget-object v0, v1, Loa3/t;->e:Loa3/t;

    if-nez v0, :cond_17

    goto :goto_7

    :cond_16
    iget-object v0, v1, Loa3/t;->f:Loa3/t;

    if-nez v0, :cond_17

    :goto_7
    move-object v0, v1

    :cond_17
    invoke-static {v3, v0, v2}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v0

    :goto_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Loa3/l;

    invoke-static {v0}, Loa3/m;->c(Loa3/l;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Loa3/m;->a(Ljava/lang/String;)Loa3/l;

    move-result-object v0

    return-object v0

    :cond_18
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "arrays must have one type argument"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    if-eqz v6, :cond_1c

    invoke-static {v4}, Lya3/h;->b(Lr93/k;)Z

    move-result v5

    if-eqz v5, :cond_1a

    iget-boolean v5, v1, Loa3/t;->b:Z

    if-nez v5, :cond_1a

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0, v5}, Ldp/d;->s(Lob3/g;Ljava/util/HashSet;)Lob3/g;

    move-result-object v5

    check-cast v5, Llb3/y;

    if-eqz v5, :cond_1a

    new-instance v8, Loa3/t;

    iget-boolean v9, v1, Loa3/t;->a:Z

    iget-object v11, v1, Loa3/t;->c:Loa3/t;

    iget-boolean v12, v1, Loa3/t;->d:Z

    iget-object v13, v1, Loa3/t;->e:Loa3/t;

    iget-object v14, v1, Loa3/t;->f:Loa3/t;

    iget-boolean v15, v1, Loa3/t;->g:Z

    iget-boolean v0, v1, Loa3/t;->h:Z

    const/4 v10, 0x1

    move/from16 v16, v0

    invoke-direct/range {v8 .. v16}, Loa3/t;-><init>(ZZLoa3/t;ZLoa3/t;Loa3/t;ZZ)V

    invoke-static {v5, v8, v2}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1a
    check-cast v4, Lr93/e;

    invoke-interface {v4}, Lr93/e;->a()Lr93/e;

    move-result-object v5

    const-string v6, "getOriginal(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, Lr93/e;->getKind()Lr93/f;

    move-result-object v5

    sget-object v8, Lr93/f;->z:Lr93/f;

    if-ne v5, v8, :cond_1b

    invoke-interface {v4}, Lr93/k;->g()Lr93/k;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lr93/e;

    :cond_1b
    invoke-interface {v4}, Lr93/e;->a()Lr93/e;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v3}, Ldp/d;->t(Lr93/e;Loa3/m;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Loa3/m;->b(Ljava/lang/String;)Loa3/j;

    move-result-object v3

    invoke-interface {v2, v0, v3, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    :cond_1c
    instance-of v3, v4, Lr93/x0;

    if-eqz v3, :cond_1e

    check-cast v4, Lr93/x0;

    invoke-static {v4}, Lio/sentry/config/a;->E(Lr93/x0;)Llb3/y;

    move-result-object v2

    invoke-virtual {v0}, Llb3/y;->k0()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {v2}, Lio/sentry/config/a;->Q(Llb3/y;)Llb3/f1;

    move-result-object v2

    :cond_1d
    sget-object v0, Lub3/c;->w:Lub3/c;

    invoke-static {v2, v1, v0}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1e
    instance-of v3, v4, Lr93/w0;

    if-eqz v3, :cond_1f

    iget-boolean v3, v1, Loa3/t;->g:Z

    if-eqz v3, :cond_1f

    check-cast v4, Lr93/w0;

    check-cast v4, Ljb3/u;

    invoke-virtual {v4}, Ljb3/u;->K0()Llb3/c0;

    move-result-object v0

    invoke-static {v0, v1, v2}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1f
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_20
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no descriptor for type constructor of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_21
    invoke-static {v13, v4, v12}, Lm4/a;->m(Ljava/lang/String;Lob3/l;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v2, v1, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_22
    invoke-static {v13, v4, v12}, Lm4/a;->m(Ljava/lang/String;Lob3/l;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v2, v1, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_23
    invoke-static {v13, v4, v12}, Lm4/a;->m(Ljava/lang/String;Lob3/l;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v2, v1, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static Q(Landroid/widget/EdgeEffect;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_1
    return-void
.end method

.method public static R(Landroid/widget/EdgeEffect;FF)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Ld2/b;->n(Landroid/widget/EdgeEffect;FF)F

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroid/widget/EdgeEffect;->onPull(FF)V

    return p1
.end method

.method public static S(Landroid/widget/EdgeEffect;F)V
    .locals 1

    instance-of v0, p0, Lf0/k0;

    if-eqz v0, :cond_1

    check-cast p0, Lf0/k0;

    iget v0, p0, Lf0/k0;->b:F

    add-float/2addr v0, p1

    iput v0, p0, Lf0/k0;->b:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v0, p0, Lf0/k0;->a:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lf0/k0;->onRelease()V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->onRelease()V

    return-void
.end method

.method public static final T(Lmh/j;Lp1/q;I)Lcoil/compose/AsyncImagePainter;
    .locals 9

    const p2, -0x591033e3

    invoke-virtual {p1, p2}, Lp1/q;->f0(I)V

    sget-object p2, Lch/q;->a:Lp1/u2;

    invoke-static {p2, p1}, Lcom/squareup/wire/n;->F(Lp1/t1;Lp1/q;)Lbh/e;

    move-result-object v1

    const/16 v7, 0x48

    const/16 v8, 0x40

    sget-object v2, Lcoil/compose/AsyncImagePainter;->T:La11/g;

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->b:Ly2/b1;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lch/k;->a(Lmh/j;Lbh/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly2/k;Lqt/e;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v6, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static final U(Ljava/util/List;Ljg/q;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/s;->m1(Ljava/util/List;)Ljava/lang/Object;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static final V(Ljava/util/ArrayList;Llb3/y;)Llb3/y;
    .locals 7

    invoke-virtual {p1}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqb3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Lqb3/d;->c:Llb3/y;

    iget-object v4, v1, Lqb3/d;->b:Llb3/y;

    iget-object v1, v1, Lqb3/d;->a:Lr93/x0;

    sget-object v5, Lmb3/d;->a:Lmb3/l;

    invoke-virtual {v5, v4, v3}, Lmb3/l;->b(Llb3/y;Llb3/y;)Z

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-interface {v1}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v5

    sget-object v6, Llb3/g1;->z:Llb3/g1;

    if-ne v5, v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v4}, Lo93/h;->F(Llb3/y;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v5

    if-eq v5, v6, :cond_2

    new-instance v2, Llb3/v0;

    sget-object v4, Llb3/g1;->E:Llb3/g1;

    invoke-interface {v1}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v1

    if-ne v4, v1, :cond_1

    sget-object v4, Llb3/g1;->y:Llb3/g1;

    :cond_1
    invoke-direct {v2, v3, v4}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    goto :goto_2

    :cond_2
    if-eqz v3, :cond_6

    invoke-static {v3}, Lo93/h;->y(Llb3/y;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v3}, Llb3/y;->k0()Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Llb3/v0;

    invoke-interface {v1}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v1

    if-ne v6, v1, :cond_3

    sget-object v6, Llb3/g1;->y:Llb3/g1;

    :cond_3
    invoke-direct {v2, v4, v6}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    goto :goto_2

    :cond_4
    new-instance v2, Llb3/v0;

    sget-object v4, Llb3/g1;->E:Llb3/g1;

    invoke-interface {v1}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v1

    if-ne v4, v1, :cond_5

    sget-object v4, Llb3/g1;->y:Llb3/g1;

    :cond_5
    invoke-direct {v2, v3, v4}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    goto :goto_2

    :cond_6
    const/16 p0, 0x8c

    invoke-static {p0}, Lo93/h;->a(I)V

    throw v2

    :cond_7
    :goto_1
    new-instance v2, Llb3/v0;

    invoke-direct {v2, v4}, Llb3/v0;-><init>(Llb3/y;)V

    :goto_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    const/4 p0, 0x6

    invoke-static {p1, v0, v2, p0}, Lse/a;->W(Llb3/y;Ljava/util/List;Ls93/i;I)Llb3/y;

    move-result-object p0

    return-object p0
.end method

.method public static final W(La3/n;)Landroid/view/View;
    .locals 1

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot get View because the Modifier node is not currently attached."

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    invoke-static {p0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    return-object p0
.end method

.method public static final X(Lob3/g;Lob3/g;)Lob3/g;
    .locals 3

    invoke-static {p0}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lmb3/g;->O(Lob3/f;)Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {p0}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    invoke-static {v0}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object v0

    invoke-static {v0}, Lmb3/g;->s(Lob3/l;)Lr93/x0;

    move-result-object v0

    sget-object v1, Lmb3/m;->w:Lmb3/m;

    if-eqz v0, :cond_3

    invoke-static {p0}, Lmb3/g;->I(Lob3/g;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {v1, p1}, Lmb3/m;->o0(Lob3/g;)Lob3/g;

    move-result-object p0

    return-object p0

    :cond_2
    return-object p1

    :cond_3
    invoke-static {p0}, Lmb3/g;->n(Lob3/g;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lob3/k;

    invoke-static {p0}, Lmb3/g;->t(Lob3/k;)Lob3/p;

    move-result-object v0

    sget-object v2, Llb3/q;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    invoke-static {v1, p0}, Lmb3/g;->r(Lmb3/b;Lob3/k;)Llb3/f1;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p0, p1}, Ldp/d;->X(Lob3/g;Lob3/g;)Lob3/g;

    move-result-object p0

    const-string p1, "componentType"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p0, Llb3/y;

    if-eqz p0, :cond_4

    invoke-interface {v1}, Lmb3/b;->c()Lo93/h;

    const/4 p0, 0x0

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "ClassicTypeSystemContext couldn\'t handle: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v0, p1, p0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {v1}, Lmb3/m;->c()Lo93/h;

    const/4 p0, 0x0

    throw p0
.end method

.method public static final Y(La7/e;)Lr6/p;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    instance-of p0, p0, La7/b;

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_0
    sget-object v0, Lp6/c1;->a:Ljava/lang/Object;

    instance-of v0, p0, La7/a;

    if-eqz v0, :cond_1

    sget-object p0, Lr6/p;->x:Lr6/p;

    return-object p0

    :cond_1
    instance-of v0, p0, La7/d;

    if-eqz v0, :cond_3

    :cond_2
    sget-object p0, Lr6/p;->y:Lr6/p;

    return-object p0

    :cond_3
    instance-of v0, p0, La7/c;

    if-eqz v0, :cond_4

    sget-object p0, Lr6/p;->z:Lr6/p;

    return-object p0

    :cond_4
    instance-of p0, p0, La7/b;

    if-eqz p0, :cond_5

    :goto_0
    sget-object p0, Lr6/p;->E:Lr6/p;

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "After resolution, no other type should be present"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final Z(I)Lr6/y;
    .locals 3

    if-nez p0, :cond_0

    sget-object p0, Lr6/y;->x:Lr6/y;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    sget-object p0, Lr6/y;->y:Lr6/y;

    return-object p0

    :cond_1
    const/4 v0, 0x2

    if-ne p0, v0, :cond_2

    sget-object p0, Lr6/y;->z:Lr6/y;

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown vertical alignment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lv6/b;->b(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final a(Lx1/b;Lx1/b;Landroidx/compose/ui/Modifier;Lf0/r1;Landroidx/compose/runtime/Composer;II)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x7df0322d

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, v5, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_9

    and-int/lit8 v7, p6, 0x8

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_5

    :cond_7
    move-object/from16 v7, p3

    :cond_8
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    goto :goto_6

    :cond_9
    move-object/from16 v7, p3

    :goto_6
    and-int/lit16 v8, v0, 0x493

    const/16 v10, 0x492

    if-ne v8, v10, :cond_b

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v6

    move-object v4, v7

    goto/16 :goto_10

    :cond_b
    :goto_7
    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v8, v5, 0x1

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v8, :cond_e

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_d

    and-int/lit16 v0, v0, -0x1c01

    :cond_d
    move/from16 v18, v0

    move-object v0, v6

    move-object v3, v7

    goto :goto_9

    :cond_e
    :goto_8
    if-eqz v3, :cond_f

    move-object v6, v12

    :cond_f
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_d

    invoke-static {v13, v9, v14}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v3

    and-int/lit16 v0, v0, -0x1c01

    move/from16 v18, v0

    move-object v0, v6

    :goto_9
    invoke-virtual {v9}, Lp1/q;->r()V

    const v6, 0x17c12c29

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_10

    new-instance v6, Lnr0/e;

    const/16 v7, 0x15

    invoke-direct {v6, v3, v7}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-static {v6}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v6, Lp1/t2;

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/f;

    iget v6, v6, Ly3/f;->w:F

    const/16 v10, 0x180

    const/16 v11, 0xa

    const/4 v7, 0x0

    const-string v8, "PaymentSheetTopBarElevation"

    invoke-static/range {v6 .. v11}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v9, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p2, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_11

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v9, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v19, v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_b

    :cond_12
    move-object/from16 v19, v0

    :goto_b
    invoke-static {v13, v9, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/f;

    iget v13, v4, Ly3/f;->w:F

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v12}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v4, Lb30/l4;

    const/16 v15, 0x10

    invoke-direct {v4, v1, v15}, Lb30/l4;-><init>(Lx1/b;I)V

    const v15, 0x2f26d761

    invoke-static {v15, v9, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const v16, 0x180006

    const/16 v17, 0x1e

    move-object v15, v7

    const/4 v7, 0x0

    move-object/from16 v20, v8

    move-object/from16 v21, v15

    move-object v15, v9

    const-wide/16 v8, 0x0

    move-object/from16 v23, v10

    move-object/from16 v22, v11

    const-wide/16 v10, 0x0

    move-object/from16 v24, v12

    const/4 v12, 0x0

    move-object/from16 v25, v14

    move-object/from16 v1, v20

    move-object/from16 v5, v21

    move-object/from16 v2, v22

    move-object v14, v4

    move-object/from16 v4, p2

    move-object/from16 p2, v0

    const/4 v0, 0x0

    invoke-static/range {v6 .. v17}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v15

    invoke-static/range {v24 .. v24}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v7, 0xe

    invoke-static {v6, v3, v7}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v4, v1, v9, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_14

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_14
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v9, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v23

    invoke-static {v9, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    :cond_15
    move-object/from16 v0, v25

    goto :goto_e

    :cond_16
    :goto_d
    move-object/from16 v0, p2

    goto :goto_f

    :goto_e
    invoke-static {v1, v9, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v9, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Ld40/p;->f:Ld40/g;

    iget v0, v0, Ld40/g;->b:F

    move-object/from16 v1, v24

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v0, v18, 0x3

    and-int/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v2, p1

    invoke-virtual {v2, v9, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v9}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v0

    iget-object v0, v0, Ll0/c2;->e:Ll0/b;

    new-instance v1, Ll0/e0;

    invoke-direct {v1, v0}, Ll0/e0;-><init>(Ll0/b;)V

    invoke-static {v9, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v11, 0x1

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    move-object v4, v3

    move-object/from16 v3, v19

    :goto_10
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, Lo72/a;

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lo72/a;-><init>(Lx1/b;Lx1/b;Landroidx/compose/ui/Modifier;Lf0/r1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final a0(I)Lr6/q;
    .locals 3

    if-nez p0, :cond_0

    sget-object p0, Lr6/q;->x:Lr6/q;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    sget-object p0, Lr6/q;->y:Lr6/q;

    return-object p0

    :cond_1
    const/4 v0, 0x2

    if-ne p0, v0, :cond_2

    sget-object p0, Lr6/q;->z:Lr6/q;

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown horizontal alignment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lv6/a;->b(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, 0x16d6fe21

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v2, p1, 0x3

    if-ne v2, v0, :cond_2

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_3

    :cond_2
    :goto_1
    const v0, 0x7f0807e3

    const/4 v2, 0x0

    invoke-static {v0, v5, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    sget-wide v3, Li2/x;->d:J

    const/16 v6, 0x18

    int-to-float v6, v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v7, -0x7f487cff

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    and-int/lit8 p1, p1, 0xe

    if-ne p1, v1, :cond_3

    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    move p1, v2

    :goto_2
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_4

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v1, p1, :cond_5

    :cond_4
    new-instance v1, Lb30/y4;

    const/16 p1, 0xb

    invoke-direct {v1, p0, p1}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    invoke-static {v6, v2, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0xc30

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lb30/z;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lb30/z;-><init>(Ljava/lang/String;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b0(Ljava/util/List;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lg40/z1;ZLandroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x5ea2cee6

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v4, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p2, v0

    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lp1/q;->X()V

    move v1, p1

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v0, p0, Lg40/z1;->j:Lg40/r0;

    const-wide v1, 0x4027666666666666L    # 11.7

    double-to-float v6, v1

    const/16 v1, 0x8

    int-to-float v8, v1

    const/4 v9, 0x0

    const/16 v10, 0xa

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 p2, p2, 0x70

    or-int/lit16 v5, p2, 0x180

    const/4 v3, 0x0

    move v1, p1

    invoke-static/range {v0 .. v5}, Lg40/y0;->a(Lg40/r0;ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance p2, Lb30/t2;

    const/4 v0, 0x4

    invoke-direct {p2, p0, v1, p3, v0}, Lb30/t2;-><init>(Ljava/lang/Object;ZII)V

    iput-object p2, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final d(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;IFLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;Landroidx/compose/runtime/Composer;III)V
    .locals 33

    move-object/from16 v1, p0

    move/from16 v0, p14

    move/from16 v2, p15

    move/from16 v3, p16

    move-object/from16 v15, p13

    check-cast v15, Lp1/q;

    const v4, 0x6eeaae29

    invoke-virtual {v15, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v7, v3, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    :cond_2
    move-object/from16 v10, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v0, 0x30

    if-nez v10, :cond_2

    move-object/from16 v10, p1

    invoke-virtual {v15, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x20

    goto :goto_2

    :cond_4
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v4, v11

    :goto_3
    and-int/lit8 v11, v3, 0x4

    if-eqz v11, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v14, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v14, v0, 0x180

    if-nez v14, :cond_5

    move-object/from16 v14, p2

    invoke-virtual {v15, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v4, v4, v16

    :goto_5
    and-int/lit8 v16, v3, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_9

    or-int/lit16 v4, v4, 0xc00

    :cond_8
    move-object/from16 v5, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v0, 0xc00

    if-nez v5, :cond_8

    move-object/from16 v5, p3

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v19, v18

    goto :goto_6

    :cond_a
    move/from16 v19, v17

    :goto_6
    or-int v4, v4, v19

    :goto_7
    and-int/lit8 v19, v3, 0x10

    const/16 v20, 0x4000

    const/16 v21, 0x2000

    if-eqz v19, :cond_c

    or-int/lit16 v4, v4, 0x6000

    :cond_b
    move/from16 v6, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v6, v0, 0x6000

    if-nez v6, :cond_b

    move/from16 v6, p4

    invoke-virtual {v15, v6}, Lp1/q;->e(I)Z

    move-result v23

    if-eqz v23, :cond_d

    move/from16 v23, v20

    goto :goto_8

    :cond_d
    move/from16 v23, v21

    :goto_8
    or-int v4, v4, v23

    :goto_9
    and-int/lit8 v23, v3, 0x20

    const/high16 v24, 0x30000

    if-eqz v23, :cond_e

    or-int v4, v4, v24

    move/from16 v8, p5

    goto :goto_b

    :cond_e
    and-int v25, v0, v24

    move/from16 v8, p5

    if-nez v25, :cond_10

    invoke-virtual {v15, v8}, Lp1/q;->d(F)Z

    move-result v26

    if-eqz v26, :cond_f

    const/high16 v26, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v26, 0x10000

    :goto_a
    or-int v4, v4, v26

    :cond_10
    :goto_b
    and-int/lit8 v26, v3, 0x40

    const/high16 v27, 0x180000

    if-eqz v26, :cond_11

    or-int v4, v4, v27

    move-object/from16 v9, p6

    goto :goto_d

    :cond_11
    and-int v27, v0, v27

    move-object/from16 v9, p6

    if-nez v27, :cond_13

    invoke-virtual {v15, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_12

    const/high16 v28, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v28, 0x80000

    :goto_c
    or-int v4, v4, v28

    :cond_13
    :goto_d
    const/high16 v28, 0xc00000

    and-int v28, v0, v28

    if-nez v28, :cond_16

    and-int/lit16 v12, v3, 0x80

    if-nez v12, :cond_14

    move-object/from16 v12, p7

    invoke-virtual {v15, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_15

    const/high16 v29, 0x800000

    goto :goto_e

    :cond_14
    move-object/from16 v12, p7

    :cond_15
    const/high16 v29, 0x400000

    :goto_e
    or-int v4, v4, v29

    goto :goto_f

    :cond_16
    move-object/from16 v12, p7

    :goto_f
    and-int/lit16 v13, v3, 0x100

    const/high16 v30, 0x6000000

    if-eqz v13, :cond_17

    or-int v4, v4, v30

    move/from16 v0, p8

    goto :goto_11

    :cond_17
    and-int v30, v0, v30

    move/from16 v0, p8

    if-nez v30, :cond_19

    invoke-virtual {v15, v0}, Lp1/q;->h(Z)Z

    move-result v30

    if-eqz v30, :cond_18

    const/high16 v30, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v30, 0x2000000

    :goto_10
    or-int v4, v4, v30

    :cond_19
    :goto_11
    and-int/lit16 v0, v3, 0x200

    move/from16 v30, v0

    const/4 v0, 0x0

    const/high16 v31, 0x30000000

    if-eqz v30, :cond_1a

    or-int v4, v4, v31

    goto :goto_13

    :cond_1a
    and-int v30, p14, v31

    if-nez v30, :cond_1c

    invoke-virtual {v15, v0}, Lp1/q;->h(Z)Z

    move-result v30

    if-eqz v30, :cond_1b

    const/high16 v30, 0x20000000

    goto :goto_12

    :cond_1b
    const/high16 v30, 0x10000000

    :goto_12
    or-int v4, v4, v30

    :cond_1c
    :goto_13
    and-int/lit16 v0, v3, 0x400

    move/from16 v31, v0

    const/4 v0, 0x0

    if-eqz v31, :cond_1d

    or-int/lit8 v22, v2, 0x6

    goto :goto_15

    :cond_1d
    and-int/lit8 v31, v2, 0x6

    if-nez v31, :cond_1f

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_1e

    const/16 v22, 0x4

    goto :goto_14

    :cond_1e
    const/16 v22, 0x2

    :goto_14
    or-int v22, v2, v22

    goto :goto_15

    :cond_1f
    move/from16 v22, v2

    :goto_15
    and-int/lit8 v31, v2, 0x30

    if-nez v31, :cond_22

    and-int/lit16 v0, v3, 0x800

    if-nez v0, :cond_20

    move-object/from16 v0, p9

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_21

    const/16 v25, 0x20

    goto :goto_16

    :cond_20
    move-object/from16 v0, p9

    :cond_21
    const/16 v25, 0x10

    :goto_16
    or-int v22, v22, v25

    :goto_17
    move/from16 v0, v22

    goto :goto_18

    :cond_22
    move-object/from16 v0, p9

    goto :goto_17

    :goto_18
    move/from16 v22, v4

    and-int/lit16 v4, v3, 0x1000

    if-eqz v4, :cond_24

    or-int/lit16 v0, v0, 0x180

    move/from16 v25, v0

    :cond_23
    move-object/from16 v0, p10

    goto :goto_1a

    :cond_24
    move/from16 v25, v0

    and-int/lit16 v0, v2, 0x180

    if-nez v0, :cond_23

    move-object/from16 v0, p10

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_25

    const/16 v28, 0x100

    goto :goto_19

    :cond_25
    const/16 v28, 0x80

    :goto_19
    or-int v25, v25, v28

    :goto_1a
    and-int/lit16 v0, v2, 0xc00

    if-nez v0, :cond_28

    and-int/lit16 v0, v3, 0x2000

    if-nez v0, :cond_26

    move-object/from16 v0, p11

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_27

    move/from16 v17, v18

    goto :goto_1b

    :cond_26
    move-object/from16 v0, p11

    :cond_27
    :goto_1b
    or-int v25, v25, v17

    goto :goto_1c

    :cond_28
    move-object/from16 v0, p11

    :goto_1c
    and-int/lit16 v0, v2, 0x6000

    if-nez v0, :cond_2a

    move-object/from16 v0, p12

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_29

    goto :goto_1d

    :cond_29
    move/from16 v20, v21

    :goto_1d
    or-int v25, v25, v20

    :goto_1e
    move/from16 v0, v25

    goto :goto_1f

    :cond_2a
    move-object/from16 v0, p12

    goto :goto_1e

    :goto_1f
    const v17, 0x12492493

    and-int v2, v22, v17

    move/from16 v17, v4

    const v4, 0x12492492

    const/16 v18, 0x1

    if-ne v2, v4, :cond_2c

    and-int/lit16 v2, v0, 0x2493

    const/16 v4, 0x2492

    if-eq v2, v4, :cond_2b

    goto :goto_20

    :cond_2b
    const/4 v2, 0x0

    goto :goto_21

    :cond_2c
    :goto_20
    move/from16 v2, v18

    :goto_21
    and-int/lit8 v4, v22, 0x1

    invoke-virtual {v15, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3d

    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v2, p14, 0x1

    const v4, -0x1c00001

    if-eqz v2, :cond_31

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_2d

    goto :goto_23

    :cond_2d
    invoke-virtual {v15}, Lp1/q;->X()V

    and-int/lit16 v2, v3, 0x80

    if-eqz v2, :cond_2e

    and-int v4, v22, v4

    goto :goto_22

    :cond_2e
    move/from16 v4, v22

    :goto_22
    and-int/lit16 v2, v3, 0x800

    if-eqz v2, :cond_2f

    and-int/lit8 v0, v0, -0x71

    :cond_2f
    and-int/lit16 v2, v3, 0x2000

    if-eqz v2, :cond_30

    and-int/lit16 v0, v0, -0x1c01

    :cond_30
    move-object/from16 v13, p10

    move v11, v0

    move v7, v6

    move-object v0, v10

    move-object v2, v14

    move-object/from16 v10, p9

    move-object/from16 v6, p11

    move v14, v4

    move-object v4, v12

    move-object v12, v9

    move-object v9, v5

    move/from16 v5, p8

    goto/16 :goto_2a

    :cond_31
    :goto_23
    if-eqz v7, :cond_32

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_24

    :cond_32
    move-object v2, v10

    :goto_24
    if-eqz v11, :cond_33

    const/4 v7, 0x0

    int-to-float v10, v7

    new-instance v7, Ll0/l1;

    invoke-direct {v7, v10, v10, v10, v10}, Ll0/l1;-><init>(FFFF)V

    goto :goto_25

    :cond_33
    move-object v7, v14

    :goto_25
    if-eqz v16, :cond_34

    sget-object v5, Lq0/e;->a:Lq0/e;

    :cond_34
    if-eqz v19, :cond_35

    const/4 v6, 0x0

    :cond_35
    if-eqz v23, :cond_36

    const/4 v10, 0x0

    int-to-float v8, v10

    :cond_36
    if-eqz v26, :cond_37

    sget-object v9, Lb2/e;->K:Lb2/l;

    :cond_37
    and-int/lit16 v10, v3, 0x80

    if-eqz v10, :cond_38

    and-int/lit8 v10, v22, 0xe

    or-int v10, v10, v24

    const/16 v11, 0x1e

    const/4 v12, 0x0

    invoke-static {v1, v12, v15, v10, v11}, Ldc/a;->x(Lq0/y;Lq0/t;Landroidx/compose/runtime/Composer;II)Lh0/p3;

    move-result-object v10

    and-int v4, v22, v4

    goto :goto_26

    :cond_38
    move-object v10, v12

    move/from16 v4, v22

    :goto_26
    if-eqz v13, :cond_39

    goto :goto_27

    :cond_39
    move/from16 v18, p8

    :goto_27
    and-int/lit16 v11, v3, 0x800

    if-eqz v11, :cond_3a

    sget-object v11, Lh0/d2;->x:Lh0/d2;

    and-int/lit8 v12, v4, 0xe

    or-int/lit16 v12, v12, 0x1b0

    invoke-static {v1, v11, v15, v12}, Ldc/a;->L(Lq0/y;Lh0/d2;Landroidx/compose/runtime/Composer;I)Lq0/a;

    move-result-object v11

    and-int/lit8 v0, v0, -0x71

    goto :goto_28

    :cond_3a
    move-object/from16 v11, p9

    :goto_28
    if-eqz v17, :cond_3b

    sget-object v12, Li0/m;->c:Li0/m;

    goto :goto_29

    :cond_3b
    move-object/from16 v12, p10

    :goto_29
    and-int/lit16 v13, v3, 0x2000

    if-eqz v13, :cond_3c

    invoke-static {v15}, Lf0/g1;->a(Landroidx/compose/runtime/Composer;)Lf0/k;

    move-result-object v13

    and-int/lit16 v0, v0, -0x1c01

    move v14, v4

    move-object v4, v10

    move-object v10, v11

    move v11, v0

    move-object v0, v2

    move-object v2, v7

    move v7, v6

    move-object v6, v13

    move-object v13, v12

    move-object v12, v9

    move-object v9, v5

    move/from16 v5, v18

    goto :goto_2a

    :cond_3c
    move v14, v4

    move-object v4, v10

    move-object v10, v11

    move-object v13, v12

    move v11, v0

    move-object v0, v2

    move-object v2, v7

    move-object v12, v9

    move-object v9, v5

    move v7, v6

    move/from16 v5, v18

    move-object/from16 v6, p11

    :goto_2a
    invoke-virtual {v15}, Lp1/q;->r()V

    sget-object v3, Lh0/d2;->x:Lh0/d2;

    move/from16 v16, v11

    sget-object v11, Lb2/e;->N:Lb2/k;

    shr-int/lit8 v17, v14, 0x3

    move-object/from16 p1, v0

    and-int/lit8 v0, v17, 0xe

    or-int/lit16 v0, v0, 0x6000

    shl-int/lit8 v17, v14, 0x3

    and-int/lit8 v17, v17, 0x70

    or-int v0, v0, v17

    move/from16 p2, v0

    and-int/lit16 v0, v14, 0x380

    or-int v0, p2, v0

    move/from16 p2, v0

    shr-int/lit8 v0, v14, 0x12

    and-int/lit16 v0, v0, 0x1c00

    or-int v0, p2, v0

    shr-int/lit8 v17, v14, 0x6

    const/high16 v18, 0x70000

    and-int v19, v17, v18

    or-int v0, v0, v19

    const/high16 v19, 0x380000

    and-int v20, v17, v19

    or-int v0, v0, v20

    shl-int/lit8 v20, v16, 0xc

    const/high16 v21, 0x1c00000

    and-int v20, v20, v21

    or-int v0, v0, v20

    shl-int/lit8 v20, v14, 0xc

    const/high16 v21, 0xe000000

    and-int v21, v20, v21

    or-int v0, v0, v21

    const/high16 v21, 0x70000000

    and-int v20, v20, v21

    or-int v0, v0, v20

    shr-int/lit8 v14, v14, 0x9

    and-int/lit8 v14, v14, 0xe

    or-int/lit16 v14, v14, 0xc00

    and-int/lit8 v20, v16, 0x70

    or-int v14, v14, v20

    move/from16 p2, v0

    shl-int/lit8 v0, v16, 0x6

    and-int/lit16 v1, v0, 0x380

    or-int/2addr v1, v14

    const v14, 0xe000

    and-int v14, v17, v14

    or-int/2addr v1, v14

    shl-int/lit8 v14, v16, 0x9

    and-int v14, v14, v18

    or-int/2addr v1, v14

    and-int v0, v0, v19

    or-int v17, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v16, p2

    move-object/from16 v14, p12

    invoke-static/range {v0 .. v17}, Lcom/squareup/wire/n;->c(Landroidx/compose/ui/Modifier;Lq0/y;Ll0/k1;Lh0/d2;Lh0/p3;ZLf0/k;IFLq0/e;Lt2/a;Lb2/f;Lb2/g;Li0/n;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move v3, v8

    move-object v8, v4

    move-object v4, v9

    move v9, v5

    move v5, v7

    move-object v7, v12

    move-object v12, v6

    move v6, v3

    move-object v3, v2

    move-object v11, v13

    move-object v2, v0

    goto :goto_2b

    :cond_3d
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v11, p10

    move-object v4, v5

    move v5, v6

    move v6, v8

    move-object v7, v9

    move-object v2, v10

    move-object v8, v12

    move-object v3, v14

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    :goto_2b
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_3e

    move-object v1, v0

    new-instance v0, Lq0/j;

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v32, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lq0/j;-><init>(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;IFLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;III)V

    move-object/from16 v1, v32

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_3e
    return-void
.end method

.method public static declared-synchronized d0()Ljava/lang/ClassLoader;
    .locals 13

    const-class v0, Ldp/d;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ldp/d;->a:Ljava/lang/ClassLoader;

    if-nez v1, :cond_8

    const-string v1, "Failed to get thread context classloader "

    sget-object v2, Ldp/d;->b:Ljava/lang/Thread;

    const/4 v3, 0x0

    if-nez v2, :cond_7

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getThreadGroup()Ljava/lang/ThreadGroup;

    move-result-object v2

    const-string v4, "Failed to enumerate thread/threadgroup "

    if-nez v2, :cond_0

    move-object v2, v3

    goto/16 :goto_8

    :cond_0
    const-class v5, Ljava/lang/Void;

    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v2}, Ljava/lang/ThreadGroup;->activeGroupCount()I

    move-result v6

    new-array v7, v6, [Ljava/lang/ThreadGroup;

    invoke-virtual {v2, v7}, Ljava/lang/ThreadGroup;->enumerate([Ljava/lang/ThreadGroup;)I

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    if-ge v9, v6, :cond_2

    aget-object v10, v7, v9

    const-string v11, "dynamiteLoader"

    invoke-virtual {v10}, Ljava/lang/ThreadGroup;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_9

    :catch_0
    move-exception v2

    goto :goto_5

    :cond_2
    move-object v10, v3

    :goto_1
    if-nez v10, :cond_3

    new-instance v10, Ljava/lang/ThreadGroup;

    const-string v6, "dynamiteLoader"

    invoke-direct {v10, v2, v6}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v10}, Ljava/lang/ThreadGroup;->activeCount()I

    move-result v2

    new-array v6, v2, [Ljava/lang/Thread;

    invoke-virtual {v10, v6}, Ljava/lang/ThreadGroup;->enumerate([Ljava/lang/Thread;)I

    :goto_2
    if-ge v8, v2, :cond_5

    aget-object v7, v6, v8

    const-string v9, "GmsDynamite"

    invoke-virtual {v7}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v9, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_5
    move-object v7, v3

    :goto_3
    if-nez v7, :cond_6

    :try_start_2
    new-instance v2, Ldp/c;

    const-string v6, "GmsDynamite"

    invoke-direct {v2, v10, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v7, v2

    goto :goto_7

    :catch_1
    move-exception v6

    move-object v7, v2

    goto :goto_6

    :goto_4
    move-object v6, v2

    goto :goto_6

    :catch_2
    move-exception v2

    goto :goto_4

    :goto_5
    move-object v6, v2

    move-object v7, v3

    :goto_6
    :try_start_4
    const-string v2, "DynamiteLoaderV2CL"

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, 0x27

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    :goto_7
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v2, v7

    :goto_8
    :try_start_5
    sput-object v2, Ldp/d;->b:Ljava/lang/Thread;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-nez v2, :cond_7

    goto :goto_b

    :catchall_1
    move-exception v1

    goto :goto_e

    :goto_9
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v1

    :cond_7
    monitor-enter v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    sget-object v4, Ldp/d;->b:Ljava/lang/Thread;

    invoke-virtual {v4}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_a

    :catchall_2
    move-exception v1

    goto :goto_c

    :catch_3
    move-exception v4

    :try_start_9
    const-string v5, "DynamiteLoaderV2CL"

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x29

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_a
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :goto_b
    :try_start_a
    sput-object v3, Ldp/d;->a:Ljava/lang/ClassLoader;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_d

    :goto_c
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :try_start_c
    throw v1

    :cond_8
    :goto_d
    sget-object v1, Ldp/d;->a:Ljava/lang/ClassLoader;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    monitor-exit v0

    return-object v1

    :goto_e
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    throw v1
.end method

.method public static final e(Lq0/b;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;FLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v13, p11

    check-cast v13, Lp1/q;

    const v1, 0x455eb26f

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p12, v1

    move-object/from16 v2, p1

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v1, v3

    const v3, 0x365b6d80

    or-int/2addr v1, v3

    const v3, 0x12492493

    and-int/2addr v3, v1

    const v4, 0x12492492

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v3, v4, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {v13, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v3, p12, 0x1

    const v4, -0x1c00001

    if-eqz v3, :cond_4

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/2addr v1, v4

    move-object/from16 v7, p2

    move-object/from16 v3, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move v4, v1

    move/from16 v1, p7

    goto :goto_4

    :cond_4
    :goto_3
    int-to-float v3, v5

    new-instance v7, Ll0/l1;

    invoke-direct {v7, v3, v3, v3, v3}, Ll0/l1;-><init>(FFFF)V

    int-to-float v3, v5

    sget-object v5, Lb2/e;->K:Lb2/l;

    and-int/lit8 v8, v1, 0xe

    const/high16 v9, 0x30000

    or-int/2addr v8, v9

    const/16 v9, 0x1e

    const/4 v10, 0x0

    invoke-static {v0, v10, v13, v8, v9}, Ldc/a;->x(Lq0/y;Lq0/t;Landroidx/compose/runtime/Composer;II)Lh0/p3;

    move-result-object v8

    and-int/2addr v4, v1

    sget-object v9, Lh0/d2;->x:Lh0/d2;

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x1b0

    invoke-static {v0, v9, v13, v1}, Ldc/a;->L(Lq0/y;Lh0/d2;Landroidx/compose/runtime/Composer;I)Lq0/a;

    move-result-object v1

    sget-object v9, Li0/m;->c:Li0/m;

    sget-object v10, Lq0/e;->a:Lq0/e;

    move-object/from16 v17, v9

    move-object v9, v1

    move v1, v6

    move-object v6, v5

    move v5, v3

    move-object v3, v10

    move-object/from16 v10, v17

    :goto_4
    invoke-virtual {v13}, Lp1/q;->r()V

    invoke-static {v13}, Lf0/g1;->a(Landroidx/compose/runtime/Composer;)Lf0/k;

    move-result-object v11

    const v12, 0x7ffffffe

    and-int v14, v4, v12

    const/16 v15, 0x6186

    const/16 v16, 0x0

    const/4 v4, 0x0

    move-object v12, v8

    move v8, v1

    move-object v1, v2

    move-object v2, v7

    move-object v7, v12

    move-object/from16 v12, p10

    invoke-static/range {v0 .. v16}, Ldp/d;->d(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;IFLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    move-object v4, v3

    move-object v3, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    :goto_5
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_6

    new-instance v0, Lq0/k;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v11, p10

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lq0/k;-><init>(Lq0/b;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;FLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lx1/b;I)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final f(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;ILandroidx/compose/runtime/Composer;I)V
    .locals 14

    const-string v0, "phoneNumberController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p8

    check-cast v8, Lp1/q;

    const v0, -0x4ab764cd

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p9, v0

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    move-object/from16 v3, p2

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    or-int/lit16 v0, v0, 0xc00

    move/from16 v9, p4

    invoke-virtual {v8, v9}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x4000

    goto :goto_3

    :cond_3
    const/16 v1, 0x2000

    :goto_3
    or-int/2addr v0, v1

    const/high16 v1, 0x30000

    or-int/2addr v0, v1

    move/from16 v6, p5

    invoke-virtual {v8, v6}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_4

    const/high16 v1, 0x100000

    goto :goto_4

    :cond_4
    const/high16 v1, 0x80000

    :goto_4
    or-int/2addr v0, v1

    const/high16 v1, 0x6c00000

    or-int/2addr v0, v1

    move/from16 v7, p7

    invoke-virtual {v8, v7}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_5

    const/high16 v1, 0x20000000

    goto :goto_5

    :cond_5
    const/high16 v1, 0x10000000

    :goto_5
    or-int v10, v0, v1

    const v0, 0x12492493

    and-int/2addr v0, v10

    const v1, 0x12492492

    if-ne v0, v1, :cond_7

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object v6, v8

    goto :goto_7

    :cond_7
    :goto_6
    new-instance v0, Lg40/c2;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p0}, Lg40/c2;-><init>(ILg40/z1;Z)V

    const v1, 0x6a3ec92e

    invoke-static {v1, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const v0, 0x77c0935c

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_8

    invoke-static {v8}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v0

    :cond_8
    check-cast v0, Lg2/s;

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    iget-object v5, p1, Lg40/z1;->n:Ln53/e;

    invoke-static {v5, v8, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v11, 0x8

    int-to-float v11, v11

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x1

    invoke-static {v12, v5, v11, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lg40/h1;

    move-object v6, v0

    new-instance v0, Lg40/d2;

    move v1, p0

    move-object v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v7}, Lg40/d2;-><init>(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZLg2/s;I)V

    move-object v1, v0

    move-object v0, v4

    move-object v13, v6

    const v2, -0xec66a17

    invoke-static {v2, v8, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    shr-int/lit8 v1, v10, 0x3

    and-int/lit16 v1, v1, 0x1c00

    or-int/lit16 v7, v1, 0x6180

    move-object v6, v8

    const/4 v8, 0x0

    const/4 v1, 0x0

    move v4, v9

    move-object v3, v11

    move-object v2, v12

    invoke-static/range {v1 .. v8}, Lse/a;->o(Lzy/c;Lg40/h1;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v0

    move-object v7, v13

    :goto_7
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_9

    new-instance v0, Lb30/r4;

    move v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lb30/r4;-><init>(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final g(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;Lc93/m;ILandroidx/compose/runtime/Composer;II)V
    .locals 38

    move/from16 v10, p0

    move-object/from16 v1, p1

    move/from16 v0, p10

    move/from16 v2, p11

    const-string v3, "controller"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p9

    check-cast v3, Lp1/q;

    const v4, 0x3c31e0c

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v10}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v2, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v4, v4, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :goto_4
    and-int/lit8 v7, v2, 0x8

    if-eqz v7, :cond_8

    or-int/lit16 v4, v4, 0xc00

    :cond_7
    move-object/from16 v8, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v8, v0, 0xc00

    if-nez v8, :cond_7

    move-object/from16 v8, p3

    invoke-virtual {v3, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_5

    :cond_9
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v4, v9

    :goto_6
    and-int/lit8 v9, v2, 0x10

    if-eqz v9, :cond_b

    or-int/lit16 v4, v4, 0x6000

    :cond_a
    move/from16 v11, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_a

    move/from16 v11, p4

    invoke-virtual {v3, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_c

    const/16 v12, 0x4000

    goto :goto_7

    :cond_c
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v4, v12

    :goto_8
    and-int/lit8 v12, v2, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_e

    or-int/2addr v4, v13

    :cond_d
    move/from16 v13, p5

    goto :goto_a

    :cond_e
    and-int/2addr v13, v0

    if-nez v13, :cond_d

    move/from16 v13, p5

    invoke-virtual {v3, v13}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v14, 0x10000

    :goto_9
    or-int/2addr v4, v14

    :goto_a
    and-int/lit8 v14, v2, 0x40

    const/high16 v16, 0x180000

    if-eqz v14, :cond_10

    or-int v4, v4, v16

    move-object/from16 v15, p6

    goto :goto_c

    :cond_10
    and-int v16, v0, v16

    move-object/from16 v15, p6

    if-nez v16, :cond_12

    invoke-virtual {v3, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v16, 0x80000

    :goto_b
    or-int v4, v4, v16

    :cond_12
    :goto_c
    and-int/lit16 v0, v2, 0x80

    const/high16 v16, 0xc00000

    if-eqz v0, :cond_14

    or-int v4, v4, v16

    :cond_13
    move/from16 v16, v0

    move-object/from16 v0, p7

    goto :goto_e

    :cond_14
    and-int v16, p10, v16

    if-nez v16, :cond_13

    move/from16 v16, v0

    move-object/from16 v0, p7

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x800000

    goto :goto_d

    :cond_15
    const/high16 v17, 0x400000

    :goto_d
    or-int v4, v4, v17

    :goto_e
    const/high16 v17, 0x6000000

    and-int v17, p10, v17

    if-nez v17, :cond_17

    move/from16 v17, v12

    move/from16 v12, p8

    invoke-virtual {v3, v12}, Lp1/q;->e(I)Z

    move-result v18

    if-eqz v18, :cond_16

    const/high16 v18, 0x4000000

    goto :goto_f

    :cond_16
    const/high16 v18, 0x2000000

    :goto_f
    or-int v4, v4, v18

    :goto_10
    move/from16 v23, v4

    goto :goto_11

    :cond_17
    move/from16 v17, v12

    move/from16 v12, p8

    goto :goto_10

    :goto_11
    const v4, 0x2492493

    and-int v4, v23, v4

    const v0, 0x2492492

    if-ne v4, v0, :cond_19

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_12

    :cond_18
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v4, v8

    move v5, v11

    move/from16 v25, v13

    move-object v7, v15

    move-object/from16 v8, p7

    goto/16 :goto_1c

    :cond_19
    :goto_12
    if-eqz v5, :cond_1a

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v6, v0

    :cond_1a
    if-eqz v7, :cond_1b

    new-instance v0, Lg40/c2;

    const/4 v4, 0x1

    invoke-direct {v0, v4, v1, v10}, Lg40/c2;-><init>(ILg40/z1;Z)V

    const v4, -0x4746b3f9

    invoke-static {v4, v3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    move-object v8, v0

    :cond_1b
    const/4 v0, 0x0

    if-eqz v9, :cond_1c

    move/from16 v24, v0

    goto :goto_13

    :cond_1c
    move/from16 v24, v11

    :goto_13
    if-eqz v17, :cond_1d

    move/from16 v25, v0

    goto :goto_14

    :cond_1d
    move/from16 v25, v13

    :goto_14
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v14, :cond_1f

    const v5, 0x12202685

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_1e

    invoke-static {v3}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v5

    :cond_1e
    check-cast v5, Lg2/s;

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_1f
    move-object v5, v15

    :goto_15
    if-eqz v16, :cond_20

    const/4 v9, 0x0

    goto :goto_16

    :cond_20
    move-object/from16 v9, p7

    :goto_16
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v4, :cond_21

    invoke-static {v3}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v11

    new-instance v13, Lp1/a0;

    invoke-direct {v13, v11}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v3, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v11, v13

    :cond_21
    check-cast v11, Lp1/a0;

    iget-object v11, v11, Lp1/a0;->w:Lbc3/c0;

    const v13, 0x1220412d

    invoke-virtual {v3, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v4, :cond_22

    new-instance v13, Lr0/c;

    invoke-direct {v13}, Lr0/c;-><init>()V

    invoke-virtual {v3, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    move-object/from16 v26, v13

    check-cast v26, Lr0/a;

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    sget-object v13, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v3, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lg2/i;

    iget-object v14, v1, Lg40/z1;->f:Lec3/r1;

    invoke-static {v14, v3, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v27

    iget-object v14, v1, Lg40/z1;->l:Ln53/e;

    invoke-static {v14, v3, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v14

    iget-object v15, v1, Lg40/z1;->n:Ln53/e;

    invoke-static {v15, v3, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v28

    iget-object v15, v1, Lg40/z1;->d:Lec3/r1;

    invoke-static {v15, v3, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v29

    iget-object v15, v1, Lg40/z1;->o:Ln53/e;

    invoke-static {v15, v3, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v30

    iget-object v15, v1, Lg40/z1;->p:Ln53/e;

    invoke-static {v15, v3, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v31

    invoke-interface/range {v28 .. v28}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lg40/h1;

    instance-of v7, v15, Lg40/f1;

    if-eqz v7, :cond_23

    sget-object v7, Lg40/e1;->x:Lg40/e1;

    goto :goto_17

    :cond_23
    instance-of v7, v15, Lg40/g1;

    if-eqz v7, :cond_24

    sget-object v7, Lg40/e1;->y:Lg40/e1;

    goto :goto_17

    :cond_24
    if-nez v15, :cond_2e

    sget-object v7, Lg40/e1;->w:Lg40/e1;

    :goto_17
    const/16 v21, 0x0

    const/16 v22, 0x1e

    move-object v15, v13

    const-wide/16 v12, 0x0

    move-object/from16 v17, v14

    move-object/from16 v16, v15

    const-wide/16 v14, 0x0

    move-object/from16 v18, v16

    move-object/from16 v19, v17

    const-wide/16 v16, 0x0

    move-object/from16 v20, v18

    move-object/from16 v33, v19

    const-wide/16 v18, 0x0

    move-object/from16 v37, v20

    move-object/from16 v20, v3

    move-object v3, v5

    move-object v5, v11

    move-object v11, v7

    move-object/from16 v7, v37

    invoke-static/range {v11 .. v22}, Lg40/j4;->d(Lg40/e1;JJJJLandroidx/compose/runtime/Composer;II)Lg1/y1;

    move-result-object v13

    move-object/from16 v11, v20

    new-array v12, v0, [Ljava/lang/Object;

    const v14, 0x1220a5a1

    invoke-virtual {v11, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v4, :cond_25

    new-instance v14, Lfw0/a;

    const/16 v15, 0x18

    invoke-direct {v14, v15}, Lfw0/a;-><init>(I)V

    invoke-virtual {v11, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v14, Lc93/a;

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    const/16 v15, 0xc00

    const/16 v16, 0x6

    const/16 v17, 0x0

    move-object/from16 p5, v11

    move-object/from16 p2, v12

    move-object/from16 p4, v14

    move/from16 p6, v15

    move/from16 p7, v16

    move-object/from16 p3, v17

    invoke-static/range {p2 .. p7}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v12, p5

    check-cast v11, Lp1/c1;

    sget-object v14, Ld40/r;->j:Lp1/u2;

    invoke-virtual {v12, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ld40/g;

    const v15, 0x1220b119

    invoke-virtual {v12, v15}, Lp1/q;->e0(I)V

    if-eqz v25, :cond_28

    invoke-interface/range {v33 .. v33}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v0, 0x1220b98d

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, v33

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    move-object/from16 v17, v0

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v16, :cond_27

    if-ne v0, v4, :cond_26

    goto :goto_18

    :cond_26
    move-object/from16 v20, v7

    const/16 v32, 0x0

    goto :goto_19

    :cond_27
    :goto_18
    new-instance v0, Lay/u;

    const/16 v16, 0x3

    move-object/from16 p2, v0

    move-object/from16 p3, v7

    move-object/from16 p5, v11

    move/from16 p7, v16

    move-object/from16 p4, v17

    const/16 p6, 0x0

    invoke-direct/range {p2 .. p7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v20, p3

    move-object/from16 v32, p6

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    check-cast v0, Lc93/m;

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    invoke-static {v12, v0, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    goto :goto_1a

    :cond_28
    move-object/from16 v20, v7

    const/16 v32, 0x0

    move v7, v0

    :goto_1a
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    sget-object v0, Lb3/v1;->n:Lp1/u2;

    sget-object v15, Ly3/m;->w:Ly3/m;

    invoke-virtual {v0, v15}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    move-object v15, v0

    new-instance v0, Lg40/f2;

    move/from16 v7, p8

    move-object/from16 v36, v4

    move-object v2, v6

    move-object v6, v11

    move-object/from16 v34, v12

    move-object/from16 v35, v15

    move-object/from16 v15, v28

    move-object/from16 v17, v29

    move-object/from16 v18, v30

    move-object/from16 v16, v31

    move-object v4, v3

    move-object v11, v8

    move-object v12, v9

    move-object v9, v14

    move-object/from16 v8, v20

    move-object/from16 v3, v26

    move-object/from16 v14, v27

    invoke-direct/range {v0 .. v18}, Lg40/f2;-><init>(Lg40/z1;Landroidx/compose/ui/Modifier;Lr0/a;Lg2/s;Lbc3/c0;Lp1/c1;ILg2/i;Ld40/g;ZLc93/m;Lc93/m;Lg1/y1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V

    const v1, 0x47eb12cc

    move-object/from16 v3, v34

    invoke-static {v1, v3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    move-object/from16 v15, v35

    invoke-static {v15, v0, v3, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    if-eqz v24, :cond_2c

    const v0, 0x1221f705

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const/high16 v0, 0x380000

    and-int v0, v23, v0

    const/high16 v1, 0x100000

    if-ne v0, v1, :cond_29

    const/4 v0, 0x1

    goto :goto_1b

    :cond_29
    const/4 v0, 0x0

    :goto_1b
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2a

    move-object/from16 v0, v36

    if-ne v1, v0, :cond_2b

    :cond_2a
    new-instance v1, Landroidx/room/e;

    const/16 v0, 0x9

    const/4 v5, 0x0

    invoke-direct {v1, v4, v5, v0}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v1, Lc93/m;

    const/4 v7, 0x0

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v3, v1, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :cond_2c
    move-object v6, v2

    move-object v7, v4

    move-object v4, v11

    move-object v8, v12

    move/from16 v5, v24

    :goto_1c
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_2d

    new-instance v0, Lg40/b2;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    move-object v3, v6

    move/from16 v6, v25

    invoke-direct/range {v0 .. v11}, Lg40/b2;-><init>(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;Lc93/m;III)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_2d
    return-void

    :cond_2e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static final h(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/l1;Lq0/e;FLb2/f;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v15, p12

    check-cast v15, Lp1/q;

    const v0, -0x5ecb3657

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p13, v0

    move-object/from16 v2, p1

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    move-object/from16 v3, p2

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v0, v4

    const v4, 0x1b6c00

    or-int/2addr v0, v4

    move-object/from16 v4, p6

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/high16 v5, 0x800000

    goto :goto_3

    :cond_3
    const/high16 v5, 0x400000

    :goto_3
    or-int/2addr v0, v5

    const/high16 v5, 0x36000000

    or-int/2addr v0, v5

    const v5, 0x12492493

    and-int/2addr v5, v0

    const v6, 0x12492492

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ne v5, v6, :cond_4

    move v5, v7

    goto :goto_4

    :cond_4
    move v5, v8

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v15, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v5, p13, 0x1

    if-eqz v5, :cond_6

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v9, p3

    move/from16 v8, p4

    move-object/from16 v11, p5

    move/from16 v5, p7

    move-object/from16 v10, p8

    move-object/from16 v13, p9

    move-object/from16 v6, p10

    goto :goto_6

    :cond_6
    :goto_5
    int-to-float v5, v7

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v7, Lh0/d2;->w:Lh0/d2;

    and-int/lit8 v9, v0, 0xe

    or-int/lit16 v9, v9, 0x1b0

    invoke-static {v1, v7, v15, v9}, Ldc/a;->L(Lq0/y;Lh0/d2;Landroidx/compose/runtime/Composer;I)Lq0/a;

    move-result-object v7

    sget-object v9, Li0/m;->c:Li0/m;

    invoke-static {v15}, Lf0/g1;->a(Landroidx/compose/runtime/Composer;)Lf0/k;

    move-result-object v10

    sget-object v11, Lq0/e;->a:Lq0/e;

    move v13, v8

    move v8, v5

    move v5, v13

    move-object v13, v9

    move-object v9, v11

    move-object v11, v6

    move-object v6, v10

    move-object v10, v7

    :goto_6
    invoke-virtual {v15}, Lp1/q;->r()V

    sget-object v3, Lh0/d2;->w:Lh0/d2;

    sget-object v12, Lb2/e;->K:Lb2/l;

    shr-int/lit8 v7, v0, 0x3

    and-int/lit8 v7, v7, 0xe

    or-int/lit16 v7, v7, 0x6000

    shl-int/lit8 v14, v0, 0x3

    and-int/lit8 v14, v14, 0x70

    or-int/2addr v7, v14

    and-int/lit16 v14, v0, 0x380

    or-int/2addr v7, v14

    or-int/lit16 v7, v7, 0xc00

    const/high16 v14, 0x70000

    shr-int/lit8 v0, v0, 0x6

    and-int/2addr v0, v14

    or-int/2addr v0, v7

    const/high16 v7, 0x36180000

    or-int v16, v0, v7

    const v17, 0x1b6d86

    const/4 v7, 0x0

    move-object/from16 v14, p11

    move-object v0, v2

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v17}, Lcom/squareup/wire/n;->c(Landroidx/compose/ui/Modifier;Lq0/y;Ll0/k1;Lh0/d2;Lh0/p3;ZLf0/k;IFLq0/e;Lt2/a;Lb2/f;Lb2/g;Li0/n;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move v4, v8

    move v8, v5

    move v5, v4

    move-object v4, v11

    move-object v11, v6

    move-object v6, v4

    move-object v4, v9

    move-object v9, v10

    move-object v10, v13

    goto :goto_7

    :cond_7
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    :goto_7
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_8

    new-instance v0, Lq0/i;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v7, p6

    move-object/from16 v12, p11

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lq0/i;-><init>(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/l1;Lq0/e;FLb2/f;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;I)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static i(Landroid/widget/EdgeEffect;FFLy3/c;)F
    .locals 8

    sget v0, Lf0/f0;->a:F

    const v0, 0x43c10b3d

    invoke-interface {p3}, Ly3/c;->getDensity()F

    move-result p3

    mul-float/2addr p3, v0

    const/high16 v0, 0x43200000    # 160.0f

    mul-float/2addr p3, v0

    const v0, 0x3f570a3d    # 0.84f

    mul-float/2addr p3, v0

    float-to-double v0, p3

    const p3, 0x3eb33333    # 0.35f

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    mul-float/2addr v2, p3

    float-to-double v2, v2

    sget p3, Lf0/f0;->a:F

    float-to-double v4, p3

    mul-double/2addr v4, v0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    sget-wide v2, Lf0/f0;->b:D

    sget-wide v6, Lf0/f0;->c:D

    div-double/2addr v2, v6

    mul-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    mul-double/2addr v0, v4

    double-to-float p3, v0

    invoke-static {p0}, Ldp/d;->G(Landroid/widget/EdgeEffect;)F

    move-result v0

    mul-float/2addr v0, p2

    cmpg-float p2, p3, v0

    if-gtz p2, :cond_0

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p2

    invoke-static {p0, p2}, Ldp/d;->Q(Landroid/widget/EdgeEffect;I)V

    return p1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final j(JLcom/amplitude/android/engagement/types/DebugStatus;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, 0x4f7422e8    # 4.0959283E9f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0xe

    const/4 v7, 0x4

    const/4 v15, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v12, v1, v2}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v7

    goto :goto_0

    :cond_0
    move v0, v15

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v8, v6, 0x70

    if-nez v8, :cond_3

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :cond_3
    and-int/lit16 v8, v6, 0x380

    if-nez v8, :cond_5

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :cond_5
    and-int/lit16 v8, v6, 0x1c00

    if-nez v8, :cond_7

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v0, v8

    :cond_7
    and-int/lit16 v0, v0, 0x16db

    const/16 v8, 0x492

    if-ne v0, v8, :cond_9

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_e

    :cond_9
    :goto_5
    sget-object v0, Lmj/i;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v0, v0, v8

    const/4 v8, 0x1

    if-eq v0, v8, :cond_d

    if-eq v0, v15, :cond_c

    const/4 v9, 0x3

    if-eq v0, v9, :cond_b

    if-ne v0, v7, :cond_a

    sget-wide v9, Li2/x;->g:J

    goto :goto_6

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    sget-wide v9, Luj/g;->l:J

    goto :goto_6

    :cond_c
    sget-wide v9, Luj/g;->l:J

    goto :goto_6

    :cond_d
    sget-wide v9, Luj/g;->u:J

    :goto_6
    sget-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    const/4 v11, 0x0

    if-ne v3, v0, :cond_e

    move v0, v8

    goto :goto_7

    :cond_e
    move v0, v11

    :goto_7
    const-string v13, "border-pulse"

    invoke-static {v13, v12, v11}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v13

    const/16 v14, 0x3e8

    const/4 v15, 0x0

    const/4 v8, 0x6

    invoke-static {v14, v11, v15, v8}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v8

    sget-object v14, Ld0/v0;->x:Ld0/v0;

    invoke-static {v8, v14, v7}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v7

    move-wide v8, v9

    move-object v10, v7

    move-object v7, v13

    const/16 v13, 0x71b8

    const/4 v14, 0x0

    move-wide/from16 v17, v8

    const/high16 v8, 0x40000000    # 2.0f

    const/high16 v9, 0x40800000    # 4.0f

    move/from16 v19, v11

    const-string v11, "border-width"

    move/from16 v16, v0

    move-wide/from16 v0, v17

    move/from16 v2, v19

    invoke-static/range {v7 .. v14}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v7

    sget v8, Luj/g;->v:F

    sget v9, Luj/g;->w:F

    const/4 v10, 0x2

    int-to-float v10, v10

    mul-float/2addr v9, v10

    add-float/2addr v9, v8

    const/high16 v11, 0x40800000    # 4.0f

    mul-float/2addr v11, v10

    add-float/2addr v11, v9

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const v13, -0x1bd57779

    invoke-virtual {v12, v13}, Lp1/q;->f0(I)V

    sget-object v14, Lb2/t;->w:Lb2/t;

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v16, :cond_11

    sget-object v13, Lt0/j;->a:Lt0/i;

    invoke-static {v14, v13}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v17, :cond_f

    if-ne v15, v2, :cond_10

    :cond_f
    new-instance v15, Lch/c;

    const/4 v3, 0x2

    invoke-direct {v15, v5, v3}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v15, Lc93/a;

    const/4 v3, 0x7

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static {v13, v6, v4, v15, v3}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    goto :goto_8

    :cond_11
    const/4 v6, 0x0

    move-object v13, v14

    :goto_8
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-interface {v11, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->E:Lb2/m;

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move v13, v9

    move v6, v10

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move/from16 v17, v6

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_12

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_12
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_9
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v12, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    move/from16 v20, v13

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v21, v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_14

    goto :goto_a

    :cond_13
    move-object/from16 v21, v11

    :goto_a
    invoke-static {v9, v12, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v12, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x5d957044

    invoke-virtual {v12, v3}, Lp1/q;->f0(I)V

    if-nez v16, :cond_15

    iget-object v3, v7, Ld0/j0;->z:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    mul-float v3, v3, v17

    add-float v3, v3, v20

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, Lt0/j;->a:Lt0/i;

    invoke-static {v3, v11}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    iget-object v7, v7, Ld0/j0;->z:Lp1/k1;

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v3, v7, v0, v1, v11}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v12, v1}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :cond_15
    const/4 v1, 0x0

    :goto_b
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    invoke-static {v8, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lt0/j;->a:Lt0/i;

    invoke-static {v0, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Li2/w0;->a:Li2/v0;

    move-object v3, v14

    move-wide/from16 v13, p0

    invoke-static {v0, v13, v14, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, -0x5d956cea

    invoke-virtual {v12, v1}, Lp1/q;->f0(I)V

    if-eqz v16, :cond_18

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_16

    if-ne v7, v2, :cond_17

    :cond_16
    new-instance v7, Lch/c;

    const/4 v1, 0x3

    invoke-direct {v7, v5, v1}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v7, Lc93/a;

    move-object v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x7

    const/4 v11, 0x0

    invoke-static {v1, v11, v2, v7, v3}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    goto :goto_c

    :cond_18
    move-object v1, v3

    const/4 v11, 0x0

    move-object v2, v1

    :goto_c
    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v4, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v12, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_19

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_19
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v12, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v21

    invoke-static {v12, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_1a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :cond_1a
    invoke-static {v3, v12, v3, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v12, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x7f0804f7

    const/4 v11, 0x0

    invoke-static {v0, v12, v11}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    const v0, 0x3ecccccd    # 0.4f

    mul-float/2addr v8, v0

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-wide v10, Li2/x;->n:J

    const/16 v13, 0xdb8

    const-string v8, "Debug"

    invoke-static/range {v7 .. v13}, Ll1/r1;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-nez v7, :cond_1c

    return-void

    :cond_1c
    new-instance v0, Lmj/h;

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lmj/h;-><init>(JLcom/amplitude/android/engagement/types/DebugStatus;Landroidx/compose/ui/Modifier;Lc93/a;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final k(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;
    .locals 4

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq p2, v0, :cond_6

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getNextFocusForwardId()I

    move-result p2

    if-ne p2, v1, :cond_1

    goto :goto_3

    :cond_1
    new-instance v0, Lb3/y;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Lb3/y;-><init>(II)V

    move-object p2, v2

    :goto_0
    invoke-static {p0, v0, p2}, Ldp/d;->B(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;

    move-result-object p2

    if-nez p2, :cond_5

    if-ne p0, p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    if-eqz p2, :cond_4

    instance-of v1, p2, Landroid/view/View;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    check-cast p2, Landroid/view/View;

    move-object v3, p2

    move-object p2, p0

    move-object p0, v3

    goto :goto_0

    :cond_4
    :goto_1
    return-object v2

    :cond_5
    :goto_2
    return-object p2

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p2

    if-ne p2, v1, :cond_7

    :goto_3
    return-object v2

    :cond_7
    new-instance p2, Lb2/z;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p1, p0}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v2

    :goto_4
    invoke-static {p0, p2, v0}, Ldp/d;->B(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_b

    if-ne p0, p1, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_a

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_9

    goto :goto_5

    :cond_9
    check-cast v0, Landroid/view/View;

    move-object v3, v0

    move-object v0, p0

    move-object p0, v3

    goto :goto_4

    :cond_a
    :goto_5
    return-object v2

    :cond_b
    :goto_6
    return-object v0
.end method

.method public static final l(JLe1/i;Lf1/a1;)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v2, Le1/k;

    invoke-direct {v2, p0, p1, p2, p3}, Le1/k;-><init>(JLe1/i;Lf1/a1;)V

    new-instance v1, Lai/h;

    invoke-direct {v1, p0, p1, p2, p3}, Lai/h;-><init>(JLe1/i;Lf1/a1;)V

    new-instance v4, Lf1/k0;

    const/4 p0, 0x0

    invoke-direct {v4, p0, v1, v2}, Lf1/k0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Lu2/c0;->a:Lu2/k;

    new-instance v0, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/4 v3, 0x0

    const/4 v5, 0x4

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    return-object v0
.end method

.method public static final m(Lvf/b;Lvf/a;)V
    .locals 3

    invoke-interface {p1}, Lvf/a;->getHeaders()Lmf/h;

    move-result-object v0

    new-instance v1, Lmw1/a;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lgf/t;->c(Lc93/m;)V

    invoke-interface {p1}, Lvf/a;->getUrl()Lcg/o;

    move-result-object p1

    iget-object p1, p1, Lcg/o;->e:Lcg/i;

    iget-object p1, p1, Lcg/i;->w:Lgf/k;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltg/b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p0, Lvf/b;->x:Lcg/j;

    iget-object v2, v2, Lcg/j;->E:Lcg/g;

    invoke-virtual {v2, v1}, Lcg/g;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lvf/b;->x:Lcg/j;

    iget-object v2, v2, Lcg/j;->E:Lcg/g;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v2, v1, v0}, Lcg/g;->a(Ltg/b;Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final n(Lb30/j;)Z
    .locals 3

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.ActivityManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getAppTasks()Ljava/util/List;

    move-result-object v0

    const-string v1, "getAppTasks(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager$AppTask;

    invoke-virtual {v1}, Landroid/app/ActivityManager$AppTask;->getTaskInfo()Landroid/app/ActivityManager$RecentTaskInfo;

    move-result-object v1

    iget v1, v1, Landroid/app/ActivityManager$RecentTaskInfo;->persistentId:I

    invoke-virtual {p0}, Landroid/app/Activity;->getTaskId()I

    move-result v2

    if-ne v1, v2, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final o(Llb3/y;)Lqb3/a;
    .locals 12

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lds/p;->J(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lds/p;->M(Llb3/y;)Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Ldp/d;->o(Llb3/y;)Lqb3/a;

    move-result-object v0

    invoke-static {p0}, Lds/p;->g0(Llb3/y;)Llb3/c0;

    move-result-object v1

    invoke-static {v1}, Ldp/d;->o(Llb3/y;)Lqb3/a;

    move-result-object v1

    new-instance v2, Lqb3/a;

    iget-object v3, v0, Lqb3/a;->a:Ljava/lang/Object;

    check-cast v3, Llb3/y;

    invoke-static {v3}, Lds/p;->M(Llb3/y;)Llb3/c0;

    move-result-object v3

    iget-object v4, v1, Lqb3/a;->a:Ljava/lang/Object;

    check-cast v4, Llb3/y;

    invoke-static {v4}, Lds/p;->g0(Llb3/y;)Llb3/c0;

    move-result-object v4

    invoke-static {v3, v4}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v3

    invoke-static {v3, p0}, Llb3/o;->d(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object v3

    iget-object v0, v0, Lqb3/a;->b:Ljava/lang/Object;

    check-cast v0, Llb3/y;

    invoke-static {v0}, Lds/p;->M(Llb3/y;)Llb3/c0;

    move-result-object v0

    iget-object v1, v1, Lqb3/a;->b:Ljava/lang/Object;

    check-cast v1, Llb3/y;

    invoke-static {v1}, Lds/p;->g0(Llb3/y;)Llb3/c0;

    move-result-object v1

    invoke-static {v0, v1}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v0

    invoke-static {v0, p0}, Llb3/o;->d(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p0

    invoke-direct {v2, v3, p0}, Lqb3/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    instance-of v1, v1, Lza3/b;

    const/4 v2, 0x2

    const-string v3, "getType(...)"

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lza3/b;

    invoke-interface {v0}, Lza3/b;->b()Llb3/u0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result v3

    invoke-static {v1, v3}, Llb3/d1;->h(Llb3/y;Z)Llb3/y;

    move-result-object v1

    invoke-virtual {v0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eq v3, v4, :cond_2

    if-ne v3, v2, :cond_1

    new-instance v0, Lqb3/a;

    invoke-static {p0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object v2

    invoke-virtual {v2}, Lo93/h;->o()Llb3/c0;

    move-result-object v2

    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result p0

    invoke-static {v2, p0}, Llb3/d1;->h(Llb3/y;Z)Llb3/y;

    move-result-object p0

    invoke-direct {v0, p0, v1}, Lqb3/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Only nontrivial projections should have been captured, not: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_2
    new-instance v0, Lqb3/a;

    invoke-static {p0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object p0

    invoke-virtual {p0}, Lo93/h;->p()Llb3/c0;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lqb3/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_3
    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-eq v1, v5, :cond_4

    goto/16 :goto_5

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v0}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v0

    const-string v7, "getParameters(...)"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v6, v0}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll83/k;

    iget-object v7, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Llb3/u0;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Lr93/x0;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v6}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_b

    if-eqz v7, :cond_a

    sget-object v9, Llb3/a1;->b:Llb3/a1;

    invoke-virtual {v7}, Llb3/u0;->c()Z

    move-result v9

    if-eqz v9, :cond_5

    sget-object v8, Llb3/g1;->E:Llb3/g1;

    goto :goto_1

    :cond_5
    invoke-virtual {v7}, Llb3/u0;->a()Llb3/g1;

    move-result-object v9

    invoke-static {v8, v9}, Llb3/a1;->b(Llb3/g1;Llb3/g1;)Llb3/g1;

    move-result-object v8

    :goto_1
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eqz v8, :cond_8

    if-eq v8, v4, :cond_7

    if-ne v8, v2, :cond_6

    new-instance v8, Lqb3/d;

    invoke-static {v6}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v9

    invoke-virtual {v9}, Lo93/h;->o()Llb3/c0;

    move-result-object v9

    invoke-virtual {v7}, Llb3/u0;->b()Llb3/y;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v6, v9, v10}, Lqb3/d;-><init>(Lr93/x0;Llb3/y;Llb3/y;)V

    goto :goto_2

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_7
    new-instance v8, Lqb3/d;

    invoke-virtual {v7}, Llb3/u0;->b()Llb3/y;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v10

    invoke-virtual {v10}, Lo93/h;->p()Llb3/c0;

    move-result-object v10

    const-string v11, "getNullableAnyType(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v6, v9, v10}, Lqb3/d;-><init>(Lr93/x0;Llb3/y;Llb3/y;)V

    goto :goto_2

    :cond_8
    new-instance v8, Lqb3/d;

    invoke-virtual {v7}, Llb3/u0;->b()Llb3/y;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Llb3/u0;->b()Llb3/y;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v6, v9, v10}, Lqb3/d;-><init>(Lr93/x0;Llb3/y;Llb3/y;)V

    :goto_2
    invoke-virtual {v7}, Llb3/u0;->c()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_9
    iget-object v6, v8, Lqb3/d;->b:Llb3/y;

    invoke-static {v6}, Ldp/d;->o(Llb3/y;)Lqb3/a;

    move-result-object v6

    iget-object v7, v6, Lqb3/a;->a:Ljava/lang/Object;

    check-cast v7, Llb3/y;

    iget-object v6, v6, Lqb3/a;->b:Ljava/lang/Object;

    check-cast v6, Llb3/y;

    iget-object v9, v8, Lqb3/d;->c:Llb3/y;

    invoke-static {v9}, Ldp/d;->o(Llb3/y;)Lqb3/a;

    move-result-object v9

    iget-object v10, v9, Lqb3/a;->a:Ljava/lang/Object;

    check-cast v10, Llb3/y;

    iget-object v9, v9, Lqb3/a;->b:Ljava/lang/Object;

    check-cast v9, Llb3/y;

    new-instance v11, Lqb3/d;

    iget-object v8, v8, Lqb3/d;->a:Lr93/x0;

    invoke-direct {v11, v8, v6, v10}, Lqb3/d;-><init>(Lr93/x0;Llb3/y;Llb3/y;)V

    new-instance v6, Lqb3/d;

    invoke-direct {v6, v8, v7, v9}, Lqb3/d;-><init>(Lr93/x0;Llb3/y;Llb3/y;)V

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_a
    const/16 p0, 0x24

    invoke-static {p0}, Llb3/a1;->a(I)V

    throw v9

    :cond_b
    const/16 p0, 0x23

    invoke-static {p0}, Llb3/a1;->a(I)V

    throw v9

    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_e

    :cond_d
    move v4, v2

    goto :goto_3

    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqb3/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lmb3/d;->a:Lmb3/l;

    iget-object v7, v3, Lqb3/d;->b:Llb3/y;

    iget-object v3, v3, Lqb3/d;->c:Llb3/y;

    invoke-virtual {v6, v7, v3}, Lmb3/l;->b(Llb3/y;Llb3/y;)Z

    move-result v3

    if-nez v3, :cond_f

    :goto_3
    new-instance v0, Lqb3/a;

    if-eqz v4, :cond_10

    invoke-static {p0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object v1

    invoke-virtual {v1}, Lo93/h;->o()Llb3/c0;

    move-result-object v1

    goto :goto_4

    :cond_10
    invoke-static {v1, p0}, Ldp/d;->V(Ljava/util/ArrayList;Llb3/y;)Llb3/y;

    move-result-object v1

    :goto_4
    invoke-static {v5, p0}, Ldp/d;->V(Ljava/util/ArrayList;Llb3/y;)Llb3/y;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lqb3/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_11
    :goto_5
    new-instance v0, Lqb3/a;

    invoke-direct {v0, p0, p0}, Lqb3/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final p(Llb3/u0;Z)Llb3/u0;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Llb3/u0;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lqb3/b;->w:Lqb3/b;

    invoke-static {v1, v2, v0}, Llb3/d1;->c(Llb3/y;Lkotlin/jvm/functions/Function1;Lub3/h;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v2

    const-string v3, "getProjectionKind(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Llb3/g1;->E:Llb3/g1;

    if-ne v2, v3, :cond_3

    invoke-static {v1}, Ldp/d;->o(Llb3/y;)Lqb3/a;

    move-result-object p0

    new-instance p1, Llb3/v0;

    iget-object p0, p0, Lqb3/a;->b:Ljava/lang/Object;

    check-cast p0, Llb3/y;

    invoke-direct {p1, p0, v2}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object p1

    :cond_3
    if-eqz p1, :cond_4

    invoke-static {v1}, Ldp/d;->o(Llb3/y;)Lqb3/a;

    move-result-object p0

    iget-object p0, p0, Lqb3/a;->a:Ljava/lang/Object;

    check-cast p0, Llb3/y;

    new-instance p1, Llb3/v0;

    invoke-direct {p1, p0, v2}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object p1

    :cond_4
    new-instance p1, Lqb3/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    new-instance v1, Llb3/a1;

    invoke-direct {v1, p1}, Llb3/a1;-><init>(Llb3/y0;)V

    invoke-virtual {p1}, Llb3/y0;->e()Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_0
    return-object p0

    :cond_5
    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {v1, p0, v0, p1}, Llb3/a1;->j(Llb3/u0;Lr93/x0;I)Llb3/u0;

    move-result-object p0
    :try_end_0
    .catch Llb3/z0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static final q(Lob3/g;)Lob3/m;
    .locals 2

    invoke-static {p0}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lmb3/g;->O(Lob3/f;)Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {p0}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    invoke-static {v0}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object v0

    invoke-static {v0}, Lmb3/g;->s(Lob3/l;)Lr93/x0;

    move-result-object v0

    if-nez v0, :cond_7

    instance-of v0, p0, Llb3/y;

    if-eqz v0, :cond_6

    move-object v0, p0

    check-cast v0, Llb3/y;

    invoke-static {v0}, Lo93/h;->z(Llb3/y;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lmb3/g;->n(Lob3/g;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lob3/k;

    const-string v0, "$receiver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmb3/g;->L(Lob3/k;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object p0, v1

    goto :goto_0

    :cond_3
    instance-of v0, p0, Llb3/u0;

    if-eqz v0, :cond_5

    check-cast p0, Llb3/u0;

    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object p0

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_4

    invoke-static {p0}, Ldp/d;->q(Lob3/g;)Lob3/m;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    return-object v1

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ClassicTypeSystemContext couldn\'t handle: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v1, p0, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ClassicTypeSystemContext couldn\'t handle: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v1, p0, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    return-object v0
.end method

.method public static r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;
    .locals 26

    move/from16 v0, p9

    and-int/lit8 v1, p10, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v2, p8

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->g()J

    move-result-wide v1

    move-wide v8, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v8, p0

    :goto_0
    and-int/lit8 v1, p10, 0x2

    if-eqz v1, :cond_1

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v2, p8

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->e()J

    move-result-wide v1

    const v3, 0x3f19999a    # 0.6f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    goto :goto_1

    :cond_1
    move-wide/from16 v1, p2

    :goto_1
    and-int/lit8 v3, p10, 0x4

    if-eqz v3, :cond_2

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v4, p8

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->h()J

    move-result-wide v3

    move-wide v4, v3

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p4

    :goto_2
    and-int/lit8 v3, p10, 0x8

    const v6, 0x3ec28f5c    # 0.38f

    if-eqz v3, :cond_4

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v7, p8

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/c1;

    invoke-virtual {v10}, Lg1/c1;->e()J

    move-result-wide v10

    sget-object v12, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v7, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Li2/x;

    iget-wide v12, v12, Li2/x;->a:J

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->i()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v12, v13}, Li2/w0;->x(J)F

    goto :goto_3

    :cond_3
    invoke-static {v12, v13}, Li2/w0;->x(J)F

    :goto_3
    invoke-static {v6, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v10

    move-wide v12, v10

    goto :goto_4

    :cond_4
    move-wide/from16 v12, p6

    :goto_4
    sget-object v3, Lg1/l1;->a:Lp1/b0;

    move-object/from16 v7, p8

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    iget-wide v10, v3, Li2/x;->a:J

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->i()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v10, v11}, Li2/w0;->x(J)F

    goto :goto_5

    :cond_5
    invoke-static {v10, v11}, Li2/w0;->x(J)F

    :goto_5
    invoke-static {v6, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v6

    and-int/lit8 v3, v0, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v14, 0x1

    if-le v3, v10, :cond_6

    move-object/from16 v3, p8

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v8, v9}, Lp1/q;->f(J)Z

    move-result v3

    if-nez v3, :cond_7

    :cond_6
    and-int/lit8 v3, v0, 0x6

    if-ne v3, v10, :cond_8

    :cond_7
    move v3, v14

    goto :goto_6

    :cond_8
    move v3, v11

    :goto_6
    and-int/lit8 v10, v0, 0x70

    xor-int/lit8 v10, v10, 0x30

    const/16 v15, 0x20

    if-le v10, v15, :cond_9

    move-object/from16 v10, p8

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v1, v2}, Lp1/q;->f(J)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    and-int/lit8 v10, v0, 0x30

    if-ne v10, v15, :cond_b

    :cond_a
    move v10, v14

    goto :goto_7

    :cond_b
    move v10, v11

    :goto_7
    or-int/2addr v3, v10

    and-int/lit16 v10, v0, 0x380

    xor-int/lit16 v10, v10, 0x180

    const/16 v15, 0x100

    if-le v10, v15, :cond_c

    move-object/from16 v10, p8

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v5}, Lp1/q;->f(J)Z

    move-result v10

    if-nez v10, :cond_d

    :cond_c
    and-int/lit16 v10, v0, 0x180

    if-ne v10, v15, :cond_e

    :cond_d
    move v10, v14

    goto :goto_8

    :cond_e
    move v10, v11

    :goto_8
    or-int/2addr v3, v10

    and-int/lit16 v10, v0, 0x1c00

    xor-int/lit16 v10, v10, 0xc00

    const/16 v15, 0x800

    if-le v10, v15, :cond_f

    move-object/from16 v10, p8

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v12, v13}, Lp1/q;->f(J)Z

    move-result v10

    if-nez v10, :cond_10

    :cond_f
    and-int/lit16 v10, v0, 0xc00

    if-ne v10, v15, :cond_11

    :cond_10
    move v10, v14

    goto :goto_9

    :cond_11
    move v10, v11

    :goto_9
    or-int/2addr v3, v10

    const v10, 0xe000

    and-int/2addr v10, v0

    xor-int/lit16 v10, v10, 0x6000

    const/16 v15, 0x4000

    if-le v10, v15, :cond_12

    move-object/from16 v10, p8

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v6, v7}, Lp1/q;->f(J)Z

    move-result v10

    if-nez v10, :cond_13

    :cond_12
    and-int/lit16 v0, v0, 0x6000

    if-ne v0, v15, :cond_14

    :cond_13
    move v11, v14

    :cond_14
    or-int v0, v3, v11

    move-object/from16 v3, p8

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v0, :cond_15

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v10, v0, :cond_16

    :cond_15
    const/4 v0, 0x0

    move-wide/from16 v16, v6

    invoke-static {v0, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v6

    invoke-static {v0, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v10

    invoke-static {v0, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v14

    move-object v0, v3

    new-instance v3, Lg1/r1;

    move-wide/from16 v18, v8

    move-wide/from16 v22, v12

    move-wide/from16 v24, v16

    move-wide/from16 v20, v1

    invoke-direct/range {v3 .. v25}, Lg1/r1;-><init>(JJJJJJJJJJJ)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v10, v3

    :cond_16
    check-cast v10, Lg1/r1;

    return-object v10
.end method

.method public static final s(Lob3/g;Ljava/util/HashSet;)Lob3/g;
    .locals 9

    sget-object v0, Lmb3/m;->w:Lmb3/m;

    invoke-virtual {v0, p0}, Lmb3/m;->N(Lob3/g;)Lob3/l;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-static {v1}, Lmb3/g;->s(Lob3/l;)Lr93/x0;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    invoke-static {v2}, Lmb3/g;->q(Lob3/m;)Llb3/y;

    move-result-object v1

    invoke-static {v1, p1}, Ldp/d;->s(Lob3/g;Ljava/util/HashSet;)Lob3/g;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-virtual {v0, v1}, Lmb3/m;->N(Lob3/g;)Lob3/l;

    move-result-object v2

    invoke-static {v2}, Lmb3/g;->D(Lob3/l;)Z

    move-result v2

    if-nez v2, :cond_1

    instance-of v2, v1, Lob3/i;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Lob3/i;

    invoke-static {v2}, Lmb3/g;->J(Lob3/i;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    const/4 v4, 0x1

    :cond_2
    instance-of v2, p1, Lob3/i;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Lob3/i;

    invoke-static {v2}, Lmb3/g;->J(Lob3/i;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p0}, Lmb3/g;->I(Lob3/g;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz v4, :cond_3

    invoke-virtual {v0, v1}, Lmb3/m;->o0(Lob3/g;)Lob3/g;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p1}, Lmb3/g;->I(Lob3/g;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {p0}, Lmb3/g;->G(Lob3/g;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v0, p1}, Lmb3/m;->o0(Lob3/g;)Lob3/g;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_0
    return-object p1

    :cond_6
    invoke-static {v1}, Lmb3/g;->D(Lob3/l;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v0, p0}, Lmb3/m;->N(Lob3/g;)Lob3/l;

    move-result-object v1

    invoke-static {v1}, Lmb3/g;->p(Lob3/l;)Ljava/util/List;

    move-result-object v1

    invoke-static {p0}, Lmb3/g;->n(Lob3/g;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v4, 0x1

    if-ltz v4, :cond_8

    check-cast v7, Lob3/k;

    invoke-static {v0, v7}, Lmb3/g;->r(Lmb3/b;Lob3/k;)Llb3/f1;

    move-result-object v7

    if-nez v7, :cond_7

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lob3/m;

    invoke-static {v4}, Lmb3/g;->q(Lob3/m;)Llb3/y;

    move-result-object v7

    :cond_7
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v8

    goto :goto_1

    :cond_8
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_9
    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lob3/m;

    const-string v6, "$receiver"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v4, Lr93/x0;

    if-eqz v6, :cond_a

    check-cast v4, Lr93/x0;

    invoke-interface {v4}, Lr93/x0;->e()Llb3/q0;

    move-result-object v4

    const-string v6, "getTypeConstructor(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "ClassicTypeSystemContext couldn\'t handle: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v0, p1, p0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {v2, v5}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lob3/l;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lob3/g;

    const-string v6, "null cannot be cast to non-null type org.jetbrains.kotlin.types.TypeConstructor"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Llb3/q0;

    const-string v6, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Llb3/y;

    invoke-static {v4}, Lio/sentry/config/a;->n(Llb3/y;)Llb3/v0;

    move-result-object v4

    new-instance v6, Ll83/k;

    invoke-direct {v6, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_c
    invoke-static {v2}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Llb3/r0;

    invoke-direct {v2, v1}, Llb3/r0;-><init>(Ljava/util/Map;)V

    new-instance v1, Llb3/a1;

    invoke-direct {v1, v2}, Llb3/a1;-><init>(Llb3/y0;)V

    const-string v2, "$receiver"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p0, Llb3/y;

    if-eqz v2, :cond_15

    move-object v2, p0

    check-cast v2, Llb3/y;

    invoke-static {v2}, Lya3/h;->h(Llb3/y;)Llb3/c0;

    move-result-object v2

    if-nez v2, :cond_d

    move-object v1, v3

    goto :goto_4

    :cond_d
    invoke-static {v2}, Ldp/d;->q(Lob3/g;)Lob3/m;

    move-result-object v4

    if-nez v4, :cond_e

    invoke-static {v1, v2}, Lmb3/g;->U(Lob3/n;Lob3/g;)Llb3/y;

    move-result-object v1

    goto :goto_4

    :cond_e
    invoke-static {v4}, Lmb3/g;->q(Lob3/m;)Llb3/y;

    move-result-object v4

    invoke-static {v1, v4}, Lmb3/g;->U(Lob3/n;Lob3/g;)Llb3/y;

    move-result-object v1

    invoke-static {v2, v1}, Ldp/d;->X(Lob3/g;Lob3/g;)Lob3/g;

    move-result-object v1

    :goto_4
    if-nez v1, :cond_f

    goto :goto_5

    :cond_f
    invoke-static {v1, p1}, Ldp/d;->s(Lob3/g;Ljava/util/HashSet;)Lob3/g;

    move-result-object p1

    if-nez p1, :cond_11

    :cond_10
    :goto_5
    return-object v3

    :cond_11
    invoke-static {p0}, Lmb3/g;->I(Lob3/g;)Z

    move-result v1

    if-nez v1, :cond_12

    return-object p1

    :cond_12
    invoke-static {p1}, Lmb3/g;->I(Lob3/g;)Z

    move-result v1

    if-eqz v1, :cond_13

    goto :goto_6

    :cond_13
    instance-of v1, p1, Lob3/i;

    if-eqz v1, :cond_14

    move-object v1, p1

    check-cast v1, Lob3/i;

    invoke-static {v1}, Lmb3/g;->J(Lob3/i;)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_6

    :cond_14
    invoke-virtual {v0, p1}, Lmb3/m;->o0(Lob3/g;)Lob3/g;

    move-result-object p0

    return-object p0

    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "ClassicTypeSystemContext couldn\'t handle: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v0, p0, p1}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    :goto_6
    return-object p0
.end method

.method public static final t(Lr93/e;Loa3/m;)Ljava/lang/String;
    .locals 3

    const-string v0, "klass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeMappingConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lva3/j;->a:Lva3/h;

    iget-boolean v2, v1, Lva3/h;->x:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lva3/j;->c:Lva3/h;

    :goto_0
    invoke-virtual {v1}, Lva3/h;->c()Ljava/lang/String;

    move-result-object v1

    instance-of v2, v0, Lr93/g0;

    if-eqz v2, :cond_2

    check-cast v0, Lr93/g0;

    check-cast v0, Lu93/g0;

    iget-object p0, v0, Lu93/g0;->F:Lva3/e;

    iget-object p1, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {p1}, Lva3/f;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    iget-object p0, p0, Lva3/f;->a:Ljava/lang/String;

    const/16 v0, 0x2e

    const/16 v2, 0x2f

    invoke-static {p0, v0, v2}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v2, v0, Lr93/e;

    if-eqz v2, :cond_3

    move-object v2, v0

    check-cast v2, Lr93/e;

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_4

    invoke-static {v2, p1}, Ldp/d;->t(Lr93/e;Loa3/m;)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x24

    invoke-static {p1, p0, v1}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected container: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static u(Landroid/content/Context;)Landroid/widget/EdgeEffect;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Ld2/b;->b(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lf0/k0;

    invoke-direct {v0, p0}, Lf0/k0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static final v(Ljava/util/List;)[Ljava/nio/ByteBuffer;
    .locals 8

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const-string v2, "Check failed."

    if-nez v1, :cond_4

    sget-object v1, Lio/github/crow_misia/libyuv/Yuv;->INSTANCE:Lio/github/crow_misia/libyuv/Yuv;

    move-object v3, p0

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr53/d;

    iget v6, v6, Lr53/d;->a:I

    add-int/2addr v5, v6

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v5}, Lio/github/crow_misia/libyuv/Yuv;->allocNativeBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v2

    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    new-array v3, v3, [Ljava/nio/ByteBuffer;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move v5, v4

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr53/d;

    iget v6, v6, Lr53/d;->a:I

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    add-int/2addr v4, v6

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    add-int/lit8 v6, v5, 0x1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v7

    aput-object v7, v3, v5

    move v5, v6

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    if-gt v4, v2, :cond_2

    aput-object v1, v3, v5

    invoke-static {v3}, Lm83/n;->I0([Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-object v3

    :cond_2
    :try_start_1
    const-string p0, "buffer limit is bigger than expected"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final w(Ljava/lang/String;)Lzy/b;
    .locals 2

    if-eqz p0, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lm83/y;->w:Lm83/y;

    const v1, 0x7f1410a8

    invoke-static {v1, p0, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final x(Ln6/i;)Lr6/w;
    .locals 6

    invoke-static {}, Lr6/w;->A()Lr6/v;

    move-result-object v0

    instance-of v1, p0, Lv6/j;

    if-eqz v1, :cond_0

    sget-object v1, Lr6/x;->z:Lr6/x;

    goto :goto_0

    :cond_0
    instance-of v1, p0, Lv6/l;

    if-eqz v1, :cond_2

    move-object v1, p0

    check-cast v1, Lv6/l;

    iget-object v1, v1, Lv6/l;->c:Ln6/o;

    invoke-static {v1}, Lbp/b;->A(Ln6/o;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lr6/x;->I:Lr6/x;

    goto :goto_0

    :cond_1
    sget-object v1, Lr6/x;->x:Lr6/x;

    goto :goto_0

    :cond_2
    instance-of v1, p0, Lv6/k;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, Lv6/k;

    iget-object v1, v1, Lv6/k;->c:Ln6/o;

    invoke-static {v1}, Lbp/b;->A(Ln6/o;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lr6/x;->J:Lr6/x;

    goto :goto_0

    :cond_3
    sget-object v1, Lr6/x;->y:Lr6/x;

    goto :goto_0

    :cond_4
    instance-of v1, p0, Lz6/a;

    if-eqz v1, :cond_5

    sget-object v1, Lr6/x;->E:Lr6/x;

    goto :goto_0

    :cond_5
    instance-of v1, p0, Lv6/m;

    if-eqz v1, :cond_6

    sget-object v1, Lr6/x;->F:Lr6/x;

    goto :goto_0

    :cond_6
    instance-of v1, p0, Ln6/j;

    if-eqz v1, :cond_7

    sget-object v1, Lr6/x;->H:Lr6/x;

    goto :goto_0

    :cond_7
    instance-of v1, p0, Lp6/m1;

    if-eqz v1, :cond_8

    sget-object v1, Lr6/x;->G:Lr6/x;

    goto :goto_0

    :cond_8
    instance-of v1, p0, Lp6/w;

    if-eqz v1, :cond_17

    sget-object v1, Lr6/x;->K:Lr6/x;

    :goto_0
    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v2, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v2, Lr6/w;

    invoke-static {v2, v1}, Lr6/w;->n(Lr6/w;Lr6/x;)V

    invoke-interface {p0}, Ln6/i;->c()Ln6/o;

    move-result-object v1

    sget-object v2, Lp6/b1;->T:Lp6/b1;

    const/4 v3, 0x0

    invoke-interface {v1, v3, v2}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv6/v;

    sget-object v2, La7/d;->a:La7/d;

    if-eqz v1, :cond_9

    iget-object v1, v1, Lv6/v;->a:La7/e;

    goto :goto_1

    :cond_9
    move-object v1, v2

    :goto_1
    invoke-static {v1}, Ldp/d;->Y(La7/e;)Lr6/p;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v4, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v4, Lr6/w;

    invoke-static {v4, v1}, Lr6/w;->o(Lr6/w;Lr6/p;)V

    invoke-interface {p0}, Ln6/i;->c()Ln6/o;

    move-result-object v1

    sget-object v4, Lp6/b1;->U:Lp6/b1;

    invoke-interface {v1, v3, v4}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv6/n;

    if-eqz v1, :cond_a

    iget-object v2, v1, Lv6/n;->a:La7/e;

    :cond_a
    invoke-static {v2}, Ldp/d;->Y(La7/e;)Lr6/p;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v2, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v2, Lr6/w;

    invoke-static {v2, v1}, Lr6/w;->p(Lr6/w;Lr6/p;)V

    invoke-interface {p0}, Ln6/i;->c()Ln6/o;

    move-result-object v1

    sget-object v2, Lp6/b1;->R:Lp6/b1;

    invoke-interface {v1, v3, v2}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_b

    move v1, v4

    goto :goto_2

    :cond_b
    move v1, v2

    :goto_2
    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v5, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v5, Lr6/w;

    invoke-static {v5, v1}, Lr6/w;->u(Lr6/w;Z)V

    invoke-interface {p0}, Ln6/i;->c()Ln6/o;

    move-result-object v1

    sget-object v5, Lp6/b1;->S:Lp6/b1;

    invoke-interface {v1, v3, v5}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v1, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v1, Lr6/w;

    invoke-static {v1}, Lr6/w;->t(Lr6/w;)V

    :cond_c
    instance-of v1, p0, Ln6/j;

    if-eqz v1, :cond_11

    move-object v1, p0

    check-cast v1, Ln6/j;

    iget v3, v1, Ln6/j;->d:I

    if-ne v3, v4, :cond_d

    sget-object v3, Lr6/o;->x:Lr6/o;

    goto :goto_3

    :cond_d
    if-nez v3, :cond_e

    sget-object v3, Lr6/o;->y:Lr6/o;

    goto :goto_3

    :cond_e
    const/4 v5, 0x2

    if-ne v3, v5, :cond_10

    sget-object v3, Lr6/o;->z:Lr6/o;

    :goto_3
    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v5, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v5, Lr6/w;

    invoke-static {v5, v3}, Lr6/w;->s(Lr6/w;Lr6/o;)V

    invoke-static {v1}, Lo73/a;->O(Ln6/j;)Z

    move-result v3

    xor-int/2addr v3, v4

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v5, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v5, Lr6/w;

    invoke-static {v5, v3}, Lr6/w;->w(Lr6/w;Z)V

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v3, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v3, Lr6/w;

    invoke-static {v3}, Lr6/w;->x(Lr6/w;)V

    iget-object v1, v1, Ln6/j;->c:Ljava/lang/Float;

    if-eqz v1, :cond_f

    move v2, v4

    :cond_f
    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v1, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v1, Lr6/w;

    invoke-static {v1, v2}, Lr6/w;->y(Lr6/w;Z)V

    goto/16 :goto_4

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unknown content scale "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Ln6/j;->d:I

    invoke-static {v1}, Lv6/i;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    instance-of v1, p0, Lv6/k;

    if-eqz v1, :cond_12

    move-object v1, p0

    check-cast v1, Lv6/k;

    iget v1, v1, Lv6/k;->e:I

    invoke-static {v1}, Ldp/d;->a0(I)Lr6/q;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v2, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v2, Lr6/w;

    invoke-static {v2, v1}, Lr6/w;->q(Lr6/w;Lr6/q;)V

    goto :goto_4

    :cond_12
    instance-of v1, p0, Lv6/l;

    if-eqz v1, :cond_13

    move-object v1, p0

    check-cast v1, Lv6/l;

    iget v1, v1, Lv6/l;->e:I

    invoke-static {v1}, Ldp/d;->Z(I)Lr6/y;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v2, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v2, Lr6/w;

    invoke-static {v2, v1}, Lr6/w;->r(Lr6/w;Lr6/y;)V

    goto :goto_4

    :cond_13
    instance-of v1, p0, Lv6/j;

    if-eqz v1, :cond_14

    move-object v1, p0

    check-cast v1, Lv6/j;

    iget-object v2, v1, Lv6/j;->d:Lv6/c;

    iget v2, v2, Lv6/c;->a:I

    invoke-static {v2}, Ldp/d;->a0(I)Lr6/q;

    move-result-object v2

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v3, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v3, Lr6/w;

    invoke-static {v3, v2}, Lr6/w;->q(Lr6/w;Lr6/q;)V

    iget-object v1, v1, Lv6/j;->d:Lv6/c;

    iget v1, v1, Lv6/c;->b:I

    invoke-static {v1}, Ldp/d;->Z(I)Lr6/y;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v2, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v2, Lr6/w;

    invoke-static {v2, v1}, Lr6/w;->r(Lr6/w;Lr6/y;)V

    :cond_14
    :goto_4
    instance-of v1, p0, Ln6/k;

    if-eqz v1, :cond_16

    check-cast p0, Ln6/k;

    iget-object p0, p0, Ln6/k;->b:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6/i;

    invoke-static {v2}, Ldp/d;->x(Ln6/i;)Lr6/w;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_15
    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object p0, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast p0, Lr6/w;

    invoke-static {p0, v1}, Lr6/w;->v(Lr6/w;Ljava/util/ArrayList;)V

    :cond_16
    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object p0

    check-cast p0, Lr6/w;

    return-object p0

    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown element type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "TRuntime."

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x3

    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static z(Lio/sentry/rrweb/e;Ljava/lang/String;Lio/sentry/j3;Lio/sentry/v0;)Z
    .locals 1

    const-string v0, "source"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lio/sentry/clientreport/e;

    const/4 v0, 0x7

    invoke-direct {p1, v0}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {p2, p3, p1}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/rrweb/d;

    const-string p2, ""

    invoke-static {p1, p2}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/rrweb/e;->y:Lio/sentry/rrweb/d;

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public abstract c0([BII)V
.end method
