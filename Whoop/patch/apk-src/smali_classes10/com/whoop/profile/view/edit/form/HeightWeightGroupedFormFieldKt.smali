.class public final Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a]\u0010\r\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\u0008\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001aM\u0010\u0014\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a7\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000b2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00102\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c\u00b2\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;",
        "groupedField",
        "Lkotlin/Function2;",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;",
        "",
        "Ll83/a0;",
        "onOpenBottomSheet",
        "Lkotlin/Function1;",
        "onUnitSystemChanged",
        "",
        "isEnabled",
        "HeightWeightGroupedFormField",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;Lc93/m;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V",
        "value",
        "Lkotlin/Function0;",
        "onClick",
        "unit",
        "isError",
        "ClickableFormFieldContent",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V",
        "text",
        "isSelected",
        "UnitToggleButton",
        "(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/domain/model/UnitSystem;",
        "selectedUnitSystem",
        "profile_release"
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
.method private static final ClickableFormFieldContent(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Ljava/lang/String;",
            "ZZ",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p7

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v1, -0xb22cdb9

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p8, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v7, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v7, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v7

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v7

    :goto_1
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_4

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    const/16 v9, 0x20

    goto :goto_2

    :cond_3
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v5, v9

    goto :goto_3

    :cond_4
    move-object/from16 v6, p1

    :goto_3
    and-int/lit16 v9, v7, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x100

    goto :goto_4

    :cond_5
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v5, v10

    goto :goto_5

    :cond_6
    move-object/from16 v9, p2

    :goto_5
    and-int/lit8 v10, p8, 0x8

    if-eqz v10, :cond_8

    or-int/lit16 v5, v5, 0xc00

    :cond_7
    move-object/from16 v11, p3

    goto :goto_7

    :cond_8
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_7

    move-object/from16 v11, p3

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x800

    goto :goto_6

    :cond_9
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v5, v12

    :goto_7
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_b

    or-int/lit16 v5, v5, 0x6000

    :cond_a
    move/from16 v13, p4

    goto :goto_9

    :cond_b
    and-int/lit16 v13, v7, 0x6000

    if-nez v13, :cond_a

    move/from16 v13, p4

    invoke-virtual {v0, v13}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_c

    const/16 v14, 0x4000

    goto :goto_8

    :cond_c
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v5, v14

    :goto_9
    and-int/lit8 v14, p8, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_e

    or-int/2addr v5, v15

    :cond_d
    move/from16 v15, p5

    goto :goto_b

    :cond_e
    and-int/2addr v15, v7

    if-nez v15, :cond_d

    move/from16 v15, p5

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v16, 0x10000

    :goto_a
    or-int v5, v5, v16

    :goto_b
    const v16, 0x12493

    and-int v8, v5, v16

    const v2, 0x12492

    const/4 v3, 0x0

    move/from16 v16, v10

    if-eq v8, v2, :cond_10

    const/4 v2, 0x1

    goto :goto_c

    :cond_10
    move v2, v3

    :goto_c
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v0, v8, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_20

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_11

    move-object v4, v2

    :cond_11
    if-eqz v16, :cond_12

    const-string v1, ""

    goto :goto_d

    :cond_12
    move-object v1, v11

    :goto_d
    if-eqz v12, :cond_13

    move/from16 v37, v3

    goto :goto_e

    :cond_13
    move/from16 v37, v13

    :goto_e
    if-eqz v14, :cond_14

    const/16 v38, 0x1

    goto :goto_f

    :cond_14
    move/from16 v38, v15

    :goto_f
    sget-object v8, Lg1/i8;->a:Lg1/i8;

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    if-eqz v37, :cond_15

    const v14, 0x3259e919

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->c()J

    move-result-wide v14

    :goto_10
    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_15
    const v14, 0x3259ee4e

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->r()J

    move-result-wide v14

    goto :goto_10

    :goto_11
    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v16

    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->y()J

    move-result-wide v18

    if-eqz v37, :cond_16

    const v10, 0x325a04f2

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b()J

    move-result-wide v21

    :goto_12
    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_16
    const v10, 0x325a094e

    invoke-static {v0, v10, v8, v0, v11}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v21

    goto :goto_12

    :goto_13
    if-eqz v37, :cond_17

    const v10, 0x325a1292

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b()J

    move-result-wide v23

    :goto_14
    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_17
    const v10, 0x325a16ee

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v23

    goto :goto_14

    :goto_15
    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b()J

    move-result-wide v25

    const-wide/16 v32, 0x0

    const v35, 0x1ffe82

    move/from16 v27, v11

    const-wide/16 v10, 0x0

    move-wide/from16 v28, v21

    move-object/from16 v21, v8

    move-wide v8, v12

    move-wide v12, v14

    move-wide/from16 v14, v16

    move-wide/from16 v16, v18

    move-wide/from16 v18, v28

    move-wide/from16 v28, v23

    const-wide/16 v22, 0x0

    move-wide/from16 v30, v25

    move/from16 v24, v27

    const-wide/16 v26, 0x0

    move-object/from16 v25, v21

    move-wide/from16 v20, v28

    const/16 v34, 0x1

    const-wide/16 v28, 0x0

    move/from16 v40, v24

    move-object/from16 v39, v25

    move-wide/from16 v24, v30

    const-wide/16 v30, 0x0

    move-object/from16 p0, v1

    move/from16 v1, v34

    move/from16 v3, v40

    move-object/from16 v34, v0

    move-object/from16 v0, v39

    invoke-static/range {v8 .. v35}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v8

    move-object/from16 v9, v34

    if-eqz v37, :cond_18

    const v10, 0x325a2712

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b()J

    move-result-wide v10

    const/4 v12, 0x0

    :goto_16
    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_18
    const/4 v12, 0x0

    const v10, 0x325a2b6e

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v10

    goto :goto_16

    :goto_17
    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v14, 0x38

    int-to-float v14, v14

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v14, 0x3

    int-to-float v14, v14

    const/4 v15, 0x4

    int-to-float v15, v15

    mul-float/2addr v14, v15

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    invoke-static {v13, v15}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v8, v9}, Lg1/y1;->a(Lp1/q;)Lp1/c1;

    move-result-object v15

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Li2/x;

    move-object/from16 v16, v2

    iget-wide v1, v15, Li2/x;->a:J

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v13, v1, v2, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x1

    int-to-float v13, v2

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v1, v13, v10, v11, v2}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v13, Li3/i;

    const/4 v1, 0x0

    invoke-direct {v13, v1}, Li3/i;-><init>(I)V

    const/16 v15, 0xa

    move v2, v12

    const/4 v12, 0x0

    move-object/from16 v14, p2

    move/from16 v11, v38

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/16 v12, 0x10

    int-to-float v12, v12

    const/4 v13, 0x0

    const/4 v14, 0x2

    invoke-static {v10, v12, v13, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Lb2/e;->z:Lb2/m;

    invoke-static {v12, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_19

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_19
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_18
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v9, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v9, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_1a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v35, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_19

    :cond_1a
    move-object/from16 v35, v4

    :goto_19
    invoke-static {v1, v9, v1, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v16

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->g:Ll0/h;

    sget-object v10, Lb2/e;->K:Lb2/l;

    move/from16 v36, v5

    const/16 v5, 0x36

    invoke-static {v4, v10, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_1c

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_1c
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v9, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_1d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    :cond_1d
    invoke-static {v5, v9, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v9, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v28

    invoke-virtual {v8, v11, v9}, Lg1/y1;->e(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v1, v1, Li2/x;->a:J

    shr-int/lit8 v4, v36, 0x3

    and-int/lit8 v31, v4, 0xe

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v32, v4, 0x12

    const v33, 0x2fffa

    move-object/from16 v30, v9

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-wide/from16 v41, v1

    move v1, v11

    move-wide/from16 v10, v41

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v30

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1f

    const v2, 0x72ee1a66

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v10

    shr-int/lit8 v0, v36, 0x9

    and-int/lit8 v31, v0, 0xe

    const v33, 0x2fffa

    move-object/from16 v30, v9

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v8, p0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v30

    const/4 v12, 0x0

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    :goto_1b
    const/4 v2, 0x1

    goto :goto_1c

    :cond_1f
    const/4 v12, 0x0

    move-object/from16 v8, p0

    const v0, 0x72f14ab1

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_1b

    :goto_1c
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move v6, v1

    move-object v4, v8

    move-object/from16 v1, v35

    move/from16 v5, v37

    goto :goto_1d

    :cond_20
    move-object v9, v0

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v4

    move-object v4, v11

    move v5, v13

    move v6, v15

    :goto_1d
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_21

    new-instance v0, Lb01/n;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lb01/n;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final ClickableFormFieldContent$lambda$1(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->ClickableFormFieldContent(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final HeightWeightGroupedFormField(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;Lc93/m;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    const-string v0, "groupedField"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onOpenBottomSheet"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, -0x40b86549

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v5, v6, 0x6

    move v7, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v6, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v7, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_8

    or-int/lit16 v7, v7, 0xc00

    :cond_7
    move-object/from16 v9, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_7

    move-object/from16 v9, p3

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x800

    goto :goto_4

    :cond_9
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v7, v11

    :goto_5
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_b

    or-int/lit16 v7, v7, 0x6000

    :cond_a
    move/from16 v12, p4

    :goto_6
    move v13, v7

    goto :goto_8

    :cond_b
    and-int/lit16 v12, v6, 0x6000

    if-nez v12, :cond_a

    move/from16 v12, p4

    invoke-virtual {v10, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_c

    const/16 v13, 0x4000

    goto :goto_7

    :cond_c
    const/16 v13, 0x2000

    :goto_7
    or-int/2addr v7, v13

    goto :goto_6

    :goto_8
    and-int/lit16 v7, v13, 0x2493

    const/16 v14, 0x2492

    const/4 v4, 0x0

    if-eq v7, v14, :cond_d

    const/4 v7, 0x1

    goto :goto_9

    :cond_d
    move v7, v4

    :goto_9
    and-int/lit8 v14, v13, 0x1

    invoke-virtual {v10, v14, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_30

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_e

    move-object v5, v14

    :cond_e
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_f

    new-instance v7, Lcom/whoop/profile/view/edit/form/c;

    const/4 v8, 0x3

    invoke-direct {v7, v8}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v9, v7

    :cond_10
    if-eqz v11, :cond_11

    const/16 v18, 0x1

    goto :goto_a

    :cond_11
    move/from16 v18, v12

    :goto_a
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_12

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->getUnitSystem()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v7, Lp1/c1;

    invoke-static {v7}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$2(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result v8

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->getCurrentHeightValue()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v11

    const/4 v12, 0x0

    if-eqz v11, :cond_13

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    goto :goto_b

    :cond_13
    move v11, v12

    :goto_b
    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->getCurrentWeightValue()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v19

    if-eqz v19, :cond_14

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Float;->floatValue()F

    move-result v12

    :cond_14
    sget-object v15, Ld21/a;->a:Ld21/a;

    invoke-virtual {v15, v12}, Ld21/a;->m(F)I

    move-result v12

    invoke-virtual {v15, v11, v8}, Ld21/a;->h(FZ)Ll83/k;

    move-result-object v11

    iget-object v1, v11, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v11, v11, Ll83/k;->x:Ljava/lang/Object;

    check-cast v11, Lcom/whoop/design/util/TextResource;

    invoke-virtual {v15, v12, v8}, Ld21/a;->i(IZ)Ll83/k;

    move-result-object v12

    iget-object v15, v12, Ll83/k;->w:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/design/util/TextResource;

    iget-object v12, v12, Ll83/k;->x:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/design/util/TextResource;

    move-object/from16 p0, v15

    sget-object v15, Ll0/m;->c:Ll0/g;

    move/from16 p3, v8

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v8, v10, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object/from16 v21, v5

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    move-object/from16 p4, v8

    move-object/from16 v8, v21

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v21, La3/l;->a:La3/k;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v21, v8

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v22, v7

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_15

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v10, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v10, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    move-object/from16 v23, v7

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v24, v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    goto :goto_d

    :cond_16
    move-object/from16 v24, v8

    :goto_d
    invoke-static {v4, v10, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v6, Lcom/whoop/profile/R$string;->profile_edit_units_label:I

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v6, v11

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object v8, v12

    const/4 v12, 0x6

    move-object/from16 v25, v8

    const/4 v8, 0x0

    move-object/from16 v26, v9

    const/4 v9, 0x0

    move-object/from16 v3, v23

    move-object/from16 v23, v15

    move-object v15, v3

    move-object/from16 v27, v6

    move-object/from16 v3, v22

    move-object/from16 v28, v25

    move-object/from16 v6, v26

    move/from16 v22, p3

    move-object/from16 p3, v1

    move-object/from16 v1, v24

    invoke-static/range {v7 .. v12}, Lqz0/d;->b(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;Landroidx/compose/runtime/Composer;II)V

    move/from16 v24, v11

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    invoke-static {v7, v8, v14, v10}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v11, 0x3

    int-to-float v12, v11

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v12, v11

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v9, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v26, v8

    const/4 v9, 0x1

    int-to-float v8, v9

    sget-object v9, Lx81/d;->a:Lx81/d;

    move/from16 v29, v12

    sget v12, Lx81/d;->b:I

    invoke-virtual {v9, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v30

    move/from16 v31, v13

    move-object/from16 v32, v14

    invoke-virtual/range {v30 .. v30}, Ly81/i;->r()J

    move-result-wide v13

    move-object/from16 v30, v3

    invoke-static/range {v29 .. v29}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v7, v8, v13, v14, v3}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->r()J

    move-result-wide v7

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v7, v8, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v14, Lb2/e;->J:Lb2/l;

    const/4 v8, 0x6

    invoke-static {v7, v14, v10, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_18

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v10, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_19

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    :cond_19
    invoke-static {v9, v10, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v10, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lcom/whoop/profile/R$string;->profile_edit_imperial_label:I

    invoke-static {v10, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    move/from16 v3, v31

    and-int/lit16 v9, v3, 0x1c00

    const/16 v11, 0x800

    if-ne v9, v11, :cond_1b

    const/4 v11, 0x1

    goto :goto_f

    :cond_1b
    const/4 v11, 0x0

    :goto_f
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_1d

    if-ne v12, v0, :cond_1c

    goto :goto_10

    :cond_1c
    move-object/from16 v13, v30

    goto :goto_11

    :cond_1d
    :goto_10
    new-instance v12, Lbs1/i;

    const/4 v11, 0x5

    move-object/from16 v13, v30

    invoke-direct {v12, v6, v13, v11}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    check-cast v12, Lc93/a;

    sget-object v11, Ll0/t1;->a:Ll0/t1;

    move/from16 v31, v3

    move-object/from16 v29, v12

    move-object/from16 v30, v13

    move-object/from16 v12, v32

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    invoke-virtual {v11, v12, v13, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v8, "edit_profile_unit_imperial"

    invoke-static {v3, v8}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v12, 0x0

    move v8, v13

    const/4 v13, 0x0

    move-object/from16 v19, v10

    move-object v10, v3

    move-object/from16 v3, v30

    move-object/from16 v30, v15

    move-object v15, v11

    move-object/from16 v11, v19

    move-object/from16 v25, v2

    move-object/from16 v20, v4

    move/from16 v19, v8

    move v4, v9

    move/from16 v8, v22

    move-object/from16 v9, v29

    const/high16 v2, 0x3f800000    # 1.0f

    const/16 v29, 0x3

    move-object/from16 v22, v5

    move-object/from16 v5, v32

    invoke-static/range {v7 .. v13}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->UnitToggleButton(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    sget v7, Lcom/whoop/profile/R$string;->profile_edit_metric_label:I

    invoke-static {v10, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    xor-int/lit8 v8, v8, 0x1

    const/16 v11, 0x800

    if-ne v4, v11, :cond_1e

    const/4 v4, 0x1

    goto :goto_12

    :cond_1e
    const/4 v4, 0x0

    :goto_12
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_1f

    if-ne v9, v0, :cond_20

    :cond_1f
    new-instance v9, Lbs1/i;

    const/4 v4, 0x6

    invoke-direct {v9, v6, v3, v4}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v9, Lc93/a;

    const/4 v4, 0x1

    invoke-virtual {v15, v5, v4, v2}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-string v12, "edit_profile_unit_metric"

    invoke-static {v11, v12}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v34, v11

    move-object v11, v10

    move-object/from16 v10, v34

    invoke-static/range {v7 .. v13}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->UnitToggleButton(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    const/4 v4, 0x2

    int-to-float v4, v4

    mul-float v4, v4, v26

    invoke-static {v5, v4, v10, v5, v2}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/4 v8, 0x6

    invoke-static {v4, v14, v10, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_21

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    :goto_13
    move-object/from16 v13, v30

    goto :goto_14

    :cond_21
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_13

    :goto_14
    invoke-static {v10, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v25

    invoke-static {v10, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_22

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_23

    :cond_22
    move-object/from16 v14, v22

    goto :goto_16

    :cond_23
    move-object/from16 v14, v22

    :goto_15
    move-object/from16 v8, v20

    goto :goto_17

    :goto_16
    invoke-static {v8, v10, v8, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_15

    :goto_17
    invoke-static {v10, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v7, 0x1

    invoke-virtual {v15, v5, v7, v2}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v12, p4

    move-object/from16 v11, v23

    const/4 v7, 0x0

    invoke-static {v11, v12, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object/from16 v26, v6

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_24

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_24
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_18
    invoke-static {v10, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_25

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    :cond_25
    invoke-static {v6, v10, v6, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    invoke-static {v10, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Lcom/whoop/profile/R$string;->profile_edit_height_label:I

    invoke-static {v10, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/4 v9, 0x0

    move-object v2, v12

    const/4 v12, 0x6

    move-object v6, v8

    const/4 v8, 0x0

    move/from16 v11, v24

    const/16 v19, 0x1

    invoke-static/range {v7 .. v12}, Lqz0/d;->b(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;Landroidx/compose/runtime/Composer;II)V

    move v7, v11

    const-string v8, "edit_profile_height_field"

    invoke-static {v5, v8}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v9, p3

    invoke-static {v9, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v11, v27

    invoke-static {v11, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    move-object/from16 p3, v11

    move/from16 v12, v31

    and-int/lit16 v11, v12, 0x380

    move-object/from16 v32, v5

    const/16 v5, 0x100

    if-ne v11, v5, :cond_27

    move/from16 v16, v19

    goto :goto_19

    :cond_27
    const/16 v16, 0x0

    :goto_19
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v16, :cond_29

    if-ne v5, v0, :cond_28

    goto :goto_1a

    :cond_28
    move/from16 v24, v7

    move/from16 v16, v11

    move-object/from16 v11, p2

    goto :goto_1b

    :cond_29
    :goto_1a
    new-instance v5, Lcom/whoop/profile/view/edit/form/e;

    move/from16 v24, v7

    const/4 v7, 0x0

    move/from16 v16, v11

    move-object/from16 v11, p2

    invoke-direct {v5, v11, v3, v7}, Lcom/whoop/profile/view/edit/form/e;-><init>(Lc93/m;Lp1/c1;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v5, Lc93/a;

    const/high16 v7, 0x70000

    shl-int/lit8 v12, v12, 0x3

    and-int/2addr v7, v12

    move-object v12, v15

    const/16 v15, 0x10

    const/4 v11, 0x0

    move-object/from16 v22, v3

    move-object/from16 v25, v4

    move-object/from16 v17, v6

    move-object v4, v12

    move/from16 v33, v16

    move/from16 v12, v18

    move/from16 v3, v19

    move-object/from16 v6, v32

    move-object/from16 v16, p0

    move-object/from16 p0, v0

    move-object v0, v13

    move-object/from16 v18, v14

    move v14, v7

    move-object v7, v8

    move-object v8, v9

    move-object v13, v10

    move-object/from16 v10, p3

    move-object v9, v5

    move-object/from16 v5, v23

    invoke-static/range {v7 .. v15}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->ClickableFormFieldContent(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V

    move v15, v12

    move-object v10, v13

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v4, v6, v3, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v13, 0x0

    invoke-static {v5, v2, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_2a

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_2a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v10, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v25

    invoke-static {v10, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_2b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    :cond_2b
    move-object/from16 v0, v18

    goto :goto_1e

    :cond_2c
    :goto_1d
    move-object/from16 v8, v17

    goto :goto_1f

    :goto_1e
    invoke-static {v5, v10, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1d

    :goto_1f
    invoke-static {v10, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lcom/whoop/profile/R$string;->profile_edit_weight_label:I

    invoke-static {v10, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v12, 0x6

    const/4 v8, 0x0

    move/from16 v11, v24

    invoke-static/range {v7 .. v12}, Lqz0/d;->b(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;Landroidx/compose/runtime/Composer;II)V

    const-string v0, "edit_profile_weight_field"

    invoke-static {v6, v0}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v0, v16

    invoke-static {v0, v10, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v12, v28

    invoke-static {v12, v10, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v33

    const/16 v5, 0x100

    if-ne v1, v5, :cond_2d

    move v4, v3

    goto :goto_20

    :cond_2d
    move v4, v13

    :goto_20
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v4, :cond_2f

    move-object/from16 v2, p0

    if-ne v1, v2, :cond_2e

    goto :goto_21

    :cond_2e
    move-object/from16 v4, p2

    goto :goto_22

    :cond_2f
    :goto_21
    new-instance v1, Lcom/whoop/profile/view/edit/form/e;

    const/4 v2, 0x1

    move-object/from16 v4, p2

    move-object/from16 v13, v22

    invoke-direct {v1, v4, v13, v2}, Lcom/whoop/profile/view/edit/form/e;-><init>(Lc93/m;Lp1/c1;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_22
    move-object v9, v1

    check-cast v9, Lc93/a;

    const/4 v11, 0x0

    move v12, v15

    const/16 v15, 0x10

    move-object v13, v10

    move-object v10, v0

    invoke-static/range {v7 .. v15}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->ClickableFormFieldContent(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V

    move-object v10, v13

    invoke-static {v10, v3, v3, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v1, v21

    move-object/from16 v4, v26

    :goto_23
    move v5, v12

    goto :goto_24

    :cond_30
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    move-object v4, v9

    goto :goto_23

    :goto_24
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_31

    new-instance v0, Lbf0/g;

    const/4 v8, 0x4

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ZIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_31
    return-void
.end method

.method private static final HeightWeightGroupedFormField$lambda$0$0(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightWeightGroupedFormField$lambda$2(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/domain/model/UnitSystem;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/UnitSystem;

    return-object p0
.end method

.method private static final HeightWeightGroupedFormField$lambda$3(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/domain/model/UnitSystem;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final HeightWeightGroupedFormField$lambda$4$0$0$0(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    invoke-static {p1, v0}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$3(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)V

    const-string p1, "imperial"

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightWeightGroupedFormField$lambda$4$0$1$0(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    invoke-static {p1, v0}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$3(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)V

    const-string p1, "metric"

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightWeightGroupedFormField$lambda$4$1$0$0$0(Lc93/m;Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;->HEIGHT:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$2(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/domain/model/UnitSystem;->toName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightWeightGroupedFormField$lambda$4$1$1$0$0(Lc93/m;Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;->WEIGHT:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    invoke-static {p1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$2(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/domain/model/UnitSystem;->toName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightWeightGroupedFormField$lambda$5(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;Lc93/m;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v7}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;Lc93/m;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final UnitToggleButton(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p1

    move/from16 v1, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, -0x4dcb07f

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    move-object/from16 v6, p0

    if-nez v2, :cond_1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v0, v7}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v1, 0x180

    move-object/from16 v12, p2

    if-nez v5, :cond_5

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v2, v5

    :cond_5
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_7

    or-int/lit16 v2, v2, 0xc00

    :cond_6
    move-object/from16 v8, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v1, 0xc00

    if-nez v8, :cond_6

    move-object/from16 v8, p3

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_4

    :cond_8
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v2, v9

    :goto_5
    and-int/lit16 v9, v2, 0x493

    const/16 v10, 0x492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v9, v10, :cond_9

    move v9, v14

    goto :goto_6

    :cond_9
    move v9, v15

    :goto_6
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_10

    if-eqz v5, :cond_a

    sget-object v5, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_a
    move-object v5, v8

    :goto_7
    int-to-float v3, v3

    int-to-float v4, v4

    invoke-static {v5, v3, v4}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    if-eqz v7, :cond_b

    const v8, -0x40726778

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-static {v8, v0, v9, v15}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    goto :goto_8

    :cond_b
    const v8, -0x40726394

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v0, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->V0()J

    move-result-wide v8

    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    :goto_8
    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v8, v9, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v11, Li3/i;

    invoke-direct {v11, v15}, Li3/i;-><init>(I)V

    const/16 v13, 0xb

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v8, v14

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    mul-float/2addr v3, v9

    invoke-static {v4, v3, v8}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->E:Lb2/m;

    invoke-static {v4, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v8, v0, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->c()Lb91/a;

    move-result-object v28

    if-eqz v7, :cond_f

    const v8, -0x7d09d5ef

    invoke-static {v0, v8, v3, v0, v4}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v3

    :goto_a
    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    move-wide v10, v3

    goto :goto_b

    :cond_f
    const v8, -0x7d09d1b2

    invoke-static {v0, v8, v3, v0, v4}, Lm4/a;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v3

    goto :goto_a

    :goto_b
    and-int/lit8 v31, v2, 0xe

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v32, v2, 0x12

    const v33, 0x2fffa

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    move v2, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v30, v0

    move-object v8, v6

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    move-object v4, v5

    goto :goto_c

    :cond_10
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v4, v8

    :goto_c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_11

    new-instance v0, Lcom/whoop/profile/view/edit/form/f;

    const/4 v3, 0x0

    move-object/from16 v6, p0

    move-object/from16 v5, p2

    move/from16 v2, p6

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/view/edit/form/f;-><init>(IIILandroidx/compose/ui/Modifier;Lc93/a;Ljava/lang/String;Z)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final UnitToggleButton$lambda$1(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->UnitToggleButton(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$4$0$1$0(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$0$0(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/m;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$4$1$1$0$0(Lc93/m;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->UnitToggleButton$lambda$1(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->ClickableFormFieldContent$lambda$1(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/m;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$4$1$0$0$0(Lc93/m;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;Lc93/m;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$5(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;Lc93/m;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField$lambda$4$0$0$0(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
