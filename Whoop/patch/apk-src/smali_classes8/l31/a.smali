.class public abstract Ll31/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "enabled",
        "Ll83/a0;",
        "b",
        "(ZLandroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ll31/a;->c(ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZLandroidx/compose/runtime/Composer;II)V
    .locals 19

    move/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, -0x49325dc2

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v5, v4

    move/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move/from16 v4, p0

    invoke-virtual {v6, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v7, v5, 0x3

    const/4 v9, 0x1

    if-eq v7, v3, :cond_3

    move v3, v9

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    and-int/2addr v5, v9

    invoke-virtual {v6, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v2, :cond_4

    move v12, v9

    goto :goto_3

    :cond_4
    move v12, v4

    :goto_3
    int-to-float v2, v9

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v2, v3, v6, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_5

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_6

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    :cond_6
    invoke-static {v3, v6, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v6, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v2, Ly71/d;

    const-string v3, "WITH DOT MENU"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/4 v13, 0x0

    const-string v14, "weightlifting"

    const-string v15, "moreOptionsClicked"

    const/16 v16, 0x1

    move-object v10, v2

    invoke-direct/range {v10 .. v18}, Ly71/d;-><init>(Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v2, Ly71/d;

    const-string v3, "WITHOUT DOT MENU"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v14, "weightlifting"

    const-string v15, "moreOptionsClicked"

    const/16 v16, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v18}, Ly71/d;-><init>(Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v6}, Lp1/q;->X()V

    move v12, v4

    :goto_5
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v3, Lk71/k;

    const/4 v4, 0x1

    invoke-direct {v3, v12, v0, v1, v4}, Lk71/k;-><init>(ZIII)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final c(ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Ll31/a;->b(ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
