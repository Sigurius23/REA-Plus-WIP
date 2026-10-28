.class public abstract Lbf0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001aS\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u0006H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0012H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lze0/c;",
        "viewState",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "",
        "isUsing24HourTime",
        "Lkotlin/Function1;",
        "Lkd0/a$c;",
        "Ll83/a0;",
        "onAnalyticsEvent",
        "Lze0/a;",
        "onEvent",
        "t",
        "(Lze0/c;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lze0/c$e;",
        "A",
        "(Lze0/c$e;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lze0/c$a;",
        "Lkotlin/Function0;",
        "onButtonClick",
        "r",
        "(Lze0/c$a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "advanced-labs_release"
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
.method private static final A(Lze0/c$e;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lze0/c$e;",
            "Lzr2/a;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v9, p6

    move-object/from16 v6, p5

    check-cast v6, Lp1/q;

    const v0, -0x5aec5f25

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v2, v9, 0x30

    move-object/from16 v10, p1

    if-nez v2, :cond_3

    invoke-virtual {v6, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v9, 0x180

    move/from16 v11, p2

    if-nez v2, :cond_5

    invoke-virtual {v6, v11}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v3, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v3, v9, 0xc00

    if-nez v3, :cond_6

    move-object/from16 v3, p3

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x800

    goto :goto_4

    :cond_8
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v0, v4

    :goto_5
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move-object/from16 v5, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v5, v9, 0x6000

    if-nez v5, :cond_9

    move-object/from16 v5, p4

    invoke-virtual {v6, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    const/16 v7, 0x4000

    goto :goto_6

    :cond_b
    const/16 v7, 0x2000

    :goto_6
    or-int/2addr v0, v7

    :goto_7
    and-int/lit16 v7, v0, 0x2493

    const/16 v8, 0x2492

    const/4 v12, 0x1

    if-eq v7, v8, :cond_c

    move v7, v12

    goto :goto_8

    :cond_c
    const/4 v7, 0x0

    :goto_8
    and-int/2addr v0, v12

    invoke-virtual {v6, v0, v7}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_12

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_e

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_d

    new-instance v2, Lb72/a;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lb72/a;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v12, v2

    goto :goto_9

    :cond_e
    move-object v12, v3

    :goto_9
    if-eqz v4, :cond_10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_f

    new-instance v2, Lb72/a;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lb72/a;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v13, v2

    goto :goto_a

    :cond_10
    move-object v13, v5

    :goto_a
    sget-object v2, Lg1/z3;->w:Lg1/z3;

    const/4 v7, 0x6

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v5

    move-object v14, v6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_11

    invoke-static {v14}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v4, v2

    check-cast v4, Lbc3/c0;

    new-instance v15, Lv41/g;

    const/16 v23, 0x7f

    const/16 v24, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v15 .. v24}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v12

    new-instance v12, Lv41/f$a;

    invoke-direct {v12, v5}, Lv41/f$a;-><init>(Lg1/y3;)V

    new-instance v0, La80/f;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v4, v5, v2}, La80/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, -0xb148ff7

    invoke-static {v2, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    new-instance v0, Lbf0/j;

    const/4 v8, 0x0

    move-object v2, v10

    move v3, v11

    move-object v6, v13

    invoke-direct/range {v0 .. v8}, Lbf0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v1, 0x7d3d19cd

    invoke-static {v1, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v24

    sget v0, Lv41/g;->h:I

    shl-int/lit8 v0, v0, 0x3

    const/high16 v1, 0xc00000

    or-int/2addr v0, v1

    sget v1, Lv41/f$a;->c:I

    shl-int/lit8 v1, v1, 0x6

    or-int v26, v0, v1

    const/16 v27, 0x6000

    const/16 v28, 0x3f79

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move-object v11, v15

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v10 .. v28}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object v5, v6

    move-object v4, v7

    goto :goto_b

    :cond_12
    move-object/from16 v25, v6

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    move-object v4, v3

    :goto_b
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_13

    new-instance v0, Lbf0/g;

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v7, p7

    move v6, v9

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ll83/e;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final B(Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lze0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lze0/c$e;Lbc3/c0;Lg1/y3;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "$this$BottomSheet"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p5, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p3, v0, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    move p3, v2

    :goto_0
    and-int/2addr p5, v1

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p5, p3}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lze0/c$e;->b()Lze0/c$a;

    move-result-object p0

    if-nez p0, :cond_1

    const p0, -0x6ddcadcb

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const p3, -0x6ddcadca

    invoke-virtual {p4, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p3, p5

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_2

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p5, p3, :cond_3

    :cond_2
    new-instance p5, Lbf0/h;

    const/4 p3, 0x0

    invoke-direct {p5, p1, p2, p3}, Lbf0/h;-><init>(Lbc3/c0;Lg1/y3;I)V

    invoke-virtual {p4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast p5, Lc93/a;

    invoke-static {p0, p5, p4, v2}, Lbf0/k;->r(Lze0/c$a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_4
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lbc3/c0;Lg1/y3;)Ll83/a0;
    .locals 2

    new-instance v0, Lbf0/k$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lbf0/k$c;-><init>(Lg1/y3;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lze0/c$e;Lzr2/a;ZLbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    and-int/lit8 v5, p8, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v8

    :goto_0
    and-int/lit8 v6, p8, 0x1

    move-object/from16 v7, p7

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_c

    instance-of v5, v0, Lze0/c$e$a;

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_5

    const v5, 0x295f4a24

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    move-object v5, v0

    check-cast v5, Lze0/c$e$a;

    invoke-virtual {v5}, Lze0/c$e$a;->c()Lmf0/g;

    move-result-object v10

    sget-object v13, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v9

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_1

    if-ne v9, v6, :cond_2

    :cond_1
    new-instance v9, Lc;

    const/16 v0, 0xb

    invoke-direct {v9, v1, v5, v2, v0}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v16, v9

    check-cast v16, Lc93/a;

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    if-ne v1, v6, :cond_4

    :cond_3
    new-instance v1, Lb70/c;

    const/4 v0, 0x1

    invoke-direct {v1, v3, v0, v4}, Lb70/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v17, v1

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/16 v19, 0x6000

    const/16 v20, 0x61

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v11, p1

    move/from16 v12, p2

    move-object/from16 v18, v7

    invoke-static/range {v9 .. v20}, Lmf0/e;->A(Landroidx/compose/ui/Modifier;Lmf0/g;Lzr2/a;ZLgz0/m0;ZZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v4, v18

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_1

    :cond_5
    move-object v4, v7

    instance-of v5, v0, Lze0/c$e$c;

    if-eqz v5, :cond_8

    const v5, 0x2972c9bf

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    move-object v5, v0

    check-cast v5, Lze0/c$e$c;

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v7

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v0, v7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_6

    if-ne v7, v6, :cond_7

    :cond_6
    new-instance v7, Lc;

    const/16 v0, 0xc

    invoke-direct {v7, v1, v5, v2, v0}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lc93/a;

    invoke-static {v5, v7, v3, v4, v8}, Lbf0/b;->f(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_8
    instance-of v5, v0, Lze0/c$e$b;

    if-eqz v5, :cond_b

    const v5, 0x2977d41f

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    move-object v5, v0

    check-cast v5, Lze0/c$e$b;

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v7

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v0, v7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_9

    if-ne v7, v6, :cond_a

    :cond_9
    new-instance v7, Lc;

    const/16 v0, 0xd

    invoke-direct {v7, v1, v5, v2, v0}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v1, v7

    check-cast v1, Lc93/a;

    move-object v0, v5

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Lbf0/f;->f(Lze0/c$e$b;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_b
    const v0, 0x225de3a8

    invoke-static {v0, v4, v8}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_c
    move-object v4, v7

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final G(Lbc3/c0;Lze0/c$e;Lg1/y3;)Ll83/a0;
    .locals 2

    new-instance v0, Lbf0/k$d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lbf0/k$d;-><init>(Lze0/c$e;Lg1/y3;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lmf0/a;)Ll83/a0;
    .locals 1

    const-string v0, "testInputAction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lmf0/a$a;

    if-eqz v0, :cond_0

    sget-object p1, Lze0/a$a;->a:Lze0/a$a;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lmf0/a$b;

    if-eqz v0, :cond_1

    sget-object v0, Lkd0/a$b;->a:Lkd0/a$b;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lze0/a$l;

    check-cast p2, Lmf0/a$b;

    invoke-virtual {p2}, Lmf0/a$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lmf0/a$b;->a()Lorg/joda/time/LocalDateTime;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lze0/a$l;-><init>(Ljava/lang/String;Lorg/joda/time/LocalDateTime;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final I(Lbc3/c0;Lze0/c$e;Lg1/y3;)Ll83/a0;
    .locals 2

    new-instance v0, Lbf0/k$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lbf0/k$e;-><init>(Lze0/c$e;Lg1/y3;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lbc3/c0;Lze0/c$e;Lg1/y3;)Ll83/a0;
    .locals 2

    new-instance v0, Lbf0/k$f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lbf0/k$f;-><init>(Lze0/c$e;Lg1/y3;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lze0/c$e;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lbf0/k;->A(Lze0/c$e;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lmf0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbf0/k;->H(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lmf0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lze0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbf0/k;->x(Lze0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbf0/k;->B(Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lze0/c$e;Lbc3/c0;Lg1/y3;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbf0/k;->D(Lze0/c$e;Lbc3/c0;Lg1/y3;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lze0/c$e;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lbf0/k;->K(Lze0/c$e;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lbc3/c0;Lze0/c$e$c;Lg1/y3;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbf0/k;->I(Lbc3/c0;Lze0/c$e;Lg1/y3;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lbc3/c0;Lze0/c$e$b;Lg1/y3;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbf0/k;->J(Lbc3/c0;Lze0/c$e;Lg1/y3;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lze0/c$a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbf0/k;->s(Lze0/c$a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lbc3/c0;Lg1/y3;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbf0/k;->E(Lbc3/c0;Lg1/y3;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lbc3/c0;Lze0/c$e$a;Lg1/y3;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbf0/k;->G(Lbc3/c0;Lze0/c$e;Lg1/y3;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lze0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbf0/k;->y(Lze0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lze0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbf0/k;->v(Lze0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lze0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbf0/k;->w(Lkotlin/jvm/functions/Function1;Lze0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lze0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbf0/k;->C(Lze0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbf0/k;->u(Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lze0/c$e;Lzr2/a;ZLbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lbf0/k;->F(Lze0/c$e;Lzr2/a;ZLbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lze0/c;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lbf0/k;->z(Lze0/c;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lze0/c$a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lze0/c$a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v1, 0x78476d94

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_2

    and-int/lit8 v1, p3, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int v1, p3, v1

    goto :goto_2

    :cond_2
    move/from16 v1, p3

    :goto_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_4
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_5

    move v3, v6

    goto :goto_4

    :cond_5
    move v3, v5

    :goto_4
    and-int/lit8 v7, v1, 0x1

    invoke-virtual {v12, v7, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    int-to-float v3, v6

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v14, v3, v8

    int-to-float v2, v2

    mul-float v15, v2, v8

    const/16 v17, 0x0

    const/16 v18, 0x8

    move/from16 v16, v14

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v3, v15

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    :cond_7
    invoke-static {v10, v12, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v12, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lze0/c$a;->c()Ljava/lang/String;

    move-result-object v2

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v12, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->r()Lb91/a;

    move-result-object v32

    invoke-virtual {v9, v12, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v14

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v36, v13, 0x12

    const v37, 0x2fffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    move-object/from16 v34, v12

    move-object v12, v2

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    invoke-virtual {v0}, Lze0/c$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v12, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v32

    invoke-virtual {v9, v12, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v9

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    const/16 v16, 0x0

    move v15, v3

    move-object v13, v7

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v4, v13

    const/16 v35, 0x30

    const v37, 0x2fff8

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    move-object v13, v3

    move-wide v14, v9

    move-object v12, v2

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    invoke-virtual {v0}, Lze0/c$a;->a()Lze0/c$b;

    move-result-object v2

    if-nez v2, :cond_9

    const v1, -0x5a333c4b

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    move v8, v6

    goto :goto_6

    :cond_9
    const v3, -0x5a333c4a

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lze0/c$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v2, 0x5

    int-to-float v2, v2

    mul-float v15, v2, v8

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object v13, v4

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v4, 0x6

    or-int/lit8 v13, v4, 0x6

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v14, v1, 0xe

    const/16 v15, 0x3fa

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    move v7, v5

    const/4 v5, 0x0

    move v8, v6

    const/4 v6, 0x0

    move v9, v7

    const/4 v7, 0x0

    move v10, v8

    const/4 v8, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v0, v16

    invoke-static/range {v1 .. v15}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    const/4 v8, 0x1

    :goto_6
    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, Lk;

    const/16 v2, 0x10

    move-object/from16 v3, p0

    move/from16 v4, p3

    invoke-direct {v1, v3, v11, v4, v2}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final s(Lze0/c$a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lbf0/k;->r(Lze0/c$a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Lze0/c;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lze0/c;",
            "Lzr2/a;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p6

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "dateAndTimeProvider"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    const v3, -0x65ff3e12

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    move/from16 v5, p2

    invoke-virtual {v7, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    goto :goto_4

    :cond_5
    move/from16 v5, p2

    :goto_4
    and-int/lit8 v6, p7, 0x8

    const/16 v8, 0x800

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0xc00

    :cond_6
    move-object/from16 v9, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v9, v0, 0xc00

    if-nez v9, :cond_6

    move-object/from16 v9, p3

    invoke-virtual {v7, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move v10, v8

    goto :goto_5

    :cond_8
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v3, v10

    :goto_6
    and-int/lit8 v10, p7, 0x10

    const/16 v11, 0x4000

    if-eqz v10, :cond_a

    or-int/lit16 v3, v3, 0x6000

    :cond_9
    move-object/from16 v12, p4

    goto :goto_8

    :cond_a
    and-int/lit16 v12, v0, 0x6000

    if-nez v12, :cond_9

    move-object/from16 v12, p4

    invoke-virtual {v7, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    move v13, v11

    goto :goto_7

    :cond_b
    const/16 v13, 0x2000

    :goto_7
    or-int/2addr v3, v13

    :goto_8
    and-int/lit16 v13, v3, 0x2493

    const/16 v14, 0x2492

    move/from16 p5, v10

    const/4 v10, 0x0

    if-eq v13, v14, :cond_c

    const/4 v13, 0x1

    goto :goto_9

    :cond_c
    move v13, v10

    :goto_9
    and-int/lit8 v14, v3, 0x1

    invoke-virtual {v7, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_27

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v13, :cond_d

    new-instance v6, Lb72/a;

    const/16 v9, 0x8

    invoke-direct {v6, v9}, Lb72/a;-><init>(I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v5, v6

    goto :goto_a

    :cond_e
    move-object v5, v9

    :goto_a
    if-eqz p5, :cond_10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v13, :cond_f

    new-instance v6, Lb72/a;

    const/16 v9, 0x9

    invoke-direct {v6, v9}, Lb72/a;-><init>(I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_b

    :cond_10
    move-object v6, v12

    :goto_b
    and-int/lit8 v9, v3, 0xe

    or-int/lit8 v12, v9, 0x30

    const-string v14, "advanced_labs_test_upload"

    invoke-static {v1, v14, v7, v12}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    instance-of v12, v1, Lze0/c$e;

    if-eqz v12, :cond_11

    const v4, 0x7e2e1d06

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lze0/c$e;

    const v4, 0xfffe

    and-int v8, v3, v4

    const/4 v9, 0x0

    move-object/from16 v3, p1

    move/from16 v4, p2

    invoke-static/range {v2 .. v9}, Lbf0/k;->A(Lze0/c$e;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v5

    move-object v5, v6

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    move-object v0, v5

    goto/16 :goto_15

    :cond_11
    move-object v2, v5

    move-object v5, v6

    instance-of v6, v1, Lze0/c$c;

    if-eqz v6, :cond_26

    const v6, 0x7e33ec0e

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Lze0/c$c;

    invoke-virtual {v6}, Lze0/c$c;->b()Lsz0/q0;

    move-result-object v12

    invoke-virtual {v12}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v14

    instance-of v10, v14, Lsz0/p0$h;

    const v16, 0xe000

    const/4 v15, 0x0

    if-eqz v10, :cond_19

    const v4, 0x7e3673c9

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    and-int/lit16 v4, v3, 0x1c00

    if-ne v4, v8, :cond_12

    const/4 v4, 0x1

    goto :goto_c

    :cond_12
    const/4 v4, 0x0

    :goto_c
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_13

    if-ne v8, v13, :cond_14

    :cond_13
    new-instance v8, Lbf0/k$a;

    invoke-direct {v8, v2, v15}, Lbf0/k$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v8, Lc93/m;

    invoke-static {v7, v8, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v6}, Lze0/c$c;->c()Lze0/a;

    move-result-object v4

    if-nez v4, :cond_15

    sget-object v4, Lze0/a$a;->a:Lze0/a$a;

    :cond_15
    move-object/from16 v18, v14

    check-cast v18, Lsz0/p0$h;

    and-int v3, v3, v16

    if-ne v3, v11, :cond_16

    const/4 v15, 0x1

    goto :goto_d

    :cond_16
    const/4 v15, 0x0

    :goto_d
    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v15

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_17

    if-ne v6, v13, :cond_18

    :cond_17
    new-instance v6, Li;

    const/16 v3, 0x16

    invoke-direct {v6, v3, v5, v4}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v22, v6

    check-cast v22, Lc93/a;

    const/16 v23, 0x3

    const/16 v24, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    invoke-static/range {v18 .. v24}, Lsz0/p0$h;->g(Lsz0/p0$h;Lcom/whoop/design/util/TextResource;JLc93/a;ILjava/lang/Object;)Lsz0/p0$h;

    move-result-object v4

    move-object v6, v5

    invoke-virtual {v12}, Lsz0/q0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v3, Lsz0/p0$h;->h:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v17, v3, v8

    const/16 v18, 0x0

    const/16 v19, 0xffc

    move-object v12, v6

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v3, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v0, v3

    const/4 v3, 0x0

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v16

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    move v10, v3

    goto/16 :goto_14

    :cond_19
    move-object v0, v5

    const/4 v10, 0x0

    const v5, 0x7e3e4aea

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    instance-of v5, v14, Lsz0/p0$b;

    if-eqz v5, :cond_1d

    const v5, 0x7e3f1581

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    and-int/lit16 v5, v3, 0x1c00

    if-ne v5, v8, :cond_1a

    const/4 v5, 0x1

    goto :goto_e

    :cond_1a
    move v5, v10

    :goto_e
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1b

    if-ne v6, v13, :cond_1c

    :cond_1b
    new-instance v6, Lbf0/k$b;

    invoke-direct {v6, v2, v15}, Lbf0/k$b;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v6, Lc93/m;

    invoke-static {v7, v6, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1d
    const v5, 0x7e41b574

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_f
    if-ne v9, v4, :cond_1e

    const/4 v5, 0x1

    goto :goto_10

    :cond_1e
    move v5, v10

    :goto_10
    and-int v3, v3, v16

    if-ne v3, v11, :cond_1f

    const/4 v6, 0x1

    goto :goto_11

    :cond_1f
    move v6, v10

    :goto_11
    or-int/2addr v5, v6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_20

    if-ne v6, v13, :cond_21

    :cond_20
    new-instance v6, Lbf0/i;

    const/4 v5, 0x0

    invoke-direct {v6, v1, v0, v5}, Lbf0/i;-><init>(Lze0/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object v5, v6

    check-cast v5, Lc93/a;

    if-ne v9, v4, :cond_22

    const/4 v4, 0x1

    goto :goto_12

    :cond_22
    move v4, v10

    :goto_12
    if-ne v3, v11, :cond_23

    const/4 v15, 0x1

    goto :goto_13

    :cond_23
    move v15, v10

    :goto_13
    or-int v3, v4, v15

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_24

    if-ne v4, v13, :cond_25

    :cond_24
    new-instance v4, Lbf0/i;

    const/4 v3, 0x1

    invoke-direct {v4, v1, v0, v3}, Lbf0/i;-><init>(Lze0/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object v6, v4

    check-cast v6, Lc93/a;

    sget v8, Lsz0/q0;->k:I

    const/4 v9, 0x0

    move-object v4, v12

    invoke-static/range {v4 .. v9}, Lsz0/n0;->p(Lsz0/q0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_15
    move-object v5, v0

    move-object v4, v2

    goto :goto_16

    :cond_26
    const v0, 0x1cd83058

    invoke-static {v0, v7, v10}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_27
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v4, v9

    move-object v5, v12

    :goto_16
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_28

    new-instance v0, Lbf0/g;

    const/4 v8, 0x1

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ll83/e;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method private static final u(Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lze0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Lze0/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lze0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    check-cast p0, Lze0/c$c;

    invoke-virtual {p0}, Lze0/c$c;->c()Lze0/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lze0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    check-cast p0, Lze0/c$c;

    invoke-virtual {p0}, Lze0/c$c;->d()Lze0/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lze0/c;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lbf0/k;->t(Lze0/c;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
