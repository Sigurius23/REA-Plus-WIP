.class public abstract Los0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/platform/ComposeView;",
        "Ll83/a0;",
        "j",
        "(Landroidx/compose/ui/platform/ComposeView;)V",
        "Lkotlin/Function0;",
        "onDismiss",
        "f",
        "(Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "connectivity-common-ui_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Los0/c;->h(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/platform/ComposeView;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Los0/c;->l(Landroidx/compose/ui/platform/ComposeView;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Los0/c;->i(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Los0/c;->g(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/platform/ComposeView;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Los0/c;->k(Landroidx/compose/ui/platform/ComposeView;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "onDismiss"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x49f47b6e

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v8

    :goto_2
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v2, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v16, Lj11/p;->LOTTIE:Lj11/p;

    sget v4, Lks0/a;->d:I

    invoke-static {v2, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v6, Lks0/a;->b:I

    invoke-static {v2, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v9, Lks0/a;->c:I

    invoke-static {v2, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    and-int/lit8 v3, v3, 0xe

    if-ne v3, v5, :cond_3

    move v10, v7

    goto :goto_3

    :cond_3
    move v10, v8

    :goto_3
    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v10, :cond_4

    if-ne v11, v12, :cond_5

    :cond_4
    new-instance v11, Llq2/k;

    const/16 v10, 0x1a

    invoke-direct {v11, v0, v10}, Llq2/k;-><init>(Lc93/a;I)V

    invoke-virtual {v2, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v25, v11

    check-cast v25, Lc93/a;

    if-ne v3, v5, :cond_6

    goto :goto_4

    :cond_6
    move v7, v8

    :goto_4
    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v7, :cond_7

    if-ne v3, v12, :cond_8

    :cond_7
    new-instance v3, Llq2/k;

    const/16 v5, 0x1b

    invoke-direct {v3, v0, v5}, Llq2/k;-><init>(Lc93/a;I)V

    invoke-virtual {v2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v27, v3

    check-cast v27, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v3, 0x3

    or-int/lit16 v5, v5, 0x6000

    shl-int/lit8 v7, v3, 0x6

    or-int/2addr v5, v7

    shl-int/lit8 v3, v3, 0x9

    or-int v32, v5, v3

    const/16 v34, 0x0

    const v35, 0xebfdfe1

    const/4 v3, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v5, v6

    move-object v6, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0xc00

    move-object/from16 v31, v2

    invoke-static/range {v3 .. v35}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    goto :goto_5

    :cond_9
    move-object/from16 v31, v2

    invoke-virtual/range {v31 .. v31}, Lp1/q;->X()V

    :goto_5
    invoke-virtual/range {v31 .. v31}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_a

    new-instance v3, Lch0/t;

    const/16 v4, 0xe

    invoke-direct {v3, v1, v4, v0}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Los0/c;->f(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/platform/ComposeView;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    new-instance v0, Loe2/c;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Loe2/c;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v3, -0x5eabb596

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v1}, Ld91/b;->c(Landroidx/compose/ui/platform/ComposeView;Lc93/m;)V

    return-void
.end method

.method private static final k(Landroidx/compose/ui/platform/ComposeView;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_2

    :cond_1
    new-instance v0, Lnr0/e;

    const/16 p2, 0x11

    invoke-direct {v0, p0, p2}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lc93/a;

    invoke-static {v0, p1, v2}, Los0/c;->f(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/platform/ComposeView;)Ll83/a0;
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Los0/a;->a:Los0/a;

    invoke-virtual {v0}, Los0/a;->b()Lc93/m;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lc93/m;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
