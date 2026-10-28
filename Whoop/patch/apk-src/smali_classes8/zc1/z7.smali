.class public abstract Lzc1/z7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\n\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0006\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0007\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0008\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "h",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "selectedIndexThree",
        "selectedIndexFive",
        "selectedIndexAll",
        "selectedIndexCentered",
        "selectedIndexDynamicScrollable",
        "selectedIndexDynamicCentered",
        "design-showcase_release"
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
.method private static final A(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/z7;->p(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/z7;->t(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/z7;->r(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/z7;->v(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/z7;->u(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/z7;->q(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/z7;->s(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move/from16 v0, p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v9, p0

    check-cast v9, Lp1/q;

    const v3, 0x33e7da1c

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v9, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v3, v13, :cond_1

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v3, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v13, :cond_2

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v14, v4

    check-cast v14, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    const/4 v15, 0x4

    if-ne v4, v13, :cond_3

    invoke-static {v15, v9}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v4

    :cond_3
    check-cast v4, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v13, :cond_4

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v13, :cond_5

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_6

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v2, v7

    check-cast v2, Lp1/c1;

    const-string v7, "First"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const-string v7, "Second"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const-string v7, "Third"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    const-string v7, "Fourth"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    const-string v7, "Fifth"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const-string v7, "Sixth"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    const-string v7, "Seventh"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const-string v7, "Eight"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    filled-new-array/range {v16 .. v23}, [Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    sget-object v8, Lb2/e;->N:Lb2/k;

    sget-object v10, Ll0/m;->c:Ll0/g;

    const/16 v11, 0x30

    invoke-static {v10, v8, v9, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    move-object/from16 v18, v4

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-eqz v4, :cond_7

    invoke-virtual {v9, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_7
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v9, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v10, v9, v10, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Three Items"

    const/4 v12, 0x6

    invoke-static {v1, v9, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3}, Lzc1/z7;->i(Lp1/c1;)I

    move-result v1

    const/4 v4, 0x3

    move v10, v4

    const/4 v8, 0x0

    invoke-interface {v7, v8, v10}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v13, :cond_a

    new-instance v8, Lzc1/n5;

    const/16 v11, 0x16

    invoke-direct {v8, v11, v3}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move v3, v10

    const/high16 v10, 0x30000

    const/16 v11, 0x1c

    move-object/from16 v19, v5

    const/4 v5, 0x0

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move-object/from16 v21, v7

    const/4 v7, 0x0

    move/from16 v24, v3

    move v3, v1

    move-object/from16 v1, v18

    move/from16 v18, v24

    move-object/from16 v24, v21

    invoke-static/range {v3 .. v11}, Lx31/f;->r(ILjava/util/List;Landroidx/compose/ui/Modifier;Lx31/c;Lb91/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    int-to-float v4, v3

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v3, v4

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v9, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v4, "Five Items"

    invoke-static {v4, v9, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move v4, v3

    invoke-static {v14}, Lzc1/z7;->x(Lp1/c1;)I

    move-result v3

    const/4 v5, 0x5

    move-object/from16 v6, v24

    const/4 v8, 0x0

    invoke-interface {v6, v8, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_b

    new-instance v7, Lzc1/n5;

    const/16 v8, 0x17

    invoke-direct {v7, v8, v14}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v8, v7

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/high16 v10, 0x30000

    const/16 v11, 0x1c

    move v7, v4

    move-object v4, v5

    const/4 v5, 0x0

    move-object/from16 v21, v6

    const/4 v6, 0x0

    move v14, v7

    const/4 v7, 0x0

    invoke-static/range {v3 .. v11}, Lx31/f;->r(ILjava/util/List;Landroidx/compose/ui/Modifier;Lx31/c;Lb91/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v9, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v3, "All Items"

    invoke-static {v3, v9, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v1}, Lzc1/z7;->z(Lp1/c1;)I

    move-result v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v13, :cond_c

    new-instance v4, Lzc1/n5;

    const/16 v5, 0x18

    invoke-direct {v4, v5, v1}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x3

    const/high16 v4, 0x30000

    or-int v10, v1, v4

    const/16 v11, 0x1c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v4, v21

    invoke-static/range {v3 .. v11}, Lx31/f;->r(ILjava/util/List;Landroidx/compose/ui/Modifier;Lx31/c;Lb91/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v4

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v9, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v4, "Centered (non-scrollable)"

    invoke-static {v4, v9, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v19 .. v19}, Lzc1/z7;->j(Lp1/c1;)I

    move-result v4

    sget-object v6, Lx31/c;->ALWAYS:Lx31/c;

    const/4 v5, 0x2

    move v7, v4

    const/4 v8, 0x0

    invoke-interface {v3, v8, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v13, :cond_d

    new-instance v8, Lzc1/n5;

    const/16 v10, 0x19

    move-object/from16 v11, v19

    invoke-direct {v8, v10, v11}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const v10, 0x30c00

    const/16 v11, 0x14

    move/from16 v18, v5

    const/4 v5, 0x0

    move-object/from16 v21, v3

    move v3, v7

    const/4 v7, 0x0

    invoke-static/range {v3 .. v11}, Lx31/f;->r(ILjava/util/List;Landroidx/compose/ui/Modifier;Lx31/c;Lb91/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v9, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v3, "Dynamic: A lot of items - Scrollable"

    invoke-static {v3, v9, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v20 .. v20}, Lzc1/z7;->l(Lp1/c1;)I

    move-result v3

    sget-object v6, Lx31/c;->DYNAMIC:Lx31/c;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v13, :cond_e

    new-instance v4, Lzc1/n5;

    const/16 v5, 0x1a

    move-object/from16 v7, v20

    invoke-direct {v4, v5, v7}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const v4, 0x30c00

    or-int v10, v1, v4

    const/16 v11, 0x14

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v4, v21

    invoke-static/range {v3 .. v11}, Lx31/f;->r(ILjava/util/List;Landroidx/compose/ui/Modifier;Lx31/c;Lb91/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v9, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Dynamic: Not a lot of items - Centered"

    invoke-static {v1, v9, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v2}, Lzc1/z7;->n(Lp1/c1;)I

    move-result v3

    const/4 v1, 0x2

    const/4 v8, 0x0

    invoke-interface {v4, v8, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_f

    new-instance v1, Lzc1/n5;

    const/16 v5, 0x1b

    invoke-direct {v1, v5, v2}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const v10, 0x30c00

    const/16 v11, 0x14

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v11}, Lx31/f;->r(ILjava/util/List;Landroidx/compose/ui/Modifier;Lx31/c;Lb91/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_10
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_11

    new-instance v2, Lzc1/t7;

    const/16 v3, 0x8

    invoke-direct {v2, v0, v3}, Lzc1/t7;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final i(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final j(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final k(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final l(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final m(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final o(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final p(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/z7;->w(Lp1/c1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/z7;->y(Lp1/c1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/z7;->A(Lp1/c1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/z7;->k(Lp1/c1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/z7;->m(Lp1/c1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/z7;->o(Lp1/c1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/z7;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final x(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final y(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final z(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method
