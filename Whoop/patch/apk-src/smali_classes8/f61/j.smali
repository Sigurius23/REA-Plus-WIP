.class public abstract Lf61/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lf61/j;->e(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Ld61/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lf61/j;->d(Lp1/c1;Ld61/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 33

    move/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    const v2, -0x6df0a710

    invoke-virtual {v15, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    move-object/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v5, 0x3

    if-eq v6, v3, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v6, v5, 0x1

    invoke-virtual {v15, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    if-eqz v2, :cond_4

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_3

    :cond_4
    move-object v2, v4

    :goto_3
    const/16 v11, 0x1c

    const/4 v12, 0x0

    const-string v6, "Graph plane offset axes"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Le61/i;->s(Ljava/lang/String;ZZZZILjava/lang/Object;)Lj61/h;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lj61/h;->n()Lg61/b;

    move-result-object v17

    const-string v3, "Required value was null."

    if-eqz v17, :cond_8

    invoke-virtual/range {v16 .. v16}, Lj61/h;->g()Lg61/b;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v3, v6, :cond_5

    sget-object v3, Ld61/a$b;->a:Ld61/a$b;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    sget-object v21, Lg61/d;->TIME_MARKER:Lg61/d;

    const/16 v26, 0xf3

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x3d4ccccd    # 0.05f

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v17 .. v27}, Lg61/b;->b(Lg61/b;FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILjava/lang/Object;)Lg61/b;

    move-result-object v17

    const/16 v27, 0xf3

    const/16 v28, 0x0

    const/16 v19, 0x0

    move-object/from16 v22, v21

    move/from16 v21, v20

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v18, v4

    invoke-static/range {v18 .. v28}, Lg61/b;->b(Lg61/b;FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILjava/lang/Object;)Lg61/b;

    move-result-object v18

    new-instance v4, Lh2/c;

    const v7, 0x3ccccccd    # 0.025f

    const v8, 0x3d23d70a    # 0.04f

    const/4 v9, 0x0

    invoke-direct {v4, v9, v7, v9, v8}, Lh2/c;-><init>(FFFF)V

    const/16 v31, 0x1fec

    const/16 v32, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v21, v4

    invoke-static/range {v16 .. v32}, Lj61/h;->b(Lj61/h;Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILjava/lang/Object;)Lj61/h;

    move-result-object v4

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Ld61/a;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_6

    new-instance v7, Lf1/a0;

    const/4 v6, 0x1

    invoke-direct {v7, v6, v3}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v10, v7

    check-cast v10, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v3, v5, 0xe

    const/high16 v5, 0x6000000

    or-int v16, v3, v5

    const/16 v17, 0x0

    const/16 v18, 0x1e7c

    move-object v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v18}, Le61/h;->o(Landroidx/compose/ui/Modifier;Lj61/h;Ljava/util/List;Le61/j;Lf61/i;Li61/a;Lc93/a;Ld61/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v2, v4

    :goto_4
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_a

    new-instance v4, Lb70/a;

    const/16 v5, 0x9

    invoke-direct {v4, v0, v1, v5, v2}, Lb70/a;-><init>(IIILandroidx/compose/ui/Modifier;)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final d(Lp1/c1;Ld61/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lf61/j;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
