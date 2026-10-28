.class public abstract Lzc1/p6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "j",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lp1/c1;ILandroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/p6;->n(Lp1/c1;ILandroid/content/Context;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lzc1/p6;->m(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzc1/p6;->q(Ljava/util/List;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/p6;->r(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lzc1/p6;->k(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;ILandroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/p6;->p(Lp1/c1;ILandroid/content/Context;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/p6;->s(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;ILandroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/p6;->l(Lp1/c1;ILandroid/content/Context;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lzc1/p6;->o(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move/from16 v0, p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    const v2, -0x35118ee4    # -7813262.0f

    invoke-virtual {v10, v2}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v10, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_1

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_2

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v14, v5

    check-cast v14, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v15, v5

    check-cast v15, Lp1/c1;

    const-string v4, "Second"

    const-string v5, "Third"

    const-string v6, "First"

    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "11.9"

    const-string v6, "12.9"

    const-string v7, "10.9"

    filled-new-array {v7, v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v7, v6, v10, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_0
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v7, v10, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v6, "Text"

    const/4 v7, 0x6

    invoke-static {v6, v10, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v16, v4

    check-cast v16, Ljava/util/Collection;

    invoke-static/range {v16 .. v16}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    move-object v8, v5

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    new-instance v9, Lzc1/n6;

    const/4 v11, 0x0

    invoke-direct {v9, v4, v1, v2, v11}, Lzc1/n6;-><init>(Ljava/util/List;Landroid/content/Context;Lp1/c1;I)V

    const v2, 0xba4cb32

    invoke-static {v2, v10, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/high16 v11, 0x30000

    const/16 v12, 0x1c

    move-object v2, v4

    move-object v4, v6

    const/4 v6, 0x0

    move/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v18, v8

    const/4 v8, 0x0

    move/from16 v13, v17

    move-object/from16 v17, v3

    move v3, v13

    move-object/from16 v13, v18

    invoke-static/range {v4 .. v12}, Lf31/c;->e(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ll0/i;Lb2/g;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    const-string v4, "Text - Colorized"

    invoke-static {v4, v10, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v16 .. v16}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v14}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    new-instance v6, Lzc1/n6;

    const/4 v7, 0x1

    invoke-direct {v6, v2, v1, v14, v7}, Lzc1/n6;-><init>(Ljava/util/List;Landroid/content/Context;Lp1/c1;I)V

    const v2, 0xe1f82db

    invoke-static {v2, v10, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v12}, Lf31/c;->e(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ll0/i;Lb2/g;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    const-string v2, "Numeric"

    invoke-static {v2, v10, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object v2, v13

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    new-instance v6, Lzc1/n6;

    const/4 v7, 0x2

    invoke-direct {v6, v13, v1, v15, v7}, Lzc1/n6;-><init>(Ljava/util/List;Landroid/content/Context;Lp1/c1;I)V

    const v1, 0x469421ba

    invoke-static {v1, v10, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v12}, Lf31/c;->e(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ll0/i;Lb2/g;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Numeric - Disabled"

    invoke-static {v1, v10, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v2}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    new-instance v1, Lb30/t0;

    const/4 v3, 0x5

    invoke-direct {v1, v13, v3}, Lb30/t0;-><init>(Ljava/lang/Object;I)V

    const v3, 0x7f08c099

    invoke-static {v3, v10, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v9, 0x30030

    move-object v8, v10

    const/16 v10, 0x1c

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, v17

    invoke-static/range {v2 .. v10}, Lf31/c;->e(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ll0/i;Lb2/g;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v8

    const/4 v1, 0x1

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_7
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Lzc1/g6;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Lzc1/g6;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final k(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 22

    move-object/from16 v0, p1

    move/from16 v1, p4

    move-object/from16 v2, p5

    move/from16 v3, p7

    const-string v4, "$this$RadioGroup"

    move-object/from16 v5, p3

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "state"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v3, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_1

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit16 v6, v3, 0x180

    if-nez v6, :cond_4

    and-int/lit16 v3, v3, 0x200

    if-nez v3, :cond_2

    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x100

    goto :goto_3

    :cond_3
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v4, v3

    :cond_4
    and-int/lit16 v3, v4, 0x491

    const/16 v6, 0x490

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v3, v6, :cond_5

    move v3, v8

    goto :goto_4

    :cond_5
    move v3, v7

    :goto_4
    and-int/lit8 v6, v4, 0x1

    move-object/from16 v9, p6

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    move-object/from16 v3, p0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v11, Lny0/e0;->TEXT:Lny0/e0;

    invoke-virtual {v2}, Lf31/a;->c()Z

    move-result v14

    and-int/lit8 v2, v4, 0x70

    if-ne v2, v5, :cond_6

    move v7, v8

    :cond_6
    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_8

    :cond_7
    new-instance v3, Lzc1/o6;

    const/4 v2, 0x1

    move-object/from16 v4, p2

    invoke-direct {v3, v4, v1, v0, v2}, Lzc1/o6;-><init>(Lp1/c1;ILandroid/content/Context;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v18, v3

    check-cast v18, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0x180

    const/16 v21, 0xe9

    move-object/from16 v19, v9

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v20, v0

    invoke-static/range {v9 .. v21}, Lny0/d1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_9
    move-object/from16 v19, v9

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Lp1/c1;ILandroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Text: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p2, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 22

    move-object/from16 v0, p1

    move/from16 v1, p4

    move-object/from16 v2, p5

    move/from16 v3, p7

    const-string v4, "$this$RadioGroup"

    move-object/from16 v5, p3

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "state"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v3, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_1

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit16 v6, v3, 0x180

    if-nez v6, :cond_4

    and-int/lit16 v3, v3, 0x200

    if-nez v3, :cond_2

    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x100

    goto :goto_3

    :cond_3
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v4, v3

    :cond_4
    and-int/lit16 v3, v4, 0x491

    const/16 v6, 0x490

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v3, v6, :cond_5

    move v3, v8

    goto :goto_4

    :cond_5
    move v3, v7

    :goto_4
    and-int/lit8 v6, v4, 0x1

    move-object/from16 v9, p6

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    move-object/from16 v3, p0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v11, Lny0/e0;->TEXT:Lny0/e0;

    invoke-virtual {v2}, Lf31/a;->c()Z

    move-result v14

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->l0()J

    move-result-wide v12

    and-int/lit8 v2, v4, 0x70

    if-ne v2, v5, :cond_6

    move v7, v8

    :cond_6
    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_8

    :cond_7
    new-instance v3, Lzc1/o6;

    const/4 v2, 0x2

    move-object/from16 v4, p2

    invoke-direct {v3, v4, v1, v0, v2}, Lzc1/o6;-><init>(Lp1/c1;ILandroid/content/Context;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v18, v3

    check-cast v18, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0x180

    const/16 v21, 0xe1

    move-object/from16 v19, v9

    const/4 v9, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v20, v0

    invoke-static/range {v9 .. v21}, Lny0/d1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_9
    move-object/from16 v19, v9

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lp1/c1;ILandroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Colorized: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p2, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 22

    move-object/from16 v0, p1

    move/from16 v1, p4

    move-object/from16 v2, p5

    move/from16 v3, p7

    const-string v4, "$this$RadioGroup"

    move-object/from16 v5, p3

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "state"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v3, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_1

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit16 v6, v3, 0x180

    if-nez v6, :cond_4

    and-int/lit16 v3, v3, 0x200

    if-nez v3, :cond_2

    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x100

    goto :goto_3

    :cond_3
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v4, v3

    :cond_4
    and-int/lit16 v3, v4, 0x491

    const/16 v6, 0x490

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v3, v6, :cond_5

    move v3, v8

    goto :goto_4

    :cond_5
    move v3, v7

    :goto_4
    and-int/lit8 v6, v4, 0x1

    move-object/from16 v9, p6

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    move-object/from16 v3, p0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v11, Lny0/e0;->NUMERIC:Lny0/e0;

    invoke-virtual {v2}, Lf31/a;->c()Z

    move-result v14

    and-int/lit8 v2, v4, 0x70

    if-ne v2, v5, :cond_6

    move v7, v8

    :cond_6
    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_8

    :cond_7
    new-instance v3, Lzc1/o6;

    const/4 v2, 0x0

    move-object/from16 v4, p2

    invoke-direct {v3, v4, v1, v0, v2}, Lzc1/o6;-><init>(Lp1/c1;ILandroid/content/Context;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v18, v3

    check-cast v18, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0x180

    const/16 v21, 0xe9

    move-object/from16 v19, v9

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v20, v0

    invoke-static/range {v9 .. v21}, Lny0/d1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_9
    move-object/from16 v19, v9

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Lp1/c1;ILandroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Numeric: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p2, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljava/util/List;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    move/from16 v0, p2

    move-object/from16 v1, p3

    move/from16 v2, p5

    const-string v3, "$this$RadioGroup"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "state"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x30

    if-nez v3, :cond_1

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x20

    goto :goto_0

    :cond_0
    const/16 v3, 0x10

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit16 v4, v2, 0x180

    if-nez v4, :cond_4

    and-int/lit16 v2, v2, 0x200

    if-nez v2, :cond_2

    move-object/from16 v2, p4

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    move-object/from16 v2, p4

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x100

    goto :goto_3

    :cond_3
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v3, v2

    :cond_4
    and-int/lit16 v2, v3, 0x491

    const/16 v4, 0x490

    const/4 v5, 0x1

    if-eq v2, v4, :cond_5

    move v2, v5

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :goto_4
    and-int/2addr v3, v5

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object/from16 v2, p0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lny0/e0;->NUMERIC:Lny0/e0;

    invoke-virtual {v1}, Lf31/a;->c()Z

    move-result v9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_6

    new-instance v0, Lzc1/t5;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v13, v0

    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    const v1, 0x6030180

    or-int v15, v0, v1

    const/16 v16, 0xc9

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v4 .. v16}, Lny0/d1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_7
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/p6;->j(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
