.class public abstract Ljk2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001aS\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001d\u00b2\u0006\u000c\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lfm1/i;",
        "streaksHomeViewState",
        "Lkotlin/Function1;",
        "Lcom/whoop/navigation/e;",
        "Ll83/a0;",
        "streaksClicked",
        "Lem1/t;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "shouldShowStreakValue",
        "E",
        "(Lfm1/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V",
        "currentState",
        "n",
        "(Lfm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "u",
        "(Lfm1/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "animatedHeight",
        "Li2/x;",
        "animatedBackgroundColor",
        "",
        "animatedBorderAlpha",
        "animatedLottieSize",
        "animatedTextPadding",
        "",
        "displayedValue",
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
.method private static final A(I)I
    .locals 0

    return p0
.end method

.method private static final B(I)I
    .locals 0

    neg-int p0, p0

    return p0
.end method

.method private static final C(Lfm1/i;Landroidx/compose/ui/Modifier;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 27

    const-string v0, "$this$AnimatedContent"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textToDisplay"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lfm1/i;->f()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v3, 0x3366b4ac

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lfm1/i;->a()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v3, 0x336814b1

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lfm1/i;->i()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lfm1/i;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v5, 0x336a5709

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->C()Lb91/a;

    move-result-object v5

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_1
    move-object/from16 v21, v5

    goto :goto_2

    :cond_1
    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v5, 0x336b4749

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->E()Lb91/a;

    move-result-object v5

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_1

    :goto_2
    shr-int/lit8 v0, p5, 0x3

    and-int/lit8 v24, v0, 0xe

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v25, v0, 0x12

    const v26, 0x2fff8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v2, p1

    move-object/from16 v23, p4

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D(Lfm1/i;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljk2/i;->u(Lfm1/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final E(Lfm1/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfm1/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    const-string v0, "streaksHomeViewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streaksClicked"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v0, 0x6c3193c7

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v4, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_6

    move-object/from16 v7, p3

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_4

    :cond_8
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit8 v8, p7, 0x10

    if-eqz v8, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move/from16 v9, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_9

    move/from16 v9, p4

    invoke-virtual {v11, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x4000

    goto :goto_6

    :cond_b
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v0, v10

    :goto_7
    and-int/lit16 v10, v0, 0x2493

    const/16 v12, 0x2492

    const/4 v13, 0x0

    if-eq v10, v12, :cond_c

    const/4 v10, 0x1

    goto :goto_8

    :cond_c
    move v10, v13

    :goto_8
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v11, v12, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_1d

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_d

    move-object/from16 v5, v16

    goto :goto_9

    :cond_d
    move-object v5, v7

    :goto_9
    if-eqz v8, :cond_e

    const/16 v22, 0x1

    goto :goto_a

    :cond_e
    move/from16 v22, v9

    :goto_a
    invoke-virtual {v1}, Lfm1/i;->f()Z

    move-result v7

    if-eqz v7, :cond_f

    sget-object v7, Ljk2/f;->a:Ljk2/f;

    invoke-virtual {v7}, Ljk2/f;->f()F

    move-result v7

    goto :goto_b

    :cond_f
    sget-object v7, Ljk2/f;->a:Ljk2/f;

    invoke-virtual {v7}, Ljk2/f;->g()F

    move-result v7

    :goto_b
    sget-object v8, Ljk2/f;->a:Ljk2/f;

    invoke-virtual {v8}, Ljk2/f;->a()Ld0/l;

    move-result-object v8

    move-object v10, v11

    const/16 v11, 0x180

    const/16 v12, 0x8

    const-string v9, "streaks_pill_height_animation"

    move-object/from16 v15, v16

    invoke-static/range {v7 .. v12}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v16

    invoke-virtual {v1}, Lfm1/i;->f()Z

    move-result v7

    if-eqz v7, :cond_10

    const v7, -0x62987a16

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->v()J

    move-result-wide v7

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_10
    const v7, -0x6297a5ee

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    const-wide v7, 0xff2e383cL

    invoke-static {v7, v8}, Li2/w0;->e(J)J

    move-result-wide v7

    :goto_c
    sget-object v9, Ld0/b0;->a:Ld0/v;

    const/16 v11, 0x12c

    move-object v12, v9

    invoke-static {v11, v13, v12, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v9

    move-object/from16 v17, v12

    const/16 v12, 0x180

    move/from16 v18, v13

    const/16 v13, 0x8

    move/from16 v19, v11

    move-object v11, v10

    const-string v10, "streaks_pill_background_color_animation"

    move-object/from16 v6, v17

    move/from16 v17, v0

    move-object v0, v6

    move/from16 v14, v18

    move/from16 v6, v19

    invoke-static/range {v7 .. v13}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v18

    move-object v10, v11

    invoke-virtual {v1}, Lfm1/i;->f()Z

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v7, :cond_11

    move v7, v8

    goto :goto_d

    :cond_11
    const/4 v7, 0x0

    :goto_d
    invoke-static {v6, v14, v0, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    const/16 v12, 0xc00

    const/16 v13, 0x14

    const-string v9, "streaks_pill_border_alpha_animation"

    move-object v11, v10

    const/4 v10, 0x0

    move/from16 v29, v8

    move-object v8, v0

    move/from16 v0, v29

    invoke-static/range {v7 .. v13}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v4

    move-object v10, v11

    invoke-static/range {v16 .. v16}, Ljk2/i;->F(Lp1/t2;)F

    move-result v6

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static/range {v18 .. v18}, Ljk2/i;->G(Lp1/t2;)J

    move-result-wide v7

    const/16 v9, 0x28

    invoke-static {v9}, Lt0/j;->b(I)Lt0/i;

    move-result-object v9

    invoke-static {v6, v7, v8, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v1}, Lfm1/i;->f()Z

    move-result v7

    if-eqz v7, :cond_12

    const v7, -0x628aa285

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lfm1/i;->a()Ly81/f;

    move-result-object v7

    invoke-virtual {v7, v10, v14}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-static {v4}, Ljk2/i;->H(Lp1/t2;)F

    move-result v4

    invoke-static {v15, v7, v8, v4}, Ljn2/c;->e(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object/from16 v4, v16

    goto :goto_e

    :cond_12
    const v4, -0x6286c475

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object v4, v15

    :goto_e
    invoke-interface {v6, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v23

    and-int/lit8 v4, v17, 0x70

    const/16 v6, 0x20

    if-ne v4, v6, :cond_13

    const/4 v13, 0x1

    goto :goto_f

    :cond_13
    move v13, v14

    :goto_f
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_14

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v6, v4, :cond_15

    :cond_14
    new-instance v6, La11/l;

    const/16 v4, 0x19

    invoke-direct {v6, v4, v2, v1}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v27, v6

    check-cast v27, Lc93/a;

    const/16 v28, 0xf

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->E:Lb2/m;

    invoke-static {v6, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_16

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_16
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_18

    :cond_17
    invoke-static {v7, v10, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v10, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lb2/e;->K:Lb2/l;

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v12, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v12, v4, v10, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    move/from16 p3, v13

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_19

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_19
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v10, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_1a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    :cond_1a
    invoke-static {v13, v10, v13, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v10, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v17, 0xe

    shr-int/lit8 v4, v17, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v4, v0

    invoke-static {v1, v3, v10, v4}, Ljk2/i;->n(Lfm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    if-eqz v22, :cond_1c

    const v4, 0x308a5a10

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    const-wide/high16 v6, 0x3ff4000000000000L    # 1.25

    double-to-float v4, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v19, v4, v6

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v15

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    or-int/lit8 v0, v0, 0x30

    const/4 v12, 0x0

    invoke-static {v1, v4, v10, v0, v12}, Ljk2/i;->u(Lfm1/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_12
    const/4 v0, 0x1

    goto :goto_13

    :cond_1c
    const/4 v12, 0x0

    const v0, 0x308d2e91

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object v4, v5

    move/from16 v5, v22

    goto :goto_14

    :cond_1d
    move-object v10, v11

    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v7

    move v5, v9

    :goto_14
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1e

    new-instance v0, Lh01/k;

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lh01/k;-><init>(Lfm1/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final F(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final G(Lp1/t2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide v0, p0, Li2/x;->a:J

    return-wide v0
.end method

.method private static final H(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final I(Lkotlin/jvm/functions/Function1;Lfm1/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lfm1/i;->d()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lfm1/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ljk2/i;->E(Lfm1/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0}, Ljk2/i;->q(Lc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(I)I
    .locals 0

    invoke-static {p0}, Ljk2/i;->z(I)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lfm1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljk2/i;->I(Lkotlin/jvm/functions/Function1;Lfm1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(I)I
    .locals 0

    invoke-static {p0}, Ljk2/i;->y(I)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Lfm1/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ljk2/i;->J(Lfm1/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ZLkotlin/jvm/functions/Function1;Lfm1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljk2/i;->s(ZLkotlin/jvm/functions/Function1;Lfm1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lfm1/i;Lc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0, p1}, Ljk2/i;->x(Lfm1/i;Lc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lfm1/i;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/t2;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ljk2/i;->r(Lfm1/i;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/t2;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lfm1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljk2/i;->t(Lfm1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(I)I
    .locals 0

    invoke-static {p0}, Ljk2/i;->B(I)I

    move-result p0

    return p0
.end method

.method public static synthetic k(I)I
    .locals 0

    invoke-static {p0}, Ljk2/i;->A(I)I

    move-result p0

    return p0
.end method

.method public static synthetic l(Lfm1/i;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljk2/i;->D(Lfm1/i;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lfm1/i;Landroidx/compose/ui/Modifier;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljk2/i;->C(Lfm1/i;Landroidx/compose/ui/Modifier;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lfm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfm1/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "currentState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x5ac727d2

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    and-int/2addr p2, v2

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Lfm1/i;->f()Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Ljk2/f;->a:Ljk2/f;

    invoke-virtual {p2}, Ljk2/f;->d()F

    move-result p2

    :goto_4
    move v1, p2

    goto :goto_5

    :cond_5
    sget-object p2, Ljk2/f;->a:Ljk2/f;

    invoke-virtual {p2}, Ljk2/f;->e()F

    move-result p2

    goto :goto_4

    :goto_5
    sget-object p2, Ljk2/f;->a:Ljk2/f;

    invoke-virtual {p2}, Ljk2/f;->a()Ld0/l;

    move-result-object v2

    const/16 v5, 0x180

    const/16 v6, 0x8

    const-string v3, "lottie_size_animation"

    invoke-static/range {v1 .. v6}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v0

    invoke-virtual {p0}, Lfm1/i;->f()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p2}, Ljk2/f;->b()F

    move-result v1

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, Ljk2/f;->c()F

    move-result v1

    :goto_6
    invoke-virtual {p2}, Ljk2/f;->a()Ld0/l;

    move-result-object v2

    const/16 v5, 0x180

    const/16 v6, 0x8

    const-string v3, "text_padding_animation"

    invoke-static/range {v1 .. v6}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p2

    invoke-virtual {p0}, Lfm1/i;->e()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_7

    new-instance v2, Lji0/b;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lji0/b;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    new-instance v2, Ljk2/g;

    invoke-direct {v2, p0, p1, p2, v0}, Ljk2/g;-><init>(Lfm1/i;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/t2;)V

    const p2, 0x27b50831

    invoke-static {p2, v4, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v9, 0x186180

    const/16 v10, 0x2a

    const/4 v2, 0x0

    move-object v8, v4

    const/4 v4, 0x0

    const-string v5, "StreakLottieDelayedSwitch"

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v8

    goto :goto_7

    :cond_8
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, La11/j;

    const/16 v1, 0x8

    invoke-direct {v0, p0, p1, p3, v1}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final o(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final p(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final q(Lc0/q;)Lc0/l0;
    .locals 4

    const-string v0, "$this$AnimatedContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p0, p0, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p0

    const/4 v2, 0x2

    invoke-static {p0, v2}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object p0

    const/16 v3, 0x3e8

    invoke-static {v3, v3, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    invoke-static {v0, v2}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lfm1/i;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/t2;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    const-string v3, "$this$AnimatedContent"

    move-object/from16 v4, p4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lfm1/i;->c()Lv41/r0;

    move-result-object v5

    sget-object v3, Lb2/t;->w:Lb2/t;

    sget-object v16, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const/4 v6, 0x0

    if-nez v5, :cond_0

    move-object/from16 v1, p6

    check-cast v1, Lp1/q;

    const v2, -0x3c1a4575

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    move v1, v6

    goto/16 :goto_4

    :cond_0
    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v7, -0x3c1a4574

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    if-eqz v2, :cond_1

    const-string v7, "StreaksAnimatedLottie"

    goto :goto_0

    :cond_1
    const-string v7, "StreaksStaticLottieImage"

    :goto_0
    invoke-static {v3, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static/range {p2 .. p2}, Ljk2/i;->p(Lp1/t2;)F

    move-result v8

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static/range {p3 .. p3}, Ljk2/i;->o(Lp1/t2;)F

    move-result v8

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-eqz v2, :cond_2

    :goto_1
    move-object v12, v4

    goto :goto_2

    :cond_2
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_1

    :goto_2
    and-int/lit8 v4, p7, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/16 v8, 0x20

    if-le v4, v8, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->h(Z)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    and-int/lit8 v4, p7, 0x30

    if-ne v4, v8, :cond_5

    :cond_4
    const/4 v4, 0x1

    goto :goto_3

    :cond_5
    move v4, v6

    :goto_3
    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_6

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v8, v4, :cond_7

    :cond_6
    new-instance v8, Lht2/c;

    const/4 v4, 0x1

    invoke-direct {v8, v2, v1, v0, v4}, Lht2/c;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v9, v8

    check-cast v9, Lc93/a;

    const/16 v14, 0x6000

    const/16 v15, 0xcc

    move v1, v6

    const/4 v6, 0x0

    move-object v4, v7

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v15}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    move-object/from16 v4, v16

    :goto_4
    if-nez v4, :cond_9

    move-object/from16 v8, p6

    check-cast v8, Lp1/q;

    const v2, -0x3c09b8de

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lfm1/i;->b()Lkd1/o;

    move-result-object v5

    if-nez v5, :cond_8

    const v0, -0x3c09b8df

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    sget v9, Lkd1/o;->a:I

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    const-string v0, "StreaksStaticImage"

    invoke-static {v3, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {p2 .. p2}, Ljk2/i;->p(Lp1/t2;)F

    move-result v2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x6

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v13, 0x30

    const/16 v14, 0x78

    move-object v12, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-object v16

    :cond_9
    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v2, 0xe93ca39

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    return-object v16
.end method

.method private static final s(ZLkotlin/jvm/functions/Function1;Lfm1/i;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    new-instance p0, Lem1/z$a;

    invoke-virtual {p2}, Lfm1/i;->j()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lem1/z$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lfm1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ljk2/i;->n(Lfm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lfm1/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 10

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, 0x59e2fa57

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_2

    or-int/lit8 p2, p2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_4
    :goto_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_5

    move v1, v4

    goto :goto_4

    :cond_5
    move v1, v3

    :goto_4
    and-int/2addr p2, v4

    invoke-virtual {v7, p2, v1}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_b

    if-eqz v0, :cond_6

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_6
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_7

    invoke-virtual {p0}, Lfm1/i;->j()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast p2, Lp1/c1;

    invoke-virtual {p0}, Lfm1/i;->e()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lfm1/i;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Ljk2/i;->w(Lp1/c1;Ljava/lang/String;)V

    :cond_8
    invoke-static {p2}, Ljk2/i;->v(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v7, v3}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_9

    if-ne v2, v0, :cond_a

    :cond_9
    new-instance v2, La6/i;

    const/16 v0, 0x13

    invoke-direct {v2, p0, v0}, La6/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v0, Ljk2/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ljk2/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x58a0e77f

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x186000

    const/16 v9, 0x2a

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-string v4, "streakValueAnimation"

    const/4 v5, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_b
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lbz0/a;

    invoke-direct {v0, p0, p1, p3, p4}, Lbz0/a;-><init>(Lfm1/i;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final v(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final w(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final x(Lfm1/i;Lc0/q;)Lc0/l0;
    .locals 2

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lfm1/i;->e()Z

    move-result p0

    if-eqz p0, :cond_3

    check-cast p1, Lc0/x;

    invoke-virtual {p1}, Lc0/x;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v0

    :goto_0
    invoke-virtual {p1}, Lc0/x;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_1
    const/4 p1, 0x1

    const/4 v1, 0x0

    if-lt v0, p0, :cond_2

    new-instance p0, Lji0/b;

    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lji0/b;-><init>(I)V

    invoke-static {v1, p0, p1}, Lc0/w0;->p(Ld0/e2;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object p0

    new-instance v0, Lji0/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lji0/b;-><init>(I)V

    invoke-static {p1, v0}, Lc0/w0;->t(ILkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Lji0/b;

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lji0/b;-><init>(I)V

    invoke-static {v1, p0, p1}, Lc0/w0;->p(Ld0/e2;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object p0

    new-instance v0, Lji0/b;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lji0/b;-><init>(I)V

    invoke-static {p1, v0}, Lc0/w0;->t(ILkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Lc0/c1;->a:Lc0/d1;

    sget-object p1, Lc0/e1;->a:Lc0/f1;

    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final y(I)I
    .locals 0

    neg-int p0, p0

    return p0
.end method

.method private static final z(I)I
    .locals 0

    return p0
.end method
