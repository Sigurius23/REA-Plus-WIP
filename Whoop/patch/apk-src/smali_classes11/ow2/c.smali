.class public abstract Low2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Llw2/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Llw2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkw2/b;",
        "onNavEvent",
        "d",
        "(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "what-to-expect_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Low2/c;->e(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Low2/c;->g(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Low2/c;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llw2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v6, p4

    sget-object v3, Lb2/e;->w:Lb2/m;

    const-string v4, "viewState"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onViewEvent"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onNavEvent"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    const v5, -0x79f7f3a4

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v6, 0x6

    const/4 v7, 0x2

    if-nez v5, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v7

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    const/16 v9, 0x20

    if-nez v8, :cond_3

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    move v8, v9

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    :cond_5
    and-int/lit16 v8, v5, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v8, v10, :cond_6

    move v8, v11

    goto :goto_4

    :cond_6
    move v8, v12

    :goto_4
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v4, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_15

    invoke-virtual {v0}, Llw2/c;->i()Z

    move-result v8

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v8, :cond_a

    const v5, 0x6299afb8

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-static {v3, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_5
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v5, v4, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v4, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v3, Lsz0/p0$c;->f:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int v20, v3, v5

    const/16 v21, 0x0

    const/16 v22, 0xffc

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v3, v11

    const/4 v11, 0x0

    move v5, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v4

    move v4, v3

    move v3, v5

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v19

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_9

    :cond_a
    move-object v8, v4

    move v4, v11

    move v11, v12

    invoke-virtual {v0}, Llw2/c;->h()Z

    move-result v12

    if-eqz v12, :cond_14

    const v12, 0x629c7dce

    invoke-virtual {v8, v12}, Lp1/q;->e0(I)V

    invoke-static {v3, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_6
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v8, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-nez v13, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_d

    :cond_c
    invoke-static {v12, v8, v12, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v12, Lsz0/p0$b;

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lfw2/a;->b:I

    const/4 v10, 0x0

    invoke-direct {v13, v3, v10, v7, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v14, Lfw2/a;->a:I

    invoke-direct {v13, v14, v10, v7, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v5, v5, 0x70

    if-ne v5, v9, :cond_e

    move v7, v4

    goto :goto_7

    :cond_e
    move v7, v11

    :goto_7
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_f

    if-ne v10, v14, :cond_10

    :cond_f
    new-instance v10, Low2/b;

    const/4 v7, 0x0

    invoke-direct {v10, v1, v7}, Low2/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v10, Lc93/a;

    if-ne v5, v9, :cond_11

    move v5, v4

    goto :goto_8

    :cond_11
    move v5, v11

    :goto_8
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_12

    if-ne v7, v14, :cond_13

    :cond_12
    new-instance v7, Low2/b;

    const/4 v5, 0x1

    invoke-direct {v7, v1, v5}, Low2/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v7, Lc93/a;

    sget v5, Lsz0/p0$b;->h:I

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v9, 0x3

    or-int/2addr v5, v9

    sget v9, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v9, v9, 0x9

    or-int v20, v5, v9

    const/16 v21, 0x0

    const/16 v22, 0xfe0

    move v5, v11

    move-object v11, v7

    move-object v7, v12

    const/4 v12, 0x0

    move-object v9, v10

    move-object v10, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v8

    move-object v8, v3

    move v3, v5

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v19

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_14
    move v3, v11

    const v4, 0x62a4b553

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    and-int/lit16 v4, v5, 0x3fe

    const/4 v5, 0x0

    move-object v3, v8

    invoke-static/range {v0 .. v5}, Low2/f;->n(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_15
    move-object v8, v4

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lnx1/g;

    const/4 v5, 0x7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v6

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 4

    new-instance v0, Llw2/a$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Llw2/a$a;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 4

    new-instance v0, Llw2/a$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Llw2/a$a;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Low2/c;->d(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
