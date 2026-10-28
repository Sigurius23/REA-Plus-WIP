.class public abstract Lcom/squareup/wire/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lo2/e;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/squareup/wire/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(JJ)J
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    div-long/2addr p0, p2

    return-wide p0

    :cond_0
    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    div-long/2addr p0, p2

    sub-long/2addr p0, v0

    return-wide p0
.end method

.method public static B(IJ)I
    .locals 2

    int-to-long v0, p0

    rem-long/2addr p1, v0

    add-long/2addr p1, v0

    rem-long/2addr p1, v0

    long-to-int p0, p1

    return p0
.end method

.method public static C(Lp1/s0;Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static D(Lp1/s0;Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p0

    return-object p0
.end method

.method public static final E(Llb3/y;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->P(Llb3/y;)Z

    invoke-static {p0}, Lcom/squareup/wire/n;->r(Llb3/y;)I

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    invoke-interface {p0, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

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

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/u0;

    invoke-virtual {v1}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final F(Lp1/t1;Lp1/q;)Lbh/e;
    .locals 0

    invoke-virtual {p1, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbh/e;

    if-nez p0, :cond_0

    sget-object p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p1, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lbh/a;->a(Landroid/content/Context;)Lbh/e;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final G(Lva3/f;)Lp93/k;
    .locals 3

    invoke-virtual {p0}, Lva3/f;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lva3/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lp93/m;->b:Lp93/m;

    invoke-virtual {p0}, Lva3/f;->i()Lva3/e;

    move-result-object v1

    invoke-virtual {v1}, Lva3/e;->b()Lva3/e;

    move-result-object v1

    invoke-virtual {p0}, Lva3/f;->g()Lva3/h;

    move-result-object p0

    invoke-virtual {p0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p0

    const-string v2, "asString(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p0, v1}, Lp93/m;->a(Ljava/lang/String;Lva3/e;)Lp93/l;

    move-result-object p0

    if-eqz p0, :cond_1

    iget-object p0, p0, Lp93/l;->a:Lp93/k;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final H()Lo2/e;
    .locals 12

    sget-object v0, Lcom/squareup/wire/n;->b:Lo2/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lo2/d;

    const/4 v9, 0x0

    const/16 v11, 0x60

    const-string v2, "Filled.Info"

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v11}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v0, Lo2/f0;->a:I

    new-instance v0, Li2/c1;

    sget-wide v2, Li2/x;->b:J

    invoke-direct {v0, v2, v3}, Li2/c1;-><init>(J)V

    new-instance v4, Laa3/u0;

    const/4 v2, 0x5

    invoke-direct {v4, v2}, Laa3/u0;-><init>(I)V

    iget-object v2, v4, Laa3/u0;->a:Ljava/util/ArrayList;

    const/high16 v3, 0x41400000    # 12.0f

    const/high16 v11, 0x40000000    # 2.0f

    invoke-virtual {v4, v3, v11}, Laa3/u0;->t(FF)V

    const/high16 v9, 0x40000000    # 2.0f

    const/high16 v10, 0x41400000    # 12.0f

    const v5, 0x40cf5c29    # 6.48f

    const/high16 v6, 0x40000000    # 2.0f

    const/high16 v7, 0x40000000    # 2.0f

    const v8, 0x40cf5c29    # 6.48f

    invoke-virtual/range {v4 .. v10}, Laa3/u0;->j(FFFFFF)V

    const v5, 0x408f5c29    # 4.48f

    const/high16 v6, 0x41200000    # 10.0f

    invoke-virtual {v4, v5, v6, v6, v6}, Laa3/u0;->u(FFFF)V

    const v5, -0x3f70a3d7    # -4.48f

    const/high16 v7, -0x3ee00000    # -10.0f

    invoke-virtual {v4, v6, v5, v6, v7}, Laa3/u0;->u(FFFF)V

    new-instance v5, Lo2/o;

    const v6, 0x418c28f6    # 17.52f

    invoke-direct {v5, v6, v11, v3, v11}, Lo2/o;-><init>(FFFF)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4}, Laa3/u0;->i()V

    const/high16 v3, 0x41880000    # 17.0f

    const/high16 v5, 0x41500000    # 13.0f

    invoke-virtual {v4, v5, v3}, Laa3/u0;->t(FF)V

    const/high16 v3, -0x40000000    # -2.0f

    invoke-virtual {v4, v3}, Laa3/u0;->q(F)V

    const/high16 v6, -0x3f400000    # -6.0f

    invoke-virtual {v4, v6}, Laa3/u0;->v(F)V

    invoke-virtual {v4, v11}, Laa3/u0;->q(F)V

    const/high16 v6, 0x40c00000    # 6.0f

    invoke-virtual {v4, v6}, Laa3/u0;->v(F)V

    invoke-virtual {v4}, Laa3/u0;->i()V

    const/high16 v6, 0x41100000    # 9.0f

    invoke-virtual {v4, v5, v6}, Laa3/u0;->t(FF)V

    invoke-virtual {v4, v3}, Laa3/u0;->q(F)V

    const/high16 v3, 0x41300000    # 11.0f

    const/high16 v5, 0x40e00000    # 7.0f

    invoke-virtual {v4, v3, v5}, Laa3/u0;->r(FF)V

    invoke-virtual {v4, v11}, Laa3/u0;->q(F)V

    invoke-virtual {v4, v11}, Laa3/u0;->v(F)V

    invoke-virtual {v4}, Laa3/u0;->i()V

    invoke-static {v1, v2, v0}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v1}, Lo2/d;->b()Lo2/e;

    move-result-object v0

    sput-object v0, Lcom/squareup/wire/n;->b:Lo2/e;

    return-object v0
.end method

.method public static final I(Landroid/text/Layout;IZ)I
    .locals 2

    if-gtz p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lt p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/text/Layout;->getLineCount()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0

    :cond_1
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/text/Layout;->getLineStart(I)I

    move-result v1

    invoke-virtual {p0, v0}, Landroid/text/Layout;->getLineEnd(I)I

    move-result p0

    if-eq v1, p1, :cond_2

    if-eq p0, p1, :cond_2

    goto :goto_0

    :cond_2
    if-ne v1, p1, :cond_3

    if-eqz p2, :cond_4

    add-int/lit8 v0, v0, -0x1

    return v0

    :cond_3
    if-eqz p2, :cond_5

    :cond_4
    :goto_0
    return v0

    :cond_5
    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static K(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/16 v0, 0x23

    invoke-static {v0, p0, p0}, Lyb3/r;->J0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x3f

    invoke-static {v0, p0, p0}, Lyb3/r;->J0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2f

    invoke-static {v0, p0, p0}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2e

    const-string v2, ""

    invoke-static {v0, p0, v2}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toLowerCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lki/h;->a:Ln83/f;

    invoke-virtual {v0, p0}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static final L(Llb3/y;)Llb3/y;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->P(Llb3/y;)Z

    invoke-virtual {p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v0

    sget-object v1, Lo93/m;->p:Lva3/e;

    invoke-interface {v0, v1}, Ls93/i;->T(Lva3/e;)Ls93/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/squareup/wire/n;->r(Llb3/y;)I

    move-result v0

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llb3/u0;

    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final M(Llb3/y;)Llb3/y;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->P(Llb3/y;)Z

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llb3/u0;

    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object p0

    const-string v0, "getType(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final N(Llb3/y;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->P(Llb3/y;)Z

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    invoke-static {p0}, Lcom/squareup/wire/n;->r(Llb3/y;)I

    move-result v1

    invoke-static {p0}, Lcom/squareup/wire/n;->O(Llb3/y;)Z

    move-result p0

    add-int/2addr p0, v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, p0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final O(Llb3/y;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->P(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object p0

    sget-object v0, Lo93/m;->p:Lva3/e;

    invoke-interface {p0, v0}, Ls93/i;->T(Lva3/e;)Ls93/b;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final P(Llb3/y;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    if-eqz p0, :cond_3

    instance-of v0, p0, Lr93/e;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lo93/h;->J(Lr93/h;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object p0

    invoke-static {p0}, Lcom/squareup/wire/n;->G(Lva3/f;)Lp93/k;

    move-result-object p0

    :goto_1
    sget-object v0, Lp93/g;->c:Lp93/g;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lp93/j;->c:Lp93/j;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static final Q(Llb3/c0;)Z
    .locals 2

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    instance-of v1, p0, Lr93/e;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lo93/h;->J(Lr93/h;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object p0

    invoke-static {p0}, Lcom/squareup/wire/n;->G(Lva3/f;)Lp93/k;

    move-result-object v0

    :cond_2
    :goto_0
    sget-object p0, Lp93/g;->c:Lp93/g;

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final R(Llb3/y;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    instance-of v1, p0, Lr93/e;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lo93/h;->J(Lr93/h;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object p0

    invoke-static {p0}, Lcom/squareup/wire/n;->G(Lva3/f;)Lp93/k;

    move-result-object v0

    :cond_2
    :goto_0
    sget-object p0, Lp93/j;->c:Lp93/j;

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static S(Lp1/s0;Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p0

    return-object p0
.end method

.method public static T(Landroid/view/View$OnApplyWindowInsetsListener;Landroidx/fragment/app/FragmentContainerView;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    const-string v0, "onApplyWindowInsetsListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Landroid/view/View$OnApplyWindowInsetsListener;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    const-string p1, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static U(Lp1/s0;Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p0

    return-object p0
.end method

.method public static V(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, " must not be null"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static W(JJ)J
    .locals 6

    add-long v0, p0, p2

    xor-long v2, p0, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gez v2, :cond_1

    xor-long v2, p0, p2

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Addition overflows a long: "

    const-string v2, " + "

    invoke-static {p0, p1, v1, v2}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-wide v0
.end method

.method public static X(JI)J
    .locals 7

    const/4 v0, -0x1

    const-string v1, " * "

    const-string v2, "Multiplication overflows a long: "

    if-eq p2, v0, :cond_3

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    int-to-long v3, p2

    mul-long v5, p0, v3

    div-long v3, v5, v3

    cmp-long v0, v3, p0

    if-nez v0, :cond_0

    return-wide v5

    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-wide p0

    :cond_2
    const-wide/16 p0, 0x0

    return-wide p0

    :cond_3
    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v0, p0, v3

    if-eqz v0, :cond_4

    neg-long p0, p0

    return-wide p0

    :cond_4
    new-instance v0, Ljava/lang/ArithmeticException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static Y(JJ)J
    .locals 7

    const-wide/16 v0, 0x1

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-wide p0

    :cond_0
    cmp-long v0, p0, v0

    if-nez v0, :cond_1

    return-wide p2

    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-eqz v2, :cond_6

    cmp-long v2, p2, v0

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    mul-long v0, p0, p2

    div-long v2, v0, p2

    cmp-long v2, v2, p0

    if-nez v2, :cond_5

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, p0, v2

    const-wide/16 v5, -0x1

    if-nez v4, :cond_3

    cmp-long v4, p2, v5

    if-eqz v4, :cond_5

    :cond_3
    cmp-long v2, p2, v2

    if-nez v2, :cond_4

    cmp-long v2, p0, v5

    if-eqz v2, :cond_5

    :cond_4
    return-wide v0

    :cond_5
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Multiplication overflows a long: "

    const-string v2, " * "

    invoke-static {p0, p1, v1, v2}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_0
    return-wide v0
.end method

.method public static Z(I)I
    .locals 3

    add-int/lit8 v0, p0, -0x1

    xor-int v1, p0, v0

    if-gez v1, :cond_1

    xor-int/lit8 v1, p0, 0x1

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Subtraction overflows an int: "

    const-string v2, " - 1"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return v0
.end method

.method public static final a(IJLandroidx/compose/runtime/Composer;Lc93/m;Lp6/u1;)V
    .locals 20

    move-wide/from16 v2, p1

    move-object/from16 v1, p5

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v0, 0x158f9873

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v4, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    or-int v0, p0, v0

    invoke-virtual {v7, v2, v3}, Lp1/q;->f(J)Z

    move-result v5

    const/16 v6, 0x20

    if-eqz v5, :cond_1

    move v5, v6

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v0, v5

    move-object/from16 v8, p4

    invoke-virtual {v7, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v0, v5

    and-int/lit16 v5, v0, 0x93

    const/16 v9, 0x92

    if-ne v5, v9, :cond_4

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_4
    :goto_3
    instance-of v5, v1, Lp6/t1;

    const/16 v9, 0xa

    if-eqz v5, :cond_5

    new-instance v4, Ly3/h;

    invoke-direct {v4, v2, v3}, Ly3/h;-><init>(J)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    goto/16 :goto_f

    :cond_5
    instance-of v5, v1, Lp6/r1;

    const/4 v10, 0x1

    const/16 v11, 0x1f

    const/4 v12, 0x0

    if-eqz v5, :cond_10

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v11, :cond_e

    const v4, 0x1161fb4e

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lp6/q;->a:Lp1/b0;

    invoke-virtual {v7, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    and-int/lit8 v5, v0, 0x70

    if-ne v5, v6, :cond_6

    goto :goto_4

    :cond_6
    move v10, v12

    :goto_4
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v10, :cond_7

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_8

    :cond_7
    new-instance v5, Lp6/o1;

    invoke-direct {v5, v2, v3}, Lp6/o1;-><init>(J)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lc93/a;

    const-string v6, "appWidgetSizes"

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_6

    :cond_9
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v6, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/util/SizeF;

    invoke-virtual {v6}, Landroid/util/SizeF;->getWidth()F

    move-result v10

    invoke-virtual {v6}, Landroid/util/SizeF;->getHeight()F

    move-result v6

    invoke-static {v10, v6}, Lvf3/b;->a(FF)J

    move-result-wide v10

    new-instance v6, Ly3/h;

    invoke-direct {v6, v10, v11}, Ly3/h;-><init>(J)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    :goto_6
    const-string v6, "appWidgetMinHeight"

    invoke-virtual {v4, v6, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    const-string v10, "appWidgetMaxHeight"

    invoke-virtual {v4, v10, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v10

    const-string v11, "appWidgetMinWidth"

    invoke-virtual {v4, v11, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v11

    const-string v13, "appWidgetMaxWidth"

    invoke-virtual {v4, v13, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    if-eqz v6, :cond_c

    if-eqz v10, :cond_c

    if-eqz v11, :cond_c

    if-nez v4, :cond_b

    goto :goto_7

    :cond_b
    int-to-float v5, v11

    int-to-float v10, v10

    invoke-static {v5, v10}, Lvf3/b;->a(FF)J

    move-result-wide v10

    new-instance v5, Ly3/h;

    invoke-direct {v5, v10, v11}, Ly3/h;-><init>(J)V

    int-to-float v4, v4

    int-to-float v6, v6

    invoke-static {v4, v6}, Lvf3/b;->a(FF)J

    move-result-wide v10

    new-instance v4, Ly3/h;

    invoke-direct {v4, v10, v11}, Ly3/h;-><init>(J)V

    filled-new-array {v5, v4}, [Ly3/h;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_8

    :cond_c
    :goto_7
    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :cond_d
    :goto_8
    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    const v4, 0x116392e8

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lp6/q;->a:Lp1/b0;

    invoke-virtual {v7, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    invoke-static {v4}, Lvd/e;->v(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_f

    new-instance v4, Ly3/h;

    invoke-direct {v4, v2, v3}, Ly3/h;-><init>(J)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :cond_f
    check-cast v4, Ljava/util/List;

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    :goto_9
    check-cast v4, Ljava/util/Collection;

    goto/16 :goto_f

    :cond_10
    instance-of v5, v1, Lp6/s1;

    if-eqz v5, :cond_1f

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v11, :cond_11

    const v4, 0x1167aaf9

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    move-object v4, v1

    check-cast v4, Lp6/s1;

    iget-object v4, v4, Lp6/s1;->a:Ljava/util/Set;

    check-cast v4, Ljava/util/Collection;

    goto/16 :goto_f

    :cond_11
    const v5, 0x1168b6d5

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    move-object v5, v1

    check-cast v5, Lp6/s1;

    iget-object v5, v5, Lp6/s1;->a:Ljava/util/Set;

    check-cast v5, Ljava/util/Collection;

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Lov2/f;

    const/16 v11, 0x18

    invoke-direct {v6, v11}, Lov2/f;-><init>(I)V

    new-instance v11, Lov2/f;

    const/16 v13, 0x19

    invoke-direct {v11, v13}, Lov2/f;-><init>(I)V

    new-array v4, v4, [Lkotlin/jvm/functions/Function1;

    aput-object v6, v4, v12

    aput-object v11, v4, v10

    invoke-static {v4}, Lq83/g;->p([Lkotlin/jvm/functions/Function1;)Lea2/l;

    move-result-object v4

    invoke-static {v5, v4}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/h;

    iget-wide v13, v4, Ly3/h;->a:J

    sget-object v4, Lp6/q;->a:Lp1/b0;

    invoke-virtual {v7, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    invoke-static {v4}, Lvd/e;->v(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v4

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly3/h;

    move-wide v15, v13

    iget-wide v12, v11, Ly3/h;->a:J

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    const/16 v18, 0x0

    if-eqz v17, :cond_14

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v9, v17

    check-cast v9, Ly3/h;

    move-object/from16 v19, v11

    iget-wide v10, v9, Ly3/h;->a:J

    invoke-static {v12, v13}, Ly3/h;->c(J)F

    move-result v9

    float-to-double v1, v9

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    const/4 v2, 0x1

    int-to-float v3, v2

    add-float/2addr v1, v3

    invoke-static {v10, v11}, Ly3/h;->c(J)F

    move-result v9

    cmpl-float v1, v1, v9

    if-lez v1, :cond_12

    invoke-static {v12, v13}, Ly3/h;->b(J)F

    move-result v1

    move v9, v3

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    add-float/2addr v1, v9

    invoke-static {v10, v11}, Ly3/h;->b(J)F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_12

    new-instance v1, Ly3/h;

    invoke-direct {v1, v10, v11}, Ly3/h;-><init>(J)V

    invoke-static {v12, v13}, Ly3/h;->c(J)F

    move-result v2

    invoke-static {v10, v11}, Ly3/h;->c(J)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v12, v13}, Ly3/h;->b(J)F

    move-result v3

    invoke-static {v10, v11}, Ly3/h;->b(J)F

    move-result v9

    sub-float/2addr v3, v9

    mul-float/2addr v2, v2

    mul-float/2addr v3, v3

    add-float/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_c

    :cond_12
    move-object/from16 v3, v18

    :goto_c
    move-object/from16 v1, v19

    if-eqz v3, :cond_13

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    move-wide/from16 v2, p1

    move-object v11, v1

    const/16 v9, 0xa

    const/4 v10, 0x1

    move-object/from16 v1, p5

    goto :goto_b

    :cond_14
    move-object v1, v11

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_15

    move-object/from16 v2, v18

    goto :goto_d

    :cond_15
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_16

    goto :goto_d

    :cond_16
    move-object v3, v2

    check-cast v3, Ll83/k;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ll83/k;

    iget-object v10, v10, Ll83/k;->x:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    invoke-static {v3, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v11

    if-lez v11, :cond_18

    move-object v2, v9

    move v3, v10

    :cond_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_17

    :goto_d
    check-cast v2, Ll83/k;

    if-eqz v2, :cond_19

    iget-object v1, v2, Ll83/k;->w:Ljava/lang/Object;

    move-object/from16 v18, v1

    check-cast v18, Ly3/h;

    :cond_19
    move-object/from16 v1, v18

    if-eqz v1, :cond_1a

    iget-wide v1, v1, Ly3/h;->a:J

    goto :goto_e

    :cond_1a
    move-wide v1, v15

    :goto_e
    new-instance v3, Ly3/h;

    invoke-direct {v3, v1, v2}, Ly3/h;-><init>(J)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide/from16 v2, p1

    move-object/from16 v1, p5

    move-wide v13, v15

    const/16 v9, 0xa

    const/4 v10, 0x1

    const/4 v12, 0x0

    goto/16 :goto_a

    :cond_1b
    move-wide v15, v13

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1c

    new-instance v1, Ly3/h;

    move-wide v2, v15

    invoke-direct {v1, v2, v3}, Ly3/h;-><init>(J)V

    new-instance v4, Ly3/h;

    invoke-direct {v4, v2, v3}, Ly3/h;-><init>(J)V

    filled-new-array {v1, v4}, [Ly3/h;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    :cond_1c
    check-cast v6, Ljava/util/List;

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    move-object v4, v6

    check-cast v4, Ljava/util/Collection;

    :goto_f
    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/h;

    iget-wide v5, v3, Ly3/h;->a:J

    shl-int/lit8 v3, v0, 0x3

    and-int/lit8 v3, v3, 0x70

    and-int/lit16 v4, v0, 0x380

    or-int/2addr v4, v3

    move-object/from16 v9, p5

    invoke-static/range {v4 .. v9}, Lcom/squareup/wire/n;->f(IJLandroidx/compose/runtime/Composer;Lc93/m;Lp6/u1;)V

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, p4

    goto :goto_10

    :cond_1d
    :goto_11
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1e

    new-instance v0, Lp6/p1;

    move/from16 v5, p0

    move-wide/from16 v2, p1

    move-object/from16 v4, p4

    move-object/from16 v1, p5

    invoke-direct/range {v0 .. v5}, Lp6/p1;-><init>(Lp6/u1;JLc93/m;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void

    :cond_1f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static a0(JJ)J
    .locals 6

    sub-long v0, p0, p2

    xor-long v2, p0, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gez v2, :cond_1

    xor-long v2, p0, p2

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Subtraction overflows a long: "

    const-string v2, " - "

    invoke-static {p0, p1, v1, v2}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-wide v0
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p4

    const-string v2, "text"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    const v3, -0x44349c37

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_2

    or-int/lit8 v3, v3, 0x30

    :cond_1
    move-object/from16 v5, p1

    goto :goto_2

    :cond_2
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_1

    move-object/from16 v5, p1

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_1

    :cond_3
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v3, v6

    :goto_2
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_4

    move/from16 v7, p2

    invoke-virtual {v2, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v3, v8

    :goto_4
    and-int/lit16 v8, v3, 0x93

    const/16 v9, 0x92

    if-ne v8, v9, :cond_8

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v21, v2

    move-object v2, v5

    move v3, v7

    goto/16 :goto_8

    :cond_8
    :goto_5
    if-eqz v4, :cond_9

    sget-object v4, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v4, v5

    :goto_6
    if-eqz v6, :cond_a

    const/4 v5, 0x1

    goto :goto_7

    :cond_a
    move v5, v7

    :goto_7
    invoke-static {v2}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v6

    iget-wide v6, v6, Ld40/n;->e:J

    invoke-static {v2}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v8

    iget-object v9, v8, Lg1/h9;->f:Ll3/v0;

    new-instance v8, Ll3/g0;

    invoke-direct {v8, v5}, Ll3/g0;-><init>(Z)V

    const/16 v22, 0x0

    const v23, 0xf7ffff

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v21, v8

    invoke-static/range {v9 .. v23}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v20

    and-int/lit8 v22, v3, 0x7e

    const/16 v23, 0x0

    const v24, 0xfff8

    move-object v1, v4

    move v3, v5

    const-wide/16 v4, 0x0

    move-object/from16 v21, v2

    move-wide/from16 v26, v6

    move v7, v3

    move-wide/from16 v2, v26

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v11, v9

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object v2, v1

    move/from16 v3, v25

    :goto_8
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lg40/j1;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lg40/j1;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZIII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static b0(J)I
    .locals 2

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    const-wide/32 v0, -0x80000000

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    long-to-int p0, p0

    return p0

    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Calculation overflows an int: "

    invoke-static {p0, p1, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lq0/y;Ll0/k1;Lh0/d2;Lh0/p3;ZLf0/k;IFLq0/e;Lt2/a;Lb2/f;Lb2/g;Li0/n;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 42

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p4

    move/from16 v15, p5

    move/from16 v8, p7

    move/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v2, p10

    move-object/from16 v11, p11

    move-object/from16 v10, p12

    move-object/from16 v14, p13

    move/from16 v9, p16

    move/from16 v12, p17

    move-object/from16 v13, p15

    check-cast v13, Lp1/q;

    const v4, -0x22247a99

    invoke-virtual {v13, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v9, 0x6

    const/16 v16, 0x2

    move/from16 p15, v4

    if-nez p15, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_0

    const/16 v17, 0x4

    goto :goto_0

    :cond_0
    move/from16 v17, v16

    :goto_0
    or-int v17, v9, v17

    goto :goto_1

    :cond_1
    move/from16 v17, v9

    :goto_1
    and-int/lit8 v18, v9, 0x30

    const/16 v19, 0x10

    if-nez v18, :cond_3

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2

    const/16 v18, 0x20

    goto :goto_2

    :cond_2
    move/from16 v18, v19

    :goto_2
    or-int v17, v17, v18

    :cond_3
    and-int/lit16 v4, v9, 0x180

    const/16 v20, 0x80

    move/from16 v21, v4

    if-nez v21, :cond_5

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_4

    const/16 v21, 0x100

    goto :goto_3

    :cond_4
    move/from16 v21, v20

    :goto_3
    or-int v17, v17, v21

    :cond_5
    and-int/lit16 v4, v9, 0xc00

    const/4 v1, 0x0

    const/16 v22, 0x400

    move/from16 v23, v4

    if-nez v23, :cond_7

    invoke-virtual {v13, v1}, Lp1/q;->h(Z)Z

    move-result v23

    if-eqz v23, :cond_6

    const/16 v23, 0x800

    goto :goto_4

    :cond_6
    move/from16 v23, v22

    :goto_4
    or-int v17, v17, v23

    :cond_7
    and-int/lit16 v1, v9, 0x6000

    const/16 v24, 0x2000

    if-nez v1, :cond_9

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v13, v1}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x4000

    goto :goto_5

    :cond_8
    move/from16 v1, v24

    :goto_5
    or-int v17, v17, v1

    :cond_9
    const/high16 v1, 0x30000

    and-int v25, v9, v1

    const/high16 v26, 0x10000

    move/from16 v27, v1

    if-nez v25, :cond_b

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_a

    const/high16 v25, 0x20000

    goto :goto_6

    :cond_a
    move/from16 v25, v26

    :goto_6
    or-int v17, v17, v25

    :cond_b
    const/high16 v25, 0x180000

    and-int v28, v9, v25

    const/high16 v29, 0x80000

    if-nez v28, :cond_d

    invoke-virtual {v13, v15}, Lp1/q;->h(Z)Z

    move-result v28

    if-eqz v28, :cond_c

    const/high16 v28, 0x100000

    goto :goto_7

    :cond_c
    move/from16 v28, v29

    :goto_7
    or-int v17, v17, v28

    :cond_d
    const/high16 v28, 0xc00000

    and-int v30, v9, v28

    move-object/from16 v1, p6

    if-nez v30, :cond_f

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_e

    const/high16 v31, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v31, 0x400000

    :goto_8
    or-int v17, v17, v31

    :cond_f
    const/high16 v31, 0x6000000

    and-int v32, v9, v31

    if-nez v32, :cond_11

    invoke-virtual {v13, v8}, Lp1/q;->e(I)Z

    move-result v32

    if-eqz v32, :cond_10

    const/high16 v32, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v32, 0x2000000

    :goto_9
    or-int v17, v17, v32

    :cond_11
    const/high16 v32, 0x30000000

    and-int v33, v9, v32

    if-nez v33, :cond_13

    invoke-virtual {v13, v6}, Lp1/q;->d(F)Z

    move-result v33

    if-eqz v33, :cond_12

    const/high16 v33, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v33, 0x10000000

    :goto_a
    or-int v17, v17, v33

    :cond_13
    and-int/lit8 v33, v12, 0x6

    if-nez v33, :cond_15

    invoke-virtual {v13, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_14

    const/16 v16, 0x4

    :cond_14
    or-int v16, v12, v16

    goto :goto_b

    :cond_15
    move/from16 v16, v12

    :goto_b
    and-int/lit8 v33, v12, 0x30

    if-nez v33, :cond_17

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_16

    const/16 v19, 0x20

    :cond_16
    or-int v16, v16, v19

    :cond_17
    and-int/lit16 v4, v12, 0x180

    const/4 v1, 0x0

    if-nez v4, :cond_19

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    const/16 v20, 0x100

    :cond_18
    or-int v16, v16, v20

    :cond_19
    and-int/lit16 v4, v12, 0xc00

    if-nez v4, :cond_1b

    invoke-virtual {v13, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1a

    const/16 v22, 0x800

    :cond_1a
    or-int v16, v16, v22

    :cond_1b
    and-int/lit16 v4, v12, 0x6000

    if-nez v4, :cond_1d

    invoke-virtual {v13, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1c

    const/16 v24, 0x4000

    :cond_1c
    or-int v16, v16, v24

    :cond_1d
    and-int v4, v12, v27

    if-nez v4, :cond_1f

    invoke-virtual {v13, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1e

    const/high16 v26, 0x20000

    :cond_1e
    or-int v16, v16, v26

    :cond_1f
    and-int v4, v12, v25

    if-nez v4, :cond_21

    move-object/from16 v4, p14

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_20

    const/high16 v29, 0x100000

    :cond_20
    or-int v16, v16, v29

    :goto_c
    move/from16 v1, v16

    goto :goto_d

    :cond_21
    move-object/from16 v4, p14

    goto :goto_c

    :goto_d
    const v16, 0x12492493

    and-int v2, v17, v16

    const v9, 0x12492492

    const/16 v16, 0x1

    if-ne v2, v9, :cond_23

    const v2, 0x92493

    and-int/2addr v2, v1

    const v9, 0x92492

    if-eq v2, v9, :cond_22

    goto :goto_e

    :cond_22
    const/4 v2, 0x0

    goto :goto_f

    :cond_23
    :goto_e
    move/from16 v2, v16

    :goto_f
    and-int/lit8 v9, v17, 0x1

    invoke-virtual {v13, v9, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_69

    if-ltz v8, :cond_24

    goto :goto_10

    :cond_24
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v9, "beyondViewportPageCount should be greater than or equal to 0, you selected "

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_10
    and-int/lit8 v2, v17, 0x70

    const/16 v9, 0x20

    if-ne v2, v9, :cond_25

    move/from16 v22, v16

    goto :goto_11

    :cond_25
    const/16 v22, 0x0

    :goto_11
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v22, :cond_26

    if-ne v9, v15, :cond_27

    :cond_26
    new-instance v9, Lq0/c;

    const/4 v12, 0x0

    invoke-direct {v9, v3, v12}, Lq0/c;-><init>(Lq0/y;I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v9, Lc93/a;

    shr-int/lit8 v22, v17, 0x3

    and-int/lit8 v24, v22, 0xe

    shr-int/lit8 v12, v1, 0xf

    and-int/lit8 v26, v12, 0x70

    or-int v26, v24, v26

    move/from16 v29, v12

    and-int/lit16 v12, v1, 0x380

    or-int v12, v26, v12

    move/from16 v26, v1

    invoke-static {v4, v13}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v1

    move/from16 v33, v12

    const/4 v4, 0x0

    invoke-static {v4, v13}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v12

    and-int/lit8 v4, v33, 0xe

    xor-int/lit8 v4, v4, 0x6

    const/4 v0, 0x4

    if-le v4, v0, :cond_28

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_29

    :cond_28
    and-int/lit8 v4, v33, 0x6

    if-ne v4, v0, :cond_2a

    :cond_29
    move/from16 v0, v16

    goto :goto_12

    :cond_2a
    const/4 v0, 0x0

    :goto_12
    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v13, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_2b

    if-ne v4, v15, :cond_2c

    :cond_2b
    sget-object v0, Lp1/v0;->z:Lp1/v0;

    new-instance v4, Llq2/q;

    invoke-direct {v4, v1, v12, v9}, Llq2/q;-><init>(Lp1/c1;Lp1/c1;Lc93/a;)V

    invoke-static {v4, v0}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    move-result-object v1

    new-instance v4, Lox0/b;

    const/16 v9, 0x19

    invoke-direct {v4, v9, v1, v3}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v0}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    move-result-object v38

    new-instance v34, Lhc3/j;

    const/16 v35, 0x0

    const/16 v36, 0x7

    const-class v37, Lp1/t2;

    const-string v39, "value"

    const-string v40, "getValue()Ljava/lang/Object;"

    invoke-direct/range {v34 .. v40}, Lhc3/j;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, v34

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v4, Lj93/u;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_2d

    invoke-static {v13}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v0

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v0, Lbc3/c0;

    const/16 v9, 0x20

    if-ne v2, v9, :cond_2e

    move/from16 v1, v16

    goto :goto_13

    :cond_2e
    const/4 v1, 0x0

    :goto_13
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v1, :cond_2f

    if-ne v9, v15, :cond_30

    :cond_2f
    new-instance v9, Lq0/c;

    const/4 v1, 0x1

    invoke-direct {v9, v3, v1}, Lq0/c;-><init>(Lq0/y;I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    check-cast v9, Lc93/a;

    const v1, 0xfff0

    and-int v1, v17, v1

    shr-int/lit8 v12, v17, 0x9

    const/high16 v33, 0x70000

    and-int v34, v12, v33

    or-int v1, v1, v34

    const/high16 v34, 0x380000

    and-int v12, v12, v34

    or-int/2addr v1, v12

    shl-int/lit8 v12, v26, 0x15

    const/high16 v35, 0x1c00000

    and-int v12, v12, v35

    or-int/2addr v1, v12

    shl-int/lit8 v12, v26, 0xf

    const/high16 v26, 0xe000000

    and-int v36, v12, v26

    or-int v1, v1, v36

    const/high16 v36, 0x70000000

    and-int v12, v12, v36

    or-int/2addr v1, v12

    and-int/lit8 v12, v1, 0x70

    xor-int/lit8 v12, v12, 0x30

    move/from16 v37, v2

    const/16 v2, 0x20

    if-le v12, v2, :cond_31

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_32

    :cond_31
    and-int/lit8 v12, v1, 0x30

    if-ne v12, v2, :cond_33

    :cond_32
    move/from16 v12, v16

    goto :goto_14

    :cond_33
    const/4 v12, 0x0

    :goto_14
    and-int/lit16 v2, v1, 0x380

    xor-int/lit16 v2, v2, 0x180

    const/16 v3, 0x100

    if-le v2, v3, :cond_34

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_35

    :cond_34
    and-int/lit16 v2, v1, 0x180

    if-ne v2, v3, :cond_36

    :cond_35
    move/from16 v2, v16

    goto :goto_15

    :cond_36
    const/4 v2, 0x0

    :goto_15
    or-int/2addr v2, v12

    and-int/lit16 v3, v1, 0x1c00

    xor-int/lit16 v3, v3, 0xc00

    const/16 v12, 0x800

    if-le v3, v12, :cond_37

    const/4 v3, 0x0

    invoke-virtual {v13, v3}, Lp1/q;->h(Z)Z

    move-result v21

    if-nez v21, :cond_38

    :cond_37
    and-int/lit16 v3, v1, 0xc00

    if-ne v3, v12, :cond_39

    :cond_38
    move/from16 v3, v16

    goto :goto_16

    :cond_39
    const/4 v3, 0x0

    :goto_16
    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v3, v1

    xor-int/lit16 v3, v3, 0x6000

    const/16 v12, 0x4000

    if-le v3, v12, :cond_3a

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v13, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-nez v3, :cond_3b

    :cond_3a
    and-int/lit16 v3, v1, 0x6000

    if-ne v3, v12, :cond_3c

    :cond_3b
    move/from16 v3, v16

    goto :goto_17

    :cond_3c
    const/4 v3, 0x0

    :goto_17
    or-int/2addr v2, v3

    and-int v3, v1, v26

    xor-int v3, v3, v31

    const/high16 v12, 0x4000000

    if-le v3, v12, :cond_3d

    invoke-virtual {v13, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3e

    :cond_3d
    and-int v3, v1, v31

    if-ne v3, v12, :cond_3f

    :cond_3e
    move/from16 v3, v16

    goto :goto_18

    :cond_3f
    const/4 v3, 0x0

    :goto_18
    or-int/2addr v2, v3

    and-int v3, v1, v36

    xor-int v3, v3, v32

    const/high16 v12, 0x20000000

    if-le v3, v12, :cond_40

    invoke-virtual {v13, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_41

    :cond_40
    and-int v3, v1, v32

    if-ne v3, v12, :cond_42

    :cond_41
    move/from16 v3, v16

    goto :goto_19

    :cond_42
    const/4 v3, 0x0

    :goto_19
    or-int/2addr v2, v3

    and-int v3, v1, v34

    xor-int v3, v3, v25

    const/high16 v12, 0x100000

    if-le v3, v12, :cond_43

    invoke-virtual {v13, v6}, Lp1/q;->d(F)Z

    move-result v3

    if-nez v3, :cond_44

    :cond_43
    and-int v3, v1, v25

    if-ne v3, v12, :cond_45

    :cond_44
    move/from16 v3, v16

    goto :goto_1a

    :cond_45
    const/4 v3, 0x0

    :goto_1a
    or-int/2addr v2, v3

    and-int v3, v1, v35

    xor-int v3, v3, v28

    const/high16 v12, 0x800000

    if-le v3, v12, :cond_46

    invoke-virtual {v13, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_47

    :cond_46
    and-int v3, v1, v28

    if-ne v3, v12, :cond_48

    :cond_47
    move/from16 v3, v16

    goto :goto_1b

    :cond_48
    const/4 v3, 0x0

    :goto_1b
    or-int/2addr v2, v3

    and-int/lit8 v3, v29, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v12, 0x4

    if-le v3, v12, :cond_49

    invoke-virtual {v13, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4a

    :cond_49
    and-int/lit8 v3, v29, 0x6

    if-ne v3, v12, :cond_4b

    :cond_4a
    move/from16 v3, v16

    goto :goto_1c

    :cond_4b
    const/4 v3, 0x0

    :goto_1c
    or-int/2addr v2, v3

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    and-int v3, v1, v33

    xor-int v3, v3, v27

    const/high16 v12, 0x20000

    if-le v3, v12, :cond_4c

    invoke-virtual {v13, v8}, Lp1/q;->e(I)Z

    move-result v3

    if-nez v3, :cond_4d

    :cond_4c
    and-int v1, v1, v27

    if-ne v1, v12, :cond_4e

    :cond_4d
    move/from16 v1, v16

    goto :goto_1d

    :cond_4e
    const/4 v1, 0x0

    :goto_1d
    or-int/2addr v1, v2

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_50

    if-ne v2, v15, :cond_4f

    goto :goto_1e

    :cond_4f
    move-object/from16 v3, p1

    move-object v14, v0

    move-object v11, v4

    move v12, v8

    move-object v1, v13

    const/4 v0, 0x4

    move-object/from16 v4, p3

    goto :goto_1f

    :cond_50
    :goto_1e
    new-instance v2, Lq0/p;

    move-object/from16 v3, p1

    move v12, v8

    move-object v1, v13

    move-object v13, v14

    move-object v14, v0

    move-object v8, v4

    const/4 v0, 0x4

    move-object/from16 v4, p3

    invoke-direct/range {v2 .. v14}, Lq0/p;-><init>(Lq0/y;Lh0/d2;Ll0/k1;FLq0/e;Lj93/u;Lc93/a;Lb2/g;Lb2/f;ILi0/n;Lbc3/c0;)V

    move-object v11, v8

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1f
    move-object v13, v2

    check-cast v13, Lp0/c0;

    sget-object v2, Lh0/d2;->w:Lh0/d2;

    if-ne v4, v2, :cond_51

    move/from16 v5, v16

    goto :goto_20

    :cond_51
    const/4 v5, 0x0

    :goto_20
    xor-int/lit8 v6, v24, 0x6

    if-le v6, v0, :cond_52

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_53

    :cond_52
    and-int/lit8 v6, v22, 0x6

    if-ne v6, v0, :cond_54

    :cond_53
    move/from16 v6, v16

    goto :goto_21

    :cond_54
    const/4 v6, 0x0

    :goto_21
    invoke-virtual {v1, v5}, Lp1/q;->h(Z)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_55

    if-ne v7, v15, :cond_56

    :cond_55
    new-instance v7, Ln0/b;

    const/4 v6, 0x1

    invoke-direct {v7, v3, v5, v6}, Ln0/b;-><init>(Lh0/x2;ZI)V

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_56
    check-cast v7, Lp0/s0;

    move/from16 v5, v37

    const/16 v9, 0x20

    if-ne v5, v9, :cond_57

    move/from16 v6, v16

    goto :goto_22

    :cond_57
    const/4 v6, 0x0

    :goto_22
    and-int v8, v17, v33

    const/high16 v10, 0x20000

    if-ne v8, v10, :cond_58

    move/from16 v8, v16

    goto :goto_23

    :cond_58
    const/4 v8, 0x0

    :goto_23
    or-int/2addr v6, v8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_5a

    if-ne v8, v15, :cond_59

    goto :goto_24

    :cond_59
    move-object/from16 v6, p4

    goto :goto_25

    :cond_5a
    :goto_24
    new-instance v8, Lq0/e0;

    move-object/from16 v6, p4

    invoke-direct {v8, v6, v3}, Lq0/e0;-><init>(Lh0/p3;Lq0/y;)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_25
    check-cast v8, Lq0/e0;

    sget-object v10, Lh0/u;->a:Lp1/b0;

    invoke-virtual {v1, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh0/s;

    if-ne v5, v9, :cond_5b

    move/from16 v5, v16

    goto :goto_26

    :cond_5b
    const/4 v5, 0x0

    :goto_26
    invoke-virtual {v1, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_5c

    if-ne v9, v15, :cond_5d

    :cond_5c
    new-instance v9, Lq0/g;

    invoke-direct {v9, v3, v10}, Lq0/g;-><init>(Lq0/y;Lh0/s;)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5d
    move-object v10, v9

    check-cast v10, Lq0/g;

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz p5, :cond_66

    const v9, -0x32e35cbd

    invoke-virtual {v1, v9}, Lp1/q;->e0(I)V

    shr-int/lit8 v9, v17, 0x15

    and-int/lit8 v9, v9, 0x70

    or-int v9, v24, v9

    and-int/lit8 v17, v9, 0xe

    xor-int/lit8 v6, v17, 0x6

    if-le v6, v0, :cond_5e

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5f

    :cond_5e
    and-int/lit8 v6, v9, 0x6

    if-ne v6, v0, :cond_60

    :cond_5f
    move/from16 v0, v16

    goto :goto_27

    :cond_60
    const/4 v0, 0x0

    :goto_27
    and-int/lit8 v6, v9, 0x70

    xor-int/lit8 v6, v6, 0x30

    move/from16 p15, v0

    const/16 v0, 0x20

    if-le v6, v0, :cond_61

    invoke-virtual {v1, v12}, Lp1/q;->e(I)Z

    move-result v6

    if-nez v6, :cond_62

    :cond_61
    and-int/lit8 v6, v9, 0x30

    if-ne v6, v0, :cond_63

    :cond_62
    move/from16 v0, v16

    goto :goto_28

    :cond_63
    const/4 v0, 0x0

    :goto_28
    or-int v0, p15, v0

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_64

    if-ne v6, v15, :cond_65

    :cond_64
    new-instance v6, Lq0/f;

    invoke-direct {v6, v3, v12}, Lq0/f;-><init>(Lq0/y;I)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_65
    check-cast v6, Lq0/f;

    iget-object v0, v3, Lq0/y;->x:Laj/d;

    invoke-static {v6, v0, v4}, Landroidx/compose/foundation/lazy/layout/a;->a(Lp0/o;Laj/d;Lh0/d2;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    goto :goto_29

    :cond_66
    const/4 v6, 0x0

    const v0, -0x32dccde5    # -1.7112312E8f

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    move-object v0, v5

    :goto_29
    iget-object v6, v3, Lq0/y;->A:Lo0/w;

    move-object/from16 v15, p0

    invoke-interface {v15, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    iget-object v9, v3, Lq0/y;->y:Lp0/d;

    invoke-interface {v6, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v9, p5

    invoke-static {v6, v11, v7, v4, v9}, Landroidx/compose/foundation/lazy/layout/a;->b(Landroidx/compose/ui/Modifier;Lj93/u;Lp0/s0;Lh0/d2;Z)Landroidx/compose/ui/Modifier;

    move-result-object v6

    if-ne v4, v2, :cond_67

    move/from16 v2, v16

    goto :goto_2a

    :cond_67
    const/4 v2, 0x0

    :goto_2a
    if-eqz v9, :cond_68

    new-instance v7, Lam2/i0;

    move-object/from16 v16, v1

    const/16 v1, 0xb

    invoke-direct {v7, v2, v3, v14, v1}, Lam2/i0;-><init>(ZLjava/lang/Object;Ljava/lang/Object;I)V

    const/4 v1, 0x0

    invoke-static {v5, v1, v7}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v6, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_2b

    :cond_68
    move-object/from16 v16, v1

    invoke-interface {v6, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_2b
    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v7, v3, Lq0/y;->r:Lj0/j;

    move-object v6, v8

    const/4 v8, 0x0

    move-object v0, v5

    move v5, v9

    move-object/from16 v9, p6

    invoke-static/range {v2 .. v10}, Landroidx/compose/foundation/a;->j(Landroidx/compose/ui/Modifier;Lh0/x2;Lh0/d2;ZLh0/o1;Lj0/i;ZLf0/k;Lq0/g;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v8, v3

    new-instance v2, La1/f;

    const/4 v3, 0x6

    invoke-direct {v2, v8, v3}, La1/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v8, v2}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, p10

    const/4 v4, 0x0

    invoke-static {v0, v1, v4}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/Modifier;Lt2/a;Lt2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    iget-object v4, v8, Lq0/y;->w:Lp0/l0;

    const/4 v7, 0x0

    move-object v2, v11

    move-object v5, v13

    move-object/from16 v6, v16

    invoke-static/range {v2 .. v7}, Lp0/y;->c(Lc93/a;Landroidx/compose/ui/Modifier;Lp0/l0;Lp0/c0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2c

    :cond_69
    move-object/from16 v15, p0

    move-object/from16 v1, p10

    move v12, v8

    move-object/from16 v16, v13

    move-object v8, v3

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_2c
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_6a

    move-object v2, v0

    new-instance v0, Lch0/k;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v16, p16

    move/from16 v17, p17

    move-object v11, v1

    move-object/from16 v41, v2

    move-object v2, v8

    move v8, v12

    move-object v1, v15

    move-object/from16 v12, p11

    move-object/from16 v15, p14

    invoke-direct/range {v0 .. v17}, Lch0/k;-><init>(Landroidx/compose/ui/Modifier;Lq0/y;Ll0/k1;Lh0/d2;Lh0/p3;ZLf0/k;IFLq0/e;Lt2/a;Lb2/f;Lb2/g;Li0/n;Lx1/b;II)V

    move-object/from16 v2, v41

    iput-object v0, v2, Lp1/v1;->d:Lc93/m;

    :cond_6a
    return-void
.end method

.method public static c0(Lob3/o;Lob3/h;Lob3/h;)Z
    .locals 7

    invoke-interface {p0, p1}, Lob3/o;->g(Lob3/g;)I

    move-result v0

    invoke-interface {p0, p2}, Lob3/o;->g(Lob3/g;)I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_6

    invoke-interface {p0, p1}, Lob3/o;->R(Lob3/g;)Z

    move-result v0

    invoke-interface {p0, p2}, Lob3/o;->R(Lob3/g;)Z

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-interface {p0, p1}, Lob3/o;->m(Lob3/h;)Z

    move-result v0

    invoke-interface {p0, p2}, Lob3/o;->m(Lob3/h;)Z

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-interface {p0, p1}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object v0

    invoke-interface {p0, p2}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Lob3/o;->H(Lob3/l;Lob3/l;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0, p1, p2}, Lob3/o;->V(Lob3/h;Lob3/h;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0, p1}, Lob3/o;->g(Lob3/g;)I

    move-result v0

    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_5

    invoke-interface {p0, p1, v1}, Lob3/o;->K(Lob3/g;I)Lob3/k;

    move-result-object v3

    invoke-interface {p0, p2, v1}, Lob3/o;->K(Lob3/g;I)Lob3/k;

    move-result-object v4

    invoke-interface {p0, v3}, Lob3/o;->B(Lob3/k;)Z

    move-result v5

    invoke-interface {p0, v4}, Lob3/o;->B(Lob3/k;)Z

    move-result v6

    if-eq v5, v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p0, v3}, Lob3/o;->B(Lob3/k;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-interface {p0, v3}, Lob3/o;->i(Lob3/k;)Lob3/p;

    move-result-object v5

    invoke-interface {p0, v4}, Lob3/o;->i(Lob3/k;)Lob3/p;

    move-result-object v6

    if-eq v5, v6, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p0, v3}, Lob3/o;->Z(Lob3/k;)Lob3/g;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p0, v4}, Lob3/o;->Z(Lob3/k;)Lob3/g;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p0, v3, v4}, Lcom/squareup/wire/n;->e0(Lob3/o;Lob3/g;Lob3/g;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_6
    :goto_2
    return v2
.end method

.method public static final d(Ljava/lang/String;Ls20/a;ZLkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v0, p4

    move/from16 v13, p7

    const-string v3, "args"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onFormFieldValuesChanged"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "formElements"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p6

    check-cast v10, Lp1/q;

    const v3, -0xf3029d5

    invoke-virtual {v10, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v13, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v13

    goto :goto_1

    :cond_1
    move v3, v13

    :goto_1
    and-int/lit8 v5, v13, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v13, 0x180

    move/from16 v11, p2

    if-nez v5, :cond_5

    invoke-virtual {v10, v11}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    and-int/lit16 v5, v13, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v3, v5

    :cond_7
    and-int/lit16 v5, v13, 0x6000

    if-nez v5, :cond_9

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v3, v5

    :cond_9
    and-int/lit8 v5, p8, 0x20

    const/high16 v6, 0x30000

    if-eqz v5, :cond_b

    or-int/2addr v3, v6

    :cond_a
    move-object/from16 v6, p5

    goto :goto_7

    :cond_b
    and-int/2addr v6, v13

    if-nez v6, :cond_a

    move-object/from16 v6, p5

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    const/high16 v7, 0x20000

    goto :goto_6

    :cond_c
    const/high16 v7, 0x10000

    :goto_6
    or-int/2addr v3, v7

    :goto_7
    const v7, 0x12493

    and-int/2addr v7, v3

    const v8, 0x12492

    if-ne v7, v8, :cond_e

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {v10}, Lp1/q;->X()V

    goto/16 :goto_c

    :cond_e
    :goto_8
    if-eqz v5, :cond_f

    sget-object v5, Lb2/t;->w:Lb2/t;

    move-object v12, v5

    goto :goto_9

    :cond_f
    move-object v12, v6

    :goto_9
    iget-object v5, v2, Ls20/a;->a:Ljava/lang/String;

    const-string v6, "_"

    invoke-static {v5, v6, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Li20/o;

    invoke-direct {v8, v0, v2}, Li20/o;-><init>(Ljava/util/List;Ls20/a;)V

    const v5, 0x671a9c9b

    invoke-virtual {v10, v5}, Lp1/q;->f0(I)V

    invoke-static {v10}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v6

    if-eqz v6, :cond_12

    instance-of v5, v6, Landroidx/lifecycle/r;

    if-eqz v5, :cond_10

    move-object v5, v6

    check-cast v5, Landroidx/lifecycle/r;

    invoke-interface {v5}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object v5

    :goto_a
    move-object v9, v5

    goto :goto_b

    :cond_10
    sget-object v5, Ll8/a;->b:Ll8/a;

    goto :goto_a

    :goto_b
    const-class v5, Lo20/e;

    sget-object v14, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v14, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v5 .. v10}, Lpf/c;->c0(Lj93/d;Landroidx/lifecycle/f2;Ljava/lang/String;Landroidx/lifecycle/a2;Ll8/c;Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/w1;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    check-cast v5, Lo20/e;

    iget-object v8, v5, Lo20/e;->w:Ljava/util/List;

    iget-object v7, v5, Lo20/e;->y:Ln53/e;

    invoke-static {v7, v10, v6}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v7

    iget-object v9, v5, Lo20/e;->E:Ln53/e;

    invoke-static {v9, v10, v6}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    move v9, v3

    iget-object v3, v2, Ls20/a;->a:Ljava/lang/String;

    iget-object v5, v5, Lo20/e;->z:Lec3/j1;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Set;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    shr-int/lit8 v14, v9, 0x3

    and-int/lit16 v14, v14, 0x3f0

    sget v15, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v15, v15, 0x12

    or-int/2addr v14, v15

    const/high16 v15, 0x1c00000

    shl-int/lit8 v9, v9, 0x6

    and-int/2addr v9, v15

    or-int/2addr v9, v14

    move-object/from16 v16, v5

    move-object v5, v4

    move v4, v11

    move-object v11, v10

    move-object v10, v12

    move v12, v9

    move-object v9, v6

    move-object/from16 v6, v16

    invoke-static/range {v3 .. v12}, Lcom/squareup/wire/n;->e(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lec3/l;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v10

    move-object v10, v11

    move-object v6, v5

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_11

    new-instance v0, Lb30/i2;

    const/4 v9, 0x0

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v8, p8

    move v7, v13

    invoke-direct/range {v0 .. v9}, Lb30/i2;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d0(Lob3/o;Lob3/g;Lob3/g;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lcom/squareup/wire/n;->e0(Lob3/o;Lob3/g;Lob3/g;)Z

    move-result p0

    return p0
.end method

.method public static final e(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lec3/l;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v0, p9

    const-string v2, "paymentMethodCode"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onFormFieldValuesChanged"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "completeFormValues"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "hiddenIdentifiers"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "elements"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p8

    check-cast v10, Lp1/q;

    const v2, 0x39285fb9

    invoke-virtual {v10, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v0, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v0

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_3

    move/from16 v8, p1

    invoke-virtual {v10, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v2, v9

    goto :goto_3

    :cond_3
    move/from16 v8, p1

    :goto_3
    and-int/lit16 v9, v0, 0x180

    const/16 v11, 0x100

    if-nez v9, :cond_5

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    move v9, v11

    goto :goto_4

    :cond_4
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :cond_5
    and-int/lit16 v9, v0, 0xc00

    if-nez v9, :cond_7

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_5

    :cond_6
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v2, v9

    :cond_7
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_9

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_6

    :cond_8
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v2, v9

    :cond_9
    const/high16 v9, 0x30000

    and-int/2addr v9, v0

    if-nez v9, :cond_b

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/high16 v9, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v9, 0x10000

    :goto_7
    or-int/2addr v2, v9

    :cond_b
    const/high16 v9, 0x180000

    and-int/2addr v9, v0

    if-nez v9, :cond_e

    const/high16 v9, 0x200000

    and-int/2addr v9, v0

    if-nez v9, :cond_c

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_8

    :cond_c
    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_8
    if-eqz v9, :cond_d

    const/high16 v9, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v9, 0x80000

    :goto_9
    or-int/2addr v2, v9

    :cond_e
    const/high16 v9, 0xc00000

    and-int/2addr v9, v0

    if-nez v9, :cond_10

    move-object/from16 v9, p7

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/high16 v12, 0x800000

    goto :goto_a

    :cond_f
    const/high16 v12, 0x400000

    :goto_a
    or-int/2addr v2, v12

    goto :goto_b

    :cond_10
    move-object/from16 v9, p7

    :goto_b
    const v12, 0x492493

    and-int/2addr v12, v2

    const v13, 0x492492

    if-ne v12, v13, :cond_12

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v12

    if-nez v12, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v10}, Lp1/q;->X()V

    goto :goto_e

    :cond_12
    :goto_c
    const v12, -0x762930b7

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit16 v13, v2, 0x380

    const/4 v14, 0x0

    if-ne v13, v11, :cond_13

    const/4 v11, 0x1

    goto :goto_d

    :cond_13
    move v11, v14

    :goto_d
    or-int/2addr v11, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_14

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v12, v11, :cond_15

    :cond_14
    new-instance v12, Le;

    const/4 v11, 0x0

    const/16 v13, 0x12

    invoke-direct {v12, v4, v3, v11, v13}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v12, Lc93/m;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-static {v10, v12, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v11, v2, 0xc

    and-int/lit8 v11, v11, 0xe

    and-int/lit8 v12, v2, 0x70

    or-int/2addr v11, v12

    shr-int/lit8 v2, v2, 0x9

    and-int/lit16 v12, v2, 0x380

    or-int/2addr v11, v12

    sget v12, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v12, v12, 0x9

    or-int/2addr v11, v12

    and-int/lit16 v12, v2, 0x1c00

    or-int/2addr v11, v12

    const v12, 0xe000

    and-int/2addr v2, v12

    or-int/2addr v11, v2

    const/4 v12, 0x0

    move-object v15, v7

    move-object v7, v6

    move v6, v8

    move-object v8, v15

    invoke-static/range {v5 .. v12}, Ls4/l;->b(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_e
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_16

    new-instance v0, Lb30/e2;

    move/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lb30/e2;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lec3/l;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static e0(Lob3/o;Lob3/g;Lob3/g;)Z
    .locals 2

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lob3/o;->h0(Lob3/g;)Lob3/h;

    move-result-object v0

    invoke-interface {p0, p2}, Lob3/o;->h0(Lob3/g;)Lob3/h;

    move-result-object v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-static {p0, v0, v1}, Lcom/squareup/wire/n;->c0(Lob3/o;Lob3/h;Lob3/h;)Z

    move-result p0

    return p0

    :cond_1
    invoke-interface {p0, p1}, Lob3/o;->r(Lob3/g;)Lob3/f;

    move-result-object p1

    invoke-interface {p0, p2}, Lob3/o;->r(Lob3/g;)Lob3/f;

    move-result-object p2

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    invoke-interface {p0, p1}, Lob3/o;->b(Lob3/f;)Lob3/h;

    move-result-object v0

    invoke-interface {p0, p2}, Lob3/o;->b(Lob3/f;)Lob3/h;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/squareup/wire/n;->c0(Lob3/o;Lob3/h;Lob3/h;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0, p1}, Lob3/o;->a(Lob3/f;)Lob3/h;

    move-result-object p1

    invoke-interface {p0, p2}, Lob3/o;->a(Lob3/f;)Lob3/h;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lcom/squareup/wire/n;->c0(Lob3/o;Lob3/h;Lob3/h;)Z

    move-result p0

    if-eqz p0, :cond_2

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final f(IJLandroidx/compose/runtime/Composer;Lc93/m;Lp6/u1;)V
    .locals 7

    check-cast p3, Lp1/q;

    const v0, -0x2dff18fa

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p1, p2}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p0

    and-int/lit8 v1, p0, 0x30

    if-nez v1, :cond_3

    and-int/lit8 v1, p0, 0x40

    if-nez v1, :cond_1

    invoke-virtual {p3, p5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {p3, p5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    invoke-virtual {p3, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    and-int/lit16 v0, v0, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_6

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_5

    :cond_6
    :goto_4
    sget-object v0, Ln6/h;->a:Lp1/u2;

    new-instance v1, Ly3/h;

    invoke-direct {v1, p1, p2}, Ly3/h;-><init>(J)V

    invoke-virtual {v0, v1}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v1, Lp6/p1;

    invoke-direct {v1, p4, p1, p2, p5}, Lp6/p1;-><init>(Lc93/m;JLp6/u1;)V

    const v2, -0x15ebb5ba

    invoke-static {v2, p3, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p3, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_7

    new-instance v0, Li20/k0;

    const/4 v6, 0x4

    move v5, p0

    move-wide v1, p1

    move-object v4, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v6}, Li20/k0;-><init>(JLjava/lang/Object;Ll83/e;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final f0(Lcom/mapbox/maps/StylePropertyValue;)Ljava/lang/Object;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/StylePropertyValue;->getKind()Lcom/mapbox/maps/StylePropertyValueKind;

    move-result-object v0

    sget-object v1, Ldv/c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const-string v1, "Requested type String doesn\'t match "

    const-class v2, Ljava/lang/String;

    const-string v3, "this.value"

    const/4 v4, 0x1

    if-eq v0, v4, :cond_9

    const/4 v5, 0x2

    if-eq v0, v5, :cond_3

    const/4 v4, 0x3

    if-eq v0, v4, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "parsing "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/StylePropertyValue;->getKind()Lcom/mapbox/maps/StylePropertyValueKind;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not supported yet"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Property is undefined"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lcom/mapbox/maps/StylePropertyValue;->getValue()Lcom/mapbox/bindgen/Value;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->h0(Lcom/mapbox/bindgen/Value;)Lvu/d;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-class v0, Lvu/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-virtual {p0}, Lcom/mapbox/maps/StylePropertyValue;->getValue()Lcom/mapbox/bindgen/Value;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/util/HashMap;

    const-string v5, "null cannot be cast to non-null type kotlin.Long"

    if-eqz v3, :cond_6

    new-instance p0, Ld1/j;

    const/16 v3, 0x9

    const/4 v4, 0x0

    invoke-direct {p0, v3, v4}, Ld1/j;-><init>(IZ)V

    check-cast v0, Ljava/util/HashMap;

    const-string v3, "delay"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mapbox/bindgen/Value;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Long;

    iput-object v3, p0, Ld1/j;->y:Ljava/lang/Object;

    :cond_4
    const-string v3, "duration"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/bindgen/Value;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    :cond_5
    new-instance v0, Lcv/b;

    invoke-direct {v0, p0}, Lcv/b;-><init>(Ld1/j;)V

    goto :goto_0

    :cond_6
    instance-of v3, v0, Ljava/util/List;

    if-eqz v3, :cond_8

    check-cast v0, Ljava/util/List;

    new-instance p0, Ld1/j;

    const/16 v3, 0x9

    const/4 v6, 0x0

    invoke-direct {p0, v3, v6}, Ld1/j;-><init>(IZ)V

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mapbox/bindgen/Value;

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Long;

    iput-object v3, p0, Ld1/j;->x:Ljava/lang/Object;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/bindgen/Value;

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    new-instance v0, Lcv/b;

    invoke-direct {v0, p0}, Lcv/b;-><init>(Ld1/j;)V

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    return-object v0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-class v0, Lcv/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to unwrap to StyleTransition: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-virtual {p0}, Lcom/mapbox/maps/StylePropertyValue;->getValue()Lcom/mapbox/bindgen/Value;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->g0(Lcom/mapbox/bindgen/Value;)Ljava/io/Serializable;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    return-object p0

    :cond_a
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final g(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Loj/g;Loj/g;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x65504dae

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-static {p1}, Loj/v;->b(Lcom/amplitude/android/engagement/types/SimulationContext;)Lcom/amplitude/android/engagement/types/DebugStatus;

    move-result-object v3

    invoke-static {p0}, Loj/v;->a(Lcom/amplitude/android/engagement/types/Nudge;)Ll83/q;

    move-result-object v6

    new-instance v2, Loj/x;

    move-object v5, p0

    move-object v4, p1

    move-object v7, p2

    move-object/from16 v8, p3

    invoke-direct/range {v2 .. v8}, Loj/x;-><init>(Lcom/amplitude/android/engagement/types/DebugStatus;Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/types/Nudge;Ll83/q;Loj/g;Loj/g;)V

    const v1, -0x53ba510d

    invoke-static {v1, v0, v2}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x186

    const-string v4, "Trigger"

    invoke-static {v4, v3, v1, v0, v2}, Lx30/s0;->b(Ljava/lang/String;Lcom/amplitude/android/engagement/types/DebugStatus;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v7, Loj/w;

    move-object v8, p0

    move-object v9, p1

    move-object v10, p2

    move-object/from16 v11, p3

    move/from16 v12, p5

    invoke-direct/range {v7 .. v12}, Loj/w;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Loj/g;Loj/g;I)V

    iput-object v7, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final g0(Lcom/mapbox/bindgen/Value;)Ljava/io/Serializable;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Double;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/io/Serializable;

    return-object v0

    :cond_0
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/io/Serializable;

    return-object v0

    :cond_1
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/io/Serializable;

    return-object v0

    :cond_2
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_3

    check-cast v0, Ljava/io/Serializable;

    return-object v0

    :cond_3
    instance-of v1, v0, [D

    if-eqz v1, :cond_4

    check-cast v0, Ljava/io/Serializable;

    return-object v0

    :cond_4
    instance-of v1, v0, [J

    if-eqz v1, :cond_5

    check-cast v0, Ljava/io/Serializable;

    return-object v0

    :cond_5
    instance-of v1, v0, [Z

    if-eqz v1, :cond_6

    check-cast v0, Ljava/io/Serializable;

    return-object v0

    :cond_6
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_8

    check-cast v0, Ljava/util/List;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/bindgen/Value;

    invoke-static {v1}, Lcom/squareup/wire/n;->g0(Lcom/mapbox/bindgen/Value;)Ljava/io/Serializable;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    return-object p0

    :cond_8
    instance-of v1, v0, Ljava/util/HashMap;

    if-eqz v1, :cond_b

    check-cast v0, Ljava/util/HashMap;

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "valueMap.keys"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mapbox/bindgen/Value;

    if-eqz v3, :cond_9

    const-string v4, "key"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/squareup/wire/n;->g0(Lcom/mapbox/bindgen/Value;)Ljava/io/Serializable;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_a
    return-object p0

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unable to unwrap Value of content type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_c
    const/4 p0, 0x0

    :goto_2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final h(Lg/l;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p1, Lc20/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lc20/f;

    iget v1, v0, Lc20/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lc20/f;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lc20/f;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lc20/f;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lc20/f;->y:I

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v8, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v7

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v6, Lc20/f;->w:Lbc3/t;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p1

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v1

    move p0, v2

    sget-object v2, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v3}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v4

    invoke-interface {v6}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    invoke-virtual {v4, v3}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v5

    sget-object v9, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-eq v5, v9, :cond_4

    invoke-virtual {v1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-ltz v5, :cond_5

    invoke-virtual {p1, v7}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance p0, Landroidx/lifecycle/LifecycleDestroyedException;

    invoke-direct {p0}, Landroidx/lifecycle/LifecycleDestroyedException;-><init>()V

    throw p0

    :cond_5
    new-instance v5, Lav/b;

    const/4 v9, 0x3

    invoke-direct {v5, p1, v9}, Lav/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v6, Lc20/f;->w:Lbc3/t;

    iput p0, v6, Lc20/f;->y:I

    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/o1;->p(Landroidx/lifecycle/x;Landroidx/lifecycle/w;ZLbc3/w1;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_6

    goto :goto_4

    :cond_6
    move-object p0, p1

    :goto_2
    move-object p1, p0

    :goto_3
    const/4 p0, 0x0

    iput-object p0, v6, Lc20/f;->w:Lbc3/t;

    iput v8, v6, Lc20/f;->y:I

    invoke-virtual {p1, v6}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_7

    :goto_4
    return-object v0

    :cond_7
    return-object v7
.end method

.method public static final h0(Lcom/mapbox/bindgen/Value;)Lvu/d;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Double;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    new-instance p0, Lvu/d;

    invoke-direct {p0, v0, v1}, Lvu/d;-><init>(D)V

    return-object p0

    :cond_0
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    new-instance p0, Lvu/d;

    invoke-direct {p0, v0, v1}, Lvu/d;-><init>(J)V

    return-object p0

    :cond_1
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    new-instance v1, Lvu/d;

    invoke-direct {v1, p0}, Lcom/mapbox/bindgen/Value;-><init>(Z)V

    iput-object v0, v1, Lvu/d;->a:Ljava/lang/Object;

    return-object v1

    :cond_2
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/String;

    new-instance p0, Lvu/d;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lvu/d;->a:Ljava/lang/Object;

    return-object p0

    :cond_3
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_e

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/mapbox/bindgen/Value;

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Ljava/lang/String;

    if-eqz v1, :cond_4

    check-cast p0, Ljava/lang/String;

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_5

    new-instance p0, Lvu/d;

    invoke-direct {p0, v0}, Lvu/d;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_5
    const-string v1, "literal"

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_a

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/bindgen/Value;

    invoke-virtual {v2}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/util/List;

    if-eqz v4, :cond_7

    check-cast v2, Ljava/util/List;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/bindgen/Value;

    invoke-static {v2}, Lcom/squareup/wire/n;->h0(Lcom/mapbox/bindgen/Value;)Lvu/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance v0, Lvu/a;

    invoke-direct {v0, v1}, Lvu/a;-><init>(Ljava/lang/String;)V

    new-instance v1, Lvu/d;

    invoke-direct {v1, p0}, Lvu/d;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lvu/a;->a(Lvu/d;)V

    invoke-virtual {v0}, Lvu/a;->b()Lvu/d;

    move-result-object p0

    return-object p0

    :cond_7
    instance-of v4, v2, Ljava/util/HashMap;

    if-eqz v4, :cond_c

    check-cast v2, Ljava/util/HashMap;

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/bindgen/Value;

    invoke-static {v2}, Lcom/squareup/wire/n;->h0(Lcom/mapbox/bindgen/Value;)Lvu/d;

    move-result-object v2

    invoke-virtual {p0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_9
    new-instance p0, Lvu/a;

    invoke-direct {p0, v1}, Lvu/a;-><init>(Ljava/lang/String;)V

    new-instance v1, Lvu/d;

    invoke-direct {v1, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    iput-object v0, v1, Lvu/d;->a:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lvu/a;->a(Lvu/d;)V

    invoke-virtual {p0}, Lvu/a;->b()Lvu/d;

    move-result-object p0

    return-object p0

    :cond_a
    const-string v1, "image"

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    new-instance p0, Lvu/b;

    invoke-direct {p0, v1}, Lvu/a;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/bindgen/Value;

    invoke-static {v1}, Lcom/squareup/wire/n;->h0(Lcom/mapbox/bindgen/Value;)Lvu/d;

    move-result-object v1

    invoke-virtual {p0, v1}, Lvu/a;->a(Lvu/d;)V

    goto :goto_4

    :cond_b
    invoke-virtual {p0}, Lvu/a;->b()Lvu/d;

    move-result-object p0

    return-object p0

    :cond_c
    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lvu/a;

    invoke-direct {v1, p0}, Lvu/a;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/bindgen/Value;

    invoke-static {v0}, Lcom/squareup/wire/n;->h0(Lcom/mapbox/bindgen/Value;)Lvu/d;

    move-result-object v0

    invoke-virtual {v1, v0}, Lvu/a;->a(Lvu/d;)V

    goto :goto_5

    :cond_d
    invoke-virtual {v1}, Lvu/a;->b()Lvu/d;

    move-result-object p0

    return-object p0

    :cond_e
    instance-of v1, v0, Ljava/util/HashMap;

    if-eqz v1, :cond_f

    check-cast v0, Ljava/util/HashMap;

    new-instance p0, Lvu/d;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    iput-object v0, p0, Lvu/d;->a:Ljava/lang/Object;

    return-object p0

    :cond_f
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to unwrap to Expression: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final i(Ljava/util/logging/LogRecord;)I
    .locals 3

    invoke-virtual {p0}, Ljava/util/logging/LogRecord;->getLevel()Ljava/util/logging/Level;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/logging/Level;->intValue()I

    move-result v0

    sget-object v1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    invoke-virtual {v1}, Ljava/util/logging/Level;->intValue()I

    move-result v2

    if-le v0, v2, :cond_0

    const/4 p0, 0x5

    return p0

    :cond_0
    invoke-virtual {p0}, Ljava/util/logging/LogRecord;->getLevel()Ljava/util/logging/Level;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/logging/Level;->intValue()I

    move-result p0

    invoke-virtual {v1}, Ljava/util/logging/Level;->intValue()I

    move-result v0

    if-ne p0, v0, :cond_1

    const/4 p0, 0x4

    return p0

    :cond_1
    const/4 p0, 0x3

    return p0
.end method

.method public static final j(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lg1/o;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lg1/o;

    iget v1, v0, Lg1/o;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg1/o;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg1/o;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lg1/o;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg1/o;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/material/AnchoredDragFinishedSignal; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p2, Lg1/s;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct {p2, p0, p1, v2, v4}, Lg1/s;-><init>(Lc93/a;Lc93/m;Lq83/d;I)V

    iput v3, v0, Lg1/o;->x:I

    invoke-static {p2, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Landroidx/compose/material/AnchoredDragFinishedSignal; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_3

    return-object v1

    :catch_0
    :cond_3
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static k(Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;Lm23/b;Lg40/f4;I)Ld23/a;
    .locals 2

    and-int/lit8 v0, p3, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    move-object p2, v1

    :cond_1
    const-string p3, "<this>"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ld23/a;

    invoke-direct {p3, p1, p2}, Ld23/a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p3}, Landroidx/viewpager/widget/ViewPager;->c(Lfc/g;)V

    return-object p3
.end method

.method public static l(Landroidx/compose/ui/Modifier;Lg1/a0;Lh0/d2;ZZI)Landroidx/compose/ui/Modifier;
    .locals 12

    and-int/lit8 v0, p5, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v10, v1

    goto :goto_0

    :cond_0
    move/from16 v10, p4

    :goto_0
    iget-object v0, p1, Lg1/a0;->m:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    move v7, v1

    iget-object v3, p1, Lg1/a0;->f:Lg1/z;

    new-instance v9, Lg1/m;

    const/4 v0, 0x0

    invoke-direct {v9, p1, v0}, Lg1/m;-><init>(Lg1/a0;Lq83/d;)V

    const/16 v11, 0x20

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v4, p2

    move v5, p3

    invoke-static/range {v2 .. v11}, Lh0/k1;->a(Landroidx/compose/ui/Modifier;Lh0/n1;Lh0/d2;ZLj0/i;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lg1/a0;Ljava/lang/Object;FLq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lg1/n;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, p2, v1, v2}, Lg1/n;-><init>(Ljava/lang/Object;FLq83/d;I)V

    sget-object p2, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p0, p1, p2, v0, p3}, Lg1/a0;->b(Ljava/lang/Object;Lf0/z0;Lg1/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static n(Lg1/a0;Ljava/lang/Object;Ls83/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg1/a0;->l:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    invoke-static {p0, p1, v0, p2}, Lcom/squareup/wire/n;->m(Lg1/a0;Ljava/lang/Object;FLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Task "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " was cancelled normally."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    throw p1

    :cond_2
    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Leu/f;

    const/4 v1, 0x3

    invoke-direct {p1, v0, v1}, Leu/f;-><init>(Lbc3/m;I)V

    sget-object v1, Lnc3/a;->w:Lnc3/a;

    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcq/d;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final p(Landroid/content/ClipboardManager;)V
    .locals 0

    invoke-virtual {p0}, Landroid/content/ClipboardManager;->clearPrimaryClip()V

    return-void
.end method

.method public static q(JJ)I
    .locals 0

    cmp-long p0, p0, p2

    if-gez p0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-lez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final r(Llb3/y;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object p0

    sget-object v0, Lo93/m;->q:Lva3/e;

    invoke-interface {p0, v0}, Ls93/i;->T(Lva3/e;)Ls93/b;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0}, Ls93/b;->a()Ljava/util/Map;

    move-result-object p0

    sget-object v0, Lo93/n;->e:Lva3/h;

    invoke-static {v0, p0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lab3/g;

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lab3/k;

    iget-object p0, p0, Lab3/g;->a:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final t(Lo93/h;Ls93/i;Llb3/y;Ljava/util/List;Ljava/util/ArrayList;Llb3/y;Z)Llb3/c0;
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz p2, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    add-int/2addr v2, v4

    add-int/2addr v2, v3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, p3

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llb3/y;

    invoke-static {v5}, Lio/sentry/config/a;->n(Llb3/y;)Llb3/v0;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    invoke-static {p2}, Lio/sentry/config/a;->n(Llb3/y;)Llb3/v0;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v2

    :goto_2
    invoke-static {v0, v4}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v1

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-ltz v5, :cond_3

    check-cast v6, Llb3/y;

    invoke-static {v6}, Lio/sentry/config/a;->n(Llb3/y;)Llb3/v0;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto :goto_3

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    throw v2

    :cond_4
    invoke-static {p5}, Lio/sentry/config/a;->n(Llb3/y;)Llb3/v0;

    move-result-object p5

    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p5

    add-int/2addr p5, p4

    if-nez p2, :cond_5

    move v3, v1

    :cond_5
    add-int/2addr p5, v3

    if-eqz p6, :cond_6

    invoke-virtual {p0, p5}, Lo93/h;->w(I)Lr93/e;

    move-result-object p4

    goto :goto_4

    :cond_6
    sget-object p4, Lo93/n;->a:Lva3/h;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p6, "Function"

    invoke-direct {p4, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Lo93/h;->k(Ljava/lang/String;)Lr93/e;

    move-result-object p4

    :goto_4
    sget-object p5, Ls93/g;->a:Ls93/f;

    if-eqz p2, :cond_9

    sget-object p2, Lo93/m;->p:Lva3/e;

    invoke-interface {p1, p2}, Ls93/i;->J(Lva3/e;)Z

    move-result p6

    if-eqz p6, :cond_7

    goto :goto_5

    :cond_7
    new-instance p6, Ls93/l;

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-direct {p6, p0, p2, v2}, Ls93/l;-><init>(Lo93/h;Lva3/e;Ljava/util/Map;)V

    invoke-static {p1, p6}, Lm83/s;->e1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_8

    move-object p1, p5

    goto :goto_5

    :cond_8
    new-instance p2, Ls93/j;

    invoke-direct {p2, p1, v1}, Ls93/j;-><init>(Ljava/util/List;I)V

    move-object p1, p2

    :cond_9
    :goto_5
    move-object p2, p3

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_c

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    sget-object p3, Lo93/m;->q:Lva3/e;

    invoke-interface {p1, p3}, Ls93/i;->J(Lva3/e;)Z

    move-result p6

    if-eqz p6, :cond_a

    goto :goto_7

    :cond_a
    new-instance p6, Ls93/l;

    sget-object v2, Lo93/n;->e:Lva3/h;

    new-instance v3, Lab3/k;

    invoke-direct {v3, p2}, Lab3/k;-><init>(I)V

    new-instance p2, Ll83/k;

    invoke-direct {p2, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p2

    invoke-direct {p6, p0, p3, p2}, Ls93/l;-><init>(Lo93/h;Lva3/e;Ljava/util/Map;)V

    invoke-static {p1, p6}, Lm83/s;->e1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_6

    :cond_b
    new-instance p5, Ls93/j;

    invoke-direct {p5, p0, v1}, Ls93/j;-><init>(Ljava/util/List;I)V

    :goto_6
    move-object p1, p5

    :cond_c
    :goto_7
    invoke-static {p1}, Lio/sentry/config/a;->a0(Ls93/i;)Llb3/k0;

    move-result-object p0

    invoke-static {p0, p4, v0}, Llb3/o;->h(Llb3/k0;Lr93/e;Ljava/util/List;)Llb3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Lr93/e;Lr93/e;)Llb3/r0;
    .locals 4

    const-string v0, "from"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/e;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    invoke-interface {p1}, Lr93/e;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    invoke-interface {p0}, Lr93/e;->j()Ljava/util/List;

    move-result-object p0

    const-string v0, "getDeclaredTypeParameters(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/x0;

    invoke-interface {v3}, Lr93/x0;->e()Llb3/q0;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lr93/e;->j()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/x0;

    invoke-interface {v0}, Lr93/h;->i()Llb3/c0;

    move-result-object v0

    const-string v2, "getDefaultType(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lio/sentry/config/a;->n(Llb3/y;)Llb3/v0;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v1, p1}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    new-instance p1, Llb3/r0;

    invoke-direct {p1, p0}, Llb3/r0;-><init>(Ljava/util/Map;)V

    return-object p1
.end method

.method public static v(Lio/sentry/rrweb/b;Ljava/lang/String;Lio/sentry/j3;Lio/sentry/v0;)Z
    .locals 2

    const-string v0, "type"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    const-string p3, "timestamp"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p2}, Lio/sentry/j3;->nextLong()J

    move-result-wide p1

    iput-wide p1, p0, Lio/sentry/rrweb/b;->x:J

    return v1

    :cond_1
    new-instance p1, Lio/sentry/protocol/i0;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lio/sentry/protocol/i0;-><init>(I)V

    invoke-interface {p2, p3, p1}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/rrweb/c;

    const-string p2, ""

    invoke-static {p1, p2}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/rrweb/b;->w:Lio/sentry/rrweb/c;

    return v1
.end method

.method public static final w(Llb3/y;)Lva3/h;
    .locals 2

    invoke-virtual {p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object p0

    sget-object v0, Lo93/m;->r:Lva3/e;

    invoke-interface {p0, v0}, Ls93/i;->T(Lva3/e;)Ls93/b;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Ls93/b;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->q1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Lab3/x;

    if-eqz v1, :cond_1

    check-cast p0, Lab3/x;

    goto :goto_0

    :cond_1
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_3

    iget-object p0, p0, Lab3/g;->a:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_3

    invoke-static {p0}, Lva3/h;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_3

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    return-object v0
.end method

.method public static final x()V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final y(Ljava/util/Map;)Ljava/util/Map;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final z(Landroidx/fragment/app/m0;)Leb/a0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_2

    instance-of v1, v0, Landroidx/navigation/fragment/NavHostFragment;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/navigation/fragment/NavHostFragment;

    invoke-virtual {v0}, Landroidx/navigation/fragment/NavHostFragment;->y()Leb/u0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/o1;->A:Landroidx/fragment/app/m0;

    instance-of v2, v1, Landroidx/navigation/fragment/NavHostFragment;

    if-eqz v2, :cond_1

    check-cast v1, Landroidx/navigation/fragment/NavHostFragment;

    invoke-virtual {v1}, Landroidx/navigation/fragment/NavHostFragment;->y()Leb/u0;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Ldt/b;->s(Landroid/view/View;)Leb/a0;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Landroidx/fragment/app/y;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/y;

    goto :goto_1

    :cond_4
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    :cond_5
    if-eqz v1, :cond_6

    invoke-static {v1}, Ldt/b;->s(Landroid/view/View;)Leb/a0;

    move-result-object p0

    return-object p0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " does not have a NavController set"

    invoke-static {p0, v1, v2}, Ld;->l(Landroidx/fragment/app/m0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract J()Ljava/util/List;
.end method

.method public abstract s()Lib/j;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/squareup/wire/n;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Ljg/g;->c:Ljg/g;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "BeginArray"

    goto/16 :goto_0

    :cond_0
    sget-object v0, Ljg/j;->c:Ljg/j;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "EndArray"

    goto/16 :goto_0

    :cond_1
    sget-object v0, Ljg/h;->c:Ljg/h;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "BeginObject"

    goto/16 :goto_0

    :cond_2
    sget-object v0, Ljg/l;->c:Ljg/l;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "EndObject"

    goto :goto_0

    :cond_3
    instance-of v0, p0, Ljg/m;

    const/16 v1, 0x29

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Name("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v2, p0

    check-cast v2, Ljg/m;

    iget-object v2, v2, Ljg/m;->c:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    instance-of v0, p0, Ljg/p;

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "String("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v2, p0

    check-cast v2, Ljg/p;

    iget-object v2, v2, Ljg/p;->c:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    instance-of v0, p0, Ljg/o;

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Number("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v2, p0

    check-cast v2, Ljg/o;

    iget-object v2, v2, Ljg/o;->c:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_6
    instance-of v0, p0, Ljg/i;

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Bool("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v2, p0

    check-cast v2, Ljg/i;

    iget-boolean v2, v2, Ljg/i;->c:Z

    invoke-static {v0, v2, v1}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_7
    sget-object v0, Ljg/n;->c:Ljg/n;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "Null"

    goto :goto_0

    :cond_8
    sget-object v0, Ljg/k;->c:Ljg/k;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "EndDocument"

    :goto_0
    return-object v0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method
