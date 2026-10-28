.class public abstract Lgt1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a/\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ldt1/a;",
        "state",
        "Lkotlin/Function1;",
        "Lft1/a;",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Ldt1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "labrador_release"
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
.method public static synthetic a(Lft1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgt1/c;->f(Lft1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ldt1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgt1/c;->i(Ldt1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ldt1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgt1/c;->h(Lkotlin/jvm/functions/Function1;Ldt1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgt1/c;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ldt1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, -0x5d97d6a1

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v4

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, v2, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_5

    move v6, v8

    goto :goto_4

    :cond_5
    move v6, v9

    :goto_4
    and-int/lit8 v7, v2, 0x1

    invoke-virtual {v0, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_f

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_6

    new-instance v3, Lgo1/a;

    const/4 v5, 0x5

    invoke-direct {v3, v5}, Lgo1/a;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v3, v5

    :goto_5
    if-eqz v1, :cond_e

    const v5, 0x7768e5e1

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget v5, Lrs1/f;->t:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget v7, Lrs1/f;->s:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    sget v10, Lrs1/f;->u:I

    invoke-static {v10}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    sget v11, Lrs1/f;->c:I

    invoke-static {v11}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    and-int/lit8 v2, v2, 0x70

    if-ne v2, v4, :cond_8

    move v12, v8

    goto :goto_6

    :cond_8
    move v12, v9

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_9

    if-ne v13, v6, :cond_a

    :cond_9
    new-instance v13, Lfa0/a;

    const/16 v12, 0x16

    invoke-direct {v13, v3, v12}, Lfa0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v24, v13

    check-cast v24, Lc93/a;

    if-ne v2, v4, :cond_b

    goto :goto_7

    :cond_b
    move v8, v9

    :goto_7
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_c

    if-ne v4, v6, :cond_d

    :cond_c
    new-instance v4, Lf1/w1;

    const/16 v2, 0xf

    invoke-direct {v4, v2, v3, v1}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v26, v4

    check-cast v26, Lc93/a;

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v4, v2, 0x3

    shl-int/lit8 v6, v2, 0x6

    or-int/2addr v4, v6

    shl-int/lit8 v6, v2, 0x9

    or-int/2addr v4, v6

    shl-int/lit8 v2, v2, 0x1b

    or-int v31, v4, v2

    const/16 v33, 0x0

    const v34, 0xebffdf1

    const/4 v2, 0x0

    const/4 v6, 0x0

    move-object v4, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v12, v9

    const/4 v9, 0x0

    move-object v13, v3

    move-object v3, v5

    move-object v5, v10

    const/4 v10, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move-object/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move-object/from16 v32, v29

    const/16 v29, 0x0

    move-object/from16 v35, v32

    const/16 v32, 0x0

    move/from16 v36, v30

    move-object/from16 v30, v0

    move/from16 v0, v36

    invoke-static/range {v2 .. v34}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v2, v30

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    move-object v2, v0

    move-object/from16 v35, v3

    move v0, v9

    const v3, 0x7770fec3

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_8
    move-object/from16 v3, v35

    goto :goto_9

    :cond_f
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object v3, v5

    :goto_9
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lfc0/e;

    const/4 v5, 0x7

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final f(Lft1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lft1/a$c;->a:Lft1/a$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Ldt1/a;)Ll83/a0;
    .locals 2

    new-instance v0, Lft1/a$b;

    invoke-virtual {p1}, Ldt1/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ldt1/a;->b()Ljava/time/Instant;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lft1/a$b;-><init>(Ljava/lang/String;Ljava/time/Instant;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ldt1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lgt1/c;->e(Ldt1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
