.class public final Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a=\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/bot/settings/ConcisenessMode;",
        "selectedMode",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackPressed",
        "Lkotlin/Function1;",
        "Lcom/whoop/bot/settings/CoachSettingsViewEvent;",
        "onViewEvent",
        "ConcisenessContent",
        "(Lcom/whoop/bot/settings/ConcisenessMode;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static final ConcisenessContent(Lcom/whoop/bot/settings/ConcisenessMode;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/settings/ConcisenessMode;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "selectedMode"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x1a6916e8

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v11, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v14, 0x0

    if-eq v9, v10, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move v9, v14

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_10

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_9

    new-instance v5, Lcj0/f;

    const/16 v6, 0x10

    invoke-direct {v5, v6}, Lcj0/f;-><init>(I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lc93/a;

    move-object v8, v5

    goto :goto_7

    :cond_a
    move-object v8, v6

    :goto_7
    if-eqz v7, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_b

    new-instance v5, Lcj2/a;

    const/16 v6, 0x16

    invoke-direct {v5, v6}, Lcj2/a;-><init>(I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object/from16 v5, p2

    :goto_8
    const-string v6, "CoachConcisenessModeScreen"

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6}, Lgb1/b0;->S(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v11, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v11, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    :cond_e
    invoke-static {v10, v11, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v11, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v6, v3

    const/16 v9, 0x8

    int-to-float v15, v9

    mul-float v18, v6, v15

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v7

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v19, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    sget v7, Lwk0/b;->i:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v20

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v22

    const v36, 0xfffa

    const/16 v37, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v19 .. v37}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v9, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v9, v9, 0x3

    or-int/lit8 v9, v9, 0x6

    shl-int/lit8 v10, v0, 0x6

    and-int/lit16 v10, v10, 0x1c00

    or-int v12, v9, v10

    const/16 v13, 0x34

    move-object v9, v7

    const/4 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v2, v16

    move/from16 v16, v15

    move-object v15, v2

    move-object/from16 v38, v5

    move-object v5, v6

    move-object/from16 v39, v17

    move/from16 v2, v18

    move-object/from16 v6, v19

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v32, v8

    const/4 v5, 0x0

    invoke-static {v15, v2, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v7, Lwk0/b;->h:I

    invoke-static {v7, v11, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget v8, Lx81/d;->b:I

    move-object/from16 v10, v39

    invoke-virtual {v10, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v10, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b1()J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v29, v10, 0x12

    const v30, 0x2fff8

    move v12, v5

    move-object v5, v7

    move-wide v7, v8

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    move-object/from16 v18, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v22, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v33, v24

    const/16 v24, 0x0

    move-object/from16 v34, v26

    const/16 v26, 0x0

    move/from16 v35, v28

    const/16 v28, 0x30

    move-object/from16 v40, v34

    move/from16 v34, v0

    move-object/from16 v0, v40

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float v5, v5, v33

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v11, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v12, 0x0

    invoke-static {v0, v2, v12, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {}, Lcom/whoop/bot/settings/ConcisenessMode;->values()[Lcom/whoop/bot/settings/ConcisenessMode;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    new-instance v2, Lcom/whoop/bot/settings/a;

    const/4 v3, 0x1

    move-object/from16 v14, v38

    invoke-direct {v2, v14, v3}, Lcom/whoop/bot/settings/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const v3, 0x4c1d8653    # 4.1294156E7f

    invoke-static {v3, v11, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    shl-int/lit8 v2, v34, 0x3

    and-int/lit8 v2, v2, 0x70

    const v3, 0x36180

    or-int v12, v2, v3

    const/16 v13, 0x8

    const/4 v8, 0x0

    move-object v5, v0

    move-object v6, v1

    invoke-static/range {v5 .. v13}, Lf31/c;->h(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lb2/f;Ll0/l;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object v3, v14

    move-object/from16 v2, v32

    goto :goto_a

    :cond_10
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v2, v6

    :goto_a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lc41/d1;

    const/16 v6, 0xf

    move-object/from16 v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final ConcisenessContent$lambda$0$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final ConcisenessContent$lambda$1$0(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ConcisenessContent$lambda$2$0(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Lcom/whoop/bot/settings/ConcisenessMode;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p5

    const-string v4, "$this$RadioGroupVertical"

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "mode"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "state"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v3, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v4}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit16 v6, v3, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_4

    and-int/lit16 v3, v3, 0x200

    if-nez v3, :cond_2

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    move v3, v7

    goto :goto_3

    :cond_3
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v4, v3

    :cond_4
    and-int/lit16 v3, v4, 0x491

    const/16 v6, 0x490

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v3, v6, :cond_5

    move v3, v9

    goto :goto_4

    :cond_5
    move v3, v8

    :goto_4
    and-int/lit8 v6, v4, 0x1

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_f

    sget-object v3, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v3, v6

    const/4 v11, 0x2

    if-eq v6, v9, :cond_7

    if-ne v6, v11, :cond_6

    sget v6, Lwk0/b;->f:I

    goto :goto_5

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    sget v6, Lwk0/b;->d:I

    :goto_5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v3, v3, v12

    if-eq v3, v9, :cond_9

    if-ne v3, v11, :cond_8

    sget v3, Lwk0/b;->g:I

    goto :goto_6

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    sget v3, Lwk0/b;->e:I

    :goto_6
    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    sget-object v12, Lny0/e0;->TEXT:Lny0/e0;

    invoke-virtual {v2}, Lf31/a;->c()Z

    move-result v15

    and-int/lit16 v6, v4, 0x380

    if-eq v6, v7, :cond_b

    and-int/lit16 v6, v4, 0x200

    if-eqz v6, :cond_a

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_7

    :cond_a
    move v6, v8

    goto :goto_8

    :cond_b
    :goto_7
    move v6, v9

    :goto_8
    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    and-int/lit8 v4, v4, 0x70

    if-ne v4, v5, :cond_c

    goto :goto_9

    :cond_c
    move v9, v8

    :goto_9
    or-int v4, v6, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_d

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_e

    :cond_d
    new-instance v5, Lq;

    const/16 v4, 0x13

    invoke-direct {v5, v2, v0, v1, v4}, Lq;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v19, v5

    check-cast v19, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0x180

    const/16 v22, 0xe9

    move-object/from16 v32, v10

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v21, v0

    move-object/from16 v20, v32

    invoke-static/range {v10 .. v22}, Lny0/d1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v20

    const-wide/high16 v1, 0x4029000000000000L    # 12.5

    double-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    const/16 v4, 0xe

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 p1, v1

    move/from16 p4, v2

    move/from16 p5, v4

    move-object/from16 p0, v5

    move/from16 p2, v6

    move/from16 p3, v7

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v3, v0, v8}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v0, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v30

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v12

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v34, v1, 0x12

    const v35, 0x2fff8

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x30

    move-object/from16 v32, v0

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_a

    :cond_f
    move-object/from16 v32, v10

    invoke-virtual/range {v32 .. v32}, Lp1/q;->X()V

    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final ConcisenessContent$lambda$2$0$0$0(Lf31/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/settings/ConcisenessMode;Z)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lf31/a;->c()Z

    move-result p0

    if-nez p0, :cond_1

    if-eqz p3, :cond_1

    new-instance p0, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;

    sget-object p3, Lcom/whoop/bot/settings/ConcisenessMode;->CONDENSED:Lcom/whoop/bot/settings/ConcisenessMode;

    if-ne p2, p3, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string p3, "WHOOP_COACH_CONCISE"

    invoke-direct {p0, p3, p2}, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;-><init>(Ljava/lang/String;Z)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ConcisenessContent$lambda$3(Lcom/whoop/bot/settings/ConcisenessMode;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;->ConcisenessContent(Lcom/whoop/bot/settings/ConcisenessMode;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lf31/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/settings/ConcisenessMode;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;->ConcisenessContent$lambda$2$0$0$0(Lf31/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/settings/ConcisenessMode;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/bot/settings/ConcisenessMode;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;->ConcisenessContent$lambda$3(Lcom/whoop/bot/settings/ConcisenessMode;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Lcom/whoop/bot/settings/ConcisenessMode;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;->ConcisenessContent$lambda$2$0(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Lcom/whoop/bot/settings/ConcisenessMode;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;->ConcisenessContent$lambda$1$0(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;->ConcisenessContent$lambda$0$0()Ll83/a0;

    move-result-object v0

    return-object v0
.end method
