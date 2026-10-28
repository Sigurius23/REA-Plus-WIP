.class public abstract Lsy0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lsy0/e;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "c",
        "(Lsy0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lsy0/e;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsy0/d;->d(Lsy0/e;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lsy0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsy0/d;->e(Lsy0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lsy0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsy0/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v3, 0x73916f15

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v4, 0x6

    const/4 v5, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v4, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v4

    goto :goto_2

    :cond_2
    move v3, v4

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
    or-int/2addr v3, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit16 v9, v3, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    if-eq v9, v10, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move v9, v11

    :goto_6
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_14

    if-eqz v6, :cond_9

    sget-object v6, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_9
    move-object v6, v8

    :goto_7
    invoke-virtual {v1}, Lsy0/e;->c()Lsy0/k;

    move-result-object v8

    instance-of v8, v8, Lsy0/k$c;

    if-nez v8, :cond_b

    invoke-virtual {v1}, Lsy0/e;->c()Lsy0/k;

    move-result-object v8

    instance-of v8, v8, Lsy0/k$h;

    if-eqz v8, :cond_a

    goto :goto_8

    :cond_a
    move v8, v11

    goto :goto_9

    :cond_b
    :goto_8
    const/4 v8, 0x1

    :goto_9
    if-nez v8, :cond_c

    invoke-virtual {v1}, Lsy0/e;->e()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_c

    const/4 v8, 0x1

    goto :goto_a

    :cond_c
    move v8, v11

    :goto_a
    invoke-virtual {v1}, Lsy0/e;->e()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lsy0/e;->c()Lsy0/k;

    move-result-object v10

    invoke-virtual {v1}, Lsy0/e;->i()Z

    move-result v13

    invoke-virtual {v1}, Lsy0/e;->f()Ljava/lang/Integer;

    move-result-object v14

    if-eqz v14, :cond_d

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    goto :goto_b

    :cond_d
    const/4 v14, 0x3

    :goto_b
    if-eqz v8, :cond_e

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    goto :goto_c

    :cond_e
    move-object v8, v6

    :goto_c
    sget-object v15, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v15, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v15

    invoke-virtual {v1}, Lsy0/e;->h()Ly81/f;

    move-result-object v12

    invoke-virtual {v12, v0, v11}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    and-int/lit8 v12, v3, 0xe

    if-eq v12, v5, :cond_10

    and-int/lit8 v5, v3, 0x8

    if-eqz v5, :cond_f

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    goto :goto_d

    :cond_f
    move v5, v11

    goto :goto_e

    :cond_10
    :goto_d
    const/4 v5, 0x1

    :goto_e
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v7, :cond_11

    const/4 v11, 0x1

    :cond_11
    or-int v3, v5, v11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_12

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_13

    :cond_12
    new-instance v5, Lsy0/c;

    const/4 v3, 0x0

    invoke-direct {v5, v1, v2, v3}, Lsy0/c;-><init>(Lsy0/e;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v20, 0x0

    const/16 v21, 0x188

    move-object v12, v8

    const/4 v8, 0x0

    move v7, v13

    const/4 v13, 0x0

    move-object v3, v6

    move-object v6, v10

    move-wide v10, v15

    move-wide/from16 v15, v17

    move-object/from16 v17, v5

    move-object v5, v9

    move v9, v14

    const/4 v14, 0x0

    const/16 v19, 0x0

    move-object/from16 v18, v0

    invoke-static/range {v5 .. v21}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_f

    :cond_14
    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    move-object v3, v8

    :goto_f
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_15

    new-instance v0, Ls51/b;

    const/16 v6, 0x15

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ll83/e;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final d(Lsy0/e;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lsy0/e;->g()Lsy0/a;

    move-result-object p0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lsy0/a;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lsy0/a;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    :goto_0
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private static final e(Lsy0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsy0/d;->c(Lsy0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
