.class public abstract Ltz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0014\u0010\u000c\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ltz0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Ltz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Ltz0/c;",
        "achievementProgressCardFractionPreviewState",
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


# static fields
.field private static final a:Ltz0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Ltz0/c;

    const-string v1, "6"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v2, "/10"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "\u062a\u0628\u0642\u0649 \u0644\u0643 4 \u0644\u0644\u0648\u0635\u0648\u0644 \u0625\u0644\u0649 \u0625\u0646\u062c\u0627\u0632\u0643 \u0627\u0644\u0642\u0627\u062f\u0645"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v6, Lkd1/o$a;

    sget v4, Lgy0/a;->T:I

    invoke-direct {v6, v4}, Lkd1/o$a;-><init>(I)V

    const-wide v4, 0x3fe3333333333333L    # 0.6

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    const/16 v11, 0x58

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Ltz0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/f;Lkd1/o;Li51/s;Ljava/lang/Double;ZLcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltz0/b;->a:Ltz0/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ltz0/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ltz0/b;->g(Lkotlin/jvm/functions/Function1;Ltz0/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltz0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ltz0/b;->h(Ltz0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ltz0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ltz0/b;->i(Landroidx/compose/ui/Modifier;Ltz0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltz0/b;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Ltz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ltz0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x50afe7bb

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v1

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    const/16 v8, 0x100

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    move v11, v8

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v6, v11

    :goto_4
    and-int/lit16 v11, v6, 0x93

    const/16 v12, 0x92

    const/4 v15, 0x0

    if-eq v11, v12, :cond_8

    const/4 v11, 0x1

    goto :goto_5

    :cond_8
    move v11, v15

    :goto_5
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_20

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object/from16 v0, v16

    goto :goto_6

    :cond_9
    move-object v0, v5

    :goto_6
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_a

    new-instance v7, Lt71/i;

    const/16 v9, 0x18

    invoke-direct {v7, v9}, Lt71/i;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v12, v7

    goto :goto_7

    :cond_b
    move-object v12, v9

    :goto_7
    invoke-virtual {v2}, Ltz0/c;->e()Lcom/whoop/navigation/e;

    move-result-object v7

    if-eqz v7, :cond_f

    const v7, -0x59b50742

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    and-int/lit16 v6, v6, 0x380

    if-ne v6, v8, :cond_c

    const/4 v6, 0x1

    goto :goto_8

    :cond_c
    move v6, v15

    :goto_8
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_d

    if-ne v7, v5, :cond_e

    :cond_d
    new-instance v7, Ls51/f;

    const/16 v5, 0x13

    invoke-direct {v7, v12, v2, v5}, Ls51/f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v20, v7

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v14, v16

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_f
    move-object/from16 v14, v16

    const v5, -0x59b3db11

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    move-object v5, v14

    :goto_9
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2}, Ltz0/c;->a()Ly81/f;

    move-result-object v7

    invoke-virtual {v7, v10, v15}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    const/16 v9, 0xc

    int-to-float v11, v9

    invoke-static {v11}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v5, v7, v8, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v8, v10, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->W0()J

    move-result-wide v3

    invoke-static {v11}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v5, v7, v3, v4, v9}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v1, v1

    mul-float v4, v1, v1

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_10

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-nez v15, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v31, v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_b

    :cond_11
    move-object/from16 v31, v0

    :goto_b
    invoke-static {v6, v10, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, Lb2/e;->K:Lb2/l;

    const/4 v3, 0x2

    int-to-float v3, v3

    move-object/from16 p3, v8

    const/16 v8, 0x8

    int-to-float v8, v8

    move/from16 v17, v11

    const/16 v11, 0x36

    invoke-static {v3, v8, v15, v10, v11}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    move-object v15, v12

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    move/from16 v19, v8

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_13

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v10, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_14
    invoke-static {v11, v10, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ltz0/c;->f()Li51/s;

    move-result-object v3

    if-eqz v3, :cond_16

    const v3, 0x26db853c

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    move-object v3, v5

    invoke-virtual {v2}, Ltz0/c;->f()Li51/s;

    move-result-object v5

    mul-float v11, v17, v1

    invoke-static {v11, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v27, v10

    const/16 v10, 0x30

    const/16 v11, 0xc

    move-object v8, v7

    const/4 v7, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    move-object/from16 v32, v3

    move-object/from16 v33, v12

    move-object/from16 p0, v15

    const/4 v15, 0x6

    move-object/from16 v3, p3

    move-object v12, v9

    move-object/from16 v9, v27

    invoke-static/range {v5 .. v11}, Li51/r;->d(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v9

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    const/high16 v5, 0x3f800000    # 1.0f

    move-object/from16 v35, p0

    move/from16 p2, v4

    move-object v15, v12

    move-object v4, v13

    move-object v3, v14

    goto/16 :goto_e

    :cond_16
    move-object/from16 v3, p3

    move-object/from16 v32, v5

    move-object/from16 v33, v7

    move-object v12, v9

    move-object/from16 p0, v15

    const/4 v15, 0x6

    invoke-virtual {v2}, Ltz0/c;->g()Lkd1/o;

    move-result-object v5

    if-eqz v5, :cond_17

    const v5, 0x26db9eb9

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Ltz0/c;->g()Lkd1/o;

    move-result-object v5

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object v10, v8

    sget v6, Lgy0/f;->y:I

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    mul-float v11, v17, v1

    invoke-static {v11, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v8, v13

    const/16 v13, 0x180

    move-object v9, v14

    const/16 v14, 0x78

    move-object v11, v8

    const/4 v8, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v35, p0

    move-object/from16 p3, v3

    move/from16 p2, v4

    move-object v15, v12

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    move-object/from16 v12, v27

    const/4 v2, 0x1

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_d
    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_e

    :cond_17
    move-object/from16 p3, v3

    move/from16 p2, v4

    move-object v15, v12

    move-object v4, v13

    move-object v3, v14

    const/4 v2, 0x1

    const/4 v5, 0x0

    move-object/from16 v35, p0

    const v6, 0x26dbc370

    move/from16 v7, v17

    invoke-static {v10, v6, v7, v1, v3}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    float-to-double v6, v5

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_18

    goto :goto_f

    :cond_18
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v5, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v5, Lb2/e;->M:Lb2/k;

    sget-object v7, Ll0/m;->e:Ll0/h;

    const/16 v8, 0x36

    invoke-static {v7, v5, v10, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_19

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_19
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v10, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v32

    invoke-static {v10, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_1a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    :cond_1a
    move-object/from16 v12, v33

    invoke-static {v7, v10, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb3/v1;->n:Lp1/u2;

    sget-object v4, Ly3/m;->w:Ly3/m;

    invoke-virtual {v0, v4}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v4, Ltx0/a;

    const/4 v5, 0x1

    move-object/from16 v6, p1

    invoke-direct {v4, v6, v5}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    const v5, 0x35f09f5b

    invoke-static {v5, v10, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v5, 0x38

    invoke-static {v0, v4, v10, v5}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v4

    mul-float v18, v0, v19

    invoke-virtual {v6}, Ltz0/c;->j()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1c

    move/from16 v20, v18

    const/4 v5, 0x0

    goto :goto_11

    :cond_1c
    const/4 v5, 0x0

    int-to-float v0, v5

    move/from16 v20, v0

    :goto_11
    const/16 v21, 0x5

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v4, v16

    move/from16 v3, v18

    invoke-virtual {v6}, Ltz0/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v10, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, p3

    const/4 v15, 0x6

    invoke-virtual {v8, v10, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v8, v10, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v11

    new-instance v9, Lw3/k;

    const/4 v13, 0x5

    invoke-direct {v9, v13}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdf8

    move-object/from16 v17, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move/from16 v22, v5

    move-object v5, v7

    move-wide/from16 v36, v11

    move-object v12, v8

    move-wide/from16 v7, v36

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    move/from16 v18, v15

    const-wide/16 v14, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v21, v18

    move-object/from16 v20, v19

    const-wide/16 v18, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v34, v28

    const/16 v28, 0x0

    move-object v6, v0

    move/from16 v2, v32

    move-object/from16 v0, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p1 .. p1}, Ltz0/c;->j()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_1d

    const v5, -0x7463ae7d

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v3

    move-object/from16 v16, v4

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v3, v16

    invoke-virtual/range {p1 .. p1}, Ltz0/c;->j()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    const/16 v4, 0x64

    int-to-double v8, v4

    mul-double/2addr v6, v8

    double-to-int v6, v6

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v7

    sget-object v4, Li2/t;->b:Li2/s;

    invoke-virtual/range {p1 .. p1}, Ltz0/c;->i()Ly81/e;

    move-result-object v9

    const/4 v11, 0x0

    invoke-interface {v9, v10, v11}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    new-instance v9, Li2/x;

    invoke-direct {v9, v12, v13}, Li2/x;-><init>(J)V

    invoke-virtual/range {p1 .. p1}, Ltz0/c;->i()Ly81/e;

    move-result-object v12

    invoke-interface {v12, v10, v11}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    new-instance v14, Li2/x;

    invoke-direct {v14, v12, v13}, Li2/x;-><init>(J)V

    filled-new-array {v9, v14}, [Li2/x;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/16 v12, 0xe

    const/4 v13, 0x0

    invoke-static {v4, v9, v13, v13, v12}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v4

    const/4 v9, 0x1

    int-to-float v12, v9

    mul-float/2addr v12, v1

    const v14, 0x1b0186

    const/4 v15, 0x0

    move-object/from16 v27, v10

    move-wide v9, v7

    const/16 v7, 0x64

    move/from16 v22, v11

    const/4 v11, 0x0

    move-object v8, v4

    move/from16 v1, v22

    move-object/from16 v13, v27

    invoke-static/range {v5 .. v15}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    move-object v10, v13

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_12
    const/4 v9, 0x1

    goto :goto_13

    :cond_1d
    move-object v3, v4

    const/4 v1, 0x0

    const v4, -0x745906f9

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Ltz0/c;->k()Z

    move-result v4

    if-eqz v4, :cond_1f

    const v4, -0x4b3b02cb

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    move/from16 v4, p2

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Ltz0/c;->j()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_1e

    sget-object v4, Lb2/e;->J:Lb2/l;

    new-instance v5, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v5, v4}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {v3, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    :cond_1e
    move-object v7, v3

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->s()I

    move-result v3

    invoke-static {v3, v10, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget v3, Lgy0/f;->m1:I

    invoke-static {v10, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v8

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_14
    const/4 v9, 0x1

    goto :goto_15

    :cond_1f
    const v0, -0x4b33a4a3

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :goto_15
    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    move-object/from16 v1, v31

    move-object/from16 v3, v35

    goto :goto_16

    :cond_20
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v9

    :goto_16
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_21

    new-instance v0, Lt01/e;

    const/16 v6, 0x8

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ltz0/c;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ltz0/c;->e()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ltz0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/e;->L:Lb2/l;

    sget-object v1, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x36

    invoke-static {v1, v0, v4, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v4, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v1, v4, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ltz0/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v4, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v1, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->C()Lb91/a;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Ltz0/c;->i()Ly81/e;

    move-result-object v6

    invoke-interface {v6, v4, v3}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    new-instance v8, Lw3/k;

    const/4 v9, 0x5

    invoke-direct {v8, v9}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v29, 0x2fdfa

    move v10, v5

    const/4 v5, 0x0

    move-object/from16 v16, v8

    move v11, v9

    const-wide/16 v8, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move v15, v13

    move/from16 v17, v14

    const-wide/16 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v20, v17

    move/from16 v19, v18

    const-wide/16 v17, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v30, v27

    const/16 v27, 0x0

    move-object v2, v4

    move-object v4, v0

    move/from16 v0, v26

    move-object/from16 v26, v2

    move/from16 v2, v30

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual/range {p0 .. p0}, Ltz0/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v4, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->C()Lb91/a;

    move-result-object v24

    invoke-virtual {v1, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v6

    new-instance v1, Lw3/k;

    invoke-direct {v1, v0}, Lw3/k;-><init>(I)V

    const/4 v5, 0x0

    move-object/from16 v16, v1

    move-object v4, v3

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Ltz0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ltz0/b;->e(Landroidx/compose/ui/Modifier;Ltz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
