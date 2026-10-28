.class public abstract Lvm1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lvm1/b;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onErrorCtaPress",
        "d",
        "(Lvm1/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "home_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lvm1/a;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lvm1/b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lvm1/a;->g(Lvm1/b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvm1/a;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lvm1/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvm1/b;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v0, 0x44d38198

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v3

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    move v5, v8

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v14, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_e

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_6

    new-instance v2, Lve/a;

    const/16 v4, 0x10

    invoke-direct {v2, v4}, Lve/a;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lc93/a;

    goto :goto_5

    :cond_7
    move-object v2, v4

    :goto_5
    instance-of v4, v1, Lvm1/b$b;

    if-eqz v4, :cond_8

    const v0, 0x6138a0b0

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    move-object v4, v2

    new-instance v2, Lsz0/p0$e;

    move-object v0, v1

    check-cast v0, Lvm1/b$b;

    invoke-virtual {v0}, Lvm1/b$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v3, Lgy0/a;->A3:I

    invoke-direct {v2, v0, v3}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v0, Lsz0/p0$e;->g:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int v15, v0, v5

    const/16 v16, 0x0

    const/16 v17, 0xffc

    move-object v0, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 p1, v0

    move/from16 v0, v18

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object/from16 v18, p1

    goto/16 :goto_9

    :cond_8
    move-object v4, v2

    move v2, v0

    move v0, v8

    instance-of v6, v1, Lvm1/b$c;

    if-eqz v6, :cond_9

    const v2, 0x613d8431

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    new-instance v2, Lsz0/p0$h;

    move-object v3, v1

    check-cast v3, Lvm1/b$c;

    invoke-virtual {v3}, Lvm1/b$c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v10, 0x6

    const/4 v11, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lvm1/b$c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v5, Lsz0/p0$h;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v15, v5, v6

    const/16 v16, 0x0

    const/16 v17, 0xffc

    move-object v5, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v18

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_9

    :cond_9
    move-object/from16 v19, v4

    instance-of v4, v1, Lvm1/b$a;

    if-eqz v4, :cond_d

    const v4, 0x61417905

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    new-instance v8, Lsz0/p0$b;

    move-object v4, v1

    check-cast v4, Lvm1/b$a;

    invoke-virtual {v4}, Lvm1/b$a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Lvm1/b$a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v4}, Lvm1/b$a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    and-int/lit8 v2, v2, 0x70

    if-ne v2, v3, :cond_a

    goto :goto_6

    :cond_a
    move v7, v0

    :goto_6
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v7, :cond_c

    if-ne v2, v5, :cond_b

    goto :goto_7

    :cond_b
    move-object/from16 v5, v19

    goto :goto_8

    :cond_c
    :goto_7
    new-instance v2, Lry2/g;

    const/16 v3, 0xf

    move-object/from16 v5, v19

    invoke-direct {v2, v5, v3}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v2, Lc93/a;

    sget v3, Lsz0/p0$b;->h:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v7, 0x3

    or-int/2addr v3, v9

    shl-int/lit8 v7, v7, 0x9

    or-int v15, v3, v7

    const/16 v16, 0x0

    const/16 v17, 0xfe4

    move-object v7, v5

    move-object v5, v4

    const/4 v4, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    move-object v3, v6

    move-object v6, v2

    move-object v2, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_9
    move-object/from16 v3, v18

    goto :goto_a

    :cond_d
    const v1, 0x5df98c4a

    invoke-static {v1, v14, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_e
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v4

    :goto_a
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lt80/b;

    const/16 v5, 0x10

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lvm1/b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lvm1/a;->d(Lvm1/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
