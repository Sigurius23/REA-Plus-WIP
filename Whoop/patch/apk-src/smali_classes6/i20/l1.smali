.class public abstract Li20/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li20/m1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li20/m1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li20/l1;->a:Li20/m1;

    return-void
.end method

.method public static final a(Lk83/a;Li20/k1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "autoCompleteViewModelSubcomponentFactoryProvider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p3

    check-cast v6, Lp1/q;

    const p3, -0x23a2a3ef

    invoke-virtual {v6, p3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p3, v0

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x100

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p3, v0

    and-int/lit16 v0, p3, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_4

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_6

    :cond_4
    :goto_3
    new-instance v4, La20/h;

    new-instance v0, Li20/p0;

    invoke-direct {v0, p2}, Li20/p0;-><init>(Ljava/lang/String;)V

    new-instance v1, Lxl/a;

    invoke-direct {v1, p0, v0}, Lxl/a;-><init>(Lk83/a;Li20/p0;)V

    const/4 v0, 0x6

    invoke-direct {v4, v1, v0}, La20/h;-><init>(Ljava/lang/Object;I)V

    const v0, 0x671a9c9b

    invoke-virtual {v6, v0}, Lp1/q;->f0(I)V

    invoke-static {v6}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v2

    if-eqz v2, :cond_7

    instance-of v0, v2, Landroidx/lifecycle/r;

    if-eqz v0, :cond_5

    move-object v0, v2

    check-cast v0, Landroidx/lifecycle/r;

    invoke-interface {v0}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object v0

    :goto_4
    move-object v5, v0

    goto :goto_5

    :cond_5
    sget-object v0, Ll8/a;->b:Ll8/a;

    goto :goto_4

    :goto_5
    const-class v0, Li20/v0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lpf/c;->c0(Lj93/d;Landroidx/lifecycle/f2;Ljava/lang/String;Landroidx/lifecycle/a2;Ll8/c;Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/w1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    check-cast v0, Li20/v0;

    and-int/lit8 p3, p3, 0x70

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v6, p3}, Li20/l1;->c(Li20/v0;Li20/k1;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_6

    new-instance v0, La01/d;

    const/16 v6, 0x1b

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p4

    invoke-direct/range {v0 .. v6}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZII)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Li20/v0;Li20/b0;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v2, p0

    move-object/from16 v8, p1

    const-string v0, "appearanceContext"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x9394274

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p4, v0

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    move-object/from16 v10, p2

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int v11, v0, v1

    and-int/lit16 v0, v11, 0x493

    const/16 v1, 0x492

    if-ne v0, v1, :cond_4

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v8, v9

    goto/16 :goto_8

    :cond_4
    :goto_3
    iget-object v0, v2, Li20/v0;->z:Lec3/h2;

    const/4 v12, 0x0

    invoke-static {v0, v9, v12}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    iget-object v1, v2, Li20/v0;->E:Lec3/h2;

    invoke-static {v1, v9, v12}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/List;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    iget-object v15, v2, Li20/v0;->I:Lg40/f3;

    const v0, 0x29f5bc64

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_6

    if-ne v1, v3, :cond_5

    goto :goto_4

    :cond_5
    move-object/from16 v17, v3

    goto :goto_5

    :cond_6
    :goto_4
    new-instance v0, Lb30/i0;

    const/4 v6, 0x0

    const/16 v7, 0xf

    const/4 v1, 0x0

    move-object v4, v3

    const-class v3, Li20/v0;

    move-object v5, v4

    const-string v4, "onBackPressed"

    move-object/from16 v16, v5

    const-string v5, "onBackPressed()V"

    move-object/from16 v17, v16

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_5
    check-cast v1, Lj93/g;

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    move-object/from16 v16, v1

    check-cast v16, Lc93/a;

    const v0, 0x29f5c2ed    # 1.0914E-13f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    move-object/from16 v0, v17

    if-ne v1, v0, :cond_7

    move-object/from16 v17, v0

    goto :goto_6

    :cond_7
    move-object/from16 v18, v0

    goto :goto_7

    :cond_8
    :goto_6
    new-instance v0, Lb30/i0;

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v1, 0x0

    const-class v3, Li20/v0;

    const-string v4, "onEnterAddressManually"

    const-string v5, "onEnterAddressManually()V"

    move-object/from16 v18, v17

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_7
    check-cast v1, Lj93/g;

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    move-object/from16 v17, v1

    check-cast v17, Lc93/a;

    const v0, 0x29f5cae7

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_9

    move-object/from16 v0, v18

    if-ne v1, v0, :cond_a

    :cond_9
    new-instance v0, Lg40/f4;

    const/4 v6, 0x0

    const/16 v7, 0xa

    const/4 v1, 0x1

    const-class v3, Li20/v0;

    const-string v4, "selectPrediction"

    const-string v5, "selectPrediction(Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;)V"

    invoke-direct/range {v0 .. v7}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_a
    check-cast v1, Lj93/g;

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v11, 0x3

    and-int/lit16 v0, v0, 0x1c00

    const/16 v1, 0x200

    or-int/2addr v0, v1

    shl-int/lit8 v1, v11, 0x9

    const v2, 0xe000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    const/high16 v1, 0x30000

    or-int/2addr v0, v1

    move-object v4, v8

    move-object v8, v9

    move-object v3, v10

    move v1, v14

    move-object v2, v15

    move-object/from16 v5, v16

    move-object/from16 v6, v17

    move v9, v0

    move-object v0, v13

    invoke-static/range {v0 .. v9}, Li20/l1;->d(Ljava/util/List;ZLg40/m3;Ljava/lang/Integer;Li20/b0;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, La01/d;

    const/16 v5, 0x1a

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final c(Li20/v0;Li20/k1;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v1, "viewModel"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "navigator"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p3

    check-cast v4, Lp1/q;

    const v1, -0x45644adc

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/16 v3, 0x20

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v1, v2

    or-int/lit16 v1, v1, 0x80

    and-int/lit16 v2, v1, 0x93

    const/16 v5, 0x92

    if-ne v2, v5, :cond_3

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v3, p2

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v2, p4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int/lit16 v1, v1, -0x381

    move v2, v1

    move-object v1, p2

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {v4}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v2

    new-instance v6, Lg40/l0;

    invoke-direct {v6, v5}, Lg40/l0;-><init>(I)V

    invoke-static {v2, v6}, Ly30/d;->e(ZLg40/l0;)Ljava/lang/Integer;

    move-result-object v2

    and-int/lit16 v1, v1, -0x381

    move-object v8, v2

    move v2, v1

    move-object v1, v8

    :goto_4
    invoke-virtual {v4}, Lp1/q;->r()V

    const v6, 0x29f4e79d

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    and-int/lit8 v7, v2, 0x70

    if-eq v7, v3, :cond_6

    move v3, v5

    goto :goto_5

    :cond_6
    const/4 v3, 0x1

    :goto_5
    or-int/2addr v3, v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_7

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v6, v3, :cond_8

    :cond_7
    new-instance v6, Lh20/i0;

    const/16 v3, 0x8

    const/4 v7, 0x0

    invoke-direct {v6, p0, p1, v7, v3}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lc93/m;

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {v4, v6, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->h()J

    move-result-wide v6

    sget-object v3, Li20/x0;->a:Lx1/b;

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v5, v2, 0x6180

    move-object v0, p0

    move-wide v2, v6

    invoke-static/range {v0 .. v5}, Li20/l1;->f(Li20/v0;Ljava/lang/Integer;JLandroidx/compose/runtime/Composer;I)V

    move-object v3, v1

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, La01/d;

    const/16 v5, 0x1c

    move-object v1, p0

    move-object v2, p1

    move v4, p4

    invoke-direct/range {v0 .. v5}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final d(Ljava/util/List;ZLg40/m3;Ljava/lang/Integer;Li20/b0;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v2, p2

    move-object/from16 v13, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v14, p9

    const-string v0, "queryController"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appearanceContext"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressed"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnterManually"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectPrediction"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p8

    check-cast v11, Lp1/q;

    const v0, 0x55dc37b0

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v14, 0x6

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move v1, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_3

    move/from16 v3, p1

    invoke-virtual {v11, v3}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    goto :goto_3

    :cond_3
    move/from16 v3, p1

    :goto_3
    and-int/lit16 v4, v14, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_4

    :cond_4
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_5
    and-int/lit16 v4, v14, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_5

    :cond_6
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v1, v5

    goto :goto_6

    :cond_7
    move-object/from16 v4, p3

    :goto_6
    and-int/lit16 v5, v14, 0x6000

    if-nez v5, :cond_a

    const v5, 0x8000

    and-int/2addr v5, v14

    if-nez v5, :cond_8

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_7

    :cond_8
    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_7
    if-eqz v5, :cond_9

    const/16 v5, 0x4000

    goto :goto_8

    :cond_9
    const/16 v5, 0x2000

    :goto_8
    or-int/2addr v1, v5

    :cond_a
    const/high16 v5, 0x30000

    and-int/2addr v5, v14

    const/4 v9, 0x1

    if-nez v5, :cond_c

    invoke-virtual {v11, v9}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_b

    const/high16 v5, 0x20000

    goto :goto_9

    :cond_b
    const/high16 v5, 0x10000

    :goto_9
    or-int/2addr v1, v5

    :cond_c
    const/high16 v5, 0x180000

    and-int v10, v14, v5

    if-nez v10, :cond_e

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    const/high16 v10, 0x100000

    goto :goto_a

    :cond_d
    const/high16 v10, 0x80000

    :goto_a
    or-int/2addr v1, v10

    :cond_e
    const/high16 v10, 0xc00000

    and-int/2addr v10, v14

    if-nez v10, :cond_10

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    const/high16 v10, 0x800000

    goto :goto_b

    :cond_f
    const/high16 v10, 0x400000

    :goto_b
    or-int/2addr v1, v10

    :cond_10
    const/high16 v10, 0x6000000

    and-int/2addr v10, v14

    if-nez v10, :cond_12

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    const/high16 v10, 0x4000000

    goto :goto_c

    :cond_11
    const/high16 v10, 0x2000000

    :goto_c
    or-int/2addr v1, v10

    :cond_12
    const v10, 0x2492493

    and-int/2addr v10, v1

    const v12, 0x2492492

    if-ne v10, v12, :cond_13

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v10

    if-nez v10, :cond_14

    :cond_13
    move v10, v5

    goto :goto_d

    :cond_14
    invoke-virtual {v11}, Lp1/q;->X()V

    goto :goto_e

    :goto_d
    invoke-interface {v13, v11}, Li20/b0;->d0(Landroidx/compose/runtime/Composer;)J

    move-result-wide v4

    new-instance v12, Lb30/a4;

    const/4 v15, 0x2

    invoke-direct {v12, v13, v15}, Lb30/a4;-><init>(Ljava/lang/Object;I)V

    const v15, 0x3287adb3

    invoke-static {v15, v11, v12}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    and-int/lit8 v15, v1, 0xe

    or-int/2addr v10, v15

    and-int/lit8 v15, v1, 0x70

    or-int/2addr v10, v15

    and-int/lit16 v15, v1, 0x380

    or-int/2addr v10, v15

    and-int/lit16 v15, v1, 0x1c00

    or-int/2addr v10, v15

    const/high16 v15, 0x70000

    and-int/2addr v15, v1

    or-int/2addr v10, v15

    shl-int/lit8 v1, v1, 0x3

    const/high16 v15, 0x1c00000

    and-int/2addr v15, v1

    or-int/2addr v10, v15

    const/high16 v15, 0xe000000

    and-int/2addr v15, v1

    or-int/2addr v10, v15

    const/high16 v15, 0x70000000

    and-int/2addr v1, v15

    or-int/2addr v1, v10

    move-object v10, v8

    move-object v8, v6

    move v6, v9

    move-object v9, v7

    move-object v7, v12

    move v12, v1

    move v1, v3

    move-object/from16 v3, p3

    invoke-static/range {v0 .. v12}, Li20/l1;->e(Ljava/util/List;ZLg40/m3;Ljava/lang/Integer;JZLx1/b;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_15

    new-instance v0, Lb30/e2;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object v5, v13

    move v9, v14

    invoke-direct/range {v0 .. v9}, Lb30/e2;-><init>(Ljava/util/List;ZLg40/m3;Ljava/lang/Integer;Li20/b0;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method public static final e(Ljava/util/List;ZLg40/m3;Ljava/lang/Integer;JZLx1/b;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v3, p2

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v6, p10

    move/from16 v12, p12

    const-string v0, "queryController"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressed"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnterManually"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectPrediction"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p11

    check-cast v11, Lp1/q;

    const v0, 0xfe9ac8f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v12, 0x6

    move-object/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v12

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    and-int/lit8 v2, v12, 0x30

    if-nez v2, :cond_3

    move/from16 v2, p1

    invoke-virtual {v11, v2}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    goto :goto_3

    :cond_3
    move/from16 v2, p1

    :goto_3
    and-int/lit16 v4, v12, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_4

    :cond_4
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_5
    and-int/lit16 v4, v12, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_5

    :cond_6
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    goto :goto_6

    :cond_7
    move-object/from16 v4, p3

    :goto_6
    and-int/lit16 v5, v12, 0x6000

    move-wide/from16 v13, p4

    if-nez v5, :cond_9

    invoke-virtual {v11, v13, v14}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_7

    :cond_8
    const/16 v5, 0x2000

    :goto_7
    or-int/2addr v0, v5

    :cond_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v12

    if-nez v5, :cond_b

    invoke-virtual {v11, v7}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_a

    const/high16 v5, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v5, 0x10000

    :goto_8
    or-int/2addr v0, v5

    :cond_b
    const/high16 v5, 0x180000

    and-int/2addr v5, v12

    if-nez v5, :cond_d

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    const/high16 v5, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v5, 0x80000

    :goto_9
    or-int/2addr v0, v5

    :cond_d
    const/high16 v15, 0xc00000

    and-int v5, v12, v15

    if-nez v5, :cond_f

    invoke-virtual {v11, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    const/high16 v5, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v5, 0x400000

    :goto_a
    or-int/2addr v0, v5

    :cond_f
    const/high16 v5, 0x6000000

    and-int/2addr v5, v12

    if-nez v5, :cond_11

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/high16 v5, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v5, 0x2000000

    :goto_b
    or-int/2addr v0, v5

    :cond_11
    const/high16 v5, 0x30000000

    and-int/2addr v5, v12

    if-nez v5, :cond_13

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    const/high16 v5, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v5, 0x10000000

    :goto_c
    or-int/2addr v0, v5

    :cond_13
    move/from16 v16, v0

    const v0, 0x12492493

    and-int v0, v16, v0

    const v5, 0x12492492

    if-ne v0, v5, :cond_15

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_d

    :cond_14
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v34, v11

    goto :goto_e

    :cond_15
    :goto_d
    invoke-interface {v3}, Lg40/m3;->p()Lec3/f2;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v11, v5}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    new-instance v5, Lb30/j5;

    move/from16 p11, v15

    const/4 v15, 0x2

    invoke-direct {v5, v8, v7, v9, v15}, Lb30/j5;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v15, 0x53abaf2a

    invoke-static {v15, v11, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    new-instance v5, Li20/l0;

    move-object/from16 v17, v0

    const/4 v0, 0x0

    invoke-direct {v5, v10, v0}, Li20/l0;-><init>(Lc93/a;I)V

    const v0, -0xbef78f7

    invoke-static {v0, v11, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    new-instance v0, Li20/n0;

    move v5, v2

    move-object v2, v1

    move v1, v5

    move-object v5, v4

    move-object/from16 v4, v17

    invoke-direct/range {v0 .. v6}, Li20/n0;-><init>(ZLjava/util/List;Lg40/m3;Lp1/c1;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V

    const v1, 0x8453411

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v33

    shl-int/lit8 v0, v16, 0x3

    const/high16 v1, 0x70000

    and-int/2addr v0, v1

    or-int v36, v0, p11

    const v37, 0x17ff3

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v31, 0x0

    const/16 v35, 0xd80

    move-wide/from16 v29, p4

    move-object/from16 v34, v11

    invoke-static/range {v13 .. v37}, Lg1/g5;->a(Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;Landroidx/compose/runtime/Composer;III)V

    :goto_e
    invoke-virtual/range {v34 .. v34}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_16

    new-instance v0, Li20/j0;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v12}, Li20/j0;-><init>(Ljava/util/List;ZLg40/m3;Ljava/lang/Integer;JZLx1/b;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final f(Li20/v0;Ljava/lang/Integer;JLandroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v2, p0

    move/from16 v8, p5

    sget-object v9, Li20/x0;->a:Lx1/b;

    const-string v0, "viewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x4c8530d3    # 6.9830296E7f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v1, v8, 0x30

    move-object/from16 v12, p1

    if-nez v1, :cond_3

    invoke-virtual {v10, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v8, 0x180

    const/4 v15, 0x0

    if-nez v1, :cond_5

    invoke-virtual {v10, v15}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v8, 0xc00

    move-wide/from16 v13, p2

    if-nez v1, :cond_7

    invoke-virtual {v10, v13, v14}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    and-int/lit16 v1, v8, 0x6000

    if-nez v1, :cond_9

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x4000

    goto :goto_5

    :cond_8
    const/16 v1, 0x2000

    :goto_5
    or-int/2addr v0, v1

    :cond_9
    move v11, v0

    and-int/lit16 v0, v11, 0x2493

    const/16 v1, 0x2492

    if-ne v0, v1, :cond_b

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object/from16 v20, v10

    goto/16 :goto_9

    :cond_b
    :goto_6
    iget-object v0, v2, Li20/v0;->z:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    iget-object v3, v2, Li20/v0;->E:Lec3/h2;

    invoke-static {v3, v10, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v3

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/util/List;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    move/from16 v18, v11

    iget-object v11, v2, Li20/v0;->I:Lg40/f3;

    const v0, 0x29f62664

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_d

    if-ne v3, v4, :cond_c

    goto :goto_7

    :cond_c
    move v8, v1

    move-object v15, v4

    goto :goto_8

    :cond_d
    :goto_7
    new-instance v0, Lb30/i0;

    const/4 v6, 0x0

    const/16 v7, 0x11

    move v3, v1

    const/4 v1, 0x0

    move v5, v3

    const-class v3, Li20/v0;

    move-object/from16 v19, v4

    const-string v4, "onBackPressed"

    move/from16 v20, v5

    const-string v5, "onBackPressed()V"

    move-object/from16 v15, v19

    move/from16 v8, v20

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :goto_8
    move-object/from16 v19, v3

    check-cast v19, Lj93/g;

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    const v0, 0x29f62ced

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_e

    if-ne v1, v15, :cond_f

    :cond_e
    new-instance v0, Lb30/i0;

    const/4 v6, 0x0

    const/16 v7, 0x12

    const/4 v1, 0x0

    const-class v3, Li20/v0;

    const-string v4, "onEnterAddressManually"

    const-string v5, "onEnterAddressManually()V"

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_f
    move-object/from16 v20, v1

    check-cast v20, Lj93/g;

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    const v0, 0x29f634e7

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_10

    if-ne v1, v15, :cond_11

    :cond_10
    new-instance v0, Lg40/f4;

    const/4 v6, 0x0

    const/16 v7, 0xb

    const/4 v1, 0x1

    const-class v3, Li20/v0;

    const-string v4, "selectPrediction"

    const-string v5, "selectPrediction(Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;)V"

    invoke-direct/range {v0 .. v7}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_11
    check-cast v1, Lj93/g;

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    check-cast v19, Lc93/a;

    check-cast v20, Lc93/a;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v18, 0x6

    and-int/lit16 v2, v0, 0x1c00

    const/16 v3, 0x200

    or-int/2addr v2, v3

    shl-int/lit8 v3, v18, 0x3

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    shl-int/lit8 v3, v18, 0x9

    const/high16 v4, 0x70000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    const/high16 v3, 0x380000

    and-int/2addr v0, v3

    or-int v21, v2, v0

    move-object/from16 v15, v16

    move-object/from16 v16, v9

    move-object v9, v15

    move-object/from16 v18, v20

    const/4 v15, 0x0

    move-object/from16 v20, v10

    move/from16 v10, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v1

    invoke-static/range {v9 .. v21}, Li20/l1;->e(Ljava/util/List;ZLg40/m3;Ljava/lang/Integer;JZLx1/b;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_9
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Li20/k0;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Li20/k0;-><init>(Li20/v0;Ljava/lang/Integer;JI)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final g(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "onClick"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x2e4bdbf8

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    and-int/lit8 v6, v3, 0x3

    if-ne v6, v4, :cond_2

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v25, v2

    goto/16 :goto_3

    :cond_2
    :goto_1
    const v4, -0x581298be

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    new-instance v4, Ll3/d;

    invoke-direct {v4}, Ll3/d;-><init>()V

    const v6, 0x41fbf08c

    invoke-virtual {v2, v6}, Lp1/q;->e0(I)V

    and-int/lit8 v3, v3, 0xe

    const/4 v6, 0x0

    if-ne v3, v5, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    move v3, v6

    :goto_2
    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_4

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_5

    :cond_4
    new-instance v5, Li20/z0;

    const/4 v3, 0x0

    invoke-direct {v5, v0, v3}, Li20/z0;-><init>(Lc93/a;I)V

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Li20/z0;

    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    new-instance v3, Ll3/t;

    const/4 v7, 0x0

    const-string v8, "EnterAddressManually"

    invoke-direct {v3, v8, v7, v5}, Ll3/t;-><init>(Ljava/lang/String;Ll3/s0;Li20/z0;)V

    const v5, -0x581277b9

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v3}, Ll3/d;->g(Ll3/t;)I

    move-result v3

    const v5, 0x7f14107e

    :try_start_0
    invoke-static {v2, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4, v3}, Ll3/d;->f(I)V

    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v4}, Ll3/d;->k()Ll3/g;

    move-result-object v3

    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    sget-object v4, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/h9;

    iget-object v5, v4, Lg1/h9;->i:Ll3/v0;

    sget-object v4, Ld40/q;->d:Ld40/s;

    iget-wide v8, v4, Ld40/s;->i:J

    sget-object v4, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->f()J

    move-result-wide v6

    const/16 v18, 0x0

    const v19, 0xfffffc

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v19}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v24

    const/16 v27, 0x0

    const v28, 0x1fffe

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v2

    invoke-static/range {v3 .. v28}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_3
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, Lb30/y3;

    const/4 v4, 0x4

    invoke-direct {v3, v1, v4, v0}, Lb30/y3;-><init>(IILc93/a;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v4, v3}, Ll3/d;->f(I)V

    throw v0
.end method

.method public static final h(Lk83/a;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    const-string v0, "inputAddressViewModelSubcomponentFactoryProvider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, 0x77249dbd

    invoke-virtual {v6, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v0, :cond_2

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_2
    :goto_1
    new-instance v4, Li20/f1;

    invoke-direct {v4, p0}, Li20/f1;-><init>(Lk83/a;)V

    const p1, 0x671a9c9b

    invoke-virtual {v6, p1}, Lp1/q;->f0(I)V

    invoke-static {v6}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v2

    if-eqz v2, :cond_e

    instance-of p1, v2, Landroidx/lifecycle/r;

    if-eqz p1, :cond_3

    move-object p1, v2

    check-cast p1, Landroidx/lifecycle/r;

    invoke-interface {p1}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object p1

    :goto_2
    move-object v5, p1

    goto :goto_3

    :cond_3
    sget-object p1, Ll8/a;->b:Ll8/a;

    goto :goto_2

    :goto_3
    const-class p1, Li20/j1;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lpf/c;->c0(Lj93/d;Landroidx/lifecycle/f2;Ljava/lang/String;Landroidx/lifecycle/a2;Ll8/c;Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/w1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    check-cast p1, Li20/j1;

    iget-object v1, p1, Li20/j1;->L:Lm63/d;

    iget-object v2, p1, Li20/j1;->w:Li20/h;

    iget-object v3, v1, Lm63/d;->G:Ljava/lang/Object;

    check-cast v3, Ln53/e;

    invoke-static {v3, v6, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v3

    iget-object v4, v2, Li20/h;->x:Li20/s;

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    iget-object v4, v4, Li20/s;->z:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object v4, v5

    :goto_4
    const v7, -0x76860c07    # -3.0087E-33f

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    if-nez v4, :cond_5

    const v4, 0x7f14105c

    invoke-static {v6, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    :cond_5
    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    iget-object v2, v2, Li20/h;->x:Li20/s;

    if-eqz v2, :cond_6

    iget-object v5, v2, Li20/s;->F:Ljava/lang/String;

    :cond_6
    const v2, -0x7685f98b

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    if-nez v5, :cond_7

    const v2, 0x7f14105d

    invoke-static {v6, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    :cond_7
    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    iget-object v2, p1, Li20/j1;->N:Lec3/h2;

    invoke-static {v2, v6, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    iget-object v7, p1, Li20/j1;->P:Lec3/h2;

    invoke-static {v7, v6, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v7

    iget-object v8, p1, Li20/j1;->H:Lec3/r1;

    invoke-static {v8, v6, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v8

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    if-eqz v9, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    move v9, v0

    :goto_5
    const v10, -0x7685b7c3

    invoke-virtual {v6, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v6, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v10, :cond_9

    if-ne v11, v12, :cond_a

    :cond_9
    new-instance v11, Ld30/r;

    const/16 v10, 0x1a

    invoke-direct {v11, p1, v3, v7, v10}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v11, Lc93/a;

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const v3, -0x7685a4a5

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_b

    if-ne v10, v12, :cond_c

    :cond_b
    new-instance v10, Lh02/n0;

    const/16 v3, 0xc

    invoke-direct {v10, p1, v3}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lc93/a;

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    new-instance v0, Li20/d1;

    const/4 v3, 0x0

    invoke-direct {v0, p1, v8, v2, v3}, Li20/d1;-><init>(Li20/j1;Lp1/c1;Lp1/c1;I)V

    const v3, -0x7c3e003b

    invoke-static {v3, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    new-instance v3, Ld30/b0;

    const/4 v8, 0x4

    invoke-direct {v3, v8, p1, v1}, Ld30/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xffeb524

    invoke-static {v1, v6, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    new-instance v3, Li20/d1;

    const/4 v8, 0x1

    invoke-direct {v3, p1, v7, v2, v8}, Li20/d1;-><init>(Li20/j1;Lp1/c1;Lp1/c1;I)V

    const p1, -0x63c4957d

    invoke-static {p1, v6, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    move-object v3, v5

    move-object v5, v10

    const/high16 v10, 0xdb0000

    move-object v7, v1

    move-object v2, v4

    move v1, v9

    move-object v4, v11

    move-object v9, v6

    move-object v6, v0

    invoke-static/range {v1 .. v10}, Li20/l1;->i(ZLjava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Lx1/b;Lx1/b;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object v6, v9

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, Lhb2/f;

    invoke-direct {v0, p0, p2}, Lhb2/f;-><init>(Lk83/a;I)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final i(ZLjava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Lx1/b;Lx1/b;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v2, p1

    move-object/from16 v1, p2

    move-object/from16 v8, p3

    move-object/from16 v10, p4

    const-string v0, "primaryButtonText"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPrimaryButtonClick"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCloseClick"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p8

    check-cast v11, Lp1/q;

    const v0, -0x2f3c0b4a

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    move/from16 v6, p0

    invoke-virtual {v11, v6}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p9, v0

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x100

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v0, v3

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x800

    goto :goto_3

    :cond_3
    const/16 v3, 0x400

    :goto_3
    or-int/2addr v0, v3

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x4000

    goto :goto_4

    :cond_4
    const/16 v3, 0x2000

    :goto_4
    or-int/2addr v0, v3

    const v3, 0x492493

    and-int/2addr v0, v3

    const v3, 0x492492

    if-ne v0, v3, :cond_6

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v32, v11

    goto :goto_6

    :cond_6
    :goto_5
    sget-object v0, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lg2/i;

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->h()J

    move-result-wide v27

    new-instance v0, Lb30/w2;

    const/16 v3, 0x10

    invoke-direct {v0, v3, v7, v10}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, -0x14464d45

    invoke-static {v3, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    new-instance v0, Li20/c1;

    const/4 v9, 0x1

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object v5, v2

    move-object/from16 v2, p5

    invoke-direct/range {v0 .. v9}, Li20/c1;-><init>(Ljava/lang/String;Lx1/b;Lx1/b;Lx1/b;Ljava/lang/String;ZLg2/i;Lc93/a;I)V

    const v1, -0x61078b0c

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v31

    const/high16 v34, 0xc00000

    const v35, 0x17ffa

    move-object/from16 v32, v11

    move-object v11, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v29, 0x0

    const/16 v33, 0x180

    invoke-static/range {v11 .. v35}, Lg1/g5;->a(Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;Landroidx/compose/runtime/Composer;III)V

    :goto_6
    invoke-virtual/range {v32 .. v32}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_7

    new-instance v0, Li20/a1;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    move-object v5, v10

    invoke-direct/range {v0 .. v9}, Li20/a1;-><init>(ZLjava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Lx1/b;Lx1/b;Lx1/b;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Lb2/f;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    check-cast p3, Lp1/q;

    const v0, -0x6d8a13d1

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    const/16 v1, 0x30

    or-int/2addr v0, v1

    and-int/lit16 v0, v0, 0x93

    const/16 v2, 0x92

    if-ne v0, v2, :cond_2

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_1
    move-object v5, p1

    goto/16 :goto_5

    :cond_2
    :goto_2
    sget-object p1, Lb2/e;->M:Lb2/k;

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p3, v2}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v3

    const/16 v4, 0xe

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v3, v4}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v4, p3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p3, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v7, p3, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {p3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p3, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p3, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, p3, Lp1/q;->S:Z

    if-nez v8, :cond_4

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-static {v4, p3, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {p3, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    invoke-static {v3, p1, p3, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v8, p3, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {p3, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v10, p3, Lp1/q;->S:Z

    if-eqz v10, :cond_6

    invoke-virtual {p3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_4
    invoke-static {p3, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p3, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, p3, Lp1/q;->S:Z

    if-nez v0, :cond_7

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    invoke-static {v3, p3, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {p3, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ll0/z;->a:Ll0/z;

    invoke-virtual {p2, v1, p3, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_1

    :goto_5
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v3, La01/d;

    const/16 v8, 0x19

    move-object v4, p0

    move-object v6, p2

    move v7, p4

    invoke-direct/range {v3 .. v8}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, p1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static k(Li20/k1;)V
    .locals 2

    new-instance v0, Li20/t;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li20/t;-><init>(Z)V

    iget-object p0, p0, Li20/k1;->b:Lkotlin/jvm/functions/Function1;

    if-eqz p0, :cond_0

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static final l(Ljava/lang/String;Ljava/lang/String;)I
    .locals 13

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    return p0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    new-array v5, v2, [Ljava/lang/Integer;

    move v6, v1

    :goto_0
    if-ge v6, v2, :cond_3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    new-array v6, v2, [Ljava/lang/Integer;

    move v7, v1

    :goto_1
    if-ge v7, v2, :cond_4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    move v7, v4

    :goto_2
    if-ge v7, v3, :cond_7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v1

    move v8, v4

    :goto_3
    if-ge v8, v2, :cond_6

    add-int/lit8 v9, v8, -0x1

    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    add-int/lit8 v11, v7, -0x1

    invoke-virtual {p1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v10, v11, :cond_5

    move v10, v1

    goto :goto_4

    :cond_5
    move v10, v4

    :goto_4
    aget-object v11, v5, v9

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    add-int/2addr v11, v10

    aget-object v10, v5, v8

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    add-int/2addr v10, v4

    aget-object v9, v6, v9

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    add-int/2addr v9, v4

    invoke-static {v10, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-static {v9, v11}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_6
    add-int/lit8 v7, v7, 0x1

    move-object v12, v6

    move-object v6, v5

    move-object v5, v12

    goto :goto_2

    :cond_7
    aget-object p0, v5, v0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static final m(Li20/q;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    sget-object v1, Li20/n;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    :goto_0
    if-eq p0, v0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-ne p0, v0, :cond_1

    sget-object p0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-object p0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->OPTIONAL:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object p0

    :cond_3
    sget-object p0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object p0

    :cond_4
    sget-object p0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->OPTIONAL:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object p0
.end method

.method public static final n(Li20/b;)Ly00/p;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li20/b;->x:Lh20/x0;

    iget-object v1, p0, Li20/b;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    move-object v4, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, v0, Lh20/x0;->y:Ljava/lang/String;

    move-object v8, v2

    goto :goto_0

    :cond_1
    move-object v8, v1

    :goto_0
    if-eqz v0, :cond_2

    iget-object v2, v0, Lh20/x0;->z:Ljava/lang/String;

    move-object v9, v2

    goto :goto_1

    :cond_2
    move-object v9, v1

    :goto_1
    if-eqz v0, :cond_3

    iget-object v2, v0, Lh20/x0;->w:Ljava/lang/String;

    move-object v6, v2

    goto :goto_2

    :cond_3
    move-object v6, v1

    :goto_2
    if-eqz v0, :cond_4

    iget-object v2, v0, Lh20/x0;->F:Ljava/lang/String;

    move-object v11, v2

    goto :goto_3

    :cond_4
    move-object v11, v1

    :goto_3
    if-eqz v0, :cond_5

    iget-object v2, v0, Lh20/x0;->x:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object v2, v1

    :goto_4
    if-eqz v2, :cond_6

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toUpperCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v2

    goto :goto_5

    :cond_6
    move-object v7, v1

    :goto_5
    if-eqz v0, :cond_7

    iget-object v1, v0, Lh20/x0;->E:Ljava/lang/String;

    :cond_7
    move-object v10, v1

    new-instance v3, Ly00/c;

    move-object v5, v3

    invoke-direct/range {v5 .. v11}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, p0, Li20/b;->y:Ljava/lang/String;

    new-instance v2, Ly00/p;

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Ly00/p;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public static final o(Lh20/x0;)Ljava/util/Map;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    iget-object v2, p0, Lh20/x0;->y:Ljava/lang/String;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    iget-object v2, p0, Lh20/x0;->z:Ljava/lang/String;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    iget-object v2, p0, Lh20/x0;->w:Ljava/lang/String;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    iget-object v2, p0, Lh20/x0;->F:Ljava/lang/String;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    iget-object v2, p0, Lh20/x0;->E:Ljava/lang/String;

    new-instance v7, Ll83/k;

    invoke-direct {v7, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object p0, p0, Lh20/x0;->x:Ljava/lang/String;

    new-instance v8, Ll83/k;

    invoke-direct {v8, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v3 .. v8}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Li20/b;Lh20/i1;)Ljava/util/Map;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li20/b;->z:Ljava/lang/Boolean;

    iget-object v1, p0, Li20/b;->x:Lh20/x0;

    sget-object v2, Lm83/z;->w:Lm83/z;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lh20/i1;->b()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    return-object v2

    :cond_1
    :goto_0
    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    iget-object v4, p0, Li20/b;->w:Ljava/lang/String;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    iget-object v6, v1, Lh20/x0;->y:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v6, v4

    :goto_1
    new-instance v7, Ll83/k;

    invoke-direct {v7, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v1, :cond_3

    iget-object v6, v1, Lh20/x0;->z:Ljava/lang/String;

    :goto_2
    move-object v8, v7

    goto :goto_3

    :cond_3
    move-object v6, v4

    goto :goto_2

    :goto_3
    new-instance v7, Ll83/k;

    invoke-direct {v7, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v1, :cond_4

    iget-object v6, v1, Lh20/x0;->w:Ljava/lang/String;

    :goto_4
    move-object v9, v8

    goto :goto_5

    :cond_4
    move-object v6, v4

    goto :goto_4

    :goto_5
    new-instance v8, Ll83/k;

    invoke-direct {v8, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v1, :cond_5

    iget-object v6, v1, Lh20/x0;->F:Ljava/lang/String;

    :goto_6
    move-object v10, v9

    goto :goto_7

    :cond_5
    move-object v6, v4

    goto :goto_6

    :goto_7
    new-instance v9, Ll83/k;

    invoke-direct {v9, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v1, :cond_6

    iget-object v6, v1, Lh20/x0;->E:Ljava/lang/String;

    :goto_8
    move-object v11, v10

    goto :goto_9

    :cond_6
    move-object v6, v4

    goto :goto_8

    :goto_9
    new-instance v10, Ll83/k;

    invoke-direct {v10, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v1, :cond_7

    iget-object v1, v1, Lh20/x0;->x:Ljava/lang/String;

    :goto_a
    move-object v6, v11

    goto :goto_b

    :cond_7
    move-object v1, v4

    goto :goto_a

    :goto_b
    new-instance v11, Ll83/k;

    invoke-direct {v11, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    iget-object p0, p0, Li20/b;->y:Ljava/lang/String;

    new-instance v12, Ll83/k;

    invoke-direct {v12, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v5 .. v12}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    if-eqz p1, :cond_8

    iget-object p1, p1, Lh20/i1;->w:Lh20/x0;

    if-eqz p1, :cond_8

    invoke-static {p1}, Li20/l1;->o(Lh20/x0;)Ljava/util/Map;

    move-result-object p1

    goto :goto_c

    :cond_8
    move-object p1, v2

    :goto_c
    invoke-static {p0, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSameAsShipping$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_d

    :cond_9
    move-object v1, v4

    :goto_d
    new-instance v3, Ll83/k;

    invoke-direct {v3, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    if-eqz v0, :cond_a

    move-object v4, p1

    :cond_a
    if-nez v4, :cond_b

    goto :goto_e

    :cond_b
    move-object v2, v4

    :goto_e
    invoke-static {p0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method
