.class public abstract Lyd2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a+\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0010\u001a+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00172\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lxd2/j;",
        "viewState",
        "Lkotlin/Function1;",
        "Lxd2/h$l;",
        "Ll83/a0;",
        "onNavEvent",
        "Lxd2/h$p;",
        "onViewEvent",
        "N",
        "(Lxd2/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lxd2/h;",
        "onEvent",
        "M",
        "(Lxd2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lxd2/j$b;",
        "S",
        "(Lxd2/j$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lxd2/a;",
        "J",
        "(Lxd2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "C",
        "(Landroidx/compose/runtime/Composer;I)V",
        "x",
        "Lxd2/j$a;",
        "E",
        "(Lxd2/j$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "shepherd_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;Lxd2/h$p;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lxd2/j$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyd2/k;->x(Lxd2/j$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v7, p0

    check-cast v7, Lp1/q;

    const p0, -0x656664ed

    invoke-virtual {v7, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v2, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v1}, Lkd1/w;->a()Lk91/a;

    move-result-object v1

    invoke-virtual {v1}, Lk91/a;->c()Lt0/i;

    move-result-object v1

    sget-object v2, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    const/4 v3, 0x6

    invoke-virtual {v2, v7, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    int-to-float v5, p0

    sget-object p0, Lyd2/b;->a:Lyd2/b;

    invoke-virtual {p0}, Lyd2/b;->b()Lc93/m;

    move-result-object v6

    const v8, 0x1b0006

    const/16 v9, 0x18

    const/4 v4, 0x0

    invoke-static/range {v0 .. v9}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lv41/c;

    const/16 v1, 0xf

    invoke-direct {v0, p1, v1}, Lv41/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final D(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lyd2/k;->C(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lxd2/j$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd2/j$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v3, 0x23256c2e

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v5

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/16 v19, 0x1

    const/4 v7, 0x0

    if-eq v4, v6, :cond_5

    move/from16 v4, v19

    goto :goto_4

    :cond_5
    move v4, v7

    :goto_4
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v15, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-virtual {v0}, Lxd2/j$a;->m()Lsz0/p0;

    move-result-object v4

    instance-of v4, v4, Lsz0/p0$h;

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_9

    const v4, -0x7ee01c87

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lxd2/j$a;->m()Lsz0/p0;

    move-result-object v4

    invoke-virtual {v4}, Lsz0/p0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v5, :cond_6

    goto :goto_5

    :cond_6
    move/from16 v19, v7

    :goto_5
    or-int v3, v4, v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    if-ne v4, v6, :cond_8

    :cond_7
    new-instance v4, Lyd2/j;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v3}, Lyd2/j;-><init>(Lxd2/j$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v12, v4

    check-cast v12, Lc93/a;

    new-instance v3, Lsz0/p0$h;

    const-wide/16 v10, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x0

    move-object v8, v3

    invoke-direct/range {v8 .. v14}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lxd2/j$a;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lsz0/p0$h;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v16, v5, v6

    const/16 v17, 0x0

    const/16 v18, 0xffc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v8, v7

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

    move v14, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move/from16 v2, v19

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    move-object v4, v1

    goto/16 :goto_b

    :cond_9
    move v2, v7

    const v4, -0x7edac3ce

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    move v4, v3

    invoke-virtual {v0}, Lxd2/j$a;->m()Lsz0/p0;

    move-result-object v3

    move v7, v4

    invoke-virtual {v0}, Lxd2/j$a;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lxd2/j$a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit8 v7, v7, 0x70

    if-ne v7, v5, :cond_a

    move/from16 v10, v19

    goto :goto_6

    :cond_a
    move v10, v2

    :goto_6
    or-int/2addr v9, v10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_b

    if-ne v10, v6, :cond_c

    :cond_b
    new-instance v10, Lyd2/j;

    const/4 v9, 0x1

    invoke-direct {v10, v0, v1, v9}, Lyd2/j;-><init>(Lxd2/j$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lc93/a;

    move-object v9, v10

    invoke-virtual {v0}, Lxd2/j$a;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-ne v7, v5, :cond_d

    move/from16 v12, v19

    goto :goto_7

    :cond_d
    move v12, v2

    :goto_7
    or-int/2addr v11, v12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_e

    if-ne v12, v6, :cond_f

    :cond_e
    new-instance v12, Lyd2/j;

    const/4 v11, 0x2

    invoke-direct {v12, v0, v1, v11}, Lyd2/j;-><init>(Lxd2/j$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v11, v12

    check-cast v11, Lc93/a;

    const/high16 v12, 0x30000

    sget v13, Lsz0/p0;->d:I

    or-int/2addr v12, v13

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v13, 0x3

    or-int/2addr v12, v14

    shl-int/lit8 v14, v13, 0x9

    or-int/2addr v12, v14

    shl-int/lit8 v13, v13, 0x15

    or-int v16, v12, v13

    const/16 v17, 0x0

    const/16 v18, 0xe44

    move v12, v5

    const/4 v5, 0x0

    move-object v13, v6

    move-object v6, v8

    const/4 v8, 0x1

    move v14, v7

    move-object v7, v9

    const/4 v9, 0x0

    move/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move/from16 v22, v14

    const/4 v14, 0x0

    move/from16 v1, v20

    move/from16 v2, v22

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0}, Lxd2/j$a;->g()Lxd2/h;

    move-result-object v3

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-ne v2, v1, :cond_10

    goto :goto_8

    :cond_10
    const/16 v19, 0x0

    :goto_8
    or-int v1, v4, v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_12

    move-object/from16 v13, v21

    if-ne v2, v13, :cond_11

    goto :goto_9

    :cond_11
    move-object/from16 v4, p1

    goto :goto_a

    :cond_12
    :goto_9
    new-instance v2, Lyd2/k$a;

    const/4 v1, 0x0

    move-object/from16 v4, p1

    invoke-direct {v2, v0, v4, v1}, Lyd2/k$a;-><init>(Lxd2/j$a;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v2, Lc93/m;

    invoke-static {v15, v2, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v12, 0x0

    invoke-virtual {v15, v12}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    move-object v4, v1

    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_14

    new-instance v2, Lv90/e;

    const/16 v3, 0x1c

    move/from16 v5, p3

    invoke-direct {v2, v0, v4, v5, v3}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final F(Lxd2/j$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lxd2/j$a;->g()Lxd2/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lxd2/j$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lxd2/j$a;->h()Lxd2/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lxd2/j$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lxd2/j$a;->j()Lxd2/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lxd2/j$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyd2/k;->E(Lxd2/j$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lxd2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    const v3, 0x4ef85b90

    invoke-virtual {v10, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    move/from16 v29, v3

    and-int/lit8 v3, v29, 0x13

    const/16 v5, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v3, v5, :cond_5

    move v3, v8

    goto :goto_4

    :cond_5
    move v3, v7

    :goto_4
    and-int/lit8 v9, v29, 0x1

    invoke-virtual {v10, v9, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_10

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v11, v4

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v11, v12

    const/4 v12, 0x0

    invoke-static {v3, v11, v12, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->J:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v4, v11, v10, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v10, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    :cond_7
    invoke-static {v11, v10, v11, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lxd2/a;->a()Lcom/whoop/navigation/e;

    move-result-object v3

    invoke-virtual {v0}, Lxd2/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v10, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v11, Ly2/d;->a:Ly2/m;

    new-instance v12, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v12, v11}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const/high16 v11, 0x40000000    # 2.0f

    float-to-double v13, v11

    const-wide/16 v15, 0x0

    cmpl-double v13, v13, v15

    if-lez v13, :cond_9

    goto :goto_6

    :cond_9
    const-string v13, "invalid weight; must be greater than zero"

    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v14, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v15, v11, v14

    if-lez v15, :cond_a

    move v11, v14

    :cond_a
    invoke-direct {v13, v11, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v12, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    invoke-virtual {v12, v10, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->P()Lb91/a;

    move-result-object v23

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v27, v16, 0x12

    const v28, 0x2fff8

    move v5, v7

    move/from16 v16, v8

    const-wide/16 v7, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move-object/from16 v18, v3

    move-object v3, v4

    move-object v4, v11

    const/4 v11, 0x0

    move-object/from16 v19, v12

    move/from16 v20, v13

    const-wide/16 v12, 0x0

    move/from16 v21, v5

    move-wide/from16 v40, v14

    move v15, v6

    move-wide/from16 v5, v40

    const/4 v14, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    move-object/from16 v26, v17

    const-wide/16 v16, 0x0

    move-object/from16 v30, v18

    const/16 v18, 0x0

    move-object/from16 v31, v19

    const/16 v19, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move-object/from16 v36, v26

    const/16 v26, 0x0

    move-object/from16 v37, v30

    move-object/from16 v38, v31

    move/from16 v39, v32

    move/from16 v0, v33

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v25

    invoke-virtual/range {p0 .. p0}, Lxd2/a;->b()I

    move-result v3

    invoke-static {v3, v10, v0}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v3

    const/4 v4, 0x1

    int-to-float v15, v4

    const/16 v16, 0x7

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v11, v36

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x18

    int-to-float v6, v6

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v5, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v6, v37

    if-eqz v6, :cond_f

    const v7, -0x1e69eace

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_b

    invoke-static {v10}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v7

    :cond_b
    move-object v12, v7

    check-cast v12, Lj0/i;

    sget-object v7, Landroidx/compose/foundation/d;->a:Lp1/b0;

    invoke-virtual {v10, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Lf0/v0;

    and-int/lit8 v7, v29, 0x70

    const/16 v15, 0x20

    if-ne v7, v15, :cond_c

    move v7, v4

    goto :goto_7

    :cond_c
    move v7, v0

    :goto_7
    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_d

    if-ne v9, v8, :cond_e

    :cond_d
    new-instance v9, Lck1/l;

    const/16 v7, 0xf

    invoke-direct {v9, v1, v6, v7}, Lck1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v16, v9

    check-cast v16, Lc93/a;

    const/16 v17, 0x1c

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v11, v36

    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_f
    const v6, -0x1e65fcc2

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v9, v36

    :goto_8
    invoke-interface {v5, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v0, v38

    move/from16 v6, v39

    invoke-virtual {v0, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    new-instance v9, Li2/p;

    const/4 v0, 0x5

    invoke-direct {v9, v6, v7, v0}, Li2/p;-><init>(JI)V

    const/16 v11, 0x30

    const/16 v12, 0x38

    move/from16 v16, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v0, v16

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v3, Lv90/e;

    const/16 v4, 0x1a

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final K(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    new-instance v0, Lxd2/h$i;

    invoke-direct {v0, p1}, Lxd2/h$i;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lxd2/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyd2/k;->J(Lxd2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final M(Lxd2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd2/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x2909e4e6

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    move v1, v3

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    instance-of v1, p0, Lxd2/j$a;

    if-eqz v1, :cond_6

    const v1, 0xe2461e5

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lxd2/j$a;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, p1, p2, v0}, Lyd2/k;->E(Lxd2/j$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    instance-of v1, p0, Lxd2/j$b;

    if-eqz v1, :cond_7

    const v1, 0xe24712d

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lxd2/j$b;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, p1, p2, v0}, Lyd2/k;->S(Lxd2/j$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const p0, 0xe245803

    invoke-static {p0, p2, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_8
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lv90/e;

    const/16 v1, 0x1b

    invoke-direct {v0, p0, p1, p3, v1}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final N(Lxd2/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd2/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, -0x1897f187

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    and-int/lit8 v5, v4, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v4

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    and-int/lit8 v6, v4, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    const/16 v8, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v8

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v5, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v6, v9, :cond_7

    move v6, v11

    goto :goto_5

    :cond_7
    move v6, v10

    :goto_5
    and-int/lit8 v9, v5, 0x1

    invoke-virtual {v0, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_12

    and-int/lit8 v6, v5, 0x70

    if-ne v6, v7, :cond_8

    move v9, v11

    goto :goto_6

    :cond_8
    move v9, v10

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_9

    if-ne v12, v13, :cond_a

    :cond_9
    new-instance v12, Lyd2/g;

    const/4 v9, 0x0

    invoke-direct {v12, v2, v9}, Lyd2/g;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v12, Lc93/a;

    invoke-static {v12, v10, v0, v10, v11}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v0, v10, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_d

    :cond_c
    invoke-static {v14, v0, v14, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v0, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-ne v6, v7, :cond_e

    const/4 v6, 0x1

    goto :goto_8

    :cond_e
    const/4 v6, 0x0

    :goto_8
    and-int/lit16 v7, v5, 0x380

    if-ne v7, v8, :cond_f

    const/4 v10, 0x1

    goto :goto_9

    :cond_f
    const/4 v10, 0x0

    :goto_9
    or-int/2addr v6, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_10

    if-ne v7, v13, :cond_11

    :cond_10
    new-instance v7, Lb70/c;

    const/16 v6, 0x15

    invoke-direct {v7, v2, v6, v3}, Lb70/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v5, v5, 0xe

    invoke-static {v1, v7, v0, v5}, Lyd2/k;->M(Lxd2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lvv2/c;

    const/16 v5, 0xc

    invoke-direct/range {v0 .. v5}, Lvv2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final O(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lxd2/h$d;->a:Lxd2/h$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lxd2/h;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lxd2/h$l;

    if-eqz v0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of p0, p2, Lxd2/h$p;

    if-eqz p0, :cond_1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final Q(Lxd2/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lyd2/k;->N(Lxd2/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lxd2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyd2/k;->M(Lxd2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lxd2/j$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd2/j$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0x4e71e0ca

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    const/16 v14, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v14

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v15, 0x12

    if-eq v4, v15, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v7, v8, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_25

    and-int/lit8 v4, v3, 0x70

    and-int/lit8 v3, v3, 0x7e

    invoke-static {v0, v1, v7, v3}, Lyd2/k;->x(Lxd2/j$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v3, v8}, Lr;->f(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v10, v11, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    move/from16 v17, v5

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_5

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v7, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move/from16 v20, v15

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-nez v15, :cond_6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    :cond_6
    invoke-static {v5, v7, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v7, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v5, "ArrhythmiaSettingsToolbar"

    invoke-static {v3, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v22, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v0}, Lxd2/j$b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual {v0}, Lxd2/j$b;->c()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    sget v9, Lkd2/a;->d:I

    invoke-static {v7, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v26

    const v39, 0xfff2

    const/16 v40, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v22 .. v40}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-ne v4, v14, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    const/4 v9, 0x0

    :goto_5
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v23, v12

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_9

    if-ne v15, v12, :cond_a

    :cond_9
    new-instance v15, Lyd2/g;

    const/4 v9, 0x3

    invoke-direct {v15, v1, v9}, Lyd2/g;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v15, Lc93/a;

    sget v9, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v24, v12

    const/4 v12, 0x3

    shl-int/2addr v9, v12

    or-int/lit8 v9, v9, 0x6

    move-object/from16 v17, v11

    const/16 v11, 0x34

    move-object/from16 v25, v3

    move-object v3, v5

    const/4 v5, 0x0

    move-object/from16 v26, v10

    move v10, v9

    move-object v9, v7

    const/4 v7, 0x0

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move/from16 v16, v4

    move-object/from16 v44, v6

    move-object v6, v15

    move-object/from16 v41, v17

    move-object/from16 v4, v22

    move-object/from16 v43, v26

    move-object/from16 v42, v27

    const/4 v12, 0x1

    const/4 v15, 0x0

    move-object/from16 v17, v13

    move-object/from16 v13, v25

    invoke-static/range {v3 .. v11}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    int-to-float v3, v12

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v9, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lxd2/j$b;->d()Lxd2/a;

    move-result-object v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v7, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v7, v6

    or-int v7, v7, v16

    invoke-static {v5, v1, v9, v7}, Lyd2/k;->J(Lxd2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Lxd2/j$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v9, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    int-to-float v7, v6

    mul-float/2addr v7, v4

    const/4 v8, 0x0

    move v10, v4

    invoke-static {v13, v7, v8, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v11, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ly81/i;->c1()J

    move-result-wide v25

    invoke-virtual {v11, v9, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v6

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v27, v11, 0x12

    const v28, 0x2fff8

    move v11, v7

    move/from16 v19, v8

    const-wide/16 v7, 0x0

    move/from16 v20, v3

    move-object v3, v5

    move-object/from16 v22, v23

    move-object/from16 v23, v6

    move-wide/from16 v5, v25

    move-object/from16 v25, v9

    const/4 v9, 0x0

    move/from16 v26, v10

    const/4 v10, 0x0

    move/from16 v29, v11

    const/4 v11, 0x0

    move/from16 v30, v12

    move-object/from16 v31, v13

    const-wide/16 v12, 0x0

    move/from16 v32, v14

    const/4 v14, 0x0

    move/from16 v33, v15

    const/4 v15, 0x0

    move/from16 v34, v16

    move-object/from16 v35, v17

    const-wide/16 v16, 0x0

    const/16 v36, 0x4

    const/16 v18, 0x0

    move/from16 v37, v19

    const/16 v19, 0x0

    move/from16 v38, v20

    const/16 v20, 0x0

    const/16 v39, 0x2

    const/16 v21, 0x0

    move-object/from16 v40, v22

    const/16 v22, 0x0

    move-object/from16 v45, v24

    const/16 v24, 0x0

    move/from16 v46, v26

    const/16 v26, 0x30

    move-object/from16 v1, v31

    move/from16 v0, v38

    move-object/from16 v47, v45

    const/4 v2, 0x3

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v25

    int-to-float v2, v2

    mul-float v2, v2, v46

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v9, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lxd2/j$b;->b()Z

    move-result v2

    if-nez v2, :cond_b

    const v2, 0x4adf1f98    # 7311308.0f

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-static {v9, v15}, Lyd2/k;->C(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    const/4 v15, 0x0

    const v2, 0x4adfbd42    # 7331489.0f

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    :goto_6
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move/from16 v11, v29

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {v1, v11, v0, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->a:Ll0/e;

    sget-object v5, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v5, v9, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_c

    move-object/from16 v10, v40

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v12, v42

    goto :goto_8

    :cond_c
    move-object/from16 v10, v40

    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v9, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v13, v43

    invoke-static {v9, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    move-object/from16 v14, v44

    goto :goto_a

    :cond_e
    move-object/from16 v14, v44

    :goto_9
    move-object/from16 v15, v35

    goto :goto_b

    :goto_a
    invoke-static {v5, v9, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v9, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lxd2/j$b;->f()Lm91/u;

    move-result-object v3

    move/from16 v4, v34

    const/16 v5, 0x20

    if-ne v4, v5, :cond_f

    const/4 v6, 0x1

    goto :goto_c

    :cond_f
    const/4 v6, 0x0

    :goto_c
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_11

    move-object/from16 v6, v47

    if-ne v7, v6, :cond_10

    goto :goto_d

    :cond_10
    move-object/from16 v0, p1

    goto :goto_e

    :cond_11
    move-object/from16 v6, v47

    :goto_d
    new-instance v7, Lyd2/h;

    const/4 v8, 0x4

    move-object/from16 v0, p1

    invoke-direct {v7, v0, v8}, Lyd2/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    move-object/from16 v25, v9

    const/4 v9, 0x6

    move/from16 v34, v4

    const/4 v4, 0x0

    move/from16 v32, v5

    const/4 v5, 0x0

    move-object/from16 v49, v6

    move-object v6, v7

    move-object/from16 v7, v25

    move/from16 v48, v34

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v7

    const/4 v3, 0x1

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    const/4 v4, 0x4

    int-to-float v4, v4

    move/from16 v5, v46

    invoke-static {v4, v5, v1, v9}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v4, v1

    const-wide/16 v6, 0x0

    cmpl-double v4, v4, v6

    if-lez v4, :cond_12

    goto :goto_f

    :cond_12
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v1, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v11, v4, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    move-object/from16 v4, v41

    const/4 v5, 0x0

    invoke-static {v2, v4, v9, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_13

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_13
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v9, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :cond_14
    invoke-static {v4, v9, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v9, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v12, v3

    invoke-virtual/range {p0 .. p0}, Lxd2/j$b;->h()Lxd2/g;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lxd2/j$b;->i()Z

    move-result v4

    move/from16 v1, v48

    const/16 v2, 0x20

    if-ne v1, v2, :cond_16

    move v6, v12

    goto :goto_11

    :cond_16
    move v6, v5

    :goto_11
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_17

    move-object/from16 v6, v49

    if-ne v7, v6, :cond_18

    goto :goto_12

    :cond_17
    move-object/from16 v6, v49

    :goto_12
    new-instance v7, Lyd2/h;

    const/4 v8, 0x0

    invoke-direct {v7, v0, v8}, Lyd2/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v7, Lkotlin/jvm/functions/Function1;

    if-ne v1, v2, :cond_19

    move v8, v12

    goto :goto_13

    :cond_19
    move v8, v5

    :goto_13
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_1a

    if-ne v10, v6, :cond_1b

    :cond_1a
    new-instance v10, Lyd2/h;

    const/4 v8, 0x1

    invoke-direct {v10, v0, v8}, Lyd2/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v10, Lkotlin/jvm/functions/Function1;

    if-ne v1, v2, :cond_1c

    move v8, v12

    goto :goto_14

    :cond_1c
    move v8, v5

    :goto_14
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_1d

    if-ne v11, v6, :cond_1e

    :cond_1d
    new-instance v11, Lyd2/h;

    const/4 v8, 0x2

    invoke-direct {v11, v0, v8}, Lyd2/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v11, Lkotlin/jvm/functions/Function1;

    if-ne v1, v2, :cond_1f

    move v8, v12

    goto :goto_15

    :cond_1f
    move v8, v5

    :goto_15
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v8, :cond_20

    if-ne v13, v6, :cond_21

    :cond_20
    new-instance v13, Lyd2/h;

    const/4 v8, 0x3

    invoke-direct {v13, v0, v8}, Lyd2/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object v8, v13

    check-cast v8, Lkotlin/jvm/functions/Function1;

    if-ne v1, v2, :cond_22

    move v5, v12

    :cond_22
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v5, :cond_23

    if-ne v1, v6, :cond_24

    :cond_23
    new-instance v1, Lyd2/g;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lyd2/g;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v1, Lc93/a;

    move-object v5, v7

    move-object v7, v11

    const/4 v11, 0x0

    move-object v6, v10

    move-object v10, v9

    move-object v9, v1

    invoke-static/range {v3 .. v11}, Lyd2/d;->u(Lxd2/g;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v9, v10

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_25
    move-object v0, v1

    move-object v9, v7

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_16
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_26

    new-instance v2, Lyd2/i;

    const/4 v3, 0x0

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v4, v0, v5, v3}, Lyd2/i;-><init>(Lxd2/j$b;Lkotlin/jvm/functions/Function1;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final T(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lxd2/h$d;->a:Lxd2/h$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lxd2/h$k;->a:Lxd2/h$k;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final V(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "nextToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxd2/h$g;

    invoke-direct {v0, p1}, Lxd2/h$g;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lxd2/h$e;->a:Lxd2/h$e;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final X(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxd2/h$j;

    invoke-direct {v0, p1}, Lxd2/h$j;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Y(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxd2/h$f;

    invoke-direct {v0, p1}, Lxd2/h$f;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Z(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lxd2/h$h;->a:Lxd2/h$h;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lxd2/j$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyd2/k;->B(Lxd2/j$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(Lxd2/j$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyd2/k;->S(Lxd2/j$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyd2/k;->O(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxd2/j$b;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyd2/k;->y(Lxd2/j$b;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lyd2/k;->U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyd2/k;->T(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxd2/j$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyd2/k;->a0(Lxd2/j$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lyd2/k;->W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxd2/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyd2/k;->L(Lxd2/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lyd2/k;->Y(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxd2/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyd2/k;->Q(Lxd2/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lxd2/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyd2/k;->P(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lxd2/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lxd2/j$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyd2/k;->I(Lxd2/j$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lxd2/j$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyd2/k;->F(Lxd2/j$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lxd2/j$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyd2/k;->H(Lxd2/j$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lyd2/k;->K(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyd2/k;->D(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lyd2/k;->X(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyd2/k;->Z(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyd2/k;->z(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lxd2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyd2/k;->R(Lxd2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Lxd2/h$p;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyd2/k;->A(Lkotlin/jvm/functions/Function1;Lxd2/h$p;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lyd2/k;->V(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lxd2/j$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyd2/k;->G(Lxd2/j$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final x(Lxd2/j$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd2/j$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, -0xa430c83

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_4

    move v0, v3

    goto :goto_3

    :cond_4
    move v0, v2

    :goto_3
    and-int/2addr p2, v3

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lxd2/j$b;->g()Lxd2/b;

    move-result-object p2

    if-eqz p2, :cond_5

    move v2, v3

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance p2, Lvv2/d;

    const/16 v1, 0xa

    invoke-direct {p2, v1, p0, p1}, Lvv2/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3cfd969e

    invoke-static {v1, v5, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0x6c00

    const/4 v7, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "dialog"

    invoke-static/range {v0 .. v7}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lyd2/i;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lyd2/i;-><init>(Lxd2/j$b;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final y(Lxd2/j$b;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 40

    move-object/from16 v0, p1

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    and-int/2addr v2, v5

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    if-eqz v1, :cond_8

    invoke-virtual/range {p0 .. p0}, Lxd2/j$b;->g()Lxd2/b;

    move-result-object v1

    if-eqz v1, :cond_8

    const v1, -0x75a3a88d

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lxd2/j$b;->g()Lxd2/b;

    move-result-object v1

    invoke-virtual {v1}, Lxd2/b;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v2, Lxd2/h$o;

    invoke-virtual {v1}, Lxd2/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lxd2/h$o;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    sget-object v2, Lxd2/h$n;->a:Lxd2/h$n;

    :goto_3
    invoke-virtual {v1}, Lxd2/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lxd2/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lxd2/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lxd2/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_4

    if-ne v3, v5, :cond_5

    :cond_4
    new-instance v3, Lyd2/g;

    const/4 v1, 0x2

    invoke-direct {v3, v0, v1}, Lyd2/g;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v29, v3

    check-cast v29, Lc93/a;

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_6

    if-ne v3, v5, :cond_7

    :cond_6
    new-instance v3, Lwr0/r;

    const/16 v1, 0x16

    invoke-direct {v3, v0, v2, v1}, Lwr0/r;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v31, v3

    check-cast v31, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v0, 0x3

    shl-int/lit8 v2, v0, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0x9

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x1b

    or-int v36, v1, v0

    const/16 v38, 0x0

    const v39, 0xebfedf1

    const/4 v7, 0x0

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

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x180

    move-object/from16 v35, v4

    invoke-static/range {v7 .. v39}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v0, v35

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_8
    move-object v0, v4

    const v1, -0x7597ad9c

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_9
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lxd2/h$c;->a:Lxd2/h$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
