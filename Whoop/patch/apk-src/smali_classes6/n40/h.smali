.class public abstract Ln40/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcy/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcy/b;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Ln40/h;->a:Lcy/b;

    return-void
.end method

.method public static final a(Lec3/t1;Leb/u0;Ld1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p4

    move/from16 v8, p6

    const-string v0, "navigationChannel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navHostController"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackStackEntryUpdated"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x30910e23

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v8, 0x180

    const/16 v15, 0x100

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v15

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v5, v8, 0xc00

    const/16 v6, 0x800

    if-nez v5, :cond_7

    move-object/from16 v5, p3

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v6

    goto :goto_5

    :cond_6
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v0, v7

    goto :goto_6

    :cond_7
    move-object/from16 v5, p3

    :goto_6
    and-int/lit16 v7, v8, 0x6000

    const/16 v9, 0x4000

    if-nez v7, :cond_9

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    move v7, v9

    goto :goto_7

    :cond_8
    const/16 v7, 0x2000

    :goto_7
    or-int/2addr v0, v7

    :cond_9
    and-int/lit16 v7, v0, 0x2493

    const/16 v10, 0x2492

    if-ne v7, v10, :cond_b

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_12

    :cond_b
    :goto_8
    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v12, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    instance-of v10, v7, Landroid/app/Activity;

    move/from16 v16, v6

    if-eqz v10, :cond_c

    check-cast v7, Landroid/app/Activity;

    :goto_9
    move v10, v9

    goto :goto_a

    :cond_c
    const/4 v7, 0x0

    goto :goto_9

    :goto_a
    iget-object v9, v2, Leb/a0;->F:Lec3/q1;

    const/16 v13, 0x30

    const/4 v14, 0x2

    move v11, v10

    const/4 v10, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v6, v17

    invoke-static/range {v9 .. v14}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v9

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Leb/q;

    const v11, -0x6f266aba

    invoke-virtual {v12, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    const v13, 0xe000

    and-int/2addr v13, v0

    const/4 v14, 0x0

    const/16 v17, 0x1

    if-ne v13, v6, :cond_d

    move/from16 v6, v17

    goto :goto_b

    :cond_d
    move v6, v14

    :goto_b
    or-int/2addr v6, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_f

    if-ne v11, v13, :cond_e

    goto :goto_c

    :cond_e
    move-object v3, v2

    move-object v9, v7

    move-object v2, v11

    move/from16 v11, v16

    goto :goto_d

    :cond_f
    :goto_c
    new-instance v2, Lay/u;

    move-object v6, v7

    const/16 v7, 0xd

    move-object/from16 v3, p1

    move-object v5, v9

    move/from16 v11, v16

    move-object v9, v6

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v2, Lc93/m;

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    invoke-static {v12, v2, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x6f2640d0

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    and-int/lit16 v4, v0, 0x380

    if-ne v4, v15, :cond_10

    move/from16 v4, v17

    goto :goto_e

    :cond_10
    move v4, v14

    :goto_e
    or-int/2addr v2, v4

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v11, :cond_11

    goto :goto_f

    :cond_11
    move/from16 v17, v14

    :goto_f
    or-int v0, v2, v17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_13

    if-ne v2, v13, :cond_12

    goto :goto_10

    :cond_12
    move-object v0, v2

    move-object v2, v3

    goto :goto_11

    :cond_13
    :goto_10
    new-instance v0, Ln40/c;

    const/4 v6, 0x0

    move-object/from16 v5, p3

    move-object v4, v3

    move-object v2, v9

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v6}, Ln40/c;-><init>(Lec3/t1;Landroid/app/Activity;Ld1/j;Leb/u0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    move-object v2, v4

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    check-cast v0, Lc93/m;

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    invoke-static {v9, v2, v1, v0, v12}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    :goto_12
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Laq1/c;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move v6, v8

    invoke-direct/range {v0 .. v6}, Laq1/c;-><init>(Lec3/t1;Leb/u0;Ld1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static b(Ln40/g;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ln40/g;->a:Lec3/w1;

    new-instance v0, Ln40/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Ln40/e;-><init>(Ljava/lang/String;Ln40/i;Z)V

    invoke-virtual {p0, v0}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-void
.end method
