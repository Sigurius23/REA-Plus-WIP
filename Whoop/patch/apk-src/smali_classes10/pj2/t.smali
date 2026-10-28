.class public abstract Lpj2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a]\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a3\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\rH\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006!\u00b2\u0006\u000e\u0010\u001b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010 \u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lnj2/k;",
        "viewState",
        "",
        "Lcom/whoop/stress/domain/BreathingEvent;",
        "breathingEvents",
        "Lnj2/s;",
        "saveState",
        "",
        "isError",
        "Lkotlin/Function1;",
        "Llj2/f;",
        "Ll83/a0;",
        "onEvent",
        "Lkotlin/Function0;",
        "onBackPressed",
        "D",
        "(Lnj2/k;Ljava/util/List;Lnj2/s;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "saveSession",
        "onStartNextCycleClicked",
        "t",
        "(Lnj2/k;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "y",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "A",
        "(Landroidx/compose/runtime/Composer;I)V",
        "showFinishSessionDialog",
        "",
        "ongoingTimeInSeconds",
        "",
        "continuousToolbarSubtitle",
        "showFinishSession",
        "stress_release"
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
.method private static final A(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x7b42d0b7

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Ljs2/g;

    const/4 v1, 0x1

    invoke-direct {v2, v0, v1}, Ljs2/g;-><init>(Landroid/view/View;I)V

    invoke-virtual {p0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, v2, p0}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lm22/t;

    const/16 v1, 0x13

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final B(Landroid/view/View;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/view/View;->setKeepScreenOn(Z)V

    new-instance p1, Lpj2/t$b;

    invoke-direct {p1, p0}, Lpj2/t$b;-><init>(Landroid/view/View;)V

    return-object p1
.end method

.method private static final C(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lpj2/t;->A(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final D(Lnj2/k;Ljava/util/List;Lnj2/s;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnj2/k;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/BreathingEvent;",
            ">;",
            "Lnj2/s;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p7

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v8, "breathingEvents"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onEvent"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p6

    check-cast v15, Lp1/q;

    const v8, -0x3c1c35e7

    invoke-virtual {v15, v8}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v8, v7, 0x6

    const/4 v9, 0x2

    if-nez v8, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    move v8, v9

    :goto_0
    or-int/2addr v8, v7

    goto :goto_1

    :cond_1
    move v8, v7

    :goto_1
    and-int/lit8 v10, v7, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v8, v10

    :cond_3
    and-int/lit16 v10, v7, 0x180

    if-nez v10, :cond_6

    if-nez v3, :cond_4

    const/4 v10, -0x1

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    :goto_3
    invoke-virtual {v15, v10}, Lp1/q;->e(I)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x100

    goto :goto_4

    :cond_5
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v8, v10

    :cond_6
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_8

    invoke-virtual {v15, v4}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x800

    goto :goto_5

    :cond_7
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v8, v10

    :cond_8
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_a

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x4000

    goto :goto_6

    :cond_9
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v8, v10

    :cond_a
    and-int/lit8 v10, p8, 0x20

    const/high16 v12, 0x30000

    if-eqz v10, :cond_c

    or-int/2addr v8, v12

    :cond_b
    move-object/from16 v12, p5

    goto :goto_8

    :cond_c
    and-int/2addr v12, v7

    if-nez v12, :cond_b

    move-object/from16 v12, p5

    invoke-virtual {v15, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/high16 v14, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v14, 0x10000

    :goto_7
    or-int/2addr v8, v14

    :goto_8
    const v14, 0x12493

    and-int/2addr v14, v8

    const v11, 0x12492

    if-eq v14, v11, :cond_e

    const/4 v11, 0x1

    goto :goto_9

    :cond_e
    move v11, v0

    :goto_9
    and-int/lit8 v14, v8, 0x1

    invoke-virtual {v15, v14, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_42

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v11, :cond_f

    new-instance v10, Lpc3/r;

    const/16 v12, 0xb

    invoke-direct {v10, v12}, Lpc3/r;-><init>(I)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v10, Lc93/a;

    goto :goto_a

    :cond_10
    move-object v10, v12

    :goto_a
    const v42, 0xe000

    if-nez v1, :cond_11

    const v6, -0x16ded726

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move-object v4, v10

    move-object v0, v11

    const/16 v6, 0x4000

    const/4 v9, 0x1

    goto/16 :goto_17

    :cond_11
    const v14, -0x16ded725

    invoke-virtual {v15, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v11, :cond_12

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v15, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v14, Lp1/c1;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v11, :cond_14

    invoke-virtual {v1}, Lnj2/k;->l()Ljava/lang/Integer;

    move-result-object v13

    if-eqz v13, :cond_13

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_b

    :cond_13
    move v13, v0

    :goto_b
    invoke-static {v13, v15}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v13

    :cond_14
    check-cast v13, Lp1/c1;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v11, :cond_15

    filled-new-array {v6, v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    const-string v12, "%02d:%02d"

    invoke-static {v12, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v12, Lp1/c1;

    invoke-virtual {v1}, Lnj2/k;->l()Ljava/lang/Integer;

    move-result-object v6

    if-nez v6, :cond_16

    const v6, -0x3f663324

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move v6, v0

    const/4 v0, 0x0

    goto :goto_d

    :cond_16
    const v9, -0x3f663323

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v11, :cond_17

    new-instance v9, Lpj2/t$c;

    const/4 v0, 0x0

    invoke-direct {v9, v13, v12, v0}, Lpj2/t$c;-><init>(Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v15, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_c

    :cond_17
    const/4 v0, 0x0

    :goto_c
    check-cast v9, Lc93/m;

    invoke-static {v15, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v6, 0x0

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    :goto_d
    invoke-static {v15, v6}, Lpj2/t;->A(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v11, :cond_18

    new-instance v9, Lo0/i;

    const/16 v13, 0xa

    invoke-direct {v9, v13, v14}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v9, Lc93/a;

    const/16 v13, 0x30

    const/4 v0, 0x1

    invoke-static {v9, v6, v15, v13, v0}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Lgb1/b0;->S(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v13, v15, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v6, v15, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v4, v15, Lp1/q;->S:Z

    if-eqz v4, :cond_19

    invoke-virtual {v15, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_e
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v15, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v15, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-nez v7, :cond_1a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1b

    :cond_1a
    invoke-static {v6, v15, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v15, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnj2/k;->k()Lo81/a;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v1}, Lnj2/k;->k()Lo81/a;

    move-result-object v0

    move-object/from16 v21, v0

    const/4 v6, 0x1

    goto :goto_f

    :cond_1c
    invoke-virtual {v1}, Lnj2/k;->l()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1d

    new-instance v0, Lo81/a;

    invoke-static {v12}, Lpj2/t;->Q(Lp1/c1;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/4 v6, 0x1

    invoke-direct {v0, v4, v6}, Lo81/a;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    move-object/from16 v21, v0

    goto :goto_f

    :cond_1d
    const/4 v6, 0x1

    const/16 v21, 0x0

    :goto_f
    new-instance v19, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v1}, Lnj2/k;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v20

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v22

    sget v0, Lgy0/f;->K:I

    invoke-static {v15, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v23

    const v36, 0xfff0

    const/16 v37, 0x0

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

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_1e

    new-instance v0, Lo0/i;

    const/16 v4, 0xb

    invoke-direct {v0, v4, v14}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object v12, v0

    check-cast v12, Lc93/a;

    sget v0, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0xc00

    const/16 v17, 0x35

    const/4 v9, 0x0

    move-object v4, v11

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v7, v14

    const/4 v14, 0x0

    move/from16 v16, v0

    move-object v0, v4

    move-object v4, v10

    move-object/from16 v10, v19

    const/16 v6, 0x4000

    invoke-static/range {v9 .. v17}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    and-int v9, v8, v42

    if-ne v9, v6, :cond_1f

    const/4 v13, 0x1

    goto :goto_10

    :cond_1f
    const/4 v13, 0x0

    :goto_10
    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v10, v13

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_20

    if-ne v11, v0, :cond_21

    :cond_20
    new-instance v11, Lpj2/s;

    const/4 v10, 0x1

    invoke-direct {v11, v2, v10, v5}, Lpj2/s;-><init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v11, Lc93/a;

    if-ne v9, v6, :cond_22

    const/4 v13, 0x1

    goto :goto_11

    :cond_22
    const/4 v13, 0x0

    :goto_11
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v13, :cond_23

    if-ne v10, v0, :cond_24

    :cond_23
    new-instance v10, Lp62/h;

    const/16 v12, 0xd

    invoke-direct {v10, v5, v12}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v10, Lc93/a;

    and-int/lit8 v12, v8, 0xe

    invoke-static {v1, v11, v10, v15, v12}, Lpj2/t;->t(Lnj2/k;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7}, Lpj2/t;->F(Lp1/c1;)Z

    move-result v10

    if-eqz v10, :cond_2e

    const v10, 0x65a49115

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lnj2/k;->e()Lnj2/i;

    move-result-object v10

    if-nez v10, :cond_25

    const v7, 0x4eed918c

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_14

    :cond_25
    const v11, 0x4eed918d

    invoke-virtual {v15, v11}, Lp1/q;->e0(I)V

    move-object v11, v10

    invoke-virtual {v11}, Lnj2/i;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v0, :cond_26

    sget-object v12, Lpj2/t$d;->w:Lpj2/t$d;

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v12}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v14

    invoke-virtual {v11}, Lnj2/i;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v11}, Lnj2/i;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_27

    new-instance v11, Lo0/i;

    const/16 v13, 0xc

    invoke-direct {v11, v13, v7}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object/from16 v31, v11

    check-cast v31, Lc93/a;

    if-ne v9, v6, :cond_28

    const/4 v13, 0x1

    goto :goto_12

    :cond_28
    const/4 v13, 0x0

    :goto_12
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v13, :cond_29

    if-ne v7, v0, :cond_2a

    :cond_29
    new-instance v7, Lp62/h;

    const/16 v11, 0xb

    invoke-direct {v7, v5, v11}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    move-object/from16 v32, v7

    check-cast v32, Lc93/a;

    if-ne v9, v6, :cond_2b

    const/4 v13, 0x1

    goto :goto_13

    :cond_2b
    const/4 v13, 0x0

    :goto_13
    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v13

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_2c

    if-ne v9, v0, :cond_2d

    :cond_2c
    new-instance v9, Lpj2/s;

    const/4 v7, 0x0

    invoke-direct {v9, v2, v7, v5}, Lpj2/s;-><init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v15, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    move-object/from16 v33, v9

    check-cast v33, Lc93/a;

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v7, 0x3

    shl-int/lit8 v11, v7, 0x9

    or-int/2addr v9, v11

    shl-int/lit8 v7, v7, 0x1b

    or-int v38, v9, v7

    const/16 v40, 0x180

    const v41, 0xe3ffdd5

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    invoke-static/range {v9 .. v41}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v15, v37

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    :goto_15
    const/4 v9, 0x1

    goto :goto_16

    :cond_2e
    const/4 v7, 0x0

    const v9, 0x4ef6e6bb

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_15

    :goto_16
    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    :goto_17
    sget-object v7, Lnj2/s;->SAVING:Lnj2/s;

    if-ne v3, v7, :cond_2f

    const v0, 0x5a1b43c2

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    new-instance v9, Lsz0/p0$e;

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lej2/c;->q:I

    const/4 v7, 0x2

    const/4 v10, 0x0

    invoke-direct {v0, v6, v10, v7, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->c()Lgz0/k;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/k;->d()I

    move-result v6

    invoke-direct {v9, v0, v6}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget v0, Lsz0/p0$e;->g:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v22, v0, v6

    const/16 v23, 0x0

    const/16 v24, 0xffc

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v9 .. v24}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v21

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_1d

    :cond_2f
    const/4 v7, 0x2

    const/4 v10, 0x0

    sget-object v11, Lnj2/s;->SAVED:Lnj2/s;

    if-ne v3, v11, :cond_33

    const v7, 0x5a1b6b87

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    and-int v7, v8, v42

    if-ne v7, v6, :cond_30

    move v13, v9

    goto :goto_18

    :cond_30
    const/4 v13, 0x0

    :goto_18
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v13, :cond_31

    if-ne v6, v0, :cond_32

    :cond_31
    new-instance v6, Lp62/h;

    const/16 v0, 0xc

    invoke-direct {v6, v5, v0}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_32
    move-object v11, v6

    check-cast v11, Lc93/a;

    new-instance v7, Lsz0/p0$h;

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x3

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v13}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget v0, Lsz0/p0$h;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v22, v0, v6

    const/16 v23, 0x0

    const/16 v24, 0xffc

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v9, v7

    invoke-static/range {v9 .. v24}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v21

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_1d

    :cond_33
    sget-object v6, Lnj2/s;->ERROR:Lnj2/s;

    const/high16 v11, 0x70000

    if-ne v3, v6, :cond_3a

    const v6, -0x16a97aae

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    new-instance v16, Lsz0/p0$b;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lej2/c;->m:I

    invoke-direct {v6, v12, v10, v7, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v6

    invoke-direct/range {v16 .. v21}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lej2/c;->k:I

    invoke-direct {v6, v12, v10, v7, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lej2/c;->h:I

    invoke-direct {v12, v13, v10, v7, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int v7, v8, v11

    const/high16 v8, 0x20000

    if-ne v7, v8, :cond_34

    move v13, v9

    goto :goto_19

    :cond_34
    const/4 v13, 0x0

    :goto_19
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v13, :cond_35

    if-ne v8, v0, :cond_36

    :cond_35
    new-instance v8, Lot1/e;

    const/16 v10, 0xc

    invoke-direct {v8, v4, v10}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    move-object v11, v8

    check-cast v11, Lc93/a;

    const/high16 v8, 0x20000

    if-ne v7, v8, :cond_37

    move v13, v9

    goto :goto_1a

    :cond_37
    const/4 v13, 0x0

    :goto_1a
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v13, :cond_38

    if-ne v7, v0, :cond_39

    :cond_38
    new-instance v7, Lot1/e;

    const/16 v0, 0xd

    invoke-direct {v7, v4, v0}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_39
    move-object v13, v7

    check-cast v13, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    sget v7, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v8, v7, 0x3

    or-int/2addr v0, v8

    shl-int/lit8 v7, v7, 0x9

    or-int v22, v0, v7

    const/16 v23, 0x0

    const/16 v24, 0xfe0

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v9, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v10, v6

    invoke-static/range {v9 .. v24}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v21

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_1d

    :cond_3a
    if-eqz p3, :cond_41

    const v6, -0x16a3044c

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    new-instance v16, Lsz0/p0$b;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lej2/c;->m:I

    invoke-direct {v6, v12, v10, v7, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v6

    invoke-direct/range {v16 .. v21}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lej2/c;->l:I

    invoke-direct {v6, v12, v10, v7, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lej2/c;->h:I

    invoke-direct {v12, v13, v10, v7, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int v7, v8, v11

    const/high16 v8, 0x20000

    if-ne v7, v8, :cond_3b

    move v13, v9

    goto :goto_1b

    :cond_3b
    const/4 v13, 0x0

    :goto_1b
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v13, :cond_3c

    if-ne v8, v0, :cond_3d

    :cond_3c
    new-instance v8, Lot1/e;

    const/16 v10, 0xe

    invoke-direct {v8, v4, v10}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3d
    move-object v11, v8

    check-cast v11, Lc93/a;

    const/high16 v8, 0x20000

    if-ne v7, v8, :cond_3e

    move v13, v9

    goto :goto_1c

    :cond_3e
    const/4 v13, 0x0

    :goto_1c
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v13, :cond_3f

    if-ne v7, v0, :cond_40

    :cond_3f
    new-instance v7, Lot1/e;

    const/16 v0, 0xf

    invoke-direct {v7, v4, v0}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_40
    move-object v13, v7

    check-cast v13, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    sget v7, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v8, v7, 0x3

    or-int/2addr v0, v8

    shl-int/lit8 v7, v7, 0x9

    or-int v22, v0, v7

    const/16 v23, 0x0

    const/16 v24, 0xfe0

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v9, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v10, v6

    invoke-static/range {v9 .. v24}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v21

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_41
    const/4 v7, 0x0

    const v0, -0x169cfcb7

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    :goto_1d
    move-object v6, v4

    goto :goto_1e

    :cond_42
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v6, v12

    :goto_1e
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_43

    new-instance v0, Lb30/i2;

    const/16 v9, 0x10

    move/from16 v4, p3

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lb30/i2;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;Lc93/a;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_43
    return-void
.end method

.method private static final E()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final G(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lpj2/t;->N(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lpj2/t;->N(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ll83/a0;
    .locals 1

    new-instance v0, Llj2/f$b;

    invoke-direct {v0, p1}, Llj2/f$b;-><init>(Ljava/util/List;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Llj2/f$d;->a:Llj2/f$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lpj2/t;->N(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Llj2/f$a;->a:Llj2/f$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ll83/a0;
    .locals 1

    new-instance v0, Llj2/f$b;

    invoke-direct {v0, p1}, Llj2/f$b;-><init>(Ljava/util/List;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final O(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final P(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final Q(Lp1/c1;)Ljava/lang/String;
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

.method private static final R(Lp1/c1;Ljava/lang/String;)V
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

.method private static final S(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Llj2/f$c;->a:Llj2/f$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final V(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final W(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final X(Lnj2/k;Ljava/util/List;Lnj2/s;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lpj2/t;->D(Lnj2/k;Ljava/util/List;Lnj2/s;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic Y(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lpj2/t;->O(Lp1/c1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic Z(Lp1/c1;I)V
    .locals 0

    invoke-static {p0, p1}, Lpj2/t;->P(Lp1/c1;I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->S(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic a0(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lpj2/t;->R(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->K(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lnj2/k;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpj2/t;->x(Lnj2/k;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/view/View;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1}, Lpj2/t;->B(Landroid/view/View;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->T(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->W(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lnj2/k;Ljava/util/List;Lnj2/s;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lpj2/t;->X(Lnj2/k;Ljava/util/List;Lnj2/s;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lpj2/t;->C(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lnj2/k;Lc93/a;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpj2/t;->w(Lnj2/k;Lc93/a;Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->H(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lpj2/t;->M(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lpj2/t;->I(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpj2/t;->z(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n()Ll83/a0;
    .locals 1

    invoke-static {}, Lpj2/t;->E()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->J(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->G(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->U(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->V(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/t;->L(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lnj2/k;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnj2/k;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p4

    sget-object v0, Lb2/e;->w:Lb2/m;

    sget-object v3, Lb2/e;->N:Lb2/k;

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v4, 0x5f7365f2

    invoke-virtual {v10, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    goto :goto_4

    :cond_5
    move-object/from16 v7, p2

    :goto_4
    and-int/lit16 v8, v4, 0x93

    const/16 v9, 0x92

    const/4 v11, 0x0

    if-eq v8, v9, :cond_6

    const/4 v8, 0x1

    goto :goto_5

    :cond_6
    move v8, v11

    :goto_5
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_26

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_7

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v33, v8

    check-cast v33, Lp1/c1;

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v14, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    move-object/from16 v19, v9

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v21, La3/l;->a:La3/k;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v21, v14

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v10, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v8, v10, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnj2/k;->i()Z

    move-result v8

    const/16 v24, 0x6

    sget-object v12, Ll0/z;->a:Ll0/z;

    if-eqz v8, :cond_b

    const v8, 0x411d8965

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    invoke-virtual {v12, v5, v13, v8}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12, v7, v3}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v3, v10, v7}, Lpj2/t;->y(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    move/from16 v34, v4

    move v4, v7

    move-object/from16 v35, v9

    move-object/from16 v47, v11

    move v3, v13

    move-object/from16 v46, v14

    move-object/from16 v48, v15

    move-object/from16 v36, v19

    move-object/from16 v45, v21

    goto/16 :goto_b

    :cond_b
    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    invoke-static/range {v33 .. v33}, Lpj2/t;->u(Lp1/c1;)Z

    move-result v20

    if-eqz v20, :cond_f

    const v7, 0x4120c41a

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v5, v13, v8}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12, v7, v3}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v3, v10, v7}, Lpj2/t;->y(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    and-int/lit8 v7, v4, 0x70

    const/16 v13, 0x20

    if-ne v7, v13, :cond_c

    const/4 v7, 0x1

    goto :goto_7

    :cond_c
    const/4 v7, 0x0

    :goto_7
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_e

    move-object/from16 v7, v19

    if-ne v8, v7, :cond_d

    goto :goto_8

    :cond_d
    const/4 v12, 0x0

    goto :goto_9

    :cond_e
    move-object/from16 v7, v19

    :goto_8
    new-instance v8, Lpj2/t$a;

    const/4 v12, 0x0

    invoke-direct {v8, v2, v12}, Lpj2/t$a;-><init>(Lc93/a;Lq83/d;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v8, Lc93/m;

    invoke-static {v10, v8, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move/from16 v34, v4

    move-object/from16 v36, v7

    move-object/from16 v35, v9

    move-object/from16 v47, v11

    move-object/from16 v46, v14

    move-object/from16 v48, v15

    move-object/from16 v45, v21

    move v4, v3

    const/4 v3, 0x1

    goto/16 :goto_b

    :cond_f
    move v3, v7

    move-object/from16 v7, v19

    const/16 v13, 0x20

    const/16 v25, 0x0

    const v8, 0x412558a7

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    invoke-virtual {v12, v5, v13, v8}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v0, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    move/from16 v34, v4

    iget-wide v3, v10, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_10

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v10, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    :cond_11
    invoke-static {v3, v10, v3, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v10, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v19, v7

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v20, v8

    invoke-virtual {v1}, Lnj2/k;->a()Lv41/r0;

    move-result-object v8

    move-object v3, v9

    invoke-virtual {v1}, Lnj2/k;->d()Lv41/m0;

    move-result-object v9

    sget v4, Lv41/m0;->a:I

    shl-int/lit8 v4, v4, 0x6

    or-int/lit8 v4, v4, 0x6

    const/4 v12, 0x0

    move-object/from16 v35, v3

    move-object v13, v11

    move-object/from16 v36, v19

    const/4 v3, 0x1

    move v11, v4

    const/4 v4, 0x0

    invoke-static/range {v7 .. v12}, Lv41/p;->g(Landroidx/compose/ui/Modifier;Lv41/r0;Lv41/m0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lnj2/k;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v10, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v10, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v8, v10, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->x()Lb91/a;

    move-result-object v27

    sget-object v8, Lb2/e;->E:Lb2/m;

    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v9, v5, v8}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v31, v9, 0x12

    const v32, 0x2fff8

    move-object/from16 v29, v10

    move-wide v9, v11

    const-wide/16 v11, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    const/16 v23, 0x100

    const/16 v24, 0x2

    const-wide/16 v16, 0x0

    const/16 v26, 0x20

    const/16 v18, 0x0

    move-object/from16 v28, v19

    const/16 v19, 0x0

    move-object/from16 v37, v20

    move-object/from16 v30, v21

    const-wide/16 v20, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v24

    const/16 v24, 0x0

    move-object/from16 v41, v25

    const/16 v25, 0x0

    move/from16 v42, v26

    const/16 v26, 0x0

    move-object/from16 v43, v28

    const/16 v28, 0x0

    move-object/from16 v44, v30

    const/16 v30, 0x0

    move-object/from16 v46, v37

    move-object/from16 v48, v38

    move-object/from16 v47, v43

    move-object/from16 v45, v44

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    :goto_b
    const/16 v7, 0x2a

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v7, v8

    const/4 v9, 0x0

    invoke-static {v5, v9, v7, v3}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v11, 0x6

    int-to-float v12, v11

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v12, v13

    const/4 v14, 0x2

    invoke-static {v7, v12, v9, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, Ll0/m;->e:Ll0/h;

    move-object/from16 v15, v45

    invoke-static {v12, v15, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v3, v10, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_13

    move-object/from16 v15, v46

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v15, v47

    goto :goto_d

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v10, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v12, v48

    invoke-static {v10, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    :cond_14
    move-object/from16 v4, v35

    invoke-static {v3, v10, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v10, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v10, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->O()Lb91/a;

    move-result-object v27

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v10, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-virtual/range {v27 .. v27}, Lb91/a;->d()Ll3/v0;

    move-result-object v4

    iget-object v4, v4, Ll3/v0;->a:Ll3/m0;

    iget-wide v6, v4, Ll3/m0;->b:J

    invoke-interface {v3, v6, v7}, Ly3/c;->l(J)F

    move-result v3

    int-to-float v4, v14

    div-float v18, v3, v4

    const v3, 0x7e19ab65

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lnj2/k;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll83/k;

    iget-object v7, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/design/util/TextResource;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Ly81/f;

    mul-float v12, v8, v8

    invoke-static {v12}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    sget-object v15, Lb2/e;->J:Lb2/l;

    invoke-static {v12, v15, v10, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-eqz v2, :cond_16

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_16
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_f
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v10, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v10, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_18

    :cond_17
    invoke-static {v14, v10, v14, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v5

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v5, v18

    mul-float v9, v4, v8

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v9, 0x0

    invoke-virtual {v6, v10, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    invoke-static {v4, v11, v12}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v6

    sget-object v11, Lt0/j;->a:Lt0/i;

    iget v12, v6, Lf0/t;->a:F

    iget-object v6, v6, Lf0/t;->b:Li2/t;

    invoke-static {v12, v2, v6, v11}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v10, v9}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v2, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v11

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v31, v2, 0x12

    const v32, 0x2fffa

    move v2, v8

    const/4 v8, 0x0

    move-object/from16 v29, v10

    move-wide v9, v11

    const-wide/16 v11, 0x0

    move v6, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const-wide/16 v16, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v23, v20

    const-wide/16 v20, 0x0

    const/16 v25, 0x6

    const/16 v22, 0x0

    move-object/from16 v26, v23

    const/16 v23, 0x0

    const/16 v49, 0x2

    const/16 v24, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v35, v28

    const/16 v28, 0x0

    move-object/from16 v38, v30

    const/16 v30, 0x0

    move/from16 p3, v2

    move/from16 v39, v35

    move-object/from16 v2, v38

    const/16 v38, 0x0

    move-object/from16 v35, v3

    move/from16 v3, v49

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    const/4 v13, 0x1

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move/from16 v8, p3

    move v14, v3

    move/from16 v18, v5

    move v13, v6

    move-object/from16 v3, v35

    move/from16 v9, v38

    move/from16 v11, v39

    move-object v5, v2

    move-object/from16 v2, p1

    goto/16 :goto_e

    :cond_19
    move-object v2, v5

    move/from16 p3, v8

    move/from16 v38, v9

    move v6, v13

    move v3, v14

    const/4 v7, 0x0

    const/4 v13, 0x1

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lnj2/k;->i()Z

    move-result v5

    if-nez v5, :cond_1b

    invoke-virtual {v1}, Lnj2/k;->h()Z

    move-result v5

    if-eqz v5, :cond_1a

    goto :goto_10

    :cond_1a
    move/from16 v8, v38

    goto :goto_11

    :cond_1b
    :goto_10
    const/high16 v8, 0x3f800000    # 1.0f

    :goto_11
    invoke-virtual {v1}, Lnj2/k;->g()I

    move-result v5

    if-ne v5, v13, :cond_1c

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lej2/c;->d:I

    const/4 v12, 0x0

    invoke-direct {v5, v7, v12, v3, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_12

    :cond_1c
    invoke-virtual {v1}, Lnj2/k;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    :goto_12
    const-wide/high16 v11, 0x4012000000000000L    # 4.5

    double-to-float v3, v11

    mul-float/2addr v3, v6

    mul-float/2addr v4, v6

    mul-float v6, v6, p3

    invoke-static {v2, v3, v4, v3, v6}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v0, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1d

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_13
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_1e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1f

    :cond_1e
    invoke-static {v4, v10, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnj2/k;->h()Z

    move-result v0

    if-nez v0, :cond_21

    invoke-virtual {v1}, Lnj2/k;->i()Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_15

    :cond_20
    move v11, v7

    :goto_14
    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_16

    :cond_21
    :goto_15
    move v11, v13

    goto :goto_14

    :goto_16
    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v2, "primaryButton"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lny0/v;->TextLarge:Lny0/v;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v10, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->j()J

    move-result-wide v14

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v2, v34, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_22

    move v2, v13

    goto :goto_17

    :cond_22
    move v2, v7

    :goto_17
    or-int/2addr v0, v2

    move/from16 v4, v34

    and-int/lit16 v2, v4, 0x380

    const/16 v3, 0x100

    if-ne v2, v3, :cond_23

    move v7, v13

    :cond_23
    or-int/2addr v0, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_24

    move-object/from16 v7, v36

    if-ne v2, v7, :cond_25

    :cond_24
    new-instance v0, Lnw0/e;

    const/4 v5, 0x5

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, v33

    invoke-direct/range {v0 .. v5}, Lnw0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_25
    check-cast v2, Lc93/a;

    const/16 v17, 0x36

    const/16 v18, 0x60

    move/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v29, v10

    move v10, v11

    move-wide v11, v14

    const/4 v14, 0x0

    move-object v15, v2

    move-object v7, v6

    move/from16 v3, v23

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_26
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_18
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_27

    new-instance v0, Lnx1/g;

    const/16 v5, 0x11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final u(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final v(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final w(Lnj2/k;Lc93/a;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lnj2/k;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnj2/k;->g()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-static {p3, v0}, Lpj2/t;->v(Lp1/c1;Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lnj2/k;->h()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lnj2/k;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lpj2/t;->t(Lnj2/k;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v9, p1

    check-cast v9, Lp1/q;

    const p1, -0x16f73b88

    invoke-virtual {v9, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    if-eq v1, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget v0, Lej2/b;->a:I

    invoke-static {v0}, Lv41/r0$d;->b(I)I

    move-result v0

    invoke-static {v0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v1

    and-int/lit8 p1, p1, 0xe

    or-int/lit16 v10, p1, 0x6000

    const/16 v11, 0x1ec

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_3
    move-object v0, p0

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance p1, Lau1/f;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {p1, v0, p2, v1, v2}, Lau1/f;-><init>(Landroidx/compose/ui/Modifier;IIB)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final z(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lpj2/t;->y(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
