.class public abstract Lun1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u009f\u0001\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00072\u001a\u0008\u0002\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\t2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00072\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0008\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0007H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001c\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00178\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lvn1/g$c;",
        "viewState",
        "",
        "hasAiCoach",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onShimmerFinished",
        "Lkotlin/Function1;",
        "onAllCardsDismissed",
        "Lkotlin/Function2;",
        "",
        "Lvn1/a;",
        "onReadCard",
        "",
        "onViewEvent",
        "hideReplayButton",
        "Lvn1/i;",
        "changeNotificationCardDismissAnimation",
        "n",
        "(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "shouldPlayAnimation",
        "Lun1/h;",
        "transitionState",
        "",
        "rotation",
        "replayButtonOffsetPercent",
        "Ly3/f;",
        "counterPadding",
        "home-notifications-center_release"
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
.method private static final A(Lvn1/g$c;Lkotlin/jvm/functions/Function1;Lc93/m;Lq2/a;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lvn1/g$c;->c()Lh01/w;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lvn1/i;->LEFT_SWIPE:Lvn1/i;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lh01/w;->getId()Ljava/lang/String;

    move-result-object p0

    sget-object p1, Lvn1/a;->TAP:Lvn1/a;

    invoke-interface {p2, p0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-interface {p3, p0}, Lq2/a;->a(I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Ljava/lang/String;Lvn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lun1/g;->n(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Lvn1/i;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lp1/c1;)Z
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

.method private static final H(Lp1/c1;Z)V
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

.method public static final synthetic I(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lun1/g;->G(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic J(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lun1/g;->H(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lun1/g;->D(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lun1/g;->y(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lun1/g;->p(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lvn1/g$c;Lkotlin/jvm/functions/Function1;Lc93/m;Lq2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lun1/g;->A(Lvn1/g$c;Lkotlin/jvm/functions/Function1;Lc93/m;Lq2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lun1/g;->u(Lp1/c1;Lp1/c1;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lun1/g;->C(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Lvn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lun1/g;->B(Ljava/lang/String;Lvn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lun1/g;->s(Lp1/c1;Lp1/c1;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Ll83/a0;
    .locals 1

    invoke-static {}, Lun1/g;->E()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j(Lvn1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lun1/g;->F(Lvn1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lun1/g;->x(Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l()Ll83/a0;
    .locals 1

    invoke-static {}, Lun1/g;->o()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m(FLp1/t2;Ly3/c;)Ly3/j;
    .locals 0

    invoke-static {p0, p1, p2}, Lun1/g;->z(FLp1/t2;Ly3/c;)Ly3/j;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvn1/g$c;",
            "Z",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v9, p9

    move/from16 v10, p10

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v2, 0x4fe61b3d

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move v2, v9

    :goto_1
    and-int/lit8 v5, v10, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v9, 0x30

    if-nez v6, :cond_2

    move/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :goto_3
    and-int/lit8 v7, v10, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v9, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v2, v11

    :goto_5
    and-int/lit8 v11, v10, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v9, 0xc00

    if-nez v13, :cond_8

    move-object/from16 v13, p3

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v2, v14

    :goto_7
    and-int/lit8 v14, v10, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v2, v2, 0x6000

    :cond_b
    move-object/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v9, 0x6000

    if-nez v15, :cond_b

    move-object/from16 v15, p4

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v2, v2, v16

    :goto_9
    and-int/lit8 v16, v10, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_e

    or-int v2, v2, v17

    move-object/from16 v4, p5

    goto :goto_b

    :cond_e
    and-int v17, v9, v17

    move-object/from16 v4, p5

    if-nez v17, :cond_10

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_f

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v18, 0x10000

    :goto_a
    or-int v2, v2, v18

    :cond_10
    :goto_b
    and-int/lit8 v18, v10, 0x40

    const/high16 v20, 0x180000

    if-eqz v18, :cond_11

    or-int v2, v2, v20

    move-object/from16 v12, p6

    goto :goto_d

    :cond_11
    and-int v20, v9, v20

    move-object/from16 v12, p6

    if-nez v20, :cond_13

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_12

    const/high16 v21, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v21, 0x80000

    :goto_c
    or-int v2, v2, v21

    :cond_13
    :goto_d
    and-int/lit16 v3, v10, 0x80

    const/high16 v22, 0xc00000

    if-eqz v3, :cond_14

    or-int v2, v2, v22

    move-object/from16 v12, p7

    goto :goto_f

    :cond_14
    and-int v22, v9, v22

    move-object/from16 v12, p7

    if-nez v22, :cond_16

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_15

    const/high16 v23, 0x800000

    goto :goto_e

    :cond_15
    const/high16 v23, 0x400000

    :goto_e
    or-int v2, v2, v23

    :cond_16
    :goto_f
    const v23, 0x492493

    move/from16 v24, v3

    and-int v3, v2, v23

    const v4, 0x492492

    if-eq v3, v4, :cond_17

    const/4 v3, 0x1

    goto :goto_10

    :cond_17
    const/4 v3, 0x0

    :goto_10
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v0, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3d

    if-eqz v5, :cond_18

    const/4 v6, 0x0

    :cond_18
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_1a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_19

    new-instance v4, Ls52/d;

    const/16 v5, 0x1d

    invoke-direct {v4, v5}, Ls52/d;-><init>(I)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v4, Lc93/a;

    move-object v8, v4

    :cond_1a
    if-eqz v11, :cond_1c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_1b

    new-instance v4, Lto1/h;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Lto1/h;-><init>(I)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_11

    :cond_1c
    move-object/from16 v4, p3

    :goto_11
    if-eqz v14, :cond_1e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_1d

    new-instance v5, Lun0/a;

    const/4 v7, 0x3

    invoke-direct {v5, v7}, Lun0/a;-><init>(I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v5, Lc93/m;

    goto :goto_12

    :cond_1e
    move-object v5, v15

    :goto_12
    if-eqz v16, :cond_20

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_1f

    new-instance v7, Lto1/h;

    const/16 v11, 0x14

    invoke-direct {v7, v11}, Lto1/h;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_13

    :cond_20
    move-object/from16 v7, p5

    :goto_13
    if-eqz v18, :cond_22

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_21

    new-instance v11, Lun1/f;

    const/4 v14, 0x0

    invoke-direct {v11, v14}, Lun1/f;-><init>(I)V

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v11, Lc93/a;

    goto :goto_14

    :cond_22
    move-object/from16 v11, p6

    :goto_14
    if-eqz v24, :cond_24

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v3, :cond_23

    new-instance v14, Lto1/h;

    const/16 v15, 0x15

    invoke-direct {v14, v15}, Lto1/h;-><init>(I)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v14, Lkotlin/jvm/functions/Function1;

    move-object/from16 v23, v14

    goto :goto_15

    :cond_24
    move-object/from16 v23, p7

    :goto_15
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v3, :cond_25

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v14, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v3, :cond_26

    sget-object v15, Lun1/h;->NORMAL:Lun1/h;

    invoke-static {v15}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v15

    invoke-virtual {v0, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v15, Lp1/c1;

    sget-object v12, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {v0, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lq2/a;

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/high16 v24, 0x380000

    and-int v13, v2, v24

    const/high16 v1, 0x100000

    if-ne v13, v1, :cond_27

    const/4 v1, 0x1

    goto :goto_16

    :cond_27
    const/4 v1, 0x0

    :goto_16
    or-int v1, v18, v1

    and-int/lit16 v13, v2, 0x1c00

    move/from16 p1, v1

    const/16 v1, 0x800

    if-ne v13, v1, :cond_28

    const/4 v1, 0x1

    goto :goto_17

    :cond_28
    const/4 v1, 0x0

    :goto_17
    or-int v1, p1, v1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v1, :cond_2a

    if-ne v13, v3, :cond_29

    goto :goto_18

    :cond_29
    move-object/from16 v1, p0

    move-object/from16 v27, v11

    move-object v11, v14

    goto :goto_19

    :cond_2a
    :goto_18
    new-instance v1, Lun1/g$a;

    const/4 v13, 0x0

    move-object/from16 p2, p0

    move-object/from16 p1, v1

    move-object/from16 p4, v4

    move-object/from16 p3, v11

    move-object/from16 p6, v13

    move-object/from16 p5, v14

    invoke-direct/range {p1 .. p6}, Lun1/g$a;-><init>(Lvn1/g$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;)V

    move-object/from16 v13, p1

    move-object/from16 v1, p2

    move-object/from16 v27, p3

    move-object/from16 v11, p5

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    check-cast v13, Lc93/m;

    invoke-static {v0, v13, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15}, Lun1/g;->q(Lp1/c1;)Lun1/h;

    move-result-object v13

    sget-object v14, Lun1/h;->NORMAL:Lun1/h;

    const/16 v18, 0x0

    if-ne v13, v14, :cond_2b

    move/from16 v13, v18

    :goto_1a
    move/from16 v21, v2

    goto :goto_1b

    :cond_2b
    const/high16 v13, -0x3d4c0000    # -90.0f

    goto :goto_1a

    :goto_1b
    const/16 v2, 0x1f4

    move-object/from16 v20, v5

    const/4 v5, 0x0

    move/from16 v28, v6

    const/4 v6, 0x6

    move-object/from16 v26, v7

    const/4 v7, 0x0

    invoke-static {v2, v7, v5, v6}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v29

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_2c

    new-instance v7, Lh01/n;

    const/4 v2, 0x3

    invoke-direct {v7, v2, v15, v11}, Lh01/n;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x6c30

    const/16 v30, 0x4

    const-string v31, "itemRotationAnimation"

    move-object/from16 p5, v0

    move/from16 p6, v2

    move-object/from16 p4, v7

    move/from16 p1, v13

    move-object/from16 p2, v29

    move/from16 p7, v30

    move-object/from16 p3, v31

    invoke-static/range {p1 .. p7}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v0

    move-object/from16 v2, p5

    invoke-static {v15}, Lun1/g;->q(Lp1/c1;)Lun1/h;

    move-result-object v7

    if-eq v7, v14, :cond_2e

    if-nez v28, :cond_2d

    goto :goto_1c

    :cond_2d
    const/high16 v18, 0x3f800000    # 1.0f

    :cond_2e
    :goto_1c
    const/16 v7, 0x1f4

    const/4 v13, 0x0

    invoke-static {v7, v13, v5, v6}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v30

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_2f

    new-instance v7, Lh01/n;

    const/4 v13, 0x4

    invoke-direct {v7, v13, v11, v15}, Lh01/n;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v13, 0x6c30

    const/16 v31, 0x4

    const-string v32, "replayButtonOffsetAnimation"

    move-object/from16 p5, v2

    move-object/from16 p4, v7

    move/from16 p6, v13

    move/from16 p1, v18

    move-object/from16 p2, v30

    move/from16 p7, v31

    move-object/from16 p3, v32

    invoke-static/range {p1 .. p7}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v2

    move-object/from16 v7, p5

    sget-object v13, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v7, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly3/c;

    const/16 v5, 0x23

    int-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-interface {v13, v5}, Ly3/c;->q0(F)F

    move-result v5

    invoke-virtual {v1}, Lvn1/g$c;->b()I

    move-result v6

    const/16 v13, 0x8

    if-lez v6, :cond_30

    move-object/from16 v30, v0

    const/4 v6, 0x1

    int-to-float v0, v6

    int-to-float v13, v13

    mul-float/2addr v0, v13

    goto :goto_1d

    :cond_30
    move-object/from16 v30, v0

    const/4 v0, 0x0

    int-to-float v6, v0

    int-to-float v0, v13

    mul-float/2addr v0, v6

    :goto_1d
    const/16 v6, 0x180

    const/16 v13, 0xa

    const/16 v19, 0x0

    const-string v31, "counterPaddingAnimation"

    move/from16 p1, v0

    move/from16 p5, v6

    move-object/from16 p4, v7

    move/from16 p6, v13

    move-object/from16 p2, v19

    move-object/from16 p3, v31

    invoke-static/range {p1 .. p6}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v0

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object/from16 p1, v0

    sget-object v0, Lb2/e;->w:Lb2/m;

    move-object/from16 v29, v8

    const/4 v8, 0x0

    invoke-static {v0, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    move-object/from16 p5, v11

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-eqz v11, :cond_31

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1e

    :cond_31
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1e
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v7, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-nez v9, :cond_32

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_33

    :cond_32
    invoke-static {v8, v7, v8, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_33
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lvn1/g$c;->b()I

    move-result v0

    if-nez v0, :cond_35

    invoke-static/range {p5 .. p5}, Lun1/g;->G(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_35

    const v0, 0x7ba60db5

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-static {v15}, Lun1/g;->q(Lp1/c1;)Lun1/h;

    move-result-object v0

    if-ne v0, v14, :cond_34

    const/4 v11, 0x1

    :goto_1f
    const/16 v0, 0x1f4

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v13, 0x0

    goto :goto_20

    :cond_34
    const/4 v11, 0x0

    goto :goto_1f

    :goto_20
    invoke-static {v0, v13, v8, v9}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    const/4 v8, 0x2

    invoke-static {v0, v8}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v0

    new-instance v8, Lbp0/h;

    const/4 v9, 0x4

    invoke-direct {v8, v9, v4, v15}, Lbp0/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v9, 0x6da177b6

    invoke-static {v9, v7, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v18, 0x30c00

    const/16 v19, 0x16

    move-object v9, v12

    const/4 v12, 0x0

    move/from16 v25, v13

    const/4 v13, 0x0

    move-object v10, v15

    const/4 v15, 0x0

    move-object/from16 v17, v7

    move-object/from16 v16, v8

    move-object v8, v14

    move-object/from16 v7, p5

    move-object v14, v0

    move/from16 v0, v25

    invoke-static/range {v11 .. v19}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v17

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_21

    :cond_35
    move-object v11, v7

    move-object v9, v12

    move-object v8, v14

    move-object v10, v15

    const/4 v0, 0x0

    move-object/from16 v7, p5

    const v12, 0x7badb53f

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v17, v11

    :goto_21
    invoke-virtual {v1}, Lvn1/g$c;->c()Lh01/w;

    move-result-object v11

    invoke-virtual {v1}, Lvn1/g$c;->f()Lh01/w;

    move-result-object v12

    invoke-virtual {v1}, Lvn1/g$c;->b()I

    move-result v13

    invoke-virtual {v1}, Lvn1/g$c;->g()Lvn1/i;

    move-result-object v16

    shr-int/lit8 v14, v21, 0x6

    and-int/lit16 v14, v14, 0x1c00

    const v15, 0xe000

    and-int v15, v21, v15

    or-int/2addr v14, v15

    shr-int/lit8 v18, v21, 0x3

    and-int v18, v18, v24

    or-int v19, v14, v18

    move v14, v15

    move-object/from16 v15, v20

    const/16 v20, 0x0

    move v0, v14

    move-object/from16 v18, v17

    move-object/from16 v17, v23

    move-object/from16 v14, v26

    invoke-static/range {v11 .. v20}, Lvn1/p;->n(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v31, v14

    move-object/from16 v11, v18

    sget-object v12, Lb2/e;->y:Lb2/m;

    sget-object v13, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v13, v6, v12}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static/range {p1 .. p1}, Lun1/g;->w(Lp1/t2;)F

    move-result v12

    const/4 v13, 0x0

    const/16 v14, 0xb

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 p2, v6

    move/from16 p5, v12

    move/from16 p6, v13

    move/from16 p7, v14

    move/from16 p3, v16

    move/from16 p4, v18

    invoke-static/range {p2 .. p7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11, v5}, Lp1/q;->d(F)Z

    move-result v12

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_36

    if-ne v13, v3, :cond_37

    :cond_36
    new-instance v13, Lun1/e;

    invoke-direct {v13, v5, v2}, Lun1/e;-><init>(FLp1/t2;)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_37
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/a;->l(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lvn1/g$c;->b()I

    move-result v12

    invoke-static {v10}, Lun1/g;->q(Lp1/c1;)Lun1/h;

    move-result-object v5

    if-ne v5, v8, :cond_38

    const/4 v13, 0x1

    :goto_22
    move-object/from16 v20, v15

    goto :goto_23

    :cond_38
    const/4 v13, 0x0

    goto :goto_22

    :goto_23
    invoke-virtual {v1}, Lvn1/g$c;->i()Z

    move-result v15

    invoke-static {v7}, Lun1/g;->G(Lp1/c1;)Z

    move-result v16

    invoke-static/range {v30 .. v30}, Lun1/g;->t(Lp1/t2;)F

    move-result v14

    move-object/from16 v5, v17

    invoke-virtual {v1}, Lvn1/g$c;->h()Z

    move-result v17

    invoke-virtual {v1}, Lvn1/g$c;->d()Z

    move-result v18

    invoke-static {v10}, Lun1/g;->q(Lp1/c1;)Lun1/h;

    move-result-object v19

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    const/high16 v7, 0x1c00000

    and-int v7, v21, v7

    const/high16 v8, 0x800000

    if-ne v7, v8, :cond_39

    const/4 v7, 0x1

    goto :goto_24

    :cond_39
    const/4 v7, 0x0

    :goto_24
    or-int/2addr v6, v7

    const/16 v7, 0x4000

    if-ne v0, v7, :cond_3a

    const/16 v25, 0x1

    goto :goto_25

    :cond_3a
    const/16 v25, 0x0

    :goto_25
    or-int v0, v6, v25

    invoke-virtual {v11, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_3c

    if-ne v6, v3, :cond_3b

    goto :goto_26

    :cond_3b
    move-object v0, v5

    move-object/from16 v5, v20

    goto :goto_27

    :cond_3c
    :goto_26
    new-instance v0, Ld0/m0;

    const/4 v3, 0x3

    move-object/from16 p1, v0

    move-object/from16 p2, v1

    move/from16 p6, v3

    move-object/from16 p3, v5

    move-object/from16 p5, v9

    move-object/from16 p4, v20

    invoke-direct/range {p1 .. p6}, Ld0/m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v6, p1

    move-object/from16 v0, p3

    move-object/from16 v5, p4

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_27
    move-object/from16 v22, v6

    check-cast v22, Lc93/a;

    shl-int/lit8 v1, v21, 0x15

    const/high16 v3, 0x70000000

    and-int v24, v1, v3

    const/16 v25, 0x0

    const/16 v26, 0x400

    const/16 v21, 0x0

    move-object/from16 v23, v11

    move-object/from16 v20, v29

    move-object v11, v2

    invoke-static/range {v11 .. v26}, Lun1/c;->c(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v23

    const/4 v6, 0x1

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    move-object v8, v0

    move-object v11, v7

    move-object/from16 v7, v27

    move/from16 v2, v28

    move-object/from16 v3, v29

    move-object/from16 v6, v31

    goto :goto_28

    :cond_3d
    move-object v7, v0

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move v2, v6

    move-object v11, v7

    move-object v3, v8

    move-object v5, v15

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    :goto_28
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_3e

    new-instance v0, Lc41/l;

    move-object/from16 v1, p0

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lc41/l;-><init>(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_3e
    return-void
.end method

.method private static final o()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lp1/c1;)Lun1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lun1/h;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lun1/h;

    return-object p0
.end method

.method private static final r(Lp1/c1;Lun1/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lun1/h;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final s(Lp1/c1;Lp1/c1;F)Ll83/a0;
    .locals 0

    sget-object p2, Lun1/h;->NORMAL:Lun1/h;

    invoke-static {p0, p2}, Lun1/g;->r(Lp1/c1;Lun1/h;)V

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lun1/g;->H(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lp1/t2;)F
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

.method private static final u(Lp1/c1;Lp1/c1;F)Ll83/a0;
    .locals 0

    const/4 p2, 0x0

    invoke-static {p0, p2}, Lun1/g;->H(Lp1/c1;Z)V

    sget-object p0, Lun1/h;->NORMAL:Lun1/h;

    invoke-static {p1, p0}, Lun1/g;->r(Lp1/c1;Lun1/h;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/t2;)F
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

.method private static final w(Lp1/t2;)F
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

.method private static final x(Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p4, "$this$AnimatedVisibility"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p2, :cond_0

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p4, p2, :cond_1

    :cond_0
    new-instance p4, Lpj2/g;

    const/4 p2, 0x6

    invoke-direct {p4, p0, p1, p2}, Lpj2/g;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {p3, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p4, Lc93/a;

    const/4 p0, 0x0

    invoke-static {p4, p3, p0, p0}, Lvn1/h;->c(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lun1/h;->REPLAY:Lun1/h;

    invoke-static {p1, v0}, Lun1/g;->r(Lp1/c1;Lun1/h;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(FLp1/t2;Ly3/c;)Ly3/j;
    .locals 4

    const-string v0, "$this$offset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ly3/c;->getDensity()F

    const/4 v0, 0x1

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-interface {p2, v0}, Ly3/c;->q0(F)F

    move-result p2

    invoke-static {p1}, Lun1/g;->v(Lp1/t2;)F

    move-result p1

    mul-float/2addr p0, p1

    add-float/2addr p0, p2

    invoke-static {p0}, Le93/b;->X(F)I

    move-result p0

    const/4 p1, 0x0

    int-to-long p1, p1

    const/16 v0, 0x20

    shl-long/2addr p1, v0

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long p0, p1, v0

    new-instance p2, Ly3/j;

    invoke-direct {p2, p0, p1}, Ly3/j;-><init>(J)V

    return-object p2
.end method
