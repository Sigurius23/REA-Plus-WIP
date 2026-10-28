.class public abstract Lsl0/n3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "",
        "audioLevel",
        "",
        "enableAnimation",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly3/f;",
        "height",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onStopRecordingClicked",
        "f",
        "(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
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
.method public static synthetic a(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/n3;->h(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsl0/n3;->k(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/n3;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/n3;->g(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/n3;->i(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZ",
            "Landroidx/compose/ui/Modifier;",
            "F",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, 0x4e5101e2    # 8.766404E8f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    move/from16 v0, p0

    invoke-virtual {v12, v0}, Lp1/q;->d(F)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_1
    move/from16 v0, p0

    move v3, v6

    :goto_1
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move/from16 v4, p1

    invoke-virtual {v12, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_3

    :cond_3
    move/from16 v4, p1

    :goto_3
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_8

    or-int/lit16 v3, v3, 0xc00

    :cond_7
    move/from16 v9, p3

    goto :goto_7

    :cond_8
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_7

    move/from16 v9, p3

    invoke-virtual {v12, v9}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_6

    :cond_9
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v3, v10

    :goto_7
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_b

    or-int/lit16 v3, v3, 0x6000

    :cond_a
    move-object/from16 v11, p4

    goto :goto_9

    :cond_b
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_a

    move-object/from16 v11, p4

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/16 v13, 0x4000

    goto :goto_8

    :cond_c
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit16 v13, v3, 0x2493

    const/16 v14, 0x2492

    const/4 v15, 0x0

    if-eq v13, v14, :cond_d

    const/4 v13, 0x1

    goto :goto_a

    :cond_d
    move v13, v15

    :goto_a
    and-int/lit8 v14, v3, 0x1

    invoke-virtual {v12, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_21

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_e

    move-object v5, v13

    goto :goto_b

    :cond_e
    move-object v5, v7

    :goto_b
    if-eqz v8, :cond_f

    const/16 v7, 0xb

    int-to-float v7, v7

    int-to-float v8, v1

    mul-float/2addr v7, v8

    goto :goto_c

    :cond_f
    move v7, v9

    :goto_c
    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_10

    new-instance v9, Lsl0/h3;

    const/4 v10, 0x1

    invoke-direct {v9, v10}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v9, Lkotlin/jvm/functions/Function1;

    goto :goto_d

    :cond_11
    move-object v9, v11

    :goto_d
    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    move/from16 v22, v3

    invoke-virtual {v14}, Ly81/i;->w()J

    move-result-wide v2

    const/4 v14, 0x3

    int-to-float v14, v14

    int-to-float v1, v1

    invoke-static {v5, v14, v1, v2, v3}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    move v14, v1

    iget-wide v0, v12, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-eqz v4, :cond_12

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_12
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_e
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v12, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v12, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    move-object/from16 p2, v5

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    :cond_13
    invoke-static {v0, v12, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v12, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1f

    if-ge v2, v5, :cond_15

    const v2, 0x1d52895a

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    move/from16 v23, v7

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_f

    :cond_15
    const v2, 0x1d4c8640

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    const-string v2, "VoiceRecordingGlow"

    invoke-static {v13, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_16

    new-instance v5, Lsl0/h3;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v5}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v5, 0x2

    int-to-float v6, v5

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    move/from16 v23, v7

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v7

    invoke-static {v6, v2, v7, v5}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v6, 0x0

    invoke-static {v2, v12, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    :goto_f
    invoke-static {v5, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v5, v12, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v16, v13

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_17

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_17
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v12, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_18

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    :cond_18
    invoke-static {v6, v12, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v12, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0xe000

    and-int v0, v22, v0

    const/16 v1, 0x4000

    if-ne v0, v1, :cond_1a

    const/4 v1, 0x1

    goto :goto_11

    :cond_1a
    const/4 v1, 0x0

    :goto_11
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1b

    if-ne v2, v8, :cond_1c

    :cond_1b
    new-instance v2, Lsl0/n;

    const/16 v1, 0x9

    invoke-direct {v2, v9, v1}, Lsl0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object/from16 v20, v2

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v15, v16

    const/4 v2, 0x1

    int-to-float v3, v2

    const/16 v2, 0x8

    int-to-float v7, v2

    mul-float v2, v3, v7

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    mul-float v2, v14, v14

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v3, "VoiceRecordingCancel"

    invoke-static {v1, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/a;->e()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v12, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    invoke-virtual {v10, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v5

    sget v13, Lwk0/b;->M0:I

    const/4 v14, 0x0

    invoke-static {v13, v12, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    move-object v14, v8

    move-object v8, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 p4, v9

    move-object v9, v1

    move-object/from16 v1, p4

    move/from16 p4, v4

    move-object/from16 v4, v16

    move/from16 v30, v7

    move-object v7, v3

    move-object v3, v10

    move-wide/from16 v31, v5

    move/from16 v6, v30

    move v5, v11

    move-wide/from16 v10, v31

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const-string v7, "voice_recording_animation"

    invoke-static {v15, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v8, 0x3f800000    # 1.0f

    float-to-double v9, v8

    const-wide/16 v13, 0x0

    cmpl-double v9, v9, v13

    if-lez v9, :cond_1d

    :goto_12
    const/4 v9, 0x1

    goto :goto_13

    :cond_1d
    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_12

    :goto_13
    invoke-static {v7, v9, v8}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    and-int/lit8 v8, v22, 0x70

    shl-int/lit8 v9, v22, 0x6

    and-int/lit16 v9, v9, 0x380

    or-int v13, v8, v9

    const/16 v14, 0x8

    const-wide/16 v10, 0x0

    move/from16 v9, p0

    move/from16 v8, p1

    invoke-static/range {v7 .. v14}, Lsl0/l3;->c(Landroidx/compose/ui/Modifier;ZFJLandroidx/compose/runtime/Composer;II)V

    const/16 v7, 0x4000

    if-ne v0, v7, :cond_1e

    const/4 v0, 0x1

    goto :goto_14

    :cond_1e
    const/4 v0, 0x0

    :goto_14
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_1f

    if-ne v7, v4, :cond_20

    :cond_1f
    new-instance v7, Lsl0/n;

    const/16 v0, 0xa

    invoke-direct {v7, v1, v0}, Lsl0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object/from16 v20, v7

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v15

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float v27, v0, v6

    const/16 v28, 0x0

    const/16 v29, 0xb

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v2, "VoiceRecordingCommit"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/w;->d()I

    move-result v0

    move/from16 v2, p4

    invoke-static {v0, v12, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    invoke-virtual {v3, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v10

    sget v0, Lwk0/b;->K0:I

    const/4 v14, 0x0

    invoke-static {v0, v12, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x1

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    move-object v5, v1

    move/from16 v4, v23

    goto :goto_15

    :cond_21
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v7

    move v4, v9

    move-object v5, v11

    :goto_15
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_22

    new-instance v0, Lsl0/m3;

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lsl0/m3;-><init>(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final g(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Li2/g0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li2/r;

    const/high16 v1, 0x41f00000    # 30.0f

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Li2/r;-><init>(FFI)V

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->g(Lal/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lsl0/n3;->f(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
