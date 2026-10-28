.class public abstract Lny0/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ay\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "description",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Li2/x;",
        "selectedBackgroundColor",
        "",
        "initialToggle",
        "enabled",
        "Lny0/y0;",
        "type",
        "fillWidthOfContainer",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onToggle",
        "c",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p14}, Lny0/x0;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lny0/x0;->d(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Landroidx/compose/ui/Modifier;",
            "JZZ",
            "Lny0/y0;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    const-string v0, "title"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onToggle"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p11

    check-cast v0, Lp1/q;

    const v2, 0x2f3aaf64

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v12, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v12

    goto :goto_1

    :cond_1
    move v2, v12

    :goto_1
    and-int/lit8 v4, v12, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, v13, 0x2

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    move-object/from16 v4, p1

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_4
    move-object/from16 v4, p1

    :goto_3
    and-int/lit16 v5, v12, 0x180

    if-nez v5, :cond_7

    and-int/lit8 v5, v13, 0x4

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    move-object/from16 v5, p2

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_5

    :cond_7
    move-object/from16 v5, p2

    :goto_5
    and-int/lit8 v6, v13, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move-object/from16 v7, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v12, 0xc00

    if-nez v7, :cond_8

    move-object/from16 v7, p3

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v2, v8

    :goto_7
    and-int/lit16 v8, v12, 0x6000

    if-nez v8, :cond_c

    and-int/lit8 v8, v13, 0x10

    move-wide/from16 v14, p4

    if-nez v8, :cond_b

    invoke-virtual {v0, v14, v15}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x4000

    goto :goto_8

    :cond_b
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v2, v8

    goto :goto_9

    :cond_c
    move-wide/from16 v14, p4

    :goto_9
    and-int/lit8 v8, v13, 0x20

    const/high16 v10, 0x30000

    if-eqz v8, :cond_e

    or-int/2addr v2, v10

    :cond_d
    move/from16 v10, p6

    goto :goto_b

    :cond_e
    and-int/2addr v10, v12

    if-nez v10, :cond_d

    move/from16 v10, p6

    invoke-virtual {v0, v10}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v16, 0x10000

    :goto_a
    or-int v2, v2, v16

    :goto_b
    and-int/lit8 v16, v13, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_10

    or-int v2, v2, v17

    move/from16 v3, p7

    goto :goto_d

    :cond_10
    and-int v17, v12, v17

    move/from16 v3, p7

    if-nez v17, :cond_12

    invoke-virtual {v0, v3}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_11

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_11
    const/high16 v17, 0x80000

    :goto_c
    or-int v2, v2, v17

    :cond_12
    :goto_d
    const/high16 v17, 0xc00000

    and-int v17, v12, v17

    if-nez v17, :cond_14

    move/from16 v17, v2

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_13

    const/high16 v2, 0x800000

    goto :goto_e

    :cond_13
    const/high16 v2, 0x400000

    :goto_e
    or-int v2, v17, v2

    goto :goto_f

    :cond_14
    move/from16 v17, v2

    :goto_f
    move/from16 v17, v2

    and-int/lit16 v2, v13, 0x100

    const/high16 v18, 0x6000000

    if-eqz v2, :cond_16

    or-int v17, v17, v18

    :cond_15
    move/from16 v18, v2

    move/from16 v2, p9

    goto :goto_11

    :cond_16
    and-int v18, v12, v18

    if-nez v18, :cond_15

    move/from16 v18, v2

    move/from16 v2, p9

    invoke-virtual {v0, v2}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_17

    const/high16 v19, 0x4000000

    goto :goto_10

    :cond_17
    const/high16 v19, 0x2000000

    :goto_10
    or-int v17, v17, v19

    :goto_11
    const/high16 v19, 0x30000000

    and-int v19, v12, v19

    if-nez v19, :cond_19

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_18

    const/high16 v19, 0x20000000

    goto :goto_12

    :cond_18
    const/high16 v19, 0x10000000

    :goto_12
    or-int v17, v17, v19

    :cond_19
    const v19, 0x12492493

    and-int v2, v17, v19

    const v3, 0x12492492

    if-eq v2, v3, :cond_1a

    const/4 v2, 0x1

    goto :goto_13

    :cond_1a
    const/4 v2, 0x0

    :goto_13
    and-int/lit8 v3, v17, 0x1

    invoke-virtual {v0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_37

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v2, v12, 0x1

    sget-object v3, Lb2/t;->w:Lb2/t;

    const v19, -0xe001

    if-eqz v2, :cond_1f

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_1b

    goto :goto_14

    :cond_1b
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v2, v13, 0x2

    if-eqz v2, :cond_1c

    and-int/lit8 v17, v17, -0x71

    :cond_1c
    move/from16 v2, v17

    and-int/lit8 v6, v13, 0x4

    if-eqz v6, :cond_1d

    and-int/lit16 v2, v2, -0x381

    :cond_1d
    and-int/lit8 v6, v13, 0x10

    if-eqz v6, :cond_1e

    and-int v2, v2, v19

    :cond_1e
    move/from16 v6, p7

    move/from16 v4, p9

    move v8, v2

    move-wide/from16 v40, v14

    move-object/from16 v2, p1

    goto :goto_18

    :cond_1f
    :goto_14
    and-int/lit8 v2, v13, 0x2

    if-eqz v2, :cond_20

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    and-int/lit8 v17, v17, -0x71

    :goto_15
    move/from16 v4, v17

    goto :goto_16

    :cond_20
    move-object/from16 v2, p1

    goto :goto_15

    :goto_16
    and-int/lit8 v17, v13, 0x4

    if-eqz v17, :cond_21

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    and-int/lit16 v4, v4, -0x381

    :cond_21
    if-eqz v6, :cond_22

    move-object v7, v3

    :cond_22
    and-int/lit8 v6, v13, 0x10

    if-eqz v6, :cond_23

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v6, v0, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v14

    and-int v4, v4, v19

    :cond_23
    if-eqz v8, :cond_24

    const/4 v10, 0x0

    :cond_24
    if-eqz v16, :cond_25

    const/4 v6, 0x1

    goto :goto_17

    :cond_25
    move/from16 v6, p7

    :goto_17
    move v8, v4

    move-wide/from16 v40, v14

    if-eqz v18, :cond_26

    const/4 v4, 0x0

    goto :goto_18

    :cond_26
    move/from16 v4, p9

    :goto_18
    invoke-virtual {v0}, Lp1/q;->r()V

    if-eqz v10, :cond_27

    const v14, 0x4b4ca09b    # 1.3410459E7f

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    move/from16 p7, v4

    move-wide/from16 v42, v40

    const/4 v4, 0x6

    goto :goto_19

    :cond_27
    const/4 v14, 0x0

    const v15, 0x4b4ca66b    # 1.3411947E7f

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    move/from16 p7, v4

    const/4 v4, 0x6

    invoke-static {v15, v0, v4, v14}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v15

    move-wide/from16 v42, v15

    :goto_19
    if-eqz v10, :cond_28

    const v15, 0x4b4cadee    # 1.341387E7f

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    invoke-static {v15, v0, v4, v14}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v15

    :goto_1a
    move-wide/from16 v16, v15

    goto :goto_1b

    :cond_28
    const v15, 0x4b4cb22e    # 1.3414958E7f

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    invoke-static {v15, v0, v4, v14}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v15

    goto :goto_1a

    :goto_1b
    if-eqz v10, :cond_29

    const v15, 0x4b4cbb2b    # 1.3417259E7f

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    invoke-virtual {v15, v0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->t()J

    move-result-wide v18

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    :goto_1c
    move-wide/from16 v44, v18

    goto :goto_1d

    :cond_29
    const v15, 0x4b4cbf0b    # 1.3418251E7f

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    invoke-static {v15, v0, v4, v14}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v18

    goto :goto_1c

    :goto_1d
    const/4 v4, 0x3

    if-eqz p7, :cond_2a

    move-object v15, v7

    goto :goto_1e

    :cond_2a
    const/4 v15, 0x0

    invoke-static {v7, v15, v14, v4}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    :goto_1e
    if-eqz p7, :cond_2b

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    goto :goto_1f

    :cond_2b
    move-object v14, v3

    :goto_1f
    const/high16 v18, 0x70000000

    and-int v4, v8, v18

    move/from16 p3, v6

    const/high16 v6, 0x20000000

    if-ne v4, v6, :cond_2c

    const/4 v4, 0x1

    goto :goto_20

    :cond_2c
    const/4 v4, 0x0

    :goto_20
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_2d

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v6, v4, :cond_2e

    :cond_2d
    new-instance v6, Lno0/l;

    const/16 v4, 0xe

    invoke-direct {v6, v11, v4}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0xc

    const/16 v18, 0x0

    move/from16 p6, v4

    move-object/from16 p5, v6

    move/from16 p2, v10

    move-object/from16 p1, v15

    move-object/from16 p4, v18

    invoke-static/range {p1 .. p6}, Landroidx/compose/foundation/selection/d;->b(Landroidx/compose/ui/Modifier;ZZLi3/i;Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v6, p3

    invoke-static {v4, v6}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, Li2/w0;->a:Li2/v0;

    move-object/from16 p1, v7

    move-wide/from16 v6, v42

    invoke-static {v4, v6, v7, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lny0/y0;->getPadding()Ll0/k1;

    move-result-object v6

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x1

    int-to-float v7, v6

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v7, v6

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v4, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v15, Ll0/m;->c:Ll0/g;

    move/from16 p2, v8

    const/16 v8, 0x30

    invoke-static {v15, v6, v0, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 p4, v10

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_2f

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_21

    :cond_2f
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_21
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_30

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_31

    :cond_30
    invoke-static {v8, v0, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_31
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v0, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Ll0/m;->e:Ll0/h;

    sget-object v11, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v4, v11, v0, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_32

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_22

    :cond_32
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_22
    invoke-static {v0, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_33

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_34

    :cond_33
    invoke-static {v11, v0, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_34
    invoke-static {v0, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v4, p2, 0xe

    invoke-static {v1, v0, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p8 .. p8}, Lny0/y0;->getStyle()Lb91/a;

    move-result-object v34

    sget-object v4, Ly2/d;->a:Ly2/m;

    new-instance v15, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v15, v4}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const/16 v38, 0x0

    const v39, 0x2fff8

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v36, v0

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-static {v2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v6

    if-eqz v6, :cond_35

    const v6, -0x64451c81

    invoke-static {v0, v6, v3, v7, v0}, Lr80/c;->C(Lp1/q;ILb2/t;FLp1/q;)V

    shr-int/lit8 v3, p2, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v2, v0, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v3, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->c()Lb91/a;

    move-result-object v34

    new-instance v15, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v15, v4}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const/16 v38, 0x0

    const v39, 0x2fff8

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v36, v0

    move-wide/from16 v16, v44

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    :goto_23
    const/4 v6, 0x1

    goto :goto_24

    :cond_35
    move-wide/from16 v16, v44

    const/4 v14, 0x0

    const v3, -0x6440587c

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    goto :goto_23

    :goto_24
    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    if-eqz v3, :cond_36

    const v3, 0x3c7d8320

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    const/4 v4, 0x6

    shr-int/lit8 v3, p2, 0x6

    and-int/lit8 v3, v3, 0xe

    invoke-static {v5, v0, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    new-instance v3, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v3, v6}, Lw3/k;-><init>(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v34

    const/16 v38, 0x0

    const v39, 0x2fdfa

    const/4 v15, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v36, v0

    move-object/from16 v26, v3

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    :goto_25
    const/4 v6, 0x1

    goto :goto_26

    :cond_36
    const/4 v14, 0x0

    const v3, 0x3c80ea08

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    goto :goto_25

    :goto_26
    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    move-object/from16 v4, p1

    move/from16 v8, p3

    move/from16 v7, p4

    move/from16 v10, p7

    move-object v3, v5

    move-wide/from16 v5, v40

    goto :goto_27

    :cond_37
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move/from16 v8, p7

    move-object v3, v5

    move-object v4, v7

    move v7, v10

    move-wide v5, v14

    move/from16 v10, p9

    :goto_27
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_38

    new-instance v0, Lny0/w0;

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lny0/w0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_38
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v13

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v14, p12

    move-object/from16 v12, p13

    invoke-static/range {v1 .. v14}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
