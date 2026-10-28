.class public abstract Lrm1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a5\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\t2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0011\u00b2\u0006\u000e\u0010\r\u001a\u00020\t8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\t8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/DayOneTransitionViewState;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "C",
        "(Lcom/whoop/home/domain/models/DayOneTransitionViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lvn1/q;",
        "",
        "isDayOneAnimationCompleted",
        "m",
        "(Lvn1/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "shouldShowReplayButton",
        "shouldAnimateReplayButton",
        "Lvn1/g;",
        "notificationCenterViewState",
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
.method private static final A(Lvn1/q;Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;
    .locals 22

    invoke-virtual/range {p0 .. p0}, Lvn1/q;->a()Lo01/c;

    move-result-object v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static/range {p2 .. p2}, Lrm1/i;->s(Lp1/t2;)Lvn1/g;

    move-result-object v2

    instance-of v3, v2, Lvn1/g$c;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    check-cast v2, Lvn1/g$c;

    goto :goto_0

    :cond_1
    move-object v2, v4

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lvn1/g$c;->c()Lh01/w;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v2}, Lh01/w;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v4

    :cond_2
    const-string v2, ""

    if-nez v4, :cond_3

    move-object v7, v2

    goto :goto_1

    :cond_3
    move-object v7, v4

    :goto_1
    new-instance v3, Lcom/whoop/navigation/e;

    sget-object v4, Lcom/whoop/navigation/AppScreen$k1;->w:Lcom/whoop/navigation/AppScreen$k1;

    invoke-virtual {v0}, Lo01/c;->k()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    move-object v6, v2

    goto :goto_2

    :cond_4
    move-object v6, v5

    :goto_2
    invoke-virtual {v0}, Lo01/c;->f()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    move-object v8, v2

    goto :goto_3

    :cond_5
    move-object v8, v5

    :goto_3
    invoke-virtual {v0}, Lo01/c;->j()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lo01/c;->g()Ljava/lang/String;

    move-result-object v16

    new-instance v5, Lcom/whoop/navigation/CoachScreenModel;

    const/16 v20, 0x3938

    const/16 v21, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v14, 0x0

    const-string v15, "notifications_wrapper_chat_entry"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v5 .. v21}, Lcom/whoop/navigation/CoachScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v3

    move-object v9, v4

    move-object v10, v5

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method private static final B(Lvn1/q;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lrm1/i;->m(Lvn1/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final C(Lcom/whoop/home/domain/models/DayOneTransitionViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/home/domain/models/DayOneTransitionViewState;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x647a3210

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    if-eq v6, v7, :cond_6

    move v6, v8

    goto :goto_5

    :cond_6
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v5, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_d

    if-eqz v3, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_7

    new-instance v3, Lrm1/g;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lrm1/g;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, v3

    :cond_8
    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v2, v3, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_9

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v5, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v3, Lrm1/k;

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/DayOneTransitionViewState;->getOverviewGaugeState()Lz51/l;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/DayOneTransitionViewState;->getWelcomeCardState()Lmm1/k;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/DayOneTransitionViewState;->isDayOneAnimationCompleted()Z

    move-result v2

    xor-int/lit8 v15, v2, 0x1

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/DayOneTransitionViewState;->isDayOneAnimationCompleted()Z

    move-result v2

    if-eqz v2, :cond_c

    sget-object v2, Lrm1/c;->COMPLETE:Lrm1/c;

    :goto_7
    move-object/from16 v16, v2

    goto :goto_8

    :cond_c
    sget-object v2, Lrm1/c;->INITIAL:Lrm1/c;

    goto :goto_7

    :goto_8
    const/16 v17, 0xc

    const/16 v18, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v9, v3

    invoke-direct/range {v9 .. v18}, Lrm1/k;-><init>(Lz51/l;Lmm1/k;IJZLrm1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lz51/l;->t:I

    shl-int/lit8 v2, v2, 0x3

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int v6, v2, v0

    const/4 v7, 0x1

    const/4 v2, 0x0

    invoke-static/range {v2 .. v7}, Lrm1/m;->E(Landroidx/compose/ui/Modifier;Lrm1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/DayOneTransitionViewState;->getNotificationsCenterViewState()Lvn1/q;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/DayOneTransitionViewState;->isDayOneAnimationCompleted()Z

    move-result v3

    sget v6, Lvn1/q;->g:I

    or-int/2addr v6, v0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lrm1/i;->m(Lvn1/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    :goto_9
    move-object v3, v4

    goto :goto_a

    :cond_d
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lqk2/i;

    const/4 v5, 0x6

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final D(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lcom/whoop/home/domain/models/DayOneTransitionViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lrm1/i;->C(Lcom/whoop/home/domain/models/DayOneTransitionViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lvn1/q;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lrm1/i;->B(Lvn1/q;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrm1/i;->n(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrm1/i;->x(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lld1/c;Lp1/t2;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrm1/i;->w(Lkotlin/jvm/functions/Function1;Lld1/c;Lp1/t2;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrm1/i;->u(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lld1/c;Lvn1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrm1/i;->y(Lld1/c;Lvn1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lvn1/q;Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrm1/i;->A(Lvn1/q;Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrm1/i;->D(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lld1/c;Ljava/lang/String;Lvn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrm1/i;->v(Lld1/c;Ljava/lang/String;Lvn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/home/domain/models/DayOneTransitionViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrm1/i;->E(Lcom/whoop/home/domain/models/DayOneTransitionViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lld1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrm1/i;->t(Lld1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lld1/c;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrm1/i;->z(Lld1/c;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lvn1/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvn1/q;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x6fc6475e

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v3, v4, 0x30

    const/16 v5, 0x20

    if-nez v3, :cond_4

    move/from16 v3, p1

    invoke-virtual {v10, v3}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v5

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    goto :goto_4

    :cond_4
    move/from16 v3, p1

    :goto_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_6

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_5

    :cond_7
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v0, v8

    :goto_6
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x0

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_7

    :cond_8
    move v8, v13

    :goto_7
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_53

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v14, :cond_9

    new-instance v6, Lrm1/g;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lrm1/g;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v15, v6

    goto :goto_8

    :cond_a
    move-object v15, v7

    :goto_8
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v14, :cond_b

    invoke-virtual {v1}, Lvn1/q;->g()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_c

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Lp1/c1;

    invoke-virtual {v1}, Lvn1/q;->c()Lvn1/g;

    move-result-object v8

    if-nez v8, :cond_d

    sget-object v8, Lvn1/g$b;->b:Lvn1/g$b;

    :cond_d
    sget v9, Lvn1/g;->a:I

    const v12, 0x51c1188b

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    sget-object v12, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v12, v10, v11}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v12

    move/from16 p2, v11

    const-string v11, "safe-design-view-model-injection-android"

    invoke-interface {v12, v11}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v11

    const-class v12, Lsn1/b;

    const/16 v22, 0x0

    const/4 v2, 0x0

    if-nez v11, :cond_26

    const v11, -0x2a32dbfc

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    invoke-static {v10}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_e

    const v11, -0x2a322beb

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object v5, v2

    move-object/from16 v11, v22

    const/4 v2, 0x0

    goto/16 :goto_f

    :cond_e
    const v11, -0x2a322bea

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    const-string v13, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v11

    check-cast v16, Landroid/app/Application;

    and-int/lit8 v11, v9, 0x70

    xor-int/lit8 v11, v11, 0x30

    if-le v11, v5, :cond_f

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_10

    goto :goto_9

    :cond_f
    const/4 v11, 0x0

    :goto_9
    and-int/lit8 v13, v9, 0x30

    if-ne v13, v5, :cond_11

    :cond_10
    const/4 v13, 0x1

    goto :goto_a

    :cond_11
    const/4 v13, 0x0

    :goto_a
    and-int/lit8 v18, v9, 0xe

    xor-int/lit8 v11, v18, 0x6

    const/4 v5, 0x4

    if-le v11, v5, :cond_12

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_13

    :cond_12
    and-int/lit8 v11, v9, 0x6

    if-ne v11, v5, :cond_14

    :cond_13
    const/4 v5, 0x1

    goto :goto_b

    :cond_14
    const/4 v5, 0x0

    :goto_b
    or-int/2addr v5, v13

    and-int/lit16 v11, v9, 0x1c00

    xor-int/lit16 v11, v11, 0xc00

    const/16 v13, 0x800

    if-le v11, v13, :cond_15

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_16

    :cond_15
    and-int/lit16 v11, v9, 0xc00

    if-ne v11, v13, :cond_17

    :cond_16
    const/4 v11, 0x1

    goto :goto_c

    :cond_17
    const/4 v11, 0x0

    :goto_c
    or-int/2addr v5, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v5, :cond_19

    if-ne v11, v14, :cond_18

    goto :goto_d

    :cond_18
    move-object v5, v2

    const/4 v2, 0x0

    goto :goto_e

    :cond_19
    :goto_d
    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v5, Lld1/b;

    invoke-direct {v5, v8}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v19, v2

    move-object/from16 v20, v5

    const/16 v21, 0x0

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v11

    move-object/from16 v5, v19

    move-object/from16 v2, v21

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v11, Lld1/c;

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_f
    if-nez v11, :cond_25

    const v11, -0x2a2a887e

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    and-int/lit8 v11, v9, 0x70

    xor-int/lit8 v11, v11, 0x30

    const/16 v12, 0x20

    if-le v11, v12, :cond_1a

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :cond_1a
    and-int/lit8 v2, v9, 0x30

    if-ne v2, v12, :cond_1c

    :cond_1b
    const/4 v2, 0x1

    goto :goto_10

    :cond_1c
    const/4 v2, 0x0

    :goto_10
    and-int/lit8 v11, v9, 0xe

    xor-int/lit8 v11, v11, 0x6

    const/4 v12, 0x4

    if-le v11, v12, :cond_1d

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1e

    :cond_1d
    and-int/lit8 v11, v9, 0x6

    if-ne v11, v12, :cond_1f

    :cond_1e
    const/4 v11, 0x1

    goto :goto_11

    :cond_1f
    const/4 v11, 0x0

    :goto_11
    or-int/2addr v2, v11

    and-int/lit16 v11, v9, 0x1c00

    xor-int/lit16 v11, v11, 0xc00

    const/16 v13, 0x800

    if-le v11, v13, :cond_20

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_21

    :cond_20
    and-int/lit16 v5, v9, 0xc00

    if-ne v5, v13, :cond_22

    :cond_21
    const/4 v5, 0x1

    goto :goto_12

    :cond_22
    const/4 v5, 0x0

    :goto_12
    or-int/2addr v2, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_23

    if-ne v5, v14, :cond_24

    :cond_23
    new-instance v5, Lld1/b;

    invoke-direct {v5, v8}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object v11, v5

    check-cast v11, Lld1/b;

    const/4 v13, 0x0

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_25
    const/4 v13, 0x0

    const v2, -0x1a22aa39

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object/from16 v17, v8

    :goto_14
    move-object v2, v11

    goto/16 :goto_1b

    :cond_26
    move-object v5, v2

    const/4 v2, 0x0

    const v11, -0x2a28ba09

    invoke-static {v10, v11, v13, v10}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v16

    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    instance-of v13, v11, Landroid/app/Application;

    if-eqz v13, :cond_27

    check-cast v11, Landroid/app/Application;

    move-object/from16 v18, v11

    goto :goto_15

    :cond_27
    move-object/from16 v18, v22

    :goto_15
    and-int/lit8 v11, v9, 0x70

    xor-int/lit8 v11, v11, 0x30

    const/16 v13, 0x20

    if-le v11, v13, :cond_28

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_29

    :cond_28
    and-int/lit8 v11, v9, 0x30

    if-ne v11, v13, :cond_2a

    :cond_29
    const/4 v11, 0x1

    goto :goto_16

    :cond_2a
    const/4 v11, 0x0

    :goto_16
    and-int/lit8 v13, v9, 0xe

    xor-int/lit8 v13, v13, 0x6

    const/4 v2, 0x4

    if-le v13, v2, :cond_2b

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2c

    :cond_2b
    and-int/lit8 v13, v9, 0x6

    if-ne v13, v2, :cond_2d

    :cond_2c
    const/4 v2, 0x1

    goto :goto_17

    :cond_2d
    const/4 v2, 0x0

    :goto_17
    or-int/2addr v2, v11

    and-int/lit16 v11, v9, 0x1c00

    xor-int/lit16 v11, v11, 0xc00

    const/16 v13, 0x800

    if-le v11, v13, :cond_2e

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2f

    :cond_2e
    and-int/lit16 v11, v9, 0xc00

    if-ne v11, v13, :cond_30

    :cond_2f
    const/4 v11, 0x1

    goto :goto_18

    :cond_30
    const/4 v11, 0x0

    :goto_18
    or-int/2addr v2, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v2, :cond_32

    if-ne v11, v14, :cond_31

    goto :goto_19

    :cond_31
    move-object/from16 v17, v8

    goto :goto_1a

    :cond_32
    :goto_19
    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    move-object/from16 v20, v5

    move-object/from16 v17, v8

    const/16 v21, 0x0

    invoke-static/range {v16 .. v21}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v11

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    check-cast v11, Lld1/c;

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto/16 :goto_14

    :goto_1b
    instance-of v5, v2, Lsn1/b;

    if-eqz v5, :cond_33

    move-object v5, v2

    check-cast v5, Lsn1/b;

    goto :goto_1c

    :cond_33
    move-object/from16 v5, v22

    :goto_1c
    if-eqz v5, :cond_34

    invoke-virtual {v5}, Lsn1/b;->getViewState()Lec3/f2;

    move-result-object v5

    goto :goto_1d

    :cond_34
    move-object/from16 v5, v22

    :goto_1d
    if-nez v5, :cond_35

    const v5, 0x52f735b3

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    move-object/from16 v5, v22

    goto :goto_1e

    :cond_35
    const/4 v12, 0x0

    const v8, -0x68adb3f2

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-static {v5, v10, v12}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v5

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_1e
    if-nez v5, :cond_36

    const v5, -0x68adaca6

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v5

    move v8, v9

    shl-int/lit8 v9, v8, 0x3

    move v11, v8

    move-object v8, v10

    const/4 v10, 0x2

    move-object v13, v7

    const/4 v7, 0x0

    move/from16 v16, v11

    move-object v11, v6

    move-object/from16 v6, v17

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    :goto_1f
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_36
    move-object v11, v6

    move-object v13, v7

    move/from16 v16, v9

    move-object v8, v10

    const v6, -0x68adbd3d

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    goto :goto_1f

    :goto_20
    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->M:Lb2/k;

    move/from16 v9, p2

    invoke-static {v6, v7, v8, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-eqz v3, :cond_37

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_21

    :cond_37
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_21
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v8, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_38

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_39

    :cond_38
    invoke-static {v7, v8, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_39
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lvn1/q;->c()Lvn1/g;

    move-result-object v3

    if-nez v3, :cond_3a

    const v3, -0x74be5e7d

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object/from16 v19, v5

    move-object/from16 p2, v11

    move v4, v12

    move-object/from16 v18, v13

    move-object v3, v14

    move-object/from16 v20, v15

    goto/16 :goto_25

    :cond_3a
    const/4 v12, 0x0

    const v3, -0x74be5e7c

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-static {v5}, Lrm1/i;->s(Lp1/t2;)Lvn1/g;

    move-result-object v6

    invoke-virtual {v1}, Lvn1/q;->a()Lo01/c;

    move-result-object v3

    if-eqz v3, :cond_3b

    const/4 v7, 0x1

    goto :goto_22

    :cond_3b
    move v7, v12

    :goto_22
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_3c

    if-ne v9, v14, :cond_3d

    :cond_3c
    new-instance v9, Lh31/r;

    const/4 v3, 0x3

    invoke-direct {v9, v2, v3}, Lh31/r;-><init>(Lld1/c;I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3d
    check-cast v9, Lc93/a;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_3e

    new-instance v3, Lam2/j;

    const/16 v10, 0x9

    invoke-direct {v3, v10, v11, v13}, Lam2/j;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3e
    move-object v10, v3

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v3, :cond_3f

    if-ne v12, v14, :cond_40

    :cond_3f
    new-instance v12, Lr12/a;

    const/4 v3, 0x4

    invoke-direct {v12, v2, v3}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_40
    check-cast v12, Lc93/m;

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v3, v3, v17

    move/from16 p2, v3

    and-int/lit16 v3, v0, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_41

    const/4 v3, 0x1

    goto :goto_23

    :cond_41
    const/4 v3, 0x0

    :goto_23
    or-int v3, p2, v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_42

    if-ne v4, v14, :cond_43

    :cond_42
    new-instance v4, Lis0/u0;

    const/4 v3, 0x1

    invoke-direct {v4, v15, v2, v5, v3}, Lis0/u0;-><init>(Lkotlin/jvm/functions/Function1;Lld1/c;Lp1/c1;I)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_43
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_44

    new-instance v3, Lo0/i;

    move-object/from16 p2, v4

    const/16 v4, 0x13

    invoke-direct {v3, v4, v11}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_24

    :cond_44
    move-object/from16 p2, v4

    :goto_24
    check-cast v3, Lc93/a;

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    move-object/from16 v17, v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v4, :cond_45

    if-ne v3, v14, :cond_46

    :cond_45
    new-instance v3, Lb70/b;

    const/4 v4, 0x4

    invoke-direct {v3, v2, v4}, Lb70/b;-><init>(Lld1/c;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_46
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/high16 v4, 0x6030000

    shl-int/lit8 v16, v16, 0x3

    or-int v4, v16, v4

    move-object/from16 v16, v3

    shl-int/lit8 v3, v0, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v3, v4

    move-object v4, v13

    move-object/from16 v13, v17

    const/16 v17, 0x1

    move-object/from16 v18, v5

    const/4 v5, 0x0

    move-object/from16 v19, v12

    move-object/from16 v12, p2

    move-object/from16 p2, v11

    move-object/from16 v11, v19

    move-object/from16 v19, v16

    move/from16 v16, v3

    move-object v3, v14

    move-object/from16 v14, v19

    move-object/from16 v20, v15

    move-object/from16 v19, v18

    move-object/from16 v18, v4

    move-object v15, v8

    const/4 v4, 0x0

    move/from16 v8, p1

    invoke-static/range {v5 .. v17}, Lrm1/n;->h(Landroidx/compose/ui/Modifier;Lvn1/g;ZZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v15

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    :goto_25
    invoke-static/range {v19 .. v19}, Lrm1/i;->s(Lp1/t2;)Lvn1/g;

    move-result-object v5

    instance-of v6, v5, Lvn1/g$c;

    if-eqz v6, :cond_47

    check-cast v5, Lvn1/g$c;

    goto :goto_26

    :cond_47
    move-object/from16 v5, v22

    :goto_26
    if-eqz v5, :cond_48

    invoke-virtual {v5}, Lvn1/g$c;->c()Lh01/w;

    move-result-object v5

    if-eqz v5, :cond_48

    invoke-interface {v5}, Lh01/w;->getAppNotificationType()Ljava/lang/String;

    move-result-object v5

    const-string v6, "AI_COACH"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    move/from16 v32, v13

    goto :goto_27

    :cond_48
    move/from16 v32, v4

    :goto_27
    invoke-virtual {v1}, Lvn1/q;->a()Lo01/c;

    move-result-object v23

    if-eqz v23, :cond_49

    const/16 v34, 0x2ff

    const/16 v35, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    invoke-static/range {v23 .. v35}, Lo01/c;->b(Lo01/c;Ljava/lang/String;Ljava/lang/String;Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;ILjava/lang/Object;)Lo01/c;

    move-result-object v5

    goto :goto_28

    :cond_49
    move-object/from16 v5, v22

    :goto_28
    invoke-static/range {p2 .. p2}, Lrm1/i;->o(Lp1/c1;)Z

    move-result v6

    invoke-static/range {v18 .. v18}, Lrm1/i;->q(Lp1/c1;)Z

    move-result v7

    invoke-virtual {v1}, Lvn1/q;->f()Lk31/d;

    move-result-object v9

    if-nez v9, :cond_4a

    const v2, -0x748fb912

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_2a

    :cond_4a
    const v10, -0x66db588d

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lvn1/q;->a()Lo01/c;

    move-result-object v10

    if-nez v10, :cond_4b

    const/4 v12, 0x1

    goto :goto_29

    :cond_4b
    move v12, v4

    :goto_29
    invoke-static/range {v18 .. v18}, Lrm1/i;->q(Lp1/c1;)Z

    move-result v13

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_4c

    if-ne v11, v3, :cond_4d

    :cond_4c
    new-instance v11, Lno0/j0;

    const/16 v10, 0x1b

    move-object/from16 v14, p2

    move-object/from16 v15, v18

    invoke-direct {v11, v2, v14, v15, v10}, Lno0/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4d
    move-object v14, v11

    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v16}, Lk31/d;->d(Lk31/d;Lcom/whoop/design/util/TextResource;Lgz0/m0;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lk31/d;

    move-result-object v22

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    :goto_2a
    and-int/lit8 v2, v0, 0xe

    const/4 v12, 0x4

    if-eq v2, v12, :cond_4f

    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_4e

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4e

    goto :goto_2c

    :cond_4e
    move v12, v4

    :goto_2b
    move-object/from16 v2, v19

    goto :goto_2d

    :cond_4f
    :goto_2c
    const/4 v12, 0x1

    goto :goto_2b

    :goto_2d
    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v9, v12

    and-int/lit16 v0, v0, 0x380

    const/16 v10, 0x100

    if-ne v0, v10, :cond_50

    const/4 v12, 0x1

    goto :goto_2e

    :cond_50
    move v12, v4

    :goto_2e
    or-int v0, v9, v12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_52

    if-ne v4, v3, :cond_51

    goto :goto_2f

    :cond_51
    move-object/from16 v3, v20

    goto :goto_30

    :cond_52
    :goto_2f
    new-instance v4, Lre1/k;

    const/4 v0, 0x1

    move-object/from16 v3, v20

    invoke-direct {v4, v1, v3, v2, v0}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_30
    move-object v9, v4

    check-cast v9, Lc93/a;

    sget v0, Lo01/c;->k:I

    sget v2, Lk31/d;->f:I

    shl-int/lit8 v2, v2, 0x9

    or-int v11, v0, v2

    move-object v10, v8

    move-object/from16 v8, v22

    invoke-static/range {v5 .. v11}, Lum1/b;->c(Lo01/c;ZZLk31/d;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v10

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_31

    :cond_53
    move-object v8, v10

    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v7

    :goto_31
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_54

    new-instance v0, Lbg0/h;

    const/16 v6, 0x1c

    move/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_54
    return-void
.end method

.method private static final n(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/c1;)Z
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

.method private static final p(Lp1/c1;Z)V
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

.method private static final q(Lp1/c1;)Z
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

.method private static final r(Lp1/c1;Z)V
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

.method private static final s(Lp1/t2;)Lvn1/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lvn1/g;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvn1/g;

    return-object p0
.end method

.method private static final t(Lld1/c;)Ll83/a0;
    .locals 1

    sget-object v0, Lsn1/a$g;->a:Lsn1/a$g;

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lrm1/i;->p(Lp1/c1;Z)V

    invoke-static {p1, p2}, Lrm1/i;->r(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lld1/c;Ljava/lang/String;Lvn1/a;)Ll83/a0;
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissCardAction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lsn1/a$f;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lsn1/a$f;-><init>(Ljava/lang/String;Lvn1/a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Lld1/c;Lp1/t2;Ljava/lang/Object;)Ll83/a0;
    .locals 3

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Lkd1/l;

    if-eqz v0, :cond_4

    invoke-static {p2}, Lrm1/i;->s(Lp1/t2;)Lvn1/g;

    move-result-object v0

    instance-of v1, v0, Lvn1/g$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lvn1/g$c;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lvn1/g$c;->c()Lh01/w;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lsn1/a$d;

    invoke-interface {v0}, Lh01/w;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lsn1/a$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lld1/c;->g(Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Lkd1/l;->TURN_OFF_ALARM:Lkd1/l;

    if-ne p3, p1, :cond_3

    invoke-static {p2}, Lrm1/i;->s(Lp1/t2;)Lvn1/g;

    move-result-object p1

    instance-of p2, p1, Lvn1/g$c;

    if-eqz p2, :cond_2

    move-object v2, p1

    check-cast v2, Lvn1/g$c;

    :cond_2
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lvn1/g$c;->c()Lh01/w;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance p2, Lum1/e$a;

    check-cast p3, Lkd1/l;

    invoke-interface {p1}, Lh01/w;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lum1/e$a;-><init>(Lkd1/l;Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    instance-of p2, p3, Lh01/r;

    if-eqz p2, :cond_5

    new-instance p0, Lsn1/a$a;

    check-cast p3, Lh01/r;

    invoke-direct {p0, p3}, Lsn1/a$a;-><init>(Lh01/r;)V

    invoke-virtual {p1, p0}, Lld1/c;->g(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lrm1/i;->p(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lld1/c;Lvn1/i;)Ll83/a0;
    .locals 1

    const-string v0, "notificationCardDismissAnimation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsn1/a$b;

    invoke-direct {v0, p1}, Lsn1/a$b;-><init>(Lvn1/i;)V

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lld1/c;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk31/a;->REPLAY:Lk31/a;

    if-ne p3, v0, :cond_0

    const/4 p3, 0x0

    invoke-static {p1, p3}, Lrm1/i;->p(Lp1/c1;Z)V

    const/4 p1, 0x1

    invoke-static {p2, p1}, Lrm1/i;->r(Lp1/c1;Z)V

    new-instance p2, Lsn1/a$h;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p1, p3}, Lsn1/a$h;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p2}, Lld1/c;->g(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
