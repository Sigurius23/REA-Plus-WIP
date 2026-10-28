.class public final Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent;",
        "Ll83/a0;",
        "onEvent",
        "EditProfileFullScreenModal",
        "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static final EditProfileFullScreenModal(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, -0x78c21215

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v5, v8, :cond_5

    move v5, v9

    goto :goto_4

    :cond_5
    move v5, v10

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v7, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1d

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;->getBackClickEvent()Lcom/whoop/profile/presentation/edit/EditProfileEvent;

    move-result-object v5

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_6

    const v5, 0x3fcc3673

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_6
    const v11, 0x3fcc3674

    invoke-virtual {v7, v11}, Lp1/q;->e0(I)V

    and-int/lit8 v11, v3, 0x70

    if-ne v11, v6, :cond_7

    move v11, v9

    goto :goto_5

    :cond_7
    move v11, v10

    :goto_5
    invoke-virtual {v7, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_8

    if-ne v12, v8, :cond_9

    :cond_8
    new-instance v12, Lbs1/v;

    const/16 v11, 0x16

    invoke-direct {v12, v11, v1, v5}, Lbs1/v;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v12, Lc93/a;

    invoke-static {v12, v10, v7, v10, v9}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_6
    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v12, v7, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v7, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v7, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-nez v13, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    :cond_b
    invoke-static {v12, v7, v12, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v7, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0x362b857b

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;->getState()Lsz0/q0;

    move-result-object v5

    invoke-virtual {v5}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v11

    instance-of v11, v11, Lsz0/p0$h;

    if-eqz v11, :cond_12

    const v11, -0x7d0e18b

    invoke-static {v7, v11, v5}, Lvl/b;->d(Lp1/q;ILsz0/q0;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    and-int/lit8 v11, v3, 0xe

    if-eq v11, v4, :cond_e

    and-int/lit8 v4, v3, 0x8

    if-eqz v4, :cond_d

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_8

    :cond_d
    move v4, v10

    goto :goto_9

    :cond_e
    :goto_8
    move v4, v9

    :goto_9
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v6, :cond_f

    move v3, v9

    goto :goto_a

    :cond_f
    move v3, v10

    :goto_a
    or-int/2addr v3, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_10

    if-ne v4, v8, :cond_11

    :cond_10
    new-instance v4, Lcom/whoop/profile/view/edit/m;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v3}, Lcom/whoop/profile/view/edit/m;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v16, v4

    check-cast v16, Lc93/a;

    new-instance v12, Lsz0/p0$h;

    const-wide/16 v14, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lsz0/q0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v3, Lsz0/p0$h;->h:I

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v4, 0x3

    or-int v17, v3, v4

    const/16 v18, 0x0

    const/16 v19, 0xffc

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v3, v9

    const/4 v9, 0x0

    move v4, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v13, v4

    move-object v4, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v3, v20

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v16

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    const/4 v10, 0x1

    goto/16 :goto_11

    :cond_12
    move v5, v3

    move v3, v10

    move v10, v9

    const v9, -0x7cafe88

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;->getState()Lsz0/q0;

    move-result-object v9

    and-int/lit8 v11, v5, 0xe

    if-eq v11, v4, :cond_14

    and-int/lit8 v12, v5, 0x8

    if-eqz v12, :cond_13

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_13

    goto :goto_b

    :cond_13
    move v12, v3

    goto :goto_c

    :cond_14
    :goto_b
    move v12, v10

    :goto_c
    and-int/lit8 v13, v5, 0x70

    if-ne v13, v6, :cond_15

    move v14, v10

    goto :goto_d

    :cond_15
    move v14, v3

    :goto_d
    or-int/2addr v12, v14

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_16

    if-ne v14, v8, :cond_17

    :cond_16
    new-instance v14, Lcom/whoop/profile/view/edit/m;

    const/4 v12, 0x1

    invoke-direct {v14, v0, v1, v12}, Lcom/whoop/profile/view/edit/m;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v14, Lc93/a;

    if-eq v11, v4, :cond_19

    and-int/lit8 v4, v5, 0x8

    if-eqz v4, :cond_18

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    goto :goto_e

    :cond_18
    move v4, v3

    goto :goto_f

    :cond_19
    :goto_e
    move v4, v10

    :goto_f
    if-ne v13, v6, :cond_1a

    move v5, v10

    goto :goto_10

    :cond_1a
    move v5, v3

    :goto_10
    or-int/2addr v4, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1b

    if-ne v5, v8, :cond_1c

    :cond_1b
    new-instance v5, Lcom/whoop/profile/view/edit/m;

    const/4 v4, 0x2

    invoke-direct {v5, v0, v1, v4}, Lcom/whoop/profile/view/edit/m;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v6, v5

    check-cast v6, Lc93/a;

    sget v8, Lsz0/q0;->k:I

    move-object v4, v9

    const/4 v9, 0x0

    move-object v5, v14

    invoke-static/range {v4 .. v9}, Lsz0/n0;->p(Lsz0/q0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1d
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_1e

    new-instance v4, Lce2/b;

    const/16 v5, 0xa

    invoke-direct {v4, v0, v1, v2, v5}, Lce2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final EditProfileFullScreenModal$lambda$0$0$0(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFullScreenModal$lambda$1$0$0$0(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;->getPrimaryClickEvent()Lcom/whoop/profile/presentation/edit/EditProfileEvent;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFullScreenModal$lambda$1$0$1$0(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;->getPrimaryClickEvent()Lcom/whoop/profile/presentation/edit/EditProfileEvent;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFullScreenModal$lambda$1$0$2$0(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;->getSecondaryClickEvent()Lcom/whoop/profile/presentation/edit/EditProfileEvent;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFullScreenModal$lambda$2(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;->EditProfileFullScreenModal(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;->EditProfileFullScreenModal$lambda$1$0$2$0(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;->EditProfileFullScreenModal$lambda$0$0$0(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;->EditProfileFullScreenModal$lambda$1$0$0$0(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;->EditProfileFullScreenModal$lambda$2(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;->EditProfileFullScreenModal$lambda$1$0$1$0(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
