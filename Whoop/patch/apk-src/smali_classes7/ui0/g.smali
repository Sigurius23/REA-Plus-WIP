.class public abstract Lui0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u001aA\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lri0/a;",
        "footerState",
        "Lkotlin/Function1;",
        "Lri0/b;",
        "Ll83/a0;",
        "onEvent",
        "",
        "reserveCoachFabSpace",
        "h",
        "(Landroidx/compose/ui/Modifier;Lri0/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V",
        "Lm91/o;",
        "itemWrapper",
        "",
        "e",
        "(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "arch-v2_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lri0/a;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lui0/g;->j(Landroidx/compose/ui/Modifier;Lri0/a;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lui0/g;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lui0/g;->i(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lui0/g;->g(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v1, 0x6250afe8

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, p3, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, p3

    goto :goto_2

    :cond_2
    move v1, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_5

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v1, v5

    :cond_5
    :goto_4
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_5

    :cond_6
    const/4 v5, 0x0

    :goto_5
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v4, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_9

    if-eqz v2, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_7

    new-instance v2, Lu71/c;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lu71/c;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, v2

    goto :goto_6

    :cond_8
    move-object v3, p1

    :goto_6
    sget-object v2, Lm91/t;->a:Lm91/t;

    invoke-virtual {v2}, Lm91/t;->b()Lm91/p;

    move-result-object v2

    sget v5, Lm91/o;->c:I

    and-int/lit8 v6, v1, 0xe

    or-int/2addr v5, v6

    sget v6, Lm91/p;->b:I

    shl-int/lit8 v6, v6, 0x3

    or-int/2addr v5, v6

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v5, v1

    const/4 v6, 0x4

    move-object v1, v2

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    goto :goto_7

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lbj0/a;

    const/4 v5, 0x2

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lbj0/a;-><init>(Lm91/o;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lui0/g;->e(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lri0/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lri0/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "onEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x2679481d

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    const/4 v4, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v7, v5, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v5, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    move v8, v4

    :goto_0
    or-int/2addr v8, v5

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v5

    :goto_1
    and-int/lit8 v9, v5, 0x30

    if-nez v9, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    const/16 v9, 0x20

    goto :goto_2

    :cond_3
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_4
    and-int/lit16 v9, v5, 0x180

    const/16 v10, 0x100

    if-nez v9, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    move v9, v10

    goto :goto_3

    :cond_5
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v8, v9

    :cond_6
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_8

    or-int/lit16 v8, v8, 0xc00

    :cond_7
    move/from16 v11, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_7

    move/from16 v11, p3

    invoke-virtual {v0, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x800

    goto :goto_4

    :cond_9
    const/16 v12, 0x400

    :goto_4
    or-int/2addr v8, v12

    :goto_5
    and-int/lit16 v12, v8, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_a

    move v12, v15

    goto :goto_6

    :cond_a
    move v12, v14

    :goto_6
    and-int/lit8 v13, v8, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_17

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_b

    move-object v7, v12

    :cond_b
    if-eqz v9, :cond_c

    move v11, v14

    :cond_c
    if-nez v2, :cond_d

    const v1, 0x3bb23c7a

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_d
    const v1, 0x3bb23c7b

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lri0/a;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_16

    const v1, 0x18f7b2b9

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v4, v4

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v13, v4, v9

    if-eqz v11, :cond_e

    const/16 v6, 0x5a

    int-to-float v6, v6

    goto :goto_7

    :cond_e
    move v6, v13

    :goto_7
    int-to-float v14, v15

    mul-float/2addr v14, v9

    invoke-static {v1, v13, v13, v6, v14}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/16 v13, 0x30

    invoke-static {v9, v6, v0, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_f
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_11

    :cond_10
    invoke-static {v9, v0, v9, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x1244df9e

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lri0/a;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm91/o;

    and-int/lit16 v9, v8, 0x380

    if-ne v9, v10, :cond_12

    const/4 v9, 0x1

    goto :goto_a

    :cond_12
    const/4 v9, 0x0

    :goto_a
    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v9, v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_13

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v13, v9, :cond_14

    :cond_13
    new-instance v13, La81/j;

    const/4 v9, 0x4

    invoke-direct {v13, v3, v6, v9}, La81/j;-><init>(Lkotlin/jvm/functions/Function1;Lm91/o;I)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v9, Lm91/o;->c:I

    const/4 v14, 0x0

    invoke-static {v6, v13, v0, v9, v14}, Lui0/g;->e(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x4

    int-to-float v9, v6

    invoke-static {v4, v9, v12, v0}, Ld;->w(FFLb2/t;Lp1/q;)V

    goto :goto_9

    :cond_15
    const/4 v9, 0x1

    const/4 v14, 0x0

    invoke-static {v0, v14, v9, v14}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_b

    :cond_16
    const v1, 0x19062bd4

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    :goto_c
    move-object v1, v7

    move v4, v11

    goto :goto_d

    :cond_17
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_c

    :goto_d
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Lry2/h;

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lry2/h;-><init>(Landroidx/compose/ui/Modifier;Lri0/a;Lkotlin/jvm/functions/Function1;ZII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lri0/b$j;

    invoke-virtual {p1}, Lm91/o;->e()Lm91/u;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lri0/b$j;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lri0/a;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lui0/g;->h(Landroidx/compose/ui/Modifier;Lri0/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
