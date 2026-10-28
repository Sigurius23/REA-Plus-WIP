.class public abstract Luw0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a_\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n2\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkm0/e;",
        "bottomSheetViewState",
        "Lbc3/c0;",
        "coroutineScope",
        "Lv41/f$a;",
        "bottomSheetState",
        "",
        "selectedIndex",
        "",
        "dismissOnSave",
        "Lkotlin/Function1;",
        "Ltw0/c;",
        "Ll83/a0;",
        "onEvent",
        "Lkotlin/Function0;",
        "onSave",
        "g",
        "(Lkm0/e;Lbc3/c0;Lv41/f$a;IZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "custombottomsheet_release"
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
.method public static synthetic a(Lkm0/e;Lbc3/c0;Lv41/f$a;IZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Luw0/q;->m(Lkm0/e;Lbc3/c0;Lv41/f$a;IZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Luw0/q;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Luw0/q;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Luw0/q;->j(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Luw0/q;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Luw0/q;->i(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkm0/e;Lbc3/c0;Lv41/f$a;IZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkm0/e;",
            "Lbc3/c0;",
            "Lv41/f$a;",
            "IZ",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v15, p5

    move/from16 v1, p8

    const-string v4, "bottomSheetViewState"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "coroutineScope"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "bottomSheetState"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onEvent"

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p7

    check-cast v11, Lp1/q;

    const v4, -0x275ce179

    invoke-virtual {v11, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, v1, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v1

    goto :goto_2

    :cond_2
    move v4, v1

    :goto_2
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_7

    and-int/lit16 v5, v1, 0x200

    if-nez v5, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_4

    :cond_5
    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_4
    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_5

    :cond_6
    const/16 v5, 0x80

    :goto_5
    or-int/2addr v4, v5

    :cond_7
    and-int/lit16 v5, v1, 0xc00

    if-nez v5, :cond_9

    move/from16 v5, p3

    invoke-virtual {v11, v5}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x800

    goto :goto_6

    :cond_8
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v4, v6

    goto :goto_7

    :cond_9
    move/from16 v5, p3

    :goto_7
    and-int/lit8 v6, p9, 0x10

    if-eqz v6, :cond_b

    or-int/lit16 v4, v4, 0x6000

    :cond_a
    move/from16 v7, p4

    goto :goto_9

    :cond_b
    and-int/lit16 v7, v1, 0x6000

    if-nez v7, :cond_a

    move/from16 v7, p4

    invoke-virtual {v11, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_c

    const/16 v8, 0x4000

    goto :goto_8

    :cond_c
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v4, v8

    :goto_9
    const/high16 v8, 0x30000

    and-int/2addr v8, v1

    const/high16 v9, 0x20000

    if-nez v8, :cond_e

    invoke-virtual {v11, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    move v8, v9

    goto :goto_a

    :cond_d
    const/high16 v8, 0x10000

    :goto_a
    or-int/2addr v4, v8

    :cond_e
    and-int/lit8 v8, p9, 0x40

    const/high16 v10, 0x100000

    const/high16 v12, 0x180000

    if-eqz v8, :cond_10

    or-int/2addr v4, v12

    :cond_f
    move-object/from16 v12, p6

    goto :goto_c

    :cond_10
    and-int/2addr v12, v1

    if-nez v12, :cond_f

    move-object/from16 v12, p6

    invoke-virtual {v11, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    move v13, v10

    goto :goto_b

    :cond_11
    const/high16 v13, 0x80000

    :goto_b
    or-int/2addr v4, v13

    :goto_c
    const v13, 0x92493

    and-int/2addr v13, v4

    const v14, 0x92492

    if-eq v13, v14, :cond_12

    const/4 v13, 0x1

    goto :goto_d

    :cond_12
    const/4 v13, 0x0

    :goto_d
    and-int/lit8 v14, v4, 0x1

    invoke-virtual {v11, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_23

    if-eqz v6, :cond_13

    move v6, v4

    const/4 v4, 0x1

    goto :goto_e

    :cond_13
    move v6, v4

    move v4, v7

    :goto_e
    if-eqz v8, :cond_14

    const/4 v7, 0x0

    goto :goto_f

    :cond_14
    move-object v7, v12

    :goto_f
    const/high16 v8, 0x70000

    and-int/2addr v8, v6

    if-ne v8, v9, :cond_15

    const/4 v12, 0x1

    goto :goto_10

    :cond_15
    const/4 v12, 0x0

    :goto_10
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v12, :cond_16

    if-ne v13, v14, :cond_17

    :cond_16
    new-instance v13, Luw0/h;

    const/4 v12, 0x1

    invoke-direct {v13, v15, v12}, Luw0/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/high16 v12, 0x380000

    and-int/2addr v12, v6

    if-ne v12, v10, :cond_18

    const/4 v10, 0x1

    goto :goto_11

    :cond_18
    const/4 v10, 0x0

    :goto_11
    if-ne v8, v9, :cond_19

    const/4 v12, 0x1

    goto :goto_12

    :cond_19
    const/4 v12, 0x0

    :goto_12
    or-int/2addr v10, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_1a

    if-ne v12, v14, :cond_1b

    :cond_1a
    new-instance v12, Lg32/j;

    const/16 v10, 0x9

    invoke-direct {v12, v7, v15, v10}, Lg32/j;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v12, Lc93/a;

    if-ne v8, v9, :cond_1c

    const/4 v10, 0x1

    goto :goto_13

    :cond_1c
    const/4 v10, 0x0

    :goto_13
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v10, :cond_1d

    if-ne v5, v14, :cond_1e

    :cond_1d
    new-instance v5, Luw0/h;

    const/4 v10, 0x2

    invoke-direct {v5, v15, v10}, Luw0/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v5, Lkotlin/jvm/functions/Function1;

    if-ne v8, v9, :cond_1f

    const/4 v8, 0x1

    goto :goto_14

    :cond_1f
    const/4 v8, 0x0

    :goto_14
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_20

    if-ne v9, v14, :cond_21

    :cond_20
    new-instance v9, Luw0/h;

    const/4 v8, 0x3

    invoke-direct {v9, v15, v8}, Luw0/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v8, Lkm0/e;->n:I

    and-int/lit8 v10, v6, 0xe

    or-int/2addr v8, v10

    shr-int/lit8 v10, v6, 0x6

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v8, v10

    shl-int/lit8 v10, v6, 0x3

    and-int/lit16 v0, v10, 0x380

    or-int/2addr v0, v8

    sget v8, Lv41/f$a;->c:I

    shl-int/lit8 v8, v8, 0x9

    or-int/2addr v0, v8

    and-int/lit16 v8, v10, 0x1c00

    or-int/2addr v0, v8

    const v8, 0xe000

    and-int/2addr v6, v8

    or-int/2addr v0, v6

    move-object v6, v13

    const/4 v13, 0x0

    move-object v8, v14

    const/16 v14, 0x420

    move-object v10, v8

    move-object v8, v5

    const/4 v5, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v1, p3

    move-object/from16 v16, v7

    move-object v7, v12

    move-object/from16 v15, v17

    move v12, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v14}, Luw0/l;->o(Lkm0/e;ILbc3/c0;Lv41/f$a;ZZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_22

    new-instance v0, Lut2/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lut2/a;-><init>(I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v0, Lc93/a;

    const/16 v1, 0x30

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v11, v1, v3}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move v5, v4

    move-object/from16 v7, v16

    goto :goto_15

    :cond_23
    invoke-virtual {v11}, Lp1/q;->X()V

    move v5, v7

    move-object v7, v12

    :goto_15
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_24

    new-instance v0, Ltp0/d;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Ltp0/d;-><init>(Lkm0/e;Lbc3/c0;Lv41/f$a;IZLkotlin/jvm/functions/Function1;Lc93/a;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltw0/c$a;

    invoke-direct {v0, p1}, Ltw0/c$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Ltw0/c$g;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Ltw0/c$g;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 1

    new-instance v0, Ltw0/c$c;

    invoke-direct {v0, p1}, Ltw0/c$c;-><init>(I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltw0/c$h;

    invoke-direct {v0, p1}, Ltw0/c$h;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lkm0/e;Lbc3/c0;Lv41/f$a;IZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Luw0/q;->g(Lkm0/e;Lbc3/c0;Lv41/f$a;IZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
