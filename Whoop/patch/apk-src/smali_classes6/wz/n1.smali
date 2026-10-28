.class public abstract Lwz/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls10/c;

.field public static final b:Ls10/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ls10/c;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ls10/c;-><init>(I)V

    sput-object v0, Lwz/n1;->a:Ls10/c;

    new-instance v0, Ls10/c;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ls10/c;-><init>(I)V

    sput-object v0, Lwz/n1;->b:Ls10/c;

    return-void
.end method

.method public static final a(Lwz/y;Lh40/k;Landroidx/compose/runtime/Composer;I)V
    .locals 15

    move-object/from16 v8, p1

    move/from16 v9, p3

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomSheetState"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    const v0, -0x7756a96e

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    and-int/lit8 v0, v0, 0x13

    const/16 v2, 0x12

    if-ne v0, v2, :cond_3

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v8

    goto/16 :goto_3

    :cond_3
    :goto_2
    iget-object v0, p0, Lwz/y;->V:Lec3/h2;

    const/4 v11, 0x0

    invoke-static {v0, v10, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v12

    iget-object v0, p0, Lwz/y;->Q:Lec3/r1;

    invoke-static {v0, v10, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v13

    const v0, 0x755e27d9

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_4

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_5

    :cond_4
    new-instance v14, Lh00/b0;

    new-instance v0, Lv20/g;

    const/4 v6, 0x0

    const/16 v7, 0x9

    const/4 v1, 0x1

    const-class v3, Lwz/y;

    const-string v4, "onContentCanScrollBackwardChanged"

    const-string v5, "onContentCanScrollBackwardChanged(Z)V"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {v14, v0}, Lh00/b0;-><init>(Lv20/g;)V

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v14

    :cond_5
    check-cast v2, Lh00/b0;

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    iget-object v0, p0, Lwz/y;->E:Lwz/g0;

    iget-object v0, v0, Lwz/g0;->b0:Lwz/d0;

    sget-object v3, Lh00/c0;->a:Lp1/b0;

    invoke-virtual {v3, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    sget-object v3, Li00/a;->a:Lp1/u2;

    new-instance v4, Lm40/w;

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    const/16 v6, 0x1e

    invoke-direct {v4, v5, v6}, Lm40/w;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v3, v4}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v3

    sget-object v4, Lg00/g;->a:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    filled-new-array {v2, v3, v0}, [Lp1/u1;

    move-result-object v6

    new-instance v0, Lb1/d;

    const/4 v5, 0x7

    move-object v1, p0

    move-object v2, v8

    move-object v3, v12

    move-object v4, v13

    invoke-direct/range {v0 .. v5}, Lb1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, 0x6d1eb52

    invoke-static {v3, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v3, 0x38

    invoke-static {v6, v0, v10, v3}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v3, Lpp2/o;

    const/16 v4, 0x1b

    invoke-direct {v3, p0, v2, v9, v4}, Lpp2/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b(Lh40/k;Lwz/r1;Lh00/j;Lk20/a;Lec3/t1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v2, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v14, p11

    move-object/from16 v13, p12

    move-object/from16 v7, p13

    move-object/from16 v15, p14

    const-string v12, "bottomSheetState"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "screenState"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "appBarState"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "eventReporter"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "navigationChannel"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "onNavBackStackEntryChanged"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "onDismissClicked"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "onBackPressed"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "navigate"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "dismiss"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "dismissWithResult"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "getLinkAccount"

    invoke-static {v14, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "handleViewAction"

    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "moveToWeb"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "goBack"

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "changeEmail"

    move-object/from16 v15, p15

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p16

    check-cast v12, Lp1/q;

    const v15, 0x1f4a4533

    invoke-virtual {v12, v15}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    const/16 v16, 0x2

    const/16 v17, 0x4

    if-eqz v15, :cond_0

    move/from16 v15, v17

    goto :goto_0

    :cond_0
    move/from16 v15, v16

    :goto_0
    or-int v15, p17, v15

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    const/16 v19, 0x10

    const/16 v20, 0x20

    if-eqz v18, :cond_1

    move/from16 v18, v20

    goto :goto_1

    :cond_1
    move/from16 v18, v19

    :goto_1
    or-int v15, v15, v18

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/16 v21, 0x80

    const/16 v22, 0x100

    if-eqz v18, :cond_2

    move/from16 v18, v22

    goto :goto_2

    :cond_2
    move/from16 v18, v21

    :goto_2
    or-int v15, v15, v18

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    const/16 v23, 0x400

    const/16 v24, 0x800

    if-eqz v18, :cond_3

    move/from16 v18, v24

    goto :goto_3

    :cond_3
    move/from16 v18, v23

    :goto_3
    or-int v15, v15, v18

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/16 v25, 0x2000

    const/16 v26, 0x4000

    if-eqz v18, :cond_4

    move/from16 v18, v26

    goto :goto_4

    :cond_4
    move/from16 v18, v25

    :goto_4
    or-int v15, v15, v18

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/high16 v27, 0x10000

    const/high16 v28, 0x20000

    if-eqz v18, :cond_5

    move/from16 v18, v28

    goto :goto_5

    :cond_5
    move/from16 v18, v27

    :goto_5
    or-int v15, v15, v18

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_6

    const/high16 v18, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v18, 0x80000

    :goto_6
    or-int v15, v15, v18

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_7

    const/high16 v18, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v18, 0x400000

    :goto_7
    or-int v15, v15, v18

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_8

    const/high16 v18, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v18, 0x2000000

    :goto_8
    or-int v15, v15, v18

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_9

    const/high16 v18, 0x20000000

    goto :goto_9

    :cond_9
    const/high16 v18, 0x10000000

    :goto_9
    or-int v15, v15, v18

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v16, v17

    :cond_a
    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_b

    move/from16 v19, v20

    :cond_b
    or-int v16, v16, v19

    invoke-virtual {v12, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_c

    move/from16 v21, v22

    :cond_c
    or-int v16, v16, v21

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_d

    move/from16 v23, v24

    :cond_d
    or-int v16, v16, v23

    move-object/from16 v1, p14

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_e

    move/from16 v25, v26

    :cond_e
    or-int v16, v16, v25

    move-object/from16 v1, p15

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_f

    move/from16 v27, v28

    :cond_f
    or-int v16, v16, v27

    const v17, 0x12492493

    and-int v1, v15, v17

    const v2, 0x12492492

    if-ne v1, v2, :cond_11

    const v1, 0x12493

    and-int v1, v16, v1

    const v2, 0x12492

    if-ne v1, v2, :cond_11

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_a

    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v8, v0

    move-object v5, v12

    goto/16 :goto_b

    :cond_11
    :goto_a
    instance-of v1, v0, Lwz/o1;

    sget-object v2, Lb2/t;->w:Lb2/t;

    const v17, 0xe000

    if-eqz v1, :cond_12

    const v1, -0x1fed880

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const-string v1, "full_screen_content_tag"

    invoke-static {v2, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v2, p1

    check-cast v2, Lwz/o1;

    iget-object v2, v2, Lwz/o1;->a:Lwz/e1;

    shl-int/lit8 v0, v15, 0x3

    and-int/lit8 v18, v0, 0x70

    const/16 v19, 0x46

    or-int v18, v19, v18

    move-object/from16 v19, v1

    and-int/lit16 v1, v0, 0x1c00

    or-int v1, v18, v1

    and-int v0, v0, v17

    or-int/2addr v0, v1

    shr-int/lit8 v1, v15, 0x6

    const/high16 v18, 0x70000

    and-int v1, v1, v18

    or-int/2addr v0, v1

    shl-int/lit8 v1, v16, 0x9

    const/high16 v20, 0x380000

    and-int v20, v1, v20

    or-int v0, v0, v20

    const/high16 v20, 0x1c00000

    and-int v20, v1, v20

    or-int v0, v0, v20

    shl-int/lit8 v20, v15, 0x9

    const/high16 v21, 0xe000000

    and-int v20, v20, v21

    or-int v0, v0, v20

    shl-int/lit8 v20, v15, 0xf

    const/high16 v21, 0x70000000

    and-int v20, v20, v21

    or-int v0, v0, v20

    shr-int/lit8 v20, v16, 0x6

    and-int/lit8 v20, v20, 0xe

    shr-int/lit8 v15, v15, 0x15

    and-int/lit8 v21, v15, 0x70

    or-int v20, v20, v21

    and-int/lit16 v15, v15, 0x380

    or-int v15, v20, v15

    move/from16 v20, v0

    and-int/lit16 v0, v1, 0x1c00

    or-int/2addr v0, v15

    and-int v1, v1, v17

    or-int/2addr v0, v1

    and-int v1, v16, v18

    or-int v18, v0, v1

    move-object/from16 v1, p0

    move-object/from16 v15, p15

    move-object/from16 v16, v12

    move-object/from16 v0, v19

    move/from16 v17, v20

    move-object v12, v10

    move-object v10, v13

    move-object v13, v11

    move-object v11, v9

    move-object v9, v5

    move-object v5, v8

    move-object v8, v6

    move-object v6, v7

    move-object/from16 v7, p14

    invoke-static/range {v0 .. v18}, Lse/a;->g(Landroidx/compose/ui/Modifier;Lh40/k;Lwz/e1;Lh00/j;Lk20/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lec3/t1;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v5, v16

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    move-object/from16 v8, p1

    goto :goto_b

    :cond_12
    move-object v5, v12

    const/4 v7, 0x0

    sget-object v0, Lwz/p1;->a:Lwz/p1;

    move-object/from16 v8, p1

    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    const v0, -0x4a62a0e8

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    instance-of v0, v8, Lwz/q1;

    if-eqz v0, :cond_15

    const v0, -0x1f08efc

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    const-string v0, "verification_dialog_content_tag"

    invoke-static {v2, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v1, v8

    check-cast v1, Lwz/q1;

    iget-object v1, v1, Lwz/q1;->a:Ld00/l;

    shr-int/lit8 v2, v16, 0x9

    and-int/lit16 v2, v2, 0x380

    or-int/lit8 v2, v2, 0x6

    shr-int/lit8 v3, v15, 0x9

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v16, 0xc

    and-int v3, v3, v17

    or-int v6, v2, v3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v2, p15

    invoke-static/range {v0 .. v6}, Lkotlin/jvm/internal/j;->r(Landroidx/compose/ui/Modifier;Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    move-object v1, v0

    new-instance v0, Lwz/f1;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move-object/from16 v29, v1

    move-object v2, v8

    move-object/from16 v1, p0

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v17}, Lwz/f1;-><init>(Lh40/k;Lwz/r1;Lh00/j;Lk20/a;Lec3/t1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;I)V

    move-object/from16 v1, v29

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void

    :cond_15
    const v0, -0x4a631482

    invoke-static {v0, v5, v7}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0
.end method

.method public static final c(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 2

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;)Lcom/stripe/android/link/LinkActivity;
    .locals 2

    check-cast p0, Lp1/q;

    const v0, 0x3b453ca1

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lg/l;

    if-eqz v1, :cond_0

    check-cast v0, Lg/l;

    goto :goto_1

    :cond_0
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lg/l;

    if-eqz v1, :cond_1

    check-cast v0, Lg/l;

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    const-string v1, "null cannot be cast to non-null type com.stripe.android.link.LinkActivity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/link/LinkActivity;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method public static e(Lwz/n0;)Ly00/c0;
    .locals 1

    instance-of v0, p0, Lwz/i0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lwz/j0;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lwz/l0;

    if-eqz v0, :cond_2

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_2
    instance-of v0, p0, Lwz/k0;

    if-eqz v0, :cond_3

    check-cast p0, Lwz/k0;

    iget-object p0, p0, Lwz/k0;->w:Lwz/u0;

    invoke-virtual {p0}, Lwz/u0;->h()Ly00/c0;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Lwz/m0;

    if-eqz v0, :cond_4

    check-cast p0, Lwz/m0;

    iget-object p0, p0, Lwz/m0;->w:Ly00/c0;

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
