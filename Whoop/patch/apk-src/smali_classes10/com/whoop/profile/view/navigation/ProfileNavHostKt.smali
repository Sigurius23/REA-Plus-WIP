.class public final Lcom/whoop/profile/view/navigation/ProfileNavHostKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aq\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0008H\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/profile/navigation/ProfileNavigationRouter;",
        "navRouter",
        "Lcom/whoop/profile/navigation/ProfileActionRouter;",
        "actionRouter",
        "Leb/u0;",
        "navHostController",
        "Ltr2/n;",
        "logger",
        "",
        "startDestination",
        "Landroidx/fragment/app/r0;",
        "activity",
        "source",
        "",
        "targetUserId",
        "communityId",
        "educationType",
        "Ll83/a0;",
        "ProfileNavHost",
        "(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Leb/u0;Ltr2/n;Ljava/lang/String;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
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
.method public static final ProfileNavHost(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Leb/u0;Ltr2/n;Ljava/lang/String;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v11, p11

    move/from16 v12, p12

    const-string v0, "navRouter"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionRouter"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navHostController"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p10

    check-cast v13, Lp1/q;

    const v0, -0xba6a507

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v5, v11, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v11, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v0, v5

    :cond_7
    and-int/lit16 v5, v11, 0x6000

    if-nez v5, :cond_a

    and-int/lit8 v5, v12, 0x10

    if-nez v5, :cond_8

    move-object/from16 v5, p4

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x4000

    goto :goto_5

    :cond_8
    move-object/from16 v5, p4

    :cond_9
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v0, v7

    goto :goto_6

    :cond_a
    move-object/from16 v5, p4

    :goto_6
    const/high16 v7, 0x30000

    and-int/2addr v7, v11

    if-nez v7, :cond_c

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    const/high16 v7, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v7, 0x10000

    :goto_7
    or-int/2addr v0, v7

    :cond_c
    and-int/lit8 v7, v12, 0x40

    const/high16 v9, 0x180000

    if-eqz v7, :cond_e

    or-int/2addr v0, v9

    :cond_d
    move-object/from16 v9, p6

    goto :goto_9

    :cond_e
    and-int/2addr v9, v11

    if-nez v9, :cond_d

    move-object/from16 v9, p6

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    const/high16 v10, 0x100000

    goto :goto_8

    :cond_f
    const/high16 v10, 0x80000

    :goto_8
    or-int/2addr v0, v10

    :goto_9
    and-int/lit16 v10, v12, 0x80

    const/high16 v15, 0xc00000

    if-eqz v10, :cond_11

    or-int/2addr v0, v15

    :cond_10
    move-object/from16 v15, p7

    goto :goto_b

    :cond_11
    and-int/2addr v15, v11

    if-nez v15, :cond_10

    move-object/from16 v15, p7

    invoke-virtual {v13, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x800000

    goto :goto_a

    :cond_12
    const/high16 v16, 0x400000

    :goto_a
    or-int v0, v0, v16

    :goto_b
    and-int/lit16 v14, v12, 0x100

    const/high16 v17, 0x6000000

    if-eqz v14, :cond_13

    or-int v0, v0, v17

    move-object/from16 v8, p8

    goto :goto_d

    :cond_13
    and-int v17, v11, v17

    move-object/from16 v8, p8

    if-nez v17, :cond_15

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_14

    const/high16 v18, 0x4000000

    goto :goto_c

    :cond_14
    const/high16 v18, 0x2000000

    :goto_c
    or-int v0, v0, v18

    :cond_15
    :goto_d
    move/from16 v18, v0

    and-int/lit16 v0, v12, 0x200

    move/from16 v19, v0

    const/high16 v20, 0x30000000

    if-eqz v19, :cond_16

    or-int v18, v18, v20

    move-object/from16 v0, p9

    goto :goto_f

    :cond_16
    and-int v20, v11, v20

    move-object/from16 v0, p9

    if-nez v20, :cond_18

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_17

    const/high16 v21, 0x20000000

    goto :goto_e

    :cond_17
    const/high16 v21, 0x10000000

    :goto_e
    or-int v18, v18, v21

    :cond_18
    :goto_f
    const v21, 0x12492493

    and-int v0, v18, v21

    const v5, 0x12492492

    const/16 v21, 0x0

    const/16 v22, 0x1

    if-eq v0, v5, :cond_19

    move/from16 v0, v22

    goto :goto_10

    :cond_19
    move/from16 v0, v21

    :goto_10
    and-int/lit8 v5, v18, 0x1

    invoke-virtual {v13, v5, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v0, v11, 0x1

    const v5, -0xe001

    if-eqz v0, :cond_1c

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_11

    :cond_1a
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v0, v12, 0x10

    if-eqz v0, :cond_1b

    and-int v18, v18, v5

    :cond_1b
    move-object/from16 v14, p4

    move-object/from16 v7, p9

    move-object v5, v9

    goto :goto_15

    :cond_1c
    :goto_11
    and-int/lit8 v0, v12, 0x10

    if-eqz v0, :cond_1d

    and-int v18, v18, v5

    const-string v0, "PROFILE"

    goto :goto_12

    :cond_1d
    move-object/from16 v0, p4

    :goto_12
    if-eqz v7, :cond_1e

    const-string v5, "unknown_source"

    goto :goto_13

    :cond_1e
    move-object v5, v9

    :goto_13
    const/4 v7, 0x0

    if-eqz v10, :cond_1f

    move-object v15, v7

    :cond_1f
    if-eqz v14, :cond_20

    move-object v8, v7

    :cond_20
    if-eqz v19, :cond_21

    :goto_14
    move-object v14, v0

    goto :goto_15

    :cond_21
    move-object/from16 v7, p9

    goto :goto_14

    :goto_15
    invoke-virtual {v13}, Lp1/q;->r()V

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    const/high16 v9, 0x380000

    and-int v9, v18, v9

    const/high16 v10, 0x100000

    if-ne v9, v10, :cond_22

    move/from16 v9, v22

    goto :goto_16

    :cond_22
    move/from16 v9, v21

    :goto_16
    or-int/2addr v0, v9

    const/high16 v9, 0x1c00000

    and-int v9, v18, v9

    const/high16 v10, 0x800000

    if-ne v9, v10, :cond_23

    move/from16 v9, v22

    goto :goto_17

    :cond_23
    move/from16 v9, v21

    :goto_17
    or-int/2addr v0, v9

    const/high16 v9, 0xe000000

    and-int v9, v18, v9

    const/high16 v10, 0x4000000

    if-ne v9, v10, :cond_24

    move/from16 v9, v22

    goto :goto_18

    :cond_24
    move/from16 v9, v21

    :goto_18
    or-int/2addr v0, v9

    const/high16 v9, 0x70000000

    and-int v9, v18, v9

    const/high16 v10, 0x20000000

    if-ne v9, v10, :cond_25

    move/from16 v21, v22

    :cond_25
    or-int v0, v0, v21

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_27

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v9, v0, :cond_26

    goto :goto_19

    :cond_26
    move-object v6, v8

    move-object v0, v9

    move-object v9, v5

    goto :goto_1a

    :cond_27
    :goto_19
    new-instance v0, Lid2/s;

    const/4 v10, 0x4

    move-object v9, v8

    move-object v8, v6

    move-object v6, v9

    move-object v9, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v15

    invoke-direct/range {v0 .. v10}, Lid2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v9, v4

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v18, 0x6

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v1, v18, 0x9

    and-int/lit8 v1, v1, 0x70

    or-int v5, v0, v1

    const/4 v2, 0x0

    move-object/from16 v0, p2

    move-object v4, v13

    move-object v1, v14

    invoke-static/range {v0 .. v5}, Lhg3/i;->e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v1

    move-object v10, v7

    move-object v7, v9

    move-object v9, v6

    :goto_1b
    move-object v8, v15

    goto :goto_1c

    :cond_28
    move-object v4, v13

    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move-object/from16 v10, p9

    move-object v7, v9

    move-object v9, v8

    goto :goto_1b

    :goto_1c
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_29

    new-instance v0, Lbm2/f1;

    const/4 v13, 0x7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v13}, Lbm2/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final ProfileNavHost$lambda$0$0(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Leb/u0;Leb/s0;)Ll83/a0;
    .locals 12

    move-object/from16 v0, p9

    const-string v1, "$this$NavHost"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lgv1/f;

    const/4 v11, 0x1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v2 .. v11}, Lgv1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, -0x3f9ae7ec

    invoke-direct {p0, v2, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string p2, "PROFILE"

    const/4 p3, 0x0

    const/4 v1, 0x6

    invoke-static {v0, p2, p3, p0, v1}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    new-instance p0, Lcu2/n;

    const/4 p2, 0x2

    move-object/from16 v2, p8

    invoke-direct {p0, v2, p2}, Lcu2/n;-><init>(Leb/u0;I)V

    new-instance p2, Lx1/b;

    const v2, -0x7dfe64c3

    invoke-direct {p2, p0, p1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string p0, "EDIT_PROFILE"

    invoke-static {v0, p0, p3, p2, v1}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileNavHost$lambda$0$0$0(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    const-string v0, "it"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p9

    invoke-static/range {v1 .. v11}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileNavHost$lambda$0$0$1(Leb/u0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p0, p2, p1, p1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen(Leb/a0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileNavHost$lambda$1(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Leb/u0;Ltr2/n;Ljava/lang/String;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v13, p11

    move-object/from16 v11, p12

    invoke-static/range {v1 .. v13}, Lcom/whoop/profile/view/navigation/ProfileNavHostKt;->ProfileNavHost(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Leb/u0;Ltr2/n;Ljava/lang/String;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Leb/u0;Leb/s0;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/whoop/profile/view/navigation/ProfileNavHostKt;->ProfileNavHost$lambda$0$0(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Leb/u0;Leb/s0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/whoop/profile/view/navigation/ProfileNavHostKt;->ProfileNavHost$lambda$0$0$0(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Leb/u0;Ltr2/n;Ljava/lang/String;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lcom/whoop/profile/view/navigation/ProfileNavHostKt;->ProfileNavHost$lambda$1(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Leb/u0;Ltr2/n;Ljava/lang/String;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Leb/u0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/navigation/ProfileNavHostKt;->ProfileNavHost$lambda$0$0$1(Leb/u0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
